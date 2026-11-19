package kotlin.text;

import androidx.collection.SieveCacheKt;
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

@Metadata(m7879d1 = {"\u0000r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0001\n\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0016\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0017\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a,\u0010\u0018\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u001a<\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010\u0019\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a(\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0002\u001a@\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a\u0010\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0016\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010+\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a&\u0010,\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010-\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010.\u001a\u0004\u0018\u00010\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a$\u0010/\u001a\u00020\f*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u0014\u00100\u001a\u000201*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u001a@\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0000\u001a \u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u0010H\u0002\u001a \u00108\u001a\u00020*2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0006\u00107\u001a\u00020\u0010H\u0002\u001a\u001c\u00109\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u0002012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010:\u001a\u000201*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020;2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010<\u001a\u00020;*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010=\u001a\u00020\u0010*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020*2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0016\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u001a*\u0010>\u001a\u00020**\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010?\u001a\u00020\u0001*\u00020*2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u0010H\u0002\u001a\u001c\u0010D\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002\u001a,\u0010E\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a,\u0010G\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a<\u0010H\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a$\u0010N\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0010H\u0002\u001a\u001c\u0010O\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010P\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a\u001c\u0010Q\u001a\u00020**\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a5\u0010R\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010U\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a\u0015\u0010V\u001a\u00020**\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0082\b\u001a,\u0010W\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0010H\u0002\u001a,\u0010Z\u001a\u00020I*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\u0001H\u0002\u001a,\u0010[\u001a\u00020I*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\\\u001a\u00020]*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, m7880d2 = {"LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "toHexString", "", "format", "Lkotlin/text/HexFormat;", "startIndex", "", "endIndex", "toHexStringNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "byteToDigits", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "formatByteAt", "index", "bytePrefix", "byteSuffix", "destination", "", "destinationOffset", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "checkFormatLength", "formatLength", "", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "parseByteAt", "", "parsedByteArrayMaxSize", "stringLength", "charsPerSet", "charsPerElement", "elementsPerSet", "elementSeparatorLength", "wholeElementsPerSet", "checkNewLineAt", "hexToByte", "", "hexToShort", "hexToInt", "hexToLong", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toCharArrayIfNotEmpty", "hexToIntImpl", "typeHexLength", "hexToLongImpl", "checkPrefixSuffixNumberOfDigits", "", RequestParameters.PREFIX, "suffix", "ignoreCase", "", "checkNumberOfDigits", "checkZeroDigits", "parseInt", "parseLong", "checkContainsAt", "part", "partName", "decimalFromHexDigitAt", "longDecimalFromHexDigitAt", "throwInvalidNumberOfDigits", "specifier", "expected", "throwNotContainedAt", "throwInvalidPrefixSuffix", "throwInvalidDigitAt", "", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1237:1\n1186#1,7:1239\n1186#1,7:1246\n1186#1,7:1253\n1186#1,7:1260\n1186#1,7:1267\n1186#1,7:1274\n1186#1,7:1281\n1186#1,7:1288\n1197#1,5:1295\n1197#1,5:1300\n1186#1,7:1305\n1186#1,7:1312\n1197#1,5:1319\n1206#1,5:1324\n1#2:1238\n1188#3,3:1329\n1188#3,3:1332\n1188#3,3:1335\n1188#3,3:1338\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1239,7\n482#1:1246,7\n486#1:1253,7\n489#1:1260,7\n529#1:1267,7\n532#1:1274,7\n537#1:1281,7\n542#1:1288,7\n549#1:1295,5\n550#1:1300,5\n1141#1:1305,7\n1143#1:1312,7\n1171#1:1319,5\n1179#1:1324,5\n42#1:1329,3\n43#1:1332,3\n54#1:1335,3\n55#1:1338,3\n*E\n"})
/* loaded from: classes4.dex */
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[256];
        int i6 = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            iArr[i7] = LOWER_CASE_HEX_DIGITS.charAt(i7 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i7 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i8 = 0; i8 < 256; i8++) {
            iArr2[i8] = UPPER_CASE_HEX_DIGITS.charAt(i8 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i8 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr3[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < LOWER_CASE_HEX_DIGITS.length()) {
            iArr3[LOWER_CASE_HEX_DIGITS.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < UPPER_CASE_HEX_DIGITS.length()) {
            iArr3[UPPER_CASE_HEX_DIGITS.charAt(i12)] = i13;
            i12++;
            i13++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i14 = 0; i14 < 256; i14++) {
            jArr[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < LOWER_CASE_HEX_DIGITS.length()) {
            jArr[LOWER_CASE_HEX_DIGITS.charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        while (i6 < UPPER_CASE_HEX_DIGITS.length()) {
            jArr[UPPER_CASE_HEX_DIGITS.charAt(i6)] = i17;
            i6++;
            i17++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    private static final long charsPerSet(long j6, int i6, int i7) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j7 = i6;
        return (j6 * j7) + (i7 * (j7 - 1));
    }

    private static final int checkContainsAt(String str, int i6, int i7, String str2, boolean z6, String str3) {
        if (str2.length() == 0) {
            return i6;
        }
        int length = str2.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!CharsKt__CharKt.equals(str2.charAt(i8), str.charAt(i6 + i8), z6)) {
                throwNotContainedAt(str, i6, i7, str2, str3);
            }
        }
        return i6 + str2.length();
    }

    private static final int checkFormatLength(long j6) {
        if (0 <= j6 && j6 <= SieveCacheKt.NodeLinkMask) {
            return (int) j6;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ULong.m17403toStringimpl(ULong.m17357constructorimpl(j6))));
    }

    private static final int checkNewLineAt(String str, int i6, int i7) {
        if (str.charAt(i6) == '\r') {
            int i8 = i6 + 1;
            return (i8 >= i7 || str.charAt(i8) != '\n') ? i8 : i6 + 2;
        }
        if (str.charAt(i6) == '\n') {
            return i6 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i6 + ", but was " + str.charAt(i6));
    }

    private static final void checkNumberOfDigits(String str, int i6, int i7, int i8) {
        int i9 = i7 - i6;
        if (i9 < 1) {
            throwInvalidNumberOfDigits(str, i6, i7, "at least", 1);
        } else if (i9 > i8) {
            checkZeroDigits(str, i6, (i9 + i6) - i8);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i6, int i7, String str2, String str3, boolean z6, int i8) {
        if ((i7 - i6) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i6, i7, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i9 = 0; i9 < length; i9++) {
                if (!CharsKt__CharKt.equals(str2.charAt(i9), str.charAt(i6 + i9), z6)) {
                    throwNotContainedAt(str, i6, i7, str2, RequestParameters.PREFIX);
                }
            }
            i6 += str2.length();
        }
        int length2 = i7 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i10 = 0; i10 < length3; i10++) {
                if (!CharsKt__CharKt.equals(str3.charAt(i10), str.charAt(length2 + i10), z6)) {
                    throwNotContainedAt(str, length2, i7, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i6, length2, i8);
    }

    private static final void checkZeroDigits(String str, int i6, int i7) {
        while (i6 < i7) {
            if (str.charAt(i6) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i6 + ", but was '" + str.charAt(i6) + "'.\nThe result won't fit the type being parsed.");
            }
            i6++;
        }
    }

    private static final int decimalFromHexDigitAt(String str, int i6) {
        int i7;
        char cCharAt = str.charAt(i6);
        if ((cCharAt >>> '\b') == 0 && (i7 = HEX_DIGITS_TO_DECIMAL[cCharAt]) >= 0) {
            return i7;
        }
        throwInvalidDigitAt(str, i6);
        throw new KotlinNothingValueException();
    }

    private static final int formatByteAt(byte[] bArr, int i6, String str, String str2, int[] iArr, char[] cArr, int i7) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i6, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i7)));
    }

    private static final int formattedStringLength(int i6, int i7, int i8, int i9) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j6 = i7;
        return checkFormatLength((i6 * (((i8 + 2) + i9) + j6)) - j6);
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

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
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

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i6, i7, bytesHexFormat) : hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i6, i7, bytesHexFormat);
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = bytePrefix.length() + 2 + byteSuffix.length() + length;
        long j6 = i7 - i6;
        int i8 = (int) ((j6 + length) / length2);
        if ((i8 * length2) - length != j6) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i8];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i9 = 0; i9 < length3; i9++) {
                if (!CharsKt__CharKt.equals(bytePrefix.charAt(i9), str.charAt(i6 + i9), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i6, i7, bytePrefix, "byte prefix");
                }
            }
            i6 += bytePrefix.length();
        }
        String str2 = byteSuffix + byteSeparator + bytePrefix;
        int i10 = i8 - 1;
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = parseByteAt(str, i6);
            i6 += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i12 = 0; i12 < length4; i12++) {
                    if (!CharsKt__CharKt.equals(str2.charAt(i12), str.charAt(i6 + i12), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i6, i7, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i6 += str2.length();
            }
        }
        bArr[i10] = parseByteAt(str, i6);
        int i13 = i6 + 2;
        if (byteSuffix.length() == 0) {
            return bArr;
        }
        int length5 = byteSuffix.length();
        for (int i14 = 0; i14 < length5; i14++) {
            if (!CharsKt__CharKt.equals(byteSuffix.charAt(i14), str.charAt(i13 + i14), ignoreCase$kotlin_stdlib)) {
                throwNotContainedAt(str, i13, i7, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i8 = i7 - i6;
        int i9 = 2;
        if (length == 0) {
            if ((i8 & 1) != 0) {
                return null;
            }
            int i10 = i8 >> 1;
            byte[] bArr = new byte[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = parseByteAt(str, i11);
                i11 += 2;
            }
            return bArr;
        }
        if (i8 % 3 != 2) {
            return null;
        }
        int i13 = (i8 / 3) + 1;
        byte[] bArr2 = new byte[i13];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        bArr2[0] = parseByteAt(str, 0);
        for (int i14 = 1; i14 < i13; i14++) {
            if (str.charAt(i9) != cCharAt) {
                String byteSeparator = bytesHexFormat.getByteSeparator();
                boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
                if (byteSeparator.length() != 0) {
                    int length2 = byteSeparator.length();
                    for (int i15 = 0; i15 < length2; i15++) {
                        if (!CharsKt__CharKt.equals(byteSeparator.charAt(i15), str.charAt(i9 + i15), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, i9, i7, byteSeparator, "byte separator");
                        }
                    }
                    byteSeparator.length();
                }
            }
            bArr2[i14] = parseByteAt(str, i9 + 1);
            i9 += 3;
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

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    private static final int hexToIntImpl(String str, int i6, int i7, HexFormat hexFormat, int i8) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i6, i7, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i6, i7, i8);
            return parseInt(str, i6, i7);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i6, i7, prefix, suffix, number.getIgnoreCase(), i8);
        return parseInt(str, i6 + prefix.length(), i7 - suffix.length());
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final long hexToLong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong(str, 0, str.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    private static final long hexToLongImpl(String str, int i6, int i7, HexFormat hexFormat, int i8) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i6, i7, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i6, i7, i8);
            return parseLong(str, i6, i7);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i6, i7, prefix, suffix, number.getIgnoreCase(), i8);
        return parseLong(str, i6 + prefix.length(), i7 - suffix.length());
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short hexToShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort(str, 0, str.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i6) {
        char cCharAt = str.charAt(i6);
        if ((cCharAt >>> '\b') == 0) {
            long j6 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
            if (j6 >= 0) {
                return j6;
            }
        }
        throwInvalidDigitAt(str, i6);
        throw new KotlinNothingValueException();
    }

    private static final byte parseByteAt(String str, int i6) {
        int[] iArr;
        int i7;
        int i8;
        char cCharAt = str.charAt(i6);
        if ((cCharAt >>> '\b') != 0 || (i7 = (iArr = HEX_DIGITS_TO_DECIMAL)[cCharAt]) < 0) {
            throwInvalidDigitAt(str, i6);
            throw new KotlinNothingValueException();
        }
        int i9 = i6 + 1;
        char cCharAt2 = str.charAt(i9);
        if ((cCharAt2 >>> '\b') == 0 && (i8 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i7 << 4) | i8);
        }
        throwInvalidDigitAt(str, i9);
        throw new KotlinNothingValueException();
    }

    private static final int parseInt(String str, int i6, int i7) {
        int i8;
        int i9 = 0;
        while (i6 < i7) {
            int i10 = i9 << 4;
            char cCharAt = str.charAt(i6);
            if ((cCharAt >>> '\b') != 0 || (i8 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i6);
                throw new KotlinNothingValueException();
            }
            i9 = i10 | i8;
            i6++;
        }
        return i9;
    }

    private static final long parseLong(String str, int i6, int i7) {
        long j6 = 0;
        while (i6 < i7) {
            long j7 = j6 << 4;
            char cCharAt = str.charAt(i6);
            if ((cCharAt >>> '\b') == 0) {
                long j8 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
                if (j8 >= 0) {
                    j6 = j7 | j8;
                    i6++;
                }
            }
            throwInvalidDigitAt(str, i6);
            throw new KotlinNothingValueException();
        }
        return j6;
    }

    public static final int parsedByteArrayMaxSize(int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        long jCharsPerSet;
        if (i6 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j6 = i11 + 2 + i12;
        long jCharsPerSet2 = charsPerSet(j6, i8, i10);
        if (i7 <= i8) {
            jCharsPerSet = charsPerSet(j6, i7, i10);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i7 / i8, i9);
            int i13 = i7 % i8;
            if (i13 != 0) {
                jCharsPerSet = jCharsPerSet + i9 + charsPerSet(j6, i13, i10);
            }
        }
        long j7 = i6;
        long jWholeElementsPerSet = wholeElementsPerSet(j7, jCharsPerSet, 1);
        long j8 = j7 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j8, jCharsPerSet2, i9);
        long j9 = j8 - ((jCharsPerSet2 + i9) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j9, j6, i10);
        return (int) ((jWholeElementsPerSet * i7) + (jWholeElementsPerSet2 * i8) + jWholeElementsPerSet3 + (j9 - ((j6 + ((long) i10)) * jWholeElementsPerSet3) > 0 ? 1 : 0));
    }

    private static final Void throwInvalidDigitAt(String str, int i6) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i6 + ", but was " + str.charAt(i6));
    }

    private static final void throwInvalidNumberOfDigits(String str, int i6, int i7, String str2, int i8) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i6, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i8 + " hexadecimal digits at index " + i6 + ", but was \"" + strSubstring + "\" of length " + (i7 - i6));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i6, int i7, String str2, String str3) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i6, i7);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void throwNotContainedAt(String str, int i6, int i7, String str2, String str3) {
        int iCoerceAtMost = RangesKt.coerceAtMost(str2.length() + i6, i7);
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i6, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i6 + ", but was " + strSubstring);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i6) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i6);
            } else {
                cArr[i6] = str.charAt(0);
            }
        }
        return i6 + str.length();
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte[] bArr, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    private static final String toHexStringImpl(long j6, HexFormat.NumberHexFormat numberHexFormat, String str, int i6) {
        if ((i6 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i7 = i6 >> 2;
        int minLength = numberHexFormat.getMinLength();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(minLength - i7, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(prefix.length() + iCoerceAtLeast + i7 + suffix.length());
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i8 = iCoerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i8);
            charArrayIfNotEmpty = i8;
        }
        int i9 = i6;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 -= 4;
            int i11 = (int) ((j6 >> i9) & 15);
            removeLeadingZeros = removeLeadingZeros && i11 == 0 && (i9 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i11);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? StringsKt__StringsJVMKt.concatToString(cArr) : StringsKt__StringsJVMKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i6, i7, bytesHexFormat, iArr) : toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i6, i7, bytesHexFormat, iArr);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i7 - i6, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i6, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i8 = i6 + 1; i8 < i7; i8++) {
            byteAt = formatByteAt(bArr, i8, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
        }
        return StringsKt__StringsJVMKt.concatToString(cArr);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i8 = i7 - i6;
        int byteAt = 0;
        if (length == 0) {
            char[] cArr = new char[checkFormatLength(i8 * 2)];
            while (i6 < i7) {
                byteAt = formatByteAt(bArr, i6, iArr, cArr, byteAt);
                i6++;
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        char[] cArr2 = new char[checkFormatLength((i8 * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int byteAt2 = formatByteAt(bArr, i6, iArr, cArr2, 0);
        for (int i9 = i6 + 1; i9 < i7; i9++) {
            cArr2[byteAt2] = cCharAt;
            byteAt2 = formatByteAt(bArr, i9, iArr, cArr2, byteAt2 + 1);
        }
        return StringsKt__StringsJVMKt.concatToString(cArr2);
    }

    private static final String toHexStringSlowPath(byte[] bArr, int i6, int i7, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i8;
        int i9;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int i10 = formattedStringLength(i7 - i6, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i10];
        int i11 = i6;
        int charArrayIfNotEmpty = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i7) {
            if (i12 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i8 = 0;
                i9 = 0;
            } else if (i13 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i8 = i12;
                i9 = 0;
            } else {
                i8 = i12;
                i9 = i13;
            }
            if (i9 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            String str = bytePrefix;
            int byteAt = formatByteAt(bArr, i11, str, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i11++;
            i13 = i9 + 1;
            charArrayIfNotEmpty = byteAt;
            bytePrefix = str;
            i12 = i8 + 1;
        }
        if (charArrayIfNotEmpty == i10) {
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j6, long j7, int i6) {
        if (j6 <= 0 || j7 <= 0) {
            return 0L;
        }
        long j8 = i6;
        return (j6 + j8) / (j7 + j8);
    }

    private static final byte hexToByte(String str, int i6, int i7, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i6, i7, hexFormat, 2);
    }

    private static final byte[] hexToByteArray(String str, int i6, int i7, HexFormat hexFormat) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i6, i7, str.length());
        if (i6 == i7) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i6, i7, bytes)) == null) ? hexToByteArraySlowPath(str, i6, i7, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    public static final int hexToInt(String str, int i6, int i7, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToIntImpl(str, i6, i7, format, 8);
    }

    public static final long hexToLong(String str, int i6, int i7, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLongImpl(str, i6, i7, format, 16);
    }

    private static final short hexToShort(String str, int i6, int i7, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i6, i7, hexFormat, 4);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte[] bArr, int i6, int i7, HexFormat format) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i6, i7, bArr.length);
        if (i6 == i7) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? toHexStringNoLineAndGroupSeparator(bArr, i6, i7, bytes, iArr) : toHexStringSlowPath(bArr, i6, i7, bytes, iArr);
    }

    public static final int formattedStringLength(int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i6 > 0) {
            int i13 = (i6 - 1) / i7;
            int i14 = (i7 - 1) / i8;
            int i15 = i6 % i7;
            if (i15 != 0) {
                i7 = i15;
            }
            return checkFormatLength(i13 + (((i14 * i13) + ((i7 - 1) / i8)) * i9) + (((r0 - i13) - r2) * i10) + (i6 * (i11 + 2 + i12)));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ byte hexToByte$default(String str, int i6, int i7, HexFormat hexFormat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i6, i7, hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, int i6, int i7, HexFormat hexFormat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i6, i7, hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i6, int i7, HexFormat hexFormat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i6, i7, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i6, int i7, HexFormat hexFormat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i6, i7, hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String str, int i6, int i7, HexFormat hexFormat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        if ((i8 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i6, i7, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i6, int i7, HexFormat hexFormat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = bArr.length;
        }
        if ((i8 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i6, i7, hexFormat);
    }

    private static final int formatByteAt(byte[] bArr, int i6, int[] iArr, char[] cArr, int i7) {
        int i8 = iArr[bArr[i6] & UByte.MAX_VALUE];
        cArr[i7] = (char) (i8 >> 8);
        cArr[i7 + 1] = (char) (i8 & 255);
        return i7 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b7, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b7, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(short s6, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s6, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(byte b7, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b7 >> 4) & 15), str.charAt(b7 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b7 & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(b7, number, str, 8);
    }

    public static /* synthetic */ String toHexString$default(int i6, HexFormat hexFormat, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i6, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(long j6, HexFormat hexFormat, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j6, hexFormat);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(short s6, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s6 >> 12) & 15), str.charAt((s6 >> 8) & 15), str.charAt((s6 >> 4) & 15), str.charAt(s6 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s6 & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(s6, number, str, 16);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(int i6, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i6 >> 28) & 15), str.charAt((i6 >> 24) & 15), str.charAt((i6 >> 20) & 15), str.charAt((i6 >> 16) & 15), str.charAt((i6 >> 12) & 15), str.charAt((i6 >> 8) & 15), str.charAt((i6 >> 4) & 15), str.charAt(i6 & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i6) >> 2, 7), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(i6, number, str, 32);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String toHexString(long j6, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = format.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j6 >> 60) & 15)), str.charAt((int) ((j6 >> 56) & 15)), str.charAt((int) ((j6 >> 52) & 15)), str.charAt((int) ((j6 >> 48) & 15)), str.charAt((int) ((j6 >> 44) & 15)), str.charAt((int) ((j6 >> 40) & 15)), str.charAt((int) ((j6 >> 36) & 15)), str.charAt((int) ((j6 >> 32) & 15)), str.charAt((int) ((j6 >> 28) & 15)), str.charAt((int) ((j6 >> 24) & 15)), str.charAt((int) ((j6 >> 20) & 15)), str.charAt((int) ((j6 >> 16) & 15)), str.charAt((int) ((j6 >> 12) & 15)), str.charAt((int) ((j6 >> 8) & 15)), str.charAt((int) ((j6 >> 4) & 15)), str.charAt((int) (j6 & 15))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt__StringsJVMKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j6) >> 2, 15), 0, 2, null);
            }
            return StringsKt__StringsJVMKt.concatToString(cArr);
        }
        return toHexStringImpl(j6, number, str, 64);
    }
}
