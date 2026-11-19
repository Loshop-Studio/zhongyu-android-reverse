package androidx.compose.p014ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p014ui.platform.coreshims.ViewCompatShims;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;

@StabilityInferred(parameters = 0)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class AndroidAutofill implements Autofill {
    public static final int $stable = 8;
    private final AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private AutofillId rootAutofillId;
    private final View view;

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        this.view = view;
        this.autofillTree = autofillTree;
        AutofillManager autofillManagerM1065a = AbstractC2648d.m1065a(view.getContext().getSystemService(AbstractC2646c.m1063a()));
        if (autofillManagerM1065a == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManagerM1065a;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 != null) {
            this.rootAutofillId = autofillId2;
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.p014ui.autofill.Autofill
    public void cancelAutofillForNode(AutofillNode autofillNode) {
        this.autofillManager.notifyViewExited(this.view, autofillNode.getId());
    }

    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.p014ui.autofill.Autofill
    public void requestAutofillForNode(AutofillNode autofillNode) {
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.autofillManager.notifyViewEntered(this.view, autofillNode.getId(), new android.graphics.Rect(Math.round(boundingBox.getLeft()), Math.round(boundingBox.getTop()), Math.round(boundingBox.getRight()), Math.round(boundingBox.getBottom())));
    }

    public final void setRootAutofillId(AutofillId autofillId) {
        this.rootAutofillId = autofillId;
    }
}
