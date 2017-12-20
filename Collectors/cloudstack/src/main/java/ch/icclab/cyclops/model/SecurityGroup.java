// @TODO: Check whether this properly maps the SecurityGroup usage data and fix if required.

package ch.icclab.cyclops.model;

import java.util.HashMap;
import java.util.Map;

public class SecurityGroup extends UsageData {

    private String virtualmachineid;

    /////////////////////////////
    // Getters and Setters

    public String getVirtualmachineid() {
        return virtualmachineid;
    }

    public void setVirtualmachineid(String virtualmachineid) {
        this.virtualmachineid = virtualmachineid;
    }

    @Override
    protected void additionalMetadata(Map map) {
        if (virtualmachineid != null) {
            map.put("virtualmachineId", virtualmachineid);
        }
    }
}
