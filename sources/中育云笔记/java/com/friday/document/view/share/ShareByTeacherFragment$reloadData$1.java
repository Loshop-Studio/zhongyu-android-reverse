package com.friday.document.view.share;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$color;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareByTeacherFragment$reloadData$1", m26211f = "ShareByTeacherFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareByTeacherFragment$reloadData$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7624c;

    /* renamed from: d */
    public final /* synthetic */ ShareByTeacherFragment f7625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareByTeacherFragment$reloadData$1(ShareByTeacherFragment shareByTeacherFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7625d = shareByTeacherFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareByTeacherFragment$reloadData$1(this.f7625d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f7624c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        SwipeRefreshLayout swipeRefreshLayout = ShareByTeacherFragment.m6061w(this.f7625d).f6433e;
        ShareByTeacherFragment shareByTeacherFragment = this.f7625d;
        swipeRefreshLayout.setColorSchemeColors(AbstractC11958b.m26580a(R$color.colorAccent));
        shareByTeacherFragment.m6069y(true);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ShareByTeacherFragment$reloadData$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
