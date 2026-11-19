package androidx.compose.p011ui.platform;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m5110d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,81:1\n49#2:82\n49#2:83\n49#2:84\n49#2:85\n49#2:86\n49#2:87\n49#2:88\n49#2:89\n49#2:90\n49#2:91\n49#2:92\n49#2:93\n49#2:94\n49#2:95\n49#2:96\n49#2:97\n52#2,2:98\n52#2,2:100\n52#2,2:102\n52#2,2:104\n52#2,2:106\n52#2,2:108\n52#2,2:110\n52#2,2:112\n52#2,2:114\n52#2,2:116\n52#2,2:118\n52#2,2:120\n52#2,2:122\n52#2,2:124\n52#2,2:126\n52#2,2:128\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n42#1:95\n43#1:96\n44#1:97\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n76#1:126,2\n77#1:128,2\n*E\n"})
/* loaded from: classes2.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m12471invertToJiSxe2E(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[11];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = fArr[15];
        float f22 = (f * f11) - (f7 * f10);
        float f23 = (f * f12) - (f8 * f10);
        float f24 = (f * f13) - (f9 * f10);
        float f25 = (f7 * f12) - (f8 * f11);
        float f26 = (f7 * f13) - (f9 * f11);
        float f27 = (f8 * f13) - (f9 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (f27 * f28) + (((f25 * f30) + ((f24 * f31) + ((f22 * f33) - (f23 * f32)))) - (f26 * f29));
        if (f34 != 0.0f) {
            float f35 = 1.0f / f34;
            fArr2[0] = AbstractC0584a.m925z(f13, f31, (f11 * f33) - (f12 * f32), f35);
            fArr2[1] = AbstractC1923c.m1061y(f9, f31, (f8 * f32) + ((-f7) * f33), f35);
            fArr2[2] = AbstractC0584a.m925z(f21, f25, (f19 * f27) - (f20 * f26), f35);
            fArr2[3] = AbstractC1923c.m1061y(f17, f25, (f16 * f26) + ((-f15) * f27), f35);
            float f36 = -f10;
            fArr2[4] = AbstractC1923c.m1061y(f13, f29, (f12 * f30) + (f36 * f33), f35);
            fArr2[5] = AbstractC0584a.m925z(f9, f29, (f33 * f) - (f8 * f30), f35);
            float f37 = -f18;
            fArr2[6] = AbstractC1923c.m1061y(f21, f23, (f20 * f24) + (f37 * f27), f35);
            fArr2[7] = AbstractC0584a.m925z(f17, f23, (f14 * f27) - (f16 * f24), f35);
            fArr2[8] = AbstractC0584a.m925z(f13, f28, (f10 * f32) - (f11 * f30), f35);
            fArr2[9] = AbstractC1923c.m1061y(f9, f28, (f30 * f7) + ((-f) * f32), f35);
            fArr2[10] = AbstractC0584a.m925z(f21, f22, (f18 * f26) - (f19 * f24), f35);
            fArr2[11] = AbstractC1923c.m1061y(f17, f22, (f24 * f15) + ((-f14) * f26), f35);
            fArr2[12] = AbstractC1923c.m1061y(f12, f28, (f11 * f29) + (f36 * f31), f35);
            fArr2[13] = AbstractC0584a.m925z(f8, f28, (f * f31) - (f7 * f29), f35);
            fArr2[14] = AbstractC1923c.m1061y(f20, f22, (f19 * f23) + (f37 * f25), f35);
            fArr2[15] = AbstractC0584a.m925z(f16, f22, (f14 * f25) - (f15 * f23), f35);
        }
        return !(f34 == 0.0f);
    }
}
