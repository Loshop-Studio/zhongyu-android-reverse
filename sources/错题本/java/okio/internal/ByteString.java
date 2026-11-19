package okio.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010 \u001a4\u0010$\u001a\u00020#*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u00002\u0006\u0010&\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b'\u0010)\u001a\u001c\u0010+\u001a\u00020\u001d*\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b+\u0010(\u001a\u001c\u0010+\u001a\u00020\u001d*\u00020\u00002\u0006\u0010*\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b+\u0010)\u001a$\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b-\u0010.\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u00100\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u0010.\u001a\u001e\u00102\u001a\u00020\u001d*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u000101H\u0080\b¢\u0006\u0004\b2\u00103\u001a\u0014\u00104\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u0010\u0014\u001a\u001c\u00105\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0018\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b8\u00109\u001a$\u0010:\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b:\u0010;\u001a\u0014\u0010<\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u0016\u0010>\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b>\u0010=\u001a+\u0010A\u001a\u00020#*\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\bC\u0010\u0003\u001a\u001f\u0010F\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\nH\u0002¢\u0006\u0004\bF\u0010G\"\u001a\u0010I\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, m5110d2 = {"Lokio/ByteString;", "", "commonUtf8", "(Lokio/ByteString;)Ljava/lang/String;", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "commonToAsciiUppercase", "", "beginIndex", "endIndex", "commonSubstring", "(Lokio/ByteString;II)Lokio/ByteString;", "pos", "", "commonGetByte", "(Lokio/ByteString;I)B", "commonGetSize", "(Lokio/ByteString;)I", "", "commonToByteArray", "(Lokio/ByteString;)[B", "commonInternalArray", TypedValues.CycleType.S_WAVE_OFFSET, "other", "otherOffset", "byteCount", "", "commonRangeEquals", "(Lokio/ByteString;ILokio/ByteString;II)Z", "(Lokio/ByteString;I[BII)Z", TypedValues.AttributesType.S_TARGET, "targetOffset", "Ld6/s;", "commonCopyInto", "(Lokio/ByteString;I[BII)V", RequestParameters.PREFIX, "commonStartsWith", "(Lokio/ByteString;Lokio/ByteString;)Z", "(Lokio/ByteString;[B)Z", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "(Lokio/ByteString;[BI)I", "commonLastIndexOf", "(Lokio/ByteString;Lokio/ByteString;I)I", "", "commonEquals", "(Lokio/ByteString;Ljava/lang/Object;)Z", "commonHashCode", "commonCompareTo", "(Lokio/ByteString;Lokio/ByteString;)I", "data", "commonOf", "([B)Lokio/ByteString;", "commonToByteString", "([BII)Lokio/ByteString;", "commonEncodeUtf8", "(Ljava/lang/String;)Lokio/ByteString;", "commonDecodeBase64", "Lokio/Buffer;", "buffer", "commonWrite", "(Lokio/ByteString;Lokio/Buffer;II)V", "commonToString", "s", "codePointCount", "codePointIndexToCharIndex", "([BI)I", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-ByteString")
@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,342:1\n129#1,2:348\n131#1,9:351\n67#2:343\n73#2:344\n73#2:346\n73#2:347\n67#2:375\n73#2:387\n1#3:345\n1#3:350\n212#4,7:360\n122#4:367\n219#4,5:368\n122#4:373\n226#4:374\n228#4:376\n397#4,2:377\n122#4:379\n400#4,6:380\n127#4:386\n406#4:388\n122#4:389\n407#4,13:390\n122#4:403\n422#4:404\n122#4:405\n425#4:406\n230#4,3:407\n440#4,3:410\n122#4:413\n443#4:414\n127#4:415\n446#4,10:416\n127#4:426\n456#4:427\n122#4:428\n457#4,4:429\n127#4:433\n461#4:434\n122#4:435\n462#4,14:436\n122#4:450\n477#4,2:451\n122#4:453\n481#4:454\n122#4:455\n484#4:456\n234#4,3:457\n500#4,3:460\n122#4:463\n503#4:464\n127#4:465\n506#4,2:466\n127#4:468\n510#4,10:469\n127#4:479\n520#4:480\n122#4:481\n521#4,4:482\n127#4:486\n525#4:487\n122#4:488\n526#4,4:489\n127#4:493\n530#4:494\n122#4:495\n531#4,15:496\n122#4:511\n547#4,2:512\n122#4:514\n550#4,2:515\n122#4:517\n554#4:518\n122#4:519\n557#4:520\n241#4:521\n122#4:522\n242#4,5:523\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n308#1:348,2\n308#1:351,9\n65#1:343\n66#1:344\n256#1:346\n257#1:347\n327#1:375\n327#1:387\n308#1:350\n327#1:360,7\n332#1:367\n327#1:368,5\n332#1:373\n327#1:374\n327#1:376\n327#1:377,2\n332#1:379\n327#1:380,6\n327#1:386\n327#1:388\n332#1:389\n327#1:390,13\n332#1:403\n327#1:404\n332#1:405\n327#1:406\n327#1:407,3\n327#1:410,3\n332#1:413\n327#1:414\n327#1:415\n327#1:416,10\n327#1:426\n327#1:427\n332#1:428\n327#1:429,4\n327#1:433\n327#1:434\n332#1:435\n327#1:436,14\n332#1:450\n327#1:451,2\n332#1:453\n327#1:454\n332#1:455\n327#1:456\n327#1:457,3\n327#1:460,3\n332#1:463\n327#1:464\n327#1:465\n327#1:466,2\n327#1:468\n327#1:469,10\n327#1:479\n327#1:480\n332#1:481\n327#1:482,4\n327#1:486\n327#1:487\n332#1:488\n327#1:489,4\n327#1:493\n327#1:494\n332#1:495\n327#1:496,15\n332#1:511\n327#1:512,2\n332#1:514\n327#1:515,2\n332#1:517\n327#1:518\n332#1:519\n327#1:520\n327#1:521\n332#1:522\n327#1:523,5\n*E\n"})
/* renamed from: okio.internal.-ByteString, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ByteString {

    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    @NotNull
    public static final String commonBase64(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull okio.ByteString byteString, @NotNull okio.ByteString other) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        int size = byteString.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int i8 = byteString.getByte(i) & 255;
            int i9 = other.getByte(i) & 255;
            if (i8 != i9) {
                return i8 < i9 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(@NotNull okio.ByteString byteString, int i, @NotNull byte[] target, int i8, int i9) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(target, "target");
        AbstractC5802q.m5213z(byteString.getData(), i8, target, i, i9 + i);
    }

    @Nullable
    public static final okio.ByteString commonDecodeBase64(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<this>");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final okio.ByteString commonEncodeUtf8(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull okio.ByteString byteString, @NotNull okio.ByteString suffix) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEquals(@NotNull okio.ByteString byteString, @Nullable Object obj) {
        AbstractC5830k.m5330g(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData().length && byteString2.rangeEquals(0, byteString.getData(), 0, byteString.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull okio.ByteString byteString, int i) {
        AbstractC5830k.m5330g(byteString, "<this>");
        return byteString.getData()[i];
    }

    public static final int commonGetSize(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        return byteString.getData().length;
    }

    public static final int commonHashCode(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        int hashCode = byteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(byteString.getData());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        char[] cArr = new char[byteString.getData().length * 2];
        int i = 0;
        for (byte b6 : byteString.getData()) {
            int i8 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b6 >> 4) & 15];
            i += 2;
            cArr[i8] = getHEX_DIGIT_CHARS()[b6 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull okio.ByteString byteString, @NotNull byte[] other, int i) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        int length = byteString.getData().length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        return byteString.getData();
    }

    public static final int commonLastIndexOf(@NotNull okio.ByteString byteString, @NotNull okio.ByteString other, int i) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        return byteString.lastIndexOf(other.internalArray$okio(), i);
    }

    @NotNull
    public static final okio.ByteString commonOf(@NotNull byte[] data) {
        AbstractC5830k.m5330g(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
        return new okio.ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(@NotNull okio.ByteString byteString, int i, @NotNull okio.ByteString other, int i8, int i9) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        return other.rangeEquals(i8, byteString.getData(), i, i9);
    }

    public static final boolean commonStartsWith(@NotNull okio.ByteString byteString, @NotNull okio.ByteString prefix) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.size());
    }

    @NotNull
    public static final okio.ByteString commonSubstring(@NotNull okio.ByteString byteString, int i, int i8) {
        AbstractC5830k.m5330g(byteString, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i8);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iResolveDefaultParameter > byteString.getData().length) {
            throw new IllegalArgumentException(AbstractC0037f.m88m(new StringBuilder("endIndex > length("), byteString.getData().length, ')').toString());
        }
        if (iResolveDefaultParameter - i >= 0) {
            return (i == 0 && iResolveDefaultParameter == byteString.getData().length) ? byteString : new okio.ByteString(AbstractC5802q.m5183J(byteString.getData(), i, iResolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    @NotNull
    public static final okio.ByteString commonToAsciiLowercase(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b6 = byteString.getData()[i];
            if (b6 >= 65 && b6 <= 90) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b6 + 32);
                for (int i8 = i + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b9 = bArrCopyOf[i8];
                    if (b9 >= 65 && b9 <= 90) {
                        bArrCopyOf[i8] = (byte) (b9 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final okio.ByteString commonToAsciiUppercase(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        for (int i = 0; i < byteString.getData().length; i++) {
            byte b6 = byteString.getData()[i];
            if (b6 >= 97 && b6 <= 122) {
                byte[] data = byteString.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b6 - 32);
                for (int i8 = i + 1; i8 < bArrCopyOf.length; i8++) {
                    byte b9 = bArrCopyOf[i8];
                    if (b9 >= 97 && b9 <= 122) {
                        bArrCopyOf[i8] = (byte) (b9 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        byte[] data = byteString.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC5830k.m5329f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    public static final okio.ByteString commonToByteString(@NotNull byte[] bArr, int i, int i8) {
        AbstractC5830k.m5330g(bArr, "<this>");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i8);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i, iResolveDefaultParameter);
        return new okio.ByteString(AbstractC5802q.m5183J(bArr, i, iResolveDefaultParameter + i));
    }

    @NotNull
    public static final String commonToString(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
            String strM5407A = AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(strSubstring, "\\", "\\\\"), SignParameters.NEW_LINE, "\\n"), "\r", "\\r");
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return AbstractC1923c.m1047k(']', "[text=", strM5407A);
            }
            return "[size=" + byteString.getData().length + " text=" + strM5407A + "…]";
        }
        if (byteString.getData().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(byteString.getData().length);
        sb.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData().length) {
            throw new IllegalArgumentException(AbstractC0037f.m88m(new StringBuilder("endIndex > length("), byteString.getData().length, ')').toString());
        }
        if (iResolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iResolveDefaultParameter != byteString.getData().length) {
            byteString = new okio.ByteString(AbstractC5802q.m5183J(byteString.getData(), 0, iResolveDefaultParameter));
        }
        sb.append(byteString.hex());
        sb.append("…]");
        return sb.toString();
    }

    @NotNull
    public static final String commonUtf8(@NotNull okio.ByteString byteString) {
        AbstractC5830k.m5330g(byteString, "<this>");
        String utf8 = byteString.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull okio.ByteString byteString, @NotNull Buffer buffer, int i, int i8) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(buffer, "buffer");
        buffer.write(byteString.getData(), i, i8);
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonEndsWith(@NotNull okio.ByteString byteString, @NotNull byte[] suffix) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(suffix, "suffix");
        return byteString.rangeEquals(byteString.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final int commonLastIndexOf(@NotNull okio.ByteString byteString, @NotNull byte[] other, int i) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(@NotNull okio.ByteString byteString, int i, @NotNull byte[] other, int i8, int i9) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(other, "other");
        return i >= 0 && i <= byteString.getData().length - i9 && i8 >= 0 && i8 <= other.length - i9 && SegmentedByteString.arrayRangeEquals(byteString.getData(), i, other, i8, i9);
    }

    public static final boolean commonStartsWith(@NotNull okio.ByteString byteString, @NotNull byte[] prefix) {
        AbstractC5830k.m5330g(byteString, "<this>");
        AbstractC5830k.m5330g(prefix, "prefix");
        return byteString.rangeEquals(0, prefix, 0, prefix.length);
    }
}
