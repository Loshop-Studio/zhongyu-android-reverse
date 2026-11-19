package p075h6;

import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

/* renamed from: h6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5629a implements InterfaceC5634f {

    @NotNull
    private final InterfaceC5635g key;

    public AbstractC5629a(InterfaceC5635g key) {
        AbstractC5830k.m5330g(key, "key");
        this.key = key;
    }

    @Override // p075h6.InterfaceC5636h
    public <R> R fold(R r, @NotNull InterfaceC6473e interfaceC6473e) {
        return (R) AbstractC6600a.m6230a(this, r, interfaceC6473e);
    }

    @Override // p075h6.InterfaceC5636h
    @Nullable
    public <E extends InterfaceC5634f> E get(@NotNull InterfaceC5635g interfaceC5635g) {
        return (E) AbstractC6600a.m6231b(this, interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5634f
    @NotNull
    public InterfaceC5635g getKey() {
        return this.key;
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h minusKey(@NotNull InterfaceC5635g interfaceC5635g) {
        return AbstractC6600a.m6237m(this, interfaceC5635g);
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    public InterfaceC5636h plus(@NotNull InterfaceC5636h interfaceC5636h) {
        return AbstractC6600a.m6239o(interfaceC5636h, this);
    }
}
