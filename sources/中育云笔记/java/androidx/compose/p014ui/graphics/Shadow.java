package androidx.compose.p014ui.graphics;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class Shadow {
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, AbstractC9972n abstractC9972n) {
        this(j10, j11, f10);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m31199copyqcb84PM$default(Shadow shadow, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = shadow.color;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = shadow.offset;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = shadow.blurRadius;
        }
        return shadow.m31202copyqcb84PM(j12, j13, f10);
    }

    @Stable
    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    @Stable
    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m31200getColor0d7_KjU$annotations() {
    }

    @Stable
    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m31201getOffsetF1C5BW0$annotations() {
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m31202copyqcb84PM(long j10, long j11, float f10) {
        return new Shadow(j10, j11, f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m30879equalsimpl0(this.color, shadow.color) && Offset.m30634equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m31203getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m31204getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m30885hashCodeimpl(this.color) * 31) + Offset.m30639hashCodeimpl(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m30886toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m30645toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j10, long j11, float f10) {
        this.color = j10;
        this.offset = j11;
        this.blurRadius = f10;
    }

    public /* synthetic */ Shadow(long j10, long j11, float f10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? ColorKt.Color(4278190080L) : j10, (i10 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
