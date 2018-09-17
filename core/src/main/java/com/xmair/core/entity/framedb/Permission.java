package com.xmair.core.entity.framedb;
import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;


/**
 * <p>
 * 
 *${remark}
 *
 * </p>
 * 
 * @author wuzuquan
 * @date 2018-09-17 15:20:17
 * @version
 */
@Table(name = "PERMISSION")
public class Permission implements Serializable {



    @Length(max=1,message="permission_status 长度不能超过1")
    @Column(name = "permission_status")
	private String permissionStatus;
	


    @Length(max=50,message="permission_service_id 长度不能超过50")
    @NotNull(message = "permission_service_id not allow null")
    @Id
    @Column(name = "permission_service_id")
	private String permissionServiceId;
	


    @Length(max=50,message="permission_consumer_id 长度不能超过50")
    @NotNull(message = "permission_consumer_id not allow null")
    @Id
    @Column(name = "permission_consumer_id")
	private String permissionConsumerId;
	
		
	public String getPermissionStatus() {
        return permissionStatus;
    }

	public void setPermissionStatus(String permissionStatus) {
    	 this.permissionStatus = permissionStatus;
	}
		
	public String getPermissionServiceId() {
        return permissionServiceId;
    }

	public void setPermissionServiceId(String permissionServiceId) {
    	 this.permissionServiceId = permissionServiceId;
	}
		
	public String getPermissionConsumerId() {
        return permissionConsumerId;
    }

	public void setPermissionConsumerId(String permissionConsumerId) {
    	 this.permissionConsumerId = permissionConsumerId;
	}
	}