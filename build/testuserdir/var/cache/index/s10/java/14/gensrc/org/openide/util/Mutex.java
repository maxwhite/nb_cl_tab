package org.openide.util;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class Mutex {

    public static interface Action<T extends Object> extends ExceptionAction<T> {

        public T run();
    }

    public static interface ExceptionAction<T extends Object> {

        public T run() throws Exception;
    }

    private static final class InternalLock {

        InternalLock() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }
    }

    public static final class Privileged {

        private Mutex parent;

        public Privileged() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        final void setParent(Mutex parent) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: aload_1
             * 2: putfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 5: return
             *  */
            // </editor-fold>
        }

        public void enterReadAccess() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 4: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 7: lconst_0
             * 8: invokevirtual org/openide/util/Mutex.readEnter:(Ljava/lang/Thread;J)Z
             * 11: pop
             * 12: return
             *  */
            // </editor-fold>
        }

        public boolean tryReadAccess(long timeout) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 4: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 7: lload_1
             * 8: invokevirtual org/openide/util/Mutex.readEnter:(Ljava/lang/Thread;J)Z
             * 11: ireturn
             *  */
            // </editor-fold>
        }

        public void enterWriteAccess() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 4: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 7: lconst_0
             * 8: invokevirtual org/openide/util/Mutex.writeEnter:(Ljava/lang/Thread;J)Z
             * 11: pop
             * 12: return
             *  */
            // </editor-fold>
        }

        public boolean tryWriteAccess(long timeout) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 4: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 7: lload_1
             * 8: invokevirtual org/openide/util/Mutex.writeEnter:(Ljava/lang/Thread;J)Z
             * 11: ireturn
             *  */
            // </editor-fold>
        }

        public void exitReadAccess() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 4: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 7: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
             * 10: return
             *  */
            // </editor-fold>
        }

        public void exitWriteAccess() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$Privileged.parent:Lorg/openide/util/Mutex;
             * 4: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 7: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
             * 10: return
             *  */
            // </editor-fold>
        }
    }

    private static final class QueueCell {

        int mode;
        Thread t;
        boolean signal;
        boolean left;
        int priority2;

        public QueueCell(int mode, Thread t) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: iload_1
             * 6: putfield      org/openide/util/Mutex$QueueCell.mode:I
             * 9: aload_0
             * 10: aload_2
             * 11: putfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
             * 14: aload_0
             * 15: iconst_0
             * 16: putfield      org/openide/util/Mutex$QueueCell.left:Z
             * 19: aload_0
             * 20: iconst_0
             * 21: putfield      org/openide/util/Mutex$QueueCell.priority2:I
             * 24: return
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial java/lang/StringBuilder."<init>":()V
             * 7: aload_0
             * 8: invokespecial java/lang/Object.toString:()Ljava/lang/String;
             * 11: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 14: ldc            mode:
             * 16: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 19: aload_0
             * 20: getfield      org/openide/util/Mutex$QueueCell.mode:I
             * 23: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 26: ldc            thread:
             * 28: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 31: aload_0
             * 32: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
             * 35: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 38: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 41: areturn
             *  */
            // </editor-fold>
        }

        public long getPriority() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$QueueCell.priority2:I
             * 4: ifne          17
             * 7: aload_0
             * 8: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
             * 11: invokevirtual java/lang/Thread.getPriority:()I
             * 14: goto          21
             * 17: aload_0
             * 18: getfield      org/openide/util/Mutex$QueueCell.priority2:I
             * 21: i2l
             * 22: lreturn
             *  */
            // </editor-fold>
        }

        public boolean isGotOut() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$QueueCell.left:Z
             * 4: ireturn
             *  */
            // </editor-fold>
        }

        public void sleep() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: lconst_0
             * 2: invokevirtual org/openide/util/Mutex$QueueCell.sleep:(J)V
             * 5: return
             *  */
            // </editor-fold>
        }

        synchronized void sleep(long timeout) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_3
             * 2: aload_0
             * 3: getfield      org/openide/util/Mutex$QueueCell.signal:Z
             * 6: ifne          107
             * 9: invokestatic  java/lang/System.currentTimeMillis:()J
             * 12: lstore        4
             * 14: aload_0
             * 15: lload_1
             * 16: invokevirtual java/lang/Object.wait:(J)V
             * 19: invokestatic  org/openide/util/Mutex.access$200:()Ljava/util/logging/Logger;
             * 22: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
             * 25: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
             * 28: ifeq          72
             * 31: invokestatic  java/awt/EventQueue.isDispatchThread:()Z
             * 34: ifeq          72
             * 37: invokestatic  java/lang/System.currentTimeMillis:()J
             * 40: lload         4
             * 42: lsub
             * 43: ldc2_w        1000l
             * 46: lcmp
             * 47: ifle          72
             * 50: invokestatic  org/openide/util/Mutex.access$200:()Ljava/util/logging/Logger;
             * 53: getstatic     java/util/logging/Level.WARNING:Ljava/util/logging/Level;
             * 56: aload_0
             * 57: invokevirtual org/openide/util/Mutex$QueueCell.toString:()Ljava/lang/String;
             * 60: new           java/lang/IllegalStateException
             * 63: dup
             * 64: ldc           blocking on a mutex from EQ
             * 66: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
             * 69: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
             * 72: aload_0
             * 73: iconst_1
             * 74: putfield      org/openide/util/Mutex$QueueCell.left:Z
             * 77: iload_3
             * 78: ifeq          87
             * 81: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 84: invokevirtual java/lang/Thread.interrupt:()V
             * 87: return
             * 88: astore        4
             * 90: iconst_1
             * 91: istore_3
             * 92: invokestatic  org/openide/util/Mutex.access$200:()Ljava/util/logging/Logger;
             * 95: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
             * 98: aconst_null
             * 99: aload         4
             * 101: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
             * 104: goto          2
             * 107: aload_0
             * 108: iconst_1
             * 109: putfield      org/openide/util/Mutex$QueueCell.left:Z
             * 112: iload_3
             * 113: ifeq          145
             * 116: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 119: invokevirtual java/lang/Thread.interrupt:()V
             * 122: goto          145
             * 125: astore        6
             * 127: aload_0
             * 128: iconst_1
             * 129: putfield      org/openide/util/Mutex$QueueCell.left:Z
             * 132: iload_3
             * 133: ifeq          142
             * 136: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
             * 139: invokevirtual java/lang/Thread.interrupt:()V
             * 142: aload         6
             * 144: athrow
             * 145: return
             * Exception table:
             * from    to  target type
             * 9    72    88   Class java/lang/InterruptedException
             * 2    72   125   any
             * 88   107   125   any
             * 125   127   125   any
             *  */
            // </editor-fold>
        }

        public void wakeMeUp() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: iconst_1
             * 2: putfield      org/openide/util/Mutex$QueueCell.signal:Z
             * 5: aload_0
             * 6: invokevirtual java/lang/Object.notifyAll:()V
             * 9: return
             *  */
            // </editor-fold>
        }
    }

    private static final class ThreadInfo {

        boolean forced;
        final Thread t;
        int mode;
        int[] counts;
        List<Runnable>[] queues;
        int rsnapshot;

        public ThreadInfo(Thread t, int mode) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: aload_1
             * 6: putfield      org/openide/util/Mutex$ThreadInfo.t:Ljava/lang/Thread;
             * 9: aload_0
             * 10: iload_2
             * 11: putfield      org/openide/util/Mutex$ThreadInfo.mode:I
             * 14: aload_0
             * 15: iconst_4
             * 16: newarray       int
             * 18: putfield      org/openide/util/Mutex$ThreadInfo.counts:[I
             * 21: aload_0
             * 22: iconst_4
             * 23: anewarray     java/util/List
             * 26: checkcast     "[Ljava/util/List;"
             * 29: putfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 32: aload_0
             * 33: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
             * 36: iload_2
             * 37: iconst_1
             * 38: iastore
             * 39: return
             *  */
            // </editor-fold>
        }

        public String toString() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           java/lang/StringBuilder
             * 3: dup
             * 4: invokespecial java/lang/StringBuilder."<init>":()V
             * 7: aload_0
             * 8: invokespecial java/lang/Object.toString:()Ljava/lang/String;
             * 11: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 14: ldc            thread:
             * 16: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 19: aload_0
             * 20: getfield      org/openide/util/Mutex$ThreadInfo.t:Ljava/lang/Thread;
             * 23: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
             * 26: ldc            mode:
             * 28: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 31: aload_0
             * 32: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
             * 35: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 38: ldc            X:
             * 40: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 43: aload_0
             * 44: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
             * 47: iconst_2
             * 48: iaload
             * 49: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 52: ldc            S:
             * 54: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
             * 57: aload_0
             * 58: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
             * 61: iconst_3
             * 62: iaload
             * 63: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
             * 66: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
             * 69: areturn
             *  */
            // </editor-fold>
        }

        public void enqueue(int mode, Runnable run) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 4: iload_1
             * 5: aaload
             * 6: ifnonnull     24
             * 9: aload_0
             * 10: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 13: iload_1
             * 14: new           java/util/ArrayList
             * 17: dup
             * 18: bipush        13
             * 20: invokespecial java/util/ArrayList."<init>":(I)V
             * 23: aastore
             * 24: aload_0
             * 25: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 28: iload_1
             * 29: aaload
             * 30: aload_2
             * 31: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
             * 36: pop
             * 37: return
             *  */
            // </editor-fold>
        }

        public List dequeue(int mode) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 4: iload_1
             * 5: aaload
             * 6: astore_2
             * 7: aload_0
             * 8: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 11: iload_1
             * 12: aconst_null
             * 13: aastore
             * 14: aload_2
             * 15: areturn
             *  */
            // </editor-fold>
        }

        public int getRunnableCount(int mode) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 4: iload_1
             * 5: aaload
             * 6: ifnonnull     13
             * 9: iconst_0
             * 10: goto          24
             * 13: aload_0
             * 14: getfield      org/openide/util/Mutex$ThreadInfo.queues:[Ljava/util/List;
             * 17: iload_1
             * 18: aaload
             * 19: invokeinterface java/util/List.size:()I
             * 24: ireturn
             *  */
            // </editor-fold>
        }
    }
    private static int counter;
    private static final Logger LOG;
    public static final Mutex EVENT;
    static boolean beStrict;
    private static final int NONE = 0;
    private static final int CHAIN = 1;
    private static final int X = 2;
    private static final int S = 3;
    private static final int MODE_COUNT = 4;
    private static final boolean[][] cmatrix;
    private int grantedMode;
    private int origMode;
    private final Object LOCK;
    private final Executor wrapper;
    private final Map<Thread, ThreadInfo> registeredThreads;
    private int readersNo;
    private List<QueueCell> waiters;
    private int cnt;

    public Mutex(Object lock) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_0
         * 6: putfield      org/openide/util/Mutex.grantedMode:I
         * 9: aload_0
         * 10: new           java/util/HashMap
         * 13: dup
         * 14: bipush        7
         * 16: invokespecial java/util/HashMap."<init>":(I)V
         * 19: putfield      org/openide/util/Mutex.registeredThreads:Ljava/util/Map;
         * 22: aload_0
         * 23: iconst_0
         * 24: putfield      org/openide/util/Mutex.readersNo:I
         * 27: aload_0
         * 28: aload_0
         * 29: aload_1
         * 30: invokespecial org/openide/util/Mutex.init:(Ljava/lang/Object;)Ljava/lang/Object;
         * 33: putfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 36: aload_0
         * 37: aconst_null
         * 38: putfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 41: return
         *  */
        // </editor-fold>
    }

    public Mutex() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_0
         * 6: putfield      org/openide/util/Mutex.grantedMode:I
         * 9: aload_0
         * 10: new           java/util/HashMap
         * 13: dup
         * 14: bipush        7
         * 16: invokespecial java/util/HashMap."<init>":(I)V
         * 19: putfield      org/openide/util/Mutex.registeredThreads:Ljava/util/Map;
         * 22: aload_0
         * 23: iconst_0
         * 24: putfield      org/openide/util/Mutex.readersNo:I
         * 27: aload_0
         * 28: aload_0
         * 29: new           org/openide/util/Mutex$InternalLock
         * 32: dup
         * 33: invokespecial org/openide/util/Mutex$InternalLock."<init>":()V
         * 36: invokespecial org/openide/util/Mutex.init:(Ljava/lang/Object;)Ljava/lang/Object;
         * 39: putfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 42: aload_0
         * 43: aconst_null
         * 44: putfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 47: return
         *  */
        // </editor-fold>
    }

    public Mutex(Privileged privileged) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_0
         * 6: putfield      org/openide/util/Mutex.grantedMode:I
         * 9: aload_0
         * 10: new           java/util/HashMap
         * 13: dup
         * 14: bipush        7
         * 16: invokespecial java/util/HashMap."<init>":(I)V
         * 19: putfield      org/openide/util/Mutex.registeredThreads:Ljava/util/Map;
         * 22: aload_0
         * 23: iconst_0
         * 24: putfield      org/openide/util/Mutex.readersNo:I
         * 27: aload_1
         * 28: ifnonnull     41
         * 31: new           java/lang/IllegalArgumentException
         * 34: dup
         * 35: ldc           privileged == null
         * 37: invokespecial java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
         * 40: athrow
         * 41: aload_0
         * 42: aload_0
         * 43: new           org/openide/util/Mutex$InternalLock
         * 46: dup
         * 47: invokespecial org/openide/util/Mutex$InternalLock."<init>":()V
         * 50: invokespecial org/openide/util/Mutex.init:(Ljava/lang/Object;)Ljava/lang/Object;
         * 53: putfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 56: aload_1
         * 57: aload_0
         * 58: invokevirtual org/openide/util/Mutex$Privileged.setParent:(Lorg/openide/util/Mutex;)V
         * 61: aload_0
         * 62: aconst_null
         * 63: putfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 66: return
         *  */
        // </editor-fold>
    }

    public Mutex(Privileged privileged, Executor executor) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_0
         * 6: putfield      org/openide/util/Mutex.grantedMode:I
         * 9: aload_0
         * 10: new           java/util/HashMap
         * 13: dup
         * 14: bipush        7
         * 16: invokespecial java/util/HashMap."<init>":(I)V
         * 19: putfield      org/openide/util/Mutex.registeredThreads:Ljava/util/Map;
         * 22: aload_0
         * 23: iconst_0
         * 24: putfield      org/openide/util/Mutex.readersNo:I
         * 27: aload_0
         * 28: new           org/openide/util/Mutex
         * 31: dup
         * 32: aload_1
         * 33: invokespecial org/openide/util/Mutex."<init>":(Lorg/openide/util/Mutex$Privileged;)V
         * 36: putfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 39: aload_0
         * 40: aload_2
         * 41: putfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 44: return
         *  */
        // </editor-fold>
    }

    private Object init(Object lock) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: new           java/util/LinkedList
         * 4: dup
         * 5: invokespecial java/util/LinkedList."<init>":()V
         * 8: putfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 11: aload_0
         * 12: getstatic     org/openide/util/Mutex.counter:I
         * 15: dup
         * 16: iconst_1
         * 17: iadd
         * 18: putstatic     org/openide/util/Mutex.counter:I
         * 21: putfield      org/openide/util/Mutex.cnt:I
         * 24: getstatic     org/openide/util/Mutex.LOG:Ljava/util/logging/Logger;
         * 27: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 30: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 33: ifeq          79
         * 36: getstatic     org/openide/util/Mutex.LOG:Ljava/util/logging/Logger;
         * 39: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 42: new           java/lang/StringBuilder
         * 45: dup
         * 46: invokespecial java/lang/StringBuilder."<init>":()V
         * 49: ldc           [
         * 51: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 54: aload_0
         * 55: getfield      org/openide/util/Mutex.cnt:I
         * 58: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 61: ldc           ] created here
         * 63: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 66: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 69: new           java/lang/Exception
         * 72: dup
         * 73: invokespecial java/lang/Exception."<init>":()V
         * 76: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 79: aload_1
         * 80: areturn
         *  */
        // </editor-fold>
    }

    public <T extends Object> T readAccess(Action<T> action) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     33
         * 7: aload_1
         * 8: invokestatic  org/openide/util/Mutex.doEventAccess:(Lorg/openide/util/Mutex$ExceptionAction;)Ljava/lang/Object;
         * 11: areturn
         * 12: astore_2
         * 13: new           java/lang/InternalError
         * 16: dup
         * 17: ldc           Exception from non-Exception Action
         * 19: invokespecial java/lang/InternalError."<init>":(Ljava/lang/String;)V
         * 22: aload_2
         * 23: invokevirtual org/openide/util/MutexException.getException:()Ljava/lang/Exception;
         * 26: invokevirtual java/lang/InternalError.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
         * 29: checkcast     java/lang/InternalError
         * 32: athrow
         * 33: aload_0
         * 34: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 37: ifnull        69
         * 40: aload_0
         * 41: aload_1
         * 42: aconst_null
         * 43: iconst_1
         * 44: invokespecial org/openide/util/Mutex.doWrapperAccess:(Lorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;Z)Ljava/lang/Object;
         * 47: areturn
         * 48: astore_2
         * 49: new           java/lang/InternalError
         * 52: dup
         * 53: ldc           Exception from non-Exception Action
         * 55: invokespecial java/lang/InternalError."<init>":(Ljava/lang/String;)V
         * 58: aload_2
         * 59: invokevirtual org/openide/util/MutexException.getException:()Ljava/lang/Exception;
         * 62: invokevirtual java/lang/InternalError.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
         * 65: checkcast     java/lang/InternalError
         * 68: athrow
         * 69: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 72: astore_2
         * 73: aload_0
         * 74: aload_2
         * 75: lconst_0
         * 76: invokevirtual org/openide/util/Mutex.readEnter:(Ljava/lang/Thread;J)Z
         * 79: pop
         * 80: aload_1
         * 81: invokeinterface org/openide/util/Mutex$Action.run:()Ljava/lang/Object;
         * 86: astore_3
         * 87: aload_0
         * 88: aload_2
         * 89: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 92: aload_3
         * 93: areturn
         * 94: astore        4
         * 96: aload_0
         * 97: aload_2
         * 98: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 101: aload         4
         * 103: athrow
         * Exception table:
         * from    to  target type
         * 7    11    12   Class org/openide/util/MutexException
         * 40    47    48   Class org/openide/util/MutexException
         * 80    87    94   any
         * 94    96    94   any
         *  */
        // </editor-fold>
    }

    public <T extends Object> T readAccess(ExceptionAction<T> action) throws MutexException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     12
         * 7: aload_1
         * 8: invokestatic  org/openide/util/Mutex.doEventAccess:(Lorg/openide/util/Mutex$ExceptionAction;)Ljava/lang/Object;
         * 11: areturn
         * 12: aload_0
         * 13: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 16: ifnull        27
         * 19: aload_0
         * 20: aload_1
         * 21: aconst_null
         * 22: iconst_1
         * 23: invokespecial org/openide/util/Mutex.doWrapperAccess:(Lorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;Z)Ljava/lang/Object;
         * 26: areturn
         * 27: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 30: astore_2
         * 31: aload_0
         * 32: aload_2
         * 33: lconst_0
         * 34: invokevirtual org/openide/util/Mutex.readEnter:(Ljava/lang/Thread;J)Z
         * 37: pop
         * 38: aload_1
         * 39: invokeinterface org/openide/util/Mutex$ExceptionAction.run:()Ljava/lang/Object;
         * 44: astore_3
         * 45: aload_0
         * 46: aload_2
         * 47: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 50: aload_3
         * 51: areturn
         * 52: astore_3
         * 53: aload_3
         * 54: athrow
         * 55: astore_3
         * 56: new           org/openide/util/MutexException
         * 59: dup
         * 60: aload_3
         * 61: invokespecial org/openide/util/MutexException."<init>":(Ljava/lang/Exception;)V
         * 64: athrow
         * 65: astore        4
         * 67: aload_0
         * 68: aload_2
         * 69: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 72: aload         4
         * 74: athrow
         * Exception table:
         * from    to  target type
         * 38    45    52   Class java/lang/RuntimeException
         * 38    45    55   Class java/lang/Exception
         * 38    45    65   any
         * 52    67    65   any
         *  */
        // </editor-fold>
    }

    public void readAccess(Runnable action) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     12
         * 7: aload_1
         * 8: invokestatic  org/openide/util/Mutex.doEvent:(Ljava/lang/Runnable;)V
         * 11: return
         * 12: aload_0
         * 13: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 16: ifnull        38
         * 19: aload_0
         * 20: aconst_null
         * 21: aload_1
         * 22: iconst_1
         * 23: invokespecial org/openide/util/Mutex.doWrapperAccess:(Lorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;Z)Ljava/lang/Object;
         * 26: pop
         * 27: return
         * 28: astore_2
         * 29: new           java/lang/IllegalStateException
         * 32: dup
         * 33: aload_2
         * 34: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
         * 37: athrow
         * 38: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 41: astore_2
         * 42: aload_0
         * 43: aload_2
         * 44: lconst_0
         * 45: invokevirtual org/openide/util/Mutex.readEnter:(Ljava/lang/Thread;J)Z
         * 48: pop
         * 49: aload_1
         * 50: invokeinterface java/lang/Runnable.run:()V
         * 55: aload_0
         * 56: aload_2
         * 57: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 60: goto          71
         * 63: astore_3
         * 64: aload_0
         * 65: aload_2
         * 66: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 69: aload_3
         * 70: athrow
         * 71: return
         * Exception table:
         * from    to  target type
         * 19    27    28   Class org/openide/util/MutexException
         * 49    55    63   any
         * 63    64    63   any
         *  */
        // </editor-fold>
    }

    public <T extends Object> T writeAccess(Action<T> action) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     33
         * 7: aload_1
         * 8: invokestatic  org/openide/util/Mutex.doEventAccess:(Lorg/openide/util/Mutex$ExceptionAction;)Ljava/lang/Object;
         * 11: areturn
         * 12: astore_2
         * 13: new           java/lang/InternalError
         * 16: dup
         * 17: ldc           Exception from non-Exception Action
         * 19: invokespecial java/lang/InternalError."<init>":(Ljava/lang/String;)V
         * 22: aload_2
         * 23: invokevirtual org/openide/util/MutexException.getException:()Ljava/lang/Exception;
         * 26: invokevirtual java/lang/InternalError.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
         * 29: checkcast     java/lang/InternalError
         * 32: athrow
         * 33: aload_0
         * 34: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 37: ifnull        69
         * 40: aload_0
         * 41: aload_1
         * 42: aconst_null
         * 43: iconst_0
         * 44: invokespecial org/openide/util/Mutex.doWrapperAccess:(Lorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;Z)Ljava/lang/Object;
         * 47: areturn
         * 48: astore_2
         * 49: new           java/lang/InternalError
         * 52: dup
         * 53: ldc           Exception from non-Exception Action
         * 55: invokespecial java/lang/InternalError."<init>":(Ljava/lang/String;)V
         * 58: aload_2
         * 59: invokevirtual org/openide/util/MutexException.getException:()Ljava/lang/Exception;
         * 62: invokevirtual java/lang/InternalError.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
         * 65: checkcast     java/lang/InternalError
         * 68: athrow
         * 69: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 72: astore_2
         * 73: aload_0
         * 74: aload_2
         * 75: lconst_0
         * 76: invokevirtual org/openide/util/Mutex.writeEnter:(Ljava/lang/Thread;J)Z
         * 79: pop
         * 80: aload_1
         * 81: invokeinterface org/openide/util/Mutex$Action.run:()Ljava/lang/Object;
         * 86: astore_3
         * 87: aload_0
         * 88: aload_2
         * 89: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 92: aload_3
         * 93: areturn
         * 94: astore        4
         * 96: aload_0
         * 97: aload_2
         * 98: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 101: aload         4
         * 103: athrow
         * Exception table:
         * from    to  target type
         * 7    11    12   Class org/openide/util/MutexException
         * 40    47    48   Class org/openide/util/MutexException
         * 80    87    94   any
         * 94    96    94   any
         *  */
        // </editor-fold>
    }

    public <T extends Object> T writeAccess(ExceptionAction<T> action) throws MutexException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     12
         * 7: aload_1
         * 8: invokestatic  org/openide/util/Mutex.doEventAccess:(Lorg/openide/util/Mutex$ExceptionAction;)Ljava/lang/Object;
         * 11: areturn
         * 12: aload_0
         * 13: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 16: ifnull        27
         * 19: aload_0
         * 20: aload_1
         * 21: aconst_null
         * 22: iconst_0
         * 23: invokespecial org/openide/util/Mutex.doWrapperAccess:(Lorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;Z)Ljava/lang/Object;
         * 26: areturn
         * 27: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 30: astore_2
         * 31: aload_0
         * 32: aload_2
         * 33: lconst_0
         * 34: invokevirtual org/openide/util/Mutex.writeEnter:(Ljava/lang/Thread;J)Z
         * 37: pop
         * 38: aload_1
         * 39: invokeinterface org/openide/util/Mutex$ExceptionAction.run:()Ljava/lang/Object;
         * 44: astore_3
         * 45: aload_0
         * 46: aload_2
         * 47: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 50: aload_3
         * 51: areturn
         * 52: astore_3
         * 53: aload_3
         * 54: athrow
         * 55: astore_3
         * 56: new           org/openide/util/MutexException
         * 59: dup
         * 60: aload_3
         * 61: invokespecial org/openide/util/MutexException."<init>":(Ljava/lang/Exception;)V
         * 64: athrow
         * 65: astore        4
         * 67: aload_0
         * 68: aload_2
         * 69: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 72: aload         4
         * 74: athrow
         * Exception table:
         * from    to  target type
         * 38    45    52   Class java/lang/RuntimeException
         * 38    45    55   Class java/lang/Exception
         * 38    45    65   any
         * 52    67    65   any
         *  */
        // </editor-fold>
    }

    public void writeAccess(Runnable action) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     12
         * 7: aload_1
         * 8: invokestatic  org/openide/util/Mutex.doEvent:(Ljava/lang/Runnable;)V
         * 11: return
         * 12: aload_0
         * 13: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 16: ifnull        41
         * 19: aload_0
         * 20: aconst_null
         * 21: aload_1
         * 22: iconst_0
         * 23: invokespecial org/openide/util/Mutex.doWrapperAccess:(Lorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;Z)Ljava/lang/Object;
         * 26: pop
         * 27: goto          40
         * 30: astore_2
         * 31: new           java/lang/IllegalStateException
         * 34: dup
         * 35: aload_2
         * 36: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
         * 39: athrow
         * 40: return
         * 41: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 44: astore_2
         * 45: aload_0
         * 46: aload_2
         * 47: lconst_0
         * 48: invokevirtual org/openide/util/Mutex.writeEnter:(Ljava/lang/Thread;J)Z
         * 51: pop
         * 52: aload_1
         * 53: invokeinterface java/lang/Runnable.run:()V
         * 58: aload_0
         * 59: aload_2
         * 60: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 63: goto          74
         * 66: astore_3
         * 67: aload_0
         * 68: aload_2
         * 69: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 72: aload_3
         * 73: athrow
         * 74: return
         * Exception table:
         * from    to  target type
         * 19    27    30   Class org/openide/util/MutexException
         * 52    58    66   any
         * 66    67    66   any
         *  */
        // </editor-fold>
    }

    public boolean isReadAccess() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     11
         * 7: invokestatic  javax/swing/SwingUtilities.isEventDispatchThread:()Z
         * 10: ireturn
         * 11: aload_0
         * 12: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 15: ifnull        31
         * 18: aload_0
         * 19: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 22: checkcast     org/openide/util/Mutex
         * 25: astore_1
         * 26: aload_1
         * 27: invokevirtual org/openide/util/Mutex.isReadAccess:()Z
         * 30: ireturn
         * 31: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 34: astore_1
         * 35: aload_0
         * 36: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 39: dup
         * 40: astore_3
         * 41: monitorenter
         * 42: aload_0
         * 43: aload_1
         * 44: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 47: astore_2
         * 48: aload_2
         * 49: ifnull        65
         * 52: aload_2
         * 53: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 56: iconst_3
         * 57: iaload
         * 58: ifle          65
         * 61: iconst_1
         * 62: aload_3
         * 63: monitorexit
         * 64: ireturn
         * 65: aload_3
         * 66: monitorexit
         * 67: goto          77
         * 70: astore        4
         * 72: aload_3
         * 73: monitorexit
         * 74: aload         4
         * 76: athrow
         * 77: iconst_0
         * 78: ireturn
         * Exception table:
         * from    to  target type
         * 42    64    70   any
         * 65    67    70   any
         * 70    74    70   any
         *  */
        // </editor-fold>
    }

    public boolean isWriteAccess() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     11
         * 7: invokestatic  javax/swing/SwingUtilities.isEventDispatchThread:()Z
         * 10: ireturn
         * 11: aload_0
         * 12: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 15: ifnull        31
         * 18: aload_0
         * 19: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 22: checkcast     org/openide/util/Mutex
         * 25: astore_1
         * 26: aload_1
         * 27: invokevirtual org/openide/util/Mutex.isWriteAccess:()Z
         * 30: ireturn
         * 31: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 34: astore_1
         * 35: aload_0
         * 36: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 39: dup
         * 40: astore_3
         * 41: monitorenter
         * 42: aload_0
         * 43: aload_1
         * 44: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 47: astore_2
         * 48: aload_2
         * 49: ifnull        65
         * 52: aload_2
         * 53: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 56: iconst_2
         * 57: iaload
         * 58: ifle          65
         * 61: iconst_1
         * 62: aload_3
         * 63: monitorexit
         * 64: ireturn
         * 65: aload_3
         * 66: monitorexit
         * 67: goto          77
         * 70: astore        4
         * 72: aload_3
         * 73: monitorexit
         * 74: aload         4
         * 76: athrow
         * 77: iconst_0
         * 78: ireturn
         * Exception table:
         * from    to  target type
         * 42    64    70   any
         * 65    67    70   any
         * 70    74    70   any
         *  */
        // </editor-fold>
    }

    public void postReadRequest(Runnable run) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_3
         * 2: aload_1
         * 3: aconst_null
         * 4: invokespecial org/openide/util/Mutex.postRequest:(ILjava/lang/Runnable;Ljava/util/concurrent/Executor;)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public void postWriteRequest(Runnable run) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_2
         * 2: aload_1
         * 3: aconst_null
         * 4: invokespecial org/openide/util/Mutex.postRequest:(ILjava/lang/Runnable;Ljava/util/concurrent/Executor;)V
         * 7: return
         *  */
        // </editor-fold>
    }

    public String toString() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     10
         * 7: ldc           Mutex.EVENT
         * 9: areturn
         * 10: ldc           line.separator
         * 12: invokestatic  java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
         * 15: astore_1
         * 16: new           java/lang/StringBuilder
         * 19: dup
         * 20: sipush        512
         * 23: invokespecial java/lang/StringBuilder."<init>":(I)V
         * 26: astore_2
         * 27: aload_0
         * 28: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 31: dup
         * 32: astore_3
         * 33: monitorenter
         * 34: aload_2
         * 35: ldc           threads:
         * 37: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 40: aload_0
         * 41: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 44: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 47: aload_1
         * 48: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 51: pop
         * 52: aload_2
         * 53: ldc           readersNo:
         * 55: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 58: aload_0
         * 59: getfield      org/openide/util/Mutex.readersNo:I
         * 62: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 65: aload_1
         * 66: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 69: pop
         * 70: aload_2
         * 71: ldc           waiters:
         * 73: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 76: aload_0
         * 77: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 80: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 83: aload_1
         * 84: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 87: pop
         * 88: aload_2
         * 89: ldc           grantedMode:
         * 91: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 94: aload_0
         * 95: iconst_0
         * 96: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 99: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 102: aload_1
         * 103: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 106: pop
         * 107: aload_3
         * 108: monitorexit
         * 109: goto          119
         * 112: astore        4
         * 114: aload_3
         * 115: monitorexit
         * 116: aload         4
         * 118: athrow
         * 119: aload_2
         * 120: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 123: areturn
         * Exception table:
         * from    to  target type
         * 34   109   112   any
         * 112   116   112   any
         *  */
        // </editor-fold>
    }

    final boolean writeEnter(Thread t, long timeout) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_2
         * 2: aload_1
         * 3: lload_2
         * 4: invokespecial org/openide/util/Mutex.enter:(ILjava/lang/Thread;J)Z
         * 7: ireturn
         *  */
        // </editor-fold>
    }

    final boolean readEnter(Thread t, long timeout) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_3
         * 2: aload_1
         * 3: lload_2
         * 4: invokespecial org/openide/util/Mutex.enter:(ILjava/lang/Thread;J)Z
         * 7: ireturn
         *  */
        // </editor-fold>
    }

    private void doLog(String action, Object[] params) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 3: invokevirtual java/lang/Object.hashCode:()I
         * 6: invokestatic  java/lang/Integer.toHexString:(I)Ljava/lang/String;
         * 9: astore_3
         * 10: getstatic     org/openide/util/Mutex.LOG:Ljava/util/logging/Logger;
         * 13: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 16: new           java/lang/StringBuilder
         * 19: dup
         * 20: invokespecial java/lang/StringBuilder."<init>":()V
         * 23: ldc           [#
         * 25: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 28: aload_0
         * 29: getfield      org/openide/util/Mutex.cnt:I
         * 32: invokevirtual java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 35: ldc           @
         * 37: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 40: aload_3
         * 41: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 44: ldc           ]
         * 46: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 49: aload_1
         * 50: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 53: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 56: aload_2
         * 57: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V
         * 60: return
         *  */
        // </editor-fold>
    }

    private boolean enter(int requested, Thread t, long timeout) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.LOG:Ljava/util/logging/Logger;
         * 3: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 6: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 9: istore        5
         * 11: iload         5
         * 13: ifeq          40
         * 16: aload_0
         * 17: ldc           Entering {0}, {1}
         * 19: iconst_2
         * 20: anewarray     java/lang/Object
         * 23: dup
         * 24: iconst_0
         * 25: iload_1
         * 26: invokestatic  java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         * 29: aastore
         * 30: dup
         * 31: iconst_1
         * 32: lload_3
         * 33: invokestatic  java/lang/Long.valueOf:(J)Ljava/lang/Long;
         * 36: aastore
         * 37: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 40: aload_0
         * 41: iload_1
         * 42: aload_2
         * 43: lload_3
         * 44: invokespecial org/openide/util/Mutex.enterImpl:(ILjava/lang/Thread;J)Z
         * 47: istore        6
         * 49: iload         5
         * 51: ifeq          72
         * 54: aload_0
         * 55: ldc           Entering exit: {0}
         * 57: iconst_1
         * 58: anewarray     java/lang/Object
         * 61: dup
         * 62: iconst_0
         * 63: iload         6
         * 65: invokestatic  java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
         * 68: aastore
         * 69: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 72: iload         6
         * 74: ireturn
         *  */
        // </editor-fold>
    }

    private boolean enterImpl(int requested, Thread t, long timeout) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aconst_null
         * 1: astore        5
         * 3: iconst_0
         * 4: istore        6
         * 6: iinc          6, 1
         * 9: aload_0
         * 10: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 13: dup
         * 14: astore        7
         * 16: monitorenter
         * 17: aload_0
         * 18: aload_2
         * 19: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 22: astore        8
         * 24: aload         8
         * 26: ifnull        340
         * 29: aload_0
         * 30: iconst_0
         * 31: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 34: ifne          45
         * 37: new           java/lang/IllegalStateException
         * 40: dup
         * 41: invokespecial java/lang/IllegalStateException."<init>":()V
         * 44: athrow
         * 45: aload         8
         * 47: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 50: iconst_3
         * 51: if_icmpne     63
         * 54: aload_0
         * 55: iconst_0
         * 56: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 59: iconst_2
         * 60: if_icmpeq     81
         * 63: aload         8
         * 65: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 68: iconst_2
         * 69: if_icmpne     89
         * 72: aload_0
         * 73: iconst_0
         * 74: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 77: iconst_3
         * 78: if_icmpne     89
         * 81: new           java/lang/IllegalStateException
         * 84: dup
         * 85: invokespecial java/lang/IllegalStateException."<init>":()V
         * 88: athrow
         * 89: aload         8
         * 91: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 94: iconst_2
         * 95: if_icmpeq     107
         * 98: aload         8
         * 100: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 103: iload_1
         * 104: if_icmpne     206
         * 107: aload         8
         * 109: getfield      org/openide/util/Mutex$ThreadInfo.forced:Z
         * 112: ifeq          124
         * 115: aload         8
         * 117: iconst_0
         * 118: putfield      org/openide/util/Mutex$ThreadInfo.forced:Z
         * 121: goto          201
         * 124: iload_1
         * 125: iconst_2
         * 126: if_icmpne     164
         * 129: aload         8
         * 131: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 134: iconst_3
         * 135: iaload
         * 136: ifle          164
         * 139: new           java/lang/IllegalStateException
         * 142: dup
         * 143: ldc           WARNING: Going from readAccess to writeAccess, see #10778: http://www.netbeans.org/issues/show_bug.cgi?id=10778
         * 145: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 148: astore        9
         * 150: getstatic     org/openide/util/Mutex.beStrict:Z
         * 153: ifeq          159
         * 156: aload         9
         * 158: athrow
         * 159: aload         9
         * 161: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 164: aload         8
         * 166: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 169: iload_1
         * 170: dup2
         * 171: iaload
         * 172: iconst_1
         * 173: iadd
         * 174: iastore
         * 175: iload_1
         * 176: iconst_3
         * 177: if_icmpne     201
         * 180: aload         8
         * 182: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 185: iload_1
         * 186: iaload
         * 187: iconst_1
         * 188: if_icmpne     201
         * 191: aload_0
         * 192: dup
         * 193: getfield      org/openide/util/Mutex.readersNo:I
         * 196: iconst_1
         * 197: iadd
         * 198: putfield      org/openide/util/Mutex.readersNo:I
         * 201: iconst_1
         * 202: aload         7
         * 204: monitorexit
         * 205: ireturn
         * 206: aload_0
         * 207: aload         8
         * 209: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 212: iload_1
         * 213: invokespecial org/openide/util/Mutex.canUpgrade:(II)Z
         * 216: ifeq          312
         * 219: new           java/lang/IllegalStateException
         * 222: dup
         * 223: ldc           WARNING: Going from readAccess to writeAccess, see #10778: http://www.netbeans.org/issues/show_bug.cgi?id=10778
         * 225: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 228: astore        9
         * 230: getstatic     org/openide/util/Mutex.beStrict:Z
         * 233: ifeq          239
         * 236: aload         9
         * 238: athrow
         * 239: aload         9
         * 241: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 244: aload         8
         * 246: iconst_2
         * 247: putfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 250: aload         8
         * 252: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 255: iload_1
         * 256: dup2
         * 257: iaload
         * 258: iconst_1
         * 259: iadd
         * 260: iastore
         * 261: aload         8
         * 263: aload         8
         * 265: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 268: iconst_3
         * 269: iaload
         * 270: putfield      org/openide/util/Mutex$ThreadInfo.rsnapshot:I
         * 273: aload_0
         * 274: iconst_0
         * 275: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 278: iconst_3
         * 279: if_icmpne     290
         * 282: aload_0
         * 283: iconst_2
         * 284: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 287: goto          307
         * 290: aload_0
         * 291: iconst_0
         * 292: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 295: iconst_2
         * 296: if_icmpne     307
         * 299: new           java/lang/IllegalStateException
         * 302: dup
         * 303: invokespecial java/lang/IllegalStateException."<init>":()V
         * 306: athrow
         * 307: iconst_1
         * 308: aload         7
         * 310: monitorexit
         * 311: ireturn
         * 312: new           java/lang/IllegalStateException
         * 315: dup
         * 316: ldc           WARNING: Going from readAccess to writeAccess through queue, see #10778: http://www.netbeans.org/issues/show_bug.cgi?id=10778
         * 318: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 321: astore        9
         * 323: getstatic     org/openide/util/Mutex.beStrict:Z
         * 326: ifeq          332
         * 329: aload         9
         * 331: athrow
         * 332: aload         9
         * 334: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 337: goto          396
         * 340: aload_0
         * 341: iload_1
         * 342: invokespecial org/openide/util/Mutex.isCompatible:(I)Z
         * 345: ifeq          396
         * 348: aload_0
         * 349: iload_1
         * 350: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 353: aload_0
         * 354: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 357: aload_2
         * 358: new           org/openide/util/Mutex$ThreadInfo
         * 361: dup
         * 362: aload_2
         * 363: iload_1
         * 364: invokespecial org/openide/util/Mutex$ThreadInfo."<init>":(Ljava/lang/Thread;I)V
         * 367: dup
         * 368: astore        8
         * 370: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 375: pop
         * 376: iload_1
         * 377: iconst_3
         * 378: if_icmpne     391
         * 381: aload_0
         * 382: dup
         * 383: getfield      org/openide/util/Mutex.readersNo:I
         * 386: iconst_1
         * 387: iadd
         * 388: putfield      org/openide/util/Mutex.readersNo:I
         * 391: iconst_1
         * 392: aload         7
         * 394: monitorexit
         * 395: ireturn
         * 396: lload_3
         * 397: ldc2_w        -1l
         * 400: lcmp
         * 401: ifne          409
         * 404: iconst_0
         * 405: aload         7
         * 407: monitorexit
         * 408: ireturn
         * 409: aload_0
         * 410: iconst_1
         * 411: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 414: aload_0
         * 415: iload_1
         * 416: aload_2
         * 417: iconst_0
         * 418: invokespecial org/openide/util/Mutex.chain:(ILjava/lang/Thread;I)Lorg/openide/util/Mutex$QueueCell;
         * 421: astore        5
         * 423: aload         7
         * 425: monitorexit
         * 426: goto          437
         * 429: astore        10
         * 431: aload         7
         * 433: monitorexit
         * 434: aload         10
         * 436: athrow
         * 437: aload         5
         * 439: lload_3
         * 440: invokevirtual org/openide/util/Mutex$QueueCell.sleep:(J)V
         * 443: lload_3
         * 444: lconst_0
         * 445: lcmp
         * 446: ifle          6
         * 449: ldc2_w        -1l
         * 452: lstore_3
         * 453: goto          6
         * Exception table:
         * from    to  target type
         * 17   205   429   any
         * 206   311   429   any
         * 312   395   429   any
         * 396   408   429   any
         * 409   426   429   any
         * 429   434   429   any
         *  */
        // </editor-fold>
    }

    private boolean reenter(Thread t, int mode) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.LOG:Ljava/util/logging/Logger;
         * 3: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 6: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 9: istore_3
         * 10: iload_3
         * 11: ifeq          31
         * 14: aload_0
         * 15: ldc           Re-Entering {0}
         * 17: iconst_1
         * 18: anewarray     java/lang/Object
         * 21: dup
         * 22: iconst_0
         * 23: iload_2
         * 24: invokestatic  java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         * 27: aastore
         * 28: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 31: aload_0
         * 32: aload_1
         * 33: iload_2
         * 34: invokespecial org/openide/util/Mutex.reenterImpl:(Ljava/lang/Thread;I)Z
         * 37: istore        4
         * 39: iload_3
         * 40: ifeq          61
         * 43: aload_0
         * 44: ldc           Re-Entering exit: {0}
         * 46: iconst_1
         * 47: anewarray     java/lang/Object
         * 50: dup
         * 51: iconst_0
         * 52: iload         4
         * 54: invokestatic  java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
         * 57: aastore
         * 58: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 61: iload         4
         * 63: ireturn
         *  */
        // </editor-fold>
    }

    private boolean reenterImpl(Thread t, int mode) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_2
         * 1: iconst_3
         * 2: if_icmpne     44
         * 5: aload_0
         * 6: iconst_0
         * 7: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 10: ifeq          34
         * 13: aload_0
         * 14: iconst_0
         * 15: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 18: iconst_3
         * 19: if_icmpeq     34
         * 22: new           java/lang/IllegalStateException
         * 25: dup
         * 26: aload_0
         * 27: invokevirtual org/openide/util/Mutex.toString:()Ljava/lang/String;
         * 30: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 33: athrow
         * 34: aload_0
         * 35: iload_2
         * 36: aload_1
         * 37: lconst_0
         * 38: invokespecial org/openide/util/Mutex.enter:(ILjava/lang/Thread;J)Z
         * 41: pop
         * 42: iconst_0
         * 43: ireturn
         * 44: aload_0
         * 45: aload_1
         * 46: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 49: astore_3
         * 50: aload_0
         * 51: iconst_0
         * 52: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 55: iconst_1
         * 56: if_icmpne     76
         * 59: aload_3
         * 60: ifnull        76
         * 63: aload_3
         * 64: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 67: iconst_2
         * 68: iaload
         * 69: ifle          76
         * 72: iconst_1
         * 73: goto          77
         * 76: iconst_0
         * 77: istore        4
         * 79: aload_0
         * 80: iconst_0
         * 81: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 84: iconst_2
         * 85: if_icmpeq     101
         * 88: aload_0
         * 89: iconst_0
         * 90: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 93: ifeq          101
         * 96: iload         4
         * 98: ifeq          111
         * 101: aload_0
         * 102: iload_2
         * 103: aload_1
         * 104: lconst_0
         * 105: invokespecial org/openide/util/Mutex.enter:(ILjava/lang/Thread;J)Z
         * 108: pop
         * 109: iconst_0
         * 110: ireturn
         * 111: aload_0
         * 112: getfield      org/openide/util/Mutex.readersNo:I
         * 115: ifne          130
         * 118: new           java/lang/IllegalStateException
         * 121: dup
         * 122: aload_0
         * 123: invokevirtual org/openide/util/Mutex.toString:()Ljava/lang/String;
         * 126: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 129: athrow
         * 130: new           org/openide/util/Mutex$ThreadInfo
         * 133: dup
         * 134: aload_1
         * 135: iload_2
         * 136: invokespecial org/openide/util/Mutex$ThreadInfo."<init>":(Ljava/lang/Thread;I)V
         * 139: astore        5
         * 141: aload_0
         * 142: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 145: aload_1
         * 146: aload         5
         * 148: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 153: pop
         * 154: aload_0
         * 155: dup
         * 156: getfield      org/openide/util/Mutex.readersNo:I
         * 159: iconst_2
         * 160: iadd
         * 161: putfield      org/openide/util/Mutex.readersNo:I
         * 164: aload_0
         * 165: iconst_1
         * 166: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 169: iconst_1
         * 170: ireturn
         *  */
        // </editor-fold>
    }

    private void privilegedEnter(Thread t, int mode) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_1
         * 1: istore_3
         * 2: aload_0
         * 3: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 6: dup
         * 7: astore        4
         * 9: monitorenter
         * 10: aload_0
         * 11: aload_1
         * 12: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 15: pop
         * 16: aload         4
         * 18: monitorexit
         * 19: goto          30
         * 22: astore        5
         * 24: aload         4
         * 26: monitorexit
         * 27: aload         5
         * 29: athrow
         * 30: aload_0
         * 31: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 34: dup
         * 35: astore        5
         * 37: monitorenter
         * 38: iload_3
         * 39: ifeq          54
         * 42: iconst_0
         * 43: istore_3
         * 44: aload_0
         * 45: dup
         * 46: getfield      org/openide/util/Mutex.readersNo:I
         * 49: iconst_2
         * 50: isub
         * 51: putfield      org/openide/util/Mutex.readersNo:I
         * 54: aload_0
         * 55: iconst_1
         * 56: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 59: aload_0
         * 60: iload_2
         * 61: aload_1
         * 62: ldc           2147483647
         * 64: invokespecial org/openide/util/Mutex.chain:(ILjava/lang/Thread;I)Lorg/openide/util/Mutex$QueueCell;
         * 67: astore        4
         * 69: aload_0
         * 70: getfield      org/openide/util/Mutex.readersNo:I
         * 73: ifne          120
         * 76: aload_0
         * 77: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 80: iconst_0
         * 81: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
         * 86: aload         4
         * 88: if_acmpne     111
         * 91: aload_0
         * 92: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 95: iconst_0
         * 96: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 101: pop
         * 102: aload_0
         * 103: iload_2
         * 104: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 107: aload         5
         * 109: monitorexit
         * 110: return
         * 111: aload_0
         * 112: iconst_0
         * 113: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 116: aload_0
         * 117: invokespecial org/openide/util/Mutex.wakeUpOthers:()V
         * 120: aload         5
         * 122: monitorexit
         * 123: goto          134
         * 126: astore        6
         * 128: aload         5
         * 130: monitorexit
         * 131: aload         6
         * 133: athrow
         * 134: aload         4
         * 136: invokevirtual org/openide/util/Mutex$QueueCell.sleep:()V
         * 139: goto          30
         * Exception table:
         * from    to  target type
         * 10    19    22   any
         * 22    27    22   any
         * 38   110   126   any
         * 111   123   126   any
         * 126   131   126   any
         *  */
        // </editor-fold>
    }

    final void leave(Thread t) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.LOG:Ljava/util/logging/Logger;
         * 3: getstatic     java/util/logging/Level.FINER:Ljava/util/logging/Level;
         * 6: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 9: istore_2
         * 10: iload_2
         * 11: ifeq          35
         * 14: aload_0
         * 15: ldc           Leaving {0}
         * 17: iconst_1
         * 18: anewarray     java/lang/Object
         * 21: dup
         * 22: iconst_0
         * 23: aload_0
         * 24: iconst_1
         * 25: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 28: invokestatic  java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         * 31: aastore
         * 32: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 35: aload_0
         * 36: aload_1
         * 37: invokespecial org/openide/util/Mutex.leaveImpl:(Ljava/lang/Thread;)V
         * 40: iload_2
         * 41: ifeq          65
         * 44: aload_0
         * 45: ldc           Leaving exit: {0}
         * 47: iconst_1
         * 48: anewarray     java/lang/Object
         * 51: dup
         * 52: iconst_0
         * 53: aload_0
         * 54: iconst_1
         * 55: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 58: invokestatic  java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         * 61: aastore
         * 62: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 65: return
         *  */
        // </editor-fold>
    }

    private void leaveImpl(Thread t) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_3
         * 2: iconst_0
         * 3: istore        4
         * 5: aload_0
         * 6: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 9: dup
         * 10: astore        5
         * 12: monitorenter
         * 13: aload_0
         * 14: aload_1
         * 15: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 18: astore_2
         * 19: aload_0
         * 20: iconst_0
         * 21: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 24: tableswitch   { // 0 to 3
         * 0: 56
         * 1: 64
         * 2: 108
         * 3: 117
         * default: 123
         * }
         * 56: new           java/lang/IllegalStateException
         * 59: dup
         * 60: invokespecial java/lang/IllegalStateException."<init>":()V
         * 63: athrow
         * 64: aload_2
         * 65: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 68: iconst_2
         * 69: iaload
         * 70: ifle          82
         * 73: aload_0
         * 74: aload_2
         * 75: invokespecial org/openide/util/Mutex.leaveX:(Lorg/openide/util/Mutex$ThreadInfo;)I
         * 78: istore_3
         * 79: goto          123
         * 82: aload_2
         * 83: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 86: iconst_3
         * 87: iaload
         * 88: ifle          100
         * 91: aload_0
         * 92: aload_2
         * 93: invokespecial org/openide/util/Mutex.leaveS:(Lorg/openide/util/Mutex$ThreadInfo;)I
         * 96: istore_3
         * 97: goto          123
         * 100: new           java/lang/IllegalStateException
         * 103: dup
         * 104: invokespecial java/lang/IllegalStateException."<init>":()V
         * 107: athrow
         * 108: aload_0
         * 109: aload_2
         * 110: invokespecial org/openide/util/Mutex.leaveX:(Lorg/openide/util/Mutex$ThreadInfo;)I
         * 113: istore_3
         * 114: goto          123
         * 117: aload_0
         * 118: aload_2
         * 119: invokespecial org/openide/util/Mutex.leaveS:(Lorg/openide/util/Mutex$ThreadInfo;)I
         * 122: istore_3
         * 123: iload_3
         * 124: ifeq          147
         * 127: aload_2
         * 128: iload_3
         * 129: invokevirtual org/openide/util/Mutex$ThreadInfo.getRunnableCount:(I)I
         * 132: istore        6
         * 134: iload         6
         * 136: ifeq          147
         * 139: aload_0
         * 140: aload_1
         * 141: iload_3
         * 142: invokespecial org/openide/util/Mutex.reenter:(Ljava/lang/Thread;I)Z
         * 145: istore        4
         * 147: aload         5
         * 149: monitorexit
         * 150: goto          161
         * 153: astore        7
         * 155: aload         5
         * 157: monitorexit
         * 158: aload         7
         * 160: athrow
         * 161: iload_3
         * 162: ifeq          315
         * 165: aload_2
         * 166: iload_3
         * 167: invokevirtual org/openide/util/Mutex$ThreadInfo.getRunnableCount:(I)I
         * 170: ifle          315
         * 173: aload_0
         * 174: ldc           Processing posted requests: {0}
         * 176: iconst_1
         * 177: anewarray     java/lang/Object
         * 180: dup
         * 181: iconst_0
         * 182: iload_3
         * 183: invokestatic  java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
         * 186: aastore
         * 187: invokespecial org/openide/util/Mutex.doLog:(Ljava/lang/String;[Ljava/lang/Object;)V
         * 190: iload         4
         * 192: ifeq          201
         * 195: aload_0
         * 196: aload_1
         * 197: iload_3
         * 198: invokespecial org/openide/util/Mutex.privilegedEnter:(Ljava/lang/Thread;I)V
         * 201: aload_2
         * 202: iload_3
         * 203: invokevirtual org/openide/util/Mutex$ThreadInfo.dequeue:(I)Ljava/util/List;
         * 206: astore        5
         * 208: aload         5
         * 210: invokeinterface java/util/List.size:()I
         * 215: istore        6
         * 217: iconst_0
         * 218: istore        7
         * 220: iload         7
         * 222: iload         6
         * 224: if_icmpge     294
         * 227: aload         5
         * 229: iload         7
         * 231: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
         * 236: checkcast     java/lang/Runnable
         * 239: astore        8
         * 241: aload         8
         * 243: invokeinterface java/lang/Runnable.run:()V
         * 248: goto          288
         * 251: astore        8
         * 253: aload         8
         * 255: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 258: goto          288
         * 261: astore        8
         * 263: aload         8
         * 265: invokevirtual java/lang/StackOverflowError.printStackTrace:()V
         * 268: aload         8
         * 270: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 273: goto          288
         * 276: astore        8
         * 278: aload         8
         * 280: athrow
         * 281: astore        8
         * 283: aload         8
         * 285: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 288: iinc          7, 1
         * 291: goto          220
         * 294: aconst_null
         * 295: astore        5
         * 297: aload_0
         * 298: aload_1
         * 299: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 302: goto          315
         * 305: astore        9
         * 307: aload_0
         * 308: aload_1
         * 309: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 312: aload         9
         * 314: athrow
         * 315: return
         * Exception table:
         * from    to  target type
         * 13   150   153   any
         * 153   158   153   any
         * 227   248   251   Class java/lang/Exception
         * 227   248   261   Class java/lang/StackOverflowError
         * 227   248   276   Class java/lang/ThreadDeath
         * 227   248   281   Class java/lang/Error
         * 190   297   305   any
         * 305   307   305   any
         *  */
        // </editor-fold>
    }

    private int leaveX(ThreadInfo info) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 4: iconst_2
         * 5: iaload
         * 6: ifle          22
         * 9: aload_1
         * 10: getfield      org/openide/util/Mutex$ThreadInfo.rsnapshot:I
         * 13: aload_1
         * 14: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 17: iconst_3
         * 18: iaload
         * 19: if_icmple     30
         * 22: new           java/lang/IllegalStateException
         * 25: dup
         * 26: invokespecial java/lang/IllegalStateException."<init>":()V
         * 29: athrow
         * 30: aload_1
         * 31: getfield      org/openide/util/Mutex$ThreadInfo.rsnapshot:I
         * 34: aload_1
         * 35: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 38: iconst_3
         * 39: iaload
         * 40: if_icmpne     134
         * 43: aload_1
         * 44: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 47: iconst_2
         * 48: dup2
         * 49: iaload
         * 50: iconst_1
         * 51: isub
         * 52: iastore
         * 53: aload_1
         * 54: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 57: iconst_2
         * 58: iaload
         * 59: ifne          192
         * 62: aload_1
         * 63: iconst_0
         * 64: putfield      org/openide/util/Mutex$ThreadInfo.rsnapshot:I
         * 67: aload_1
         * 68: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 71: iconst_3
         * 72: iaload
         * 73: ifle          89
         * 76: aload_1
         * 77: iconst_3
         * 78: putfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 81: aload_0
         * 82: iconst_3
         * 83: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 86: goto          113
         * 89: aload_1
         * 90: iconst_0
         * 91: putfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 94: aload_0
         * 95: iconst_0
         * 96: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 99: aload_0
         * 100: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 103: aload_1
         * 104: getfield      org/openide/util/Mutex$ThreadInfo.t:Ljava/lang/Thread;
         * 107: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
         * 112: pop
         * 113: aload_1
         * 114: iconst_3
         * 115: invokevirtual org/openide/util/Mutex$ThreadInfo.getRunnableCount:(I)I
         * 118: ifle          127
         * 121: aload_0
         * 122: invokespecial org/openide/util/Mutex.wakeUpReaders:()V
         * 125: iconst_3
         * 126: ireturn
         * 127: aload_0
         * 128: invokespecial org/openide/util/Mutex.wakeUpOthers:()V
         * 131: goto          192
         * 134: aload_1
         * 135: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 138: iconst_3
         * 139: iaload
         * 140: ifgt          151
         * 143: new           java/lang/IllegalStateException
         * 146: dup
         * 147: invokespecial java/lang/IllegalStateException."<init>":()V
         * 150: athrow
         * 151: aload_1
         * 152: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 155: iconst_3
         * 156: dup2
         * 157: iaload
         * 158: iconst_1
         * 159: isub
         * 160: dup_x2
         * 161: iastore
         * 162: ifne          192
         * 165: aload_0
         * 166: getfield      org/openide/util/Mutex.readersNo:I
         * 169: ifgt          180
         * 172: new           java/lang/IllegalStateException
         * 175: dup
         * 176: invokespecial java/lang/IllegalStateException."<init>":()V
         * 179: athrow
         * 180: aload_0
         * 181: dup
         * 182: getfield      org/openide/util/Mutex.readersNo:I
         * 185: iconst_1
         * 186: isub
         * 187: putfield      org/openide/util/Mutex.readersNo:I
         * 190: iconst_2
         * 191: ireturn
         * 192: iconst_0
         * 193: ireturn
         *  */
        // </editor-fold>
    }

    private int leaveS(ThreadInfo info) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 4: iconst_3
         * 5: iaload
         * 6: ifle          18
         * 9: aload_1
         * 10: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 13: iconst_2
         * 14: iaload
         * 15: ifle          26
         * 18: new           java/lang/IllegalStateException
         * 21: dup
         * 22: invokespecial java/lang/IllegalStateException."<init>":()V
         * 25: athrow
         * 26: aload_1
         * 27: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 30: iconst_3
         * 31: dup2
         * 32: iaload
         * 33: iconst_1
         * 34: isub
         * 35: iastore
         * 36: aload_1
         * 37: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 40: iconst_3
         * 41: iaload
         * 42: ifne          305
         * 45: aload_1
         * 46: iconst_0
         * 47: putfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 50: aload_0
         * 51: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 54: aload_1
         * 55: getfield      org/openide/util/Mutex$ThreadInfo.t:Ljava/lang/Thread;
         * 58: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
         * 63: pop
         * 64: aload_0
         * 65: getfield      org/openide/util/Mutex.readersNo:I
         * 68: ifgt          79
         * 71: new           java/lang/IllegalStateException
         * 74: dup
         * 75: invokespecial java/lang/IllegalStateException."<init>":()V
         * 78: athrow
         * 79: aload_0
         * 80: dup
         * 81: getfield      org/openide/util/Mutex.readersNo:I
         * 84: iconst_1
         * 85: isub
         * 86: putfield      org/openide/util/Mutex.readersNo:I
         * 89: aload_0
         * 90: getfield      org/openide/util/Mutex.readersNo:I
         * 93: ifne          118
         * 96: aload_0
         * 97: iconst_0
         * 98: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 101: aload_1
         * 102: iconst_2
         * 103: invokevirtual org/openide/util/Mutex$ThreadInfo.getRunnableCount:(I)I
         * 106: ifle          111
         * 109: iconst_2
         * 110: ireturn
         * 111: aload_0
         * 112: invokespecial org/openide/util/Mutex.wakeUpOthers:()V
         * 115: goto          305
         * 118: aload_1
         * 119: iconst_2
         * 120: invokevirtual org/openide/util/Mutex$ThreadInfo.getRunnableCount:(I)I
         * 123: ifle          128
         * 126: iconst_2
         * 127: ireturn
         * 128: aload_0
         * 129: iconst_0
         * 130: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 133: iconst_1
         * 134: if_icmpne     305
         * 137: aload_0
         * 138: getfield      org/openide/util/Mutex.readersNo:I
         * 141: iconst_1
         * 142: if_icmpne     305
         * 145: iconst_0
         * 146: istore_2
         * 147: iload_2
         * 148: aload_0
         * 149: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 152: invokeinterface java/util/List.size:()I
         * 157: if_icmpge     305
         * 160: aload_0
         * 161: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 164: iload_2
         * 165: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
         * 170: checkcast     org/openide/util/Mutex$QueueCell
         * 173: astore_3
         * 174: aload_3
         * 175: dup
         * 176: astore        4
         * 178: monitorenter
         * 179: aload_3
         * 180: invokevirtual org/openide/util/Mutex$QueueCell.isGotOut:()Z
         * 183: ifeq          206
         * 186: aload_0
         * 187: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 190: iload_2
         * 191: iinc          2, -1
         * 194: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 199: pop
         * 200: aload         4
         * 202: monitorexit
         * 203: goto          299
         * 206: aload_0
         * 207: aload_3
         * 208: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 211: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 214: astore        5
         * 216: aload         5
         * 218: ifnull        285
         * 221: aload         5
         * 223: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 226: iconst_3
         * 227: if_icmpne     285
         * 230: aload_3
         * 231: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 234: iconst_2
         * 235: if_icmpeq     246
         * 238: new           java/lang/IllegalStateException
         * 241: dup
         * 242: invokespecial java/lang/IllegalStateException."<init>":()V
         * 245: athrow
         * 246: aload_0
         * 247: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 250: invokeinterface java/util/List.size:()I
         * 255: iconst_1
         * 256: if_icmpne     264
         * 259: aload_0
         * 260: iconst_2
         * 261: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 264: aload         5
         * 266: iconst_2
         * 267: putfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 270: aload_0
         * 271: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 274: iload_2
         * 275: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 280: pop
         * 281: aload_3
         * 282: invokevirtual org/openide/util/Mutex$QueueCell.wakeMeUp:()V
         * 285: aload         4
         * 287: monitorexit
         * 288: goto          305
         * 291: astore        6
         * 293: aload         4
         * 295: monitorexit
         * 296: aload         6
         * 298: athrow
         * 299: iinc          2, 1
         * 302: goto          147
         * 305: iconst_0
         * 306: ireturn
         * Exception table:
         * from    to  target type
         * 179   203   291   any
         * 206   288   291   any
         * 291   296   291   any
         *  */
        // </editor-fold>
    }

    private QueueCell chain(int requested, Thread t, int priority) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/Mutex$QueueCell
         * 3: dup
         * 4: iload_1
         * 5: aload_2
         * 6: invokespecial org/openide/util/Mutex$QueueCell."<init>":(ILjava/lang/Thread;)V
         * 9: astore        4
         * 11: aload         4
         * 13: iload_3
         * 14: putfield      org/openide/util/Mutex$QueueCell.priority2:I
         * 17: aload_0
         * 18: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 21: invokeinterface java/util/List.size:()I
         * 26: istore        5
         * 28: iload         5
         * 30: ifne          48
         * 33: aload_0
         * 34: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 37: aload         4
         * 39: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
         * 44: pop
         * 45: goto          153
         * 48: aload         4
         * 50: invokevirtual org/openide/util/Mutex$QueueCell.getPriority:()J
         * 53: ldc2_w        2147483647l
         * 56: lcmp
         * 57: ifne          75
         * 60: aload_0
         * 61: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 64: iconst_0
         * 65: aload         4
         * 67: invokeinterface java/util/List.add:(ILjava/lang/Object;)V
         * 72: goto          153
         * 75: iconst_0
         * 76: istore        7
         * 78: aload_0
         * 79: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 82: iload         7
         * 84: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
         * 89: checkcast     org/openide/util/Mutex$QueueCell
         * 92: astore        6
         * 94: aload         6
         * 96: invokevirtual org/openide/util/Mutex$QueueCell.getPriority:()J
         * 99: aload         4
         * 101: invokevirtual org/openide/util/Mutex$QueueCell.getPriority:()J
         * 104: lcmp
         * 105: ifge          124
         * 108: aload_0
         * 109: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 112: iload         7
         * 114: aload         4
         * 116: invokeinterface java/util/List.add:(ILjava/lang/Object;)V
         * 121: goto          134
         * 124: iinc          7, 1
         * 127: iload         7
         * 129: iload         5
         * 131: if_icmplt     78
         * 134: iload         7
         * 136: iload         5
         * 138: if_icmpne     153
         * 141: aload_0
         * 142: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 145: aload         4
         * 147: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
         * 152: pop
         * 153: aload         4
         * 155: areturn
         *  */
        // </editor-fold>
    }

    private void wakeUpOthers() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iconst_0
         * 2: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 5: iconst_2
         * 6: if_icmpeq     18
         * 9: aload_0
         * 10: iconst_0
         * 11: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 14: iconst_1
         * 15: if_icmpne     26
         * 18: new           java/lang/IllegalStateException
         * 21: dup
         * 22: invokespecial java/lang/IllegalStateException."<init>":()V
         * 25: athrow
         * 26: aload_0
         * 27: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 30: invokeinterface java/util/List.isEmpty:()Z
         * 35: ifeq          39
         * 38: return
         * 39: iconst_0
         * 40: istore_1
         * 41: iload_1
         * 42: aload_0
         * 43: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 46: invokeinterface java/util/List.size:()I
         * 51: if_icmpge     234
         * 54: aload_0
         * 55: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 58: iload_1
         * 59: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
         * 64: checkcast     org/openide/util/Mutex$QueueCell
         * 67: astore_2
         * 68: aload_2
         * 69: dup
         * 70: astore_3
         * 71: monitorenter
         * 72: aload_2
         * 73: invokevirtual org/openide/util/Mutex$QueueCell.isGotOut:()Z
         * 76: ifeq          98
         * 79: aload_0
         * 80: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 83: iload_1
         * 84: iinc          1, -1
         * 87: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 92: pop
         * 93: aload_3
         * 94: monitorexit
         * 95: goto          228
         * 98: aload_0
         * 99: aload_2
         * 100: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 103: invokespecial org/openide/util/Mutex.isCompatible:(I)Z
         * 106: ifeq          206
         * 109: aload_0
         * 110: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 113: iload_1
         * 114: iinc          1, -1
         * 117: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 122: pop
         * 123: aload_2
         * 124: invokevirtual org/openide/util/Mutex$QueueCell.wakeMeUp:()V
         * 127: aload_0
         * 128: aload_2
         * 129: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 132: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 135: aload_0
         * 136: aload_2
         * 137: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 140: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 143: ifnonnull     216
         * 146: new           org/openide/util/Mutex$ThreadInfo
         * 149: dup
         * 150: aload_2
         * 151: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 154: aload_2
         * 155: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 158: invokespecial org/openide/util/Mutex$ThreadInfo."<init>":(Ljava/lang/Thread;I)V
         * 161: astore        4
         * 163: aload         4
         * 165: iconst_1
         * 166: putfield      org/openide/util/Mutex$ThreadInfo.forced:Z
         * 169: aload_2
         * 170: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 173: iconst_3
         * 174: if_icmpne     187
         * 177: aload_0
         * 178: dup
         * 179: getfield      org/openide/util/Mutex.readersNo:I
         * 182: iconst_1
         * 183: iadd
         * 184: putfield      org/openide/util/Mutex.readersNo:I
         * 187: aload_0
         * 188: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 191: aload_2
         * 192: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 195: aload         4
         * 197: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 202: pop
         * 203: goto          216
         * 206: aload_0
         * 207: iconst_1
         * 208: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 211: aload_3
         * 212: monitorexit
         * 213: goto          234
         * 216: aload_3
         * 217: monitorexit
         * 218: goto          228
         * 221: astore        5
         * 223: aload_3
         * 224: monitorexit
         * 225: aload         5
         * 227: athrow
         * 228: iinc          1, 1
         * 231: goto          41
         * 234: return
         * Exception table:
         * from    to  target type
         * 72    95   221   any
         * 98   213   221   any
         * 216   218   221   any
         * 221   225   221   any
         *  */
        // </editor-fold>
    }

    private void wakeUpReaders() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.$assertionsDisabled:Z
         * 3: ifne          31
         * 6: aload_0
         * 7: iconst_0
         * 8: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 11: ifeq          31
         * 14: aload_0
         * 15: iconst_0
         * 16: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 19: iconst_3
         * 20: if_icmpeq     31
         * 23: new           java/lang/AssertionError
         * 26: dup
         * 27: invokespecial java/lang/AssertionError."<init>":()V
         * 30: athrow
         * 31: aload_0
         * 32: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 35: invokeinterface java/util/List.isEmpty:()Z
         * 40: ifeq          44
         * 43: return
         * 44: iconst_0
         * 45: istore_1
         * 46: iload_1
         * 47: aload_0
         * 48: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 51: invokeinterface java/util/List.size:()I
         * 56: if_icmpge     212
         * 59: aload_0
         * 60: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 63: iload_1
         * 64: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
         * 69: checkcast     org/openide/util/Mutex$QueueCell
         * 72: astore_2
         * 73: aload_2
         * 74: dup
         * 75: astore_3
         * 76: monitorenter
         * 77: aload_2
         * 78: invokevirtual org/openide/util/Mutex$QueueCell.isGotOut:()Z
         * 81: ifeq          103
         * 84: aload_0
         * 85: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 88: iload_1
         * 89: iinc          1, -1
         * 92: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 97: pop
         * 98: aload_3
         * 99: monitorexit
         * 100: goto          206
         * 103: aload_2
         * 104: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 107: iconst_3
         * 108: if_icmpne     194
         * 111: aload_0
         * 112: getfield      org/openide/util/Mutex.waiters:Ljava/util/List;
         * 115: iload_1
         * 116: iinc          1, -1
         * 119: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
         * 124: pop
         * 125: aload_2
         * 126: invokevirtual org/openide/util/Mutex$QueueCell.wakeMeUp:()V
         * 129: aload_0
         * 130: iconst_3
         * 131: invokespecial org/openide/util/Mutex.setGrantedMode:(I)V
         * 134: aload_0
         * 135: aload_2
         * 136: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 139: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 142: ifnonnull     194
         * 145: new           org/openide/util/Mutex$ThreadInfo
         * 148: dup
         * 149: aload_2
         * 150: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 153: aload_2
         * 154: getfield      org/openide/util/Mutex$QueueCell.mode:I
         * 157: invokespecial org/openide/util/Mutex$ThreadInfo."<init>":(Ljava/lang/Thread;I)V
         * 160: astore        4
         * 162: aload         4
         * 164: iconst_1
         * 165: putfield      org/openide/util/Mutex$ThreadInfo.forced:Z
         * 168: aload_0
         * 169: dup
         * 170: getfield      org/openide/util/Mutex.readersNo:I
         * 173: iconst_1
         * 174: iadd
         * 175: putfield      org/openide/util/Mutex.readersNo:I
         * 178: aload_0
         * 179: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 182: aload_2
         * 183: getfield      org/openide/util/Mutex$QueueCell.t:Ljava/lang/Thread;
         * 186: aload         4
         * 188: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
         * 193: pop
         * 194: aload_3
         * 195: monitorexit
         * 196: goto          206
         * 199: astore        5
         * 201: aload_3
         * 202: monitorexit
         * 203: aload         5
         * 205: athrow
         * 206: iinc          1, 1
         * 209: goto          46
         * 212: return
         * Exception table:
         * from    to  target type
         * 77   100   199   any
         * 103   196   199   any
         * 199   203   199   any
         *  */
        // </editor-fold>
    }

    private void postRequest(int mutexMode, Runnable run, Executor exec) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getstatic     org/openide/util/Mutex.EVENT:Lorg/openide/util/Mutex;
         * 4: if_acmpne     12
         * 7: aload_2
         * 8: invokestatic  org/openide/util/Mutex.doEventRequest:(Ljava/lang/Runnable;)V
         * 11: return
         * 12: aload_0
         * 13: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 16: ifnull        40
         * 19: aload_0
         * 20: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 23: checkcast     org/openide/util/Mutex
         * 26: astore        4
         * 28: aload         4
         * 30: iload_1
         * 31: aload_2
         * 32: aload_0
         * 33: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 36: invokespecial org/openide/util/Mutex.postRequest:(ILjava/lang/Runnable;Ljava/util/concurrent/Executor;)V
         * 39: return
         * 40: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 43: astore        4
         * 45: aload_0
         * 46: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 49: dup
         * 50: astore        6
         * 52: monitorenter
         * 53: aload_0
         * 54: aload         4
         * 56: invokespecial org/openide/util/Mutex.getThreadInfo:(Ljava/lang/Thread;)Lorg/openide/util/Mutex$ThreadInfo;
         * 59: astore        5
         * 61: aload         5
         * 63: ifnull        110
         * 66: iload_1
         * 67: aload         5
         * 69: getfield      org/openide/util/Mutex$ThreadInfo.mode:I
         * 72: if_icmpne     99
         * 75: aload         5
         * 77: getfield      org/openide/util/Mutex$ThreadInfo.counts:[I
         * 80: iconst_5
         * 81: iload_1
         * 82: isub
         * 83: iaload
         * 84: ifne          99
         * 87: aload_0
         * 88: iload_1
         * 89: aload         4
         * 91: lconst_0
         * 92: invokespecial org/openide/util/Mutex.enter:(ILjava/lang/Thread;J)Z
         * 95: pop
         * 96: goto          110
         * 99: aload         5
         * 101: iload_1
         * 102: aload_2
         * 103: invokevirtual org/openide/util/Mutex$ThreadInfo.enqueue:(ILjava/lang/Runnable;)V
         * 106: aload         6
         * 108: monitorexit
         * 109: return
         * 110: aload         6
         * 112: monitorexit
         * 113: goto          124
         * 116: astore        7
         * 118: aload         6
         * 120: monitorexit
         * 121: aload         7
         * 123: athrow
         * 124: aload         5
         * 126: ifnonnull     188
         * 129: aload_3
         * 130: ifnull        152
         * 133: aload_3
         * 134: new           org/openide/util/Mutex$1Exec
         * 137: dup
         * 138: aload_0
         * 139: iload_1
         * 140: aload         4
         * 142: aload_2
         * 143: invokespecial org/openide/util/Mutex$1Exec."<init>":(Lorg/openide/util/Mutex;ILjava/lang/Thread;Ljava/lang/Runnable;)V
         * 146: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
         * 151: return
         * 152: aload_0
         * 153: iload_1
         * 154: aload         4
         * 156: lconst_0
         * 157: invokespecial org/openide/util/Mutex.enter:(ILjava/lang/Thread;J)Z
         * 160: pop
         * 161: aload_2
         * 162: invokeinterface java/lang/Runnable.run:()V
         * 167: aload_0
         * 168: aload         4
         * 170: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 173: goto          187
         * 176: astore        8
         * 178: aload_0
         * 179: aload         4
         * 181: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 184: aload         8
         * 186: athrow
         * 187: return
         * 188: aload_2
         * 189: invokeinterface java/lang/Runnable.run:()V
         * 194: aload_0
         * 195: aload         4
         * 197: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 200: goto          214
         * 203: astore        9
         * 205: aload_0
         * 206: aload         4
         * 208: invokevirtual org/openide/util/Mutex.leave:(Ljava/lang/Thread;)V
         * 211: aload         9
         * 213: athrow
         * 214: return
         * Exception table:
         * from    to  target type
         * 53   109   116   any
         * 110   113   116   any
         * 116   121   116   any
         * 161   167   176   any
         * 176   178   176   any
         * 188   194   203   any
         * 203   205   203   any
         *  */
        // </editor-fold>
    }

    private boolean isCompatible(int requested) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: iconst_3
         * 2: if_icmpne     24
         * 5: aload_0
         * 6: iconst_0
         * 7: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 10: iconst_1
         * 11: if_icmpne     24
         * 14: aload_0
         * 15: invokespecial org/openide/util/Mutex.getOrigMode:()I
         * 18: iconst_3
         * 19: if_icmpne     24
         * 22: iconst_1
         * 23: ireturn
         * 24: getstatic     org/openide/util/Mutex.cmatrix:[[Z
         * 27: iload_1
         * 28: aaload
         * 29: aload_0
         * 30: iconst_0
         * 31: invokespecial org/openide/util/Mutex.getGrantedMode:(Z)I
         * 34: baload
         * 35: ireturn
         *  */
        // </editor-fold>
    }

    private ThreadInfo getThreadInfo(Thread t) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial org/openide/util/Mutex.getRegisteredThreads:()Ljava/util/Map;
         * 4: aload_1
         * 5: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
         * 10: checkcast     org/openide/util/Mutex$ThreadInfo
         * 13: areturn
         *  */
        // </editor-fold>
    }

    private boolean canUpgrade(int threadGranted, int requested) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_1
         * 1: iconst_3
         * 2: if_icmpne     22
         * 5: iload_2
         * 6: iconst_2
         * 7: if_icmpne     22
         * 10: aload_0
         * 11: getfield      org/openide/util/Mutex.readersNo:I
         * 14: iconst_1
         * 15: if_icmpne     22
         * 18: iconst_1
         * 19: goto          23
         * 22: iconst_0
         * 23: ireturn
         *  */
        // </editor-fold>
    }

    private <T extends Object> T doWrapperAccess(ExceptionAction<T> action, Runnable runnable, boolean readOnly) throws MutexException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/openide/util/Mutex$1R
         * 3: dup
         * 4: aload_0
         * 5: iload_3
         * 6: aload_1
         * 7: aload_2
         * 8: invokespecial org/openide/util/Mutex$1R."<init>":(Lorg/openide/util/Mutex;ZLorg/openide/util/Mutex$ExceptionAction;Ljava/lang/Runnable;)V
         * 11: astore        4
         * 13: aload_0
         * 14: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 17: checkcast     org/openide/util/Mutex
         * 20: astore        5
         * 22: aload         5
         * 24: invokevirtual org/openide/util/Mutex.isWriteAccess:()Z
         * 27: ifne          38
         * 30: aload         5
         * 32: invokevirtual org/openide/util/Mutex.isReadAccess:()Z
         * 35: ifeq          46
         * 38: aload         4
         * 40: invokevirtual org/openide/util/Mutex$1R.run:()V
         * 43: goto          57
         * 46: aload_0
         * 47: getfield      org/openide/util/Mutex.wrapper:Ljava/util/concurrent/Executor;
         * 50: aload         4
         * 52: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
         * 57: aload         4
         * 59: getfield      org/openide/util/Mutex$1R.e:Lorg/openide/util/MutexException;
         * 62: ifnull        71
         * 65: aload         4
         * 67: getfield      org/openide/util/Mutex$1R.e:Lorg/openide/util/MutexException;
         * 70: athrow
         * 71: aload         4
         * 73: getfield      org/openide/util/Mutex$1R.ret:Ljava/lang/Object;
         * 76: areturn
         *  */
        // </editor-fold>
    }

    private static void doEvent(Runnable run) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  java/awt/EventQueue.isDispatchThread:()Z
         * 3: ifeq          15
         * 6: aload_0
         * 7: invokeinterface java/lang/Runnable.run:()V
         * 12: goto          19
         * 15: aload_0
         * 16: invokestatic  java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
         * 19: return
         *  */
        // </editor-fold>
    }

    private static void doEventRequest(Runnable run) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
         * 4: return
         *  */
        // </editor-fold>
    }

    private static <T extends Object> T doEventAccess(ExceptionAction<T> run) throws MutexException {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  org/openide/util/Mutex.isDispatchThread:()Z
         * 3: ifeq          26
         * 6: aload_0
         * 7: invokeinterface org/openide/util/Mutex$ExceptionAction.run:()Ljava/lang/Object;
         * 12: areturn
         * 13: astore_1
         * 14: aload_1
         * 15: athrow
         * 16: astore_1
         * 17: new           org/openide/util/MutexException
         * 20: dup
         * 21: aload_1
         * 22: invokespecial org/openide/util/MutexException."<init>":(Ljava/lang/Exception;)V
         * 25: athrow
         * 26: new           java/util/concurrent/atomic/AtomicReference
         * 29: dup
         * 30: invokespecial java/util/concurrent/atomic/AtomicReference."<init>":()V
         * 33: astore_1
         * 34: new           java/util/concurrent/atomic/AtomicBoolean
         * 37: dup
         * 38: invokespecial java/util/concurrent/atomic/AtomicBoolean."<init>":()V
         * 41: astore_2
         * 42: new           java/util/concurrent/atomic/AtomicBoolean
         * 45: dup
         * 46: invokespecial java/util/concurrent/atomic/AtomicBoolean."<init>":()V
         * 49: astore_3
         * 50: new           java/util/concurrent/atomic/AtomicBoolean
         * 53: dup
         * 54: invokespecial java/util/concurrent/atomic/AtomicBoolean."<init>":()V
         * 57: astore        4
         * 59: new           org/openide/util/Mutex$1AWTWorker
         * 62: dup
         * 63: aload_2
         * 64: aload_1
         * 65: aload_0
         * 66: aload_3
         * 67: invokespecial org/openide/util/Mutex$1AWTWorker."<init>":(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;Lorg/openide/util/Mutex$ExceptionAction;Ljava/util/concurrent/atomic/AtomicBoolean;)V
         * 70: astore        5
         * 72: aload         5
         * 74: invokestatic  java/awt/EventQueue.invokeAndWait:(Ljava/lang/Runnable;)V
         * 77: aload         4
         * 79: iconst_1
         * 80: invokevirtual java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
         * 83: goto          111
         * 86: astore        5
         * 88: aload_1
         * 89: aload         5
         * 91: invokestatic  org/openide/util/Union2.createSecond:(Ljava/lang/Object;)Lorg/openide/util/Union2;
         * 94: invokevirtual java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
         * 97: goto          111
         * 100: astore        5
         * 102: aload_1
         * 103: aload         5
         * 105: invokestatic  org/openide/util/Union2.createSecond:(Ljava/lang/Object;)Lorg/openide/util/Union2;
         * 108: invokevirtual java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
         * 111: aload_1
         * 112: invokevirtual java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
         * 115: checkcast     org/openide/util/Union2
         * 118: astore        5
         * 120: aload         5
         * 122: ifnonnull     171
         * 125: new           java/lang/IllegalStateException
         * 128: dup
         * 129: new           java/lang/StringBuilder
         * 132: dup
         * 133: invokespecial java/lang/StringBuilder."<init>":()V
         * 136: ldc           #210991: got neither a result nor an exception; started=
         * 138: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 141: aload_2
         * 142: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 145: ldc            finished=
         * 147: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 150: aload_3
         * 151: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 154: ldc            invoked=
         * 156: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 159: aload         4
         * 161: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 164: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 167: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 170: athrow
         * 171: aload         5
         * 173: invokevirtual org/openide/util/Union2.hasFirst:()Z
         * 176: ifeq          185
         * 179: aload         5
         * 181: invokevirtual org/openide/util/Union2.first:()Ljava/lang/Object;
         * 184: areturn
         * 185: aload         5
         * 187: invokevirtual org/openide/util/Union2.second:()Ljava/lang/Object;
         * 190: checkcast     java/lang/Throwable
         * 193: astore        6
         * 195: aload         6
         * 197: instanceof    java/lang/RuntimeException
         * 200: ifeq          209
         * 203: aload         6
         * 205: checkcast     java/lang/RuntimeException
         * 208: athrow
         * 209: aload         6
         * 211: invokestatic  org/openide/util/Mutex.notifyException:(Ljava/lang/Throwable;)Lorg/openide/util/MutexException;
         * 214: athrow
         * Exception table:
         * from    to  target type
         * 6    12    13   Class java/lang/RuntimeException
         * 6    12    16   Class java/lang/Exception
         * 59    83    86   Class java/lang/InterruptedException
         * 59    83   100   Class java/lang/reflect/InvocationTargetException
         *  */
        // </editor-fold>
    }

    static boolean isDispatchThread() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  java/awt/EventQueue.isDispatchThread:()Z
         * 3: istore_0
         * 4: iload_0
         * 5: ifne          39
         * 8: invokestatic  org/openide/util/Utilities.getOperatingSystem:()I
         * 11: bipush        8
         * 13: if_icmpne     39
         * 16: invokestatic  java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 19: invokevirtual java/lang/Object.getClass:()Ljava/lang/Class;
         * 22: invokevirtual java/lang/Class.getName:()Ljava/lang/String;
         * 25: ldc           EventDispatchThread
         * 27: invokevirtual java/lang/String.indexOf:(Ljava/lang/String;)I
         * 30: iflt          37
         * 33: iconst_1
         * 34: goto          38
         * 37: iconst_0
         * 38: istore_0
         * 39: iload_0
         * 40: ireturn
         *  */
        // </editor-fold>
    }

    private static MutexException notifyException(Throwable t) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: instanceof    java/lang/reflect/InvocationTargetException
         * 4: ifeq          15
         * 7: aload_0
         * 8: checkcast     java/lang/reflect/InvocationTargetException
         * 11: invokestatic  org/openide/util/Mutex.unfoldInvocationTargetException:(Ljava/lang/reflect/InvocationTargetException;)Ljava/lang/Throwable;
         * 14: astore_0
         * 15: aload_0
         * 16: instanceof    java/lang/Error
         * 19: ifeq          31
         * 22: aload_0
         * 23: invokestatic  org/openide/util/Mutex.annotateEventStack:(Ljava/lang/Throwable;)V
         * 26: aload_0
         * 27: checkcast     java/lang/Error
         * 30: athrow
         * 31: aload_0
         * 32: instanceof    java/lang/RuntimeException
         * 35: ifeq          47
         * 38: aload_0
         * 39: invokestatic  org/openide/util/Mutex.annotateEventStack:(Ljava/lang/Throwable;)V
         * 42: aload_0
         * 43: checkcast     java/lang/RuntimeException
         * 46: athrow
         * 47: new           org/openide/util/MutexException
         * 50: dup
         * 51: aload_0
         * 52: checkcast     java/lang/Exception
         * 55: invokespecial org/openide/util/MutexException."<init>":(Ljava/lang/Exception;)V
         * 58: astore_1
         * 59: aload_1
         * 60: aload_0
         * 61: invokevirtual org/openide/util/MutexException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
         * 64: pop
         * 65: aload_1
         * 66: areturn
         *  */
        // </editor-fold>
    }

    private static void annotateEventStack(Throwable t) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    private static Throwable unfoldInvocationTargetException(InvocationTargetException e) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException:()Ljava/lang/Throwable;
         * 4: astore_1
         * 5: aload_1
         * 6: instanceof    java/lang/reflect/InvocationTargetException
         * 9: ifeq          20
         * 12: aload_1
         * 13: checkcast     java/lang/reflect/InvocationTargetException
         * 16: astore_0
         * 17: goto          22
         * 20: aconst_null
         * 21: astore_0
         * 22: aload_0
         * 23: ifnonnull     0
         * 26: aload_1
         * 27: areturn
         *  */
        // </editor-fold>
    }

    private void setGrantedMode(int mode) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.$assertionsDisabled:Z
         * 3: ifne          24
         * 6: aload_0
         * 7: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 10: invokestatic  java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
         * 13: ifne          24
         * 16: new           java/lang/AssertionError
         * 19: dup
         * 20: invokespecial java/lang/AssertionError."<init>":()V
         * 23: athrow
         * 24: aload_0
         * 25: getfield      org/openide/util/Mutex.grantedMode:I
         * 28: iconst_1
         * 29: if_icmpeq     45
         * 32: iload_1
         * 33: iconst_1
         * 34: if_icmpne     45
         * 37: aload_0
         * 38: aload_0
         * 39: getfield      org/openide/util/Mutex.grantedMode:I
         * 42: putfield      org/openide/util/Mutex.origMode:I
         * 45: aload_0
         * 46: iload_1
         * 47: putfield      org/openide/util/Mutex.grantedMode:I
         * 50: return
         *  */
        // </editor-fold>
    }

    private int getGrantedMode(boolean skipCheck) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.$assertionsDisabled:Z
         * 3: ifne          28
         * 6: iload_1
         * 7: ifne          28
         * 10: aload_0
         * 11: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 14: invokestatic  java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
         * 17: ifne          28
         * 20: new           java/lang/AssertionError
         * 23: dup
         * 24: invokespecial java/lang/AssertionError."<init>":()V
         * 27: athrow
         * 28: aload_0
         * 29: getfield      org/openide/util/Mutex.grantedMode:I
         * 32: ireturn
         *  */
        // </editor-fold>
    }

    private int getOrigMode() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.$assertionsDisabled:Z
         * 3: ifne          24
         * 6: aload_0
         * 7: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 10: invokestatic  java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
         * 13: ifne          24
         * 16: new           java/lang/AssertionError
         * 19: dup
         * 20: invokespecial java/lang/AssertionError."<init>":()V
         * 23: athrow
         * 24: aload_0
         * 25: getfield      org/openide/util/Mutex.origMode:I
         * 28: ireturn
         *  */
        // </editor-fold>
    }

    private Map<Thread, ThreadInfo> getRegisteredThreads() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/Mutex.$assertionsDisabled:Z
         * 3: ifne          24
         * 6: aload_0
         * 7: getfield      org/openide/util/Mutex.LOCK:Ljava/lang/Object;
         * 10: invokestatic  java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
         * 13: ifne          24
         * 16: new           java/lang/AssertionError
         * 19: dup
         * 20: invokespecial java/lang/AssertionError."<init>":()V
         * 23: athrow
         * 24: aload_0
         * 25: getfield      org/openide/util/Mutex.registeredThreads:Ljava/util/Map;
         * 28: areturn
         *  */
        // </editor-fold>
    }
}
