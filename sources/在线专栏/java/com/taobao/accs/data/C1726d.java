package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.AccsState;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.flowcontrol.FlowControl;
import com.taobao.accs.net.AbstractC1745b;
import com.taobao.accs.net.C1753j;
import com.taobao.accs.p064ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p064ut.monitor.TrafficsMonitor;
import com.taobao.accs.p064ut.p065a.C1770a;
import com.taobao.accs.p064ut.p065a.C1771b;
import com.taobao.accs.p064ut.p065a.C1773d;
import com.taobao.accs.p064ut.p065a.C1774e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C1785h;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.data.d */
/* loaded from: classes.dex */
public class C1726d {

    /* renamed from: b */
    public int f7586b;

    /* renamed from: c */
    protected TrafficsMonitor f7587c;

    /* renamed from: d */
    public FlowControl f7588d;

    /* renamed from: h */
    private Context f7592h;

    /* renamed from: i */
    private C1773d f7593i;

    /* renamed from: j */
    private Message f7594j;

    /* renamed from: k */
    private AbstractC1745b f7595k;

    /* renamed from: l */
    private String f7596l;

    /* renamed from: f */
    private ConcurrentMap<Message.C1720a, Message> f7590f = new ConcurrentHashMap();

    /* renamed from: a */
    public ConcurrentMap<String, ScheduledFuture<?>> f7585a = new ConcurrentHashMap();

    /* renamed from: g */
    private boolean f7591g = false;

    /* renamed from: e */
    public String f7589e = "";

