package com.zykj.study.repository;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {C3721BR.versionViewModel, 61, 62}, m17803m = "getKey")
/* loaded from: classes3.dex */
public final class CourseRepository$getKey$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11333a;

    /* renamed from: b */
    public Object f11334b;

    /* renamed from: c */
    public Object f11335c;

    /* renamed from: d */
    public /* synthetic */ Object f11336d;

    /* renamed from: e */
    public final /* synthetic */ CourseRepository f11337e;

    /* renamed from: f */
    public int f11338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$getKey$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11337e = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11336d = obj;
        this.f11338f |= Integer.MIN_VALUE;
        return this.f11337e.m10344p(null, this);
    }
}
