package androidx.compose.p014ui.tooling.preview.datasource;

import androidx.compose.p014ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import p296pd.InterfaceC10659g;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.p014ui.tooling.preview.PreviewParameterProvider
    public InterfaceC10659g getValues() {
        return AbstractC10947g0.m23930d0(this.collection);
    }
}
