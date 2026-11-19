package org.eclipse.paho.client.mqttv3;

import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.util.Strings;

/* loaded from: classes6.dex */
public class MqttTopic {
    private static final int MAX_TOPIC_LEN = 65535;
    private static final int MIN_TOPIC_LEN = 1;
    public static final String MULTI_LEVEL_WILDCARD = "#";
    public static final String MULTI_LEVEL_WILDCARD_PATTERN = "/#";
    private static final char NUL = 0;
    public static final String SINGLE_LEVEL_WILDCARD = "+";
    public static final String TOPIC_LEVEL_SEPARATOR = "/";
    public static final String TOPIC_WILDCARDS = "#+";
    private ClientComms comms;
    private String name;

    public MqttTopic(String str, ClientComms clientComms) {
        this.comms = clientComms;
        this.name = str;
    }

    private MqttPublish createPublish(MqttMessage mqttMessage) {
        return new MqttPublish(getName(), mqttMessage);
    }

    public static boolean isMatched(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        validate(str, true);
        validate(str2, false);
        if (str.equals(str2)) {
            return true;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < length2 && i11 < length) {
                if (str.charAt(i10) != '#') {
                    if ((str2.charAt(i11) == '/' && str.charAt(i10) != '/') || (str.charAt(i10) != '+' && str.charAt(i10) != '#' && str.charAt(i10) != str2.charAt(i11))) {
                        break;
                    }
                    if (str.charAt(i10) == '+') {
                        int i12 = i11 + 1;
                        while (i12 < length && str2.charAt(i12) != '/') {
                            i12 = i11 + 2;
                            i11++;
                        }
                    }
                    i10++;
                    i11++;
                } else {
                    i11 = length;
                    i10 = length2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i11 == length && i10 == length2) {
            return true;
        }
        if (str.length() - i10 > 0 && i11 == length) {
            if (str2.charAt(i11 - 1) == '/' && str.charAt(i10) == '#') {
                return true;
            }
            if (str.length() - i10 > 1 && str.substring(i10, i10 + 2).equals(MULTI_LEVEL_WILDCARD_PATTERN)) {
                return true;
            }
        }
        return false;
    }

    public static void validate(String str, boolean z10) {
        try {
            int length = str.getBytes(Request.DEFAULT_CHARSET).length;
            if (length < 1 || length > 65535) {
                throw new IllegalArgumentException(String.format("Invalid topic length, should be in range[%d, %d]!", 1, 65535));
            }
            if (!z10) {
                if (Strings.containsAny(str, TOPIC_WILDCARDS)) {
                    throw new IllegalArgumentException("The topic name MUST NOT contain any wildcard characters (#+)");
                }
            } else {
                if (Strings.equalsAny(str, new String[]{MULTI_LEVEL_WILDCARD, SINGLE_LEVEL_WILDCARD})) {
                    return;
                }
                if (Strings.countMatches(str, MULTI_LEVEL_WILDCARD) <= 1 && (!str.contains(MULTI_LEVEL_WILDCARD) || str.endsWith(MULTI_LEVEL_WILDCARD_PATTERN))) {
                    validateSingleLevelWildcard(str);
                } else {
                    throw new IllegalArgumentException("Invalid usage of multi-level wildcard in topic string: " + str);
                }
            }
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    private static void validateSingleLevelWildcard(String str) {
        char cCharAt = SINGLE_LEVEL_WILDCARD.charAt(0);
        char cCharAt2 = TOPIC_LEVEL_SEPARATOR.charAt(0);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 - 1;
            char c10 = i11 >= 0 ? charArray[i11] : (char) 0;
            int i12 = i10 + 1;
            char c11 = i12 < length ? charArray[i12] : (char) 0;
            if (charArray[i10] == cCharAt && ((c10 != cCharAt2 && c10 != 0) || (c11 != cCharAt2 && c11 != 0))) {
                throw new IllegalArgumentException(String.format("Invalid usage of single-level wildcard in topic string '%s'!", str));
            }
            i10 = i12;
        }
    }

    public String getName() {
        return this.name;
    }

    public MqttDeliveryToken publish(byte[] bArr, int i10, boolean z10) {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i10);
        mqttMessage.setRetained(z10);
        return publish(mqttMessage);
    }

    public String toString() {
        return getName();
    }

    public MqttDeliveryToken publish(MqttMessage mqttMessage) {
        MqttDeliveryToken mqttDeliveryToken = new MqttDeliveryToken(this.comms.getClient().getClientId());
        mqttDeliveryToken.setMessage(mqttMessage);
        this.comms.sendNoWait(createPublish(mqttMessage), mqttDeliveryToken);
        mqttDeliveryToken.internalTok.waitUntilSent();
        return mqttDeliveryToken;
    }
}
