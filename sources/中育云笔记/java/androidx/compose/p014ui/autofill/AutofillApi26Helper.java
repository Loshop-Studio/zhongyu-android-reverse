package androidx.compose.p014ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @RequiresApi(26)
    public final int addChildCount(ViewStructure viewStructure, int i10) {
        return viewStructure.addChildCount(i10);
    }

    @RequiresApi(26)
    public final boolean booleanValue(AutofillValue autofillValue) {
        return autofillValue.getToggleValue();
    }

    @RequiresApi(26)
    public final AutofillId getAutofillId(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    @RequiresApi(26)
    public final AutofillValue getAutofillTextValue(String str) {
        return AutofillValue.forText(str);
    }

    @RequiresApi(26)
    public final boolean isDate(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    @RequiresApi(26)
    public final boolean isList(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    @RequiresApi(26)
    public final boolean isText(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    @RequiresApi(26)
    public final boolean isToggle(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    @RequiresApi(26)
    public final int listValue(AutofillValue autofillValue) {
        return autofillValue.getListValue();
    }

    @RequiresApi(26)
    public final ViewStructure newChild(ViewStructure viewStructure, int i10) {
        return viewStructure.newChild(i10);
    }

    @RequiresApi(26)
    public final void setAutofillHints(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @RequiresApi(26)
    public final void setAutofillId(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    @RequiresApi(26)
    public final void setAutofillType(ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    @RequiresApi(26)
    public final void setAutofillValue(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    @RequiresApi(26)
    public final void setCheckable(ViewStructure viewStructure, boolean z10) {
        viewStructure.setCheckable(z10);
    }

    @RequiresApi(26)
    public final void setChecked(ViewStructure viewStructure, boolean z10) {
        viewStructure.setChecked(z10);
    }

    @RequiresApi(26)
    public final void setChildCount(ViewStructure viewStructure, int i10) {
        viewStructure.setChildCount(i10);
    }

    @RequiresApi(26)
    public final void setClassName(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    @RequiresApi(26)
    public final void setClickable(ViewStructure viewStructure, boolean z10) {
        viewStructure.setClickable(z10);
    }

    @RequiresApi(26)
    public final void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    @RequiresApi(26)
    public final void setDataIsSensitive(ViewStructure viewStructure, boolean z10) {
        viewStructure.setDataIsSensitive(z10);
    }

    @RequiresApi(26)
    public final void setDimens(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    @RequiresApi(26)
    public final void setEnabled(ViewStructure viewStructure, boolean z10) {
        viewStructure.setEnabled(z10);
    }

    @RequiresApi(26)
    public final void setFocusable(ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocusable(z10);
    }

    @RequiresApi(26)
    public final void setFocused(ViewStructure viewStructure, boolean z10) {
        viewStructure.setFocused(z10);
    }

    @RequiresApi(26)
    public final void setId(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
        viewStructure.setId(i10, str, str2, str3);
    }

    @RequiresApi(26)
    public final void setInputType(ViewStructure viewStructure, int i10) {
        viewStructure.setInputType(i10);
    }

    @RequiresApi(26)
    public final void setLongClickable(ViewStructure viewStructure, boolean z10) {
        viewStructure.setLongClickable(z10);
    }

    @RequiresApi(26)
    public final void setOpaque(ViewStructure viewStructure, boolean z10) {
        viewStructure.setOpaque(z10);
    }

    @RequiresApi(26)
    public final void setSelected(ViewStructure viewStructure, boolean z10) {
        viewStructure.setSelected(z10);
    }

    @RequiresApi(26)
    public final void setText(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    @RequiresApi(26)
    public final void setVisibility(ViewStructure viewStructure, int i10) {
        viewStructure.setVisibility(i10);
    }

    @RequiresApi(26)
    public final CharSequence textValue(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
