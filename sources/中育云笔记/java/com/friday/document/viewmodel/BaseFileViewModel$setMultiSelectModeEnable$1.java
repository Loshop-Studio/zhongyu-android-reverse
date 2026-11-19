package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$setMultiSelectModeEnable$1", m26211f = "BaseFileViewModel.kt", m26212l = {580}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$setMultiSelectModeEnable$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7946c;

    /* renamed from: d */
    public int f7947d;

    /* renamed from: e */
    public int f7948e;

    /* renamed from: f */
    public final /* synthetic */ BaseFileViewModel f7949f;

    /* renamed from: g */
    public final /* synthetic */ boolean f7950g;

    /* renamed from: h */
    public final /* synthetic */ FileEntity f7951h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$setMultiSelectModeEnable$1(BaseFileViewModel baseFileViewModel, boolean z10, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7949f = baseFileViewModel;
        this.f7950g = z10;
        this.f7951h = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$setMultiSelectModeEnable$1(this.f7949f, this.f7950g, this.f7951h, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listM24136n;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7948e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f7949f.m6242Z().postValue(AbstractC11826a.m26206a(this.f7950g));
            if (this.f7950g) {
                this.f7949f.m6241Y().postValue(null);
            }
            FileEntity fileEntity = this.f7951h;
            if (fileEntity == null || (listM24136n = AbstractC10976v.m24126e(fileEntity)) == null) {
                listM24136n = AbstractC10978w.m24136n();
            }
            InterfaceC11603l interfaceC11603lM6243a0 = this.f7949f.m6243a0();
            this.f7946c = AbstractC11833h.m26224a(listM24136n);
            this.f7947d = 0;
            this.f7948e = 1;
            if (interfaceC11603lM6243a0.emit(listM24136n, this) == objM25952f) {
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
        return ((BaseFileViewModel$setMultiSelectModeEnable$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
