package com.zykj.huiwei.launcher.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.MainViewModel", m7918f = "MainViewModel.kt", m7919i = {0, 0}, m7920l = {137}, m7921m = "saveToOssImg", m7922n = {"uri", "fileExt"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class MainViewModel$saveToOssImg$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f7228a;

    /* renamed from: b */
    public Object f7229b;

    /* renamed from: c */
    public /* synthetic */ Object f7230c;

    /* renamed from: d */
    public final /* synthetic */ MainViewModel f7231d;

    /* renamed from: e */
    public int f7232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$saveToOssImg$1(MainViewModel mainViewModel, Continuation continuation) {
        super(continuation);
        this.f7231d = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7230c = obj;
        this.f7232e |= Integer.MIN_VALUE;
        return this.f7231d.m6157m(null, this);
    }
}
