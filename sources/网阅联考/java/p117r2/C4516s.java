package p117r2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p121s2.AbstractC4550b;

/* renamed from: r2.s */
/* loaded from: classes2.dex */
public final class C4516s implements Iterable, KMappedMarker {

    /* renamed from: b */
    public static final b f5532b = new b(null);

    /* renamed from: a */
    public final String[] f5533a;

    /* renamed from: r2.s$a */
    public static final class a {

        /* renamed from: a */
        public final List f5534a = new ArrayList(20);

        /* renamed from: a */
        public final a m5964a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = C4516s.f5532b;
            bVar.m5975d(name);
            bVar.m5976e(value, name);
            m5967d(name, value);
            return this;
        }

        /* renamed from: b */
        public final a m5965b(C4516s headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                m5967d(headers.m5960b(i4), headers.m5962e(i4));
            }
            return this;
        }

        /* renamed from: c */
        public final a m5966c(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                m5967d(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                m5967d("", strSubstring3);
            } else {
                m5967d("", line);
            }
            return this;
        }

        /* renamed from: d */
        public final a m5967d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5534a.add(name);
            this.f5534a.add(StringsKt__StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        /* renamed from: e */
        public final C4516s m5968e() {
            Object[] array = this.f5534a.toArray(new String[0]);
            if (array != null) {
                return new C4516s((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: f */
        public final List m5969f() {
            return this.f5534a;
        }

        /* renamed from: g */
        public final a m5970g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i4 = 0;
            while (i4 < this.f5534a.size()) {
                if (StringsKt__StringsJVMKt.equals(name, (String) this.f5534a.get(i4), true)) {
                    this.f5534a.remove(i4);
                    this.f5534a.remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        /* renamed from: h */
        public final a m5971h(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = C4516s.f5532b;
            bVar.m5975d(name);
            bVar.m5976e(value, name);
            m5970g(name);
            m5967d(name, value);
            return this;
        }
    }

    /* renamed from: r2.s$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void m5975d(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(AbstractC4550b.m6235q("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i4), str).toString());
                }
            }
        }

        /* renamed from: e */
        public final void m5976e(String str, String str2) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    throw new IllegalArgumentException(AbstractC4550b.m6235q("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i4), str2, str).toString());
                }
            }
        }

        /* renamed from: f */
        public final String m5977f(String[] strArr, String str) {
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.downTo(strArr.length - 2, 0), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return null;
                }
            } else if (first < last) {
                return null;
            }
            while (!StringsKt__StringsJVMKt.equals(str, strArr[first], true)) {
                if (first == last) {
                    return null;
                }
                first += step;
            }
            return strArr[first + 1];
        }

        /* renamed from: g */
        public final C4516s m5978g(String... namesAndValues) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                String str = strArr[i4];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr[i4] = StringsKt__StringsKt.trim((CharSequence) str).toString();
            }
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, strArr.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    String str2 = strArr[first];
                    String str3 = strArr[first + 1];
                    m5975d(str2);
                    m5976e(str3, str2);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            return new C4516s(strArr, null);
        }
    }

    public C4516s(String[] strArr) {
        this.f5533a = strArr;
    }

    /* renamed from: d */
    public static final C4516s m5958d(String... strArr) {
        return f5532b.m5978g(strArr);
    }

    /* renamed from: a */
    public final String m5959a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f5532b.m5977f(this.f5533a, name);
    }

    /* renamed from: b */
    public final String m5960b(int i4) {
        return this.f5533a[i4 * 2];
    }

    /* renamed from: c */
    public final a m5961c() {
        a aVar = new a();
        CollectionsKt__MutableCollectionsKt.addAll(aVar.m5969f(), this.f5533a);
        return aVar;
    }

    /* renamed from: e */
    public final String m5962e(int i4) {
        return this.f5533a[(i4 * 2) + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4516s) && Arrays.equals(this.f5533a, ((C4516s) obj).f5533a);
    }

    /* renamed from: f */
    public final List m5963f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if (StringsKt__StringsJVMKt.equals(name, m5960b(i4), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m5962e(i4));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5533a);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i4 = 0; i4 < size; i4++) {
            pairArr[i4] = TuplesKt.m5182to(m5960b(i4), m5962e(i4));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f5533a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(m5960b(i4));
            sb.append(": ");
            sb.append(m5962e(i4));
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ C4516s(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }
}
