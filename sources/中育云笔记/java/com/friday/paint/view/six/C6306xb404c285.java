package com.friday.paint.view.six;

import java.io.File;
import java.io.FileInputStream;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p215k2.C9799q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$submitSubjectiveHomework$1$1$uploadStatus$1 */
/* loaded from: classes4.dex */
public final class C6306xb404c285 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10263c;

    /* renamed from: d */
    public final /* synthetic */ String f10264d;

    /* renamed from: e */
    public final /* synthetic */ String f10265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6306xb404c285(String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10264d = str;
        this.f10265e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new C6306xb404c285(this.f10264d, this.f10265e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10263c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return AbstractC11826a.m26206a(C9799q.f22994a.m19801c(this.f10264d, new FileInputStream(new File(this.f10265e))));
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((C6306xb404c285) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
