package androidx.compose.p013ui.text;

import androidx.compose.p013ui.graphics.drawscope.Fill;
import androidx.compose.p013ui.unit.TextUnitKt;

/* loaded from: classes2.dex */
public final class BulletKt {
    private static final Bullet DefaultBullet;
    private static final long DefaultBulletIndentation = TextUnitKt.getEm(1);
    private static final long DefaultBulletPadding;
    private static final long DefaultBulletSize;

    static {
        long em = TextUnitKt.getEm(0.25d);
        DefaultBulletSize = em;
        long em2 = TextUnitKt.getEm(0.25d);
        DefaultBulletPadding = em2;
        DefaultBullet = new Bullet(CircleShape.INSTANCE, em, em2, null, 1.0f, Fill.INSTANCE, null);
    }

    public static final Bullet getDefaultBullet() {
        return DefaultBullet;
    }

    public static final long getDefaultBulletIndentation() {
        return DefaultBulletIndentation;
    }
}
