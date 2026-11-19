package com.friday.paint.viewmodel;

import com.friday.common.dao.FileDao;
import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$createNewNote$1", m26211f = "NoteViewModel.kt", m26212l = {101}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$createNewNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10456c;

    /* renamed from: d */
    public final /* synthetic */ NoteViewModel f10457d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f10458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$createNewNote$1(NoteViewModel noteViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10457d = noteViewModel;
        this.f10458e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$createNewNote$1(this.f10457d, this.f10458e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10456c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FileDao fileDao = this.f10457d.f10428b;
            FileEntity fileEntity = this.f10458e;
            this.f10456c = 1;
            if (fileDao.mo4910I(fileEntity, this) == objM25952f) {
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
        return ((NoteViewModel$createNewNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
