package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.AbstractC5794j;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.C5780c;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p053e6.C5457a;
import p185v7.AbstractC6675d;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0002MNB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020:H\u0002¢\u0006\u0004\bC\u0010DR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010?¨\u0006O"}, m5110d2 = {"Lkotlin/collections/builders/ListBuilder;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/j;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "build", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Ld6/s;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "backing", "[Ljava/lang/Object;", "length", "I", "isReadOnly", "Z", "getSize", "size", "e6/a", "BuilderSubList", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
/* loaded from: classes2.dex */
public final class ListBuilder<E> extends AbstractC5794j implements List<E>, RandomAccess, Serializable {

    /* renamed from: a */
    public static final ListBuilder f9170a;

    @NotNull
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    @Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001QBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020<H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020'2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010LR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010P\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010A¨\u0006R"}, m5110d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/j;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", TypedValues.CycleType.S_WAVE_OFFSET, "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Ld6/s;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", ExifInterface.GPS_DIRECTION_TRUE, "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "readObject", "(Ljava/io/ObjectInputStream;)V", "[Ljava/lang/Object;", "I", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "getSize", "size", "kotlin/collections/builders/a", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class BuilderSubList<E> extends AbstractC5794j implements List<E>, RandomAccess, Serializable {

        @NotNull
        private E[] backing;
        private int length;
        private final int offset;

        @Nullable
        private final BuilderSubList<E> parent;

        @NotNull
        private final ListBuilder<E> root;

        public BuilderSubList(@NotNull E[] backing, int i, int i8, @Nullable BuilderSubList<E> builderSubList, @NotNull ListBuilder<E> root) {
            AbstractC5830k.m5330g(backing, "backing");
            AbstractC5830k.m5330g(root, "root");
            this.backing = backing;
            this.offset = i;
            this.length = i8;
            this.parent = builderSubList;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (((ListBuilder) this.root).isReadOnly) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        /* renamed from: a */
        public final void m5127a(Collection collection, int i, int i8) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.m5127a(collection, i, i8);
            } else {
                this.root.m5121a(collection, i, i8);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i8;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            m5130d();
            m5129c();
            m5128b(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            AbstractC5830k.m5330g(elements, "elements");
            m5130d();
            m5129c();
            int size = elements.size();
            m5127a(elements, this.offset + this.length, size);
            return size > 0;
        }

        /* renamed from: b */
        public final void m5128b(int i, Object obj) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.m5128b(i, obj);
            } else {
                ListBuilder.access$addAtInternal(this.root, i, obj);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        /* renamed from: c */
        public final void m5129c() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            m5130d();
            m5129c();
            m5132f(this.offset, this.length);
        }

