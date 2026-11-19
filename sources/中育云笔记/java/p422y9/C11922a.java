package p422y9;

import android.media.MediaPlayer;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10219g;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p346t7.C11249a;

/* renamed from: y9.a */
/* loaded from: classes5.dex */
public final class C11922a {

    /* renamed from: a */
    public boolean f28257a;

    /* renamed from: b */
    public C11249a f28258b;

    /* renamed from: c */
    public File f28259c;

    /* renamed from: d */
    public String f28260d;

    /* renamed from: e */
    public InterfaceC10219g f28261e;

    /* renamed from: a */
    public final void m26475a(String path) {
        AbstractC9979u.m20294g(path, "path");
        this.f28260d = path;
    }

    /* renamed from: b */
    public final boolean m26476b() {
        return this.f28257a;
    }

    /* renamed from: c */
    public final void m26477c(InterfaceC10219g microPhoneListener) {
        AbstractC9979u.m20294g(microPhoneListener, "microPhoneListener");
        this.f28261e = microPhoneListener;
    }

    /* renamed from: d */
    public final void m26478d(InterfaceC9540l callback) {
        AbstractC9979u.m20294g(callback, "callback");
        C11249a c11249a = this.f28258b;
        if (c11249a == null) {
            this.f28258b = new C11249a();
        } else if (c11249a != null) {
            c11249a.m25106n();
        }
        try {
            String str = UUID.randomUUID() + ".mp3";
            String str2 = this.f28260d;
            if (str2 == null) {
                AbstractC9979u.m20312y("dir");
                str2 = null;
            }
            File file = new File(str2, str);
            this.f28259c = file;
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C11249a c11249a2 = this.f28258b;
            if (c11249a2 != null) {
                c11249a2.m25105m(-1, this.f28259c);
            }
            this.f28257a = true;
            InterfaceC10219g interfaceC10219g = this.f28261e;
            if (interfaceC10219g != null) {
                interfaceC10219g.mo19971a();
            }
            callback.invoke(str);
        } catch (Exception e10) {
            Log.e("SoundRecord", "soundStartRecording Exception " + e10.getMessage());
        }
    }

    /* renamed from: e */
    public final void m26479e(InterfaceC9544p callback) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC9979u.m20294g(callback, "callback");
        C11249a c11249a = this.f28258b;
        if (c11249a == null) {
            return;
        }
        try {
            AbstractC9979u.m20291d(c11249a);
            if (c11249a.m25104l()) {
                C11249a c11249a2 = this.f28258b;
                AbstractC9979u.m20291d(c11249a2);
                c11249a2.m25106n();
            }
            this.f28257a = false;
            InterfaceC10219g interfaceC10219g = this.f28261e;
            if (interfaceC10219g != null) {
                interfaceC10219g.mo19972b();
            }
            this.f28258b = null;
            File file = this.f28259c;
            if (file != null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setDataSource(file.getAbsolutePath());
                mediaPlayer.prepare();
                String name = file.getName();
                AbstractC9979u.m20293f(name, "it.name");
                callback.invoke(name, Long.valueOf(mediaPlayer.getDuration()));
            }
        } catch (Exception e10) {
            this.f28258b = null;
            File file2 = this.f28259c;
            if (file2 != null && file2.exists()) {
                File file3 = this.f28259c;
                AbstractC9979u.m20291d(file3);
                file3.delete();
            }
            Log.e("SoundRecord", "soundStopRecording Exception " + e10.getMessage());
        }
    }
}
