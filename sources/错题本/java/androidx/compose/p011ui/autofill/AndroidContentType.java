package androidx.compose.p011ui.autofill;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5795j0;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m5110d2 = {"Landroidx/compose/ui/autofill/AndroidContentType;", "Landroidx/compose/ui/autofill/ContentType;", "androidAutofillHints", "", "", "(Ljava/util/Set;)V", "getAndroidAutofillHints", "()Ljava/util/Set;", "plus", "other", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class AndroidContentType implements ContentType {

    @NotNull
    private final Set<String> androidAutofillHints;

    public AndroidContentType(@NotNull Set<String> set) {
        this.androidAutofillHints = set;
    }

    @NotNull
    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.p011ui.autofill.ContentType
    @NotNull
    public ContentType plus(@NotNull ContentType other) {
        AbstractC5830k.m5328e(other, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new AndroidContentType(AbstractC5795j0.m5163x(this.androidAutofillHints, ((AndroidContentType) other).androidAutofillHints));
    }
}
