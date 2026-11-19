package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.ObserverModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private final boolean bounded;
    private final ColorProducer color;
    private final InteractionSource interactionSource;
    private final float radius;
    private DelegatableNode rippleNode;

    public /* synthetic */ DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, AbstractC9126n abstractC9126n) {
        this(interactionSource, z10, f10, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachNewRipple() {
        this.rippleNode = delegate(androidx.compose.material.ripple.RippleKt.m21722createRippleModifierNodeTDGSqEk(this.interactionSource, this.bounded, this.radius, new ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
            @Override // androidx.compose.p013ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
            public final long mo22048invoke0d7_KjU() {
                long jMo22048invoke0d7_KjU = this.this$0.color.mo22048invoke0d7_KjU();
                if (jMo22048invoke0d7_KjU != 16) {
                    return jMo22048invoke0d7_KjU;
                }
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration == null || rippleConfiguration.m22402getColor0d7_KjU() == 16) ? ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, ContentColorKt.getLocalContentColor())).m24286unboximpl() : rippleConfiguration.m22402getColor0d7_KjU();
            }
        }, new InterfaceC10559a() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final RippleAlpha invoke() {
                RippleAlpha rippleAlpha;
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? RippleDefaults.INSTANCE.getRippleAlpha() : rippleAlpha;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRipple() {
        DelegatableNode delegatableNode = this.rippleNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    private final void updateConfiguration() {
        ObserverModifierNodeKt.observeReads(this, new InterfaceC10559a() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode.updateConfiguration.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22049invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22049invoke() {
                if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, RippleKt.getLocalRippleConfiguration())) == null) {
                    DelegatingThemeAwareRippleNode.this.removeRipple();
                } else if (DelegatingThemeAwareRippleNode.this.rippleNode == null) {
                    DelegatingThemeAwareRippleNode.this.attachNewRipple();
                }
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateConfiguration();
    }

    @Override // androidx.compose.p013ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateConfiguration();
    }

    private DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer) {
        this.interactionSource = interactionSource;
        this.bounded = z10;
        this.radius = f10;
        this.color = colorProducer;
    }
}
