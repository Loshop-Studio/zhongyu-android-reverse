package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Ld6/s;", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface OnPlacedModifier extends Modifier.Element {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnPlacedModifier onPlacedModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return OnPlacedModifier.super.all(interfaceC6471c);
        }

        @Deprecated
        public static boolean any(@NotNull OnPlacedModifier onPlacedModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return OnPlacedModifier.super.any(interfaceC6471c);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull OnPlacedModifier onPlacedModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) OnPlacedModifier.super.foldIn(r, interfaceC6473e);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull OnPlacedModifier onPlacedModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) OnPlacedModifier.super.foldOut(r, interfaceC6473e);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnPlacedModifier onPlacedModifier, @NotNull Modifier modifier) {
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(@NotNull LayoutCoordinates coordinates);
}
