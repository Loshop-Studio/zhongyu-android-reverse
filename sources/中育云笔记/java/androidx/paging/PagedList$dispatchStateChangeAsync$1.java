package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10937b0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", m26211f = "PagedList.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PagedList$dispatchStateChangeAsync$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ LoadState $state;
    final /* synthetic */ LoadType $type;
    int label;
    final /* synthetic */ PagedList<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedList$dispatchStateChangeAsync$1(PagedList<T> pagedList, LoadType loadType, LoadState loadState, InterfaceC11588c<? super PagedList$dispatchStateChangeAsync$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = pagedList;
        this.$type = loadType;
        this.$state = loadState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(WeakReference weakReference) {
        return weakReference.get() == null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new PagedList$dispatchStateChangeAsync$1(this.this$0, this.$type, this.$state, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        AbstractC10937b0.m23867L(((PagedList) this.this$0).loadStateListeners, new InterfaceC9540l() { // from class: androidx.paging.m0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(PagedList$dispatchStateChangeAsync$1.invokeSuspend$lambda$0((WeakReference) obj2));
            }
        });
        List list = ((PagedList) this.this$0).loadStateListeners;
        LoadType loadType = this.$type;
        LoadState loadState = this.$state;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC9544p interfaceC9544p = (InterfaceC9544p) ((WeakReference) it.next()).get();
            if (interfaceC9544p != null) {
                interfaceC9544p.invoke(loadType, loadState);
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((PagedList$dispatchStateChangeAsync$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
