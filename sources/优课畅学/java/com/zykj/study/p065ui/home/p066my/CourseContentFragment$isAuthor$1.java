package com.zykj.study.p065ui.home.p066my;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment", m17801f = "CourseContentFragment.kt", m17802l = {313}, m17803m = "isAuthor")
/* loaded from: classes5.dex */
public final class CourseContentFragment$isAuthor$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f12853a;

    /* renamed from: b */
    public /* synthetic */ Object f12854b;

    /* renamed from: c */
    public final /* synthetic */ CourseContentFragment f12855c;

    /* renamed from: d */
    public int f12856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$isAuthor$1(CourseContentFragment courseContentFragment, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f12855c = courseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f12854b = obj;
        this.f12856d |= Integer.MIN_VALUE;
        return this.f12855c.m11228v(this);
    }
}
