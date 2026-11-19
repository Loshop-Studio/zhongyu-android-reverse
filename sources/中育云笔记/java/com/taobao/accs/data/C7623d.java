package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.video.AudioStats;
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
import com.taobao.accs.net.AbstractC7642b;
import com.taobao.accs.net.C7650j;
import com.taobao.accs.p085ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p085ut.monitor.TrafficsMonitor;
import com.taobao.accs.p085ut.p086a.C7667a;
import com.taobao.accs.p085ut.p086a.C7668b;
import com.taobao.accs.p085ut.p086a.C7670d;
import com.taobao.accs.p085ut.p086a.C7671e;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AppMonitorAdapter;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C7682h;
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
/* loaded from: classes5.dex */
public class C7623d {

    /* renamed from: b */
    public int f12984b;

    /* renamed from: c */
    protected TrafficsMonitor f12985c;

    /* renamed from: d */
    public FlowControl f12986d;

    /* renamed from: h */
    private Context f12990h;

    /* renamed from: i */
    private C7670d f12991i;

    /* renamed from: j */
    private Message f12992j;

    /* renamed from: k */
    private AbstractC7642b f12993k;

    /* renamed from: l */
    private String f12994l;

    /* renamed from: f */
    private ConcurrentMap<Message.C7617a, Message> f12988f = new ConcurrentHashMap();

    /* renamed from: a */
    public ConcurrentMap<String, ScheduledFuture<?>> f12983a = new ConcurrentHashMap();

    /* renamed from: g */
    private boolean f12989g = false;

    /* renamed from: e */
    public String f12987e = "";

