package com.zykj.mistake.feature.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.feature.notebook.list.AbstractC4938d1;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeRouteKt$HomeRoute$8$2$2$1 extends FunctionReferenceImpl implements InterfaceC6471c {
    public HomeRouteKt$HomeRoute$8$2$2$1(Object obj) {
        super(1, obj, MistakeNotebookViewModel.class, "dispatch", "dispatch(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookContract$Intent;)V", 0);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC4938d1) obj);
        return C5443s.f8405a;
    }

    public final void invoke(AbstractC4938d1 p0) {
        AbstractC5830k.m5330g(p0, "p0");
        ((MistakeNotebookViewModel) this.receiver).m4293c(p0);
    }
}
