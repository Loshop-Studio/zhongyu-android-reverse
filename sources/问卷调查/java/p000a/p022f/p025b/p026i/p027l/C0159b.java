package p000a.p022f.p025b.p026i.p027l;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.C0151e;

/* renamed from: a.f.b.i.l.b */
/* loaded from: classes.dex */
public class C0159b {

    /* renamed from: a */
    public final ArrayList<C0150d> f1156a = new ArrayList<>();

    /* renamed from: b */
    public a f1157b = new a();

    /* renamed from: c */
    public C0151e f1158c;

    /* renamed from: a.f.b.i.l.b$a */
    public static class a {

        /* renamed from: a */
        public C0150d.a f1159a;

        /* renamed from: b */
        public C0150d.a f1160b;

        /* renamed from: c */
        public int f1161c;

        /* renamed from: d */
        public int f1162d;

        /* renamed from: e */
        public int f1163e;

        /* renamed from: f */
        public int f1164f;

        /* renamed from: g */
        public int f1165g;

        /* renamed from: h */
        public boolean f1166h;

        /* renamed from: i */
        public boolean f1167i;

        /* renamed from: j */
        public boolean f1168j;
    }

    /* renamed from: a.f.b.i.l.b$b */
    public interface b {
    }

    public C0159b(C0151e c0151e) {
        this.f1158c = c0151e;
    }

    /* renamed from: a */
    public final boolean m625a(b bVar, C0150d c0150d, boolean z) {
        C0150d.a aVar = C0150d.a.FIXED;
        this.f1157b.f1159a = c0150d.m599j();
        this.f1157b.f1160b = c0150d.m603n();
        this.f1157b.f1161c = c0150d.m604o();
        this.f1157b.f1162d = c0150d.m598i();
        a aVar2 = this.f1157b;
        aVar2.f1167i = false;
        aVar2.f1168j = z;
        C0150d.a aVar3 = aVar2.f1159a;
        C0150d.a aVar4 = C0150d.a.MATCH_CONSTRAINT;
        boolean z2 = aVar3 == aVar4;
        boolean z3 = aVar2.f1160b == aVar4;
        boolean z4 = z2 && c0150d.f1085N > 0.0f;
        boolean z5 = z3 && c0150d.f1085N > 0.0f;
        if (z4 && c0150d.f1113l[0] == 4) {
            aVar2.f1159a = aVar;
        }
        if (z5 && c0150d.f1113l[1] == 4) {
            aVar2.f1160b = aVar;
        }
        ((ConstraintLayout.C0500b) bVar).m1643a(c0150d, aVar2);
        c0150d.m590B(this.f1157b.f1163e);
        c0150d.m612w(this.f1157b.f1164f);
        a aVar5 = this.f1157b;
        c0150d.f1124w = aVar5.f1166h;
        int i = aVar5.f1165g;
        c0150d.f1089R = i;
        c0150d.f1124w = i > 0;
        aVar5.f1168j = false;
        return aVar5.f1167i;
    }

    /* renamed from: b */
    public final void m626b(C0151e c0151e, int i, int i2) {
        int i3 = c0151e.f1090S;
        int i4 = c0151e.f1091T;
        c0151e.m615z(0);
        c0151e.m614y(0);
        c0151e.f1083L = i;
        int i5 = c0151e.f1090S;
        if (i < i5) {
            c0151e.f1083L = i5;
        }
        c0151e.f1084M = i2;
        int i6 = c0151e.f1091T;
        if (i2 < i6) {
            c0151e.f1084M = i6;
        }
        c0151e.m615z(i3);
        c0151e.m614y(i4);
        this.f1158c.mo616E();
    }
}
