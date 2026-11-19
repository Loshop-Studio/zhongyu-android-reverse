package androidx.compose.foundation.text.input;

import androidx.compose.p013ui.text.intl.Locale;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class InputTransformationKt {
    @Stable
    public static final InputTransformation allCaps(InputTransformation inputTransformation, Locale locale) {
        return then(inputTransformation, new AllCapsTransformation(locale));
    }

    @Stable
    public static final InputTransformation byValue(InputTransformation inputTransformation, InterfaceC10574p interfaceC10574p) {
        return then(inputTransformation, new InputTransformationByValue(interfaceC10574p));
    }

    @Stable
    public static final InputTransformation maxLength(InputTransformation inputTransformation, int i10) {
        return then(inputTransformation, new MaxLengthFilter(i10));
    }

    @Stable
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
