package androidx.compose.p014ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class BulletSpanWithLevel {
    public static final int $stable = 8;
    private final Bullet bullet;
    private final int indentationLevel;
    private final int start;

    public BulletSpanWithLevel(Bullet bullet, int i10, int i11) {
        this.bullet = bullet;
        this.indentationLevel = i10;
        this.start = i11;
    }

    public static /* synthetic */ BulletSpanWithLevel copy$default(BulletSpanWithLevel bulletSpanWithLevel, Bullet bullet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i12 & 2) != 0) {
            i10 = bulletSpanWithLevel.indentationLevel;
        }
        if ((i12 & 4) != 0) {
            i11 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.copy(bullet, i10, i11);
    }

    public final Bullet component1() {
        return this.bullet;
    }

    public final int component2() {
        return this.indentationLevel;
    }

    public final int component3() {
        return this.start;
    }

    public final BulletSpanWithLevel copy(Bullet bullet, int i10, int i11) {
        return new BulletSpanWithLevel(bullet, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return AbstractC9979u.m20289b(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    public final Bullet getBullet() {
        return this.bullet;
    }

    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.bullet.hashCode() * 31) + Integer.hashCode(this.indentationLevel)) * 31) + Integer.hashCode(this.start);
    }

    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.bullet + ", indentationLevel=" + this.indentationLevel + ", start=" + this.start + ')';
    }
}
