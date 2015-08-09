/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.mymodule;
import org.netbeans.api.editor.EditorRegistry;
import org.openide.modules.ModuleInstall;
import org.openide.windows.OnShowing;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;


/**
 *
 * @author User
 */
@OnShowing
public class MyModuleLoader extends ModuleInstall implements Runnable{

    @Override
    public void run() {
        System.out.println("Hell, Run!!");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        WindowManager wm = WindowManager.getDefault();
         
        TopComponent.Registry reg = TopComponent.getRegistry();
      
        MyPropertyChengeListener cl = new MyPropertyChengeListener();  
     
       // wm.addPropertyChangeListener(cl);
     
        reg.addPropertyChangeListener(cl);
        
        //wm.addPropertyChangeListener(cl);
    
    }
    
}
