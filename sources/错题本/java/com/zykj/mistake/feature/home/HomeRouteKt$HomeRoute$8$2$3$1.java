package com.zykj.mistake.feature.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.feature.collection.list.AbstractC4722u;
import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
final /* synthetic */ class HomeRouteKt$HomeRoute$8$2$3$1 extends FunctionReferenceImpl implements InterfaceC6471c {
    public HomeRouteKt$HomeRoute$8$2$3$1(Object obj) {
        super(1, obj, MistakeCollectionViewModel.class, "dispatch", "dispatch(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionContract$Intent;)V", 0);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC4722u) obj);
        return C5443s.f8405a;
    }

    public final void invoke(AbstractC4722u p0) {
        AbstractC5830k.m5330g(p0, "p0");
        ((MistakeCollectionViewModel) this.receiver).m4089a(p0);
    }
}
