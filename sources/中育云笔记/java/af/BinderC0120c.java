package af;

import android.os.Binder;
import org.eclipse.paho.android.service.MqttService;

/* renamed from: af.c */
/* loaded from: classes6.dex */
public class BinderC0120c extends Binder {

    /* renamed from: a */
    public MqttService f146a;

    /* renamed from: b */
    public String f147b;

    public BinderC0120c(MqttService mqttService) {
        this.f146a = mqttService;
    }

    /* renamed from: a */
    public MqttService m304a() {
        return this.f146a;
    }

    /* renamed from: b */
    public void m305b(String str) {
        this.f147b = str;
    }
}
