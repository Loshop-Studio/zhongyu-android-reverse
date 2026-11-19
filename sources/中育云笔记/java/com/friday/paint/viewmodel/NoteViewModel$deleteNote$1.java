package com.friday.paint.viewmodel;

import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$deleteNote$1", m26211f = "NoteViewModel.kt", m26212l = {118}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$deleteNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10460c;

    /* renamed from: d */
    public final /* synthetic */ int f10461d;

    /* renamed from: e */
    public final /* synthetic */ List f10462e;

    /* renamed from: f */
    public final /* synthetic */ NoteViewModel f10463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$deleteNote$1(int i10, List list, NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10461d = i10;
        this.f10462e = list;
        this.f10463f = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$deleteNote$1(this.f10461d, this.f10462e, this.f10463f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10460c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            int i11 = this.f10461d;
            if (i11 < 0 || i11 >= this.f10462e.size()) {
                this.f10463f.f10447u.postValue(AbstractC11826a.m26208c(-1));
                return C10786q.f26013a;
            }
            NoteViewModel noteViewModel = this.f10463f;
            String strM7712B = noteViewModel.m7712B();
            int i12 = this.f10461d;
            this.f10460c = 1;
            if (noteViewModel.m7737r(strM7712B, i12, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f10463f.f10447u.postValue(AbstractC11826a.m26208c(this.f10461d));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NoteViewModel$deleteNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
