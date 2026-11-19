package androidx.compose.p014ui.graphics.drawscope;

import androidx.compose.p014ui.graphics.PathEffect;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class Stroke extends DrawStyle {
    public static final Companion Companion = new Companion(null);
    private static final int DefaultCap = StrokeCap.Companion.m31231getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m31242getMiterLxFBmk8();
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m31500getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m31501getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, PathEffect pathEffect, AbstractC9972n abstractC9972n) {
        this(f10, f11, i10, i11, pathEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m31227equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m31237equalsimpl0(this.join, stroke.join) && AbstractC9979u.m20289b(this.pathEffect, stroke.pathEffect);
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m31498getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m31499getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + StrokeCap.m31228hashCodeimpl(this.cap)) * 31) + StrokeJoin.m31238hashCodeimpl(this.join)) * 31;
        PathEffect pathEffect = this.pathEffect;
        return iHashCode + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m31229toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m31239toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    public /* synthetic */ Stroke(float f10, float f11, int i10, int i11, PathEffect pathEffect, int i12, AbstractC9972n abstractC9972n) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? DefaultCap : i10, (i12 & 8) != 0 ? DefaultJoin : i11, (i12 & 16) != 0 ? null : pathEffect, null);
    }

    private Stroke(float f10, float f11, int i10, int i11, PathEffect pathEffect) {
        super(null);
        this.width = f10;
        this.miter = f11;
        this.cap = i10;
        this.join = i11;
        this.pathEffect = pathEffect;
    }
}
