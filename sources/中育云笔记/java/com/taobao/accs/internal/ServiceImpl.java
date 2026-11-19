package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
import com.taobao.accs.IChannelInit;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC7642b;
import com.taobao.accs.p085ut.p086a.C7669c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C7680f;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class ServiceImpl extends AbstractC7633d {

    /* renamed from: b */
    private Service f13015b;

    /* renamed from: c */
    private Context f13016c;

    /* renamed from: d */
    private long f13017d;

    /* renamed from: e */
    private String f13018e;

    public ServiceImpl(Service service) {
        super(service);
        this.f13018e = "unknown";
        this.f13015b = service;
        this.f13016c = service.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d9  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m9990b(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ServiceImpl.m9990b(android.content.Intent):void");
    }

    /* renamed from: c */
    private void m9991c() {
        ConcurrentHashMap<String, AbstractC7642b> concurrentHashMap = AbstractC7633d.f13025a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC7642b>> it = AbstractC7633d.f13025a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().mo10025b();
        }
    }

    /* renamed from: d */
    private void m9992d() {
        ConcurrentHashMap<String, AbstractC7642b> concurrentHashMap = AbstractC7633d.f13025a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC7642b>> it = AbstractC7633d.f13025a.entrySet().iterator();
        while (it.hasNext()) {
            C7669c c7669cMo10029c = it.next().getValue().mo10029c();
            if (c7669cMo10029c != null) {
                c7669cMo10029c.f13182h = this.f13017d;
                c7669cMo10029c.m10109a();
            }
        }
    }

    /* renamed from: e */
    private void m9993e() {
        ConcurrentHashMap<String, AbstractC7642b> concurrentHashMap = AbstractC7633d.f13025a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC7642b>> it = AbstractC7633d.f13025a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().mo10032e();
        }
    }

    @Override // com.taobao.accs.internal.AbstractC7633d
    /* renamed from: a */
    public int mo9994a(Intent intent) {
        Bundle extras;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i("ServiceImpl", "onHostStartCommand", "intent", intent);
        }
        int i10 = 1;
        try {
            if (ALog.isPrintLog(ALog.Level.D) && intent != null && (extras = intent.getExtras()) != null) {
                for (String str : extras.keySet()) {
                    ALog.m10116d("ServiceImpl", "onHostStartCommand", "key", str, " value", extras.get(str));
                }
            }
            int iM10172c = C7680f.m10172c();
            if (iM10172c > 3) {
                i10 = 2;
                ALog.m10118e("ServiceImpl", "onHostStartCommand load SO fail 4 times, don't auto restart", new Object[0]);
                AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_SOFAIL, UtilityImpl.m10126a(iM10172c), AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            String action = intent == null ? null : intent.getAction();
            if (TextUtils.isEmpty(action)) {
                m9989b();
                m9988a(false, false);
            } else {
                m9986a(intent, action);
            }
        } finally {
            try {
                return i10;
            } finally {
            }
        }
        return i10;
    }

    @Override // com.taobao.accs.internal.AbstractC7633d, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.taobao.accs.internal.AbstractC7633d, com.taobao.accs.base.IBaseService
    public void onCreate() {
        super.onCreate();
        m9984a();
    }

    @Override // com.taobao.accs.internal.AbstractC7633d, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        super.onDestroy();
        ALog.m10118e("ServiceImpl", "Service onDestroy", new Object[0]);
        UtilityImpl.m10134a(this.f13016c, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        this.f13015b = null;
        this.f13016c = null;
        m9993e();
        Process.killProcess(Process.myPid());
    }

    @Override // com.taobao.accs.internal.AbstractC7633d, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* renamed from: a */
    private void m9985a(Context context) {
        List<String> listM10162m = UtilityImpl.m10162m(context);
        ArrayList arrayList = new ArrayList();
        if (listM10162m != null && listM10162m.size() > 0) {
            for (int i10 = 0; i10 < listM10162m.size(); i10++) {
                try {
                    Class<?> cls = Class.forName(listM10162m.get(i10));
                    if (IChannelInit.class.isAssignableFrom(cls)) {
                        try {
                            ((IChannelInit) cls.getDeclaredConstructor(null).newInstance(null)).init(context);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        arrayList.add(listM10162m.get(i10));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (arrayList.size() > 0) {
            UtilityImpl.m10135a(context, arrayList);
        }
    }

    /* renamed from: a */
    private void m9984a() {
        ALog.m10116d("ServiceImpl", "init start", new Object[0]);
        m9985a(this.f13016c);
        GlobalClientInfo.getInstance(this.f13016c);
        AdapterGlobalClientInfo.mStartServiceTimes.incrementAndGet();
        this.f13017d = System.currentTimeMillis();
        this.f13018e = UtilityImpl.m10154f(this.f13016c);
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i("ServiceImpl", "init", Constants.KEY_SDK_VERSION, Integer.valueOf(Constants.SDK_VERSION_CODE), "procStart", Integer.valueOf(AdapterGlobalClientInfo.mStartServiceTimes.intValue()));
        }
        UTMini.getInstance().commitEvent(66001, "START", UtilityImpl.m10153f(), "PROXY");
        long jM10157h = UtilityImpl.m10157h(this.f13016c);
        ALog.m10116d("ServiceImpl", "getServiceAliveTime", "aliveTime", Long.valueOf(jM10157h));
        if (jM10157h > 20000) {
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_SERVICE_ALIVE, "", jM10157h / 1000);
        }
        UtilityImpl.m10134a(this.f13016c, Constants.SP_KEY_SERVICE_START, System.currentTimeMillis());
        UTMini.getInstance().commitEvent(66001, "NOTIFY", UtilityImpl.m10160k(this.f13016c));
    }

    /* renamed from: a */
    private void m9986a(Intent intent, String str) {
        ALog.m10116d("ServiceImpl", "handleAction", "action", str);
        try {
            m9989b();
            if (TextUtils.equals(str, "android.intent.action.PACKAGE_REMOVED")) {
                return;
            }
            if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                String strM10154f = UtilityImpl.m10154f(this.f13016c);
                boolean zM10156g = UtilityImpl.m10156g(this.f13016c);
                ALog.m10119i("ServiceImpl", "network change:" + this.f13018e + " to " + strM10154f, new Object[0]);
                if (zM10156g) {
                    this.f13018e = strM10154f;
                    m9991c();
                    m9988a(true, false);
                    UTMini.getInstance().commitEvent(66001, "CONNECTIVITY_CHANGE", strM10154f, UtilityImpl.m10153f(), "0");
                }
                if ("unknown".equals(strM10154f)) {
                    m9991c();
                    this.f13018e = strM10154f;
                    return;
                }
                return;
            }
            if (TextUtils.equals(str, "android.intent.action.BOOT_COMPLETED")) {
                m9988a(true, false);
                return;
            }
            if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                ALog.m10116d("ServiceImpl", "action android.intent.action.USER_PRESENT", new Object[0]);
                m9988a(true, false);
            } else if (str.equals(Constants.ACTION_COMMAND)) {
                m9990b(intent);
            }
        } catch (Throwable th) {
            ALog.m10117e("ServiceImpl", "handleAction", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private synchronized void m9989b() {
        ConcurrentHashMap<String, AbstractC7642b> concurrentHashMap = AbstractC7633d.f13025a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            for (Map.Entry<String, AbstractC7642b> entry : AbstractC7633d.f13025a.entrySet()) {
                AbstractC7642b value = entry.getValue();
                if (value == null) {
                    ALog.m10118e("ServiceImpl", "tryConnect connection null", "appkey", value.m10036i());
                    return;
                }
                ALog.m10119i("ServiceImpl", "tryConnect", "appkey", value.m10036i(), Constants.KEY_CONFIG_TAG, entry.getKey());
                if (value.m10038k() && TextUtils.isEmpty(value.f13060i.getAppSecret())) {
                    ALog.m10118e("ServiceImpl", "tryConnect secret is null", new Object[0]);
                } else {
                    value.mo10015a();
                }
            }
            return;
        }
        ALog.m10122w("ServiceImpl", "tryConnect no connections", new Object[0]);
    }

    /* renamed from: a */
    private void m9987a(Message message, boolean z10) {
        ConcurrentHashMap<String, AbstractC7642b> concurrentHashMap = AbstractC7633d.f13025a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC7642b>> it = AbstractC7633d.f13025a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m10028b(message, z10);
        }
    }

    /* renamed from: a */
    private void m9988a(boolean z10, boolean z11) {
        ConcurrentHashMap<String, AbstractC7642b> concurrentHashMap = AbstractC7633d.f13025a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC7642b>> it = AbstractC7633d.f13025a.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC7642b value = it.next().getValue();
            value.mo10021a(z10, z11);
            ALog.m10119i("ServiceImpl", "ping connection", "appkey", value.m10036i());
        }
    }
}
