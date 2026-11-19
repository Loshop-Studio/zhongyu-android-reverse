package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public abstract class IntList {
    public int _size;
    public int[] content;

    public /* synthetic */ IntList(int i10, AbstractC9126n abstractC9126n) {
        this(i10);
    }

    public static /* synthetic */ int binarySearch$default(IntList intList, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = intList._size;
        }
        return intList.binarySearch(i10, i11, i12);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return intList.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int binarySearch(int i10) {
        return binarySearch$default(this, i10, 0, 0, 6, null);
    }

    public final boolean contains(int i10) {
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList elements) {
        AbstractC9133u.m16133g(elements, "elements");
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, elements._size);
        int iM13496b = c8321fM13525t.m13496b();
        int iM13497c = c8321fM13525t.m13497c();
        if (iM13496b > iM13497c) {
            return true;
        }
        while (contains(elements.get(iM13496b))) {
            if (iM13496b == iM13497c) {
                return true;
            }
            iM13496b++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final int elementAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i10];
    }

    public final int elementAtOrElse(@IntRange(from = 0) int i10, InterfaceC10570l defaultValue) {
        AbstractC9133u.m16133g(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(i10))).intValue() : this.content[i10];
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i10 = intList._size;
            int i11 = this._size;
            if (i10 == i11) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                C8321f c8321fM13525t = AbstractC8323h.m13525t(0, i11);
                int iM13496b = c8321fM13525t.m13496b();
                int iM13497c = c8321fM13525t.m13497c();
                if (iM13496b > iM13497c) {
                    return true;
                }
                while (iArr[iM13496b] == iArr2[iM13496b]) {
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

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r10, InterfaceC10574p operation) {
        AbstractC9133u.m16133g(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(r10, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, InterfaceC10575q operation) {
        AbstractC9133u.m16133g(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = (R) operation.invoke(Integer.valueOf(i11), r11, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R foldRight(R r10, InterfaceC10574p operation) {
        AbstractC9133u.m16133g(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final <R> R foldRightIndexed(R r10, InterfaceC10575q operation) {
        AbstractC9133u.m16133g(operation, "operation");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final void forEach(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(iArr[i11]));
        }
    }

    public final void forEachIndexed(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]));
        }
    }

    public final void forEachReversed(InterfaceC10570l block) {
        AbstractC9133u.m16133g(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        int[] iArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final int get(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i10];
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
        int[] iArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(int i10) {
        int[] iArr = this.content;
        int i11 = this._size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfFirst(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Integer.valueOf(iArr[i10]))).booleanValue());
        return i10;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(int i10) {
        int[] iArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (iArr[i11] != i10);
        return i11;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i10]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntList(int i10) {
        this.content = i10 == 0 ? IntSetKt.getEmptyIntArray() : new int[i10];
    }

    public final boolean any(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i11]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int binarySearch(int i10, int i11) {
        return binarySearch$default(this, i10, i11, 0, 4, null);
    }

    public final int count(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i12]))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC9133u.m16133g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final int binarySearch(int i10, int i11, int i12) {
        if (i11 < 0 || i11 >= i12 || i12 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = this.content[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final int first(InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (((Boolean) predicate.invoke(Integer.valueOf(i12))).booleanValue()) {
                return i12;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l transform, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                separator = ", ";
            }
            if ((i11 & 2) != 0) {
                prefix = "";
            }
            if ((i11 & 4) != 0) {
                postfix = "";
            }
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            if ((i11 & 16) != 0) {
                truncated = "...";
            }
            AbstractC9133u.m16133g(separator, "separator");
            AbstractC9133u.m16133g(prefix, "prefix");
            AbstractC9133u.m16133g(postfix, "postfix");
            AbstractC9133u.m16133g(truncated, "truncated");
            AbstractC9133u.m16133g(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            int[] iArr = intList.content;
            int i12 = intList._size;
            int i13 = 0;
            while (true) {
                if (i13 < i12) {
                    int i14 = iArr[i13];
                    if (i13 == i10) {
                        sb.append(truncated);
                        break;
                    }
                    if (i13 != 0) {
                        sb.append(separator);
                    }
                    sb.append((CharSequence) transform.invoke(Integer.valueOf(i14)));
                    i13++;
                } else {
                    sb.append(postfix);
                    break;
                }
            }
            String string = sb.toString();
            AbstractC9133u.m16132f(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final int last(InterfaceC10570l predicate) {
        int i10;
        AbstractC9133u.m16133g(predicate, "predicate");
        int[] iArr = this.content;
        int i11 = this._size;
        do {
            i11--;
            if (-1 < i11) {
                i10 = iArr[i11];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Integer.valueOf(i10))).booleanValue());
        return i10;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == i10) {
                    sb.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb.append(separator);
                }
                sb.append(i13);
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(truncated, "truncated");
        AbstractC9133u.m16133g(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == i10) {
                    sb.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i13)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                int i13 = iArr[i12];
                if (i12 == i10) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i13)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(postfix, "postfix");
        AbstractC9133u.m16133g(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i12)));
                i11++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(prefix, "prefix");
        AbstractC9133u.m16133g(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i12)));
                i11++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, InterfaceC10570l transform) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i12)));
                i11++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public final String joinToString(InterfaceC10570l transform) {
        AbstractC9133u.m16133g(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                int i12 = iArr[i11];
                if (i11 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i12)));
                i11++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
