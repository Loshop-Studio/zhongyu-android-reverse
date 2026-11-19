package androidx.media;

import androidx.versionedparcelable.AbstractC0764a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0764a abstractC0764a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3483a = abstractC0764a.m4025p(audioAttributesImplBase.f3483a, 1);
        audioAttributesImplBase.f3484b = abstractC0764a.m4025p(audioAttributesImplBase.f3484b, 2);
        audioAttributesImplBase.f3485c = abstractC0764a.m4025p(audioAttributesImplBase.f3485c, 3);
        audioAttributesImplBase.f3486d = abstractC0764a.m4025p(audioAttributesImplBase.f3486d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0764a abstractC0764a) {
        abstractC0764a.m4033x(false, false);
        abstractC0764a.m4005F(audioAttributesImplBase.f3483a, 1);
        abstractC0764a.m4005F(audioAttributesImplBase.f3484b, 2);
        abstractC0764a.m4005F(audioAttributesImplBase.f3485c, 3);
        abstractC0764a.m4005F(audioAttributesImplBase.f3486d, 4);
    }
}
