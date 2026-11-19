package com.zykj.study.repository;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.TeachCourseRepository", m17801f = "TeachCourseRepository.kt", m17802l = {45}, m17803m = "addSuperviseGroup")
/* loaded from: classes3.dex */
public final class TeachCourseRepository$addSuperviseGroup$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11526a;

    /* renamed from: b */
    public int f11527b;

    /* renamed from: c */
    public /* synthetic */ Object f11528c;

    /* renamed from: d */
    public final /* synthetic */ TeachCourseRepository f11529d;

    /* renamed from: e */
    public int f11530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseRepository$addSuperviseGroup$1(TeachCourseRepository teachCourseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11529d = teachCourseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11528c = obj;
        this.f11530e |= Integer.MIN_VALUE;
        return this.f11529d.m10406b(0, 0, this);
    }
}
