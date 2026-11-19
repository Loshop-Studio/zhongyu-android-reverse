package anet.channel.bytes;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: anet.channel.bytes.a */
/* loaded from: classes.dex */
public class C0860a {
    public static final int MAX_POOL_SIZE = 524288;
    public static final String TAG = "awcn.ByteArrayPool";

    /* renamed from: a */
    private final TreeSet<ByteArray> f5068a = new TreeSet<>();

    /* renamed from: b */
    private final ByteArray f5069b = ByteArray.create(0);

    /* renamed from: c */
    private final Random f5070c = new Random();

    /* renamed from: d */
    private long f5071d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: anet.channel.bytes.a$a */
    public static class a {

        /* renamed from: a */
        public static C0860a f5072a = new C0860a();

        a() {
        }
    }

    /* renamed from: a */
    public synchronized void m4386a(ByteArray byteArray) {
        if (byteArray != null) {
            int i4 = byteArray.bufferLength;
            if (i4 < 524288) {
                this.f5071d += i4;
                this.f5068a.add(byteArray);
                while (this.f5071d > PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.f5071d -= (this.f5070c.nextBoolean() ? this.f5068a.pollFirst() : this.f5068a.pollLast()).bufferLength;
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized ByteArray m4384a(int i4) {
        if (i4 >= 524288) {
            return ByteArray.create(i4);
        }
        ByteArray byteArray = this.f5069b;
        byteArray.bufferLength = i4;
        ByteArray byteArrayCeiling = this.f5068a.ceiling(byteArray);
        if (byteArrayCeiling == null) {
            byteArrayCeiling = ByteArray.create(i4);
        } else {
            Arrays.fill(byteArrayCeiling.buffer, (byte) 0);
            byteArrayCeiling.dataLength = 0;
            this.f5068a.remove(byteArrayCeiling);
            this.f5071d -= byteArrayCeiling.bufferLength;
        }
        return byteArrayCeiling;
    }

    /* renamed from: a */
    public ByteArray m4385a(byte[] bArr, int i4) {
        ByteArray byteArrayM4384a = m4384a(i4);
        System.arraycopy(bArr, 0, byteArrayM4384a.buffer, 0, i4);
        byteArrayM4384a.dataLength = i4;
        return byteArrayM4384a;
    }
}
