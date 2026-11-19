package android.view.viewmodel;

import android.view.viewmodel.CreationExtras;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "key", "", "contains", "(Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/lifecycle/viewmodel/CreationExtras$Key;)Z", "creationExtras", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "plus", "(Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Ld6/s;", "plusAssign", "(Landroidx/lifecycle/viewmodel/MutableCreationExtras;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CreationExtrasKt {
    public static final boolean contains(@NotNull CreationExtras creationExtras, @NotNull CreationExtras.Key<?> key) {
        AbstractC5830k.m5330g(creationExtras, "<this>");
        AbstractC5830k.m5330g(key, "key");
        return creationExtras.getExtras$lifecycle_viewmodel_release().containsKey(key);
    }

    @NotNull
    public static final MutableCreationExtras plus(@NotNull CreationExtras creationExtras, @NotNull CreationExtras creationExtras2) {
        AbstractC5830k.m5330g(creationExtras, "<this>");
        AbstractC5830k.m5330g(creationExtras2, "creationExtras");
        return new MutableCreationExtras(AbstractC5785e0.m5152F(creationExtras.getExtras$lifecycle_viewmodel_release(), creationExtras2.getExtras$lifecycle_viewmodel_release()));
    }

    public static final void plusAssign(@NotNull MutableCreationExtras mutableCreationExtras, @NotNull CreationExtras creationExtras) {
        AbstractC5830k.m5330g(mutableCreationExtras, "<this>");
        AbstractC5830k.m5330g(creationExtras, "creationExtras");
        mutableCreationExtras.getExtras$lifecycle_viewmodel_release().putAll(creationExtras.getExtras$lifecycle_viewmodel_release());
    }
}
