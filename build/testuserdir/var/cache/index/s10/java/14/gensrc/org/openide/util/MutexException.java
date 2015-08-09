package org.openide.util;

public class MutexException extends Exception {

    static final long serialVersionUID = 2806363561939985219L;
    private Exception ex;

    public MutexException(Exception ex) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokevirtual java/lang/Exception.toString:()Ljava/lang/String;
         * 5: invokespecial java/lang/Exception."<init>":(Ljava/lang/String;)V
         * 8: aload_0
         * 9: aload_1
         * 10: putfield      org/openide/util/MutexException.ex:Ljava/lang/Exception;
         * 13: return
         *  */
        // </editor-fold>
    }

    public Exception getException() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MutexException.ex:Ljava/lang/Exception;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public Throwable getCause() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      org/openide/util/MutexException.ex:Ljava/lang/Exception;
         * 4: areturn
         *  */
        // </editor-fold>
    }
}
