/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.mymodule;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.openide.windows.Mode;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

import org.netbeans.modules.editor.NbEditorUtilities;

/**
 *
 * @author User
 */
public class MyPropertyChengeListener implements PropertyChangeListener {

    
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String prorname = evt.getPropertyName(); 
       
        
        
        if(prorname.equalsIgnoreCase("opened")) {
            //List comp =  EditorRegistry.componentList();
            WindowManager wm = WindowManager.getDefault();
     
            System.out.println("============================================");
            
            System.out.println(EditorRegistry.componentList().size());
            System.out.println(prorname);
            System.out.println("============================================");
      
            TopComponent tc = wm.findTopComponent("MyPropertyChengeListener.java");
            
            Mode myMode = WindowManager.getDefault().findMode("editor");
             
            TopComponent [] tcs = wm.getOpenedTopComponents(myMode);
            
            System.out.println(tcs.length);
      
            List<? extends JTextComponent> editorComponents =  EditorRegistry.componentList();
        
            if( tcs.length > 7 ) {
                NbEditorUtilities.getOuterTopComponent(editorComponents.get(editorComponents.size()-1)).close();
                /*
                for (int i = 0; i < tcs.length; i++) {
                    ///System.out.println(tcs[i].getDisplayName());  // +1 since we want 1-100 and not 0-99
                  if( tcs[i] instanceof TopComponent ) {
                      tcs[i].close();
                      break;
                  } 
                }*/
            }
            
            
            /*for (int i = 0; i < editorComponents.size(); i++) {
			//.getContentType();
                        NbEditorUtilities.getOuterTopComponent(editorComponents.get(i)).close();
                       //for(int j=0; j < methods.length; j++ ) {
                           //System.out.println(editorComponents.get(i).get());
                       //}
            } */
            
            
            if( tc instanceof TopComponent ) {
                System.out.println(tc.getName());
                //tc.get
            }
        } 
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
