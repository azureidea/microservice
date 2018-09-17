package com.xmair.core.entity.framedb;
import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;


/**
 * <p>
 * 
 *${remark}
 *
 * </p>
 * 
 * @author wuzuquan
 * @date 2018-09-17 15:20:18
 * @version
 */
@Table(name = "PROVIDER")
public class Provider implements Serializable {



    @Length(max=1,message="provider_status 长度不能超过1")
    @Column(name = "provider_status")
	private String providerStatus;
	


    @Length(max=50,message="provider_users 长度不能超过50")
    @Column(name = "provider_users")
	private String providerUsers;
	


    @Length(max=50,message="provider_id 长度不能超过50")
    @NotNull(message = "provider_id not allow null")
    @Id
    @Column(name = "provider_id")
	private String providerId;
	


    @Column(name = "created_at")
	private Date createdAt;
	


    @Length(max=50,message="provider_name 长度不能超过50")
    @Column(name = "provider_name")
	private String providerName;
	


    @Length(max=20,message="app_id 长度不能超过20")
    @Column(name = "app_id")
	private String appId;
	
		
	public String getProviderStatus() {
        return providerStatus;
    }

	public void setProviderStatus(String providerStatus) {
    	 this.providerStatus = providerStatus;
	}
		
	public String getProviderUsers() {
        return providerUsers;
    }

	public void setProviderUsers(String providerUsers) {
    	 this.providerUsers = providerUsers;
	}
		
	public String getProviderId() {
        return providerId;
    }

	public void setProviderId(String providerId) {
    	 this.providerId = providerId;
	}
		
	public Date getCreatedAt() {
        return createdAt;
    }

	public void setCreatedAt(Date createdAt) {
    	 this.createdAt = createdAt;
	}
		
	public String getProviderName() {
        return providerName;
    }

	public void setProviderName(String providerName) {
    	 this.providerName = providerName;
	}
		
	public String getAppId() {
        return appId;
    }

	public void setAppId(String appId) {
    	 this.appId = appId;
	}
	}