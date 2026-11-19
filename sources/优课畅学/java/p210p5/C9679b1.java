package p210p5;

import com.zykj.view.utils.ZoomPointSolution;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: p5.b1 */
/* loaded from: classes5.dex */
public final class C9679b1 {

    /* renamed from: a */
    public final ZoomPointSolution f19375a;

    /* renamed from: b */
    public final boolean f19376b;

    /* renamed from: c */
    public final boolean f19377c;

    /* renamed from: d */
    public final int f19378d;

    /* renamed from: e */
    public final int f19379e;

    /* renamed from: f */
    public final boolean f19380f;

    public C9679b1(ZoomPointSolution zoomPointSolution, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        AbstractC9133u.m16133g(zoomPointSolution, "zoomPointSolution");
        this.f19375a = zoomPointSolution;
        this.f19376b = z10;
        this.f19377c = z11;
        this.f19378d = i10;
        this.f19379e = i11;
        this.f19380f = z12;
    }

    /* renamed from: a */
    public final int m18249a() {
        return this.f19378d;
    }

    /* renamed from: b */
    public final int m18250b() {
        return this.f19379e;
    }

    /* renamed from: c */
    public final boolean m18251c() {
        return this.f19376b;
    }

    /* renamed from: d */
    public final boolean m18252d() {
        return this.f19377c;
    }

    /* renamed from: e */
    public final ZoomPointSolution m18253e() {
        return this.f19375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9679b1)) {
            return false;
        }
        C9679b1 c9679b1 = (C9679b1) obj;
        return this.f19375a == c9679b1.f19375a && this.f19376b == c9679b1.f19376b && this.f19377c == c9679b1.f19377c && this.f19378d == c9679b1.f19378d && this.f19379e == c9679b1.f19379e && this.f19380f == c9679b1.f19380f;
    }

    /* renamed from: f */
    public final boolean m18254f() {
        return this.f19380f;
    }

    public int hashCode() {
        return (((((((((this.f19375a.hashCode() * 31) + Boolean.hashCode(this.f19376b)) * 31) + Boolean.hashCode(this.f19377c)) * 31) + Integer.hashCode(this.f19378d)) * 31) + Integer.hashCode(this.f19379e)) * 31) + Boolean.hashCode(this.f19380f);
    }

    public String toString() {
        return "BoardSketchConfig(zoomPointSolution=" + this.f19375a + ", needCommitWithDeleteCache=" + this.f19376b + ", needTranslate=" + this.f19377c + ", defaultMoveRange=" + this.f19378d + ", maxImageCount=" + this.f19379e + ", isThumbnailContent=" + this.f19380f + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C9679b1(com.zykj.view.utils.ZoomPointSolution r3, boolean r4, boolean r5, int r6, int r7, boolean r8, int r9, kotlin.jvm.internal.AbstractC9126n r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.zykj.view.utils.ZoomPointSolution r3 = com.zykj.view.utils.ZoomPointSolution.f15561f
        L6:
            r10 = r9 & 2
            r0 = 1
            if (r10 == 0) goto Lc
            r4 = r0
        Lc:
            r10 = r9 & 4
            r1 = 0
            if (r10 == 0) goto L12
            r5 = r1
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L17
            r6 = r0
        L17:
            r10 = r9 & 16
            if (r10 == 0) goto L1c
            r7 = 3
        L1c:
            r9 = r9 & 32
            if (r9 == 0) goto L28
            r10 = r1
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L2f
        L28:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L2f:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p210p5.C9679b1.<init>(com.zykj.view.utils.ZoomPointSolution, boolean, boolean, int, int, boolean, int, kotlin.jvm.internal.n):void");
    }
}
