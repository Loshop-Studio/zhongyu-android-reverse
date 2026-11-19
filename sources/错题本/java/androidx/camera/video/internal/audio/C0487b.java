package androidx.camera.video.internal.audio;

import android.content.Context;

/* renamed from: androidx.camera.video.internal.audio.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0487b implements AudioStreamFactory {
    @Override // androidx.camera.video.internal.audio.AudioStreamFactory
    public final AudioStream create(AudioSettings audioSettings, Context context) {
        return new AudioStreamImpl(audioSettings, context);
    }
}
