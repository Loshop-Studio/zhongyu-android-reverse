package com.tencent.liteav.txcvodplayer;

import android.view.View;
import androidx.annotation.NonNull;
import com.tencent.ijk.media.player.IMediaPlayer;

/* renamed from: com.tencent.liteav.txcvodplayer.a */
/* loaded from: classes4.dex */
public interface InterfaceC6704a {

    /* renamed from: com.tencent.liteav.txcvodplayer.a$a */
    public interface a {
        /* renamed from: a */
        void mo5608a(@NonNull b bVar);

        /* renamed from: a */
        void mo5609a(@NonNull b bVar, int i10, int i11);

        /* renamed from: a */
        void mo5610a(@NonNull b bVar, int i10, int i11, int i12);
    }

    /* renamed from: com.tencent.liteav.txcvodplayer.a$b */
    public interface b {
        @NonNull
        /* renamed from: a */
        InterfaceC6704a mo5544a();

        /* renamed from: a */
        void mo5545a(IMediaPlayer iMediaPlayer);
    }

    void addRenderCallback(@NonNull a aVar);

    View getView();

    void removeRenderCallback(@NonNull a aVar);

    void setAspectRatio(int i10);

    void setVideoRotation(int i10);

    void setVideoSampleAspectRatio(int i10, int i11);

    void setVideoSize(int i10, int i11);

    boolean shouldWaitForResize();
}
