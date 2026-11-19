package com.alibaba.sdk.android.push.notification;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.notification.b */
/* loaded from: classes3.dex */
public class C5680b {

    /* renamed from: a */
    static AmsLogger f4395a = AmsLogger.getLogger("MPS:CPushNotification");

    /* renamed from: b */
    public static ArrayList<Integer> f4396b = new ArrayList<>();

    /* renamed from: B */
    private String f4398B;

    /* renamed from: C */
    private String f4399C;

    /* renamed from: D */
    private String f4400D;

    /* renamed from: c */
    private Map<String, String> f4401c;

    /* renamed from: d */
    private String f4402d;

    /* renamed from: e */
    private String f4403e;

    /* renamed from: f */
    private String f4404f;

    /* renamed from: g */
    private String f4405g;

    /* renamed from: h */
    private String f4406h;

    /* renamed from: j */
    private String f4408j;

    /* renamed from: k */
    private String f4409k;

    /* renamed from: l */
    private String f4410l;

    /* renamed from: m */
    private String f4411m;

    /* renamed from: n */
    private String f4412n;

    /* renamed from: o */
    private boolean f4413o;

    /* renamed from: p */
    private int f4414p;

    /* renamed from: i */
    private int f4407i = 0;

    /* renamed from: q */
    private int f4415q = 0;

    /* renamed from: r */
    private int f4416r = 0;

    /* renamed from: s */
    private int f4417s = 1;

    /* renamed from: t */
    private int f4418t = 0;

    /* renamed from: u */
    private int f4419u = 3;

    /* renamed from: v */
    private int f4420v = 0;

    /* renamed from: w */
    private int f4421w = 0;

    /* renamed from: x */
    private int f4422x = 0;

    /* renamed from: y */
    private int f4423y = 0;

    /* renamed from: z */
    private int f4424z = 0;

    /* renamed from: A */
    private boolean f4397A = false;

    static {
        f4396b.add(-2);
        f4396b.add(0);
        f4396b.add(1);
        f4396b.add(-1);
        f4396b.add(2);
    }

    /* renamed from: a */
    public String m3733a() {
        return this.f4405g;
    }

    /* renamed from: b */
    public String m3738b() {
        return this.f4402d;
    }

    /* renamed from: c */
    public String m3741c() {
        return this.f4403e;
    }

    /* renamed from: d */
    public int m3744d() {
        return this.f4414p;
    }

    /* renamed from: e */
    public void m3747e(int i10) {
        this.f4419u = i10;
    }

    /* renamed from: f */
    public int m3750f() {
        return this.f4416r;
    }

    /* renamed from: g */
    public int m3753g() {
        return this.f4417s;
    }

    /* renamed from: h */
    public int m3756h() {
        return this.f4418t;
    }

    /* renamed from: i */
    public int m3759i() {
        return this.f4419u;
    }

    /* renamed from: j */
    public int m3762j() {
        return this.f4420v;
    }

    /* renamed from: k */
    public int m3765k() {
        return this.f4421w;
    }

    /* renamed from: l */
    public int m3768l() {
        return this.f4422x;
    }

    /* renamed from: m */
    public int m3770m() {
        return this.f4423y;
    }

    /* renamed from: n */
    public int m3772n() {
        return this.f4424z;
    }

    /* renamed from: o */
    public boolean m3774o() {
        return this.f4397A;
    }

    /* renamed from: p */
    public int m3775p() {
        return this.f4415q;
    }

    /* renamed from: q */
    public String m3776q() {
        return this.f4412n;
    }

    /* renamed from: r */
    public String m3777r() {
        return this.f4406h;
    }

    /* renamed from: s */
    public int m3778s() {
        return this.f4407i;
    }

    /* renamed from: t */
    public String m3779t() {
        return this.f4408j;
    }

    /* renamed from: u */
    public String m3780u() {
        return this.f4409k;
    }

    /* renamed from: v */
    public String m3781v() {
        return this.f4410l;
    }

    /* renamed from: w */
    public String m3782w() {
        return this.f4411m;
    }

    /* renamed from: x */
    public String m3783x() {
        return this.f4398B;
    }

    /* renamed from: y */
    public String m3784y() {
        return this.f4399C;
    }

    /* renamed from: z */
    public String m3785z() {
        return this.f4400D;
    }

    /* renamed from: a */
    public void m3734a(int i10) {
        this.f4414p = i10;
    }

    /* renamed from: b */
    public void m3739b(int i10) {
        this.f4416r = i10;
    }

    /* renamed from: c */
    public void m3742c(int i10) {
        this.f4417s = i10;
    }

    /* renamed from: d */
    public void m3745d(int i10) {
        this.f4418t = i10;
    }

    /* renamed from: e */
    public void m3748e(String str) {
        try {
            if (f4396b.contains(Integer.valueOf(Integer.parseInt(str)))) {
                this.f4415q = Integer.parseInt(str);
            }
        } catch (NumberFormatException e10) {
            f4395a.m3421e("formar error:数字格式错误", e10);
        }
    }

    /* renamed from: f */
    public void m3751f(int i10) {
        this.f4420v = i10;
    }

    /* renamed from: g */
    public void m3754g(int i10) {
        this.f4421w = i10;
    }

    /* renamed from: h */
    public void m3757h(int i10) {
        this.f4422x = i10;
    }

    /* renamed from: i */
    public void m3760i(int i10) {
        this.f4423y = i10;
    }

    /* renamed from: j */
    public void m3763j(int i10) {
        this.f4424z = i10;
    }

    /* renamed from: k */
    public void m3766k(int i10) {
        this.f4407i = i10;
    }

    /* renamed from: l */
    public void m3769l(String str) {
        this.f4398B = str;
    }

    /* renamed from: m */
    public void m3771m(String str) {
        this.f4399C = str;
    }

    /* renamed from: n */
    public void m3773n(String str) {
        this.f4400D = str;
    }

    /* renamed from: a */
    public void m3735a(String str) {
        this.f4405g = str;
    }

    /* renamed from: b */
    public void m3740b(String str) {
        this.f4402d = str;
    }

    /* renamed from: c */
    public void m3743c(String str) {
        this.f4403e = str;
    }

    /* renamed from: d */
    public void m3746d(String str) {
        this.f4404f = str;
    }

    /* renamed from: e */
    public boolean m3749e() {
        return this.f4413o;
    }

    /* renamed from: f */
    public void m3752f(String str) {
        this.f4412n = str;
    }

    /* renamed from: g */
    public void m3755g(String str) {
        this.f4406h = str;
    }

    /* renamed from: h */
    public void m3758h(String str) {
        this.f4408j = str;
    }

    /* renamed from: i */
    public void m3761i(String str) {
        this.f4409k = str;
    }

    /* renamed from: j */
    public void m3764j(String str) {
        this.f4410l = str;
    }

    /* renamed from: k */
    public void m3767k(String str) {
        this.f4411m = str;
    }

    /* renamed from: a */
    public void m3736a(Map<String, String> map) {
        this.f4401c = map;
    }

    /* renamed from: a */
    public void m3737a(boolean z10) {
        this.f4397A = z10;
    }
}
