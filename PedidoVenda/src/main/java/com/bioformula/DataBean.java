
package com.bioformula;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ViewScoped;

@javax.faces.bean.ManagedBean
@ViewScoped
public class DataBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public Date getDataAtual(){
        
        return new Date();
    }
    
}
