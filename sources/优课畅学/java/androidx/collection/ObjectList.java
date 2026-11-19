package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int i10, AbstractC9126n abstractC9126n) {
        this(i10);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC10570l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC10570l2);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e10) {
        return indexOf(e10) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        AbstractC9133u.m16133g(elements, "elements");
        for (E e10 : elements) {
            if (!contains(e10)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        return (E) this.content[i10];
    }

    public final E elementAtOrElse(@IntRange(from = 0) int i10, InterfaceC10570l defaultValue) {
        AbstractC9133u.m16133g(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this._size) ? (E) defaultValue.invoke(Integer.valueOf(i10)) : (E) this.content[i10];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i10 = objectList._size;
            int i11 = this._size;
            if (i10 == i11) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                C8321f c8321fM13525t = AbstractC8323h.m13525t(0, i11);
                int iM13496b = c8321fM13525t.m13496b();
                int iM13497c = c8321fM13525t.m13497c();
                if (iM13496b > iM13497c) {
                    return true;
                }
                while (AbstractC9133u.m16128b(objArr[iM13496b], objArr2[iM13496b])) {
                    if (iM13496b == iM13497c) {
                        return true;
                    }
                    iM13496b++;
                }
                return false;
            }
        }
        return false;
    }

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r10, InterfaceC10574p operation) {
        AbstractC9133u.m16133g(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, InterfaceC10575q operation) {
        AbstractC9133u.m16133g(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(Integer.valueOf(i11), r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R foldRight(R r10, InterfaceC10574p operation) {
        AbstractC9133u.m16133g(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(objArr[i10], r10);
        }
    }

    public final <R> R foldRightIndexed(R r10, InterfaceC10575q operation) {
        AbstractC9133u.m16133g(operation, "operation");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), objArr[i10], r10);
        }
    }

    public final void forEach(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(objArr[i11]);
        }
    }

    public final void forEachIndexed(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), objArr[i11]);
        }
    }

    public final void forEachReversed(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(objArr[i10]);
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        Object[] objArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), objArr[i10]);
            }
        }
    }

    public final E get(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i10);
        }
        return (E) this.content[i10];
    }

    public final C8321f getIndices() {
        return AbstractC8323h.m13525t(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e10) {
        int i10 = 0;
        if (e10 == null) {
            Object[] objArr = this.content;
            int i11 = this._size;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        while (i10 < i12) {
            if (e10.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final int indexOfFirst(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(objArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i10])).booleanValue());
        return i10;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final int lastIndexOf(E e10) {
        if (e10 == null) {
            Object[] objArr = this.content;
            for (int i10 = this._size - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i11 = this._size - 1; -1 < i11; i11--) {
                if (e10.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (((Boolean) predicate.invoke(objArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i10);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new InterfaceC10570l(this) { // from class: androidx.collection.ObjectList.toString.1
            final /* synthetic */ ObjectList<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((C09751) obj);
            }

            @Override // p300x7.InterfaceC10570l
            public final CharSequence invoke(E e10) {
                return e10 == this.this$0 ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    private ObjectList(int i10) {
        this.content = i10 == 0 ? ObjectListKt.EmptyArray : new Object[i10];
    }

    public final boolean any(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(objArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((Boolean) predicate.invoke(objArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final E firstOrNull(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            E e10 = (E) objArr[i11];
            if (((Boolean) predicate.invoke(e10)).booleanValue()) {
                return e10;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC9133u.m16133g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!contains(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final E lastOrNull(InterfaceC10570l predicate) {
        E e10;
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return null;
            }
            e10 = (E) objArr[i10];
        } while (!((Boolean) predicate.invoke(e10)).booleanValue());
        return e10;
    }

    public final E first(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            E e10 = (E) objArr[i11];
            if (((Boolean) predicate.invoke(e10)).booleanValue()) {
                return e10;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    public final E last(InterfaceC10570l predicate) {
        E e10;
        AbstractC9133u.m16133g(predicate, "predicate");
        Object[] objArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                e10 = (E) objArr[i10];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e10)).booleanValue());
        return e10;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        AbstractC9133u.m16133g(elements, "elements");
        Object[] objArr = elements.content;
        int i10 = elements._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!contains(objArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                Object obj = objArr[i12];
                if (i12 == i10) {
                    sb.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb.append(separator);
                }
                if (interfaceC10570l == null) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) interfaceC10570l.invoke(obj));
                }
                i12++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
