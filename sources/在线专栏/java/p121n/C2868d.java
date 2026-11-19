package p121n;

import java.util.HashSet;
import java.util.Iterator;
import p117m.C2851c;
import p117m.C2857i;

/* renamed from: n.d */
/* loaded from: classes.dex */
public class C2868d {

    /* renamed from: b */
    public final C2869e f11089b;

    /* renamed from: c */
    public final b f11090c;

    /* renamed from: d */
    public C2868d f11091d;

    /* renamed from: g */
    C2857i f11094g;

    /* renamed from: a */
    private HashSet<C2868d> f11088a = null;

    /* renamed from: e */
    public int f11092e = 0;

    /* renamed from: f */
    int f11093f = -1;

    /* renamed from: n.d$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11095a;

        static {
            int[] iArr = new int[b.values().length];
            f11095a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11095a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11095a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11095a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11095a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11095a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11095a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11095a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11095a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: n.d$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C2868d(C2869e c2869e, b bVar) {
        this.f11089b = c2869e;
        this.f11090c = bVar;
    }

    /* renamed from: a */
    public boolean m9674a(C2868d c2868d, int i4) {
        return m9675b(c2868d, i4, -1, false);
    }

    /* renamed from: b */
    public boolean m9675b(C2868d c2868d, int i4, int i5, boolean z3) {
        if (c2868d == null) {
            m9685l();
            return true;
        }
        if (!z3 && !m9684k(c2868d)) {
            return false;
        }
        this.f11091d = c2868d;
        if (c2868d.f11088a == null) {
            c2868d.f11088a = new HashSet<>();
        }
        this.f11091d.f11088a.add(this);
        if (i4 > 0) {
            this.f11092e = i4;
        } else {
            this.f11092e = 0;
        }
        this.f11093f = i5;
        return true;
    }

    /* renamed from: c */
    public int m9676c() {
        C2868d c2868d;
        if (this.f11089b.m9717P() == 8) {
            return 0;
        }
        return (this.f11093f <= -1 || (c2868d = this.f11091d) == null || c2868d.f11089b.m9717P() != 8) ? this.f11092e : this.f11093f;
    }

    /* renamed from: d */
    public final C2868d m9677d() {
        switch (a.f11095a[this.f11090c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f11089b.f11117F;
            case 3:
                return this.f11089b.f11113D;
            case 4:
                return this.f11089b.f11118G;
            case 5:
                return this.f11089b.f11115E;
            default:
                throw new AssertionError(this.f11090c.name());
        }
    }

    /* renamed from: e */
    public C2869e m9678e() {
        return this.f11089b;
    }

    /* renamed from: f */
    public C2857i m9679f() {
        return this.f11094g;
    }

    /* renamed from: g */
    public C2868d m9680g() {
        return this.f11091d;
    }

    /* renamed from: h */
    public b m9681h() {
        return this.f11090c;
    }

    /* renamed from: i */
    public boolean m9682i() {
        HashSet<C2868d> hashSet = this.f11088a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C2868d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m9677d().m9683j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean m9683j() {
        return this.f11091d != null;
    }

    /* renamed from: k */
    public boolean m9684k(C2868d c2868d) {
        if (c2868d == null) {
            return false;
        }
        b bVarM9681h = c2868d.m9681h();
        b bVar = this.f11090c;
        if (bVarM9681h == bVar) {
            return bVar != b.BASELINE || (c2868d.m9678e().m9721T() && m9678e().m9721T());
        }
        switch (a.f11095a[bVar.ordinal()]) {
            case 1:
                return (bVarM9681h == b.BASELINE || bVarM9681h == b.CENTER_X || bVarM9681h == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z3 = bVarM9681h == b.LEFT || bVarM9681h == b.RIGHT;
                if (c2868d.m9678e() instanceof C2872h) {
                    return z3 || bVarM9681h == b.CENTER_X;
                }
                return z3;
            case 4:
            case 5:
                boolean z4 = bVarM9681h == b.TOP || bVarM9681h == b.BOTTOM;
                if (c2868d.m9678e() instanceof C2872h) {
                    return z4 || bVarM9681h == b.CENTER_Y;
                }
                return z4;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f11090c.name());
        }
    }

    /* renamed from: l */
    public void m9685l() {
        HashSet<C2868d> hashSet;
        C2868d c2868d = this.f11091d;
        if (c2868d != null && (hashSet = c2868d.f11088a) != null) {
            hashSet.remove(this);
        }
        this.f11091d = null;
        this.f11092e = 0;
        this.f11093f = -1;
    }

    /* renamed from: m */
    public void m9686m(C2851c c2851c) {
        C2857i c2857i = this.f11094g;
        if (c2857i == null) {
            this.f11094g = new C2857i(C2857i.a.UNRESTRICTED, null);
        } else {
            c2857i.m9638d();
        }
    }

    /* renamed from: n */
    public void m9687n(int i4) {
        if (m9683j()) {
            this.f11093f = i4;
        }
    }

    public String toString() {
        return this.f11089b.m9755s() + ":" + this.f11090c.toString();
    }
}
