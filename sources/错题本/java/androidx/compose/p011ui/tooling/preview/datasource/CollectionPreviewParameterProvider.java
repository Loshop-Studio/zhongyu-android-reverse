package androidx.compose.p011ui.tooling.preview.datasource;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import org.jetbrains.annotations.NotNull;
import p214z6.InterfaceC6830h;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m5110d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "collection", "<init>", "(Ljava/util/Collection;)V", "Ljava/util/Collection;", "Lz6/h;", "getValues", "()Lz6/h;", "values", "ui-tooling-preview_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;

    @NotNull
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(@NotNull Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public InterfaceC6830h getValues() {
        return AbstractC5805t.m5223c0(this.collection);
    }
}
