package p346t7;

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

/* renamed from: t7.b */
/* loaded from: classes5.dex */
public class HandlerThreadC11250b extends HandlerThread implements AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: c */
    public a f27008c;

    /* renamed from: d */
    public byte[] f27009d;

    /* renamed from: e */
    public FileOutputStream f27010e;

    /* renamed from: f */
    public List f27011f;

    /* renamed from: t7.b$a */
    public static class a extends Handler {

        /* renamed from: a */
        public HandlerThreadC11250b f27012a;

        public a(Looper looper, HandlerThreadC11250b handlerThreadC11250b) {
            super(looper);
            this.f27012a = handlerThreadC11250b;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            if (message.what == 1) {
                while (this.f27012a.m25114g() > 0) {
                }
                removeCallbacksAndMessages(null);
                this.f27012a.m25113f();
                getLooper().quit();
            }
        }
    }

    /* renamed from: t7.b$b */
    public class b {

        /* renamed from: a */
        public short[] f27013a;

        /* renamed from: b */
        public int f27014b;

        public b(short[] sArr, int i10) {
            this.f27013a = (short[]) sArr.clone();
            this.f27014b = i10;
        }

        /* renamed from: a */
        public short[] m25115a() {
            return this.f27013a;
        }

        /* renamed from: b */
        public int m25116b() {
            return this.f27014b;
        }
    }

    public HandlerThreadC11250b(File file, int i10) {
        super("DataEncodeThread");
        this.f27011f = Collections.synchronizedList(new ArrayList());
        this.f27010e = new FileOutputStream(file);
        this.f27009d = new byte[(int) ((i10 * 2 * 1.25d) + 7200.0d)];
    }

    /* renamed from: b */
    public a m25110b() {
        m25112e();
        return this.f27008c;
    }

    /* renamed from: c */
    public void m25111c(short[] sArr, int i10) {
        this.f27011f.add(new b(sArr, i10));
    }

    /* renamed from: e */
    public final void m25112e() {
        if (this.f27008c == null) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0028 -> B:33:0x002b). Please report as a decompilation issue!!! */
    /* renamed from: f */
    public final void m25113f() throws IOException {
        int iFlush = Lame.flush(this.f27009d);
        try {
            try {
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            if (iFlush > 0) {
                try {
                    this.f27010e.write(this.f27009d, 0, iFlush);
                    FileOutputStream fileOutputStream = this.f27010e;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                    FileOutputStream fileOutputStream2 = this.f27010e;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                }
                Lame.close();
            }
            this.f27011f.clear();
        } catch (Throwable th) {
            FileOutputStream fileOutputStream3 = this.f27010e;
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
    public final int m25114g() throws IOException {
        if (this.f27011f.size() <= 0) {
            return 0;
        }
        b bVar = (b) this.f27011f.remove(0);
        short[] sArrM25115a = bVar.m25115a();
        int iM25116b = bVar.m25116b();
        int iEncode = Lame.encode(sArrM25115a, sArrM25115a, iM25116b, this.f27009d);
        if (iEncode > 0) {
            try {
                this.f27010e.write(this.f27009d, 0, iEncode);
                return iM25116b;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return iM25116b;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(AudioRecord audioRecord) throws IOException {
        m25114g();
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        this.f27008c = new a(getLooper(), this);
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(AudioRecord audioRecord) {
    }
}
