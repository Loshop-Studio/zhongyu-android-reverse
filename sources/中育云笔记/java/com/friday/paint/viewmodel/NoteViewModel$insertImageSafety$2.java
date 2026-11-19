package com.friday.paint.viewmodel;

import com.friday.common.entity.ImageSafetyEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p040c2.InterfaceC5308v0;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$insertImageSafety$2", m26211f = "NoteViewModel.kt", m26212l = {418}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$insertImageSafety$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10531c;

    /* renamed from: d */
    public final /* synthetic */ NoteViewModel f10532d;

    /* renamed from: e */
    public final /* synthetic */ ImageSafetyEntity f10533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$insertImageSafety$2(NoteViewModel noteViewModel, ImageSafetyEntity imageSafetyEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10532d = noteViewModel;
        this.f10533e = imageSafetyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$insertImageSafety$2(this.f10532d, this.f10533e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10531c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC5308v0 interfaceC5308v0 = this.f10532d.f10431e;
            ImageSafetyEntity imageSafetyEntity = this.f10533e;
            this.f10531c = 1;
            if (interfaceC5308v0.mo2812a(imageSafetyEntity, this) == objM25952f) {
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
        return ((NoteViewModel$insertImageSafety$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
