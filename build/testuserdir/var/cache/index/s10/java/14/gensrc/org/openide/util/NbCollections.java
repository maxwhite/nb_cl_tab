package org.openide.util;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class NbCollections {

    private static abstract class CheckedIterator<E extends Object> implements Iterator<E> {

        private static final Object WAITING;
        private final Iterator it;
        private Object next;

        public CheckedIterator(Iterator it) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: getstatic     org/openide/util/NbCollections$CheckedIterator.WAITING:Ljava/lang/Object;
             * 8: putfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 11: aload_0
             * 12: aload_1
             * 13: putfield      org/openide/util/NbCollections$CheckedIterator.it:Ljava/util/Iterator;
             * 16: return
             *  */
            // </editor-fold>
        }

        protected abstract boolean accept(Object o);

        public boolean hasNext() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 4: getstatic     org/openide/util/NbCollections$CheckedIterator.WAITING:Ljava/lang/Object;
             * 7: if_acmpeq     12
             * 10: iconst_1
             * 11: ireturn
             * 12: aload_0
             * 13: getfield      org/openide/util/NbCollections$CheckedIterator.it:Ljava/util/Iterator;
             * 16: invokeinterface java/util/Iterator.hasNext:()Z
             * 21: ifeq          50
             * 24: aload_0
             * 25: aload_0
             * 26: getfield      org/openide/util/NbCollections$CheckedIterator.it:Ljava/util/Iterator;
             * 29: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 34: putfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 37: aload_0
             * 38: aload_0
             * 39: getfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 42: invokevirtual org/openide/util/NbCollections$CheckedIterator.accept:(Ljava/lang/Object;)Z
             * 45: ifeq          12
             * 48: iconst_1
             * 49: ireturn
             * 50: aload_0
             * 51: getstatic     org/openide/util/NbCollections$CheckedIterator.WAITING:Ljava/lang/Object;
             * 54: putfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 57: iconst_0
             * 58: ireturn
             *  */
            // </editor-fold>
        }

        public E next() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 4: getstatic     org/openide/util/NbCollections$CheckedIterator.WAITING:Ljava/lang/Object;
             * 7: if_acmpne     25
             * 10: aload_0
             * 11: invokevirtual org/openide/util/NbCollections$CheckedIterator.hasNext:()Z
             * 14: ifne          25
             * 17: new           java/util/NoSuchElementException
             * 20: dup
             * 21: invokespecial java/util/NoSuchElementException."<init>":()V
             * 24: athrow
             * 25: getstatic     org/openide/util/NbCollections$CheckedIterator.$assertionsDisabled:Z
             * 28: ifne          49
             * 31: aload_0
             * 32: getfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 35: getstatic     org/openide/util/NbCollections$CheckedIterator.WAITING:Ljava/lang/Object;
             * 38: if_acmpne     49
             * 41: new           java/lang/AssertionError
             * 44: dup
             * 45: invokespecial java/lang/AssertionError."<init>":()V
             * 48: athrow
             * 49: aload_0
             * 50: getfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 53: astore_1
             * 54: aload_0
             * 55: getstatic     org/openide/util/NbCollections$CheckedIterator.WAITING:Ljava/lang/Object;
             * 58: putfield      org/openide/util/NbCollections$CheckedIterator.next:Ljava/lang/Object;
             * 61: aload_1
             * 62: areturn
             *  */
            // </editor-fold>
        }

        public void remove() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedIterator.it:Ljava/util/Iterator;
             * 4: invokeinterface java/util/Iterator.remove:()V
             * 9: return
             *  */
            // </editor-fold>
        }
    }

    private static final class CheckedMap<K extends Object, V extends Object> extends AbstractMap<K, V> implements Serializable {

        private final class EntrySet extends AbstractSet<Entry<K, V>> {

            private EntrySet() {
                // compiled code
            }

            public Iterator<Entry<K, V>> iterator() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           org/openide/util/NbCollections$CheckedMap$EntrySet$1
                 * 3: dup
                 * 4: aload_0
                 * 5: aload_0
                 * 6: getfield      org/openide/util/NbCollections$CheckedMap$EntrySet.this$0:Lorg/openide/util/NbCollections$CheckedMap;
                 * 9: invokestatic  org/openide/util/NbCollections$CheckedMap.access$100:(Lorg/openide/util/NbCollections$CheckedMap;)Ljava/util/Map;
                 * 12: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
                 * 17: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                 * 22: invokespecial org/openide/util/NbCollections$CheckedMap$EntrySet$1."<init>":(Lorg/openide/util/NbCollections$CheckedMap$EntrySet;Ljava/util/Iterator;)V
                 * 25: areturn
                 *  */
                // </editor-fold>
            }

            public int size() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: iconst_0
                 * 1: istore_1
                 * 2: aload_0
                 * 3: getfield      org/openide/util/NbCollections$CheckedMap$EntrySet.this$0:Lorg/openide/util/NbCollections$CheckedMap;
                 * 6: invokestatic  org/openide/util/NbCollections$CheckedMap.access$100:(Lorg/openide/util/NbCollections$CheckedMap;)Ljava/util/Map;
                 * 9: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
                 * 14: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
                 * 19: astore_2
                 * 20: aload_2
                 * 21: invokeinterface java/util/Iterator.hasNext:()Z
                 * 26: ifeq          54
                 * 29: aload_0
                 * 30: getfield      org/openide/util/NbCollections$CheckedMap$EntrySet.this$0:Lorg/openide/util/NbCollections$CheckedMap;
                 * 33: aload_2
                 * 34: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                 * 39: checkcast     java/util/Map$Entry
                 * 42: invokestatic  org/openide/util/NbCollections$CheckedMap.access$200:(Lorg/openide/util/NbCollections$CheckedMap;Ljava/util/Map$Entry;)Z
                 * 45: ifeq          20
                 * 48: iinc          1, 1
                 * 51: goto          20
                 * 54: iload_1
                 * 55: ireturn
                 *  */
                // </editor-fold>
            }
        }
        private static final long serialVersionUID = 1L;
        private final Map rawMap;
        private final Class<K> keyType;
        private final Class<V> valueType;
        private final boolean strict;

        public CheckedMap(Map rawMap, Class<K> keyType, Class<V> valueType, boolean strict) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/util/AbstractMap."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 14: aload_0
             * 15: aload_3
             * 16: putfield      org/openide/util/NbCollections$CheckedMap.valueType:Ljava/lang/Class;
             * 19: aload_0
             * 20: iload         4
             * 22: putfield      org/openide/util/NbCollections$CheckedMap.strict:Z
             * 25: return
             *  */
            // </editor-fold>
        }

        private boolean acceptKey(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     6
             * 4: iconst_1
             * 5: ireturn
             * 6: aload_0
             * 7: getfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 10: aload_1
             * 11: invokevirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
             * 14: ifeq          19
             * 17: iconst_1
             * 18: ireturn
             * 19: aload_0
             * 20: getfield      org/openide/util/NbCollections$CheckedMap.strict:Z
             * 23: ifeq          63
             * 26: new           java/lang/ClassCastException
             * 29: dup
             * 30: new           java/lang/StringBuilder
             * 33: dup
             * 34: invokespecial java/lang/StringBuilder."<init>":()V
             * 37: aload_1
             * 38: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 41: ldc            was not a
             * 43: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 46: aload_0
             * 47: getfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 50: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
             * 53: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 56: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 59: invokespecial java/lang/ClassCastException."<init>":(Ljava/lang/String;)V
             * 62: athrow
             * 63: iconst_0
             * 64: ireturn
             *  */
            // </editor-fold>
        }

        private boolean acceptValue(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     6
             * 4: iconst_1
             * 5: ireturn
             * 6: aload_0
             * 7: getfield      org/openide/util/NbCollections$CheckedMap.valueType:Ljava/lang/Class;
             * 10: aload_1
             * 11: invokevirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
             * 14: ifeq          19
             * 17: iconst_1
             * 18: ireturn
             * 19: aload_0
             * 20: getfield      org/openide/util/NbCollections$CheckedMap.strict:Z
             * 23: ifeq          63
             * 26: new           java/lang/ClassCastException
             * 29: dup
             * 30: new           java/lang/StringBuilder
             * 33: dup
             * 34: invokespecial java/lang/StringBuilder."<init>":()V
             * 37: aload_1
             * 38: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 41: ldc            was not a
             * 43: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 46: aload_0
             * 47: getfield      org/openide/util/NbCollections$CheckedMap.valueType:Ljava/lang/Class;
             * 50: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
             * 53: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 56: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 59: invokespecial java/lang/ClassCastException."<init>":(Ljava/lang/String;)V
             * 62: athrow
             * 63: iconst_0
             * 64: ireturn
             *  */
            // </editor-fold>
        }

        private boolean acceptEntry(Entry e) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
             * 7: invokespecial org/openide/util/NbCollections$CheckedMap.acceptKey:(Ljava/lang/Object;)Z
             * 10: ifeq          30
             * 13: aload_0
             * 14: aload_1
             * 15: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
             * 20: invokespecial org/openide/util/NbCollections$CheckedMap.acceptValue:(Ljava/lang/Object;)Z
             * 23: ifeq          30
             * 26: iconst_1
             * 27: goto          31
             * 30: iconst_0
             * 31: ireturn
             *  */
            // </editor-fold>
        }

        public Set<Entry<K, V>> entrySet() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           org/openide/util/NbCollections$CheckedMap$EntrySet
             * 3: dup
             * 4: aload_0
             * 5: aconst_null
             * 6: invokespecial org/openide/util/NbCollections$CheckedMap$EntrySet."<init>":(Lorg/openide/util/NbCollections$CheckedMap;Lorg/openide/util/NbCollections$1;)V
             * 9: areturn
             *  */
            // </editor-fold>
        }

        public V get(Object key) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 4: aload_0
             * 5: getfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 8: aload_1
             * 9: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 12: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
             * 17: astore_2
             * 18: aload_0
             * 19: aload_2
             * 20: invokespecial org/openide/util/NbCollections$CheckedMap.acceptValue:(Ljava/lang/Object;)Z
             * 23: ifeq          30
             * 26: aload_2
             * 27: astore_3
             * 28: aload_3
             * 29: areturn
             * 30: aconst_null
             * 31: areturn
             *  */
            // </editor-fold>
        }

        public V put(K key, V value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 4: aload_0
             * 5: getfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 8: aload_1
             * 9: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 12: aload_0
             * 13: getfield      org/openide/util/NbCollections$CheckedMap.valueType:Ljava/lang/Class;
             * 16: aload_2
             * 17: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 20: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
             * 25: astore_3
             * 26: aload_0
             * 27: aload_3
             * 28: invokespecial org/openide/util/NbCollections$CheckedMap.acceptValue:(Ljava/lang/Object;)Z
             * 31: ifeq          36
             * 34: aload_3
             * 35: areturn
             * 36: aconst_null
             * 37: areturn
             *  */
            // </editor-fold>
        }

        public V remove(Object key) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 4: aload_0
             * 5: getfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 8: aload_1
             * 9: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 12: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
             * 17: astore_2
             * 18: aload_0
             * 19: aload_2
             * 20: invokespecial org/openide/util/NbCollections$CheckedMap.acceptValue:(Ljava/lang/Object;)Z
             * 23: ifeq          30
             * 26: aload_2
             * 27: astore_3
             * 28: aload_3
             * 29: areturn
             * 30: aconst_null
             * 31: areturn
             *  */
            // </editor-fold>
        }

        public boolean containsKey(Object key) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 4: aload_0
             * 5: getfield      org/openide/util/NbCollections$CheckedMap.keyType:Ljava/lang/Class;
             * 8: aload_1
             * 9: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 12: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
             * 17: ifeq          41
             * 20: aload_0
             * 21: aload_0
             * 22: getfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 25: aload_1
             * 26: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
             * 31: invokespecial org/openide/util/NbCollections$CheckedMap.acceptValue:(Ljava/lang/Object;)Z
             * 34: ifeq          41
             * 37: iconst_1
             * 38: goto          42
             * 41: iconst_0
             * 42: ireturn
             *  */
            // </editor-fold>
        }

        public boolean containsValue(Object value) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_0
             * 2: getfield      org/openide/util/NbCollections$CheckedMap.valueType:Ljava/lang/Class;
             * 5: aload_1
             * 6: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 9: invokespecial java/util/AbstractMap.containsValue:(Ljava/lang/Object;)Z
             * 12: ireturn
             *  */
            // </editor-fold>
        }

        public int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_1
             * 2: aload_0
             * 3: getfield      org/openide/util/NbCollections$CheckedMap.rawMap:Ljava/util/Map;
             * 6: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
             * 11: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
             * 16: astore_2
             * 17: aload_2
             * 18: invokeinterface java/util/Iterator.hasNext:()Z
             * 23: ifeq          48
             * 26: aload_0
             * 27: aload_2
             * 28: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 33: checkcast     java/util/Map$Entry
             * 36: invokespecial org/openide/util/NbCollections$CheckedMap.acceptEntry:(Ljava/util/Map$Entry;)Z
             * 39: ifeq          17
             * 42: iinc          1, 1
             * 45: goto          17
             * 48: iload_1
             * 49: ireturn
             *  */
            // </editor-fold>
        }
    }

    private static final class CheckedSet<E extends Object> extends AbstractSet<E> implements Serializable {

        private static final long serialVersionUID = 1L;
        private final Set rawSet;
        private final Class<E> type;
        private final boolean strict;

        public CheckedSet(Set rawSet, Class<E> type, boolean strict) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/util/AbstractSet."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/NbCollections$CheckedSet.rawSet:Ljava/util/Set;
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/util/NbCollections$CheckedSet.type:Ljava/lang/Class;
             * 14: aload_0
             * 15: iload_3
             * 16: putfield      org/openide/util/NbCollections$CheckedSet.strict:Z
             * 19: return
             *  */
            // </editor-fold>
        }

        private boolean acceptEntry(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: ifnonnull     6
             * 4: iconst_1
             * 5: ireturn
             * 6: aload_0
             * 7: getfield      org/openide/util/NbCollections$CheckedSet.type:Ljava/lang/Class;
             * 10: aload_1
             * 11: invokevirtual java/lang/Class.isInstance:(Ljava/lang/Object;)Z
             * 14: ifeq          19
             * 17: iconst_1
             * 18: ireturn
             * 19: aload_0
             * 20: getfield      org/openide/util/NbCollections$CheckedSet.strict:Z
             * 23: ifeq          63
             * 26: new           java/lang/ClassCastException
             * 29: dup
             * 30: new           java/lang/StringBuilder
             * 33: dup
             * 34: invokespecial java/lang/StringBuilder."<init>":()V
             * 37: aload_1
             * 38: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 41: ldc            was not a
             * 43: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 46: aload_0
             * 47: getfield      org/openide/util/NbCollections$CheckedSet.type:Ljava/lang/Class;
             * 50: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
             * 53: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 56: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 59: invokespecial java/lang/ClassCastException."<init>":(Ljava/lang/String;)V
             * 62: athrow
             * 63: iconst_0
             * 64: ireturn
             *  */
            // </editor-fold>
        }

        public Iterator<E> iterator() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           org/openide/util/NbCollections$CheckedSet$1
             * 3: dup
             * 4: aload_0
             * 5: aload_0
             * 6: getfield      org/openide/util/NbCollections$CheckedSet.rawSet:Ljava/util/Set;
             * 9: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
             * 14: invokespecial org/openide/util/NbCollections$CheckedSet$1."<init>":(Lorg/openide/util/NbCollections$CheckedSet;Ljava/util/Iterator;)V
             * 17: areturn
             *  */
            // </editor-fold>
        }

        public int size() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_1
             * 2: aload_0
             * 3: getfield      org/openide/util/NbCollections$CheckedSet.rawSet:Ljava/util/Set;
             * 6: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
             * 11: astore_2
             * 12: aload_2
             * 13: invokeinterface java/util/Iterator.hasNext:()Z
             * 18: ifeq          40
             * 21: aload_0
             * 22: aload_2
             * 23: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 28: invokespecial org/openide/util/NbCollections$CheckedSet.acceptEntry:(Ljava/lang/Object;)Z
             * 31: ifeq          12
             * 34: iinc          1, 1
             * 37: goto          12
             * 40: iload_1
             * 41: ireturn
             *  */
            // </editor-fold>
        }

        public boolean add(E o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedSet.rawSet:Ljava/util/Set;
             * 4: aload_0
             * 5: getfield      org/openide/util/NbCollections$CheckedSet.type:Ljava/lang/Class;
             * 8: aload_1
             * 9: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 12: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
             * 17: ireturn
             *  */
            // </editor-fold>
        }

        public boolean contains(Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/NbCollections$CheckedSet.rawSet:Ljava/util/Set;
             * 4: aload_0
             * 5: getfield      org/openide/util/NbCollections$CheckedSet.type:Ljava/lang/Class;
             * 8: aload_1
             * 9: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
             * 12: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
             * 17: ireturn
             *  */
            // </editor-fold>
        }
    }
    private static final Logger LOG;

    private NbCollections() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static <E extends Object> Set<E> checkedSetByCopy(Set rawSet, Class<E> type, boolean strict) throws ClassCastException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/HashSet
         * 3: dup
         * 4: aload_0
         * 5: invokeinterface java/util/Set.size:()I
         * 10: iconst_4
         * 11: imul
         * 12: iconst_3
         * 13: idiv
         * 14: iconst_1
         * 15: iadd
         * 16: invokespecial java/util/HashSet."<init>":(I)V
         * 19: astore_3
         * 20: aload_0
         * 21: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
         * 26: astore        4
         * 28: aload         4
         * 30: invokeinterface java/util/Iterator.hasNext:()Z
         * 35: ifeq          99
         * 38: aload         4
         * 40: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 45: astore        5
         * 47: aload_3
         * 48: aload_1
         * 49: aload         5
         * 51: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
         * 54: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
         * 59: pop
         * 60: goto          96
         * 63: astore        6
         * 65: iload_2
         * 66: ifeq          72
         * 69: aload         6
         * 71: athrow
         * 72: getstatic     org/openide/util/NbCollections.LOG:Ljava/util/logging/Logger;
         * 75: getstatic     java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         * 78: ldc           Element {0} not assignable to {1}
         * 80: iconst_2
         * 81: anewarray     java/lang/Object
         * 84: dup
         * 85: iconst_0
         * 86: aload         5
         * 88: aastore
         * 89: dup
         * 90: iconst_1
         * 91: aload_1
         * 92: aastore
         * 93: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
         * 96: goto          28
         * 99: aload_3
         * 100: areturn
         * Exception table:
         * from    to  target type
         * 47    60    63   Class java/lang/ClassCastException
         *  */
        // </editor-fold>
    }

    public static <E extends Object> List<E> checkedListByCopy(List rawList, Class<E> type, boolean strict) throws ClassCastException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    java/util/RandomAccess
         * 4: ifeq          23
         * 7: new           java/util/ArrayList
         * 10: dup
         * 11: aload_0
         * 12: invokeinterface java/util/List.size:()I
         * 17: invokespecial java/util/ArrayList."<init>":(I)V
         * 20: goto          30
         * 23: new           java/util/LinkedList
         * 26: dup
         * 27: invokespecial java/util/LinkedList."<init>":()V
         * 30: astore_3
         * 31: aload_0
         * 32: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
         * 37: astore        4
         * 39: aload         4
         * 41: invokeinterface java/util/Iterator.hasNext:()Z
         * 46: ifeq          110
         * 49: aload         4
         * 51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 56: astore        5
         * 58: aload_3
         * 59: aload_1
         * 60: aload         5
         * 62: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
         * 65: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
         * 70: pop
         * 71: goto          107
         * 74: astore        6
         * 76: iload_2
         * 77: ifeq          83
         * 80: aload         6
         * 82: athrow
         * 83: getstatic     org/openide/util/NbCollections.LOG:Ljava/util/logging/Logger;
         * 86: getstatic     java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         * 89: ldc           Element {0} not assignable to {1}
         * 91: iconst_2
         * 92: anewarray     java/lang/Object
         * 95: dup
         * 96: iconst_0
         * 97: aload         5
         * 99: aastore
         * 100: dup
         * 101: iconst_1
         * 102: aload_1
         * 103: aastore
         * 104: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
         * 107: goto          39
         * 110: aload_3
         * 111: areturn
         * Exception table:
         * from    to  target type
         * 58    71    74   Class java/lang/ClassCastException
         *  */
        // </editor-fold>
    }

    public static <K extends Object, V extends Object> Map<K, V> checkedMapByCopy(Map rawMap, Class<K> keyType, Class<V> valueType, boolean strict) throws ClassCastException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/HashMap
         * 3: dup
         * 4: aload_0
         * 5: invokeinterface java/util/Map.size:()I
         * 10: iconst_4
         * 11: imul
         * 12: iconst_3
         * 13: idiv
         * 14: iconst_1
         * 15: iadd
         * 16: invokespecial java/util/HashMap."<init>":(I)V
         * 19: astore        4
         * 21: aload_0
         * 22: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
         * 27: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
         * 32: astore        5
         * 34: aload         5
         * 36: invokeinterface java/util/Iterator.hasNext:()Z
         * 41: ifeq          129
         * 44: aload         5
         * 46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 51: checkcast     java/util/Map$Entry
         * 54: astore        6
         * 56: aload         4
         * 58: aload_1
         * 59: aload         6
         * 61: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
         * 66: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
         * 69: aload_2
         * 70: aload         6
         * 72: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
         * 77: invokevirtual java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
         * 80: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 85: pop
         * 86: goto          126
         * 89: astore        7
         * 91: iload_3
         * 92: ifeq          98
         * 95: aload         7
         * 97: athrow
         * 98: getstatic     org/openide/util/NbCollections.LOG:Ljava/util/logging/Logger;
         * 101: getstatic     java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         * 104: ldc           Entry {0} not assignable to <{1},{2}>
         * 106: iconst_3
         * 107: anewarray     java/lang/Object
         * 110: dup
         * 111: iconst_0
         * 112: aload         6
         * 114: aastore
         * 115: dup
         * 116: iconst_1
         * 117: aload_1
         * 118: aastore
         * 119: dup
         * 120: iconst_2
         * 121: aload_2
         * 122: aastore
         * 123: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
         * 126: goto          34
         * 129: aload         4
         * 131: areturn
         * Exception table:
         * from    to  target type
         * 56    86    89   Class java/lang/ClassCastException
         *  */
        // </editor-fold>
    }

    public static <E extends Object> Iterator<E> checkedIteratorByFilter(Iterator rawIterator, Class<E> type, boolean strict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/NbCollections$1
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: iload_2
         * 7: invokespecial org/openide/util/NbCollections$1."<init>":(Ljava/util/Iterator;Ljava/lang/Class;Z)V
         * 10: areturn
         *  */
        // </editor-fold>
    }

    public static <E extends Object> Set<E> checkedSetByFilter(Set rawSet, Class<E> type, boolean strict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/NbCollections$CheckedSet
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: iload_2
         * 7: invokespecial org/openide/util/NbCollections$CheckedSet."<init>":(Ljava/util/Set;Ljava/lang/Class;Z)V
         * 10: areturn
         *  */
        // </editor-fold>
    }

    public static <K extends Object, V extends Object> Map<K, V> checkedMapByFilter(Map rawMap, Class<K> keyType, Class<V> valueType, boolean strict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/NbCollections$CheckedMap
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: aload_2
         * 7: iload_3
         * 8: invokespecial org/openide/util/NbCollections$CheckedMap."<init>":(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Z)V
         * 11: areturn
         *  */
        // </editor-fold>
    }

    public static <E extends Object> Enumeration<E> checkedEnumerationByFilter(Enumeration rawEnum, Class<E> type, boolean strict) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: astore_3
         * 2: aload_3
         * 3: new           org/openide/util/NbCollections$2
         * 6: dup
         * 7: aload_1
         * 8: iload_2
         * 9: invokespecial org/openide/util/NbCollections$2."<init>":(Ljava/lang/Class;Z)V
         * 12: invokestatic  org/openide/util/Enumerations.filter:(Ljava/util/Enumeration;Lorg/openide/util/Enumerations$Processor;)Ljava/util/Enumeration;
         * 15: areturn
         *  */
        // </editor-fold>
    }

    public static <E extends Object> Iterable<E> iterable(Iterator<E> iterator) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     12
         * 4: new           java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: new           org/openide/util/NbCollections$3
         * 15: dup
         * 16: aload_0
         * 17: invokespecial org/openide/util/NbCollections$3."<init>":(Ljava/util/Iterator;)V
         * 20: areturn
         *  */
        // </editor-fold>
    }

    public static <E extends Object> Iterable<E> iterable(Enumeration<E> enumeration) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     12
         * 4: new           java/lang/NullPointerException
         * 7: dup
         * 8: invokespecial java/lang/NullPointerException."<init>":()V
         * 11: athrow
         * 12: new           org/openide/util/NbCollections$4
         * 15: dup
         * 16: aload_0
         * 17: invokespecial org/openide/util/NbCollections$4."<init>":(Ljava/util/Enumeration;)V
         * 20: areturn
         *  */
        // </editor-fold>
    }
}
