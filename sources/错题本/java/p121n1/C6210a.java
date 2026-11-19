package p121n1;

import android.media.AudioRecord;
import android.os.Message;
import android.util.Log;
import com.blankj.utilcode.util.HandlerC3388h;
import com.stormdzh.lame4android.Lame;
import com.stormdzh.lame4android.PCMFormat;
import com.tencent.bugly.proguard.C4150z0;
import com.zykj.sketch.core.record.AudioControl;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: n1.a */
/* loaded from: classes3.dex */
public final class C6210a {

    /* renamed from: h */
    public static final PCMFormat f9930h = PCMFormat.PCM_16BIT;

    /* renamed from: b */
    public int f9932b;

    /* renamed from: c */
    public short[] f9933c;

    /* renamed from: d */
    public HandlerThreadC6212c f9934d;

    /* renamed from: e */
    public int f9935e;

    /* renamed from: f */
    public File f9936f;

    /* renamed from: a */
    public AudioRecord f9931a = null;

    /* renamed from: g */
    public final Object f9937g = new Object();

    /* renamed from: a */
    public final void m5844a() {
        HandlerC3388h handlerC3388h;
        synchronized (this.f9937g) {
            try {
                try {
                    try {
                        if (m5846c()) {
                            this.f9931a.setRecordPositionUpdateListener(null);
                            this.f9931a.stop();
                            this.f9931a.release();
                        }
                        HandlerThreadC6212c handlerThreadC6212c = this.f9934d;
                        if (handlerThreadC6212c != null) {
                            handlerC3388h = handlerThreadC6212c.f9940a;
                            if (handlerC3388h == null) {
                                throw new IllegalStateException();
                            }
                        } else {
                            handlerC3388h = null;
                        }
                        if (handlerC3388h != null) {
                            Message message = new Message();
                            message.what = 1;
                            handlerC3388h.handleMessage(message);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f9931a = null;
            } catch (Throwable th2) {
                this.f9931a = null;
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m5845b(File file) throws Exception {
        PCMFormat pCMFormat = f9930h;
        this.f9932b = AudioRecord.getMinBufferSize(AudioControl.AUDIO_SAMPLE_RATE, 16, pCMFormat.getAudioFormat());
        int bytesPerFrame = pCMFormat.getBytesPerFrame();
        int i = this.f9932b / bytesPerFrame;
        int i8 = i % 160;
        if (i8 != 0) {
            this.f9932b = ((160 - i8) + i) * bytesPerFrame;
        }
        this.f9931a = new AudioRecord(1, AudioControl.AUDIO_SAMPLE_RATE, 16, pCMFormat.getAudioFormat(), this.f9932b);
        this.f9933c = new short[this.f9932b];
        Lame.init(AudioControl.AUDIO_SAMPLE_RATE, 16, AudioControl.AUDIO_SAMPLE_RATE, 32, 7);
        if (file == null) {
            throw new Exception("output file is null");
        }
        this.f9936f = file;
        File file2 = this.f9936f;
        int i9 = this.f9932b;
        HandlerThreadC6212c handlerThreadC6212c = new HandlerThreadC6212c("DataEncodeThread");
        handlerThreadC6212c.f9943d = Collections.synchronizedList(new ArrayList());
        handlerThreadC6212c.f9942c = new FileOutputStream(file2);
        handlerThreadC6212c.f9941b = new byte[(int) ((i9 * 2 * 1.25d) + 7200.0d)];
        this.f9934d = handlerThreadC6212c;
        handlerThreadC6212c.start();
        AudioRecord audioRecord = this.f9931a;
        HandlerThreadC6212c handlerThreadC6212c2 = this.f9934d;
        HandlerC3388h handlerC3388h = handlerThreadC6212c2.f9940a;
        if (handlerC3388h == null) {
            throw new IllegalStateException();
        }
        audioRecord.setRecordPositionUpdateListener(handlerThreadC6212c2, handlerC3388h);
        this.f9931a.setPositionNotificationPeriod(160);
    }

    /* renamed from: c */
    public final boolean m5846c() {
        AudioRecord audioRecord = this.f9931a;
        return audioRecord != null && audioRecord.getRecordingState() == 3;
    }

    /* renamed from: d */
    public final void m5847d(File file) {
        synchronized (this.f9937g) {
            try {
                if (this.f9931a == null || !m5846c()) {
                    this.f9935e = -1;
                    Log.i("Mp3Recorder", "Start recording, BufferSize = " + this.f9932b);
                    if (this.f9931a == null) {
                        m5845b(file);
                    } else {
                        this.f9936f = file;
                    }
                    this.f9931a.startRecording();
                    new C4150z0(this, 3).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
