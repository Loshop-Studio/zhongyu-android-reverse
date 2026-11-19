package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p014ui.text.StringKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.input.KeyboardCapitalization;
import androidx.compose.p014ui.text.input.PlatformImeOptions;
import androidx.compose.p014ui.text.intl.Locale;
import androidx.compose.p014ui.text.intl.LocaleList;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class AllCapsTransformation implements InputTransformation {
    private final KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.Companion.m33177getCharactersIUNYP9k(), (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, Opcodes.IAND, (AbstractC9972n) null);
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
        return (obj instanceof AllCapsTransformation) && AbstractC9979u.m20289b(this.locale, ((AllCapsTransformation) obj).locale);
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
            long jMo27944getRangejx7JFs = changes.mo27944getRangejx7JFs(i10);
            changes.mo27943getOriginalRangejx7JFs(i10);
            if (!TextRange.m32960getCollapsedimpl(jMo27944getRangejx7JFs)) {
                textFieldBuffer.replace(TextRange.m32964getMinimpl(jMo27944getRangejx7JFs), TextRange.m32963getMaximpl(jMo27944getRangejx7JFs), StringKt.toUpperCase(TextRangeKt.m32973substringFDrldGo(textFieldBuffer.asCharSequence(), jMo27944getRangejx7JFs), this.locale));
            }
        }
    }
}
