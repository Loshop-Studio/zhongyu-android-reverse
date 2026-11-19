package p058f5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import p065g5.AbstractC6421e;

/* renamed from: f5.v */
/* loaded from: classes4.dex */
public final class C6383v implements Iterable, KMappedMarker {

    /* renamed from: b */
    public static final b f7961b = new b(null);

    /* renamed from: c */
    public static final C6383v f7962c = new C6383v(new String[0]);

    /* renamed from: a */
    public final String[] f7963a;

    /* renamed from: f5.v$a */
    public static final class a {

        /* renamed from: a */
        public final List f7964a = new ArrayList(20);

        /* renamed from: a */
        public final a m6806a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return AbstractC6421e.m6952b(this, name, value);
        }

        /* renamed from: b */
        public final a m6807b(C6383v headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return AbstractC6421e.m6953c(this, headers);
        }

        /* renamed from: c */
        public final a m6808c(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                m6809d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                m6809d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            m6809d("", strSubstring3);
            return this;
        }

        /* renamed from: d */
        public final a m6809d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return AbstractC6421e.m6954d(this, name, value);
        }

        /* renamed from: e */
        public final a m6810e(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            AbstractC6421e.m6968r(name);
            m6809d(name, value);
            return this;
        }

        /* renamed from: f */
        public final C6383v m6811f() {
            return AbstractC6421e.m6955e(this);
        }

        /* renamed from: g */
        public final List m6812g() {
            return this.f7964a;
        }

        /* renamed from: h */
        public final a m6813h(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return AbstractC6421e.m6963m(this, name);
        }

        /* renamed from: i */
        public final a m6814i(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return AbstractC6421e.m6964n(this, name, value);
        }
    }

    /* renamed from: f5.v$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6383v m6815a(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            return AbstractC6421e.m6959i((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public b() {
        }
    }

    public C6383v(String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.f7963a = namesAndValues;
    }

    /* renamed from: e */
    public static final C6383v m6798e(String... strArr) {
        return f7961b.m6815a(strArr);
    }

    /* renamed from: a */
    public final String m6799a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return AbstractC6421e.m6958h(this.f7963a, name);
    }

    /* renamed from: b */
    public final String[] m6800b() {
        return this.f7963a;
    }

    /* renamed from: c */
    public final String m6801c(int i6) {
        return AbstractC6421e.m6961k(this, i6);
    }

    /* renamed from: d */
    public final a m6802d() {
        return AbstractC6421e.m6962l(this);
    }

    public boolean equals(Object obj) {
        return AbstractC6421e.m6956f(this, obj);
    }

    /* renamed from: f */
    public final Map m6803f() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            String strM6801c = m6801c(i6);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strM6801c.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m6804g(i6));
        }
        return treeMap;
    }

    /* renamed from: g */
    public final String m6804g(int i6) {
        return AbstractC6421e.m6966p(this, i6);
    }

    /* renamed from: h */
    public final List m6805h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return AbstractC6421e.m6967q(this, name);
    }

    public int hashCode() {
        return AbstractC6421e.m6957g(this);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC6421e.m6960j(this);
    }

    public final int size() {
        return this.f7963a.length / 2;
    }

    public String toString() {
        return AbstractC6421e.m6965o(this);
    }
}
