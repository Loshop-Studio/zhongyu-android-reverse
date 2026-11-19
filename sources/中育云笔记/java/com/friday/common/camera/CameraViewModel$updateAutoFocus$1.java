package com.friday.common.camera;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p028b2.C5144a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.camera.CameraViewModel$updateAutoFocus$1", m26211f = "CameraViewModel.kt", m26212l = {20}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CameraViewModel$updateAutoFocus$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5659c;

    /* renamed from: d */
    public final /* synthetic */ CameraViewModel f5660d;

    /* renamed from: e */
    public final /* synthetic */ float f5661e;

    /* renamed from: f */
    public final /* synthetic */ float f5662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewModel$updateAutoFocus$1(CameraViewModel cameraViewModel, float f10, float f11, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5660d = cameraViewModel;
        this.f5661e = f10;
        this.f5662f = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new CameraViewModel$updateAutoFocus$1(this.f5660d, this.f5661e, this.f5662f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f5659c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11602k interfaceC11602kM4825c = this.f5660d.m4825c();
            C5144a c5144a = new C5144a(System.currentTimeMillis(), this.f5661e, this.f5662f);
            this.f5659c = 1;
            if (interfaceC11602kM4825c.emit(c5144a, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((CameraViewModel$updateAutoFocus$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
