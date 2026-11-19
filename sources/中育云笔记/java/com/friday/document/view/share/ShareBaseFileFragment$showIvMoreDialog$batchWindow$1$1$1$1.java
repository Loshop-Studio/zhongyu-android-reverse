package com.friday.document.view.share;

import android.widget.PopupWindow;
import com.friday.common.helper.C5962b;
import com.friday.document.databinding.PopSortBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7592c;

    /* renamed from: d */
    public final /* synthetic */ ShareBaseFileFragment f7593d;

    /* renamed from: e */
    public final /* synthetic */ int f7594e;

    /* renamed from: f */
    public final /* synthetic */ PopSortBinding f7595f;

    /* renamed from: g */
    public final /* synthetic */ PopupWindow f7596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1(ShareBaseFileFragment shareBaseFileFragment, int i10, PopSortBinding popSortBinding, PopupWindow popupWindow, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7593d = shareBaseFileFragment;
        this.f7594e = i10;
        this.f7595f = popSortBinding;
        this.f7596g = popupWindow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1(this.f7593d, this.f7594e, this.f7595f, this.f7596g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f7592c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f7593d.mo6028E().m6422N(null);
        C5962b.f6082a.m5299a().m5267E(this.f7594e == this.f7595f.f6606d.getId() ? 1 : 0);
        this.f7593d.mo6028E().m6426U();
        this.f7596g.dismiss();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareBaseFileFragment$showIvMoreDialog$batchWindow$1$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