    /* renamed from: m */
    private LinkedHashMap<String, String> f7597m = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.data.MessageHandler$1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 50;
        }
    };

    /* renamed from: n */
    private Map<String, C1723a> f7598n = new HashMap();

    /* renamed from: o */
    private Runnable f7599o = new RunnableC1728f(this);

    public C1726d(Context context, AbstractC1745b abstractC1745b) throws IOException {
        String str;
        this.f7596l = "MsgRecv_";
        this.f7592h = context;
        this.f7595k = abstractC1745b;
        this.f7587c = new TrafficsMonitor(context);
        this.f7588d = new FlowControl(this.f7592h);
        if (abstractC1745b == null) {
            str = this.f7596l;
        } else {
            str = this.f7596l + abstractC1745b.f7666m;
        }
        this.f7596l = str;
        m5913i();
        m5933h();
    }

    /* renamed from: b */
    private boolean m5909b(ErrorCode errorCode) {
        return errorCode.getCodeInt() == AccsErrorCode.SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.REQ_TIME_OUT.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.SPDY_CON_DISCONNECTED.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.INAPP_CON_DISCONNECTED.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.SPDY_PING_TIME_OUT.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NO_NETWORK.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORKSDK_SPDY_CLOSE_ERROR.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_TIMEOUT.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_CONNECT_FAIL.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_NO_STRATEGY.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_EXCEPTION.getCodeInt();
    }

    /* renamed from: i */
    private void m5913i() throws IOException {
        try {
            File file = new File(this.f7592h.getDir(Constants.SHARED_FOLDER, 0), Constants.SHARED_MESSAGE_ID_FILE + this.f7595k.m6010i());
            if (!file.exists()) {
                ALog.m6090d(this.f7596l, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                this.f7597m.put(line, line);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m5914j() throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f7592h.getDir(Constants.SHARED_FOLDER, 0), Constants.SHARED_MESSAGE_ID_FILE + this.f7595k.m6010i()));
            fileWriter.write("");
            Iterator<String> it = this.f7597m.keySet().iterator();
            while (it.hasNext()) {
                fileWriter.append((CharSequence) it.next()).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m5923a(byte[] bArr) throws IOException {
        m5924a(bArr, (String) null);
    }

    /* renamed from: c */
    public boolean m5928c() {
        return this.f7591g;
    }

    /* renamed from: d */
    public int m5929d() {
        return this.f7590f.size();
    }

    /* renamed from: e */
    public Collection<Message> m5930e() {
        return this.f7590f.values();
    }

    /* renamed from: f */
    public Set<Message.C1720a> m5931f() {
        return this.f7590f.keySet();
    }

    /* renamed from: g */
    public C1773d m5932g() {
        return this.f7593i;
    }

    /* renamed from: h */
    public void m5933h() {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(this.f7599o);
        } catch (Throwable th) {
            ALog.m6091e(this.f7596l, "restoreTraffics", th, new Object[0]);
        }
    }

    /* renamed from: c */
    private boolean m5911c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f7597m.containsKey(str);
    }

    /* renamed from: d */
    private void m5912d(String str) throws IOException {
        if (TextUtils.isEmpty(str) || this.f7597m.containsKey(str)) {
            return;
        }
        this.f7597m.put(str, str);
        m5914j();
    }

    /* renamed from: a */
    public void m5924a(byte[] bArr, String str) throws IOException {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m6093i(this.f7596l, "onMessage", Constants.KEY_HOST, str);
        }
        C1785h c1785h = new C1785h(bArr);
        try {
            int iM6149a = c1785h.m6149a();
            int i4 = (iM6149a & 240) >> 4;
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(this.f7596l, "version:" + i4, new Object[0]);
            }
            int i5 = iM6149a & 15;
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(this.f7596l, "compress:" + i5, new Object[0]);
            }
            c1785h.m6149a();
            int iM6151b = c1785h.m6151b();
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(this.f7596l, "totalLen:" + iM6151b, new Object[0]);
            }
            int i6 = 0;
            while (i6 < iM6151b) {
                int iM6151b2 = c1785h.m6151b();
                int i7 = i6 + 2;
                if (iM6151b2 <= 0) {
                    throw new IOException("data format error");
                }
                byte[] bArr2 = new byte[iM6151b2];
                c1785h.read(bArr2);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m6090d(this.f7596l, "buf len:" + iM6151b2, new Object[0]);
                }
                i6 = i7 + iM6151b2;
                m5901a(i5, bArr2, str, i4);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    private Intent m5910c(Message message) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.f7563s);
        intent.putExtra("command", message.f7564t);
        intent.putExtra(Constants.KEY_SERVICE_ID, message.f7529H);
        intent.putExtra(Constants.KEY_USER_ID, message.f7528G);
        Integer num = message.f7564t;
        if (num != null && num.intValue() == 100) {
            intent.putExtra(Constants.KEY_DATA_ID, message.f7536O);
        }
        return intent;
    }

    /* renamed from: b */
    public void m5926b() {
        ALog.m6090d(this.f7596l, "onRcvPing", new Object[0]);
        synchronized (C1726d.class) {
            this.f7591g = false;
        }
    }

    /* renamed from: b */
    public void m5927b(Message message) {
        if (this.f7590f.keySet().size() > 0) {
            Iterator<Message.C1720a> it = this.f7590f.keySet().iterator();
            while (it.hasNext()) {
                Message message2 = this.f7590f.get(it.next());
                if (message2 != null && message2.f7564t != null && message2.m5883f().equals(message.m5883f())) {
                    switch (message.f7564t.intValue()) {
                        case 1:
                        case 2:
                            if (message2.f7564t.intValue() == 1 || message2.f7564t.intValue() == 2) {
                                message2.f7549e = true;
                                break;
                            }
                            break;
                        case 3:
                        case 4:
                            if (message2.f7564t.intValue() == 3 || message2.f7564t.intValue() == 4) {
                                message2.f7549e = true;
                                break;
                            }
                            break;
                        case 5:
                        case 6:
                            if (message2.f7564t.intValue() == 5 || message2.f7564t.intValue() == 6) {
                                message2.f7549e = true;
                                break;
                            }
                            break;
                    }
                }
                if (message2 != null && message2.f7549e) {
                    ALog.m6092e(this.f7596l, "cancelControlMessage", "command", message2.f7564t);
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: a */
    private void m5901a(int r46, byte[] r47, java.lang.String r48, int r49) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C1726d.m5901a(int, byte[], java.lang.String, int):void");
    }

    /* renamed from: b */
    public Message m5925b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f7590f.remove(new Message.C1720a(0, str));
    }

    /* renamed from: b */
    private void m5908b(Message message, ErrorCode errorCode) {
        if (message == null) {
            return;
        }
        String deviceId = UtilityImpl.getDeviceId(this.f7592h);
        String str = System.currentTimeMillis() + "";
        boolean z3 = errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt();
        int iIntValue = message.f7564t.intValue();
        if (iIntValue == 1) {
            C1770a c1770a = new C1770a();
            c1770a.f7766a = deviceId;
            c1770a.f7767b = str;
            c1770a.f7768c = z3;
            c1770a.m6077a(errorCode);
            c1770a.m6076a();
            return;
        }
        if (iIntValue != 3) {
            return;
        }
        C1771b c1771b = new C1771b();
        c1771b.f7771a = deviceId;
        c1771b.f7772b = str;
        c1771b.f7773c = z3;
        c1771b.f7775e = message.f7528G;
        c1771b.m6081a(errorCode);
        c1771b.m6080a();
    }

    /* renamed from: a */
    private byte[] m5906a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i4 = gZIPInputStream.read(bArr);
                    if (i4 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e4) {
                ALog.m6092e(this.f7596l, "uncompress data error " + e4.toString(), new Object[0]);
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f7586b + " uncompress data error " + e4.toString());
                try {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return null;
            }
        } finally {
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private void m5903a(Message message, byte[] bArr, byte[] bArr2, String str) {
        ErrorCode errorCode;
        JSONObject jSONObject;
        ErrorCode httpCode;
        JSONArray jSONArrayOptJSONArray;
        ErrorCode errorCode2 = AccsErrorCode.SUCCESS;
        try {
            try {
                jSONObject = new JSONObject(new String(bArr));
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m6090d(this.f7596l, "handleControlMessage parse", "json", jSONObject.toString());
                }
                httpCode = message.f7564t.intValue() == 100 ? errorCode2 : AccsErrorCode.parseHttpCode(jSONObject.getInt(Constants.KEY_HTTP_CODE));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (httpCode.getCodeInt() == errorCode2.getCodeInt()) {
                int iIntValue = message.f7564t.intValue();
                if (iIntValue == 1) {
                    AccsState.getInstance().m5816a(this.f7595k.f7666m, AccsState.BIND_APP_FROM_CACHE, Boolean.FALSE);
                    UtilityImpl.saveUtdid(Constants.SP_FILE_NAME, this.f7592h);
                    try {
                        this.f7595k.m6011j().m5844a(this.f7592h.getPackageName());
                        JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.KEY_DATA);
                        this.f7589e = JsonUtility.getString(jSONObject2, Constants.KEY_DEVICE_TOKEN, null);
                        if (jSONObject2 != null && (jSONArrayOptJSONArray = jSONObject2.optJSONArray(Constants.KEY_PACKAGE_NAMES)) != null) {
                            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                                String string = jSONArrayOptJSONArray.getString(i4);
                                if (UtilityImpl.m6120c(this.f7592h, string)) {
                                    this.f7595k.m6011j().m5844a(message.f7563s);
                                } else {
                                    ALog.m6093i(this.f7596l, "unbind app", "pkg", string);
                                    AbstractC1745b abstractC1745b = this.f7595k;
                                    abstractC1745b.m6002b(Message.m5856a(abstractC1745b, string), true);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        ALog.m6093i(this.f7596l, "no token/invalid app", th3);
                    }
                } else if (iIntValue != 2) {
                    if (iIntValue == 100 && (this.f7595k instanceof C1753j) && !message.f7558n.equals(Constants.TARGET_SERVICE_ST)) {
                        ((C1753j) this.f7595k).m6043a(jSONObject);
                    }
                } else {
                    this.f7595k.m6011j().m5845b(message.f7563s);
                }
            } else if (httpCode.getCodeInt() == AccsErrorCode.APP_NOT_BIND.getCodeInt()) {
                this.f7595k.m6011j().m5845b(message.f7563s);
            }
            if (httpCode.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
                ALog.m6092e(this.f7596l, "handleControlMessage parse", "json", jSONObject.toString());
            }
            errorCode = httpCode;
        } catch (Throwable th4) {
            th = th4;
            errorCode2 = httpCode;
            ALog.m6091e(this.f7596l, "handleControlMessage", th, new Object[0]);
            AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.f7586b + th.toString());
            errorCode = errorCode2;
            m5920a(message, errorCode, null, bArr, null);
            m5922a(new TrafficsMonitor.C1776a(message.f7529H, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
        }
        m5920a(message, errorCode, null, bArr, null);
        m5922a(new TrafficsMonitor.C1776a(message.f7529H, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
    }

    /* renamed from: a */
    private Map<Integer, String> m5900a(C1785h c1785h) {
        HashMap map = null;
        if (c1785h == null) {
            return null;
        }
        try {
            int iM6151b = c1785h.m6151b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m6090d(this.f7596l, "extHeaderLen:" + iM6151b, new Object[0]);
            }
            int i4 = 0;
            while (i4 < iM6151b) {
                int iM6151b2 = c1785h.m6151b();
                int i5 = (64512 & iM6151b2) >> 10;
                int i6 = iM6151b2 & Message.EXT_HEADER_VALUE_MAX_LEN;
                String strM6150a = c1785h.m6150a(i6);
                i4 = i4 + 2 + i6;
                if (map == null) {
                    map = new HashMap();
                }
                map.put(Integer.valueOf(i5), strM6150a);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m6090d(this.f7596l, "", "extHeaderType", Integer.valueOf(i5), "value", strM6150a);
                }
            }
        } catch (Exception e4) {
            ALog.m6091e(this.f7596l, "parseExtHeader", e4, new Object[0]);
        }
        return map;
    }

    /* renamed from: a */
    public void m5919a(Message message, ErrorCode errorCode) {
        m5920a(message, errorCode, null, null, null);
    }

    /* renamed from: a */
    public void m5921a(Message message, ErrorCode errorCode, Map<Integer, String> map) {
        m5920a(message, errorCode, null, null, map);
    }

    /* renamed from: a */
    public void m5920a(Message message, ErrorCode errorCode, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        ErrorCode errorCode2;
        byte[] bArr2;
        Map<Integer, String> map2;
        Message.ReqType reqType2;
        if (message.f7564t != null && message.m5875a() >= 0 && message.m5875a() != 2) {
            String str = message.f7536O;
            if (str != null) {
                this.f7585a.remove(str);
            }
            int iM5949a = this.f7588d.m5949a(map, message.f7529H);
            if (iM5949a != 0) {
                if (iM5949a == 2) {
                    errorCode2 = AccsErrorCode.SERVIER_HIGH_LIMIT;
                } else if (iM5949a == 3) {
                    errorCode2 = AccsErrorCode.SERVIER_HIGH_LIMIT_BRUSH;
                } else {
                    errorCode2 = AccsErrorCode.SERVIER_LOW_LIMIT;
                }
                reqType2 = null;
                bArr2 = null;
                map2 = null;
            } else {
                errorCode2 = errorCode;
                bArr2 = bArr;
                map2 = map;
                reqType2 = reqType;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m6090d(this.f7596l, "onResult", "command", message.f7564t, "erorcode", errorCode2);
            }
            if (message.f7564t.intValue() == 102) {
                return;
            }
            if ((message.f7564t.intValue() == 1 && errorCode2.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) || errorCode2.getCodeInt() == AccsErrorCode.APP_NOT_BIND.getCodeInt()) {
                this.f7595k.m6011j().m5845b(message.f7563s);
            }
            if (!message.f7549e) {
                if (m5909b(errorCode2) && message.f7564t.intValue() != 100 && message.f7539R <= Message.f7520a) {
                    message.f7541T = System.currentTimeMillis();
                    int i4 = message.f7539R + 1;
                    message.f7539R = i4;
                    ALog.m6090d(this.f7596l, "onResult", "retryTimes", Integer.valueOf(i4));
                    this.f7595k.m6002b(message, true);
                } else {
                    Intent intentM5910c = m5910c(message);
                    intentM5910c.putExtra(Constants.KEY_ERROR_OBJ, errorCode2);
                    Message.ReqType reqTypeValueOf = Message.ReqType.valueOf(3 & (message.f7555k >> 13));
                    if (reqType2 == Message.ReqType.RES || reqTypeValueOf == Message.ReqType.REQ) {
                        intentM5910c.putExtra(Constants.KEY_SEND_TYPE, Constants.SEND_TYPE_RES);
                    }
                    if (errorCode2.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
                        intentM5910c.putExtra(Constants.KEY_DATA, bArr2);
                    }
                    intentM5910c.putExtra(Constants.KEY_APP_KEY, this.f7595k.f7655b);
                    intentM5910c.putExtra(Constants.KEY_CONFIG_TAG, this.f7595k.f7666m);
                    m5905a(map2, intentM5910c);
                    C1729g.m5936a(this.f7592h, this.f7595k, intentM5910c);
                    if (!TextUtils.isEmpty(message.f7529H)) {
                        UTMini.getInstance().commitEvent(66001, "MsgToBuss0", "commandId=" + message.f7564t, "serviceId=" + message.f7529H + " errorCode=" + errorCode2 + " dataId=" + message.f7561q, Integer.valueOf(Constants.SDK_VERSION_CODE));
                        StringBuilder sb = new StringBuilder();
                        sb.append("1commandId=");
                        sb.append(message.f7564t);
                        sb.append("serviceId=");
                        sb.append(message.f7529H);
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb.toString(), 0.0d);
                    }
                }
            } else {
                ALog.m6092e(this.f7596l, "onResult message is cancel", "command", message.f7564t);
            }
            NetPerformanceMonitor netPerformanceMonitorM5882e = message.m5882e();
            if (netPerformanceMonitorM5882e != null) {
                netPerformanceMonitorM5882e.onToBizDate();
                URL url = message.f7550f;
                String string = url == null ? null : url.toString();
                if (errorCode2.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
                    netPerformanceMonitorM5882e.setRet(true);
                    if (message.f7539R > 0) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", 0.0d);
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.f7539R, 0.0d);
                    } else {
                        AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_REQUEST, string);
                    }
                } else {
                    if (message.f7539R > 0) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + errorCode2, 0.0d);
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "fail", 0.0d);
                    } else if (errorCode2.getCodeInt() != AccsErrorCode.NO_NETWORK.getCodeInt()) {
                        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQUEST, string, UtilityImpl.m6100a(errorCode2.getCodeInt()), this.f7586b + message.f7529H + message.f7540S);
                    }
                    netPerformanceMonitorM5882e.setRet(false);
                    netPerformanceMonitorM5882e.setFailReason(errorCode2);
                }
                AppMonitor.getInstance().commitStat(message.m5882e());
            }
            m5908b(message, errorCode2);
            return;
        }
        ALog.m6090d(this.f7596l, "onError, skip ping/ack", new Object[0]);
    }

    /* renamed from: a */
    public void m5916a() {
        ALog.m6090d(this.f7596l, "onSendPing", new Object[0]);
        synchronized (C1726d.class) {
            this.f7591g = true;
        }
    }

    /* renamed from: a */
    public void m5918a(Message message) {
        String str;
        Log.d("ACCS_TEST", "MessageHandler onSend");
        Message message2 = this.f7594j;
        if (message2 != null && (str = message.f7536O) != null && message.f7529H != null && message2.f7536O.equals(str) && this.f7594j.f7529H.equals(message.f7529H)) {
            UTMini.getInstance().commitEvent(66001, "SEND_REPEAT", message.f7529H, message.f7536O, Long.valueOf(Thread.currentThread().getId()));
        }
        if (message.m5875a() == -1 || message.m5875a() == 2 || message.f7547c) {
            return;
        }
        this.f7590f.put(message.m5881d(), message);
    }

    /* renamed from: a */
    public void m5917a(ErrorCode errorCode) {
        this.f7591g = false;
        Message.C1720a[] c1720aArr = (Message.C1720a[]) this.f7590f.keySet().toArray(new Message.C1720a[0]);
        if (c1720aArr.length > 0) {
            ALog.m6090d(this.f7596l, "onNetworkFail", new Object[0]);
            for (Message.C1720a c1720a : c1720aArr) {
                Message messageRemove = this.f7590f.remove(c1720a);
                if (messageRemove != null) {
                    m5919a(messageRemove, errorCode);
                }
            }
        }
    }

    /* renamed from: a */
    public Message m5915a(String str) {
        return this.f7590f.get(new Message.C1720a(0, str));
    }

    /* renamed from: a */
    private byte[] m5907a(String str, Map<Integer, String> map, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int i4 = Integer.parseInt(map.get(17));
                    int i5 = Integer.parseInt(map.get(16));
                    if (i5 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    }
                    if (i4 >= 0 && i4 < i5) {
                        String str2 = map.get(18);
                        long j4 = 0;
                        try {
                            String str3 = map.get(15);
                            if (!TextUtils.isEmpty(str3)) {
                                j4 = Long.parseLong(str3);
                            }
                        } catch (Throwable th) {
                            ALog.m6095w(this.f7596l, "putBurstMessage", th, new Object[0]);
                        }
                        C1723a c1723a = this.f7598n.get(str);
                        if (c1723a == null) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.m6093i(this.f7596l, "putBurstMessage", Constants.KEY_DATA_ID, str, "burstLength", Integer.valueOf(i5));
                            }
                            c1723a = new C1723a(str, i5, str2);
                            c1723a.m5897a(j4);
                            this.f7598n.put(str, c1723a);
                        }
                        return c1723a.m5898a(i4, i5, bArr);
                    }
                    throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", Integer.valueOf(i5), Integer.valueOf(i4)));
                }
            } catch (Throwable th2) {
                ALog.m6095w(this.f7596l, "putBurstMessage", th2, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    /* renamed from: a */
    private void m5905a(Map<Integer, String> map, Intent intent) {
        if (map == null || intent == null) {
            return;
        }
        intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
    }

    /* renamed from: a */
    private void m5902a(Intent intent, String str, String str2, short s3) {
        if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra(Constants.KEY_TARGET, str2);
            }
            intent.putExtra(Constants.KEY_FLAGS, s3);
        }
    }

    /* renamed from: a */
    private void m5904a(String str, String str2) {
        C1774e c1774e = new C1774e();
        c1774e.f7798a = UtilityImpl.getDeviceId(this.f7592h);
        c1774e.f7800c = str;
        c1774e.f7801d = "" + System.currentTimeMillis();
        c1774e.f7803f = "";
        c1774e.f7802e = str2;
        c1774e.f7799b = "";
        c1774e.m6085a();
    }

    /* renamed from: a */
    public void m5922a(TrafficsMonitor.C1776a c1776a) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC1727e(this, c1776a));
        } catch (Throwable th) {
            ALog.m6091e(this.f7596l, "addTrafficsInfo", th, new Object[0]);
        }
    }
}
