package org.eclipse.paho.android.service;

import af.BinderC0120c;
import af.C0119b;
import af.C0121d;
import af.InterfaceC0122e;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.taobao.accs.utl.BaseMonitor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/* loaded from: classes6.dex */
public class MqttAndroidClient extends BroadcastReceiver implements IMqttAsyncClient {

    /* renamed from: t */
    public static final ExecutorService f25433t = Executors.newCachedThreadPool();

    /* renamed from: d */
    public MqttService f25435d;

    /* renamed from: e */
    public String f25436e;

    /* renamed from: f */
    public Context f25437f;

    /* renamed from: i */
    public final String f25440i;

    /* renamed from: j */
    public final String f25441j;

    /* renamed from: k */
    public MqttClientPersistence f25442k;

    /* renamed from: l */
    public MqttConnectOptions f25443l;

    /* renamed from: m */
    public IMqttToken f25444m;

    /* renamed from: n */
    public MqttCallback f25445n;

    /* renamed from: o */
    public InterfaceC0122e f25446o;

    /* renamed from: p */
    public final Ack f25447p;

    /* renamed from: c */
    public final ServiceConnectionC10577b f25434c = new ServiceConnectionC10577b(this, null);

    /* renamed from: g */
    public final SparseArray f25438g = new SparseArray();

    /* renamed from: h */
    public int f25439h = 0;

    /* renamed from: q */
    public boolean f25448q = false;

    /* renamed from: r */
    public volatile boolean f25449r = false;

    /* renamed from: s */
    public volatile boolean f25450s = false;

    public enum Ack {
        AUTO_ACK,
        MANUAL_ACK
    }

