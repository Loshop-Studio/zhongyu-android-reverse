package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel", m7918f = "MainViewModel.kt", m7919i = {0, 0}, m7920l = {97}, m7921m = "getLCAPPList", m7922n = {"pm", "showAppIntent"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class MainViewModel$getLCAPPList$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f7220a;

    /* renamed from: b */
    public Object f7221b;

    /* renamed from: c */
    public /* synthetic */ Object f7222c;

    /* renamed from: d */
    public final /* synthetic */ MainViewModel f7223d;

    /* renamed from: e */
    public int f7224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$getLCAPPList$1(MainViewModel mainViewModel, Continuation continuation) {
        super(continuation);
        this.f7223d = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7222c = obj;
        this.f7224e |= Integer.MIN_VALUE;
        return this.f7223d.m6154j(this);
    }
}
