package androidx.compose.p011ui.graphics;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5856q;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 V2\u00020\u0001:\u0001VB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001cJ\u001b\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010'\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b(\u0010&J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001fJ\u0015\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b1\u0010/J\u0015\u00104\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b3\u0010/J+\u0010:\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t¢\u0006\u0004\b8\u00109J+\u0010<\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\t2\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t¢\u0006\u0004\b;\u00109J{\u0010J\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\t2\b\b\u0002\u0010C\u001a\u00020\t2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020\t2\b\b\u0002\u0010F\u001a\u00020\t2\b\b\u0002\u0010G\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\u0010\u0010M\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010R\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010U\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W"}, m5110d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "values", "constructor-impl", "([F)[F", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "Ld6/s;", "set-impl", "([FIIF)V", "set", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "matrix", "setFrom-58bKbWc", "setFrom", "degrees", "rotateX-impl", "([FF)V", "rotateX", "rotateY-impl", "rotateY", "rotateZ-impl", "rotateZ", "x", "y", "z", "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "resetToPivotedTransform-impl", "([FFFFFFFFFFFF)V", "resetToPivotedTransform", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "[F", "getValues", "()[F", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"})
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

    @NotNull
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m10910boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m10911constructorimpl(@NotNull float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m10912constructorimpl$default(float[] fArr, int i, AbstractC5824e abstractC5824e) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m10911constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10913equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && AbstractC5830k.m5325b(fArr, ((Matrix) obj).m10935unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10914equalsimpl0(float[] fArr, float[] fArr2) {
        return AbstractC5830k.m5325b(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m10915getimpl(float[] fArr, int i, int i8) {
        return fArr[(i * 4) + i8];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10916hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m10917invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
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
        if (f34 == 0.0f) {
            return;
        }
        float f35 = 1.0f / f34;
        fArr[0] = AbstractC0584a.m925z(f13, f31, (f11 * f33) - (f12 * f32), f35);
        fArr[1] = AbstractC1923c.m1061y(f9, f31, (f8 * f32) + ((-f7) * f33), f35);
        fArr[2] = AbstractC0584a.m925z(f21, f25, (f19 * f27) - (f20 * f26), f35);
        fArr[3] = AbstractC1923c.m1061y(f17, f25, (f16 * f26) + ((-f15) * f27), f35);
        float f36 = -f10;
        fArr[4] = AbstractC1923c.m1061y(f13, f29, (f12 * f30) + (f36 * f33), f35);
        fArr[5] = AbstractC0584a.m925z(f9, f29, (f33 * f) - (f8 * f30), f35);
        float f37 = -f18;
        fArr[6] = AbstractC1923c.m1061y(f21, f23, (f20 * f24) + (f37 * f27), f35);
        fArr[7] = AbstractC0584a.m925z(f17, f23, (f14 * f27) - (f16 * f24), f35);
        fArr[8] = AbstractC0584a.m925z(f13, f28, (f10 * f32) - (f11 * f30), f35);
        fArr[9] = AbstractC1923c.m1061y(f9, f28, (f30 * f7) + ((-f) * f32), f35);
        fArr[10] = AbstractC0584a.m925z(f21, f22, (f18 * f26) - (f19 * f24), f35);
        fArr[11] = AbstractC1923c.m1061y(f17, f22, (f24 * f15) + ((-f14) * f26), f35);
        fArr[12] = AbstractC1923c.m1061y(f12, f28, (f11 * f29) + (f36 * f31), f35);
        fArr[13] = AbstractC0584a.m925z(f8, f28, (f * f31) - (f7 * f29), f35);
        fArr[14] = AbstractC1923c.m1061y(f20, f22, (f19 * f23) + (f37 * f25), f35);
        fArr[15] = AbstractC0584a.m925z(f16, f22, (f14 * f25) - (f15 * f23), f35);
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m10918mapMKHz9U(float[] fArr, long j7) {
        if (fArr.length < 16) {
            return j7;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float f15 = 1 / (((f11 * fIntBitsToFloat2) + (f8 * fIntBitsToFloat)) + f14);
        if ((Float.floatToRawIntBits(f15) & Integer.MAX_VALUE) >= 2139095040) {
            f15 = 0.0f;
        }
        float f16 = ((f10 * fIntBitsToFloat2) + (f7 * fIntBitsToFloat) + f13) * f15;
        return Offset.m10433constructorimpl((Float.floatToRawIntBits((((f9 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f12) * f15) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L));
    }

    @NotNull
    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m10919mapimpl(float[] fArr, @NotNull Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float left = rect.getLeft();
        float top2 = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f15 = f8 * left;
        float f16 = f11 * top2;
        float f17 = 1.0f / ((f15 + f16) + f14);
        if ((Float.floatToRawIntBits(f17) & Integer.MAX_VALUE) >= 2139095040) {
            f17 = 0.0f;
        }
        float f18 = f * left;
        float f19 = f9 * top2;
        float f20 = (f18 + f19 + f12) * f17;
        float f21 = left * f7;
        float f22 = top2 * f10;
        float f23 = f17 * (f21 + f22 + f13);
        float f24 = f11 * bottom;
        float f25 = 1.0f / ((f15 + f24) + f14);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f9 * bottom;
        float f27 = (f18 + f26 + f12) * f25;
        float f28 = f10 * bottom;
        float f29 = (f21 + f28 + f13) * f25;
        float f30 = f8 * right;
        float f31 = 1.0f / ((f16 + f30) + f14);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f * right;
        float f33 = (f32 + f19 + f12) * f31;
        float f34 = right * f7;
        float f35 = (f22 + f34 + f13) * f31;
        float f36 = 1.0f / ((f30 + f24) + f14);
        float f37 = (Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040 ? f36 : 0.0f;
        float f38 = (f32 + f26 + f12) * f37;
        float f39 = (f34 + f28 + f13) * f37;
        return new Rect(Math.min(f20, Math.min(f27, Math.min(f33, f38))), Math.min(f23, Math.min(f29, Math.min(f35, f39))), Math.max(f20, Math.max(f27, Math.max(f33, f38))), Math.max(f23, Math.max(f29, Math.max(f35, f39))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m10921resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m10922resetToPivotedTransformimpl(float[] fArr, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        double d9 = f11 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d9);
        float fCos = (float) Math.cos(d9);
        float f17 = -fSin;
        float f18 = (f9 * fCos) - (f10 * fSin);
        float f19 = (f10 * fCos) + (f9 * fSin);
        double d10 = f12 * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d10);
        float fCos2 = (float) Math.cos(d10);
        float f20 = -fSin2;
        float f21 = fSin * fSin2;
        float f22 = fSin * fCos2;
        float f23 = fCos * fSin2;
        float f24 = fCos * fCos2;
        float f25 = (f19 * fSin2) + (f8 * fCos2);
        float f26 = (f19 * fCos2) + ((-f8) * fSin2);
        double d11 = f13 * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d11);
        float fCos3 = (float) Math.cos(d11);
        float f27 = -fSin3;
        float f28 = (fCos3 * f21) + (f27 * fCos2);
        float f29 = ((f21 * fSin3) + (fCos2 * fCos3)) * f14;
        float f30 = fSin3 * fCos * f14;
        float f31 = ((fSin3 * f22) + (fCos3 * f20)) * f14;
        float f32 = f28 * f15;
        float f33 = fCos * fCos3 * f15;
        float f34 = ((fCos3 * f22) + (f27 * f20)) * f15;
        float f35 = f23 * f16;
        float f36 = f17 * f16;
        float f37 = f24 * f16;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f29;
        fArr[1] = f30;
        fArr[2] = f31;
        fArr[3] = 0.0f;
        fArr[4] = f32;
        fArr[5] = f33;
        fArr[6] = f34;
        fArr[7] = 0.0f;
        fArr[8] = f35;
        fArr[9] = f36;
        fArr[10] = f37;
        fArr[11] = 0.0f;
        float f38 = -f;
        fArr[12] = ((f29 * f38) - (f32 * f7)) + f25 + f;
        fArr[13] = ((f30 * f38) - (f33 * f7)) + f18 + f7;
        fArr[14] = ((f38 * f31) - (f7 * f34)) + f26;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m10923resetToPivotedTransformimpl$default(float[] fArr, float f, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i & 4) != 0) {
            f8 = 0.0f;
        }
        if ((i & 8) != 0) {
            f9 = 0.0f;
        }
        if ((i & 16) != 0) {
            f10 = 0.0f;
        }
        if ((i & 32) != 0) {
            f11 = 0.0f;
        }
        if ((i & 64) != 0) {
            f12 = 0.0f;
        }
        if ((i & 128) != 0) {
            f13 = 0.0f;
        }
        if ((i & 256) != 0) {
            f14 = 1.0f;
        }
        if ((i & 512) != 0) {
            f15 = 1.0f;
        }
        if ((i & 1024) != 0) {
            f16 = 1.0f;
        }
        m10922resetToPivotedTransformimpl(fArr, f, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m10924rotateXimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d9 = f * 0.017453292519943295d;
        float fSin = (float) Math.sin(d9);
        float fCos = (float) Math.cos(d9);
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[13];
        float f14 = fArr[14];
        fArr[1] = (f7 * fCos) - (f8 * fSin);
        fArr[2] = (f8 * fCos) + (f7 * fSin);
        fArr[5] = (f9 * fCos) - (f10 * fSin);
        fArr[6] = (f10 * fCos) + (f9 * fSin);
        fArr[9] = (f11 * fCos) - (f12 * fSin);
        fArr[10] = (f12 * fCos) + (f11 * fSin);
        fArr[13] = (f13 * fCos) - (f14 * fSin);
        fArr[14] = (f14 * fCos) + (f13 * fSin);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m10925rotateYimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d9 = f * 0.017453292519943295d;
        float fSin = (float) Math.sin(d9);
        float fCos = (float) Math.cos(d9);
        float f7 = fArr[0];
        float f8 = fArr[2];
        float f9 = fArr[4];
        float f10 = fArr[6];
        float f11 = fArr[8];
        float f12 = fArr[10];
        float f13 = fArr[12];
        float f14 = fArr[14];
        fArr[0] = (f8 * fSin) + (f7 * fCos);
        fArr[2] = (f8 * fCos) + ((-f7) * fSin);
        fArr[4] = (f10 * fSin) + (f9 * fCos);
        fArr[6] = (f10 * fCos) + ((-f9) * fSin);
        fArr[8] = (f12 * fSin) + (f11 * fCos);
        fArr[10] = (f12 * fCos) + ((-f11) * fSin);
        fArr[12] = (f14 * fSin) + (f13 * fCos);
        fArr[14] = (f14 * fCos) + ((-f13) * fSin);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m10926rotateZimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d9 = f * 0.017453292519943295d;
        float fSin = (float) Math.sin(d9);
        float fCos = (float) Math.cos(d9);
        float f7 = fArr[0];
        float f8 = fArr[4];
        float f9 = (fSin * f8) + (fCos * f7);
        float f10 = -fSin;
        float f11 = fArr[1];
        float f12 = fArr[5];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = fArr[2];
        float f15 = fArr[6];
        float f16 = (fSin * f15) + (fCos * f14);
        float f17 = fArr[3];
        float f18 = fArr[7];
        fArr[0] = f9;
        fArr[1] = f13;
        fArr[2] = f16;
        fArr[3] = (fSin * f18) + (fCos * f17);
        fArr[4] = (f8 * fCos) + (f7 * f10);
        fArr[5] = (f12 * fCos) + (f11 * f10);
        fArr[6] = (f15 * fCos) + (f14 * f10);
        fArr[7] = (fCos * f18) + (f10 * f17);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m10927scaleimpl(float[] fArr, float f, float f7, float f8) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f7;
        fArr[5] = fArr[5] * f7;
        fArr[6] = fArr[6] * f7;
        fArr[7] = fArr[7] * f7;
        fArr[8] = fArr[8] * f8;
        fArr[9] = fArr[9] * f8;
        fArr[10] = fArr[10] * f8;
        fArr[11] = fArr[11] * f8;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m10928scaleimpl$default(float[] fArr, float f, float f7, float f8, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f7 = 1.0f;
        }
        if ((i & 4) != 0) {
            f8 = 1.0f;
        }
        m10927scaleimpl(fArr, f, f7, f8);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m10929setimpl(float[] fArr, int i, int i8, float f) {
        fArr[(i * 4) + i8] = f;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m10930setFrom58bKbWc(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m10931timesAssign58bKbWc(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f7 = fArr2[0];
            float f8 = fArr[1];
            float f9 = fArr2[4];
            float f10 = fArr[2];
            float f11 = fArr2[8];
            float f12 = f10 * f11;
            float f13 = fArr[3];
            float f14 = fArr2[12];
            float f15 = f13 * f14;
            float f16 = f15 + f12 + (f8 * f9) + (f * f7);
            float f17 = fArr2[1];
            float f18 = fArr2[5];
            float f19 = fArr2[9];
            float f20 = f10 * f19;
            float f21 = fArr2[13];
            float f22 = f13 * f21;
            float f23 = f22 + f20 + (f8 * f18) + (f * f17);
            float f24 = fArr2[2];
            float f25 = fArr2[6];
            float f26 = fArr2[10];
            float f27 = f10 * f26;
            float f28 = fArr2[14];
            float f29 = f13 * f28;
            float f30 = f29 + f27 + (f8 * f25) + (f * f24);
            float f31 = fArr2[3];
            float f32 = fArr2[7];
            float f33 = fArr2[11];
            float f34 = f10 * f33;
            float f35 = fArr2[15];
            float f36 = f13 * f35;
            float f37 = f36 + f34 + (f8 * f32) + (f * f31);
            float f38 = fArr[4];
            float f39 = fArr[5];
            float f40 = fArr[6];
            float f41 = (f40 * f11) + (f39 * f9) + (f38 * f7);
            float f42 = fArr[7];
            float f43 = (f42 * f14) + f41;
            float f44 = (f42 * f21) + (f40 * f19) + (f39 * f18) + (f38 * f17);
            float f45 = (f42 * f28) + (f40 * f26) + (f39 * f25) + (f38 * f24);
            float f46 = f40 * f33;
            float f47 = f42 * f35;
            float f48 = f47 + f46 + (f39 * f32) + (f38 * f31);
            float f49 = fArr[8];
            float f50 = fArr[9];
            float f51 = fArr[10];
            float f52 = (f51 * f11) + (f50 * f9) + (f49 * f7);
            float f53 = fArr[11];
            float f54 = (f53 * f14) + f52;
            float f55 = (f53 * f21) + (f51 * f19) + (f50 * f18) + (f49 * f17);
            float f56 = (f53 * f28) + (f51 * f26) + (f50 * f25) + (f49 * f24);
            float f57 = f51 * f33;
            float f58 = f53 * f35;
            float f59 = f58 + f57 + (f50 * f32) + (f49 * f31);
            float f60 = fArr[12];
            float f61 = fArr[13];
            float f62 = (f9 * f61) + (f7 * f60);
            float f63 = fArr[14];
            float f64 = (f11 * f63) + f62;
            float f65 = fArr[15];
            float f66 = (f14 * f65) + f64;
            float f67 = f19 * f63;
            float f68 = f21 * f65;
            float f69 = f68 + f67 + (f18 * f61) + (f17 * f60);
            float f70 = f26 * f63;
            float f71 = f28 * f65;
            float f72 = f71 + f70 + (f25 * f61) + (f24 * f60);
            float f73 = f63 * f33;
            float f74 = f65 * f35;
            fArr[0] = f16;
            fArr[1] = f23;
            fArr[2] = f30;
            fArr[3] = f37;
            fArr[4] = f43;
            fArr[5] = f44;
            fArr[6] = f45;
            fArr[7] = f48;
            fArr[8] = f54;
            fArr[9] = f55;
            fArr[10] = f56;
            fArr[11] = f59;
            fArr[12] = f66;
            fArr[13] = f69;
            fArr[14] = f72;
            fArr[15] = f74 + f73 + (f61 * f32) + (f60 * f31);
        }
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10932toStringimpl(float[] fArr) {
        return AbstractC5856q.m5404p("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m10933translateimpl(float[] fArr, float f, float f7, float f8) {
        if (fArr.length < 16) {
            return;
        }
        float f9 = (fArr[8] * f8) + (fArr[4] * f7) + (fArr[0] * f) + fArr[12];
        float f10 = (fArr[9] * f8) + (fArr[5] * f7) + (fArr[1] * f) + fArr[13];
        float f11 = (fArr[10] * f8) + (fArr[6] * f7) + (fArr[2] * f) + fArr[14];
        float f12 = (fArr[11] * f8) + (fArr[7] * f7) + (fArr[3] * f) + fArr[15];
        fArr[12] = f9;
        fArr[13] = f10;
        fArr[14] = f11;
        fArr[15] = f12;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m10934translateimpl$default(float[] fArr, float f, float f7, float f8, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i & 4) != 0) {
            f8 = 0.0f;
        }
        m10933translateimpl(fArr, f, f7, f8);
    }

    public boolean equals(Object obj) {
        return m10913equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m10916hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m10932toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m10935unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m10920mapimpl(float[] fArr, @NotNull MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float left = mutableRect.getLeft();
        float top2 = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f15 = f8 * left;
        float f16 = f11 * top2;
        float f17 = 1.0f / ((f15 + f16) + f14);
        if ((Float.floatToRawIntBits(f17) & Integer.MAX_VALUE) >= 2139095040) {
            f17 = 0.0f;
        }
        float f18 = f * left;
        float f19 = f9 * top2;
        float f20 = (f18 + f19 + f12) * f17;
        float f21 = left * f7;
        float f22 = top2 * f10;
        float f23 = (f21 + f22 + f13) * f17;
        float f24 = f11 * bottom;
        float f25 = 1.0f / ((f15 + f24) + f14);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f9 * bottom;
        float f27 = (f18 + f26 + f12) * f25;
        float f28 = f10 * bottom;
        float f29 = (f21 + f28 + f13) * f25;
        float f30 = f8 * right;
        float f31 = 1.0f / ((f16 + f30) + f14);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f * right;
        float f33 = (f32 + f19 + f12) * f31;
        float f34 = right * f7;
        float f35 = (f22 + f34 + f13) * f31;
        float f36 = 1.0f / ((f30 + f24) + f14);
        float f37 = (Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040 ? f36 : 0.0f;
        float f38 = (f32 + f26 + f12) * f37;
        float f39 = (f34 + f28 + f13) * f37;
        mutableRect.setLeft(Math.min(f20, Math.min(f27, Math.min(f33, f38))));
        mutableRect.setTop(Math.min(f23, Math.min(f29, Math.min(f35, f39))));
        mutableRect.setRight(Math.max(f20, Math.max(f27, Math.max(f33, f38))));
        mutableRect.setBottom(Math.max(f23, Math.max(f29, Math.max(f35, f39))));
    }
}
