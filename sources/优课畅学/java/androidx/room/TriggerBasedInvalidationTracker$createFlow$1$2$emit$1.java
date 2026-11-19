package androidx.room;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", m17801f = "InvalidationTracker.kt", m17802l = {241, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION}, m17803m = "emit")
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1.C45362<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1.C45362<? super T> c45362, InterfaceC9324c<? super TriggerBasedInvalidationTracker$createFlow$1$2$emit$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = c45362;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((int[]) null, (InterfaceC9324c<? super C8736p>) this);
    }
}
