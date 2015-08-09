package org.openide.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public final class EditableProperties extends AbstractMap<String, String> implements Cloneable {

    private static class Item implements Cloneable {

        private static List<String> EMPTY_LIST;
        private List<String> commentLines;
        private List<String> keyValueLines;
        private String key;
        private String value;
        private boolean separate;

        private Item() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        public Item(List<String> commentLines) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: invokeinterface java/util/List.isEmpty:()Z
             * 11: ifeq          20
             * 14: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 17: goto          28
             * 20: new           java/util/ArrayList
             * 23: dup
             * 24: aload_1
             * 25: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
             * 28: putfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 31: return
             *  */
            // </editor-fold>
        }

        public Item(List<String> commentLines, List<String> keyValueLines) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: invokeinterface java/util/List.isEmpty:()Z
             * 11: ifeq          20
             * 14: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 17: goto          28
             * 20: new           java/util/ArrayList
             * 23: dup
             * 24: aload_1
             * 25: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
             * 28: putfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 31: aload_0
             * 32: aload_2
             * 33: invokeinterface java/util/List.isEmpty:()Z
             * 38: ifeq          47
             * 41: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 44: goto          55
             * 47: new           java/util/ArrayList
             * 50: dup
             * 51: aload_2
             * 52: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
             * 55: putfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 58: aload_0
             * 59: aload_2
             * 60: invokespecial org/openide/util/EditableProperties$Item.parse:(Ljava/util/List;)V
             * 63: return
             *  */
            // </editor-fold>
        }

        public Item(String key, String value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 14: return
             *  */
            // </editor-fold>
        }

        public Item(String key, List<String> value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 9: aload_0
             * 10: aload_2
             * 11: invokevirtual org/openide/util/EditableProperties$Item.setValue:(Ljava/util/List;)V
             * 14: return
             *  */
            // </editor-fold>
        }

        void addCommentLines(List<String> lines) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     org/openide/util/EditableProperties$Item.$assertionsDisabled:Z
             * 3: ifne          21
             * 6: aload_0
             * 7: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 10: ifnull        21
             * 13: new           java/lang/AssertionError
             * 16: dup
             * 17: invokespecial java/lang/AssertionError."<init>":()V
             * 20: athrow
             * 21: aload_0
             * 22: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 25: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 28: if_acmpne     55
             * 31: aload_1
             * 32: invokeinterface java/util/List.isEmpty:()Z
             * 37: ifne          66
             * 40: aload_0
             * 41: new           java/util/ArrayList
             * 44: dup
             * 45: aload_1
             * 46: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
             * 49: putfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 52: goto          66
             * 55: aload_0
             * 56: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 59: aload_1
             * 60: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
             * 65: pop
             * 66: return
             *  */
            // </editor-fold>
        }

        public String[] getComment() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 4: invokeinterface java/util/List.size:()I
             * 9: anewarray     java/lang/String
             * 12: astore_1
             * 13: iconst_0
             * 14: istore_2
             * 15: iload_2
             * 16: aload_1
             * 17: arraylength
             * 18: if_icmpge     46
             * 21: aload_1
             * 22: iload_2
             * 23: aload_0
             * 24: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 27: iload_2
             * 28: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
             * 33: checkcast     java/lang/String
             * 36: invokestatic  org/openide/util/EditableProperties$Item.decodeUnicode:(Ljava/lang/String;)Ljava/lang/String;
             * 39: aastore
             * 40: iinc          2, 1
             * 43: goto          15
             * 46: aload_1
             * 47: areturn
             *  */
            // </editor-fold>
        }

        public void setComment(String[] commentLines, boolean separate) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iload_2
             * 2: putfield      org/openide/util/EditableProperties$Item.separate:Z
             * 5: aload_1
             * 6: arraylength
             * 7: ifle          56
             * 10: aload_0
             * 11: new           java/util/ArrayList
             * 14: dup
             * 15: aload_1
             * 16: arraylength
             * 17: invokespecial java/util/ArrayList."<init>":(I)V
             * 20: putfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 23: iconst_0
             * 24: istore_3
             * 25: iload_3
             * 26: aload_1
             * 27: arraylength
             * 28: if_icmpge     53
             * 31: aload_0
             * 32: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 35: aload_1
             * 36: iload_3
             * 37: aaload
             * 38: invokestatic  org/openide/util/EditableProperties$Item.encodeUnicode:(Ljava/lang/String;)Ljava/lang/String;
             * 41: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
             * 46: pop
             * 47: iinc          3, 1
             * 50: goto          25
             * 53: goto          63
             * 56: aload_0
             * 57: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 60: putfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 63: return
             *  */
            // </editor-fold>
        }

        public String getKey() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public String getValue() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 4: areturn
             *  */
            // </editor-fold>
        }

        public void setValue(String value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: putfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 5: aload_0
             * 6: aconst_null
             * 7: putfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 10: return
             *  */
            // </editor-fold>
        }

        public void setValue(List<String> value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial java/lang/StringBuilder."<init>":()V
             * 7: astore_2
             * 8: new           java/util/ArrayList
             * 11: dup
             * 12: invokespecial java/util/ArrayList."<init>":()V
             * 15: astore_3
             * 16: aload_1
             * 17: invokeinterface java/util/List.isEmpty:()Z
             * 22: ifne          174
             * 25: aload_3
             * 26: new           java/lang/StringBuilder
             * 29: dup
             * 30: invokespecial java/lang/StringBuilder."<init>":()V
             * 33: aload_0
             * 34: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 37: iconst_1
             * 38: invokestatic  org/openide/util/EditableProperties$Item.encode:(Ljava/lang/String;Z)Ljava/lang/String;
             * 41: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 44: ldc           =\
             * 46: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 49: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 52: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
             * 57: pop
             * 58: aload_1
             * 59: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
             * 64: astore        4
             * 66: aload         4
             * 68: invokeinterface java/util/Iterator.hasNext:()Z
             * 73: ifeq          171
             * 76: aload         4
             * 78: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 83: checkcast     java/lang/String
             * 86: astore        5
             * 88: aload_2
             * 89: aload         5
             * 91: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 94: pop
             * 95: aload         5
             * 97: iconst_0
             * 98: invokestatic  org/openide/util/EditableProperties$Item.encode:(Ljava/lang/String;Z)Ljava/lang/String;
             * 101: astore        5
             * 103: aload_3
             * 104: aload         4
             * 106: invokeinterface java/util/Iterator.hasNext:()Z
             * 111: ifeq          142
             * 114: new           java/lang/StringBuilder
             * 117: dup
             * 118: invokespecial java/lang/StringBuilder."<init>":()V
             * 121: ldc
             * 123: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 126: aload         5
             * 128: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 131: bipush        92
             * 133: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 136: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 139: goto          162
             * 142: new           java/lang/StringBuilder
             * 145: dup
             * 146: invokespecial java/lang/StringBuilder."<init>":()V
             * 149: ldc
             * 151: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 154: aload         5
             * 156: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 159: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 162: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
             * 167: pop
             * 168: goto          66
             * 171: goto          207
             * 174: aload_3
             * 175: new           java/lang/StringBuilder
             * 178: dup
             * 179: invokespecial java/lang/StringBuilder."<init>":()V
             * 182: aload_0
             * 183: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 186: iconst_1
             * 187: invokestatic  org/openide/util/EditableProperties$Item.encode:(Ljava/lang/String;Z)Ljava/lang/String;
             * 190: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 193: bipush        61
             * 195: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 198: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 201: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
             * 206: pop
             * 207: aload_0
             * 208: aload_2
             * 209: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 212: putfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 215: aload_0
             * 216: aload_3
             * 217: invokeinterface java/util/List.isEmpty:()Z
             * 222: ifeq          231
             * 225: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 228: goto          232
             * 231: aload_3
             * 232: putfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 235: return
             *  */
            // </editor-fold>
        }

        public boolean isSeparate() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$Item.separate:Z
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public List<String> getRawData() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/util/ArrayList
             * 3: dup
             * 4: invokespecial java/util/ArrayList."<init>":()V
             * 7: astore_1
             * 8: aload_0
             * 9: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 12: ifnull        26
             * 15: aload_1
             * 16: aload_0
             * 17: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 20: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
             * 25: pop
             * 26: aload_0
             * 27: getfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 30: ifnonnull     105
             * 33: aload_0
             * 34: new           java/util/ArrayList
             * 37: dup
             * 38: invokespecial java/util/ArrayList."<init>":()V
             * 41: putfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 44: aload_0
             * 45: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 48: ifnull        105
             * 51: aload_0
             * 52: getfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 55: ifnull        105
             * 58: aload_0
             * 59: getfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 62: new           java/lang/StringBuilder
             * 65: dup
             * 66: invokespecial java/lang/StringBuilder."<init>":()V
             * 69: aload_0
             * 70: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 73: iconst_1
             * 74: invokestatic  org/openide/util/EditableProperties$Item.encode:(Ljava/lang/String;Z)Ljava/lang/String;
             * 77: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 80: ldc           =
             * 82: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 85: aload_0
             * 86: getfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 89: iconst_0
             * 90: invokestatic  org/openide/util/EditableProperties$Item.encode:(Ljava/lang/String;Z)Ljava/lang/String;
             * 93: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 96: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 99: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
             * 104: pop
             * 105: aload_1
             * 106: aload_0
             * 107: getfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 110: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
             * 115: pop
             * 116: aload_1
             * 117: areturn
             *  */
            // </editor-fold>
        }

        private void parse(List<String> keyValueLines) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokestatic  org/openide/util/EditableProperties$Item.mergeLines:(Ljava/util/List;)Ljava/lang/String;
             * 4: astore_2
             * 5: aload_0
             * 6: aload_2
             * 7: invokespecial org/openide/util/EditableProperties$Item.splitKeyValue:(Ljava/lang/String;)V
             * 10: return
             *  */
            // </editor-fold>
        }

        private static String mergeLines(List<String> lines) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokeinterface java/util/List.size:()I
             * 6: iconst_1
             * 7: if_icmpne     24
             * 10: aload_0
             * 11: iconst_0
             * 12: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
             * 17: checkcast     java/lang/String
             * 20: invokestatic  org/openide/util/EditableProperties.access$000:(Ljava/lang/String;)Ljava/lang/String;
             * 23: areturn
             * 24: new           java/lang/StringBuilder
             * 27: dup
             * 28: invokespecial java/lang/StringBuilder."<init>":()V
             * 31: astore_1
             * 32: aload_0
             * 33: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
             * 38: astore_2
             * 39: aload_2
             * 40: invokeinterface java/util/Iterator.hasNext:()Z
             * 45: ifeq          115
             * 48: aload_2
             * 49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 54: checkcast     java/lang/String
             * 57: invokestatic  org/openide/util/EditableProperties.access$000:(Ljava/lang/String;)Ljava/lang/String;
             * 60: astore_3
             * 61: aload_2
             * 62: invokeinterface java/util/Iterator.hasNext:()Z
             * 67: ifeq          106
             * 70: getstatic     org/openide/util/EditableProperties$Item.$assertionsDisabled:Z
             * 73: ifne          94
             * 76: aload_3
             * 77: ldc           \
             * 79: invokevirtual java/lang/String.endsWith:(Ljava/lang/String;)Z
             * 82: ifne          94
             * 85: new           java/lang/AssertionError
             * 88: dup
             * 89: aload_0
             * 90: invokespecial java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
             * 93: athrow
             * 94: aload_3
             * 95: iconst_0
             * 96: aload_3
             * 97: invokevirtual java/lang/String.length:()I
             * 100: iconst_1
             * 101: isub
             * 102: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 105: astore_3
             * 106: aload_1
             * 107: aload_3
             * 108: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 111: pop
             * 112: goto          39
             * 115: aload_1
             * 116: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 119: areturn
             *  */
            // </editor-fold>
        }

        private void splitKeyValue(String line) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: aload_1
             * 3: invokevirtual java/lang/String.length:()I
             * 6: istore_3
             * 7: iload_2
             * 8: iload_3
             * 9: if_icmpge     109
             * 12: aload_1
             * 13: iload_2
             * 14: invokevirtual java/lang/String.charAt:(I)C
             * 17: istore        4
             * 19: iload         4
             * 21: bipush        92
             * 23: if_icmpne     32
             * 26: iinc          2, 1
             * 29: goto          103
             * 32: iload         4
             * 34: lookupswitch  { // 7
             * 9: 100
             * 10: 100
             * 12: 100
             * 13: 100
             * 32: 100
             * 58: 100
             * 61: 100
             * default: 103
             * }
             * 100: goto          109
             * 103: iinc          2, 1
             * 106: goto          7
             * 109: aload_0
             * 110: aload_1
             * 111: iconst_0
             * 112: iload_2
             * 113: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 116: invokestatic  org/openide/util/EditableProperties$Item.decode:(Ljava/lang/String;)Ljava/lang/String;
             * 119: putfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 122: aload_1
             * 123: iload_2
             * 124: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
             * 127: invokestatic  org/openide/util/EditableProperties.access$000:(Ljava/lang/String;)Ljava/lang/String;
             * 130: astore_1
             * 131: aload_1
             * 132: invokevirtual java/lang/String.length:()I
             * 135: ifne          145
             * 138: aload_0
             * 139: ldc
             * 141: putfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 144: return
             * 145: aload_1
             * 146: iconst_0
             * 147: invokevirtual java/lang/String.charAt:(I)C
             * 150: lookupswitch  { // 2
             * 58: 176
             * 61: 176
             * default: 185
             * }
             * 176: aload_1
             * 177: iconst_1
             * 178: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
             * 181: invokestatic  org/openide/util/EditableProperties.access$000:(Ljava/lang/String;)Ljava/lang/String;
             * 184: astore_1
             * 185: aload_0
             * 186: aload_1
             * 187: invokestatic  org/openide/util/EditableProperties$Item.decode:(Ljava/lang/String;)Ljava/lang/String;
             * 190: putfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 193: return
             *  */
            // </editor-fold>
        }

        private static String decode(String input) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: bipush        92
             * 3: invokevirtual java/lang/String.indexOf:(I)I
             * 6: iconst_m1
             * 7: if_icmpne     12
             * 10: aload_0
             * 11: areturn
             * 12: aload_0
             * 13: invokevirtual java/lang/String.length:()I
             * 16: istore_2
             * 17: new           java/lang/StringBuilder
             * 20: dup
             * 21: iload_2
             * 22: invokespecial java/lang/StringBuilder."<init>":(I)V
             * 25: astore_3
             * 26: iconst_0
             * 27: istore        4
             * 29: iload         4
             * 31: iload_2
             * 32: if_icmpge     221
             * 35: aload_0
             * 36: iload         4
             * 38: invokevirtual java/lang/String.charAt:(I)C
             * 41: istore_1
             * 42: iload_1
             * 43: bipush        92
             * 45: if_icmpeq     57
             * 48: aload_3
             * 49: iload_1
             * 50: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 53: pop
             * 54: goto          215
             * 57: iinc          4, 1
             * 60: iload         4
             * 62: iload_2
             * 63: if_icmpne     69
             * 66: goto          215
             * 69: aload_0
             * 70: iload         4
             * 72: invokevirtual java/lang/String.charAt:(I)C
             * 75: istore_1
             * 76: iload_1
             * 77: bipush        117
             * 79: if_icmpne     164
             * 82: iload         4
             * 84: iconst_5
             * 85: iadd
             * 86: iload_2
             * 87: if_icmple     109
             * 90: aload_3
             * 91: aload_0
             * 92: iload         4
             * 94: iconst_1
             * 95: isub
             * 96: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
             * 99: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 102: pop
             * 103: iinc          4, 4
             * 106: goto          215
             * 109: aload_0
             * 110: iload         4
             * 112: iconst_1
             * 113: iadd
             * 114: iload         4
             * 116: iconst_5
             * 117: iadd
             * 118: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 121: astore        5
             * 123: aload_3
             * 124: aload         5
             * 126: bipush        16
             * 128: invokestatic  java/lang/Integer.parseInt:(Ljava/lang/String;I)I
             * 131: i2c
             * 132: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 135: pop
             * 136: goto          158
             * 139: astore        6
             * 141: aload_3
             * 142: aload_0
             * 143: iload         4
             * 145: iconst_1
             * 146: isub
             * 147: iload         4
             * 149: iconst_5
             * 150: iadd
             * 151: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 154: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 157: pop
             * 158: iinc          4, 4
             * 161: goto          215
             * 164: iload_1
             * 165: bipush        116
             * 167: if_icmpne     176
             * 170: bipush        9
             * 172: istore_1
             * 173: goto          209
             * 176: iload_1
             * 177: bipush        114
             * 179: if_icmpne     188
             * 182: bipush        13
             * 184: istore_1
             * 185: goto          209
             * 188: iload_1
             * 189: bipush        110
             * 191: if_icmpne     200
             * 194: bipush        10
             * 196: istore_1
             * 197: goto          209
             * 200: iload_1
             * 201: bipush        102
             * 203: if_icmpne     209
             * 206: bipush        12
             * 208: istore_1
             * 209: aload_3
             * 210: iload_1
             * 211: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 214: pop
             * 215: iinc          4, 1
             * 218: goto          29
             * 221: aload_3
             * 222: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 225: areturn
             * Exception table:
             * from    to  target type
             * 123   136   139   Class java/lang/NumberFormatException
             *  */
            // </editor-fold>
        }

        private static String encode(String input, boolean forKey) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual java/lang/String.length:()I
             * 4: istore_2
             * 5: new           java/lang/StringBuilder
             * 8: dup
             * 9: iload_2
             * 10: iconst_2
             * 11: imul
             * 12: invokespecial java/lang/StringBuilder."<init>":(I)V
             * 15: astore_3
             * 16: iconst_0
             * 17: istore        4
             * 19: iload         4
             * 21: iload_2
             * 22: if_icmpge     314
             * 25: aload_0
             * 26: iload         4
             * 28: invokevirtual java/lang/String.charAt:(I)C
             * 31: istore        5
             * 33: iload         5
             * 35: lookupswitch  { // 9
             * 9: 174
             * 10: 184
             * 12: 204
             * 13: 194
             * 32: 116
             * 35: 142
             * 58: 214
             * 61: 214
             * 92: 164
             * default: 235
             * }
             * 116: iload         4
             * 118: ifeq          125
             * 121: iload_1
             * 122: ifeq          132
             * 125: aload_3
             * 126: bipush        92
             * 128: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 131: pop
             * 132: aload_3
             * 133: iload         5
             * 135: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 138: pop
             * 139: goto          308
             * 142: iload         4
             * 144: ifne          154
             * 147: aload_3
             * 148: bipush        92
             * 150: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 153: pop
             * 154: aload_3
             * 155: iload         5
             * 157: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 160: pop
             * 161: goto          308
             * 164: aload_3
             * 165: ldc           \\
             * 167: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 170: pop
             * 171: goto          308
             * 174: aload_3
             * 175: ldc           \t
             * 177: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 180: pop
             * 181: goto          308
             * 184: aload_3
             * 185: ldc           \n
             * 187: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 190: pop
             * 191: goto          308
             * 194: aload_3
             * 195: ldc           \r
             * 197: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 200: pop
             * 201: goto          308
             * 204: aload_3
             * 205: ldc           \f
             * 207: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 210: pop
             * 211: goto          308
             * 214: iload_1
             * 215: ifeq          225
             * 218: aload_3
             * 219: bipush        92
             * 221: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 224: pop
             * 225: aload_3
             * 226: iload         5
             * 228: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 231: pop
             * 232: goto          308
             * 235: iload         5
             * 237: bipush        32
             * 239: if_icmplt     249
             * 242: iload         5
             * 244: bipush        126
             * 246: if_icmple     301
             * 249: aload_3
             * 250: ldc           \u
             * 252: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 255: pop
             * 256: iload         5
             * 258: invokestatic  java/lang/Integer.toHexString:(I)Ljava/lang/String;
             * 261: astore        6
             * 263: iconst_0
             * 264: istore        7
             * 266: iload         7
             * 268: iconst_4
             * 269: aload         6
             * 271: invokevirtual java/lang/String.length:()I
             * 274: isub
             * 275: if_icmpge     291
             * 278: aload_3
             * 279: bipush        48
             * 281: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 284: pop
             * 285: iinc          7, 1
             * 288: goto          266
             * 291: aload_3
             * 292: aload         6
             * 294: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 297: pop
             * 298: goto          308
             * 301: aload_3
             * 302: iload         5
             * 304: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 307: pop
             * 308: iinc          4, 1
             * 311: goto          19
             * 314: aload_3
             * 315: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 318: areturn
             *  */
            // </editor-fold>
        }

        private static String decodeUnicode(String input) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual java/lang/String.length:()I
             * 4: istore_2
             * 5: new           java/lang/StringBuilder
             * 8: dup
             * 9: iload_2
             * 10: invokespecial java/lang/StringBuilder."<init>":(I)V
             * 13: astore_3
             * 14: iconst_0
             * 15: istore        4
             * 17: iload         4
             * 19: iload_2
             * 20: if_icmpge     164
             * 23: aload_0
             * 24: iload         4
             * 26: invokevirtual java/lang/String.charAt:(I)C
             * 29: istore_1
             * 30: iload_1
             * 31: bipush        92
             * 33: if_icmpeq     45
             * 36: aload_3
             * 37: iload_1
             * 38: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 41: pop
             * 42: goto          158
             * 45: iinc          4, 1
             * 48: iload         4
             * 50: iload_2
             * 51: if_icmpne     57
             * 54: goto          158
             * 57: aload_0
             * 58: iload         4
             * 60: invokevirtual java/lang/String.charAt:(I)C
             * 63: istore_1
             * 64: iload_1
             * 65: bipush        117
             * 67: if_icmpne     152
             * 70: iload         4
             * 72: iconst_5
             * 73: iadd
             * 74: iload_2
             * 75: if_icmple     97
             * 78: aload_3
             * 79: aload_0
             * 80: iload         4
             * 82: iconst_1
             * 83: isub
             * 84: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
             * 87: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 90: pop
             * 91: iinc          4, 4
             * 94: goto          158
             * 97: aload_0
             * 98: iload         4
             * 100: iconst_1
             * 101: iadd
             * 102: iload         4
             * 104: iconst_5
             * 105: iadd
             * 106: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 109: astore        5
             * 111: aload_3
             * 112: aload         5
             * 114: bipush        16
             * 116: invokestatic  java/lang/Integer.parseInt:(Ljava/lang/String;I)I
             * 119: i2c
             * 120: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 123: pop
             * 124: goto          146
             * 127: astore        6
             * 129: aload_3
             * 130: aload_0
             * 131: iload         4
             * 133: iconst_1
             * 134: isub
             * 135: iload         4
             * 137: iconst_5
             * 138: iadd
             * 139: invokevirtual java/lang/String.substring:(II)Ljava/lang/String;
             * 142: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 145: pop
             * 146: iinc          4, 4
             * 149: goto          158
             * 152: aload_3
             * 153: iload_1
             * 154: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 157: pop
             * 158: iinc          4, 1
             * 161: goto          17
             * 164: aload_3
             * 165: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 168: areturn
             * Exception table:
             * from    to  target type
             * 111   124   127   Class java/lang/NumberFormatException
             *  */
            // </editor-fold>
        }

        private static String encodeUnicode(String input) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokevirtual java/lang/String.length:()I
             * 4: istore_1
             * 5: new           java/lang/StringBuilder
             * 8: dup
             * 9: iload_1
             * 10: iconst_2
             * 11: imul
             * 12: invokespecial java/lang/StringBuilder."<init>":(I)V
             * 15: astore_2
             * 16: iconst_0
             * 17: istore_3
             * 18: iload_3
             * 19: iload_1
             * 20: if_icmpge     109
             * 23: aload_0
             * 24: iload_3
             * 25: invokevirtual java/lang/String.charAt:(I)C
             * 28: istore        4
             * 30: iload         4
             * 32: bipush        32
             * 34: if_icmplt     44
             * 37: iload         4
             * 39: bipush        126
             * 41: if_icmple     96
             * 44: aload_2
             * 45: ldc           \u
             * 47: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 50: pop
             * 51: iload         4
             * 53: invokestatic  java/lang/Integer.toHexString:(I)Ljava/lang/String;
             * 56: astore        5
             * 58: iconst_0
             * 59: istore        6
             * 61: iload         6
             * 63: iconst_4
             * 64: aload         5
             * 66: invokevirtual java/lang/String.length:()I
             * 69: isub
             * 70: if_icmpge     86
             * 73: aload_2
             * 74: bipush        48
             * 76: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 79: pop
             * 80: iinc          6, 1
             * 83: goto          61
             * 86: aload_2
             * 87: aload         5
             * 89: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 92: pop
             * 93: goto          103
             * 96: aload_2
             * 97: iload         4
             * 99: invokevirtual java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
             * 102: pop
             * 103: iinc          3, 1
             * 106: goto          18
             * 109: aload_2
             * 110: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 113: areturn
             *  */
            // </editor-fold>
        }

        public Object clone() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           org/openide/util/EditableProperties$Item
             * 3: dup
             * 4: invokespecial org/openide/util/EditableProperties$Item."<init>":()V
             * 7: astore_1
             * 8: aload_0
             * 9: getfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 12: ifnull        48
             * 15: aload_1
             * 16: aload_0
             * 17: getfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 20: invokeinterface java/util/List.isEmpty:()Z
             * 25: ifeq          34
             * 28: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 31: goto          45
             * 34: new           java/util/ArrayList
             * 37: dup
             * 38: aload_0
             * 39: getfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 42: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
             * 45: putfield      org/openide/util/EditableProperties$Item.keyValueLines:Ljava/util/List;
             * 48: aload_0
             * 49: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 52: ifnull        88
             * 55: aload_1
             * 56: aload_0
             * 57: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 60: invokeinterface java/util/List.isEmpty:()Z
             * 65: ifeq          74
             * 68: getstatic     org/openide/util/EditableProperties$Item.EMPTY_LIST:Ljava/util/List;
             * 71: goto          85
             * 74: new           java/util/ArrayList
             * 77: dup
             * 78: aload_0
             * 79: getfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 82: invokespecial java/util/ArrayList."<init>":(Ljava/util/Collection;)V
             * 85: putfield      org/openide/util/EditableProperties$Item.commentLines:Ljava/util/List;
             * 88: aload_1
             * 89: aload_0
             * 90: getfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 93: putfield      org/openide/util/EditableProperties$Item.key:Ljava/lang/String;
             * 96: aload_1
             * 97: aload_0
             * 98: getfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 101: putfield      org/openide/util/EditableProperties$Item.value:Ljava/lang/String;
             * 104: aload_1
             * 105: aload_0
             * 106: getfield      org/openide/util/EditableProperties$Item.separate:Z
             * 109: putfield      org/openide/util/EditableProperties$Item.separate:Z
             * 112: aload_1
             * 113: areturn
             *  */
            // </editor-fold>
        }
    }

    private class IteratorImpl implements Iterator<Entry<String, String>> {

        private ListIterator<Item> delegate;

        public IteratorImpl() {
            // compiled code
        }

        public boolean hasNext() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/util/EditableProperties$IteratorImpl.findNext:()Lorg/openide/util/EditableProperties$Item;
             * 4: ifnull        11
             * 7: iconst_1
             * 8: goto          12
             * 11: iconst_0
             * 12: ireturn
             *  */
            // </editor-fold>
        }

        public Entry<String, String> next() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial org/openide/util/EditableProperties$IteratorImpl.findNext:()Lorg/openide/util/EditableProperties$Item;
             * 4: astore_1
             * 5: aload_1
             * 6: ifnonnull     17
             * 9: new           java/util/NoSuchElementException
             * 12: dup
             * 13: invokespecial java/util/NoSuchElementException."<init>":()V
             * 16: athrow
             * 17: aload_0
             * 18: getfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 21: invokeinterface java/util/ListIterator.next:()Ljava/lang/Object;
             * 26: pop
             * 27: new           org/openide/util/EditableProperties$MapEntryImpl
             * 30: dup
             * 31: aload_0
             * 32: getfield      org/openide/util/EditableProperties$IteratorImpl.this$0:Lorg/openide/util/EditableProperties;
             * 35: aload_1
             * 36: invokespecial org/openide/util/EditableProperties$MapEntryImpl."<init>":(Lorg/openide/util/EditableProperties;Lorg/openide/util/EditableProperties$Item;)V
             * 39: areturn
             *  */
            // </editor-fold>
        }

        public void remove() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 4: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
             * 9: pop
             * 10: aload_0
             * 11: invokespecial org/openide/util/EditableProperties$IteratorImpl.findNext:()Lorg/openide/util/EditableProperties$Item;
             * 14: astore_1
             * 15: aload_1
             * 16: ifnonnull     27
             * 19: new           java/lang/IllegalStateException
             * 22: dup
             * 23: invokespecial java/lang/IllegalStateException."<init>":()V
             * 26: athrow
             * 27: aload_0
             * 28: getfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 31: invokeinterface java/util/ListIterator.nextIndex:()I
             * 36: istore_2
             * 37: aload_0
             * 38: getfield      org/openide/util/EditableProperties$IteratorImpl.this$0:Lorg/openide/util/EditableProperties;
             * 41: invokestatic  org/openide/util/EditableProperties.access$200:(Lorg/openide/util/EditableProperties;)V
             * 44: aload_0
             * 45: getfield      org/openide/util/EditableProperties$IteratorImpl.this$0:Lorg/openide/util/EditableProperties;
             * 48: invokestatic  org/openide/util/EditableProperties.access$100:(Lorg/openide/util/EditableProperties;)Lorg/openide/util/EditableProperties$State;
             * 51: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 54: iload_2
             * 55: invokevirtual java/util/LinkedList.remove:(I)Ljava/lang/Object;
             * 58: checkcast     org/openide/util/EditableProperties$Item
             * 61: astore_3
             * 62: getstatic     org/openide/util/EditableProperties$IteratorImpl.$assertionsDisabled:Z
             * 65: ifne          90
             * 68: aload_3
             * 69: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 72: aload_1
             * 73: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 76: invokevirtual java/lang/String.equals:(Ljava/lang/Object;)Z
             * 79: ifne          90
             * 82: new           java/lang/AssertionError
             * 85: dup
             * 86: invokespecial java/lang/AssertionError."<init>":()V
             * 89: athrow
             * 90: aload_0
             * 91: getfield      org/openide/util/EditableProperties$IteratorImpl.this$0:Lorg/openide/util/EditableProperties;
             * 94: invokestatic  org/openide/util/EditableProperties.access$100:(Lorg/openide/util/EditableProperties;)Lorg/openide/util/EditableProperties$State;
             * 97: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
             * 100: aload_1
             * 101: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 104: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
             * 109: pop
             * 110: aload_0
             * 111: aload_0
             * 112: getfield      org/openide/util/EditableProperties$IteratorImpl.this$0:Lorg/openide/util/EditableProperties;
             * 115: invokestatic  org/openide/util/EditableProperties.access$100:(Lorg/openide/util/EditableProperties;)Lorg/openide/util/EditableProperties$State;
             * 118: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 121: iload_2
             * 122: invokevirtual java/util/LinkedList.listIterator:(I)Ljava/util/ListIterator;
             * 125: putfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 128: return
             *  */
            // </editor-fold>
        }

        private Item findNext() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 4: invokeinterface java/util/ListIterator.hasNext:()Z
             * 9: ifeq          54
             * 12: aload_0
             * 13: getfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 16: invokeinterface java/util/ListIterator.next:()Ljava/lang/Object;
             * 21: checkcast     org/openide/util/EditableProperties$Item
             * 24: astore_1
             * 25: aload_1
             * 26: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 29: ifnull        51
             * 32: aload_1
             * 33: invokevirtual org/openide/util/EditableProperties$Item.getValue:()Ljava/lang/String;
             * 36: ifnull        51
             * 39: aload_0
             * 40: getfield      org/openide/util/EditableProperties$IteratorImpl.delegate:Ljava/util/ListIterator;
             * 43: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
             * 48: pop
             * 49: aload_1
             * 50: areturn
             * 51: goto          0
             * 54: aconst_null
             * 55: areturn
             *  */
            // </editor-fold>
        }
    }

    private class MapEntryImpl implements Entry<String, String> {

        private Item item;

        public MapEntryImpl(Item item) {
            // compiled code
        }

        public String getKey() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$MapEntryImpl.item:Lorg/openide/util/EditableProperties$Item;
             * 4: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 7: areturn
             *  */
            // </editor-fold>
        }

        public String getValue() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$MapEntryImpl.item:Lorg/openide/util/EditableProperties$Item;
             * 4: invokevirtual org/openide/util/EditableProperties$Item.getValue:()Ljava/lang/String;
             * 7: areturn
             *  */
            // </editor-fold>
        }

        public String setValue(String value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$MapEntryImpl.this$0:Lorg/openide/util/EditableProperties;
             * 4: invokestatic  org/openide/util/EditableProperties.access$200:(Lorg/openide/util/EditableProperties;)V
             * 7: aload_0
             * 8: aload_0
             * 9: getfield      org/openide/util/EditableProperties$MapEntryImpl.this$0:Lorg/openide/util/EditableProperties;
             * 12: invokestatic  org/openide/util/EditableProperties.access$100:(Lorg/openide/util/EditableProperties;)Lorg/openide/util/EditableProperties$State;
             * 15: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
             * 18: aload_0
             * 19: getfield      org/openide/util/EditableProperties$MapEntryImpl.item:Lorg/openide/util/EditableProperties$Item;
             * 22: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 25: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
             * 30: checkcast     org/openide/util/EditableProperties$Item
             * 33: putfield      org/openide/util/EditableProperties$MapEntryImpl.item:Lorg/openide/util/EditableProperties$Item;
             * 36: aload_0
             * 37: getfield      org/openide/util/EditableProperties$MapEntryImpl.item:Lorg/openide/util/EditableProperties$Item;
             * 40: invokevirtual org/openide/util/EditableProperties$Item.getValue:()Ljava/lang/String;
             * 43: astore_2
             * 44: aload_0
             * 45: getfield      org/openide/util/EditableProperties$MapEntryImpl.item:Lorg/openide/util/EditableProperties$Item;
             * 48: aload_1
             * 49: invokevirtual org/openide/util/EditableProperties$Item.setValue:(Ljava/lang/String;)V
             * 52: aload_2
             * 53: areturn
             *  */
            // </editor-fold>
        }
    }

    private class SetImpl extends AbstractSet<Entry<String, String>> {

        public SetImpl() {
            // compiled code
        }

        public Iterator<Entry<String, String>> iterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           org/openide/util/EditableProperties$IteratorImpl
             * 3: dup
             * 4: aload_0
             * 5: getfield      org/openide/util/EditableProperties$SetImpl.this$0:Lorg/openide/util/EditableProperties;
             * 8: invokespecial org/openide/util/EditableProperties$IteratorImpl."<init>":(Lorg/openide/util/EditableProperties;)V
             * 11: areturn
             *  */
            // </editor-fold>
        }

        public int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/EditableProperties$SetImpl.this$0:Lorg/openide/util/EditableProperties;
             * 4: invokestatic  org/openide/util/EditableProperties.access$100:(Lorg/openide/util/EditableProperties;)Lorg/openide/util/EditableProperties$State;
             * 7: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 10: invokevirtual java/util/LinkedList.size:()I
             * 13: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static class State {

        boolean shared;
        final LinkedList<Item> items;
        final Map<String, Item> itemIndex;

        State() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: new           java/util/LinkedList
             * 8: dup
             * 9: invokespecial java/util/LinkedList."<init>":()V
             * 12: putfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 15: aload_0
             * 16: new           java/util/HashMap
             * 19: dup
             * 20: invokespecial java/util/HashMap."<init>":()V
             * 23: putfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
             * 26: return
             *  */
            // </editor-fold>
        }

        State(State original) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: new           java/util/LinkedList
             * 8: dup
             * 9: invokespecial java/util/LinkedList."<init>":()V
             * 12: putfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 15: aload_0
             * 16: new           java/util/HashMap
             * 19: dup
             * 20: aload_1
             * 21: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 24: invokevirtual java/util/LinkedList.size:()I
             * 27: iconst_4
             * 28: imul
             * 29: iconst_3
             * 30: idiv
             * 31: iconst_1
             * 32: iadd
             * 33: invokespecial java/util/HashMap."<init>":(I)V
             * 36: putfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
             * 39: aload_1
             * 40: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 43: invokevirtual java/util/LinkedList.iterator:()Ljava/util/Iterator;
             * 46: astore_2
             * 47: aload_2
             * 48: invokeinterface java/util/Iterator.hasNext:()Z
             * 53: ifeq          105
             * 56: aload_2
             * 57: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 62: checkcast     org/openide/util/EditableProperties$Item
             * 65: astore_3
             * 66: aload_3
             * 67: invokevirtual org/openide/util/EditableProperties$Item.clone:()Ljava/lang/Object;
             * 70: checkcast     org/openide/util/EditableProperties$Item
             * 73: astore        4
             * 75: aload_0
             * 76: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
             * 79: aload         4
             * 81: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
             * 84: pop
             * 85: aload_0
             * 86: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
             * 89: aload         4
             * 91: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
             * 94: aload         4
             * 96: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
             * 101: pop
             * 102: goto          47
             * 105: return
             *  */
            // </editor-fold>
        }
    }
    private State state;
    private final boolean alphabetize;
    private static final String INDENT = "    ";
    private static final int WAITING_FOR_KEY_VALUE = 1;
    private static final int READING_KEY_VALUE = 2;

    public EditableProperties(boolean alphabetize) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/util/AbstractMap."<init>":()V
         * 4: aload_0
         * 5: iload_1
         * 6: putfield      org/openide/util/EditableProperties.alphabetize:Z
         * 9: aload_0
         * 10: new           org/openide/util/EditableProperties$State
         * 13: dup
         * 14: invokespecial org/openide/util/EditableProperties$State."<init>":()V
         * 17: putfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 20: return
         *  */
        // </editor-fold>
    }

    private EditableProperties(EditableProperties ep) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/util/AbstractMap."<init>":()V
         * 4: aload_0
         * 5: aload_1
         * 6: getfield      org/openide/util/EditableProperties.alphabetize:Z
         * 9: putfield      org/openide/util/EditableProperties.alphabetize:Z
         * 12: aload_0
         * 13: aload_1
         * 14: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 17: putfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 20: aload_0
         * 21: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 24: iconst_1
         * 25: putfield      org/openide/util/EditableProperties$State.shared:Z
         * 28: return
         *  */
        // </editor-fold>
    }

    private void writeOperation() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 4: getfield      org/openide/util/EditableProperties$State.shared:Z
         * 7: ifeq          25
         * 10: aload_0
         * 11: new           org/openide/util/EditableProperties$State
         * 14: dup
         * 15: aload_0
         * 16: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 19: invokespecial org/openide/util/EditableProperties$State."<init>":(Lorg/openide/util/EditableProperties$State;)V
         * 22: putfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 25: return
         *  */
        // </editor-fold>
    }

    public Set<Entry<String, String>> entrySet() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/EditableProperties$SetImpl
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/util/EditableProperties$SetImpl."<init>":(Lorg/openide/util/EditableProperties;)V
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public void load(InputStream stream) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_1
         * 1: istore_2
         * 2: new           java/io/BufferedReader
         * 5: dup
         * 6: new           java/io/InputStreamReader
         * 9: dup
         * 10: aload_1
         * 11: ldc           ISO-8859-1
         * 13: invokespecial java/io/InputStreamReader."<init>":(Ljava/io/InputStream;Ljava/lang/String;)V
         * 16: invokespecial java/io/BufferedReader."<init>":(Ljava/io/Reader;)V
         * 19: astore_3
         * 20: new           java/util/LinkedList
         * 23: dup
         * 24: invokespecial java/util/LinkedList."<init>":()V
         * 27: astore        4
         * 29: iconst_0
         * 30: istore        6
         * 32: aconst_null
         * 33: aload_3
         * 34: invokevirtual java/io/BufferedReader.readLine:()Ljava/lang/String;
         * 37: dup
         * 38: astore        5
         * 40: if_acmpeq     132
         * 43: aload         4
         * 45: aload         5
         * 47: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
         * 52: pop
         * 53: aload         5
         * 55: invokestatic  org/openide/util/EditableProperties.isEmpty:(Ljava/lang/String;)Z
         * 58: istore        7
         * 60: aload         5
         * 62: invokestatic  org/openide/util/EditableProperties.isComment:(Ljava/lang/String;)Z
         * 65: istore        8
         * 67: iload_2
         * 68: iconst_1
         * 69: if_icmpne     102
         * 72: iload         7
         * 74: ifeq          89
         * 77: aload_0
         * 78: aload         4
         * 80: invokespecial org/openide/util/EditableProperties.createNonKeyItem:(Ljava/util/List;)V
         * 83: iconst_0
         * 84: istore        6
         * 86: goto          102
         * 89: iload         8
         * 91: ifeq          100
         * 94: iinc          6, 1
         * 97: goto          102
         * 100: iconst_2
         * 101: istore_2
         * 102: iload_2
         * 103: iconst_2
         * 104: if_icmpne     129
         * 107: aload_0
         * 108: aload         5
         * 110: invokespecial org/openide/util/EditableProperties.isContinue:(Ljava/lang/String;)Z
         * 113: ifne          129
         * 116: aload_0
         * 117: aload         4
         * 119: iload         6
         * 121: invokespecial org/openide/util/EditableProperties.createKeyItem:(Ljava/util/List;I)V
         * 124: iconst_1
         * 125: istore_2
         * 126: iconst_0
         * 127: istore        6
         * 129: goto          32
         * 132: aload         4
         * 134: invokeinterface java/util/List.size:()I
         * 139: ifle          164
         * 142: iload_2
         * 143: iconst_2
         * 144: if_icmpne     158
         * 147: aload_0
         * 148: aload         4
         * 150: iload         6
         * 152: invokespecial org/openide/util/EditableProperties.createKeyItem:(Ljava/util/List;I)V
         * 155: goto          164
         * 158: aload_0
         * 159: aload         4
         * 161: invokespecial org/openide/util/EditableProperties.createNonKeyItem:(Ljava/util/List;)V
         * 164: return
         *  */
        // </editor-fold>
    }

    public void store(OutputStream stream) throws IOException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_1
         * 1: istore_2
         * 2: new           java/io/BufferedWriter
         * 5: dup
         * 6: new           java/io/OutputStreamWriter
         * 9: dup
         * 10: aload_1
         * 11: ldc           ISO-8859-1
         * 13: invokespecial java/io/OutputStreamWriter."<init>":(Ljava/io/OutputStream;Ljava/lang/String;)V
         * 16: invokespecial java/io/BufferedWriter."<init>":(Ljava/io/Writer;)V
         * 19: astore_3
         * 20: aload_0
         * 21: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 24: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
         * 27: invokevirtual java/util/LinkedList.iterator:()Ljava/util/Iterator;
         * 30: astore        4
         * 32: aload         4
         * 34: invokeinterface java/util/Iterator.hasNext:()Z
         * 39: ifeq          134
         * 42: aload         4
         * 44: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 49: checkcast     org/openide/util/EditableProperties$Item
         * 52: astore        5
         * 54: aload         5
         * 56: invokevirtual org/openide/util/EditableProperties$Item.isSeparate:()Z
         * 59: ifeq          70
         * 62: iload_2
         * 63: ifne          70
         * 66: aload_3
         * 67: invokevirtual java/io/BufferedWriter.newLine:()V
         * 70: aconst_null
         * 71: astore        6
         * 73: aload         5
         * 75: invokevirtual org/openide/util/EditableProperties$Item.getRawData:()Ljava/util/List;
         * 78: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
         * 83: astore        7
         * 85: aload         7
         * 87: invokeinterface java/util/Iterator.hasNext:()Z
         * 92: ifeq          120
         * 95: aload         7
         * 97: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 102: checkcast     java/lang/String
         * 105: astore        6
         * 107: aload_3
         * 108: aload         6
         * 110: invokevirtual java/io/BufferedWriter.write:(Ljava/lang/String;)V
         * 113: aload_3
         * 114: invokevirtual java/io/BufferedWriter.newLine:()V
         * 117: goto          85
         * 120: aload         6
         * 122: ifnull        131
         * 125: aload         6
         * 127: invokestatic  org/openide/util/EditableProperties.isEmpty:(Ljava/lang/String;)Z
         * 130: istore_2
         * 131: goto          32
         * 134: aload_3
         * 135: invokevirtual java/io/BufferedWriter.flush:()V
         * 138: return
         *  */
        // </editor-fold>
    }

    public String get(Object key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: instanceof    java/lang/String
         * 4: ifne          9
         * 7: aconst_null
         * 8: areturn
         * 9: aload_0
         * 10: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 13: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 16: aload_1
         * 17: checkcast     java/lang/String
         * 20: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 25: checkcast     org/openide/util/EditableProperties$Item
         * 28: astore_2
         * 29: aload_2
         * 30: ifnull        40
         * 33: aload_2
         * 34: invokevirtual org/openide/util/EditableProperties$Item.getValue:()Ljava/lang/String;
         * 37: goto          41
         * 40: aconst_null
         * 41: areturn
         *  */
        // </editor-fold>
    }

    public String put(String key, String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           key
         * 2: aload_1
         * 3: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 6: aload_1
         * 7: aload_2
         * 8: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 11: aload_0
         * 12: invokespecial org/openide/util/EditableProperties.writeOperation:()V
         * 15: aload_0
         * 16: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 19: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 22: aload_1
         * 23: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 28: checkcast     org/openide/util/EditableProperties$Item
         * 31: astore_3
         * 32: aconst_null
         * 33: astore        4
         * 35: aload_3
         * 36: ifnull        53
         * 39: aload_3
         * 40: invokevirtual org/openide/util/EditableProperties$Item.getValue:()Ljava/lang/String;
         * 43: astore        4
         * 45: aload_3
         * 46: aload_2
         * 47: invokevirtual org/openide/util/EditableProperties$Item.setValue:(Ljava/lang/String;)V
         * 50: goto          72
         * 53: new           org/openide/util/EditableProperties$Item
         * 56: dup
         * 57: aload_1
         * 58: aload_2
         * 59: invokespecial org/openide/util/EditableProperties$Item."<init>":(Ljava/lang/String;Ljava/lang/String;)V
         * 62: astore_3
         * 63: aload_0
         * 64: aload_3
         * 65: aload_0
         * 66: getfield      org/openide/util/EditableProperties.alphabetize:Z
         * 69: invokespecial org/openide/util/EditableProperties.addItem:(Lorg/openide/util/EditableProperties$Item;Z)V
         * 72: aload         4
         * 74: areturn
         *  */
        // </editor-fold>
    }

    public String getProperty(String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual org/openide/util/EditableProperties.get:(Ljava/lang/Object;)Ljava/lang/String;
         * 5: areturn
         *  */
        // </editor-fold>
    }

    public String setProperty(String key, String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: aload_2
         * 3: invokevirtual org/openide/util/EditableProperties.put:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 6: areturn
         *  */
        // </editor-fold>
    }

    public String setProperty(String key, String[] value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual org/openide/util/EditableProperties.get:(Ljava/lang/Object;)Ljava/lang/String;
         * 5: astore_3
         * 6: aload_1
         * 7: ifnull        14
         * 10: aload_2
         * 11: ifnonnull     22
         * 14: new           java/lang/NullPointerException
         * 17: dup
         * 18: invokespecial java/lang/NullPointerException."<init>":()V
         * 21: athrow
         * 22: aload_2
         * 23: invokestatic  java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         * 26: astore        4
         * 28: aload_0
         * 29: invokespecial org/openide/util/EditableProperties.writeOperation:()V
         * 32: aload_0
         * 33: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 36: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 39: aload_1
         * 40: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 45: checkcast     org/openide/util/EditableProperties$Item
         * 48: astore        5
         * 50: aload         5
         * 52: ifnull        65
         * 55: aload         5
         * 57: aload         4
         * 59: invokevirtual org/openide/util/EditableProperties$Item.setValue:(Ljava/util/List;)V
         * 62: goto          83
         * 65: aload_0
         * 66: new           org/openide/util/EditableProperties$Item
         * 69: dup
         * 70: aload_1
         * 71: aload         4
         * 73: invokespecial org/openide/util/EditableProperties$Item."<init>":(Ljava/lang/String;Ljava/util/List;)V
         * 76: aload_0
         * 77: getfield      org/openide/util/EditableProperties.alphabetize:Z
         * 80: invokespecial org/openide/util/EditableProperties.addItem:(Lorg/openide/util/EditableProperties$Item;Z)V
         * 83: aload_3
         * 84: areturn
         *  */
        // </editor-fold>
    }

    public String[] getComment(String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 4: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 7: aload_1
         * 8: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 13: checkcast     org/openide/util/EditableProperties$Item
         * 16: astore_2
         * 17: aload_2
         * 18: ifnonnull     26
         * 21: iconst_0
         * 22: anewarray     java/lang/String
         * 25: areturn
         * 26: aload_2
         * 27: invokevirtual org/openide/util/EditableProperties$Item.getComment:()[Ljava/lang/String;
         * 30: areturn
         *  */
        // </editor-fold>
    }

    public void setComment(String key, String[] comment, boolean separate) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial org/openide/util/EditableProperties.writeOperation:()V
         * 4: aload_0
         * 5: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 8: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 11: aload_1
         * 12: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 17: checkcast     org/openide/util/EditableProperties$Item
         * 20: astore        4
         * 22: aload         4
         * 24: ifnonnull     54
         * 27: new           java/lang/IllegalArgumentException
         * 30: dup
         * 31: new           java/lang/StringBuilder
         * 34: dup
         * 35: invokespecial java/lang/StringBuilder."<init>":()V
         * 38: ldc           Cannot set comment for non-existing property
         * 40: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 43: aload_1
         * 44: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 47: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 50: invokespecial java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 53: athrow
         * 54: aload         4
         * 56: aload_2
         * 57: iload_3
         * 58: invokevirtual org/openide/util/EditableProperties$Item.setComment:([Ljava/lang/String;Z)V
         * 61: return
         *  */
        // </editor-fold>
    }

    public Object clone() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual org/openide/util/EditableProperties.cloneProperties:()Lorg/openide/util/EditableProperties;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public EditableProperties cloneProperties() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/EditableProperties
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/util/EditableProperties."<init>":(Lorg/openide/util/EditableProperties;)V
         * 8: areturn
         *  */
        // </editor-fold>
    }

    private void createNonKeyItem(List<String> lines) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial org/openide/util/EditableProperties.writeOperation:()V
         * 4: aload_0
         * 5: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 8: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
         * 11: invokevirtual java/util/LinkedList.isEmpty:()Z
         * 14: ifne          50
         * 17: aload_0
         * 18: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 21: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
         * 24: invokevirtual java/util/LinkedList.getLast:()Ljava/lang/Object;
         * 27: checkcast     org/openide/util/EditableProperties$Item
         * 30: astore_2
         * 31: aload_2
         * 32: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
         * 35: ifnonnull     50
         * 38: aload_2
         * 39: aload_1
         * 40: invokevirtual org/openide/util/EditableProperties$Item.addCommentLines:(Ljava/util/List;)V
         * 43: aload_1
         * 44: invokeinterface java/util/List.clear:()V
         * 49: return
         * 50: new           org/openide/util/EditableProperties$Item
         * 53: dup
         * 54: aload_1
         * 55: invokespecial org/openide/util/EditableProperties$Item."<init>":(Ljava/util/List;)V
         * 58: astore_2
         * 59: aload_0
         * 60: aload_2
         * 61: iconst_0
         * 62: invokespecial org/openide/util/EditableProperties.addItem:(Lorg/openide/util/EditableProperties$Item;Z)V
         * 65: aload_1
         * 66: invokeinterface java/util/List.clear:()V
         * 71: return
         *  */
        // </editor-fold>
    }

    private void createKeyItem(List<String> lines, int commentLinesCount) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/EditableProperties$Item
         * 3: dup
         * 4: aload_1
         * 5: iconst_0
         * 6: iload_2
         * 7: invokeinterface java/util/List.subList:(II)Ljava/util/List;
         * 12: aload_1
         * 13: iload_2
         * 14: aload_1
         * 15: invokeinterface java/util/List.size:()I
         * 20: invokeinterface java/util/List.subList:(II)Ljava/util/List;
         * 25: invokespecial org/openide/util/EditableProperties$Item."<init>":(Ljava/util/List;Ljava/util/List;)V
         * 28: astore_3
         * 29: aload_0
         * 30: aload_3
         * 31: iconst_0
         * 32: invokespecial org/openide/util/EditableProperties.addItem:(Lorg/openide/util/EditableProperties$Item;Z)V
         * 35: aload_1
         * 36: invokeinterface java/util/List.clear:()V
         * 41: return
         *  */
        // </editor-fold>
    }

    private void addItem(Item item, boolean sort) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial org/openide/util/EditableProperties.writeOperation:()V
         * 4: aload_1
         * 5: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
         * 8: astore_3
         * 9: iload_2
         * 10: ifeq          117
         * 13: getstatic     org/openide/util/EditableProperties.$assertionsDisabled:Z
         * 16: ifne          31
         * 19: aload_3
         * 20: ifnonnull     31
         * 23: new           java/lang/AssertionError
         * 26: dup
         * 27: invokespecial java/lang/AssertionError."<init>":()V
         * 30: athrow
         * 31: aload_0
         * 32: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 35: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
         * 38: invokevirtual java/util/LinkedList.listIterator:()Ljava/util/ListIterator;
         * 41: astore        4
         * 43: aload         4
         * 45: invokeinterface java/util/ListIterator.hasNext:()Z
         * 50: ifeq          117
         * 53: aload         4
         * 55: invokeinterface java/util/ListIterator.next:()Ljava/lang/Object;
         * 60: checkcast     org/openide/util/EditableProperties$Item
         * 63: invokevirtual org/openide/util/EditableProperties$Item.getKey:()Ljava/lang/String;
         * 66: astore        5
         * 68: aload         5
         * 70: ifnull        114
         * 73: aload         5
         * 75: aload_3
         * 76: invokevirtual java/lang/String.compareToIgnoreCase:(Ljava/lang/String;)I
         * 79: ifle          114
         * 82: aload         4
         * 84: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
         * 89: pop
         * 90: aload         4
         * 92: aload_1
         * 93: invokeinterface java/util/ListIterator.add:(Ljava/lang/Object;)V
         * 98: aload_0
         * 99: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 102: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 105: aload_3
         * 106: aload_1
         * 107: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 112: pop
         * 113: return
         * 114: goto          43
         * 117: aload_0
         * 118: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 121: getfield      org/openide/util/EditableProperties$State.items:Ljava/util/LinkedList;
         * 124: aload_1
         * 125: invokevirtual java/util/LinkedList.add:(Ljava/lang/Object;)Z
         * 128: pop
         * 129: aload_3
         * 130: ifnull        148
         * 133: aload_0
         * 134: getfield      org/openide/util/EditableProperties.state:Lorg/openide/util/EditableProperties$State;
         * 137: getfield      org/openide/util/EditableProperties$State.itemIndex:Ljava/util/Map;
         * 140: aload_3
         * 141: aload_1
         * 142: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 147: pop
         * 148: return
         *  */
        // </editor-fold>
    }

    private boolean isContinue(String line) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokevirtual java/lang/String.length:()I
         * 4: iconst_1
         * 5: isub
         * 6: istore_2
         * 7: iconst_0
         * 8: istore_3
         * 9: iload_2
         * 10: iflt          32
         * 13: aload_1
         * 14: iload_2
         * 15: invokevirtual java/lang/String.charAt:(I)C
         * 18: bipush        92
         * 20: if_icmpne     32
         * 23: iinc          3, 1
         * 26: iinc          2, -1
         * 29: goto          9
         * 32: iload_3
         * 33: iconst_2
         * 34: irem
         * 35: ifeq          42
         * 38: iconst_1
         * 39: goto          43
         * 42: iconst_0
         * 43: ireturn
         *  */
        // </editor-fold>
    }

    private static boolean isComment(String line) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  org/openide/util/EditableProperties.trimLeft:(Ljava/lang/String;)Ljava/lang/String;
         * 4: astore_0
         * 5: aload_0
         * 6: invokevirtual java/lang/String.length:()I
         * 9: ifle          46
         * 12: aload_0
         * 13: iconst_0
         * 14: invokevirtual java/lang/String.charAt:(I)C
         * 17: lookupswitch  { // 2
         * 33: 44
         * 35: 44
         * default: 46
         * }
         * 44: iconst_1
         * 45: ireturn
         * 46: iconst_0
         * 47: ireturn
         *  */
        // </editor-fold>
    }

    private static boolean isEmpty(String line) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  org/openide/util/EditableProperties.trimLeft:(Ljava/lang/String;)Ljava/lang/String;
         * 4: invokevirtual java/lang/String.length:()I
         * 7: ifne          14
         * 10: iconst_1
         * 11: goto          15
         * 14: iconst_0
         * 15: ireturn
         *  */
        // </editor-fold>
    }

    private static String trimLeft(String line) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_1
         * 2: aload_0
         * 3: invokevirtual java/lang/String.length:()I
         * 6: istore_2
         * 7: iload_1
         * 8: iload_2
         * 9: if_icmpge     77
         * 12: aload_0
         * 13: iload_1
         * 14: invokevirtual java/lang/String.charAt:(I)C
         * 17: lookupswitch  { // 5
         * 9: 68
         * 10: 68
         * 12: 68
         * 13: 68
         * 32: 68
         * default: 74
         * }
         * 68: iinc          1, 1
         * 71: goto          7
         * 74: goto          77
         * 77: aload_0
         * 78: iload_1
         * 79: invokevirtual java/lang/String.substring:(I)Ljava/lang/String;
         * 82: areturn
         *  */
        // </editor-fold>
    }
}
