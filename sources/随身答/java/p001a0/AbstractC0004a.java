package p001a0;

import android.support.v4.media.session.PlaybackStateCompat;
import okio.BufferedSource;
import okio.ByteString;
import p018b0.AbstractC5088e;
import p183n.C9060h;

/* renamed from: a0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0004a {

    /* renamed from: a */
    public static final ByteString f1a;

    /* renamed from: b */
    public static final ByteString f2b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f1a = companion.encodeUtf8("<svg");
        f2b = companion.encodeUtf8("<");
    }

    /* renamed from: a */
    public static final boolean m5a(C9060h c9060h, BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, f2b) && AbstractC5088e.m2130a(bufferedSource, f1a, 0L, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) != -1;
    }
}
