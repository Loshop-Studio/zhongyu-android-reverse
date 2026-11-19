package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent {
    public void setEmbeddingRules(Set<androidx.window.extensions.embedding.EmbeddingRule> splitRules) {
        AbstractC9979u.m20294g(splitRules, "splitRules");
    }

    public void setSplitInfoCallback(Consumer<List<androidx.window.extensions.embedding.SplitInfo>> consumer) {
        AbstractC9979u.m20294g(consumer, "consumer");
    }
}
