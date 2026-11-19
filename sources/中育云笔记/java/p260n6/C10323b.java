package p260n6;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.widget.MediaPlayerView;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import p304q6.InterfaceC10744d;

/* renamed from: n6.b */
/* loaded from: classes5.dex */
public class C10323b implements InterfaceC10325d {

    /* renamed from: a */
    public final CopyOnWriteArrayList f24600a = new CopyOnWriteArrayList();

    /* renamed from: n6.b$a */
    public class a implements MediaPlayer.OnPreparedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
            mediaPlayer.start();
            for (int i10 = 0; i10 < C10323b.this.f24600a.size(); i10++) {
                ((InterfaceC10744d) C10323b.this.f24600a.get(i10)).mo9234a();
            }
        }
    }

    /* renamed from: n6.b$b */
    public class b implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ MediaPlayerView f24602a;

        public b(MediaPlayerView mediaPlayerView) {
            this.f24602a = mediaPlayerView;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.reset();
            for (int i10 = 0; i10 < C10323b.this.f24600a.size(); i10++) {
                ((InterfaceC10744d) C10323b.this.f24600a.get(i10)).mo9235b();
            }
            this.f24602a.m9615b();
        }
    }

    /* renamed from: n6.b$c */
    public class c implements MediaPlayer.OnErrorListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            for (int i12 = 0; i12 < C10323b.this.f24600a.size(); i12++) {
                ((InterfaceC10744d) C10323b.this.f24600a.get(i12)).mo9236c();
            }
            return false;
        }
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: a */
    public View mo21536a(Context context) {
        return new MediaPlayerView(context);
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: d */
    public void mo21539d(InterfaceC10744d interfaceC10744d) {
        if (interfaceC10744d != null) {
            this.f24600a.remove(interfaceC10744d);
        } else {
            this.f24600a.clear();
        }
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: h */
    public void mo21543h(InterfaceC10744d interfaceC10744d) {
        if (this.f24600a.contains(interfaceC10744d)) {
            return;
        }
        this.f24600a.add(interfaceC10744d);
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21538c(MediaPlayerView mediaPlayerView) {
        mediaPlayerView.m9618e();
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean mo21545j(MediaPlayerView mediaPlayerView) {
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21544i(MediaPlayerView mediaPlayerView) throws IllegalStateException {
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo21542g(MediaPlayerView mediaPlayerView) {
        MediaPlayer mediaPlayerM9617d = mediaPlayerView.m9617d();
        mediaPlayerM9617d.setOnPreparedListener(new a());
        mediaPlayerM9617d.setOnCompletionListener(new b(mediaPlayerView));
        mediaPlayerM9617d.setOnErrorListener(new c());
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21540e(MediaPlayerView mediaPlayerView) {
        mediaPlayerView.m9618e();
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21537b(MediaPlayerView mediaPlayerView) throws IllegalStateException {
        MediaPlayer mediaPlayer = mediaPlayerView.getMediaPlayer();
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // p260n6.InterfaceC10325d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo21541f(MediaPlayerView mediaPlayerView, LocalMedia localMedia) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        mediaPlayerView.getMediaPlayer().setLooping(PictureSelectionConfig.m9328c().f12313H0);
        mediaPlayerView.m9619f(localMedia.m9371g());
    }
}
