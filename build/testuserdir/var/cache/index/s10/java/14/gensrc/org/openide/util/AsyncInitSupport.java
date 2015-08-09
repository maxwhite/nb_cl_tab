package org.openide.util;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.util.logging.Logger;
import javax.swing.Timer;

final class AsyncInitSupport implements HierarchyListener, Runnable, ActionListener {

    private static final Object CANCELLED_LOCK;
    private static final Logger LOG;
    private Task initTask;
    private boolean wasCancelled;
    private Component comp4Init;
    private AsyncGUIJob initJob;
    Timer timer;

    public AsyncInitSupport(Component comp4Init, AsyncGUIJob initJob) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: aconst_null
         * 6: putfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 9: aload_0
         * 10: aload_1
         * 11: putfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 14: aload_0
         * 15: aload_2
         * 16: putfield      org/openide/util/AsyncInitSupport.initJob:Lorg/openide/util/AsyncGUIJob;
         * 19: aload_1
         * 20: invokevirtual java/awt/Component.isShowing:()Z
         * 23: ifeq          53
         * 26: new           java/lang/IllegalStateException
         * 29: dup
         * 30: new           java/lang/StringBuilder
         * 33: dup
         * 34: invokespecial java/lang/StringBuilder."<init>":()V
         * 37: ldc           Component already shown, can't be inited:
         * 39: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 42: aload_1
         * 43: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 46: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 49: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 52: athrow
         * 53: aload_1
         * 54: aload_0
         * 55: invokevirtual java/awt/Component.addHierarchyListener:(Ljava/awt/event/HierarchyListener;)V
         * 58: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 61: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 64: ldc           addHierarchyListener for {0}
         * 66: aload_1
         * 67: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 70: return
         *  */
        // </editor-fold>
    }

    public void hierarchyChanged(HierarchyEvent evt) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: invokevirtual java/awt/event/HierarchyEvent.getChangeFlags:()J
         * 4: ldc2_w        4l
         * 7: land
         * 8: lconst_0
         * 9: lcmp
         * 10: ifeq          17
         * 13: iconst_1
         * 14: goto          18
         * 17: iconst_0
         * 18: istore_2
         * 19: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 22: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 25: ldc           Hierarchy Changed {0}
         * 27: iload_2
         * 28: invokestatic  java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
         * 31: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 34: iload_2
         * 35: ifeq          135
         * 38: aload_0
         * 39: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 42: invokevirtual java/awt/Component.isShowing:()Z
         * 45: istore_3
         * 46: aload_0
         * 47: getfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 50: ifnonnull     104
         * 53: iload_3
         * 54: ifeq          104
         * 57: aload_0
         * 58: new           javax/swing/Timer
         * 61: dup
         * 62: bipush        20
         * 64: aload_0
         * 65: invokespecial javax/swing/Timer."<init>":(ILjava/awt/event/ActionListener;)V
         * 68: putfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 71: aload_0
         * 72: getfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 75: iconst_0
         * 76: invokevirtual javax/swing/Timer.setRepeats:(Z)V
         * 79: aload_0
         * 80: getfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 83: invokevirtual javax/swing/Timer.start:()V
         * 86: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 89: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 92: ldc           Timer started for {0}
         * 94: aload_0
         * 95: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 98: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 101: goto          135
         * 104: iload_3
         * 105: ifne          135
         * 108: aload_0
         * 109: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 112: aload_0
         * 113: invokevirtual java/awt/Component.removeHierarchyListener:(Ljava/awt/event/HierarchyListener;)V
         * 116: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 119: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 122: ldc           Not showing, cancling for {0}
         * 124: aload_0
         * 125: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 128: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 131: aload_0
         * 132: invokespecial org/openide/util/AsyncInitSupport.cancel:()V
         * 135: return
         *  */
        // </editor-fold>
    }

    public void actionPerformed(ActionEvent ae) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/AsyncInitSupport.wasCancelled:Z
         * 4: ifne          14
         * 7: aload_0
         * 8: getfield      org/openide/util/AsyncInitSupport.initTask:Lorg/openide/util/Task;
         * 11: ifnull        34
         * 14: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 17: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 20: ldc           Detaching {0}
         * 22: aload_0
         * 23: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 26: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 29: aload_0
         * 30: invokespecial org/openide/util/AsyncInitSupport.detach:()V
         * 33: return
         * 34: aload_0
         * 35: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 38: ifnull        70
         * 41: aload_0
         * 42: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 45: invokevirtual java/awt/Component.isDisplayable:()Z
         * 48: ifeq          70
         * 51: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 54: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 57: ldc           Starting {0}
         * 59: aload_0
         * 60: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 63: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 66: aload_0
         * 67: invokespecial org/openide/util/AsyncInitSupport.start:()V
         * 70: return
         *  */
        // </editor-fold>
    }

    private void start() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial org/openide/util/AsyncInitSupport.detach:()V
         * 4: aload_0
         * 5: getfield      org/openide/util/AsyncInitSupport.initTask:Lorg/openide/util/Task;
         * 8: ifnonnull     22
         * 11: aload_0
         * 12: invokestatic  org/openide/util/RequestProcessor.getDefault:()Lorg/openide/util/RequestProcessor;
         * 15: aload_0
         * 16: invokevirtual org/openide/util/RequestProcessor.post:(Ljava/lang/Runnable;)Lorg/openide/util/RequestProcessor$Task;
         * 19: putfield      org/openide/util/AsyncInitSupport.initTask:Lorg/openide/util/Task;
         * 22: return
         *  */
        // </editor-fold>
    }

    private void detach() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 4: ifnull        14
         * 7: aload_0
         * 8: getfield      org/openide/util/AsyncInitSupport.timer:Ljavax/swing/Timer;
         * 11: invokevirtual javax/swing/Timer.stop:()V
         * 14: return
         *  */
        // </editor-fold>
    }

    public void run() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  javax/swing/SwingUtilities.isEventDispatchThread:()Z
         * 3: ifne          100
         * 6: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 9: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 12: ldc           Prepare outside AWT for {0}
         * 14: aload_0
         * 15: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 18: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 21: aload_0
         * 22: getfield      org/openide/util/AsyncInitSupport.initJob:Lorg/openide/util/AsyncGUIJob;
         * 25: invokeinterface org/openide/util/AsyncGUIJob.construct:()V
         * 30: aload_0
         * 31: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 34: aload_0
         * 35: invokevirtual java/awt/Component.removeHierarchyListener:(Ljava/awt/event/HierarchyListener;)V
         * 38: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 41: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 44: ldc           No hierarchy listener for {0}
         * 46: aload_0
         * 47: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 50: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 53: getstatic     org/openide/util/AsyncInitSupport.CANCELLED_LOCK:Ljava/lang/Object;
         * 56: dup
         * 57: astore_2
         * 58: monitorenter
         * 59: aload_0
         * 60: getfield      org/openide/util/AsyncInitSupport.wasCancelled:Z
         * 63: istore_1
         * 64: aload_2
         * 65: monitorexit
         * 66: goto          74
         * 69: astore_3
         * 70: aload_2
         * 71: monitorexit
         * 72: aload_3
         * 73: athrow
         * 74: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 77: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 80: ldc           wasCancelled {0}
         * 82: iload_1
         * 83: invokestatic  java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
         * 86: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 89: iload_1
         * 90: ifne          97
         * 93: aload_0
         * 94: invokestatic  javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
         * 97: goto          117
         * 100: aload_0
         * 101: getfield      org/openide/util/AsyncInitSupport.initJob:Lorg/openide/util/AsyncGUIJob;
         * 104: invokeinterface org/openide/util/AsyncGUIJob.finished:()V
         * 109: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 112: ldc           Second pass finished
         * 114: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
         * 117: return
         * Exception table:
         * from    to  target type
         * 59    66    69   any
         * 69    72    69   any
         *  */
        // </editor-fold>
    }

    private void cancel() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/AsyncInitSupport.initTask:Lorg/openide/util/Task;
         * 4: ifnull        84
         * 7: aload_0
         * 8: getfield      org/openide/util/AsyncInitSupport.initTask:Lorg/openide/util/Task;
         * 11: invokevirtual org/openide/util/Task.isFinished:()Z
         * 14: ifne          84
         * 17: aload_0
         * 18: getfield      org/openide/util/AsyncInitSupport.initJob:Lorg/openide/util/AsyncGUIJob;
         * 21: instanceof    org/openide/util/Cancellable
         * 24: ifeq          84
         * 27: getstatic     org/openide/util/AsyncInitSupport.CANCELLED_LOCK:Ljava/lang/Object;
         * 30: dup
         * 31: astore_1
         * 32: monitorenter
         * 33: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 36: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 39: ldc           Cancelling for {0}
         * 41: aload_0
         * 42: getfield      org/openide/util/AsyncInitSupport.comp4Init:Ljava/awt/Component;
         * 45: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
         * 48: aload_0
         * 49: iconst_1
         * 50: putfield      org/openide/util/AsyncInitSupport.wasCancelled:Z
         * 53: aload_1
         * 54: monitorexit
         * 55: goto          63
         * 58: astore_2
         * 59: aload_1
         * 60: monitorexit
         * 61: aload_2
         * 62: athrow
         * 63: aload_0
         * 64: getfield      org/openide/util/AsyncInitSupport.initJob:Lorg/openide/util/AsyncGUIJob;
         * 67: checkcast     org/openide/util/Cancellable
         * 70: invokeinterface org/openide/util/Cancellable.cancel:()Z
         * 75: pop
         * 76: getstatic     org/openide/util/AsyncInitSupport.LOG:Ljava/util/logging/Logger;
         * 79: ldc           Cancelling done
         * 81: invokevirtual java/util/logging/Logger.fine:(Ljava/lang/String;)V
         * 84: return
         * Exception table:
         * from    to  target type
         * 33    55    58   any
         * 58    61    58   any
         *  */
        // </editor-fold>
    }
}
