package org.openide.util;

import java.util.List;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public final class ChangeSupport {

    private static final Logger LOG;
    final List<ChangeListener> listeners;
    private final Object source;

    public ChangeSupport(Object source) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: new           java/util/concurrent/CopyOnWriteArrayList
         * 8: dup
         * 9: invokespecial java/util/concurrent/CopyOnWriteArrayList."<init>":()V
         * 12: putfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 15: aload_0
         * 16: aload_1
         * 17: putfield      org/openide/util/ChangeSupport.source:Ljava/lang/Object;
         * 20: return
         *  */
        // </editor-fold>
    }

    public void addChangeListener(ChangeListener listener) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnonnull     5
         * 4: return
         * 5: getstatic     org/openide/util/ChangeSupport.LOG:Ljava/util/logging/Logger;
         * 8: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 11: invokevirtual java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
         * 14: ifeq          72
         * 17: aload_0
         * 18: getfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 21: aload_1
         * 22: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
         * 27: ifeq          72
         * 30: getstatic     org/openide/util/ChangeSupport.LOG:Ljava/util/logging/Logger;
         * 33: getstatic     java/util/logging/Level.FINE:Ljava/util/logging/Level;
         * 36: ldc           diagnostics for #167491
         * 38: new           java/lang/IllegalStateException
         * 41: dup
         * 42: new           java/lang/StringBuilder
         * 45: dup
         * 46: invokespecial java/lang/StringBuilder."<init>":()V
         * 49: ldc           Added
         * 51: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 54: aload_1
         * 55: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
         * 58: ldc            multiply
         * 60: invokevirtual java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 63: invokevirtual java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 66: invokespecial java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
         * 69: invokevirtual java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 72: aload_0
         * 73: getfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 76: aload_1
         * 77: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
         * 82: pop
         * 83: return
         *  */
        // </editor-fold>
    }

    public void removeChangeListener(ChangeListener listener) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_1
         * 1: ifnonnull     5
         * 4: return
         * 5: aload_0
         * 6: getfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 9: aload_1
         * 10: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
         * 15: pop
         * 16: return
         *  */
        // </editor-fold>
    }

    public void fireChange() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 4: invokeinterface java/util/List.isEmpty:()Z
         * 9: ifeq          13
         * 12: return
         * 13: aload_0
         * 14: new           javax/swing/event/ChangeEvent
         * 17: dup
         * 18: aload_0
         * 19: getfield      org/openide/util/ChangeSupport.source:Ljava/lang/Object;
         * 22: invokespecial javax/swing/event/ChangeEvent."<init>":(Ljava/lang/Object;)V
         * 25: invokespecial org/openide/util/ChangeSupport.fireChange:(Ljavax/swing/event/ChangeEvent;)V
         * 28: return
         *  */
        // </editor-fold>
    }

    private void fireChange(ChangeEvent event) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     org/openide/util/ChangeSupport.$assertionsDisabled:Z
         * 3: ifne          18
         * 6: aload_1
         * 7: ifnonnull     18
         * 10: new           java/lang/AssertionError
         * 13: dup
         * 14: invokespecial java/lang/AssertionError."<init>":()V
         * 17: athrow
         * 18: aload_0
         * 19: getfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 22: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
         * 27: astore_2
         * 28: aload_2
         * 29: invokeinterface java/util/Iterator.hasNext:()Z
         * 34: ifeq          67
         * 37: aload_2
         * 38: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
         * 43: checkcast     javax/swing/event/ChangeListener
         * 46: astore_3
         * 47: aload_3
         * 48: aload_1
         * 49: invokeinterface javax/swing/event/ChangeListener.stateChanged:(Ljavax/swing/event/ChangeEvent;)V
         * 54: goto          64
         * 57: astore        4
         * 59: aload         4
         * 61: invokestatic  org/openide/util/Exceptions.printStackTrace:(Ljava/lang/Throwable;)V
         * 64: goto          28
         * 67: return
         * Exception table:
         * from    to  target type
         * 47    54    57   Class java/lang/RuntimeException
         *  */
        // </editor-fold>
    }

    public boolean hasListeners() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/ChangeSupport.listeners:Ljava/util/List;
         * 4: invokeinterface java/util/List.isEmpty:()Z
         * 9: ifne          16
         * 12: iconst_1
         * 13: goto          17
         * 16: iconst_0
         * 17: ireturn
         *  */
        // </editor-fold>
    }
}
