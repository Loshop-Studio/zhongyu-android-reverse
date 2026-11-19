package org.eclipse.paho.android.service;

import af.C0118a;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import com.taobao.accs.utl.BaseMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.paho.android.service.InterfaceC10582b;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;

/* renamed from: org.eclipse.paho.android.service.c */
/* loaded from: classes6.dex */
public class C10583c implements MqttCallbackExtended {

    /* renamed from: a */
    public String f25483a;

    /* renamed from: b */
    public String f25484b;

    /* renamed from: c */
    public MqttClientPersistence f25485c;

    /* renamed from: d */
    public MqttConnectOptions f25486d;

    /* renamed from: e */
    public String f25487e;

    /* renamed from: i */
    public MqttService f25491i;

    /* renamed from: r */
    public String f25500r;

    /* renamed from: f */
    public String f25488f = null;

    /* renamed from: g */
    public MqttAsyncClient f25489g = null;

    /* renamed from: h */
    public C0118a f25490h = null;

    /* renamed from: j */
    public volatile boolean f25492j = true;

    /* renamed from: k */
    public boolean f25493k = true;

    /* renamed from: l */
    public volatile boolean f25494l = false;

    /* renamed from: m */
    public Map f25495m = new HashMap();

    /* renamed from: n */
    public Map f25496n = new HashMap();

    /* renamed from: o */
    public Map f25497o = new HashMap();

    /* renamed from: p */
    public Map f25498p = new HashMap();

    /* renamed from: q */
    public PowerManager.WakeLock f25499q = null;

    /* renamed from: s */
    public DisconnectedBufferOptions f25501s = null;

    /* renamed from: org.eclipse.paho.android.service.c$a */
    public class a extends d {

        /* renamed from: c */
        public final /* synthetic */ Bundle f25502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bundle bundle, Bundle bundle2) {
            super(C10583c.this, bundle, null);
            this.f25502c = bundle2;
        }

