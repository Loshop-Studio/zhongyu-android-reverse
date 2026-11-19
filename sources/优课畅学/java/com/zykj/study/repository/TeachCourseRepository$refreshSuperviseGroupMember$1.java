package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRepository", m17801f = "TeachCourseRepository.kt", m17802l = {61}, m17803m = "refreshSuperviseGroupMember")
/* loaded from: classes3.dex */
public final class TeachCourseRepository$refreshSuperviseGroupMember$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11540a;

    /* renamed from: b */
    public int f11541b;

    /* renamed from: c */
    public /* synthetic */ Object f11542c;

    /* renamed from: d */
    public final /* synthetic */ TeachCourseRepository f11543d;

    /* renamed from: e */
    public int f11544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseRepository$refreshSuperviseGroupMember$1(TeachCourseRepository teachCourseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11543d = teachCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11542c = obj;
        this.f11544e |= Integer.MIN_VALUE;
        return this.f11543d.m10416m(0, 0, this);
    }
}
