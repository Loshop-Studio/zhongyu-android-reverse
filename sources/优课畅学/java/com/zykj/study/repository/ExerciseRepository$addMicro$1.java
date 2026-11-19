package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.ExerciseRepository", m17801f = "ExerciseRepository.kt", m17802l = {86}, m17803m = "addMicro")
/* loaded from: classes3.dex */
public final class ExerciseRepository$addMicro$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11423a;

    /* renamed from: b */
    public Object f11424b;

    /* renamed from: c */
    public Object f11425c;

    /* renamed from: d */
    public Object f11426d;

    /* renamed from: e */
    public Object f11427e;

    /* renamed from: f */
    public /* synthetic */ Object f11428f;

    /* renamed from: g */
    public final /* synthetic */ ExerciseRepository f11429g;

    /* renamed from: h */
    public int f11430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseRepository$addMicro$1(ExerciseRepository exerciseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11429g = exerciseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11428f = obj;
        this.f11430h |= Integer.MIN_VALUE;
        return this.f11429g.m10365a(0, null, null, null, null, this);
    }
}
