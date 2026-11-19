package com.friday.document.view;

import com.friday.common.entity.FileEntity;
import com.friday.common.entity.FileType;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.document.R$string;
import com.friday.document.viewmodel.RecycleBinViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p141f2.C9166c;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.RecycleBinPreviewFragment$displayOthers$4$1", m26211f = "RecycleBinPreviewFragment.kt", m26212l = {322}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RecycleBinPreviewFragment$displayOthers$4$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7240c;

    /* renamed from: d */
    public int f7241d;

    /* renamed from: e */
    public final /* synthetic */ boolean f7242e;

    /* renamed from: f */
    public final /* synthetic */ String f7243f;

    /* renamed from: g */
    public final /* synthetic */ String f7244g;

    /* renamed from: h */
    public final /* synthetic */ String f7245h;

    /* renamed from: i */
    public final /* synthetic */ RecycleBinPreviewFragment f7246i;

    /* renamed from: j */
    public final /* synthetic */ FileEntity f7247j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinPreviewFragment$displayOthers$4$1(boolean z10, String str, String str2, String str3, RecycleBinPreviewFragment recycleBinPreviewFragment, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7242e = z10;
        this.f7243f = str;
        this.f7244g = str2;
        this.f7245h = str3;
        this.f7246i = recycleBinPreviewFragment;
        this.f7247j = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new RecycleBinPreviewFragment$displayOthers$4$1(this.f7242e, this.f7243f, this.f7244g, this.f7245h, this.f7246i, this.f7247j, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7241d;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f7242e) {
                C5963c.m5306s(C5963c.f6084a, this.f7243f, C5962b.f6082a.m5299a().m5277e(this.f7244g), false, null, 0L, 28, null);
                return C10786q.f26013a;
            }
            String strM5277e = C5962b.f6082a.m5299a().m5277e(this.f7244g);
            if (AbstractC9979u.m20289b(FileType.PICTURE, this.f7245h)) {
                C5963c.m5301e(C5963c.f6084a, strM5277e, false, 2, null);
                return C10786q.f26013a;
            }
            RecycleBinViewModel recycleBinViewModelM5788S = this.f7246i.m5788S();
            FileEntity fileEntity = this.f7247j;
            this.f7240c = AbstractC11833h.m26224a(strM5277e);
            this.f7241d = 1;
            obj = recycleBinViewModelM5788S.m6265u(fileEntity, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.f7246i.m5788S().m6226J().setValue(this.f7247j);
        } else if (C9166c.f21406a.m18061e()) {
            this.f7246i.isShowLoading(true);
            this.f7246i.m5788S().m6216A(this.f7247j);
        } else {
            AbstractC11958b.m26587h(R$string.connect_network_please);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((RecycleBinPreviewFragment$displayOthers$4$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
