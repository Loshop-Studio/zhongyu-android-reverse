package com.friday.document.viewmodel;

import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ShareBaseViewModel", m26211f = "ShareBaseViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CLASS, PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR, IjkMediaMeta.FF_PROFILE_H264_EXTENDED, C7843ab.b.API_MYNA_START}, m26213m = "clickFile")
/* loaded from: classes3.dex */
public final class ShareBaseViewModel$clickFile$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f8202c;

    /* renamed from: d */
    public Object f8203d;

    /* renamed from: e */
    public Object f8204e;

    /* renamed from: f */
    public Object f8205f;

    /* renamed from: g */
    public boolean f8206g;

    /* renamed from: h */
    public /* synthetic */ Object f8207h;

    /* renamed from: i */
    public final /* synthetic */ ShareBaseViewModel f8208i;

    /* renamed from: j */
    public int f8209j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBaseViewModel$clickFile$1(ShareBaseViewModel shareBaseViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f8208i = shareBaseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8207h = obj;
        this.f8209j |= Integer.MIN_VALUE;
        return this.f8208i.m6372n(null, null, null, null, this);
    }
}
