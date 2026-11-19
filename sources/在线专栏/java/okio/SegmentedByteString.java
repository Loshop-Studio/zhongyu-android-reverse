package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2769l;
import okio.internal.SegmentedByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class SegmentedByteString extends ByteString {

    @NotNull
    private final transient int[] directory;

    @NotNull
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(ByteString.EMPTY.getData$okio());
        C2769l.m9241e(segments, "segments");
        C2769l.m9241e(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        Objects.requireNonNull(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        C2769l.m9240d(byteBufferAsReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @NotNull
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    @NotNull
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) throws NoSuchAlgorithmException {
        C2769l.m9241e(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = getDirectory$okio()[length + i4];
            int i7 = getDirectory$okio()[i4];
            messageDigest.update(getSegments$okio()[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
        byte[] bArrDigest = messageDigest.digest();
        C2769l.m9240d(bArrDigest, "digest.digest()");
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] getDirectory$okio() {
        return this.directory;
    }

    @NotNull
    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int i7 = getDirectory$okio()[length + i4];
            int i8 = getDirectory$okio()[i4];
            byte[] bArr = getSegments$okio()[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        setHashCode$okio(i5);
        return i5;
    }

    @Override // okio.ByteString
    @NotNull
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        C2769l.m9241e(algorithm, "algorithm");
        C2769l.m9241e(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = getDirectory$okio()[length + i4];
                int i7 = getDirectory$okio()[i4];
                mac.update(getSegments$okio()[i4], i6, i7 - i5);
                i4++;
                i5 = i7;
            }
            byte[] bArrDoFinal = mac.doFinal();
            C2769l.m9240d(bArrDoFinal, "mac.doFinal()");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@NotNull byte[] other, int i4) {
        C2769l.m9241e(other, "other");
        return toByteString().indexOf(other, i4);
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i4) {
        Util.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i4, 1L);
        int iSegment = SegmentedByteStringKt.segment(this, i4);
        return getSegments$okio()[iSegment][(i4 - (iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1])) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@NotNull byte[] other, int i4) {
        C2769l.m9241e(other, "other");
        return toByteString().lastIndexOf(other, i4);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i4, @NotNull ByteString other, int i5, int i6) {
        C2769l.m9241e(other, "other");
        if (i4 < 0 || i4 > size() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iSegment = SegmentedByteStringKt.segment(this, i4);
        while (i4 < i7) {
            int i8 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i9 = getDirectory$okio()[iSegment] - i8;
            int i10 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!other.rangeEquals(i5, getSegments$okio()[iSegment], i10 + (i4 - i8), iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset) {
        C2769l.m9241e(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString substring(int i4, int i5) {
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i4 + " < 0").toString());
        }
        if (!(i5 <= size())) {
            throw new IllegalArgumentException(("endIndex=" + i5 + " > length(" + size() + ')').toString());
        }
        int i6 = i5 - i4;
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + i5 + " < beginIndex=" + i4).toString());
        }
        if (i4 == 0 && i5 == size()) {
            return this;
        }
        if (i4 == i5) {
            return ByteString.EMPTY;
        }
        int iSegment = SegmentedByteStringKt.segment(this, i4);
        int iSegment2 = SegmentedByteStringKt.segment(this, i5 - 1);
        byte[][] bArr = (byte[][]) C2723g.m9086h(getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i7 = iSegment;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(getDirectory$okio()[i7] - i4, i6);
                int i9 = i8 + 1;
                iArr[i8 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i7];
                if (i7 == iSegment2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iSegment != 0 ? getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i4 - i10);
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = getDirectory$okio()[length + i4];
            int i8 = getDirectory$okio()[i4];
            int i9 = i8 - i5;
            C2723g.m9081c(getSegments$okio()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @NotNull
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(@NotNull OutputStream out) throws IOException {
        C2769l.m9241e(out, "out");
        int length = getSegments$okio().length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = getDirectory$okio()[length + i4];
            int i7 = getDirectory$okio()[i4];
            out.write(getSegments$okio()[i4], i6, i7 - i5);
            i4++;
            i5 = i7;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@NotNull Buffer buffer, int i4, int i5) {
        C2769l.m9241e(buffer, "buffer");
        int i6 = i5 + i4;
        int iSegment = SegmentedByteStringKt.segment(this, i4);
        while (i4 < i6) {
            int i7 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i8 = getDirectory$okio()[iSegment] - i7;
            int i9 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i6, i8 + i7) - i4;
            int i10 = i9 + (i4 - i7);
            Segment segment = new Segment(getSegments$okio()[iSegment], i10, i10 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                C2769l.m9239c(segment2);
                Segment segment3 = segment2.prev;
                C2769l.m9239c(segment3);
                segment3.push(segment);
            }
            i4 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + size());
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i4, @NotNull byte[] other, int i5, int i6) {
        C2769l.m9241e(other, "other");
        if (i4 < 0 || i4 > size() - i6 || i5 < 0 || i5 > other.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iSegment = SegmentedByteStringKt.segment(this, i4);
        while (i4 < i7) {
            int i8 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i9 = getDirectory$okio()[iSegment] - i8;
            int i10 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!Util.arrayRangeEquals(getSegments$okio()[iSegment], i10 + (i4 - i8), other, i5, iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iSegment++;
        }
        return true;
    }
}
