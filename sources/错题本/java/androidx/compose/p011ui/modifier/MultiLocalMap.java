package androidx.compose.p011ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u00126\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0006\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\r\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0017\u001a\u00020\u00142\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Lkotlin/Pair;", "Landroidx/compose/ui/modifier/ModifierLocal;", "", "entry1", "", "entries", "<init>", "(Lkotlin/Pair;[Lkotlin/Pair;)V", ExifInterface.GPS_DIRECTION_TRUE, "key", "value", "Ld6/s;", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "set", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "contains", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;

    @NotNull
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    public MultiLocalMap(@NotNull Pair<? extends ModifierLocal<?>, ? extends Object> pair, @NotNull Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        super(null);
        SnapshotStateMap<ModifierLocal<?>, Object> snapshotStateMapMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = snapshotStateMapMutableStateMapOf;
        snapshotStateMapMutableStateMapOf.put(pair.getFirst(), pair.getSecond());
        snapshotStateMapMutableStateMapOf.putAll(AbstractC5785e0.m5157K(pairArr));
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal<?> key) {
        return this.map.containsKey(key);
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalMap
    @Nullable
    public <T> T get$ui_release(@NotNull ModifierLocal<T> key) {
        T t8 = (T) this.map.get(key);
        if (t8 == null) {
            return null;
        }
        return t8;
    }

    @Override // androidx.compose.p011ui.modifier.ModifierLocalMap
    /* renamed from: set$ui_release */
    public <T> void mo12140set$ui_release(@NotNull ModifierLocal<T> key, T value) {
        this.map.put(key, value);
    }
}
