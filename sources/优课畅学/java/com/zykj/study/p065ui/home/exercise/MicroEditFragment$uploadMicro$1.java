package com.zykj.study.p065ui.home.exercise;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment", m17801f = "MicroEditFragment.kt", m17802l = {TbsListener.ErrorCode.UNLZMA_FAIURE}, m17803m = "uploadMicro")
/* loaded from: classes5.dex */
public final class MicroEditFragment$uploadMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f12073a;

    /* renamed from: b */
    public Object f12074b;

    /* renamed from: c */
    public /* synthetic */ Object f12075c;

    /* renamed from: d */
    public final /* synthetic */ MicroEditFragment f12076d;

    /* renamed from: e */
    public int f12077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroEditFragment$uploadMicro$1(MicroEditFragment microEditFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12076d = microEditFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12075c = obj;
        this.f12077e |= Integer.MIN_VALUE;
        return this.f12076d.m10761P(null, null, this);
    }
}
