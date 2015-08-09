package org.openide.util;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

public final class Enumerations {

    private static final class AltEn<T extends Object, R extends Object> implements Enumeration<R> {

        private Enumeration<? extends T> en;
        private Processor<T, R> process;

        public AltEn(Enumeration<? extends T> en, Processor<T, R> process) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/Enumerations$AltEn.en:Ljava/util/Enumeration;
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/util/Enumerations$AltEn.process:Lorg/openide/util/Enumerations$Processor;
             * 14: return
             *  */
            // </editor-fold>
        }

        public boolean hasMoreElements() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$AltEn.en:Ljava/util/Enumeration;
             * 4: invokeinterface java/util/Enumeration.hasMoreElements:()Z
             * 9: ireturn
             *  */
            // </editor-fold>
        }

        public R nextElement() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$AltEn.process:Lorg/openide/util/Enumerations$Processor;
             * 4: aload_0
             * 5: getfield      org/openide/util/Enumerations$AltEn.en:Ljava/util/Enumeration;
             * 8: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 13: aconst_null
             * 14: invokeinterface org/openide/util/Enumerations$Processor.process:(Ljava/lang/Object;Ljava/util/Collection;)Ljava/lang/Object;
             * 19: areturn
             *  */
            // </editor-fold>
        }
    }

    private static final class FilEn<T extends Object, R extends Object> implements Enumeration<R> {

        private static final Object EMPTY;
        private Enumeration<? extends T> en;
        private R next;
        private Processor<T, R> filter;

        public FilEn(Enumeration<? extends T> en, Processor<T, R> filter) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_0
             * 6: invokespecial org/openide/util/Enumerations$FilEn.empty:()Ljava/lang/Object;
             * 9: putfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 12: aload_0
             * 13: aload_1
             * 14: putfield      org/openide/util/Enumerations$FilEn.en:Ljava/util/Enumeration;
             * 17: aload_0
             * 18: aload_2
             * 19: putfield      org/openide/util/Enumerations$FilEn.filter:Lorg/openide/util/Enumerations$Processor;
             * 22: return
             *  */
            // </editor-fold>
        }

        public boolean hasMoreElements() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 4: aload_0
             * 5: invokespecial org/openide/util/Enumerations$FilEn.empty:()Ljava/lang/Object;
             * 8: if_acmpeq     13
             * 11: iconst_1
             * 12: ireturn
             * 13: aload_0
             * 14: getfield      org/openide/util/Enumerations$FilEn.en:Ljava/util/Enumeration;
             * 17: invokeinterface java/util/Enumeration.hasMoreElements:()Z
             * 22: ifeq          57
             * 25: aload_0
             * 26: aload_0
             * 27: getfield      org/openide/util/Enumerations$FilEn.filter:Lorg/openide/util/Enumerations$Processor;
             * 30: aload_0
             * 31: getfield      org/openide/util/Enumerations$FilEn.en:Ljava/util/Enumeration;
             * 34: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 39: aconst_null
             * 40: invokeinterface org/openide/util/Enumerations$Processor.process:(Ljava/lang/Object;Ljava/util/Collection;)Ljava/lang/Object;
             * 45: putfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 48: aload_0
             * 49: getfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 52: ifnull        13
             * 55: iconst_1
             * 56: ireturn
             * 57: aload_0
             * 58: aload_0
             * 59: invokespecial org/openide/util/Enumerations$FilEn.empty:()Ljava/lang/Object;
             * 62: putfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 65: iconst_0
             * 66: ireturn
             *  */
            // </editor-fold>
        }

        public R nextElement() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 4: getstatic     org/openide/util/Enumerations$FilEn.EMPTY:Ljava/lang/Object;
             * 7: if_acmpne     25
             * 10: aload_0
             * 11: invokevirtual org/openide/util/Enumerations$FilEn.hasMoreElements:()Z
             * 14: ifne          25
             * 17: new           java/util/NoSuchElementException
             * 20: dup
             * 21: invokespecial java/util/NoSuchElementException."<init>":()V
             * 24: athrow
             * 25: aload_0
             * 26: getfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 29: astore_1
             * 30: aload_0
             * 31: aload_0
             * 32: invokespecial org/openide/util/Enumerations$FilEn.empty:()Ljava/lang/Object;
             * 35: putfield      org/openide/util/Enumerations$FilEn.next:Ljava/lang/Object;
             * 38: aload_1
             * 39: areturn
             *  */
            // </editor-fold>
        }

        private R empty() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: getstatic     org/openide/util/Enumerations$FilEn.EMPTY:Ljava/lang/Object;
             * 3: areturn
             *  */
            // </editor-fold>
        }
    }

    public static interface Processor<T extends Object, R extends Object> {

        public R process(T t, Collection<T> clctn);
    }

    private static class QEn<T extends Object, R extends Object> implements Enumeration<R> {

        private static final class ListItem<T extends Object> {

            T object;
            ListItem<T> next;

            ListItem(T o) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: invokespecial java/lang/Object."<init>":()V
                 * 4: aload_0
                 * 5: aload_1
                 * 6: putfield      org/openide/util/Enumerations$QEn$ListItem.object:Ljava/lang/Object;
                 * 9: return
                 *  */
                // </editor-fold>
            }
        }

        private static final class ToAdd<T extends Object, R extends Object> implements Collection<T> {

            private QEn<T, R> q;

            public ToAdd(QEn<T, R> q) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: invokespecial java/lang/Object."<init>":()V
                 * 4: aload_0
                 * 5: aload_1
                 * 6: putfield      org/openide/util/Enumerations$QEn$ToAdd.q:Lorg/openide/util/Enumerations$QEn;
                 * 9: return
                 *  */
                // </editor-fold>
            }

            public void finish() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: aconst_null
                 * 2: putfield      org/openide/util/Enumerations$QEn$ToAdd.q:Lorg/openide/util/Enumerations$QEn;
                 * 5: return
                 *  */
                // </editor-fold>
            }

            public boolean add(T o) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: getfield      org/openide/util/Enumerations$QEn$ToAdd.q:Lorg/openide/util/Enumerations$QEn;
                 * 4: aload_1
                 * 5: invokevirtual org/openide/util/Enumerations$QEn.put:(Ljava/lang/Object;)V
                 * 8: iconst_1
                 * 9: ireturn
                 *  */
                // </editor-fold>
            }

            public boolean addAll(Collection<? extends T> c) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: aload_0
                 * 1: getfield      org/openide/util/Enumerations$QEn$ToAdd.q:Lorg/openide/util/Enumerations$QEn;
                 * 4: aload_1
                 * 5: invokevirtual org/openide/util/Enumerations$QEn.put:(Ljava/util/Collection;)V
                 * 8: iconst_1
                 * 9: ireturn
                 *  */
                // </editor-fold>
            }

            private String msg() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: ldc           Only add and addAll are implemented
                 * 2: areturn
                 *  */
                // </editor-fold>
            }

            public void clear() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public boolean contains(Object o) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public boolean containsAll(Collection c) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public boolean isEmpty() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public Iterator<T> iterator() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public boolean remove(Object o) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public boolean removeAll(Collection c) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public boolean retainAll(Collection c) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public int size() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public Object[] toArray() {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }

            public <X extends Object> X[] toArray(X[] a) {
                // <editor-fold defaultstate="collapsed" desc="Compiled Code">
                /* 0: new           java/lang/UnsupportedOperationException
                 * 3: dup
                 * 4: aload_0
                 * 5: invokespecial org/openide/util/Enumerations$QEn$ToAdd.msg:()Ljava/lang/String;
                 * 8: invokespecial java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
                 * 11: athrow
                 *  */
                // </editor-fold>
            }
        }
        private ListItem<T> next;
        private ListItem<T> last;
        private Processor<T, R> processor;

        public QEn(Processor<T, R> p) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aconst_null
             * 6: putfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 9: aload_0
             * 10: aconst_null
             * 11: putfield      org/openide/util/Enumerations$QEn.last:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 14: aload_0
             * 15: aload_1
             * 16: putfield      org/openide/util/Enumerations$QEn.processor:Lorg/openide/util/Enumerations$Processor;
             * 19: return
             *  */
            // </editor-fold>
        }

        public void put(T o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$QEn.last:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 4: ifnull        32
             * 7: new           org/openide/util/Enumerations$QEn$ListItem
             * 10: dup
             * 11: aload_1
             * 12: invokespecial org/openide/util/Enumerations$QEn$ListItem."<init>":(Ljava/lang/Object;)V
             * 15: astore_2
             * 16: aload_0
             * 17: getfield      org/openide/util/Enumerations$QEn.last:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 20: aload_2
             * 21: putfield      org/openide/util/Enumerations$QEn$ListItem.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 24: aload_0
             * 25: aload_2
             * 26: putfield      org/openide/util/Enumerations$QEn.last:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 29: goto          49
             * 32: aload_0
             * 33: aload_0
             * 34: new           org/openide/util/Enumerations$QEn$ListItem
             * 37: dup
             * 38: aload_1
             * 39: invokespecial org/openide/util/Enumerations$QEn$ListItem."<init>":(Ljava/lang/Object;)V
             * 42: dup_x1
             * 43: putfield      org/openide/util/Enumerations$QEn.last:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 46: putfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 49: return
             *  */
            // </editor-fold>
        }

        public void put(Collection<? extends T> arr) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
             * 6: astore_2
             * 7: aload_2
             * 8: invokeinterface java/util/Iterator.hasNext:()Z
             * 13: ifeq          31
             * 16: aload_2
             * 17: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
             * 22: astore_3
             * 23: aload_0
             * 24: aload_3
             * 25: invokevirtual org/openide/util/Enumerations$QEn.put:(Ljava/lang/Object;)V
             * 28: goto          7
             * 31: return
             *  */
            // </editor-fold>
        }

        public boolean hasMoreElements() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 4: ifnull        11
             * 7: iconst_1
             * 8: goto          12
             * 11: iconst_0
             * 12: ireturn
             *  */
            // </editor-fold>
        }

        public R nextElement() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 4: ifnonnull     15
             * 7: new           java/util/NoSuchElementException
             * 10: dup
             * 11: invokespecial java/util/NoSuchElementException."<init>":()V
             * 14: athrow
             * 15: aload_0
             * 16: getfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 19: getfield      org/openide/util/Enumerations$QEn$ListItem.object:Ljava/lang/Object;
             * 22: astore_1
             * 23: aload_0
             * 24: aload_0
             * 25: getfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 28: getfield      org/openide/util/Enumerations$QEn$ListItem.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 31: dup_x1
             * 32: putfield      org/openide/util/Enumerations$QEn.next:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 35: ifnonnull     43
             * 38: aload_0
             * 39: aconst_null
             * 40: putfield      org/openide/util/Enumerations$QEn.last:Lorg/openide/util/Enumerations$QEn$ListItem;
             * 43: new           org/openide/util/Enumerations$QEn$ToAdd
             * 46: dup
             * 47: aload_0
             * 48: invokespecial org/openide/util/Enumerations$QEn$ToAdd."<init>":(Lorg/openide/util/Enumerations$QEn;)V
             * 51: astore_2
             * 52: aload_0
             * 53: getfield      org/openide/util/Enumerations$QEn.processor:Lorg/openide/util/Enumerations$Processor;
             * 56: aload_1
             * 57: aload_2
             * 58: invokeinterface org/openide/util/Enumerations$Processor.process:(Ljava/lang/Object;Ljava/util/Collection;)Ljava/lang/Object;
             * 63: astore_3
             * 64: aload_2
             * 65: invokevirtual org/openide/util/Enumerations$QEn$ToAdd.finish:()V
             * 68: aload_3
             * 69: areturn
             *  */
            // </editor-fold>
        }
    }

    private static class RNulls<T extends Object> implements Processor<T, T> {

        private RNulls() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        public T process(T original, Collection<T> toAdd) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_1
             * 1: areturn
             *  */
            // </editor-fold>
        }
    }

    private static final class SeqEn<T extends Object> implements Enumeration<T> {

        private Enumeration<? extends Enumeration<? extends T>> en;
        private Enumeration<? extends T> current;
        private boolean checked;

        public SeqEn(Enumeration<? extends Enumeration<? extends T>> en) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: iconst_0
             * 6: putfield      org/openide/util/Enumerations$SeqEn.checked:Z
             * 9: aload_0
             * 10: aload_1
             * 11: putfield      org/openide/util/Enumerations$SeqEn.en:Ljava/util/Enumeration;
             * 14: return
             *  */
            // </editor-fold>
        }

        private void ensureCurrent() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 4: ifnull        19
             * 7: aload_0
             * 8: getfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 11: invokeinterface java/util/Enumeration.hasMoreElements:()Z
             * 16: ifne          56
             * 19: aload_0
             * 20: getfield      org/openide/util/Enumerations$SeqEn.en:Ljava/util/Enumeration;
             * 23: invokeinterface java/util/Enumeration.hasMoreElements:()Z
             * 28: ifeq          50
             * 31: aload_0
             * 32: aload_0
             * 33: getfield      org/openide/util/Enumerations$SeqEn.en:Ljava/util/Enumeration;
             * 36: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 41: checkcast     java/util/Enumeration
             * 44: putfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 47: goto          0
             * 50: aload_0
             * 51: aconst_null
             * 52: putfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 55: return
             * 56: return
             *  */
            // </editor-fold>
        }

        public boolean hasMoreElements() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$SeqEn.checked:Z
             * 4: ifne          16
             * 7: aload_0
             * 8: invokespecial org/openide/util/Enumerations$SeqEn.ensureCurrent:()V
             * 11: aload_0
             * 12: iconst_1
             * 13: putfield      org/openide/util/Enumerations$SeqEn.checked:Z
             * 16: aload_0
             * 17: getfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 20: ifnull        27
             * 23: iconst_1
             * 24: goto          28
             * 27: iconst_0
             * 28: ireturn
             *  */
            // </editor-fold>
        }

        public T nextElement() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Enumerations$SeqEn.checked:Z
             * 4: ifne          11
             * 7: aload_0
             * 8: invokespecial org/openide/util/Enumerations$SeqEn.ensureCurrent:()V
             * 11: aload_0
             * 12: getfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 15: ifnull        33
             * 18: aload_0
             * 19: iconst_0
             * 20: putfield      org/openide/util/Enumerations$SeqEn.checked:Z
             * 23: aload_0
             * 24: getfield      org/openide/util/Enumerations$SeqEn.current:Ljava/util/Enumeration;
             * 27: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 32: areturn
             * 33: aload_0
             * 34: iconst_1
             * 35: putfield      org/openide/util/Enumerations$SeqEn.checked:Z
             * 38: new           java/util/NoSuchElementException
             * 41: dup
             * 42: invokespecial java/util/NoSuchElementException."<init>":()V
             * 45: athrow
             *  */
            // </editor-fold>
        }
    }

    private Enumerations() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static final <T extends Object> Enumeration<T> empty() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  java/util/Collections.emptyList:()Ljava/util/List;
         * 3: astore_0
         * 4: aload_0
         * 5: invokestatic  java/util/Collections.enumeration:(Ljava/util/Collection;)Ljava/util/Enumeration;
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object> Enumeration<T> singleton(T obj) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  java/util/Collections.singleton:(Ljava/lang/Object;)Ljava/util/Set;
         * 4: invokestatic  java/util/Collections.enumeration:(Ljava/util/Collection;)Ljava/util/Enumeration;
         * 7: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object> Enumeration<T> concat(Enumeration<? extends T> en1, Enumeration<? extends T> en2) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           java/util/ArrayList
         * 3: dup
         * 4: invokespecial java/util/ArrayList."<init>":()V
         * 7: astore_2
         * 8: aload_2
         * 9: aload_0
         * 10: invokevirtual java/util/ArrayList.add:(Ljava/lang/Object;)Z
         * 13: pop
         * 14: aload_2
         * 15: aload_1
         * 16: invokevirtual java/util/ArrayList.add:(Ljava/lang/Object;)Z
         * 19: pop
         * 20: new           org/openide/util/Enumerations$SeqEn
         * 23: dup
         * 24: aload_2
         * 25: invokestatic  java/util/Collections.enumeration:(Ljava/util/Collection;)Ljava/util/Enumeration;
         * 28: invokespecial org/openide/util/Enumerations$SeqEn."<init>":(Ljava/util/Enumeration;)V
         * 31: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object> Enumeration<T> concat(Enumeration<? extends Enumeration<? extends T>> enumOfEnums) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/Enumerations$SeqEn
         * 3: dup
         * 4: aload_0
         * 5: invokespecial org/openide/util/Enumerations$SeqEn."<init>":(Ljava/util/Enumeration;)V
         * 8: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object> Enumeration<T> removeDuplicates(Enumeration<T> en) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: new           org/openide/util/Enumerations$1RDupls
         * 4: dup
         * 5: invokespecial org/openide/util/Enumerations$1RDupls."<init>":()V
         * 8: invokestatic  org/openide/util/Enumerations.filter:(Ljava/util/Enumeration;Lorg/openide/util/Enumerations$Processor;)Ljava/util/Enumeration;
         * 11: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object> Enumeration<T> array(T[] arr) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
         * 4: invokestatic  java/util/Collections.enumeration:(Ljava/util/Collection;)Ljava/util/Enumeration;
         * 7: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object> Enumeration<T> removeNulls(Enumeration<T> en) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: new           org/openide/util/Enumerations$RNulls
         * 4: dup
         * 5: aconst_null
         * 6: invokespecial org/openide/util/Enumerations$RNulls."<init>":(Lorg/openide/util/Enumerations$1;)V
         * 9: invokestatic  org/openide/util/Enumerations.filter:(Ljava/util/Enumeration;Lorg/openide/util/Enumerations$Processor;)Ljava/util/Enumeration;
         * 12: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object, R extends Object> Enumeration<R> convert(Enumeration<? extends T> en, Processor<T, R> processor) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/Enumerations$AltEn
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: invokespecial org/openide/util/Enumerations$AltEn."<init>":(Ljava/util/Enumeration;Lorg/openide/util/Enumerations$Processor;)V
         * 9: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object, R extends Object> Enumeration<R> filter(Enumeration<? extends T> en, Processor<T, R> filter) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: ldc           en
         * 2: aload_0
         * 3: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 6: ldc           filter
         * 8: aload_1
         * 9: invokestatic  org/openide/util/Parameters.notNull:(Ljava/lang/CharSequence;Ljava/lang/Object;)V
         * 12: new           org/openide/util/Enumerations$FilEn
         * 15: dup
         * 16: aload_0
         * 17: aload_1
         * 18: invokespecial org/openide/util/Enumerations$FilEn."<init>":(Ljava/util/Enumeration;Lorg/openide/util/Enumerations$Processor;)V
         * 21: areturn
         *  */
        // </editor-fold>
    }

    public static <T extends Object, R extends Object> Enumeration<R> queue(Enumeration<? extends T> en, Processor<T, R> filter) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/Enumerations$QEn
         * 3: dup
         * 4: aload_1
         * 5: invokespecial org/openide/util/Enumerations$QEn."<init>":(Lorg/openide/util/Enumerations$Processor;)V
         * 8: astore_2
         * 9: aload_0
         * 10: invokeinterface java/util/Enumeration.hasMoreElements:()Z
         * 15: ifeq          31
         * 18: aload_2
         * 19: aload_0
         * 20: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
         * 25: invokevirtual org/openide/util/Enumerations$QEn.put:(Ljava/lang/Object;)V
         * 28: goto          9
         * 31: aload_2
         * 32: areturn
         *  */
        // </editor-fold>
    }
}
