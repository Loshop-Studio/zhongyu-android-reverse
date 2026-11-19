package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.node.DelegatableNode;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class Ripple_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleContainer createAndAttachRippleContainerIfNeeded(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    /* renamed from: createPlatformRippleNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m28330createPlatformRippleNodeTDGSqEk(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a) {
        return new AndroidRippleNode(interactionSource, z10, f10, colorProducer, interfaceC9529a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup findNearestViewGroup(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
