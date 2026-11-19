package com.friday.paint.viewmodel;

import com.friday.common.dao.UserDao;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$getScreensPermission$2", m26211f = "NoteViewModel.kt", m26212l = {410}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$getScreensPermission$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10498c;

    /* renamed from: d */
    public final /* synthetic */ NoteViewModel f10499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$getScreensPermission$2(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10499d = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$getScreensPermission$2(this.f10499d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10498c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        UserDao userDao = this.f10499d.f10430d;
        this.f10498c = 1;
        Object objM5201i = UserDao.m5201i(userDao, 0L, this, 1, null);
        return objM5201i == objM25952f ? objM25952f : objM5201i;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NoteViewModel$getScreensPermission$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
