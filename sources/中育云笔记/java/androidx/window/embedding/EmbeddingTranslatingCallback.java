package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC9979u;

@ExperimentalWindowApi
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends androidx.window.extensions.embedding.SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback, EmbeddingAdapter adapter) {
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(adapter, "adapter");
        this.callback = callback;
        this.adapter = adapter;
    }

    @Override // java.util.function.Consumer
    public void accept(List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        AbstractC9979u.m20294g(splitInfoList, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(splitInfoList));
    }
}
