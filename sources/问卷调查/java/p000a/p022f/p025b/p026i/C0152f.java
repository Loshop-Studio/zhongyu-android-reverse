package p000a.p022f.p025b.p026i;

import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import p000a.p022f.p025b.C0140b;
import p000a.p022f.p025b.C0142d;
import p000a.p022f.p025b.C0145g;
import p000a.p022f.p025b.p026i.C0149c;
import p000a.p022f.p025b.p026i.C0150d;

/* renamed from: a.f.b.i.f */
/* loaded from: classes.dex */
public class C0152f extends C0150d {

    /* renamed from: e0 */
    public float f1147e0 = -1.0f;

    /* renamed from: f0 */
    public int f1148f0 = -1;

    /* renamed from: g0 */
    public int f1149g0 = -1;

    /* renamed from: h0 */
    public C0149c f1150h0 = this.f1127z;

    /* renamed from: i0 */
    public int f1151i0 = 0;

    public C0152f() {
        this.f1079H.clear();
        this.f1079H.add(this.f1150h0);
        int length = this.f1078G.length;
        for (int i = 0; i < length; i++) {
            this.f1078G[i] = this.f1150h0;
        }
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: D */
    public void mo592D(C0142d c0142d) {
        if (this.f1082K == null) {
            return;
        }
        int iM563o = c0142d.m563o(this.f1150h0);
        if (this.f1151i0 == 1) {
            this.f1087P = iM563o;
            this.f1088Q = 0;
            m612w(this.f1082K.m598i());
            m590B(0);
            return;
        }
        this.f1087P = 0;
        this.f1088Q = iM563o;
        m590B(this.f1082K.m604o());
        m612w(0);
    }

    /* renamed from: E */
    public void m622E(int i) {
        if (this.f1151i0 == i) {
            return;
        }
        this.f1151i0 = i;
        this.f1079H.clear();
        this.f1150h0 = this.f1151i0 == 1 ? this.f1126y : this.f1127z;
        this.f1079H.add(this.f1150h0);
        int length = this.f1078G.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f1078G[i2] = this.f1150h0;
        }
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: b */
    public void mo581b(C0142d c0142d) {
        C0150d.a aVar = C0150d.a.WRAP_CONTENT;
        C0151e c0151e = (C0151e) this.f1082K;
        if (c0151e == null) {
            return;
        }
        C0149c c0149cMo595f = c0151e.mo595f(C0149c.a.LEFT);
        C0149c c0149cMo595f2 = c0151e.mo595f(C0149c.a.RIGHT);
        C0150d c0150d = this.f1082K;
        boolean z = c0150d != null && c0150d.f1081J[0] == aVar;
        if (this.f1151i0 == 0) {
            c0149cMo595f = c0151e.mo595f(C0149c.a.TOP);
            c0149cMo595f2 = c0151e.mo595f(C0149c.a.BOTTOM);
            C0150d c0150d2 = this.f1082K;
            z = c0150d2 != null && c0150d2.f1081J[1] == aVar;
        }
        if (this.f1148f0 != -1) {
            C0145g c0145gM560l = c0142d.m560l(this.f1150h0);
            c0142d.m552d(c0145gM560l, c0142d.m560l(c0149cMo595f), this.f1148f0, 8);
            if (z) {
                c0142d.m554f(c0142d.m560l(c0149cMo595f2), c0145gM560l, 0, 5);
                return;
            }
            return;
        }
        if (this.f1149g0 != -1) {
            C0145g c0145gM560l2 = c0142d.m560l(this.f1150h0);
            C0145g c0145gM560l3 = c0142d.m560l(c0149cMo595f2);
            c0142d.m552d(c0145gM560l2, c0145gM560l3, -this.f1149g0, 8);
            if (z) {
                c0142d.m554f(c0145gM560l2, c0142d.m560l(c0149cMo595f), 0, 5);
                c0142d.m554f(c0145gM560l3, c0145gM560l2, 0, 5);
                return;
            }
            return;
        }
        if (this.f1147e0 != -1.0f) {
            C0145g c0145gM560l4 = c0142d.m560l(this.f1150h0);
            C0145g c0145gM560l5 = c0142d.m560l(c0149cMo595f2);
            float f2 = this.f1147e0;
            C0140b c0140bM561m = c0142d.m561m();
            c0140bM561m.f969d.mo535j(c0145gM560l4, -1.0f);
            c0140bM561m.f969d.mo535j(c0145gM560l5, f2);
            c0142d.m551c(c0140bM561m);
        }
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: c */
    public boolean mo582c() {
        return true;
    }

    @Override // p000a.p022f.p025b.p026i.C0150d
    /* renamed from: f */
    public C0149c mo595f(C0149c.a aVar) {
        switch (aVar.ordinal()) {
            case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
            case 3:
                if (this.f1151i0 == 1) {
                    return this.f1150h0;
                }
                break;
            case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
            case 4:
                if (this.f1151i0 == 0) {
                    return this.f1150h0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}
