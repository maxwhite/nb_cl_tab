package org.openide.windows;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.accessibility.Accessible;
import javax.accessibility.AccessibleContext;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import org.openide.util.HelpCtx;
import org.openide.util.actions.SystemAction;

public class TopComponent extends JComponent implements Externalizable, Accessible, HelpCtx.Provider, org.openide.util.Lookup.Provider {

    private class AttentionGetter implements ActionListener {

        Timer timer;

        public AttentionGetter() {
            // compiled code
        }

        public void reset() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     org/openide/windows/TopComponent$AttentionGetter.$assertionsDisabled:Z
             * 3: ifne          20
             * 6: invokestatic  java/awt/EventQueue.isDispatchThread:()Z
             * 9: ifne          20
             * 12: new           java/lang/AssertionError
             * 15: dup
             * 16: invokespecial java/lang/AssertionError."<init>":()V
             * 19: athrow
             * 20: aload_0
             * 21: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 24: ifnull        34
             * 27: aload_0
             * 28: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 31: invokevirtual javax/swing/Timer.stop:()V
             * 34: aload_0
             * 35: invokespecial org/openide/windows/TopComponent$AttentionGetter.start:()V
             * 38: aload_0
             * 39: new           javax/swing/Timer
             * 42: dup
             * 43: sipush        3500
             * 46: aload_0
             * 47: invokespecial javax/swing/Timer."<init>":(ILjava/awt/event/ActionListener;)V
             * 50: putfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 53: aload_0
             * 54: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 57: iconst_0
             * 58: invokevirtual javax/swing/Timer.setRepeats:(Z)V
             * 61: aload_0
             * 62: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 65: invokevirtual javax/swing/Timer.start:()V
             * 68: return
             *  */
            // </editor-fold>
        }

