package okio;

import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C1892bw;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2478d;
import p082e3.C2495u;

/* loaded from: classes.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    @NotNull
    private final byte[] data;
    private transient int hashCode;

    @Nullable
    private transient String utf8;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                charset = C2478d.f10082b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = bArr.length;
            }
            return companion.m10008of(bArr, i4, i5);
        }

        @Nullable
        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m10880deprecated_decodeBase64(@NotNull String string) {
            C2769l.m9241e(string, "string");
            return decodeBase64(string);
        }

        @NotNull
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m10881deprecated_decodeHex(@NotNull String string) {
            C2769l.m9241e(string, "string");
            return decodeHex(string);
        }

        @NotNull
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m10882deprecated_encodeString(@NotNull String string, @NotNull Charset charset) {
            C2769l.m9241e(string, "string");
            C2769l.m9241e(charset, "charset");
            return encodeString(string, charset);
        }

        @NotNull
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m10883deprecated_encodeUtf8(@NotNull String string) {
            C2769l.m9241e(string, "string");
            return encodeUtf8(string);
        }

        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m10884deprecated_of(@NotNull ByteBuffer buffer) {
            C2769l.m9241e(buffer, "buffer");
            return m10006of(buffer);
        }

        @NotNull
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m10886deprecated_read(@NotNull InputStream inputstream, int i4) {
            C2769l.m9241e(inputstream, "inputstream");
            return read(inputstream, i4);
        }

        @Nullable
        public final ByteString decodeBase64(@NotNull String decodeBase64) {
            C2769l.m9241e(decodeBase64, "$this$decodeBase64");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(decodeBase64);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        @NotNull
        public final ByteString decodeHex(@NotNull String decodeHex) {
            C2769l.m9241e(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = i4 * 2;
                bArr[i4] = (byte) ((ByteStringKt.decodeHexDigit(decodeHex.charAt(i5)) << 4) + ByteStringKt.decodeHexDigit(decodeHex.charAt(i5 + 1)));
            }
            return new ByteString(bArr);
        }

        @NotNull
        public final ByteString encodeString(@NotNull String encode, @NotNull Charset charset) {
            C2769l.m9241e(encode, "$this$encode");
            C2769l.m9241e(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            C2769l.m9240d(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @NotNull
        public final ByteString encodeUtf8(@NotNull String encodeUtf8) {
            C2769l.m9241e(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(encodeUtf8));
            byteString.setUtf8$okio(encodeUtf8);
            return byteString;
        }

        @NotNull
        /* renamed from: of */
        public final ByteString m10006of(@NotNull ByteBuffer toByteString) {
            C2769l.m9241e(toByteString, "$this$toByteString");
            byte[] bArr = new byte[toByteString.remaining()];
            toByteString.get(bArr);
            return new ByteString(bArr);
        }

        @NotNull
        public final ByteString read(@NotNull InputStream readByteString, int i4) throws IOException {
            C2769l.m9241e(readByteString, "$this$readByteString");
            int i5 = 0;
            if (!(i4 >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + i4).toString());
            }
            byte[] bArr = new byte[i4];
            while (i5 < i4) {
                int i6 = readByteString.read(bArr, i5, i4 - i5);
                if (i6 == -1) {
                    throw new EOFException();
                }
                i5 += i6;
            }
            return new ByteString(bArr);
        }

        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m10885deprecated_of(@NotNull byte[] array, int i4, int i5) {
            C2769l.m9241e(array, "array");
            return m10008of(array, i4, i5);
        }

        @NotNull
        /* renamed from: of */
        public final ByteString m10007of(@NotNull byte... data) {
            C2769l.m9241e(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        @NotNull
        /* renamed from: of */
        public final ByteString m10008of(@NotNull byte[] toByteString, int i4, int i5) {
            C2769l.m9241e(toByteString, "$this$toByteString");
            Util.checkOffsetAndCount(toByteString.length, i4, i5);
            return new ByteString(C2723g.m9085g(toByteString, i4, i5 + i4));
        }
    }

    public ByteString(@NotNull byte[] data) {
        C2769l.m9241e(data, "data");
        this.data = data;
    }

    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return Companion.decodeBase64(str);
    }

    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return Companion.decodeHex(str);
    }

    @NotNull
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return byteString.indexOf(byteString2, i4);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return byteString.indexOf(bArr, i4);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i5 & 2) != 0) {
            i4 = byteString.size();
        }
        return byteString.lastIndexOf(byteString2, i4);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i5 & 2) != 0) {
            i4 = byteString.size();
        }
        return byteString.lastIndexOf(bArr, i4);
    }

    @NotNull
    /* renamed from: of */
    public static final ByteString m10003of(@NotNull ByteBuffer byteBuffer) {
        return Companion.m10006of(byteBuffer);
    }

    @NotNull
    /* renamed from: of */
    public static final ByteString m10004of(@NotNull byte... bArr) {
        return Companion.m10007of(bArr);
    }

    @NotNull
    /* renamed from: of */
    public static final ByteString m10005of(@NotNull byte[] bArr, int i4, int i5) {
        return Companion.m10008of(bArr, i4, i5);
    }

    @NotNull
    public static final ByteString read(@NotNull InputStream inputStream, int i4) throws IOException {
        return Companion.read(inputStream, i4);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field field = ByteString.class.getDeclaredField(Constants.KEY_DATA);
        C2769l.m9240d(field, "field");
        field.setAccessible(true);
        field.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = byteString.size();
        }
        return byteString.substring(i4, i5);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m10878deprecated_getByte(int i4) {
        return getByte(i4);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m10879deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        C2769l.m9240d(byteBufferAsReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    @NotNull
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) {
        C2769l.m9241e(algorithm, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(algorithm).digest(this.data);
        C2769l.m9240d(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(@NotNull ByteString suffix) {
        C2769l.m9241e(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i4) {
        return internalGet$okio(i4);
    }

    @NotNull
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @Nullable
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @NotNull
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i4 = 0;
        for (byte b4 : getData$okio()) {
            int i5 = i4 + 1;
            cArr[i4] = ByteStringKt.getHEX_DIGIT_CHARS()[(b4 >> 4) & 15];
            i4 = i5 + 1;
            cArr[i5] = ByteStringKt.getHEX_DIGIT_CHARS()[b4 & C1892bw.f8538m];
        }
        return new String(cArr);
    }

    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        C2769l.m9241e(algorithm, "algorithm");
        C2769l.m9241e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            C2769l.m9240d(bArrDoFinal, "mac.doFinal(data)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString key) {
        C2769l.m9241e(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString key) {
        C2769l.m9241e(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString key) {
        C2769l.m9241e(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    public final int indexOf(@NotNull ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int indexOf(@NotNull ByteString other, int i4) {
        C2769l.m9241e(other, "other");
        return indexOf(other.internalArray$okio(), i4);
    }

    public final int indexOf(@NotNull byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @NotNull
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i4) {
        return getData$okio()[i4];
    }

    public final int lastIndexOf(@NotNull ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final int lastIndexOf(@NotNull ByteString other, int i4) {
        C2769l.m9241e(other, "other");
        return lastIndexOf(other.internalArray$okio(), i4);
    }

    public final int lastIndexOf(@NotNull byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @NotNull
    public ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i4, @NotNull ByteString other, int i5, int i6) {
        C2769l.m9241e(other, "other");
        return other.rangeEquals(i5, getData$okio(), i4, i6);
    }

    public final void setHashCode$okio(int i4) {
        this.hashCode = i4;
    }

    public final void setUtf8$okio(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @NotNull
    public ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @NotNull
    public ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@NotNull ByteString prefix) {
        C2769l.m9241e(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        C2769l.m9241e(charset, "charset");
        return new String(this.data, charset);
    }

    @NotNull
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @NotNull
    public final ByteString substring(int i4) {
        return substring$default(this, i4, 0, 2, null);
    }

    @NotNull
    public ByteString substring(int i4, int i5) {
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (i5 <= getData$okio().length) {
            if (i5 - i4 >= 0) {
                return (i4 == 0 && i5 == getData$okio().length) ? this : new ByteString(C2723g.m9085g(getData$okio(), i4, i5));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        byte b4;
        for (int i4 = 0; i4 < getData$okio().length; i4++) {
            byte b5 = getData$okio()[i4];
            byte b6 = (byte) 65;
            if (b5 >= b6 && b5 <= (b4 = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b5 + 32);
                for (int i5 = i4 + 1; i5 < bArrCopyOf.length; i5++) {
                    byte b7 = bArrCopyOf[i5];
                    if (b7 >= b6 && b7 <= b4) {
                        bArrCopyOf[i5] = (byte) (b7 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        byte b4;
        for (int i4 = 0; i4 < getData$okio().length; i4++) {
            byte b5 = getData$okio()[i4];
            byte b6 = (byte) 97;
            if (b5 >= b6 && b5 <= (b4 = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i4] = (byte) (b5 - 32);
                for (int i5 = i4 + 1; i5 < bArrCopyOf.length; i5++) {
                    byte b7 = bArrCopyOf[i5];
                    if (b7 >= b6 && b7 <= b4) {
                        bArrCopyOf[i5] = (byte) (b7 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        C2769l.m9240d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    @NotNull
    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = ByteStringKt.codePointIndexToCharIndex(getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            Objects.requireNonNull(strUtf8, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            C2769l.m9240d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strM8353y = C2495u.m8353y(C2495u.m8353y(C2495u.m8353y(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strM8353y + ']';
            }
            return "[size=" + getData$okio().length + " text=" + strM8353y + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(getData$okio().length);
        sb.append(" hex=");
        if (64 <= getData$okio().length) {
            sb.append((64 == getData$okio().length ? this : new ByteString(C2723g.m9085g(getData$okio(), 0, 64))).hex());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    @NotNull
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = Platform.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(@NotNull OutputStream out) throws IOException {
        C2769l.m9241e(out, "out");
        out.write(this.data);
    }

    public void write$okio(@NotNull Buffer buffer, int i4, int i5) {
        C2769l.m9241e(buffer, "buffer");
        ByteStringKt.commonWrite(this, buffer, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C2769l.m9241e(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(@NotNull byte[] suffix) {
        C2769l.m9241e(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public int indexOf(@NotNull byte[] other, int i4) {
        C2769l.m9241e(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i4, 0);
        if (iMax <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public int lastIndexOf(@NotNull byte[] other, int i4) {
        C2769l.m9241e(other, "other");
        for (int iMin = Math.min(i4, getData$okio().length - other.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean rangeEquals(int i4, @NotNull byte[] other, int i5, int i6) {
        C2769l.m9241e(other, "other");
        return i4 >= 0 && i4 <= getData$okio().length - i6 && i5 >= 0 && i5 <= other.length - i6 && Util.arrayRangeEquals(getData$okio(), i4, other, i5, i6);
    }

    public final boolean startsWith(@NotNull byte[] prefix) {
        C2769l.m9241e(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }
}
