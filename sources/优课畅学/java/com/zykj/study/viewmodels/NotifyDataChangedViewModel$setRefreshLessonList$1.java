package com.zykj.study.viewmodels;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.NotifyDataChangedViewModel$setRefreshLessonList$1", m17801f = "NotifyDataChangedViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class NotifyDataChangedViewModel$setRefreshLessonList$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14312a;

    /* renamed from: b */
    public final /* synthetic */ NotifyDataChangedViewModel f14313b;

    /* renamed from: c */
    public final /* synthetic */ boolean f14314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyDataChangedViewModel$setRefreshLessonList$1(NotifyDataChangedViewModel notifyDataChangedViewModel, boolean z10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14313b = notifyDataChangedViewModel;
        this.f14314c = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new NotifyDataChangedViewModel$setRefreshLessonList$1(this.f14313b, this.f14314c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((NotifyDataChangedViewModel$setRefreshLessonList$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        AbstractC9434a.m17291f();
        if (this.f14312a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        InterfaceC9271h interfaceC9271h = this.f14313b.f14310a;
        boolean z10 = this.f14314c;
        do {
            value = interfaceC9271h.getValue();
            ((Boolean) value).getClass();
        } while (!interfaceC9271h.mo16686e(value, AbstractC9536a.m17796a(z10)));
        return C8736p.f16368a;
    }
}
