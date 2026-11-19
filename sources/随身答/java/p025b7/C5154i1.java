package p025b7;

import com.zykj.view.utils.ZoomPointSolution;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b7.i1 */
/* loaded from: classes5.dex */
public final class C5154i1 {

    /* renamed from: a */
    public final ZoomPointSolution f2308a;

    /* renamed from: b */
    public final boolean f2309b;

    /* renamed from: c */
    public final boolean f2310c;

    /* renamed from: d */
    public final int f2311d;

    /* renamed from: e */
    public final int f2312e;

    /* renamed from: f */
    public final boolean f2313f;

    /* renamed from: g */
    public final boolean f2314g;

    public C5154i1(ZoomPointSolution zoomPointSolution, boolean z9, boolean z10, int i9, int i10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(zoomPointSolution, "zoomPointSolution");
        this.f2308a = zoomPointSolution;
        this.f2309b = z9;
        this.f2310c = z10;
        this.f2311d = i9;
        this.f2312e = i10;
        this.f2313f = z11;
        this.f2314g = z12;
    }

    /* renamed from: a */
    public final int m2237a() {
        return this.f2311d;
    }

    /* renamed from: b */
    public final int m2238b() {
        return this.f2312e;
    }

    /* renamed from: c */
    public final boolean m2239c() {
        return this.f2309b;
    }

    /* renamed from: d */
    public final boolean m2240d() {
        return this.f2310c;
    }

    /* renamed from: e */
    public final boolean m2241e() {
        return this.f2314g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5154i1)) {
            return false;
        }
        C5154i1 c5154i1 = (C5154i1) obj;
        return this.f2308a == c5154i1.f2308a && this.f2309b == c5154i1.f2309b && this.f2310c == c5154i1.f2310c && this.f2311d == c5154i1.f2311d && this.f2312e == c5154i1.f2312e && this.f2313f == c5154i1.f2313f && this.f2314g == c5154i1.f2314g;
    }

    /* renamed from: f */
    public final ZoomPointSolution m2242f() {
        return this.f2308a;
    }

    /* renamed from: g */
    public final boolean m2243g() {
        return this.f2313f;
    }

    public int hashCode() {
        return (((((((((((this.f2308a.hashCode() * 31) + Boolean.hashCode(this.f2309b)) * 31) + Boolean.hashCode(this.f2310c)) * 31) + Integer.hashCode(this.f2311d)) * 31) + Integer.hashCode(this.f2312e)) * 31) + Boolean.hashCode(this.f2313f)) * 31) + Boolean.hashCode(this.f2314g);
    }

    public String toString() {
        return "BoardSketchConfig(zoomPointSolution=" + this.f2308a + ", needCommitWithDeleteCache=" + this.f2309b + ", needTranslate=" + this.f2310c + ", defaultMoveRange=" + this.f2311d + ", maxImageCount=" + this.f2312e + ", isThumbnailContent=" + this.f2313f + ", zoomFiveLevel=" + this.f2314g + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C5154i1(com.zykj.view.utils.ZoomPointSolution r3, boolean r4, boolean r5, int r6, int r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.zykj.view.utils.ZoomPointSolution r3 = com.zykj.view.utils.ZoomPointSolution.f12917f
        L6:
            r11 = r10 & 2
            r0 = 1
            if (r11 == 0) goto Lc
            r4 = r0
        Lc:
            r11 = r10 & 4
            r1 = 0
            if (r11 == 0) goto L12
            r5 = r1
        L12:
            r11 = r10 & 8
            if (r11 == 0) goto L17
            r6 = r0
        L17:
            r11 = r10 & 16
            if (r11 == 0) goto L1c
            r7 = 3
        L1c:
            r11 = r10 & 32
            if (r11 == 0) goto L21
            r8 = r1
        L21:
            r10 = r10 & 64
            if (r10 == 0) goto L2e
            r11 = r1
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L36
        L2e:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L36:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p025b7.C5154i1.<init>(com.zykj.view.utils.ZoomPointSolution, boolean, boolean, int, int, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