        private void start() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
             * 3: aload_0
             * 4: getfield      org/openide/windows/TopComponent$AttentionGetter.this$0:Lorg/openide/windows/TopComponent;
             * 7: invokevirtual org/openide/windows/WindowManager.topComponentRequestAttention:(Lorg/openide/windows/TopComponent;)V
             * 10: return
             *  */
            // </editor-fold>
        }

        public void kill() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 4: invokevirtual javax/swing/Timer.stop:()V
             * 7: aload_0
             * 8: getfield      org/openide/windows/TopComponent$AttentionGetter.this$0:Lorg/openide/windows/TopComponent;
             * 11: aconst_null
             * 12: invokestatic  org/openide/windows/TopComponent.access$002:(Lorg/openide/windows/TopComponent;Lorg/openide/windows/TopComponent$AttentionGetter;)Lorg/openide/windows/TopComponent$AttentionGetter;
             * 15: pop
             * 16: return
             *  */
            // </editor-fold>
        }

        private void stop() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 4: ifnull        14
             * 7: aload_0
             * 8: getfield      org/openide/windows/TopComponent$AttentionGetter.timer:Ljavax/swing/Timer;
             * 11: invokevirtual javax/swing/Timer.stop:()V
             * 14: aload_0
             * 15: getfield      org/openide/windows/TopComponent$AttentionGetter.this$0:Lorg/openide/windows/TopComponent;
             * 18: aconst_null
             * 19: invokestatic  org/openide/windows/TopComponent.access$002:(Lorg/openide/windows/TopComponent;Lorg/openide/windows/TopComponent$AttentionGetter;)Lorg/openide/windows/TopComponent$AttentionGetter;
             * 22: pop
             * 23: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
             * 26: aload_0
             * 27: getfield      org/openide/windows/TopComponent$AttentionGetter.this$0:Lorg/openide/windows/TopComponent;
             * 30: invokevirtual org/openide/windows/WindowManager.topComponentCancelRequestAttention:(Lorg/openide/windows/TopComponent;)V
             * 33: aload_0
             * 34: getfield      org/openide/windows/TopComponent$AttentionGetter.this$0:Lorg/openide/windows/TopComponent;
             * 37: aconst_null
             * 38: invokestatic  org/openide/windows/TopComponent.access$002:(Lorg/openide/windows/TopComponent;Lorg/openide/windows/TopComponent$AttentionGetter;)Lorg/openide/windows/TopComponent$AttentionGetter;
             * 41: pop
             * 42: return
             *  */
            // </editor-fold>
        }

        public void actionPerformed(ActionEvent ae) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/windows/TopComponent$AttentionGetter.stop:()V
             * 4: return
             *  */
            // </editor-fold>
        }
    }

    private static class CloneWindowAction extends AbstractAction {

        DelegateActionMap am;

        public CloneWindowAction(DelegateActionMap am) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial javax/swing/AbstractAction."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/windows/TopComponent$CloneWindowAction.am:Lorg/openide/windows/DelegateActionMap;
             * 9: return
             *  */
            // </editor-fold>
        }

        public void actionPerformed(ActionEvent evt) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$CloneWindowAction.am:Lorg/openide/windows/DelegateActionMap;
             * 4: invokevirtual org/openide/windows/DelegateActionMap.getComponent:()Ljavax/swing/JComponent;
             * 7: checkcast     org/openide/windows/TopComponent$Cloneable
             * 10: astore_2
             * 11: aload_2
             * 12: ifnull        127
             * 15: aload_2
             * 16: invokeinterface org/openide/windows/TopComponent$Cloneable.cloneComponent:()Lorg/openide/windows/TopComponent;
             * 21: astore_3
             * 22: iconst_m1
             * 23: istore        4
             * 25: aload_2
             * 26: instanceof    org/openide/windows/TopComponent
             * 29: ifeq          105
             * 32: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
             * 35: aload_2
             * 36: checkcast     org/openide/windows/TopComponent
             * 39: invokevirtual org/openide/windows/WindowManager.findMode:(Lorg/openide/windows/TopComponent;)Lorg/openide/windows/Mode;
             * 42: astore        5
             * 44: aconst_null
             * 45: aload         5
             * 47: if_acmpeq     105
             * 50: aload         5
             * 52: invokeinterface org/openide/windows/Mode.getTopComponents:()[Lorg/openide/windows/TopComponent;
             * 57: astore        6
             * 59: iconst_0
             * 60: istore        7
             * 62: iload         7
             * 64: aload         6
             * 66: arraylength
             * 67: if_icmpge     94
             * 70: aload         6
             * 72: iload         7
             * 74: aaload
             * 75: aload_2
             * 76: if_acmpne     88
             * 79: iload         7
             * 81: iconst_1
             * 82: iadd
             * 83: istore        4
             * 85: goto          94
             * 88: iinc          7, 1
             * 91: goto          62
             * 94: iload         4
             * 96: aload         6
             * 98: arraylength
             * 99: if_icmplt     105
             * 102: iconst_m1
             * 103: istore        4
             * 105: iload         4
             * 107: iflt          119
             * 110: aload_3
             * 111: iload         4
             * 113: invokevirtual org/openide/windows/TopComponent.openAtTabPosition:(I)V
             * 116: goto          123
             * 119: aload_3
             * 120: invokevirtual org/openide/windows/TopComponent.open:()V
             * 123: aload_3
             * 124: invokevirtual org/openide/windows/TopComponent.requestActive:()V
             * 127: return
             *  */
            // </editor-fold>
        }
    }

    public static interface Cloneable {

        public TopComponent cloneComponent();
    }

    private static class CloseWindowAction extends AbstractAction {

        DelegateActionMap am;

        public CloseWindowAction(DelegateActionMap am) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial javax/swing/AbstractAction."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/windows/TopComponent$CloseWindowAction.am:Lorg/openide/windows/DelegateActionMap;
             * 9: return
             *  */
            // </editor-fold>
        }

        public void actionPerformed(ActionEvent evt) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$CloseWindowAction.am:Lorg/openide/windows/DelegateActionMap;
             * 4: invokevirtual org/openide/windows/DelegateActionMap.getComponent:()Ljavax/swing/JComponent;
             * 7: checkcast     org/openide/windows/TopComponent
             * 10: astore_2
             * 11: aload_2
             * 12: ifnull        20
             * 15: aload_2
             * 16: invokevirtual org/openide/windows/TopComponent.close:()Z
             * 19: pop
             * 20: return
             *  */
            // </editor-fold>
        }
    }

    @Retention(value = RetentionPolicy.RUNTIME)
    @Target(value = {ElementType.TYPE})
    public @interface Description {

        public String preferredID();

        public String iconBase() default "";

        public int persistenceType() default 0;
    }

    @Deprecated
    public static class NodeName extends org.openide.nodes.NodeAdapter {

        private TopComponent top;
        private Reference node;
        private org.openide.nodes.NodeListener nodeL;

        public static void connect(TopComponent top, org.openide.nodes.Node n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           org/openide/windows/TopComponent$NodeName
             * 3: dup
             * 4: aload_0
             * 5: invokespecial org/openide/windows/TopComponent$NodeName."<init>":(Lorg/openide/windows/TopComponent;)V
             * 8: aload_1
             * 9: invokespecial org/openide/windows/TopComponent$NodeName.attach:(Lorg/openide/nodes/Node;)V
             * 12: return
             *  */
            // </editor-fold>
        }

        @Deprecated
        public NodeName(TopComponent top) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/nodes/NodeAdapter."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/windows/TopComponent$NodeName.top:Lorg/openide/windows/TopComponent;
             * 9: return
             *  */
            // </editor-fold>
        }

        @Deprecated
        public void propertyChange(PropertyChangeEvent ev) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokevirtual java/beans/PropertyChangeEvent.getPropertyName:()Ljava/lang/String;
             * 4: ldc           displayName
             * 6: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
             * 9: ifeq          42
             * 12: aload_0
             * 13: getfield      org/openide/windows/TopComponent$NodeName.node:Ljava/lang/ref/Reference;
             * 16: invokevirtual java/lang/ref/Reference.get:()Ljava/lang/Object;
             * 19: checkcast     org/openide/nodes/Node
             * 22: astore_2
             * 23: aload_2
             * 24: ifnull        42
             * 27: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
             * 30: new           org/openide/windows/TopComponent$NodeName$1
             * 33: dup
             * 34: aload_0
             * 35: aload_2
             * 36: invokespecial org/openide/windows/TopComponent$NodeName$1."<init>":(Lorg/openide/windows/TopComponent$NodeName;Lorg/openide/nodes/Node;)V
             * 39: invokevirtual org/openide/util/Mutex.readAccess:(Ljava/lang/Runnable;)V
             * 42: return
             *  */
            // </editor-fold>
        }

        private void attach(org.openide.nodes.Node n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$NodeName.top:Lorg/openide/windows/TopComponent;
             * 4: dup
             * 5: astore_2
             * 6: monitorenter
             * 7: aload_0
             * 8: new           java/lang/ref/WeakReference
             * 11: dup
             * 12: aload_1
             * 13: invokespecial java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
             * 16: putfield      org/openide/windows/TopComponent$NodeName.node:Ljava/lang/ref/Reference;
             * 19: aload_0
             * 20: ldc_w         org/openide/nodes/NodeListener
             * 23: aload_0
             * 24: aload_1
             * 25: invokestatic  org/openide/util/WeakListeners.create:(Ljava/lang/Class;Ljava/util/EventListener;Ljava/lang/Object;)Ljava/util/EventListener;
             * 28: checkcast     org/openide/nodes/NodeListener
             * 31: putfield      org/openide/windows/TopComponent$NodeName.nodeL:Lorg/openide/nodes/NodeListener;
             * 34: aload_1
             * 35: aload_0
             * 36: getfield      org/openide/windows/TopComponent$NodeName.nodeL:Lorg/openide/nodes/NodeListener;
             * 39: invokevirtual org/openide/nodes/Node.addNodeListener:(Lorg/openide/nodes/NodeListener;)V
             * 42: aload_0
             * 43: getfield      org/openide/windows/TopComponent$NodeName.top:Lorg/openide/windows/TopComponent;
             * 46: aload_0
             * 47: invokestatic  org/openide/windows/TopComponent.access$400:(Lorg/openide/windows/TopComponent;Lorg/openide/windows/TopComponent$NodeName;)V
             * 50: aload_0
             * 51: getfield      org/openide/windows/TopComponent$NodeName.top:Lorg/openide/windows/TopComponent;
             * 54: iconst_1
             * 55: anewarray     org/openide/nodes/Node
             * 58: dup
             * 59: iconst_0
             * 60: aload_1
             * 61: aastore
             * 62: invokevirtual org/openide/windows/TopComponent.setActivatedNodes:([Lorg/openide/nodes/Node;)V
             * 65: aload_0
             * 66: getfield      org/openide/windows/TopComponent$NodeName.top:Lorg/openide/windows/TopComponent;
             * 69: aload_1
             * 70: invokevirtual org/openide/nodes/Node.getDisplayName:()Ljava/lang/String;
             * 73: invokevirtual org/openide/windows/TopComponent.setName:(Ljava/lang/String;)V
             * 76: aload_2
             * 77: monitorexit
             * 78: goto          86
             * 81: astore_3
             * 82: aload_2
             * 83: monitorexit
             * 84: aload_3
             * 85: athrow
             * 86: return
             * Exception table:
             * from    to  target type
             * 7    78    81   any
             * 81    84    81   any
             *  */
            // </editor-fold>
        }

        private org.openide.nodes.Node getNode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$NodeName.node:Ljava/lang/ref/Reference;
             * 4: invokevirtual java/lang/ref/Reference.get:()Ljava/lang/Object;
             * 7: checkcast     org/openide/nodes/Node
             * 10: areturn
             *  */
            // </editor-fold>
        }
    }

    @Retention(value = RetentionPolicy.SOURCE)
    @Target(value = {ElementType.TYPE, ElementType.METHOD})
    public @interface OpenActionRegistration {

        public String displayName();

        public String preferredID() default "";
    }

    @Retention(value = RetentionPolicy.SOURCE)
    @Target(value = {ElementType.TYPE, ElementType.METHOD})
    public @interface Registration {

        public String mode();

        public int position() default 2147483647;

        public boolean openAtStartup();

        public String[] roles() default {};
    }

    public static interface Registry {

        public static final String PROP_OPENED = "opened";
        public static final String PROP_ACTIVATED = "activated";
        public static final String PROP_CURRENT_NODES = "currentNodes";
        public static final String PROP_ACTIVATED_NODES = "activatedNodes";
        public static final String PROP_TC_OPENED = "tcOpened";
        public static final String PROP_TC_CLOSED = "tcClosed";

        public Set<TopComponent> getOpened();

        public TopComponent getActivated();

        public org.openide.nodes.Node[] getCurrentNodes();

        public org.openide.nodes.Node[] getActivatedNodes();

        public void addPropertyChangeListener(PropertyChangeListener pl);

        public void removePropertyChangeListener(PropertyChangeListener pl);
    }

    private static final class Replacer implements Serializable {

        static final long serialVersionUID = -8897067133215740572L;
        transient TopComponent tc;

        public Replacer(TopComponent tc) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 9: return
             *  */
            // </editor-fold>
        }

        private void writeObject(ObjectOutputStream oos) throws IOException, ClassNotFoundException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: aload_0
             * 2: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 5: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
             * 8: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
             * 11: invokevirtual java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
             * 14: aload_0
             * 15: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 18: aload_1
             * 19: invokevirtual org/openide/windows/TopComponent.writeExternal:(Ljava/io/ObjectOutput;)V
             * 22: return
             *  */
            // </editor-fold>
        }

        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokevirtual java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
             * 4: checkcast     java/lang/String
             * 7: astore_2
             * 8: aload_2
             * 9: invokestatic  org/openide/util/Utilities.translate:(Ljava/lang/String;)Ljava/lang/String;
             * 12: astore_2
             * 13: invokestatic  org/openide/util/Lookup.getDefault:()Lorg/openide/util/Lookup;
             * 16: ldc_w         java/lang/ClassLoader
             * 19: invokevirtual org/openide/util/Lookup.lookup:(Ljava/lang/Class;)Ljava/lang/Object;
             * 22: checkcast     java/lang/ClassLoader
             * 25: astore_3
             * 26: aload_3
             * 27: ifnonnull     38
             * 30: aload_0
             * 31: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
             * 34: invokevirtual java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
             * 37: astore_3
             * 38: aload_2
             * 39: iconst_1
             * 40: aload_3
             * 41: invokestatic  java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
             * 44: astore        4
             * 46: aload         4
             * 48: iconst_0
             * 49: anewarray     java/lang/Class
             * 52: invokevirtual java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
             * 55: astore        5
             * 57: aload         5
             * 59: iconst_1
             * 60: invokevirtual java/lang/reflect/Constructor.setAccessible:(Z)V
             * 63: aload_0
             * 64: aload         5
             * 66: iconst_0
             * 67: anewarray     java/lang/Object
             * 70: invokevirtual java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
             * 73: checkcast     org/openide/windows/TopComponent
             * 76: putfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 79: aload         5
             * 81: iconst_0
             * 82: invokevirtual java/lang/reflect/Constructor.setAccessible:(Z)V
             * 85: goto          99
             * 88: astore        6
             * 90: aload         5
             * 92: iconst_0
             * 93: invokevirtual java/lang/reflect/Constructor.setAccessible:(Z)V
             * 96: aload         6
             * 98: athrow
             * 99: aload_0
             * 100: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 103: aload_1
             * 104: invokevirtual org/openide/windows/TopComponent.readExternal:(Ljava/io/ObjectInput;)V
             * 107: aload         4
             * 109: invokestatic  org/openide/windows/TopComponent$Replacer.findReadResolveMethod:(Ljava/lang/Class;)Ljava/lang/reflect/Method;
             * 112: astore        6
             * 114: aload         6
             * 116: ifnull        247
             * 119: aload         6
             * 121: invokevirtual java/lang/reflect/Method.getExceptionTypes:()[Ljava/lang/Class;
             * 124: astore        7
             * 126: aload         7
             * 128: arraylength
             * 129: iconst_1
             * 130: if_icmpne     247
             * 133: ldc_w         java/io/ObjectStreamException
             * 136: aload         7
             * 138: iconst_0
             * 139: aaload
             * 140: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
             * 143: ifeq          247
             * 146: ldc_w         java/lang/Object
             * 149: aload         6
             * 151: invokevirtual java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
             * 154: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
             * 157: ifeq          247
             * 160: aload         6
             * 162: iconst_1
             * 163: invokevirtual java/lang/reflect/Method.setAccessible:(Z)V
             * 166: aload_0
             * 167: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 170: astore        8
             * 172: aload_0
             * 173: aload         6
             * 175: aload_0
             * 176: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 179: iconst_0
             * 180: anewarray     java/lang/Object
             * 183: invokevirtual java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
             * 186: checkcast     org/openide/windows/TopComponent
             * 189: putfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 192: aload_0
             * 193: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 196: ifnonnull     227
             * 199: new           java/io/InvalidObjectException
             * 202: dup
             * 203: new           java/lang/StringBuilder
             * 206: dup
             * 207: invokespecial java/lang/StringBuilder."<init>":()V
             * 210: ldc           TopComponent.readResolve() cannot return null. See http://www.netbeans.org/issues/show_bug.cgi?id=27849 for more info. TopComponent:
             * 212: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 215: aload         8
             * 217: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 220: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 223: invokespecial java/io/InvalidObjectException."<init>":(Ljava/lang/String;)V
             * 226: athrow
             * 227: aload         6
             * 229: iconst_0
             * 230: invokevirtual java/lang/reflect/Method.setAccessible:(Z)V
             * 233: goto          247
             * 236: astore        9
             * 238: aload         6
             * 240: iconst_0
             * 241: invokevirtual java/lang/reflect/Method.setAccessible:(Z)V
             * 244: aload         9
             * 246: athrow
             * 247: goto          307
             * 250: astore_3
             * 251: aload_3
             * 252: astore        4
             * 254: aload         4
             * 256: instanceof    java/lang/reflect/InvocationTargetException
             * 259: ifeq          272
             * 262: aload         4
             * 264: checkcast     java/lang/reflect/InvocationTargetException
             * 267: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException:()Ljava/lang/Throwable;
             * 270: astore        4
             * 272: aload         4
             * 274: instanceof    java/io/IOException
             * 277: ifeq          286
             * 280: aload         4
             * 282: checkcast     java/io/IOException
             * 285: athrow
             * 286: new           java/io/IOException
             * 289: dup
             * 290: aload         4
             * 292: invokevirtual java/lang/Throwable.toString:()Ljava/lang/String;
             * 295: invokespecial java/io/IOException."<init>":(Ljava/lang/String;)V
             * 298: aload         4
             * 300: invokevirtual java/io/IOException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
             * 303: checkcast     java/io/IOException
             * 306: athrow
             * 307: return
             * Exception table:
             * from    to  target type
             * 63    79    88   any
             * 88    90    88   any
             * 166   227   236   any
             * 236   238   236   any
             * 13   247   250   Class java/lang/Exception
             *  */
            // </editor-fold>
        }

        private Object readResolve() throws ObjectStreamException {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$Replacer.tc:Lorg/openide/windows/TopComponent;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        private static Method findReadResolveMethod(Class clazz) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aconst_null
             * 1: astore_1
             * 2: iconst_0
             * 3: anewarray     java/lang/Class
             * 6: astore_2
             * 7: aload_0
             * 8: ldc           readResolve
             * 10: aload_2
             * 11: invokevirtual java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
             * 14: astore_1
             * 15: goto          59
             * 18: astore_3
             * 19: aload_0
             * 20: astore        4
             * 22: aload         4
             * 24: ifnull        59
             * 27: aload         4
             * 29: ldc_w         org/openide/windows/TopComponent
             * 32: if_acmpeq     59
             * 35: aload         4
             * 37: ldc           readResolve
             * 39: aload_2
             * 40: invokevirtual java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
             * 43: astore_1
             * 44: goto          59
             * 47: astore        5
             * 49: aload         4
             * 51: invokevirtual java/lang/Class.getSuperclass:()Ljava/lang/Class;
             * 54: astore        4
             * 56: goto          22
             * 59: aload_1
             * 60: areturn
             * Exception table:
             * from    to  target type
             * 7    15    18   Class java/lang/NoSuchMethodException
             * 35    44    47   Class java/lang/NoSuchMethodException
             *  */
            // </editor-fold>
        }
    }

    public static final class SubComponent {

        private final String displayName;
        private final String description;
        private final boolean active;
        private final ActionListener activator;
        private final org.openide.util.Lookup lookup;
        private final boolean showing;

        public SubComponent(String displayName, ActionListener activator, boolean active) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aconst_null
             * 3: aload_2
             * 4: iload_3
             * 5: invokespecial org/openide/windows/TopComponent$SubComponent."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/awt/event/ActionListener;Z)V
             * 8: return
             *  */
            // </editor-fold>
        }

        public SubComponent(String displayName, String description, ActionListener activator, boolean active) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: aload_2
             * 3: aload_3
             * 4: iload         4
             * 6: getstatic     org/openide/util/Lookup.EMPTY:Lorg/openide/util/Lookup;
             * 9: iconst_0
             * 10: invokespecial org/openide/windows/TopComponent$SubComponent."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/awt/event/ActionListener;ZLorg/openide/util/Lookup;Z)V
             * 13: return
             *  */
            // </editor-fold>
        }

        public SubComponent(String displayName, String description, ActionListener activator, boolean active, org.openide.util.Lookup lookup, boolean showing) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/windows/TopComponent$SubComponent.displayName:Ljava/lang/String;
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/windows/TopComponent$SubComponent.description:Ljava/lang/String;
             * 14: aload_0
             * 15: iload         4
             * 17: putfield      org/openide/windows/TopComponent$SubComponent.active:Z
             * 20: aload_0
             * 21: aload_3
             * 22: putfield      org/openide/windows/TopComponent$SubComponent.activator:Ljava/awt/event/ActionListener;
             * 25: aload_0
             * 26: aload         5
             * 28: putfield      org/openide/windows/TopComponent$SubComponent.lookup:Lorg/openide/util/Lookup;
             * 31: aload_0
             * 32: iload         6
             * 34: putfield      org/openide/windows/TopComponent$SubComponent.showing:Z
             * 37: return
             *  */
            // </editor-fold>
        }

        public org.openide.util.Lookup getLookup() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$SubComponent.lookup:Lorg/openide/util/Lookup;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public boolean isShowing() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$SubComponent.showing:Z
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public final boolean isActive() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$SubComponent.active:Z
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public final String getDescription() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$SubComponent.description:Ljava/lang/String;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public final String getDisplayName() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$SubComponent.displayName:Ljava/lang/String;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public final void activate() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/windows/TopComponent$SubComponent.activator:Ljava/awt/event/ActionListener;
             * 4: new           java/awt/event/ActionEvent
             * 7: dup
             * 8: aload_0
             * 9: iconst_0
             * 10: ldc           activate
             * 12: invokespecial java/awt/event/ActionEvent."<init>":(Ljava/lang/Object;ILjava/lang/String;)V
             * 15: invokeinterface java/awt/event/ActionListener.actionPerformed:(Ljava/awt/event/ActionEvent;)V
             * 20: return
             *  */
            // </editor-fold>
        }
    }

    private class SynchronizeNodes implements org.openide.util.LookupListener, Runnable {

        private org.openide.util.Lookup.Result<org.openide.nodes.Node> res;

        public SynchronizeNodes(org.openide.util.Lookup l) {
            // compiled code
        }

        public void resultChanged(org.openide.util.LookupEvent ev) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
             * 3: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
             * 6: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
             * 9: istore_2
             * 10: iload_2
             * 11: ifeq          57
             * 14: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
             * 17: new           java/lang/StringBuilder
             * 20: dup
             * 21: invokespecial java/lang/StringBuilder."<init>":()V
             * 24: ldc           lookup changed for
             * 26: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 29: aload_0
             * 30: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 33: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 36: ldc            is visible:
             * 38: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 41: aload_0
             * 42: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 45: invokevirtual org/openide/windows/TopComponent.isVisible:()Z
             * 48: invokevirtual java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
             * 51: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 54: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
             * 57: aload_0
             * 58: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 61: invokevirtual org/openide/windows/TopComponent.isVisible:()Z
             * 64: ifeq          80
             * 67: invokestatic  java/awt/EventQueue.isDispatchThread:()Z
             * 70: ifeq          80
             * 73: aload_0
             * 74: invokevirtual org/openide/windows/TopComponent$SynchronizeNodes.run:()V
             * 77: goto          84
             * 80: aload_0
             * 81: invokestatic  java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
             * 84: iload_2
             * 85: ifeq          116
             * 88: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
             * 91: new           java/lang/StringBuilder
             * 94: dup
             * 95: invokespecial java/lang/StringBuilder."<init>":()V
             * 98: ldc           lookup changed exit
             * 100: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 103: aload_0
             * 104: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 107: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 110: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 113: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
             * 116: return
             *  */
            // </editor-fold>
        }

        public void run() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
             * 3: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
             * 6: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
             * 9: istore_1
             * 10: aload_0
             * 11: getfield      org/openide/windows/TopComponent$SynchronizeNodes.res:Lorg/openide/util/Lookup$Result;
             * 14: invokevirtual org/openide/util/Lookup$Result.allInstances:()Ljava/util/Collection;
             * 17: astore_2
             * 18: iload_1
             * 19: ifeq          59
             * 22: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
             * 25: new           java/lang/StringBuilder
             * 28: dup
             * 29: invokespecial java/lang/StringBuilder."<init>":()V
             * 32: ldc           setting nodes for
             * 34: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 37: aload_0
             * 38: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 41: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 44: ldc            to
             * 46: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 49: aload_2
             * 50: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 53: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 56: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
             * 59: aload_0
             * 60: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 63: aload_2
             * 64: iconst_0
             * 65: anewarray     org/openide/nodes/Node
             * 68: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
             * 73: checkcast     "[Lorg/openide/nodes/Node;"
             * 76: invokestatic  org/openide/windows/TopComponent.access$500:(Lorg/openide/windows/TopComponent;[Lorg/openide/nodes/Node;)V
             * 79: iload_1
             * 80: ifeq          120
             * 83: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
             * 86: new           java/lang/StringBuilder
             * 89: dup
             * 90: invokespecial java/lang/StringBuilder."<init>":()V
             * 93: ldc           setting nodes done for
             * 95: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 98: aload_0
             * 99: getfield      org/openide/windows/TopComponent$SynchronizeNodes.this$0:Lorg/openide/windows/TopComponent;
             * 102: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 105: ldc            to
             * 107: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 110: aload_2
             * 111: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 114: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 117: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
             * 120: return
             *  */
            // </editor-fold>
        }
    }
    private static Logger UILOG;
    static final long serialVersionUID = -3022538025284122942L;
    static final Logger LOG;
    @Deprecated
    public static final int CLOSE_EACH = 0;
    @Deprecated
    public static final int CLOSE_LAST = 1;
    public static final int PERSISTENCE_ALWAYS = 0;
    public static final int PERSISTENCE_ONLY_OPENED = 1;
    public static final int PERSISTENCE_NEVER = 2;
    private static Object defaultLookupLock;
    private static final Set<Class> warnedTCPIClasses;
    private static final Set<Class> warnedClasses;
    private Object defaultLookupRef;
    private NodeName nodeName;
    private int closeOperation;
    private transient Image icon;
    private transient org.openide.nodes.Node[] activatedNodes;
    private transient String displayName;
    private String htmlDisplayName;
    short serialVersion;
    private AttentionGetter attentionGetter;
    public static final String PROP_KEEP_PREFERRED_SIZE_WHEN_SLIDED_IN = "netbeans.winsys.tc.keep_preferred_size_when_slided_in";
    public static final String PROP_CLOSING_DISABLED = "netbeans.winsys.tc.closing_disabled";
    public static final String PROP_SLIDING_DISABLED = "netbeans.winsys.tc.sliding_disabled";
    public static final String PROP_UNDOCKING_DISABLED = "netbeans.winsys.tc.undocking_disabled";
    public static final String PROP_DRAGGING_DISABLED = "netbeans.winsys.tc.dragging_disabled";
    public static final String PROP_MAXIMIZATION_DISABLED = "netbeans.winsys.tc.maximization_disabled";
    public static final String PROP_DND_COPY_DISABLED = "netbeans.winsys.tc.draganddrop_copy_disabled";
    private transient String modeName;
    private static final String MODE_ID_PREFERENCES_KEY_INFIX = "_modeId_";

    public TopComponent() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: checkcast     org/openide/util/Lookup
         * 5: invokespecial org/openide/windows/TopComponent."<init>":(Lorg/openide/util/Lookup;)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public TopComponent(org.openide.util.Lookup lookup) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial javax/swing/JComponent."<init>":()V
         * 4: aload_0
         * 5: iconst_1
         * 6: putfield      org/openide/windows/TopComponent.closeOperation:I
         * 9: aload_0
         * 10: iconst_1
         * 11: putfield      org/openide/windows/TopComponent.serialVersion:S
         * 14: aload_0
         * 15: aconst_null
         * 16: putfield      org/openide/windows/TopComponent.attentionGetter:Lorg/openide/windows/TopComponent$AttentionGetter;
         * 19: aload_1
         * 20: ifnull        29
         * 23: aload_0
         * 24: aload_1
         * 25: iconst_1
         * 26: invokevirtual org/openide/windows/TopComponent.setLookup:(Lorg/openide/util/Lookup;Z)V
         * 29: aload_0
         * 30: ldc2_w        8l
         * 33: invokevirtual org/openide/windows/TopComponent.enableEvents:(J)V
         * 36: aload_0
         * 37: iconst_0
         * 38: invokevirtual org/openide/windows/TopComponent.setFocusable:(Z)V
         * 41: aload_0
         * 42: aload_1
         * 43: invokespecial org/openide/windows/TopComponent.initActionMap:(Lorg/openide/util/Lookup;)V
         * 46: return
         *  */
        // </editor-fold>
    }

    public void addNotify() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial javax/swing/JComponent.addNotify:()V
         * 4: aload_0
         * 5: invokespecial org/openide/windows/TopComponent.isPersistLocation:()Z
         * 8: ifeq          80
         * 11: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 14: aload_0
         * 15: invokevirtual org/openide/windows/WindowManager.findMode:(Lorg/openide/windows/TopComponent;)Lorg/openide/windows/Mode;
         * 18: astore_1
         * 19: aload_1
         * 20: ifnull        80
         * 23: aload_0
         * 24: aload_1
         * 25: invokeinterface org/openide/windows/Mode.getName:()Ljava/lang/String;
         * 30: putfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 33: aload_0
         * 34: getfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 37: ifnonnull     62
         * 40: aload_0
         * 41: aload_0
         * 42: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 45: ldc_w         org/openide/windows/RetainLocation
         * 48: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 51: checkcast     org/openide/windows/RetainLocation
         * 54: invokeinterface org/openide/windows/RetainLocation.value:()Ljava/lang/String;
         * 59: putfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 62: aload_0
         * 63: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 66: invokestatic  org/openide/util/NbPreferences.forModule:(Ljava/lang/Class;)Ljava/util/prefs/Preferences;
         * 69: aload_0
         * 70: invokespecial org/openide/windows/TopComponent.getModeIdKey:()Ljava/lang/String;
         * 73: aload_0
         * 74: getfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 77: invokevirtual java/util/prefs/Preferences.put:(Ljava/lang/String;Ljava/lang/String;)V
         * 80: return
         *  */
        // </editor-fold>
    }

    private boolean isPersistLocation() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.getPersistenceType:()I
         * 4: iconst_2
         * 5: if_icmpne     25
         * 8: aload_0
         * 9: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 12: ldc_w         org/openide/windows/RetainLocation
         * 15: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 18: ifnull        25
         * 21: iconst_1
         * 22: goto          26
         * 25: iconst_0
         * 26: istore_1
         * 27: getstatic     org/openide/windows/TopComponent.$assertionsDisabled:Z
         * 30: ifne          48
         * 33: aload_0
         * 34: invokespecial org/openide/windows/TopComponent.annotationAndPersistenceTypeAreCompatible:()Z
         * 37: ifne          48
         * 40: new           java/lang/AssertionError
         * 43: dup
         * 44: invokespecial java/lang/AssertionError."<init>":()V
         * 47: athrow
         * 48: iload_1
         * 49: ireturn
         *  */
        // </editor-fold>
    }

    private boolean annotationAndPersistenceTypeAreCompatible() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.getPersistenceType:()I
         * 4: iconst_2
         * 5: if_icmpeq     52
         * 8: aload_0
         * 9: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 12: ldc_w         org/openide/windows/RetainLocation
         * 15: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 18: ifnull        52
         * 21: ldc_w         org/openide/windows/TopComponent
         * 24: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 27: invokestatic  java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 30: getstatic     java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         * 33: ldc           Useless to annotate a TopComponent with @RetainLocation if its persistence type is not PERSISTENCE_NEVER: {0}
         * 35: iconst_1
         * 36: anewarray     java/lang/Object
         * 39: dup
         * 40: iconst_0
         * 41: aload_0
         * 42: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 45: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 48: aastore
         * 49: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
         * 52: iconst_1
         * 53: ireturn
         *  */
        // </editor-fold>
    }

    private String getModeIdKey() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial java/lang/StringBuilder."<init>":()V
         * 7: aload_0
         * 8: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 11: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 14: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 17: ldc           _modeId_
         * 19: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 22: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 25: aload_0
         * 26: invokevirtual org/openide/windows/WindowManager.findTopComponentID:(Lorg/openide/windows/TopComponent;)Ljava/lang/String;
         * 29: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 32: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 35: areturn
         *  */
        // </editor-fold>
    }

    private void initActionMap(org.openide.util.Lookup lookup) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: astore_2
         * 2: aload_1
         * 3: ifnull        17
         * 6: aload_1
         * 7: ldc_w         javax/swing/ActionMap
         * 10: invokevirtual org/openide/util/Lookup.lookup:(Ljava/lang/Class;)Ljava/lang/Object;
         * 13: checkcast     javax/swing/ActionMap
         * 16: astore_2
         * 17: aload_2
         * 18: ifnonnull     29
         * 21: new           javax/swing/ActionMap
         * 24: dup
         * 25: invokespecial javax/swing/ActionMap."<init>":()V
         * 28: astore_2
         * 29: new           org/openide/windows/DelegateActionMap
         * 32: dup
         * 33: aload_0
         * 34: aload_2
         * 35: invokespecial org/openide/windows/DelegateActionMap."<init>":(Lorg/openide/windows/TopComponent;Ljavax/swing/ActionMap;)V
         * 38: astore_3
         * 39: aload_0
         * 40: instanceof    org/openide/windows/TopComponent$Cloneable
         * 43: ifeq          60
         * 46: aload_3
         * 47: ldc           cloneWindow
         * 49: new           org/openide/windows/TopComponent$CloneWindowAction
         * 52: dup
         * 53: aload_3
         * 54: invokespecial org/openide/windows/TopComponent$CloneWindowAction."<init>":(Lorg/openide/windows/DelegateActionMap;)V
         * 57: invokevirtual org/openide/windows/DelegateActionMap.put:(Ljava/lang/Object;Ljavax/swing/Action;)V
         * 60: aload_3
         * 61: ldc           closeWindow
         * 63: new           org/openide/windows/TopComponent$CloseWindowAction
         * 66: dup
         * 67: aload_3
         * 68: invokespecial org/openide/windows/TopComponent$CloseWindowAction."<init>":(Lorg/openide/windows/DelegateActionMap;)V
         * 71: invokevirtual org/openide/windows/DelegateActionMap.put:(Ljava/lang/Object;Ljavax/swing/Action;)V
         * 74: aload_0
         * 75: aload_3
         * 76: invokevirtual org/openide/windows/TopComponent.setActionMap:(Ljavax/swing/ActionMap;)V
         * 79: return
         *  */
        // </editor-fold>
    }

    public static final Registry getRegistry() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: invokevirtual org/openide/windows/WindowManager.getRegistry:()Lorg/openide/windows/TopComponent$Registry;
         * 6: areturn
         *  */
        // </editor-fold>
    }

    public final org.openide.nodes.Node[] getActivatedNodes() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.activatedNodes:[Lorg/openide/nodes/Node;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public final void setActivatedNodes(org.openide.nodes.Node[] activatedNodes) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/windows/TopComponent.$assertionsDisabled:Z
         * 3: ifne          21
         * 6: aload_0
         * 7: invokespecial org/openide/windows/TopComponent.multiviewActivatedNodes:()Z
         * 10: ifne          21
         * 13: new           java/lang/AssertionError
         * 16: dup
         * 17: invokespecial java/lang/AssertionError."<init>":()V
         * 20: athrow
         * 21: aload_0
         * 22: aload_1
         * 23: invokespecial org/openide/windows/TopComponent.setActivatedNodesImpl:([Lorg/openide/nodes/Node;)V
         * 26: return
         *  */
        // </editor-fold>
    }

    private boolean multiviewActivatedNodes() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           org.netbeans.core.multiview.MultiViewTopComponent
         * 2: aload_0
         * 3: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 6: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 9: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 12: ifne          30
         * 15: ldc           org.netbeans.core.multiview.MultiViewCloneableTopComponent
         * 17: aload_0
         * 18: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 21: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 24: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 27: ifeq          38
         * 30: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 33: ldc           Warning: You should not call setActivatedNodes() on the multiview topcomponents. Instead please manipulate the lookup of the embedded MultiViewElements. For details, please see http://www.netbeans.org/issues/show_bug.cgi?id=67257
         * 35: invokevirtual java/util/logging/Logger.info:(Ljava/lang/String;)V
         * 38: iconst_1
         * 39: ireturn
         *  */
        // </editor-fold>
    }

    private void setActivatedNodesImpl(org.openide.nodes.Node[] activatedNodes) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 3: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 6: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 9: istore_2
         * 10: aload_0
         * 11: getfield      org/openide/windows/TopComponent.activatedNodes:[Lorg/openide/nodes/Node;
         * 14: aload_1
         * 15: invokestatic  java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
         * 18: ifeq          51
         * 21: iload_2
         * 22: ifeq          50
         * 25: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 28: new           java/lang/StringBuilder
         * 31: dup
         * 32: invokespecial java/lang/StringBuilder."<init>":()V
         * 35: ldc           No change to activatedNodes for
         * 37: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 40: aload_0
         * 41: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 44: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 47: invokevirtual java/util/logging/Logger.finer:(Ljava/lang/String;)V
         * 50: return
         * 51: aload_0
         * 52: iconst_0
         * 53: invokespecial org/openide/windows/TopComponent.getLookup:(Z)Lorg/openide/util/Lookup;
         * 56: astore_3
         * 57: aload_3
         * 58: instanceof    org/openide/windows/DefaultTopComponentLookup
         * 61: ifeq          110
         * 64: iload_2
         * 65: ifeq          102
         * 68: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 71: new           java/lang/StringBuilder
         * 74: dup
         * 75: invokespecial java/lang/StringBuilder."<init>":()V
         * 78: ldc           Updating lookup
         * 80: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 83: aload_3
         * 84: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 87: ldc            for
         * 89: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 92: aload_0
         * 93: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 96: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 99: invokevirtual java/util/logging/Logger.finer:(Ljava/lang/String;)V
         * 102: aload_3
         * 103: checkcast     org/openide/windows/DefaultTopComponentLookup
         * 106: aload_1
         * 107: invokevirtual org/openide/windows/DefaultTopComponentLookup.updateLookups:([Lorg/openide/nodes/Node;)V
         * 110: aload_0
         * 111: getfield      org/openide/windows/TopComponent.activatedNodes:[Lorg/openide/nodes/Node;
         * 114: astore        4
         * 116: aload_0
         * 117: aload_1
         * 118: putfield      org/openide/windows/TopComponent.activatedNodes:[Lorg/openide/nodes/Node;
         * 121: iload_2
         * 122: ifeq          165
         * 125: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 128: new           java/lang/StringBuilder
         * 131: dup
         * 132: invokespecial java/lang/StringBuilder."<init>":()V
         * 135: ldc           activatedNodes changed:
         * 137: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 140: aload_1
         * 141: ifnonnull     149
         * 144: ldc
         * 146: goto          156
         * 149: aload_1
         * 150: invokestatic  java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         * 153: invokevirtual java/lang/Object.toString:()Ljava/lang/String;
         * 156: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 159: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 162: invokevirtual java/util/logging/Logger.finer:(Ljava/lang/String;)V
         * 165: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 168: aload_0
         * 169: aload_0
         * 170: getfield      org/openide/windows/TopComponent.activatedNodes:[Lorg/openide/nodes/Node;
         * 173: invokevirtual org/openide/windows/WindowManager.topComponentActivatedNodesChanged:(Lorg/openide/windows/TopComponent;[Lorg/openide/nodes/Node;)V
         * 176: iload_2
         * 177: ifeq          205
         * 180: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 183: new           java/lang/StringBuilder
         * 186: dup
         * 187: invokespecial java/lang/StringBuilder."<init>":()V
         * 190: ldc           window manager notified:
         * 192: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 195: aload_0
         * 196: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 199: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 202: invokevirtual java/util/logging/Logger.finer:(Ljava/lang/String;)V
         * 205: aload_0
         * 206: ldc           activatedNodes
         * 208: aload         4
         * 210: aload_0
         * 211: getfield      org/openide/windows/TopComponent.activatedNodes:[Lorg/openide/nodes/Node;
         * 214: invokevirtual org/openide/windows/TopComponent.firePropertyChange:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
         * 217: iload_2
         * 218: ifeq          246
         * 221: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 224: new           java/lang/StringBuilder
         * 227: dup
         * 228: invokespecial java/lang/StringBuilder."<init>":()V
         * 231: ldc           listeners notified:
         * 233: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 236: aload_0
         * 237: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 240: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 243: invokevirtual java/util/logging/Logger.finer:(Ljava/lang/String;)V
         * 246: return
         *  */
        // </editor-fold>
    }

    public int getPersistenceType() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: ldc_w         org/openide/windows/TopComponent$Description
         * 7: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 10: checkcast     org/openide/windows/TopComponent$Description
         * 13: astore_1
         * 14: aload_1
         * 15: ifnull        25
         * 18: aload_1
         * 19: invokeinterface org/openide/windows/TopComponent$Description.persistenceType:()I
         * 24: ireturn
         * 25: getstatic     org/openide/windows/TopComponent.warnedClasses:Ljava/util/Set;
         * 28: aload_0
         * 29: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 32: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
         * 37: ifeq          94
         * 40: ldc_w         org/openide/windows/TopComponent
         * 43: aload_0
         * 44: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 47: invokevirtual java/lang/Object.equals:(Ljava/lang/Object;)Z
         * 50: ifne          94
         * 53: invokestatic  java/util/logging/Logger.getAnonymousLogger:()Ljava/util/logging/Logger;
         * 56: new           java/lang/StringBuilder
         * 59: dup
         * 60: invokespecial java/lang/StringBuilder."<init>":()V
         * 63: ldc           Note -
         * 65: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 68: aload_0
         * 69: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 72: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 75: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 78: ldc            ought to override getPersistenceType()
         * 80: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 83: ldc            rather than using the client property or accepting the default.
         * 85: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 88: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 91: invokevirtual java/util/logging/Logger.warning:(Ljava/lang/String;)V
         * 94: aload_0
         * 95: ldc           PersistenceType
         * 97: invokevirtual org/openide/windows/TopComponent.getClientProperty:(Ljava/lang/Object;)Ljava/lang/Object;
         * 100: checkcast     java/lang/String
         * 103: astore_2
         * 104: aload_2
         * 105: ifnonnull     110
         * 108: iconst_0
         * 109: ireturn
         * 110: ldc           Never
         * 112: aload_2
         * 113: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 116: ifeq          121
         * 119: iconst_2
         * 120: ireturn
         * 121: ldc           OnlyOpened
         * 123: aload_2
         * 124: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 127: ifeq          132
         * 130: iconst_1
         * 131: ireturn
         * 132: iconst_0
         * 133: ireturn
         *  */
        // </editor-fold>
    }

    public org.openide.awt.UndoRedo getUndoRedo() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/awt/UndoRedo.NONE:Lorg/openide/awt/UndoRedo;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public void open() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: invokevirtual org/openide/windows/TopComponent.open:(Lorg/openide/windows/Workspace;)V
         * 5: return
         *  */
        // </editor-fold>
    }

    @Deprecated
    public void open(Workspace workspace) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial org/openide/windows/TopComponent.isPersistLocation:()Z
         * 4: ifeq          78
         * 7: aload_0
         * 8: aload_0
         * 9: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 12: invokestatic  org/openide/util/NbPreferences.forModule:(Ljava/lang/Class;)Ljava/util/prefs/Preferences;
         * 15: aload_0
         * 16: invokespecial org/openide/windows/TopComponent.getModeIdKey:()Ljava/lang/String;
         * 19: aconst_null
         * 20: invokevirtual java/util/prefs/Preferences.get:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 23: putfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 26: aload_0
         * 27: getfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 30: ifnonnull     55
         * 33: aload_0
         * 34: aload_0
         * 35: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 38: ldc_w         org/openide/windows/RetainLocation
         * 41: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 44: checkcast     org/openide/windows/RetainLocation
         * 47: invokeinterface org/openide/windows/RetainLocation.value:()Ljava/lang/String;
         * 52: putfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 55: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 58: aload_0
         * 59: getfield      org/openide/windows/TopComponent.modeName:Ljava/lang/String;
         * 62: invokevirtual org/openide/windows/WindowManager.findMode:(Ljava/lang/String;)Lorg/openide/windows/Mode;
         * 65: astore_2
         * 66: aload_2
         * 67: ifnull        78
         * 70: aload_2
         * 71: aload_0
         * 72: invokeinterface org/openide/windows/Mode.dockInto:(Lorg/openide/windows/TopComponent;)Z
         * 77: pop
         * 78: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 81: aload_0
         * 82: invokevirtual org/openide/windows/WindowManager.topComponentOpen:(Lorg/openide/windows/TopComponent;)V
         * 85: return
         *  */
        // </editor-fold>
    }

    public final void openAtTabPosition(int position) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: iload_1
         * 5: invokevirtual org/openide/windows/WindowManager.topComponentOpenAtTabPosition:(Lorg/openide/windows/TopComponent;I)V
         * 8: return
         *  */
        // </editor-fold>
    }

    public final int getTabPosition() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: invokevirtual org/openide/windows/WindowManager.topComponentGetTabPosition:(Lorg/openide/windows/TopComponent;)I
         * 7: ireturn
         *  */
        // </editor-fold>
    }

    public final boolean isOpened() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: invokevirtual org/openide/windows/TopComponent.isOpened:(Lorg/openide/windows/Workspace;)Z
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    @Deprecated
    public final boolean isOpened(Workspace workspace) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: invokevirtual org/openide/windows/WindowManager.topComponentIsOpened:(Lorg/openide/windows/TopComponent;)Z
         * 7: ireturn
         *  */
        // </editor-fold>
    }

    public final boolean close() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aconst_null
         * 2: invokevirtual org/openide/windows/TopComponent.close:(Lorg/openide/windows/Workspace;)Z
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    @Deprecated
    public final boolean close(Workspace workspace) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.isOpened:()Z
         * 4: ifne          9
         * 7: iconst_1
         * 8: ireturn
         * 9: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 12: aload_0
         * 13: invokevirtual org/openide/windows/WindowManager.topComponentClose:(Lorg/openide/windows/TopComponent;)V
         * 16: aload_0
         * 17: invokevirtual org/openide/windows/TopComponent.isOpened:()Z
         * 20: ifne          27
         * 23: iconst_1
         * 24: goto          28
         * 27: iconst_0
         * 28: ireturn
         *  */
        // </editor-fold>
    }

    public boolean canClose() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.isOpened:()Z
         * 4: ifne          9
         * 7: iconst_0
         * 8: ireturn
         * 9: aload_0
         * 10: aconst_null
         * 11: iconst_1
         * 12: invokevirtual org/openide/windows/TopComponent.canClose:(Lorg/openide/windows/Workspace;Z)Z
         * 15: ireturn
         *  */
        // </editor-fold>
    }

    @Deprecated
    public boolean canClose(Workspace workspace, boolean last) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_1
         * 1: ireturn
         *  */
        // </editor-fold>
    }

    @Deprecated
    protected void openNotify() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    @Deprecated
    protected void closeNotify() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    @Deprecated
    public SystemAction[] getSystemActions() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: anewarray     org/openide/util/actions/SystemAction
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public Action[] getActions() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: invokevirtual org/openide/windows/WindowManager.topComponentDefaultActions:(Lorg/openide/windows/TopComponent;)[Ljavax/swing/Action;
         * 7: astore_1
         * 8: aload_0
         * 9: invokevirtual org/openide/windows/TopComponent.getSystemActions:()[Lorg/openide/util/actions/SystemAction;
         * 12: astore_2
         * 13: aload_2
         * 14: arraylength
         * 15: ifle          55
         * 18: new           java/util/ArrayList
         * 21: dup
         * 22: aload_1
         * 23: invokestatic  java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         * 26: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
         * 29: astore_3
         * 30: aload_3
         * 31: aload_2
         * 32: invokestatic  java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         * 35: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
         * 40: pop
         * 41: aload_3
         * 42: iconst_0
         * 43: anewarray     javax/swing/Action
         * 46: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
         * 51: checkcast     "[Ljavax/swing/Action;"
         * 54: areturn
         * 55: aload_1
         * 56: areturn
         *  */
        // </editor-fold>
    }

    public static Action openAction(TopComponent component, String displayName, String iconBase, boolean noIconInMenu) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/windows/OpenComponentAction
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/windows/OpenComponentAction."<init>":(Lorg/openide/windows/TopComponent;)V
         * 8: aload_1
         * 9: aload_2
         * 10: iload_3
         * 11: invokestatic  org/openide/awt/Actions.alwaysEnabled:(Ljava/awt/event/ActionListener;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/swing/Action;
         * 14: areturn
         *  */
        // </editor-fold>
    }

    static Action openAction(Map map) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/windows/OpenComponentAction
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/windows/OpenComponentAction."<init>":(Ljava/util/Map;)V
         * 8: aload_0
         * 9: ldc           displayName
         * 11: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 16: checkcast     java/lang/String
         * 19: aload_0
         * 20: ldc           iconBase
         * 22: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 27: checkcast     java/lang/String
         * 30: getstatic     java/lang/Boolean.TRUE:Ljava/lang/Boolean;
         * 33: aload_0
         * 34: ldc           noIconInMenu
         * 36: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 41: invokevirtual java/lang/Boolean.equals:(Ljava/lang/Object;)Z
         * 44: invokestatic  org/openide/awt/Actions.alwaysEnabled:(Ljava/awt/event/ActionListener;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/swing/Action;
         * 47: areturn
         *  */
        // </editor-fold>
    }

    @Deprecated
    public final void setCloseOperation(int closeOperation) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: ifeq          28
         * 4: iload_1
         * 5: iconst_1
         * 6: if_icmpeq     28
         * 9: new           java/lang/IllegalArgumentException
         * 12: dup
         * 13: ldc_w         org/openide/windows/TopComponent
         * 16: invokestatic  org/openide/util/NbBundle.getBundle:(Ljava/lang/Class;)Ljava/util/ResourceBundle;
         * 19: ldc           EXC_UnknownOperation
         * 21: invokevirtual java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 24: invokespecial java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 27: athrow
         * 28: aload_0
         * 29: getfield      org/openide/windows/TopComponent.closeOperation:I
         * 32: iload_1
         * 33: if_icmpne     37
         * 36: return
         * 37: aload_0
         * 38: iload_1
         * 39: putfield      org/openide/windows/TopComponent.closeOperation:I
         * 42: aload_0
         * 43: ldc           closeOperation
         * 45: aconst_null
         * 46: aconst_null
         * 47: invokevirtual org/openide/windows/TopComponent.firePropertyChange:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
         * 50: return
         *  */
        // </editor-fold>
    }

    @Deprecated
    public final int getCloseOperation() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.closeOperation:I
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    protected String preferredID() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 4: astore_1
         * 5: aload_1
         * 6: ldc_w         org/openide/windows/TopComponent$Description
         * 9: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 12: checkcast     org/openide/windows/TopComponent$Description
         * 15: astore_2
         * 16: aload_2
         * 17: ifnull        27
         * 20: aload_2
         * 21: invokeinterface org/openide/windows/TopComponent$Description.preferredID:()Ljava/lang/String;
         * 26: areturn
         * 27: aload_0
         * 28: invokevirtual org/openide/windows/TopComponent.getPersistenceType:()I
         * 31: iconst_2
         * 32: if_icmpeq     75
         * 35: getstatic     org/openide/windows/TopComponent.warnedTCPIClasses:Ljava/util/Set;
         * 38: aload_1
         * 39: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
         * 44: ifeq          75
         * 47: invokestatic  java/util/logging/Logger.getAnonymousLogger:()Ljava/util/logging/Logger;
         * 50: new           java/lang/StringBuilder
         * 53: dup
         * 54: invokespecial java/lang/StringBuilder."<init>":()V
         * 57: aload_1
         * 58: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 61: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 64: ldc            should override preferredID()
         * 66: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 69: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 72: invokevirtual java/util/logging/Logger.warning:(Ljava/lang/String;)V
         * 75: aload_0
         * 76: invokevirtual org/openide/windows/TopComponent.getName:()Ljava/lang/String;
         * 79: astore_3
         * 80: aload_3
         * 81: ifnonnull     120
         * 84: aload_1
         * 85: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 88: bipush        46
         * 90: invokevirtual java/lang/String.lastIndexOf:(I)I
         * 93: istore        4
         * 95: iload         4
         * 97: iconst_m1
         * 98: if_icmpne     108
         * 101: aload_1
         * 102: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 105: goto          119
         * 108: aload_1
         * 109: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 112: iload         4
         * 114: iconst_1
         * 115: iadd
         * 116: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 119: astore_3
         * 120: aload_3
         * 121: areturn
         *  */
        // </editor-fold>
    }

    protected void componentOpened() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.openNotify:()V
         * 4: return
         *  */
        // </editor-fold>
    }

    protected void componentClosed() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.closeNotify:()V
         * 4: return
         *  */
        // </editor-fold>
    }

    protected void componentShowing() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    protected void componentHidden() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    protected void componentActivated() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    protected void componentDeactivated() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    public void requestFocus() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.isFocusable:()Z
         * 4: ifeq          11
         * 7: aload_0
         * 8: invokespecial javax/swing/JComponent.requestFocus:()V
         * 11: return
         *  */
        // </editor-fold>
    }

    public boolean requestFocusInWindow() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.isFocusable:()Z
         * 4: ifeq          12
         * 7: aload_0
         * 8: invokespecial javax/swing/JComponent.requestFocusInWindow:()Z
         * 11: ireturn
         * 12: iconst_0
         * 13: ireturn
         *  */
        // </editor-fold>
    }

    public void requestActive() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: invokevirtual org/openide/windows/WindowManager.topComponentRequestActive:(Lorg/openide/windows/TopComponent;)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public void toFront() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: invokevirtual org/openide/windows/WindowManager.topComponentToFront:(Lorg/openide/windows/TopComponent;)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public void requestVisible() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 3: aload_0
         * 4: invokevirtual org/openide/windows/WindowManager.topComponentRequestVisible:(Lorg/openide/windows/TopComponent;)V
         * 7: aload_0
         * 8: invokevirtual org/openide/windows/TopComponent.getActionMap:()Ljavax/swing/ActionMap;
         * 11: invokestatic  org/netbeans/modules/openide/windows/GlobalActionContextImpl.blickActionMap:(Ljavax/swing/ActionMap;)V
         * 14: return
         *  */
        // </editor-fold>
    }

    public final void requestAttention(boolean brief) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/windows/TopComponent$1
         * 3: dup
         * 4: aload_0
         * 5: iload_1
         * 6: invokespecial org/openide/windows/TopComponent$1."<init>":(Lorg/openide/windows/TopComponent;Z)V
         * 9: invokestatic  java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
         * 12: return
         *  */
        // </editor-fold>
    }

    public final void makeBusy(boolean busy) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 3: new           org/openide/windows/TopComponent$2
         * 6: dup
         * 7: aload_0
         * 8: iload_1
         * 9: invokespecial org/openide/windows/TopComponent$2."<init>":(Lorg/openide/windows/TopComponent;Z)V
         * 12: invokevirtual org/openide/util/Mutex.readAccess:(Ljava/lang/Runnable;)V
         * 15: return
         *  */
        // </editor-fold>
    }

    public final void cancelRequestAttention() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/windows/TopComponent$3
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/windows/TopComponent$3."<init>":(Lorg/openide/windows/TopComponent;)V
         * 8: invokestatic  java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
         * 11: return
         *  */
        // </editor-fold>
    }

    public final void setAttentionHighlight(boolean highlight) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 3: new           org/openide/windows/TopComponent$4
         * 6: dup
         * 7: aload_0
         * 8: iload_1
         * 9: invokespecial org/openide/windows/TopComponent$4."<init>":(Lorg/openide/windows/TopComponent;Z)V
         * 12: invokevirtual org/openide/util/Mutex.readAccess:(Ljava/lang/Runnable;)V
         * 15: return
         *  */
        // </editor-fold>
    }

    public void setName(String name) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/windows/TopComponent.getName:()Ljava/lang/String;
         * 4: astore_2
         * 5: aload_1
         * 6: ifnull        18
         * 9: aload_1
         * 10: aload_2
         * 11: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 14: ifeq          18
         * 17: return
         * 18: aload_0
         * 19: aload_1
         * 20: invokespecial javax/swing/JComponent.setName:(Ljava/lang/String;)V
         * 23: aload_0
         * 24: ldc           name
         * 26: aload_2
         * 27: aload_1
         * 28: invokevirtual org/openide/windows/TopComponent.firePropertyChange:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
         * 31: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 34: aload_0
         * 35: aload_1
         * 36: invokevirtual org/openide/windows/WindowManager.topComponentDisplayNameChanged:(Lorg/openide/windows/TopComponent;Ljava/lang/String;)V
         * 39: return
         *  */
        // </editor-fold>
    }

    public void setDisplayName(String displayName) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.displayName:Ljava/lang/String;
         * 4: astore_2
         * 5: aload_1
         * 6: aload_2
         * 7: if_acmpeq     22
         * 10: aload_1
         * 11: ifnull        23
         * 14: aload_1
         * 15: aload_2
         * 16: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 19: ifeq          23
         * 22: return
         * 23: aload_1
         * 24: invokestatic  javax/swing/plaf/basic/BasicHTML.isHTMLString:(Ljava/lang/String;)Z
         * 27: ifeq          100
         * 30: invokestatic  java/util/logging/Logger.getAnonymousLogger:()Ljava/util/logging/Logger;
         * 33: new           java/lang/StringBuilder
         * 36: dup
         * 37: invokespecial java/lang/StringBuilder."<init>":()V
         * 40: ldc           Call of
         * 42: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 45: aload_0
         * 46: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 49: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 52: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 55: ldc           .setDisplayName(\"
         * 57: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 60: aload_1
         * 61: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 64: ldc           \")
         * 66: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 69: ldc            shouldn't contain any HTML tags. Please use
         * 71: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 74: aload_0
         * 75: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 78: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 81: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 84: ldc           .setHtmlDisplayName(String)
         * 86: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 89: ldc           for such purpose. For details please see http://www.netbeans.org/issues/show_bug.cgi?id=66777.
         * 91: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 94: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 97: invokevirtual java/util/logging/Logger.warning:(Ljava/lang/String;)V
         * 100: aload_0
         * 101: aload_1
         * 102: putfield      org/openide/windows/TopComponent.displayName:Ljava/lang/String;
         * 105: aload_0
         * 106: ldc           displayName
         * 108: aload_2
         * 109: aload_1
         * 110: invokevirtual org/openide/windows/TopComponent.firePropertyChange:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
         * 113: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 116: aload_0
         * 117: aload_1
         * 118: invokevirtual org/openide/windows/WindowManager.topComponentDisplayNameChanged:(Lorg/openide/windows/TopComponent;Ljava/lang/String;)V
         * 121: return
         *  */
        // </editor-fold>
    }

    public String getDisplayName() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.displayName:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public String getShortName() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: areturn
         *  */
        // </editor-fold>
    }

    public void setHtmlDisplayName(String htmlDisplayName) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.htmlDisplayName:Ljava/lang/String;
         * 4: astore_2
         * 5: aload_1
         * 6: aload_2
         * 7: if_acmpeq     22
         * 10: aload_1
         * 11: ifnull        23
         * 14: aload_1
         * 15: aload_2
         * 16: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 19: ifeq          23
         * 22: return
         * 23: aload_0
         * 24: aload_1
         * 25: putfield      org/openide/windows/TopComponent.htmlDisplayName:Ljava/lang/String;
         * 28: aload_0
         * 29: ldc           htmlDisplayName
         * 31: aload_2
         * 32: aload_1
         * 33: invokevirtual org/openide/windows/TopComponent.firePropertyChange:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
         * 36: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 39: aload_0
         * 40: aload_1
         * 41: invokevirtual org/openide/windows/WindowManager.topComponentHtmlDisplayNameChanged:(Lorg/openide/windows/TopComponent;Ljava/lang/String;)V
         * 44: return
         *  */
        // </editor-fold>
    }

    public String getHtmlDisplayName() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.htmlDisplayName:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public void setToolTipText(String toolTip) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnull        16
         * 4: aload_1
         * 5: aload_0
         * 6: invokevirtual org/openide/windows/TopComponent.getToolTipText:()Ljava/lang/String;
         * 9: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
         * 12: ifeq          16
         * 15: return
         * 16: aload_0
         * 17: aload_1
         * 18: invokespecial javax/swing/JComponent.setToolTipText:(Ljava/lang/String;)V
         * 21: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 24: aload_0
         * 25: aload_1
         * 26: invokevirtual org/openide/windows/WindowManager.topComponentToolTipChanged:(Lorg/openide/windows/TopComponent;Ljava/lang/String;)V
         * 29: return
         *  */
        // </editor-fold>
    }

    public void setIcon(Image icon) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: aload_0
         * 2: getfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 5: if_acmpne     9
         * 8: return
         * 9: aload_0
         * 10: getfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 13: astore_2
         * 14: aload_0
         * 15: aload_1
         * 16: putfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 19: invokestatic  org/openide/windows/WindowManager.getDefault:()Lorg/openide/windows/WindowManager;
         * 22: aload_0
         * 23: aload_0
         * 24: getfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 27: invokevirtual org/openide/windows/WindowManager.topComponentIconChanged:(Lorg/openide/windows/TopComponent;Ljava/awt/Image;)V
         * 30: aload_0
         * 31: ldc           icon
         * 33: aload_2
         * 34: aload_1
         * 35: invokevirtual org/openide/windows/TopComponent.firePropertyChange:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
         * 38: return
         *  */
        // </editor-fold>
    }

    public Image getIcon() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 4: ifnonnull     39
         * 7: aload_0
         * 8: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 11: ldc_w         org/openide/windows/TopComponent$Description
         * 14: invokevirtual java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
         * 17: checkcast     org/openide/windows/TopComponent$Description
         * 20: dup
         * 21: astore_1
         * 22: ifnull        39
         * 25: aload_0
         * 26: aload_1
         * 27: invokeinterface org/openide/windows/TopComponent$Description.iconBase:()Ljava/lang/String;
         * 32: iconst_1
         * 33: invokestatic  org/openide/util/ImageUtilities.loadImage:(Ljava/lang/String;Z)Ljava/awt/Image;
         * 36: putfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 39: aload_0
         * 40: getfield      org/openide/windows/TopComponent.icon:Ljava/awt/Image;
         * 43: areturn
         *  */
        // </editor-fold>
    }

    public HelpCtx getHelpCtx() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/HelpCtx
         * 3: dup
         * 4: ldc_w         org/openide/windows/TopComponent
         * 7: invokespecial org/openide/util/HelpCtx."<init>":(Ljava/lang/Class;)V
         * 10: areturn
         *  */
        // </editor-fold>
    }

    public List<Mode> availableModes(List<Mode> modes) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: areturn
         *  */
        // </editor-fold>
    }

    protected boolean processKeyBinding(KeyStroke ks, KeyEvent e, int condition, boolean pressed) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: aload_2
         * 3: iload_3
         * 4: iload         4
         * 6: invokespecial javax/swing/JComponent.processKeyBinding:(Ljavax/swing/KeyStroke;Ljava/awt/event/KeyEvent;IZ)Z
         * 9: istore        5
         * 11: iconst_1
         * 12: iload_3
         * 13: if_icmpne     331
         * 16: iload         5
         * 18: ifne          331
         * 21: aload_2
         * 22: invokevirtual java/awt/event/KeyEvent.isConsumed:()Z
         * 25: ifne          331
         * 28: invokestatic  org/openide/util/Lookup.getDefault:()Lorg/openide/util/Lookup;
         * 31: ldc_w         javax/swing/text/Keymap
         * 34: invokevirtual org/openide/util/Lookup.lookup:(Ljava/lang/Class;)Ljava/lang/Object;
         * 37: checkcast     javax/swing/text/Keymap
         * 40: astore        6
         * 42: aload         6
         * 44: ifnull        58
         * 47: aload         6
         * 49: aload_1
         * 50: invokeinterface javax/swing/text/Keymap.getAction:(Ljavax/swing/KeyStroke;)Ljavax/swing/Action;
         * 55: goto          59
         * 58: aconst_null
         * 59: astore        7
         * 61: aload         7
         * 63: ifnonnull     68
         * 66: iconst_0
         * 67: ireturn
         * 68: aload         7
         * 70: instanceof    org/openide/util/ContextAwareAction
         * 73: ifeq          155
         * 76: aload         7
         * 78: checkcast     org/openide/util/ContextAwareAction
         * 81: aload_0
         * 82: invokevirtual org/openide/windows/TopComponent.getLookup:()Lorg/openide/util/Lookup;
         * 85: invokeinterface org/openide/util/ContextAwareAction.createContextAwareInstance:(Lorg/openide/util/Lookup;)Ljavax/swing/Action;
         * 90: astore        8
         * 92: getstatic     org/openide/windows/TopComponent.$assertionsDisabled:Z
         * 95: ifne          131
         * 98: aload         8
         * 100: ifnonnull     131
         * 103: new           java/lang/AssertionError
         * 106: dup
         * 107: new           java/lang/StringBuilder
         * 110: dup
         * 111: invokespecial java/lang/StringBuilder."<init>":()V
         * 114: ldc           ContextAwareAction cannot return null:
         * 116: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 119: aload         7
         * 121: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 124: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 127: invokespecial java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
         * 130: athrow
         * 131: aload         8
         * 133: invokeinterface javax/swing/Action.isEnabled:()Z
         * 138: ifeq          152
         * 141: aload_0
         * 142: invokevirtual org/openide/windows/TopComponent.getActivatedNodes:()[Lorg/openide/nodes/Node;
         * 145: ifnull        152
         * 148: aload         8
         * 150: astore        7
         * 152: goto          192
         * 155: aload_2
         * 156: invokevirtual java/awt/event/KeyEvent.getComponent:()Ljava/awt/Component;
         * 159: invokestatic  javax/swing/SwingUtilities.getWindowAncestor:(Ljava/awt/Component;)Ljava/awt/Window;
         * 162: instanceof    java/awt/Dialog
         * 165: ifeq          192
         * 168: aload         7
         * 170: ldc           OpenIDE-Transmodal-Action
         * 172: invokeinterface javax/swing/Action.getValue:(Ljava/lang/String;)Ljava/lang/Object;
         * 177: astore        8
         * 179: getstatic     java/lang/Boolean.TRUE:Ljava/lang/Boolean;
         * 182: aload         8
         * 184: invokevirtual java/lang/Boolean.equals:(Ljava/lang/Object;)Z
         * 187: ifne          192
         * 190: iconst_0
         * 191: ireturn
         * 192: aload         7
         * 194: invokeinterface javax/swing/Action.isEnabled:()Z
         * 199: ifeq          326
         * 202: new           java/util/logging/LogRecord
         * 205: dup
         * 206: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 209: ldc           UI_ACTION_KEY_PRESS
         * 211: invokespecial java/util/logging/LogRecord."<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
         * 214: astore        8
         * 216: aload         8
         * 218: iconst_5
         * 219: anewarray     java/lang/Object
         * 222: dup
         * 223: iconst_0
         * 224: aload_1
         * 225: aastore
         * 226: dup
         * 227: iconst_1
         * 228: aload_1
         * 229: invokevirtual javax/swing/KeyStroke.toString:()Ljava/lang/String;
         * 232: aastore
         * 233: dup
         * 234: iconst_2
         * 235: aload         7
         * 237: invokevirtual java/lang/Object.toString:()Ljava/lang/String;
         * 240: aastore
         * 241: dup
         * 242: iconst_3
         * 243: aload         7
         * 245: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 248: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 251: aastore
         * 252: dup
         * 253: iconst_4
         * 254: aload         7
         * 256: ldc           Name
         * 258: invokeinterface javax/swing/Action.getValue:(Ljava/lang/String;)Ljava/lang/Object;
         * 263: aastore
         * 264: invokevirtual java/util/logging/LogRecord.setParameters:([Ljava/lang/Object;)V
         * 267: aload         8
         * 269: ldc_w         org/openide/windows/TopComponent
         * 272: invokestatic  org/openide/util/NbBundle.getBundle:(Ljava/lang/Class;)Ljava/util/ResourceBundle;
         * 275: invokevirtual java/util/logging/LogRecord.setResourceBundle:(Ljava/util/ResourceBundle;)V
         * 278: aload         8
         * 280: getstatic     org/openide/windows/TopComponent.UILOG:Ljava/util/logging/Logger;
         * 283: invokevirtual java/util/logging/Logger.getName:()Ljava/lang/String;
         * 286: invokevirtual java/util/logging/LogRecord.setLoggerName:(Ljava/lang/String;)V
         * 289: getstatic     org/openide/windows/TopComponent.UILOG:Ljava/util/logging/Logger;
         * 292: aload         8
         * 294: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
         * 297: new           java/awt/event/ActionEvent
         * 300: dup
         * 301: aload_0
         * 302: sipush        1001
         * 305: aload_1
         * 306: invokestatic  org/openide/util/Utilities.keyToString:(Ljavax/swing/KeyStroke;)Ljava/lang/String;
         * 309: invokespecial java/awt/event/ActionEvent."<init>":(Ljava/lang/Object;ILjava/lang/String;)V
         * 312: astore        9
         * 314: aload         7
         * 316: aload         9
         * 318: invokeinterface javax/swing/Action.actionPerformed:(Ljava/awt/event/ActionEvent;)V
         * 323: goto          329
         * 326: invokestatic  org/openide/util/Utilities.disabledActionBeep:()V
         * 329: iconst_1
         * 330: ireturn
         * 331: iload         5
         * 333: ireturn
         *  */
        // </editor-fold>
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: new           java/lang/Short
         * 4: dup
         * 5: aload_0
         * 6: getfield      org/openide/windows/TopComponent.serialVersion:S
         * 9: invokespecial java/lang/Short."<init>":(S)V
         * 12: invokeinterface java/io/ObjectOutput.writeObject:(Ljava/lang/Object;)V
         * 17: aload_1
         * 18: aload_0
         * 19: getfield      org/openide/windows/TopComponent.closeOperation:I
         * 22: invokeinterface java/io/ObjectOutput.writeInt:(I)V
         * 27: aload_1
         * 28: aload_0
         * 29: invokevirtual org/openide/windows/TopComponent.getName:()Ljava/lang/String;
         * 32: invokeinterface java/io/ObjectOutput.writeObject:(Ljava/lang/Object;)V
         * 37: aload_1
         * 38: aload_0
         * 39: invokevirtual org/openide/windows/TopComponent.getToolTipText:()Ljava/lang/String;
         * 42: invokeinterface java/io/ObjectOutput.writeObject:(Ljava/lang/Object;)V
         * 47: aload_0
         * 48: invokevirtual org/openide/windows/TopComponent.getDisplayName:()Ljava/lang/String;
         * 51: ifnull        64
         * 54: aload_1
         * 55: aload_0
         * 56: invokevirtual org/openide/windows/TopComponent.getDisplayName:()Ljava/lang/String;
         * 59: invokeinterface java/io/ObjectOutput.writeObject:(Ljava/lang/Object;)V
         * 64: aload_0
         * 65: getfield      org/openide/windows/TopComponent.nodeName:Lorg/openide/windows/TopComponent$NodeName;
         * 68: ifnonnull     75
         * 71: aconst_null
         * 72: goto          82
         * 75: aload_0
         * 76: getfield      org/openide/windows/TopComponent.nodeName:Lorg/openide/windows/TopComponent$NodeName;
         * 79: invokestatic  org/openide/windows/TopComponent$NodeName.access$200:(Lorg/openide/windows/TopComponent$NodeName;)Lorg/openide/nodes/Node;
         * 82: astore_2
         * 83: aload_2
         * 84: ifnonnull     91
         * 87: aconst_null
         * 88: goto          95
         * 91: aload_2
         * 92: invokevirtual org/openide/nodes/Node.getHandle:()Lorg/openide/nodes/Node$Handle;
         * 95: astore_3
         * 96: aload_1
         * 97: aload_3
         * 98: invokeinterface java/io/ObjectOutput.writeObject:(Ljava/lang/Object;)V
         * 103: return
         *  */
        // </editor-fold>
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 6: astore_2
         * 7: aload_2
         * 8: instanceof    java/lang/Integer
         * 11: ifeq          66
         * 14: aload_0
         * 15: iconst_0
         * 16: putfield      org/openide/windows/TopComponent.serialVersion:S
         * 19: aload_0
         * 20: aload_2
         * 21: checkcast     java/lang/Integer
         * 24: invokevirtual java/lang/Integer.intValue:()I
         * 27: putfield      org/openide/windows/TopComponent.closeOperation:I
         * 30: aload_1
         * 31: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 36: pop
         * 37: aload_0
         * 38: aload_1
         * 39: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 44: checkcast     java/lang/String
         * 47: invokespecial javax/swing/JComponent.setName:(Ljava/lang/String;)V
         * 50: aload_0
         * 51: aload_1
         * 52: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 57: checkcast     java/lang/String
         * 60: invokevirtual org/openide/windows/TopComponent.setToolTipText:(Ljava/lang/String;)V
         * 63: goto          168
         * 66: aload_0
         * 67: aload_2
         * 68: checkcast     java/lang/Short
         * 71: invokevirtual java/lang/Short.shortValue:()S
         * 74: putfield      org/openide/windows/TopComponent.serialVersion:S
         * 77: aload_0
         * 78: aload_1
         * 79: invokeinterface java/io/ObjectInput.readInt:()I
         * 84: putfield      org/openide/windows/TopComponent.closeOperation:I
         * 87: aload_0
         * 88: aload_1
         * 89: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 94: checkcast     java/lang/String
         * 97: invokespecial javax/swing/JComponent.setName:(Ljava/lang/String;)V
         * 100: aload_0
         * 101: aload_1
         * 102: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 107: checkcast     java/lang/String
         * 110: invokevirtual org/openide/windows/TopComponent.setToolTipText:(Ljava/lang/String;)V
         * 113: aload_1
         * 114: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 119: astore_3
         * 120: aload_3
         * 121: instanceof    java/lang/String
         * 124: ifeq          142
         * 127: aload_0
         * 128: aload_3
         * 129: checkcast     java/lang/String
         * 132: invokevirtual org/openide/windows/TopComponent.setDisplayName:(Ljava/lang/String;)V
         * 135: aload_1
         * 136: invokeinterface java/io/ObjectInput.readObject:()Ljava/lang/Object;
         * 141: astore_3
         * 142: aload_3
         * 143: checkcast     org/openide/nodes/Node$Handle
         * 146: astore        4
         * 148: aload         4
         * 150: ifnull        168
         * 153: aload         4
         * 155: invokeinterface org/openide/nodes/Node$Handle.getNode:()Lorg/openide/nodes/Node;
         * 160: astore        5
         * 162: aload_0
         * 163: aload         5
         * 165: invokestatic  org/openide/windows/TopComponent$NodeName.connect:(Lorg/openide/windows/TopComponent;Lorg/openide/nodes/Node;)V
         * 168: aload_0
         * 169: getfield      org/openide/windows/TopComponent.closeOperation:I
         * 172: ifeq          213
         * 175: aload_0
         * 176: getfield      org/openide/windows/TopComponent.closeOperation:I
         * 179: iconst_1
         * 180: if_icmpeq     213
         * 183: new           java/io/IOException
         * 186: dup
         * 187: new           java/lang/StringBuilder
         * 190: dup
         * 191: invokespecial java/lang/StringBuilder."<init>":()V
         * 194: ldc           invalid closeOperation:
         * 196: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 199: aload_0
         * 200: getfield      org/openide/windows/TopComponent.closeOperation:I
         * 203: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 206: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 209: invokespecial java/io/IOException."<init>":(Ljava/lang/String;)V
         * 212: athrow
         * 213: return
         *  */
        // </editor-fold>
    }

    protected Object writeReplace() throws ObjectStreamException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/windows/TopComponent$Replacer
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/windows/TopComponent$Replacer."<init>":(Lorg/openide/windows/TopComponent;)V
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public AccessibleContext getAccessibleContext() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/windows/TopComponent.accessibleContext:Ljavax/accessibility/AccessibleContext;
         * 4: ifnonnull     19
         * 7: aload_0
         * 8: new           org/openide/windows/TopComponent$5
         * 11: dup
         * 12: aload_0
         * 13: invokespecial org/openide/windows/TopComponent$5."<init>":(Lorg/openide/windows/TopComponent;)V
         * 16: putfield      org/openide/windows/TopComponent.accessibleContext:Ljavax/accessibility/AccessibleContext;
         * 19: aload_0
         * 20: getfield      org/openide/windows/TopComponent.accessibleContext:Ljavax/accessibility/AccessibleContext;
         * 23: areturn
         *  */
        // </editor-fold>
    }

    public org.openide.util.Lookup getLookup() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_1
         * 2: invokespecial org/openide/windows/TopComponent.getLookup:(Z)Lorg/openide/util/Lookup;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    private org.openide.util.Lookup getLookup(boolean init) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/windows/TopComponent.defaultLookupLock:Ljava/lang/Object;
         * 3: dup
         * 4: astore_2
         * 5: monitorenter
         * 6: aload_0
         * 7: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 10: instanceof    org/openide/util/Lookup
         * 13: ifeq          26
         * 16: aload_0
         * 17: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 20: checkcast     org/openide/util/Lookup
         * 23: aload_2
         * 24: monitorexit
         * 25: areturn
         * 26: aload_0
         * 27: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 30: instanceof    "[Ljava/lang/Object;"
         * 33: ifeq          54
         * 36: aload_0
         * 37: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 40: checkcast     "[Ljava/lang/Object;"
         * 43: checkcast     "[Ljava/lang/Object;"
         * 46: iconst_0
         * 47: aaload
         * 48: checkcast     org/openide/util/Lookup
         * 51: aload_2
         * 52: monitorexit
         * 53: areturn
         * 54: aload_0
         * 55: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 58: instanceof    java/lang/ref/Reference
         * 61: ifeq          89
         * 64: aload_0
         * 65: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 68: checkcast     java/lang/ref/Reference
         * 71: invokevirtual java/lang/ref/Reference.get:()Ljava/lang/Object;
         * 74: astore_3
         * 75: aload_3
         * 76: instanceof    org/openide/util/Lookup
         * 79: ifeq          89
         * 82: aload_3
         * 83: checkcast     org/openide/util/Lookup
         * 86: aload_2
         * 87: monitorexit
         * 88: areturn
         * 89: iload_1
         * 90: ifne          97
         * 93: aconst_null
         * 94: aload_2
         * 95: monitorexit
         * 96: areturn
         * 97: new           org/openide/windows/DefaultTopComponentLookup
         * 100: dup
         * 101: aload_0
         * 102: invokespecial org/openide/windows/DefaultTopComponentLookup."<init>":(Lorg/openide/windows/TopComponent;)V
         * 105: astore_3
         * 106: aload_0
         * 107: new           java/lang/ref/WeakReference
         * 110: dup
         * 111: aload_3
         * 112: invokespecial java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
         * 115: putfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 118: aload_3
         * 119: aload_2
         * 120: monitorexit
         * 121: areturn
         * 122: astore        4
         * 124: aload_2
         * 125: monitorexit
         * 126: aload         4
         * 128: athrow
         * Exception table:
         * from    to  target type
         * 6    25   122   any
         * 26    53   122   any
         * 54    88   122   any
         * 89    96   122   any
         * 97   121   122   any
         * 122   126   122   any
         *  */
        // </editor-fold>
    }

    protected final void associateLookup(org.openide.util.Lookup lookup) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_1
         * 3: invokevirtual org/openide/windows/TopComponent.setLookup:(Lorg/openide/util/Lookup;Z)V
         * 6: return
         *  */
        // </editor-fold>
    }

    final void setLookup(org.openide.util.Lookup lookup, boolean sync) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/windows/TopComponent.defaultLookupLock:Ljava/lang/Object;
         * 3: dup
         * 4: astore_3
         * 5: monitorenter
         * 6: aload_0
         * 7: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 10: ifnull        64
         * 13: new           java/lang/IllegalStateException
         * 16: dup
         * 17: new           java/lang/StringBuilder
         * 20: dup
         * 21: invokespecial java/lang/StringBuilder."<init>":()V
         * 24: ldc_w         Trying to set lookup
         * 27: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 30: aload_1
         * 31: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 34: ldc_w          but there already is
         * 37: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 40: aload_0
         * 41: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 44: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 47: ldc_w          for component:
         * 50: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 53: aload_0
         * 54: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 57: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 60: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 63: athrow
         * 64: aload_0
         * 65: aload_1
         * 66: putfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 69: iload_2
         * 70: ifeq          100
         * 73: aload_0
         * 74: iconst_2
         * 75: anewarray     java/lang/Object
         * 78: dup
         * 79: iconst_0
         * 80: aload_0
         * 81: getfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 84: aastore
         * 85: dup
         * 86: iconst_1
         * 87: new           org/openide/windows/TopComponent$SynchronizeNodes
         * 90: dup
         * 91: aload_0
         * 92: aload_1
         * 93: invokespecial org/openide/windows/TopComponent$SynchronizeNodes."<init>":(Lorg/openide/windows/TopComponent;Lorg/openide/util/Lookup;)V
         * 96: aastore
         * 97: putfield      org/openide/windows/TopComponent.defaultLookupRef:Ljava/lang/Object;
         * 100: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 103: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 106: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 109: ifeq          158
         * 112: getstatic     org/openide/windows/TopComponent.LOG:Ljava/util/logging/Logger;
         * 115: new           java/lang/StringBuilder
         * 118: dup
         * 119: invokespecial java/lang/StringBuilder."<init>":()V
         * 122: ldc_w         setLookup with
         * 125: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 128: aload_1
         * 129: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 132: ldc_w          and sync:
         * 135: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 138: iload_2
         * 139: invokevirtual java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
         * 142: ldc_w          on
         * 145: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 148: aload_0
         * 149: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 152: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 155: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
         * 158: aload_3
         * 159: monitorexit
         * 160: goto          170
         * 163: astore        4
         * 165: aload_3
         * 166: monitorexit
         * 167: aload         4
         * 169: athrow
         * 170: return
         * Exception table:
         * from    to  target type
         * 6   160   163   any
         * 163   167   163   any
         *  */
        // </editor-fold>
    }

    private void attachNodeName(NodeName nodeName) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      org/openide/windows/TopComponent.nodeName:Lorg/openide/windows/TopComponent$NodeName;
         * 5: return
         *  */
        // </editor-fold>
    }

    public SubComponent[] getSubComponents() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: anewarray     org/openide/windows/TopComponent$SubComponent
         * 4: areturn
         *  */
        // </editor-fold>
    }
}
