package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8768a0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", m17801f = "PagedList.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PagedList$dispatchStateChangeAsync$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ LoadState $state;
    final /* synthetic */ LoadType $type;
    int label;
    final /* synthetic */ PagedList<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedList$dispatchStateChangeAsync$1(PagedList<T> pagedList, LoadType loadType, LoadState loadState, InterfaceC9324c<? super PagedList$dispatchStateChangeAsync$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = pagedList;
        this.$type = loadType;
        this.$state = loadState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new PagedList$dispatchStateChangeAsync$1(this.this$0, this.$type, this.$state, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((PagedList$dispatchStateChangeAsync$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        AbstractC8768a0.m14490L(((PagedList) this.this$0).loadStateListeners, new InterfaceC10570l() { // from class: androidx.paging.PagedList$dispatchStateChangeAsync$1.1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(WeakReference<InterfaceC10574p> it) {
                AbstractC9133u.m16133g(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        });
        List list = ((PagedList) this.this$0).loadStateListeners;
        LoadType loadType = this.$type;
        LoadState loadState = this.$state;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC10574p interfaceC10574p = (InterfaceC10574p) ((WeakReference) it.next()).get();
            if (interfaceC10574p != null) {
                interfaceC10574p.invoke(loadType, loadState);
            }
        }
        return C8736p.f16368a;
    }
}
