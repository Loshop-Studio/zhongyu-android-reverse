package org.eclipse.paho.client.mqttv3;

import java.util.Enumeration;

/* loaded from: classes6.dex */
public interface MqttClientPersistence extends AutoCloseable {
    void clear();

    @Override // java.lang.AutoCloseable
    void close();

    boolean containsKey(String str);

    MqttPersistable get(String str);

    Enumeration keys();

    void open(String str, String str2);

    void put(String str, MqttPersistable mqttPersistable);

    void remove(String str);
}
