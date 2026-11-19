package p177n4;

import android.media.MediaPlayer;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035c5.InterfaceC5124g;
import p063d2.C7285a;

/* renamed from: n4.a */
/* loaded from: classes4.dex */
public final class C8621a {

    /* renamed from: a */
    public boolean f14271a;

    /* renamed from: b */
    public C7285a f14272b;

    /* renamed from: c */
    public File f14273c;

    /* renamed from: d */
    public String f14274d;

    /* renamed from: e */
    public InterfaceC5124g f14275e;

    /* renamed from: a */
    public final void m14193a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f14274d = path;
    }

    /* renamed from: b */
    public final boolean m14194b() {
        return this.f14271a;
    }

    /* renamed from: c */
    public final void m14195c(InterfaceC5124g microPhoneListener) {
        Intrinsics.checkNotNullParameter(microPhoneListener, "microPhoneListener");
        this.f14275e = microPhoneListener;
    }

    /* renamed from: d */
    public final void m14196d(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C7285a c7285a = this.f14272b;
        if (c7285a == null) {
            this.f14272b = new C7285a();
        } else if (c7285a != null) {
            c7285a.m11563n();
        }
        try {
            String str = UUID.randomUUID() + ".mp3";
            String str2 = this.f14274d;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dir");
                str2 = null;
            }
            File file = new File(str2, str);
            this.f14273c = file;
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C7285a c7285a2 = this.f14272b;
            if (c7285a2 != null) {
                c7285a2.m11562m(-1, this.f14273c);
            }
            this.f14271a = true;
            InterfaceC5124g interfaceC5124g = this.f14275e;
            if (interfaceC5124g != null) {
                interfaceC5124g.mo2785a();
            }
            callback.invoke(str);
        } catch (Exception e10) {
            Log.e("SoundRecord", "soundStartRecording Exception " + e10.getMessage());
        }
    }

    /* renamed from: e */
    public final void m14197e(Function2 callback) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C7285a c7285a = this.f14272b;
        if (c7285a == null) {
            return;
        }
        try {
            Intrinsics.checkNotNull(c7285a);
            if (c7285a.m11561l()) {
                C7285a c7285a2 = this.f14272b;
                Intrinsics.checkNotNull(c7285a2);
                c7285a2.m11563n();
            }
            this.f14271a = false;
            InterfaceC5124g interfaceC5124g = this.f14275e;
            if (interfaceC5124g != null) {
                interfaceC5124g.mo2786b();
            }
            this.f14272b = null;
            File file = this.f14273c;
            if (file != null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setDataSource(file.getAbsolutePath());
                mediaPlayer.prepare();
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
                callback.invoke(name, Long.valueOf(mediaPlayer.getDuration()));
            }
        } catch (Exception e10) {
            this.f14272b = null;
            File file2 = this.f14273c;
            if (file2 != null && file2.exists()) {
                File file3 = this.f14273c;
                Intrinsics.checkNotNull(file3);
                file3.delete();
            }
            Log.e("SoundRecord", "soundStopRecording Exception " + e10.getMessage());
        }
    }
}
