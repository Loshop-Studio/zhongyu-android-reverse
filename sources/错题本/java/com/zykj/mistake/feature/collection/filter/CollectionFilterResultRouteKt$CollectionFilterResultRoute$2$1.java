package com.zykj.mistake.feature.collection.filter;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
final /* synthetic */ class CollectionFilterResultRouteKt$CollectionFilterResultRoute$2$1 extends FunctionReferenceImpl implements InterfaceC6471c {
    public CollectionFilterResultRouteKt$CollectionFilterResultRoute$2$1(Object obj) {
        super(1, obj, MistakeCollectionFilterResultViewModel.class, "dispatch", "dispatch(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$Intent;)V", 0);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC4674r0) obj);
        return C5443s.f8405a;
    }

    public final void invoke(AbstractC4674r0 p0) {
        AbstractC5830k.m5330g(p0, "p0");
        ((MistakeCollectionFilterResultViewModel) this.receiver).m4068c(p0);
    }
}
