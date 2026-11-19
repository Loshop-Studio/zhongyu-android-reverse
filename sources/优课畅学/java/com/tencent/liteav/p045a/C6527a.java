package com.tencent.liteav.p045a;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.liteav.audio.InterfaceC6545e;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.impl.Record.C6549b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.muxer.C6612c;
import com.tencent.liteav.videoencoder.C6721a;
import com.tencent.liteav.videoencoder.InterfaceC6723c;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tencent.liteav.a.a */
/* loaded from: classes4.dex */
public class C6527a implements InterfaceC6545e, InterfaceC6723c {

    /* renamed from: c */
    private C6612c f5068c;

    /* renamed from: d */
    private a f5069d;

    /* renamed from: e */
    private b f5070e;

    /* renamed from: f */
    private long f5071f = 0;

    /* renamed from: g */
    private long f5072g = -1;

    /* renamed from: h */
    private boolean f5073h = false;

    /* renamed from: i */
    private Handler f5074i = new Handler(Looper.getMainLooper()) { // from class: com.tencent.liteav.a.a.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (C6527a.this.f5070e != null) {
                int i10 = message.what;
                if (i10 == 1) {
                    C6527a.this.f5070e.mo4723a(((Long) message.obj).longValue());
                    return;
                }
                if (i10 != 2) {
                    return;
                }
                TXCLog.m4989d("TXCStreamRecord", "record complete. errcode = " + message.arg1 + ", errmsg = " + ((String) message.obj) + ", outputPath = " + C6527a.this.f5069d.f5081f + ", coverImage = " + C6527a.this.f5069d.f5082g);
                if (message.arg1 == 0 && C6527a.this.f5069d.f5082g != null && !C6527a.this.f5069d.f5082g.isEmpty() && !C6592e.m5045a(C6527a.this.f5069d.f5081f, C6527a.this.f5069d.f5082g)) {
                    TXCLog.m4991e("TXCStreamRecord", "saveVideoThumb error. sourcePath = " + C6527a.this.f5069d.f5081f + ", coverImagePath = " + C6527a.this.f5069d.f5082g);
                }
                if (message.arg1 != 0) {
                    try {
                        File file = new File(C6527a.this.f5069d.f5081f);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception e10) {
                        TXCLog.m4992e("TXCStreamRecord", "delete file failed.", e10);
                    }
                }
                C6527a.this.f5070e.mo4722a(message.arg1, (String) message.obj, C6527a.this.f5069d.f5081f, C6527a.this.f5069d.f5082g);
            }
        }
    };

    /* renamed from: a */
    private C6549b f5066a = new C6549b();

    /* renamed from: b */
    private C6721a f5067b = new C6721a();

    /* renamed from: com.tencent.liteav.a.a$a */
    public static class a {

        /* renamed from: e */
        public Object f5080e;

        /* renamed from: f */
        public String f5081f;

        /* renamed from: g */
        public String f5082g;

        /* renamed from: a */
        public int f5076a = 544;

        /* renamed from: b */
        public int f5077b = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;

        /* renamed from: c */
        public int f5078c = 20;

        /* renamed from: d */
        public int f5079d = 1000;

        /* renamed from: h */
        public int f5083h = 0;

        /* renamed from: i */
        public int f5084i = 0;

        /* renamed from: j */
        public int f5085j = 16;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TXCStreamRecordParams: [width=" + this.f5076a);
            sb.append("; height=" + this.f5077b);
            sb.append("; fps=" + this.f5078c);
            sb.append("; bitrate=" + this.f5079d);
            sb.append("; channels=" + this.f5083h);
            sb.append("; samplerate=" + this.f5084i);
            sb.append("; bits=" + this.f5085j);
            sb.append("; EGLContext=" + this.f5080e);
            sb.append("; coveriamge=" + this.f5082g);
            sb.append("; outputpath=" + this.f5081f + "]");
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.liteav.a.a$b */
    public interface b {
        /* renamed from: a */
        void mo4722a(int i10, String str, String str2, String str3);

        /* renamed from: a */
        void mo4723a(long j10);
    }

    public C6527a(Context context) {
        this.f5068c = new C6612c(context, 2);
    }

    /* renamed from: c */
    private String m4707c(int i10) {
        String str;
        switch (i10) {
            case 10000002:
                str = "Video encoder is not activated";
                break;
            case 10000003:
                str = "Illegal video input parameters";
                break;
            case 10000004:
                str = "Video encoding failed to initialize";
                break;
            case 10000005:
                str = "Video encoding failed";
                break;
            default:
                str = "";
                break;
        }
        Handler handler = this.f5074i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, str));
        return str;
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC6723c
    /* renamed from: a */
    public void mo4709a(int i10) {
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC6723c
    /* renamed from: b */
    public void mo4720b(int i10) {
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC6723c
    /* renamed from: a */
    public void mo4711a(int i10, long j10, long j11) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC6545e
    /* renamed from: a */
    public void mo4712a(int i10, String str) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC6545e
    /* renamed from: b */
    public void mo4721b(byte[] bArr, long j10, int i10, int i11, int i12) {
        this.f5068c.mo5195a(bArr, 0, bArr.length, j10 * 1000, 1);
    }

    @Override // com.tencent.liteav.audio.InterfaceC6545e
    /* renamed from: a */
    public void mo4718a(byte[] bArr, long j10, int i10, int i11, int i12) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC6545e
    /* renamed from: a */
    public void mo4719a(byte[] bArr, long j10, int i10, int i11, int i12, boolean z10) {
    }

    /* renamed from: a */
    public void m4715a(b bVar) {
        this.f5070e = bVar;
    }

    /* renamed from: a */
    public void m4714a(a aVar) {
        int i10;
        int i11;
        this.f5069d = aVar;
        this.f5071f = 0L;
        this.f5072g = -1L;
        this.f5068c.mo5194a(aVar.f5081f);
        int i12 = aVar.f5083h;
        if (i12 > 0 && (i10 = aVar.f5084i) > 0 && (i11 = aVar.f5085j) > 0) {
            this.f5066a.m4753a(10, i10, i12, i11, new WeakReference<>(this));
            a aVar2 = this.f5069d;
            this.f5068c.mo5197b(C6592e.m5038a(aVar2.f5084i, aVar2.f5083h, 2));
            this.f5073h = true;
        }
        this.f5067b.setListener(this);
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        a aVar3 = this.f5069d;
        tXSVideoEncoderParam.width = aVar3.f5076a;
        tXSVideoEncoderParam.height = aVar3.f5077b;
        tXSVideoEncoderParam.fps = aVar3.f5078c;
        tXSVideoEncoderParam.glContext = aVar3.f5080e;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.appendSpsPps = false;
        this.f5067b.setBitrate(aVar3.f5079d);
        this.f5067b.start(tXSVideoEncoderParam);
    }

    /* renamed from: a */
    public void m4708a() {
        this.f5073h = false;
        this.f5066a.m4752a();
        this.f5067b.stop();
        if (this.f5068c.mo5196b() < 0) {
            Handler handler = this.f5074i;
            handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4合成失败"));
        } else {
            Handler handler2 = this.f5074i;
            handler2.sendMessage(Message.obtain(handler2, 2, 0, 0, ""));
        }
    }

    /* renamed from: a */
    public void m4710a(int i10, long j10) {
        C6721a c6721a = this.f5067b;
        a aVar = this.f5069d;
        c6721a.pushVideoFrame(i10, aVar.f5076a, aVar.f5077b, j10);
    }

    /* renamed from: a */
    public void m4717a(byte[] bArr, long j10) {
        if (this.f5073h) {
            this.f5066a.m4754a(bArr, j10);
        } else {
            TXCLog.m4991e("TXCStreamRecord", "drainAudio fail because of not init yet!");
        }
    }

    /* renamed from: a */
    public static String m4705a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(Long.valueOf(strValueOf + "000").longValue()));
            String strM4704a = m4704a(context);
            if (TextUtils.isEmpty(strM4704a)) {
                return null;
            }
            return new File(strM4704a, String.format("TXUGC_%s" + str, str2)).getAbsolutePath();
        } catch (Exception e10) {
            TXCLog.m4992e("TXCStreamRecord", "create file path failed.", e10);
            return null;
        }
    }

    /* renamed from: a */
    private static String m4704a(Context context) {
        if (context == null) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable()) {
            return context.getFilesDir().getPath();
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return null;
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC6723c
    /* renamed from: a */
    public void mo4716a(TXSNALPacket tXSNALPacket, int i10) {
        if (i10 == 0) {
            C6612c c6612c = this.f5068c;
            byte[] bArr = tXSNALPacket.nalData;
            c6612c.mo5198b(bArr, 0, bArr.length, tXSNALPacket.pts * 1000, tXSNALPacket.info.flags);
            if (this.f5072g < 0) {
                this.f5072g = tXSNALPacket.pts;
            }
            long j10 = tXSNALPacket.pts;
            if (j10 > this.f5071f + 500) {
                Handler handler = this.f5074i;
                handler.sendMessage(Message.obtain(handler, 1, new Long(j10 - this.f5072g)));
                this.f5071f = tXSNALPacket.pts;
                return;
            }
            return;
        }
        TXCLog.m4991e("TXCStreamRecord", "video encode error! errmsg: " + m4707c(i10));
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC6723c
    /* renamed from: a */
    public void mo4713a(MediaFormat mediaFormat) {
        this.f5068c.mo5193a(mediaFormat);
        if (!this.f5068c.mo5199c() || this.f5068c.mo5192a() >= 0) {
            return;
        }
        Handler handler = this.f5074i;
        handler.sendMessage(Message.obtain(handler, 2, 1, 0, "mp4 wrapper failed to start"));
    }
}
