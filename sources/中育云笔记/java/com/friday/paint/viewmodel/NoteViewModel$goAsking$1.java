package com.friday.paint.viewmodel;

import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$goAsking$1", m26211f = "NoteViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$goAsking$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10500c;

    /* renamed from: d */
    public final /* synthetic */ NoteViewModel f10501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$goAsking$1(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10501d = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$goAsking$1(this.f10501d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10500c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11602k interfaceC11602k = this.f10501d.f10445s;
            Boolean boolM26206a = AbstractC11826a.m26206a(true);
            this.f10500c = 1;
            if (interfaceC11602k.emit(boolM26206a, this) == objM25952f) {
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
        return ((NoteViewModel$goAsking$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
