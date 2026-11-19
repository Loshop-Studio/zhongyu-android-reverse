package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m5110d2 = {"Landroidx/compose/runtime/CancelledCoroutineContext;", "Lh6/f;", "<init>", "()V", "Lh6/g;", "getKey", "()Lh6/g;", "key", "Key", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class CancelledCoroutineContext implements InterfaceC5634f {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/runtime/CancelledCoroutineContext$Key;", "Lh6/g;", "Landroidx/compose/runtime/CancelledCoroutineContext;", "<init>", "()V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.runtime.CancelledCoroutineContext$Key, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC5635g {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private Companion() {
        }
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
        return INSTANCE;
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
