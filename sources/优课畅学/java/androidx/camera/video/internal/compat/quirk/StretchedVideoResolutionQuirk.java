package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @Nullable
    public Size getAlternativeResolution(int i10) {
        if (i10 == 4) {
            return new Size(TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, 480);
        }
        if (i10 == 5) {
            return new Size(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 720);
        }
        if (i10 != 6) {
            return null;
        }
        return new Size(1440, 1080);
    }
}
