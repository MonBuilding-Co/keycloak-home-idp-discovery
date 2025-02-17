package de.sventorben.keycloak.authentication.hidpd;

import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderConfigurationBuilder;

import java.util.List;

import static de.sventorben.keycloak.authentication.hidpd.HomeIdpDiscoveryConfig.FORWARD_TO_LINKED_IDP;
import static de.sventorben.keycloak.authentication.hidpd.HomeIdpDiscoveryConfig.USER_ATTRIBUTE;
import static org.keycloak.provider.ProviderConfigProperty.BOOLEAN_TYPE;
import static org.keycloak.provider.ProviderConfigProperty.STRING_TYPE;

final class HomeIdpDiscoveryConfigProperties {

    private static final ProviderConfigProperty FORWARD_TO_LINKED_IDP_PROPERTY = new ProviderConfigProperty(
        FORWARD_TO_LINKED_IDP,
        "Forward to linked IdP",
        "Whether to forward existing user to a linked identity provider or not.",
        BOOLEAN_TYPE,
        false,
        false);

    private static final ProviderConfigProperty USER_ATTRIBUTE_PROPERTY = new ProviderConfigProperty(
        USER_ATTRIBUTE,
        "User attribute",
        "The user attribute used to lookup the email address of the user.",
        STRING_TYPE,
        "email",
        false);

    static final List<ProviderConfigProperty> CONFIG_PROPERTIES = ProviderConfigurationBuilder.create()
        .property(USER_ATTRIBUTE_PROPERTY)
        .property(FORWARD_TO_LINKED_IDP_PROPERTY)
        .build();

}
