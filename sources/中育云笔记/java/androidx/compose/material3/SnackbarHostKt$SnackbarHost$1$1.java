package androidx.compose.material3;

import androidx.compose.p014ui.platform.AccessibilityManager;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", m26211f = "SnackbarHost.kt", m26212l = {232}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, InterfaceC11588c<? super SnackbarHostKt$SnackbarHost$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                long millis = SnackbarHostKt.toMillis(snackbarData.getVisuals().getDuration(), this.$currentSnackbarData.getVisuals().getActionLabel() != null, this.$accessibilityManager);
                this.label = 1;
                if (DelayKt.m20376b(millis, this) == objM25952f) {
                    return objM25952f;
                }
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.$currentSnackbarData.dismiss();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
