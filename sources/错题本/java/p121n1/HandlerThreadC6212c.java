package p121n1;

import android.media.AudioRecord;
import android.os.HandlerThread;
import com.blankj.utilcode.util.HandlerC3388h;
import com.stormdzh.lame4android.Lame;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: n1.c */
/* loaded from: classes3.dex */
public final class HandlerThreadC6212c extends HandlerThread implements AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: a */
    public HandlerC3388h f9940a;

    /* renamed from: b */
    public byte[] f9941b;

    /* renamed from: c */
    public FileOutputStream f9942c;

    /* renamed from: d */
    public List f9943d;

    /* renamed from: a */
    public final int m5848a() throws IOException {
        byte[] bArr = this.f9941b;
        List list = this.f9943d;
        if (list.size() <= 0) {
            return 0;
        }
        C6211b c6211b = (C6211b) list.remove(0);
        short[] sArr = c6211b.f9938a;
        int i = c6211b.f9939b;
        int iEncode = Lame.encode(sArr, sArr, i, bArr);
        if (iEncode > 0) {
            try {
                this.f9942c.write(bArr, 0, iEncode);
                return i;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onPeriodicNotification(AudioRecord audioRecord) throws IOException {
        m5848a();
    }

    @Override // java.lang.Thread
    public final synchronized void start() {
        super.start();
        HandlerC3388h handlerC3388h = new HandlerC3388h(getLooper());
        handlerC3388h.f2163b = this;
        this.f9940a = handlerC3388h;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public final void onMarkerReached(AudioRecord audioRecord) {
    }
}
