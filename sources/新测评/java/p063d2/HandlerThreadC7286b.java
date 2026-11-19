package p063d2;

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

/* renamed from: d2.b */
/* loaded from: classes4.dex */
public class HandlerThreadC7286b extends HandlerThread implements AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: a */
    public a f11752a;

    /* renamed from: b */
    public byte[] f11753b;

    /* renamed from: c */
    public FileOutputStream f11754c;

    /* renamed from: d */
    public List f11755d;

    /* renamed from: d2.b$a */
    public static class a extends Handler {

        /* renamed from: a */
        public HandlerThreadC7286b f11756a;

        public a(Looper looper, HandlerThreadC7286b handlerThreadC7286b) {
            super(looper);
            this.f11756a = handlerThreadC7286b;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            if (message.what == 1) {
                while (this.f11756a.m11571g() > 0) {
                }
                removeCallbacksAndMessages(null);
                this.f11756a.m11570f();
                getLooper().quit();
            }
        }
    }

    /* renamed from: d2.b$b */
    public class b {

        /* renamed from: a */
        public short[] f11757a;

        /* renamed from: b */
        public int f11758b;

        public b(short[] sArr, int i10) {
            this.f11757a = (short[]) sArr.clone();
            this.f11758b = i10;
        }

        /* renamed from: a */
        public short[] m11572a() {
            return this.f11757a;
        }

        /* renamed from: b */
        public int m11573b() {
            return this.f11758b;
        }
    }

    public HandlerThreadC7286b(File file, int i10) {
        super("DataEncodeThread");
        this.f11755d = Collections.synchronizedList(new ArrayList());
        this.f11754c = new FileOutputStream(file);
        this.f11753b = new byte[(int) ((i10 * 2 * 1.25d) + 7200.0d)];
    }

    /* renamed from: b */
    public a m11567b() {
        m11569e();
        return this.f11752a;
    }

    /* renamed from: c */
    public void m11568c(short[] sArr, int i10) {
        this.f11755d.add(new b(sArr, i10));
    }

    /* renamed from: e */
    public final void m11569e() {
        if (this.f11752a == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0028 -> B:33:0x002b). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public final void m11570f() throws IOException {
        int iFlush = Lame.flush(this.f11753b);
        try {
            try {
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (iFlush > 0) {
                try {
                    this.f11754c.write(this.f11753b, 0, iFlush);
                    FileOutputStream fileOutputStream = this.f11754c;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                    FileOutputStream fileOutputStream2 = this.f11754c;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                }
                Lame.close();
            }
            this.f11755d.clear();
        } catch (Throwable th) {
            FileOutputStream fileOutputStream3 = this.f11754c;
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
    public final int m11571g() throws IOException {
        if (this.f11755d.size() <= 0) {
            return 0;
        }
        b bVar = (b) this.f11755d.remove(0);
        short[] sArrM11572a = bVar.m11572a();
        int iM11573b = bVar.m11573b();
        int iEncode = Lame.encode(sArrM11572a, sArrM11572a, iM11573b, this.f11753b);
        if (iEncode > 0) {
            try {
                this.f11754c.write(this.f11753b, 0, iEncode);
                return iM11573b;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return iM11573b;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(AudioRecord audioRecord) throws IOException {
        m11571g();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        this.f11752a = new a(getLooper(), this);
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(AudioRecord audioRecord) {
    }
}
