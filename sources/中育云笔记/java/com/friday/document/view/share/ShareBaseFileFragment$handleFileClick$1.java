package com.friday.document.view.share;

import com.friday.common.entity.FileType;
import com.friday.document.model.ShareFile;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.share.ShareBaseFileFragment$handleFileClick$1", m26211f = "ShareBaseFileFragment.kt", m26212l = {299}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShareBaseFileFragment$handleFileClick$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7581c;

    /* renamed from: d */
    public final /* synthetic */ SuspendCall f7582d;

    /* renamed from: e */
    public final /* synthetic */ ShareBaseFileFragment f7583e;

    /* renamed from: f */
    public final /* synthetic */ int f7584f;

    /* renamed from: g */
    public final /* synthetic */ ShareFile f7585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseFileFragment$handleFileClick$1(SuspendCall suspendCall, ShareBaseFileFragment shareBaseFileFragment, int i10, ShareFile shareFile, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7582d = suspendCall;
        this.f7583e = shareBaseFileFragment;
        this.f7584f = i10;
        this.f7585g = shareFile;
    }

    /* renamed from: t */
    public static final C10786q m6046t(ShareBaseFileFragment shareBaseFileFragment) {
        shareBaseFileFragment.isShowLoading(true);
        return C10786q.f26013a;
    }

    /* renamed from: v */
    public static final C10786q m6047v(int i10, Throwable th) {
        AbstractC11958b.m26587h(i10);
        return C10786q.f26013a;
    }

    /* renamed from: y */
    public static final C10786q m6048y(ShareBaseFileFragment shareBaseFileFragment, ShareFile shareFile, C10786q c10786q) {
        shareBaseFileFragment.m6025B().m6371I(shareFile.getFileId());
        shareBaseFileFragment.m6025B().m6370G(shareFile, AbstractC9979u.m20289b(shareFile.getType(), FileType.PICTURE) ? shareBaseFileFragment.mo6028E().m6416A() : AbstractC10978w.m24136n());
        return C10786q.f26013a;
    }

    /* renamed from: z */
    public static final C10786q m6049z(ShareBaseFileFragment shareBaseFileFragment) {
        shareBaseFileFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ShareBaseFileFragment$handleFileClick$1(this.f7582d, this.f7583e, this.f7584f, this.f7585g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7581c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            SuspendCall suspendCall = this.f7582d;
            final ShareBaseFileFragment shareBaseFileFragment = this.f7583e;
            SuspendCall suspendCallM6137d = suspendCall.m6137d(new InterfaceC9529a() { // from class: com.friday.document.view.share.a
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return ShareBaseFileFragment$handleFileClick$1.m6046t(shareBaseFileFragment);
                }
            });
            final int i11 = this.f7584f;
            SuspendCall suspendCallM6136c = suspendCallM6137d.m6136c(new InterfaceC9540l() { // from class: com.friday.document.view.share.b
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return ShareBaseFileFragment$handleFileClick$1.m6047v(i11, (Throwable) obj2);
                }
            });
            final ShareBaseFileFragment shareBaseFileFragment2 = this.f7583e;
            final ShareFile shareFile = this.f7585g;
            SuspendCall suspendCallM6138e = suspendCallM6136c.m6138e(new InterfaceC9540l() { // from class: com.friday.document.view.share.c
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return ShareBaseFileFragment$handleFileClick$1.m6048y(shareBaseFileFragment2, shareFile, (C10786q) obj2);
                }
            });
            final ShareBaseFileFragment shareBaseFileFragment3 = this.f7583e;
            SuspendCall suspendCallM6135b = suspendCallM6138e.m6135b(new InterfaceC9529a() { // from class: com.friday.document.view.share.d
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return ShareBaseFileFragment$handleFileClick$1.m6049z(shareBaseFileFragment3);
                }
            });
            this.f7581c = 1;
            if (suspendCallM6135b.m6134a(this) == objM25952f) {
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
        return ((ShareBaseFileFragment$handleFileClick$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
