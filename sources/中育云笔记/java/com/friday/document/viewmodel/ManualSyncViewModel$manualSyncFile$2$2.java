package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import com.friday.document.model.ManualSyncEntity;
import com.friday.document.service.FileManager;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ManualSyncViewModel$manualSyncFile$2$2", m26211f = "ManualSyncViewModel.kt", m26212l = {59}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ManualSyncViewModel$manualSyncFile$2$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8060c;

    /* renamed from: d */
    public final /* synthetic */ ManualSyncViewModel f8061d;

    /* renamed from: e */
    public final /* synthetic */ ManualSyncEntity f8062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualSyncViewModel$manualSyncFile$2$2(ManualSyncViewModel manualSyncViewModel, ManualSyncEntity manualSyncEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8061d = manualSyncViewModel;
        this.f8062e = manualSyncEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ManualSyncViewModel$manualSyncFile$2$2(this.f8061d, this.f8062e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f8060c;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                FileManager fileManagerM6307k = this.f8061d.m6307k();
                FileEntity fileEntity = this.f8062e.getFileEntity();
                this.f8060c = 1;
                if (fileManagerM6307k.m5602G(fileEntity, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.f8062e.setSyncState(3);
            InterfaceC11603l interfaceC11603l = this.f8061d.f8044e;
            do {
            } while (!interfaceC11603l.mo20870e(interfaceC11603l.getValue(), new Object()));
        } catch (Exception e10) {
            this.f8062e.setSyncState(2);
            InterfaceC11603l interfaceC11603l2 = this.f8061d.f8044e;
            while (!interfaceC11603l2.mo20870e(interfaceC11603l2.getValue(), new Object())) {
            }
            e10.printStackTrace();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ManualSyncViewModel$manualSyncFile$2$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
