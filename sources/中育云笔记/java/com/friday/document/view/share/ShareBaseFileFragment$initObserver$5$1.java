package com.friday.document.view.share;

import com.friday.document.model.ShareFile;
import com.friday.document.model.ShareListEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$initObserver$5$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseFileFragment$initObserver$5$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7589c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseFileFragment f7590d;

    /* renamed from: e */
    public final /* synthetic */ ShareFile f7591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseFileFragment$initObserver$5$1(ShareBaseFileFragment shareBaseFileFragment, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7590d = shareBaseFileFragment;
        this.f7591e = shareFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseFileFragment$initObserver$5$1(this.f7590d, this.f7591e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f7589c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f7590d.mo6028E().m6422N(this.f7591e);
        List list = (List) this.f7590d.mo6028E().m6417B().getValue();
        ShareFile shareFile = this.f7591e;
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (AbstractC9979u.m20289b(((ShareListEntity) it.next()).getShareFile().getFileId(), shareFile.getFileId())) {
                break;
            }
            i10++;
        }
        if (i10 != -1) {
            ShareBaseFileFragment.m6021w(this.f7590d).f6444h.scrollToPosition(i10);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseFileFragment$initObserver$5$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
