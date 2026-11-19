package androidx.compose.p006ui.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, m5175d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,77:1\n39#2:78\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n42#2,2:94\n42#2,2:96\n42#2,2:98\n42#2,2:100\n42#2,2:102\n42#2,2:104\n42#2,2:106\n42#2,2:108\n42#2,2:110\n42#2,2:112\n42#2,2:114\n42#2,2:116\n42#2,2:118\n42#2,2:120\n42#2,2:122\n42#2,2:124\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:78\n27#1:79\n28#1:80\n29#1:81\n30#1:82\n31#1:83\n32#1:84\n33#1:85\n34#1:86\n35#1:87\n36#1:88\n37#1:89\n38#1:90\n39#1:91\n40#1:92\n41#1:93\n60#1:94,2\n61#1:96,2\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n*E\n"})
/* loaded from: classes.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m10875invertToJiSxe2E(float[] invertTo, float[] other) {
        Intrinsics.checkNotNullParameter(invertTo, "$this$invertTo");
        Intrinsics.checkNotNullParameter(other, "other");
        float f4 = invertTo[0];
        float f5 = invertTo[1];
        float f6 = invertTo[2];
        float f7 = invertTo[3];
        float f8 = invertTo[4];
        float f9 = invertTo[5];
        float f10 = invertTo[6];
        float f11 = invertTo[7];
        float f12 = invertTo[8];
        float f13 = invertTo[9];
        float f14 = invertTo[10];
        float f15 = invertTo[11];
        float f16 = invertTo[12];
        float f17 = invertTo[13];
        float f18 = invertTo[14];
        float f19 = invertTo[15];
        float f20 = (f4 * f9) - (f5 * f8);
        float f21 = (f4 * f10) - (f6 * f8);
        float f22 = (f4 * f11) - (f7 * f8);
        float f23 = (f5 * f10) - (f6 * f9);
        float f24 = (f5 * f11) - (f7 * f9);
        float f25 = (f6 * f11) - (f7 * f10);
        float f26 = (f12 * f17) - (f13 * f16);
        float f27 = (f12 * f18) - (f14 * f16);
        float f28 = (f12 * f19) - (f15 * f16);
        float f29 = (f13 * f18) - (f14 * f17);
        float f30 = (f13 * f19) - (f15 * f17);
        float f31 = (f14 * f19) - (f15 * f18);
        float f32 = (((((f20 * f31) - (f21 * f30)) + (f22 * f29)) + (f23 * f28)) - (f24 * f27)) + (f25 * f26);
        if (f32 == 0.0f) {
            return false;
        }
        float f33 = 1.0f / f32;
        other[0] = (((f9 * f31) - (f10 * f30)) + (f11 * f29)) * f33;
        other[1] = ((((-f5) * f31) + (f6 * f30)) - (f7 * f29)) * f33;
        other[2] = (((f17 * f25) - (f18 * f24)) + (f19 * f23)) * f33;
        other[3] = ((((-f13) * f25) + (f14 * f24)) - (f15 * f23)) * f33;
        float f34 = -f8;
        other[4] = (((f34 * f31) + (f10 * f28)) - (f11 * f27)) * f33;
        other[5] = (((f31 * f4) - (f6 * f28)) + (f7 * f27)) * f33;
        float f35 = -f16;
        other[6] = (((f35 * f25) + (f18 * f22)) - (f19 * f21)) * f33;
        other[7] = (((f25 * f12) - (f14 * f22)) + (f15 * f21)) * f33;
        other[8] = (((f8 * f30) - (f9 * f28)) + (f11 * f26)) * f33;
        other[9] = ((((-f4) * f30) + (f28 * f5)) - (f7 * f26)) * f33;
        other[10] = (((f16 * f24) - (f17 * f22)) + (f19 * f20)) * f33;
        other[11] = ((((-f12) * f24) + (f22 * f13)) - (f15 * f20)) * f33;
        other[12] = (((f34 * f29) + (f9 * f27)) - (f10 * f26)) * f33;
        other[13] = (((f4 * f29) - (f5 * f27)) + (f6 * f26)) * f33;
        other[14] = (((f35 * f23) + (f17 * f21)) - (f18 * f20)) * f33;
        other[15] = (((f12 * f23) - (f13 * f21)) + (f14 * f20)) * f33;
        return true;
    }
}
