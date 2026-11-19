package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.ExerciseRepository", m17801f = "ExerciseRepository.kt", m17802l = {27}, m17803m = "updateAnswerResult")
/* loaded from: classes3.dex */
public final class ExerciseRepository$updateAnswerResult$1 extends ContinuationImpl {

    /* renamed from: a */
    public long f11439a;

    /* renamed from: b */
    public int f11440b;

    /* renamed from: c */
    public Object f11441c;

    /* renamed from: d */
    public Object f11442d;

    /* renamed from: e */
    public boolean f11443e;

    /* renamed from: f */
    public /* synthetic */ Object f11444f;

    /* renamed from: g */
    public final /* synthetic */ ExerciseRepository f11445g;

    /* renamed from: h */
    public int f11446h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseRepository$updateAnswerResult$1(ExerciseRepository exerciseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11445g = exerciseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11444f = obj;
        this.f11446h |= Integer.MIN_VALUE;
        return this.f11445g.m10377m(0L, 0, null, false, null, this);
    }
}
