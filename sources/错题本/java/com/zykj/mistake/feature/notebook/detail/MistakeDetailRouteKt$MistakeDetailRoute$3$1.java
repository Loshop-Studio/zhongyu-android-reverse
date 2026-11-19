package com.zykj.mistake.feature.notebook.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
final /* synthetic */ class MistakeDetailRouteKt$MistakeDetailRoute$3$1 extends FunctionReferenceImpl implements InterfaceC6471c {
    public MistakeDetailRouteKt$MistakeDetailRoute$3$1(Object obj) {
        super(1, obj, MistakeDetailNewViewModel.class, "dispatch", "dispatch(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$Intent;)V", 0);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC4813i3) obj);
        return C5443s.f8405a;
    }

    public final void invoke(AbstractC4813i3 p0) {
        AbstractC5830k.m5330g(p0, "p0");
        ((MistakeDetailNewViewModel) this.receiver).m4162t(p0);
    }
}
