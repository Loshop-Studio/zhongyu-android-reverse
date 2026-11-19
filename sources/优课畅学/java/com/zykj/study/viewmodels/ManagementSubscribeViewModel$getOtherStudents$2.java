package com.zykj.study.viewmodels;

import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.lifecycle.MutableLiveData;
import com.zykj.study.repository.SubscribeRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ManagementSubscribeViewModel$getOtherStudents$2", m17801f = "ManagementSubscribeViewModel.kt", m17802l = {C3721BR.versionName}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ManagementSubscribeViewModel$getOtherStudents$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14214a;

    /* renamed from: b */
    public int f14215b;

    /* renamed from: c */
    public final /* synthetic */ ManagementSubscribeViewModel f14216c;

    /* renamed from: d */
    public final /* synthetic */ long f14217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementSubscribeViewModel$getOtherStudents$2(ManagementSubscribeViewModel managementSubscribeViewModel, long j10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14216c = managementSubscribeViewModel;
        this.f14217d = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ManagementSubscribeViewModel$getOtherStudents$2(this.f14216c, this.f14217d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ManagementSubscribeViewModel$getOtherStudents$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14215b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MutableLiveData mutableLiveDataM12189f = this.f14216c.m12189f();
            SubscribeRepository subscribeRepository = this.f14216c.f14204a;
            long j10 = this.f14217d;
            this.f14214a = mutableLiveDataM12189f;
            this.f14215b = 1;
            Object objM10400h = subscribeRepository.m10400h(j10, this);
            if (objM10400h == objM17291f) {
                return objM17291f;
            }
            mutableLiveData = mutableLiveDataM12189f;
            obj = objM10400h;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.f14214a;
            AbstractC9079b.m15926b(obj);
        }
        mutableLiveData.setValue(obj);
        return C8736p.f16368a;
    }
}
