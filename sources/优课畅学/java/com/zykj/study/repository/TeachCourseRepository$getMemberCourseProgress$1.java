package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRepository", m17801f = "TeachCourseRepository.kt", m17802l = {72}, m17803m = "getMemberCourseProgress")
/* loaded from: classes3.dex */
public final class TeachCourseRepository$getMemberCourseProgress$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11535a;

    /* renamed from: b */
    public Object f11536b;

    /* renamed from: c */
    public /* synthetic */ Object f11537c;

    /* renamed from: d */
    public final /* synthetic */ TeachCourseRepository f11538d;

    /* renamed from: e */
    public int f11539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseRepository$getMemberCourseProgress$1(TeachCourseRepository teachCourseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11538d = teachCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11537c = obj;
        this.f11539e |= Integer.MIN_VALUE;
        return this.f11538d.m10411h(0, null, this);
    }
}
