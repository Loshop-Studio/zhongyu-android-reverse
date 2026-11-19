package org.eclipse.paho.android.service;

import af.BinderC0120c;
import af.InterfaceC0122e;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;

@SuppressLint({"Registered"})
/* loaded from: classes6.dex */
public class MqttService extends Service implements InterfaceC0122e {

    /* renamed from: c */
    public String f25456c;

    /* renamed from: e */
    public InterfaceC10582b f25458e;

    /* renamed from: f */
    public C10579b f25459f;

    /* renamed from: h */
    public BinderC0120c f25461h;

    /* renamed from: d */
    public boolean f25457d = false;

    /* renamed from: g */
    public volatile boolean f25460g = true;

    /* renamed from: i */
    public Map f25462i = new ConcurrentHashMap();

    /* renamed from: org.eclipse.paho.android.service.MqttService$b */
    public class C10579b extends BroadcastReceiver {
        public C10579b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MqttService.this.mo310b("MqttService", "Internal network status receive.");
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) MqttService.this.getSystemService("power")).newWakeLock(1, "MQTT");
            wakeLockNewWakeLock.acquire();
            MqttService.this.mo310b("MqttService", "Reconnect for Network recovery.");
            if (MqttService.this.m22312r()) {
                MqttService.this.mo310b("MqttService", "Online,reconnect.");
                MqttService.this.m22316v();
            } else {
                MqttService.this.m22313s();
            }
            wakeLockNewWakeLock.release();
        }
    }

    /* renamed from: A */
    public void m22292A(String str, String str2, int i10, String str3, String str4) {
        m22309o(str).m22340D(str2, i10, str3, str4);
    }

    /* renamed from: B */
    public void m22293B(String str, String[] strArr, int[] iArr, String str2, String str3) {
        m22309o(str).m22341E(strArr, iArr, str2, str3);
    }

    /* renamed from: C */
    public void m22294C(String str, String[] strArr, int[] iArr, String str2, String str3, IMqttMessageListener[] iMqttMessageListenerArr) {
        m22309o(str).m22342F(strArr, iArr, str2, str3, iMqttMessageListenerArr);
    }

    /* renamed from: D */
    public final void m22295D(String str, String str2, String str3) {
        if (this.f25456c == null || !this.f25457d) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MqttService.callbackAction", AgooConstants.MESSAGE_TRACE);
        bundle.putString("MqttService.traceSeverity", str);
        bundle.putString("MqttService.traceTag", str2);
        bundle.putString("MqttService.errorMessage", str3);
        m22300f(this.f25456c, Status.ERROR, bundle);
    }

    /* renamed from: E */
    public final void m22296E() {
        C10579b c10579b = this.f25459f;
        if (c10579b != null) {
            unregisterReceiver(c10579b);
            this.f25459f = null;
        }
    }

    /* renamed from: F */
    public void m22297F(String str, String str2, String str3, String str4) {
        m22309o(str).m22343G(str2, str3, str4);
    }

    /* renamed from: G */
    public void m22298G(String str, String[] strArr, String str2, String str3) {
        m22309o(str).m22344H(strArr, str2, str3);
    }

    @Override // af.InterfaceC0122e
    /* renamed from: a */
    public void mo309a(String str, String str2) {
        m22295D("error", str, str2);
    }

    @Override // af.InterfaceC0122e
    /* renamed from: b */
    public void mo310b(String str, String str2) {
        m22295D("debug", str, str2);
    }

    @Override // af.InterfaceC0122e
    /* renamed from: c */
    public void mo311c(String str, String str2, Exception exc) {
        if (this.f25456c != null) {
            Bundle bundle = new Bundle();
            bundle.putString("MqttService.callbackAction", AgooConstants.MESSAGE_TRACE);
            bundle.putString("MqttService.traceSeverity", "exception");
            bundle.putString("MqttService.errorMessage", str2);
            bundle.putSerializable("MqttService.exception", exc);
            bundle.putString("MqttService.traceTag", str);
            m22300f(this.f25456c, Status.ERROR, bundle);
        }
    }

    /* renamed from: e */
    public Status m22299e(String str, String str2) {
        return this.f25458e.mo22327b(str, str2) ? Status.OK : Status.ERROR;
    }

    /* renamed from: f */
    public void m22300f(String str, Status status, Bundle bundle) {
        Intent intent = new Intent("MqttService.callbackToActivity.v0");
        if (str != null) {
            intent.putExtra("MqttService.clientHandle", str);
        }
        intent.putExtra("MqttService.callbackStatus", status);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    /* renamed from: g */
    public void m22301g(String str) {
        m22309o(str).m22346f();
    }

    /* renamed from: h */
    public void m22302h(String str, MqttConnectOptions mqttConnectOptions, String str2, String str3) {
        m22309o(str).m22347g(mqttConnectOptions, null, str3);
    }

    /* renamed from: i */
    public void m22303i(String str, int i10) {
        m22309o(str).m22348h(i10);
    }

    /* renamed from: j */
    public void m22304j(String str, long j10, String str2, String str3) {
        m22309o(str).m22350j(j10, str2, str3);
        this.f25462i.remove(str);
        stopSelf();
    }

    /* renamed from: k */
    public void m22305k(String str, String str2, String str3) {
        m22309o(str).m22351k(str2, str3);
        this.f25462i.remove(str);
        stopSelf();
    }

    /* renamed from: l */
    public MqttMessage m22306l(String str, int i10) {
        return m22309o(str).m22354n(i10);
    }

    /* renamed from: m */
    public int m22307m(String str) {
        return m22309o(str).m22355o();
    }

    /* renamed from: n */
    public String m22308n(String str, String str2, String str3, MqttClientPersistence mqttClientPersistence) {
        String str4 = str + ":" + str2 + ":" + str3;
        if (this.f25462i.containsKey(str4)) {
            return str4;
        }
        this.f25462i.put(str4, new C10583c(this, str, str2, mqttClientPersistence, str4));
        return str4;
    }

    /* renamed from: o */
    public final C10583c m22309o(String str) {
        C10583c c10583c = (C10583c) this.f25462i.get(str);
        if (c10583c != null) {
            return c10583c;
        }
        throw new IllegalArgumentException("Invalid ClientHandle");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f25461h.m305b(intent.getStringExtra("MqttService.activityToken"));
        return this.f25461h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f25461h = new BinderC0120c(this);
        this.f25458e = new C10581a(this, this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Iterator it = this.f25462i.values().iterator();
        while (it.hasNext()) {
            ((C10583c) it.next()).m22351k(null, null);
        }
        if (this.f25461h != null) {
            this.f25461h = null;
        }
        m22296E();
        InterfaceC10582b interfaceC10582b = this.f25458e;
        if (interfaceC10582b != null) {
            interfaceC10582b.close();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        m22317w();
        return 1;
    }

    /* renamed from: p */
    public IMqttDeliveryToken[] m22310p(String str) {
        return m22309o(str).m22357q();
    }

    /* renamed from: q */
    public boolean m22311q(String str) {
        return m22309o(str).m22360t();
    }

    /* renamed from: r */
    public boolean m22312r() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected() && this.f25460g;
    }

    /* renamed from: s */
    public final void m22313s() {
        Iterator it = this.f25462i.values().iterator();
        while (it.hasNext()) {
            ((C10583c) it.next()).m22362v();
        }
    }

    /* renamed from: t */
    public IMqttDeliveryToken m22314t(String str, String str2, MqttMessage mqttMessage, String str3, String str4) {
        return m22309o(str).m22363w(str2, mqttMessage, str3, str4);
    }

    /* renamed from: u */
    public IMqttDeliveryToken m22315u(String str, String str2, byte[] bArr, int i10, boolean z10, String str3, String str4) {
        return m22309o(str).m22364x(str2, bArr, i10, z10, str3, str4);
    }

    /* renamed from: v */
    public void m22316v() {
        mo310b("MqttService", "Reconnect to server, client size=" + this.f25462i.size());
        for (C10583c c10583c : this.f25462i.values()) {
            mo310b("Reconnect Client:", c10583c.m22356p() + '/' + c10583c.m22358r());
            if (m22312r()) {
                c10583c.m22365y();
            }
        }
    }

    /* renamed from: w */
    public final void m22317w() {
        if (this.f25459f == null) {
            C10579b c10579b = new C10579b();
            this.f25459f = c10579b;
            registerReceiver(c10579b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: x */
    public void m22318x(String str, DisconnectedBufferOptions disconnectedBufferOptions) {
        m22309o(str).m22337A(disconnectedBufferOptions);
    }

    /* renamed from: y */
    public void m22319y(String str) {
        this.f25456c = str;
    }

    /* renamed from: z */
    public void m22320z(boolean z10) {
        this.f25457d = z10;
    }
}
