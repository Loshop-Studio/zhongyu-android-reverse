package coil3.compose;

import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.compose.AsyncImagePainter$launchJob$1", m7918f = "AsyncImagePainter.kt", m7919i = {0, 0, 1, 1}, m7920l = {234, 238}, m7921m = "invokeSuspend", m7922n = {"previewHandler", "request", "previewHandler", "request"}, m7923s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class AsyncImagePainter$launchJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f1540a;

    /* renamed from: b */
    public Object f1541b;

    /* renamed from: c */
    public Object f1542c;

    /* renamed from: d */
    public int f1543d;

    /* renamed from: e */
    public final /* synthetic */ AsyncImagePainter f1544e;

    /* renamed from: f */
    public final /* synthetic */ AsyncImagePainter.C4552b f1545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$launchJob$1(AsyncImagePainter asyncImagePainter, AsyncImagePainter.C4552b c4552b, Continuation continuation) {
        super(2, continuation);
        this.f1544e = asyncImagePainter;
        this.f1545f = c4552b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncImagePainter$launchJob$1(this.f1544e, this.f1545f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f1543d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r5.f1542c
            coil3.compose.AsyncImagePainter r0 = (coil3.compose.AsyncImagePainter) r0
            java.lang.Object r1 = r5.f1541b
            y.e r1 = (p187y.C7872e) r1
            java.lang.Object r1 = r5.f1540a
            coil3.compose.AsyncImagePreviewHandler r1 = (coil3.compose.AsyncImagePreviewHandler) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L95
        L1f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L27:
            java.lang.Object r0 = r5.f1541b
            y.e r0 = (p187y.C7872e) r0
            java.lang.Object r0 = r5.f1540a
            coil3.compose.AsyncImagePreviewHandler r0 = (coil3.compose.AsyncImagePreviewHandler) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L65
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            coil3.compose.AsyncImagePainter r6 = r5.f1544e
            coil3.compose.AsyncImagePreviewHandler r6 = r6.getPreviewHandler()
            if (r6 == 0) goto L68
            coil3.compose.AsyncImagePainter r1 = r5.f1544e
            coil3.compose.AsyncImagePainter$b r2 = r5.f1545f
            y.e r2 = r2.m1756b()
            y.e r1 = coil3.compose.AsyncImagePainter.m1732e(r1, r2, r3)
            coil3.compose.AsyncImagePainter$b r2 = r5.f1545f
            coil3.e r2 = r2.m1755a()
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.f1540a = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r5.f1541b = r4
            r5.f1543d = r3
            java.lang.Object r6 = r6.mo1760a(r2, r1, r5)
            if (r6 != r0) goto L65
            goto L93
        L65:
            coil3.compose.AsyncImagePainter$c r6 = (coil3.compose.AsyncImagePainter.InterfaceC4553c) r6
            goto L9b
        L68:
            coil3.compose.AsyncImagePainter r1 = r5.f1544e
            coil3.compose.AsyncImagePainter$b r3 = r5.f1545f
            y.e r3 = r3.m1756b()
            r4 = 0
            y.e r1 = coil3.compose.AsyncImagePainter.m1732e(r1, r3, r4)
            coil3.compose.AsyncImagePainter r3 = r5.f1544e
            coil3.compose.AsyncImagePainter$b r4 = r5.f1545f
            coil3.e r4 = r4.m1755a()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.f1540a = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r5.f1541b = r6
            r5.f1542c = r3
            r5.f1543d = r2
            java.lang.Object r6 = r4.mo1652c(r1, r5)
            if (r6 != r0) goto L94
        L93:
            return r0
        L94:
            r0 = r3
        L95:
            y.j r6 = (p187y.InterfaceC7877j) r6
            coil3.compose.AsyncImagePainter$c r6 = coil3.compose.AsyncImagePainter.m1731d(r0, r6)
        L9b:
            coil3.compose.AsyncImagePainter r0 = r5.f1544e
            coil3.compose.AsyncImagePainter.m1733f(r0, r6)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter$launchJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AsyncImagePainter$launchJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
