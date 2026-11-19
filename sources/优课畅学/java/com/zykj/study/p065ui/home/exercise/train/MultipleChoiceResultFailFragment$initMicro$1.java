package com.zykj.study.p065ui.home.exercise.train;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.MultipleChoiceResultFailFragment", m17801f = "MultipleChoiceResultFailFragment.kt", m17802l = {TbsListener.ErrorCode.READ_RESPONSE_ERROR}, m17803m = "initMicro")
/* loaded from: classes5.dex */
public final class MultipleChoiceResultFailFragment$initMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f12342a;

    /* renamed from: b */
    public final /* synthetic */ MultipleChoiceResultFailFragment f12343b;

    /* renamed from: c */
    public int f12344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipleChoiceResultFailFragment$initMicro$1(MultipleChoiceResultFailFragment multipleChoiceResultFailFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12343b = multipleChoiceResultFailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12342a = obj;
        this.f12344c |= Integer.MIN_VALUE;
        return this.f12343b.m10911s(this);
    }
}
