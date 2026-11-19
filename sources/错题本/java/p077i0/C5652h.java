package p077i0;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p202y.InterfaceC6761d;
import p208z.InterfaceC6802g;

/* renamed from: i0.h */
/* loaded from: classes2.dex */
public final class C5652h implements InterfaceC5653i, InterfaceC6761d, InterfaceC6802g {

    /* renamed from: a */
    public final /* synthetic */ int f8790a;

    /* renamed from: b */
    public final ByteBuffer f8791b;

    public C5652h(int i) {
        this.f8790a = i;
        switch (i) {
            case 2:
                this.f8791b = ByteBuffer.allocate(4);
                break;
            default:
                this.f8791b = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // p202y.InterfaceC6761d
    /* renamed from: b */
    public void mo4975b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f8790a) {
            case 1:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f8791b) {
                    this.f8791b.position(0);
                    messageDigest.update(this.f8791b.putLong(l.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f8791b) {
                    this.f8791b.position(0);
                    messageDigest.update(this.f8791b.putInt(num.intValue()).array());
                }
                return;
        }
    }

    @Override // p208z.InterfaceC6802g
    /* renamed from: c */
    public Object mo4976c() {
        ByteBuffer byteBuffer = this.f8791b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p077i0.InterfaceC5653i
    /* renamed from: f */
    public int mo4977f() {
        return (mo4978u() << 8) | mo4978u();
    }

    @Override // p077i0.InterfaceC5653i
    public long skip(long j7) {
        ByteBuffer byteBuffer = this.f8791b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j7);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // p077i0.InterfaceC5653i
    /* renamed from: u */
    public short mo4978u() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f8791b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    public C5652h(ByteBuffer byteBuffer, int i) {
        this.f8790a = i;
        switch (i) {
            case 3:
                this.f8791b = byteBuffer;
                break;
            default:
                this.f8791b = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // p208z.InterfaceC6802g
    /* renamed from: a */
    public void mo4974a() {
    }
}
