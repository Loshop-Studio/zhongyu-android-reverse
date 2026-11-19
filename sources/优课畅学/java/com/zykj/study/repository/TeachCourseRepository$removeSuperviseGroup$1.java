package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRepository", m17801f = "TeachCourseRepository.kt", m17802l = {53}, m17803m = "removeSuperviseGroup")
/* loaded from: classes3.dex */
public final class TeachCourseRepository$removeSuperviseGroup$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11549a;

    /* renamed from: b */
    public int f11550b;

    /* renamed from: c */
    public /* synthetic */ Object f11551c;

    /* renamed from: d */
    public final /* synthetic */ TeachCourseRepository f11552d;

    /* renamed from: e */
    public int f11553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseRepository$removeSuperviseGroup$1(TeachCourseRepository teachCourseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11552d = teachCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11551c = obj;
        this.f11553e |= Integer.MIN_VALUE;
        return this.f11552d.m10418o(0, 0, this);
    }
}
