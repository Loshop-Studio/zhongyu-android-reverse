package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p253t4.C10098g;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.SearchViewModel$special$$inlined$flatMapLatest$1", m17801f = "SearchViewModel.kt", m17802l = {189}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SearchViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f14350a;

    /* renamed from: b */
    public /* synthetic */ Object f14351b;

    /* renamed from: c */
    public /* synthetic */ Object f14352c;

    /* renamed from: d */
    public final /* synthetic */ SearchViewModel f14353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$special$$inlined$flatMapLatest$1(InterfaceC9324c interfaceC9324c, SearchViewModel searchViewModel) {
        super(3, interfaceC9324c);
        this.f14353d = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14350a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.f14351b;
            Object obj2 = this.f14352c;
            String str = (String) obj2;
            C10098g c10098gM12248e = this.f14353d.m12248e();
            AbstractC9133u.m16130d(str);
            InterfaceC9266c interfaceC9266cM18852b = c10098gM12248e.m18852b(str);
            this.f14351b = AbstractC9543h.m17814a(interfaceC9267d);
            this.f14352c = AbstractC9543h.m17814a(obj2);
            this.f14350a = 1;
            if (AbstractC9268e.m17031u(interfaceC9267d, interfaceC9266cM18852b, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(InterfaceC9267d interfaceC9267d, Object obj, InterfaceC9324c interfaceC9324c) {
        SearchViewModel$special$$inlined$flatMapLatest$1 searchViewModel$special$$inlined$flatMapLatest$1 = new SearchViewModel$special$$inlined$flatMapLatest$1(interfaceC9324c, this.f14353d);
        searchViewModel$special$$inlined$flatMapLatest$1.f14351b = interfaceC9267d;
        searchViewModel$special$$inlined$flatMapLatest$1.f14352c = obj;
        return searchViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(C8736p.f16368a);
    }
}
