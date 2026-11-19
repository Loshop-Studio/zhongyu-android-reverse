package androidx.compose.foundation;

import android.view.Surface;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6476h;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jw\u0010\u0014\u001a\u00020\u00112f\u0010\u0014\u001ab\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0007¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JV\u0010\u0017\u001a\u00020\u0011*\u00020\t2A\u0010\u0017\u001a=\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001a\u001a\u00020\u0011*\u00020\t2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0019¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#Rx\u0010\u0014\u001ad\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0007¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$RS\u0010%\u001a?\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R)\u0010'\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0019¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m5110d2 = {"Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Landroidx/compose/foundation/SurfaceScope;", "Lkotlinx/coroutines/v;", "scope", "<init>", "(Lkotlinx/coroutines/v;)V", "Lkotlin/Function5;", "Landroidx/compose/foundation/SurfaceCoroutineScope;", "Landroid/view/Surface;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "surface", "", "width", "height", "Lh6/c;", "Ld6/s;", "", "Lkotlin/ExtensionFunctionType;", "onSurface", "(Lr6/h;)V", "Lkotlin/Function3;", "onChanged", "(Landroid/view/Surface;Lr6/f;)V", "Lkotlin/Function1;", "onDestroyed", "(Landroid/view/Surface;Lr6/c;)V", "dispatchSurfaceCreated", "(Landroid/view/Surface;II)V", "dispatchSurfaceChanged", "dispatchSurfaceDestroyed", "(Landroid/view/Surface;)V", "Lkotlinx/coroutines/v;", "getScope", "()Lkotlinx/coroutines/v;", "Lr6/h;", "onSurfaceChanged", "Lr6/f;", "onSurfaceDestroyed", "Lr6/c;", "Lkotlinx/coroutines/w0;", "job", "Lkotlinx/coroutines/w0;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {

    @Nullable
    private InterfaceC6013w0 job;

    @Nullable
    private InterfaceC6476h onSurface;

    @Nullable
    private InterfaceC6474f onSurfaceChanged;

    @Nullable
    private InterfaceC6471c onSurfaceDestroyed;

    @NotNull
    private final InterfaceC6009v scope;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", m5303f = "AndroidExternalSurface.android.kt", m5304i = {0}, m5305l = {130, 136}, m5306m = "invokeSuspend", m5307n = {"$this$launch"}, m5308s = {"L$0"})
    /* renamed from: androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1 */
    public static final class C07361 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ int $height;
        final /* synthetic */ Surface $surface;
        final /* synthetic */ int $width;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07361(Surface surface, int i, int i8, InterfaceC5631c<? super C07361> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$surface = surface;
            this.$width = i;
            this.$height = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C07361 c07361 = BaseAndroidExternalSurfaceState.this.new C07361(this.$surface, this.$width, this.$height, interfaceC5631c);
            c07361.L$0 = obj;
            return c07361;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                kotlin.AbstractC5774b.m5119b(r10)
                goto L67
            L10:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L18:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                kotlin.AbstractC5774b.m5119b(r10)
                goto L3b
            L20:
                kotlin.AbstractC5774b.m5119b(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.v r1 = (kotlinx.coroutines.InterfaceC6009v) r1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                kotlinx.coroutines.w0 r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getJob$p(r10)
                if (r10 == 0) goto L3b
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = kotlinx.coroutines.AbstractC6014x.m5636g(r10, r9)
                if (r10 != r0) goto L3b
                goto L66
            L3b:
                androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 r4 = new androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                r4.<init>(r10, r1)
                androidx.compose.foundation.BaseAndroidExternalSurfaceState r10 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.this
                r6.h r3 = androidx.compose.foundation.BaseAndroidExternalSurfaceState.access$getOnSurface$p(r10)
                if (r3 == 0) goto L67
                android.view.Surface r5 = r9.$surface
                int r10 = r9.$width
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r10)
                int r10 = r9.$height
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r10)
                r10 = 0
                r9.L$0 = r10
                r9.label = r2
                r8 = r9
                java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L67
            L66:
                return r0
            L67:
                d6.s r10 = p045d6.C5443s.f8405a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BaseAndroidExternalSurfaceState.C07361.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C07361) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public BaseAndroidExternalSurfaceState(@NotNull InterfaceC6009v interfaceC6009v) {
        this.scope = interfaceC6009v;
    }

    public final void dispatchSurfaceChanged(@NotNull Surface surface, int width, int height) {
        InterfaceC6474f interfaceC6474f = this.onSurfaceChanged;
        if (interfaceC6474f != null) {
            interfaceC6474f.invoke(surface, Integer.valueOf(width), Integer.valueOf(height));
        }
    }

    public final void dispatchSurfaceCreated(@NotNull Surface surface, int width, int height) {
        if (this.onSurface != null) {
            this.job = AbstractC6014x.m5651v(this.scope, null, CoroutineStart.UNDISPATCHED, new C07361(surface, width, height, null), 1);
        }
    }

    public final void dispatchSurfaceDestroyed(@NotNull Surface surface) {
        InterfaceC6471c interfaceC6471c = this.onSurfaceDestroyed;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(surface);
        }
        InterfaceC6013w0 interfaceC6013w0 = this.job;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.job = null;
    }

    @NotNull
    public final InterfaceC6009v getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(@NotNull Surface surface, @NotNull InterfaceC6474f interfaceC6474f) {
        this.onSurfaceChanged = interfaceC6474f;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(@NotNull Surface surface, @NotNull InterfaceC6471c interfaceC6471c) {
        this.onSurfaceDestroyed = interfaceC6471c;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(@NotNull InterfaceC6476h onSurface) {
        this.onSurface = onSurface;
    }
}
