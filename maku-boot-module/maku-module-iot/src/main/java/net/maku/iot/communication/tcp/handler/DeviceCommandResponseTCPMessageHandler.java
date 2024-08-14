package net.maku.iot.communication.tcp.handler;

import net.maku.iot.communication.mqtt.handler.MqttMessageHandler;
import net.maku.iot.enums.DeviceTopicEnum;

/**
 * @Description TODO
 * @Author LSF
 * @Date 2024/8/14 19:23
 */
public class DeviceCommandResponseTCPMessageHandler implements MqttMessageHandler {
    @Override
    public boolean supports(String topic) {
        return DeviceTopicEnum.startsWith(topic, DeviceTopicEnum.COMMAND_RESPONSE.getTopic());
    }

    @Override
    public void handle(String topic, String message) {
            //TCP设备响应处理
    }
}
