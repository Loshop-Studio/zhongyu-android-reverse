package p000a.p022f.p025b.p026i;

import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import java.util.HashSet;
import java.util.Iterator;
import p000a.p022f.p025b.C0145g;

/* renamed from: a.f.b.i.c */
/* loaded from: classes.dex */
public class C0149c {

    /* renamed from: b */
    public final C0150d f1056b;

    /* renamed from: c */
    public final a f1057c;

    /* renamed from: d */
    public C0149c f1058d;

    /* renamed from: g */
    public C0145g f1061g;

    /* renamed from: a */
    public HashSet<C0149c> f1055a = null;

    /* renamed from: e */
    public int f1059e = 0;

    /* renamed from: f */
    public int f1060f = -1;

    /* renamed from: a.f.b.i.c$a */
    public enum a {
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

    public C0149c(C0150d c0150d, a aVar) {
        this.f1056b = c0150d;
        this.f1057c = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m583a(p000a.p022f.p025b.p026i.C0149c r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L7
            r6.m587e()
            return r0
        L7:
            r1 = 0
            if (r10 != 0) goto L75
            a.f.b.i.c$a r10 = p000a.p022f.p025b.p026i.C0149c.a.CENTER_Y
            a.f.b.i.c$a r2 = p000a.p022f.p025b.p026i.C0149c.a.CENTER_X
            a.f.b.i.c$a r3 = p000a.p022f.p025b.p026i.C0149c.a.BASELINE
            a.f.b.i.c$a r4 = r7.f1057c
            a.f.b.i.c$a r5 = r6.f1057c
            if (r4 != r5) goto L25
            if (r5 != r3) goto L3e
            a.f.b.i.d r10 = r7.f1056b
            boolean r10 = r10.f1124w
            if (r10 == 0) goto L40
            a.f.b.i.d r10 = r6.f1056b
            boolean r10 = r10.f1124w
            if (r10 != 0) goto L3e
            goto L40
        L25:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L40;
                case 1: goto L5b;
                case 2: goto L42;
                case 3: goto L5b;
                case 4: goto L42;
                case 5: goto L40;
                case 6: goto L38;
                case 7: goto L40;
                case 8: goto L40;
                default: goto L2c;
            }
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            a.f.b.i.c$a r8 = r6.f1057c
            java.lang.String r8 = r8.name()
            r7.<init>(r8)
            throw r7
        L38:
            if (r4 == r3) goto L40
            if (r4 == r2) goto L40
            if (r4 == r10) goto L40
        L3e:
            r10 = r0
            goto L72
        L40:
            r10 = r1
            goto L72
        L42:
            a.f.b.i.c$a r2 = p000a.p022f.p025b.p026i.C0149c.a.TOP
            if (r4 == r2) goto L4d
            a.f.b.i.c$a r2 = p000a.p022f.p025b.p026i.C0149c.a.BOTTOM
            if (r4 != r2) goto L4b
            goto L4d
        L4b:
            r2 = r1
            goto L4e
        L4d:
            r2 = r0
        L4e:
            a.f.b.i.d r3 = r7.f1056b
            boolean r3 = r3 instanceof p000a.p022f.p025b.p026i.C0152f
            if (r3 == 0) goto L59
            if (r2 != 0) goto L3e
            if (r4 != r10) goto L40
            goto L3e
        L59:
            r10 = r2
            goto L72
        L5b:
            a.f.b.i.c$a r10 = p000a.p022f.p025b.p026i.C0149c.a.LEFT
            if (r4 == r10) goto L66
            a.f.b.i.c$a r10 = p000a.p022f.p025b.p026i.C0149c.a.RIGHT
            if (r4 != r10) goto L64
            goto L66
        L64:
            r10 = r1
            goto L67
        L66:
            r10 = r0
        L67:
            a.f.b.i.d r3 = r7.f1056b
            boolean r3 = r3 instanceof p000a.p022f.p025b.p026i.C0152f
            if (r3 == 0) goto L72
            if (r10 != 0) goto L3e
            if (r4 != r2) goto L40
            goto L3e
        L72:
            if (r10 != 0) goto L75
            return r1
        L75:
            r6.f1058d = r7
            java.util.HashSet<a.f.b.i.c> r10 = r7.f1055a
            if (r10 != 0) goto L82
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r7.f1055a = r10
        L82:
            a.f.b.i.c r7 = r6.f1058d
            java.util.HashSet<a.f.b.i.c> r7 = r7.f1055a
            r7.add(r6)
            if (r8 <= 0) goto L8e
            r6.f1059e = r8
            goto L90
        L8e:
            r6.f1059e = r1
        L90:
            r6.f1060f = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p025b.p026i.C0149c.m583a(a.f.b.i.c, int, int, boolean):boolean");
    }

    /* renamed from: b */
    public int m584b() {
        C0149c c0149c;
        if (this.f1056b.f1095X == 8) {
            return 0;
        }
        int i = this.f1060f;
        return (i <= -1 || (c0149c = this.f1058d) == null || c0149c.f1056b.f1095X != 8) ? this.f1059e : i;
    }

    /* renamed from: c */
    public boolean m585c() {
        C0149c c0149c;
        HashSet<C0149c> hashSet = this.f1055a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0149c> it = hashSet.iterator();
        while (it.hasNext()) {
            C0149c next = it.next();
            switch (next.f1057c.ordinal()) {
                case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                case 5:
                case 6:
                case 7:
                case 8:
                    c0149c = null;
                    break;
                case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                    c0149c = next.f1056b.f1072A;
                    break;
                case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                    c0149c = next.f1056b.f1073B;
                    break;
                case 3:
                    c0149c = next.f1056b.f1126y;
                    break;
                case 4:
                    c0149c = next.f1056b.f1127z;
                    break;
                default:
                    throw new AssertionError(next.f1057c.name());
            }
            if (c0149c.m586d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m586d() {
        return this.f1058d != null;
    }

    /* renamed from: e */
    public void m587e() {
        HashSet<C0149c> hashSet;
        C0149c c0149c = this.f1058d;
        if (c0149c != null && (hashSet = c0149c.f1055a) != null) {
            hashSet.remove(this);
        }
        this.f1058d = null;
        this.f1059e = 0;
        this.f1060f = -1;
    }

    /* renamed from: f */
    public void m588f() {
        C0145g c0145g = this.f1061g;
        if (c0145g == null) {
            this.f1061g = new C0145g(C0145g.a.UNRESTRICTED);
        } else {
            c0145g.m575c();
        }
    }

    public String toString() {
        return this.f1056b.f1096Y + ":" + this.f1057c.toString();
    }
}
