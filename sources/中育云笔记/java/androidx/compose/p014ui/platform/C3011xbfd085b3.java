package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m26211f = "WindowRecomposer.android.kt", m26212l = {227}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 */
/* loaded from: classes2.dex */
public final class C3011xbfd085b3 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3011xbfd085b3(Recomposer recomposer, View view, InterfaceC11588c<? super C3011xbfd085b3> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C3011xbfd085b3(this.$newRecomposer, this.$rootView, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        View view;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Recomposer recomposer = this.$newRecomposer;
                this.label = 1;
                if (recomposer.join(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            if (WindowRecomposer_androidKt.getCompositionContext(view) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            return C10786q.f26013a;
        } finally {
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C3011xbfd085b3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
