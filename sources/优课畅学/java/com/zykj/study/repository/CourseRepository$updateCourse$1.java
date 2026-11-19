package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {89, 102}, m17803m = "updateCourse")
/* loaded from: classes3.dex */
public final class CourseRepository$updateCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11359a;

    /* renamed from: b */
    public /* synthetic */ Object f11360b;

    /* renamed from: c */
    public final /* synthetic */ CourseRepository f11361c;

    /* renamed from: d */
    public int f11362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$updateCourse$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11361c = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11360b = obj;
        this.f11362d |= Integer.MIN_VALUE;
        return this.f11361c.m10333A(null, this);
    }
}
