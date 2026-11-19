package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerIconKt;
import androidx.compose.p011ui.node.DpTouchBoundsExpansion;
import androidx.compose.p011ui.node.TouchBoundsExpansionKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "Ld6/s;", "onHandwritingSlopExceeded", "stylusHandwriting", "(Landroidx/compose/ui/Modifier;ZZLr6/a;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "HandwritingBoundsVerticalOffset", "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsHorizontalOffset", "getHandwritingBoundsHorizontalOffset", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "HandwritingBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getHandwritingBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nStylusHandwriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,215:1\n113#2:216\n113#2:217\n*S KotlinDebug\n*F\n+ 1 StylusHandwriting.kt\nandroidx/compose/foundation/text/handwriting/StylusHandwritingKt\n*L\n206#1:216\n207#1:217\n*E\n"})
/* loaded from: classes.dex */
public final class StylusHandwritingKt {

    @NotNull
    private static final DpTouchBoundsExpansion HandwritingBoundsExpansion;
    private static final float HandwritingBoundsHorizontalOffset;
    private static final float HandwritingBoundsVerticalOffset;

    static {
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(40);
        HandwritingBoundsVerticalOffset = fM13305constructorimpl;
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(10);
        HandwritingBoundsHorizontalOffset = fM13305constructorimpl2;
        HandwritingBoundsExpansion = TouchBoundsExpansionKt.m12410DpTouchBoundsExpansiona9UjIt4(fM13305constructorimpl2, fM13305constructorimpl, fM13305constructorimpl2, fM13305constructorimpl);
    }

    @NotNull
    public static final DpTouchBoundsExpansion getHandwritingBoundsExpansion() {
        return HandwritingBoundsExpansion;
    }

    public static final float getHandwritingBoundsHorizontalOffset() {
        return HandwritingBoundsHorizontalOffset;
    }

    public static final float getHandwritingBoundsVerticalOffset() {
        return HandwritingBoundsVerticalOffset;
    }

    @NotNull
    public static final Modifier stylusHandwriting(@NotNull Modifier modifier, boolean z8, boolean z9, @NotNull InterfaceC6469a interfaceC6469a) {
        if (!z8 || !StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return modifier;
        }
        if (z9) {
            modifier = PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, HandwritingBoundsExpansion);
        }
        return modifier.then(new StylusHandwritingElement(interfaceC6469a));
    }
}
