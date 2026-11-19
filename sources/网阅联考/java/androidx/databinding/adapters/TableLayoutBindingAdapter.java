package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import java.util.regex.Pattern;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class TableLayoutBindingAdapter {
    private static final int MAX_COLUMNS = 20;
    private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    private static SparseBooleanArray parseColumns(CharSequence charSequence) throws NumberFormatException {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String str : sColumnPattern.split(charSequence)) {
            try {
                int i4 = Integer.parseInt(str);
                if (i4 >= 0) {
                    sparseBooleanArray.put(i4, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    @BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) throws NumberFormatException {
        SparseBooleanArray columns = parseColumns(charSequence);
        for (int i4 = 0; i4 < 20; i4++) {
            boolean z3 = columns.get(i4, false);
            if (z3 != tableLayout.isColumnCollapsed(i4)) {
                tableLayout.setColumnCollapsed(i4, z3);
            }
        }
    }

    @BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) throws NumberFormatException {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iKeyAt = columns.keyAt(i4);
            boolean zValueAt = columns.valueAt(i4);
            if (zValueAt) {
                tableLayout.setColumnShrinkable(iKeyAt, zValueAt);
            }
        }
    }

    @BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) throws NumberFormatException {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int i4 = 0; i4 < size; i4++) {
            int iKeyAt = columns.keyAt(i4);
            boolean zValueAt = columns.valueAt(i4);
            if (zValueAt) {
                tableLayout.setColumnStretchable(iKeyAt, zValueAt);
            }
        }
    }
}
