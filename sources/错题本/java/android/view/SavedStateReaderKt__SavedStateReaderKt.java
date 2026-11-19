package android.view;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, m5110d2 = {"keyOrValueNotFoundError", "", "key", "", "savedstate_release"}, m5111k = 5, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5115xs = "androidx/savedstate/SavedStateReaderKt")
/* loaded from: classes2.dex */
final /* synthetic */ class SavedStateReaderKt__SavedStateReaderKt {
    @PublishedApi
    @NotNull
    public static final Void keyOrValueNotFoundError(@NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        throw new IllegalArgumentException(AbstractC0037f.m86k("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
