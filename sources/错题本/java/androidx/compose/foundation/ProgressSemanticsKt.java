package androidx.compose.foundation;

import androidx.annotation.IntRange;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p200x6.C6751a;
import p200x6.InterfaceC6752b;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Lx6/b;", "valueRange", "", "steps", "progressSemantics", "(Landroidx/compose/ui/Modifier;FLx6/b;I)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ProgressSemanticsKt {
    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier, final float f, @NotNull final InterfaceC6752b interfaceC6752b, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) final int i) {
        return SemanticsModifierKt.semantics(modifier, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) AbstractC5806u.m5276o(Float.valueOf(f), interfaceC6752b)).floatValue(), interfaceC6752b, i));
            }
        });
    }

    public static Modifier progressSemantics$default(Modifier modifier, float f, InterfaceC6752b interfaceC6752b, int i, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC6752b = new C6751a(0.0f, 1.0f);
        }
        if ((i8 & 4) != 0) {
            i = 0;
        }
        return progressSemantics(modifier, f, interfaceC6752b, i);
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier) {
        return SemanticsModifierKt.semantics(modifier, true, new InterfaceC6471c() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return C5443s.f8405a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.INSTANCE.getIndeterminate());
            }
        });
    }
}
