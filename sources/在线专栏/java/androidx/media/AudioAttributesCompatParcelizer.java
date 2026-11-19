package androidx.media;

import androidx.versionedparcelable.AbstractC0764a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0764a abstractC0764a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3480a = (AudioAttributesImpl) abstractC0764a.m4031v(audioAttributesCompat.f3480a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0764a abstractC0764a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC0764a.m4033x(false, false);
        abstractC0764a.m4012M(audioAttributesCompat.f3480a, 1);
    }
}
