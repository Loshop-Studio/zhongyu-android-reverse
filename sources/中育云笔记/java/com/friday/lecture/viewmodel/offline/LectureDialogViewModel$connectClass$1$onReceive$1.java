package com.friday.lecture.viewmodel.offline;

import com.friday.common.helper.C5962b;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p186i2.C9568a;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.viewmodel.offline.LectureDialogViewModel$connectClass$1$onReceive$1", m26211f = "LectureDialogViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LectureDialogViewModel$connectClass$1$onReceive$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8940c;

    /* renamed from: d */
    public final /* synthetic */ C9568a f8941d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9540l f8942e;

    /* renamed from: f */
    public final /* synthetic */ String f8943f;

    /* renamed from: g */
    public final /* synthetic */ LectureDialogViewModel f8944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LectureDialogViewModel$connectClass$1$onReceive$1(C9568a c9568a, InterfaceC9540l interfaceC9540l, String str, LectureDialogViewModel lectureDialogViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8941d = c9568a;
        this.f8942e = interfaceC9540l;
        this.f8943f = str;
        this.f8944g = lectureDialogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new LectureDialogViewModel$connectClass$1$onReceive$1(this.f8941d, this.f8942e, this.f8943f, this.f8944g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8940c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (this.f8941d.m18808b()) {
            C5962b c5962bM5299a = C5962b.f6082a.m5299a();
            String strM18807a = this.f8941d.m18807a();
            if (strM18807a == null) {
                strM18807a = "";
            }
            c5962bM5299a.m5265C(strM18807a);
            this.f8942e.invoke(this.f8943f);
        } else {
            this.f8944g.m6850w();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((LectureDialogViewModel$connectClass$1$onReceive$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
