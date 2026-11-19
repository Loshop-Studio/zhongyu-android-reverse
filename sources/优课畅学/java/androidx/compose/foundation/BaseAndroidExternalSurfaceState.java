package androidx.compose.foundation;

import android.view.Surface;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10577s;

/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private InterfaceC9212n job;
    private InterfaceC10577s onSurface;
    private InterfaceC10575q onSurfaceChanged;
    private InterfaceC10570l onSurfaceDestroyed;
    private final InterfaceC8822b0 scope;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", m17801f = "AndroidExternalSurface.android.kt", m17802l = {130, 136}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 */
    public static final class C11451 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ int $height;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11451(Surface surface, int i10, int i11, InterfaceC9324c<? super C11451> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$surface = surface;
            this.$width = i10;
            this.$height = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C11451 c11451 = BaseAndroidExternalSurfaceState.this.new C11451(this.$surface, this.$width, this.$height, interfaceC9324c);
            c11451.L$0 = obj;
            return c11451;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C11451) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r10)
                goto L67
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.L$0
                i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                kotlin.AbstractC9079b.m15926b(r10)
                goto L3d
            L22:
                kotlin.AbstractC9079b.m15926b(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                i8.b0 r1 = (p135i8.InterfaceC8822b0) r1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                kotlinx.coroutines.n r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getJob$p(r10)
                if (r10 == 0) goto L3d
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = p135i8.AbstractC8823b1.m14811g(r10, r9)
                if (r10 != r0) goto L3d
                goto L66
            L3d:
                androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                r4.<init>(r10, r1)
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                x7.s r3 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getOnSurface$p(r10)
                if (r3 == 0) goto L67
                android.view.Surface r5 = r9.$surface
                int r10 = r9.$width
                java.lang.Integer r6 = p201o7.AbstractC9536a.m17798c(r10)
                int r10 = r9.$height
                java.lang.Integer r7 = p201o7.AbstractC9536a.m17798c(r10)
                r10 = 0
                r9.L$0 = r10
                r9.label = r2
                r8 = r9
                java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L67
            L66:
                return r0
            L67:
                h7.p r10 = p123h7.C8736p.f16368a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState.C11451.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BaseAndroidExternalSurfaceState(InterfaceC8822b0 interfaceC8822b0) {
        this.scope = interfaceC8822b0;
    }

    public final void dispatchSurfaceChanged(Surface surface, int i10, int i11) {
        InterfaceC10575q interfaceC10575q = this.onSurfaceChanged;
        if (interfaceC10575q != null) {
            interfaceC10575q.invoke(surface, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i10, int i11) {
        if (this.onSurface != null) {
            this.job = AbstractC8839h.m14861d(this.scope, null, CoroutineStart.f17555d, new C11451(surface, i10, i11, null), 1, null);
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        InterfaceC10570l interfaceC10570l = this.onSurfaceDestroyed;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(surface);
        }
        InterfaceC9212n interfaceC9212n = this.job;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.job = null;
    }

    public final InterfaceC8822b0 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, InterfaceC10575q interfaceC10575q) {
        this.onSurfaceChanged = interfaceC10575q;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, InterfaceC10570l interfaceC10570l) {
        this.onSurfaceDestroyed = interfaceC10570l;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(InterfaceC10577s interfaceC10577s) {
        this.onSurface = interfaceC10577s;
    }
}
