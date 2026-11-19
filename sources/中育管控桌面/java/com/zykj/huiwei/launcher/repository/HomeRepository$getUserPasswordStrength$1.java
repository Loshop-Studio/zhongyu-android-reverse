package com.zykj.huiwei.launcher.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.repository.HomeRepository", m7918f = "HomeRepository.kt", m7919i = {}, m7920l = {95}, m7921m = "getUserPasswordStrength", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class HomeRepository$getUserPasswordStrength$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f6163a;

    /* renamed from: b */
    public final /* synthetic */ HomeRepository f6164b;

    /* renamed from: c */
    public int f6165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepository$getUserPasswordStrength$1(HomeRepository homeRepository, Continuation continuation) {
        super(continuation);
        this.f6164b = homeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6163a = obj;
        this.f6165c |= Integer.MIN_VALUE;
        return this.f6164b.m5418e(this);
    }
}
