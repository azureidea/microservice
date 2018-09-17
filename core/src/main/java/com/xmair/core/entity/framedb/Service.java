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
@Table(name = "SERVICE")
public class Service implements Serializable {



    @Column(name = "service_updated_at")
	private Date serviceUpdatedAt;
	


    @Length(max=100,message="service_host 长度不能超过100")
    @Column(name = "service_host")
	private String serviceHost;
	


    @Column(name = "service_read_timeout")
	private Integer serviceReadTimeout;
	


    @Length(max=50,message="service_name 长度不能超过50")
    @Column(name = "service_name")
	private String serviceName;
	


    @Column(name = "service_write_timeout")
	private Integer serviceWriteTimeout;
	


    @Column(name = "service_created_at")
	private Date serviceCreatedAt;
	


    @Length(max=50,message="service_provider_id 长度不能超过50")
    @Column(name = "service_provider_id")
	private String serviceProviderId;
	


    @Length(max=20,message="service_protocol 长度不能超过20")
    @Column(name = "service_protocol")
	private String serviceProtocol;
	


    @Length(max=50,message="service_id 长度不能超过50")
    @NotNull(message = "service_id not allow null")
    @Id
    @Column(name = "service_id")
	private String serviceId;
	


    @Length(max=1,message="service_status 长度不能超过1")
    @Column(name = "service_status")
	private String serviceStatus;
	


    @Column(name = "service_connect_timeout")
	private Integer serviceConnectTimeout;
	


    @Length(max=100,message="service_path 长度不能超过100")
    @Column(name = "service_path")
	private String servicePath;
	


    @Column(name = "service_retries")
	private Integer serviceRetries;
	


    @Length(max=5,message="service_port 长度不能超过5")
    @Column(name = "service_port")
	private String servicePort;
	
		
	public Date getServiceUpdatedAt() {
        return serviceUpdatedAt;
    }

	public void setServiceUpdatedAt(Date serviceUpdatedAt) {
    	 this.serviceUpdatedAt = serviceUpdatedAt;
	}
		
	public String getServiceHost() {
        return serviceHost;
    }

	public void setServiceHost(String serviceHost) {
    	 this.serviceHost = serviceHost;
	}
		
	public Integer getServiceReadTimeout() {
        return serviceReadTimeout;
    }

	public void setServiceReadTimeout(Integer serviceReadTimeout) {
    	 this.serviceReadTimeout = serviceReadTimeout;
	}
		
	public String getServiceName() {
        return serviceName;
    }

	public void setServiceName(String serviceName) {
    	 this.serviceName = serviceName;
	}
		
	public Integer getServiceWriteTimeout() {
        return serviceWriteTimeout;
    }

	public void setServiceWriteTimeout(Integer serviceWriteTimeout) {
    	 this.serviceWriteTimeout = serviceWriteTimeout;
	}
		
	public Date getServiceCreatedAt() {
        return serviceCreatedAt;
    }

	public void setServiceCreatedAt(Date serviceCreatedAt) {
    	 this.serviceCreatedAt = serviceCreatedAt;
	}
		
	public String getServiceProviderId() {
        return serviceProviderId;
    }

	public void setServiceProviderId(String serviceProviderId) {
    	 this.serviceProviderId = serviceProviderId;
	}
		
	public String getServiceProtocol() {
        return serviceProtocol;
    }

	public void setServiceProtocol(String serviceProtocol) {
    	 this.serviceProtocol = serviceProtocol;
	}
		
	public String getServiceId() {
        return serviceId;
    }

	public void setServiceId(String serviceId) {
    	 this.serviceId = serviceId;
	}
		
	public String getServiceStatus() {
        return serviceStatus;
    }

	public void setServiceStatus(String serviceStatus) {
    	 this.serviceStatus = serviceStatus;
	}
		
	public Integer getServiceConnectTimeout() {
        return serviceConnectTimeout;
    }

	public void setServiceConnectTimeout(Integer serviceConnectTimeout) {
    	 this.serviceConnectTimeout = serviceConnectTimeout;
	}
		
	public String getServicePath() {
        return servicePath;
    }

	public void setServicePath(String servicePath) {
    	 this.servicePath = servicePath;
	}
		
	public Integer getServiceRetries() {
        return serviceRetries;
    }

	public void setServiceRetries(Integer serviceRetries) {
    	 this.serviceRetries = serviceRetries;
	}
		
	public String getServicePort() {
        return servicePort;
    }

	public void setServicePort(String servicePort) {
    	 this.servicePort = servicePort;
	}
	}