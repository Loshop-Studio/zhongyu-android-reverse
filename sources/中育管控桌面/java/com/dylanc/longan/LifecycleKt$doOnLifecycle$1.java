package com.dylanc.longan;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, m7880d2 = {"com/dylanc/longan/LifecycleKt$doOnLifecycle$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "longan"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class LifecycleKt$doOnLifecycle$1 implements DefaultLifecycleObserver {

    /* renamed from: a */
    public final /* synthetic */ Function0 f3262a;

    /* renamed from: b */
    public final /* synthetic */ Function0 f3263b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f3264c;

    /* renamed from: d */
    public final /* synthetic */ Function0 f3265d;

    /* renamed from: e */
    public final /* synthetic */ Function0 f3266e;

    /* renamed from: f */
    public final /* synthetic */ Function0 f3267f;

    public LifecycleKt$doOnLifecycle$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06) {
        this.f3262a = function0;
        this.f3263b = function02;
        this.f3264c = function03;
        this.f3265d = function04;
        this.f3266e = function05;
        this.f3267f = function06;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0 function0 = this.f3262a;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0 function0 = this.f3267f;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0 function0 = this.f3265d;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0 function0 = this.f3264c;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0 function0 = this.f3263b;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Function0 function0 = this.f3266e;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
