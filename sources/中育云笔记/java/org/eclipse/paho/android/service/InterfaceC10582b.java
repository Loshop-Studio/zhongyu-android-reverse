package org.eclipse.paho.android.service;

import java.util.Iterator;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* renamed from: org.eclipse.paho.android.service.b */
/* loaded from: classes6.dex */
public interface InterfaceC10582b {

    /* renamed from: org.eclipse.paho.android.service.b$a */
    public interface a {
        /* renamed from: a */
        String mo22332a();

        MqttMessage getMessage();

        String getMessageId();
    }

    /* renamed from: a */
    Iterator mo22326a(String str);

    /* renamed from: b */
    boolean mo22327b(String str, String str2);

    /* renamed from: c */
    void mo22328c(String str);

    void close();

    /* renamed from: d */
    String mo22329d(String str, String str2, MqttMessage mqttMessage);
}
