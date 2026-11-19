package androidx.camera.video;

import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.video.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0478e implements EncoderFactory {
    @Override // androidx.camera.video.internal.encoder.EncoderFactory
    public final Encoder createEncoder(Executor executor, EncoderConfig encoderConfig) {
        return new EncoderImpl(executor, encoderConfig);
    }
}
