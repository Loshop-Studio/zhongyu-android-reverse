package p172l8;

import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import p182m8.AbstractC9045d;

/* renamed from: l8.q */
/* loaded from: classes5.dex */
public final class C8918q implements Iterable, KMappedMarker {

    /* renamed from: b */
    public static final b f14793b = new b(null);

    /* renamed from: a */
    public final String[] f14794a;

    /* renamed from: l8.q$a */
    public static final class a {

        /* renamed from: a */
        public final List f14795a = new ArrayList(20);

        /* renamed from: a */
        public final a m13942a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = C8918q.f14793b;
            bVar.m13954d(name);
            bVar.m13955e(value, name);
            m13945d(name, value);
            return this;
        }

        /* renamed from: b */
        public final a m13943b(C8918q headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                m13945d(headers.m13937b(i9), headers.m13940f(i9));
            }
            return this;
        }

        /* renamed from: c */
        public final a m13944c(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m13945d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                m13945d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            m13945d("", strSubstring3);
            return this;
        }

        /* renamed from: d */
        public final a m13945d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f14795a.add(name);
            this.f14795a.add(StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        /* renamed from: e */
        public final a m13946e(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C8918q.f14793b.m13954d(name);
            m13945d(name, value);
            return this;
        }

        /* renamed from: f */
        public final C8918q m13947f() {
            return new C8918q((String[]) this.f14795a.toArray(new String[0]), null);
        }

        /* renamed from: g */
        public final List m13948g() {
            return this.f14795a;
        }

        /* renamed from: h */
        public final a m13949h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i9 = 0;
            while (i9 < this.f14795a.size()) {
                if (StringsKt.equals(name, (String) this.f14795a.get(i9), true)) {
                    this.f14795a.remove(i9);
                    this.f14795a.remove(i9);
                    i9 -= 2;
                }
                i9 += 2;
            }
            return this;
        }

        /* renamed from: i */
        public final a m13950i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = C8918q.f14793b;
            bVar.m13954d(name);
            bVar.m13955e(value, name);
            m13949h(name);
            m13945d(name, value);
            return this;
        }
    }

    /* renamed from: l8.q$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void m13954d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(AbstractC9045d.m14504t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i9), str).toString());
                }
            }
        }

        /* renamed from: e */
        public final void m13955e(String str, String str2) {
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC9045d.m14504t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i9), str2));
                    sb.append(AbstractC9045d.m14465G(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* renamed from: f */
        public final String m13956f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement > length) {
                return null;
            }
            while (!StringsKt.equals(str, strArr[length], true)) {
                if (length == progressionLastElement) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        /* renamed from: g */
        public final C8918q m13957g(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i10] = StringsKt.trim((CharSequence) str).toString();
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    String str2 = strArr[i9];
                    String str3 = strArr[i9 + 1];
                    m13954d(str2);
                    m13955e(str3, str2);
                    if (i9 == progressionLastElement) {
                        break;
                    }
                    i9 += 2;
                }
            }
            return new C8918q(strArr, null);
        }

        public b() {
        }
    }

    public /* synthetic */ C8918q(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    /* renamed from: d */
    public static final C8918q m13935d(String... strArr) {
        return f14793b.m13957g(strArr);
    }

    /* renamed from: a */
    public final String m13936a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f14793b.m13956f(this.f14794a, name);
    }

    /* renamed from: b */
    public final String m13937b(int i9) {
        return this.f14794a[i9 * 2];
    }

    /* renamed from: c */
    public final a m13938c() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.m13948g(), this.f14794a);
        return aVar;
    }

    /* renamed from: e */
    public final Map m13939e() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String strM13937b = m13937b(i9);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strM13937b.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m13940f(i9));
        }
        return treeMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8918q) && Arrays.equals(this.f14794a, ((C8918q) obj).f14794a);
    }

    /* renamed from: f */
    public final String m13940f(int i9) {
        return this.f14794a[(i9 * 2) + 1];
    }

    /* renamed from: g */
    public final List m13941g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if (StringsKt.equals(name, m13937b(i9), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m13940f(i9));
            }
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f14794a);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i9 = 0; i9 < size; i9++) {
            pairArr[i9] = TuplesKt.m13420to(m13937b(i9), m13940f(i9));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f14794a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String strM13937b = m13937b(i9);
            String strM13940f = m13940f(i9);
            sb.append(strM13937b);
            sb.append(": ");
            if (AbstractC9045d.m14465G(strM13937b)) {
                strM13940f = "██";
            }
            sb.append(strM13940f);
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public C8918q(String[] strArr) {
        this.f14794a = strArr;
    }
}
