package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.friday.document.R$string;
import com.friday.document.viewmodel.FolderViewModel;
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

@InterfaceC11829d(m26210c = "com.friday.document.view.FolderPreviewFragment$displayOthers$4$1", m26211f = "FolderPreviewFragment.kt", m26212l = {393}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderPreviewFragment$displayOthers$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7095c;

    /* renamed from: d */
    public final /* synthetic */ boolean f7096d;

    /* renamed from: e */
    public final /* synthetic */ FolderPreviewFragment f7097e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f7098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderPreviewFragment$displayOthers$4$1(boolean z10, FolderPreviewFragment folderPreviewFragment, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7096d = z10;
        this.f7097e = folderPreviewFragment;
        this.f7098f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderPreviewFragment$displayOthers$4$1(this.f7096d, this.f7097e, this.f7098f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7095c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f7096d) {
                FolderViewModel folderViewModelM5692R = this.f7097e.m5692R();
                FileEntity fileEntity = this.f7098f;
                this.f7095c = 1;
                obj = folderViewModelM5692R.m6265u(fileEntity, this);
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
            this.f7097e.m5692R().m6268v0(this.f7098f);
        } else if (C9166c.f21406a.m18061e()) {
            this.f7097e.isShowLoading(true);
            this.f7097e.m5692R().m6274z(this.f7098f);
        } else {
            AbstractC11958b.m26587h(R$string.connect_network_please);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderPreviewFragment$displayOthers$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
