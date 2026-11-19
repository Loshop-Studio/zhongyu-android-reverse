package com.friday.document.viewmodel;

import com.friday.common.helper.C5962b;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$updateSortType$1", m26211f = "FolderViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderViewModel$updateSortType$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8039c;

    /* renamed from: d */
    public final /* synthetic */ FolderViewModel f8040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$updateSortType$1(FolderViewModel folderViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8040d = folderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderViewModel$updateSortType$1(this.f8040d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        AbstractC11725a.m25952f();
        if (this.f8039c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11603l interfaceC11603l = this.f8040d.f7983L;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, new Pair(((Pair) value).m20051f(), AbstractC11826a.m26208c(C5962b.f6082a.m5299a().m5282j()))));
        for (InterfaceC11603l interfaceC11603l2 : this.f8040d.f7985N) {
            do {
                value2 = interfaceC11603l2.getValue();
            } while (!interfaceC11603l2.mo20870e(value2, new Pair(((Pair) value2).m20051f(), AbstractC11826a.m26208c(C5962b.f6082a.m5299a().m5282j()))));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderViewModel$updateSortType$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
