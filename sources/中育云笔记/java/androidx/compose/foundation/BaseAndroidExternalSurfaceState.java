package androidx.compose.foundation;

import android.view.Surface;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9547s;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private InterfaceC10045g job;
    private InterfaceC9547s onSurface;
    private InterfaceC9545q onSurfaceChanged;
    private InterfaceC9540l onSurfaceDestroyed;
    private final InterfaceC11122i0 scope;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", m26211f = "AndroidExternalSurface.android.kt", m26212l = {130, PatchStatus.CODE_LOAD_LIB_INJECT}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 */
    public static final class C11751 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ int $height;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11751(Surface surface, int i10, int i11, InterfaceC11588c<? super C11751> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$surface = surface;
            this.$width = i10;
            this.$height = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C11751 c11751 = BaseAndroidExternalSurfaceState.this.new C11751(this.$surface, this.$width, this.$height, interfaceC11588c);
            c11751.L$0 = obj;
            return c11751;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r10)
                goto L67
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.L$0
                sd.i0 r1 = (sd.InterfaceC11122i0) r1
                kotlin.AbstractC9924b.m20071b(r10)
                goto L3d
            L22:
                kotlin.AbstractC9924b.m20071b(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                sd.i0 r1 = (sd.InterfaceC11122i0) r1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                kotlinx.coroutines.g r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getJob$p(r10)
                if (r10 == 0) goto L3d
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = sd.AbstractC11147o1.m24773g(r10, r9)
                if (r10 != r0) goto L3d
                goto L66
            L3d:
                androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                r4.<init>(r10, r1)
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                hd.s r3 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getOnSurface$p(r10)
                if (r3 == 0) goto L67
                android.view.Surface r5 = r9.$surface
                int r10 = r9.$width
                java.lang.Integer r6 = p409xc.AbstractC11826a.m26208c(r10)
                int r10 = r9.$height
                java.lang.Integer r7 = p409xc.AbstractC11826a.m26208c(r10)
                r10 = 0
                r9.L$0 = r10
                r9.label = r2
                r8 = r9
                java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L67
            L66:
                return r0
            L67:
                qc.q r10 = p309qc.C10786q.f26013a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState.C11751.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C11751) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public BaseAndroidExternalSurfaceState(InterfaceC11122i0 interfaceC11122i0) {
        this.scope = interfaceC11122i0;
    }

    public final void dispatchSurfaceChanged(Surface surface, int i10, int i11) {
        InterfaceC9545q interfaceC9545q = this.onSurfaceChanged;
        if (interfaceC9545q != null) {
            interfaceC9545q.invoke(surface, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i10, int i11) {
        if (this.onSurface != null) {
            this.job = AbstractC11117h.m24726d(this.scope, null, CoroutineStart.f23479f, new C11751(surface, i10, i11, null), 1, null);
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        InterfaceC9540l interfaceC9540l = this.onSurfaceDestroyed;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(surface);
        }
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.job = null;
    }

    public final InterfaceC11122i0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, InterfaceC9545q interfaceC9545q) {
        this.onSurfaceChanged = interfaceC9545q;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, InterfaceC9540l interfaceC9540l) {
        this.onSurfaceDestroyed = interfaceC9540l;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(InterfaceC9547s interfaceC9547s) {
        this.onSurface = interfaceC9547s;
    }
}
