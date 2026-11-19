package com.friday.main.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel", m26211f = "SearchViewModel.kt", m26212l = {142, IjkMediaMeta.FF_PROFILE_H264_HIGH_444}, m26213m = "doesFileExits")
/* loaded from: classes4.dex */
public final class SearchViewModel$doesFileExits$1 extends ContinuationImpl {

    /* renamed from: c */
    public Object f9685c;

    /* renamed from: d */
    public Object f9686d;

    /* renamed from: e */
    public /* synthetic */ Object f9687e;

    /* renamed from: f */
    public final /* synthetic */ SearchViewModel f9688f;

    /* renamed from: g */
    public int f9689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$doesFileExits$1(SearchViewModel searchViewModel, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.f9688f = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f9687e = obj;
        this.f9689g |= Integer.MIN_VALUE;
        return this.f9688f.m7279j(null, this);
    }
}
