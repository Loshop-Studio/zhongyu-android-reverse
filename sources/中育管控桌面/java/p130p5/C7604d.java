package p130p5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;

/* renamed from: p5.d */
/* loaded from: classes4.dex */
public final class C7604d {

    /* renamed from: a */
    public static final C7604d f10064a = new C7604d();

    /* renamed from: b */
    public static final String f10065b = "xn--";

    /* renamed from: c */
    public static final ByteString f10066c = ByteString.INSTANCE.encodeUtf8("xn--");

    /* renamed from: a */
    public final int m9014a(int i6, int i7, boolean z6) {
        int i8 = z6 ? i6 / TypedValues.TransitionType.TYPE_DURATION : i6 / 2;
        int i9 = i8 + (i8 / i7);
        int i10 = 0;
        while (i9 > 455) {
            i9 /= 35;
            i10 += 36;
        }
        return i10 + ((i9 * 36) / (i9 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* renamed from: b */
    public final List m9015b(String str, int i6, int i7) {
        ArrayList arrayList = new ArrayList();
        while (i6 < i7) {
            int iCharAt = str.charAt(i6);
            if (CharsKt.isSurrogate(iCharAt)) {
                int i8 = i6 + 1;
                char cCharAt = i8 < i7 ? str.charAt(i8) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = 65536 + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i6 = i8;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i6++;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String m9016c(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        Buffer buffer = new Buffer();
        int i6 = 0;
        while (i6 < length) {
            String str = string;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '.', i6, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = length;
            }
            if (!m9017d(str, i6, iIndexOf$default, buffer)) {
                return null;
            }
            if (iIndexOf$default >= length) {
                break;
            }
            buffer.writeByte(46);
            i6 = iIndexOf$default + 1;
            string = str;
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* renamed from: d */
    public final boolean m9017d(String str, int i6, int i7, Buffer buffer) {
        int i8;
        int i9;
        int i10 = 1;
        if (!StringsKt.regionMatches(str, i6, f10065b, 0, 4, true)) {
            buffer.writeUtf8(str, i6, i7);
            return true;
        }
        int i11 = i6 + 4;
        ?? arrayList = new ArrayList();
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '-', i7, false, 4, (Object) null);
        char c7 = '0';
        char c8 = '[';
        char c9 = '{';
        boolean z6 = false;
        if (iLastIndexOf$default >= i11) {
            while (i11 < iLastIndexOf$default) {
                int i12 = i11 + 1;
                char cCharAt = str.charAt(i11);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i11 = i12;
            }
            i11++;
        }
        int i13 = 128;
        int iM9014a = 72;
        int i14 = 0;
        while (i11 < i7) {
            int i15 = i10;
            boolean z7 = z6;
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(36, Integer.MAX_VALUE), 36);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                i8 = i14;
                int i16 = i15;
                while (i11 != i7) {
                    int i17 = i11 + 1;
                    char cCharAt2 = str.charAt(i11);
                    if ('a' <= cCharAt2 && cCharAt2 < c9) {
                        i9 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c8) {
                        i9 = cCharAt2 - 'A';
                    } else {
                        if (c7 > cCharAt2 || cCharAt2 >= ':') {
                            return z7;
                        }
                        i9 = cCharAt2 - 22;
                    }
                    int i18 = i16;
                    int i19 = i9 * i18;
                    int i20 = i8;
                    if (i20 > Integer.MAX_VALUE - i19) {
                        return z7;
                    }
                    i8 = i20 + i19;
                    int i21 = first <= iM9014a ? i15 : first >= iM9014a + 26 ? 26 : first - iM9014a;
                    if (i9 >= i21) {
                        int i22 = 36 - i21;
                        if (i18 > Integer.MAX_VALUE / i22) {
                            return z7;
                        }
                        i16 = i18 * i22;
                        if (first != last) {
                            first += step;
                            i11 = i17;
                            c7 = '0';
                            c8 = '[';
                            c9 = '{';
                        }
                    }
                    i11 = i17;
                }
                return z7;
            }
            i8 = i14;
            iM9014a = m9014a(i8 - i14, arrayList.size() + 1, i14 == 0 ? i15 : z7);
            int size = i8 / (arrayList.size() + 1);
            if (i13 > Integer.MAX_VALUE - size) {
                return z7;
            }
            i13 += size;
            int size2 = i8 % (arrayList.size() + 1);
            if (i13 > 1114111) {
                return z7;
            }
            arrayList.add(size2, Integer.valueOf(i13));
            i14 = size2 + 1;
            z6 = z7;
            i10 = i15;
            c7 = '0';
            c8 = '[';
            c9 = '{';
        }
        ?? r16 = i10;
        int size3 = arrayList.size();
        for (?? r13 = z6; r13 < size3; r13++) {
            buffer.writeUtf8CodePoint(((Number) arrayList.get(r13)).intValue());
        }
        return r16;
    }

    /* renamed from: e */
    public final String m9018e(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        Buffer buffer = new Buffer();
        int i6 = 0;
        while (i6 < length) {
            String str = string;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '.', i6, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = length;
            }
            if (!m9019f(str, i6, iIndexOf$default, buffer)) {
                return null;
            }
            if (iIndexOf$default >= length) {
                break;
            }
            buffer.writeByte(46);
            i6 = iIndexOf$default + 1;
            string = str;
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final boolean m9019f(String str, int i6, int i7, Buffer buffer) {
        int i8;
        int i9;
        int i10;
        int i11 = 1;
        if (!m9021h(str, i6, i7)) {
            buffer.writeUtf8(str, i6, i7);
            return true;
        }
        buffer.write(f10066c);
        List listM9015b = m9015b(str, i6, i7);
        Iterator it = listM9015b.iterator();
        int i12 = 0;
        while (true) {
            i8 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 128) {
                buffer.writeByte(iIntValue);
                i12++;
            }
        }
        if (i12 > 0) {
            buffer.writeByte(45);
        }
        int iM9014a = 72;
        int i13 = 0;
        int i14 = i12;
        while (i14 < listM9015b.size()) {
            Iterator it2 = listM9015b.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i8) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i8) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i15 = (iIntValue4 - i8) * (i14 + 1);
            if (i13 > Integer.MAX_VALUE - i15) {
                return false;
            }
            int i16 = i13 + i15;
            Iterator it3 = listM9015b.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = ((Number) it3.next()).intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i16 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i16++;
                } else if (iIntValue5 == iIntValue4) {
                    IntProgression intProgressionStep = RangesKt.step(RangesKt.until(36, Integer.MAX_VALUE), 36);
                    int first = intProgressionStep.getFirst();
                    int last = intProgressionStep.getLast();
                    int step = intProgressionStep.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i10 = i16;
                        while (true) {
                            if (first <= iM9014a) {
                                i9 = i11;
                            } else {
                                i9 = i11;
                                i11 = first >= iM9014a + 26 ? 26 : first - iM9014a;
                            }
                            if (i10 < i11) {
                                break;
                            }
                            int i17 = i10 - i11;
                            int i18 = 36 - i11;
                            buffer.writeByte(m9020g(i11 + (i17 % i18)));
                            i10 = i17 / i18;
                            if (first == last) {
                                break;
                            }
                            first += step;
                            i11 = i9;
                        }
                    } else {
                        i9 = i11;
                        i10 = i16;
                    }
                    buffer.writeByte(m9020g(i10));
                    int i19 = i14 + 1;
                    iM9014a = m9014a(i16, i19, i14 == i12 ? i9 : false);
                    i14 = i19;
                    i16 = 0;
                    i11 = i9;
                }
            }
            i13 = i16 + 1;
            i8 = iIntValue4 + 1;
        }
        return i11;
    }

    /* renamed from: g */
    public final int m9020g(int i6) {
        if (i6 < 26) {
            return i6 + 97;
        }
        if (i6 < 36) {
            return i6 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i6).toString());
    }

    /* renamed from: h */
    public final boolean m9021h(String str, int i6, int i7) {
        while (i6 < i7) {
            if (str.charAt(i6) >= 128) {
                return true;
            }
            i6++;
        }
        return false;
    }
}
