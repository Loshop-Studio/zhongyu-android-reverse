package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lh6/f;", "Key", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface SnapshotContextElement extends InterfaceC5634f {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull SnapshotContextElement snapshotContextElement, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) AbstractC6600a.m6230a(snapshotContextElement, r, interfaceC6473e);
        }

        @Nullable
        public static <E extends InterfaceC5634f> E get(@NotNull SnapshotContextElement snapshotContextElement, @NotNull InterfaceC5635g interfaceC5635g) {
            return (E) AbstractC6600a.m6231b(snapshotContextElement, interfaceC5635g);
        }

        @NotNull
        public static InterfaceC5636h minusKey(@NotNull SnapshotContextElement snapshotContextElement, @NotNull InterfaceC5635g interfaceC5635g) {
            return AbstractC6600a.m6237m(snapshotContextElement, interfaceC5635g);
        }

        @NotNull
        public static InterfaceC5636h plus(@NotNull SnapshotContextElement snapshotContextElement, @NotNull InterfaceC5636h interfaceC5636h) {
            return AbstractC6600a.m6239o(interfaceC5636h, snapshotContextElement);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lh6/g;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "<init>", "()V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotContextElement$Key, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC5635g {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Override // p075h6.InterfaceC5636h
    /* synthetic */ Object fold(Object obj, @NotNull InterfaceC6473e interfaceC6473e);

    @Override // p075h6.InterfaceC5636h
    @Nullable
    /* synthetic */ InterfaceC5634f get(@NotNull InterfaceC5635g interfaceC5635g);

    @Override // p075h6.InterfaceC5634f
    @NotNull
    /* synthetic */ InterfaceC5635g getKey();

    @Override // p075h6.InterfaceC5636h
    @NotNull
    /* synthetic */ InterfaceC5636h minusKey(@NotNull InterfaceC5635g interfaceC5635g);

    @Override // p075h6.InterfaceC5636h
    @NotNull
    /* synthetic */ InterfaceC5636h plus(@NotNull InterfaceC5636h interfaceC5636h);
}
