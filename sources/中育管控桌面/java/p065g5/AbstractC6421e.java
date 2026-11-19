package p065g5;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import p058f5.C6383v;

/* renamed from: g5.e */
/* loaded from: classes4.dex */
public abstract class AbstractC6421e {
    /* renamed from: a */
    public static final String m6951a(char c7) {
        String string = Integer.toString(c7, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    /* renamed from: b */
    public static final C6383v.a m6952b(C6383v.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        m6968r(name);
        m6969s(value, name);
        m6954d(aVar, name, value);
        return aVar;
    }

    /* renamed from: c */
    public static final C6383v.a m6953c(C6383v.a aVar, C6383v headers) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i6 = 0; i6 < size; i6++) {
            m6954d(aVar, headers.m6801c(i6), headers.m6804g(i6));
        }
        return aVar;
    }

    /* renamed from: d */
    public static final C6383v.a m6954d(C6383v.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.m6812g().add(name);
        aVar.m6812g().add(StringsKt.trim((CharSequence) value).toString());
        return aVar;
    }

    /* renamed from: e */
    public static final C6383v m6955e(C6383v.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new C6383v((String[]) aVar.m6812g().toArray(new String[0]));
    }

    /* renamed from: f */
    public static final boolean m6956f(C6383v c6383v, Object obj) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        return (obj instanceof C6383v) && Arrays.equals(c6383v.m6800b(), ((C6383v) obj).m6800b());
    }

    /* renamed from: g */
    public static final int m6957g(C6383v c6383v) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        return Arrays.hashCode(c6383v.m6800b());
    }

    /* renamed from: h */
    public static final String m6958h(String[] namesAndValues, String name) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement > length) {
            return null;
        }
        while (!StringsKt.equals(name, namesAndValues[length], true)) {
            if (length == progressionLastElement) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    /* renamed from: i */
    public static final C6383v m6959i(String... inputNamesAndValues) {
        Intrinsics.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (strArr[i7] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i7] = StringsKt.trim((CharSequence) inputNamesAndValues[i7]).toString();
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                String str = strArr[i6];
                String str2 = strArr[i6 + 1];
                m6968r(str);
                m6969s(str2, str);
                if (i6 == progressionLastElement) {
                    break;
                }
                i6 += 2;
            }
        }
        return new C6383v(strArr);
    }

    /* renamed from: j */
    public static final Iterator m6960j(C6383v c6383v) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        int size = c6383v.size();
        Pair[] pairArr = new Pair[size];
        for (int i6 = 0; i6 < size; i6++) {
            pairArr[i6] = TuplesKt.m7887to(c6383v.m6801c(i6), c6383v.m6804g(i6));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    /* renamed from: k */
    public static final String m6961k(C6383v c6383v, int i6) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        String str = (String) ArraysKt.getOrNull(c6383v.m6800b(), i6 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i6 + ']');
    }

    /* renamed from: l */
    public static final C6383v.a m6962l(C6383v c6383v) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        C6383v.a aVar = new C6383v.a();
        CollectionsKt.addAll(aVar.m6812g(), c6383v.m6800b());
        return aVar;
    }

    /* renamed from: m */
    public static final C6383v.a m6963m(C6383v.a aVar, String name) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i6 = 0;
        while (i6 < aVar.m6812g().size()) {
            if (StringsKt.equals(name, (String) aVar.m6812g().get(i6), true)) {
                aVar.m6812g().remove(i6);
                aVar.m6812g().remove(i6);
                i6 -= 2;
            }
            i6 += 2;
        }
        return aVar;
    }

    /* renamed from: n */
    public static final C6383v.a m6964n(C6383v.a aVar, String name, String value) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        m6968r(name);
        m6969s(value, name);
        aVar.m6813h(name);
        m6954d(aVar, name, value);
        return aVar;
    }

    /* renamed from: o */
    public static final String m6965o(C6383v c6383v) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        StringBuilder sb = new StringBuilder();
        int size = c6383v.size();
        for (int i6 = 0; i6 < size; i6++) {
            String strM6801c = c6383v.m6801c(i6);
            String strM6804g = c6383v.m6804g(i6);
            sb.append(strM6801c);
            sb.append(": ");
            if (AbstractC6424h.m7008v(strM6801c)) {
                strM6804g = "██";
            }
            sb.append(strM6804g);
            sb.append(SignParameters.NEW_LINE);
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static final String m6966p(C6383v c6383v, int i6) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        String str = (String) ArraysKt.getOrNull(c6383v.m6800b(), (i6 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i6 + ']');
    }

    /* renamed from: q */
    public static final List m6967q(C6383v c6383v, String name) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = c6383v.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if (StringsKt.equals(name, c6383v.m6801c(i6), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c6383v.m6804g(i6));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? CollectionsKt.emptyList() : listUnmodifiableList;
    }

    /* renamed from: r */
    public static final void m6968r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = name.charAt(i6);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + m6951a(cCharAt) + " at " + i6 + " in header name: " + name).toString());
            }
        }
    }

    /* renamed from: s */
    public static final void m6969s(String value, String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = value.charAt(i6);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected char 0x");
                sb.append(m6951a(cCharAt));
                sb.append(" at ");
                sb.append(i6);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(AbstractC6424h.m7008v(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
