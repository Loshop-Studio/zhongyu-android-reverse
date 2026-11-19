package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRepository", m17801f = "TeachCourseRepository.kt", m17802l = {82}, m17803m = "getCourseProgress")
/* loaded from: classes3.dex */
public final class TeachCourseRepository$getCourseProgress$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11531a;

    /* renamed from: b */
    public /* synthetic */ Object f11532b;

    /* renamed from: c */
    public final /* synthetic */ TeachCourseRepository f11533c;

    /* renamed from: d */
    public int f11534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseRepository$getCourseProgress$1(TeachCourseRepository teachCourseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11533c = teachCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11532b = obj;
        this.f11534d |= Integer.MIN_VALUE;
        return this.f11533c.m10410g(0, this);
    }
}
