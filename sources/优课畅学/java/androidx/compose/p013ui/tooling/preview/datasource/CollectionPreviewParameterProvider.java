package androidx.compose.p013ui.tooling.preview.datasource;

import androidx.compose.p013ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import p101f8.InterfaceC8469g;
import p134i7.AbstractC8778f0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.p013ui.tooling.preview.PreviewParameterProvider
    public InterfaceC8469g getValues() {
        return AbstractC8778f0.m14554c0(this.collection);
    }
}
