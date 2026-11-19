package p115l1;

import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public class C2834a {

    /* renamed from: r */
    public static ArrayList<Integer> f10919r = new ArrayList<>();

    /* renamed from: a */
    private Map<String, String> f10920a;

    /* renamed from: b */
    private String f10921b;

    /* renamed from: c */
    private String f10922c;

    /* renamed from: d */
    private String f10923d;

    /* renamed from: e */
    private String f10924e;

    /* renamed from: f */
    private String f10925f;

    /* renamed from: g */
    private String f10926g;

    /* renamed from: h */
    private String f10927h;

    /* renamed from: i */
    private int f10928i;

    /* renamed from: j */
    private int f10929j;

    /* renamed from: k */
    private int f10930k = 0;

    /* renamed from: l */
    private String f10931l;

    /* renamed from: m */
    private String f10932m;

    /* renamed from: n */
    private String f10933n;

    /* renamed from: o */
    private String f10934o;

    /* renamed from: p */
    private String f10935p;

    /* renamed from: q */
    private String f10936q;

    static {
        f10919r.add(-2);
        f10919r.add(0);
        f10919r.add(1);
        f10919r.add(-1);
        f10919r.add(2);
    }

    /* renamed from: A */
    public void m9480A(String str) {
        this.f10934o = str;
    }

    /* renamed from: B */
    public String m9481B() {
        return this.f10927h;
    }

    /* renamed from: C */
    public void m9482C(String str) {
        this.f10935p = str;
    }

    /* renamed from: D */
    public String m9483D() {
        return this.f10933n;
    }

    /* renamed from: E */
    public void m9484E(String str) {
        this.f10936q = str;
    }

    /* renamed from: F */
    public String m9485F() {
        return this.f10934o;
    }

    /* renamed from: G */
    public String m9486G() {
        return this.f10935p;
    }

    /* renamed from: a */
    public int m9487a() {
        return this.f10928i;
    }

    /* renamed from: b */
    public void m9488b(int i4) {
        this.f10928i = i4;
    }

    /* renamed from: c */
    public void m9489c(String str) {
        this.f10923d = str;
    }

    /* renamed from: d */
    public void m9490d(Map<String, String> map) {
        this.f10920a = map;
    }

    /* renamed from: e */
    public String m9491e() {
        return this.f10923d;
    }

    /* renamed from: f */
    public void m9492f(int i4) {
        if (i4 < 0) {
            this.f10929j = i4 * (-1);
        } else {
            this.f10929j = i4;
        }
    }

    /* renamed from: g */
    public void m9493g(String str) {
        this.f10924e = str;
    }

    /* renamed from: h */
    public String m9494h() {
        return this.f10924e;
    }

    /* renamed from: i */
    public void m9495i(String str) {
        this.f10925f = str;
    }

    /* renamed from: j */
    public String m9496j() {
        return this.f10925f;
    }

    /* renamed from: k */
    public void m9497k(String str) {
        this.f10921b = str;
    }

    /* renamed from: l */
    public Map<String, String> m9498l() {
        return this.f10920a;
    }

    /* renamed from: m */
    public void m9499m(String str) {
        this.f10922c = str;
    }

    /* renamed from: n */
    public String m9500n() {
        return this.f10921b;
    }

    /* renamed from: o */
    public void m9501o(String str) {
        this.f10926g = str;
    }

    /* renamed from: p */
    public String m9502p() {
        return this.f10922c;
    }

    /* renamed from: q */
    public void m9503q(String str) {
        try {
            if (f10919r.contains(Integer.valueOf(Integer.parseInt(str)))) {
                this.f10930k = Integer.parseInt(str);
            }
        } catch (NumberFormatException e4) {
            ALog.m6091e("MPS:CPushNotification", "formar error:数字格式错误", e4, new Object[0]);
        }
    }

    /* renamed from: r */
    public String m9504r() {
        return this.f10926g;
    }

    /* renamed from: s */
    public void m9505s(String str) {
        this.f10931l = str;
    }

    /* renamed from: t */
    public int m9506t() {
        return this.f10929j;
    }

    /* renamed from: u */
    public void m9507u(String str) {
        this.f10932m = str;
    }

    /* renamed from: v */
    public int m9508v() {
        return this.f10930k;
    }

    /* renamed from: w */
    public void m9509w(String str) {
        this.f10927h = str;
    }

    /* renamed from: x */
    public String m9510x() {
        return this.f10931l;
    }

    /* renamed from: y */
    public void m9511y(String str) {
        this.f10933n = str;
    }

    /* renamed from: z */
    public String m9512z() {
        return this.f10932m;
    }
}
