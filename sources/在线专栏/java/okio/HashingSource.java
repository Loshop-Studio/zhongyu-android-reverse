package okio;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p128o2.C2925r;

/* loaded from: classes.dex */
public final class HashingSource extends ForwardingSource {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString key) {
            C2769l.m9241e(source, "source");
            C2769l.m9241e(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString key) {
            C2769l.m9241e(source, "source");
            C2769l.m9241e(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString key) {
            C2769l.m9241e(source, "source");
            C2769l.m9241e(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        @NotNull
        public final HashingSource md5(@NotNull Source source) {
            C2769l.m9241e(source, "source");
            return new HashingSource(source, "MD5");
        }

        @NotNull
        public final HashingSource sha1(@NotNull Source source) {
            C2769l.m9241e(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        @NotNull
        public final HashingSource sha256(@NotNull Source source) {
            C2769l.m9241e(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        @NotNull
        public final HashingSource sha512(@NotNull Source source) {
            C2769l.m9241e(source, "source");
            return new HashingSource(source, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull String algorithm) {
        super(source);
        C2769l.m9241e(source, "source");
        C2769l.m9241e(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    @NotNull
    public static final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    @NotNull
    public static final HashingSource md5(@NotNull Source source) {
        return Companion.md5(source);
    }

    @NotNull
    public static final HashingSource sha1(@NotNull Source source) {
        return Companion.sha1(source);
    }

    @NotNull
    public static final HashingSource sha256(@NotNull Source source) {
        return Companion.sha256(source);
    }

    @NotNull
    public static final HashingSource sha512(@NotNull Source source) {
        return Companion.sha512(source);
    }

    @NotNull
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m10892deprecated_hash() {
        return hash();
    }

    @NotNull
    public final ByteString hash() throws IllegalStateException {
        byte[] result;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            C2769l.m9239c(mac);
            result = mac.doFinal();
        }
        C2769l.m9240d(result, "result");
        return new ByteString(result);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long j4) throws IllegalStateException, IOException {
        C2769l.m9241e(sink, "sink");
        long j5 = super.read(sink, j4);
        if (j5 != -1) {
            long size = sink.size() - j5;
            long size2 = sink.size();
            Segment segment = sink.head;
            C2769l.m9239c(segment);
            while (size2 > size) {
                segment = segment.prev;
                C2769l.m9239c(segment);
                size2 -= segment.limit - segment.pos;
            }
            while (size2 < sink.size()) {
                int i4 = (int) ((segment.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i4, segment.limit - i4);
                } else {
                    Mac mac = this.mac;
                    C2769l.m9239c(mac);
                    mac.update(segment.data, i4, segment.limit - i4);
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                C2769l.m9239c(segment);
                size = size2;
            }
        }
        return j5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull ByteString key, @NotNull String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        super(source);
        C2769l.m9241e(source, "source");
        C2769l.m9241e(key, "key");
        C2769l.m9241e(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            C2925r c2925r = C2925r.f11415a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
