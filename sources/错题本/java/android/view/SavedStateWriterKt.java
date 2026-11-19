package android.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"androidx/savedstate/SavedStateWriterKt__SavedStateWriter_androidKt"}, m5111k = 4, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateWriterKt {
    @PublishedApi
    @NotNull
    public static final <T> ArrayList<T> toArrayListUnsafe(@NotNull Collection<?> collection) {
        return SavedStateWriterKt__SavedStateWriter_androidKt.toArrayListUnsafe(collection);
    }
}
