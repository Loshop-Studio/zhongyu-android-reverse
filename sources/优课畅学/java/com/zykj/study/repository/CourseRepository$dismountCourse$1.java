package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {122}, m17803m = "dismountCourse")
/* loaded from: classes3.dex */
public final class CourseRepository$dismountCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11313a;

    /* renamed from: b */
    public /* synthetic */ Object f11314b;

    /* renamed from: c */
    public final /* synthetic */ CourseRepository f11315c;

    /* renamed from: d */
    public int f11316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$dismountCourse$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11315c = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11314b = obj;
        this.f11316d |= Integer.MIN_VALUE;
        return this.f11315c.m10338h(0, this);
    }
}
