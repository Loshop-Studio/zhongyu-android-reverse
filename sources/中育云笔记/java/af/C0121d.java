package af;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* renamed from: af.d */
/* loaded from: classes6.dex */
public class C0121d implements IMqttToken {

    /* renamed from: a */
    public IMqttActionListener f148a;

    /* renamed from: b */
    public volatile boolean f149b;

    /* renamed from: c */
    public volatile MqttException f150c;

    /* renamed from: d */
    public Object f151d;

    /* renamed from: e */
    public MqttAndroidClient f152e;

    /* renamed from: f */
    public Object f153f;

    /* renamed from: g */
    public String[] f154g;

    /* renamed from: h */
    public IMqttToken f155h;

    /* renamed from: i */
    public MqttException f156i;

    public C0121d(MqttAndroidClient mqttAndroidClient, Object obj, IMqttActionListener iMqttActionListener) {
        this(mqttAndroidClient, obj, iMqttActionListener, null);
    }

    /* renamed from: a */
    public void m306a() {
        synchronized (this.f151d) {
            try {
                this.f149b = true;
                this.f151d.notifyAll();
                IMqttActionListener iMqttActionListener = this.f148a;
                if (iMqttActionListener != null) {
                    iMqttActionListener.onSuccess(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m307b(Throwable th) {
        synchronized (this.f151d) {
            try {
                this.f149b = true;
                if (th instanceof MqttException) {
                    this.f156i = (MqttException) th;
                } else {
                    this.f156i = new MqttException(th);
                }
                this.f151d.notifyAll();
                if (th instanceof MqttException) {
                    this.f150c = (MqttException) th;
                }
                IMqttActionListener iMqttActionListener = this.f148a;
                if (iMqttActionListener != null) {
                    iMqttActionListener.onFailure(this, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public void m308c(IMqttToken iMqttToken) {
        this.f155h = iMqttToken;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public IMqttActionListener getActionCallback() {
        return this.f148a;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public IMqttAsyncClient getClient() {
        return this.f152e;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public MqttException getException() {
        return this.f150c;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public int[] getGrantedQos() {
        return this.f155h.getGrantedQos();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public int getMessageId() {
        IMqttToken iMqttToken = this.f155h;
        if (iMqttToken != null) {
            return iMqttToken.getMessageId();
        }
        return 0;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public MqttWireMessage getResponse() {
        return this.f155h.getResponse();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public boolean getSessionPresent() {
        return this.f155h.getSessionPresent();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public String[] getTopics() {
        return this.f154g;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public Object getUserContext() {
        return this.f153f;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public boolean isComplete() {
        return this.f149b;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void setActionCallback(IMqttActionListener iMqttActionListener) {
        this.f148a = iMqttActionListener;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void setUserContext(Object obj) {
        this.f153f = obj;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void waitForCompletion() throws MqttException {
        synchronized (this.f151d) {
            try {
                this.f151d.wait();
            } catch (InterruptedException unused) {
            }
        }
        MqttException mqttException = this.f156i;
        if (mqttException != null) {
            throw mqttException;
        }
    }

    public C0121d(MqttAndroidClient mqttAndroidClient, Object obj, IMqttActionListener iMqttActionListener, String[] strArr) {
        this.f151d = new Object();
        this.f152e = mqttAndroidClient;
        this.f153f = obj;
        this.f148a = iMqttActionListener;
        this.f154g = strArr;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttToken
    public void waitForCompletion(long j10) {
        synchronized (this.f151d) {
            try {
                this.f151d.wait(j10);
            } catch (InterruptedException unused) {
            }
            if (this.f149b) {
                MqttException mqttException = this.f156i;
                if (mqttException != null) {
                    throw mqttException;
                }
            } else {
                throw new MqttException(32000);
            }
        }
    }
}
