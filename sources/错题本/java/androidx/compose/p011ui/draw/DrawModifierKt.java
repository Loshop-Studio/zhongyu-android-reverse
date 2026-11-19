package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u000b\u0010\u0007\u001a&\u0010\r\u001a\u00020\f2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "onDraw", "drawBehind", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "onBuildDrawCache", "drawWithCache", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "CacheDrawModifierNode", "(Lr6/c;)Landroidx/compose/ui/draw/CacheDrawModifierNode;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawWithContent", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DrawModifierKt {
    @NotNull
    public static final CacheDrawModifierNode CacheDrawModifierNode(@NotNull InterfaceC6471c interfaceC6471c) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), interfaceC6471c);
    }

    @NotNull
    public static final Modifier drawBehind(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new DrawBehindElement(interfaceC6471c));
    }

    @NotNull
    public static final Modifier drawWithCache(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new DrawWithCacheElement(interfaceC6471c));
    }

    @NotNull
    public static final Modifier drawWithContent(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new DrawWithContentElement(interfaceC6471c));
    }
}
