package androidx.compose.p012ui.util;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0086\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b¨\u0006\u000e"}, m13413d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackAbsFloat1", "value", "unpackAbsFloat2", "unpackFloat1", "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,92:1\n22#2:93\n22#2:94\n22#2:95\n22#2:96\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n60#1:93\n65#1:94\n70#1:95\n75#1:96\n*E\n"})
/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long packInts(int i9, int i10) {
        return (i10 & 4294967295L) | (i9 << 32);
    }

    public static final float unpackAbsFloat1(long j9) {
        return Float.intBitsToFloat((int) ((j9 >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackAbsFloat2(long j9) {
        return Float.intBitsToFloat((int) (j9 & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat1(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float unpackFloat2(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final int unpackInt1(long j9) {
        return (int) (j9 >> 32);
    }

    public static final int unpackInt2(long j9) {
        return (int) (j9 & 4294967295L);
    }
}
