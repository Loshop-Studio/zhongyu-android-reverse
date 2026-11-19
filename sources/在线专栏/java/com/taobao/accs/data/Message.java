package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC1745b;
import com.taobao.accs.p064ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.C1784g;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.accs.utl.RomInfoCollector;
import com.taobao.accs.utl.UtilityImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;

/* loaded from: classes.dex */
public class Message {
    public static final int EXT_HEADER_VALUE_MAX_LEN = 1023;
    public static final int FLAG_ACK_TYPE = 32;
    public static final int FLAG_BIZ_RET = 64;
    public static final int FLAG_DATA_TYPE = 32768;
    public static final int FLAG_ERR = 4096;
    public static final int FLAG_REQ_BIT1 = 16384;
    public static final int FLAG_REQ_BIT2 = 8192;
    public static final int FLAG_RET = 2048;
    public static final String KEY_BIND_APP = "ctrl_bindapp";
    public static final String KEY_BIND_SERVICE = "ctrl_bindservice";
    public static final String KEY_BIND_USER = "ctrl_binduser";
    public static final String KEY_UNBIND_APP = "ctrl_unbindapp";
    public static final String KEY_UNBIND_SERVICE = "ctrl_unbindservice";
    public static final String KEY_UNBIND_USER = "ctrl_unbinduser";
    public static final int MAX_RETRY_TIMES = 3;

    /* renamed from: a */
    public static int f7520a = 5;

    /* renamed from: b */
    static long f7521b = 1;

    /* renamed from: N */
    byte[] f7535N;

    /* renamed from: O */
    public String f7536O;

    /* renamed from: P */
    int f7537P;

    /* renamed from: T */
    public long f7541T;

    /* renamed from: U */
    long f7542U;

    /* renamed from: W */
    transient NetPerformanceMonitor f7544W;

    /* renamed from: Y */
    C1720a f7546Y;

    /* renamed from: f */
    public URL f7550f;

    /* renamed from: i */
    short f7553i;

    /* renamed from: j */
    short f7554j;

    /* renamed from: k */
    short f7555k;

    /* renamed from: l */
    byte f7556l;

    /* renamed from: m */
    byte f7557m;

    /* renamed from: n */
    String f7558n;

    /* renamed from: o */
    String f7559o;

    /* renamed from: q */
    public String f7561q;

    /* renamed from: r */
    Map<Integer, String> f7562r;

    /* renamed from: c */
    public boolean f7547c = false;

    /* renamed from: d */
    public boolean f7548d = false;

    /* renamed from: e */
    public boolean f7549e = false;

    /* renamed from: g */
    byte f7551g = 0;

    /* renamed from: h */
    byte f7552h = 0;

    /* renamed from: p */
    int f7560p = -1;

    /* renamed from: s */
    String f7563s = null;

    /* renamed from: t */
    public Integer f7564t = null;

    /* renamed from: u */
    Integer f7565u = 0;

    /* renamed from: v */
    String f7566v = null;

    /* renamed from: w */
    public String f7567w = null;

    /* renamed from: x */
    Integer f7568x = null;

    /* renamed from: y */
    String f7569y = null;

    /* renamed from: z */
    String f7570z = null;

    /* renamed from: A */
    String f7522A = null;

    /* renamed from: B */
    String f7523B = null;

    /* renamed from: C */
    String f7524C = null;

    /* renamed from: D */
    Integer f7525D = null;

    /* renamed from: E */
    String f7526E = null;

    /* renamed from: F */
    String f7527F = null;

    /* renamed from: G */
    public String f7528G = null;

    /* renamed from: H */
    public String f7529H = null;

    /* renamed from: I */
    String f7530I = null;

    /* renamed from: J */
    String f7531J = null;

    /* renamed from: K */
    String f7532K = null;

    /* renamed from: L */
    String f7533L = null;

    /* renamed from: M */
    String f7534M = null;

    /* renamed from: Q */
    public long f7538Q = 0;

    /* renamed from: R */
    public int f7539R = 0;

    /* renamed from: S */
    public int f7540S = AbstractC1745b.ACCS_RECEIVE_TIMEOUT;

    /* renamed from: V */
    public String f7543V = null;

