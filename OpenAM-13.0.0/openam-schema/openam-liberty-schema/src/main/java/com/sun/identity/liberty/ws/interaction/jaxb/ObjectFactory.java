//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.interaction.jaxb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.interaction.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(40, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.interaction.jaxb.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.interaction.jaxb.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InteractionRequestType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionRequestTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.EncryptedResourceIDElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.EncryptedResourceIDElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InquiryType.Confirm.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl$ConfirmImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.HintElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.HintElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.SelectType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InquiryElementType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryElementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InquiryElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.ParameterType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.ParameterTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InquiryType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.ExtensionElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.ExtensionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.SelectType.ItemType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl$ItemTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.TextType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.TextTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionResponseElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.HelpElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.HelpElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.TextElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.TextElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.StatusElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InteractionStatementType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InteractionRequestElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionRequestElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.ResourceIDElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.ResourceIDElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.ExtensionType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.ExtensionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.UserInteractionElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.UserInteractionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.UserInteractionHeaderType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.UserInteractionHeaderTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.EmptyType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.EmptyTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionResponseTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.RedirectRequestElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.RedirectRequestElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.RedirectRequestType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.RedirectRequestTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.HelpType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.HelpTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.SelectElement.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.interaction.jaxb.StatusType.class), "com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "UserInteraction"), (com.sun.identity.liberty.ws.interaction.jaxb.UserInteractionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Text"), (com.sun.identity.liberty.ws.interaction.jaxb.TextElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Extension"), (com.sun.identity.liberty.ws.interaction.jaxb.ExtensionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Status"), (com.sun.identity.liberty.ws.interaction.jaxb.StatusElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Help"), (com.sun.identity.liberty.ws.interaction.jaxb.HelpElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Select"), (com.sun.identity.liberty.ws.interaction.jaxb.SelectElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "InteractionRequest"), (com.sun.identity.liberty.ws.interaction.jaxb.InteractionRequestElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "EncryptedResourceID"), (com.sun.identity.liberty.ws.interaction.jaxb.EncryptedResourceIDElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "RedirectRequest"), (com.sun.identity.liberty.ws.interaction.jaxb.RedirectRequestElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "InteractionResponse"), (com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "ResourceID"), (com.sun.identity.liberty.ws.interaction.jaxb.ResourceIDElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Hint"), (com.sun.identity.liberty.ws.interaction.jaxb.HintElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:is:2003-08", "Inquiry"), (com.sun.identity.liberty.ws.interaction.jaxb.InquiryElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.interaction.jaxb
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of InteractionRequestType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InteractionRequestType createInteractionRequestType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionRequestTypeImpl();
    }

    /**
     * Create an instance of EncryptedResourceIDElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.EncryptedResourceIDElement createEncryptedResourceIDElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.EncryptedResourceIDElementImpl();
    }

    /**
     * Create an instance of InquiryTypeConfirm
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InquiryType.Confirm createInquiryTypeConfirm()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl.ConfirmImpl();
    }

    /**
     * Create an instance of HintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.HintElement createHintElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.HintElementImpl();
    }

    /**
     * Create an instance of HintElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.HintElement createHintElement(java.lang.String value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.HintElementImpl(value);
    }

    /**
     * Create an instance of SelectType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.SelectType createSelectType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl();
    }

    /**
     * Create an instance of InquiryElementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InquiryElementType createInquiryElementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryElementTypeImpl();
    }

    /**
     * Create an instance of InquiryElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InquiryElement createInquiryElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryElementImpl();
    }

    /**
     * Create an instance of ParameterType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.ParameterType createParameterType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.ParameterTypeImpl();
    }

    /**
     * Create an instance of InquiryType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InquiryType createInquiryType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InquiryTypeImpl();
    }

    /**
     * Create an instance of ExtensionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.ExtensionElement createExtensionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.ExtensionElementImpl();
    }

    /**
     * Create an instance of SelectTypeItemType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.SelectType.ItemType createSelectTypeItemType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl.ItemTypeImpl();
    }

    /**
     * Create an instance of TextType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.TextType createTextType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.TextTypeImpl();
    }

    /**
     * Create an instance of InteractionResponseElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseElement createInteractionResponseElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionResponseElementImpl();
    }

    /**
     * Create an instance of HelpElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.HelpElement createHelpElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.HelpElementImpl();
    }

    /**
     * Create an instance of TextElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.TextElement createTextElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.TextElementImpl();
    }

    /**
     * Create an instance of StatusElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.StatusElement createStatusElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusElementImpl();
    }

    /**
     * Create an instance of InteractionStatementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InteractionStatementType createInteractionStatementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionStatementTypeImpl();
    }

    /**
     * Create an instance of InteractionRequestElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InteractionRequestElement createInteractionRequestElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionRequestElementImpl();
    }

    /**
     * Create an instance of ResourceIDElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.ResourceIDElement createResourceIDElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.ResourceIDElementImpl();
    }

    /**
     * Create an instance of ExtensionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.ExtensionType createExtensionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.ExtensionTypeImpl();
    }

    /**
     * Create an instance of UserInteractionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.UserInteractionElement createUserInteractionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.UserInteractionElementImpl();
    }

    /**
     * Create an instance of UserInteractionHeaderType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.UserInteractionHeaderType createUserInteractionHeaderType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.UserInteractionHeaderTypeImpl();
    }

    /**
     * Create an instance of EmptyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.EmptyType createEmptyType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.EmptyTypeImpl();
    }

    /**
     * Create an instance of InteractionResponseType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.InteractionResponseType createInteractionResponseType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.InteractionResponseTypeImpl();
    }

    /**
     * Create an instance of RedirectRequestElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.RedirectRequestElement createRedirectRequestElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.RedirectRequestElementImpl();
    }

    /**
     * Create an instance of RedirectRequestType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.RedirectRequestType createRedirectRequestType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.RedirectRequestTypeImpl();
    }

    /**
     * Create an instance of HelpType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.HelpType createHelpType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.HelpTypeImpl();
    }

    /**
     * Create an instance of SelectElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.SelectElement createSelectElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectElementImpl();
    }

    /**
     * Create an instance of StatusType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.interaction.jaxb.StatusType createStatusType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.StatusTypeImpl();
    }

}
