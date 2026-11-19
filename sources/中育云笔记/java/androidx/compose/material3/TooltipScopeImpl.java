package androidx.compose.material3;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draw.CacheDrawScope;
import androidx.compose.p014ui.draw.DrawModifierKt;
import androidx.compose.p014ui.draw.DrawResult;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TooltipScopeImpl implements TooltipScope {
    public static final int $stable = 0;
    private final InterfaceC9529a getAnchorBounds;

    public TooltipScopeImpl(InterfaceC9529a interfaceC9529a) {
        this.getAnchorBounds = interfaceC9529a;
    }

    @Override // androidx.compose.material3.TooltipScope
    public Modifier drawCaret(Modifier modifier, final InterfaceC9544p interfaceC9544p) {
        return DrawModifierKt.drawWithCache(modifier, new InterfaceC9540l() { // from class: androidx.compose.material3.TooltipScopeImpl.drawCaret.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                return (DrawResult) interfaceC9544p.invoke(cacheDrawScope, this.getGetAnchorBounds().invoke());
            }
        });
    }

    public final InterfaceC9529a getGetAnchorBounds() {
        return this.getAnchorBounds;
    }
}
