package p346t7;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.alibaba.fastjson.asm.Opcodes;
import com.stormdzh.lame4android.Lame;
import com.stormdzh.lame4android.PCMFormat;
import com.zykj.sketch.core.record.AudioControl;
import java.io.File;
import java.io.IOException;
import p346t7.HandlerThreadC11250b;

/* renamed from: t7.a */
/* loaded from: classes5.dex */
public class C11249a {

    /* renamed from: m */
    public static final PCMFormat f26993m = PCMFormat.PCM_16BIT;

    /* renamed from: a */
    public AudioRecord f26994a;

    /* renamed from: b */
    public int f26995b;

    /* renamed from: c */
    public short[] f26996c;

    /* renamed from: d */
    public HandlerThreadC11250b f26997d;

    /* renamed from: e */
    public int f26998e;

    /* renamed from: f */
    public int f26999f;

    /* renamed from: g */
    public PCMFormat f27000g;

    /* renamed from: h */
    public int f27001h;

    /* renamed from: i */
    public File f27002i;

    /* renamed from: j */
    public Thread f27003j;

    /* renamed from: k */
    public int f27004k;

    /* renamed from: l */
    public final Object f27005l;

    /* renamed from: t7.a$a */
    public interface a {
    }

    /* renamed from: t7.a$b */
    public class b extends Thread {

        /* renamed from: t7.a$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C11249a.this.m25104l()) {
                    try {
                        C11249a.this.m25106n();
                        C11249a.m25096f(C11249a.this);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        public b() {
        }

        /* renamed from: a */
        public final int m25107a(short[] sArr, int i10) {
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
            synchronized (C11249a.this.f27005l) {
                try {
                    if (C11249a.this.f27001h > 0) {
                        new Handler(Looper.getMainLooper()).postDelayed(new a(), (C11249a.this.f27001h * 1000) + 100);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Process.setThreadPriority(-19);
            while (C11249a.this.m25104l()) {
                if (C11249a.this.f26994a != null && C11249a.this.m25104l() && (i10 = C11249a.this.f26994a.read(C11249a.this.f26996c, 0, C11249a.this.f26995b)) > 0) {
                    C11249a.this.f26997d.m25111c(C11249a.this.f26996c, i10);
                    C11249a c11249a = C11249a.this;
                    c11249a.f27004k = m25107a(c11249a.f26996c, i10);
                }
            }
            C11249a.this.m25102c();
        }
    }

    public C11249a(int i10, int i11, PCMFormat pCMFormat) {
        this.f26994a = null;
        this.f27005l = new Object();
        this.f26998e = i10;
        this.f26999f = i11;
        this.f27000g = pCMFormat;
    }

    /* renamed from: f */
    public static /* synthetic */ a m25096f(C11249a c11249a) {
        c11249a.getClass();
        return null;
    }

    /* renamed from: c */
    public final void m25102c() {
        synchronized (this.f27005l) {
            try {
                try {
                    try {
                        if (m25104l()) {
                            this.f26994a.setRecordPositionUpdateListener(null);
                            this.f26994a.stop();
                            this.f26994a.release();
                        }
                        HandlerThreadC11250b handlerThreadC11250b = this.f26997d;
                        HandlerThreadC11250b.a aVarM25110b = handlerThreadC11250b != null ? handlerThreadC11250b.m25110b() : null;
                        if (aVarM25110b != null) {
                            Message message = new Message();
                            message.what = 1;
                            aVarM25110b.handleMessage(message);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    this.f26994a = null;
                } catch (Throwable th) {
                    this.f26994a = null;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m25103d(File file) throws Exception {
        this.f26995b = AudioRecord.getMinBufferSize(this.f26998e, this.f26999f, this.f27000g.m9755a());
        PCMFormat pCMFormat = f26993m;
        int iM9756c = pCMFormat.m9756c();
        int i10 = this.f26995b / iM9756c;
        int i11 = i10 % Opcodes.IF_ICMPNE;
        if (i11 != 0) {
            this.f26995b = (i10 + (160 - i11)) * iM9756c;
        }
        this.f26994a = new AudioRecord(1, AudioControl.AUDIO_SAMPLE_RATE, 16, pCMFormat.m9755a(), this.f26995b);
        this.f26996c = new short[this.f26995b];
        int i12 = this.f26998e;
        Lame.init(i12, this.f26999f, i12, 32, 7);
        if (file == null) {
            throw new Exception("output file is null");
        }
        this.f27002i = file;
        HandlerThreadC11250b handlerThreadC11250b = new HandlerThreadC11250b(this.f27002i, this.f26995b);
        this.f26997d = handlerThreadC11250b;
        handlerThreadC11250b.start();
        AudioRecord audioRecord = this.f26994a;
        HandlerThreadC11250b handlerThreadC11250b2 = this.f26997d;
        audioRecord.setRecordPositionUpdateListener(handlerThreadC11250b2, handlerThreadC11250b2.m25110b());
        this.f26994a.setPositionNotificationPeriod(Opcodes.IF_ICMPNE);
    }

    /* renamed from: l */
    public boolean m25104l() {
        AudioRecord audioRecord = this.f26994a;
        return audioRecord != null && audioRecord.getRecordingState() == 3;
    }

    /* renamed from: m */
    public void m25105m(int i10, File file) {
        synchronized (this.f27005l) {
            try {
                if (this.f26994a == null || !m25104l()) {
                    this.f27001h = i10;
                    Log.i("Mp3Recorder", "Start recording, BufferSize = " + this.f26995b);
                    if (this.f26994a == null) {
                        m25103d(file);
                    } else {
                        this.f27002i = file;
                    }
                    this.f26994a.startRecording();
                    b bVar = new b();
                    this.f27003j = bVar;
                    bVar.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public void m25106n() {
        m25102c();
    }

    public C11249a() {
        this(AudioControl.AUDIO_SAMPLE_RATE, 16, f26993m);
    }
}
