package com.zykj.study.p065ui.home.exercise.train;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.SingleChoiceResultFailFragment", m17801f = "SingleChoiceResultFailFragment.kt", m17802l = {102}, m17803m = "initMicro")
/* loaded from: classes5.dex */
public final class SingleChoiceResultFailFragment$initMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f12423a;

    /* renamed from: b */
    public final /* synthetic */ SingleChoiceResultFailFragment f12424b;

    /* renamed from: c */
    public int f12425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleChoiceResultFailFragment$initMicro$1(SingleChoiceResultFailFragment singleChoiceResultFailFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12424b = singleChoiceResultFailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12423a = obj;
        this.f12425c |= Integer.MIN_VALUE;
        return this.f12424b.m10960s(this);
    }
}
