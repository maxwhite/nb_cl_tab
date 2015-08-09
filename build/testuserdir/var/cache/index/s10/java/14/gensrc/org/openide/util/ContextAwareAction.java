package org.openide.util;

import javax.swing.Action;

public interface ContextAwareAction extends Action {

    public Action createContextAwareInstance(Lookup lkp);
}
