package com.zykj.study.p065ui.home.exercise.train;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment", m17801f = "AnswerResultFragment.kt", m17802l = {165}, m17803m = "initMicro")
/* loaded from: classes5.dex */
public final class AnswerResultFragment$initMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f12221a;

    /* renamed from: b */
    public final /* synthetic */ AnswerResultFragment f12222b;

    /* renamed from: c */
    public int f12223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerResultFragment$initMicro$1(AnswerResultFragment answerResultFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12222b = answerResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12221a = obj;
        this.f12223c |= Integer.MIN_VALUE;
        return this.f12222b.m10847H(this);
    }
}
