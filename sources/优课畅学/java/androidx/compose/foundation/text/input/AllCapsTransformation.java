package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p013ui.text.StringKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.KeyboardCapitalization;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.compose.p013ui.text.intl.Locale;
import androidx.compose.p013ui.text.intl.LocaleList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
final class AllCapsTransformation implements InputTransformation {
    private final KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.Companion.m26575getCharactersIUNYP9k(), (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 126, (AbstractC9126n) null);
    private final Locale locale;

    public AllCapsTransformation(Locale locale) {
        this.locale = locale;
    }

    private final Locale component1() {
        return this.locale;
    }

    public static /* synthetic */ AllCapsTransformation copy$default(AllCapsTransformation allCapsTransformation, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = allCapsTransformation.locale;
        }
        return allCapsTransformation.copy(locale);
    }

    public final AllCapsTransformation copy(Locale locale) {
        return new AllCapsTransformation(locale);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllCapsTransformation) && AbstractC9133u.m16128b(this.locale, ((AllCapsTransformation) obj).locale);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void transformInput(TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer.ChangeList changes = textFieldBuffer.getChanges();
        for (int i10 = 0; i10 < changes.getChangeCount(); i10++) {
            long jMo21342getRangejx7JFs = changes.mo21342getRangejx7JFs(i10);
            changes.mo21341getOriginalRangejx7JFs(i10);
            if (!TextRange.m26358getCollapsedimpl(jMo21342getRangejx7JFs)) {
                textFieldBuffer.replace(TextRange.m26362getMinimpl(jMo21342getRangejx7JFs), TextRange.m26361getMaximpl(jMo21342getRangejx7JFs), StringKt.toUpperCase(TextRangeKt.m26371substringFDrldGo(textFieldBuffer.asCharSequence(), jMo21342getRangejx7JFs), this.locale));
            }
        }
    }
}
