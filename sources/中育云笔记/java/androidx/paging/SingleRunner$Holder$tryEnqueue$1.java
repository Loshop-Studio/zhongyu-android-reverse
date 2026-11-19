package androidx.paging;

import androidx.compose.material3.MenuKt;
import androidx.paging.SingleRunner;
import com.tendcloud.tenddata.C7843ab;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.SingleRunner$Holder", m26211f = "SingleRunner.kt", m26212l = {MenuKt.InTransitionDuration, C7843ab.b.API_MYNA_START}, m26213m = "tryEnqueue", m26214v = 1)
/* loaded from: classes3.dex */
public final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleRunner.Holder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, InterfaceC11588c<? super SingleRunner$Holder$tryEnqueue$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.tryEnqueue(0, null, this);
    }
}
