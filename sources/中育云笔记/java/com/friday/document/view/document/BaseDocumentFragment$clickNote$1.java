package com.friday.document.view.document;

import com.blankj.utilcode.util.LogUtils;
import com.friday.common.entity.FileEntity;
import com.friday.document.R$string;
import com.friday.document.viewmodel.BaseFileViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141f2.C9166c;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$clickNote$1", m26211f = "BaseDocumentFragment.kt", m26212l = {152}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseDocumentFragment$clickNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7286c;

    /* renamed from: d */
    public final /* synthetic */ BaseDocumentFragment f7287d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f7288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDocumentFragment$clickNote$1(BaseDocumentFragment baseDocumentFragment, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7287d = baseDocumentFragment;
        this.f7288e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseDocumentFragment$clickNote$1(this.f7287d, this.f7288e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7286c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LogUtils.m3886d("点击事件：BaseDocumentFragment的clickNote()");
            BaseFileViewModel baseFileViewModelM5820E = this.f7287d.m5820E();
            FileEntity fileEntity = this.f7288e;
            this.f7286c = 1;
            obj = baseFileViewModelM5820E.m6269w(fileEntity, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LogUtils.m3886d("本地文件是否存在" + zBooleanValue);
        if (!zBooleanValue) {
            if (!C9166c.f21406a.m18061e()) {
                AbstractC11958b.m26587h(R$string.dis_net);
                return C10786q.f26013a;
            }
            this.f7287d.isShowLoading(true);
            this.f7287d.m5820E().m6272y(this.f7288e);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseDocumentFragment$clickNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
