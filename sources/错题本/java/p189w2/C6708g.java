package p189w2;

import android.media.MediaPlayer;
import android.widget.Toast;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.widget.imageview.preview.p034ui.VideoPlayerActivity;

/* renamed from: w2.g */
/* loaded from: classes3.dex */
public final class C6708g implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ VideoPlayerActivity f11320a;

    public C6708g(VideoPlayerActivity videoPlayerActivity) {
        this.f11320a = videoPlayerActivity;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i8) {
        Toast.makeText(this.f11320a, R$string.xui_preview_play_failed, 0).show();
        return false;
    }
}
