
/**
 * DataServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

package rdbms_service_stub;

public class DataServiceFault extends java.lang.Exception{

    private static final long serialVersionUID = 1421363618744L;
    
    private org.wso2.ws.dataservice.DataServiceFault faultMessage;

    
        public DataServiceFault() {
            super("DataServiceFault");
        }

        public DataServiceFault(java.lang.String s) {
           super(s);
        }

        public DataServiceFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DataServiceFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.ws.dataservice.DataServiceFault msg){
       faultMessage = msg;
    }
    
    public org.wso2.ws.dataservice.DataServiceFault getFaultMessage(){
       return faultMessage;
    }
}
    