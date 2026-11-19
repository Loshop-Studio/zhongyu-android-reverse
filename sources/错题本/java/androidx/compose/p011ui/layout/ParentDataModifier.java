package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface ParentDataModifier extends Modifier.Element {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ParentDataModifier parentDataModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return ParentDataModifier.super.all(interfaceC6471c);
        }

        @Deprecated
        public static boolean any(@NotNull ParentDataModifier parentDataModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return ParentDataModifier.super.any(interfaceC6471c);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull ParentDataModifier parentDataModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) ParentDataModifier.super.foldIn(r, interfaceC6473e);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull ParentDataModifier parentDataModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) ParentDataModifier.super.foldOut(r, interfaceC6473e);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ParentDataModifier parentDataModifier, @NotNull Modifier modifier) {
            return ParentDataModifier.super.then(modifier);
        }
    }

    @Nullable
    Object modifyParentData(@NotNull Density density, @Nullable Object obj);
}
