package io.reactivex.internal.disposables;

import io.reactivex.annotations.Nullable;
import p145q5.InterfaceC6430a;
import p145q5.InterfaceC6432c;
import p145q5.InterfaceC6436g;
import p145q5.InterfaceC6440k;
import p192w5.InterfaceC6720a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmptyDisposable implements InterfaceC6720a {
    public static final EmptyDisposable INSTANCE;
    public static final EmptyDisposable NEVER;

    /* renamed from: a */
    public static final /* synthetic */ EmptyDisposable[] f8998a;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        INSTANCE = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        NEVER = emptyDisposable2;
        f8998a = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    public static void complete(InterfaceC6436g interfaceC6436g) {
        interfaceC6436g.onSubscribe(INSTANCE);
        interfaceC6436g.onComplete();
    }

    public static void error(Throwable th, InterfaceC6436g interfaceC6436g) {
        interfaceC6436g.onSubscribe(INSTANCE);
        interfaceC6436g.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f8998a.clone();
    }

    @Override // p192w5.InterfaceC6721b
    public void clear() {
    }

    @Override // p159s5.InterfaceC6559b
    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // p192w5.InterfaceC6721b
    public boolean isEmpty() {
        return true;
    }

    @Override // p192w5.InterfaceC6721b
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p192w5.InterfaceC6721b
    @Nullable
    public Object poll() throws Exception {
        return null;
    }

    @Override // p192w5.InterfaceC6720a
    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(InterfaceC6432c interfaceC6432c) {
        interfaceC6432c.m6076b();
        interfaceC6432c.onComplete();
    }

    public static void error(Throwable th, InterfaceC6430a interfaceC6430a) {
        interfaceC6430a.m6074b();
        interfaceC6430a.m6073a();
    }

    public static void complete(InterfaceC6430a interfaceC6430a) {
        interfaceC6430a.m6074b();
        interfaceC6430a.onComplete();
    }

    public static void error(Throwable th, InterfaceC6440k interfaceC6440k) {
        interfaceC6440k.m6081b();
        interfaceC6440k.m6080a();
    }

    public static void error(Throwable th, InterfaceC6432c interfaceC6432c) {
        interfaceC6432c.m6076b();
        interfaceC6432c.m6075a();
    }
}
