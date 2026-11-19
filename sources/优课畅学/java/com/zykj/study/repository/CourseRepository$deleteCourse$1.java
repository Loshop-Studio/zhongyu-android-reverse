package com.zykj.study.repository;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.CourseRepository", m17801f = "CourseRepository.kt", m17802l = {TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW}, m17803m = "deleteCourse")
/* loaded from: classes3.dex */
public final class CourseRepository$deleteCourse$1 extends ContinuationImpl {

    /* renamed from: a */
    public int f11309a;

    /* renamed from: b */
    public /* synthetic */ Object f11310b;

    /* renamed from: c */
    public final /* synthetic */ CourseRepository f11311c;

    /* renamed from: d */
    public int f11312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepository$deleteCourse$1(CourseRepository courseRepository, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11311c = courseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11310b = obj;
        this.f11312d |= Integer.MIN_VALUE;
        return this.f11311c.m10337g(0, this);
    }
}
