package com.zykj.study.viewmodels;

import com.zykj.http.exception.RemoteCodeException;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$reorderCatalog$2", m17801f = "MyCourseDetailsViewModel.kt", m17802l = {132}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel$reorderCatalog$2 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f14272a;

    /* renamed from: b */
    public /* synthetic */ Object f14273b;

    /* renamed from: c */
    public final /* synthetic */ MyCourseDetailsViewModel f14274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsViewModel$reorderCatalog$2(MyCourseDetailsViewModel myCourseDetailsViewModel, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f14274c = myCourseDetailsViewModel;
    }

    @Override // p300x7.InterfaceC10575q
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, Throwable th, InterfaceC9324c interfaceC9324c) {
        MyCourseDetailsViewModel$reorderCatalog$2 myCourseDetailsViewModel$reorderCatalog$2 = new MyCourseDetailsViewModel$reorderCatalog$2(this.f14274c, interfaceC9324c);
        myCourseDetailsViewModel$reorderCatalog$2.f14273b = th;
        return myCourseDetailsViewModel$reorderCatalog$2.invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f14273b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14272a;
        try {
        } catch (Exception unused) {
            InterfaceC9271h interfaceC9271hM12208f = this.f14274c.m12208f();
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9271hM12208f.setValue(Result.m15908a(Result.m15909b(AbstractC9079b.m15925a(th))));
        }
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            if (!(th instanceof RemoteCodeException) || ((RemoteCodeException) th).getErrorCodeInfo().getCode() != 1023) {
                InterfaceC9271h interfaceC9271hM12208f2 = this.f14274c.m12208f();
                Result.C9076a c9076a2 = Result.f17350b;
                interfaceC9271hM12208f2.setValue(Result.m15908a(Result.m15909b(AbstractC9079b.m15925a(th))));
                return AbstractC9536a.m17796a(true);
            }
            MyCourseDetailsViewModel myCourseDetailsViewModel = this.f14274c;
            this.f14273b = th;
            this.f14272a = 1;
            if (myCourseDetailsViewModel.m12221s(this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return AbstractC9536a.m17796a(true);
    }
}
