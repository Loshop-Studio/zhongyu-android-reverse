package okio;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

/* loaded from: classes6.dex */
public final class HashingSource extends ForwardingSource implements Source {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final HashingSource hmacSha1(Source source, ByteString key) {
            AbstractC9979u.m20294g(source, "source");
            AbstractC9979u.m20294g(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        public final HashingSource hmacSha256(Source source, ByteString key) {
            AbstractC9979u.m20294g(source, "source");
            AbstractC9979u.m20294g(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        public final HashingSource hmacSha512(Source source, ByteString key) {
            AbstractC9979u.m20294g(source, "source");
            AbstractC9979u.m20294g(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        public final HashingSource md5(Source source) {
            AbstractC9979u.m20294g(source, "source");
            return new HashingSource(source, "MD5");
        }

        public final HashingSource sha1(Source source) {
            AbstractC9979u.m20294g(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        public final HashingSource sha256(Source source) {
            AbstractC9979u.m20294g(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        public final HashingSource sha512(Source source) {
            AbstractC9979u.m20294g(source, "source");
            return new HashingSource(source, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, MessageDigest digest) {
        super(source);
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
    }

    @InterfaceC10770a
    /* renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m34184deprecated_hash() {
        return hash();
    }

    public final ByteString hash() throws IllegalStateException {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            AbstractC9979u.m20291d(mac);
            bArrDoFinal = mac.doFinal();
        }
        AbstractC9979u.m20291d(bArrDoFinal);
        return new ByteString(bArrDoFinal);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(Buffer sink, long j10) throws IllegalStateException {
        AbstractC9979u.m20294g(sink, "sink");
        long j11 = super.read(sink, j10);
        if (j11 != -1) {
            long size = sink.size() - j11;
            long size2 = sink.size();
            Segment segment = sink.head;
            AbstractC9979u.m20291d(segment);
            while (size2 > size) {
                segment = segment.prev;
                AbstractC9979u.m20291d(segment);
                size2 -= segment.limit - segment.pos;
            }
            while (size2 < sink.size()) {
                int i10 = (int) ((segment.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    Mac mac = this.mac;
                    AbstractC9979u.m20291d(mac);
                    mac.update(segment.data, i10, segment.limit - i10);
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC9979u.m20291d(segment);
                size = size2;
            }
        }
        return j11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, String algorithm) throws NoSuchAlgorithmException {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        AbstractC9979u.m20293f(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, Mac mac) {
        super(source);
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, ByteString key, String algorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            C10786q c10786q = C10786q.f26013a;
            AbstractC9979u.m20291d(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
