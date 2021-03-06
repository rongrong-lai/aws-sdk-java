/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createLayer(CreateLayerRequest) CreateLayer operation}.
 * <p>
 * Creates a layer. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"> How to Create a Layer </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b> You should use CreateLayer for noncustom layer types such
 * as PHP App Server only if the stack does not have an existing layer of
 * that type. A stack can have at most one instance of each noncustom
 * layer; if you attempt to create a second instance, CreateLayer fails.
 * A stack can have an arbitrary number of custom layers, so you can call
 * CreateLayer as many times as you like for that layer type.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack, or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createLayer(CreateLayerRequest)
 */
public class CreateLayerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The layer stack ID.
     */
    private String stackId;

    /**
     * The layer type. A stack cannot have more than one built-in layer of
     * the same type. It can have any number of custom layers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>java-app, lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     */
    private String type;

    /**
     * The layer name, which is used by the console.
     */
    private String name;

    /**
     * For custom layers only, use this parameter to specify the layer's
     * short name, which is used internally by AWS OpsWorks and by Chef
     * recipes. The short name is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'. <p>The built-in layers' short names are defined by AWS
     * OpsWorks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     * Reference</a>
     */
    private String shortname;

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     */
    private java.util.Map<String,String> attributes;

    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String customInstanceProfileArn;

    /**
     * An array containing the layer custom security group IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> customSecurityGroupIds;

    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> packages;

    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration> volumeConfigurations;

    /**
     * Whether to disable auto healing for the layer.
     */
    private Boolean enableAutoHealing;

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     */
    private Boolean autoAssignElasticIps;

    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     */
    private Boolean autoAssignPublicIps;

    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     */
    private Recipes customRecipes;

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code>, to ensure that
     * your instances have the latest security updates. </note>
     */
    private Boolean installUpdatesOnBoot;

    /**
     * Whether to use Amazon EBS-optimized instances.
     */
    private Boolean useEbsOptimizedInstances;

    /**
     * A LifeCycleEventConfiguration object that you can use to configure the
     * Shutdown event to specify an execution timeout and enable or disable
     * Elastic Load Balancer connection draining.
     */
    private LifecycleEventConfiguration lifecycleEventConfiguration;

    /**
     * The layer stack ID.
     *
     * @return The layer stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The layer stack ID.
     *
     * @param stackId The layer stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The layer stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The layer stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The layer type. A stack cannot have more than one built-in layer of
     * the same type. It can have any number of custom layers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>java-app, lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @return The layer type. A stack cannot have more than one built-in layer of
     *         the same type. It can have any number of custom layers.
     *
     * @see LayerType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The layer type. A stack cannot have more than one built-in layer of
     * the same type. It can have any number of custom layers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>java-app, lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type. A stack cannot have more than one built-in layer of
     *         the same type. It can have any number of custom layers.
     *
     * @see LayerType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The layer type. A stack cannot have more than one built-in layer of
     * the same type. It can have any number of custom layers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>java-app, lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type. A stack cannot have more than one built-in layer of
     *         the same type. It can have any number of custom layers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LayerType
     */
    public CreateLayerRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The layer type. A stack cannot have more than one built-in layer of
     * the same type. It can have any number of custom layers.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>java-app, lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type. A stack cannot have more than one built-in layer of
     *         the same type. It can have any number of custom layers.
     *
     * @see LayerType
     */
    public void setType(LayerType type) {
        this.type = type.toString();
    }
    
    /**
     * The layer type. A stack cannot have more than one built-in layer of
     * the same type. It can have any number of custom layers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>java-app, lb, web, php-app, rails-app, nodejs-app, memcached, db-master, monitoring-master, custom
     *
     * @param type The layer type. A stack cannot have more than one built-in layer of
     *         the same type. It can have any number of custom layers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LayerType
     */
    public CreateLayerRequest withType(LayerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The layer name, which is used by the console.
     *
     * @return The layer name, which is used by the console.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The layer name, which is used by the console.
     *
     * @param name The layer name, which is used by the console.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The layer name, which is used by the console.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The layer name, which is used by the console.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * For custom layers only, use this parameter to specify the layer's
     * short name, which is used internally by AWS OpsWorks and by Chef
     * recipes. The short name is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'. <p>The built-in layers' short names are defined by AWS
     * OpsWorks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     * Reference</a>
     *
     * @return For custom layers only, use this parameter to specify the layer's
     *         short name, which is used internally by AWS OpsWorks and by Chef
     *         recipes. The short name is also used as the name for the directory
     *         where your app files are installed. It can have a maximum of 200
     *         characters, which are limited to the alphanumeric characters, '-',
     *         '_', and '.'. <p>The built-in layers' short names are defined by AWS
     *         OpsWorks. For more information, see the <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     *         Reference</a>
     */
    public String getShortname() {
        return shortname;
    }
    
    /**
     * For custom layers only, use this parameter to specify the layer's
     * short name, which is used internally by AWS OpsWorks and by Chef
     * recipes. The short name is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'. <p>The built-in layers' short names are defined by AWS
     * OpsWorks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     * Reference</a>
     *
     * @param shortname For custom layers only, use this parameter to specify the layer's
     *         short name, which is used internally by AWS OpsWorks and by Chef
     *         recipes. The short name is also used as the name for the directory
     *         where your app files are installed. It can have a maximum of 200
     *         characters, which are limited to the alphanumeric characters, '-',
     *         '_', and '.'. <p>The built-in layers' short names are defined by AWS
     *         OpsWorks. For more information, see the <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     *         Reference</a>
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
    
    /**
     * For custom layers only, use this parameter to specify the layer's
     * short name, which is used internally by AWS OpsWorks and by Chef
     * recipes. The short name is also used as the name for the directory
     * where your app files are installed. It can have a maximum of 200
     * characters, which are limited to the alphanumeric characters, '-',
     * '_', and '.'. <p>The built-in layers' short names are defined by AWS
     * OpsWorks. For more information, see the <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     * Reference</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shortname For custom layers only, use this parameter to specify the layer's
     *         short name, which is used internally by AWS OpsWorks and by Chef
     *         recipes. The short name is also used as the name for the directory
     *         where your app files are installed. It can have a maximum of 200
     *         characters, which are limited to the alphanumeric characters, '-',
     *         '_', and '.'. <p>The built-in layers' short names are defined by AWS
     *         OpsWorks. For more information, see the <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers.html">Layer
     *         Reference</a>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withShortname(String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     *
     * @return One or more user-defined key/value pairs to be added to the stack
     *         attributes.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
    public CreateLayerRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String,String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public CreateLayerRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }
    
    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The ARN of an IAM profile that to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getCustomInstanceProfileArn() {
        return customInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param customInstanceProfileArn The ARN of an IAM profile that to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that to be used for the layer's EC2
     * instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customInstanceProfileArn The ARN of an IAM profile that to be used for the layer's EC2
     *         instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withCustomInstanceProfileArn(String customInstanceProfileArn) {
        this.customInstanceProfileArn = customInstanceProfileArn;
        return this;
    }

    /**
     * An array containing the layer custom security group IDs.
     *
     * @return An array containing the layer custom security group IDs.
     */
    public java.util.List<String> getCustomSecurityGroupIds() {
        if (customSecurityGroupIds == null) {
              customSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              customSecurityGroupIds.setAutoConstruct(true);
        }
        return customSecurityGroupIds;
    }
    
    /**
     * An array containing the layer custom security group IDs.
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     */
    public void setCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> customSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customSecurityGroupIds.size());
        customSecurityGroupIdsCopy.addAll(customSecurityGroupIds);
        this.customSecurityGroupIds = customSecurityGroupIdsCopy;
    }
    
    /**
     * An array containing the layer custom security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withCustomSecurityGroupIds(String... customSecurityGroupIds) {
        if (getCustomSecurityGroupIds() == null) setCustomSecurityGroupIds(new java.util.ArrayList<String>(customSecurityGroupIds.length));
        for (String value : customSecurityGroupIds) {
            getCustomSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the layer custom security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customSecurityGroupIds An array containing the layer custom security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withCustomSecurityGroupIds(java.util.Collection<String> customSecurityGroupIds) {
        if (customSecurityGroupIds == null) {
            this.customSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> customSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customSecurityGroupIds.size());
            customSecurityGroupIdsCopy.addAll(customSecurityGroupIds);
            this.customSecurityGroupIds = customSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     *
     * @return An array of <code>Package</code> objects that describe the layer
     *         packages.
     */
    public java.util.List<String> getPackages() {
        if (packages == null) {
              packages = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              packages.setAutoConstruct(true);
        }
        return packages;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer
     *         packages.
     */
    public void setPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> packagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(packages.size());
        packagesCopy.addAll(packages);
        this.packages = packagesCopy;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer
     *         packages.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withPackages(String... packages) {
        if (getPackages() == null) setPackages(new java.util.ArrayList<String>(packages.length));
        for (String value : packages) {
            getPackages().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Package</code> objects that describe the layer
     * packages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param packages An array of <code>Package</code> objects that describe the layer
     *         packages.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withPackages(java.util.Collection<String> packages) {
        if (packages == null) {
            this.packages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> packagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(packages.size());
            packagesCopy.addAll(packages);
            this.packages = packagesCopy;
        }

        return this;
    }

    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     *
     * @return A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     */
    public java.util.List<VolumeConfiguration> getVolumeConfigurations() {
        if (volumeConfigurations == null) {
              volumeConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration>();
              volumeConfigurations.setAutoConstruct(true);
        }
        return volumeConfigurations;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     */
    public void setVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration> volumeConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration>(volumeConfigurations.size());
        volumeConfigurationsCopy.addAll(volumeConfigurations);
        this.volumeConfigurations = volumeConfigurationsCopy;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withVolumeConfigurations(VolumeConfiguration... volumeConfigurations) {
        if (getVolumeConfigurations() == null) setVolumeConfigurations(new java.util.ArrayList<VolumeConfiguration>(volumeConfigurations.length));
        for (VolumeConfiguration value : volumeConfigurations) {
            getVolumeConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * A <code>VolumeConfigurations</code> object that describes the layer's
     * Amazon EBS volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeConfigurations A <code>VolumeConfigurations</code> object that describes the layer's
     *         Amazon EBS volumes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withVolumeConfigurations(java.util.Collection<VolumeConfiguration> volumeConfigurations) {
        if (volumeConfigurations == null) {
            this.volumeConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration> volumeConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeConfiguration>(volumeConfigurations.size());
            volumeConfigurationsCopy.addAll(volumeConfigurations);
            this.volumeConfigurations = volumeConfigurationsCopy;
        }

        return this;
    }

    /**
     * Whether to disable auto healing for the layer.
     *
     * @return Whether to disable auto healing for the layer.
     */
    public Boolean isEnableAutoHealing() {
        return enableAutoHealing;
    }
    
    /**
     * Whether to disable auto healing for the layer.
     *
     * @param enableAutoHealing Whether to disable auto healing for the layer.
     */
    public void setEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
    }
    
    /**
     * Whether to disable auto healing for the layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableAutoHealing Whether to disable auto healing for the layer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withEnableAutoHealing(Boolean enableAutoHealing) {
        this.enableAutoHealing = enableAutoHealing;
        return this;
    }

    /**
     * Whether to disable auto healing for the layer.
     *
     * @return Whether to disable auto healing for the layer.
     */
    public Boolean getEnableAutoHealing() {
        return enableAutoHealing;
    }

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean isAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @param autoAssignElasticIps Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public void setAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
    }
    
    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoAssignElasticIps Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withAutoAssignElasticIps(Boolean autoAssignElasticIps) {
        this.autoAssignElasticIps = autoAssignElasticIps;
        return this;
    }

    /**
     * Whether to automatically assign an <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address</a> to the layer's instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return Whether to automatically assign an <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address</a> to the layer's instances. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean getAutoAssignElasticIps() {
        return autoAssignElasticIps;
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean isAutoAssignPublicIps() {
        return autoAssignPublicIps;
    }
    
    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public void setAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
    }
    
    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoAssignPublicIps For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withAutoAssignPublicIps(Boolean autoAssignPublicIps) {
        this.autoAssignPublicIps = autoAssignPublicIps;
        return this;
    }

    /**
     * For stacks that are running in a VPC, whether to automatically assign
     * a public IP address to the layer's instances. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     * to Edit a Layer</a>.
     *
     * @return For stacks that are running in a VPC, whether to automatically assign
     *         a public IP address to the layer's instances. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-edit.html">How
     *         to Edit a Layer</a>.
     */
    public Boolean getAutoAssignPublicIps() {
        return autoAssignPublicIps;
    }

    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     *
     * @return A <code>LayerCustomRecipes</code> object that specifies the layer
     *         custom recipes.
     */
    public Recipes getCustomRecipes() {
        return customRecipes;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     *
     * @param customRecipes A <code>LayerCustomRecipes</code> object that specifies the layer
     *         custom recipes.
     */
    public void setCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
    }
    
    /**
     * A <code>LayerCustomRecipes</code> object that specifies the layer
     * custom recipes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customRecipes A <code>LayerCustomRecipes</code> object that specifies the layer
     *         custom recipes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withCustomRecipes(Recipes customRecipes) {
        this.customRecipes = customRecipes;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code>, to ensure that
     * your instances have the latest security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code>, to ensure that
     *         your instances have the latest security updates. </note>
     */
    public Boolean isInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code>, to ensure that
     * your instances have the latest security updates. </note>
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code>, to ensure that
     *         your instances have the latest security updates. </note>
     */
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code>, to ensure that
     * your instances have the latest security updates. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code>, to ensure that
     *         your instances have the latest security updates. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code>, to ensure that
     * your instances have the latest security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code>, to ensure that
     *         your instances have the latest security updates. </note>
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * @return Whether to use Amazon EBS-optimized instances.
     */
    public Boolean isUseEbsOptimizedInstances() {
        return useEbsOptimizedInstances;
    }
    
    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     */
    public void setUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }
    
    /**
     * Whether to use Amazon EBS-optimized instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useEbsOptimizedInstances Whether to use Amazon EBS-optimized instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withUseEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
        return this;
    }

    /**
     * Whether to use Amazon EBS-optimized instances.
     *
     * @return Whether to use Amazon EBS-optimized instances.
     */
    public Boolean getUseEbsOptimizedInstances() {
        return useEbsOptimizedInstances;
    }

    /**
     * A LifeCycleEventConfiguration object that you can use to configure the
     * Shutdown event to specify an execution timeout and enable or disable
     * Elastic Load Balancer connection draining.
     *
     * @return A LifeCycleEventConfiguration object that you can use to configure the
     *         Shutdown event to specify an execution timeout and enable or disable
     *         Elastic Load Balancer connection draining.
     */
    public LifecycleEventConfiguration getLifecycleEventConfiguration() {
        return lifecycleEventConfiguration;
    }
    
    /**
     * A LifeCycleEventConfiguration object that you can use to configure the
     * Shutdown event to specify an execution timeout and enable or disable
     * Elastic Load Balancer connection draining.
     *
     * @param lifecycleEventConfiguration A LifeCycleEventConfiguration object that you can use to configure the
     *         Shutdown event to specify an execution timeout and enable or disable
     *         Elastic Load Balancer connection draining.
     */
    public void setLifecycleEventConfiguration(LifecycleEventConfiguration lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
    }
    
    /**
     * A LifeCycleEventConfiguration object that you can use to configure the
     * Shutdown event to specify an execution timeout and enable or disable
     * Elastic Load Balancer connection draining.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lifecycleEventConfiguration A LifeCycleEventConfiguration object that you can use to configure the
     *         Shutdown event to specify an execution timeout and enable or disable
     *         Elastic Load Balancer connection draining.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLayerRequest withLifecycleEventConfiguration(LifecycleEventConfiguration lifecycleEventConfiguration) {
        this.lifecycleEventConfiguration = lifecycleEventConfiguration;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getShortname() != null) sb.append("Shortname: " + getShortname() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getCustomInstanceProfileArn() != null) sb.append("CustomInstanceProfileArn: " + getCustomInstanceProfileArn() + ",");
        if (getCustomSecurityGroupIds() != null) sb.append("CustomSecurityGroupIds: " + getCustomSecurityGroupIds() + ",");
        if (getPackages() != null) sb.append("Packages: " + getPackages() + ",");
        if (getVolumeConfigurations() != null) sb.append("VolumeConfigurations: " + getVolumeConfigurations() + ",");
        if (isEnableAutoHealing() != null) sb.append("EnableAutoHealing: " + isEnableAutoHealing() + ",");
        if (isAutoAssignElasticIps() != null) sb.append("AutoAssignElasticIps: " + isAutoAssignElasticIps() + ",");
        if (isAutoAssignPublicIps() != null) sb.append("AutoAssignPublicIps: " + isAutoAssignPublicIps() + ",");
        if (getCustomRecipes() != null) sb.append("CustomRecipes: " + getCustomRecipes() + ",");
        if (isInstallUpdatesOnBoot() != null) sb.append("InstallUpdatesOnBoot: " + isInstallUpdatesOnBoot() + ",");
        if (isUseEbsOptimizedInstances() != null) sb.append("UseEbsOptimizedInstances: " + isUseEbsOptimizedInstances() + ",");
        if (getLifecycleEventConfiguration() != null) sb.append("LifecycleEventConfiguration: " + getLifecycleEventConfiguration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCustomInstanceProfileArn() == null) ? 0 : getCustomInstanceProfileArn().hashCode()); 
        hashCode = prime * hashCode + ((getCustomSecurityGroupIds() == null) ? 0 : getCustomSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPackages() == null) ? 0 : getPackages().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeConfigurations() == null) ? 0 : getVolumeConfigurations().hashCode()); 
        hashCode = prime * hashCode + ((isEnableAutoHealing() == null) ? 0 : isEnableAutoHealing().hashCode()); 
        hashCode = prime * hashCode + ((isAutoAssignElasticIps() == null) ? 0 : isAutoAssignElasticIps().hashCode()); 
        hashCode = prime * hashCode + ((isAutoAssignPublicIps() == null) ? 0 : isAutoAssignPublicIps().hashCode()); 
        hashCode = prime * hashCode + ((getCustomRecipes() == null) ? 0 : getCustomRecipes().hashCode()); 
        hashCode = prime * hashCode + ((isInstallUpdatesOnBoot() == null) ? 0 : isInstallUpdatesOnBoot().hashCode()); 
        hashCode = prime * hashCode + ((isUseEbsOptimizedInstances() == null) ? 0 : isUseEbsOptimizedInstances().hashCode()); 
        hashCode = prime * hashCode + ((getLifecycleEventConfiguration() == null) ? 0 : getLifecycleEventConfiguration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLayerRequest == false) return false;
        CreateLayerRequest other = (CreateLayerRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getShortname() == null ^ this.getShortname() == null) return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getCustomInstanceProfileArn() == null ^ this.getCustomInstanceProfileArn() == null) return false;
        if (other.getCustomInstanceProfileArn() != null && other.getCustomInstanceProfileArn().equals(this.getCustomInstanceProfileArn()) == false) return false; 
        if (other.getCustomSecurityGroupIds() == null ^ this.getCustomSecurityGroupIds() == null) return false;
        if (other.getCustomSecurityGroupIds() != null && other.getCustomSecurityGroupIds().equals(this.getCustomSecurityGroupIds()) == false) return false; 
        if (other.getPackages() == null ^ this.getPackages() == null) return false;
        if (other.getPackages() != null && other.getPackages().equals(this.getPackages()) == false) return false; 
        if (other.getVolumeConfigurations() == null ^ this.getVolumeConfigurations() == null) return false;
        if (other.getVolumeConfigurations() != null && other.getVolumeConfigurations().equals(this.getVolumeConfigurations()) == false) return false; 
        if (other.isEnableAutoHealing() == null ^ this.isEnableAutoHealing() == null) return false;
        if (other.isEnableAutoHealing() != null && other.isEnableAutoHealing().equals(this.isEnableAutoHealing()) == false) return false; 
        if (other.isAutoAssignElasticIps() == null ^ this.isAutoAssignElasticIps() == null) return false;
        if (other.isAutoAssignElasticIps() != null && other.isAutoAssignElasticIps().equals(this.isAutoAssignElasticIps()) == false) return false; 
        if (other.isAutoAssignPublicIps() == null ^ this.isAutoAssignPublicIps() == null) return false;
        if (other.isAutoAssignPublicIps() != null && other.isAutoAssignPublicIps().equals(this.isAutoAssignPublicIps()) == false) return false; 
        if (other.getCustomRecipes() == null ^ this.getCustomRecipes() == null) return false;
        if (other.getCustomRecipes() != null && other.getCustomRecipes().equals(this.getCustomRecipes()) == false) return false; 
        if (other.isInstallUpdatesOnBoot() == null ^ this.isInstallUpdatesOnBoot() == null) return false;
        if (other.isInstallUpdatesOnBoot() != null && other.isInstallUpdatesOnBoot().equals(this.isInstallUpdatesOnBoot()) == false) return false; 
        if (other.isUseEbsOptimizedInstances() == null ^ this.isUseEbsOptimizedInstances() == null) return false;
        if (other.isUseEbsOptimizedInstances() != null && other.isUseEbsOptimizedInstances().equals(this.isUseEbsOptimizedInstances()) == false) return false; 
        if (other.getLifecycleEventConfiguration() == null ^ this.getLifecycleEventConfiguration() == null) return false;
        if (other.getLifecycleEventConfiguration() != null && other.getLifecycleEventConfiguration().equals(this.getLifecycleEventConfiguration()) == false) return false; 
        return true;
    }
    
}
    