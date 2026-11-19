package com.alibaba.sdk.android.push.notification;

import com.alibaba.sdk.android.ams.common.logger.AmsLogger;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.push.notification.b */
/* loaded from: classes.dex */
public class C1186b {

    /* renamed from: a */
    static AmsLogger f6869a = AmsLogger.getLogger("MPS:CPushNotification");

    /* renamed from: b */
    public static ArrayList<Integer> f6870b = new ArrayList<>();

    /* renamed from: B */
    private String f6872B;

    /* renamed from: C */
    private String f6873C;

    /* renamed from: D */
    private String f6874D;

    /* renamed from: c */
    private Map<String, String> f6875c;

    /* renamed from: d */
    private String f6876d;

    /* renamed from: e */
    private String f6877e;

    /* renamed from: f */
    private String f6878f;

    /* renamed from: g */
    private String f6879g;

    /* renamed from: h */
    private String f6880h;

    /* renamed from: j */
    private String f6882j;

    /* renamed from: k */
    private String f6883k;

    /* renamed from: l */
    private String f6884l;

    /* renamed from: m */
    private String f6885m;

    /* renamed from: n */
    private String f6886n;

    /* renamed from: o */
    private boolean f6887o;

    /* renamed from: p */
    private int f6888p;

    /* renamed from: i */
    private int f6881i = 0;

    /* renamed from: q */
    private int f6889q = 0;

    /* renamed from: r */
    private int f6890r = 0;

    /* renamed from: s */
    private int f6891s = 1;

    /* renamed from: t */
    private int f6892t = 0;

    /* renamed from: u */
    private int f6893u = 3;

    /* renamed from: v */
    private int f6894v = 0;

    /* renamed from: w */
    private int f6895w = 0;

    /* renamed from: x */
    private int f6896x = 0;

    /* renamed from: y */
    private int f6897y = 0;

    /* renamed from: z */
    private int f6898z = 0;

    /* renamed from: A */
    private boolean f6871A = false;

    static {
        f6870b.add(-2);
        f6870b.add(0);
        f6870b.add(1);
        f6870b.add(-1);
        f6870b.add(2);
    }

    /* renamed from: a */
    public String m5282a() {
        return this.f6879g;
    }

    /* renamed from: a */
    public void m5283a(int i4) {
        this.f6888p = i4;
    }

    /* renamed from: a */
    public void m5284a(String str) {
        this.f6879g = str;
    }

    /* renamed from: a */
    public void m5285a(Map<String, String> map) {
        this.f6875c = map;
    }

    /* renamed from: a */
    public void m5286a(boolean z3) {
        this.f6871A = z3;
    }

    /* renamed from: b */
    public String m5287b() {
        return this.f6876d;
    }

    /* renamed from: b */
    public void m5288b(int i4) {
        this.f6890r = i4;
    }

    /* renamed from: b */
    public void m5289b(String str) {
        this.f6876d = str;
    }

    /* renamed from: c */
    public String m5290c() {
        return this.f6877e;
    }

    /* renamed from: c */
    public void m5291c(int i4) {
        this.f6891s = i4;
    }

    /* renamed from: c */
    public void m5292c(String str) {
        this.f6877e = str;
    }

    /* renamed from: d */
    public int m5293d() {
        return this.f6888p;
    }

    /* renamed from: d */
    public void m5294d(int i4) {
        this.f6892t = i4;
    }

    /* renamed from: d */
    public void m5295d(String str) {
        this.f6878f = str;
    }

    /* renamed from: e */
    public void m5296e(int i4) {
        this.f6893u = i4;
    }

    /* renamed from: e */
    public void m5297e(String str) {
        try {
            if (f6870b.contains(Integer.valueOf(Integer.parseInt(str)))) {
                this.f6889q = Integer.parseInt(str);
            }
        } catch (NumberFormatException e4) {
            f6869a.m5020e("formar error:数字格式错误", e4);
        }
    }

    /* renamed from: e */
    public boolean m5298e() {
        return this.f6887o;
    }

    /* renamed from: f */
    public int m5299f() {
        return this.f6890r;
    }

    /* renamed from: f */
    public void m5300f(int i4) {
        this.f6894v = i4;
    }

    /* renamed from: f */
    public void m5301f(String str) {
        this.f6886n = str;
    }

    /* renamed from: g */
    public int m5302g() {
        return this.f6891s;
    }

    /* renamed from: g */
    public void m5303g(int i4) {
        this.f6895w = i4;
    }

    /* renamed from: g */
    public void m5304g(String str) {
        this.f6880h = str;
    }

    /* renamed from: h */
    public int m5305h() {
        return this.f6892t;
    }

    /* renamed from: h */
    public void m5306h(int i4) {
        this.f6896x = i4;
    }

    /* renamed from: h */
    public void m5307h(String str) {
        this.f6882j = str;
    }

    /* renamed from: i */
    public int m5308i() {
        return this.f6893u;
    }

    /* renamed from: i */
    public void m5309i(int i4) {
        this.f6897y = i4;
    }

    /* renamed from: i */
    public void m5310i(String str) {
        this.f6883k = str;
    }

    /* renamed from: j */
    public int m5311j() {
        return this.f6894v;
    }

    /* renamed from: j */
    public void m5312j(int i4) {
        this.f6898z = i4;
    }

    /* renamed from: j */
    public void m5313j(String str) {
        this.f6884l = str;
    }

    /* renamed from: k */
    public int m5314k() {
        return this.f6895w;
    }

    /* renamed from: k */
    public void m5315k(int i4) {
        this.f6881i = i4;
    }

    /* renamed from: k */
    public void m5316k(String str) {
        this.f6885m = str;
    }

    /* renamed from: l */
    public int m5317l() {
        return this.f6896x;
    }

    /* renamed from: l */
    public void m5318l(String str) {
        this.f6872B = str;
    }

    /* renamed from: m */
    public int m5319m() {
        return this.f6897y;
    }

    /* renamed from: m */
    public void m5320m(String str) {
        this.f6873C = str;
    }

    /* renamed from: n */
    public int m5321n() {
        return this.f6898z;
    }

    /* renamed from: n */
    public void m5322n(String str) {
        this.f6874D = str;
    }

    /* renamed from: o */
    public boolean m5323o() {
        return this.f6871A;
    }

    /* renamed from: p */
    public int m5324p() {
        return this.f6889q;
    }

    /* renamed from: q */
    public String m5325q() {
        return this.f6886n;
    }

    /* renamed from: r */
    public String m5326r() {
        return this.f6880h;
    }

    /* renamed from: s */
    public int m5327s() {
        return this.f6881i;
    }

    /* renamed from: t */
    public String m5328t() {
        return this.f6882j;
    }

    /* renamed from: u */
    public String m5329u() {
        return this.f6883k;
    }

    /* renamed from: v */
    public String m5330v() {
        return this.f6884l;
    }

    /* renamed from: w */
    public String m5331w() {
        return this.f6885m;
    }

    /* renamed from: x */
    public String m5332x() {
        return this.f6872B;
    }

    /* renamed from: y */
    public String m5333y() {
        return this.f6873C;
    }

    /* renamed from: z */
    public String m5334z() {
        return this.f6874D;
    }
}
