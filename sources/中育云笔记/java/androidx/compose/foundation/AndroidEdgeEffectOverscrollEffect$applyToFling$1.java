package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", m26211f = "AndroidOverscroll.android.kt", m26212l = {688, 720}, m26213m = "applyToFling-BMRW4eQ")
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC11588c<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo26928applyToFlingBMRW4eQ(0L, null, this);
    }
}
