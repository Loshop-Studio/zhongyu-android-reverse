package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.android.arouter.utils.Consts;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC7642b;
import com.taobao.accs.p085ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.AdapterUtilityImpl;
import com.taobao.accs.utl.C7681g;
import com.taobao.accs.utl.JsonUtility;
import com.taobao.accs.utl.RomInfoCollector;
import com.taobao.accs.utl.UtilityImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;

/* loaded from: classes5.dex */
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
    public static int f12918a = 5;

    /* renamed from: b */
    static long f12919b = 1;

    /* renamed from: N */
    byte[] f12933N;

    /* renamed from: O */
    public String f12934O;

    /* renamed from: P */
    int f12935P;

    /* renamed from: T */
    public long f12939T;

    /* renamed from: U */
    long f12940U;

    /* renamed from: W */
    transient NetPerformanceMonitor f12942W;

    /* renamed from: Y */
    C7617a f12944Y;

    /* renamed from: f */
    public URL f12948f;

    /* renamed from: i */
    short f12951i;

    /* renamed from: j */
    short f12952j;

    /* renamed from: k */
    short f12953k;

    /* renamed from: l */
    byte f12954l;

    /* renamed from: m */
    byte f12955m;

    /* renamed from: n */
    String f12956n;

    /* renamed from: o */
    String f12957o;

    /* renamed from: q */
    public String f12959q;

    /* renamed from: r */
    Map<Integer, String> f12960r;

    /* renamed from: c */
    public boolean f12945c = false;

    /* renamed from: d */
    public boolean f12946d = false;

    /* renamed from: e */
    public boolean f12947e = false;

    /* renamed from: g */
    byte f12949g = 0;

    /* renamed from: h */
    byte f12950h = 0;

    /* renamed from: p */
    int f12958p = -1;

    /* renamed from: s */
    String f12961s = null;

    /* renamed from: t */
    public Integer f12962t = null;

    /* renamed from: u */
    Integer f12963u = 0;

    /* renamed from: v */
    String f12964v = null;

    /* renamed from: w */
    public String f12965w = null;

    /* renamed from: x */
    Integer f12966x = null;

    /* renamed from: y */
    String f12967y = null;

    /* renamed from: z */
    String f12968z = null;

    /* renamed from: A */
    String f12920A = null;

    /* renamed from: B */
    String f12921B = null;

    /* renamed from: C */
    String f12922C = null;

    /* renamed from: D */
    Integer f12923D = null;

    /* renamed from: E */
    String f12924E = null;

    /* renamed from: F */
    String f12925F = null;

    /* renamed from: G */
    public String f12926G = null;

    /* renamed from: H */
    public String f12927H = null;

    /* renamed from: I */
    String f12928I = null;

    /* renamed from: J */
    String f12929J = null;

    /* renamed from: K */
    String f12930K = null;

    /* renamed from: L */
    String f12931L = null;

    /* renamed from: M */
    String f12932M = null;

    /* renamed from: Q */
    public long f12936Q = 0;

    /* renamed from: R */
    public int f12937R = 0;

    /* renamed from: S */
    public int f12938S = AbstractC7642b.ACCS_RECEIVE_TIMEOUT;

    /* renamed from: V */
    public String f12941V = null;

    /* renamed from: X */
    String f12943X = null;

    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? DATA : RES : REQ : ACK : DATA;
        }
    }

    /* renamed from: com.taobao.accs.data.Message$a */
    public static class C7617a {

        /* renamed from: a */
        private final int f12969a;

        /* renamed from: b */
        private final String f12970b;

        public C7617a(int i10, String str) {
            this.f12969a = i10;
            this.f12970b = str;
        }

        /* renamed from: a */
        public int m9913a() {
            return this.f12969a;
        }

        /* renamed from: b */
        public String m9914b() {
            return this.f12970b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7617a c7617a = (C7617a) obj;
            return this.f12969a == c7617a.m9913a() || this.f12970b.equals(c7617a.m9914b());
        }

        public int hashCode() {
            return this.f12970b.hashCode();
        }
    }

    /* renamed from: com.taobao.accs.data.Message$b */
    public static class C7618b {
        public static final int INVALID = -1;
        public static final int NEED_ACK = 1;
        public static final int NO_ACK = 0;

        /* renamed from: a */
        public static String m9915a(int i10) {
            return i10 != 0 ? i10 != 1 ? "INVALID" : "NEED_ACK" : "NO_ACK";
        }
    }

    /* renamed from: com.taobao.accs.data.Message$c */
    public static class C7619c {
        public static final int CONTROL = 0;
        public static final int DATA = 1;
        public static final int HANDSHAKE = 3;
        public static final int INVALID = -1;
        public static final int PING = 2;

        /* renamed from: a */
        public static int m9916a(int i10) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    i11 = 3;
                    if (i10 != 3) {
                        return 0;
                    }
                }
            }
            return i11;
        }

        /* renamed from: b */
        public static String m9917b(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "INVALID" : "HANDSHAKE" : "PING" : "DATA" : "CONTROL";
        }
    }

    private Message() {
        synchronized (Message.class) {
            this.f12939T = System.currentTimeMillis();
            String str = String.valueOf(this.f12939T) + Consts.DOT + String.valueOf(f12919b);
            this.f12959q = str;
            long j10 = f12919b;
            f12919b = 1 + j10;
            this.f12944Y = new C7617a((int) j10, str);
        }
    }

    /* renamed from: j */
    private String m9900j() {
        return "Msg" + BundleUtil.UNDERLINE_TAG + this.f12943X;
    }

    /* renamed from: a */
    public int m9901a() {
        return this.f12958p;
    }

    /* renamed from: b */
    public String m9905b() {
        return this.f12959q;
    }

    /* renamed from: c */
    public boolean m9906c() {
        return Constants.TARGET_CONTROL.equals(this.f12956n);
    }

    /* renamed from: d */
    public C7617a m9907d() {
        return this.f12944Y;
    }

    /* renamed from: e */
    public NetPerformanceMonitor m9908e() {
        return this.f12942W;
    }

    /* renamed from: f */
    public String m9909f() {
        String str = this.f12961s;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public boolean m9910g() {
        boolean z10 = (System.currentTimeMillis() - this.f12939T) + this.f12936Q >= ((long) this.f12938S);
        if (z10) {
            ALog.m10118e(m9900j(), "delay time:" + this.f12936Q + " beforeSendTime:" + (System.currentTimeMillis() - this.f12939T) + " timeout" + this.f12938S, new Object[0]);
        }
        return z10;
    }

    /* renamed from: h */
    public void m9911h() throws IOException {
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
                if (this.f12933N == null) {
                    return;
                }
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (Throwable th2) {
                    gZIPOutputStream = null;
                    th = th2;
                }
                try {
                    gZIPOutputStream.write(this.f12933N);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray != null && byteArray.length < this.f12933N.length) {
                        this.f12933N = byteArray;
                        this.f12949g = (byte) 1;
                    }
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        ALog.m10121w(m9900j(), "compressData fail", th, new Object[0]);
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } catch (Throwable th4) {
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Exception unused) {
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
                byteArrayOutputStream = null;
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: i */
    public void m9912i() {
        Integer num = this.f12962t;
        if (num == null || num.intValue() == 100 || this.f12962t.intValue() == 102) {
            return;
        }
        this.f12933N = new JsonUtility.JsonObjectBuilder().put("command", this.f12962t.intValue() == 100 ? null : this.f12962t).put(Constants.KEY_APP_KEY, this.f12964v).put(Constants.KEY_OS_TYPE, this.f12966x).put("sign", this.f12965w).put(Constants.KEY_SDK_VERSION, this.f12923D).put("appVersion", this.f12922C).put(Constants.KEY_TTID, this.f12924E).put(Constants.KEY_MODEL, this.f12928I).put(Constants.KEY_BRAND, this.f12929J).put(Constants.KEY_IMEI, this.f12930K).put(Constants.KEY_IMSI, this.f12931L).put(Constants.KEY_OS_VERSION, this.f12967y).put(Constants.KEY_EXTS, this.f12921B).build().toString().getBytes("utf-8");
    }

    /* renamed from: b */
    public static Message m9894b(AbstractC7642b abstractC7642b, Intent intent) {
        Message messageM9886a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM9886a = m9886a(stringExtra, stringExtra2);
            messageM9886a.f12943X = abstractC7642b.f13064m;
            m9891a(abstractC7642b, messageM9886a);
            return messageM9886a;
        } catch (Throwable th) {
            ALog.m10117e("Msg", "buildBindService", th, new Object[0]);
            th.printStackTrace();
            return messageM9886a;
        }
    }

    /* renamed from: c */
    public static Message m9896c(AbstractC7642b abstractC7642b, Intent intent) {
        Message messageM9895b = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM9895b = m9895b(stringExtra, stringExtra2);
            messageM9895b.f12943X = abstractC7642b.f13064m;
            m9891a(abstractC7642b, messageM9895b);
            return messageM9895b;
        } catch (Exception e10) {
            ALog.m10117e("Msg", "buildUnbindService", e10, new Object[0]);
            e10.printStackTrace();
            return messageM9895b;
        }
    }

    /* renamed from: d */
    public static Message m9898d(AbstractC7642b abstractC7642b, Intent intent) {
        Message messageM9897c = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM9897c = m9897c(stringExtra, stringExtra2);
            if (messageM9897c == null) {
                return messageM9897c;
            }
            messageM9897c.f12943X = abstractC7642b.f13064m;
            m9891a(abstractC7642b, messageM9897c);
            return messageM9897c;
        } catch (Exception e10) {
            ALog.m10117e("Msg", "buildBindUser", e10, new Object[0]);
            e10.printStackTrace();
            return messageM9897c;
        }
    }

    /* renamed from: e */
    public static Message m9899e(AbstractC7642b abstractC7642b, Intent intent) {
        Message messageM9884a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra(Constants.KEY_APP_KEY);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM9884a = m9884a(stringExtra);
            messageM9884a.f12943X = abstractC7642b.f13064m;
            m9891a(abstractC7642b, messageM9884a);
            return messageM9884a;
        } catch (Exception e10) {
            ALog.m10117e("Msg", "buildUnbindUser", e10, new Object[0]);
            e10.printStackTrace();
            return messageM9884a;
        }
    }

    /* renamed from: a */
    public void m9903a(long j10) {
        this.f12940U = j10;
    }

    /* renamed from: a */
    public byte[] m9904a(Context context, int i10) throws IOException {
        byte[] bytes;
        try {
            m9912i();
        } catch (UnsupportedEncodingException e10) {
            ALog.m10117e(m9900j(), "build2", e10, new Object[0]);
        } catch (JSONException e11) {
            ALog.m10117e(m9900j(), "build1", e11, new Object[0]);
        }
        byte[] bArr = this.f12933N;
        String str = bArr != null ? new String(bArr) : "";
        m9911h();
        if (!this.f12945c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(UtilityImpl.getDeviceId(context));
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(this.f12961s);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            String str2 = this.f12927H;
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            String str3 = this.f12926G;
            if (str3 == null) {
                str3 = "";
            }
            sb2.append(str3);
            this.f12957o = sb2.toString();
        }
        try {
            bytes = (this.f12959q + "").getBytes("utf-8");
            this.f12955m = (byte) this.f12957o.getBytes("utf-8").length;
            this.f12954l = (byte) this.f12956n.getBytes("utf-8").length;
        } catch (Exception e12) {
            e12.printStackTrace();
            ALog.m10117e(m9900j(), "build3", e12, new Object[0]);
            bytes = (this.f12959q + "").getBytes();
            this.f12955m = (byte) this.f12957o.getBytes().length;
            this.f12954l = (byte) this.f12956n.getBytes().length;
        }
        short sM9902a = m9902a(this.f12960r);
        int length = this.f12954l + 4 + this.f12955m + 1 + bytes.length;
        byte[] bArr2 = this.f12933N;
        short length2 = (short) (length + (bArr2 == null ? 0 : bArr2.length) + sM9902a + 2);
        this.f12952j = length2;
        this.f12951i = (short) (length2 + 2);
        C7681g c7681g = new C7681g(this.f12951i + 6);
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level)) {
            ALog.m10116d(m9900j(), "Build Message", Constants.KEY_DATA_ID, new String(bytes));
        }
        try {
            c7681g.m10173a((byte) (this.f12949g | 32));
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tversion:2 compress:" + ((int) this.f12949g), new Object[0]);
            }
            if (i10 == 0) {
                c7681g.m10173a((byte) -128);
                if (ALog.isPrintLog(level)) {
                    ALog.m10116d(m9900j(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                c7681g.m10173a((byte) 64);
                if (ALog.isPrintLog(level)) {
                    ALog.m10116d(m9900j(), "\tflag: 0x40", new Object[0]);
                }
            }
            c7681g.m10174a(this.f12951i);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\ttotalLength:" + ((int) this.f12951i), new Object[0]);
            }
            c7681g.m10174a(this.f12952j);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tdataLength:" + ((int) this.f12952j), new Object[0]);
            }
            c7681g.m10174a(this.f12953k);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tflags:" + Integer.toHexString(this.f12953k), new Object[0]);
            }
            c7681g.m10173a(this.f12954l);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\ttargetLength:" + ((int) this.f12954l), new Object[0]);
            }
            c7681g.write(this.f12956n.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\ttarget:" + this.f12956n, new Object[0]);
            }
            c7681g.m10173a(this.f12955m);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tsourceLength:" + ((int) this.f12955m), new Object[0]);
            }
            c7681g.write(this.f12957o.getBytes("utf-8"));
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tsource:" + this.f12957o, new Object[0]);
            }
            c7681g.m10173a((byte) bytes.length);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tdataIdLength:" + bytes.length, new Object[0]);
            }
            c7681g.write(bytes);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\tdataId:" + new String(bytes), new Object[0]);
            }
            c7681g.m10174a(sM9902a);
            if (ALog.isPrintLog(level)) {
                ALog.m10116d(m9900j(), "\textHeader len:" + ((int) sM9902a), new Object[0]);
            }
            Map<Integer, String> map = this.f12960r;
            if (map != null) {
                for (Integer num : map.keySet()) {
                    int iIntValue = num.intValue();
                    String str4 = this.f12960r.get(num);
                    if (!TextUtils.isEmpty(str4)) {
                        c7681g.m10174a((short) ((((short) iIntValue) << 10) | ((short) (str4.getBytes("utf-8").length & EXT_HEADER_VALUE_MAX_LEN))));
                        c7681g.write(str4.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            ALog.m10116d(m9900j(), "\textHeader key:" + iIntValue + " value:" + str4, new Object[0]);
                        }
                    }
                }
            }
            byte[] bArr3 = this.f12933N;
            if (bArr3 != null) {
                c7681g.write(bArr3);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10116d(m9900j(), "\toriData:" + str, new Object[0]);
            }
            c7681g.flush();
        } catch (IOException e13) {
            ALog.m10117e(m9900j(), "build4", e13, new Object[0]);
        }
        byte[] byteArray = c7681g.toByteArray();
        try {
            c7681g.close();
        } catch (IOException e14) {
            ALog.m10117e(m9900j(), "build5", e14, new Object[0]);
        }
        return byteArray;
    }

    /* renamed from: b */
    public static Message m9895b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.DATA, 1);
        message.f12961s = str;
        message.f12927H = str2;
        message.f12956n = Constants.TARGET_CONTROL;
        message.f12962t = 6;
        message.f12961s = str;
        message.f12927H = str2;
        message.f12923D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f12934O = KEY_UNBIND_SERVICE;
        return message;
    }

    /* renamed from: c */
    public static Message m9897c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.DATA, 1);
        message.f12961s = str;
        message.f12926G = str2;
        message.f12956n = Constants.TARGET_CONTROL;
        message.f12962t = 3;
        message.f12961s = str;
        message.f12926G = str2;
        message.f12923D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f12934O = KEY_BIND_USER;
        return message;
    }

    /* renamed from: a */
    public short m9902a(Map<Integer, String> map) {
        short length = 0;
        if (map != null) {
            try {
                for (Integer num : map.keySet()) {
                    num.intValue();
                    String str = map.get(num);
                    if (!TextUtils.isEmpty(str)) {
                        length = (short) (length + ((short) (str.getBytes("utf-8").length & EXT_HEADER_VALUE_MAX_LEN)) + 2);
                    }
                }
                return length;
            } catch (Exception e10) {
                e10.toString();
            }
        }
        return length;
    }

    /* renamed from: a */
    public static Message m9888a(boolean z10, int i10) {
        Message message = new Message();
        message.f12958p = 2;
        message.f12962t = 201;
        message.f12946d = z10;
        message.f12936Q = i10;
        return message;
    }

    /* renamed from: a */
    public static Message m9877a(AbstractC7642b abstractC7642b, Context context, Intent intent) {
        Message messageM9876a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            intent.getStringExtra(Constants.KEY_USER_ID);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_APP_KEY);
            String stringExtra3 = intent.getStringExtra(Constants.KEY_TTID);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            String stringExtra4 = intent.getStringExtra("appVersion");
            messageM9876a = m9876a(context, abstractC7642b.f13064m, stringExtra2, intent.getStringExtra("app_sercet"), stringExtra, stringExtra3, stringExtra4);
            m9891a(abstractC7642b, messageM9876a);
            return messageM9876a;
        } catch (Exception e10) {
            ALog.m10118e("Msg", "buildBindApp", e10.getMessage());
            return messageM9876a;
        }
    }

    /* renamed from: a */
    public static Message m9876a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.DATA, 1);
        message.f12966x = 1;
        message.f12967y = Build.VERSION.SDK_INT + "";
        message.f12961s = str4;
        message.f12956n = Constants.TARGET_CONTROL;
        message.f12962t = 1;
        message.f12964v = str2;
        message.f12965w = UtilityImpl.m10129a(str2, str3, UtilityImpl.getDeviceId(context));
        message.f12923D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f12922C = str6;
        message.f12961s = str4;
        message.f12924E = str5;
        message.f12928I = Build.MODEL;
        message.f12929J = Build.BRAND;
        message.f12934O = KEY_BIND_APP;
        message.f12943X = str;
        message.f12921B = new JsonUtility.JsonObjectBuilder().put("notifyEnable", UtilityImpl.m10160k(context)).put("romInfo", RomInfoCollector.getCollector().collect()).build().toString();
        return message;
    }

    /* renamed from: a */
    public static Message m9881a(AbstractC7642b abstractC7642b, Intent intent) {
        ALog.m10118e("Msg", "buildUnbindApp1" + UtilityImpl.m10130a(new Exception()), new Object[0]);
        Message messageM9882a = null;
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            intent.getStringExtra(Constants.KEY_USER_ID);
            intent.getStringExtra("sid");
            intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
            messageM9882a = m9882a(abstractC7642b, stringExtra);
            m9891a(abstractC7642b, messageM9882a);
            return messageM9882a;
        } catch (Exception e10) {
            ALog.m10118e("Msg", "buildUnbindApp1", e10.getMessage());
            return messageM9882a;
        }
    }

    /* renamed from: a */
    public static Message m9882a(AbstractC7642b abstractC7642b, String str) {
        Message message = null;
        try {
            ALog.m10118e("Msg", "buildUnbindApp" + UtilityImpl.m10130a(new Exception()), new Object[0]);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Message message2 = new Message();
            try {
                message2.f12935P = 1;
                message2.m9889a(1, ReqType.DATA, 1);
                message2.f12961s = str;
                message2.f12956n = Constants.TARGET_CONTROL;
                message2.f12962t = 2;
                message2.f12961s = str;
                message2.f12923D = Integer.valueOf(Constants.SDK_VERSION_CODE);
                message2.f12934O = KEY_UNBIND_APP;
                m9891a(abstractC7642b, message2);
                return message2;
            } catch (Exception e10) {
                e = e10;
                message = message2;
                ALog.m10118e("Msg", "buildUnbindApp", e.getMessage());
                return message;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* renamed from: a */
    public static Message m9886a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.DATA, 1);
        message.f12961s = str;
        message.f12927H = str2;
        message.f12956n = Constants.TARGET_CONTROL;
        message.f12962t = 5;
        message.f12961s = str;
        message.f12927H = str2;
        message.f12923D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f12934O = KEY_BIND_SERVICE;
        return message;
    }

    /* renamed from: a */
    public static Message m9887a(String str, String str2, String str3, int i10) {
        Message message = new Message();
        try {
            message.f12948f = new URL(str3);
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
        }
        message.f12956n = Constants.TARGET_SERVICE_ST;
        message.m9889a(1, ReqType.DATA, 0);
        message.f12962t = 100;
        message.f12933N = ("0|" + i10 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + AdapterUtilityImpl.getDeviceId(GlobalClientInfo.getContext()) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2).getBytes();
        return message;
    }

    /* renamed from: a */
    public static Message m9884a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.DATA, 1);
        message.f12961s = str;
        message.f12956n = Constants.TARGET_CONTROL;
        message.f12962t = 4;
        message.f12923D = Integer.valueOf(Constants.SDK_VERSION_CODE);
        message.f12934O = KEY_UNBIND_USER;
        return message;
    }

    /* renamed from: a */
    public static Message m9878a(AbstractC7642b abstractC7642b, Context context, String str, ACCSManager.AccsRequest accsRequest) {
        return m9879a(abstractC7642b, context, str, accsRequest, true);
    }

    /* renamed from: a */
    public static Message m9879a(AbstractC7642b abstractC7642b, Context context, String str, ACCSManager.AccsRequest accsRequest, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.DATA, 1);
        message.f12962t = 100;
        message.f12961s = str;
        message.f12927H = accsRequest.serviceId;
        message.f12926G = accsRequest.userId;
        message.f12933N = accsRequest.data;
        String str2 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Constants.TARGET_SERVICE_PRE);
        sb2.append(str2);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        String str3 = accsRequest.target;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        message.f12956n = sb2.toString();
        message.f12934O = accsRequest.dataId;
        message.f12941V = accsRequest.businessId;
        int i10 = accsRequest.timeout;
        if (i10 > 0) {
            message.f12938S = i10;
        }
        if (z10) {
            m9892a(abstractC7642b, message, accsRequest);
        } else {
            message.f12948f = accsRequest.host;
        }
        m9890a(message, GlobalClientInfo.getInstance(context).getSid(abstractC7642b.f13064m), GlobalClientInfo.getInstance(context).getUserId(abstractC7642b.f13064m), abstractC7642b.f13060i.getStoreId(), GlobalClientInfo.f12904b, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f12942W = netPerformanceMonitor;
        netPerformanceMonitor.setMsgType(0);
        message.f12942W.setDataId(accsRequest.dataId);
        message.f12942W.setServiceId(accsRequest.serviceId);
        NetPerformanceMonitor netPerformanceMonitor2 = message.f12942W;
        URL url = message.f12948f;
        netPerformanceMonitor2.setHost(url != null ? url.toString() : "");
        message.f12943X = abstractC7642b.f13064m;
        return message;
    }

    /* renamed from: a */
    public static Message m9880a(AbstractC7642b abstractC7642b, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.f12935P = 1;
        message.m9889a(1, ReqType.REQ, 1);
        message.f12962t = 100;
        message.f12961s = str;
        message.f12927H = accsRequest.serviceId;
        message.f12926G = accsRequest.userId;
        message.f12933N = accsRequest.data;
        String str3 = TextUtils.isEmpty(accsRequest.targetServiceName) ? accsRequest.serviceId : accsRequest.targetServiceName;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        String str4 = accsRequest.target;
        if (str4 == null) {
            str4 = "";
        }
        sb2.append(str4);
        message.f12956n = sb2.toString();
        message.f12934O = accsRequest.dataId;
        message.f12941V = accsRequest.businessId;
        message.f12943X = abstractC7642b.f13064m;
        int i10 = accsRequest.timeout;
        if (i10 > 0) {
            message.f12938S = i10;
        }
        if (z10) {
            m9892a(abstractC7642b, message, accsRequest);
        } else {
            message.f12948f = accsRequest.host;
        }
        m9890a(message, GlobalClientInfo.getInstance(context).getSid(abstractC7642b.f13064m), GlobalClientInfo.getInstance(context).getUserId(abstractC7642b.f13064m), abstractC7642b.f13060i.getStoreId(), GlobalClientInfo.f12904b, accsRequest.businessId, accsRequest.tag);
        NetPerformanceMonitor netPerformanceMonitor = new NetPerformanceMonitor();
        message.f12942W = netPerformanceMonitor;
        netPerformanceMonitor.setDataId(accsRequest.dataId);
        message.f12942W.setServiceId(accsRequest.serviceId);
        NetPerformanceMonitor netPerformanceMonitor2 = message.f12942W;
        URL url = message.f12948f;
        netPerformanceMonitor2.setHost(url != null ? url.toString() : "");
        message.f12943X = abstractC7642b.f13064m;
        return message;
    }

    /* renamed from: a */
    private static void m9892a(AbstractC7642b abstractC7642b, Message message, ACCSManager.AccsRequest accsRequest) {
        URL url = accsRequest.host;
        if (url == null) {
            try {
                message.f12948f = new URL(abstractC7642b.mo10024b((String) null));
                return;
            } catch (MalformedURLException e10) {
                ALog.m10117e("Msg", "setUnit", e10, new Object[0]);
                e10.printStackTrace();
                return;
            }
        }
        message.f12948f = url;
    }

    /* renamed from: a */
    private static void m9891a(AbstractC7642b abstractC7642b, Message message) {
        try {
            message.f12948f = new URL(abstractC7642b.mo10024b((String) null));
        } catch (Exception e10) {
            ALog.m10117e("Msg", "setControlHost", e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static Message m9883a(AbstractC7642b abstractC7642b, String str, String str2, String str3, boolean z10, short s10, String str4, Map<Integer, String> map) {
        Message message = new Message();
        message.f12935P = 1;
        message.m9893a(s10, z10);
        message.f12957o = str;
        message.f12956n = str2;
        message.f12959q = str3;
        message.f12945c = true;
        message.f12960r = map;
        try {
            try {
                if (TextUtils.isEmpty(str4)) {
                    message.f12948f = new URL(abstractC7642b.mo10024b((String) null));
                } else {
                    message.f12948f = new URL(str4);
                }
                message.f12943X = abstractC7642b.f13064m;
                if (message.f12948f == null) {
                    message.f12948f = new URL(abstractC7642b.mo10024b((String) null));
                    return message;
                }
            } catch (Throwable th) {
                try {
                    ALog.m10117e("Msg", "buildPushAck", th, new Object[0]);
                    if (message.f12948f == null) {
                        message.f12948f = new URL(abstractC7642b.mo10024b((String) null));
                    }
                } catch (Throwable th2) {
                    if (message.f12948f == null) {
                        try {
                            message.f12948f = new URL(abstractC7642b.mo10024b((String) null));
                        } catch (MalformedURLException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
        }
        return message;
    }

    /* renamed from: a */
    public static Message m9885a(String str, int i10) {
        Message message = new Message();
        message.m9889a(1, ReqType.ACK, 0);
        message.f12962t = Integer.valueOf(i10);
        message.f12961s = str;
        return message;
    }

    /* renamed from: a */
    private static void m9890a(Message message, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str5) && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str6) && str4 == null) {
            return;
        }
        message.f12960r = new HashMap();
        if (str5 != null && UtilityImpl.m10125a(str5) <= 1023) {
            message.f12960r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), str5);
        }
        if (str != null && UtilityImpl.m10125a(str) <= 1023) {
            message.f12960r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
        }
        if (str2 != null && UtilityImpl.m10125a(str2) <= 1023) {
            message.f12960r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
        }
        if (str6 != null && UtilityImpl.m10125a(str6) <= 1023) {
            message.f12960r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), str6);
        }
        if (str4 != null && UtilityImpl.m10125a(str4) <= 1023) {
            message.f12960r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
        }
        if (str3 == null || UtilityImpl.m10125a(str3) > 1023) {
            return;
        }
        message.f12960r.put(19, str3);
    }

    /* renamed from: a */
    private void m9889a(int i10, ReqType reqType, int i11) {
        this.f12958p = i10;
        if (i10 != 2) {
            this.f12953k = (short) (((((i10 & 1) << 4) | (reqType.ordinal() << 2)) | i11) << 11);
        }
    }

    /* renamed from: a */
    private void m9893a(short s10, boolean z10) {
        this.f12958p = 1;
        short s11 = (short) (((short) (((short) (((short) (s10 & (-16385))) | 8192)) & (-2049))) & (-65));
        this.f12953k = s11;
        if (z10) {
            this.f12953k = (short) (s11 | 32);
        }
    }
}
