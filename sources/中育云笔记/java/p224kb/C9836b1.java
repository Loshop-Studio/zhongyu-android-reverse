package p224kb;

import com.zykj.view.utils.ZoomPointSolution;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: kb.b1 */
/* loaded from: classes6.dex */
public final class C9836b1 {

    /* renamed from: a */
    public final ZoomPointSolution f23136a;

    /* renamed from: b */
    public final boolean f23137b;

    /* renamed from: c */
    public final boolean f23138c;

    /* renamed from: d */
    public final int f23139d;

    /* renamed from: e */
    public final int f23140e;

    /* renamed from: f */
    public final boolean f23141f;

    public C9836b1(ZoomPointSolution zoomPointSolution, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        AbstractC9979u.m20294g(zoomPointSolution, "zoomPointSolution");
        this.f23136a = zoomPointSolution;
        this.f23137b = z10;
        this.f23138c = z11;
        this.f23139d = i10;
        this.f23140e = i11;
        this.f23141f = z12;
    }

    /* renamed from: a */
    public final int m19946a() {
        return this.f23139d;
    }

    /* renamed from: b */
    public final int m19947b() {
        return this.f23140e;
    }

    /* renamed from: c */
    public final boolean m19948c() {
        return this.f23137b;
    }

    /* renamed from: d */
    public final boolean m19949d() {
        return this.f23138c;
    }

    /* renamed from: e */
    public final ZoomPointSolution m19950e() {
        return this.f23136a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9836b1)) {
            return false;
        }
        C9836b1 c9836b1 = (C9836b1) obj;
        return this.f23136a == c9836b1.f23136a && this.f23137b == c9836b1.f23137b && this.f23138c == c9836b1.f23138c && this.f23139d == c9836b1.f23139d && this.f23140e == c9836b1.f23140e && this.f23141f == c9836b1.f23141f;
    }

    /* renamed from: f */
    public final boolean m19951f() {
        return this.f23141f;
    }

    public int hashCode() {
        return (((((((((this.f23136a.hashCode() * 31) + Boolean.hashCode(this.f23137b)) * 31) + Boolean.hashCode(this.f23138c)) * 31) + Integer.hashCode(this.f23139d)) * 31) + Integer.hashCode(this.f23140e)) * 31) + Boolean.hashCode(this.f23141f);
    }

    public String toString() {
        return "BoardSketchConfig(zoomPointSolution=" + this.f23136a + ", needCommitWithDeleteCache=" + this.f23137b + ", needTranslate=" + this.f23138c + ", defaultMoveRange=" + this.f23139d + ", maxImageCount=" + this.f23140e + ", isThumbnailContent=" + this.f23141f + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C9836b1(com.zykj.view.utils.ZoomPointSolution r3, boolean r4, boolean r5, int r6, int r7, boolean r8, int r9, kotlin.jvm.internal.AbstractC9972n r10) {
        /*
            r2 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.zykj.view.utils.ZoomPointSolution r3 = com.zykj.view.utils.ZoomPointSolution.f20775h
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
        throw new UnsupportedOperationException("Method not decompiled: p224kb.C9836b1.<init>(com.zykj.view.utils.ZoomPointSolution, boolean, boolean, int, int, boolean, int, kotlin.jvm.internal.n):void");
    }
}
