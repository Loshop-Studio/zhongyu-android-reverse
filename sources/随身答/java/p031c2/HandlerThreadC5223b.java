package p031c2;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.stormdzh.lame4android.Lame;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c2.b */
/* loaded from: classes4.dex */
public class HandlerThreadC5223b extends HandlerThread implements AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: a */
    public a f2453a;

    /* renamed from: b */
    public byte[] f2454b;

    /* renamed from: c */
    public FileOutputStream f2455c;

    /* renamed from: d */
    public List f2456d;

    /* renamed from: c2.b$a */
    public static class a extends Handler {

        /* renamed from: a */
        public HandlerThreadC5223b f2457a;

        public a(Looper looper, HandlerThreadC5223b handlerThreadC5223b) {
            super(looper);
            this.f2457a = handlerThreadC5223b;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            if (message.what == 1) {
                while (this.f2457a.m2334g() > 0) {
                }
                removeCallbacksAndMessages(null);
                this.f2457a.m2333f();
                getLooper().quit();
            }
        }
    }

    /* renamed from: c2.b$b */
    public class b {

        /* renamed from: a */
        public short[] f2458a;

        /* renamed from: b */
        public int f2459b;

        public b(short[] sArr, int i9) {
            this.f2458a = (short[]) sArr.clone();
            this.f2459b = i9;
        }

        /* renamed from: a */
        public short[] m2335a() {
            return this.f2458a;
        }

        /* renamed from: b */
        public int m2336b() {
            return this.f2459b;
        }
    }

    public HandlerThreadC5223b(File file, int i9) {
        super("DataEncodeThread");
        this.f2456d = Collections.synchronizedList(new ArrayList());
        this.f2455c = new FileOutputStream(file);
        this.f2454b = new byte[(int) ((i9 * 2 * 1.25d) + 7200.0d)];
    }

    /* renamed from: b */
    public a m2330b() {
        m2332e();
        return this.f2453a;
    }

    /* renamed from: c */
    public void m2331c(short[] sArr, int i9) {
        this.f2456d.add(new b(sArr, i9));
    }

    /* renamed from: e */
    public final void m2332e() {
        if (this.f2453a == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0028 -> B:33:0x002b). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public final void m2333f() throws IOException {
        int iFlush = Lame.flush(this.f2454b);
        try {
            try {
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (iFlush > 0) {
                try {
                    this.f2455c.write(this.f2454b, 0, iFlush);
                    FileOutputStream fileOutputStream = this.f2455c;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                    FileOutputStream fileOutputStream2 = this.f2455c;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                }
                Lame.close();
            }
            this.f2456d.clear();
        } catch (Throwable th) {
            FileOutputStream fileOutputStream3 = this.f2455c;
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            Lame.close();
            throw th;
        }
    }

    /* renamed from: g */
    public final int m2334g() throws IOException {
        if (this.f2456d.size() <= 0) {
            return 0;
        }
        b bVar = (b) this.f2456d.remove(0);
        short[] sArrM2335a = bVar.m2335a();
        int iM2336b = bVar.m2336b();
        int iEncode = Lame.encode(sArrM2335a, sArrM2335a, iM2336b, this.f2454b);
        if (iEncode > 0) {
            try {
                this.f2455c.write(this.f2454b, 0, iEncode);
                return iM2336b;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return iM2336b;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(AudioRecord audioRecord) throws IOException {
        m2334g();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        this.f2453a = new a(getLooper(), this);
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(AudioRecord audioRecord) {
    }
}
