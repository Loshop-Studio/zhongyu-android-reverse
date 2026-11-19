package androidx.compose.p013ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, m13558d2 = {"performAutofill", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "root", "Landroid/view/ViewStructure;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n150#2,3:149\n34#2,6:152\n153#2:158\n37#3,2:159\n26#4:161\n26#4:162\n26#4:163\n26#4:164\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n101#1:149,3\n101#1:152,6\n101#1:158\n101#1:159,2\n114#1:161\n115#1:162\n116#1:163\n117#1:164\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    public static final void performAutofill(AndroidAutofill androidAutofill, SparseArray<AutofillValue> sparseArray) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueM1219a = AbstractC2593f.m1219a(sparseArray.get(iKeyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(autofillValueM1219a)) {
                androidAutofill.getAutofillTree().performAutofill(iKeyAt, autofillApi26Helper.textValue(autofillValueM1219a).toString());
            } else {
                if (autofillApi26Helper.isDate(autofillValueM1219a)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillApi26Helper.isList(autofillValueM1219a)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillApi26Helper.isToggle(autofillValueM1219a)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @RequiresApi(26)
    public static final void populateViewStructure(AndroidAutofill androidAutofill, ViewStructure viewStructure) {
        if (androidAutofill.getAutofillTree().getChildren().isEmpty()) {
            return;
        }
        int iAddChildCount = AutofillApi26Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            ViewStructure viewStructureNewChild = autofillApi26Helper.newChild(viewStructure, iAddChildCount);
            autofillApi26Helper.setAutofillId(viewStructureNewChild, androidAutofill.getRootAutofillId(), iIntValue);
            autofillApi26Helper.setId(viewStructureNewChild, iIntValue, androidAutofill.getView().getContext().getPackageName(), null, null);
            autofillApi26Helper.setAutofillType(viewStructureNewChild, ContentDataType_androidKt.getDataType(ContentDataType.INSTANCE.getText()));
            List<AutofillType> autofillTypes = value.getAutofillTypes();
            ArrayList arrayList = new ArrayList(autofillTypes.size());
            int size = autofillTypes.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i10)));
            }
            autofillApi26Helper.setAutofillHints(viewStructureNewChild, (String[]) arrayList.toArray(new String[0]));
            Rect boundingBox = value.getBoundingBox();
            if (boundingBox == null) {
                Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
            } else {
                int iRound = Math.round(boundingBox.getLeft());
                int iRound2 = Math.round(boundingBox.getTop());
                int iRound3 = Math.round(boundingBox.getRight());
                AutofillApi26Helper.INSTANCE.setDimens(viewStructureNewChild, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
            }
            iAddChildCount++;
        }
    }
}
