package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.TrainAnswerMicroViewModel", m17801f = "TrainAnswerMicroViewModel.kt", m17802l = {34}, m17803m = "uploadAnswerMicro")
/* loaded from: classes5.dex */
public final class TrainAnswerMicroViewModel$uploadAnswerMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f14487a;

    /* renamed from: b */
    public Object f14488b;

    /* renamed from: c */
    public Object f14489c;

    /* renamed from: d */
    public boolean f14490d;

    /* renamed from: e */
    public /* synthetic */ Object f14491e;

    /* renamed from: f */
    public final /* synthetic */ TrainAnswerMicroViewModel f14492f;

    /* renamed from: g */
    public int f14493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainAnswerMicroViewModel$uploadAnswerMicro$1(TrainAnswerMicroViewModel trainAnswerMicroViewModel, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f14492f = trainAnswerMicroViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14491e = obj;
        this.f14493g |= Integer.MIN_VALUE;
        return this.f14492f.m12307k(0, null, false, null, this);
    }
}
