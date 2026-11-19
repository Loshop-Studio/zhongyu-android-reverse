package com.zykj.study.repository;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {TbsListener.ErrorCode.DEXOAT_EXCEPTION, 229, 230}, m17803m = "getCourseStudyKey")
/* loaded from: classes3.dex */
public final class CourseRepository$getCourseStudyKey$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11327a;

    /* renamed from: b */
    public Object f11328b;

    /* renamed from: c */
    public Object f11329c;

    /* renamed from: d */
    public /* synthetic */ Object f11330d;

    /* renamed from: e */
    public final /* synthetic */ CourseRepository f11331e;

    /* renamed from: f */
    public int f11332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$getCourseStudyKey$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11331e = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11330d = obj;
        this.f11332f |= Integer.MIN_VALUE;
        return this.f11331e.m10343o(null, this);
    }
}
