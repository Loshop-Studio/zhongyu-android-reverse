package p128i1;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.stormdzh.lame4android.Lame;
import com.stormdzh.lame4android.PCMFormat;
import java.io.File;
import java.io.IOException;
import p128i1.HandlerThreadC8752b;

/* renamed from: i1.a */
/* loaded from: classes4.dex */
public class C8751a {

    /* renamed from: m */
    public static final PCMFormat f16387m = PCMFormat.PCM_16BIT;

    /* renamed from: a */
    public AudioRecord f16388a;

    /* renamed from: b */
    public int f16389b;

    /* renamed from: c */
    public short[] f16390c;

    /* renamed from: d */
    public HandlerThreadC8752b f16391d;

    /* renamed from: e */
    public int f16392e;

    /* renamed from: f */
    public int f16393f;

    /* renamed from: g */
    public PCMFormat f16394g;

    /* renamed from: h */
    public int f16395h;

    /* renamed from: i */
    public File f16396i;

    /* renamed from: j */
    public Thread f16397j;

    /* renamed from: k */
    public int f16398k;

    /* renamed from: l */
    public final Object f16399l;

    /* renamed from: i1.a$a */
    public interface a {
    }

    /* renamed from: i1.a$b */
    public class b extends Thread {

        /* renamed from: i1.a$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C8751a.this.m14435l()) {
                    try {
                        C8751a.this.m14437n();
                        C8751a.m14427f(C8751a.this);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        public b() {
        }

        /* renamed from: a */
        public final int m14438a(short[] sArr, int i10) {
            if (sArr != null) {
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    short s10 = sArr[i12];
                    i11 += s10 * s10;
                }
                if (i10 > 0) {
                    return (int) Math.sqrt(i11 / i10);
                }
            }
            return 0;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            int i10;
            synchronized (C8751a.this.f16399l) {
                try {
                    if (C8751a.this.f16395h > 0) {
                        new Handler(Looper.getMainLooper()).postDelayed(new a(), (C8751a.this.f16395h * 1000) + 100);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Process.setThreadPriority(-19);
            while (C8751a.this.m14435l()) {
                if (C8751a.this.f16388a != null && C8751a.this.m14435l() && (i10 = C8751a.this.f16388a.read(C8751a.this.f16390c, 0, C8751a.this.f16389b)) > 0) {
                    C8751a.this.f16391d.m14442c(C8751a.this.f16390c, i10);
                    C8751a c8751a = C8751a.this;
                    c8751a.f16398k = m14438a(c8751a.f16390c, i10);
                }
            }
            C8751a.this.m14433c();
        }
    }

    public C8751a(int i10, int i11, PCMFormat pCMFormat) {
        this.f16388a = null;
        this.f16399l = new Object();
        this.f16392e = i10;
        this.f16393f = i11;
        this.f16394g = pCMFormat;
    }

    /* renamed from: f */
    public static /* synthetic */ a m14427f(C8751a c8751a) {
        c8751a.getClass();
        return null;
    }

    /* renamed from: c */
    public final void m14433c() {
        synchronized (this.f16399l) {
            try {
                try {
                    try {
                        if (m14435l()) {
                            this.f16388a.setRecordPositionUpdateListener(null);
                            this.f16388a.stop();
                            this.f16388a.release();
                        }
                        HandlerThreadC8752b handlerThreadC8752b = this.f16391d;
                        HandlerThreadC8752b.a aVarM14441b = handlerThreadC8752b != null ? handlerThreadC8752b.m14441b() : null;
                        if (aVarM14441b != null) {
                            Message message = new Message();
                            message.what = 1;
                            aVarM14441b.handleMessage(message);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    this.f16388a = null;
                } catch (Throwable th) {
                    this.f16388a = null;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m14434d(File file) throws Exception {
        this.f16389b = AudioRecord.getMinBufferSize(this.f16392e, this.f16393f, this.f16394g.m4108a());
        PCMFormat pCMFormat = f16387m;
        int iM4109b = pCMFormat.m4109b();
        int i10 = this.f16389b / iM4109b;
        int i11 = i10 % 160;
        if (i11 != 0) {
            this.f16389b = (i10 + (160 - i11)) * iM4109b;
        }
        this.f16388a = new AudioRecord(1, 16000, 16, pCMFormat.m4108a(), this.f16389b);
        this.f16390c = new short[this.f16389b];
        int i12 = this.f16392e;
        Lame.init(i12, this.f16393f, i12, 32, 7);
        if (file == null) {
            throw new Exception("output file is null");
        }
        this.f16396i = file;
        HandlerThreadC8752b handlerThreadC8752b = new HandlerThreadC8752b(this.f16396i, this.f16389b);
        this.f16391d = handlerThreadC8752b;
        handlerThreadC8752b.start();
        AudioRecord audioRecord = this.f16388a;
        HandlerThreadC8752b handlerThreadC8752b2 = this.f16391d;
        audioRecord.setRecordPositionUpdateListener(handlerThreadC8752b2, handlerThreadC8752b2.m14441b());
        this.f16388a.setPositionNotificationPeriod(160);
    }

    /* renamed from: l */
    public boolean m14435l() {
        AudioRecord audioRecord = this.f16388a;
        return audioRecord != null && audioRecord.getRecordingState() == 3;
    }

    /* renamed from: m */
    public void m14436m(int i10, File file) {
        synchronized (this.f16399l) {
            try {
                if (this.f16388a == null || !m14435l()) {
                    this.f16395h = i10;
                    Log.i("Mp3Recorder", "Start recording, BufferSize = " + this.f16389b);
                    if (this.f16388a == null) {
                        m14434d(file);
                    } else {
                        this.f16396i = file;
                    }
                    this.f16388a.startRecording();
                    b bVar = new b();
                    this.f16397j = bVar;
                    bVar.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public void m14437n() {
        m14433c();
    }

    public C8751a() {
        this(16000, 16, f16387m);
    }
}
