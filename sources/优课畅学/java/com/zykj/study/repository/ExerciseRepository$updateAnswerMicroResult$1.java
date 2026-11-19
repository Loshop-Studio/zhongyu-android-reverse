package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.ExerciseRepository", m17801f = "ExerciseRepository.kt", m17802l = {47}, m17803m = "updateAnswerMicroResult")
/* loaded from: classes3.dex */
public final class ExerciseRepository$updateAnswerMicroResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f11431a;

    /* renamed from: b */
    public int f11432b;

    /* renamed from: c */
    public Object f11433c;

    /* renamed from: d */
    public Object f11434d;

    /* renamed from: e */
    public boolean f11435e;

    /* renamed from: f */
    public /* synthetic */ Object f11436f;

    /* renamed from: g */
    public final /* synthetic */ ExerciseRepository f11437g;

    /* renamed from: h */
    public int f11438h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseRepository$updateAnswerMicroResult$1(ExerciseRepository exerciseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11437g = exerciseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11436f = obj;
        this.f11438h |= Integer.MIN_VALUE;
        return this.f11437g.m10376l(0L, 0, null, false, null, this);
    }
}
