package org.eclipse.paho.client.mqttv3.internal;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

/* loaded from: classes6.dex */
public class ExceptionHelper {
    private ExceptionHelper() {
    }

    public static MqttException createMqttException(int i10) {
        return (i10 == 4 || i10 == 5) ? new MqttSecurityException(i10) : new MqttException(i10);
    }

    public static boolean isClassAvailable(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static MqttException createMqttException(Throwable th) {
        if (th.getClass().getName().equals("java.security.GeneralSecurityException")) {
            return new MqttSecurityException(th);
        }
        return new MqttException(th);
    }
}