        @Override // org.eclipse.paho.android.service.C10583c.d, org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
            this.f25502c.putString("MqttService.errorMessage", th.getLocalizedMessage());
            this.f25502c.putSerializable("MqttService.exception", th);
            C10583c.this.f25491i.mo309a("MqttConnection", "connect fail, call connect to reconnect.reason:" + th.getMessage());
            C10583c.this.m22352l(this.f25502c);
        }

        @Override // org.eclipse.paho.android.service.C10583c.d, org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
            C10583c.this.m22353m(this.f25502c);
            C10583c.this.f25491i.mo310b("MqttConnection", "connect success!");
        }
    }

    /* renamed from: org.eclipse.paho.android.service.c$b */
    public class b implements IMqttActionListener {
        public b() {
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
        }
    }

    /* renamed from: org.eclipse.paho.android.service.c$c */
    public class c extends d {

        /* renamed from: c */
        public final /* synthetic */ Bundle f25505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle, Bundle bundle2) {
            super(C10583c.this, bundle, null);
            this.f25505c = bundle2;
        }

        @Override // org.eclipse.paho.android.service.C10583c.d, org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
            this.f25505c.putString("MqttService.errorMessage", th.getLocalizedMessage());
            this.f25505c.putSerializable("MqttService.exception", th);
            C10583c.this.f25491i.m22300f(C10583c.this.f25487e, Status.ERROR, this.f25505c);
            C10583c.this.m22352l(this.f25505c);
        }

        @Override // org.eclipse.paho.android.service.C10583c.d, org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
            C10583c.this.f25491i.mo310b("MqttConnection", "Reconnect Success!");
            C10583c.this.f25491i.mo310b("MqttConnection", "DeliverBacklog when reconnect.");
            C10583c.this.m22353m(this.f25505c);
        }
    }

    /* renamed from: org.eclipse.paho.android.service.c$d */
    public class d implements IMqttActionListener {

        /* renamed from: a */
        public final Bundle f25507a;

        public /* synthetic */ d(C10583c c10583c, Bundle bundle, a aVar) {
            this(bundle);
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
            this.f25507a.putString("MqttService.errorMessage", th.getLocalizedMessage());
            this.f25507a.putSerializable("MqttService.exception", th);
            C10583c.this.f25491i.m22300f(C10583c.this.f25487e, Status.ERROR, this.f25507a);
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
            C10583c.this.f25491i.m22300f(C10583c.this.f25487e, Status.OK, this.f25507a);
        }

        public d(Bundle bundle) {
            this.f25507a = bundle;
        }
    }

    public C10583c(MqttService mqttService, String str, String str2, MqttClientPersistence mqttClientPersistence, String str3) {
        this.f25485c = null;
        this.f25491i = null;
        this.f25500r = null;
        this.f25483a = str;
        this.f25491i = mqttService;
        this.f25484b = str2;
        this.f25485c = mqttClientPersistence;
        this.f25487e = str3;
        this.f25500r = getClass().getCanonicalName() + " " + str2 + " on host " + str;
    }

    /* renamed from: A */
    public void m22337A(DisconnectedBufferOptions disconnectedBufferOptions) {
        this.f25501s = disconnectedBufferOptions;
        this.f25489g.setBufferOpts(disconnectedBufferOptions);
    }

    /* renamed from: B */
    public final synchronized void m22338B(boolean z10) {
        this.f25494l = z10;
    }

    /* renamed from: C */
    public final void m22339C(String str, MqttMessage mqttMessage, IMqttDeliveryToken iMqttDeliveryToken, String str2, String str3) {
        this.f25495m.put(iMqttDeliveryToken, str);
        this.f25496n.put(iMqttDeliveryToken, mqttMessage);
        this.f25497o.put(iMqttDeliveryToken, str3);
        this.f25498p.put(iMqttDeliveryToken, str2);
    }

    /* renamed from: D */
    public void m22340D(String str, int i10, String str2, String str3) {
        this.f25491i.mo310b("MqttConnection", "subscribe({" + str + "}," + i10 + ",{" + str2 + "}, {" + str3 + "}");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "subscribe");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("subscribe", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            try {
                this.f25489g.subscribe(str, i10, str2, new d(this, bundle, null));
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
    }

    /* renamed from: E */
    public void m22341E(String[] strArr, int[] iArr, String str, String str2) {
        this.f25491i.mo310b("MqttConnection", "subscribe({" + Arrays.toString(strArr) + "}," + Arrays.toString(iArr) + ",{" + str + "}, {" + str2 + "}");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "subscribe");
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("subscribe", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            try {
                this.f25489g.subscribe(strArr, iArr, str, new d(this, bundle, null));
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
    }

    /* renamed from: F */
    public void m22342F(String[] strArr, int[] iArr, String str, String str2, IMqttMessageListener[] iMqttMessageListenerArr) {
        this.f25491i.mo310b("MqttConnection", "subscribe({" + Arrays.toString(strArr) + "}," + Arrays.toString(iArr) + ",{" + str + "}, {" + str2 + "}");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "subscribe");
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("subscribe", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            new d(this, bundle, null);
            try {
                this.f25489g.subscribe(strArr, iArr, iMqttMessageListenerArr);
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
    }

    /* renamed from: G */
    public void m22343G(String str, String str2, String str3) {
        this.f25491i.mo310b("MqttConnection", "unsubscribe({" + str + "},{" + str2 + "}, {" + str3 + "})");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "unsubscribe");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("subscribe", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            try {
                this.f25489g.unsubscribe(str, str2, new d(this, bundle, null));
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
    }

    /* renamed from: H */
    public void m22344H(String[] strArr, String str, String str2) {
        this.f25491i.mo310b("MqttConnection", "unsubscribe({" + Arrays.toString(strArr) + "},{" + str + "}, {" + str2 + "})");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "unsubscribe");
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("subscribe", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            try {
                this.f25489g.unsubscribe(strArr, str, new d(this, bundle, null));
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttCallbackExtended
    public void connectComplete(boolean z10, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "connectExtended");
        bundle.putBoolean("MqttService.reconnect", z10);
        bundle.putString("MqttService.serverURI", str);
        this.f25491i.m22300f(this.f25487e, Status.OK, bundle);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttCallback
    public void connectionLost(Throwable th) {
        this.f25491i.mo310b("MqttConnection", "connectionLost(" + th.getMessage() + ")");
        this.f25492j = true;
        try {
            if (this.f25486d.isAutomaticReconnect()) {
                this.f25490h.schedule(100L);
            } else {
                this.f25489g.disconnect(null, new b());
            }
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "onConnectionLost");
        bundle.putString("MqttService.errorMessage", th.getMessage());
        if (th instanceof MqttException) {
            bundle.putSerializable("MqttService.exception", th);
        }
        bundle.putString("MqttService.exceptionStack", Log.getStackTraceString(th));
        this.f25491i.m22300f(this.f25487e, Status.OK, bundle);
        m22366z();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttCallback
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        this.f25491i.mo310b("MqttConnection", "deliveryComplete(" + iMqttDeliveryToken + ")");
        MqttMessage mqttMessage = (MqttMessage) this.f25496n.remove(iMqttDeliveryToken);
        if (mqttMessage != null) {
            String str = (String) this.f25495m.remove(iMqttDeliveryToken);
            String str2 = (String) this.f25497o.remove(iMqttDeliveryToken);
            String str3 = (String) this.f25498p.remove(iMqttDeliveryToken);
            Bundle bundleM22361u = m22361u(null, str, mqttMessage);
            if (str2 != null) {
                bundleM22361u.putString("MqttService.callbackAction", "send");
                bundleM22361u.putString("MqttService.activityToken", str2);
                bundleM22361u.putString("MqttService.invocationContext", str3);
                this.f25491i.m22300f(this.f25487e, Status.OK, bundleM22361u);
            }
            bundleM22361u.putString("MqttService.callbackAction", "messageDelivered");
            this.f25491i.m22300f(this.f25487e, Status.OK, bundleM22361u);
        }
    }

    /* renamed from: e */
    public final void m22345e() {
        if (this.f25499q == null) {
            this.f25499q = ((PowerManager) this.f25491i.getSystemService("power")).newWakeLock(1, this.f25500r);
        }
        this.f25499q.acquire();
    }

    /* renamed from: f */
    public void m22346f() {
        this.f25491i.mo310b("MqttConnection", "close()");
        try {
            MqttAsyncClient mqttAsyncClient = this.f25489g;
            if (mqttAsyncClient != null) {
                mqttAsyncClient.close();
            }
        } catch (MqttException e10) {
            m22359s(new Bundle(), e10);
        }
    }

    /* renamed from: g */
    public void m22347g(MqttConnectOptions mqttConnectOptions, String str, String str2) {
        this.f25486d = mqttConnectOptions;
        this.f25488f = str2;
        if (mqttConnectOptions != null) {
            this.f25493k = mqttConnectOptions.isCleanSession();
        }
        if (this.f25486d.isCleanSession()) {
            this.f25491i.f25458e.mo22328c(this.f25487e);
        }
        this.f25491i.mo310b("MqttConnection", "Connecting {" + this.f25483a + "} as {" + this.f25484b + "}");
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        bundle.putString("MqttService.callbackAction", BaseMonitor.ALARM_POINT_CONNECT);
        try {
            if (this.f25485c == null) {
                File externalFilesDir = this.f25491i.getExternalFilesDir("MqttConnection");
                if (externalFilesDir == null && (externalFilesDir = this.f25491i.getDir("MqttConnection", 0)) == null) {
                    bundle.putString("MqttService.errorMessage", "Error! No external and internal storage available");
                    bundle.putSerializable("MqttService.exception", new MqttPersistenceException());
                    this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
                    return;
                }
                this.f25485c = new MqttDefaultFilePersistence(externalFilesDir.getAbsolutePath());
            }
            a aVar = new a(bundle, bundle);
            if (this.f25489g == null) {
                this.f25490h = new C0118a(this.f25491i);
                MqttAsyncClient mqttAsyncClient = new MqttAsyncClient(this.f25483a, this.f25484b, this.f25485c, this.f25490h);
                this.f25489g = mqttAsyncClient;
                mqttAsyncClient.setCallback(this);
                this.f25491i.mo310b("MqttConnection", "Do Real connect!");
                m22338B(true);
                this.f25489g.connect(this.f25486d, str, aVar);
                return;
            }
            if (this.f25494l) {
                this.f25491i.mo310b("MqttConnection", "myClient != null and the client is connecting. Connect return directly.");
                this.f25491i.mo310b("MqttConnection", "Connect return:isConnecting:" + this.f25494l + ".disconnected:" + this.f25492j);
                return;
            }
            if (!this.f25492j) {
                this.f25491i.mo310b("MqttConnection", "myClient != null and the client is connected and notify!");
                m22353m(bundle);
            } else {
                this.f25491i.mo310b("MqttConnection", "myClient != null and the client is not connected");
                this.f25491i.mo310b("MqttConnection", "Do Real connect!");
                m22338B(true);
                this.f25489g.connect(this.f25486d, str, aVar);
            }
        } catch (Exception e10) {
            this.f25491i.mo309a("MqttConnection", "Exception occurred attempting to connect: " + e10.getMessage());
            m22338B(false);
            m22359s(bundle, e10);
        }
    }

    /* renamed from: h */
    public void m22348h(int i10) {
        this.f25489g.deleteBufferedMessage(i10);
    }

    /* renamed from: i */
    public final void m22349i() {
        Iterator itMo22326a = this.f25491i.f25458e.mo22326a(this.f25487e);
        while (itMo22326a.hasNext()) {
            InterfaceC10582b.a aVar = (InterfaceC10582b.a) itMo22326a.next();
            Bundle bundleM22361u = m22361u(aVar.getMessageId(), aVar.mo22332a(), aVar.getMessage());
            bundleM22361u.putString("MqttService.callbackAction", "messageArrived");
            this.f25491i.m22300f(this.f25487e, Status.OK, bundleM22361u);
        }
    }

    /* renamed from: j */
    public void m22350j(long j10, String str, String str2) {
        this.f25491i.mo310b("MqttConnection", "disconnect()");
        this.f25492j = true;
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        bundle.putString("MqttService.callbackAction", "disconnect");
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("disconnect", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            try {
                this.f25489g.disconnect(j10, str, new d(this, bundle, null));
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
        MqttConnectOptions mqttConnectOptions = this.f25486d;
        if (mqttConnectOptions != null && mqttConnectOptions.isCleanSession()) {
            this.f25491i.f25458e.mo22328c(this.f25487e);
        }
        m22366z();
    }

    /* renamed from: k */
    public void m22351k(String str, String str2) {
        this.f25491i.mo310b("MqttConnection", "disconnect()");
        this.f25492j = true;
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.activityToken", str2);
        bundle.putString("MqttService.invocationContext", str);
        bundle.putString("MqttService.callbackAction", "disconnect");
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("disconnect", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        } else {
            try {
                this.f25489g.disconnect(str, new d(this, bundle, null));
            } catch (Exception e10) {
                m22359s(bundle, e10);
            }
        }
        MqttConnectOptions mqttConnectOptions = this.f25486d;
        if (mqttConnectOptions != null && mqttConnectOptions.isCleanSession()) {
            this.f25491i.f25458e.mo22328c(this.f25487e);
        }
        m22366z();
    }

    /* renamed from: l */
    public final void m22352l(Bundle bundle) {
        m22345e();
        this.f25492j = true;
        m22338B(false);
        this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
        m22366z();
    }

    /* renamed from: m */
    public final void m22353m(Bundle bundle) {
        m22345e();
        this.f25491i.m22300f(this.f25487e, Status.OK, bundle);
        m22349i();
        m22338B(false);
        this.f25492j = false;
        m22366z();
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttCallback
    public void messageArrived(String str, MqttMessage mqttMessage) {
        this.f25491i.mo310b("MqttConnection", "messageArrived(" + str + ",{" + mqttMessage.toString() + "})");
        String strMo22329d = this.f25491i.f25458e.mo22329d(this.f25487e, str, mqttMessage);
        Bundle bundleM22361u = m22361u(strMo22329d, str, mqttMessage);
        bundleM22361u.putString("MqttService.callbackAction", "messageArrived");
        bundleM22361u.putString("MqttService.messageId", strMo22329d);
        this.f25491i.m22300f(this.f25487e, Status.OK, bundleM22361u);
    }

    /* renamed from: n */
    public MqttMessage m22354n(int i10) {
        return this.f25489g.getBufferedMessage(i10);
    }

    /* renamed from: o */
    public int m22355o() {
        return this.f25489g.getBufferedMessageCount();
    }

    /* renamed from: p */
    public String m22356p() {
        return this.f25484b;
    }

    /* renamed from: q */
    public IMqttDeliveryToken[] m22357q() {
        return this.f25489g.getPendingDeliveryTokens();
    }

    /* renamed from: r */
    public String m22358r() {
        return this.f25483a;
    }

    /* renamed from: s */
    public final void m22359s(Bundle bundle, Exception exc) {
        bundle.putString("MqttService.errorMessage", exc.getLocalizedMessage());
        bundle.putSerializable("MqttService.exception", exc);
        this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
    }

    /* renamed from: t */
    public boolean m22360t() {
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        return mqttAsyncClient != null && mqttAsyncClient.isConnected();
    }

    /* renamed from: u */
    public final Bundle m22361u(String str, String str2, MqttMessage mqttMessage) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.messageId", str);
        bundle.putString("MqttService.destinationName", str2);
        bundle.putParcelable("MqttService.PARCEL", new ParcelableMqttMessage(mqttMessage));
        return bundle;
    }

    /* renamed from: v */
    public void m22362v() {
        if (this.f25492j || this.f25493k) {
            return;
        }
        connectionLost(new Exception("Android offline"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* renamed from: w */
    public IMqttDeliveryToken m22363w(String str, MqttMessage mqttMessage, String str2, String str3) {
        DisconnectedBufferOptions disconnectedBufferOptions;
        IMqttDeliveryToken iMqttDeliveryToken;
        IMqttDeliveryToken iMqttDeliveryTokenPublish;
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "send");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        a aVar = 0;
        IMqttDeliveryToken iMqttDeliveryToken2 = null;
        if (mqttAsyncClient != null && mqttAsyncClient.isConnected()) {
            try {
                iMqttDeliveryTokenPublish = this.f25489g.publish(str, mqttMessage, str2, new d(this, bundle, aVar));
            } catch (Exception e10) {
                e = e10;
            }
            try {
                m22339C(str, mqttMessage, iMqttDeliveryTokenPublish, str2, str3);
                return iMqttDeliveryTokenPublish;
            } catch (Exception e11) {
                e = e11;
                iMqttDeliveryToken2 = iMqttDeliveryTokenPublish;
                m22359s(bundle, e);
                iMqttDeliveryToken = iMqttDeliveryToken2;
                return iMqttDeliveryToken;
            }
        }
        if (this.f25489g == null || (disconnectedBufferOptions = this.f25501s) == null || !disconnectedBufferOptions.isBufferEnabled()) {
            Log.i("MqttConnection", "Client is not connected, so not sending message");
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("send", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
            return null;
        }
        try {
            IMqttDeliveryToken iMqttDeliveryTokenPublish2 = this.f25489g.publish(str, mqttMessage, str2, new d(this, bundle, aVar));
            try {
                m22339C(str, mqttMessage, iMqttDeliveryTokenPublish2, str2, str3);
                return iMqttDeliveryTokenPublish2;
            } catch (Exception e12) {
                e = e12;
                aVar = iMqttDeliveryTokenPublish2;
                m22359s(bundle, e);
                iMqttDeliveryToken = aVar;
                return iMqttDeliveryToken;
            }
        } catch (Exception e13) {
            e = e13;
        }
        return iMqttDeliveryToken;
    }

    /* renamed from: x */
    public IMqttDeliveryToken m22364x(String str, byte[] bArr, int i10, boolean z10, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", "send");
        bundle.putString("MqttService.activityToken", str3);
        bundle.putString("MqttService.invocationContext", str2);
        MqttAsyncClient mqttAsyncClient = this.f25489g;
        a aVar = null;
        if (mqttAsyncClient == null || !mqttAsyncClient.isConnected()) {
            bundle.putString("MqttService.errorMessage", "not connected");
            this.f25491i.mo309a("send", "not connected");
            this.f25491i.m22300f(this.f25487e, Status.ERROR, bundle);
            return null;
        }
        d dVar = new d(this, bundle, aVar);
        IMqttDeliveryToken iMqttDeliveryTokenPublish = null;
        try {
            MqttMessage mqttMessage = new MqttMessage(bArr);
            mqttMessage.setQos(i10);
            mqttMessage.setRetained(z10);
            iMqttDeliveryTokenPublish = this.f25489g.publish(str, bArr, i10, z10, str2, dVar);
            m22339C(str, mqttMessage, iMqttDeliveryTokenPublish, str2, str3);
            return iMqttDeliveryTokenPublish;
        } catch (Exception e10) {
            IMqttDeliveryToken iMqttDeliveryToken = iMqttDeliveryTokenPublish;
            m22359s(bundle, e10);
            return iMqttDeliveryToken;
        }
    }

    /* renamed from: y */
    public synchronized void m22365y() {
        if (this.f25489g == null) {
            this.f25491i.mo309a("MqttConnection", "Reconnect myClient = null. Will not do reconnect");
            return;
        }
        if (this.f25494l) {
            this.f25491i.mo310b("MqttConnection", "The client is connecting. Reconnect return directly.");
            return;
        }
        if (!this.f25491i.m22312r()) {
            this.f25491i.mo310b("MqttConnection", "The network is not reachable. Will not do reconnect");
            return;
        }
        if (this.f25486d.isAutomaticReconnect()) {
            Log.i("MqttConnection", "Requesting Automatic reconnect using New Java AC");
            Bundle bundle = new Bundle();
            bundle.putString("MqttService.activityToken", this.f25488f);
            bundle.putString("MqttService.invocationContext", null);
            bundle.putString("MqttService.callbackAction", BaseMonitor.ALARM_POINT_CONNECT);
            try {
                this.f25489g.reconnect();
            } catch (MqttException e10) {
                Log.e("MqttConnection", "Exception occurred attempting to reconnect: " + e10.getMessage());
                m22338B(false);
                m22359s(bundle, e10);
            }
        }
        if (this.f25492j && !this.f25493k) {
            this.f25491i.mo310b("MqttConnection", "Do Real Reconnect!");
            Bundle bundle2 = new Bundle();
            bundle2.putString("MqttService.activityToken", this.f25488f);
            bundle2.putString("MqttService.invocationContext", null);
            bundle2.putString("MqttService.callbackAction", BaseMonitor.ALARM_POINT_CONNECT);
            try {
                try {
                    this.f25489g.connect(this.f25486d, null, new c(bundle2, bundle2));
                    m22338B(true);
                } catch (MqttException e11) {
                    this.f25491i.mo309a("MqttConnection", "Cannot reconnect to remote server." + e11.getMessage());
                    m22338B(false);
                    m22359s(bundle2, e11);
                }
            } catch (Exception e12) {
                this.f25491i.mo309a("MqttConnection", "Cannot reconnect to remote server." + e12.getMessage());
                m22338B(false);
                m22359s(bundle2, new MqttException(6, e12.getCause()));
            }
        }
    }

    /* renamed from: z */
    public final void m22366z() {
        PowerManager.WakeLock wakeLock = this.f25499q;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.f25499q.release();
    }
}
