package com.zykj.study.provide;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "com.zykj.study.provide.GlobalObjectProvide$provideVersionRepository$1", m17801f = "GlobalObjectProvide.kt", m17802l = {30}, m17803m = "getLastVersionInfo")
/* renamed from: com.zykj.study.provide.GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1 */
/* loaded from: classes3.dex */
public final class C7736xf7760ab8 extends ContinuationImpl {

    /* renamed from: a */
    public Object f11281a;

    /* renamed from: b */
    public Object f11282b;

    /* renamed from: c */
    public int f11283c;

    /* renamed from: d */
    public /* synthetic */ Object f11284d;

    /* renamed from: e */
    public final /* synthetic */ GlobalObjectProvide$provideVersionRepository$1 f11285e;

    /* renamed from: f */
    public int f11286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7736xf7760ab8(GlobalObjectProvide$provideVersionRepository$1 globalObjectProvide$provideVersionRepository$1, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f11285e = globalObjectProvide$provideVersionRepository$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11284d = obj;
        this.f11286f |= Integer.MIN_VALUE;
        return this.f11285e.mo10323a(null, 0, null, this);
    }
}
