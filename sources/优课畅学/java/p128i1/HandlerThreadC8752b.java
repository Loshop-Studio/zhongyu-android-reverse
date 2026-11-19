package p128i1;

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

/* renamed from: i1.b */
/* loaded from: classes4.dex */
public class HandlerThreadC8752b extends HandlerThread implements AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: a */
    public a f16402a;

    /* renamed from: b */
    public byte[] f16403b;

    /* renamed from: c */
    public FileOutputStream f16404c;

    /* renamed from: d */
    public List f16405d;

    /* renamed from: i1.b$a */
    public static class a extends Handler {

        /* renamed from: a */
        public HandlerThreadC8752b f16406a;

        public a(Looper looper, HandlerThreadC8752b handlerThreadC8752b) {
            super(looper);
            this.f16406a = handlerThreadC8752b;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            if (message.what == 1) {
                while (this.f16406a.m14445g() > 0) {
                }
                removeCallbacksAndMessages(null);
                this.f16406a.m14444f();
                getLooper().quit();
            }
        }
    }

    /* renamed from: i1.b$b */
    public class b {

        /* renamed from: a */
        public short[] f16407a;

        /* renamed from: b */
        public int f16408b;

        public b(short[] sArr, int i10) {
            this.f16407a = (short[]) sArr.clone();
            this.f16408b = i10;
        }

        /* renamed from: a */
        public short[] m14446a() {
            return this.f16407a;
        }

        /* renamed from: b */
        public int m14447b() {
            return this.f16408b;
        }
    }

    public HandlerThreadC8752b(File file, int i10) {
        super("DataEncodeThread");
        this.f16405d = Collections.synchronizedList(new ArrayList());
        this.f16404c = new FileOutputStream(file);
        this.f16403b = new byte[(int) ((i10 * 2 * 1.25d) + 7200.0d)];
    }

    /* renamed from: b */
    public a m14441b() {
        m14443e();
        return this.f16402a;
    }

    /* renamed from: c */
    public void m14442c(short[] sArr, int i10) {
        this.f16405d.add(new b(sArr, i10));
    }

    /* renamed from: e */
    public final void m14443e() {
        if (this.f16402a == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0028 -> B:33:0x002b). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public final void m14444f() throws IOException {
        int iFlush = Lame.flush(this.f16403b);
        try {
            try {
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (iFlush > 0) {
                try {
                    this.f16404c.write(this.f16403b, 0, iFlush);
                    FileOutputStream fileOutputStream = this.f16404c;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                    FileOutputStream fileOutputStream2 = this.f16404c;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                }
                Lame.close();
            }
            this.f16405d.clear();
        } catch (Throwable th) {
            FileOutputStream fileOutputStream3 = this.f16404c;
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
    public final int m14445g() throws IOException {
        if (this.f16405d.size() <= 0) {
            return 0;
        }
        b bVar = (b) this.f16405d.remove(0);
        short[] sArrM14446a = bVar.m14446a();
        int iM14447b = bVar.m14447b();
        int iEncode = Lame.encode(sArrM14446a, sArrM14446a, iM14447b, this.f16403b);
        if (iEncode > 0) {
            try {
                this.f16404c.write(this.f16403b, 0, iEncode);
                return iM14447b;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return iM14447b;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(AudioRecord audioRecord) throws IOException {
        m14445g();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        this.f16402a = new a(getLooper(), this);
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(AudioRecord audioRecord) {
    }
}
