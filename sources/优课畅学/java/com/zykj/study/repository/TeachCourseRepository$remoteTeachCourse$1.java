package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRepository", m17801f = "TeachCourseRepository.kt", m17802l = {32}, m17803m = "remoteTeachCourse")
/* loaded from: classes3.dex */
public final class TeachCourseRepository$remoteTeachCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11545a;

    /* renamed from: b */
    public /* synthetic */ Object f11546b;

    /* renamed from: c */
    public final /* synthetic */ TeachCourseRepository f11547c;

    /* renamed from: d */
    public int f11548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseRepository$remoteTeachCourse$1(TeachCourseRepository teachCourseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11547c = teachCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11546b = obj;
        this.f11548d |= Integer.MIN_VALUE;
        return this.f11547c.m10417n(0, this);
    }
}
