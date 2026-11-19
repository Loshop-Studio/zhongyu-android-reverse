package androidx.compose.material3;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.CacheDrawScope;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.draw.DrawResult;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\r\u001a\u00020\u0007*\u00020\u00072\u001f\u0010\f\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/material3/TooltipScopeImpl;", "Landroidx/compose/material3/TooltipScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getAnchorBounds", "<init>", "(Lr6/a;)V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "draw", "drawCaret", "(Landroidx/compose/ui/Modifier;Lr6/e;)Landroidx/compose/ui/Modifier;", "Lr6/a;", "getGetAnchorBounds", "()Lr6/a;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TooltipScopeImpl implements TooltipScope {
    public static final int $stable = 0;

    @NotNull
    private final InterfaceC6469a getAnchorBounds;

    public TooltipScopeImpl(@NotNull InterfaceC6469a interfaceC6469a) {
        this.getAnchorBounds = interfaceC6469a;
    }

    @Override // androidx.compose.material3.TooltipScope
    @NotNull
    public Modifier drawCaret(@NotNull Modifier modifier, @NotNull final InterfaceC6473e interfaceC6473e) {
        return DrawModifierKt.drawWithCache(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.TooltipScopeImpl.drawCaret.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final DrawResult invoke(@NotNull CacheDrawScope cacheDrawScope) {
                return (DrawResult) interfaceC6473e.invoke(cacheDrawScope, this.getGetAnchorBounds().invoke());
            }
        });
    }

    @NotNull
    public final InterfaceC6469a getGetAnchorBounds() {
        return this.getAnchorBounds;
    }
}
