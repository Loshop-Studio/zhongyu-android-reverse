package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {191, 192, 193}, m17803m = "subscribe")
/* loaded from: classes3.dex */
public final class CourseRepository$subscribe$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11343a;

    /* renamed from: b */
    public int f11344b;

    /* renamed from: c */
    public Object f11345c;

    /* renamed from: d */
    public Object f11346d;

    /* renamed from: e */
    public Object f11347e;

    /* renamed from: f */
    public /* synthetic */ Object f11348f;

    /* renamed from: g */
    public final /* synthetic */ CourseRepository f11349g;

    /* renamed from: h */
    public int f11350h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$subscribe$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11349g = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11348f = obj;
        this.f11350h |= Integer.MIN_VALUE;
        return this.f11349g.m10349w(0, null, this);
    }
}
