package p124e0;

import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: e0.a */
/* loaded from: classes3.dex */
public class C9061a {

    /* renamed from: r */
    public static ArrayList f21213r = new ArrayList();

    /* renamed from: a */
    public Map f21214a;

    /* renamed from: b */
    public String f21215b;

    /* renamed from: c */
    public String f21216c;

    /* renamed from: d */
    public String f21217d;

    /* renamed from: e */
    public String f21218e;

    /* renamed from: f */
    public String f21219f;

    /* renamed from: g */
    public String f21220g;

    /* renamed from: h */
    public String f21221h;

    /* renamed from: i */
    public int f21222i;

    /* renamed from: j */
    public int f21223j;

    /* renamed from: k */
    public int f21224k = 0;

    /* renamed from: l */
    public String f21225l;

    /* renamed from: m */
    public String f21226m;

    /* renamed from: n */
    public String f21227n;

    /* renamed from: o */
    public String f21228o;

    /* renamed from: p */
    public String f21229p;

    /* renamed from: q */
    public String f21230q;

    static {
        f21213r.add(-2);
        f21213r.add(0);
        f21213r.add(1);
        f21213r.add(-1);
        f21213r.add(2);
    }

    /* renamed from: A */
    public void m17797A(String str) {
        this.f21228o = str;
    }

    /* renamed from: B */
    public String m17798B() {
        return this.f21221h;
    }

    /* renamed from: C */
    public void m17799C(String str) {
        this.f21229p = str;
    }

    /* renamed from: D */
    public String m17800D() {
        return this.f21227n;
    }

    /* renamed from: E */
    public void m17801E(String str) {
        this.f21230q = str;
    }

    /* renamed from: F */
    public String m17802F() {
        return this.f21228o;
    }

    /* renamed from: G */
    public String m17803G() {
        return this.f21229p;
    }

    /* renamed from: a */
    public int m17804a() {
        return this.f21222i;
    }

    /* renamed from: b */
    public void m17805b(int i10) {
        this.f21222i = i10;
    }

    /* renamed from: c */
    public void m17806c(String str) {
        this.f21217d = str;
    }

    /* renamed from: d */
    public void m17807d(Map map) {
        this.f21214a = map;
    }

    /* renamed from: e */
    public String m17808e() {
        return this.f21217d;
    }

    /* renamed from: f */
    public void m17809f(int i10) {
        if (i10 < 0) {
            this.f21223j = i10 * (-1);
        } else {
            this.f21223j = i10;
        }
    }

    /* renamed from: g */
    public void m17810g(String str) {
        this.f21218e = str;
    }

    /* renamed from: h */
    public String m17811h() {
        return this.f21218e;
    }

    /* renamed from: i */
    public void m17812i(String str) {
        this.f21219f = str;
    }

    /* renamed from: j */
    public String m17813j() {
        return this.f21219f;
    }

    /* renamed from: k */
    public void m17814k(String str) {
        this.f21215b = str;
    }

    /* renamed from: l */
    public Map m17815l() {
        return this.f21214a;
    }

    /* renamed from: m */
    public void m17816m(String str) {
        this.f21216c = str;
    }

    /* renamed from: n */
    public String m17817n() {
        return this.f21215b;
    }

    /* renamed from: o */
    public void m17818o(String str) {
        this.f21220g = str;
    }

    /* renamed from: p */
    public String m17819p() {
        return this.f21216c;
    }

    /* renamed from: q */
    public void m17820q(String str) {
        try {
            if (f21213r.contains(Integer.valueOf(Integer.parseInt(str)))) {
                this.f21224k = Integer.parseInt(str);
            }
        } catch (NumberFormatException e10) {
            ALog.m10117e("MPS:CPushNotification", "formar error:数字格式错误", e10, new Object[0]);
        }
    }

    /* renamed from: r */
    public String m17821r() {
        return this.f21220g;
    }

    /* renamed from: s */
    public void m17822s(String str) {
        this.f21225l = str;
    }

    /* renamed from: t */
    public int m17823t() {
        return this.f21223j;
    }

    /* renamed from: u */
    public void m17824u(String str) {
        this.f21226m = str;
    }

    /* renamed from: v */
    public int m17825v() {
        return this.f21224k;
    }

    /* renamed from: w */
    public void m17826w(String str) {
        this.f21221h = str;
    }

    /* renamed from: x */
    public String m17827x() {
        return this.f21225l;
    }

    /* renamed from: y */
    public void m17828y(String str) {
        this.f21227n = str;
    }

    /* renamed from: z */
    public String m17829z() {
        return this.f21226m;
    }
}
