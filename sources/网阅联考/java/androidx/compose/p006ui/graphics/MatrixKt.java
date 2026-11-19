package androidx.compose.p006ui.graphics;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u000b*\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m5175d2 = {"dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "isIdentity", "", "isIdentity-58bKbWc", "([F)Z", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#2:441\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:441\n424#1:442\n425#1:443\n426#1:444\n434#1:445\n*E\n"})
/* loaded from: classes.dex */
public final class MatrixKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dot-p89u6pk, reason: not valid java name */
    public static final float m9406dotp89u6pk(float[] fArr, int i4, float[] fArr2, int i5) {
        int i6 = i4 * 4;
        return (fArr[i6 + 0] * fArr2[0 + i5]) + (fArr[i6 + 1] * fArr2[4 + i5]) + (fArr[i6 + 2] * fArr2[8 + i5]) + (fArr[i6 + 3] * fArr2[12 + i5]);
    }

    /* renamed from: isIdentity-58bKbWc, reason: not valid java name */
    public static final boolean m9407isIdentity58bKbWc(float[] isIdentity) {
        Intrinsics.checkNotNullParameter(isIdentity, "$this$isIdentity");
        int i4 = 0;
        while (i4 < 4) {
            int i5 = 0;
            while (i5 < 4) {
                if (!(isIdentity[(i4 * 4) + i5] == (i4 == i5 ? 1.0f : 0.0f))) {
                    return false;
                }
                i5++;
            }
            i4++;
        }
        return true;
    }
}
