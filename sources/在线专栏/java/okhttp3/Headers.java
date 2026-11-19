package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.collections.C2730l;
import kotlin.collections.C2735q;
import kotlin.jvm.internal.C2757a0;
import kotlin.jvm.internal.C2758b;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1032a;
import p014b3.C1037f;
import p082e3.C2495u;
import p082e3.C2496v;
import p128o2.C2918k;
import p128o2.C2922o;
import p175y2.InterfaceC3498a;

/* loaded from: classes.dex */
public final class Headers implements Iterable<C2918k<? extends String, ? extends String>>, InterfaceC3498a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {

        @NotNull
        private final List<String> namesAndValues = new ArrayList(20);

        @NotNull
        public final Builder add(@NotNull String line) {
            C2769l.m9241e(line, "line");
            int iM8380T = C2496v.m8380T(line, ':', 0, false, 6, null);
            if (!(iM8380T != -1)) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String strSubstring = line.substring(0, iM8380T);
            C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Objects.requireNonNull(strSubstring, "null cannot be cast to non-null type kotlin.CharSequence");
            String string = C2496v.m8367H0(strSubstring).toString();
            String strSubstring2 = line.substring(iM8380T + 1);
            C2769l.m9240d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        @NotNull
        public final Builder addAll(@NotNull Headers headers) {
            C2769l.m9241e(headers, "headers");
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                addLenient$okhttp(headers.name(i4), headers.value(i4));
            }
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String line) {
            C2769l.m9241e(line, "line");
            int iM8380T = C2496v.m8380T(line, ':', 1, false, 4, null);
            if (iM8380T != -1) {
                String strSubstring = line.substring(0, iM8380T);
                C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iM8380T + 1);
                C2769l.m9240d(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                C2769l.m9240d(strSubstring3, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", strSubstring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        @NotNull
        public final Builder addUnsafeNonAscii(@NotNull String name, @NotNull String value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new Headers((String[]) array, null);
        }

        @Nullable
        public final String get(@NotNull String name) {
            C2769l.m9241e(name, "name");
            C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4826g(this.namesAndValues.size() - 2, 0), 2);
            int iM4802a = c1032aM4827h.m4802a();
            int iM4803b = c1032aM4827h.m4803b();
            int iM4804c = c1032aM4827h.m4804c();
            if (iM4804c >= 0) {
                if (iM4802a > iM4803b) {
                    return null;
                }
            } else if (iM4802a < iM4803b) {
                return null;
            }
            while (!C2495u.m8343o(name, this.namesAndValues.get(iM4802a), true)) {
                if (iM4802a == iM4803b) {
                    return null;
                }
                iM4802a += iM4804c;
            }
            return this.namesAndValues.get(iM4802a + 1);
        }

        @NotNull
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @NotNull
        public final Builder removeAll(@NotNull String name) {
            C2769l.m9241e(name, "name");
            int i4 = 0;
            while (i4 < this.namesAndValues.size()) {
                if (C2495u.m8343o(name, this.namesAndValues.get(i4), true)) {
                    this.namesAndValues.remove(i4);
                    this.namesAndValues.remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull Date value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder set(@NotNull String name, @NotNull Instant value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        @NotNull
        public final Builder set(@NotNull String name, @NotNull String value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @NotNull
        public final Builder addLenient$okhttp(@NotNull String name, @NotNull String value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(C2496v.m8367H0(value).toString());
            return this;
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull Date value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder add(@NotNull String name, @NotNull Instant value) {
            C2769l.m9241e(name, "name");
            C2769l.m9241e(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if (!('!' <= cCharAt && '~' >= cCharAt)) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i4), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if (!(cCharAt == '\t' || (' ' <= cCharAt && '~' >= cCharAt))) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i4), str2, str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4826g(strArr.length - 2, 0), 2);
            int iM4802a = c1032aM4827h.m4802a();
            int iM4803b = c1032aM4827h.m4803b();
            int iM4804c = c1032aM4827h.m4804c();
            if (iM4804c >= 0) {
                if (iM4802a > iM4803b) {
                    return null;
                }
            } else if (iM4802a < iM4803b) {
                return null;
            }
            while (!C2495u.m8343o(str, strArr[iM4802a], true)) {
                if (iM4802a == iM4803b) {
                    return null;
                }
                iM4802a += iM4804c;
            }
            return strArr[iM4802a + 1];
        }

        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m10789deprecated_of(@NotNull String... namesAndValues) {
            C2769l.m9241e(namesAndValues, "namesAndValues");
            return m10000of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @NotNull
        /* renamed from: of */
        public final Headers m10000of(@NotNull String... namesAndValues) throws CloneNotSupportedException {
            C2769l.m9241e(namesAndValues, "namesAndValues");
            if (!(namesAndValues.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object objClone = namesAndValues.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            String[] strArr = (String[]) objClone;
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (!(strArr[i4] != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                String str = strArr[i4];
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                strArr[i4] = C2496v.m8367H0(str).toString();
            }
            C1032a c1032aM4827h = C1037f.m4827h(C1037f.m4828i(0, strArr.length), 2);
            int iM4802a = c1032aM4827h.m4802a();
            int iM4803b = c1032aM4827h.m4803b();
            int iM4804c = c1032aM4827h.m4804c();
            if (iM4804c < 0 ? iM4802a >= iM4803b : iM4802a <= iM4803b) {
                while (true) {
                    String str2 = strArr[iM4802a];
                    String str3 = strArr[iM4802a + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (iM4802a == iM4803b) {
                        break;
                    }
                    iM4802a += iM4804c;
                }
            }
            return new Headers(strArr, null);
        }

        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m10788deprecated_of(@NotNull Map<String, String> headers) {
            C2769l.m9241e(headers, "headers");
            return m9999of(headers);
        }

        @NotNull
        /* renamed from: of */
        public final Headers m9999of(@NotNull Map<String, String> toHeaders) {
            C2769l.m9241e(toHeaders, "$this$toHeaders");
            String[] strArr = new String[toHeaders.size() * 2];
            int i4 = 0;
            for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.CharSequence");
                String string = C2496v.m8367H0(key).toString();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.CharSequence");
                String string2 = C2496v.m8367H0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i4] = string;
                strArr[i4 + 1] = string2;
                i4 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    @NotNull
    /* renamed from: of */
    public static final Headers m9997of(@NotNull Map<String, String> map) {
        return Companion.m9999of(map);
    }

    @NotNull
    /* renamed from: of */
    public static final Headers m9998of(@NotNull String... strArr) {
        return Companion.m10000of(strArr);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m10787deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            length += this.namesAndValues[i4].length();
        }
        return length;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @Nullable
    public final String get(@NotNull String name) {
        C2769l.m9241e(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    @Nullable
    public final Date getDate(@NotNull String name) {
        C2769l.m9241e(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @Nullable
    public final Instant getInstant(@NotNull String name) {
        C2769l.m9241e(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C2918k<? extends String, ? extends String>> iterator() {
        int size = size();
        C2918k[] c2918kArr = new C2918k[size];
        for (int i4 = 0; i4 < size; i4++) {
            c2918kArr[i4] = C2922o.m9996a(name(i4), value(i4));
        }
        return C2758b.m9220a(c2918kArr);
    }

    @NotNull
    public final String name(int i4) {
        return this.namesAndValues[i4 * 2];
    }

    @NotNull
    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C2495u.m8345q(C2757a0.f10720a));
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            treeSet.add(name(i4));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        C2769l.m9240d(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        C2735q.m9152s(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @NotNull
    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C2495u.m8345q(C2757a0.f10720a));
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String strName = name(i4);
            Locale locale = Locale.US;
            C2769l.m9240d(locale, "Locale.US");
            Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = strName.toLowerCase(locale);
            C2769l.m9240d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i4));
        }
        return treeMap;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(name(i4));
            sb.append(": ");
            sb.append(value(i4));
            sb.append("\n");
        }
        String string = sb.toString();
        C2769l.m9240d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String value(int i4) {
        return this.namesAndValues[(i4 * 2) + 1];
    }

    @NotNull
    public final List<String> values(@NotNull String name) {
        C2769l.m9241e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if (C2495u.m8343o(name, name(i4), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i4));
            }
        }
        if (arrayList == null) {
            return C2730l.m9139f();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        C2769l.m9240d(listUnmodifiableList, "Collections.unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public /* synthetic */ Headers(String[] strArr, C2764g c2764g) {
        this(strArr);
    }
}