        /* renamed from: d */
        public final void m5130d() {
            if (((ListBuilder) this.root).isReadOnly) {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: e */
        public final Object m5131e(int i) {
            ((AbstractList) this).modCount++;
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.m5131e(i) : this.root.m5124d(i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object other) {
            m5129c();
            if (other == this) {
                return true;
            }
            if (other instanceof List) {
                List list = (List) other;
                E[] eArr = this.backing;
                int i = this.offset;
                int i8 = this.length;
                if (i8 == list.size()) {
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (AbstractC5830k.m5325b(eArr[i + i9], list.get(i9))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public final void m5132f(int i, int i8) {
            if (i8 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.m5132f(i, i8);
            } else {
                this.root.m5125e(i, i8);
            }
            this.length -= i8;
        }

        /* renamed from: g */
        public final int m5133g(int i, int i8, Collection collection, boolean z8) {
            BuilderSubList<E> builderSubList = this.parent;
            int iM5133g = builderSubList != null ? builderSubList.m5133g(i, i8, collection, z8) : this.root.m5126f(i, i8, collection, z8);
            if (iM5133g > 0) {
                ((AbstractList) this).modCount++;
            }
            this.length -= iM5133g;
            return iM5133g;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            m5129c();
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5143b(index, i);
            return this.backing[this.offset + index];
        }

        @Override // kotlin.collections.AbstractC5794j
        /* renamed from: getSize */
        public int getLength() {
            m5129c();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            m5129c();
            E[] eArr = this.backing;
            int i = this.offset;
            int i8 = this.length;
            int iHashCode = 1;
            for (int i9 = 0; i9 < i8; i9++) {
                E e = eArr[i + i9];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            m5129c();
            for (int i = 0; i < this.length; i++) {
                if (AbstractC5830k.m5325b(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            m5129c();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            m5129c();
            for (int i = this.length - 1; i >= 0; i--) {
                if (AbstractC5830k.m5325b(this.backing[this.offset + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            m5130d();
            m5129c();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> elements) {
            AbstractC5830k.m5330g(elements, "elements");
            m5130d();
            m5129c();
            return m5133g(this.offset, this.length, elements, false) > 0;
        }

        @Override // kotlin.collections.AbstractC5794j
        public E removeAt(int index) {
            m5130d();
            m5129c();
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5143b(index, i);
            return (E) m5131e(this.offset + index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> elements) {
            AbstractC5830k.m5330g(elements, "elements");
            m5130d();
            m5129c();
            return m5133g(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            m5130d();
            m5129c();
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5143b(index, i);
            E[] eArr = this.backing;
            int i8 = this.offset + index;
            E e = eArr[i8];
            eArr[i8] = element;
            return e;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int fromIndex, int toIndex) {
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5145d(fromIndex, toIndex, i);
            return new BuilderSubList(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            AbstractC5830k.m5330g(array, "array");
            m5129c();
            int length = array.length;
            int i = this.length;
            if (length < i) {
                E[] eArr = this.backing;
                int i8 = this.offset;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i8, i + i8, array.getClass());
                AbstractC5830k.m5329f(tArr, "copyOfRange(...)");
                return tArr;
            }
            E[] eArr2 = this.backing;
            int i9 = this.offset;
            AbstractC5802q.m5178E(eArr2, array, 0, i9, i + i9);
            int i10 = this.length;
            if (i10 < array.length) {
                array[i10] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            m5129c();
            return AbstractC6675d.m6340b(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int index) {
            m5129c();
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5144c(index, i);
            return new C5779a(this, index);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            m5130d();
            m5129c();
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5144c(index, i);
            m5128b(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
            AbstractC5830k.m5330g(elements, "elements");
            m5130d();
            m5129c();
            C5780c c5780c = AbstractC5786f.Companion;
            int i = this.length;
            c5780c.getClass();
            C5780c.m5144c(index, i);
            int size = elements.size();
            m5127a(elements, this.offset + index, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            m5129c();
            E[] eArr = this.backing;
            int i = this.offset;
            return AbstractC5802q.m5184K(i, this.length + i, eArr);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        f9170a = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    public static final void access$addAtInternal(ListBuilder listBuilder, int i, Object obj) {
        ((AbstractList) listBuilder).modCount++;
        listBuilder.m5123c(i, 1);
        ((E[]) listBuilder.backing)[i] = obj;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: a */
    public final void m5121a(Collection collection, int i, int i8) {
        ((AbstractList) this).modCount++;
        m5123c(i, i8);
        Iterator<E> it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.backing[i + i9] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        m5122b();
        int i = this.length;
        ((AbstractList) this).modCount++;
        m5123c(i, 1);
        this.backing[i] = element;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        m5122b();
        int size = elements.size();
        m5121a(elements, this.length, size);
        return size > 0;
    }

    /* renamed from: b */
    public final void m5122b() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @NotNull
    public final List<E> build() {
        m5122b();
        this.isReadOnly = true;
        return this.length > 0 ? this : f9170a;
    }

    /* renamed from: c */
    public final void m5123c(int i, int i8) {
        int i9 = this.length + i8;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i9 > eArr.length) {
            C5780c c5780c = AbstractC5786f.Companion;
            int length = eArr.length;
            c5780c.getClass();
            int iM5146e = C5780c.m5146e(length, i9);
            E[] eArr2 = this.backing;
            AbstractC5830k.m5330g(eArr2, "<this>");
            E[] eArr3 = (E[]) Arrays.copyOf(eArr2, iM5146e);
            AbstractC5830k.m5329f(eArr3, "copyOf(...)");
            this.backing = eArr3;
        }
        E[] eArr4 = this.backing;
        AbstractC5802q.m5178E(eArr4, eArr4, i + i8, i, this.length);
        this.length += i8;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m5122b();
        m5125e(0, this.length);
    }

    /* renamed from: d */
    public final Object m5124d(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.backing;
        E e = eArr[i];
        AbstractC5802q.m5178E(eArr, eArr, i, i + 1, this.length);
        E[] eArr2 = this.backing;
        int i8 = this.length - 1;
        AbstractC5830k.m5330g(eArr2, "<this>");
        eArr2[i8] = null;
        this.length--;
        return e;
    }

    /* renamed from: e */
    public final void m5125e(int i, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.backing;
        AbstractC5802q.m5178E(eArr, eArr, i, i + i8, this.length);
        E[] eArr2 = this.backing;
        int i9 = this.length;
        AbstractC6675d.m6353s(i9 - i8, i9, eArr2);
        this.length -= i8;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            List list = (List) other;
            E[] eArr = this.backing;
            int i = this.length;
            if (i == list.size()) {
                for (int i8 = 0; i8 < i; i8++) {
                    if (AbstractC5830k.m5325b(eArr[i8], list.get(i8))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m5126f(int i, int i8, Collection collection, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i + i9;
            if (collection.contains(this.backing[i11]) == z8) {
                E[] eArr = this.backing;
                i9++;
                eArr[i10 + i] = eArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        E[] eArr2 = this.backing;
        AbstractC5802q.m5178E(eArr2, eArr2, i + i10, i8 + i, this.length);
        E[] eArr3 = this.backing;
        int i13 = this.length;
        AbstractC6675d.m6353s(i13 - i12, i13, eArr3);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5143b(index, i);
        return this.backing[index];
    }

    @Override // kotlin.collections.AbstractC5794j
    /* renamed from: getSize, reason: from getter */
    public int getLength() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        E[] eArr = this.backing;
        int i = this.length;
        int iHashCode = 1;
        for (int i8 = 0; i8 < i; i8++) {
            E e = eArr[i8];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i = 0; i < this.length; i++) {
            if (AbstractC5830k.m5325b(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (AbstractC5830k.m5325b(this.backing[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        m5122b();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        m5122b();
        return m5126f(0, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.AbstractC5794j
    public E removeAt(int index) {
        m5122b();
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5143b(index, i);
        return (E) m5124d(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        m5122b();
        return m5126f(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        m5122b();
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5143b(index, i);
        E[] eArr = this.backing;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5145d(fromIndex, toIndex, i);
        return new BuilderSubList(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        AbstractC5830k.m5330g(array, "array");
        int length = array.length;
        int i = this.length;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i, array.getClass());
            AbstractC5830k.m5329f(tArr, "copyOfRange(...)");
            return tArr;
        }
        AbstractC5802q.m5178E(this.backing, array, 0, 0, i);
        int i8 = this.length;
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return AbstractC6675d.m6340b(this.backing, 0, this.length, this);
    }

    public /* synthetic */ ListBuilder(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5144c(index, i);
        return new C5457a(this, index);
    }

    public ListBuilder(int i) {
        if (i >= 0) {
            this.backing = (E[]) new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        AbstractC5830k.m5330g(elements, "elements");
        m5122b();
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5144c(index, i);
        int size = elements.size();
        m5121a(elements, index, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        m5122b();
        C5780c c5780c = AbstractC5786f.Companion;
        int i = this.length;
        c5780c.getClass();
        C5780c.m5144c(index, i);
        ((AbstractList) this).modCount++;
        m5123c(index, 1);
        this.backing[index] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return AbstractC5802q.m5184K(0, this.length, this.backing);
    }
}
