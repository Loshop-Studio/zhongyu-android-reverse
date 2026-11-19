package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p265nd.AbstractC10410o;
import p265nd.C10405j;

/* loaded from: classes.dex */
public abstract class DoubleList {
    public int _size;
    public double[] content;

    public /* synthetic */ DoubleList(int i10, AbstractC9972n abstractC9972n) {
        this(i10);
    }

    public static /* synthetic */ int binarySearch$default(DoubleList doubleList, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = doubleList._size;
        }
        return doubleList.binarySearch(i10, i11, i12);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return doubleList.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int binarySearch(int i10) {
        return binarySearch$default(this, i10, 0, 0, 6, null);
    }

    public final boolean contains(double d10) {
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (dArr[i11] == d10) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(DoubleList elements) {
        AbstractC9979u.m20294g(elements, "elements");
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, elements._size);
        int iM21733b = c10405jM21768u.m21733b();
        int iM21734c = c10405jM21768u.m21734c();
        if (iM21733b > iM21734c) {
            return true;
        }
        while (contains(elements.get(iM21733b))) {
            if (iM21733b == iM21734c) {
                return true;
            }
            iM21733b++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final double elementAt(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i10];
    }

    public final double elementAtOrElse(@IntRange(from = 0) int i10, InterfaceC9540l defaultValue) {
        AbstractC9979u.m20294g(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(i10))).doubleValue() : this.content[i10];
    }

    public boolean equals(Object obj) {
        if (obj instanceof DoubleList) {
            DoubleList doubleList = (DoubleList) obj;
            int i10 = doubleList._size;
            int i11 = this._size;
            if (i10 == i11) {
                double[] dArr = this.content;
                double[] dArr2 = doubleList.content;
                C10405j c10405jM21768u = AbstractC10410o.m21768u(0, i11);
                int iM21733b = c10405jM21768u.m21733b();
                int iM21734c = c10405jM21768u.m21734c();
                if (iM21733b > iM21734c) {
                    return true;
                }
                while (dArr[iM21733b] == dArr2[iM21733b]) {
                    if (iM21733b == iM21734c) {
                        return true;
                    }
                    iM21733b++;
                }
                return false;
            }
        }
        return false;
    }

    public final double first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r10, InterfaceC9544p operation) {
        AbstractC9979u.m20294g(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(r10, Double.valueOf(dArr[i11]));
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, InterfaceC9545q operation) {
        AbstractC9979u.m20294g(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = (R) operation.invoke(Integer.valueOf(i11), r11, Double.valueOf(dArr[i11]));
        }
        return r10;
    }

    public final <R> R foldRight(R r10, InterfaceC9544p operation) {
        AbstractC9979u.m20294g(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Double.valueOf(dArr[i10]), r10);
        }
    }

    public final <R> R foldRightIndexed(R r10, InterfaceC9545q operation) {
        AbstractC9979u.m20294g(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), r10);
        }
    }

    public final void forEach(InterfaceC9540l block) {
        AbstractC9979u.m20294g(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Double.valueOf(dArr[i11]));
        }
    }

    public final void forEachIndexed(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]));
        }
    }

    public final void forEachReversed(InterfaceC9540l block) {
        AbstractC9979u.m20294g(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Double.valueOf(dArr[i10]));
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]));
            }
        }
    }

    public final double get(@IntRange(from = 0) int i10) {
        if (i10 < 0 || i10 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i10];
    }

    public final C10405j getIndices() {
        return AbstractC10410o.m21768u(0, this._size);
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
        double[] dArr = this.content;
        int i10 = this._size;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Double.hashCode(dArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(double d10) {
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (d10 == dArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Double.valueOf(dArr[i10]))).booleanValue());
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

    public final double last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(double d10) {
        double[] dArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (dArr[i10] != d10);
        return i10;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i10]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private DoubleList(int i10) {
        this.content = i10 == 0 ? DoubleSetKt.getEmptyDoubleArray() : new double[i10];
    }

    public final boolean any(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i11]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int binarySearch(int i10, int i11) {
        return binarySearch$default(this, i10, i11, 0, 4, null);
    }

    public final int count(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((Boolean) predicate.invoke(Double.valueOf(dArr[i12]))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC9979u.m20294g(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final int binarySearch(int i10, int i11, int i12) {
        if (i11 < 0 || i11 >= i12 || i12 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            double d10 = this.content[i14];
            double d11 = i10;
            if (d10 < d11) {
                i11 = i14 + 1;
            } else {
                if (d10 <= d11) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final double first(InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (((Boolean) predicate.invoke(Double.valueOf(d10))).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l transform, int i11, Object obj) {
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
            AbstractC9979u.m20294g(separator, "separator");
            AbstractC9979u.m20294g(prefix, "prefix");
            AbstractC9979u.m20294g(postfix, "postfix");
            AbstractC9979u.m20294g(truncated, "truncated");
            AbstractC9979u.m20294g(transform, "transform");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            double[] dArr = doubleList.content;
            int i12 = doubleList._size;
            int i13 = 0;
            while (true) {
                if (i13 < i12) {
                    double d10 = dArr[i13];
                    if (i13 == i10) {
                        sb2.append(truncated);
                        break;
                    }
                    if (i13 != 0) {
                        sb2.append(separator);
                    }
                    sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                    i13++;
                } else {
                    sb2.append(postfix);
                    break;
                }
            }
            String string = sb2.toString();
            AbstractC9979u.m20293f(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final double last(InterfaceC9540l predicate) {
        double d10;
        AbstractC9979u.m20294g(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                d10 = dArr[i10];
            } else {
                throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Double.valueOf(d10))).booleanValue());
        return d10;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d10 = dArr[i12];
                if (i12 == i10) {
                    sb2.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(d10);
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(truncated, "truncated");
        AbstractC9979u.m20294g(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d10 = dArr[i12];
                if (i12 == i10) {
                    sb2.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d10 = dArr[i12];
                if (i12 == i10) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(postfix, "postfix");
        AbstractC9979u.m20294g(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(prefix, "prefix");
        AbstractC9979u.m20294g(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, InterfaceC9540l transform) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    public final String joinToString(InterfaceC9540l transform) {
        AbstractC9979u.m20294g(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i11 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