    /* renamed from: org.eclipse.paho.android.service.MqttAndroidClient$a */
    public class RunnableC10576a implements Runnable {
        public RunnableC10576a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MqttAndroidClient.this.m22278l();
            if (MqttAndroidClient.this.f25449r) {
                return;
            }
            MqttAndroidClient mqttAndroidClient = MqttAndroidClient.this;
            mqttAndroidClient.m22282r(mqttAndroidClient);
        }
    }

    /* renamed from: org.eclipse.paho.android.service.MqttAndroidClient$b */
    public final class ServiceConnectionC10577b implements ServiceConnection {
        public ServiceConnectionC10577b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MqttAndroidClient.this.f25435d = ((BinderC0120c) iBinder).m304a();
            MqttAndroidClient.this.f25450s = true;
            MqttAndroidClient.this.m22278l();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MqttAndroidClient.this.f25435d = null;
        }

        public /* synthetic */ ServiceConnectionC10577b(MqttAndroidClient mqttAndroidClient, RunnableC10576a runnableC10576a) {
            this();
        }
    }

    public MqttAndroidClient(Context context, String str, String str2, MqttClientPersistence mqttClientPersistence, Ack ack) {
        this.f25442k = null;
        this.f25437f = context;
        this.f25440i = str;
        this.f25441j = str2;
        this.f25442k = mqttClientPersistence;
        this.f25447p = ack;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient, java.lang.AutoCloseable
    public void close() {
        MqttService mqttService = this.f25435d;
        if (mqttService != null) {
            if (this.f25436e == null) {
                this.f25436e = mqttService.m22308n(this.f25440i, this.f25441j, this.f25437f.getApplicationInfo().packageName, this.f25442k);
            }
            this.f25435d.m22301g(this.f25436e);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect() {
        return connect(null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void deleteBufferedMessage(int i10) {
        this.f25435d.m22303i(this.f25436e, i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect() {
        C0121d c0121d = new C0121d(this, null, null);
        this.f25435d.m22305k(this.f25436e, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final void m22274g(Bundle bundle) {
        IMqttToken iMqttToken = this.f25444m;
        m22283s(bundle);
        m22285u(iMqttToken, bundle);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public MqttMessage getBufferedMessage(int i10) {
        return this.f25435d.m22306l(this.f25436e, i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public int getBufferedMessageCount() {
        return this.f25435d.m22307m(this.f25436e);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public String getClientId() {
        return this.f25441j;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.f25435d.m22310p(this.f25436e);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public String getServerURI() {
        return this.f25440i;
    }

    /* renamed from: i */
    public final void m22275i(Bundle bundle) {
        if (this.f25445n instanceof MqttCallbackExtended) {
            ((MqttCallbackExtended) this.f25445n).connectComplete(bundle.getBoolean("MqttService.reconnect", false), bundle.getString("MqttService.serverURI"));
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public boolean isConnected() {
        MqttService mqttService;
        String str = this.f25436e;
        return (str == null || (mqttService = this.f25435d) == null || !mqttService.m22311q(str)) ? false : true;
    }

    /* renamed from: j */
    public final void m22276j(Bundle bundle) {
        if (this.f25445n != null) {
            this.f25445n.connectionLost((Exception) bundle.getSerializable("MqttService.exception"));
        }
    }

    /* renamed from: k */
    public final void m22277k(Bundle bundle) {
        this.f25436e = null;
        IMqttToken iMqttTokenM22283s = m22283s(bundle);
        if (iMqttTokenM22283s != null) {
            ((C0121d) iMqttTokenM22283s).m306a();
        }
        MqttCallback mqttCallback = this.f25445n;
        if (mqttCallback != null) {
            mqttCallback.connectionLost(null);
        }
    }

    /* renamed from: l */
    public final void m22278l() {
        if (this.f25436e == null) {
            this.f25436e = this.f25435d.m22308n(this.f25440i, this.f25441j, this.f25437f.getApplicationInfo().packageName, this.f25442k);
        }
        this.f25435d.m22320z(this.f25448q);
        this.f25435d.m22319y(this.f25436e);
        try {
            this.f25435d.m22302h(this.f25436e, this.f25443l, null, m22286v(this.f25444m));
        } catch (MqttException e10) {
            IMqttActionListener actionCallback = this.f25444m.getActionCallback();
            if (actionCallback != null) {
                actionCallback.onFailure(this.f25444m, e10);
            }
        }
    }

    /* renamed from: m */
    public final synchronized IMqttToken m22279m(Bundle bundle) {
        return (IMqttToken) this.f25438g.get(Integer.parseInt(bundle.getString("MqttService.activityToken")));
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void messageArrivedComplete(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: n */
    public final void m22280n(Bundle bundle) {
        if (this.f25445n != null) {
            String string = bundle.getString("MqttService.messageId");
            String string2 = bundle.getString("MqttService.destinationName");
            ParcelableMqttMessage parcelableMqttMessage = (ParcelableMqttMessage) bundle.getParcelable("MqttService.PARCEL");
            try {
                if (this.f25447p == Ack.AUTO_ACK) {
                    this.f25445n.messageArrived(string2, parcelableMqttMessage);
                    this.f25435d.m22299e(this.f25436e, string);
                } else {
                    parcelableMqttMessage.f25464c = string;
                    this.f25445n.messageArrived(string2, parcelableMqttMessage);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("MqttService.clientHandle");
        if (string == null || !string.equals(this.f25436e)) {
            return;
        }
        String string2 = extras.getString("MqttService.callbackAction");
        if (BaseMonitor.ALARM_POINT_CONNECT.equals(string2)) {
            m22274g(extras);
            return;
        }
        if ("connectExtended".equals(string2)) {
            m22275i(extras);
            return;
        }
        if ("messageArrived".equals(string2)) {
            m22280n(extras);
            return;
        }
        if ("subscribe".equals(string2)) {
            m22287w(extras);
            return;
        }
        if ("unsubscribe".equals(string2)) {
            m22289y(extras);
            return;
        }
        if ("send".equals(string2)) {
            m22284t(extras);
            return;
        }
        if ("messageDelivered".equals(string2)) {
            m22281p(extras);
            return;
        }
        if ("onConnectionLost".equals(string2)) {
            m22276j(extras);
            return;
        }
        if ("disconnect".equals(string2)) {
            m22277k(extras);
        } else if (AgooConstants.MESSAGE_TRACE.equals(string2)) {
            m22288x(extras);
        } else {
            this.f25435d.mo309a("MqttService", "Callback action doesn't exist.");
        }
    }

    /* renamed from: p */
    public final void m22281p(Bundle bundle) {
        IMqttToken iMqttTokenM22283s = m22283s(bundle);
        if (iMqttTokenM22283s == null || this.f25445n == null || ((Status) bundle.getSerializable("MqttService.callbackStatus")) != Status.OK || !(iMqttTokenM22283s instanceof IMqttDeliveryToken)) {
            return;
        }
        this.f25445n.deliveryComplete((IMqttDeliveryToken) iMqttTokenM22283s);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10) {
        return publish(str, bArr, i10, z10, null, null);
    }

    /* renamed from: r */
    public final void m22282r(BroadcastReceiver broadcastReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("MqttService.callbackToActivity.v0");
        LocalBroadcastManager.getInstance(this.f25437f).registerReceiver(broadcastReceiver, intentFilter);
        this.f25449r = true;
    }

    /* renamed from: s */
    public final synchronized IMqttToken m22283s(Bundle bundle) {
        String string = bundle.getString("MqttService.activityToken");
        if (string == null) {
            return null;
        }
        int i10 = Integer.parseInt(string);
        IMqttToken iMqttToken = (IMqttToken) this.f25438g.get(i10);
        this.f25438g.delete(i10);
        return iMqttToken;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setBufferOpts(DisconnectedBufferOptions disconnectedBufferOptions) {
        this.f25435d.m22318x(this.f25436e, disconnectedBufferOptions);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setCallback(MqttCallback mqttCallback) {
        this.f25445n = mqttCallback;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setManualAcks(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10) {
        return subscribe(str, i10, (Object) null, (IMqttActionListener) null);
    }

    /* renamed from: t */
    public final void m22284t(Bundle bundle) {
        m22285u(m22279m(bundle), bundle);
    }

    /* renamed from: u */
    public final void m22285u(IMqttToken iMqttToken, Bundle bundle) {
        if (iMqttToken == null) {
            this.f25435d.mo309a("MqttService", "simpleAction : token is null");
        } else if (((Status) bundle.getSerializable("MqttService.callbackStatus")) == Status.OK) {
            ((C0121d) iMqttToken).m306a();
        } else {
            ((C0121d) iMqttToken).m307b((Exception) bundle.getSerializable("MqttService.exception"));
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String str) {
        return unsubscribe(str, (Object) null, (IMqttActionListener) null);
    }

    /* renamed from: v */
    public final synchronized String m22286v(IMqttToken iMqttToken) {
        int i10;
        this.f25438g.put(this.f25439h, iMqttToken);
        i10 = this.f25439h;
        this.f25439h = i10 + 1;
        return Integer.toString(i10);
    }

    /* renamed from: w */
    public final void m22287w(Bundle bundle) {
        m22285u(m22283s(bundle), bundle);
    }

    /* renamed from: x */
    public final void m22288x(Bundle bundle) {
        if (this.f25446o != null) {
            String string = bundle.getString("MqttService.traceSeverity");
            String string2 = bundle.getString("MqttService.errorMessage");
            String string3 = bundle.getString("MqttService.traceTag");
            if ("debug".equals(string)) {
                this.f25446o.mo310b(string3, string2);
            } else if ("error".equals(string)) {
                this.f25446o.mo309a(string3, string2);
            } else {
                this.f25446o.mo311c(string3, string2, (Exception) bundle.getSerializable("MqttService.exception"));
            }
        }
    }

    /* renamed from: y */
    public final void m22289y(Bundle bundle) {
        m22285u(m22283s(bundle), bundle);
    }

    /* renamed from: z */
    public void m22290z() {
        if (this.f25437f == null || !this.f25449r) {
            return;
        }
        synchronized (this) {
            LocalBroadcastManager.getInstance(this.f25437f).unregisterReceiver(this);
            this.f25449r = false;
        }
        if (this.f25450s) {
            try {
                this.f25437f.unbindService(this.f25434c);
                this.f25450s = false;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions) {
        return connect(mqttConnectOptions, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage) {
        return publish(str, mqttMessage, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr) {
        return subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr) {
        return unsubscribe(strArr, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(Object obj, IMqttActionListener iMqttActionListener) {
        return connect(new MqttConnectOptions(), obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly(long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10, Object obj, IMqttActionListener iMqttActionListener) {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i10);
        mqttMessage.setRetained(z10);
        C0119b c0119b = new C0119b(this, obj, iMqttActionListener, mqttMessage);
        c0119b.m308c(this.f25435d.m22315u(this.f25436e, str, bArr, i10, z10, null, m22286v(c0119b)));
        return c0119b;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener) {
        C0121d c0121d = new C0121d(this, obj, iMqttActionListener, new String[]{str});
        this.f25435d.m22292A(this.f25436e, str, i10, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String str, Object obj, IMqttActionListener iMqttActionListener) {
        C0121d c0121d = new C0121d(this, obj, iMqttActionListener);
        this.f25435d.m22297F(this.f25436e, str, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions, Object obj, IMqttActionListener iMqttActionListener) {
        IMqttActionListener actionCallback;
        IMqttToken c0121d = new C0121d(this, obj, iMqttActionListener);
        this.f25443l = mqttConnectOptions;
        this.f25444m = c0121d;
        if (this.f25435d == null) {
            Intent intent = new Intent();
            intent.setClassName(this.f25437f, "org.eclipse.paho.android.service.MqttService");
            if (this.f25437f.startService(intent) == null && (actionCallback = c0121d.getActionCallback()) != null) {
                actionCallback.onFailure(c0121d, new RuntimeException("cannot start service org.eclipse.paho.android.service.MqttService"));
            }
            this.f25437f.bindService(intent, this.f25434c, 1);
            if (!this.f25449r) {
                m22282r(this);
            }
            return c0121d;
        }
        f25433t.execute(new RunnableC10576a());
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(long j10) {
        C0121d c0121d = new C0121d(this, null, null);
        this.f25435d.m22304j(this.f25436e, j10, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) {
        C0121d c0121d = new C0121d(this, obj, iMqttActionListener, strArr);
        this.f25435d.m22293B(this.f25436e, strArr, iArr, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr, Object obj, IMqttActionListener iMqttActionListener) {
        C0121d c0121d = new C0121d(this, obj, iMqttActionListener);
        this.f25435d.m22298G(this.f25436e, strArr, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(Object obj, IMqttActionListener iMqttActionListener) {
        C0121d c0121d = new C0121d(this, obj, iMqttActionListener);
        this.f25435d.m22305k(this.f25436e, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener iMqttMessageListener) {
        return subscribe(new String[]{str}, new int[]{i10}, obj, iMqttActionListener, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(long j10, Object obj, IMqttActionListener iMqttActionListener) {
        C0121d c0121d = new C0121d(this, obj, iMqttActionListener);
        this.f25435d.m22304j(this.f25436e, j10, null, m22286v(c0121d));
        return c0121d;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage, Object obj, IMqttActionListener iMqttActionListener) {
        C0119b c0119b = new C0119b(this, obj, iMqttActionListener, mqttMessage);
        c0119b.m308c(this.f25435d.m22314t(this.f25436e, str, mqttMessage, null, m22286v(c0119b)));
        return c0119b;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener) {
        return subscribe(str, i10, (Object) null, (IMqttActionListener) null, iMqttMessageListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) {
        return subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener[] iMqttMessageListenerArr) {
        this.f25435d.m22294C(this.f25436e, strArr, iArr, null, m22286v(new C0121d(this, obj, iMqttActionListener, strArr)), iMqttMessageListenerArr);
        return null;
    }
}
