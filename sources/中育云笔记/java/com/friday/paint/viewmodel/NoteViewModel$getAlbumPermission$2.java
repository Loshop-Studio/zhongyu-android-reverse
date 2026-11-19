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

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NoteViewModel$getAlbumPermission$2", m26211f = "NoteViewModel.kt", m26212l = {404}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NoteViewModel$getAlbumPermission$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10485c;

    /* renamed from: d */
    public final /* synthetic */ NoteViewModel f10486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$getAlbumPermission$2(NoteViewModel noteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10486d = noteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NoteViewModel$getAlbumPermission$2(this.f10486d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10485c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        UserDao userDao = this.f10486d.f10430d;
        this.f10485c = 1;
        Object objM5199a = UserDao.m5199a(userDao, 0L, this, 1, null);
        return objM5199a == objM25952f ? objM25952f : objM5199a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NoteViewModel$getAlbumPermission$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
