package kotlin.text;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.ExperimentalStdlibApi;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

@Metadata(m13412d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0016\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a<\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a(\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002\u001a@\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0016\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a&\u0010,\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010-\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010.\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a$\u0010/\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u00100\u001a\u000201*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u001a@\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a \u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0002\u001a \u00108\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00107\u001a\u00020\u0010H\u0002\u001a\u001c\u00109\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u0002012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020;2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020*2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010?\u001a\u00020\u0001*\u00020*2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0010H\u0002\u001a\u001c\u0010D\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010E\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a,\u0010G\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a<\u0010H\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a$\u0010N\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a\u001c\u0010O\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010P\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010Q\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a5\u0010R\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010U\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a\u0015\u0010V\u001a\u00020**\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a,\u0010W\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0010H\u0002\u001a,\u0010Z\u001a\u00020I*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0002\u001a,\u0010[\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\\\u001a\u00020]*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, m13413d2 = {"LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "toHexString", "", "format", "Lkotlin/text/HexFormat;", "startIndex", "", "endIndex", "toHexStringNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "byteToDigits", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "formatByteAt", "index", "bytePrefix", "byteSuffix", "destination", "", "destinationOffset", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "checkFormatLength", "formatLength", "", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "parseByteAt", "", "parsedByteArrayMaxSize", "stringLength", "charsPerSet", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "wholeElementsPerSet", "checkNewLineAt", "hexToByte", "", "hexToShort", "hexToInt", "hexToLong", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toCharArrayIfNotEmpty", "hexToIntImpl", "typeHexLength", "hexToLongImpl", "checkPrefixSuffixNumberOfDigits", "", RequestParameters.PREFIX, "suffix", "ignoreCase", "", "checkNumberOfDigits", "checkZeroDigits", "parseInt", "parseLong", "checkContainsAt", "part", "partName", "decimalFromHexDigitAt", "longDecimalFromHexDigitAt", "throwInvalidNumberOfDigits", "specifier", "expected", "throwNotContainedAt", "throwInvalidPrefixSuffix", "throwInvalidDigitAt", "", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1237:1\n1186#1,7:1239\n1186#1,7:1246\n1186#1,7:1253\n1186#1,7:1260\n1186#1,7:1267\n1186#1,7:1274\n1186#1,7:1281\n1186#1,7:1288\n1197#1,5:1295\n1197#1,5:1300\n1186#1,7:1305\n1186#1,7:1312\n1197#1,5:1319\n1206#1,5:1324\n1#2:1238\n1188#3,3:1329\n1188#3,3:1332\n1188#3,3:1335\n1188#3,3:1338\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1239,7\n482#1:1246,7\n486#1:1253,7\n489#1:1260,7\n529#1:1267,7\n532#1:1274,7\n537#1:1281,7\n542#1:1288,7\n549#1:1295,5\n550#1:1300,5\n1141#1:1305,7\n1143#1:1312,7\n1171#1:1319,5\n1179#1:1324,5\n42#1:1329,3\n43#1:1332,3\n54#1:1335,3\n55#1:1338,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[256];
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = LOWER_CASE_HEX_DIGITS.charAt(i10 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i10 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = UPPER_CASE_HEX_DIGITS.charAt(i11 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i11 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i15)] = i16;
            i15++;
            i16++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i9 < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i9)] = i20;
            i9++;
            i20++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j9, int i9, int i10) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i9;
        return (j9 * j10) + (i10 * (j10 - 1));
    }

    private static final int checkContainsAt(String str, int i9, int i10, String str2, boolean z9, String str3) {
        if (str2.length() == 0) {
            return i9;
        }
        int length = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i11), str.charAt(i9 + i11), z9)) {
                throwNotContainedAt(str, i9, i10, str2, str3);
            }
        }
        return i9 + str2.length();
    }

    private static final int checkFormatLength(long j9) {
        if (0 <= j9 && j9 <= SieveCacheKt.NodeLinkMask) {
            return (int) j9;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m24978toStringimpl(ULong.m24932constructorimpl(j9))));
    }

    private static final int checkNewLineAt(String str, int i9, int i10) {
        if (str.charAt(i9) == '\r') {
            int i11 = i9 + 1;
            return (i11 >= i10 || str.charAt(i11) != '\n') ? i11 : i9 + 2;
        }
        if (str.charAt(i9) == '\n') {
            return i9 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i9 + ", but was " + str.charAt(i9));
    }

    private static final void checkNumberOfDigits(String str, int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if (i12 < 1) {
            throwInvalidNumberOfDigits(str, i9, i10, "at least", 1);
        } else if (i12 > i11) {
            checkZeroDigits(str, i9, (i12 + i9) - i11);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i9, int i10, String str2, String str3, boolean z9, int i11) {
        if ((i10 - i9) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i9, i10, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i12), str.charAt(i9 + i12), z9)) {
                    throwNotContainedAt(str, i9, i10, str2, RequestParameters.PREFIX);
                }
            }
            i9 += str2.length();
        }
        int length2 = i10 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i13), str.charAt(length2 + i13), z9)) {
                    throwNotContainedAt(str, length2, i10, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i9, length2, i11);
    }

    private static final void checkZeroDigits(String str, int i9, int i10) {
        while (i9 < i10) {
            if (str.charAt(i9) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i9 + ", but was '" + str.charAt(i9) + "'.\nThe result won't fit the type being parsed.");
            }
            i9++;
        }
    }

    private static final int decimalFromHexDigitAt(String str, int i9) {
        int i10;
        char cCharAt = str.charAt(i9);
        if ((cCharAt >>> '\b') == 0 && (i10 = HEX_DIGITS_TO_DECIMAL[cCharAt]) >= 0) {
            return i10;
        }
        throwInvalidDigitAt(str, i9);
        throw new KotlinNothingValueException();
    }

    private static final int formatByteAt(byte[] bArr, int i9, String str, String str2, int[] iArr, char[] cArr, int i10) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i9, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i10)));
    }

    private static final int formattedStringLength(int i9, int i10, int i11, int i12) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j9 = i10;
        return checkFormatLength((i9 * (((i11 + 2) + i12) + j9)) - j9);
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte hexToByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte[] hexToByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray(str, 0, str.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i9, i10, bytesHexFormat) : hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i9, i10, bytesHexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = bytePrefix.length() + 2 + byteSuffix.length() + length;
        long j9 = i10 - i9;
        int i11 = (int) ((j9 + length) / length2);
        if ((i11 * length2) - length != j9) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i11];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i12 = 0; i12 < length3; i12++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i12), str.charAt(i9 + i12), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i9, i10, bytePrefix, "byte prefix");
                }
            }
            i9 += bytePrefix.length();
        }
        String str2 = byteSuffix + byteSeparator + bytePrefix;
        int i13 = i11 - 1;
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = parseByteAt(str, i9);
            i9 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i15 = 0; i15 < length4; i15++) {
                    if (!CharsKt__CharKt.equals(str2.charAt(i15), str.charAt(i9 + i15), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i9, i10, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i9 += str2.length();
            }
        }
        bArr[i13] = parseByteAt(str, i9);
        int i16 = i9 + 2;
        if (byteSuffix.length() == 0) {
            return bArr;
        }
        int length5 = byteSuffix.length();
        for (int i17 = 0; i17 < length5; i17++) {
            if (!CharsKt__CharKt.equals(byteSuffix.charAt(i17), str.charAt(i16 + i17), ignoreCase$kotlin_stdlib)) {
                throwNotContainedAt(str, i16, i10, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 - i9;
        int i12 = 2;
        if (length == 0) {
            if ((i11 & 1) != 0) {
                return null;
            }
            int i13 = i11 >> 1;
            byte[] bArr = new byte[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                bArr[i15] = parseByteAt(str, i14);
                i14 += 2;
            }
            return bArr;
        }
        if (i11 % 3 != 2) {
            return null;
        }
        int i16 = (i11 / 3) + 1;
        byte[] bArr2 = new byte[i16];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        bArr2[0] = parseByteAt(str, 0);
        for (int i17 = 1; i17 < i16; i17++) {
            if (str.charAt(i12) != cCharAt) {
                String byteSeparator = bytesHexFormat.getByteSeparator();
                boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
                if (byteSeparator.length() != 0) {
                    int length2 = byteSeparator.length();
                    for (int i18 = 0; i18 < length2; i18++) {
                        if (!CharsKt__CharKt.equals(byteSeparator.charAt(i18), str.charAt(i12 + i18), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, i12, i10, byteSeparator, "byte separator");
                        }
                    }
                    byteSeparator.length();
                }
            }
            bArr2[i17] = parseByteAt(str, i12 + 1);
            i12 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final byte[] hexToByteArraySlowPath(java.lang.String r18, int r19, int r20, kotlin.text.HexFormat.BytesHexFormat r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.HexExtensionsKt.hexToByteArraySlowPath(java.lang.String, int, int, kotlin.text.HexFormat$BytesHexFormat):byte[]");
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int hexToInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt(str, 0, str.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    private static final int hexToIntImpl(String str, int i9, int i10, HexFormat hexFormat, int i11) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i9, i10, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i9, i10, i11);
            return parseInt(str, i9, i10);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i9, i10, prefix, suffix, number.getIgnoreCase(), i11);
        return parseInt(str, i9 + prefix.length(), i10 - suffix.length());
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    private static final long hexToLongImpl(String str, int i9, int i10, HexFormat hexFormat, int i11) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i9, i10, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i9, i10, i11);
            return parseLong(str, i9, i10);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i9, i10, prefix, suffix, number.getIgnoreCase(), i11);
        return parseLong(str, i9 + prefix.length(), i10 - suffix.length());
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i9) {
        char cCharAt = str.charAt(i9);
        if ((cCharAt >>> '\b') == 0) {
            long j9 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
            if (j9 >= 0) {
                return j9;
            }
        }
        throwInvalidDigitAt(str, i9);
        throw new KotlinNothingValueException();
    }

    private static final byte parseByteAt(String str, int i9) {
        int[] iArr;
        int i10;
        int i11;
        char cCharAt = str.charAt(i9);
        if ((cCharAt >>> '\b') != 0 || (i10 = (iArr = HEX_DIGITS_TO_DECIMAL)[cCharAt]) < 0) {
            throwInvalidDigitAt(str, i9);
            throw new KotlinNothingValueException();
        }
        int i12 = i9 + 1;
        char cCharAt2 = str.charAt(i12);
        if ((cCharAt2 >>> '\b') == 0 && (i11 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i10 << 4) | i11);
        }
        throwInvalidDigitAt(str, i12);
        throw new KotlinNothingValueException();
    }

    private static final int parseInt(String str, int i9, int i10) {
        int i11;
        int i12 = 0;
        while (i9 < i10) {
            int i13 = i12 << 4;
            char cCharAt = str.charAt(i9);
            if ((cCharAt >>> '\b') != 0 || (i11 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i9);
                throw new KotlinNothingValueException();
            }
            i12 = i13 | i11;
            i9++;
        }
        return i12;
    }

    private static final long parseLong(String str, int i9, int i10) {
        long j9 = 0;
        while (i9 < i10) {
            long j10 = j9 << 4;
            char cCharAt = str.charAt(i9);
            if ((cCharAt >>> '\b') == 0) {
                long j11 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
                if (j11 >= 0) {
                    j9 = j10 | j11;
                    i9++;
                }
            }
            throwInvalidDigitAt(str, i9);
            throw new KotlinNothingValueException();
        }
        return j9;
    }

    public static final int parsedByteArrayMaxSize(int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        long jCharsPerSet;
        if (i9 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j9 = i14 + 2 + i15;
        long jCharsPerSet2 = charsPerSet(j9, i11, i13);
        if (i10 <= i11) {
            jCharsPerSet = charsPerSet(j9, i10, i13);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i10 / i11, i12);
            int i16 = i10 % i11;
            if (i16 != 0) {
                jCharsPerSet = jCharsPerSet + i12 + charsPerSet(j9, i16, i13);
            }
        }
        long j10 = i9;
        long jWholeElementsPerSet = wholeElementsPerSet(j10, jCharsPerSet, 1);
        long j11 = j10 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j11, jCharsPerSet2, i12);
        long j12 = j11 - ((jCharsPerSet2 + i12) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j12, j9, i13);
        return (int) ((jWholeElementsPerSet * i10) + (jWholeElementsPerSet2 * i11) + jWholeElementsPerSet3 + (j12 - ((j9 + ((long) i13)) * jWholeElementsPerSet3) > 0 ? 1 : 0));
    }

    private static final Void throwInvalidDigitAt(String str, int i9) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i9 + ", but was " + str.charAt(i9));
    }

    private static final void throwInvalidNumberOfDigits(String str, int i9, int i10, String str2, int i11) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i9, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i11 + " hexadecimal digits at index " + i9 + ", but was \"" + strSubstring + "\" of length " + (i10 - i9));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i9, int i10, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i9, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void throwNotContainedAt(String str, int i9, int i10, String str2, String str3) {
        int iCoerceAtMost = RangesKt.coerceAtMost(str2.length() + i9, i10);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i9, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i9 + ", but was " + strSubstring);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i9) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i9);
            } else {
                cArr[i9] = str.charAt(0);
            }
        }
        return i9 + str.length();
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    private static final String toHexStringImpl(long j9, HexFormat.NumberHexFormat numberHexFormat, String str, int i9) {
        if ((i9 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i10 = i9 >> 2;
        int minLength = numberHexFormat.getMinLength();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(minLength - i10, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(prefix.length() + iCoerceAtLeast + i10 + suffix.length());
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i11 = iCoerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i11);
            charArrayIfNotEmpty = i11;
        }
        int i12 = i9;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 -= 4;
            int i14 = (int) ((j9 >> i12) & 15);
            removeLeadingZeros = removeLeadingZeros && i14 == 0 && (i12 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i14);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i9, i10, bytesHexFormat, iArr) : toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i9, i10, bytesHexFormat, iArr);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i10 - i9, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i9, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i11 = i9 + 1; i11 < i10; i11++) {
            byteAt = formatByteAt(bArr, i11, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 - i9;
        int byteAt = 0;
        if (length == 0) {
            char[] cArr = new char[checkFormatLength(i11 * 2)];
            while (i9 < i10) {
                byteAt = formatByteAt(bArr, i9, iArr, cArr, byteAt);
                i9++;
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        char[] cArr2 = new char[checkFormatLength((i11 * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int byteAt2 = formatByteAt(bArr, i9, iArr, cArr2, 0);
        for (int i12 = i9 + 1; i12 < i10; i12++) {
            cArr2[byteAt2] = cCharAt;
            byteAt2 = formatByteAt(bArr, i12, iArr, cArr2, byteAt2 + 1);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr2);
    }

    private static final String toHexStringSlowPath(byte[] bArr, int i9, int i10, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i11;
        int i12;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int i13 = formattedStringLength(i10 - i9, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i13];
        int i14 = i9;
        int charArrayIfNotEmpty = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i10) {
            if (i15 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i11 = 0;
                i12 = 0;
            } else if (i16 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i11 = i15;
                i12 = 0;
            } else {
                i11 = i15;
                i12 = i16;
            }
            if (i12 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            String str = bytePrefix;
            int byteAt = formatByteAt(bArr, i14, str, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i14++;
            i16 = i12 + 1;
            charArrayIfNotEmpty = byteAt;
            bytePrefix = str;
            i15 = i11 + 1;
        }
        if (charArrayIfNotEmpty == i13) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j9, long j10, int i9) {
        if (j9 <= 0 || j10 <= 0) {
            return 0L;
        }
        long j11 = i9;
        return (j9 + j11) / (j10 + j11);
    }

    private static final byte hexToByte(String str, int i9, int i10, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i9, i10, hexFormat, 2);
    }

    private static final byte[] hexToByteArray(String str, int i9, int i10, HexFormat hexFormat) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i9, i10, str.length());
        if (i9 == i10) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i9, i10, bytes)) == null) ? hexToByteArraySlowPath(str, i9, i10, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    public static final int hexToInt(String str, int i9, int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToIntImpl(str, i9, i10, format, 8);
    }

    public static final long hexToLong(String str, int i9, int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl(str, i9, i10, format, 16);
    }

    private static final short hexToShort(String str, int i9, int i10, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i9, i10, hexFormat, 4);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte[] bArr, int i9, int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i9, i10, bArr.length);
        if (i9 == i10) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? toHexStringNoLineAndGroupSeparator(bArr, i9, i10, bytes, iArr) : toHexStringSlowPath(bArr, i9, i10, bytes, iArr);
    }

    public static final int formattedStringLength(int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i9 > 0) {
            int i16 = (i9 - 1) / i10;
            int i17 = (i10 - 1) / i11;
            int i18 = i9 % i10;
            if (i18 != 0) {
                i10 = i18;
            }
            return checkFormatLength(i16 + (((i17 * i16) + ((i10 - 1) / i11)) * i12) + (((r0 - i16) - r2) * i13) + (i9 * (i14 + 2 + i15)));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i9, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i9, i10, hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i9, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i9, i10, hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i9, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i9, i10, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i9, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i9, i10, hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i9, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i9, i10, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i9, int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = bArr.length;
        }
        if ((i11 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i9, i10, hexFormat);
    }

    private static final int formatByteAt(byte[] bArr, int i9, int[] iArr, char[] cArr, int i10) {
        int i11 = iArr[bArr[i9] & UByte.MAX_VALUE];
        cArr[i10] = (char) (i11 >> 8);
        cArr[i10 + 1] = (char) (i11 & 255);
        return i10 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b10, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b10, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s9, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s9, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte b10, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b10 >> 4) & 15), str.charAt(b10 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b10 & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(b10, number, str, 8);
    }

    public static /* synthetic */ String toHexString$default(int i9, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i9, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j9, HexFormat hexFormat, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j9, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(short s9, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s9 >> 12) & 15), str.charAt((s9 >> 8) & 15), str.charAt((s9 >> 4) & 15), str.charAt(s9 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s9 & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(s9, number, str, 16);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(int i9, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i9 >> 28) & 15), str.charAt((i9 >> 24) & 15), str.charAt((i9 >> 20) & 15), str.charAt((i9 >> 16) & 15), str.charAt((i9 >> 12) & 15), str.charAt((i9 >> 8) & 15), str.charAt((i9 >> 4) & 15), str.charAt(i9 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i9) >> 2, 7), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(i9, number, str, 32);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(long j9, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j9 >> 60) & 15)), str.charAt((int) ((j9 >> 56) & 15)), str.charAt((int) ((j9 >> 52) & 15)), str.charAt((int) ((j9 >> 48) & 15)), str.charAt((int) ((j9 >> 44) & 15)), str.charAt((int) ((j9 >> 40) & 15)), str.charAt((int) ((j9 >> 36) & 15)), str.charAt((int) ((j9 >> 32) & 15)), str.charAt((int) ((j9 >> 28) & 15)), str.charAt((int) ((j9 >> 24) & 15)), str.charAt((int) ((j9 >> 20) & 15)), str.charAt((int) ((j9 >> 16) & 15)), str.charAt((int) ((j9 >> 12) & 15)), str.charAt((int) ((j9 >> 8) & 15)), str.charAt((int) ((j9 >> 4) & 15)), str.charAt((int) (j9 & 15))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j9) >> 2, 15), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(j9, number, str, 64);
    }
}