    /* renamed from: m */
    private LinkedHashMap<String, String> f12995m = new LinkedHashMap<String, String>() { // from class: com.taobao.accs.data.MessageHandler$1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 50;
        }
    };

    /* renamed from: n */
    private Map<String, C7620a> f12996n = new HashMap();

    /* renamed from: o */
    private Runnable f12997o = new RunnableC7625f(this);

    public C7623d(Context context, AbstractC7642b abstractC7642b) throws IOException {
        String str;
        this.f12994l = "MsgRecv_";
        this.f12990h = context;
        this.f12993k = abstractC7642b;
        this.f12985c = new TrafficsMonitor(context);
        this.f12986d = new FlowControl(this.f12990h);
        if (abstractC7642b == null) {
            str = this.f12994l;
        } else {
            str = this.f12994l + abstractC7642b.f13064m;
        }
        this.f12994l = str;
        m9939i();
        m9959h();
    }

    /* renamed from: b */
    private boolean m9935b(ErrorCode errorCode) {
        return errorCode.getCodeInt() == AccsErrorCode.SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.REQ_TIME_OUT.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.SPDY_CON_DISCONNECTED.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.INAPP_CON_DISCONNECTED.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.SPDY_PING_TIME_OUT.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NO_NETWORK.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORKSDK_SPDY_CLOSE_ERROR.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_TIMEOUT.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_CONNECT_FAIL.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_NO_STRATEGY.getCodeInt() || errorCode.getCodeInt() == AccsErrorCode.NETWORK_INAPP_EXCEPTION.getCodeInt();
    }

    /* renamed from: i */
    private void m9939i() throws IOException {
        try {
            File file = new File(this.f12990h.getDir(Constants.SHARED_FOLDER, 0), "message" + this.f12993k.m10036i());
            if (!file.exists()) {
                ALog.m10116d(this.f12994l, "message file not exist", new Object[0]);
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return;
                }
                this.f12995m.put(line, line);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m9940j() throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(new File(this.f12990h.getDir(Constants.SHARED_FOLDER, 0), "message" + this.f12993k.m10036i()));
            fileWriter.write("");
            Iterator<String> it = this.f12995m.keySet().iterator();
            while (it.hasNext()) {
                fileWriter.append((CharSequence) it.next()).append((CharSequence) "\r\n");
            }
            fileWriter.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m9949a(byte[] bArr) throws IOException {
        m9950a(bArr, (String) null);
    }

    /* renamed from: c */
    public boolean m9954c() {
        return this.f12989g;
    }

    /* renamed from: d */
    public int m9955d() {
        return this.f12988f.size();
    }

    /* renamed from: e */
    public Collection<Message> m9956e() {
        return this.f12988f.values();
    }

    /* renamed from: f */
    public Set<Message.C7617a> m9957f() {
        return this.f12988f.keySet();
    }

    /* renamed from: g */
    public C7670d m9958g() {
        return this.f12991i;
    }

    /* renamed from: h */
    public void m9959h() {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(this.f12997o);
        } catch (Throwable th) {
            ALog.m10117e(this.f12994l, "restoreTraffics", th, new Object[0]);
        }
    }

    /* renamed from: c */
    private boolean m9937c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f12995m.containsKey(str);
    }

    /* renamed from: d */
    private void m9938d(String str) throws IOException {
        if (TextUtils.isEmpty(str) || this.f12995m.containsKey(str)) {
            return;
        }
        this.f12995m.put(str, str);
        m9940j();
    }

    /* renamed from: a */
    public void m9950a(byte[] bArr, String str) throws IOException {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m10119i(this.f12994l, "onMessage", Constants.KEY_HOST, str);
        }
        C7682h c7682h = new C7682h(bArr);
        try {
            int iM10175a = c7682h.m10175a();
            int i10 = (iM10175a & 240) >> 4;
            ALog.Level level = ALog.Level.D;
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(this.f12994l, "version:" + i10, new Object[0]);
            }
            int i11 = iM10175a & 15;
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(this.f12994l, "compress:" + i11, new Object[0]);
            }
            c7682h.m10175a();
            int iM10177b = c7682h.m10177b();
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(this.f12994l, "totalLen:" + iM10177b, new Object[0]);
            }
            int i12 = 0;
            while (i12 < iM10177b) {
                int iM10177b2 = c7682h.m10177b();
                int i13 = i12 + 2;
                if (iM10177b2 <= 0) {
                    throw new IOException("data format error");
                }
                byte[] bArr2 = new byte[iM10177b2];
                c7682h.read(bArr2);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m10116d(this.f12994l, "buf len:" + iM10177b2, new Object[0]);
                }
                i12 = i13 + iM10177b2;
                m9927a(i11, bArr2, str, i10);
            }
        } catch (Throwable th) {
            try {
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f12984b + th.toString());
                ALog.m10117e(this.f12994l, "", th, new Object[0]);
            } finally {
                c7682h.close();
            }
        }
    }

    /* renamed from: c */
    private Intent m9936c(Message message) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(message.f12961s);
        intent.putExtra("command", message.f12962t);
        intent.putExtra(Constants.KEY_SERVICE_ID, message.f12927H);
        intent.putExtra(Constants.KEY_USER_ID, message.f12926G);
        Integer num = message.f12962t;
        if (num != null && num.intValue() == 100) {
            intent.putExtra(Constants.KEY_DATA_ID, message.f12934O);
        }
        return intent;
    }

    /* renamed from: b */
    public void m9952b() {
        ALog.m10116d(this.f12994l, "onRcvPing", new Object[0]);
        synchronized (C7623d.class) {
            this.f12989g = false;
        }
    }

    /* renamed from: b */
    public void m9953b(Message message) {
        if (this.f12988f.keySet().size() > 0) {
            Iterator<Message.C7617a> it = this.f12988f.keySet().iterator();
            while (it.hasNext()) {
                Message message2 = this.f12988f.get(it.next());
                if (message2 != null && message2.f12962t != null && message2.m9909f().equals(message.m9909f())) {
                    switch (message.f12962t.intValue()) {
                        case 1:
                        case 2:
                            if (message2.f12962t.intValue() == 1 || message2.f12962t.intValue() == 2) {
                                message2.f12947e = true;
                                break;
                            }
                            break;
                        case 3:
                        case 4:
                            if (message2.f12962t.intValue() == 3 || message2.f12962t.intValue() == 4) {
                                message2.f12947e = true;
                                break;
                            }
                            break;
                        case 5:
                        case 6:
                            if (message2.f12962t.intValue() == 5 || message2.f12962t.intValue() == 6) {
                                message2.f12947e = true;
                                break;
                            }
                            break;
                    }
                }
                if (message2 != null && message2.f12947e) {
                    ALog.m10118e(this.f12994l, "cancelControlMessage", "command", message2.f12962t);
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
    private void m9927a(int r39, byte[] r40, java.lang.String r41, int r42) {
        /*
            Method dump skipped, instructions count: 1895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C7623d.m9927a(int, byte[], java.lang.String, int):void");
    }

    /* renamed from: b */
    public Message m9951b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12988f.remove(new Message.C7617a(0, str));
    }

    /* renamed from: b */
    private void m9934b(Message message, ErrorCode errorCode) {
        if (message == null) {
            return;
        }
        String deviceId = UtilityImpl.getDeviceId(this.f12990h);
        String str = System.currentTimeMillis() + "";
        boolean z10 = errorCode.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt();
        int iIntValue = message.f12962t.intValue();
        if (iIntValue == 1) {
            C7667a c7667a = new C7667a();
            c7667a.f13164a = deviceId;
            c7667a.f13165b = str;
            c7667a.f13166c = z10;
            c7667a.m10103a(errorCode);
            c7667a.m10102a();
            return;
        }
        if (iIntValue != 3) {
            return;
        }
        C7668b c7668b = new C7668b();
        c7668b.f13169a = deviceId;
        c7668b.f13170b = str;
        c7668b.f13171c = z10;
        c7668b.f13173e = message.f12926G;
        c7668b.m10107a(errorCode);
        c7668b.m10106a();
    }

    /* renamed from: a */
    private byte[] m9932a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return byteArray;
            } catch (Exception e10) {
                ALog.m10118e(this.f12994l, "uncompress data error " + e10.toString(), new Object[0]);
                AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", this.f12984b + " uncompress data error " + e10.toString());
                try {
                    gZIPInputStream.close();
                    byteArrayOutputStream.close();
                } catch (Exception unused2) {
                }
                return null;
            }
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m9929a(Message message, byte[] bArr, byte[] bArr2, String str) {
        byte[] bArr3;
        ErrorCode errorCode;
        JSONArray jSONArrayOptJSONArray;
        ErrorCode errorCode2 = AccsErrorCode.SUCCESS;
        try {
            bArr3 = bArr;
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr3));
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m10116d(this.f12994l, "handleControlMessage parse", "json", jSONObject.toString());
                }
                ErrorCode httpCode = message.f12962t.intValue() == 100 ? errorCode2 : AccsErrorCode.parseHttpCode(jSONObject.getInt(Constants.KEY_HTTP_CODE));
                try {
                    if (httpCode.getCodeInt() == errorCode2.getCodeInt()) {
                        int iIntValue = message.f12962t.intValue();
                        if (iIntValue == 1) {
                            AccsState.getInstance().m9842a(this.f12993k.f13064m, AccsState.BIND_APP_FROM_CACHE, Boolean.FALSE);
                            UtilityImpl.saveUtdid(Constants.SP_FILE_NAME, this.f12990h);
                            try {
                                this.f12993k.m10037j().m9870a(this.f12990h.getPackageName());
                                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                                this.f12987e = JsonUtility.getString(jSONObject2, Constants.KEY_DEVICE_TOKEN, null);
                                if (jSONObject2 != null && (jSONArrayOptJSONArray = jSONObject2.optJSONArray(Constants.KEY_PACKAGE_NAMES)) != null) {
                                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                        String string = jSONArrayOptJSONArray.getString(i10);
                                        if (UtilityImpl.m10146c(this.f12990h, string)) {
                                            this.f12993k.m10037j().m9870a(message.f12961s);
                                        } else {
                                            ALog.m10119i(this.f12994l, "unbind app", "pkg", string);
                                            AbstractC7642b abstractC7642b = this.f12993k;
                                            abstractC7642b.m10028b(Message.m9882a(abstractC7642b, string), true);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                ALog.m10119i(this.f12994l, "no token/invalid app", th);
                            }
                        } else if (iIntValue != 2) {
                            if (iIntValue == 100 && (this.f12993k instanceof C7650j) && !message.f12956n.equals(Constants.TARGET_SERVICE_ST)) {
                                ((C7650j) this.f12993k).m10069a(jSONObject);
                            }
                        } else {
                            this.f12993k.m10037j().m9871b(message.f12961s);
                        }
                    } else if (httpCode.getCodeInt() == AccsErrorCode.APP_NOT_BIND.getCodeInt()) {
                        this.f12993k.m10037j().m9871b(message.f12961s);
                    }
                    if (httpCode.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) {
                        ALog.m10118e(this.f12994l, "handleControlMessage parse", "json", jSONObject.toString());
                    }
                    errorCode = httpCode;
                } catch (Throwable th2) {
                    th = th2;
                    errorCode2 = httpCode;
                    ALog.m10117e(this.f12994l, "handleControlMessage", th, new Object[0]);
                    AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "handleControlMessage", "", this.f12984b + th.toString());
                    errorCode = errorCode2;
                    m9946a(message, errorCode, null, bArr3, null);
                    m9948a(new TrafficsMonitor.C7673a(message.f12927H, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            bArr3 = bArr;
        }
        m9946a(message, errorCode, null, bArr3, null);
        m9948a(new TrafficsMonitor.C7673a(message.f12927H, GlobalAppRuntimeInfo.isAppBackground(), str, bArr2.length));
    }

    /* renamed from: a */
    private Map<Integer, String> m9926a(C7682h c7682h) {
        HashMap map = null;
        if (c7682h == null) {
            return null;
        }
        try {
            int iM10177b = c7682h.m10177b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10116d(this.f12994l, "extHeaderLen:" + iM10177b, new Object[0]);
            }
            int i10 = 0;
            while (i10 < iM10177b) {
                int iM10177b2 = c7682h.m10177b();
                int i11 = (64512 & iM10177b2) >> 10;
                int i12 = iM10177b2 & Message.EXT_HEADER_VALUE_MAX_LEN;
                String strM10176a = c7682h.m10176a(i12);
                i10 = i10 + 2 + i12;
                if (map == null) {
                    map = new HashMap();
                }
                map.put(Integer.valueOf(i11), strM10176a);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m10116d(this.f12994l, "", "extHeaderType", Integer.valueOf(i11), "value", strM10176a);
                }
            }
            return map;
        } catch (Exception e10) {
            ALog.m10117e(this.f12994l, "parseExtHeader", e10, new Object[0]);
            return map;
        }
    }

    /* renamed from: a */
    public void m9945a(Message message, ErrorCode errorCode) {
        m9946a(message, errorCode, null, null, null);
    }

    /* renamed from: a */
    public void m9947a(Message message, ErrorCode errorCode, Map<Integer, String> map) {
        m9946a(message, errorCode, null, null, map);
    }

    /* renamed from: a */
    public void m9946a(Message message, ErrorCode errorCode, Message.ReqType reqType, byte[] bArr, Map<Integer, String> map) {
        ErrorCode errorCode2;
        Message.ReqType reqType2;
        Map<Integer, String> map2;
        byte[] bArr2;
        if (message.f12962t != null && message.m9901a() >= 0 && message.m9901a() != 2) {
            String str = message.f12934O;
            if (str != null) {
                this.f12983a.remove(str);
            }
            int iM9975a = this.f12986d.m9975a(map, message.f12927H);
            if (iM9975a != 0) {
                if (iM9975a == 2) {
                    errorCode2 = AccsErrorCode.SERVIER_HIGH_LIMIT;
                } else if (iM9975a == 3) {
                    errorCode2 = AccsErrorCode.SERVIER_HIGH_LIMIT_BRUSH;
                } else {
                    errorCode2 = AccsErrorCode.SERVIER_LOW_LIMIT;
                }
                reqType2 = null;
                bArr2 = null;
                map2 = null;
            } else {
                errorCode2 = errorCode;
                reqType2 = reqType;
                map2 = map;
                bArr2 = bArr;
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10116d(this.f12994l, "onResult", "command", message.f12962t, "erorcode", errorCode2);
            }
            if (message.f12962t.intValue() == 102) {
                return;
            }
            if ((message.f12962t.intValue() == 1 && errorCode2.getCodeInt() != AccsErrorCode.SUCCESS.getCodeInt()) || errorCode2.getCodeInt() == AccsErrorCode.APP_NOT_BIND.getCodeInt()) {
                this.f12993k.m10037j().m9871b(message.f12961s);
            }
            if (!message.f12947e) {
                if (m9935b(errorCode2) && message.f12962t.intValue() != 100 && message.f12937R <= Message.f12918a) {
                    message.f12939T = System.currentTimeMillis();
                    int i10 = message.f12937R + 1;
                    message.f12937R = i10;
                    ALog.m10116d(this.f12994l, "onResult", "retryTimes", Integer.valueOf(i10));
                    this.f12993k.m10028b(message, true);
                } else {
                    Intent intentM9936c = m9936c(message);
                    intentM9936c.putExtra(Constants.KEY_ERROR_OBJ, errorCode2);
                    Message.ReqType reqTypeValueOf = Message.ReqType.valueOf(3 & (message.f12953k >> 13));
                    if (reqType2 == Message.ReqType.RES || reqTypeValueOf == Message.ReqType.REQ) {
                        intentM9936c.putExtra(Constants.KEY_SEND_TYPE, Constants.SEND_TYPE_RES);
                    }
                    if (errorCode2.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
                        intentM9936c.putExtra("data", bArr2);
                    }
                    intentM9936c.putExtra(Constants.KEY_APP_KEY, this.f12993k.f13053b);
                    intentM9936c.putExtra(Constants.KEY_CONFIG_TAG, this.f12993k.f13064m);
                    m9931a(map2, intentM9936c);
                    C7626g.m9962a(this.f12990h, this.f12993k, intentM9936c);
                    if (!TextUtils.isEmpty(message.f12927H)) {
                        UTMini.getInstance().commitEvent(66001, "MsgToBuss0", "commandId=" + message.f12962t, "serviceId=" + message.f12927H + " errorCode=" + errorCode2 + " dataId=" + message.f12959q, Integer.valueOf(Constants.SDK_VERSION_CODE));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("1commandId=");
                        sb2.append(message.f12962t);
                        sb2.append("serviceId=");
                        sb2.append(message.f12927H);
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb2.toString(), AudioStats.AUDIO_AMPLITUDE_NONE);
                    }
                }
            } else {
                ALog.m10118e(this.f12994l, "onResult message is cancel", "command", message.f12962t);
            }
            NetPerformanceMonitor netPerformanceMonitorM9908e = message.m9908e();
            if (netPerformanceMonitorM9908e != null) {
                netPerformanceMonitorM9908e.onToBizDate();
                URL url = message.f12948f;
                String string = url != null ? url.toString() : null;
                if (errorCode2.getCodeInt() == AccsErrorCode.SUCCESS.getCodeInt()) {
                    netPerformanceMonitorM9908e.setRet(true);
                    if (message.f12937R > 0) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "succ", AudioStats.AUDIO_AMPLITUDE_NONE);
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "succ_" + message.f12937R, AudioStats.AUDIO_AMPLITUDE_NONE);
                    } else {
                        AppMonitorAdapter.commitAlarmSuccess("accs", BaseMonitor.ALARM_POINT_REQUEST, string);
                    }
                } else {
                    if (message.f12937R > 0) {
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "fail＿" + errorCode2, AudioStats.AUDIO_AMPLITUDE_NONE);
                        AppMonitorAdapter.commitCount("accs", BaseMonitor.COUNT_POINT_RESEND, "fail", AudioStats.AUDIO_AMPLITUDE_NONE);
                    } else if (errorCode2.getCodeInt() != AccsErrorCode.NO_NETWORK.getCodeInt()) {
                        AppMonitorAdapter.commitAlarmFail("accs", BaseMonitor.ALARM_POINT_REQUEST, string, UtilityImpl.m10126a(errorCode2.getCodeInt()), this.f12984b + message.f12927H + message.f12938S);
                    }
                    netPerformanceMonitorM9908e.setRet(false);
                    netPerformanceMonitorM9908e.setFailReason(errorCode2);
                }
                AppMonitor.getInstance().commitStat(message.m9908e());
            }
            m9934b(message, errorCode2);
            return;
        }
        ALog.m10116d(this.f12994l, "onError, skip ping/ack", new Object[0]);
    }

    /* renamed from: a */
    public void m9942a() {
        ALog.m10116d(this.f12994l, "onSendPing", new Object[0]);
        synchronized (C7623d.class) {
            this.f12989g = true;
        }
    }

    /* renamed from: a */
    public void m9944a(Message message) {
        String str;
        Message message2 = this.f12992j;
        if (message2 != null && (str = message.f12934O) != null && message.f12927H != null && message2.f12934O.equals(str) && this.f12992j.f12927H.equals(message.f12927H)) {
            UTMini.getInstance().commitEvent(66001, "SEND_REPEAT", message.f12927H, message.f12934O, Long.valueOf(Thread.currentThread().getId()));
        }
        if (message.m9901a() == -1 || message.m9901a() == 2 || message.f12945c) {
            return;
        }
        this.f12988f.put(message.m9907d(), message);
    }

    /* renamed from: a */
    public void m9943a(ErrorCode errorCode) {
        this.f12989g = false;
        Message.C7617a[] c7617aArr = (Message.C7617a[]) this.f12988f.keySet().toArray(new Message.C7617a[0]);
        if (c7617aArr.length > 0) {
            ALog.m10116d(this.f12994l, "onNetworkFail", new Object[0]);
            for (Message.C7617a c7617a : c7617aArr) {
                Message messageRemove = this.f12988f.remove(c7617a);
                if (messageRemove != null) {
                    m9945a(messageRemove, errorCode);
                }
            }
        }
    }

    /* renamed from: a */
    public Message m9941a(String str) {
        return this.f12988f.get(new Message.C7617a(0, str));
    }

    /* renamed from: a */
    private byte[] m9933a(String str, Map<Integer, String> map, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    int i10 = Integer.parseInt(map.get(17));
                    int i11 = Integer.parseInt(map.get(16));
                    if (i11 <= 1) {
                        throw new RuntimeException("burstNums <= 1");
                    }
                    if (i10 >= 0 && i10 < i11) {
                        String str2 = map.get(18);
                        long j10 = 0;
                        try {
                            String str3 = map.get(15);
                            if (!TextUtils.isEmpty(str3)) {
                                j10 = Long.parseLong(str3);
                            }
                        } catch (Throwable th) {
                            ALog.m10121w(this.f12994l, "putBurstMessage", th, new Object[0]);
                        }
                        C7620a c7620a = this.f12996n.get(str);
                        if (c7620a == null) {
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.m10119i(this.f12994l, "putBurstMessage", Constants.KEY_DATA_ID, str, "burstLength", Integer.valueOf(i11));
                            }
                            c7620a = new C7620a(str, i11, str2);
                            c7620a.m9923a(j10);
                            this.f12996n.put(str, c7620a);
                        }
                        return c7620a.m9924a(i10, i11, bArr);
                    }
                    throw new RuntimeException(String.format("burstNums:%s burstIndex:%s", Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            } catch (Throwable th2) {
                ALog.m10121w(this.f12994l, "putBurstMessage", th2, new Object[0]);
                return null;
            }
        }
        throw new RuntimeException("burstLength == 0");
    }

    /* renamed from: a */
    private void m9931a(Map<Integer, String> map, Intent intent) {
        if (map == null || intent == null) {
            return;
        }
        intent.putExtra(TaoBaseService.ExtraInfo.EXT_HEADER, (HashMap) map);
    }

    /* renamed from: a */
    private void m9928a(Intent intent, String str, String str2, short s10) {
        if (intent != null) {
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("source", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("target", str2);
            }
            intent.putExtra(Constants.KEY_FLAGS, s10);
        }
    }

    /* renamed from: a */
    private void m9930a(String str, String str2) {
        C7671e c7671e = new C7671e();
        c7671e.f13196a = UtilityImpl.getDeviceId(this.f12990h);
        c7671e.f13198c = str;
        c7671e.f13199d = "" + System.currentTimeMillis();
        c7671e.f13201f = "";
        c7671e.f13200e = str2;
        c7671e.f13197b = "";
        c7671e.m10111a();
    }

    /* renamed from: a */
    public void m9948a(TrafficsMonitor.C7673a c7673a) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC7624e(this, c7673a));
        } catch (Throwable th) {
            ALog.m10117e(this.f12994l, "addTrafficsInfo", th, new Object[0]);
        }
    }
}
