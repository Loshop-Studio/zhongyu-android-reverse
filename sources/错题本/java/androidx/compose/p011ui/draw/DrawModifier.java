package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Ld6/s;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull DrawModifier drawModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return DrawModifier.super.all(interfaceC6471c);
        }

        @Deprecated
        public static boolean any(@NotNull DrawModifier drawModifier, @NotNull InterfaceC6471c interfaceC6471c) {
            return DrawModifier.super.any(interfaceC6471c);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull DrawModifier drawModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) DrawModifier.super.foldIn(r, interfaceC6473e);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull DrawModifier drawModifier, R r, @NotNull InterfaceC6473e interfaceC6473e) {
            return (R) DrawModifier.super.foldOut(r, interfaceC6473e);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull DrawModifier drawModifier, @NotNull Modifier modifier) {
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(@NotNull ContentDrawScope contentDrawScope);
}
