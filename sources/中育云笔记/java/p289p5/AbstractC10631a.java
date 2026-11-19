package p289p5;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p007a6.AbstractC0063c;
import p032b6.C5169c;
import p032b6.C5171e;
import p044c6.C5402a;

/* renamed from: p5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10631a {

    /* renamed from: a */
    public static final HostnameVerifier f25620a = new C5402a();

    /* renamed from: a */
    public static HostnameVerifier m22480a() {
        return f25620a;
    }

    /* renamed from: b */
    public static SSLSocketFactory m22481b(Context context) {
        try {
            return new C5169c(new C5171e(context.getAssets().open(GrsApp.getInstance().getBrand(MqttTopic.TOPIC_LEVEL_SEPARATOR) + "grs_sp.bks"), ""), AbstractC0063c.m123c());
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }
}
