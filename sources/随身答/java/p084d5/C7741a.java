package p084d5;

import android.media.MediaPlayer;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p031c2.C5222a;
import p243s5.InterfaceC9479g;

/* renamed from: d5.a */
/* loaded from: classes4.dex */
public final class C7741a {

    /* renamed from: a */
    public boolean f13040a;

    /* renamed from: b */
    public C5222a f13041b;

    /* renamed from: c */
    public File f13042c;

    /* renamed from: d */
    public String f13043d;

    /* renamed from: e */
    public InterfaceC9479g f13044e;

    /* renamed from: a */
    public final void m12085a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f13043d = path;
    }

    /* renamed from: b */
    public final boolean m12086b() {
        return this.f13040a;
    }

    /* renamed from: c */
    public final void m12087c(InterfaceC9479g microPhoneListener) {
        Intrinsics.checkNotNullParameter(microPhoneListener, "microPhoneListener");
        this.f13044e = microPhoneListener;
    }

    /* renamed from: d */
    public final void m12088d(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C5222a c5222a = this.f13041b;
        if (c5222a == null) {
            this.f13041b = new C5222a();
        } else if (c5222a != null) {
            c5222a.m2326n();
        }
        try {
            String str = UUID.randomUUID() + ".mp3";
            String str2 = this.f13043d;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dir");
                str2 = null;
            }
            File file = new File(str2, str);
            this.f13042c = file;
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C5222a c5222a2 = this.f13041b;
            if (c5222a2 != null) {
                c5222a2.m2325m(-1, this.f13042c);
            }
            this.f13040a = true;
            InterfaceC9479g interfaceC9479g = this.f13044e;
            if (interfaceC9479g != null) {
                interfaceC9479g.mo2225a();
            }
            callback.invoke(str);
        } catch (Exception e10) {
            Log.e("SoundRecord", "soundStartRecording Exception " + e10.getMessage());
        }
    }

    /* renamed from: e */
    public final void m12089e(Function2 callback) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C5222a c5222a = this.f13041b;
        if (c5222a == null) {
            return;
        }
        try {
            Intrinsics.checkNotNull(c5222a);
            if (c5222a.m2324l()) {
                C5222a c5222a2 = this.f13041b;
                Intrinsics.checkNotNull(c5222a2);
                c5222a2.m2326n();
            }
            this.f13040a = false;
            InterfaceC9479g interfaceC9479g = this.f13044e;
            if (interfaceC9479g != null) {
                interfaceC9479g.mo2226b();
            }
            this.f13041b = null;
            File file = this.f13042c;
            if (file != null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setDataSource(file.getAbsolutePath());
                mediaPlayer.prepare();
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
                callback.invoke(name, Long.valueOf(mediaPlayer.getDuration()));
            }
        } catch (Exception e10) {
            this.f13041b = null;
            File file2 = this.f13042c;
            if (file2 != null && file2.exists()) {
                File file3 = this.f13042c;
                Intrinsics.checkNotNull(file3);
                file3.delete();
            }
            Log.e("SoundRecord", "soundStopRecording Exception " + e10.getMessage());
        }
    }
}
