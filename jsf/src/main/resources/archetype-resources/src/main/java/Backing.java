#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.omnifaces.config.OmniFaces;
import org.omnifaces.util.Faces;

@Named
@RequestScoped
public class Backing {
    
    public String getJavaServerFaces() {
        return Faces.getImplInfo();
    }
    
    public String getOmnifaces() {
        return OmniFaces.getVersion();
    }
    
}
