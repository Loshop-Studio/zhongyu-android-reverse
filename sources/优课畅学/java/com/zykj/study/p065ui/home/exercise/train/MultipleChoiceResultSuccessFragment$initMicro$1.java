package com.zykj.study.p065ui.home.exercise.train;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceResultSuccessFragment", m17801f = "MultipleChoiceResultSuccessFragment.kt", m17802l = {110}, m17803m = "initMicro")
/* loaded from: classes5.dex */
public final class MultipleChoiceResultSuccessFragment$initMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f12374a;

    /* renamed from: b */
    public final /* synthetic */ MultipleChoiceResultSuccessFragment f12375b;

    /* renamed from: c */
    public int f12376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleChoiceResultSuccessFragment$initMicro$1(MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12375b = multipleChoiceResultSuccessFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12374a = obj;
        this.f12376c |= Integer.MIN_VALUE;
        return this.f12375b.m10933v(this);
    }
}
