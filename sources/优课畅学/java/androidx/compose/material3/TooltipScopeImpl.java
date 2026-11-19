package androidx.compose.material3;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.CacheDrawScope;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.draw.DrawResult;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TooltipScopeImpl implements TooltipScope {
    public static final int $stable = 0;
    private final InterfaceC10559a getAnchorBounds;

    public TooltipScopeImpl(InterfaceC10559a interfaceC10559a) {
        this.getAnchorBounds = interfaceC10559a;
    }

    @Override // androidx.compose.material3.TooltipScope
    public Modifier drawCaret(Modifier modifier, final InterfaceC10574p interfaceC10574p) {
        return DrawModifierKt.drawWithCache(modifier, new InterfaceC10570l() { // from class: androidx.compose.material3.TooltipScopeImpl.drawCaret.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                return (DrawResult) interfaceC10574p.invoke(cacheDrawScope, this.getGetAnchorBounds().invoke());
            }
        });
    }

    public final InterfaceC10559a getGetAnchorBounds() {
        return this.getAnchorBounds;
    }
}
