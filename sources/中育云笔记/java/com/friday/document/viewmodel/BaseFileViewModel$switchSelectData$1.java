package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$switchSelectData$1", m26211f = "BaseFileViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$switchSelectData$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7955c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7956d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$switchSelectData$1(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7956d = baseFileViewModel;
        this.f7957e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$switchSelectData$1(this.f7956d, this.f7957e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        AbstractC11725a.m25952f();
        if (this.f7955c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11603l interfaceC11603lM6243a0 = this.f7956d.m6243a0();
        FileEntity fileEntity = this.f7957e;
        do {
            value = interfaceC11603lM6243a0.getValue();
            arrayList = new ArrayList();
            boolean z10 = false;
            for (FileEntity fileEntity2 : (List) value) {
                if (AbstractC9979u.m20289b(fileEntity2.getFileId(), fileEntity.getFileId())) {
                    z10 = true;
                } else {
                    AbstractC11826a.m26206a(arrayList.add(fileEntity2));
                }
            }
            if (!z10) {
                arrayList.add(fileEntity);
            }
        } while (!interfaceC11603lM6243a0.mo20870e(value, arrayList));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$switchSelectData$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
