package androidx.compose.p011ui.text;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/ui/text/BulletSpanWithLevel;", "", "bullet", "Landroidx/compose/ui/text/Bullet;", "indentationLevel", "", "start", "(Landroidx/compose/ui/text/Bullet;II)V", "getBullet", "()Landroidx/compose/ui/text/Bullet;", "getIndentationLevel", "()I", "getStart", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class BulletSpanWithLevel {
    public static final int $stable = 8;

    @NotNull
    private final Bullet bullet;
    private final int indentationLevel;
    private final int start;

    public BulletSpanWithLevel(@NotNull Bullet bullet, int i, int i8) {
        this.bullet = bullet;
        this.indentationLevel = i;
        this.start = i8;
    }

    public static /* synthetic */ BulletSpanWithLevel copy$default(BulletSpanWithLevel bulletSpanWithLevel, Bullet bullet, int i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i9 & 2) != 0) {
            i = bulletSpanWithLevel.indentationLevel;
        }
        if ((i9 & 4) != 0) {
            i8 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.copy(bullet, i, i8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Bullet getBullet() {
        return this.bullet;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    @NotNull
    public final BulletSpanWithLevel copy(@NotNull Bullet bullet, int indentationLevel, int start) {
        return new BulletSpanWithLevel(bullet, indentationLevel, start);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) other;
        return AbstractC5830k.m5325b(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    @NotNull
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
        return Integer.hashCode(this.start) + AbstractC0584a.m902c(this.indentationLevel, this.bullet.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.bullet);
        sb.append(", indentationLevel=");
        sb.append(this.indentationLevel);
        sb.append(", start=");
        return AbstractC0037f.m88m(sb, this.start, ')');
    }
}
