package p011a9;

import com.alibaba.sdk.android.oss.signer.SignParameters;
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
import p028b9.AbstractC5070d;

/* renamed from: a9.q */
/* loaded from: classes5.dex */
public final class C0054q implements Iterable, KMappedMarker {

    /* renamed from: b */
    public static final b f165b = new b(null);

    /* renamed from: a */
    public final String[] f166a;

    /* renamed from: a9.q$a */
    public static final class a {

        /* renamed from: a */
        public final List f167a = new ArrayList(20);

        /* renamed from: a */
        public final a m186a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = C0054q.f165b;
            bVar.m198d(name);
            bVar.m199e(value, name);
            m189d(name, value);
            return this;
        }

        /* renamed from: b */
        public final a m187b(C0054q headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                m189d(headers.m181b(i10), headers.m184f(i10));
            }
            return this;
        }

        /* renamed from: c */
        public final a m188c(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                m189d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                m189d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            m189d("", strSubstring3);
            return this;
        }

        /* renamed from: d */
        public final a m189d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f167a.add(name);
            this.f167a.add(StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        /* renamed from: e */
        public final a m190e(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C0054q.f165b.m198d(name);
            m189d(name, value);
            return this;
        }

        /* renamed from: f */
        public final C0054q m191f() {
            return new C0054q((String[]) this.f167a.toArray(new String[0]), null);
        }

        /* renamed from: g */
        public final List m192g() {
            return this.f167a;
        }

        /* renamed from: h */
        public final a m193h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.f167a.size()) {
                if (StringsKt.equals(name, (String) this.f167a.get(i10), true)) {
                    this.f167a.remove(i10);
                    this.f167a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        /* renamed from: i */
        public final a m194i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = C0054q.f165b;
            bVar.m198d(name);
            bVar.m199e(value, name);
            m193h(name);
            m189d(name, value);
            return this;
        }
    }

    /* renamed from: a9.q$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public final void m198d(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(AbstractC5070d.m2655t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* renamed from: e */
        public final void m199e(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC5070d.m2655t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb.append(AbstractC5070d.m2616G(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* renamed from: f */
        public final String m200f(String[] strArr, String str) {
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
        public final C0054q m201g(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = StringsKt.trim((CharSequence) str).toString();
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    m198d(str2);
                    m199e(str3, str2);
                    if (i10 == progressionLastElement) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new C0054q(strArr, null);
        }

        public b() {
        }
    }

    public /* synthetic */ C0054q(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    /* renamed from: d */
    public static final C0054q m179d(String... strArr) {
        return f165b.m201g(strArr);
    }

    /* renamed from: a */
    public final String m180a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f165b.m200f(this.f166a, name);
    }

    /* renamed from: b */
    public final String m181b(int i10) {
        return this.f166a[i10 * 2];
    }

    /* renamed from: c */
    public final a m182c() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.m192g(), this.f166a);
        return aVar;
    }

    /* renamed from: e */
    public final Map m183e() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM181b = m181b(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strM181b.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m184f(i10));
        }
        return treeMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0054q) && Arrays.equals(this.f166a, ((C0054q) obj).f166a);
    }

    /* renamed from: f */
    public final String m184f(int i10) {
        return this.f166a[(i10 * 2) + 1];
    }

    /* renamed from: g */
    public final List m185g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.equals(name, m181b(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m184f(i10));
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
        return Arrays.hashCode(this.f166a);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = TuplesKt.m13565to(m181b(i10), m184f(i10));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final int size() {
        return this.f166a.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM181b = m181b(i10);
            String strM184f = m184f(i10);
            sb.append(strM181b);
            sb.append(": ");
            if (AbstractC5070d.m2616G(strM181b)) {
                strM184f = "██";
            }
            sb.append(strM184f);
            sb.append(SignParameters.NEW_LINE);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public C0054q(String[] strArr) {
        this.f166a = strArr;
    }
}
