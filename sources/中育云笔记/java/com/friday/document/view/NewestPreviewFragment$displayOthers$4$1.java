package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.friday.document.R$string;
import com.friday.document.viewmodel.NewestViewModel;
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

@InterfaceC11829d(m26210c = "com.friday.document.view.NewestPreviewFragment$displayOthers$4$1", m26211f = "NewestPreviewFragment.kt", m26212l = {399}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NewestPreviewFragment$displayOthers$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7187c;

    /* renamed from: d */
    public final /* synthetic */ boolean f7188d;

    /* renamed from: e */
    public final /* synthetic */ NewestPreviewFragment f7189e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f7190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewestPreviewFragment$displayOthers$4$1(boolean z10, NewestPreviewFragment newestPreviewFragment, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7188d = z10;
        this.f7189e = newestPreviewFragment;
        this.f7190f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewestPreviewFragment$displayOthers$4$1(this.f7188d, this.f7189e, this.f7190f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7187c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f7188d) {
                NewestViewModel newestViewModelM5749R = this.f7189e.m5749R();
                FileEntity fileEntity = this.f7190f;
                this.f7187c = 1;
                obj = newestViewModelM5749R.m6265u(fileEntity, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (((Boolean) obj).booleanValue()) {
            this.f7189e.m5749R().m6268v0(this.f7190f);
        } else if (C9166c.f21406a.m18061e()) {
            this.f7189e.isShowLoading(true);
            this.f7189e.m5749R().m6274z(this.f7190f);
        } else {
            AbstractC11958b.m26587h(R$string.connect_network_please);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewestPreviewFragment$displayOthers$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
