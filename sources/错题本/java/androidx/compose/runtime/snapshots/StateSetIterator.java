package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p160s6.InterfaceC6560a;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010!R*\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010!R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "set", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V", "Ld6/s;", "advance", "()V", "Lkotlin/Function0;", "block", "modify", "(Lr6/a;)Ljava/lang/Object;", "validateModification", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "getSet", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "current", "Ljava/lang/Object;", "getCurrent", "setCurrent", "(Ljava/lang/Object;)V", "getNext", "setNext", "getNext$annotations", "", "modification", "I", "getModification", "()I", "setModification", "(I)V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n258#1,2:269\n1#2:271\n1#2:272\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n*L\n241#1:269,2\n241#1:271\n*E\n"})
/* loaded from: classes.dex */
final class StateSetIterator<T> implements Iterator<T>, InterfaceC6560a {

    @Nullable
    private T current;

    @NotNull
    private final Iterator<T> iterator;
    private int modification;

    @Nullable
    private T next;

    @NotNull
    private final SnapshotStateSet<T> set;

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(@NotNull SnapshotStateSet<T> snapshotStateSet, @NotNull Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = snapshotStateSet.getModification$runtime_release();
        advance();
    }

    private final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    public static /* synthetic */ void getNext$annotations() {
    }

    private final <T> T modify(InterfaceC6469a block) {
        validateModification();
        T t8 = (T) block.invoke();
        this.modification = this.set.getModification$runtime_release();
        return t8;
    }

    private final void validateModification() {
        if (this.set.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @Nullable
    public final T getCurrent() {
        return this.current;
    }

    @NotNull
    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getModification() {
        return this.modification;
    }

    @Nullable
    public final T getNext() {
        return this.next;
    }

    @NotNull
    public final SnapshotStateSet<T> getSet() {
        return this.set;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public T next() {
        validateModification();
        advance();
        T t8 = this.current;
        if (t8 != null) {
            return t8;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        validateModification();
        T t8 = this.current;
        if (t8 == null) {
            throw new IllegalStateException();
        }
        this.set.remove(t8);
        this.current = null;
        this.modification = this.set.getModification$runtime_release();
    }

    public final void setCurrent(@Nullable T t8) {
        this.current = t8;
    }

    public final void setModification(int i) {
        this.modification = i;
    }

    public final void setNext(@Nullable T t8) {
        this.next = t8;
    }
}
