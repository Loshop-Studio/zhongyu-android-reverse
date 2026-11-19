package kotlin.enums;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.C5780c;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

@SinceKotlin(version = "1.8")
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m5110d2 = {"Lkotlin/enums/EnumEntriesList;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lj6/a;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Ld6/s;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "index", "get", "(I)Ljava/lang/Enum;", "element", "", "contains", "(Ljava/lang/Enum;)Z", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "[Ljava/lang/Enum;", "getSize", "()I", "size", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class EnumEntriesList<T extends Enum<T>> extends AbstractC5786f implements InterfaceC5748a, Serializable {

    @NotNull
    private final T[] entries;

    public EnumEntriesList(@NotNull T[] entries) {
        AbstractC5830k.m5330g(entries, "entries");
        this.entries = entries;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    @Override // kotlin.collections.AbstractC5775a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((EnumEntriesList<T>) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC5786f, kotlin.collections.AbstractC5775a
    /* renamed from: getSize */
    public int get_size() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((EnumEntriesList<T>) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((EnumEntriesList<T>) obj);
        }
        return -1;
    }

    public boolean contains(@NotNull T element) {
        AbstractC5830k.m5330g(element, "element");
        return ((Enum) AbstractC5802q.m5195V(element.ordinal(), this.entries)) == element;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    @NotNull
    public T get(int index) {
        C5780c c5780c = AbstractC5786f.Companion;
        int length = this.entries.length;
        c5780c.getClass();
        C5780c.m5143b(index, length);
        return this.entries[index];
    }

    public int indexOf(@NotNull T element) {
        AbstractC5830k.m5330g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC5802q.m5195V(iOrdinal, this.entries)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(@NotNull T element) {
        AbstractC5830k.m5330g(element, "element");
        return indexOf((EnumEntriesList<T>) element);
    }
}
