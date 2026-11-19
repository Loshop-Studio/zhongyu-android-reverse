package com.zykj.mistake.feature.ask;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
final /* synthetic */ class AskMaterialRouteKt$AskMaterialRoute$2$1 extends FunctionReferenceImpl implements InterfaceC6471c {
    public AskMaterialRouteKt$AskMaterialRoute$2$1(Object obj) {
        super(1, obj, MistakeAskMaterialViewModel.class, "dispatch", "dispatch(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialContract$Intent;)V", 0);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC4545u) obj);
        return C5443s.f8405a;
    }

    public final void invoke(AbstractC4545u p0) {
        AbstractC5830k.m5330g(p0, "p0");
        ((MistakeAskMaterialViewModel) this.receiver).m3995a(p0);
    }
}
