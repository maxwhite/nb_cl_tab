package org.openide.util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.RGBImageFilter;
import java.awt.image.WritableRaster;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.imageio.ImageReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public final class ImageUtilities {

    private static final class ActiveRef<T extends Object> extends SoftReference<Image> implements Runnable {

        private final Map<T, ActiveRef<T>> holder;
        private final T key;

        public ActiveRef(Image o, Map<T, ActiveRef<T>> holder, T key) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokestatic  org/openide/util/Utilities.activeReferenceQueue:()Ljava/lang/ref/ReferenceQueue;
             * 5: invokespecial java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
             * 8: aload_0
             * 9: aload_2
             * 10: putfield      org/openide/util/ImageUtilities$ActiveRef.holder:Ljava/util/Map;
             * 13: aload_0
             * 14: aload_3
             * 15: putfield      org/openide/util/ImageUtilities$ActiveRef.key:Ljava/lang/Object;
             * 18: return
             *  */
            // </editor-fold>
        }

        public void run() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/ImageUtilities$ActiveRef.holder:Ljava/util/Map;
             * 4: dup
             * 5: astore_1
             * 6: monitorenter
             * 7: aload_0
             * 8: getfield      org/openide/util/ImageUtilities$ActiveRef.holder:Ljava/util/Map;
             * 11: aload_0
             * 12: getfield      org/openide/util/ImageUtilities$ActiveRef.key:Ljava/lang/Object;
             * 15: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
             * 20: pop
             * 21: aload_1
             * 22: monitorexit
             * 23: goto          31
             * 26: astore_2
             * 27: aload_1
             * 28: monitorexit
             * 29: aload_2
             * 30: athrow
             * 31: return
             * Exception table:
             * from    to  target type
             * 7    23    26   any
             * 26    29    26   any
             *  */
            // </editor-fold>
        }
    }

    private static class CompositeImageKey {

        Image baseImage;
        Image overlayImage;
        int x;
        int y;

        CompositeImageKey(Image base, Image overlay, int x, int y) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: iload_3
             * 6: putfield      org/openide/util/ImageUtilities$CompositeImageKey.x:I
             * 9: aload_0
             * 10: iload         4
             * 12: putfield      org/openide/util/ImageUtilities$CompositeImageKey.y:I
             * 15: aload_0
             * 16: aload_1
             * 17: putfield      org/openide/util/ImageUtilities$CompositeImageKey.baseImage:Ljava/awt/Image;
             * 20: aload_0
             * 21: aload_2
             * 22: putfield      org/openide/util/ImageUtilities$CompositeImageKey.overlayImage:Ljava/awt/Image;
             * 25: return
             *  */
            // </editor-fold>
        }

        public boolean equals(Object other) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    org/openide/util/ImageUtilities$CompositeImageKey
             * 4: ifne          9
             * 7: iconst_0
             * 8: ireturn
             * 9: aload_1
             * 10: checkcast     org/openide/util/ImageUtilities$CompositeImageKey
             * 13: astore_2
             * 14: aload_0
             * 15: getfield      org/openide/util/ImageUtilities$CompositeImageKey.x:I
             * 18: aload_2
             * 19: getfield      org/openide/util/ImageUtilities$CompositeImageKey.x:I
             * 22: if_icmpne     62
             * 25: aload_0
             * 26: getfield      org/openide/util/ImageUtilities$CompositeImageKey.y:I
             * 29: aload_2
             * 30: getfield      org/openide/util/ImageUtilities$CompositeImageKey.y:I
             * 33: if_icmpne     62
             * 36: aload_0
             * 37: getfield      org/openide/util/ImageUtilities$CompositeImageKey.baseImage:Ljava/awt/Image;
             * 40: aload_2
             * 41: getfield      org/openide/util/ImageUtilities$CompositeImageKey.baseImage:Ljava/awt/Image;
             * 44: if_acmpne     62
             * 47: aload_0
             * 48: getfield      org/openide/util/ImageUtilities$CompositeImageKey.overlayImage:Ljava/awt/Image;
             * 51: aload_2
             * 52: getfield      org/openide/util/ImageUtilities$CompositeImageKey.overlayImage:Ljava/awt/Image;
             * 55: if_acmpne     62
             * 58: iconst_1
             * 59: goto          63
             * 62: iconst_0
             * 63: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/ImageUtilities$CompositeImageKey.x:I
             * 4: iconst_3
             * 5: ishl
             * 6: aload_0
             * 7: getfield      org/openide/util/ImageUtilities$CompositeImageKey.y:I
             * 10: ixor
             * 11: iconst_4
             * 12: ishl
             * 13: istore_1
             * 14: iload_1
             * 15: aload_0
             * 16: getfield      org/openide/util/ImageUtilities$CompositeImageKey.baseImage:Ljava/awt/Image;
             * 19: invokevirtual java/lang/Object.hashCode:()I
             * 22: ixor
             * 23: aload_0
             * 24: getfield      org/openide/util/ImageUtilities$CompositeImageKey.overlayImage:Ljava/awt/Image;
             * 27: invokevirtual java/lang/Object.hashCode:()I
             * 30: ixor
             * 31: istore_1
             * 32: iload_1
             * 33: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial java/lang/StringBuilder."<init>":()V
             * 7: ldc           Composite key for
             * 9: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 12: aload_0
             * 13: getfield      org/openide/util/ImageUtilities$CompositeImageKey.baseImage:Ljava/awt/Image;
             * 16: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 19: ldc            +
             * 21: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 24: aload_0
             * 25: getfield      org/openide/util/ImageUtilities$CompositeImageKey.overlayImage:Ljava/awt/Image;
             * 28: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 31: ldc            at [
             * 33: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 36: aload_0
             * 37: getfield      org/openide/util/ImageUtilities$CompositeImageKey.x:I
             * 40: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 43: ldc           ,
             * 45: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 48: aload_0
             * 49: getfield      org/openide/util/ImageUtilities$CompositeImageKey.y:I
             * 52: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 55: ldc           ]
             * 57: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 60: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 63: areturn
             *  */
            // </editor-fold>
        }
    }

    private static class DisabledButtonFilter extends RGBImageFilter {

        DisabledButtonFilter() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/awt/image/RGBImageFilter."<init>":()V
             * 4: aload_0
             * 5: iconst_1
             * 6: putfield      org/openide/util/ImageUtilities$DisabledButtonFilter.canFilterIndexColorModel:Z
             * 9: return
             *  */
            // </editor-fold>
        }

        public int filterRGB(int x, int y, int rgb) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iload_3
             * 1: ldc           -16777216
             * 3: iand
             * 4: ldc           8947848
             * 6: iadd
             * 7: iload_3
             * 8: bipush        16
             * 10: ishr
             * 11: sipush        255
             * 14: iand
             * 15: iconst_2
             * 16: ishr
             * 17: bipush        16
             * 19: ishl
             * 20: iadd
             * 21: iload_3
             * 22: bipush        8
             * 24: ishr
             * 25: sipush        255
             * 28: iand
             * 29: iconst_2
             * 30: ishr
             * 31: bipush        8
             * 33: ishl
             * 34: iadd
             * 35: iload_3
             * 36: sipush        255
             * 39: iand
             * 40: iconst_2
             * 41: ishr
             * 42: iadd
             * 43: ireturn
             *  */
            // </editor-fold>
        }

        public void setProperties(Hashtable props) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokevirtual java/util/Hashtable.clone:()Ljava/lang/Object;
             * 4: checkcast     java/util/Hashtable
             * 7: astore_1
             * 8: aload_0
             * 9: getfield      org/openide/util/ImageUtilities$DisabledButtonFilter.consumer:Ljava/awt/image/ImageConsumer;
             * 12: aload_1
             * 13: invokeinterface java/awt/image/ImageConsumer.setProperties:(Ljava/util/Hashtable;)V
             * 18: return
             *  */
            // </editor-fold>
        }
    }

    private static class LazyDisabledIcon implements Icon {

        private static final RGBImageFilter DISABLED_BUTTON_FILTER;
        private Image img;
        private Icon disabledIcon;

        public LazyDisabledIcon(Image img) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: getstatic     org/openide/util/ImageUtilities$LazyDisabledIcon.$assertionsDisabled:Z
             * 7: ifne          23
             * 10: aconst_null
             * 11: aload_1
             * 12: if_acmpne     23
             * 15: new           java/lang/AssertionError
             * 18: dup
             * 19: invokespecial java/lang/AssertionError."<init>":()V
             * 22: athrow
             * 23: aload_0
             * 24: aload_1
             * 25: putfield      org/openide/util/ImageUtilities$LazyDisabledIcon.img:Ljava/awt/Image;
             * 28: return
             *  */
            // </editor-fold>
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/util/ImageUtilities$LazyDisabledIcon.getDisabledIcon:()Ljavax/swing/Icon;
             * 4: aload_1
             * 5: aload_2
             * 6: iload_3
             * 7: iload         4
             * 9: invokeinterface javax/swing/Icon.paintIcon:(Ljava/awt/Component;Ljava/awt/Graphics;II)V
             * 14: return
             *  */
            // </editor-fold>
        }

        public int getIconWidth() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/util/ImageUtilities$LazyDisabledIcon.getDisabledIcon:()Ljavax/swing/Icon;
             * 4: invokeinterface javax/swing/Icon.getIconWidth:()I
             * 9: ireturn
             *  */
            // </editor-fold>
        }

        public int getIconHeight() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/util/ImageUtilities$LazyDisabledIcon.getDisabledIcon:()Ljavax/swing/Icon;
             * 4: invokeinterface javax/swing/Icon.getIconHeight:()I
             * 9: ireturn
             *  */
            // </editor-fold>
        }

        private synchronized Icon getDisabledIcon() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aconst_null
             * 1: aload_0
             * 2: getfield      org/openide/util/ImageUtilities$LazyDisabledIcon.disabledIcon:Ljavax/swing/Icon;
             * 5: if_acmpne     26
             * 8: aload_0
             * 9: new           javax/swing/ImageIcon
             * 12: dup
             * 13: aload_0
             * 14: getfield      org/openide/util/ImageUtilities$LazyDisabledIcon.img:Ljava/awt/Image;
             * 17: invokestatic  org/openide/util/ImageUtilities$LazyDisabledIcon.createDisabledImage:(Ljava/awt/Image;)Ljava/awt/Image;
             * 20: invokespecial javax/swing/ImageIcon."<init>":(Ljava/awt/Image;)V
             * 23: putfield      org/openide/util/ImageUtilities$LazyDisabledIcon.disabledIcon:Ljavax/swing/Icon;
             * 26: aload_0
             * 27: getfield      org/openide/util/ImageUtilities$LazyDisabledIcon.disabledIcon:Ljavax/swing/Icon;
             * 30: areturn
             *  */
            // </editor-fold>
        }

        static Image createDisabledImage(Image img) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/awt/image/FilteredImageSource
             * 3: dup
             * 4: aload_0
             * 5: invokevirtual java/awt/Image.getSource:()Ljava/awt/image/ImageProducer;
             * 8: getstatic     org/openide/util/ImageUtilities$LazyDisabledIcon.DISABLED_BUTTON_FILTER:Ljava/awt/image/RGBImageFilter;
             * 11: invokespecial java/awt/image/FilteredImageSource."<init>":(Ljava/awt/image/ImageProducer;Ljava/awt/image/ImageFilter;)V
             * 14: astore_1
             * 15: invokestatic  java/awt/Toolkit.getDefaultToolkit:()Ljava/awt/Toolkit;
             * 18: aload_1
             * 19: invokevirtual java/awt/Toolkit.createImage:(Ljava/awt/image/ImageProducer;)Ljava/awt/Image;
             * 22: areturn
             *  */
            // </editor-fold>
        }
    }

    private static class ToolTipImage extends BufferedImage implements Icon {

        final String toolTipText;
        ImageIcon imageIcon;
        final URL url;

        public static ToolTipImage createNew(String toolTipText, Image image, URL url) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokestatic  org/openide/util/ImageUtilities.access$200:(Ljava/awt/Image;)V
             * 4: aload_1
             * 5: instanceof    java/awt/Transparency
             * 8: ifeq          28
             * 11: aload_1
             * 12: checkcast     java/awt/Transparency
             * 15: invokeinterface java/awt/Transparency.getTransparency:()I
             * 20: iconst_3
             * 21: if_icmpeq     28
             * 24: iconst_1
             * 25: goto          29
             * 28: iconst_0
             * 29: istore_3
             * 30: iload_3
             * 31: ifeq          38
             * 34: iconst_2
             * 35: goto          39
             * 38: iconst_3
             * 39: invokestatic  org/openide/util/ImageUtilities.access$300:(I)Ljava/awt/image/ColorModel;
             * 42: astore        4
             * 44: aload_1
             * 45: aconst_null
             * 46: invokevirtual java/awt/Image.getWidth:(Ljava/awt/image/ImageObserver;)I
             * 49: istore        5
             * 51: aload_1
             * 52: aconst_null
             * 53: invokevirtual java/awt/Image.getHeight:(Ljava/awt/image/ImageObserver;)I
             * 56: istore        6
             * 58: aload_2
             * 59: ifnonnull     89
             * 62: aload_1
             * 63: ldc           url
             * 65: aconst_null
             * 66: invokevirtual java/awt/Image.getProperty:(Ljava/lang/String;Ljava/awt/image/ImageObserver;)Ljava/lang/Object;
             * 69: astore        7
             * 71: aload         7
             * 73: instanceof    java/net/URL
             * 76: ifeq          87
             * 79: aload         7
             * 81: checkcast     java/net/URL
             * 84: goto          88
             * 87: aconst_null
             * 88: astore_2
             * 89: new           org/openide/util/ImageUtilities$ToolTipImage
             * 92: dup
             * 93: aload_0
             * 94: aload         4
             * 96: aload         4
             * 98: iload         5
             * 100: iload         6
             * 102: invokevirtual java/awt/image/ColorModel.createCompatibleWritableRaster:(II)Ljava/awt/image/WritableRaster;
             * 105: aload         4
             * 107: invokevirtual java/awt/image/ColorModel.isAlphaPremultiplied:()Z
             * 110: aconst_null
             * 111: aload_2
             * 112: invokespecial org/openide/util/ImageUtilities$ToolTipImage."<init>":(Ljava/lang/String;Ljava/awt/image/ColorModel;Ljava/awt/image/WritableRaster;ZLjava/util/Hashtable;Ljava/net/URL;)V
             * 115: astore        7
             * 117: aload         7
             * 119: invokevirtual org/openide/util/ImageUtilities$ToolTipImage.createGraphics:()Ljava/awt/Graphics2D;
             * 122: astore        8
             * 124: aload         8
             * 126: aload_1
             * 127: iconst_0
             * 128: iconst_0
             * 129: aconst_null
             * 130: invokevirtual java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
             * 133: pop
             * 134: aload         8
             * 136: invokevirtual java/awt/Graphics.dispose:()V
             * 139: aload         7
             * 141: areturn
             *  */
            // </editor-fold>
        }

        public ToolTipImage(String toolTipText, ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties, URL url) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_2
             * 2: aload_3
             * 3: iload         4
             * 5: aload         5
             * 7: invokespecial java/awt/image/BufferedImage."<init>":(Ljava/awt/image/ColorModel;Ljava/awt/image/WritableRaster;ZLjava/util/Hashtable;)V
             * 10: aload_0
             * 11: aload_1
             * 12: putfield      org/openide/util/ImageUtilities$ToolTipImage.toolTipText:Ljava/lang/String;
             * 15: aload_0
             * 16: aload         6
             * 18: putfield      org/openide/util/ImageUtilities$ToolTipImage.url:Ljava/net/URL;
             * 21: return
             *  */
            // </editor-fold>
        }

        public ToolTipImage(String toolTipText, int width, int height, int imageType) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iload_2
             * 2: iload_3
             * 3: iload         4
             * 5: invokespecial java/awt/image/BufferedImage."<init>":(III)V
             * 8: aload_0
             * 9: aload_1
             * 10: putfield      org/openide/util/ImageUtilities$ToolTipImage.toolTipText:Ljava/lang/String;
             * 13: aload_0
             * 14: aconst_null
             * 15: putfield      org/openide/util/ImageUtilities$ToolTipImage.url:Ljava/net/URL;
             * 18: return
             *  */
            // </editor-fold>
        }

        synchronized ImageIcon getIcon() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/ImageUtilities$ToolTipImage.imageIcon:Ljavax/swing/ImageIcon;
             * 4: ifnonnull     19
             * 7: aload_0
             * 8: new           javax/swing/ImageIcon
             * 11: dup
             * 12: aload_0
             * 13: invokespecial javax/swing/ImageIcon."<init>":(Ljava/awt/Image;)V
             * 16: putfield      org/openide/util/ImageUtilities$ToolTipImage.imageIcon:Ljavax/swing/ImageIcon;
             * 19: aload_0
             * 20: getfield      org/openide/util/ImageUtilities$ToolTipImage.imageIcon:Ljavax/swing/ImageIcon;
             * 23: areturn
             *  */
            // </editor-fold>
        }

        public int getIconHeight() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/awt/image/BufferedImage.getHeight:()I
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public int getIconWidth() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/awt/image/BufferedImage.getWidth:()I
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_2
             * 1: aload_0
             * 2: iload_3
             * 3: iload         4
             * 5: aconst_null
             * 6: invokevirtual java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
             * 9: pop
             * 10: return
             *  */
            // </editor-fold>
        }

        public Object getProperty(String name, ImageObserver observer) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: ldc           url
             * 2: aload_1
             * 3: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
             * 6: ifeq          57
             * 9: aload_0
             * 10: getfield      org/openide/util/ImageUtilities$ToolTipImage.url:Ljava/net/URL;
             * 13: ifnull        21
             * 16: aload_0
             * 17: getfield      org/openide/util/ImageUtilities$ToolTipImage.url:Ljava/net/URL;
             * 20: areturn
             * 21: aload_0
             * 22: getfield      org/openide/util/ImageUtilities$ToolTipImage.imageIcon:Ljavax/swing/ImageIcon;
             * 25: ifnonnull     30
             * 28: aconst_null
             * 29: areturn
             * 30: aload_0
             * 31: getfield      org/openide/util/ImageUtilities$ToolTipImage.imageIcon:Ljavax/swing/ImageIcon;
             * 34: invokevirtual javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
             * 37: aload_0
             * 38: if_acmpne     43
             * 41: aconst_null
             * 42: areturn
             * 43: aload_0
             * 44: getfield      org/openide/util/ImageUtilities$ToolTipImage.imageIcon:Ljavax/swing/ImageIcon;
             * 47: invokevirtual javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
             * 50: ldc           url
             * 52: aload_2
             * 53: invokevirtual java/awt/Image.getProperty:(Ljava/lang/String;Ljava/awt/image/ImageObserver;)Ljava/lang/Object;
             * 56: areturn
             * 57: aload_0
             * 58: aload_1
             * 59: aload_2
             * 60: invokespecial java/awt/image/BufferedImage.getProperty:(Ljava/lang/String;Ljava/awt/image/ImageObserver;)Ljava/lang/Object;
             * 63: areturn
             *  */
            // </editor-fold>
        }
    }

    private static class ToolTipImageKey {

        Image image;
        String str;

        ToolTipImageKey(Image image, String str) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/ImageUtilities$ToolTipImageKey.image:Ljava/awt/Image;
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/util/ImageUtilities$ToolTipImageKey.str:Ljava/lang/String;
             * 14: return
             *  */
            // </editor-fold>
        }

        public boolean equals(Object other) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    org/openide/util/ImageUtilities$ToolTipImageKey
             * 4: ifne          9
             * 7: iconst_0
             * 8: ireturn
             * 9: aload_1
             * 10: checkcast     org/openide/util/ImageUtilities$ToolTipImageKey
             * 13: astore_2
             * 14: aload_0
             * 15: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.str:Ljava/lang/String;
             * 18: aload_2
             * 19: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.str:Ljava/lang/String;
             * 22: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
             * 25: ifeq          43
             * 28: aload_0
             * 29: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.image:Ljava/awt/Image;
             * 32: aload_2
             * 33: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.image:Ljava/awt/Image;
             * 36: if_acmpne     43
             * 39: iconst_1
             * 40: goto          44
             * 43: iconst_0
             * 44: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.image:Ljava/awt/Image;
             * 4: invokevirtual java/lang/Object.hashCode:()I
             * 7: aload_0
             * 8: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.str:Ljava/lang/String;
             * 11: invokevirtual java/lang/String.hashCode:()I
             * 14: ixor
             * 15: istore_1
             * 16: iload_1
             * 17: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial java/lang/StringBuilder."<init>":()V
             * 7: ldc           ImageStringKey for
             * 9: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 12: aload_0
             * 13: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.image:Ljava/awt/Image;
             * 16: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 19: ldc            +
             * 21: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 24: aload_0
             * 25: getfield      org/openide/util/ImageUtilities$ToolTipImageKey.str:Ljava/lang/String;
             * 28: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 31: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 34: areturn
             *  */
            // </editor-fold>
        }
    }
    static final String TOOLTIP_SEPAR = "<br>";
    private static final ActiveRef<String> NO_ICON;
    private static final Map<String, ActiveRef<String>> cache;
    private static final Map<String, ActiveRef<String>> localizedCache;
    private static final Map<CompositeImageKey, ActiveRef<CompositeImageKey>> compositeCache;
    private static final Map<ToolTipImageKey, ActiveRef<ToolTipImageKey>> imageToolTipCache;
    private static RGBImageFilter imageIconFilter;
    private static final Set<String> extraInitialSlashes;
    private static volatile Object currentLoader;
    private static Lookup.Result<ClassLoader> loaderQuery;
    private static boolean noLoaderWarned;
    private static final Component component;
    private static final MediaTracker tracker;
    private static int mediaTrackerID;
    private static ImageReader PNG_READER;
    private static final Logger ERR;
    private static final String DARK_LAF_SUFFIX = "_dark";

    private ImageUtilities() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static final Image loadImage(String resourceID) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: invokestatic  org/openide/util/ImageUtilities.loadImage:(Ljava/lang/String;Z)Ljava/awt/Image;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    public static final Image loadImage(String resource, boolean localized) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: astore_2
         * 2: invokestatic  org/openide/util/ImageUtilities.isDarkLaF:()Z
         * 5: ifeq          17
         * 8: aload_0
         * 9: invokestatic  org/openide/util/ImageUtilities.addDarkSuffix:(Ljava/lang/String;)Ljava/lang/String;
         * 12: iload_1
         * 13: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Z)Ljava/awt/Image;
         * 16: astore_2
         * 17: aconst_null
         * 18: aload_2
         * 19: if_acmpne     28
         * 22: aload_0
         * 23: iload_1
         * 24: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Z)Ljava/awt/Image;
         * 27: astore_2
         * 28: aload_2
         * 29: areturn
         *  */
        // </editor-fold>
    }

    public static final ImageIcon loadImageIcon(String resource, boolean localized) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: astore_2
         * 2: invokestatic  org/openide/util/ImageUtilities.isDarkLaF:()Z
         * 5: ifeq          30
         * 8: aload_0
         * 9: invokestatic  org/openide/util/ImageUtilities.addDarkSuffix:(Ljava/lang/String;)Ljava/lang/String;
         * 12: iload_1
         * 13: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Z)Ljava/awt/Image;
         * 16: astore_2
         * 17: aconst_null
         * 18: aload_2
         * 19: if_acmpeq     30
         * 22: aload_2
         * 23: invokestatic  org/openide/util/ImageUtilities.image2Icon:(Ljava/awt/Image;)Ljavax/swing/Icon;
         * 26: checkcast     javax/swing/ImageIcon
         * 29: areturn
         * 30: aload_0
         * 31: iload_1
         * 32: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Z)Ljava/awt/Image;
         * 35: astore_2
         * 36: aload_2
         * 37: ifnonnull     42
         * 40: aconst_null
         * 41: areturn
         * 42: invokestatic  org/openide/util/ImageUtilities.getImageIconFilter:()Ljava/awt/image/RGBImageFilter;
         * 45: astore_3
         * 46: aconst_null
         * 47: aload_3
         * 48: if_acmpeq     70
         * 51: invokestatic  java/awt/Toolkit.getDefaultToolkit:()Ljava/awt/Toolkit;
         * 54: new           java/awt/image/FilteredImageSource
         * 57: dup
         * 58: aload_2
         * 59: invokevirtual java/awt/Image.getSource:()Ljava/awt/image/ImageProducer;
         * 62: aload_3
         * 63: invokespecial java/awt/image/FilteredImageSource."<init>":(Ljava/awt/image/ImageProducer;Ljava/awt/image/ImageFilter;)V
         * 66: invokevirtual java/awt/Toolkit.createImage:(Ljava/awt/image/ImageProducer;)Ljava/awt/Image;
         * 69: astore_2
         * 70: aload_2
         * 71: invokestatic  org/openide/util/ImageUtilities.image2Icon:(Ljava/awt/Image;)Ljavax/swing/Icon;
         * 74: checkcast     javax/swing/ImageIcon
         * 77: areturn
         *  */
        // </editor-fold>
    }

    private static boolean isDarkLaF() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           nb.dark.theme
         * 2: invokestatic  javax/swing/UIManager.getBoolean:(Ljava/lang/Object;)Z
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    private static String addDarkSuffix(String resourceName) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: bipush        46
         * 3: invokevirtual java/lang/String.lastIndexOf:(I)I
         * 6: istore_1
         * 7: iload_1
         * 8: ifle          44
         * 11: new           java/lang/StringBuilder
         * 14: dup
         * 15: invokespecial java/lang/StringBuilder."<init>":()V
         * 18: aload_0
         * 19: iconst_0
         * 20: iload_1
         * 21: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 24: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 27: ldc           _dark
         * 29: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 32: aload_0
         * 33: iload_1
         * 34: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 37: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 40: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 43: areturn
         * 44: new           java/lang/StringBuilder
         * 47: dup
         * 48: invokespecial java/lang/StringBuilder."<init>":()V
         * 51: aload_0
         * 52: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 55: ldc           _dark
         * 57: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 60: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 63: areturn
         *  */
        // </editor-fold>
    }

    private static RGBImageFilter getImageIconFilter() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: getstatic     org/openide/util/ImageUtilities.imageIconFilter:Ljava/awt/image/RGBImageFilter;
         * 4: if_acmpne     27
         * 7: ldc           nb.imageicon.filter
         * 9: invokestatic  javax/swing/UIManager.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 12: astore_0
         * 13: aload_0
         * 14: instanceof    java/awt/image/RGBImageFilter
         * 17: ifeq          27
         * 20: aload_0
         * 21: checkcast     java/awt/image/RGBImageFilter
         * 24: putstatic     org/openide/util/ImageUtilities.imageIconFilter:Ljava/awt/image/RGBImageFilter;
         * 27: getstatic     org/openide/util/ImageUtilities.imageIconFilter:Ljava/awt/image/RGBImageFilter;
         * 30: areturn
         *  */
        // </editor-fold>
    }

    public static final Image mergeImages(Image image1, Image image2, int x, int y) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnull        8
         * 4: aload_1
         * 5: ifnonnull     16
         * 8: new           java/lang/NullPointerException
         * 11: dup
         * 12: invokespecial java/lang/NullPointerException."<init>":()V
         * 15: athrow
         * 16: new           org/openide/util/ImageUtilities$CompositeImageKey
         * 19: dup
         * 20: aload_0
         * 21: aload_1
         * 22: iload_2
         * 23: iload_3
         * 24: invokespecial org/openide/util/ImageUtilities$CompositeImageKey."<init>":(Ljava/awt/Image;Ljava/awt/Image;II)V
         * 27: astore        4
         * 29: getstatic     org/openide/util/ImageUtilities.compositeCache:Ljava/util/Map;
         * 32: dup
         * 33: astore        6
         * 35: monitorenter
         * 36: getstatic     org/openide/util/ImageUtilities.compositeCache:Ljava/util/Map;
         * 39: aload         4
         * 41: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 46: checkcast     org/openide/util/ImageUtilities$ActiveRef
         * 49: astore        7
         * 51: aload         7
         * 53: ifnull        77
         * 56: aload         7
         * 58: invokevirtual org/openide/util/ImageUtilities$ActiveRef.get:()Ljava/lang/Object;
         * 61: checkcast     java/awt/Image
         * 64: astore        5
         * 66: aload         5
         * 68: ifnull        77
         * 71: aload         5
         * 73: aload         6
         * 75: monitorexit
         * 76: areturn
         * 77: aload_0
         * 78: aload_1
         * 79: iload_2
         * 80: iload_3
         * 81: invokestatic  org/openide/util/ImageUtilities.doMergeImages:(Ljava/awt/Image;Ljava/awt/Image;II)Ljava/awt/Image;
         * 84: astore        5
         * 86: getstatic     org/openide/util/ImageUtilities.compositeCache:Ljava/util/Map;
         * 89: aload         4
         * 91: new           org/openide/util/ImageUtilities$ActiveRef
         * 94: dup
         * 95: aload         5
         * 97: getstatic     org/openide/util/ImageUtilities.compositeCache:Ljava/util/Map;
         * 100: aload         4
         * 102: invokespecial org/openide/util/ImageUtilities$ActiveRef."<init>":(Ljava/awt/Image;Ljava/util/Map;Ljava/lang/Object;)V
         * 105: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 110: pop
         * 111: aload         5
         * 113: aload         6
         * 115: monitorexit
         * 116: areturn
         * 117: astore        8
         * 119: aload         6
         * 121: monitorexit
         * 122: aload         8
         * 124: athrow
         * Exception table:
         * from    to  target type
         * 36    76   117   any
         * 77   116   117   any
         * 117   122   117   any
         *  */
        // </editor-fold>
    }

    public static final Icon image2Icon(Image image) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    org/openide/util/ImageUtilities$ToolTipImage
         * 4: ifeq          15
         * 7: aload_0
         * 8: checkcast     org/openide/util/ImageUtilities$ToolTipImage
         * 11: invokevirtual org/openide/util/ImageUtilities$ToolTipImage.getIcon:()Ljavax/swing/ImageIcon;
         * 14: areturn
         * 15: new           javax/swing/ImageIcon
         * 18: dup
         * 19: aload_0
         * 20: invokespecial javax/swing/ImageIcon."<init>":(Ljava/awt/Image;)V
         * 23: areturn
         *  */
        // </editor-fold>
    }

    public static final Image icon2Image(Icon icon) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    javax/swing/ImageIcon
         * 4: ifeq          15
         * 7: aload_0
         * 8: checkcast     javax/swing/ImageIcon
         * 11: invokevirtual javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
         * 14: areturn
         * 15: new           org/openide/util/ImageUtilities$ToolTipImage
         * 18: dup
         * 19: ldc
         * 21: aload_0
         * 22: invokeinterface javax/swing/Icon.getIconWidth:()I
         * 27: aload_0
         * 28: invokeinterface javax/swing/Icon.getIconHeight:()I
         * 33: iconst_2
         * 34: invokespecial org/openide/util/ImageUtilities$ToolTipImage."<init>":(Ljava/lang/String;III)V
         * 37: astore_1
         * 38: aload_1
         * 39: invokevirtual org/openide/util/ImageUtilities$ToolTipImage.getGraphics:()Ljava/awt/Graphics;
         * 42: astore_2
         * 43: aload_0
         * 44: new           javax/swing/JLabel
         * 47: dup
         * 48: invokespecial javax/swing/JLabel."<init>":()V
         * 51: aload_2
         * 52: iconst_0
         * 53: iconst_0
         * 54: invokeinterface javax/swing/Icon.paintIcon:(Ljava/awt/Component;Ljava/awt/Graphics;II)V
         * 59: aload_2
         * 60: invokevirtual java/awt/Graphics.dispose:()V
         * 63: aload_1
         * 64: areturn
         *  */
        // </editor-fold>
    }

    public static final Image assignToolTipToImage(Image image, String text) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           image
         * 2: aload_0
         * 3: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 6: ldc           text
         * 8: aload_1
         * 9: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 12: new           org/openide/util/ImageUtilities$ToolTipImageKey
         * 15: dup
         * 16: aload_0
         * 17: aload_1
         * 18: invokespecial org/openide/util/ImageUtilities$ToolTipImageKey."<init>":(Ljava/awt/Image;Ljava/lang/String;)V
         * 21: astore_2
         * 22: getstatic     org/openide/util/ImageUtilities.imageToolTipCache:Ljava/util/Map;
         * 25: dup
         * 26: astore        4
         * 28: monitorenter
         * 29: getstatic     org/openide/util/ImageUtilities.imageToolTipCache:Ljava/util/Map;
         * 32: aload_2
         * 33: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 38: checkcast     org/openide/util/ImageUtilities$ActiveRef
         * 41: astore        5
         * 43: aload         5
         * 45: ifnull        66
         * 48: aload         5
         * 50: invokevirtual org/openide/util/ImageUtilities$ActiveRef.get:()Ljava/lang/Object;
         * 53: checkcast     java/awt/Image
         * 56: astore_3
         * 57: aload_3
         * 58: ifnull        66
         * 61: aload_3
         * 62: aload         4
         * 64: monitorexit
         * 65: areturn
         * 66: aload_1
         * 67: aload_0
         * 68: aconst_null
         * 69: invokestatic  org/openide/util/ImageUtilities$ToolTipImage.createNew:(Ljava/lang/String;Ljava/awt/Image;Ljava/net/URL;)Lorg/openide/util/ImageUtilities$ToolTipImage;
         * 72: astore_3
         * 73: getstatic     org/openide/util/ImageUtilities.imageToolTipCache:Ljava/util/Map;
         * 76: aload_2
         * 77: new           org/openide/util/ImageUtilities$ActiveRef
         * 80: dup
         * 81: aload_3
         * 82: getstatic     org/openide/util/ImageUtilities.imageToolTipCache:Ljava/util/Map;
         * 85: aload_2
         * 86: invokespecial org/openide/util/ImageUtilities$ActiveRef."<init>":(Ljava/awt/Image;Ljava/util/Map;Ljava/lang/Object;)V
         * 89: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 94: pop
         * 95: aload_3
         * 96: aload         4
         * 98: monitorexit
         * 99: areturn
         * 100: astore        6
         * 102: aload         4
         * 104: monitorexit
         * 105: aload         6
         * 107: athrow
         * Exception table:
         * from    to  target type
         * 29    65   100   any
         * 66    99   100   any
         * 100   105   100   any
         *  */
        // </editor-fold>
    }

    public static final String getImageToolTip(Image image) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    org/openide/util/ImageUtilities$ToolTipImage
         * 4: ifeq          15
         * 7: aload_0
         * 8: checkcast     org/openide/util/ImageUtilities$ToolTipImage
         * 11: getfield      org/openide/util/ImageUtilities$ToolTipImage.toolTipText:Ljava/lang/String;
         * 14: areturn
         * 15: ldc
         * 17: areturn
         *  */
        // </editor-fold>
    }

    public static final Image addToolTipToImage(Image image, String text) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    org/openide/util/ImageUtilities$ToolTipImage
         * 4: ifeq          60
         * 7: aload_0
         * 8: checkcast     org/openide/util/ImageUtilities$ToolTipImage
         * 11: astore_2
         * 12: new           java/lang/StringBuilder
         * 15: dup
         * 16: aload_2
         * 17: getfield      org/openide/util/ImageUtilities$ToolTipImage.toolTipText:Ljava/lang/String;
         * 20: invokespecial java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
         * 23: astore_3
         * 24: aload_3
         * 25: invokevirtual java/lang/StringBuilder.length:()I
         * 28: ifle          45
         * 31: aload_1
         * 32: invokevirtual java/lang/String.length:()I
         * 35: ifle          45
         * 38: aload_3
         * 39: ldc           <br>
         * 41: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 44: pop
         * 45: aload_3
         * 46: aload_1
         * 47: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 50: pop
         * 51: aload_0
         * 52: aload_3
         * 53: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 56: invokestatic  org/openide/util/ImageUtilities.assignToolTipToImage:(Ljava/awt/Image;Ljava/lang/String;)Ljava/awt/Image;
         * 59: areturn
         * 60: aload_0
         * 61: aload_1
         * 62: invokestatic  org/openide/util/ImageUtilities.assignToolTipToImage:(Ljava/awt/Image;Ljava/lang/String;)Ljava/awt/Image;
         * 65: areturn
         *  */
        // </editor-fold>
    }

    public static Icon createDisabledIcon(Icon icon) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           icon
         * 2: aload_0
         * 3: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 6: new           org/openide/util/ImageUtilities$LazyDisabledIcon
         * 9: dup
         * 10: aload_0
         * 11: invokestatic  org/openide/util/ImageUtilities.icon2Image:(Ljavax/swing/Icon;)Ljava/awt/Image;
         * 14: invokespecial org/openide/util/ImageUtilities$LazyDisabledIcon."<init>":(Ljava/awt/Image;)V
         * 17: areturn
         *  */
        // </editor-fold>
    }

    public static Image createDisabledImage(Image image) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           image
         * 2: aload_0
         * 3: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 6: aload_0
         * 7: invokestatic  org/openide/util/ImageUtilities$LazyDisabledIcon.createDisabledImage:(Ljava/awt/Image;)Ljava/awt/Image;
         * 10: areturn
         *  */
        // </editor-fold>
    }

    static ClassLoader getLoader() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/ImageUtilities.currentLoader:Ljava/lang/Object;
         * 3: astore_0
         * 4: aload_0
         * 5: instanceof    java/lang/ClassLoader
         * 8: ifeq          16
         * 11: aload_0
         * 12: checkcast     java/lang/ClassLoader
         * 15: areturn
         * 16: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 19: putstatic     org/openide/util/ImageUtilities.currentLoader:Ljava/lang/Object;
         * 22: getstatic     org/openide/util/ImageUtilities.loaderQuery:Lorg/openide/util/Lookup$Result;
         * 25: ifnonnull     60
         * 28: invokestatic  org/openide/util/Lookup.getDefault:()Lorg/openide/util/Lookup;
         * 31: new           org/openide/util/Lookup$Template
         * 34: dup
         * 35: ldc_w         java/lang/ClassLoader
         * 38: invokespecial org/openide/util/Lookup$Template."<init>":(Ljava/lang/Class;)V
         * 41: invokevirtual org/openide/util/Lookup.lookup:(Lorg/openide/util/Lookup$Template;)Lorg/openide/util/Lookup$Result;
         * 44: putstatic     org/openide/util/ImageUtilities.loaderQuery:Lorg/openide/util/Lookup$Result;
         * 47: getstatic     org/openide/util/ImageUtilities.loaderQuery:Lorg/openide/util/Lookup$Result;
         * 50: new           org/openide/util/ImageUtilities$2
         * 53: dup
         * 54: invokespecial org/openide/util/ImageUtilities$2."<init>":()V
         * 57: invokevirtual org/openide/util/Lookup$Result.addLookupListener:(Lorg/openide/util/LookupListener;)V
         * 60: getstatic     org/openide/util/ImageUtilities.loaderQuery:Lorg/openide/util/Lookup$Result;
         * 63: invokevirtual org/openide/util/Lookup$Result.allInstances:()Ljava/util/Collection;
         * 66: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
         * 71: astore_1
         * 72: aload_1
         * 73: invokeinterface java/util/Iterator.hasNext:()Z
         * 78: ifeq          133
         * 81: aload_1
         * 82: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 87: checkcast     java/lang/ClassLoader
         * 90: astore_2
         * 91: getstatic     org/openide/util/ImageUtilities.currentLoader:Ljava/lang/Object;
         * 94: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 97: if_acmpne     104
         * 100: aload_2
         * 101: putstatic     org/openide/util/ImageUtilities.currentLoader:Ljava/lang/Object;
         * 104: getstatic     org/openide/util/ImageUtilities.ERR:Ljava/util/logging/Logger;
         * 107: new           java/lang/StringBuilder
         * 110: dup
         * 111: invokespecial java/lang/StringBuilder."<init>":()V
         * 114: ldc           Loader computed:
         * 116: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 119: getstatic     org/openide/util/ImageUtilities.currentLoader:Ljava/lang/Object;
         * 122: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 125: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 128: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
         * 131: aload_2
         * 132: areturn
         * 133: getstatic     org/openide/util/ImageUtilities.noLoaderWarned:Z
         * 136: ifne          170
         * 139: iconst_1
         * 140: putstatic     org/openide/util/ImageUtilities.noLoaderWarned:Z
         * 143: getstatic     org/openide/util/ImageUtilities.ERR:Ljava/util/logging/Logger;
         * 146: new           java/lang/StringBuilder
         * 149: dup
         * 150: invokespecial java/lang/StringBuilder."<init>":()V
         * 153: ldc           No ClassLoader instance found in
         * 155: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 158: invokestatic  org/openide/util/Lookup.getDefault:()Lorg/openide/util/Lookup;
         * 161: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 164: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 167: invokevirtual java/util/logging/Logger.warning:(Ljava/lang/String;)V
         * 170: aconst_null
         * 171: areturn
         *  */
        // </editor-fold>
    }

    static Image getIcon(String resource, boolean localized) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: ifeq          295
         * 4: getstatic     org/openide/util/ImageUtilities.localizedCache:Ljava/util/Map;
         * 7: dup
         * 8: astore_2
         * 9: monitorenter
         * 10: getstatic     org/openide/util/ImageUtilities.localizedCache:Ljava/util/Map;
         * 13: aload_0
         * 14: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 19: checkcast     org/openide/util/ImageUtilities$ActiveRef
         * 22: astore_3
         * 23: aconst_null
         * 24: astore        4
         * 26: aload_3
         * 27: getstatic     org/openide/util/ImageUtilities.NO_ICON:Lorg/openide/util/ImageUtilities$ActiveRef;
         * 30: if_acmpne     37
         * 33: aconst_null
         * 34: aload_2
         * 35: monitorexit
         * 36: areturn
         * 37: aload_3
         * 38: ifnull        50
         * 41: aload_3
         * 42: invokevirtual org/openide/util/ImageUtilities$ActiveRef.get:()Ljava/lang/Object;
         * 45: checkcast     java/awt/Image
         * 48: astore        4
         * 50: aload         4
         * 52: ifnull        60
         * 55: aload         4
         * 57: aload_2
         * 58: monitorexit
         * 59: areturn
         * 60: invokestatic  org/openide/util/ImageUtilities.getLoader:()Ljava/lang/ClassLoader;
         * 63: astore        5
         * 65: new           java/lang/String
         * 68: dup
         * 69: aload_0
         * 70: invokespecial java/lang/String."<init>":(Ljava/lang/String;)V
         * 73: invokevirtual java/lang/String.intern:()Ljava/lang/String;
         * 76: astore_0
         * 77: aload_0
         * 78: bipush        46
         * 80: invokevirtual java/lang/String.lastIndexOf:(I)I
         * 83: istore        8
         * 85: iload         8
         * 87: iconst_m1
         * 88: if_icmpeq     122
         * 91: iload         8
         * 93: aload_0
         * 94: bipush        47
         * 96: invokevirtual java/lang/String.lastIndexOf:(I)I
         * 99: if_icmple     122
         * 102: aload_0
         * 103: iconst_0
         * 104: iload         8
         * 106: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 109: astore        6
         * 111: aload_0
         * 112: iload         8
         * 114: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 117: astore        7
         * 119: goto          129
         * 122: aload_0
         * 123: astore        6
         * 125: ldc
         * 127: astore        7
         * 129: aload         5
         * 131: ifnull        143
         * 134: aload         5
         * 136: aload_0
         * 137: invokevirtual java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
         * 140: goto          153
         * 143: ldc_w         org/openide/util/ImageUtilities
         * 146: invokevirtual java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
         * 149: aload_0
         * 150: invokevirtual java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
         * 153: astore        9
         * 155: invokestatic  org/openide/util/NbBundle.getLocalizingSuffixes:()Ljava/util/Iterator;
         * 158: astore        10
         * 160: aload         10
         * 162: invokeinterface java/util/Iterator.hasNext:()Z
         * 167: ifeq          271
         * 170: aload         10
         * 172: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 177: checkcast     java/lang/String
         * 180: astore        11
         * 182: aload         11
         * 184: invokevirtual java/lang/String.length:()I
         * 187: ifne          202
         * 190: aload_0
         * 191: aload         5
         * 193: iconst_0
         * 194: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/awt/Image;
         * 197: astore        12
         * 199: goto          235
         * 202: new           java/lang/StringBuilder
         * 205: dup
         * 206: invokespecial java/lang/StringBuilder."<init>":()V
         * 209: aload         6
         * 211: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 214: aload         11
         * 216: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 219: aload         7
         * 221: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 224: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 227: aload         5
         * 229: iconst_1
         * 230: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/awt/Image;
         * 233: astore        12
         * 235: aload         12
         * 237: ifnull        268
         * 240: getstatic     org/openide/util/ImageUtilities.localizedCache:Ljava/util/Map;
         * 243: aload_0
         * 244: new           org/openide/util/ImageUtilities$ActiveRef
         * 247: dup
         * 248: aload         12
         * 250: getstatic     org/openide/util/ImageUtilities.localizedCache:Ljava/util/Map;
         * 253: aload_0
         * 254: invokespecial org/openide/util/ImageUtilities$ActiveRef."<init>":(Ljava/awt/Image;Ljava/util/Map;Ljava/lang/Object;)V
         * 257: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 262: pop
         * 263: aload         12
         * 265: aload_2
         * 266: monitorexit
         * 267: areturn
         * 268: goto          160
         * 271: getstatic     org/openide/util/ImageUtilities.localizedCache:Ljava/util/Map;
         * 274: aload_0
         * 275: getstatic     org/openide/util/ImageUtilities.NO_ICON:Lorg/openide/util/ImageUtilities$ActiveRef;
         * 278: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 283: pop
         * 284: aconst_null
         * 285: aload_2
         * 286: monitorexit
         * 287: areturn
         * 288: astore        13
         * 290: aload_2
         * 291: monitorexit
         * 292: aload         13
         * 294: athrow
         * 295: aload_0
         * 296: invokestatic  org/openide/util/ImageUtilities.getLoader:()Ljava/lang/ClassLoader;
         * 299: iconst_0
         * 300: invokestatic  org/openide/util/ImageUtilities.getIcon:(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/awt/Image;
         * 303: areturn
         * Exception table:
         * from    to  target type
         * 10    36   288   any
         * 37    59   288   any
         * 60   267   288   any
         * 268   287   288   any
         * 288   292   288   any
         *  */
        // </editor-fold>
    }

    private static Image getIcon(String name, ClassLoader loader, boolean localizedQuery) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/ImageUtilities.cache:Ljava/util/Map;
         * 3: aload_0
         * 4: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 9: checkcast     org/openide/util/ImageUtilities$ActiveRef
         * 12: astore_3
         * 13: aconst_null
         * 14: astore        4
         * 16: aload_3
         * 17: getstatic     org/openide/util/ImageUtilities.NO_ICON:Lorg/openide/util/ImageUtilities$ActiveRef;
         * 20: if_acmpne     25
         * 23: aconst_null
         * 24: areturn
         * 25: aload_3
         * 26: ifnull        38
         * 29: aload_3
         * 30: invokevirtual org/openide/util/ImageUtilities$ActiveRef.get:()Ljava/lang/Object;
         * 33: checkcast     java/awt/Image
         * 36: astore        4
         * 38: aload         4
         * 40: ifnull        46
         * 43: aload         4
         * 45: areturn
         * 46: getstatic     org/openide/util/ImageUtilities.cache:Ljava/util/Map;
         * 49: dup
         * 50: astore        5
         * 52: monitorenter
         * 53: getstatic     org/openide/util/ImageUtilities.cache:Ljava/util/Map;
         * 56: aload_0
         * 57: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 62: checkcast     org/openide/util/ImageUtilities$ActiveRef
         * 65: astore_3
         * 66: aload_3
         * 67: getstatic     org/openide/util/ImageUtilities.NO_ICON:Lorg/openide/util/ImageUtilities$ActiveRef;
         * 70: if_acmpne     78
         * 73: aconst_null
         * 74: aload         5
         * 76: monitorexit
         * 77: areturn
         * 78: aload_3
         * 79: ifnull        91
         * 82: aload_3
         * 83: invokevirtual org/openide/util/ImageUtilities$ActiveRef.get:()Ljava/lang/Object;
         * 86: checkcast     java/awt/Image
         * 89: astore        4
         * 91: aload         4
         * 93: ifnull        102
         * 96: aload         4
         * 98: aload         5
         * 100: monitorexit
         * 101: areturn
         * 102: aload_0
         * 103: ldc           /
         * 105: invokevirtual java/lang/String.startsWith:(Ljava/lang/String;)Z
         * 108: ifeq          124
         * 111: iconst_1
         * 112: istore        7
         * 114: aload_0
         * 115: iconst_1
         * 116: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 119: astore        6
         * 121: goto          130
         * 124: iconst_0
         * 125: istore        7
         * 127: aload_0
         * 128: astore        6
         * 130: aload_1
         * 131: ifnull        143
         * 134: aload_1
         * 135: aload         6
         * 137: invokevirtual java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
         * 140: goto          154
         * 143: ldc_w         org/openide/util/ImageUtilities
         * 146: invokevirtual java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
         * 149: aload         6
         * 151: invokevirtual java/lang/ClassLoader.getResource:(Ljava/lang/String;)Ljava/net/URL;
         * 154: astore        8
         * 156: aconst_null
         * 157: astore        9
         * 159: aload         8
         * 161: ifnull        271
         * 164: aload_0
         * 165: ldc           .png
         * 167: invokevirtual java/lang/String.endsWith:(Ljava/lang/String;)Z
         * 170: ifeq          259
         * 173: aload         8
         * 175: invokevirtual java/net/URL.openStream:()Ljava/io/InputStream;
         * 178: invokestatic  javax/imageio/ImageIO.createImageInputStream:(Ljava/lang/Object;)Ljavax/imageio/stream/ImageInputStream;
         * 181: astore        10
         * 183: getstatic     org/openide/util/ImageUtilities.PNG_READER:Ljavax/imageio/ImageReader;
         * 186: invokevirtual javax/imageio/ImageReader.getDefaultReadParam:()Ljavax/imageio/ImageReadParam;
         * 189: astore        11
         * 191: getstatic     org/openide/util/ImageUtilities.PNG_READER:Ljavax/imageio/ImageReader;
         * 194: aload         10
         * 196: iconst_1
         * 197: iconst_1
         * 198: invokevirtual javax/imageio/ImageReader.setInput:(Ljava/lang/Object;ZZ)V
         * 201: getstatic     org/openide/util/ImageUtilities.PNG_READER:Ljavax/imageio/ImageReader;
         * 204: iconst_0
         * 205: aload         11
         * 207: invokevirtual javax/imageio/ImageReader.read:(ILjavax/imageio/ImageReadParam;)Ljava/awt/image/BufferedImage;
         * 210: astore        9
         * 212: goto          252
         * 215: astore        12
         * 217: getstatic     org/openide/util/ImageUtilities.ERR:Ljava/util/logging/Logger;
         * 220: getstatic     java/util/logging/Level.INFO:Ljava/util/logging/Level;
         * 223: new           java/lang/StringBuilder
         * 226: dup
         * 227: invokespecial java/lang/StringBuilder."<init>":()V
         * 230: ldc           Image
         * 232: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 235: aload_0
         * 236: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 239: ldc            is not PNG
         * 241: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 244: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 247: aload         12
         * 249: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 252: aload         10
         * 254: invokeinterface javax/imageio/stream/ImageInputStream.close:()V
         * 259: aload         9
         * 261: ifnonnull     271
         * 264: aload         8
         * 266: invokestatic  javax/imageio/ImageIO.read:(Ljava/net/URL;)Ljava/awt/image/BufferedImage;
         * 269: astore        9
         * 271: goto          311
         * 274: astore        10
         * 276: getstatic     org/openide/util/ImageUtilities.ERR:Ljava/util/logging/Logger;
         * 279: getstatic     java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         * 282: new           java/lang/StringBuilder
         * 285: dup
         * 286: invokespecial java/lang/StringBuilder."<init>":()V
         * 289: ldc           Cannot load
         * 291: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 294: aload_0
         * 295: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 298: ldc            image
         * 300: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 303: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 306: aload         10
         * 308: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 311: aload         9
         * 313: ifnull        435
         * 316: iload         7
         * 318: ifeq          358
         * 321: getstatic     org/openide/util/ImageUtilities.extraInitialSlashes:Ljava/util/Set;
         * 324: aload_0
         * 325: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
         * 330: ifeq          358
         * 333: getstatic     org/openide/util/ImageUtilities.ERR:Ljava/util/logging/Logger;
         * 336: new           java/lang/StringBuilder
         * 339: dup
         * 340: invokespecial java/lang/StringBuilder."<init>":()V
         * 343: ldc           Initial slashes in Utilities.loadImage deprecated (cf. #20072):
         * 345: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 348: aload_0
         * 349: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 352: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 355: invokevirtual java/util/logging/Logger.warning:(Ljava/lang/String;)V
         * 358: getstatic     org/openide/util/ImageUtilities.ERR:Ljava/util/logging/Logger;
         * 361: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 364: ldc           loading icon {0} = {1}
         * 366: iconst_2
         * 367: anewarray     java/lang/Object
         * 370: dup
         * 371: iconst_0
         * 372: aload         6
         * 374: aastore
         * 375: dup
         * 376: iconst_1
         * 377: aload         9
         * 379: aastore
         * 380: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
         * 383: new           java/lang/String
         * 386: dup
         * 387: aload_0
         * 388: invokespecial java/lang/String."<init>":(Ljava/lang/String;)V
         * 391: invokevirtual java/lang/String.intern:()Ljava/lang/String;
         * 394: astore_0
         * 395: ldc
         * 397: aload         9
         * 399: aload         8
         * 401: invokestatic  org/openide/util/ImageUtilities$ToolTipImage.createNew:(Ljava/lang/String;Ljava/awt/Image;Ljava/net/URL;)Lorg/openide/util/ImageUtilities$ToolTipImage;
         * 404: astore        9
         * 406: getstatic     org/openide/util/ImageUtilities.cache:Ljava/util/Map;
         * 409: aload_0
         * 410: new           org/openide/util/ImageUtilities$ActiveRef
         * 413: dup
         * 414: aload         9
         * 416: getstatic     org/openide/util/ImageUtilities.cache:Ljava/util/Map;
         * 419: aload_0
         * 420: invokespecial org/openide/util/ImageUtilities$ActiveRef."<init>":(Ljava/awt/Image;Ljava/util/Map;Ljava/lang/Object;)V
         * 423: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 428: pop
         * 429: aload         9
         * 431: aload         5
         * 433: monitorexit
         * 434: areturn
         * 435: iload_2
         * 436: ifne          452
         * 439: getstatic     org/openide/util/ImageUtilities.cache:Ljava/util/Map;
         * 442: aload_0
         * 443: getstatic     org/openide/util/ImageUtilities.NO_ICON:Lorg/openide/util/ImageUtilities$ActiveRef;
         * 446: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 451: pop
         * 452: aconst_null
         * 453: aload         5
         * 455: monitorexit
         * 456: areturn
         * 457: astore        13
         * 459: aload         5
         * 461: monitorexit
         * 462: aload         13
         * 464: athrow
         * Exception table:
         * from    to  target type
         * 191   212   215   Class java/io/IOException
         * 159   271   274   Class java/io/IOException
         * 53    77   457   any
         * 78   101   457   any
         * 102   434   457   any
         * 435   456   457   any
         * 457   462   457   any
         *  */
        // </editor-fold>
    }

    static final Image toBufferedImage(Image img) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           javax/swing/ImageIcon
         * 3: dup
         * 4: aload_0
         * 5: ldc
         * 7: invokespecial javax/swing/ImageIcon."<init>":(Ljava/awt/Image;Ljava/lang/String;)V
         * 10: pop
         * 11: aload_0
         * 12: aconst_null
         * 13: invokevirtual java/awt/Image.getHeight:(Ljava/awt/image/ImageObserver;)I
         * 16: aload_0
         * 17: aconst_null
         * 18: invokevirtual java/awt/Image.getWidth:(Ljava/awt/image/ImageObserver;)I
         * 21: imul
         * 22: sipush        576
         * 25: if_icmple     30
         * 28: aload_0
         * 29: areturn
         * 30: aload_0
         * 31: aconst_null
         * 32: invokevirtual java/awt/Image.getWidth:(Ljava/awt/image/ImageObserver;)I
         * 35: aload_0
         * 36: aconst_null
         * 37: invokevirtual java/awt/Image.getHeight:(Ljava/awt/image/ImageObserver;)I
         * 40: invokestatic  org/openide/util/ImageUtilities.createBufferedImage:(II)Ljava/awt/image/BufferedImage;
         * 43: astore_1
         * 44: aload_1
         * 45: invokevirtual java/awt/image/BufferedImage.createGraphics:()Ljava/awt/Graphics2D;
         * 48: astore_2
         * 49: aload_2
         * 50: aload_0
         * 51: iconst_0
         * 52: iconst_0
         * 53: aconst_null
         * 54: invokevirtual java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
         * 57: pop
         * 58: aload_2
         * 59: invokevirtual java/awt/Graphics.dispose:()V
         * 62: aload_0
         * 63: invokevirtual java/awt/Image.flush:()V
         * 66: aload_1
         * 67: areturn
         *  */
        // </editor-fold>
    }

    private static void ensureLoaded(Image image) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  java/awt/Toolkit.getDefaultToolkit:()Ljava/awt/Toolkit;
         * 3: aload_0
         * 4: iconst_m1
         * 5: iconst_m1
         * 6: aconst_null
         * 7: invokevirtual java/awt/Toolkit.checkImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)I
         * 10: bipush        48
         * 12: iand
         * 13: ifeq          17
         * 16: return
         * 17: getstatic     org/openide/util/ImageUtilities.tracker:Ljava/awt/MediaTracker;
         * 20: dup
         * 21: astore_1
         * 22: monitorenter
         * 23: getstatic     org/openide/util/ImageUtilities.mediaTrackerID:I
         * 26: iconst_1
         * 27: iadd
         * 28: dup
         * 29: putstatic     org/openide/util/ImageUtilities.mediaTrackerID:I
         * 32: istore_2
         * 33: getstatic     org/openide/util/ImageUtilities.tracker:Ljava/awt/MediaTracker;
         * 36: aload_0
         * 37: iload_2
         * 38: invokevirtual java/awt/MediaTracker.addImage:(Ljava/awt/Image;I)V
         * 41: getstatic     org/openide/util/ImageUtilities.tracker:Ljava/awt/MediaTracker;
         * 44: iload_2
         * 45: lconst_0
         * 46: invokevirtual java/awt/MediaTracker.waitForID:(IJ)Z
         * 49: pop
         * 50: goto          62
         * 53: astore_3
         * 54: getstatic     java/lang/System.out:Ljava/io/PrintStream;
         * 57: ldc           INTERRUPTED while loading Image
         * 59: invokevirtual java/io/PrintStream.println:(Ljava/lang/String;)V
         * 62: getstatic     org/openide/util/ImageUtilities.$assertionsDisabled:Z
         * 65: ifne          91
         * 68: getstatic     org/openide/util/ImageUtilities.tracker:Ljava/awt/MediaTracker;
         * 71: iload_2
         * 72: iconst_0
         * 73: invokevirtual java/awt/MediaTracker.statusID:(IZ)I
         * 76: bipush        8
         * 78: if_icmpeq     91
         * 81: new           java/lang/AssertionError
         * 84: dup
         * 85: ldc           Image loaded
         * 87: invokespecial java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
         * 90: athrow
         * 91: getstatic     org/openide/util/ImageUtilities.tracker:Ljava/awt/MediaTracker;
         * 94: aload_0
         * 95: iload_2
         * 96: invokevirtual java/awt/MediaTracker.removeImage:(Ljava/awt/Image;I)V
         * 99: aload_1
         * 100: monitorexit
         * 101: goto          111
         * 104: astore        4
         * 106: aload_1
         * 107: monitorexit
         * 108: aload         4
         * 110: athrow
         * 111: return
         * Exception table:
         * from    to  target type
         * 41    50    53   Class java/lang/InterruptedException
         * 23   101   104   any
         * 104   108   104   any
         *  */
        // </editor-fold>
    }

    private static final Image doMergeImages(Image image1, Image image2, int x, int y) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  org/openide/util/ImageUtilities.ensureLoaded:(Ljava/awt/Image;)V
         * 4: aload_1
         * 5: invokestatic  org/openide/util/ImageUtilities.ensureLoaded:(Ljava/awt/Image;)V
         * 8: aload_0
         * 9: aconst_null
         * 10: invokevirtual java/awt/Image.getWidth:(Ljava/awt/image/ImageObserver;)I
         * 13: iload_2
         * 14: aload_1
         * 15: aconst_null
         * 16: invokevirtual java/awt/Image.getWidth:(Ljava/awt/image/ImageObserver;)I
         * 19: iadd
         * 20: invokestatic  java/lang/Math.max:(II)I
         * 23: istore        4
         * 25: aload_0
         * 26: aconst_null
         * 27: invokevirtual java/awt/Image.getHeight:(Ljava/awt/image/ImageObserver;)I
         * 30: iload_3
         * 31: aload_1
         * 32: aconst_null
         * 33: invokevirtual java/awt/Image.getHeight:(Ljava/awt/image/ImageObserver;)I
         * 36: iadd
         * 37: invokestatic  java/lang/Math.max:(II)I
         * 40: istore        5
         * 42: aload_0
         * 43: instanceof    java/awt/Transparency
         * 46: ifeq          86
         * 49: aload_0
         * 50: checkcast     java/awt/Transparency
         * 53: invokeinterface java/awt/Transparency.getTransparency:()I
         * 58: iconst_3
         * 59: if_icmpeq     86
         * 62: aload_1
         * 63: instanceof    java/awt/Transparency
         * 66: ifeq          86
         * 69: aload_1
         * 70: checkcast     java/awt/Transparency
         * 73: invokeinterface java/awt/Transparency.getTransparency:()I
         * 78: iconst_3
         * 79: if_icmpeq     86
         * 82: iconst_1
         * 83: goto          87
         * 86: iconst_0
         * 87: istore        6
         * 89: new           java/lang/StringBuilder
         * 92: dup
         * 93: aload_0
         * 94: instanceof    org/openide/util/ImageUtilities$ToolTipImage
         * 97: ifeq          110
         * 100: aload_0
         * 101: checkcast     org/openide/util/ImageUtilities$ToolTipImage
         * 104: getfield      org/openide/util/ImageUtilities$ToolTipImage.toolTipText:Ljava/lang/String;
         * 107: goto          112
         * 110: ldc
         * 112: invokespecial java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
         * 115: astore        7
         * 117: aload_1
         * 118: instanceof    org/openide/util/ImageUtilities$ToolTipImage
         * 121: ifeq          165
         * 124: aload_1
         * 125: checkcast     org/openide/util/ImageUtilities$ToolTipImage
         * 128: getfield      org/openide/util/ImageUtilities$ToolTipImage.toolTipText:Ljava/lang/String;
         * 131: astore        8
         * 133: aload         7
         * 135: invokevirtual java/lang/StringBuilder.length:()I
         * 138: ifle          157
         * 141: aload         8
         * 143: invokevirtual java/lang/String.length:()I
         * 146: ifle          157
         * 149: aload         7
         * 151: ldc           <br>
         * 153: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 156: pop
         * 157: aload         7
         * 159: aload         8
         * 161: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 164: pop
         * 165: aload_0
         * 166: ldc           url
         * 168: aconst_null
         * 169: invokevirtual java/awt/Image.getProperty:(Ljava/lang/String;Ljava/awt/image/ImageObserver;)Ljava/lang/Object;
         * 172: astore        8
         * 174: iload         6
         * 176: ifeq          183
         * 179: iconst_2
         * 180: goto          184
         * 183: iconst_3
         * 184: invokestatic  org/openide/util/ImageUtilities.colorModel:(I)Ljava/awt/image/ColorModel;
         * 187: astore        9
         * 189: new           org/openide/util/ImageUtilities$ToolTipImage
         * 192: dup
         * 193: aload         7
         * 195: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 198: aload         9
         * 200: aload         9
         * 202: iload         4
         * 204: iload         5
         * 206: invokevirtual java/awt/image/ColorModel.createCompatibleWritableRaster:(II)Ljava/awt/image/WritableRaster;
         * 209: aload         9
         * 211: invokevirtual java/awt/image/ColorModel.isAlphaPremultiplied:()Z
         * 214: aconst_null
         * 215: aload         8
         * 217: instanceof    java/net/URL
         * 220: ifeq          231
         * 223: aload         8
         * 225: checkcast     java/net/URL
         * 228: goto          232
         * 231: aconst_null
         * 232: invokespecial org/openide/util/ImageUtilities$ToolTipImage."<init>":(Ljava/lang/String;Ljava/awt/image/ColorModel;Ljava/awt/image/WritableRaster;ZLjava/util/Hashtable;Ljava/net/URL;)V
         * 235: astore        10
         * 237: aload         10
         * 239: invokevirtual org/openide/util/ImageUtilities$ToolTipImage.createGraphics:()Ljava/awt/Graphics2D;
         * 242: astore        11
         * 244: aload         11
         * 246: aload_0
         * 247: iconst_0
         * 248: iconst_0
         * 249: aconst_null
         * 250: invokevirtual java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
         * 253: pop
         * 254: aload         11
         * 256: aload_1
         * 257: iload_2
         * 258: iload_3
         * 259: aconst_null
         * 260: invokevirtual java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
         * 263: pop
         * 264: aload         11
         * 266: invokevirtual java/awt/Graphics.dispose:()V
         * 269: aload         10
         * 271: areturn
         *  */
        // </editor-fold>
    }

    static final BufferedImage createBufferedImage(int width, int height) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/util/Utilities.isMac:()Z
         * 3: ifeq          17
         * 6: new           java/awt/image/BufferedImage
         * 9: dup
         * 10: iload_0
         * 11: iload_1
         * 12: iconst_3
         * 13: invokespecial java/awt/image/BufferedImage."<init>":(III)V
         * 16: areturn
         * 17: iconst_3
         * 18: invokestatic  org/openide/util/ImageUtilities.colorModel:(I)Ljava/awt/image/ColorModel;
         * 21: astore_2
         * 22: new           java/awt/image/BufferedImage
         * 25: dup
         * 26: aload_2
         * 27: aload_2
         * 28: iload_0
         * 29: iload_1
         * 30: invokevirtual java/awt/image/ColorModel.createCompatibleWritableRaster:(II)Ljava/awt/image/WritableRaster;
         * 33: aload_2
         * 34: invokevirtual java/awt/image/ColorModel.isAlphaPremultiplied:()Z
         * 37: aconst_null
         * 38: invokespecial java/awt/image/BufferedImage."<init>":(Ljava/awt/image/ColorModel;Ljava/awt/image/WritableRaster;ZLjava/util/Hashtable;)V
         * 41: astore_3
         * 42: aload_3
         * 43: areturn
         *  */
        // </editor-fold>
    }

    private static ColorModel colorModel(int transparency) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  java/awt/GraphicsEnvironment.getLocalGraphicsEnvironment:()Ljava/awt/GraphicsEnvironment;
         * 3: invokevirtual java/awt/GraphicsEnvironment.getDefaultScreenDevice:()Ljava/awt/GraphicsDevice;
         * 6: invokevirtual java/awt/GraphicsDevice.getDefaultConfiguration:()Ljava/awt/GraphicsConfiguration;
         * 9: iload_0
         * 10: invokevirtual java/awt/GraphicsConfiguration.getColorModel:(I)Ljava/awt/image/ColorModel;
         * 13: astore_1
         * 14: goto          30
         * 17: astore_2
         * 18: invokestatic  java/awt/image/ColorModel.getRGBdefault:()Ljava/awt/image/ColorModel;
         * 21: astore_1
         * 22: goto          30
         * 25: astore_2
         * 26: invokestatic  java/awt/image/ColorModel.getRGBdefault:()Ljava/awt/image/ColorModel;
         * 29: astore_1
         * 30: aload_1
         * 31: areturn
         * Exception table:
         * from    to  target type
         * 0    14    17   Class java/lang/ArrayIndexOutOfBoundsException
         * 0    14    25   Class java/awt/HeadlessException
         *  */
        // </editor-fold>
    }
}
