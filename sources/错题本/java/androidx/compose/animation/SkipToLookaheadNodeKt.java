package androidx.compose.animation;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", "createContentScaleModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/ScaleToBoundsImpl;Lr6/a;)Landroidx/compose/ui/Modifier;", "DefaultEnabled", "Lr6/a;", "animation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SkipToLookaheadNodeKt {

    @NotNull
    private static final InterfaceC6469a DefaultEnabled = new InterfaceC6469a() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$DefaultEnabled$1
        @Override // p152r6.InterfaceC6469a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    @NotNull
    public static final Modifier createContentScaleModifier(@NotNull Modifier modifier, @NotNull ScaleToBoundsImpl scaleToBoundsImpl, @NotNull final InterfaceC6469a interfaceC6469a) {
        return modifier.then(AbstractC5830k.m5325b(scaleToBoundsImpl.getContentScale(), ContentScale.INSTANCE.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new InterfaceC6471c() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt.createContentScaleModifier.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setClip(((Boolean) interfaceC6469a.invoke()).booleanValue());
            }
        }) : Modifier.INSTANCE).then(new SkipToLookaheadElement(scaleToBoundsImpl, interfaceC6469a));
    }
}
