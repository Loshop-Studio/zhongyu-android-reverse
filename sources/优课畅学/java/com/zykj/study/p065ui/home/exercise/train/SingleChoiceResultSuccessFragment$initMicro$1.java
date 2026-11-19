package com.zykj.study.p065ui.home.exercise.train;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.SingleChoiceResultSuccessFragment", m17801f = "SingleChoiceResultSuccessFragment.kt", m17802l = {110}, m17803m = "initMicro")
/* loaded from: classes5.dex */
public final class SingleChoiceResultSuccessFragment$initMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f12455a;

    /* renamed from: b */
    public final /* synthetic */ SingleChoiceResultSuccessFragment f12456b;

    /* renamed from: c */
    public int f12457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChoiceResultSuccessFragment$initMicro$1(SingleChoiceResultSuccessFragment singleChoiceResultSuccessFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12456b = singleChoiceResultSuccessFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12455a = obj;
        this.f12457c |= Integer.MIN_VALUE;
        return this.f12456b.m10981v(this);
    }
}
