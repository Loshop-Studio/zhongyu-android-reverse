package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {117}, m17803m = "publishCourse")
/* loaded from: classes3.dex */
public final class CourseRepository$publishCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11339a;

    /* renamed from: b */
    public /* synthetic */ Object f11340b;

    /* renamed from: c */
    public final /* synthetic */ CourseRepository f11341c;

    /* renamed from: d */
    public int f11342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$publishCourse$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11341c = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11340b = obj;
        this.f11342d |= Integer.MIN_VALUE;
        return this.f11341c.m10347u(0, this);
    }
}
