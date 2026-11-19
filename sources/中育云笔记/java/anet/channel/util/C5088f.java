package anet.channel.util;

import java.net.Inet6Address;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: anet.channel.util.f */
/* loaded from: classes3.dex */
public class C5088f {

    /* renamed from: a */
    public int f2760a;

    /* renamed from: b */
    public Inet6Address f2761b;

    public C5088f(Inet6Address inet6Address, int i10) {
        this.f2760a = i10;
        this.f2761b = inet6Address;
    }

    public String toString() {
        return this.f2761b.getHostAddress() + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f2760a;
    }
}
