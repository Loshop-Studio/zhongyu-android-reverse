package com.friday.main.viewmodel;

import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p040c2.InterfaceC5308v0;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.DbViewModel$fetchImageDb$1", m26211f = "DbViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DbViewModel$fetchImageDb$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9449c;

    /* renamed from: d */
    public final /* synthetic */ DbViewModel f9450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DbViewModel$fetchImageDb$1(DbViewModel dbViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9450d = dbViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new DbViewModel$fetchImageDb$1(this.f9450d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9449c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC5308v0 interfaceC5308v0 = this.f9450d.f9438e;
            this.f9449c = 1;
            obj = interfaceC5308v0.mo2813b(this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        List list = (List) obj;
        InterfaceC11603l interfaceC11603l = this.f9450d.f9445l;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, list));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((DbViewModel$fetchImageDb$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
