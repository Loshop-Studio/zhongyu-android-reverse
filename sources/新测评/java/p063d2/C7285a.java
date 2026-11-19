package p063d2;

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
import p063d2.HandlerThreadC7286b;

/* renamed from: d2.a */
/* loaded from: classes4.dex */
public class C7285a {

    /* renamed from: m */
    public static final PCMFormat f11737m = PCMFormat.PCM_16BIT;

    /* renamed from: a */
    public AudioRecord f11738a;

    /* renamed from: b */
    public int f11739b;

    /* renamed from: c */
    public short[] f11740c;

    /* renamed from: d */
    public HandlerThreadC7286b f11741d;

    /* renamed from: e */
    public int f11742e;

    /* renamed from: f */
    public int f11743f;

    /* renamed from: g */
    public PCMFormat f11744g;

    /* renamed from: h */
    public int f11745h;

    /* renamed from: i */
    public File f11746i;

    /* renamed from: j */
    public Thread f11747j;

    /* renamed from: k */
    public int f11748k;

    /* renamed from: l */
    public final Object f11749l;

    /* renamed from: d2.a$a */
    public interface a {
    }

    /* renamed from: d2.a$b */
    public class b extends Thread {

        /* renamed from: d2.a$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C7285a.this.m11561l()) {
                    try {
                        C7285a.this.m11563n();
                        C7285a.m11553f(C7285a.this);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        public b() {
        }

        /* renamed from: a */
        public final int m11564a(short[] sArr, int i10) {
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
            synchronized (C7285a.this.f11749l) {
                try {
                    if (C7285a.this.f11745h > 0) {
                        new Handler(Looper.getMainLooper()).postDelayed(new a(), (C7285a.this.f11745h * 1000) + 100);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Process.setThreadPriority(-19);
            while (C7285a.this.m11561l()) {
                if (C7285a.this.f11738a != null && C7285a.this.m11561l() && (i10 = C7285a.this.f11738a.read(C7285a.this.f11740c, 0, C7285a.this.f11739b)) > 0) {
                    C7285a.this.f11741d.m11568c(C7285a.this.f11740c, i10);
                    C7285a c7285a = C7285a.this;
                    c7285a.f11748k = m11564a(c7285a.f11740c, i10);
                }
            }
            C7285a.this.m11559c();
        }
    }

    public C7285a(int i10, int i11, PCMFormat pCMFormat) {
        this.f11738a = null;
        this.f11749l = new Object();
        this.f11742e = i10;
        this.f11743f = i11;
        this.f11744g = pCMFormat;
    }

    /* renamed from: f */
    public static /* synthetic */ a m11553f(C7285a c7285a) {
        c7285a.getClass();
        return null;
    }

    /* renamed from: c */
    public final void m11559c() {
        synchronized (this.f11749l) {
            try {
                try {
                    try {
                        if (m11561l()) {
                            this.f11738a.setRecordPositionUpdateListener(null);
                            this.f11738a.stop();
                            this.f11738a.release();
                        }
                        HandlerThreadC7286b handlerThreadC7286b = this.f11741d;
                        HandlerThreadC7286b.a aVarM11567b = handlerThreadC7286b != null ? handlerThreadC7286b.m11567b() : null;
                        if (aVarM11567b != null) {
                            Message message = new Message();
                            message.what = 1;
                            aVarM11567b.handleMessage(message);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    this.f11738a = null;
                } catch (Throwable th) {
                    this.f11738a = null;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m11560d(File file) throws Exception {
        this.f11739b = AudioRecord.getMinBufferSize(this.f11742e, this.f11743f, this.f11744g.m4494a());
        PCMFormat pCMFormat = f11737m;
        int iM4495f = pCMFormat.m4495f();
        int i10 = this.f11739b / iM4495f;
        int i11 = i10 % 160;
        if (i11 != 0) {
            this.f11739b = (i10 + (160 - i11)) * iM4495f;
        }
        this.f11738a = new AudioRecord(1, AudioControl.AUDIO_SAMPLE_RATE, 16, pCMFormat.m4494a(), this.f11739b);
        this.f11740c = new short[this.f11739b];
        int i12 = this.f11742e;
        Lame.init(i12, this.f11743f, i12, 32, 7);
        if (file == null) {
            throw new Exception("output file is null");
        }
        this.f11746i = file;
        HandlerThreadC7286b handlerThreadC7286b = new HandlerThreadC7286b(this.f11746i, this.f11739b);
        this.f11741d = handlerThreadC7286b;
        handlerThreadC7286b.start();
        AudioRecord audioRecord = this.f11738a;
        HandlerThreadC7286b handlerThreadC7286b2 = this.f11741d;
        audioRecord.setRecordPositionUpdateListener(handlerThreadC7286b2, handlerThreadC7286b2.m11567b());
        this.f11738a.setPositionNotificationPeriod(160);
    }

    /* renamed from: l */
    public boolean m11561l() {
        AudioRecord audioRecord = this.f11738a;
        return audioRecord != null && audioRecord.getRecordingState() == 3;
    }

    /* renamed from: m */
    public void m11562m(int i10, File file) {
        synchronized (this.f11749l) {
            try {
                if (this.f11738a == null || !m11561l()) {
                    this.f11745h = i10;
                    Log.i("Mp3Recorder", "Start recording, BufferSize = " + this.f11739b);
                    if (this.f11738a == null) {
                        m11560d(file);
                    } else {
                        this.f11746i = file;
                    }
                    this.f11738a.startRecording();
                    b bVar = new b();
                    this.f11747j = bVar;
                    bVar.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public void m11563n() {
        m11559c();
    }

    public C7285a() {
        this(AudioControl.AUDIO_SAMPLE_RATE, 16, f11737m);
    }
}
