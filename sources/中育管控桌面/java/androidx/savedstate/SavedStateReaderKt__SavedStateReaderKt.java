package androidx.savedstate;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, m7880d2 = {"keyOrValueNotFoundError", "", "key", "", "savedstate_release"}, m7881k = 5, m7882mv = {2, 0, 0}, m7884xi = 48, m7885xs = "androidx/savedstate/SavedStateReaderKt")
/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateReaderKt__SavedStateReaderKt {
    @PublishedApi
    public static final Void keyOrValueNotFoundError(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
