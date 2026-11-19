package com.tencent.liteav.network;

import android.content.Context;
import com.tencent.liteav.basic.util.C6592e;
import java.util.regex.Pattern;
import org.json.JSONException;

/* renamed from: com.tencent.liteav.network.n */
/* loaded from: classes4.dex */
public class C6651n {

    /* renamed from: a */
    private Context f5912a;

    /* renamed from: b */
    private String f5913b;

    /* renamed from: c */
    private String f5914c;

    /* renamed from: d */
    private String f5915d;

    /* renamed from: e */
    private String f5916e;

    /* renamed from: f */
    private long f5917f;

    /* renamed from: g */
    private long f5918g;

    /* renamed from: h */
    private String f5919h;

    /* renamed from: i */
    private long f5920i;

    /* renamed from: j */
    private long f5921j;

    /* renamed from: k */
    private long f5922k;

    /* renamed from: l */
    private long f5923l;

    /* renamed from: m */
    private long f5924m;

    /* renamed from: n */
    private long f5925n;

    /* renamed from: o */
    private long f5926o;

    /* renamed from: p */
    private long f5927p;

    /* renamed from: q */
    private long f5928q;

    /* renamed from: r */
    private long f5929r;

    /* renamed from: s */
    private long f5930s;

    /* renamed from: t */
    private long f5931t;

    /* renamed from: u */
    private long f5932u;

    /* renamed from: v */
    private long f5933v;

    /* renamed from: w */
    private boolean f5934w = true;

    public C6651n(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5912a = applicationContext;
        this.f5913b = C6592e.m5039a(applicationContext);
        this.f5915d = "Android";
        C6650m.m5328a().m5333a(this.f5912a);
        m5342a();
    }

    /* renamed from: e */
    private void m5340e() {
        long j10 = this.f5927p;
        long j11 = this.f5928q;
        m5342a();
        this.f5925n = j10;
        this.f5926o = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0117  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5341f() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.C6651n.m5341f():void");
    }

    /* renamed from: a */
    public void m5342a() {
        this.f5914c = "";
        this.f5917f = 0L;
        this.f5918g = -1L;
        this.f5919h = "";
        this.f5920i = -1L;
        this.f5921j = -1L;
        this.f5922k = -1L;
        this.f5923l = -1L;
        this.f5916e = "";
        this.f5924m = 0L;
        this.f5925n = 0L;
        this.f5926o = 0L;
        this.f5927p = 0L;
        this.f5928q = 0L;
        this.f5929r = 0L;
        this.f5930s = 0L;
        this.f5931t = 0L;
        this.f5932u = 0L;
        this.f5933v = 0L;
        this.f5934w = true;
    }

    /* renamed from: b */
    public void m5348b() {
        this.f5917f = System.currentTimeMillis();
        this.f5914c = C6650m.m5328a().m5336b();
    }

    /* renamed from: c */
    public void m5350c() throws JSONException {
        m5341f();
        m5340e();
    }

    /* renamed from: d */
    public void m5351d() {
        this.f5924m++;
    }

    /* renamed from: c */
    private boolean m5339c(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: b */
    public void m5349b(long j10, long j11) {
        this.f5933v++;
        this.f5929r += j10;
        this.f5930s += j11;
        if (j10 > this.f5931t) {
            this.f5931t = j10;
        }
        if (j11 > this.f5932u) {
            this.f5932u = j11;
        }
    }

    /* renamed from: b */
    private boolean m5338b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public void m5346a(boolean z10) {
        this.f5923l = z10 ? 2L : 1L;
        if (z10) {
            this.f5934w = false;
        }
    }

    /* renamed from: a */
    public void m5345a(String str) {
        this.f5916e = str;
    }

    /* renamed from: a */
    public void m5347a(boolean z10, String str) {
        this.f5919h = str;
        if (z10) {
            this.f5918g = 1L;
            return;
        }
        if (str != null) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf);
            }
            if (str != null) {
                for (String str2 : str.split("[.]")) {
                    if (!m5339c(str2)) {
                        this.f5918g = 3L;
                        return;
                    }
                }
                this.f5918g = 2L;
            }
        }
    }

    /* renamed from: a */
    public void m5344a(long j10, long j11, long j12) {
        this.f5920i = j10;
        this.f5921j = j11;
        this.f5922k = j12;
    }

    /* renamed from: a */
    public void m5343a(long j10, long j11) {
        this.f5927p = j10;
        this.f5928q = j11;
    }
}
