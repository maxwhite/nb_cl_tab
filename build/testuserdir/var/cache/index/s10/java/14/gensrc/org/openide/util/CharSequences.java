package org.openide.util;

import java.util.Comparator;

public final class CharSequences {

    private static final class ByteBasedSequence implements CompactCharSequence, Comparable<CharSequence> {

        private final byte[] value;
        private int hash;

        private ByteBasedSequence(byte[] b) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 9: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 4: arraylength
             * 5: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 4: iload_1
             * 5: baload
             * 6: sipush        255
             * 9: iand
             * 10: istore_2
             * 11: iload_2
             * 12: i2c
             * 13: ireturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$ByteBasedSequence
             * 11: ifeq          58
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$ByteBasedSequence
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$ByteBasedSequence.hash:I
             * 23: ifeq          46
             * 26: aload_2
             * 27: getfield      org/openide/util/CharSequences$ByteBasedSequence.hash:I
             * 30: ifeq          46
             * 33: aload_0
             * 34: getfield      org/openide/util/CharSequences$ByteBasedSequence.hash:I
             * 37: aload_2
             * 38: getfield      org/openide/util/CharSequences$ByteBasedSequence.hash:I
             * 41: if_icmpeq     46
             * 44: iconst_0
             * 45: ireturn
             * 46: aload_0
             * 47: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 50: aload_2
             * 51: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 54: invokestatic  java/util/Arrays.equals:([B[B)Z
             * 57: ireturn
             * 58: iconst_0
             * 59: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$ByteBasedSequence.hash:I
             * 4: istore_1
             * 5: iload_1
             * 6: ifne          45
             * 9: aload_0
             * 10: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 13: arraylength
             * 14: istore_2
             * 15: iconst_0
             * 16: istore_3
             * 17: iload_3
             * 18: iload_2
             * 19: if_icmpge     40
             * 22: bipush        31
             * 24: iload_1
             * 25: imul
             * 26: aload_0
             * 27: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 30: iload_3
             * 31: baload
             * 32: iadd
             * 33: istore_1
             * 34: iinc          3, 1
             * 37: goto          17
             * 40: aload_0
             * 41: iload_1
             * 42: putfield      org/openide/util/CharSequences$ByteBasedSequence.hash:I
             * 45: iload_1
             * 46: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int beginIndex, int endIndex) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 4: iload_1
             * 5: iload_2
             * 6: iload_1
             * 7: isub
             * 8: invokestatic  org/openide/util/CharSequences.access$1200:([BII)Ljava/lang/CharSequence;
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/util/CharSequences$ByteBasedSequence.toChars:()[C
             * 4: astore_1
             * 5: new           java/lang/String
             * 8: dup
             * 9: aload_1
             * 10: invokespecial java/lang/String."<init>":([C)V
             * 13: areturn
             *  */
            // </editor-fold>
        }

        private char[] toChars() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 4: arraylength
             * 5: istore_1
             * 6: iload_1
             * 7: newarray       char
             * 9: astore_2
             * 10: iconst_0
             * 11: istore_3
             * 12: iload_3
             * 13: iload_1
             * 14: if_icmpge     41
             * 17: aload_0
             * 18: getfield      org/openide/util/CharSequences$ByteBasedSequence.value:[B
             * 21: iload_3
             * 22: baload
             * 23: sipush        255
             * 26: iand
             * 27: istore        4
             * 29: aload_2
             * 30: iload_3
             * 31: iload         4
             * 33: i2c
             * 34: castore
             * 35: iinc          3, 1
             * 38: goto          12
             * 41: aload_2
             * 42: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.access$1300:(Lorg/openide/util/CharSequences$ByteBasedSequence;Ljava/lang/CharSequence;)I
             * 5: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class CharBasedSequence implements CompactCharSequence, Comparable<CharSequence> {

        private final char[] value;
        private int hash;

        private CharBasedSequence(char[] v) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 9: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 4: arraylength
             * 5: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 4: iload_1
             * 5: caload
             * 6: ireturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$CharBasedSequence
             * 11: ifeq          58
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$CharBasedSequence
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$CharBasedSequence.hash:I
             * 23: ifeq          46
             * 26: aload_2
             * 27: getfield      org/openide/util/CharSequences$CharBasedSequence.hash:I
             * 30: ifeq          46
             * 33: aload_0
             * 34: getfield      org/openide/util/CharSequences$CharBasedSequence.hash:I
             * 37: aload_2
             * 38: getfield      org/openide/util/CharSequences$CharBasedSequence.hash:I
             * 41: if_icmpeq     46
             * 44: iconst_0
             * 45: ireturn
             * 46: aload_0
             * 47: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 50: aload_2
             * 51: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 54: invokestatic  java/util/Arrays.equals:([C[C)Z
             * 57: ireturn
             * 58: iconst_0
             * 59: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$CharBasedSequence.hash:I
             * 4: istore_1
             * 5: iload_1
             * 6: ifne          45
             * 9: aload_0
             * 10: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 13: arraylength
             * 14: istore_2
             * 15: iconst_0
             * 16: istore_3
             * 17: iload_3
             * 18: iload_2
             * 19: if_icmpge     40
             * 22: bipush        31
             * 24: iload_1
             * 25: imul
             * 26: aload_0
             * 27: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 30: iload_3
             * 31: caload
             * 32: iadd
             * 33: istore_1
             * 34: iinc          3, 1
             * 37: goto          17
             * 40: aload_0
             * 41: iload_1
             * 42: putfield      org/openide/util/CharSequences$CharBasedSequence.hash:I
             * 45: iload_1
             * 46: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int beginIndex, int endIndex) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 4: iload_1
             * 5: iload_2
             * 6: iload_1
             * 7: isub
             * 8: invokestatic  org/openide/util/CharSequences.create:([CII)Ljava/lang/CharSequence;
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/lang/String
             * 3: dup
             * 4: aload_0
             * 5: getfield      org/openide/util/CharSequences$CharBasedSequence.value:[C
             * 8: invokespecial java/lang/String."<init>":([C)V
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.access$1100:(Lorg/openide/util/CharSequences$CharBasedSequence;Ljava/lang/CharSequence;)I
             * 5: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static class CharSequenceComparator implements Comparator<CharSequence> {

        private CharSequenceComparator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        public int compare(CharSequence o1, CharSequence o2) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    org/openide/util/CharSequences$ByteBasedSequence
             * 4: ifeq          16
             * 7: aload_1
             * 8: checkcast     org/openide/util/CharSequences$ByteBasedSequence
             * 11: aload_2
             * 12: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareByteBasedWithOther:(Lorg/openide/util/CharSequences$ByteBasedSequence;Ljava/lang/CharSequence;)I
             * 15: ireturn
             * 16: aload_2
             * 17: instanceof    org/openide/util/CharSequences$ByteBasedSequence
             * 20: ifeq          33
             * 23: aload_2
             * 24: checkcast     org/openide/util/CharSequences$ByteBasedSequence
             * 27: aload_1
             * 28: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareByteBasedWithOther:(Lorg/openide/util/CharSequences$ByteBasedSequence;Ljava/lang/CharSequence;)I
             * 31: ineg
             * 32: ireturn
             * 33: aload_1
             * 34: instanceof    org/openide/util/CharSequences$CharBasedSequence
             * 37: ifeq          49
             * 40: aload_1
             * 41: checkcast     org/openide/util/CharSequences$CharBasedSequence
             * 44: aload_2
             * 45: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareCharBasedWithOther:(Lorg/openide/util/CharSequences$CharBasedSequence;Ljava/lang/CharSequence;)I
             * 48: ireturn
             * 49: aload_2
             * 50: instanceof    org/openide/util/CharSequences$CharBasedSequence
             * 53: ifeq          66
             * 56: aload_2
             * 57: checkcast     org/openide/util/CharSequences$CharBasedSequence
             * 60: aload_1
             * 61: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareCharBasedWithOther:(Lorg/openide/util/CharSequences$CharBasedSequence;Ljava/lang/CharSequence;)I
             * 64: ineg
             * 65: ireturn
             * 66: aload_1
             * 67: invokeinterface java/lang/CharSequence.length:()I
             * 72: istore_3
             * 73: aload_2
             * 74: invokeinterface java/lang/CharSequence.length:()I
             * 79: istore        4
             * 81: iload_3
             * 82: iload         4
             * 84: invokestatic  java/lang/Math.min:(II)I
             * 87: istore        5
             * 89: iconst_0
             * 90: istore        6
             * 92: iload         6
             * 94: iload         5
             * 96: if_icmpge     138
             * 99: aload_1
             * 100: iload         6
             * 102: invokeinterface java/lang/CharSequence.charAt:(I)C
             * 107: istore        7
             * 109: aload_2
             * 110: iload         6
             * 112: invokeinterface java/lang/CharSequence.charAt:(I)C
             * 117: istore        8
             * 119: iload         7
             * 121: iload         8
             * 123: if_icmpeq     132
             * 126: iload         7
             * 128: iload         8
             * 130: isub
             * 131: ireturn
             * 132: iinc          6, 1
             * 135: goto          92
             * 138: iload_3
             * 139: iload         4
             * 141: isub
             * 142: ireturn
             *  */
            // </editor-fold>
        }

        private static int compareByteBased(ByteBasedSequence bbs1, ByteBasedSequence bbs2) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 4: arraylength
             * 5: istore_2
             * 6: aload_1
             * 7: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 10: arraylength
             * 11: istore_3
             * 12: iload_2
             * 13: iload_3
             * 14: invokestatic  java/lang/Math.min:(II)I
             * 17: istore        4
             * 19: iconst_0
             * 20: istore        5
             * 22: iload         5
             * 24: iload         4
             * 26: if_icmpge     76
             * 29: aload_0
             * 30: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 33: iload         5
             * 35: baload
             * 36: aload_1
             * 37: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 40: iload         5
             * 42: baload
             * 43: if_icmpeq     70
             * 46: aload_0
             * 47: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 50: iload         5
             * 52: baload
             * 53: sipush        255
             * 56: iand
             * 57: aload_1
             * 58: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 61: iload         5
             * 63: baload
             * 64: sipush        255
             * 67: iand
             * 68: isub
             * 69: ireturn
             * 70: iinc          5, 1
             * 73: goto          22
             * 76: iload_2
             * 77: iload_3
             * 78: isub
             * 79: ireturn
             *  */
            // </editor-fold>
        }

        private static int compareCharBased(CharBasedSequence cbs1, CharBasedSequence cbs2) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 4: arraylength
             * 5: istore_2
             * 6: aload_1
             * 7: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 10: arraylength
             * 11: istore_3
             * 12: iload_2
             * 13: iload_3
             * 14: invokestatic  java/lang/Math.min:(II)I
             * 17: istore        4
             * 19: iconst_0
             * 20: istore        5
             * 22: iload         5
             * 24: iload         4
             * 26: if_icmpge     68
             * 29: aload_0
             * 30: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 33: iload         5
             * 35: caload
             * 36: aload_1
             * 37: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 40: iload         5
             * 42: caload
             * 43: if_icmpeq     62
             * 46: aload_0
             * 47: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 50: iload         5
             * 52: caload
             * 53: aload_1
             * 54: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 57: iload         5
             * 59: caload
             * 60: isub
             * 61: ireturn
             * 62: iinc          5, 1
             * 65: goto          22
             * 68: iload_2
             * 69: iload_3
             * 70: isub
             * 71: ireturn
             *  */
            // </editor-fold>
        }

        private static int compareByteBasedWithCharBased(ByteBasedSequence bbs1, CharBasedSequence cbs2) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 4: arraylength
             * 5: istore_2
             * 6: aload_1
             * 7: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 10: arraylength
             * 11: istore_3
             * 12: iload_2
             * 13: iload_3
             * 14: invokestatic  java/lang/Math.min:(II)I
             * 17: istore        4
             * 19: iconst_0
             * 20: istore        5
             * 22: iload         5
             * 24: iload         4
             * 26: if_icmpge     70
             * 29: aload_0
             * 30: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 33: iload         5
             * 35: baload
             * 36: sipush        255
             * 39: iand
             * 40: istore        6
             * 42: aload_1
             * 43: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 46: iload         5
             * 48: caload
             * 49: istore        7
             * 51: iload         6
             * 53: iload         7
             * 55: if_icmpeq     64
             * 58: iload         6
             * 60: iload         7
             * 62: isub
             * 63: ireturn
             * 64: iinc          5, 1
             * 67: goto          22
             * 70: iload_2
             * 71: iload_3
             * 72: isub
             * 73: ireturn
             *  */
            // </editor-fold>
        }

        private static int compareByteBasedWithOther(ByteBasedSequence bbs1, CharSequence o2) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    org/openide/util/CharSequences$ByteBasedSequence
             * 4: ifeq          16
             * 7: aload_0
             * 8: aload_1
             * 9: checkcast     org/openide/util/CharSequences$ByteBasedSequence
             * 12: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareByteBased:(Lorg/openide/util/CharSequences$ByteBasedSequence;Lorg/openide/util/CharSequences$ByteBasedSequence;)I
             * 15: ireturn
             * 16: aload_1
             * 17: instanceof    org/openide/util/CharSequences$CharBasedSequence
             * 20: ifeq          32
             * 23: aload_0
             * 24: aload_1
             * 25: checkcast     org/openide/util/CharSequences$CharBasedSequence
             * 28: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareByteBasedWithCharBased:(Lorg/openide/util/CharSequences$ByteBasedSequence;Lorg/openide/util/CharSequences$CharBasedSequence;)I
             * 31: ireturn
             * 32: aload_0
             * 33: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 36: arraylength
             * 37: istore_2
             * 38: aload_1
             * 39: invokeinterface java/lang/CharSequence.length:()I
             * 44: istore_3
             * 45: iload_2
             * 46: iload_3
             * 47: invokestatic  java/lang/Math.min:(II)I
             * 50: istore        4
             * 52: iconst_0
             * 53: istore        5
             * 55: iload         5
             * 57: iload         4
             * 59: if_icmpge     104
             * 62: aload_0
             * 63: invokestatic  org/openide/util/CharSequences$ByteBasedSequence.access$1500:(Lorg/openide/util/CharSequences$ByteBasedSequence;)[B
             * 66: iload         5
             * 68: baload
             * 69: sipush        255
             * 72: iand
             * 73: istore        6
             * 75: aload_1
             * 76: iload         5
             * 78: invokeinterface java/lang/CharSequence.charAt:(I)C
             * 83: istore        7
             * 85: iload         6
             * 87: iload         7
             * 89: if_icmpeq     98
             * 92: iload         6
             * 94: iload         7
             * 96: isub
             * 97: ireturn
             * 98: iinc          5, 1
             * 101: goto          55
             * 104: iload_2
             * 105: iload_3
             * 106: isub
             * 107: ireturn
             *  */
            // </editor-fold>
        }

        private static int compareCharBasedWithOther(CharBasedSequence cbs1, CharSequence o2) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: instanceof    org/openide/util/CharSequences$CharBasedSequence
             * 4: ifeq          16
             * 7: aload_0
             * 8: aload_1
             * 9: checkcast     org/openide/util/CharSequences$CharBasedSequence
             * 12: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareCharBased:(Lorg/openide/util/CharSequences$CharBasedSequence;Lorg/openide/util/CharSequences$CharBasedSequence;)I
             * 15: ireturn
             * 16: aload_1
             * 17: instanceof    org/openide/util/CharSequences$ByteBasedSequence
             * 20: ifeq          33
             * 23: aload_1
             * 24: checkcast     org/openide/util/CharSequences$ByteBasedSequence
             * 27: aload_0
             * 28: invokestatic  org/openide/util/CharSequences$CharSequenceComparator.compareByteBasedWithCharBased:(Lorg/openide/util/CharSequences$ByteBasedSequence;Lorg/openide/util/CharSequences$CharBasedSequence;)I
             * 31: ineg
             * 32: ireturn
             * 33: aload_0
             * 34: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 37: arraylength
             * 38: istore_2
             * 39: aload_1
             * 40: invokeinterface java/lang/CharSequence.length:()I
             * 45: istore_3
             * 46: iload_2
             * 47: iload_3
             * 48: invokestatic  java/lang/Math.min:(II)I
             * 51: istore        4
             * 53: iconst_0
             * 54: istore        5
             * 56: iload         5
             * 58: iload         4
             * 60: if_icmpge     101
             * 63: aload_0
             * 64: invokestatic  org/openide/util/CharSequences$CharBasedSequence.access$1600:(Lorg/openide/util/CharSequences$CharBasedSequence;)[C
             * 67: iload         5
             * 69: caload
             * 70: istore        6
             * 72: aload_1
             * 73: iload         5
             * 75: invokeinterface java/lang/CharSequence.charAt:(I)C
             * 80: istore        7
             * 82: iload         6
             * 84: iload         7
             * 86: if_icmpeq     95
             * 89: iload         6
             * 91: iload         7
             * 93: isub
             * 94: ireturn
             * 95: iinc          5, 1
             * 98: goto          56
             * 101: iload_2
             * 102: iload_3
             * 103: isub
             * 104: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static interface CompactCharSequence extends CharSequence {
    }

    private static final class Fixed6Bit_11_20 implements CompactCharSequence, Comparable<CharSequence> {

        private final long i1;
        private final long i2;

        private Fixed6Bit_11_20(byte[] b, int n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: iload_2
             * 5: bipush        15
             * 7: iand
             * 8: i2l
             * 9: lstore_3
             * 10: iload_2
             * 11: iconst_4
             * 12: ishr
             * 13: bipush        15
             * 15: iand
             * 16: i2l
             * 17: lstore        5
             * 19: iload_2
             * 20: tableswitch   { // 0 to 20
             * 0: 395
             * 1: 381
             * 2: 369
             * 3: 357
             * 4: 345
             * 5: 333
             * 6: 321
             * 7: 308
             * 8: 295
             * 9: 282
             * 10: 269
             * 11: 255
             * 12: 240
             * 13: 225
             * 14: 210
             * 15: 195
             * 16: 180
             * 17: 165
             * 18: 150
             * 19: 135
             * 20: 120
             * default: 395
             * }
             * 120: lload         5
             * 122: aload_1
             * 123: bipush        19
             * 125: baload
             * 126: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 129: bipush        58
             * 131: lshl
             * 132: lor
             * 133: lstore        5
             * 135: lload         5
             * 137: aload_1
             * 138: bipush        18
             * 140: baload
             * 141: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 144: bipush        52
             * 146: lshl
             * 147: lor
             * 148: lstore        5
             * 150: lload         5
             * 152: aload_1
             * 153: bipush        17
             * 155: baload
             * 156: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 159: bipush        46
             * 161: lshl
             * 162: lor
             * 163: lstore        5
             * 165: lload         5
             * 167: aload_1
             * 168: bipush        16
             * 170: baload
             * 171: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 174: bipush        40
             * 176: lshl
             * 177: lor
             * 178: lstore        5
             * 180: lload         5
             * 182: aload_1
             * 183: bipush        15
             * 185: baload
             * 186: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 189: bipush        34
             * 191: lshl
             * 192: lor
             * 193: lstore        5
             * 195: lload         5
             * 197: aload_1
             * 198: bipush        14
             * 200: baload
             * 201: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 204: bipush        28
             * 206: lshl
             * 207: lor
             * 208: lstore        5
             * 210: lload         5
             * 212: aload_1
             * 213: bipush        13
             * 215: baload
             * 216: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 219: bipush        22
             * 221: lshl
             * 222: lor
             * 223: lstore        5
             * 225: lload         5
             * 227: aload_1
             * 228: bipush        12
             * 230: baload
             * 231: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 234: bipush        16
             * 236: lshl
             * 237: lor
             * 238: lstore        5
             * 240: lload         5
             * 242: aload_1
             * 243: bipush        11
             * 245: baload
             * 246: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 249: bipush        10
             * 251: lshl
             * 252: lor
             * 253: lstore        5
             * 255: lload         5
             * 257: aload_1
             * 258: bipush        10
             * 260: baload
             * 261: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 264: iconst_4
             * 265: lshl
             * 266: lor
             * 267: lstore        5
             * 269: lload_3
             * 270: aload_1
             * 271: bipush        9
             * 273: baload
             * 274: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 277: bipush        58
             * 279: lshl
             * 280: lor
             * 281: lstore_3
             * 282: lload_3
             * 283: aload_1
             * 284: bipush        8
             * 286: baload
             * 287: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 290: bipush        52
             * 292: lshl
             * 293: lor
             * 294: lstore_3
             * 295: lload_3
             * 296: aload_1
             * 297: bipush        7
             * 299: baload
             * 300: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 303: bipush        46
             * 305: lshl
             * 306: lor
             * 307: lstore_3
             * 308: lload_3
             * 309: aload_1
             * 310: bipush        6
             * 312: baload
             * 313: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 316: bipush        40
             * 318: lshl
             * 319: lor
             * 320: lstore_3
             * 321: lload_3
             * 322: aload_1
             * 323: iconst_5
             * 324: baload
             * 325: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 328: bipush        34
             * 330: lshl
             * 331: lor
             * 332: lstore_3
             * 333: lload_3
             * 334: aload_1
             * 335: iconst_4
             * 336: baload
             * 337: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 340: bipush        28
             * 342: lshl
             * 343: lor
             * 344: lstore_3
             * 345: lload_3
             * 346: aload_1
             * 347: iconst_3
             * 348: baload
             * 349: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 352: bipush        22
             * 354: lshl
             * 355: lor
             * 356: lstore_3
             * 357: lload_3
             * 358: aload_1
             * 359: iconst_2
             * 360: baload
             * 361: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 364: bipush        16
             * 366: lshl
             * 367: lor
             * 368: lstore_3
             * 369: lload_3
             * 370: aload_1
             * 371: iconst_1
             * 372: baload
             * 373: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 376: bipush        10
             * 378: lshl
             * 379: lor
             * 380: lstore_3
             * 381: lload_3
             * 382: aload_1
             * 383: iconst_0
             * 384: baload
             * 385: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 388: iconst_4
             * 389: lshl
             * 390: lor
             * 391: lstore_3
             * 392: goto          403
             * 395: new           java/lang/IllegalArgumentException
             * 398: dup
             * 399: invokespecial java/lang/IllegalArgumentException."<init>":()V
             * 402: athrow
             * 403: aload_0
             * 404: lload_3
             * 405: putfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 408: aload_0
             * 409: lload         5
             * 411: putfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 414: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 4: ldc2_w        15l
             * 7: land
             * 8: aload_0
             * 9: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 12: ldc2_w        15l
             * 15: land
             * 16: iconst_4
             * 17: lshl
             * 18: ladd
             * 19: l2i
             * 20: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iload_1
             * 3: tableswitch   { // 0 to 19
             * 0: 96
             * 1: 111
             * 2: 127
             * 3: 143
             * 4: 159
             * 5: 175
             * 6: 191
             * 7: 207
             * 8: 223
             * 9: 239
             * 10: 255
             * 11: 270
             * 12: 286
             * 13: 302
             * 14: 318
             * 15: 334
             * 16: 350
             * 17: 366
             * 18: 382
             * 19: 398
             * default: 411
             * }
             * 96: aload_0
             * 97: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 100: iconst_4
             * 101: lshr
             * 102: ldc2_w        63l
             * 105: land
             * 106: l2i
             * 107: istore_2
             * 108: goto          411
             * 111: aload_0
             * 112: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 115: bipush        10
             * 117: lshr
             * 118: ldc2_w        63l
             * 121: land
             * 122: l2i
             * 123: istore_2
             * 124: goto          411
             * 127: aload_0
             * 128: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 131: bipush        16
             * 133: lshr
             * 134: ldc2_w        63l
             * 137: land
             * 138: l2i
             * 139: istore_2
             * 140: goto          411
             * 143: aload_0
             * 144: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 147: bipush        22
             * 149: lshr
             * 150: ldc2_w        63l
             * 153: land
             * 154: l2i
             * 155: istore_2
             * 156: goto          411
             * 159: aload_0
             * 160: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 163: bipush        28
             * 165: lshr
             * 166: ldc2_w        63l
             * 169: land
             * 170: l2i
             * 171: istore_2
             * 172: goto          411
             * 175: aload_0
             * 176: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 179: bipush        34
             * 181: lshr
             * 182: ldc2_w        63l
             * 185: land
             * 186: l2i
             * 187: istore_2
             * 188: goto          411
             * 191: aload_0
             * 192: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 195: bipush        40
             * 197: lshr
             * 198: ldc2_w        63l
             * 201: land
             * 202: l2i
             * 203: istore_2
             * 204: goto          411
             * 207: aload_0
             * 208: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 211: bipush        46
             * 213: lshr
             * 214: ldc2_w        63l
             * 217: land
             * 218: l2i
             * 219: istore_2
             * 220: goto          411
             * 223: aload_0
             * 224: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 227: bipush        52
             * 229: lshr
             * 230: ldc2_w        63l
             * 233: land
             * 234: l2i
             * 235: istore_2
             * 236: goto          411
             * 239: aload_0
             * 240: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 243: bipush        58
             * 245: lshr
             * 246: ldc2_w        63l
             * 249: land
             * 250: l2i
             * 251: istore_2
             * 252: goto          411
             * 255: aload_0
             * 256: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 259: iconst_4
             * 260: lshr
             * 261: ldc2_w        63l
             * 264: land
             * 265: l2i
             * 266: istore_2
             * 267: goto          411
             * 270: aload_0
             * 271: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 274: bipush        10
             * 276: lshr
             * 277: ldc2_w        63l
             * 280: land
             * 281: l2i
             * 282: istore_2
             * 283: goto          411
             * 286: aload_0
             * 287: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 290: bipush        16
             * 292: lshr
             * 293: ldc2_w        63l
             * 296: land
             * 297: l2i
             * 298: istore_2
             * 299: goto          411
             * 302: aload_0
             * 303: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 306: bipush        22
             * 308: lshr
             * 309: ldc2_w        63l
             * 312: land
             * 313: l2i
             * 314: istore_2
             * 315: goto          411
             * 318: aload_0
             * 319: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 322: bipush        28
             * 324: lshr
             * 325: ldc2_w        63l
             * 328: land
             * 329: l2i
             * 330: istore_2
             * 331: goto          411
             * 334: aload_0
             * 335: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 338: bipush        34
             * 340: lshr
             * 341: ldc2_w        63l
             * 344: land
             * 345: l2i
             * 346: istore_2
             * 347: goto          411
             * 350: aload_0
             * 351: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 354: bipush        40
             * 356: lshr
             * 357: ldc2_w        63l
             * 360: land
             * 361: l2i
             * 362: istore_2
             * 363: goto          411
             * 366: aload_0
             * 367: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 370: bipush        46
             * 372: lshr
             * 373: ldc2_w        63l
             * 376: land
             * 377: l2i
             * 378: istore_2
             * 379: goto          411
             * 382: aload_0
             * 383: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 386: bipush        52
             * 388: lshr
             * 389: ldc2_w        63l
             * 392: land
             * 393: l2i
             * 394: istore_2
             * 395: goto          411
             * 398: aload_0
             * 399: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 402: bipush        58
             * 404: lshr
             * 405: ldc2_w        63l
             * 408: land
             * 409: l2i
             * 410: istore_2
             * 411: iload_2
             * 412: invokestatic  org/openide/util/CharSequences.access$1000:(I)C
             * 415: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed6Bit_11_20.length:()I
             * 4: istore_1
             * 5: iload_1
             * 6: newarray       char
             * 8: astore_2
             * 9: iconst_0
             * 10: istore_3
             * 11: iload_3
             * 12: iload_1
             * 13: if_icmpge     30
             * 16: aload_2
             * 17: iload_3
             * 18: aload_0
             * 19: iload_3
             * 20: invokevirtual org/openide/util/CharSequences$Fixed6Bit_11_20.charAt:(I)C
             * 23: castore
             * 24: iinc          3, 1
             * 27: goto          11
             * 30: new           java/lang/String
             * 33: dup
             * 34: aload_2
             * 35: invokespecial java/lang/String."<init>":([C)V
             * 38: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$Fixed6Bit_11_20
             * 11: ifeq          49
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$Fixed6Bit_11_20
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 23: aload_2
             * 24: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 27: lcmp
             * 28: ifne          47
             * 31: aload_0
             * 32: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 35: aload_2
             * 36: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 39: lcmp
             * 40: ifne          47
             * 43: iconst_1
             * 44: goto          48
             * 47: iconst_0
             * 48: ireturn
             * 49: iconst_0
             * 50: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i1:J
             * 4: ldc2_w        31l
             * 7: aload_0
             * 8: getfield      org/openide/util/CharSequences$Fixed6Bit_11_20.i2:J
             * 11: lmul
             * 12: ladd
             * 13: lstore_1
             * 14: lload_1
             * 15: lload_1
             * 16: bipush        32
             * 18: lshr
             * 19: ladd
             * 20: ldc2_w        4294967295l
             * 23: land
             * 24: lstore_1
             * 25: lload_1
             * 26: l2i
             * 27: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int start, int end) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed6Bit_11_20.toString:()Ljava/lang/String;
             * 4: iload_1
             * 5: iload_2
             * 6: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 9: invokestatic  org/openide/util/CharSequences.create:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
             * 12: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/util/CharSequences.access$800:()Lorg/openide/util/CharSequences$CharSequenceComparator;
             * 3: aload_0
             * 4: aload_1
             * 5: invokevirtual org/openide/util/CharSequences$CharSequenceComparator.compare:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
             * 8: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class Fixed6Bit_1_10 implements CompactCharSequence, Comparable<CharSequence> {

        private final long i;

        private Fixed6Bit_1_10(byte[] b, int n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: iload_2
             * 5: i2l
             * 6: lstore_3
             * 7: iload_2
             * 8: tableswitch   { // 0 to 10
             * 0: 194
             * 1: 180
             * 2: 168
             * 3: 156
             * 4: 144
             * 5: 132
             * 6: 120
             * 7: 107
             * 8: 94
             * 9: 81
             * 10: 68
             * default: 194
             * }
             * 68: lload_3
             * 69: aload_1
             * 70: bipush        9
             * 72: baload
             * 73: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 76: bipush        58
             * 78: lshl
             * 79: lor
             * 80: lstore_3
             * 81: lload_3
             * 82: aload_1
             * 83: bipush        8
             * 85: baload
             * 86: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 89: bipush        52
             * 91: lshl
             * 92: lor
             * 93: lstore_3
             * 94: lload_3
             * 95: aload_1
             * 96: bipush        7
             * 98: baload
             * 99: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 102: bipush        46
             * 104: lshl
             * 105: lor
             * 106: lstore_3
             * 107: lload_3
             * 108: aload_1
             * 109: bipush        6
             * 111: baload
             * 112: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 115: bipush        40
             * 117: lshl
             * 118: lor
             * 119: lstore_3
             * 120: lload_3
             * 121: aload_1
             * 122: iconst_5
             * 123: baload
             * 124: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 127: bipush        34
             * 129: lshl
             * 130: lor
             * 131: lstore_3
             * 132: lload_3
             * 133: aload_1
             * 134: iconst_4
             * 135: baload
             * 136: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 139: bipush        28
             * 141: lshl
             * 142: lor
             * 143: lstore_3
             * 144: lload_3
             * 145: aload_1
             * 146: iconst_3
             * 147: baload
             * 148: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 151: bipush        22
             * 153: lshl
             * 154: lor
             * 155: lstore_3
             * 156: lload_3
             * 157: aload_1
             * 158: iconst_2
             * 159: baload
             * 160: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 163: bipush        16
             * 165: lshl
             * 166: lor
             * 167: lstore_3
             * 168: lload_3
             * 169: aload_1
             * 170: iconst_1
             * 171: baload
             * 172: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 175: bipush        10
             * 177: lshl
             * 178: lor
             * 179: lstore_3
             * 180: lload_3
             * 181: aload_1
             * 182: iconst_0
             * 183: baload
             * 184: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 187: iconst_4
             * 188: lshl
             * 189: lor
             * 190: lstore_3
             * 191: goto          202
             * 194: new           java/lang/IllegalArgumentException
             * 197: dup
             * 198: invokespecial java/lang/IllegalArgumentException."<init>":()V
             * 201: athrow
             * 202: aload_0
             * 203: lload_3
             * 204: putfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 207: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 4: ldc2_w        15l
             * 7: land
             * 8: l2i
             * 9: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iload_1
             * 3: tableswitch   { // 0 to 9
             * 0: 56
             * 1: 71
             * 2: 87
             * 3: 103
             * 4: 119
             * 5: 135
             * 6: 151
             * 7: 167
             * 8: 183
             * 9: 199
             * default: 212
             * }
             * 56: aload_0
             * 57: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 60: iconst_4
             * 61: lshr
             * 62: ldc2_w        63l
             * 65: land
             * 66: l2i
             * 67: istore_2
             * 68: goto          212
             * 71: aload_0
             * 72: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 75: bipush        10
             * 77: lshr
             * 78: ldc2_w        63l
             * 81: land
             * 82: l2i
             * 83: istore_2
             * 84: goto          212
             * 87: aload_0
             * 88: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 91: bipush        16
             * 93: lshr
             * 94: ldc2_w        63l
             * 97: land
             * 98: l2i
             * 99: istore_2
             * 100: goto          212
             * 103: aload_0
             * 104: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 107: bipush        22
             * 109: lshr
             * 110: ldc2_w        63l
             * 113: land
             * 114: l2i
             * 115: istore_2
             * 116: goto          212
             * 119: aload_0
             * 120: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 123: bipush        28
             * 125: lshr
             * 126: ldc2_w        63l
             * 129: land
             * 130: l2i
             * 131: istore_2
             * 132: goto          212
             * 135: aload_0
             * 136: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 139: bipush        34
             * 141: lshr
             * 142: ldc2_w        63l
             * 145: land
             * 146: l2i
             * 147: istore_2
             * 148: goto          212
             * 151: aload_0
             * 152: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 155: bipush        40
             * 157: lshr
             * 158: ldc2_w        63l
             * 161: land
             * 162: l2i
             * 163: istore_2
             * 164: goto          212
             * 167: aload_0
             * 168: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 171: bipush        46
             * 173: lshr
             * 174: ldc2_w        63l
             * 177: land
             * 178: l2i
             * 179: istore_2
             * 180: goto          212
             * 183: aload_0
             * 184: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 187: bipush        52
             * 189: lshr
             * 190: ldc2_w        63l
             * 193: land
             * 194: l2i
             * 195: istore_2
             * 196: goto          212
             * 199: aload_0
             * 200: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 203: bipush        58
             * 205: lshr
             * 206: ldc2_w        63l
             * 209: land
             * 210: l2i
             * 211: istore_2
             * 212: iload_2
             * 213: invokestatic  org/openide/util/CharSequences.access$1000:(I)C
             * 216: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed6Bit_1_10.length:()I
             * 4: istore_1
             * 5: iload_1
             * 6: newarray       char
             * 8: astore_2
             * 9: iconst_0
             * 10: istore_3
             * 11: iload_3
             * 12: iload_1
             * 13: if_icmpge     30
             * 16: aload_2
             * 17: iload_3
             * 18: aload_0
             * 19: iload_3
             * 20: invokevirtual org/openide/util/CharSequences$Fixed6Bit_1_10.charAt:(I)C
             * 23: castore
             * 24: iinc          3, 1
             * 27: goto          11
             * 30: new           java/lang/String
             * 33: dup
             * 34: aload_2
             * 35: invokespecial java/lang/String."<init>":([C)V
             * 38: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$Fixed6Bit_1_10
             * 11: ifeq          37
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$Fixed6Bit_1_10
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 23: aload_2
             * 24: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 27: lcmp
             * 28: ifne          35
             * 31: iconst_1
             * 32: goto          36
             * 35: iconst_0
             * 36: ireturn
             * 37: iconst_0
             * 38: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 4: aload_0
             * 5: getfield      org/openide/util/CharSequences$Fixed6Bit_1_10.i:J
             * 8: bipush        32
             * 10: lshr
             * 11: ladd
             * 12: ldc2_w        4294967295l
             * 15: land
             * 16: l2i
             * 17: istore_1
             * 18: iload_1
             * 19: iload_1
             * 20: bipush        15
             * 22: ishl
             * 23: sipush        -12931
             * 26: ixor
             * 27: iadd
             * 28: istore_1
             * 29: iload_1
             * 30: iload_1
             * 31: bipush        10
             * 33: iushr
             * 34: ixor
             * 35: istore_1
             * 36: iload_1
             * 37: iload_1
             * 38: iconst_3
             * 39: ishl
             * 40: iadd
             * 41: istore_1
             * 42: iload_1
             * 43: iload_1
             * 44: bipush        6
             * 46: iushr
             * 47: ixor
             * 48: istore_1
             * 49: iload_1
             * 50: iload_1
             * 51: iconst_2
             * 52: ishl
             * 53: iload_1
             * 54: bipush        14
             * 56: ishl
             * 57: iadd
             * 58: iadd
             * 59: istore_1
             * 60: iload_1
             * 61: iload_1
             * 62: bipush        16
             * 64: iushr
             * 65: ixor
             * 66: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int start, int end) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed6Bit_1_10.toString:()Ljava/lang/String;
             * 4: iload_1
             * 5: iload_2
             * 6: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 9: invokestatic  org/openide/util/CharSequences.create:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
             * 12: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/util/CharSequences.access$800:()Lorg/openide/util/CharSequences$CharSequenceComparator;
             * 3: aload_0
             * 4: aload_1
             * 5: invokevirtual org/openide/util/CharSequences$CharSequenceComparator.compare:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
             * 8: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class Fixed6Bit_21_30 implements CompactCharSequence, Comparable<CharSequence> {

        private final long i1;
        private final long i2;
        private final long i3;

        private Fixed6Bit_21_30(byte[] b, int n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: iload_2
             * 5: bipush        15
             * 7: iand
             * 8: i2l
             * 9: lstore_3
             * 10: iload_2
             * 11: iconst_4
             * 12: ishr
             * 13: bipush        15
             * 15: iand
             * 16: i2l
             * 17: lstore        5
             * 19: lconst_0
             * 20: lstore        7
             * 22: iload_2
             * 23: tableswitch   { // 0 to 30
             * 0: 584
             * 1: 570
             * 2: 558
             * 3: 546
             * 4: 534
             * 5: 522
             * 6: 510
             * 7: 497
             * 8: 484
             * 9: 471
             * 10: 458
             * 11: 444
             * 12: 429
             * 13: 414
             * 14: 399
             * 15: 384
             * 16: 369
             * 17: 354
             * 18: 339
             * 19: 324
             * 20: 309
             * 21: 295
             * 22: 280
             * 23: 265
             * 24: 250
             * 25: 235
             * 26: 220
             * 27: 205
             * 28: 190
             * 29: 175
             * 30: 160
             * default: 584
             * }
             * 160: lload         7
             * 162: aload_1
             * 163: bipush        29
             * 165: baload
             * 166: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 169: bipush        58
             * 171: lshl
             * 172: lor
             * 173: lstore        7
             * 175: lload         7
             * 177: aload_1
             * 178: bipush        28
             * 180: baload
             * 181: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 184: bipush        52
             * 186: lshl
             * 187: lor
             * 188: lstore        7
             * 190: lload         7
             * 192: aload_1
             * 193: bipush        27
             * 195: baload
             * 196: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 199: bipush        46
             * 201: lshl
             * 202: lor
             * 203: lstore        7
             * 205: lload         7
             * 207: aload_1
             * 208: bipush        26
             * 210: baload
             * 211: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 214: bipush        40
             * 216: lshl
             * 217: lor
             * 218: lstore        7
             * 220: lload         7
             * 222: aload_1
             * 223: bipush        25
             * 225: baload
             * 226: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 229: bipush        34
             * 231: lshl
             * 232: lor
             * 233: lstore        7
             * 235: lload         7
             * 237: aload_1
             * 238: bipush        24
             * 240: baload
             * 241: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 244: bipush        28
             * 246: lshl
             * 247: lor
             * 248: lstore        7
             * 250: lload         7
             * 252: aload_1
             * 253: bipush        23
             * 255: baload
             * 256: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 259: bipush        22
             * 261: lshl
             * 262: lor
             * 263: lstore        7
             * 265: lload         7
             * 267: aload_1
             * 268: bipush        22
             * 270: baload
             * 271: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 274: bipush        16
             * 276: lshl
             * 277: lor
             * 278: lstore        7
             * 280: lload         7
             * 282: aload_1
             * 283: bipush        21
             * 285: baload
             * 286: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 289: bipush        10
             * 291: lshl
             * 292: lor
             * 293: lstore        7
             * 295: lload         7
             * 297: aload_1
             * 298: bipush        20
             * 300: baload
             * 301: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 304: iconst_4
             * 305: lshl
             * 306: lor
             * 307: lstore        7
             * 309: lload         5
             * 311: aload_1
             * 312: bipush        19
             * 314: baload
             * 315: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 318: bipush        58
             * 320: lshl
             * 321: lor
             * 322: lstore        5
             * 324: lload         5
             * 326: aload_1
             * 327: bipush        18
             * 329: baload
             * 330: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 333: bipush        52
             * 335: lshl
             * 336: lor
             * 337: lstore        5
             * 339: lload         5
             * 341: aload_1
             * 342: bipush        17
             * 344: baload
             * 345: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 348: bipush        46
             * 350: lshl
             * 351: lor
             * 352: lstore        5
             * 354: lload         5
             * 356: aload_1
             * 357: bipush        16
             * 359: baload
             * 360: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 363: bipush        40
             * 365: lshl
             * 366: lor
             * 367: lstore        5
             * 369: lload         5
             * 371: aload_1
             * 372: bipush        15
             * 374: baload
             * 375: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 378: bipush        34
             * 380: lshl
             * 381: lor
             * 382: lstore        5
             * 384: lload         5
             * 386: aload_1
             * 387: bipush        14
             * 389: baload
             * 390: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 393: bipush        28
             * 395: lshl
             * 396: lor
             * 397: lstore        5
             * 399: lload         5
             * 401: aload_1
             * 402: bipush        13
             * 404: baload
             * 405: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 408: bipush        22
             * 410: lshl
             * 411: lor
             * 412: lstore        5
             * 414: lload         5
             * 416: aload_1
             * 417: bipush        12
             * 419: baload
             * 420: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 423: bipush        16
             * 425: lshl
             * 426: lor
             * 427: lstore        5
             * 429: lload         5
             * 431: aload_1
             * 432: bipush        11
             * 434: baload
             * 435: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 438: bipush        10
             * 440: lshl
             * 441: lor
             * 442: lstore        5
             * 444: lload         5
             * 446: aload_1
             * 447: bipush        10
             * 449: baload
             * 450: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 453: iconst_4
             * 454: lshl
             * 455: lor
             * 456: lstore        5
             * 458: lload_3
             * 459: aload_1
             * 460: bipush        9
             * 462: baload
             * 463: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 466: bipush        58
             * 468: lshl
             * 469: lor
             * 470: lstore_3
             * 471: lload_3
             * 472: aload_1
             * 473: bipush        8
             * 475: baload
             * 476: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 479: bipush        52
             * 481: lshl
             * 482: lor
             * 483: lstore_3
             * 484: lload_3
             * 485: aload_1
             * 486: bipush        7
             * 488: baload
             * 489: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 492: bipush        46
             * 494: lshl
             * 495: lor
             * 496: lstore_3
             * 497: lload_3
             * 498: aload_1
             * 499: bipush        6
             * 501: baload
             * 502: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 505: bipush        40
             * 507: lshl
             * 508: lor
             * 509: lstore_3
             * 510: lload_3
             * 511: aload_1
             * 512: iconst_5
             * 513: baload
             * 514: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 517: bipush        34
             * 519: lshl
             * 520: lor
             * 521: lstore_3
             * 522: lload_3
             * 523: aload_1
             * 524: iconst_4
             * 525: baload
             * 526: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 529: bipush        28
             * 531: lshl
             * 532: lor
             * 533: lstore_3
             * 534: lload_3
             * 535: aload_1
             * 536: iconst_3
             * 537: baload
             * 538: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 541: bipush        22
             * 543: lshl
             * 544: lor
             * 545: lstore_3
             * 546: lload_3
             * 547: aload_1
             * 548: iconst_2
             * 549: baload
             * 550: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 553: bipush        16
             * 555: lshl
             * 556: lor
             * 557: lstore_3
             * 558: lload_3
             * 559: aload_1
             * 560: iconst_1
             * 561: baload
             * 562: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 565: bipush        10
             * 567: lshl
             * 568: lor
             * 569: lstore_3
             * 570: lload_3
             * 571: aload_1
             * 572: iconst_0
             * 573: baload
             * 574: invokestatic  org/openide/util/CharSequences.access$900:(I)J
             * 577: iconst_4
             * 578: lshl
             * 579: lor
             * 580: lstore_3
             * 581: goto          592
             * 584: new           java/lang/IllegalArgumentException
             * 587: dup
             * 588: invokespecial java/lang/IllegalArgumentException."<init>":()V
             * 591: athrow
             * 592: aload_0
             * 593: lload_3
             * 594: putfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 597: aload_0
             * 598: lload         5
             * 600: putfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 603: aload_0
             * 604: lload         7
             * 606: putfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 609: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 4: ldc2_w        15l
             * 7: land
             * 8: aload_0
             * 9: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 12: ldc2_w        15l
             * 15: land
             * 16: iconst_4
             * 17: lshl
             * 18: ladd
             * 19: l2i
             * 20: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iload_1
             * 3: tableswitch   { // 0 to 29
             * 0: 136
             * 1: 151
             * 2: 167
             * 3: 183
             * 4: 199
             * 5: 215
             * 6: 231
             * 7: 247
             * 8: 263
             * 9: 279
             * 10: 295
             * 11: 310
             * 12: 326
             * 13: 342
             * 14: 358
             * 15: 374
             * 16: 390
             * 17: 406
             * 18: 422
             * 19: 438
             * 20: 454
             * 21: 469
             * 22: 485
             * 23: 501
             * 24: 517
             * 25: 533
             * 26: 549
             * 27: 565
             * 28: 581
             * 29: 597
             * default: 610
             * }
             * 136: aload_0
             * 137: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 140: iconst_4
             * 141: lshr
             * 142: ldc2_w        63l
             * 145: land
             * 146: l2i
             * 147: istore_2
             * 148: goto          610
             * 151: aload_0
             * 152: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 155: bipush        10
             * 157: lshr
             * 158: ldc2_w        63l
             * 161: land
             * 162: l2i
             * 163: istore_2
             * 164: goto          610
             * 167: aload_0
             * 168: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 171: bipush        16
             * 173: lshr
             * 174: ldc2_w        63l
             * 177: land
             * 178: l2i
             * 179: istore_2
             * 180: goto          610
             * 183: aload_0
             * 184: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 187: bipush        22
             * 189: lshr
             * 190: ldc2_w        63l
             * 193: land
             * 194: l2i
             * 195: istore_2
             * 196: goto          610
             * 199: aload_0
             * 200: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 203: bipush        28
             * 205: lshr
             * 206: ldc2_w        63l
             * 209: land
             * 210: l2i
             * 211: istore_2
             * 212: goto          610
             * 215: aload_0
             * 216: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 219: bipush        34
             * 221: lshr
             * 222: ldc2_w        63l
             * 225: land
             * 226: l2i
             * 227: istore_2
             * 228: goto          610
             * 231: aload_0
             * 232: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 235: bipush        40
             * 237: lshr
             * 238: ldc2_w        63l
             * 241: land
             * 242: l2i
             * 243: istore_2
             * 244: goto          610
             * 247: aload_0
             * 248: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 251: bipush        46
             * 253: lshr
             * 254: ldc2_w        63l
             * 257: land
             * 258: l2i
             * 259: istore_2
             * 260: goto          610
             * 263: aload_0
             * 264: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 267: bipush        52
             * 269: lshr
             * 270: ldc2_w        63l
             * 273: land
             * 274: l2i
             * 275: istore_2
             * 276: goto          610
             * 279: aload_0
             * 280: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 283: bipush        58
             * 285: lshr
             * 286: ldc2_w        63l
             * 289: land
             * 290: l2i
             * 291: istore_2
             * 292: goto          610
             * 295: aload_0
             * 296: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 299: iconst_4
             * 300: lshr
             * 301: ldc2_w        63l
             * 304: land
             * 305: l2i
             * 306: istore_2
             * 307: goto          610
             * 310: aload_0
             * 311: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 314: bipush        10
             * 316: lshr
             * 317: ldc2_w        63l
             * 320: land
             * 321: l2i
             * 322: istore_2
             * 323: goto          610
             * 326: aload_0
             * 327: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 330: bipush        16
             * 332: lshr
             * 333: ldc2_w        63l
             * 336: land
             * 337: l2i
             * 338: istore_2
             * 339: goto          610
             * 342: aload_0
             * 343: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 346: bipush        22
             * 348: lshr
             * 349: ldc2_w        63l
             * 352: land
             * 353: l2i
             * 354: istore_2
             * 355: goto          610
             * 358: aload_0
             * 359: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 362: bipush        28
             * 364: lshr
             * 365: ldc2_w        63l
             * 368: land
             * 369: l2i
             * 370: istore_2
             * 371: goto          610
             * 374: aload_0
             * 375: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 378: bipush        34
             * 380: lshr
             * 381: ldc2_w        63l
             * 384: land
             * 385: l2i
             * 386: istore_2
             * 387: goto          610
             * 390: aload_0
             * 391: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 394: bipush        40
             * 396: lshr
             * 397: ldc2_w        63l
             * 400: land
             * 401: l2i
             * 402: istore_2
             * 403: goto          610
             * 406: aload_0
             * 407: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 410: bipush        46
             * 412: lshr
             * 413: ldc2_w        63l
             * 416: land
             * 417: l2i
             * 418: istore_2
             * 419: goto          610
             * 422: aload_0
             * 423: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 426: bipush        52
             * 428: lshr
             * 429: ldc2_w        63l
             * 432: land
             * 433: l2i
             * 434: istore_2
             * 435: goto          610
             * 438: aload_0
             * 439: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 442: bipush        58
             * 444: lshr
             * 445: ldc2_w        63l
             * 448: land
             * 449: l2i
             * 450: istore_2
             * 451: goto          610
             * 454: aload_0
             * 455: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 458: iconst_4
             * 459: lshr
             * 460: ldc2_w        63l
             * 463: land
             * 464: l2i
             * 465: istore_2
             * 466: goto          610
             * 469: aload_0
             * 470: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 473: bipush        10
             * 475: lshr
             * 476: ldc2_w        63l
             * 479: land
             * 480: l2i
             * 481: istore_2
             * 482: goto          610
             * 485: aload_0
             * 486: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 489: bipush        16
             * 491: lshr
             * 492: ldc2_w        63l
             * 495: land
             * 496: l2i
             * 497: istore_2
             * 498: goto          610
             * 501: aload_0
             * 502: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 505: bipush        22
             * 507: lshr
             * 508: ldc2_w        63l
             * 511: land
             * 512: l2i
             * 513: istore_2
             * 514: goto          610
             * 517: aload_0
             * 518: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 521: bipush        28
             * 523: lshr
             * 524: ldc2_w        63l
             * 527: land
             * 528: l2i
             * 529: istore_2
             * 530: goto          610
             * 533: aload_0
             * 534: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 537: bipush        34
             * 539: lshr
             * 540: ldc2_w        63l
             * 543: land
             * 544: l2i
             * 545: istore_2
             * 546: goto          610
             * 549: aload_0
             * 550: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 553: bipush        40
             * 555: lshr
             * 556: ldc2_w        63l
             * 559: land
             * 560: l2i
             * 561: istore_2
             * 562: goto          610
             * 565: aload_0
             * 566: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 569: bipush        46
             * 571: lshr
             * 572: ldc2_w        63l
             * 575: land
             * 576: l2i
             * 577: istore_2
             * 578: goto          610
             * 581: aload_0
             * 582: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 585: bipush        52
             * 587: lshr
             * 588: ldc2_w        63l
             * 591: land
             * 592: l2i
             * 593: istore_2
             * 594: goto          610
             * 597: aload_0
             * 598: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 601: bipush        58
             * 603: lshr
             * 604: ldc2_w        63l
             * 607: land
             * 608: l2i
             * 609: istore_2
             * 610: iload_2
             * 611: invokestatic  org/openide/util/CharSequences.access$1000:(I)C
             * 614: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed6Bit_21_30.length:()I
             * 4: istore_1
             * 5: iload_1
             * 6: newarray       char
             * 8: astore_2
             * 9: iconst_0
             * 10: istore_3
             * 11: iload_3
             * 12: iload_1
             * 13: if_icmpge     30
             * 16: aload_2
             * 17: iload_3
             * 18: aload_0
             * 19: iload_3
             * 20: invokevirtual org/openide/util/CharSequences$Fixed6Bit_21_30.charAt:(I)C
             * 23: castore
             * 24: iinc          3, 1
             * 27: goto          11
             * 30: new           java/lang/String
             * 33: dup
             * 34: aload_2
             * 35: invokespecial java/lang/String."<init>":([C)V
             * 38: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$Fixed6Bit_21_30
             * 11: ifeq          61
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$Fixed6Bit_21_30
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 23: aload_2
             * 24: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 27: lcmp
             * 28: ifne          59
             * 31: aload_0
             * 32: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 35: aload_2
             * 36: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 39: lcmp
             * 40: ifne          59
             * 43: aload_0
             * 44: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 47: aload_2
             * 48: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 51: lcmp
             * 52: ifne          59
             * 55: iconst_1
             * 56: goto          60
             * 59: iconst_0
             * 60: ireturn
             * 61: iconst_0
             * 62: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i1:J
             * 4: ldc2_w        31l
             * 7: aload_0
             * 8: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i2:J
             * 11: aload_0
             * 12: getfield      org/openide/util/CharSequences$Fixed6Bit_21_30.i3:J
             * 15: ldc2_w        31l
             * 18: lmul
             * 19: ladd
             * 20: lmul
             * 21: ladd
             * 22: lstore_1
             * 23: lload_1
             * 24: lload_1
             * 25: bipush        32
             * 27: lshr
             * 28: ladd
             * 29: ldc2_w        4294967295l
             * 32: land
             * 33: lstore_1
             * 34: lload_1
             * 35: l2i
             * 36: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int start, int end) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed6Bit_21_30.toString:()Ljava/lang/String;
             * 4: iload_1
             * 5: iload_2
             * 6: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 9: invokestatic  org/openide/util/CharSequences.create:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
             * 12: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/util/CharSequences.access$800:()Lorg/openide/util/CharSequences$CharSequenceComparator;
             * 3: aload_0
             * 4: aload_1
             * 5: invokevirtual org/openide/util/CharSequences$CharSequenceComparator.compare:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
             * 8: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class Fixed_0_7 implements CompactCharSequence, Comparable<CharSequence> {

        private final int i1;
        private final int i2;

        private Fixed_0_7(byte[] b, int n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: iload_2
             * 5: istore_3
             * 6: iconst_0
             * 7: istore        4
             * 9: iload_2
             * 10: tableswitch   { // 0 to 7
             * 0: 153
             * 1: 140
             * 2: 127
             * 3: 114
             * 4: 102
             * 5: 87
             * 6: 72
             * 7: 56
             * default: 156
             * }
             * 56: iload         4
             * 58: aload_1
             * 59: bipush        6
             * 61: baload
             * 62: sipush        255
             * 65: iand
             * 66: bipush        24
             * 68: ishl
             * 69: iadd
             * 70: istore        4
             * 72: iload         4
             * 74: aload_1
             * 75: iconst_5
             * 76: baload
             * 77: sipush        255
             * 80: iand
             * 81: bipush        16
             * 83: ishl
             * 84: iadd
             * 85: istore        4
             * 87: iload         4
             * 89: aload_1
             * 90: iconst_4
             * 91: baload
             * 92: sipush        255
             * 95: iand
             * 96: bipush        8
             * 98: ishl
             * 99: iadd
             * 100: istore        4
             * 102: iload         4
             * 104: aload_1
             * 105: iconst_3
             * 106: baload
             * 107: sipush        255
             * 110: iand
             * 111: iadd
             * 112: istore        4
             * 114: iload_3
             * 115: aload_1
             * 116: iconst_2
             * 117: baload
             * 118: sipush        255
             * 121: iand
             * 122: bipush        24
             * 124: ishl
             * 125: iadd
             * 126: istore_3
             * 127: iload_3
             * 128: aload_1
             * 129: iconst_1
             * 130: baload
             * 131: sipush        255
             * 134: iand
             * 135: bipush        16
             * 137: ishl
             * 138: iadd
             * 139: istore_3
             * 140: iload_3
             * 141: aload_1
             * 142: iconst_0
             * 143: baload
             * 144: sipush        255
             * 147: iand
             * 148: bipush        8
             * 150: ishl
             * 151: iadd
             * 152: istore_3
             * 153: goto          164
             * 156: new           java/lang/IllegalArgumentException
             * 159: dup
             * 160: invokespecial java/lang/IllegalArgumentException."<init>":()V
             * 163: athrow
             * 164: aload_0
             * 165: iload_3
             * 166: putfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 169: aload_0
             * 170: iload         4
             * 172: putfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 175: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 4: sipush        255
             * 7: iand
             * 8: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iload_1
             * 3: tableswitch   { // 0 to 6
             * 0: 44
             * 1: 58
             * 2: 72
             * 3: 87
             * 4: 99
             * 5: 113
             * 6: 127
             * default: 139
             * }
             * 44: aload_0
             * 45: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 48: ldc           65280
             * 50: iand
             * 51: bipush        8
             * 53: ishr
             * 54: istore_2
             * 55: goto          139
             * 58: aload_0
             * 59: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 62: ldc           16711680
             * 64: iand
             * 65: bipush        16
             * 67: ishr
             * 68: istore_2
             * 69: goto          139
             * 72: aload_0
             * 73: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 76: bipush        24
             * 78: ishr
             * 79: sipush        255
             * 82: iand
             * 83: istore_2
             * 84: goto          139
             * 87: aload_0
             * 88: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 91: sipush        255
             * 94: iand
             * 95: istore_2
             * 96: goto          139
             * 99: aload_0
             * 100: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 103: ldc           65280
             * 105: iand
             * 106: bipush        8
             * 108: ishr
             * 109: istore_2
             * 110: goto          139
             * 113: aload_0
             * 114: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 117: ldc           16711680
             * 119: iand
             * 120: bipush        16
             * 122: ishr
             * 123: istore_2
             * 124: goto          139
             * 127: aload_0
             * 128: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 131: bipush        24
             * 133: ishr
             * 134: sipush        255
             * 137: iand
             * 138: istore_2
             * 139: iload_2
             * 140: i2c
             * 141: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed_0_7.length:()I
             * 4: istore_1
             * 5: iload_1
             * 6: newarray       char
             * 8: astore_2
             * 9: iconst_0
             * 10: istore_3
             * 11: iload_3
             * 12: iload_1
             * 13: if_icmpge     30
             * 16: aload_2
             * 17: iload_3
             * 18: aload_0
             * 19: iload_3
             * 20: invokevirtual org/openide/util/CharSequences$Fixed_0_7.charAt:(I)C
             * 23: castore
             * 24: iinc          3, 1
             * 27: goto          11
             * 30: new           java/lang/String
             * 33: dup
             * 34: aload_2
             * 35: invokespecial java/lang/String."<init>":([C)V
             * 38: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$Fixed_0_7
             * 11: ifeq          47
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$Fixed_0_7
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 23: aload_2
             * 24: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 27: if_icmpne     45
             * 30: aload_0
             * 31: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 34: aload_2
             * 35: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 38: if_icmpne     45
             * 41: iconst_1
             * 42: goto          46
             * 45: iconst_0
             * 46: ireturn
             * 47: iconst_0
             * 48: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: bipush        19
             * 2: aload_0
             * 3: getfield      org/openide/util/CharSequences$Fixed_0_7.i1:I
             * 6: imul
             * 7: bipush        37
             * 9: aload_0
             * 10: getfield      org/openide/util/CharSequences$Fixed_0_7.i2:I
             * 13: imul
             * 14: iadd
             * 15: istore_1
             * 16: iload_1
             * 17: iload_1
             * 18: bipush        15
             * 20: ishl
             * 21: sipush        -12931
             * 24: ixor
             * 25: iadd
             * 26: istore_1
             * 27: iload_1
             * 28: iload_1
             * 29: bipush        10
             * 31: iushr
             * 32: ixor
             * 33: istore_1
             * 34: iload_1
             * 35: iload_1
             * 36: iconst_3
             * 37: ishl
             * 38: iadd
             * 39: istore_1
             * 40: iload_1
             * 41: iload_1
             * 42: bipush        6
             * 44: iushr
             * 45: ixor
             * 46: istore_1
             * 47: iload_1
             * 48: iload_1
             * 49: iconst_2
             * 50: ishl
             * 51: iload_1
             * 52: bipush        14
             * 54: ishl
             * 55: iadd
             * 56: iadd
             * 57: istore_1
             * 58: iload_1
             * 59: iload_1
             * 60: bipush        16
             * 62: iushr
             * 63: ixor
             * 64: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int start, int end) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed_0_7.toString:()Ljava/lang/String;
             * 4: iload_1
             * 5: iload_2
             * 6: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 9: invokestatic  org/openide/util/CharSequences.create:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
             * 12: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/util/CharSequences.access$800:()Lorg/openide/util/CharSequences$CharSequenceComparator;
             * 3: aload_0
             * 4: aload_1
             * 5: invokevirtual org/openide/util/CharSequences$CharSequenceComparator.compare:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
             * 8: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class Fixed_16_23 implements CompactCharSequence, Comparable<CharSequence> {

        private final long i1;
        private final long i2;
        private final long i3;

        private Fixed_16_23(byte[] b, int n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: lconst_0
             * 5: lstore_3
             * 6: lconst_0
             * 7: lstore        5
             * 9: lconst_0
             * 10: lstore        7
             * 12: iload_2
             * 13: tableswitch   { // 0 to 23
             * 0: 499
             * 1: 485
             * 2: 471
             * 3: 457
             * 4: 441
             * 5: 427
             * 6: 413
             * 7: 398
             * 8: 384
             * 9: 367
             * 10: 350
             * 11: 333
             * 12: 312
             * 13: 295
             * 14: 278
             * 15: 261
             * 16: 247
             * 17: 230
             * 18: 213
             * 19: 196
             * 20: 175
             * 21: 158
             * 22: 141
             * 23: 124
             * default: 507
             * }
             * 124: lload         7
             * 126: aload_1
             * 127: bipush        22
             * 129: baload
             * 130: i2l
             * 131: ldc2_w        255l
             * 134: land
             * 135: bipush        24
             * 137: lshl
             * 138: ladd
             * 139: lstore        7
             * 141: lload         7
             * 143: aload_1
             * 144: bipush        21
             * 146: baload
             * 147: sipush        255
             * 150: iand
             * 151: bipush        16
             * 153: ishl
             * 154: i2l
             * 155: ladd
             * 156: lstore        7
             * 158: lload         7
             * 160: aload_1
             * 161: bipush        20
             * 163: baload
             * 164: sipush        255
             * 167: iand
             * 168: bipush        8
             * 170: ishl
             * 171: i2l
             * 172: ladd
             * 173: lstore        7
             * 175: lload         7
             * 177: aload_1
             * 178: bipush        19
             * 180: baload
             * 181: sipush        255
             * 184: iand
             * 185: i2l
             * 186: ladd
             * 187: lstore        7
             * 189: lload         7
             * 191: bipush        32
             * 193: lshl
             * 194: lstore        7
             * 196: lload         7
             * 198: aload_1
             * 199: bipush        18
             * 201: baload
             * 202: i2l
             * 203: ldc2_w        255l
             * 206: land
             * 207: bipush        24
             * 209: lshl
             * 210: ladd
             * 211: lstore        7
             * 213: lload         7
             * 215: aload_1
             * 216: bipush        17
             * 218: baload
             * 219: sipush        255
             * 222: iand
             * 223: bipush        16
             * 225: ishl
             * 226: i2l
             * 227: ladd
             * 228: lstore        7
             * 230: lload         7
             * 232: aload_1
             * 233: bipush        16
             * 235: baload
             * 236: sipush        255
             * 239: iand
             * 240: bipush        8
             * 242: ishl
             * 243: i2l
             * 244: ladd
             * 245: lstore        7
             * 247: lload         7
             * 249: aload_1
             * 250: bipush        15
             * 252: baload
             * 253: sipush        255
             * 256: iand
             * 257: i2l
             * 258: ladd
             * 259: lstore        7
             * 261: lload         5
             * 263: aload_1
             * 264: bipush        14
             * 266: baload
             * 267: i2l
             * 268: ldc2_w        255l
             * 271: land
             * 272: bipush        24
             * 274: lshl
             * 275: ladd
             * 276: lstore        5
             * 278: lload         5
             * 280: aload_1
             * 281: bipush        13
             * 283: baload
             * 284: sipush        255
             * 287: iand
             * 288: bipush        16
             * 290: ishl
             * 291: i2l
             * 292: ladd
             * 293: lstore        5
             * 295: lload         5
             * 297: aload_1
             * 298: bipush        12
             * 300: baload
             * 301: sipush        255
             * 304: iand
             * 305: bipush        8
             * 307: ishl
             * 308: i2l
             * 309: ladd
             * 310: lstore        5
             * 312: lload         5
             * 314: aload_1
             * 315: bipush        11
             * 317: baload
             * 318: sipush        255
             * 321: iand
             * 322: i2l
             * 323: ladd
             * 324: lstore        5
             * 326: lload         5
             * 328: bipush        32
             * 330: lshl
             * 331: lstore        5
             * 333: lload         5
             * 335: aload_1
             * 336: bipush        10
             * 338: baload
             * 339: i2l
             * 340: ldc2_w        255l
             * 343: land
             * 344: bipush        24
             * 346: lshl
             * 347: ladd
             * 348: lstore        5
             * 350: lload         5
             * 352: aload_1
             * 353: bipush        9
             * 355: baload
             * 356: sipush        255
             * 359: iand
             * 360: bipush        16
             * 362: ishl
             * 363: i2l
             * 364: ladd
             * 365: lstore        5
             * 367: lload         5
             * 369: aload_1
             * 370: bipush        8
             * 372: baload
             * 373: sipush        255
             * 376: iand
             * 377: bipush        8
             * 379: ishl
             * 380: i2l
             * 381: ladd
             * 382: lstore        5
             * 384: lload         5
             * 386: aload_1
             * 387: bipush        7
             * 389: baload
             * 390: sipush        255
             * 393: iand
             * 394: i2l
             * 395: ladd
             * 396: lstore        5
             * 398: lload_3
             * 399: aload_1
             * 400: bipush        6
             * 402: baload
             * 403: i2l
             * 404: ldc2_w        255l
             * 407: land
             * 408: bipush        24
             * 410: lshl
             * 411: ladd
             * 412: lstore_3
             * 413: lload_3
             * 414: aload_1
             * 415: iconst_5
             * 416: baload
             * 417: sipush        255
             * 420: iand
             * 421: bipush        16
             * 423: ishl
             * 424: i2l
             * 425: ladd
             * 426: lstore_3
             * 427: lload_3
             * 428: aload_1
             * 429: iconst_4
             * 430: baload
             * 431: sipush        255
             * 434: iand
             * 435: bipush        8
             * 437: ishl
             * 438: i2l
             * 439: ladd
             * 440: lstore_3
             * 441: lload_3
             * 442: aload_1
             * 443: iconst_3
             * 444: baload
             * 445: sipush        255
             * 448: iand
             * 449: i2l
             * 450: ladd
             * 451: lstore_3
             * 452: lload_3
             * 453: bipush        32
             * 455: lshl
             * 456: lstore_3
             * 457: lload_3
             * 458: aload_1
             * 459: iconst_2
             * 460: baload
             * 461: i2l
             * 462: ldc2_w        255l
             * 465: land
             * 466: bipush        24
             * 468: lshl
             * 469: ladd
             * 470: lstore_3
             * 471: lload_3
             * 472: aload_1
             * 473: iconst_1
             * 474: baload
             * 475: sipush        255
             * 478: iand
             * 479: bipush        16
             * 481: ishl
             * 482: i2l
             * 483: ladd
             * 484: lstore_3
             * 485: lload_3
             * 486: aload_1
             * 487: iconst_0
             * 488: baload
             * 489: sipush        255
             * 492: iand
             * 493: bipush        8
             * 495: ishl
             * 496: i2l
             * 497: ladd
             * 498: lstore_3
             * 499: lload_3
             * 500: iload_2
             * 501: i2l
             * 502: ladd
             * 503: lstore_3
             * 504: goto          515
             * 507: new           java/lang/IllegalArgumentException
             * 510: dup
             * 511: invokespecial java/lang/IllegalArgumentException."<init>":()V
             * 514: athrow
             * 515: aload_0
             * 516: lload_3
             * 517: putfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 520: aload_0
             * 521: lload         5
             * 523: putfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 526: aload_0
             * 527: lload         7
             * 529: putfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 532: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 4: ldc2_w        255l
             * 7: land
             * 8: l2i
             * 9: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iload_1
             * 3: tableswitch   { // 0 to 22
             * 0: 108
             * 1: 124
             * 2: 140
             * 3: 156
             * 4: 172
             * 5: 188
             * 6: 204
             * 7: 220
             * 8: 233
             * 9: 249
             * 10: 265
             * 11: 281
             * 12: 297
             * 13: 313
             * 14: 329
             * 15: 345
             * 16: 358
             * 17: 374
             * 18: 390
             * 19: 406
             * 20: 422
             * 21: 438
             * 22: 454
             * default: 467
             * }
             * 108: aload_0
             * 109: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 112: bipush        8
             * 114: lshr
             * 115: ldc2_w        255l
             * 118: land
             * 119: l2i
             * 120: istore_2
             * 121: goto          467
             * 124: aload_0
             * 125: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 128: bipush        16
             * 130: lshr
             * 131: ldc2_w        255l
             * 134: land
             * 135: l2i
             * 136: istore_2
             * 137: goto          467
             * 140: aload_0
             * 141: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 144: bipush        24
             * 146: lshr
             * 147: ldc2_w        255l
             * 150: land
             * 151: l2i
             * 152: istore_2
             * 153: goto          467
             * 156: aload_0
             * 157: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 160: bipush        32
             * 162: lshr
             * 163: ldc2_w        255l
             * 166: land
             * 167: l2i
             * 168: istore_2
             * 169: goto          467
             * 172: aload_0
             * 173: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 176: bipush        40
             * 178: lshr
             * 179: ldc2_w        255l
             * 182: land
             * 183: l2i
             * 184: istore_2
             * 185: goto          467
             * 188: aload_0
             * 189: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 192: bipush        48
             * 194: lshr
             * 195: ldc2_w        255l
             * 198: land
             * 199: l2i
             * 200: istore_2
             * 201: goto          467
             * 204: aload_0
             * 205: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 208: bipush        56
             * 210: lshr
             * 211: ldc2_w        255l
             * 214: land
             * 215: l2i
             * 216: istore_2
             * 217: goto          467
             * 220: aload_0
             * 221: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 224: ldc2_w        255l
             * 227: land
             * 228: l2i
             * 229: istore_2
             * 230: goto          467
             * 233: aload_0
             * 234: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 237: bipush        8
             * 239: lshr
             * 240: ldc2_w        255l
             * 243: land
             * 244: l2i
             * 245: istore_2
             * 246: goto          467
             * 249: aload_0
             * 250: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 253: bipush        16
             * 255: lshr
             * 256: ldc2_w        255l
             * 259: land
             * 260: l2i
             * 261: istore_2
             * 262: goto          467
             * 265: aload_0
             * 266: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 269: bipush        24
             * 271: lshr
             * 272: ldc2_w        255l
             * 275: land
             * 276: l2i
             * 277: istore_2
             * 278: goto          467
             * 281: aload_0
             * 282: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 285: bipush        32
             * 287: lshr
             * 288: ldc2_w        255l
             * 291: land
             * 292: l2i
             * 293: istore_2
             * 294: goto          467
             * 297: aload_0
             * 298: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 301: bipush        40
             * 303: lshr
             * 304: ldc2_w        255l
             * 307: land
             * 308: l2i
             * 309: istore_2
             * 310: goto          467
             * 313: aload_0
             * 314: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 317: bipush        48
             * 319: lshr
             * 320: ldc2_w        255l
             * 323: land
             * 324: l2i
             * 325: istore_2
             * 326: goto          467
             * 329: aload_0
             * 330: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 333: bipush        56
             * 335: lshr
             * 336: ldc2_w        255l
             * 339: land
             * 340: l2i
             * 341: istore_2
             * 342: goto          467
             * 345: aload_0
             * 346: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 349: ldc2_w        255l
             * 352: land
             * 353: l2i
             * 354: istore_2
             * 355: goto          467
             * 358: aload_0
             * 359: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 362: bipush        8
             * 364: lshr
             * 365: ldc2_w        255l
             * 368: land
             * 369: l2i
             * 370: istore_2
             * 371: goto          467
             * 374: aload_0
             * 375: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 378: bipush        16
             * 380: lshr
             * 381: ldc2_w        255l
             * 384: land
             * 385: l2i
             * 386: istore_2
             * 387: goto          467
             * 390: aload_0
             * 391: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 394: bipush        24
             * 396: lshr
             * 397: ldc2_w        255l
             * 400: land
             * 401: l2i
             * 402: istore_2
             * 403: goto          467
             * 406: aload_0
             * 407: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 410: bipush        32
             * 412: lshr
             * 413: ldc2_w        255l
             * 416: land
             * 417: l2i
             * 418: istore_2
             * 419: goto          467
             * 422: aload_0
             * 423: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 426: bipush        40
             * 428: lshr
             * 429: ldc2_w        255l
             * 432: land
             * 433: l2i
             * 434: istore_2
             * 435: goto          467
             * 438: aload_0
             * 439: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 442: bipush        48
             * 444: lshr
             * 445: ldc2_w        255l
             * 448: land
             * 449: l2i
             * 450: istore_2
             * 451: goto          467
             * 454: aload_0
             * 455: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 458: bipush        56
             * 460: lshr
             * 461: ldc2_w        255l
             * 464: land
             * 465: l2i
             * 466: istore_2
             * 467: iload_2
             * 468: i2c
             * 469: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed_16_23.length:()I
             * 4: istore_1
             * 5: iload_1
             * 6: newarray       char
             * 8: astore_2
             * 9: iconst_0
             * 10: istore_3
             * 11: iload_3
             * 12: iload_1
             * 13: if_icmpge     30
             * 16: aload_2
             * 17: iload_3
             * 18: aload_0
             * 19: iload_3
             * 20: invokevirtual org/openide/util/CharSequences$Fixed_16_23.charAt:(I)C
             * 23: castore
             * 24: iinc          3, 1
             * 27: goto          11
             * 30: new           java/lang/String
             * 33: dup
             * 34: aload_2
             * 35: invokespecial java/lang/String."<init>":([C)V
             * 38: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$Fixed_16_23
             * 11: ifeq          61
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$Fixed_16_23
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 23: aload_2
             * 24: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 27: lcmp
             * 28: ifne          59
             * 31: aload_0
             * 32: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 35: aload_2
             * 36: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 39: lcmp
             * 40: ifne          59
             * 43: aload_0
             * 44: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 47: aload_2
             * 48: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 51: lcmp
             * 52: ifne          59
             * 55: iconst_1
             * 56: goto          60
             * 59: iconst_0
             * 60: ireturn
             * 61: iconst_0
             * 62: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed_16_23.i1:J
             * 4: ldc2_w        31l
             * 7: aload_0
             * 8: getfield      org/openide/util/CharSequences$Fixed_16_23.i2:J
             * 11: ldc2_w        31l
             * 14: aload_0
             * 15: getfield      org/openide/util/CharSequences$Fixed_16_23.i3:J
             * 18: lmul
             * 19: ladd
             * 20: lmul
             * 21: ladd
             * 22: lstore_1
             * 23: lload_1
             * 24: lload_1
             * 25: bipush        32
             * 27: lshr
             * 28: ladd
             * 29: ldc2_w        4294967295l
             * 32: land
             * 33: lstore_1
             * 34: lload_1
             * 35: l2i
             * 36: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int start, int end) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed_16_23.toString:()Ljava/lang/String;
             * 4: iload_1
             * 5: iload_2
             * 6: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 9: invokestatic  org/openide/util/CharSequences.create:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
             * 12: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/util/CharSequences.access$800:()Lorg/openide/util/CharSequences$CharSequenceComparator;
             * 3: aload_0
             * 4: aload_1
             * 5: invokevirtual org/openide/util/CharSequences$CharSequenceComparator.compare:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
             * 8: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class Fixed_8_15 implements CompactCharSequence, Comparable<CharSequence> {

        private final int i1;
        private final int i2;
        private final int i3;
        private final int i4;

        private Fixed_8_15(byte[] b, int n) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: iload_2
             * 5: istore_3
             * 6: iconst_0
             * 7: istore        4
             * 9: iconst_0
             * 10: istore        5
             * 12: iconst_0
             * 13: istore        6
             * 15: iload_2
             * 16: tableswitch   { // 0 to 15
             * 0: 315
             * 1: 302
             * 2: 289
             * 3: 276
             * 4: 264
             * 5: 249
             * 6: 234
             * 7: 218
             * 8: 205
             * 9: 189
             * 10: 173
             * 11: 157
             * 12: 144
             * 13: 128
             * 14: 112
             * 15: 96
             * default: 318
             * }
             * 96: iload         6
             * 98: aload_1
             * 99: bipush        14
             * 101: baload
             * 102: sipush        255
             * 105: iand
             * 106: bipush        24
             * 108: ishl
             * 109: iadd
             * 110: istore        6
             * 112: iload         6
             * 114: aload_1
             * 115: bipush        13
             * 117: baload
             * 118: sipush        255
             * 121: iand
             * 122: bipush        16
             * 124: ishl
             * 125: iadd
             * 126: istore        6
             * 128: iload         6
             * 130: aload_1
             * 131: bipush        12
             * 133: baload
             * 134: sipush        255
             * 137: iand
             * 138: bipush        8
             * 140: ishl
             * 141: iadd
             * 142: istore        6
             * 144: iload         6
             * 146: aload_1
             * 147: bipush        11
             * 149: baload
             * 150: sipush        255
             * 153: iand
             * 154: iadd
             * 155: istore        6
             * 157: iload         5
             * 159: aload_1
             * 160: bipush        10
             * 162: baload
             * 163: sipush        255
             * 166: iand
             * 167: bipush        24
             * 169: ishl
             * 170: iadd
             * 171: istore        5
             * 173: iload         5
             * 175: aload_1
             * 176: bipush        9
             * 178: baload
             * 179: sipush        255
             * 182: iand
             * 183: bipush        16
             * 185: ishl
             * 186: iadd
             * 187: istore        5
             * 189: iload         5
             * 191: aload_1
             * 192: bipush        8
             * 194: baload
             * 195: sipush        255
             * 198: iand
             * 199: bipush        8
             * 201: ishl
             * 202: iadd
             * 203: istore        5
             * 205: iload         5
             * 207: aload_1
             * 208: bipush        7
             * 210: baload
             * 211: sipush        255
             * 214: iand
             * 215: iadd
             * 216: istore        5
             * 218: iload         4
             * 220: aload_1
             * 221: bipush        6
             * 223: baload
             * 224: sipush        255
             * 227: iand
             * 228: bipush        24
             * 230: ishl
             * 231: iadd
             * 232: istore        4
             * 234: iload         4
             * 236: aload_1
             * 237: iconst_5
             * 238: baload
             * 239: sipush        255
             * 242: iand
             * 243: bipush        16
             * 245: ishl
             * 246: iadd
             * 247: istore        4
             * 249: iload         4
             * 251: aload_1
             * 252: iconst_4
             * 253: baload
             * 254: sipush        255
             * 257: iand
             * 258: bipush        8
             * 260: ishl
             * 261: iadd
             * 262: istore        4
             * 264: iload         4
             * 266: aload_1
             * 267: iconst_3
             * 268: baload
             * 269: sipush        255
             * 272: iand
             * 273: iadd
             * 274: istore        4
             * 276: iload_3
             * 277: aload_1
             * 278: iconst_2
             * 279: baload
             * 280: sipush        255
             * 283: iand
             * 284: bipush        24
             * 286: ishl
             * 287: iadd
             * 288: istore_3
             * 289: iload_3
             * 290: aload_1
             * 291: iconst_1
             * 292: baload
             * 293: sipush        255
             * 296: iand
             * 297: bipush        16
             * 299: ishl
             * 300: iadd
             * 301: istore_3
             * 302: iload_3
             * 303: aload_1
             * 304: iconst_0
             * 305: baload
             * 306: sipush        255
             * 309: iand
             * 310: bipush        8
             * 312: ishl
             * 313: iadd
             * 314: istore_3
             * 315: goto          326
             * 318: new           java/lang/IllegalArgumentException
             * 321: dup
             * 322: invokespecial java/lang/IllegalArgumentException."<init>":()V
             * 325: athrow
             * 326: aload_0
             * 327: iload_3
             * 328: putfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 331: aload_0
             * 332: iload         4
             * 334: putfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 337: aload_0
             * 338: iload         5
             * 340: putfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 343: aload_0
             * 344: iload         6
             * 346: putfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 349: return
             *  */
            // </editor-fold>
        }

        public int length() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 4: sipush        255
             * 7: iand
             * 8: ireturn
             *  */
            // </editor-fold>
        }

        public char charAt(int index) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iload_1
             * 3: tableswitch   { // 0 to 14
             * 0: 76
             * 1: 90
             * 2: 104
             * 3: 119
             * 4: 131
             * 5: 145
             * 6: 159
             * 7: 174
             * 8: 186
             * 9: 200
             * 10: 214
             * 11: 229
             * 12: 241
             * 13: 255
             * 14: 269
             * default: 281
             * }
             * 76: aload_0
             * 77: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 80: ldc           65280
             * 82: iand
             * 83: bipush        8
             * 85: ishr
             * 86: istore_2
             * 87: goto          281
             * 90: aload_0
             * 91: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 94: ldc           16711680
             * 96: iand
             * 97: bipush        16
             * 99: ishr
             * 100: istore_2
             * 101: goto          281
             * 104: aload_0
             * 105: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 108: bipush        24
             * 110: ishr
             * 111: sipush        255
             * 114: iand
             * 115: istore_2
             * 116: goto          281
             * 119: aload_0
             * 120: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 123: sipush        255
             * 126: iand
             * 127: istore_2
             * 128: goto          281
             * 131: aload_0
             * 132: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 135: ldc           65280
             * 137: iand
             * 138: bipush        8
             * 140: ishr
             * 141: istore_2
             * 142: goto          281
             * 145: aload_0
             * 146: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 149: ldc           16711680
             * 151: iand
             * 152: bipush        16
             * 154: ishr
             * 155: istore_2
             * 156: goto          281
             * 159: aload_0
             * 160: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 163: bipush        24
             * 165: ishr
             * 166: sipush        255
             * 169: iand
             * 170: istore_2
             * 171: goto          281
             * 174: aload_0
             * 175: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 178: sipush        255
             * 181: iand
             * 182: istore_2
             * 183: goto          281
             * 186: aload_0
             * 187: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 190: ldc           65280
             * 192: iand
             * 193: bipush        8
             * 195: ishr
             * 196: istore_2
             * 197: goto          281
             * 200: aload_0
             * 201: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 204: ldc           16711680
             * 206: iand
             * 207: bipush        16
             * 209: ishr
             * 210: istore_2
             * 211: goto          281
             * 214: aload_0
             * 215: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 218: bipush        24
             * 220: ishr
             * 221: sipush        255
             * 224: iand
             * 225: istore_2
             * 226: goto          281
             * 229: aload_0
             * 230: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 233: sipush        255
             * 236: iand
             * 237: istore_2
             * 238: goto          281
             * 241: aload_0
             * 242: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 245: ldc           65280
             * 247: iand
             * 248: bipush        8
             * 250: ishr
             * 251: istore_2
             * 252: goto          281
             * 255: aload_0
             * 256: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 259: ldc           16711680
             * 261: iand
             * 262: bipush        16
             * 264: ishr
             * 265: istore_2
             * 266: goto          281
             * 269: aload_0
             * 270: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 273: bipush        24
             * 275: ishr
             * 276: sipush        255
             * 279: iand
             * 280: istore_2
             * 281: iload_2
             * 282: i2c
             * 283: ireturn
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed_8_15.length:()I
             * 4: istore_1
             * 5: iload_1
             * 6: newarray       char
             * 8: astore_2
             * 9: iconst_0
             * 10: istore_3
             * 11: iload_3
             * 12: iload_1
             * 13: if_icmpge     30
             * 16: aload_2
             * 17: iload_3
             * 18: aload_0
             * 19: iload_3
             * 20: invokevirtual org/openide/util/CharSequences$Fixed_8_15.charAt:(I)C
             * 23: castore
             * 24: iinc          3, 1
             * 27: goto          11
             * 30: new           java/lang/String
             * 33: dup
             * 34: aload_2
             * 35: invokespecial java/lang/String."<init>":([C)V
             * 38: areturn
             *  */
            // </editor-fold>
        }

        public boolean equals(Object object) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: if_acmpne     7
             * 5: iconst_1
             * 6: ireturn
             * 7: aload_1
             * 8: instanceof    org/openide/util/CharSequences$Fixed_8_15
             * 11: ifeq          69
             * 14: aload_1
             * 15: checkcast     org/openide/util/CharSequences$Fixed_8_15
             * 18: astore_2
             * 19: aload_0
             * 20: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 23: aload_2
             * 24: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 27: if_icmpne     67
             * 30: aload_0
             * 31: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 34: aload_2
             * 35: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 38: if_icmpne     67
             * 41: aload_0
             * 42: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 45: aload_2
             * 46: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 49: if_icmpne     67
             * 52: aload_0
             * 53: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 56: aload_2
             * 57: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 60: if_icmpne     67
             * 63: iconst_1
             * 64: goto          68
             * 67: iconst_0
             * 68: ireturn
             * 69: iconst_0
             * 70: ireturn
             *  */
            // </editor-fold>
        }

        public int hashCode() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/CharSequences$Fixed_8_15.i1:I
             * 4: bipush        31
             * 6: aload_0
             * 7: getfield      org/openide/util/CharSequences$Fixed_8_15.i2:I
             * 10: bipush        31
             * 12: aload_0
             * 13: getfield      org/openide/util/CharSequences$Fixed_8_15.i3:I
             * 16: bipush        31
             * 18: aload_0
             * 19: getfield      org/openide/util/CharSequences$Fixed_8_15.i4:I
             * 22: imul
             * 23: iadd
             * 24: imul
             * 25: iadd
             * 26: imul
             * 27: iadd
             * 28: ireturn
             *  */
            // </editor-fold>
        }

        public CharSequence subSequence(int start, int end) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual org/openide/util/CharSequences$Fixed_8_15.toString:()Ljava/lang/String;
             * 4: iload_1
             * 5: iload_2
             * 6: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 9: invokestatic  org/openide/util/CharSequences.create:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
             * 12: areturn
             *  */
            // </editor-fold>
        }

        public int compareTo(CharSequence o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: invokestatic  org/openide/util/CharSequences.access$800:()Lorg/openide/util/CharSequences$CharSequenceComparator;
             * 3: aload_0
             * 4: aload_1
             * 5: invokevirtual org/openide/util/CharSequences$CharSequenceComparator.compare:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I
             * 8: ireturn
             *  */
            // </editor-fold>
        }
    }
    private static final long[] encodeTable;
    private static final char[] decodeTable;
    private static final CompactCharSequence EMPTY;
    private static final CharSequenceComparator Comparator;

    public static CharSequence create(char[] buf, int start, int count) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: ifge          13
         * 4: new           java/lang/StringIndexOutOfBoundsException
         * 7: dup
         * 8: iload_1
         * 9: invokespecial java/lang/StringIndexOutOfBoundsException."<init>":(I)V
         * 12: athrow
         * 13: iload_2
         * 14: ifge          26
         * 17: new           java/lang/StringIndexOutOfBoundsException
         * 20: dup
         * 21: iload_2
         * 22: invokespecial java/lang/StringIndexOutOfBoundsException."<init>":(I)V
         * 25: athrow
         * 26: iload_1
         * 27: aload_0
         * 28: arraylength
         * 29: iload_2
         * 30: isub
         * 31: if_icmple     45
         * 34: new           java/lang/StringIndexOutOfBoundsException
         * 37: dup
         * 38: iload_1
         * 39: iload_2
         * 40: iadd
         * 41: invokespecial java/lang/StringIndexOutOfBoundsException."<init>":(I)V
         * 44: athrow
         * 45: iload_2
         * 46: istore_3
         * 47: iload_3
         * 48: ifne          55
         * 51: getstatic     org/openide/util/CharSequences.EMPTY:Lorg/openide/util/CharSequences$CompactCharSequence;
         * 54: areturn
         * 55: iload_3
         * 56: newarray       byte
         * 58: astore        4
         * 60: iconst_1
         * 61: istore        5
         * 63: iconst_1
         * 64: istore        8
         * 66: iconst_0
         * 67: istore        9
         * 69: iload         9
         * 71: iload_3
         * 72: if_icmpge     130
         * 75: aload_0
         * 76: iload_1
         * 77: iload         9
         * 79: iadd
         * 80: caload
         * 81: istore        6
         * 83: iload         6
         * 85: sipush        255
         * 88: iand
         * 89: istore        7
         * 91: iload         7
         * 93: iload         6
         * 95: if_icmpeq     104
         * 98: iconst_0
         * 99: istore        5
         * 101: goto          130
         * 104: iload         8
         * 106: ifeq          116
         * 109: iload         7
         * 111: invokestatic  org/openide/util/CharSequences.is6BitChar:(I)Z
         * 114: istore        8
         * 116: aload         4
         * 118: iload         9
         * 120: iload         6
         * 122: i2b
         * 123: bastore
         * 124: iinc          9, 1
         * 127: goto          69
         * 130: iload         5
         * 132: ifeq          144
         * 135: aload         4
         * 137: iload_3
         * 138: iload         8
         * 140: invokestatic  org/openide/util/CharSequences.createFromBytes:([BIZ)Lorg/openide/util/CharSequences$CompactCharSequence;
         * 143: areturn
         * 144: iload_2
         * 145: newarray       char
         * 147: astore        9
         * 149: aload_0
         * 150: iload_1
         * 151: aload         9
         * 153: iconst_0
         * 154: iload_2
         * 155: invokestatic  java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 158: new           org/openide/util/CharSequences$CharBasedSequence
         * 161: dup
         * 162: aload         9
         * 164: aconst_null
         * 165: invokespecial org/openide/util/CharSequences$CharBasedSequence."<init>":([CLorg/openide/util/CharSequences$1;)V
         * 168: areturn
         *  */
        // </editor-fold>
    }

    public static CharSequence create(CharSequence s) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     6
         * 4: aconst_null
         * 5: areturn
         * 6: aload_0
         * 7: instanceof    org/openide/util/CharSequences$CompactCharSequence
         * 10: ifeq          15
         * 13: aload_0
         * 14: areturn
         * 15: aload_0
         * 16: invokeinterface java/lang/CharSequence.length:()I
         * 21: istore_1
         * 22: iload_1
         * 23: ifne          30
         * 26: getstatic     org/openide/util/CharSequences.EMPTY:Lorg/openide/util/CharSequences$CompactCharSequence;
         * 29: areturn
         * 30: iload_1
         * 31: newarray       byte
         * 33: astore_2
         * 34: iconst_1
         * 35: istore_3
         * 36: iconst_1
         * 37: istore        6
         * 39: iconst_0
         * 40: istore        7
         * 42: iload         7
         * 44: iload_1
         * 45: if_icmpge     103
         * 48: aload_0
         * 49: iload         7
         * 51: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 56: istore        4
         * 58: iload         4
         * 60: sipush        255
         * 63: iand
         * 64: istore        5
         * 66: iload         5
         * 68: iload         4
         * 70: if_icmpeq     78
         * 73: iconst_0
         * 74: istore_3
         * 75: goto          103
         * 78: iload         6
         * 80: ifeq          90
         * 83: iload         5
         * 85: invokestatic  org/openide/util/CharSequences.is6BitChar:(I)Z
         * 88: istore        6
         * 90: aload_2
         * 91: iload         7
         * 93: iload         4
         * 95: i2b
         * 96: bastore
         * 97: iinc          7, 1
         * 100: goto          42
         * 103: iload_3
         * 104: ifeq          115
         * 107: aload_2
         * 108: iload_1
         * 109: iload         6
         * 111: invokestatic  org/openide/util/CharSequences.createFromBytes:([BIZ)Lorg/openide/util/CharSequences$CompactCharSequence;
         * 114: areturn
         * 115: iload_1
         * 116: newarray       char
         * 118: astore        7
         * 120: iconst_0
         * 121: istore        8
         * 123: iload         8
         * 125: iload_1
         * 126: if_icmpge     148
         * 129: aload         7
         * 131: iload         8
         * 133: aload_0
         * 134: iload         8
         * 136: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 141: castore
         * 142: iinc          8, 1
         * 145: goto          123
         * 148: new           org/openide/util/CharSequences$CharBasedSequence
         * 151: dup
         * 152: aload         7
         * 154: aconst_null
         * 155: invokespecial org/openide/util/CharSequences$CharBasedSequence."<init>":([CLorg/openide/util/CharSequences$1;)V
         * 158: areturn
         *  */
        // </editor-fold>
    }

    public static Comparator<CharSequence> comparator() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/CharSequences.Comparator:Lorg/openide/util/CharSequences$CharSequenceComparator;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public static CharSequence empty() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/CharSequences.EMPTY:Lorg/openide/util/CharSequences$CompactCharSequence;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public static boolean isCompact(CharSequence cs) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    org/openide/util/CharSequences$CompactCharSequence
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public static int indexOf(CharSequence text, CharSequence seq) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: iconst_0
         * 3: invokestatic  org/openide/util/CharSequences.indexOf:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I
         * 6: ireturn
         *  */
        // </editor-fold>
    }

    public static int indexOf(CharSequence text, CharSequence seq, int fromIndex) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokeinterface java/lang/CharSequence.length:()I
         * 6: istore_3
         * 7: aload_1
         * 8: invokeinterface java/lang/CharSequence.length:()I
         * 13: istore        4
         * 15: iload_2
         * 16: iload_3
         * 17: if_icmplt     31
         * 20: iload         4
         * 22: ifne          29
         * 25: iload_3
         * 26: goto          30
         * 29: iconst_m1
         * 30: ireturn
         * 31: iload_2
         * 32: ifge          37
         * 35: iconst_0
         * 36: istore_2
         * 37: iload         4
         * 39: ifne          44
         * 42: iload_2
         * 43: ireturn
         * 44: aload_1
         * 45: iconst_0
         * 46: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 51: istore        5
         * 53: iload_3
         * 54: iload         4
         * 56: isub
         * 57: istore        6
         * 59: iload_2
         * 60: istore        7
         * 62: iload         7
         * 64: iload         6
         * 66: if_icmpgt     184
         * 69: aload_0
         * 70: iload         7
         * 72: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 77: iload         5
         * 79: if_icmpeq     108
         * 82: iinc          7, 1
         * 85: iload         7
         * 87: iload         6
         * 89: if_icmpgt     108
         * 92: aload_0
         * 93: iload         7
         * 95: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 100: iload         5
         * 102: if_icmpeq     108
         * 105: goto          82
         * 108: iload         7
         * 110: iload         6
         * 112: if_icmpgt     178
         * 115: iload         7
         * 117: iconst_1
         * 118: iadd
         * 119: istore        8
         * 121: iload         8
         * 123: iload         4
         * 125: iadd
         * 126: iconst_1
         * 127: isub
         * 128: istore        9
         * 130: iconst_1
         * 131: istore        10
         * 133: iload         8
         * 135: iload         9
         * 137: if_icmpge     168
         * 140: aload_0
         * 141: iload         8
         * 143: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 148: aload_1
         * 149: iload         10
         * 151: invokeinterface java/lang/CharSequence.charAt:(I)C
         * 156: if_icmpne     168
         * 159: iinc          8, 1
         * 162: iinc          10, 1
         * 165: goto          133
         * 168: iload         8
         * 170: iload         9
         * 172: if_icmpne     178
         * 175: iload         7
         * 177: ireturn
         * 178: iinc          7, 1
         * 181: goto          62
         * 184: iconst_m1
         * 185: ireturn
         *  */
        // </editor-fold>
    }

    private static CompactCharSequence createFromBytes(byte[] b, int n, boolean id) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_2
         * 1: ifeq          59
         * 4: iload_1
         * 5: ifle          59
         * 8: iload_1
         * 9: bipush        10
         * 11: if_icmpgt     25
         * 14: new           org/openide/util/CharSequences$Fixed6Bit_1_10
         * 17: dup
         * 18: aload_0
         * 19: iload_1
         * 20: aconst_null
         * 21: invokespecial org/openide/util/CharSequences$Fixed6Bit_1_10."<init>":([BILorg/openide/util/CharSequences$1;)V
         * 24: areturn
         * 25: iload_1
         * 26: bipush        20
         * 28: if_icmpgt     42
         * 31: new           org/openide/util/CharSequences$Fixed6Bit_11_20
         * 34: dup
         * 35: aload_0
         * 36: iload_1
         * 37: aconst_null
         * 38: invokespecial org/openide/util/CharSequences$Fixed6Bit_11_20."<init>":([BILorg/openide/util/CharSequences$1;)V
         * 41: areturn
         * 42: iload_1
         * 43: bipush        30
         * 45: if_icmpgt     59
         * 48: new           org/openide/util/CharSequences$Fixed6Bit_21_30
         * 51: dup
         * 52: aload_0
         * 53: iload_1
         * 54: aconst_null
         * 55: invokespecial org/openide/util/CharSequences$Fixed6Bit_21_30."<init>":([BILorg/openide/util/CharSequences$1;)V
         * 58: areturn
         * 59: iload_1
         * 60: bipush        8
         * 62: if_icmpge     76
         * 65: new           org/openide/util/CharSequences$Fixed_0_7
         * 68: dup
         * 69: aload_0
         * 70: iload_1
         * 71: aconst_null
         * 72: invokespecial org/openide/util/CharSequences$Fixed_0_7."<init>":([BILorg/openide/util/CharSequences$1;)V
         * 75: areturn
         * 76: iload_1
         * 77: bipush        16
         * 79: if_icmpge     93
         * 82: new           org/openide/util/CharSequences$Fixed_8_15
         * 85: dup
         * 86: aload_0
         * 87: iload_1
         * 88: aconst_null
         * 89: invokespecial org/openide/util/CharSequences$Fixed_8_15."<init>":([BILorg/openide/util/CharSequences$1;)V
         * 92: areturn
         * 93: iload_1
         * 94: bipush        24
         * 96: if_icmpge     110
         * 99: new           org/openide/util/CharSequences$Fixed_16_23
         * 102: dup
         * 103: aload_0
         * 104: iload_1
         * 105: aconst_null
         * 106: invokespecial org/openide/util/CharSequences$Fixed_16_23."<init>":([BILorg/openide/util/CharSequences$1;)V
         * 109: areturn
         * 110: new           org/openide/util/CharSequences$ByteBasedSequence
         * 113: dup
         * 114: aload_0
         * 115: aconst_null
         * 116: invokespecial org/openide/util/CharSequences$ByteBasedSequence."<init>":([BLorg/openide/util/CharSequences$1;)V
         * 119: areturn
         *  */
        // </editor-fold>
    }

    private static CharSequence create(byte[] buf, int start, int count) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: ifge          13
         * 4: new           java/lang/StringIndexOutOfBoundsException
         * 7: dup
         * 8: iload_1
         * 9: invokespecial java/lang/StringIndexOutOfBoundsException."<init>":(I)V
         * 12: athrow
         * 13: iload_2
         * 14: ifge          26
         * 17: new           java/lang/StringIndexOutOfBoundsException
         * 20: dup
         * 21: iload_2
         * 22: invokespecial java/lang/StringIndexOutOfBoundsException."<init>":(I)V
         * 25: athrow
         * 26: iload_1
         * 27: aload_0
         * 28: arraylength
         * 29: iload_2
         * 30: isub
         * 31: if_icmple     45
         * 34: new           java/lang/StringIndexOutOfBoundsException
         * 37: dup
         * 38: iload_1
         * 39: iload_2
         * 40: iadd
         * 41: invokespecial java/lang/StringIndexOutOfBoundsException."<init>":(I)V
         * 44: athrow
         * 45: iload_2
         * 46: istore_3
         * 47: iload_3
         * 48: ifne          55
         * 51: getstatic     org/openide/util/CharSequences.EMPTY:Lorg/openide/util/CharSequences$CompactCharSequence;
         * 54: areturn
         * 55: iload_3
         * 56: newarray       byte
         * 58: astore        4
         * 60: aload_0
         * 61: iload_1
         * 62: aload         4
         * 64: iconst_0
         * 65: iload_2
         * 66: invokestatic  java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
         * 69: iconst_1
         * 70: istore        5
         * 72: iconst_0
         * 73: istore        6
         * 75: iload         6
         * 77: iload_3
         * 78: if_icmpge     102
         * 81: iload         5
         * 83: ifeq          102
         * 86: aload         4
         * 88: iload         6
         * 90: baload
         * 91: invokestatic  org/openide/util/CharSequences.is6BitChar:(I)Z
         * 94: istore        5
         * 96: iinc          6, 1
         * 99: goto          75
         * 102: aload         4
         * 104: iload_3
         * 105: iload         5
         * 107: invokestatic  org/openide/util/CharSequences.createFromBytes:([BIZ)Lorg/openide/util/CharSequences$CompactCharSequence;
         * 110: areturn
         *  */
        // </editor-fold>
    }

    private static boolean is6BitChar(int d) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: sipush        128
         * 4: if_icmpge     21
         * 7: getstatic     org/openide/util/CharSequences.encodeTable:[J
         * 10: iload_0
         * 11: laload
         * 12: lconst_0
         * 13: lcmp
         * 14: iflt          21
         * 17: iconst_1
         * 18: goto          22
         * 21: iconst_0
         * 22: ireturn
         *  */
        // </editor-fold>
    }

    private static long encode6BitChar(int d) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/CharSequences.encodeTable:[J
         * 3: iload_0
         * 4: laload
         * 5: lreturn
         *  */
        // </editor-fold>
    }

    private static char decode6BitChar(int d) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/CharSequences.decodeTable:[C
         * 3: iload_0
         * 4: caload
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    private CharSequences() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }
}
