package com.zykj.study.viewmodels;

import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MicroEditViewModel$uploadMicro$2", m17801f = "MicroEditViewModel.kt", m17802l = {21}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroEditViewModel$uploadMicro$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14234a;

    /* renamed from: b */
    public final /* synthetic */ MicroEditViewModel f14235b;

    /* renamed from: c */
    public final /* synthetic */ int f14236c;

    /* renamed from: d */
    public final /* synthetic */ String f14237d;

    /* renamed from: e */
    public final /* synthetic */ String f14238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroEditViewModel$uploadMicro$2(MicroEditViewModel microEditViewModel, int i10, String str, String str2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14235b = microEditViewModel;
        this.f14236c = i10;
        this.f14237d = str;
        this.f14238e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MicroEditViewModel$uploadMicro$2(this.f14235b, this.f14236c, this.f14237d, this.f14238e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroEditViewModel$uploadMicro$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14234a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        ExerciseRepository exerciseRepositoryM12199a = this.f14235b.m12199a();
        int i11 = this.f14236c;
        String str = this.f14237d;
        String str2 = this.f14238e;
        this.f14234a = 1;
        Object objM10365a = exerciseRepositoryM12199a.m10365a(i11, str, str2, "zip", "", this);
        return objM10365a == objM17291f ? objM17291f : objM10365a;
    }
}
