package androidx.compose.p011ui.input.pointer;

import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface PointerInputModifier extends Modifier.Element {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull PointerInputModifier pointerInputModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return PointerInputModifier.super.all(interfaceC6471c);
        }

        @Deprecated
        public static boolean any(@NotNull PointerInputModifier pointerInputModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return PointerInputModifier.super.any(interfaceC6471c);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull PointerInputModifier pointerInputModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) PointerInputModifier.super.foldIn(r, interfaceC6473e);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull PointerInputModifier pointerInputModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) PointerInputModifier.super.foldOut(r, interfaceC6473e);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull PointerInputModifier pointerInputModifier, @NotNull Modifier modifier) {
            return PointerInputModifier.super.then(modifier);
        }
    }

    @NotNull
    PointerInputFilter getPointerInputFilter();
}
