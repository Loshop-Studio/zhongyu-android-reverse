package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {68, 83}, m17803m = "createMyCourse")
/* loaded from: classes3.dex */
public final class CourseRepository$createMyCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11304a;

    /* renamed from: b */
    public int f11305b;

    /* renamed from: c */
    public /* synthetic */ Object f11306c;

    /* renamed from: d */
    public final /* synthetic */ CourseRepository f11307d;

    /* renamed from: e */
    public int f11308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$createMyCourse$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11307d = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11306c = obj;
        this.f11308e |= Integer.MIN_VALUE;
        return this.f11307d.m10335e(null, this);
    }
}
