package anet.channel.bytes;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: anet.channel.bytes.a */
/* loaded from: classes3.dex */
public class C4983a {
    public static final int MAX_POOL_SIZE = 524288;
    public static final String TAG = "awcn.ByteArrayPool";

    /* renamed from: a */
    private final TreeSet<ByteArray> f2346a = new TreeSet<>();

    /* renamed from: b */
    private final ByteArray f2347b = ByteArray.create(0);

    /* renamed from: c */
    private final Random f2348c = new Random();

    /* renamed from: d */
    private long f2349d = 0;

    /* renamed from: anet.channel.bytes.a$a */
    public static class a {

        /* renamed from: a */
        public static C4983a f2350a = new C4983a();
    }

    /* renamed from: a */
    public synchronized void m2277a(ByteArray byteArray) {
        if (byteArray != null) {
            try {
                int i10 = byteArray.bufferLength;
                if (i10 < 524288) {
                    this.f2349d += i10;
                    this.f2346a.add(byteArray);
                    while (this.f2349d > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                        this.f2349d -= (this.f2348c.nextBoolean() ? this.f2346a.pollFirst() : this.f2346a.pollLast()).bufferLength;
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public synchronized ByteArray m2275a(int i10) {
        if (i10 >= 524288) {
            return ByteArray.create(i10);
        }
        ByteArray byteArray = this.f2347b;
        byteArray.bufferLength = i10;
        ByteArray byteArrayCeiling = this.f2346a.ceiling(byteArray);
        if (byteArrayCeiling == null) {
            byteArrayCeiling = ByteArray.create(i10);
        } else {
            Arrays.fill(byteArrayCeiling.buffer, (byte) 0);
            byteArrayCeiling.dataLength = 0;
            this.f2346a.remove(byteArrayCeiling);
            this.f2349d -= byteArrayCeiling.bufferLength;
        }
        return byteArrayCeiling;
    }

    /* renamed from: a */
    public ByteArray m2276a(byte[] bArr, int i10) {
        ByteArray byteArrayM2275a = m2275a(i10);
        System.arraycopy(bArr, 0, byteArrayM2275a.buffer, 0, i10);
        byteArrayM2275a.dataLength = i10;
        return byteArrayM2275a;
    }
}
