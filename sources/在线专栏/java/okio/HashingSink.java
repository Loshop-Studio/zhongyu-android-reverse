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
public final class HashingSink extends ForwardingSink {
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
        public final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString key) {
            C2769l.m9241e(sink, "sink");
            C2769l.m9241e(key, "key");
            return new HashingSink(sink, key, "HmacSHA1");
        }

        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString key) {
            C2769l.m9241e(sink, "sink");
            C2769l.m9241e(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString key) {
            C2769l.m9241e(sink, "sink");
            C2769l.m9241e(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        @NotNull
        public final HashingSink md5(@NotNull Sink sink) {
            C2769l.m9241e(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        @NotNull
        public final HashingSink sha1(@NotNull Sink sink) {
            C2769l.m9241e(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        @NotNull
        public final HashingSink sha256(@NotNull Sink sink) {
            C2769l.m9241e(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @NotNull
        public final HashingSink sha512(@NotNull Sink sink) {
            C2769l.m9241e(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull String algorithm) {
        super(sink);
        C2769l.m9241e(sink, "sink");
        C2769l.m9241e(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    @NotNull
    public static final HashingSink md5(@NotNull Sink sink) {
        return Companion.md5(sink);
    }

    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink) {
        return Companion.sha1(sink);
    }

    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink) {
        return Companion.sha256(sink);
    }

    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink) {
        return Companion.sha512(sink);
    }

    @NotNull
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m10891deprecated_hash() {
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

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j4) throws IllegalStateException, IOException {
        C2769l.m9241e(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j4);
        Segment segment = source.head;
        C2769l.m9239c(segment);
        long j5 = 0;
        while (j5 < j4) {
            int iMin = (int) Math.min(j4 - j5, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                C2769l.m9239c(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j5 += iMin;
            segment = segment.next;
            C2769l.m9239c(segment);
        }
        super.write(source, j4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull ByteString key, @NotNull String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        super(sink);
        C2769l.m9241e(sink, "sink");
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
