package androidx.compose.p012ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
@Metadata(m13412d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0010\r\n\u0002\b!\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J#\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0007¢\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\tH\u0007J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\tH\u0007J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004H\u0007J\u0018\u0010(\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000fH\u0007J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tH\u0007J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0007J\u0018\u0010/\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00100\u001a\u00020\tH\u0007J@\u00101\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0007J\u0018\u00108\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00109\u001a\u00020\tH\u0007J\u0018\u0010:\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\tH\u0007J\u0018\u0010<\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\tH\u0007J6\u0010>\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010\u000f2\b\u0010A\u001a\u0004\u0018\u00010\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u000fH\u0007J\u0018\u0010C\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0004H\u0007J\u0018\u0010D\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\tH\u0007J\u0018\u0010F\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\tH\u0007J\u0018\u0010H\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\tH\u0007J\u0018\u0010J\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010K\u001a\u00020.H\u0007J\u0018\u0010L\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0004H\u0007J\u0010\u0010N\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006O"}, m13413d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "()V", "addChildCount", "", "structure", "Landroid/view/ViewStructure;", "num", "booleanValue", "", "value", "Landroid/view/autofill/AutofillValue;", "getAutofillId", "Landroid/view/autofill/AutofillId;", "getAutofillTextValue", "", "isDate", "isList", "isText", "isToggle", "listValue", "newChild", "index", "setAutofillHints", "", "hints", "", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "setAutofillId", "parent", "virtualId", "setAutofillType", "type", "setAutofillValue", "setCheckable", "checkable", "setChecked", "checked", "setChildCount", "numChildren", "setClassName", "classname", "setClickable", "clickable", "setContentDescription", "contentDescription", "", "setDataIsSensitive", "isSensitive", "setDimens", "left", "top", "scrollX", "scrollY", "width", "height", "setEnabled", "enabled", "setFocusable", "focusable", "setFocused", "focused", "setId", "id", "packageName", "typeName", "entryName", "setInputType", "setLongClickable", "longClickable", "setOpaque", "isOpaque", "setSelected", "isSelected", "setText", "text", "setVisibility", "visibility", "textValue", "ui_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AutofillApi26Helper {
    public static final int $stable = 0;
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @RequiresApi(26)
    public final int addChildCount(ViewStructure structure, int num) {
        return structure.addChildCount(num);
    }

    @RequiresApi(26)
    public final boolean booleanValue(AutofillValue value) {
        return value.getToggleValue();
    }

    @RequiresApi(26)
    public final AutofillId getAutofillId(ViewStructure structure) {
        return structure.getAutofillId();
    }

    @RequiresApi(26)
    public final AutofillValue getAutofillTextValue(String value) {
        return AutofillValue.forText(value);
    }

    @RequiresApi(26)
    public final boolean isDate(AutofillValue value) {
        return value.isDate();
    }

    @RequiresApi(26)
    public final boolean isList(AutofillValue value) {
        return value.isList();
    }

    @RequiresApi(26)
    public final boolean isText(AutofillValue value) {
        return value.isText();
    }

    @RequiresApi(26)
    public final boolean isToggle(AutofillValue value) {
        return value.isToggle();
    }

    @RequiresApi(26)
    public final int listValue(AutofillValue value) {
        return value.getListValue();
    }

    @RequiresApi(26)
    public final ViewStructure newChild(ViewStructure structure, int index) {
        return structure.newChild(index);
    }

    @RequiresApi(26)
    public final void setAutofillHints(ViewStructure structure, String[] hints) {
        structure.setAutofillHints(hints);
    }

    @RequiresApi(26)
    public final void setAutofillId(ViewStructure structure, AutofillId parent, int virtualId) {
        structure.setAutofillId(parent, virtualId);
    }

    @RequiresApi(26)
    public final void setAutofillType(ViewStructure structure, int type) {
        structure.setAutofillType(type);
    }

    @RequiresApi(26)
    public final void setAutofillValue(ViewStructure structure, AutofillValue value) {
        structure.setAutofillValue(value);
    }

    @RequiresApi(26)
    public final void setCheckable(ViewStructure structure, boolean checkable) {
        structure.setCheckable(checkable);
    }

    @RequiresApi(26)
    public final void setChecked(ViewStructure structure, boolean checked) {
        structure.setChecked(checked);
    }

    @RequiresApi(26)
    public final void setChildCount(ViewStructure structure, int numChildren) {
        structure.setChildCount(numChildren);
    }

    @RequiresApi(26)
    public final void setClassName(ViewStructure structure, String classname) {
        structure.setClassName(classname);
    }

    @RequiresApi(26)
    public final void setClickable(ViewStructure structure, boolean clickable) {
        structure.setClickable(clickable);
    }

    @RequiresApi(26)
    public final void setContentDescription(ViewStructure structure, CharSequence contentDescription) {
        structure.setContentDescription(contentDescription);
    }

    @RequiresApi(26)
    public final void setDataIsSensitive(ViewStructure structure, boolean isSensitive) {
        structure.setDataIsSensitive(isSensitive);
    }

    @RequiresApi(26)
    public final void setDimens(ViewStructure structure, int left, int top2, int scrollX, int scrollY, int width, int height) {
        structure.setDimens(left, top2, scrollX, scrollY, width, height);
    }

    @RequiresApi(26)
    public final void setEnabled(ViewStructure structure, boolean enabled) {
        structure.setEnabled(enabled);
    }

    @RequiresApi(26)
    public final void setFocusable(ViewStructure structure, boolean focusable) {
        structure.setFocusable(focusable);
    }

    @RequiresApi(26)
    public final void setFocused(ViewStructure structure, boolean focused) {
        structure.setFocused(focused);
    }

    @RequiresApi(26)
    public final void setId(ViewStructure structure, int id, String packageName, String typeName, String entryName) {
        structure.setId(id, packageName, typeName, entryName);
    }

    @RequiresApi(26)
    public final void setInputType(ViewStructure structure, int type) {
        structure.setInputType(type);
    }

    @RequiresApi(26)
    public final void setLongClickable(ViewStructure structure, boolean longClickable) {
        structure.setLongClickable(longClickable);
    }

    @RequiresApi(26)
    public final void setOpaque(ViewStructure structure, boolean isOpaque) {
        structure.setOpaque(isOpaque);
    }

    @RequiresApi(26)
    public final void setSelected(ViewStructure structure, boolean isSelected) {
        structure.setSelected(isSelected);
    }

    @RequiresApi(26)
    public final void setText(ViewStructure structure, CharSequence text) {
        structure.setText(text);
    }

    @RequiresApi(26)
    public final void setVisibility(ViewStructure structure, int visibility) {
        structure.setVisibility(visibility);
    }

    @RequiresApi(26)
    public final CharSequence textValue(AutofillValue value) {
        return value.getTextValue();
    }
}
