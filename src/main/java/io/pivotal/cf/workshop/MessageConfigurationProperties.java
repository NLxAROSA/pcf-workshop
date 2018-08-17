package io.pivotal.cf.workshop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "workshopmessage")
@RefreshScope
@Data
public class MessageConfigurationProperties {

    private String text = "this is a default text";

}
