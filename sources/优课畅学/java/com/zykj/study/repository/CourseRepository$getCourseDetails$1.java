package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {147, 150, 150, 155}, m17803m = "getCourseDetails")
/* loaded from: classes3.dex */
public final class CourseRepository$getCourseDetails$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11317a;

    /* renamed from: b */
    public int f11318b;

    /* renamed from: c */
    public int f11319c;

    /* renamed from: d */
    public boolean f11320d;

    /* renamed from: e */
    public Object f11321e;

    /* renamed from: f */
    public Object f11322f;

    /* renamed from: g */
    public Object f11323g;

    /* renamed from: h */
    public /* synthetic */ Object f11324h;

    /* renamed from: i */
    public final /* synthetic */ CourseRepository f11325i;

    /* renamed from: j */
    public int f11326j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$getCourseDetails$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11325i = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11324h = obj;
        this.f11326j |= Integer.MIN_VALUE;
        return this.f11325i.m10341k(0, false, this);
    }
}
