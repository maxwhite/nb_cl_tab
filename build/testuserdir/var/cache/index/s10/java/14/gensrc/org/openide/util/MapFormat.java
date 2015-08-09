package org.openide.util;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Map;

public class MapFormat extends Format {

    private static final int BUFSIZE = 255;
    static final long serialVersionUID = -7695811542873819435L;
    private Locale locale;
    private String ldel;
    private String rdel;
    private Map argmap;
    private int[] offsets;
    private String[] arguments;
    private int maxOffset;
    private boolean throwex;
    private boolean exactmatch;

    public MapFormat(Map arguments) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/text/Format."<init>":()V
         * 4: aload_0
         * 5: invokestatic  java/util/Locale.getDefault:()Ljava/util/Locale;
         * 8: putfield      org/openide/util/MapFormat.locale:Ljava/util/Locale;
         * 11: aload_0
         * 12: ldc           {
         * 14: putfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 17: aload_0
         * 18: ldc           }
         * 20: putfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 23: aload_0
         * 24: iconst_0
         * 25: putfield      org/openide/util/MapFormat.throwex:Z
         * 28: aload_0
         * 29: iconst_1
         * 30: putfield      org/openide/util/MapFormat.exactmatch:Z
         * 33: aload_0
         * 34: aload_1
         * 35: invokevirtual org/openide/util/MapFormat.setMap:(Ljava/util/Map;)V
         * 38: return
         *  */
        // </editor-fold>
    }

    public static String format(String pattern, Map arguments) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/MapFormat
         * 3: dup
         * 4: aload_1
         * 5: invokespecial org/openide/util/MapFormat."<init>":(Ljava/util/Map;)V
         * 8: astore_2
         * 9: aload_2
         * 10: aload_0
         * 11: invokevirtual org/openide/util/MapFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
         * 14: areturn
         *  */
        // </editor-fold>
    }

    protected Object processKey(String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MapFormat.argmap:Ljava/util/Map;
         * 4: aload_1
         * 5: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 10: areturn
         *  */
        // </editor-fold>
    }

    public String processPattern(String newPattern) throws IllegalArgumentException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: iconst_m1
         * 3: istore_3
         * 4: new           java/lang/StringBuffer
         * 7: dup
         * 8: invokespecial java/lang/StringBuffer."<init>":()V
         * 11: astore        4
         * 13: aload_0
         * 14: sipush        255
         * 17: newarray       int
         * 19: putfield      org/openide/util/MapFormat.offsets:[I
         * 22: aload_0
         * 23: sipush        255
         * 26: anewarray     java/lang/String
         * 29: putfield      org/openide/util/MapFormat.arguments:[Ljava/lang/String;
         * 32: aload_0
         * 33: iconst_m1
         * 34: putfield      org/openide/util/MapFormat.maxOffset:I
         * 37: iconst_m1
         * 38: istore        5
         * 40: aload_1
         * 41: aload_0
         * 42: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 45: iload_2
         * 46: invokevirtual java/lang/String.indexOf:(Ljava/lang/String;I)I
         * 49: istore        6
         * 51: iload         6
         * 53: iflt          229
         * 56: aload_1
         * 57: aload_0
         * 58: getfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 61: iload         6
         * 63: aload_0
         * 64: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 67: invokevirtual java/lang/String.length:()I
         * 70: iadd
         * 71: invokevirtual java/lang/String.indexOf:(Ljava/lang/String;I)I
         * 74: istore        5
         * 76: iinc          3, 1
         * 79: iload_3
         * 80: sipush        255
         * 83: if_icmplt     105
         * 86: new           java/lang/IllegalArgumentException
         * 89: dup
         * 90: ldc_w         org/openide/util/MapFormat
         * 93: invokestatic  org/openide/util/NbBundle.getBundle:(Ljava/lang/Class;)Ljava/util/ResourceBundle;
         * 96: ldc           MSG_TooManyArguments
         * 98: invokevirtual java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 101: invokespecial java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 104: athrow
         * 105: iload         5
         * 107: ifge          159
         * 110: aload_0
         * 111: getfield      org/openide/util/MapFormat.exactmatch:Z
         * 114: ifeq          229
         * 117: new           java/lang/IllegalArgumentException
         * 120: dup
         * 121: new           java/lang/StringBuilder
         * 124: dup
         * 125: invokespecial java/lang/StringBuilder."<init>":()V
         * 128: ldc_w         org/openide/util/MapFormat
         * 131: invokestatic  org/openide/util/NbBundle.getBundle:(Ljava/lang/Class;)Ljava/util/ResourceBundle;
         * 134: ldc           MSG_UnmatchedBraces
         * 136: invokevirtual java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 139: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 142: ldc
         * 144: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 147: iload         6
         * 149: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 152: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 155: invokespecial java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 158: athrow
         * 159: aload         4
         * 161: aload_1
         * 162: iload_2
         * 163: iload         6
         * 165: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 168: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 171: pop
         * 172: aload_0
         * 173: getfield      org/openide/util/MapFormat.offsets:[I
         * 176: iload_3
         * 177: aload         4
         * 179: invokevirtual java/lang/StringBuffer.length:()I
         * 182: iastore
         * 183: aload_0
         * 184: getfield      org/openide/util/MapFormat.arguments:[Ljava/lang/String;
         * 187: iload_3
         * 188: aload_1
         * 189: iload         6
         * 191: aload_0
         * 192: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 195: invokevirtual java/lang/String.length:()I
         * 198: iadd
         * 199: iload         5
         * 201: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 204: aastore
         * 205: iload         5
         * 207: aload_0
         * 208: getfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 211: invokevirtual java/lang/String.length:()I
         * 214: iadd
         * 215: istore_2
         * 216: aload_0
         * 217: dup
         * 218: getfield      org/openide/util/MapFormat.maxOffset:I
         * 221: iconst_1
         * 222: iadd
         * 223: putfield      org/openide/util/MapFormat.maxOffset:I
         * 226: goto          37
         * 229: aload         4
         * 231: aload_1
         * 232: iload_2
         * 233: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 236: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 239: pop
         * 240: aload         4
         * 242: invokevirtual java/lang/StringBuffer.toString:()Ljava/lang/String;
         * 245: areturn
         *  */
        // </editor-fold>
    }

    private String formatObject(Object obj) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnonnull     6
         * 4: aconst_null
         * 5: areturn
         * 6: aload_1
         * 7: instanceof    java/lang/Number
         * 10: ifeq          25
         * 13: aload_0
         * 14: getfield      org/openide/util/MapFormat.locale:Ljava/util/Locale;
         * 17: invokestatic  java/text/NumberFormat.getInstance:(Ljava/util/Locale;)Ljava/text/NumberFormat;
         * 20: aload_1
         * 21: invokevirtual java/text/NumberFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
         * 24: areturn
         * 25: aload_1
         * 26: instanceof    java/util/Date
         * 29: ifeq          46
         * 32: iconst_3
         * 33: iconst_3
         * 34: aload_0
         * 35: getfield      org/openide/util/MapFormat.locale:Ljava/util/Locale;
         * 38: invokestatic  java/text/DateFormat.getDateTimeInstance:(IILjava/util/Locale;)Ljava/text/DateFormat;
         * 41: aload_1
         * 42: invokevirtual java/text/DateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
         * 45: areturn
         * 46: aload_1
         * 47: instanceof    java/lang/String
         * 50: ifeq          58
         * 53: aload_1
         * 54: checkcast     java/lang/String
         * 57: areturn
         * 58: aload_1
         * 59: invokevirtual java/lang/Object.toString:()Ljava/lang/String;
         * 62: areturn
         *  */
        // </editor-fold>
    }

    public StringBuffer format(Object pat, StringBuffer result, FieldPosition fpos) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: checkcast     java/lang/String
         * 5: invokevirtual org/openide/util/MapFormat.processPattern:(Ljava/lang/String;)Ljava/lang/String;
         * 8: astore        4
         * 10: iconst_0
         * 11: istore        5
         * 13: iconst_0
         * 14: istore        6
         * 16: iload         6
         * 18: aload_0
         * 19: getfield      org/openide/util/MapFormat.maxOffset:I
         * 22: if_icmpgt     311
         * 25: aload_0
         * 26: getfield      org/openide/util/MapFormat.offsets:[I
         * 29: iload         6
         * 31: iaload
         * 32: istore        7
         * 34: aload_2
         * 35: aload         4
         * 37: iload         5
         * 39: aload_0
         * 40: getfield      org/openide/util/MapFormat.offsets:[I
         * 43: iload         6
         * 45: iaload
         * 46: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 49: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 52: pop
         * 53: iload         7
         * 55: istore        5
         * 57: aload_0
         * 58: getfield      org/openide/util/MapFormat.arguments:[Ljava/lang/String;
         * 61: iload         6
         * 63: aaload
         * 64: astore        8
         * 66: aload         8
         * 68: invokevirtual java/lang/String.length:()I
         * 71: ifle          89
         * 74: aload_0
         * 75: aload_0
         * 76: aload         8
         * 78: invokevirtual org/openide/util/MapFormat.processKey:(Ljava/lang/String;)Ljava/lang/Object;
         * 81: invokespecial org/openide/util/MapFormat.formatObject:(Ljava/lang/Object;)Ljava/lang/String;
         * 84: astore        9
         * 86: goto          110
         * 89: aload_2
         * 90: aload_0
         * 91: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 94: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 97: pop
         * 98: aload_2
         * 99: aload_0
         * 100: getfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 103: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 106: pop
         * 107: goto          305
         * 110: aload         9
         * 112: ifnonnull     217
         * 115: new           java/lang/StringBuilder
         * 118: dup
         * 119: invokespecial java/lang/StringBuilder."<init>":()V
         * 122: aload_0
         * 123: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 126: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 129: aload         8
         * 131: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 134: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 137: astore        10
         * 139: aload         10
         * 141: aload_0
         * 142: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 145: invokevirtual java/lang/String.lastIndexOf:(Ljava/lang/String;)I
         * 148: istore        11
         * 150: iload         11
         * 152: ifle          217
         * 155: aload         10
         * 157: iload         11
         * 159: aload_0
         * 160: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 163: invokevirtual java/lang/String.length:()I
         * 166: iadd
         * 167: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 170: astore        12
         * 172: aload_0
         * 173: aload_0
         * 174: aload         12
         * 176: invokevirtual org/openide/util/MapFormat.processKey:(Ljava/lang/String;)Ljava/lang/Object;
         * 179: invokespecial org/openide/util/MapFormat.formatObject:(Ljava/lang/Object;)Ljava/lang/String;
         * 182: astore        13
         * 184: aload         13
         * 186: ifnull        217
         * 189: new           java/lang/StringBuilder
         * 192: dup
         * 193: invokespecial java/lang/StringBuilder."<init>":()V
         * 196: aload         10
         * 198: iconst_0
         * 199: iload         11
         * 201: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 204: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 207: aload         13
         * 209: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 212: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 215: astore        9
         * 217: aload         9
         * 219: ifnonnull     298
         * 222: aload_0
         * 223: getfield      org/openide/util/MapFormat.throwex:Z
         * 226: ifeq          267
         * 229: new           java/lang/IllegalArgumentException
         * 232: dup
         * 233: ldc_w         org/openide/util/MapFormat
         * 236: invokestatic  org/openide/util/NbBundle.getBundle:(Ljava/lang/Class;)Ljava/util/ResourceBundle;
         * 239: ldc           MSG_FMT_ObjectForKey
         * 241: invokevirtual java/util/ResourceBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
         * 244: iconst_1
         * 245: anewarray     java/lang/Object
         * 248: dup
         * 249: iconst_0
         * 250: new           java/lang/Integer
         * 253: dup
         * 254: aload         8
         * 256: invokespecial java/lang/Integer."<init>":(Ljava/lang/String;)V
         * 259: aastore
         * 260: invokestatic  java/text/MessageFormat.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
         * 263: invokespecial java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 266: athrow
         * 267: new           java/lang/StringBuilder
         * 270: dup
         * 271: invokespecial java/lang/StringBuilder."<init>":()V
         * 274: aload_0
         * 275: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 278: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 281: aload         8
         * 283: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 286: aload_0
         * 287: getfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 290: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 293: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 296: astore        9
         * 298: aload_2
         * 299: aload         9
         * 301: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 304: pop
         * 305: iinc          6, 1
         * 308: goto          16
         * 311: aload_2
         * 312: aload         4
         * 314: iload         5
         * 316: aload         4
         * 318: invokevirtual java/lang/String.length:()I
         * 321: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
         * 324: invokevirtual java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
         * 327: pop
         * 328: aload_2
         * 329: areturn
         *  */
        // </editor-fold>
    }

    public Object parseObject(String text, ParsePosition status) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual org/openide/util/MapFormat.parse:(Ljava/lang/String;)Ljava/lang/String;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    public String parse(String source) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/lang/StringBuffer
         * 3: dup
         * 4: aload_1
         * 5: invokespecial java/lang/StringBuffer."<init>":(Ljava/lang/String;)V
         * 8: astore_2
         * 9: aload_0
         * 10: getfield      org/openide/util/MapFormat.argmap:Ljava/util/Map;
         * 13: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
         * 18: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
         * 23: astore_3
         * 24: aload_3
         * 25: invokeinterface java/util/Iterator.hasNext:()Z
         * 30: ifeq          138
         * 33: aload_3
         * 34: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 39: checkcast     java/lang/String
         * 42: astore        4
         * 44: aload_0
         * 45: aload_0
         * 46: getfield      org/openide/util/MapFormat.argmap:Ljava/util/Map;
         * 49: aload         4
         * 51: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 56: invokespecial org/openide/util/MapFormat.formatObject:(Ljava/lang/Object;)Ljava/lang/String;
         * 59: astore        5
         * 61: iconst_m1
         * 62: istore        6
         * 64: aload_2
         * 65: invokevirtual java/lang/StringBuffer.toString:()Ljava/lang/String;
         * 68: aload         5
         * 70: iinc          6, 1
         * 73: iload         6
         * 75: invokevirtual java/lang/String.indexOf:(Ljava/lang/String;I)I
         * 78: istore        6
         * 80: iload         6
         * 82: iflt          129
         * 85: aload_2
         * 86: iload         6
         * 88: iload         6
         * 90: aload         5
         * 92: invokevirtual java/lang/String.length:()I
         * 95: iadd
         * 96: new           java/lang/StringBuilder
         * 99: dup
         * 100: invokespecial java/lang/StringBuilder."<init>":()V
         * 103: aload_0
         * 104: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 107: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 110: aload         4
         * 112: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 115: aload_0
         * 116: getfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 119: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 122: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 125: invokevirtual java/lang/StringBuffer.replace:(IILjava/lang/String;)Ljava/lang/StringBuffer;
         * 128: pop
         * 129: iload         6
         * 131: iconst_m1
         * 132: if_icmpne     64
         * 135: goto          24
         * 138: aload_2
         * 139: invokevirtual java/lang/StringBuffer.toString:()Ljava/lang/String;
         * 142: areturn
         *  */
        // </editor-fold>
    }

    public boolean willThrowExceptionIfKeyWasNotFound() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MapFormat.throwex:Z
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public void setThrowExceptionIfKeyWasNotFound(boolean flag) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: putfield      org/openide/util/MapFormat.throwex:Z
         * 5: return
         *  */
        // </editor-fold>
    }

    public boolean isExactMatch() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MapFormat.exactmatch:Z
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public void setExactMatch(boolean flag) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: putfield      org/openide/util/MapFormat.exactmatch:Z
         * 5: return
         *  */
        // </editor-fold>
    }

    public String getLeftBrace() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public void setLeftBrace(String delimiter) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      org/openide/util/MapFormat.ldel:Ljava/lang/String;
         * 5: return
         *  */
        // </editor-fold>
    }

    public String getRightBrace() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public void setRightBrace(String delimiter) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      org/openide/util/MapFormat.rdel:Ljava/lang/String;
         * 5: return
         *  */
        // </editor-fold>
    }

    public Map getMap() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MapFormat.argmap:Ljava/util/Map;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public void setMap(Map map) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: putfield      org/openide/util/MapFormat.argmap:Ljava/util/Map;
         * 5: return
         *  */
        // </editor-fold>
    }
}
