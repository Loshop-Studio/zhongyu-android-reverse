package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.TriggerBasedInvalidationTracker", m26211f = "InvalidationTracker.kt", m26212l = {300}, m26213m = "syncTriggers$room_runtime_release")
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$syncTriggers$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC11588c<? super TriggerBasedInvalidationTracker$syncTriggers$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.syncTriggers$room_runtime_release(this);
    }
}
