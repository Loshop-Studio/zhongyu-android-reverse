package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.IChannelInit;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.C1729g;
import com.taobao.accs.data.Message;
import com.taobao.accs.messenger.MessengerService;
import com.taobao.accs.net.AbstractC1745b;
import com.taobao.accs.net.C1766w;
import com.taobao.accs.p064ut.p065a.C1772c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C1783f;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class ServiceImpl extends AbstractC1736d {

    /* renamed from: b */
    private Service f7617b;

    /* renamed from: c */
    private Context f7618c;

    /* renamed from: d */
    private long f7619d;

    /* renamed from: e */
    private String f7620e;

    public ServiceImpl(Service service) {
        super(service);
        this.f7620e = UtilityImpl.NET_TYPE_UNKNOWN;
        this.f7617b = service;
        this.f7618c = service.getApplicationContext();
    }

    /* renamed from: b */
    private void m5964b(Intent intent) {
        Message.ReqType reqType;
        URL url;
        Message messageM5854a;
        Message messageM5858a;
        int intExtra = intent.getIntExtra("command", -1);
        ALog.m6093i("ServiceImpl", "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
        String stringExtra3 = intent.getStringExtra(Constants.KEY_USER_ID);
        String stringExtra4 = intent.getStringExtra(Constants.KEY_APP_KEY);
        String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
        String stringExtra6 = intent.getStringExtra(Constants.KEY_TTID);
        intent.getStringExtra("sid");
        intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
        if (intExtra == 201) {
            m5961a(Message.m5862a(true, 0), true);
            m5966d();
        }
        if (intExtra <= 0 || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        AbstractC1745b abstractC1745bM5969a = AbstractC1736d.m5969a(this.f7618c, stringExtra5, true);
        if (abstractC1745bM5969a == null) {
            ALog.m6092e("ServiceImpl", "no connection", Constants.KEY_CONFIG_TAG, stringExtra5, "command", Integer.valueOf(intExtra));
            return;
        }
        abstractC1745bM5969a.mo5989a();
        if (intExtra != 1) {
            if (intExtra == 2) {
                ALog.m6092e("ServiceImpl", "onHostStartCommand COMMAND_UNBIND_APP", new Object[0]);
                if (abstractC1745bM5969a.m6011j().m5848e(stringExtra)) {
                    Message messageM5856a = Message.m5856a(abstractC1745bM5969a, stringExtra);
                    ALog.m6093i("ServiceImpl", stringExtra + " isAppUnbinded", new Object[0]);
                    abstractC1745bM5969a.m5991a(messageM5856a, AccsErrorCode.SUCCESS);
                    return;
                }
            } else if (intExtra == 5) {
                messageM5858a = Message.m5860a(stringExtra, stringExtra2);
            } else if (intExtra == 6) {
                messageM5858a = Message.m5869b(stringExtra, stringExtra2);
            } else if (intExtra == 3) {
                messageM5858a = Message.m5871c(stringExtra, stringExtra3);
            } else if (intExtra == 4) {
                messageM5858a = Message.m5858a(stringExtra);
            } else if (intExtra == 100) {
                byte[] byteArrayExtra = intent.getByteArrayExtra(Constants.KEY_DATA);
                String stringExtra7 = intent.getStringExtra(Constants.KEY_DATA_ID);
                String stringExtra8 = intent.getStringExtra(Constants.KEY_TARGET);
                String stringExtra9 = intent.getStringExtra(Constants.KEY_BUSINESSID);
                String stringExtra10 = intent.getStringExtra(Constants.KEY_EXT_TAG);
                try {
                    reqType = (Message.ReqType) intent.getSerializableExtra(Constants.KEY_SEND_TYPE);
                } catch (Exception unused) {
                    reqType = null;
                }
                if (byteArrayExtra != null) {
                    try {
                        url = new URL("https://" + ((C1766w) abstractC1745bM5969a).m6072r());
                    } catch (Exception unused2) {
                        url = null;
                    }
                    ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra7, stringExtra8, url, stringExtra9);
                    accsRequest.setTag(stringExtra10);
                    if (reqType == null) {
                        messageM5854a = Message.m5853a(abstractC1745bM5969a, this.f7618c, stringExtra, accsRequest, false);
                    } else if (reqType == Message.ReqType.REQ) {
                        messageM5854a = Message.m5854a(abstractC1745bM5969a, this.f7618c, stringExtra, Constants.TARGET_SERVICE_PRE, accsRequest, false);
                    }
                    messageM5858a = messageM5854a;
                }
            } else if (intExtra == 106) {
                intent.setAction(Constants.ACTION_RECEIVE);
                intent.putExtra("command", -1);
                C1729g.m5935a(this.f7618c, intent);
                return;
            }
            messageM5858a = null;
        } else {
            if (!stringExtra.equals(this.f7618c.getPackageName())) {
                ALog.m6092e("ServiceImpl", "handleCommand bindapp pkg error", new Object[0]);
                return;
            }
            messageM5858a = Message.m5850a(this.f7618c, stringExtra5, stringExtra4, intent.getStringExtra("app_sercet"), stringExtra, stringExtra6, intent.getStringExtra("appVersion"));
            abstractC1745bM5969a.f7654a = stringExtra6;
            UtilityImpl.m6126e(this.f7618c, stringExtra4);
            if (abstractC1745bM5969a.m6011j().m5847d(stringExtra) && !intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                ALog.m6093i("ServiceImpl", stringExtra + " isAppBinded", new Object[0]);
                abstractC1745bM5969a.m5991a(messageM5858a, AccsErrorCode.SUCCESS);
                return;
            }
        }
        if (messageM5858a == null) {
            ALog.m6092e("ServiceImpl", "message is null", new Object[0]);
            abstractC1745bM5969a.m5991a(Message.m5859a(stringExtra, intExtra), AccsErrorCode.PARAMETER_ERROR);
        } else {
            ALog.m6090d("ServiceImpl", "try send message", new Object[0]);
            if (messageM5858a.m5882e() != null) {
                messageM5858a.m5882e().onSend();
            }
            abstractC1745bM5969a.m6002b(messageM5858a, true);
        }
    }

    /* renamed from: c */
    private void m5965c() {
        ConcurrentHashMap<String, AbstractC1745b> concurrentHashMap = AbstractC1736d.f7627a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC1745b>> it = AbstractC1736d.f7627a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().mo5999b();
        }
    }

    /* renamed from: d */
    private void m5966d() {
        ConcurrentHashMap<String, AbstractC1745b> concurrentHashMap = AbstractC1736d.f7627a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC1745b>> it = AbstractC1736d.f7627a.entrySet().iterator();
        while (it.hasNext()) {
            C1772c c1772cMo6003c = it.next().getValue().mo6003c();
            if (c1772cMo6003c != null) {
                c1772cMo6003c.f7784h = this.f7619d;
                c1772cMo6003c.m6083a();
            }
        }
    }

    /* renamed from: e */
    private void m5967e() {
        ConcurrentHashMap<String, AbstractC1745b> concurrentHashMap = AbstractC1736d.f7627a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC1745b>> it = AbstractC1736d.f7627a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().mo6006e();
        }
    }

    @Override // com.taobao.accs.internal.AbstractC1736d
    /* renamed from: a */
    public int mo5968a(Intent intent) {
        String action;
        Bundle extras;
        int i4 = 2;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m6093i("ServiceImpl", "onHostStartCommand", MessengerService.INTENT, intent);
        }
        try {
            if (ALog.isPrintLog(ALog.Level.D) && intent != null && (extras = intent.getExtras()) != null) {
                for (String str : extras.keySet()) {
                    ALog.m6090d("ServiceImpl", "onHostStartCommand", "key", str, " value", extras.get(str));
                }
            }
            int iM6146c = C1783f.m6146c();
            if (iM6146c > 3) {
                try {
                    ALog.m6092e("ServiceImpl", "onHostStartCommand load SO fail 4 times, don't auto restart", new Object[0]);
                    AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_SOFAIL, UtilityImpl.m6100a(iM6146c), 0.0d);
                } catch (Throwable th) {
                    th = th;
                    try {
                        ALog.m6091e("ServiceImpl", "onHostStartCommand", th, new Object[0]);
                        return i4;
                    } finally {
                        AdapterGlobalClientInfo.mStartServiceTimes.incrementAndGet();
                    }
                }
            } else {
                i4 = 1;
            }
            action = intent == null ? null : intent.getAction();
        } catch (Throwable th2) {
            th = th2;
            i4 = 1;
        }
        if (!TextUtils.isEmpty(action)) {
            m5960a(intent, action);
            return i4;
        }
        m5963b();
        m5962a(false, false);
        return i4;
    }

    @Override // com.taobao.accs.internal.AbstractC1736d, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.taobao.accs.internal.AbstractC1736d, com.taobao.accs.base.IBaseService
    public void onCreate() {
        super.onCreate();
        m5958a();
    }

    @Override // com.taobao.accs.internal.AbstractC1736d, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        super.onDestroy();
        ALog.m6092e("ServiceImpl", "Service onDestroy", new Object[0]);
        UtilityImpl.m6108a(this.f7618c, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        this.f7617b = null;
        this.f7618c = null;
        m5967e();
        Process.killProcess(Process.myPid());
    }

    @Override // com.taobao.accs.internal.AbstractC1736d, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* renamed from: a */
    private void m5959a(Context context) {
        List<String> listM6136m = UtilityImpl.m6136m(context);
        ArrayList arrayList = new ArrayList();
        if (listM6136m != null && listM6136m.size() > 0) {
            for (int i4 = 0; i4 < listM6136m.size(); i4++) {
                try {
                    Class<?> cls = Class.forName(listM6136m.get(i4));
                    if (IChannelInit.class.isAssignableFrom(cls)) {
                        try {
                            ((IChannelInit) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).init(context);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    } else {
                        arrayList.add(listM6136m.get(i4));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (arrayList.size() > 0) {
            UtilityImpl.m6109a(context, arrayList);
        }
    }

    /* renamed from: a */
    private void m5958a() {
        ALog.m6090d("ServiceImpl", "init start", new Object[0]);
        m5959a(this.f7618c);
        GlobalClientInfo.getInstance(this.f7618c);
        AdapterGlobalClientInfo.mStartServiceTimes.incrementAndGet();
        this.f7619d = System.currentTimeMillis();
        this.f7620e = UtilityImpl.m6128f(this.f7618c);
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m6093i("ServiceImpl", "init", Constants.KEY_SDK_VERSION, Integer.valueOf(Constants.SDK_VERSION_CODE), "procStart", Integer.valueOf(AdapterGlobalClientInfo.mStartServiceTimes.intValue()));
        }
        UTMini.getInstance().commitEvent(66001, "START", UtilityImpl.m6127f(), "PROXY");
        long jM6131h = UtilityImpl.m6131h(this.f7618c);
        ALog.m6090d("ServiceImpl", "getServiceAliveTime", "aliveTime", Long.valueOf(jM6131h));
        if (jM6131h > 20000) {
            AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_SERVICE_ALIVE, "", jM6131h / 1000);
        }
        UtilityImpl.m6108a(this.f7618c, Constants.SP_KEY_SERVICE_START, System.currentTimeMillis());
        UTMini.getInstance().commitEvent(66001, "NOTIFY", UtilityImpl.m6134k(this.f7618c));
    }

    /* renamed from: a */
    private void m5960a(Intent intent, String str) {
        ALog.m6090d("ServiceImpl", "handleAction", "action", str);
        try {
            m5963b();
            if (TextUtils.equals(str, "android.intent.action.PACKAGE_REMOVED")) {
                return;
            }
            if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                String strM6128f = UtilityImpl.m6128f(this.f7618c);
                boolean zM6130g = UtilityImpl.m6130g(this.f7618c);
                ALog.m6093i("ServiceImpl", "network change:" + this.f7620e + " to " + strM6128f, new Object[0]);
                if (zM6130g) {
                    this.f7620e = strM6128f;
                    m5965c();
                    m5962a(true, false);
                    UTMini.getInstance().commitEvent(66001, "CONNECTIVITY_CHANGE", strM6128f, UtilityImpl.m6127f(), MessageService.MSG_DB_READY_REPORT);
                }
                if (UtilityImpl.NET_TYPE_UNKNOWN.equals(strM6128f)) {
                    m5965c();
                    this.f7620e = strM6128f;
                    return;
                }
                return;
            }
            if (TextUtils.equals(str, "android.intent.action.BOOT_COMPLETED")) {
                m5962a(true, false);
                return;
            }
            if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                ALog.m6090d("ServiceImpl", "action android.intent.action.USER_PRESENT", new Object[0]);
                m5962a(true, false);
            } else if (str.equals(Constants.ACTION_COMMAND)) {
                m5964b(intent);
            }
        } catch (Throwable th) {
            ALog.m6091e("ServiceImpl", "handleAction", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private synchronized void m5963b() {
        ConcurrentHashMap<String, AbstractC1745b> concurrentHashMap = AbstractC1736d.f7627a;
        if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
            for (Map.Entry<String, AbstractC1745b> entry : AbstractC1736d.f7627a.entrySet()) {
                AbstractC1745b value = entry.getValue();
                if (value == null) {
                    ALog.m6092e("ServiceImpl", "tryConnect connection null", "appkey", value.m6010i());
                    return;
                }
                ALog.m6093i("ServiceImpl", "tryConnect", "appkey", value.m6010i(), Constants.KEY_CONFIG_TAG, entry.getKey());
                if (value.m6012k() && TextUtils.isEmpty(value.f7662i.getAppSecret())) {
                    ALog.m6092e("ServiceImpl", "tryConnect secret is null", new Object[0]);
                } else {
                    value.mo5989a();
                }
            }
            return;
        }
        ALog.m6096w("ServiceImpl", "tryConnect no connections", new Object[0]);
    }

    /* renamed from: a */
    private void m5961a(Message message, boolean z3) {
        ConcurrentHashMap<String, AbstractC1745b> concurrentHashMap = AbstractC1736d.f7627a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC1745b>> it = AbstractC1736d.f7627a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m6002b(message, z3);
        }
    }

    /* renamed from: a */
    private void m5962a(boolean z3, boolean z4) {
        ConcurrentHashMap<String, AbstractC1745b> concurrentHashMap = AbstractC1736d.f7627a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, AbstractC1745b>> it = AbstractC1736d.f7627a.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC1745b value = it.next().getValue();
            value.mo5995a(z3, z4);
            ALog.m6093i("ServiceImpl", "ping connection", "appkey", value.m6010i());
        }
    }
}
