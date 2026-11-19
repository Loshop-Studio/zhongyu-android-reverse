package af;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* renamed from: af.b */
/* loaded from: classes6.dex */
public class C0119b extends C0121d implements IMqttDeliveryToken {

    /* renamed from: j */
    public MqttMessage f145j;

    public C0119b(MqttAndroidClient mqttAndroidClient, Object obj, IMqttActionListener iMqttActionListener, MqttMessage mqttMessage) {
        super(mqttAndroidClient, obj, iMqttActionListener);
        this.f145j = mqttMessage;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttDeliveryToken
    public MqttMessage getMessage() {
        return this.f145j;
    }
}
