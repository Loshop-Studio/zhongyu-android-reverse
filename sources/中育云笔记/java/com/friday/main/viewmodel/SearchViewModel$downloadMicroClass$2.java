package com.friday.main.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$downloadMicroClass$2", m26211f = "SearchViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$downloadMicroClass$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9704c;

    /* renamed from: d */
    public final /* synthetic */ SearchViewModel f9705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$downloadMicroClass$2(SearchViewModel searchViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9705d = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SearchViewModel$downloadMicroClass$2(this.f9705d, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((SearchViewModel$downloadMicroClass$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f9704c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f9705d.m7290w(null);
        return C10786q.f26013a;
    }
}
