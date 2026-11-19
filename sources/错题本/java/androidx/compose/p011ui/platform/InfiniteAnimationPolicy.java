package androidx.compose.p011ui.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5635g;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Lh6/f;", "R", "Lkotlin/Function1;", "Lh6/c;", "", "block", "onInfiniteOperation", "(Lr6/c;Lh6/c;)Ljava/lang/Object;", "Lh6/g;", "getKey", "()Lh6/g;", "key", "Key", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface InfiniteAnimationPolicy extends InterfaceC5634f {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static <R> R fold(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) AbstractC6600a.m6230a(infiniteAnimationPolicy, r, interfaceC6473e);
        }

        @Nullable
        public static <E extends InterfaceC5634f> E get(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull InterfaceC5635g interfaceC5635g) {
            return (E) AbstractC6600a.m6231b(infiniteAnimationPolicy, interfaceC5635g);
        }

        @Deprecated
        @NotNull
        public static InterfaceC5635g getKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        @NotNull
        public static InterfaceC5636h minusKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull InterfaceC5635g interfaceC5635g) {
            return AbstractC6600a.m6237m(infiniteAnimationPolicy, interfaceC5635g);
        }

        @NotNull
        public static InterfaceC5636h plus(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy, @NotNull InterfaceC5636h interfaceC5636h) {
            return AbstractC6600a.m6239o(interfaceC5636h, infiniteAnimationPolicy);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Lh6/g;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "<init>", "()V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$Key, reason: from kotlin metadata */
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
    default InterfaceC5635g getKey() {
        return INSTANCE;
    }

    @Override // p075h6.InterfaceC5636h
    @NotNull
    /* synthetic */ InterfaceC5636h minusKey(@NotNull InterfaceC5635g interfaceC5635g);

    @Nullable
    <R> Object onInfiniteOperation(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC5631c<? super R> interfaceC5631c);

    @Override // p075h6.InterfaceC5636h
    @NotNull
    /* synthetic */ InterfaceC5636h plus(@NotNull InterfaceC5636h interfaceC5636h);
}
