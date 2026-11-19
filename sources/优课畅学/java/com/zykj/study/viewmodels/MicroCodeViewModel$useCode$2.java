package com.zykj.study.viewmodels;

import com.zykj.study.bean.ScanResult;
import com.zykj.study.repository.QuickCodeRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MicroCodeViewModel$useCode$2", m17801f = "MicroCodeViewModel.kt", m17802l = {22}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeViewModel$useCode$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14230a;

    /* renamed from: b */
    public final /* synthetic */ MicroCodeViewModel f14231b;

    /* renamed from: c */
    public final /* synthetic */ ScanResult f14232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeViewModel$useCode$2(MicroCodeViewModel microCodeViewModel, ScanResult scanResult, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14231b = microCodeViewModel;
        this.f14232c = scanResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MicroCodeViewModel$useCode$2(this.f14231b, this.f14232c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeViewModel$useCode$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14230a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        QuickCodeRepository quickCodeRepositoryM12196a = this.f14231b.m12196a();
        ScanResult scanResult = this.f14232c;
        this.f14230a = 1;
        Object objM10383c = quickCodeRepositoryM12196a.m10383c(scanResult, this);
        return objM10383c == objM17291f ? objM17291f : objM10383c;
    }
}
