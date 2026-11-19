package p031c2;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.stormdzh.lame4android.Lame;
import com.stormdzh.lame4android.PCMFormat;
import com.zykj.sketch.core.record.AudioControl;
import java.io.File;
import java.io.IOException;
import p031c2.HandlerThreadC5223b;

/* renamed from: c2.a */
/* loaded from: classes4.dex */
public class C5222a {

    /* renamed from: m */
    public static final PCMFormat f2438m = PCMFormat.PCM_16BIT;

    /* renamed from: a */
    public AudioRecord f2439a;

    /* renamed from: b */
    public int f2440b;

    /* renamed from: c */
    public short[] f2441c;

    /* renamed from: d */
    public HandlerThreadC5223b f2442d;

    /* renamed from: e */
    public int f2443e;

    /* renamed from: f */
    public int f2444f;

    /* renamed from: g */
    public PCMFormat f2445g;

    /* renamed from: h */
    public int f2446h;

    /* renamed from: i */
    public File f2447i;

    /* renamed from: j */
    public Thread f2448j;

    /* renamed from: k */
    public int f2449k;

    /* renamed from: l */
    public final Object f2450l;

    /* renamed from: c2.a$a */
    public interface a {
    }

    /* renamed from: c2.a$b */
    public class b extends Thread {

        /* renamed from: c2.a$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5222a.this.m2324l()) {
                    try {
                        C5222a.this.m2326n();
                        C5222a.m2316f(C5222a.this);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        public b() {
        }

        /* renamed from: a */
        public final int m2327a(short[] sArr, int i9) {
            if (sArr != null) {
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    short s9 = sArr[i11];
                    i10 += s9 * s9;
                }
                if (i9 > 0) {
                    return (int) Math.sqrt(i10 / i9);
                }
            }
            return 0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            int i9;
            synchronized (C5222a.this.f2450l) {
                try {
                    if (C5222a.this.f2446h > 0) {
                        new Handler(Looper.getMainLooper()).postDelayed(new a(), (C5222a.this.f2446h * 1000) + 100);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Process.setThreadPriority(-19);
            while (C5222a.this.m2324l()) {
                if (C5222a.this.f2439a != null && C5222a.this.m2324l() && (i9 = C5222a.this.f2439a.read(C5222a.this.f2441c, 0, C5222a.this.f2440b)) > 0) {
                    C5222a.this.f2442d.m2331c(C5222a.this.f2441c, i9);
                    C5222a c5222a = C5222a.this;
                    c5222a.f2449k = m2327a(c5222a.f2441c, i9);
                }
            }
            C5222a.this.m2322c();
        }
    }

    public C5222a(int i9, int i10, PCMFormat pCMFormat) {
        this.f2439a = null;
        this.f2450l = new Object();
        this.f2443e = i9;
        this.f2444f = i10;
        this.f2445g = pCMFormat;
    }

    /* renamed from: f */
    public static /* synthetic */ a m2316f(C5222a c5222a) {
        c5222a.getClass();
        return null;
    }

    /* renamed from: c */
    public final void m2322c() {
        synchronized (this.f2450l) {
            try {
                try {
                    try {
                        if (m2324l()) {
                            this.f2439a.setRecordPositionUpdateListener(null);
                            this.f2439a.stop();
                            this.f2439a.release();
                        }
                        HandlerThreadC5223b handlerThreadC5223b = this.f2442d;
                        HandlerThreadC5223b.a aVarM2330b = handlerThreadC5223b != null ? handlerThreadC5223b.m2330b() : null;
                        if (aVarM2330b != null) {
                            Message message = new Message();
                            message.what = 1;
                            aVarM2330b.handleMessage(message);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    this.f2439a = null;
                } catch (Throwable th) {
                    this.f2439a = null;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m2323d(File file) throws Exception {
        this.f2440b = AudioRecord.getMinBufferSize(this.f2443e, this.f2444f, this.f2445g.m4699a());
        PCMFormat pCMFormat = f2438m;
        int iM4700c = pCMFormat.m4700c();
        int i9 = this.f2440b / iM4700c;
        int i10 = i9 % 160;
        if (i10 != 0) {
            this.f2440b = (i9 + (160 - i10)) * iM4700c;
        }
        this.f2439a = new AudioRecord(1, AudioControl.AUDIO_SAMPLE_RATE, 16, pCMFormat.m4699a(), this.f2440b);
        this.f2441c = new short[this.f2440b];
        int i11 = this.f2443e;
        Lame.init(i11, this.f2444f, i11, 32, 7);
        if (file == null) {
            throw new Exception("output file is null");
        }
        this.f2447i = file;
        HandlerThreadC5223b handlerThreadC5223b = new HandlerThreadC5223b(this.f2447i, this.f2440b);
        this.f2442d = handlerThreadC5223b;
        handlerThreadC5223b.start();
        AudioRecord audioRecord = this.f2439a;
        HandlerThreadC5223b handlerThreadC5223b2 = this.f2442d;
        audioRecord.setRecordPositionUpdateListener(handlerThreadC5223b2, handlerThreadC5223b2.m2330b());
        this.f2439a.setPositionNotificationPeriod(160);
    }

    /* renamed from: l */
    public boolean m2324l() {
        AudioRecord audioRecord = this.f2439a;
        return audioRecord != null && audioRecord.getRecordingState() == 3;
    }

    /* renamed from: m */
    public void m2325m(int i9, File file) {
        synchronized (this.f2450l) {
            try {
                if (this.f2439a == null || !m2324l()) {
                    this.f2446h = i9;
                    Log.i("Mp3Recorder", "Start recording, BufferSize = " + this.f2440b);
                    if (this.f2439a == null) {
                        m2323d(file);
                    } else {
                        this.f2447i = file;
                    }
                    this.f2439a.startRecording();
                    b bVar = new b();
                    this.f2448j = bVar;
                    bVar.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public void m2326n() {
        m2322c();
    }

    public C5222a() {
        this(AudioControl.AUDIO_SAMPLE_RATE, 16, f2438m);
    }
}