    /* renamed from: X */
    String f7545X = null;

    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i4) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? DATA : RES : REQ : ACK : DATA;
        }
    }

    /* renamed from: com.taobao.accs.data.Message$a */
    public static class C1720a {

        /* renamed from: a */
        private final int f7571a;

        /* renamed from: b */
        private final String f7572b;

        public C1720a(int i4, String str) {
            this.f7571a = i4;
            this.f7572b = str;
        }

        /* renamed from: a */
        public int m5887a() {
            return this.f7571a;
        }

        /* renamed from: b */
        public String m5888b() {
            return this.f7572b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1720a c1720a = (C1720a) obj;
            return this.f7571a == c1720a.m5887a() || this.f7572b.equals(c1720a.m5888b());
        }

        public int hashCode() {
            return this.f7572b.hashCode();
        }
    }

    /* renamed from: com.taobao.accs.data.Message$b */
    public static class C1721b {
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        /* renamed from: a */
        public static String m5889a(int i4) {
            return i4 != 0 ? i4 != 1 ? "INVALID" : "NEED_ACK" : "NO_ACK";
        }
    }

    /* renamed from: com.taobao.accs.data.Message$c */
    public static class C1722c {
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        /* renamed from: a */
        public static int m5890a(int i4) {
            int i5 = 1;
            if (i4 != 1) {
                i5 = 2;
                if (i4 != 2) {
                    i5 = 3;
                    if (i4 != 3) {
                        return 0;
                    }
                }
            }
            return i5;
        }

        /* renamed from: b */
        public static String m5891b(int i4) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? "INVALID" : "HANDSHAKE" : "PING" : "DATA" : "CONTROL";
        }
    }

    private Message() {
        synchronized (Message.class) {
            this.f7541T = System.currentTimeMillis();
            String str = String.valueOf(this.f7541T) + "." + String.valueOf(f7521b);
            this.f7561q = str;
            long j4 = f7521b;
            f7521b = 1 + j4;
            this.f7546Y = new C1720a((int) j4, str);
        }
    }

    /* renamed from: j */
    private String m5874j() {
        return "Msg_" + this.f7545X;
    }

    /* renamed from: a */
    public int m5875a() {
        return this.f7560p;
    }

    /* renamed from: b */
    public String m5879b() {
        return this.f7561q;
    }

    /* renamed from: c */
    public boolean m5880c() {
        return Constants.TARGET_CONTROL.equals(this.f7558n);
    }

    /* renamed from: d */
    public C1720a m5881d() {
        return this.f7546Y;
    }

    /* renamed from: e */
    public NetPerformanceMonitor m5882e() {
        return this.f7544W;
    }

    /* renamed from: f */
    public String m5883f() {
        String str = this.f7563s;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public boolean m5884g() {
        boolean z3 = (System.currentTimeMillis() - this.f7541T) + this.f7538Q >= ((long) this.f7540S);
        if (z3) {
            ALog.m6092e(m5874j(), "delay time:" + this.f7538Q + " beforeSendTime:" + (System.currentTimeMillis() - this.f7541T) + " timeout" + this.f7540S, new Object[0]);
        }
        return z3;
    }

    /* renamed from: h */
    void m5885h() throws IOException {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
            } catch (Exception unused) {
                return;
            }
        } catch (Throwable th2) {
            gZIPOutputStream = null;
            th = th2;
            byteArrayOutputStream = null;
        }
        if (this.f7535N == null) {
            return;
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f7535N);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null && byteArray.length < this.f7535N.length) {
                    this.f7535N = byteArray;
                    this.f7551g = (byte) 1;
                }
                gZIPOutputStream.close();
            } catch (Throwable th3) {
                th = th3;
                try {
                    ALog.m6095w(m5874j(), "compressData fail", th, new Object[0]);
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (byteArrayOutputStream == null) {
                        return;
                    }
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused2) {
                            throw th4;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            gZIPOutputStream = null;
            th = th5;
        }
        byteArrayOutputStream.close();
    }

    /* renamed from: i */
    void m5886i() throws JSONException, UnsupportedEncodingException {
        Integer num = this.f7564t;
        if (num == null || num.intValue() == 100 || this.f7564t.intValue() == 102) {
            return;
        }
        this.f7535N = new JsonUtility.JsonObjectBuilder().put("command", this.f7564t.intValue() == 100 ? null : this.f7564t).put(Constants.KEY_APP_KEY, this.f7566v).put(Constants.KEY_OS_TYPE, this.f7568x).put("sign", this.f7567w).put(Constants.KEY_SDK_VERSION, this.f7525D).put("appVersion", this.f7524C).put(Constants.KEY_TTID, this.f7526E).put(Constants.KEY_MODEL, this.f7530I).put(Constants.KEY_BRAND, this.f7531J).put(Constants.KEY_IMEI, this.f7532K).put(Constants.KEY_IMSI, this.f7533L).put("os", this.f7569y).put(Constants.KEY_EXTS, this.f7523B).build().toString().getBytes("utf-8");
    }

    /* renamed from: b */
    public static Message m5868b(AbstractC1745b abstractC1745b, Intent intent) {
        Message messageM5860a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM5860a = m5860a(stringExtra, stringExtra2);
            messageM5860a.f7545X = abstractC1745b.f7666m;
            m5865a(abstractC1745b, messageM5860a);
            return messageM5860a;
        } catch (Throwable th) {
            ALog.m6091e("Msg", "buildBindService", th, new Object[0]);
            th.printStackTrace();
            return messageM5860a;
        }
    }

    /* renamed from: c */
    public static Message m5870c(AbstractC1745b abstractC1745b, Intent intent) {
        Message messageM5869b = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM5869b = m5869b(stringExtra, stringExtra2);
            messageM5869b.f7545X = abstractC1745b.f7666m;
            m5865a(abstractC1745b, messageM5869b);
            return messageM5869b;
        } catch (Exception e4) {
            ALog.m6091e("Msg", "buildUnbindService", e4, new Object[0]);
            e4.printStackTrace();
            return messageM5869b;
        }
    }

    /* renamed from: d */
    public static Message m5872d(AbstractC1745b abstractC1745b, Intent intent) {
        Message messageM5871c = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM5871c = m5871c(stringExtra, stringExtra2);
            if (messageM5871c != null) {
                messageM5871c.f7545X = abstractC1745b.f7666m;
                m5865a(abstractC1745b, messageM5871c);
            }
        } catch (Exception e4) {
            ALog.m6091e("Msg", "buildBindUser", e4, new Object[0]);
            e4.printStackTrace();
        }
        return messageM5871c;
    }

    /* renamed from: e */
    public static Message m5873e(AbstractC1745b abstractC1745b, Intent intent) {
        Message messageM5858a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM5858a = m5858a(stringExtra);
            messageM5858a.f7545X = abstractC1745b.f7666m;
            m5865a(abstractC1745b, messageM5858a);
            return messageM5858a;
        } catch (Exception e4) {
            ALog.m6091e("Msg", "buildUnbindUser", e4, new Object[0]);
            e4.printStackTrace();
            return messageM5858a;
        }
    }

    /* renamed from: a */
    public void m5877a(long j4) {
        this.f7542U = j4;
    }

    /* renamed from: a */
    public byte[] m5878a(Context context, int i4) throws IOException {
        byte[] bytes;
        try {
            m5886i();
        } catch (UnsupportedEncodingException e4) {
            ALog.m6091e(m5874j(), "build2", e4, new Object[0]);
        } catch (JSONException e5) {
            ALog.m6091e(m5874j(), "build1", e5, new Object[0]);
        }
        byte[] bArr = this.f7535N;
        String str = bArr != null ? new String(bArr) : "";
        m5885h();
        if (!this.f7547c) {
            StringBuilder sb = new StringBuilder();
            sb.append(UtilityImpl.getDeviceId(context));
            sb.append("|");
            sb.append(this.f7563s);
            sb.append("|");
            String str2 = this.f7529H;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append("|");
            String str3 = this.f7528G;
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            this.f7559o = sb.toString();
        }
        try {
            bytes = (this.f7561q + "").getBytes("utf-8");
            this.f7557m = (byte) this.f7559o.getBytes("utf-8").length;
            this.f7556l = (byte) this.f7558n.getBytes("utf-8").length;
        } catch (Exception e6) {
            e6.printStackTrace();
            ALog.m6091e(m5874j(), "build3", e6, new Object[0]);
            bytes = (this.f7561q + "").getBytes();
            this.f7557m = (byte) this.f7559o.getBytes().length;
            this.f7556l = (byte) this.f7558n.getBytes().length;
        }
        short sM5876a = m5876a(this.f7562r);
        int length = this.f7556l + 3 + 1 + this.f7557m + 1 + bytes.length;
        byte[] bArr2 = this.f7535N;
        short length2 = (short) (length + (bArr2 == null ? 0 : bArr2.length) + sM5876a + 2);
        this.f7554j = length2;
        this.f7553i = (short) (length2 + 2);
        C1784g c1784g = new C1784g(this.f7553i + 2 + 4);
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.m6090d(m5874j(), "Build Message", Constants.KEY_DATA_ID, new String(bytes));
        }
        try {
            c1784g.m6147a((byte) (this.f7551g | 32));
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tversion:2 compress:" + ((int) this.f7551g), new Object[0]);
            }
            if (i4 == 0) {
                c1784g.m6147a((byte) -128);
                if (ALog.isPrintLog(level)) {
                    ALog.m6090d(m5874j(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                c1784g.m6147a((byte) 64);
                if (ALog.isPrintLog(level)) {
                    ALog.m6090d(m5874j(), "\tflag: 0x40", new Object[0]);
                }
            }
            c1784g.m6148a(this.f7553i);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\ttotalLength:" + ((int) this.f7553i), new Object[0]);
            }
            c1784g.m6148a(this.f7554j);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tdataLength:" + ((int) this.f7554j), new Object[0]);
            }
            c1784g.m6148a(this.f7555k);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tflags:" + Integer.toHexString(this.f7555k), new Object[0]);
            }
            c1784g.m6147a(this.f7556l);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\ttargetLength:" + ((int) this.f7556l), new Object[0]);
            }
            c1784g.write(this.f7558n.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\ttarget:" + this.f7558n, new Object[0]);
            }
            c1784g.m6147a(this.f7557m);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tsourceLength:" + ((int) this.f7557m), new Object[0]);
            }
            c1784g.write(this.f7559o.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tsource:" + this.f7559o, new Object[0]);
            }
            c1784g.m6147a((byte) bytes.length);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tdataIdLength:" + bytes.length, new Object[0]);
            }
            c1784g.write(bytes);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\tdataId:" + new String(bytes), new Object[0]);
            }
            c1784g.m6148a(sM5876a);
            if (ALog.isPrintLog(level)) {
                ALog.m6090d(m5874j(), "\textHeader len:" + ((int) sM5876a), new Object[0]);
            }
            Map<Integer, String> map = this.f7562r;
            if (map != null) {
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    String str4 = this.f7562r.get(Integer.valueOf(iIntValue));
                    if (!TextUtils.isEmpty(str4)) {
                        c1784g.m6148a((short) ((((short) iIntValue) << 10) | ((short) (str4.getBytes("utf-8").length & EXT_HEADER_VALUE_MAX_LEN))));
                        c1784g.write(str4.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            ALog.m6090d(m5874j(), "\textHeader key:" + iIntValue + " value:" + str4, new Object[0]);
                        }
                    }
                }
            }
            byte[] bArr3 = this.f7535N;
            if (bArr3 != null) {
                c1784g.write(bArr3);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m6090d(m5874j(), "\toriData:" + str, new Object[0]);
            }
            c1784g.flush();
        } catch (IOException e7) {
            ALog.m6091e(m5874j(), "build4", e7, new Object[0]);
        }
        byte[] byteArray = c1784g.toByteArray();
        try {
            c1784g.close();
        } catch (IOException e8) {
            ALog.m6091e(m5874j(), "build5", e8, new Object[0]);
        }
        return byteArray;
    }

    /* renamed from: b */
    public static Message m5869b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.DATA, 1);
        message.f7563s = str;
        message.f7529H = str2;
        message.f7558n = Constants.TARGET_CONTROL;
        message.f7564t = 6;
        message.f7563s = str;
        message.f7529H = str2;
        message.f7525D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f7536O = KEY_UNBIND_SERVICE;
        return message;
    }

    /* renamed from: c */
    public static Message m5871c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.DATA, 1);
        message.f7563s = str;
        message.f7528G = str2;
        message.f7558n = Constants.TARGET_CONTROL;
        message.f7564t = 3;
        message.f7563s = str;
        message.f7528G = str2;
        message.f7525D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f7536O = KEY_BIND_USER;
        return message;
    }

    /* renamed from: a */
    short m5876a(Map<Integer, String> map) {
        short length = 0;
        if (map != null) {
            try {
                Iterator<Integer> it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str = map.get(Integer.valueOf(it.next().intValue()));
                    if (!TextUtils.isEmpty(str)) {
                        length = (short) (length + ((short) (str.getBytes("utf-8").length & EXT_HEADER_VALUE_MAX_LEN)) + 2);
                    }
                }
            } catch (Exception e4) {
                e4.toString();
            }
        }
        return length;
    }

    /* renamed from: a */
    public static Message m5862a(boolean z3, int i4) {
        Message message = new Message();
        message.f7560p = 2;
        message.f7564t = 201;
        message.f7548d = z3;
        message.f7538Q = i4;
        return message;
    }

    /* renamed from: a */
    public static Message m5851a(AbstractC1745b abstractC1745b, Context context, Intent intent) {
        Message messageM5850a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            intent.getStringExtra(Constants.KEY_USER_ID);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_APP_KEY);
            String stringExtra3 = intent.getStringExtra(Constants.KEY_TTID);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM5850a = m5850a(context, abstractC1745b.f7666m, stringExtra2, intent.getStringExtra("app_sercet"), stringExtra, stringExtra3, intent.getStringExtra("appVersion"));
            m5865a(abstractC1745b, messageM5850a);
            return messageM5850a;
        } catch (Exception e4) {
            ALog.m6092e("Msg", "buildBindApp", e4.getMessage());
            return messageM5850a;
        }
    }

    /* renamed from: a */
    public static Message m5850a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.DATA, 1);
        message.f7568x = 1;
        message.f7569y = Build.VERSION.SDK_INT + "";
        message.f7563s = str4;
        message.f7558n = Constants.TARGET_CONTROL;
        message.f7564t = 1;
        message.f7566v = str2;
        message.f7567w = UtilityImpl.m6103a(str2, str3, UtilityImpl.getDeviceId(context));
        message.f7525D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f7524C = str6;
        message.f7563s = str4;
        message.f7526E = str5;
        message.f7530I = Build.MODEL;
        message.f7531J = Build.BRAND;
        message.f7536O = KEY_BIND_APP;
        message.f7545X = str;
        message.f7523B = new JsonUtility.JsonObjectBuilder().put("notifyEnable", UtilityImpl.m6134k(context)).put("romInfo", RomInfoCollector.getCollector().collect()).build().toString();
        return message;
    }

    /* renamed from: a */
    public static Message m5855a(AbstractC1745b abstractC1745b, Intent intent) {
        ALog.m6092e("Msg", "buildUnbindApp1" + UtilityImpl.m6104a(new Exception()), new Object[0]);
        Message messageM5856a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM5856a = m5856a(abstractC1745b, stringExtra);
            m5865a(abstractC1745b, messageM5856a);
            return messageM5856a;
        } catch (Exception e4) {
            ALog.m6092e("Msg", "buildUnbindApp1", e4.getMessage());
            return messageM5856a;
        }
    }

    /* renamed from: a */
    public static Message m5856a(AbstractC1745b abstractC1745b, String str) {
        Message message = null;
        try {
            ALog.m6092e("Msg", "buildUnbindApp" + UtilityImpl.m6104a(new Exception()), new Object[0]);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Message message2 = new Message();
            try {
                message2.f7537P = 1;
                message2.m5863a(1, ReqType.DATA, 1);
                message2.f7563s = str;
                message2.f7558n = Constants.TARGET_CONTROL;
                message2.f7564t = 2;
                message2.f7563s = str;
                message2.f7525D = Integer.valueOf(Constants.SDK_VERSION_CODE);
                message2.f7536O = KEY_UNBIND_APP;
                m5865a(abstractC1745b, message2);
                return message2;
            } catch (Exception e4) {
                e = e4;
                message = message2;
                ALog.m6092e("Msg", "buildUnbindApp", e.getMessage());
                return message;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* renamed from: a */
    public static Message m5860a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.DATA, 1);
        message.f7563s = str;
        message.f7529H = str2;
        message.f7558n = Constants.TARGET_CONTROL;
        message.f7564t = 5;
        message.f7563s = str;
        message.f7529H = str2;
        message.f7525D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f7536O = KEY_BIND_SERVICE;
        return message;
    }

    /* renamed from: a */
    public static Message m5861a(String str, String str2, String str3, int i4) {
        Message message = new Message();
        try {
            message.f7550f = new URL(str3);
        } catch (MalformedURLException e4) {
            e4.printStackTrace();
        }
        message.f7558n = Constants.TARGET_SERVICE_ST;
        message.m5863a(1, ReqType.DATA, 0);
        message.f7564t = 100;
        message.f7535N = ("0|" + i4 + "|" + str + "|" + AdapterUtilityImpl.getDeviceId(GlobalClientInfo.getContext()) + "|" + str2).getBytes();
        return message;
    }

    /* renamed from: a */
    public static Message m5858a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.DATA, 1);
        message.f7563s = str;
        message.f7558n = Constants.TARGET_CONTROL;
        message.f7564t = 4;
        message.f7525D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f7536O = KEY_UNBIND_USER;
        return message;
    }

    /* renamed from: a */
    public static Message m5852a(AbstractC1745b abstractC1745b, Context context, String str, ACCSManager.AccsRequest accsRequest) {
        return m5853a(abstractC1745b, context, str, accsRequest, true);
    }

    /* renamed from: a */
    public static Message m5853a(AbstractC1745b abstractC1745b, Context context, String str, ACCSManager.AccsRequest accsRequest, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.DATA, 1);
        message.f7564t = 100;
        message.f7563s = str;
        message.f7529H = accsRequest.serviceId;
        message.f7528G = accsRequest.userId;
        message.f7535N = accsRequest.data;
        String str2 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(Constants.TARGET_SERVICE_PRE);
        sb.append(str2);
        sb.append("|");
        String str3 = accsRequest.target;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        message.f7558n = sb.toString();
        message.f7536O = accsRequest.dataId;
        message.f7543V = accsRequest.businessId;
        int i4 = accsRequest.timeout;
        if (i4 > 0) {
            message.f7540S = i4;
        }
        if (z3) {
            m5866a(abstractC1745b, message, accsRequest);
        } else {
            message.f7550f = accsRequest.host;
        }
        m5864a(message, GlobalClientInfo.getInstance(context).getSid(abstractC1745b.f7666m), GlobalClientInfo.getInstance(context).getUserId(abstractC1745b.f7666m), abstractC1745b.f7662i.getStoreId(), GlobalClientInfo.f7506b, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f7544W = netPerformanceMonitor;
        netPerformanceMonitor.setMsgType(0);
        message.f7544W.setDataId(accsRequest.dataId);
        message.f7544W.setServiceId(accsRequest.serviceId);
        NetPerformanceMonitor netPerformanceMonitor2 = message.f7544W;
        URL url = message.f7550f;
        netPerformanceMonitor2.setHost(url != null ? url.toString() : "");
        message.f7545X = abstractC1745b.f7666m;
        return message;
    }

    /* renamed from: a */
    public static Message m5854a(AbstractC1745b abstractC1745b, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f7537P = 1;
        message.m5863a(1, ReqType.REQ, 1);
        message.f7564t = 100;
        message.f7563s = str;
        message.f7529H = accsRequest.serviceId;
        message.f7528G = accsRequest.userId;
        message.f7535N = accsRequest.data;
        String str3 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str3);
        sb.append("|");
        String str4 = accsRequest.target;
        if (str4 == null) {
            str4 = "";
        }
        sb.append(str4);
        message.f7558n = sb.toString();
        message.f7536O = accsRequest.dataId;
        message.f7543V = accsRequest.businessId;
        message.f7545X = abstractC1745b.f7666m;
        int i4 = accsRequest.timeout;
        if (i4 > 0) {
            message.f7540S = i4;
        }
        if (z3) {
            m5866a(abstractC1745b, message, accsRequest);
        } else {
            message.f7550f = accsRequest.host;
        }
        m5864a(message, GlobalClientInfo.getInstance(context).getSid(abstractC1745b.f7666m), GlobalClientInfo.getInstance(context).getUserId(abstractC1745b.f7666m), abstractC1745b.f7662i.getStoreId(), GlobalClientInfo.f7506b, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f7544W = netPerformanceMonitor;
        netPerformanceMonitor.setDataId(accsRequest.dataId);
        message.f7544W.setServiceId(accsRequest.serviceId);
        NetPerformanceMonitor netPerformanceMonitor2 = message.f7544W;
        URL url = message.f7550f;
        netPerformanceMonitor2.setHost(url != null ? url.toString() : "");
        message.f7545X = abstractC1745b.f7666m;
        return message;
    }

    /* renamed from: a */
    private static void m5866a(AbstractC1745b abstractC1745b, Message message, ACCSManager.AccsRequest accsRequest) {
        URL url = accsRequest.host;
        if (url == null) {
            try {
                message.f7550f = new URL(abstractC1745b.mo5998b((String) null));
                return;
            } catch (MalformedURLException e4) {
                ALog.m6091e("Msg", "setUnit", e4, new Object[0]);
                e4.printStackTrace();
                return;
            }
        }
        message.f7550f = url;
    }

    /* renamed from: a */
    private static void m5865a(AbstractC1745b abstractC1745b, Message message) {
        try {
            message.f7550f = new URL(abstractC1745b.mo5998b((String) null));
        } catch (Exception e4) {
            ALog.m6091e("Msg", "setControlHost", e4, new Object[0]);
        }
    }

    /* renamed from: a */
    public static Message m5857a(AbstractC1745b abstractC1745b, String str, String str2, String str3, boolean z3, short s3, String str4, Map<Integer, String> map) {
        Message message = new Message();
        message.f7537P = 1;
        message.m5867a(s3, z3);
        message.f7559o = str;
        message.f7558n = str2;
        message.f7561q = str3;
        message.f7547c = true;
        message.f7562r = map;
        try {
            try {
                if (TextUtils.isEmpty(str4)) {
                    message.f7550f = new URL(abstractC1745b.mo5998b((String) null));
                } else {
                    message.f7550f = new URL(str4);
                }
                message.f7545X = abstractC1745b.f7666m;
                if (message.f7550f == null) {
                    message.f7550f = new URL(abstractC1745b.mo5998b((String) null));
                }
            } catch (Throwable th) {
                try {
                    ALog.m6091e("Msg", "buildPushAck", th, new Object[0]);
                    if (message.f7550f == null) {
                        message.f7550f = new URL(abstractC1745b.mo5998b((String) null));
                    }
                } catch (Throwable th2) {
                    if (message.f7550f == null) {
                        try {
                            message.f7550f = new URL(abstractC1745b.mo5998b((String) null));
                        } catch (MalformedURLException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (MalformedURLException e5) {
            e5.printStackTrace();
        }
        return message;
    }

    /* renamed from: a */
    public static Message m5859a(String str, int i4) {
        Message message = new Message();
        message.m5863a(1, ReqType.ACK, 0);
        message.f7564t = Integer.valueOf(i4);
        message.f7563s = str;
        return message;
    }

    /* renamed from: a */
    private static void m5864a(Message message, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str6) && str4 == null) {
            return;
        }
        message.f7562r = new HashMap();
        if (str5 != null && UtilityImpl.m6099a(str5) <= 1023) {
            message.f7562r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), str5);
        }
        if (str != null && UtilityImpl.m6099a(str) <= 1023) {
            message.f7562r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
        }
        if (str2 != null && UtilityImpl.m6099a(str2) <= 1023) {
            message.f7562r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
        }
        if (str6 != null && UtilityImpl.m6099a(str6) <= 1023) {
            message.f7562r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), str6);
        }
        if (str4 != null && UtilityImpl.m6099a(str4) <= 1023) {
            message.f7562r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
        }
        if (str3 == null || UtilityImpl.m6099a(str3) > 1023) {
            return;
        }
        message.f7562r.put(19, str3);
    }

    /* renamed from: a */
    private void m5863a(int i4, ReqType reqType, int i5) {
        this.f7560p = i4;
        if (i4 != 2) {
            this.f7555k = (short) (((((i4 & 1) << 4) | (reqType.ordinal() << 2)) | i5) << 11);
        }
    }

    /* renamed from: a */
    private void m5867a(short s3, boolean z3) {
        this.f7560p = 1;
        short s4 = (short) (((short) (((short) (((short) (s3 & (-16385))) | 8192)) & (-2049))) & (-65));
        this.f7555k = s4;
        if (z3) {
            this.f7555k = (short) (s4 | 32);
        }
    }
}
