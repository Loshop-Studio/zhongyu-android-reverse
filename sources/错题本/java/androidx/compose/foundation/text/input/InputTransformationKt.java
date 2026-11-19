package androidx.compose.foundation.text.input;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001aK\u0010\u000b\u001a\u00020\u0000*\u00020\u000026\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Landroidx/compose/foundation/text/input/InputTransformation;", "next", "then", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/InputTransformation;)Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "current", "proposed", "transformation", "byValue", "(Landroidx/compose/foundation/text/input/InputTransformation;Lr6/e;)Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/ui/text/intl/Locale;", "locale", "allCaps", "(Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/intl/Locale;)Landroidx/compose/foundation/text/input/InputTransformation;", "", "maxLength", "(Landroidx/compose/foundation/text/input/InputTransformation;I)Landroidx/compose/foundation/text/input/InputTransformation;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InputTransformationKt {
    @Stable
    @NotNull
    public static final InputTransformation allCaps(@NotNull InputTransformation inputTransformation, @NotNull Locale locale) {
        return then(inputTransformation, new AllCapsTransformation(locale));
    }

    @Stable
    @NotNull
    public static final InputTransformation byValue(@NotNull InputTransformation inputTransformation, @NotNull InterfaceC6473e interfaceC6473e) {
        return then(inputTransformation, new InputTransformationByValue(interfaceC6473e));
    }

    @Stable
    @NotNull
    public static final InputTransformation maxLength(@NotNull InputTransformation inputTransformation, int i) {
        return then(inputTransformation, new MaxLengthFilter(i));
    }

    @Stable
    @NotNull
    public static final InputTransformation then(@NotNull InputTransformation inputTransformation, @NotNull InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
