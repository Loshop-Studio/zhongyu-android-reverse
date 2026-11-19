package p121n;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import p121n.C2869e;

/* renamed from: n.c */
/* loaded from: classes.dex */
public class C2867c {

    /* renamed from: a */
    protected C2869e f11066a;

    /* renamed from: b */
    protected C2869e f11067b;

    /* renamed from: c */
    protected C2869e f11068c;

    /* renamed from: d */
    protected C2869e f11069d;

    /* renamed from: e */
    protected C2869e f11070e;

    /* renamed from: f */
    protected C2869e f11071f;

    /* renamed from: g */
    protected C2869e f11072g;

    /* renamed from: h */
    protected ArrayList<C2869e> f11073h;

    /* renamed from: i */
    protected int f11074i;

    /* renamed from: j */
    protected int f11075j;

    /* renamed from: k */
    protected float f11076k = IGoodView.DEFAULT_TO_ALPHA;

    /* renamed from: l */
    int f11077l;

    /* renamed from: m */
    int f11078m;

    /* renamed from: n */
    int f11079n;

    /* renamed from: o */
    boolean f11080o;

    /* renamed from: p */
    private int f11081p;

    /* renamed from: q */
    private boolean f11082q;

    /* renamed from: r */
    protected boolean f11083r;

    /* renamed from: s */
    protected boolean f11084s;

    /* renamed from: t */
    protected boolean f11085t;

    /* renamed from: u */
    protected boolean f11086u;

    /* renamed from: v */
    private boolean f11087v;

    public C2867c(C2869e c2869e, int i4, boolean z3) {
        this.f11066a = c2869e;
        this.f11081p = i4;
        this.f11082q = z3;
    }

    /* renamed from: b */
    private void m9671b() {
        int i4 = this.f11081p * 2;
        C2869e c2869e = this.f11066a;
        this.f11080o = true;
        C2869e c2869e2 = c2869e;
        boolean z3 = false;
        while (!z3) {
            this.f11074i++;
            C2869e[] c2869eArr = c2869e.f11112C0;
            int i5 = this.f11081p;
            C2869e c2869e3 = null;
            c2869eArr[i5] = null;
            c2869e.f11110B0[i5] = null;
            if (c2869e.m9717P() != 8) {
                this.f11077l++;
                C2869e.b bVarM9757t = c2869e.m9757t(this.f11081p);
                C2869e.b bVar = C2869e.b.MATCH_CONSTRAINT;
                if (bVarM9757t != bVar) {
                    this.f11078m += c2869e.m9693B(this.f11081p);
                }
                int iM9676c = this.f11078m + c2869e.f11123L[i4].m9676c();
                this.f11078m = iM9676c;
                int i6 = i4 + 1;
                this.f11078m = iM9676c + c2869e.f11123L[i6].m9676c();
                int iM9676c2 = this.f11079n + c2869e.f11123L[i4].m9676c();
                this.f11079n = iM9676c2;
                this.f11079n = iM9676c2 + c2869e.f11123L[i6].m9676c();
                if (this.f11067b == null) {
                    this.f11067b = c2869e;
                }
                this.f11069d = c2869e;
                C2869e.b[] bVarArr = c2869e.f11126O;
                int i7 = this.f11081p;
                if (bVarArr[i7] == bVar) {
                    int[] iArr = c2869e.f11164n;
                    if (iArr[i7] == 0 || iArr[i7] == 3 || iArr[i7] == 2) {
                        this.f11075j++;
                        float[] fArr = c2869e.f11108A0;
                        float f4 = fArr[i7];
                        if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                            this.f11076k += fArr[i7];
                        }
                        if (m9672c(c2869e, i7)) {
                            if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
                                this.f11083r = true;
                            } else {
                                this.f11084s = true;
                            }
                            if (this.f11073h == null) {
                                this.f11073h = new ArrayList<>();
                            }
                            this.f11073h.add(c2869e);
                        }
                        if (this.f11071f == null) {
                            this.f11071f = c2869e;
                        }
                        C2869e c2869e4 = this.f11072g;
                        if (c2869e4 != null) {
                            c2869e4.f11110B0[this.f11081p] = c2869e;
                        }
                        this.f11072g = c2869e;
                    }
                    if (this.f11081p == 0) {
                        if (c2869e.f11160l != 0 || c2869e.f11166o != 0 || c2869e.f11168p != 0) {
                            this.f11080o = false;
                        }
                    } else if (c2869e.f11162m != 0 || c2869e.f11172r != 0 || c2869e.f11174s != 0) {
                        this.f11080o = false;
                    }
                    if (c2869e.f11130S != IGoodView.DEFAULT_TO_ALPHA) {
                        this.f11080o = false;
                        this.f11086u = true;
                    }
                }
            }
            if (c2869e2 != c2869e) {
                c2869e2.f11112C0[this.f11081p] = c2869e;
            }
            C2868d c2868d = c2869e.f11123L[i4 + 1].f11091d;
            if (c2868d != null) {
                C2869e c2869e5 = c2868d.f11089b;
                C2868d[] c2868dArr = c2869e5.f11123L;
                if (c2868dArr[i4].f11091d != null && c2868dArr[i4].f11091d.f11089b == c2869e) {
                    c2869e3 = c2869e5;
                }
            }
            if (c2869e3 == null) {
                c2869e3 = c2869e;
                z3 = true;
            }
            c2869e2 = c2869e;
            c2869e = c2869e3;
        }
        C2869e c2869e6 = this.f11067b;
        if (c2869e6 != null) {
            this.f11078m -= c2869e6.f11123L[i4].m9676c();
        }
        C2869e c2869e7 = this.f11069d;
        if (c2869e7 != null) {
            this.f11078m -= c2869e7.f11123L[i4 + 1].m9676c();
        }
        this.f11068c = c2869e;
        if (this.f11081p == 0 && this.f11082q) {
            this.f11070e = c2869e;
        } else {
            this.f11070e = this.f11066a;
        }
        this.f11085t = this.f11084s && this.f11083r;
    }

    /* renamed from: c */
    private static boolean m9672c(C2869e c2869e, int i4) {
        if (c2869e.m9717P() != 8 && c2869e.f11126O[i4] == C2869e.b.MATCH_CONSTRAINT) {
            int[] iArr = c2869e.f11164n;
            if (iArr[i4] == 0 || iArr[i4] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m9673a() {
        if (!this.f11087v) {
            m9671b();
        }
        this.f11087v = true;
    }
}
