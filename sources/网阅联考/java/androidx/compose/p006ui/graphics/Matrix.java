package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.geometry.MutableRect;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;

@Metadata(m5174d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 G2\u00020\u0001:\u0001GB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b/\u0010+J+\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001e\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ+\u0010E\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\bF\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006H"}, m5175d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", C3335ai.f1661aB, "scale-impl", "([FFFF)V", "set", C3335ai.f1662aC, "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#1:441\n39#1:442\n39#1:443\n42#1,2:444\n42#1,2:446\n42#1,2:448\n42#1,2:450\n42#1,2:452\n42#1,2:454\n42#1,2:456\n42#1,2:458\n42#1,2:460\n42#1,2:462\n42#1,2:464\n42#1,2:466\n42#1,2:468\n42#1,2:470\n42#1,2:472\n42#1,2:474\n39#1:476\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n42#1,2:496\n42#1,2:498\n42#1,2:500\n42#1,2:502\n42#1,2:504\n42#1,2:506\n42#1,2:508\n42#1,2:510\n42#1,2:512\n42#1,2:514\n42#1,2:516\n42#1,2:518\n42#1,2:520\n42#1,2:522\n42#1,2:524\n42#1,2:526\n42#1,2:528\n39#1:530\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n42#1,2:538\n42#1,2:540\n42#1,2:542\n42#1,2:544\n42#1,2:546\n42#1,2:548\n42#1,2:550\n42#1,2:552\n39#1:554\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n42#1,2:562\n42#1,2:564\n42#1,2:566\n42#1,2:568\n42#1,2:570\n42#1,2:572\n42#1,2:574\n42#1,2:576\n39#1:578\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n42#1,2:586\n42#1,2:588\n42#1,2:590\n42#1,2:592\n42#1,2:594\n42#1,2:596\n42#1,2:598\n42#1,2:600\n39#1,5:602\n39#1,5:607\n39#1,5:612\n39#1,5:617\n39#1,5:622\n39#1,5:627\n39#1,5:632\n39#1,5:637\n39#1,5:642\n39#1,5:647\n39#1,5:652\n39#1,5:657\n39#1:662\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n42#1,2:678\n42#1,2:680\n42#1,2:682\n42#1,2:684\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:441\n56#1:442\n57#1:443\n112#1:444,2\n113#1:446,2\n114#1:448,2\n115#1:450,2\n116#1:452,2\n117#1:454,2\n118#1:456,2\n119#1:458,2\n120#1:460,2\n121#1:462,2\n122#1:464,2\n123#1:466,2\n124#1:468,2\n125#1:470,2\n126#1:472,2\n127#1:474,2\n132#1:476\n133#1:477\n134#1:478\n135#1:479\n143#1:480\n144#1:481\n145#1:482\n146#1:483\n147#1:484\n148#1:485\n149#1:486\n150#1:487\n151#1:488\n152#1:489\n153#1:490\n154#1:491\n155#1:492\n156#1:493\n157#1:494\n158#1:495\n177#1:496,2\n178#1:498,2\n179#1:500,2\n180#1:502,2\n181#1:504,2\n182#1:506,2\n183#1:508,2\n184#1:510,2\n185#1:512,2\n186#1:514,2\n187#1:516,2\n188#1:518,2\n189#1:520,2\n190#1:522,2\n191#1:524,2\n192#1:526,2\n201#1:528,2\n220#1:530\n221#1:531\n225#1:532\n226#1:533\n230#1:534\n231#1:535\n235#1:536\n236#1:537\n240#1:538,2\n241#1:540,2\n242#1:542,2\n243#1:544,2\n244#1:546,2\n245#1:548,2\n246#1:550,2\n247#1:552,2\n257#1:554\n258#1:555\n262#1:556\n263#1:557\n267#1:558\n268#1:559\n272#1:560\n273#1:561\n277#1:562,2\n278#1:564,2\n279#1:566,2\n280#1:568,2\n281#1:570,2\n282#1:572,2\n283#1:574,2\n284#1:576,2\n294#1:578\n295#1:579\n299#1:580\n300#1:581\n304#1:582\n305#1:583\n309#1:584\n310#1:585\n314#1:586,2\n315#1:588,2\n316#1:590,2\n317#1:592,2\n318#1:594,2\n319#1:596,2\n320#1:598,2\n321#1:600,2\n326#1:602,5\n327#1:607,5\n328#1:612,5\n329#1:617,5\n330#1:622,5\n331#1:627,5\n332#1:632,5\n333#1:637,5\n334#1:642,5\n335#1:647,5\n336#1:652,5\n337#1:657,5\n342#1:662\n343#1:663\n344#1:664\n345#1:665\n346#1:666\n347#1:667\n348#1:668\n349#1:669\n350#1:670\n351#1:671\n352#1:672\n353#1:673\n354#1:674\n355#1:675\n356#1:676\n357#1:677\n358#1:678,2\n359#1:680,2\n360#1:682,2\n361#1:684,2\n*E\n"})
/* loaded from: classes.dex */
public final class Matrix {
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m9381boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m9382constructorimpl(float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m9383constructorimpl$default(float[] fArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m9382constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9384equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m9404unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9385equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m9386getimpl(float[] fArr, int i4, int i5) {
        return fArr[(i4 * 4) + i5];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9387hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m9388invertimpl(float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[9];
        float f14 = fArr[10];
        float f15 = fArr[11];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[14];
        float f19 = fArr[15];
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
            return;
        }
        float f33 = 1.0f / f32;
        fArr[0] = (((f9 * f31) - (f10 * f30)) + (f11 * f29)) * f33;
        fArr[1] = ((((-f5) * f31) + (f6 * f30)) - (f7 * f29)) * f33;
        fArr[2] = (((f17 * f25) - (f18 * f24)) + (f19 * f23)) * f33;
        fArr[3] = ((((-f13) * f25) + (f14 * f24)) - (f15 * f23)) * f33;
        float f34 = -f8;
        fArr[4] = (((f34 * f31) + (f10 * f28)) - (f11 * f27)) * f33;
        fArr[5] = (((f31 * f4) - (f6 * f28)) + (f7 * f27)) * f33;
        float f35 = -f16;
        fArr[6] = (((f35 * f25) + (f18 * f22)) - (f19 * f21)) * f33;
        fArr[7] = (((f25 * f12) - (f14 * f22)) + (f15 * f21)) * f33;
        fArr[8] = (((f8 * f30) - (f9 * f28)) + (f11 * f26)) * f33;
        fArr[9] = ((((-f4) * f30) + (f28 * f5)) - (f7 * f26)) * f33;
        fArr[10] = (((f16 * f24) - (f17 * f22)) + (f19 * f20)) * f33;
        fArr[11] = ((((-f12) * f24) + (f22 * f13)) - (f15 * f20)) * f33;
        fArr[12] = (((f34 * f29) + (f9 * f27)) - (f10 * f26)) * f33;
        fArr[13] = (((f4 * f29) - (f5 * f27)) + (f6 * f26)) * f33;
        fArr[14] = (((f35 * f23) + (f17 * f21)) - (f18 * f20)) * f33;
        fArr[15] = (((f12 * f23) - (f13 * f21)) + (f14 * f20)) * f33;
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m9389mapMKHz9U(float[] fArr, long j4) {
        float fM8945getXimpl = Offset.m8945getXimpl(j4);
        float fM8946getYimpl = Offset.m8946getYimpl(j4);
        float f4 = 1 / (((fArr[3] * fM8945getXimpl) + (fArr[7] * fM8946getYimpl)) + fArr[15]);
        if (!((Float.isInfinite(f4) || Float.isNaN(f4)) ? false : true)) {
            f4 = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * fM8945getXimpl) + (fArr[4] * fM8946getYimpl) + fArr[12]) * f4, f4 * ((fArr[1] * fM8945getXimpl) + (fArr[5] * fM8946getYimpl) + fArr[13]));
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m9390mapimpl(float[] fArr, Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jM9389mapMKHz9U = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM9389mapMKHz9U2 = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM9389mapMKHz9U3 = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM9389mapMKHz9U4 = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m8945getXimpl(jM9389mapMKHz9U), Offset.m8945getXimpl(jM9389mapMKHz9U2)), Math.min(Offset.m8945getXimpl(jM9389mapMKHz9U3), Offset.m8945getXimpl(jM9389mapMKHz9U4))), Math.min(Math.min(Offset.m8946getYimpl(jM9389mapMKHz9U), Offset.m8946getYimpl(jM9389mapMKHz9U2)), Math.min(Offset.m8946getYimpl(jM9389mapMKHz9U3), Offset.m8946getYimpl(jM9389mapMKHz9U4))), Math.max(Math.max(Offset.m8945getXimpl(jM9389mapMKHz9U), Offset.m8945getXimpl(jM9389mapMKHz9U2)), Math.max(Offset.m8945getXimpl(jM9389mapMKHz9U3), Offset.m8945getXimpl(jM9389mapMKHz9U4))), Math.max(Math.max(Offset.m8946getYimpl(jM9389mapMKHz9U), Offset.m8946getYimpl(jM9389mapMKHz9U2)), Math.max(Offset.m8946getYimpl(jM9389mapMKHz9U3), Offset.m8946getYimpl(jM9389mapMKHz9U4))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m9392resetimpl(float[] fArr) {
        int i4 = 0;
        while (i4 < 4) {
            int i5 = 0;
            while (i5 < 4) {
                fArr[(i5 * 4) + i4] = i4 == i5 ? 1.0f : 0.0f;
                i5++;
            }
            i4++;
        }
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m9393rotateXimpl(float[] fArr, float f4) {
        double d4 = (f4 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d4);
        float fSin = (float) Math.sin(d4);
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[9];
        float f10 = fArr[10];
        float f11 = fArr[13];
        float f12 = fArr[14];
        fArr[1] = (f5 * fCos) - (f6 * fSin);
        fArr[2] = (f5 * fSin) + (f6 * fCos);
        fArr[5] = (f7 * fCos) - (f8 * fSin);
        fArr[6] = (f7 * fSin) + (f8 * fCos);
        fArr[9] = (f9 * fCos) - (f10 * fSin);
        fArr[10] = (f9 * fSin) + (f10 * fCos);
        fArr[13] = (f11 * fCos) - (f12 * fSin);
        fArr[14] = (f11 * fSin) + (f12 * fCos);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m9394rotateYimpl(float[] fArr, float f4) {
        double d4 = (f4 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d4);
        float fSin = (float) Math.sin(d4);
        float f5 = fArr[0];
        float f6 = fArr[2];
        float f7 = fArr[4];
        float f8 = fArr[6];
        float f9 = fArr[8];
        float f10 = fArr[10];
        float f11 = fArr[12];
        float f12 = fArr[14];
        fArr[0] = (f5 * fCos) + (f6 * fSin);
        fArr[2] = ((-f5) * fSin) + (f6 * fCos);
        fArr[4] = (f7 * fCos) + (f8 * fSin);
        fArr[6] = ((-f7) * fSin) + (f8 * fCos);
        fArr[8] = (f9 * fCos) + (f10 * fSin);
        fArr[10] = ((-f9) * fSin) + (f10 * fCos);
        fArr[12] = (f11 * fCos) + (f12 * fSin);
        fArr[14] = ((-f11) * fSin) + (f12 * fCos);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m9395rotateZimpl(float[] fArr, float f4) {
        double d4 = (f4 * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d4);
        float fSin = (float) Math.sin(d4);
        float f5 = fArr[0];
        float f6 = fArr[4];
        float f7 = -fSin;
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = fArr[2];
        float f11 = fArr[6];
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = (fCos * f5) + (fSin * f6);
        fArr[1] = (fCos * f8) + (fSin * f9);
        fArr[2] = (fCos * f10) + (fSin * f11);
        fArr[3] = (fCos * f12) + (fSin * f13);
        fArr[4] = (f5 * f7) + (f6 * fCos);
        fArr[5] = (f8 * f7) + (f9 * fCos);
        fArr[6] = (f10 * f7) + (f11 * fCos);
        fArr[7] = (f7 * f12) + (fCos * f13);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m9396scaleimpl(float[] fArr, float f4, float f5, float f6) {
        fArr[0] = fArr[0] * f4;
        fArr[1] = fArr[1] * f4;
        fArr[2] = fArr[2] * f4;
        fArr[3] = fArr[3] * f4;
        fArr[4] = fArr[4] * f5;
        fArr[5] = fArr[5] * f5;
        fArr[6] = fArr[6] * f5;
        fArr[7] = fArr[7] * f5;
        fArr[8] = fArr[8] * f6;
        fArr[9] = fArr[9] * f6;
        fArr[10] = fArr[10] * f6;
        fArr[11] = fArr[11] * f6;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m9397scaleimpl$default(float[] fArr, float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 1.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 1.0f;
        }
        m9396scaleimpl(fArr, f4, f5, f6);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m9398setimpl(float[] fArr, int i4, int i5, float f4) {
        fArr[(i4 * 4) + i5] = f4;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m9399setFrom58bKbWc(float[] fArr, float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i4 = 0; i4 < 16; i4++) {
            fArr[i4] = matrix[i4];
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m9400timesAssign58bKbWc(float[] fArr, float[] m4) {
        Intrinsics.checkNotNullParameter(m4, "m");
        float fM9406dotp89u6pk = MatrixKt.m9406dotp89u6pk(fArr, 0, m4, 0);
        float fM9406dotp89u6pk2 = MatrixKt.m9406dotp89u6pk(fArr, 0, m4, 1);
        float fM9406dotp89u6pk3 = MatrixKt.m9406dotp89u6pk(fArr, 0, m4, 2);
        float fM9406dotp89u6pk4 = MatrixKt.m9406dotp89u6pk(fArr, 0, m4, 3);
        float fM9406dotp89u6pk5 = MatrixKt.m9406dotp89u6pk(fArr, 1, m4, 0);
        float fM9406dotp89u6pk6 = MatrixKt.m9406dotp89u6pk(fArr, 1, m4, 1);
        float fM9406dotp89u6pk7 = MatrixKt.m9406dotp89u6pk(fArr, 1, m4, 2);
        float fM9406dotp89u6pk8 = MatrixKt.m9406dotp89u6pk(fArr, 1, m4, 3);
        float fM9406dotp89u6pk9 = MatrixKt.m9406dotp89u6pk(fArr, 2, m4, 0);
        float fM9406dotp89u6pk10 = MatrixKt.m9406dotp89u6pk(fArr, 2, m4, 1);
        float fM9406dotp89u6pk11 = MatrixKt.m9406dotp89u6pk(fArr, 2, m4, 2);
        float fM9406dotp89u6pk12 = MatrixKt.m9406dotp89u6pk(fArr, 2, m4, 3);
        float fM9406dotp89u6pk13 = MatrixKt.m9406dotp89u6pk(fArr, 3, m4, 0);
        float fM9406dotp89u6pk14 = MatrixKt.m9406dotp89u6pk(fArr, 3, m4, 1);
        float fM9406dotp89u6pk15 = MatrixKt.m9406dotp89u6pk(fArr, 3, m4, 2);
        float fM9406dotp89u6pk16 = MatrixKt.m9406dotp89u6pk(fArr, 3, m4, 3);
        fArr[0] = fM9406dotp89u6pk;
        fArr[1] = fM9406dotp89u6pk2;
        fArr[2] = fM9406dotp89u6pk3;
        fArr[3] = fM9406dotp89u6pk4;
        fArr[4] = fM9406dotp89u6pk5;
        fArr[5] = fM9406dotp89u6pk6;
        fArr[6] = fM9406dotp89u6pk7;
        fArr[7] = fM9406dotp89u6pk8;
        fArr[8] = fM9406dotp89u6pk9;
        fArr[9] = fM9406dotp89u6pk10;
        fArr[10] = fM9406dotp89u6pk11;
        fArr[11] = fM9406dotp89u6pk12;
        fArr[12] = fM9406dotp89u6pk13;
        fArr[13] = fM9406dotp89u6pk14;
        fArr[14] = fM9406dotp89u6pk15;
        fArr[15] = fM9406dotp89u6pk16;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9401toStringimpl(float[] fArr) {
        return StringsKt__IndentKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m9402translateimpl(float[] fArr, float f4, float f5, float f6) {
        float f7 = (fArr[0] * f4) + (fArr[4] * f5) + (fArr[8] * f6) + fArr[12];
        float f8 = (fArr[1] * f4) + (fArr[5] * f5) + (fArr[9] * f6) + fArr[13];
        float f9 = (fArr[2] * f4) + (fArr[6] * f5) + (fArr[10] * f6) + fArr[14];
        float f10 = (fArr[3] * f4) + (fArr[7] * f5) + (fArr[11] * f6) + fArr[15];
        fArr[12] = f7;
        fArr[13] = f8;
        fArr[14] = f9;
        fArr[15] = f10;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m9403translateimpl$default(float[] fArr, float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        m9402translateimpl(fArr, f4, f5, f6);
    }

    public boolean equals(Object obj) {
        return m9384equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m9387hashCodeimpl(this.values);
    }

    public String toString() {
        return m9401toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m9404unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m9391mapimpl(float[] fArr, MutableRect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jM9389mapMKHz9U = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM9389mapMKHz9U2 = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM9389mapMKHz9U3 = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM9389mapMKHz9U4 = m9389mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m8945getXimpl(jM9389mapMKHz9U), Offset.m8945getXimpl(jM9389mapMKHz9U2)), Math.min(Offset.m8945getXimpl(jM9389mapMKHz9U3), Offset.m8945getXimpl(jM9389mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m8946getYimpl(jM9389mapMKHz9U), Offset.m8946getYimpl(jM9389mapMKHz9U2)), Math.min(Offset.m8946getYimpl(jM9389mapMKHz9U3), Offset.m8946getYimpl(jM9389mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m8945getXimpl(jM9389mapMKHz9U), Offset.m8945getXimpl(jM9389mapMKHz9U2)), Math.max(Offset.m8945getXimpl(jM9389mapMKHz9U3), Offset.m8945getXimpl(jM9389mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m8946getYimpl(jM9389mapMKHz9U), Offset.m8946getYimpl(jM9389mapMKHz9U2)), Math.max(Offset.m8946getYimpl(jM9389mapMKHz9U3), Offset.m8946getYimpl(jM9389mapMKHz9U4))));
    }
}
