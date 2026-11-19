package coil3.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.compose.AsyncImagePainter$launchJob$1", m13451f = "AsyncImagePainter.kt", m13452i = {}, m13453l = {228, 232}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class AsyncImagePainter$launchJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f2791a;

    /* renamed from: b */
    public int f2792b;

    /* renamed from: c */
    public final /* synthetic */ AsyncImagePainter f2793c;

    /* renamed from: d */
    public final /* synthetic */ AsyncImagePainter.C5306b f2794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$launchJob$1(AsyncImagePainter asyncImagePainter, AsyncImagePainter.C5306b c5306b, Continuation continuation) {
        super(2, continuation);
        this.f2793c = asyncImagePainter;
        this.f2794d = c5306b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncImagePainter$launchJob$1(this.f2793c, this.f2794d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r5 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f2792b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r4.f2791a
            coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L6c
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L48
        L22:
            kotlin.ResultKt.throwOnFailure(r5)
            coil3.compose.AsyncImagePainter r5 = r4.f2793c
            coil3.compose.AsyncImagePreviewHandler r5 = r5.getPreviewHandler()
            if (r5 == 0) goto L4b
            coil3.compose.AsyncImagePainter r1 = r4.f2793c
            coil3.compose.AsyncImagePainter$b r2 = r4.f2794d
            y.e r2 = r2.m2650b()
            y.e r1 = coil3.compose.AsyncImagePainter.m2626e(r1, r2, r3)
            coil3.compose.AsyncImagePainter$b r2 = r4.f2794d
            coil3.e r2 = r2.m2649a()
            r4.f2792b = r3
            java.lang.Object r5 = r5.mo2657a(r2, r1, r4)
            if (r5 != r0) goto L48
            goto L6a
        L48:
            coil3.compose.AsyncImagePainter$c r5 = (coil3.compose.AsyncImagePainter.InterfaceC5307c) r5
            goto L72
        L4b:
            coil3.compose.AsyncImagePainter r5 = r4.f2793c
            coil3.compose.AsyncImagePainter$b r1 = r4.f2794d
            y.e r1 = r1.m2650b()
            r3 = 0
            y.e r5 = coil3.compose.AsyncImagePainter.m2626e(r5, r1, r3)
            coil3.compose.AsyncImagePainter r1 = r4.f2793c
            coil3.compose.AsyncImagePainter$b r3 = r4.f2794d
            coil3.e r3 = r3.m2649a()
            r4.f2791a = r1
            r4.f2792b = r2
            java.lang.Object r5 = r3.mo2547c(r5, r4)
            if (r5 != r0) goto L6b
        L6a:
            return r0
        L6b:
            r0 = r1
        L6c:
            y.j r5 = (p297y.InterfaceC9929j) r5
            coil3.compose.AsyncImagePainter$c r5 = coil3.compose.AsyncImagePainter.m2625d(r0, r5)
        L72:
            coil3.compose.AsyncImagePainter r0 = r4.f2793c
            coil3.compose.AsyncImagePainter.m2627f(r0, r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AsyncImagePainter$launchJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
