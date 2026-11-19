package androidx.room;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m26211f = "InvalidationTracker.kt", m26212l = {241, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m26213m = "emit")
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1.C44842<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1.C44842<? super T> c44842, InterfaceC11588c<? super TriggerBasedInvalidationTracker$createFlow$1$2$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = c44842;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((int[]) null, (InterfaceC11588c<? super C10786q>) this);
    }
}
