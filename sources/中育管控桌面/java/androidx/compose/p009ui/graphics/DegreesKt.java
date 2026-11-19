package androidx.compose.p009ui.graphics;

import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m7880d2 = {"RadiansToDegrees", "", "degrees", "radians", "ui-graphics_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class DegreesKt {
    private static final float RadiansToDegrees = 57.29578f;

    @PublishedApi
    public static final float degrees(float f6) {
        return f6 * RadiansToDegrees;
    }
}
