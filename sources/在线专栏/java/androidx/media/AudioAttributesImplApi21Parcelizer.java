package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC0764a;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0764a abstractC0764a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3481a = (AudioAttributes) abstractC0764a.m4027r(audioAttributesImplApi21.f3481a, 1);
        audioAttributesImplApi21.f3482b = abstractC0764a.m4025p(audioAttributesImplApi21.f3482b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0764a abstractC0764a) {
        abstractC0764a.m4033x(false, false);
        abstractC0764a.m4007H(audioAttributesImplApi21.f3481a, 1);
        abstractC0764a.m4005F(audioAttributesImplApi21.f3482b, 2);
    }
}
