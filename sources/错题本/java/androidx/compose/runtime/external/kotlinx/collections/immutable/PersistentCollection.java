package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p160s6.InterfaceC6561b;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0016J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000b\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "element", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "(Lr6/c;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "Builder", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", ExifInterface.LONGITUDE_EAST, "", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Builder<E> extends Collection<E>, InterfaceC6561b {
        @NotNull
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> add(E element);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> addAll(@NotNull Collection<? extends E> elements);

    @NotNull
    Builder<E> builder();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> remove(E element);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> removeAll(@NotNull Collection<? extends E> elements);

    @NotNull
    PersistentCollection<E> removeAll(@NotNull InterfaceC6471c predicate);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> retainAll(@NotNull Collection<? extends E> elements);
}
