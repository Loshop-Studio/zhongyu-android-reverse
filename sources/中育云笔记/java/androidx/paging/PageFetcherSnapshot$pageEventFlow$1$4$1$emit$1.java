package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import com.google.android.material.internal.ViewUtils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", m26211f = "PageFetcherSnapshot.kt", m26212l = {694, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 127, 719, 130, 731, 744, 127, 756, 130, ViewUtils.EDGE_TO_EDGE_FLAGS, 781, 127, 793, 130, 805}, m26213m = "emit", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.C42564.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.C42564.AnonymousClass1<? super T> anonymousClass1, InterfaceC11588c<? super PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((C10786q) null, (InterfaceC11588c<? super C10786q>) this);
    }
}
