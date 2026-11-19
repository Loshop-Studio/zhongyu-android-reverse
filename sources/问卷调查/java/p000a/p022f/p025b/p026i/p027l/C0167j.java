package p000a.p022f.p025b.p026i.p027l;

import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.p027l.C0163f;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.f.b.i.l.j */
/* loaded from: classes.dex */
public class C0167j extends AbstractC0170m {

    /* renamed from: k */
    public static int[] f1201k = new int[2];

    public C0167j(C0150d c0150d) {
        super(c0150d);
        this.f1214h.f1183e = C0163f.a.LEFT;
        this.f1215i.f1183e = C0163f.a.RIGHT;
        this.f1212f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0264, code lost:
    
        if (r7 != 1) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m, p000a.p022f.p025b.p026i.p027l.InterfaceC0161d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo627a(p000a.p022f.p025b.p026i.p027l.InterfaceC0161d r18) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.C0167j.mo627a(a.f.b.i.l.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo628d() {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.p027l.C0167j.mo628d():void");
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: e */
    public void mo629e() {
        C0163f c0163f = this.f1214h;
        if (c0163f.f1188j) {
            this.f1208b.f1087P = c0163f.f1185g;
        }
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: f */
    public void mo630f() {
        this.f1209c = null;
        this.f1214h.m642b();
        this.f1215i.m642b();
        this.f1211e.m642b();
        this.f1213g = false;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.AbstractC0170m
    /* renamed from: k */
    public boolean mo632k() {
        return this.f1210d != C0150d.a.MATCH_CONSTRAINT || this.f1208b.f1111j == 0;
    }

    /* renamed from: m */
    public final void m646m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* renamed from: n */
    public void m647n() {
        this.f1213g = false;
        this.f1214h.m642b();
        this.f1214h.f1188j = false;
        this.f1215i.m642b();
        this.f1215i.f1188j = false;
        this.f1211e.f1188j = false;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("HorizontalRun ");
        sbM2079g.append(this.f1208b.f1096Y);
        return sbM2079g.toString();
    }
}
