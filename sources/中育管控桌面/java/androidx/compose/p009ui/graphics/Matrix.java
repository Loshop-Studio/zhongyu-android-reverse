package androidx.compose.p009ui.graphics;

import androidx.compose.p009ui.geometry.MutableRect;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m7879d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 U2\u00020\u0001:\u0001UB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ{\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010/\u001a\u00020\u000e2\b\b\u0002\u00100\u001a\u00020\u000e2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b;\u00109J\u0015\u0010<\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b=\u00109J+\u0010>\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ(\u0010D\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020\u00182\u0006\u0010I\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u001b\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010KJ\u000f\u0010O\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ+\u0010S\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u000e¢\u0006\u0004\bT\u0010CR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, m7880d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "resetToPivotedTransform", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "resetToPivotedTransform-impl", "([FFFFFFFFFFFF)V", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"})
/* loaded from: classes2.dex */
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
    public static final /* synthetic */ Matrix m14127boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m14128constructorimpl(float[] fArr) {
        return fArr;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m14129constructorimpl$default(float[] fArr, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i6 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m14128constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m14130equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m14152unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m14131equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m14132getimpl(float[] fArr, int i6, int i7) {
        return fArr[(i6 * 4) + i7];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m14133hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m14134invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = fArr[0];
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
        float f22 = (f6 * f11) - (f7 * f10);
        float f23 = (f6 * f12) - (f8 * f10);
        float f24 = (f6 * f13) - (f9 * f10);
        float f25 = (f7 * f12) - (f8 * f11);
        float f26 = (f7 * f13) - (f9 * f11);
        float f27 = (f8 * f13) - (f9 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (((((f22 * f33) - (f23 * f32)) + (f24 * f31)) + (f25 * f30)) - (f26 * f29)) + (f27 * f28);
        if (f34 == 0.0f) {
            return;
        }
        float f35 = 1.0f / f34;
        fArr[0] = (((f11 * f33) - (f12 * f32)) + (f13 * f31)) * f35;
        fArr[1] = ((((-f7) * f33) + (f8 * f32)) - (f9 * f31)) * f35;
        fArr[2] = (((f19 * f27) - (f20 * f26)) + (f21 * f25)) * f35;
        fArr[3] = ((((-f15) * f27) + (f16 * f26)) - (f17 * f25)) * f35;
        float f36 = -f10;
        fArr[4] = (((f36 * f33) + (f12 * f30)) - (f13 * f29)) * f35;
        fArr[5] = (((f33 * f6) - (f8 * f30)) + (f9 * f29)) * f35;
        float f37 = -f18;
        fArr[6] = (((f37 * f27) + (f20 * f24)) - (f21 * f23)) * f35;
        fArr[7] = (((f27 * f14) - (f16 * f24)) + (f17 * f23)) * f35;
        fArr[8] = (((f10 * f32) - (f11 * f30)) + (f13 * f28)) * f35;
        fArr[9] = ((((-f6) * f32) + (f30 * f7)) - (f9 * f28)) * f35;
        fArr[10] = (((f18 * f26) - (f19 * f24)) + (f21 * f22)) * f35;
        fArr[11] = ((((-f14) * f26) + (f24 * f15)) - (f17 * f22)) * f35;
        fArr[12] = (((f36 * f31) + (f11 * f29)) - (f12 * f28)) * f35;
        fArr[13] = (((f6 * f31) - (f7 * f29)) + (f8 * f28)) * f35;
        fArr[14] = (((f37 * f25) + (f19 * f23)) - (f20 * f22)) * f35;
        fArr[15] = (((f14 * f25) - (f15 * f23)) + (f16 * f22)) * f35;
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m14135mapMKHz9U(float[] fArr, long j6) {
        if (fArr.length < 16) {
            return j6;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        float f15 = 1 / (((f8 * fIntBitsToFloat) + (f11 * fIntBitsToFloat2)) + f14);
        if ((Float.floatToRawIntBits(f15) & Integer.MAX_VALUE) >= 2139095040) {
            f15 = 0.0f;
        }
        float f16 = ((f6 * fIntBitsToFloat) + (f9 * fIntBitsToFloat2) + f12) * f15;
        float f17 = f15 * ((f7 * fIntBitsToFloat) + (f10 * fIntBitsToFloat2) + f13);
        return Offset.m13650constructorimpl((Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L));
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m14136mapimpl(float[] fArr, Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f15 = f8 * left;
        float f16 = f11 * top;
        float f17 = 1.0f / ((f15 + f16) + f14);
        if ((Float.floatToRawIntBits(f17) & Integer.MAX_VALUE) >= 2139095040) {
            f17 = 0.0f;
        }
        float f18 = f6 * left;
        float f19 = f9 * top;
        float f20 = f17 * (f18 + f19 + f12);
        float f21 = left * f7;
        float f22 = top * f10;
        float f23 = f17 * (f21 + f22 + f13);
        float f24 = f11 * bottom;
        float f25 = 1.0f / ((f15 + f24) + f14);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f9 * bottom;
        float f27 = (f18 + f26 + f12) * f25;
        float f28 = f10 * bottom;
        float f29 = f25 * (f21 + f28 + f13);
        float f30 = f8 * right;
        float f31 = 1.0f / ((f16 + f30) + f14);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f6 * right;
        float f33 = f31 * (f32 + f19 + f12);
        float f34 = right * f7;
        float f35 = f31 * (f22 + f34 + f13);
        float f36 = 1.0f / ((f30 + f24) + f14);
        float f37 = (Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040 ? f36 : 0.0f;
        float f38 = (f32 + f26 + f12) * f37;
        float f39 = f37 * (f34 + f28 + f13);
        return new Rect(Math.min(f20, Math.min(f27, Math.min(f33, f38))), Math.min(f23, Math.min(f29, Math.min(f35, f39))), Math.max(f20, Math.max(f27, Math.max(f33, f38))), Math.max(f23, Math.max(f29, Math.max(f35, f39))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m14138resetimpl(float[] fArr) {
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
    public static final void m14139resetToPivotedTransformimpl(float[] fArr, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        double d6 = f11 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d6);
        float fCos = (float) Math.cos(d6);
        float f17 = -fSin;
        float f18 = (f9 * fCos) - (f10 * fSin);
        float f19 = (f9 * fSin) + (f10 * fCos);
        double d7 = f12 * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d7);
        float fCos2 = (float) Math.cos(d7);
        float f20 = -fSin2;
        float f21 = fSin * fSin2;
        float f22 = fSin * fCos2;
        float f23 = fCos * fSin2;
        float f24 = fCos * fCos2;
        float f25 = (f8 * fCos2) + (f19 * fSin2);
        float f26 = ((-f8) * fSin2) + (f19 * fCos2);
        double d8 = f13 * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d8);
        float fCos3 = (float) Math.cos(d8);
        float f27 = -fSin3;
        float f28 = (f27 * fCos2) + (fCos3 * f21);
        float f29 = fCos * fCos3;
        float f30 = (f27 * f20) + (fCos3 * f22);
        float f31 = ((fCos2 * fCos3) + (f21 * fSin3)) * f14;
        float f32 = fSin3 * fCos * f14;
        float f33 = ((fCos3 * f20) + (fSin3 * f22)) * f14;
        float f34 = f28 * f15;
        float f35 = f29 * f15;
        float f36 = f30 * f15;
        float f37 = f23 * f16;
        float f38 = f17 * f16;
        float f39 = f24 * f16;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f31;
        fArr[1] = f32;
        fArr[2] = f33;
        fArr[3] = 0.0f;
        fArr[4] = f34;
        fArr[5] = f35;
        fArr[6] = f36;
        fArr[7] = 0.0f;
        fArr[8] = f37;
        fArr[9] = f38;
        fArr[10] = f39;
        fArr[11] = 0.0f;
        float f40 = -f6;
        fArr[12] = ((f31 * f40) - (f34 * f7)) + f25 + f6;
        fArr[13] = ((f32 * f40) - (f35 * f7)) + f18 + f7;
        fArr[14] = ((f40 * f33) - (f7 * f36)) + f26;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m14140resetToPivotedTransformimpl$default(float[] fArr, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i6 & 4) != 0) {
            f8 = 0.0f;
        }
        if ((i6 & 8) != 0) {
            f9 = 0.0f;
        }
        if ((i6 & 16) != 0) {
            f10 = 0.0f;
        }
        if ((i6 & 32) != 0) {
            f11 = 0.0f;
        }
        if ((i6 & 64) != 0) {
            f12 = 0.0f;
        }
        if ((i6 & 128) != 0) {
            f13 = 0.0f;
        }
        if ((i6 & 256) != 0) {
            f14 = 1.0f;
        }
        if ((i6 & 512) != 0) {
            f15 = 1.0f;
        }
        if ((i6 & 1024) != 0) {
            f16 = 1.0f;
        }
        m14139resetToPivotedTransformimpl(fArr, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m14141rotateXimpl(float[] fArr, float f6) {
        if (fArr.length < 16) {
            return;
        }
        double d6 = f6 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d6);
        float fCos = (float) Math.cos(d6);
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[13];
        float f14 = fArr[14];
        fArr[1] = (f7 * fCos) - (f8 * fSin);
        fArr[2] = (f7 * fSin) + (f8 * fCos);
        fArr[5] = (f9 * fCos) - (f10 * fSin);
        fArr[6] = (f9 * fSin) + (f10 * fCos);
        fArr[9] = (f11 * fCos) - (f12 * fSin);
        fArr[10] = (f11 * fSin) + (f12 * fCos);
        fArr[13] = (f13 * fCos) - (f14 * fSin);
        fArr[14] = (f13 * fSin) + (f14 * fCos);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m14142rotateYimpl(float[] fArr, float f6) {
        if (fArr.length < 16) {
            return;
        }
        double d6 = f6 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d6);
        float fCos = (float) Math.cos(d6);
        float f7 = fArr[0];
        float f8 = fArr[2];
        float f9 = fArr[4];
        float f10 = fArr[6];
        float f11 = fArr[8];
        float f12 = fArr[10];
        float f13 = fArr[12];
        float f14 = fArr[14];
        fArr[0] = (f7 * fCos) + (f8 * fSin);
        fArr[2] = ((-f7) * fSin) + (f8 * fCos);
        fArr[4] = (f9 * fCos) + (f10 * fSin);
        fArr[6] = ((-f9) * fSin) + (f10 * fCos);
        fArr[8] = (f11 * fCos) + (f12 * fSin);
        fArr[10] = ((-f11) * fSin) + (f12 * fCos);
        fArr[12] = (f13 * fCos) + (f14 * fSin);
        fArr[14] = ((-f13) * fSin) + (f14 * fCos);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m14143rotateZimpl(float[] fArr, float f6) {
        if (fArr.length < 16) {
            return;
        }
        double d6 = f6 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d6);
        float fCos = (float) Math.cos(d6);
        float f7 = fArr[0];
        float f8 = fArr[4];
        float f9 = -fSin;
        float f10 = fArr[1];
        float f11 = fArr[5];
        float f12 = fArr[2];
        float f13 = fArr[6];
        float f14 = fArr[3];
        float f15 = fArr[7];
        fArr[0] = (fCos * f7) + (fSin * f8);
        fArr[1] = (fCos * f10) + (fSin * f11);
        fArr[2] = (fCos * f12) + (fSin * f13);
        fArr[3] = (fCos * f14) + (fSin * f15);
        fArr[4] = (f7 * f9) + (f8 * fCos);
        fArr[5] = (f10 * f9) + (f11 * fCos);
        fArr[6] = (f12 * f9) + (f13 * fCos);
        fArr[7] = (f9 * f14) + (fCos * f15);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m14144scaleimpl(float[] fArr, float f6, float f7, float f8) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f6;
        fArr[1] = fArr[1] * f6;
        fArr[2] = fArr[2] * f6;
        fArr[3] = fArr[3] * f6;
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
    public static /* synthetic */ void m14145scaleimpl$default(float[] fArr, float f6, float f7, float f8, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 1.0f;
        }
        if ((i6 & 2) != 0) {
            f7 = 1.0f;
        }
        if ((i6 & 4) != 0) {
            f8 = 1.0f;
        }
        m14144scaleimpl(fArr, f6, f7, f8);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m14146setimpl(float[] fArr, int i6, int i7, float f6) {
        fArr[(i6 * 4) + i7] = f6;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m14147setFrom58bKbWc(float[] fArr, float[] fArr2) {
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
    public static final void m14148timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f6 = fArr[0];
            float f7 = fArr2[0];
            float f8 = fArr[1];
            float f9 = fArr2[4];
            float f10 = fArr[2];
            float f11 = fArr2[8];
            float f12 = fArr[3];
            float f13 = fArr2[12];
            float f14 = (f6 * f7) + (f8 * f9) + (f10 * f11) + (f12 * f13);
            float f15 = fArr2[1];
            float f16 = fArr2[5];
            float f17 = fArr2[9];
            float f18 = fArr2[13];
            float f19 = (f6 * f15) + (f8 * f16) + (f10 * f17) + (f12 * f18);
            float f20 = fArr2[2];
            float f21 = fArr2[6];
            float f22 = fArr2[10];
            float f23 = fArr2[14];
            float f24 = (f6 * f20) + (f8 * f21) + (f10 * f22) + (f12 * f23);
            float f25 = fArr2[3];
            float f26 = fArr2[7];
            float f27 = fArr2[11];
            float f28 = fArr2[15];
            float f29 = (f6 * f25) + (f8 * f26) + (f10 * f27) + (f12 * f28);
            float f30 = fArr[4];
            float f31 = fArr[5];
            float f32 = fArr[6];
            float f33 = fArr[7];
            float f34 = (f30 * f7) + (f31 * f9) + (f32 * f11) + (f33 * f13);
            float f35 = (f30 * f15) + (f31 * f16) + (f32 * f17) + (f33 * f18);
            float f36 = (f30 * f20) + (f31 * f21) + (f32 * f22) + (f33 * f23);
            float f37 = (f30 * f25) + (f31 * f26) + (f32 * f27) + (f33 * f28);
            float f38 = fArr[8];
            float f39 = fArr[9];
            float f40 = fArr[10];
            float f41 = fArr[11];
            float f42 = (f38 * f7) + (f39 * f9) + (f40 * f11) + (f41 * f13);
            float f43 = (f38 * f15) + (f39 * f16) + (f40 * f17) + (f41 * f18);
            float f44 = (f38 * f20) + (f39 * f21) + (f40 * f22) + (f41 * f23);
            float f45 = (f38 * f25) + (f39 * f26) + (f40 * f27) + (f41 * f28);
            float f46 = fArr[12];
            float f47 = fArr[13];
            float f48 = (f7 * f46) + (f9 * f47);
            float f49 = fArr[14];
            float f50 = f48 + (f11 * f49);
            float f51 = fArr[15];
            fArr[0] = f14;
            fArr[1] = f19;
            fArr[2] = f24;
            fArr[3] = f29;
            fArr[4] = f34;
            fArr[5] = f35;
            fArr[6] = f36;
            fArr[7] = f37;
            fArr[8] = f42;
            fArr[9] = f43;
            fArr[10] = f44;
            fArr[11] = f45;
            fArr[12] = f50 + (f13 * f51);
            fArr[13] = (f15 * f46) + (f16 * f47) + (f17 * f49) + (f18 * f51);
            fArr[14] = (f20 * f46) + (f21 * f47) + (f22 * f49) + (f23 * f51);
            fArr[15] = (f46 * f25) + (f47 * f26) + (f49 * f27) + (f51 * f28);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m14149toStringimpl(float[] fArr) {
        return StringsKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m14150translateimpl(float[] fArr, float f6, float f7, float f8) {
        if (fArr.length < 16) {
            return;
        }
        float f9 = (fArr[0] * f6) + (fArr[4] * f7) + (fArr[8] * f8) + fArr[12];
        float f10 = (fArr[1] * f6) + (fArr[5] * f7) + (fArr[9] * f8) + fArr[13];
        float f11 = (fArr[2] * f6) + (fArr[6] * f7) + (fArr[10] * f8) + fArr[14];
        float f12 = (fArr[3] * f6) + (fArr[7] * f7) + (fArr[11] * f8) + fArr[15];
        fArr[12] = f9;
        fArr[13] = f10;
        fArr[14] = f11;
        fArr[15] = f12;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m14151translateimpl$default(float[] fArr, float f6, float f7, float f8, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i6 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i6 & 4) != 0) {
            f8 = 0.0f;
        }
        m14150translateimpl(fArr, f6, f7, f8);
    }

    public boolean equals(Object obj) {
        return m14130equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m14133hashCodeimpl(this.values);
    }

    public String toString() {
        return m14149toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m14152unboximpl() {
        return this.values;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m14137mapimpl(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[3];
        float f9 = fArr[4];
        float f10 = fArr[5];
        float f11 = fArr[7];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f15 = f8 * left;
        float f16 = f11 * top;
        float f17 = 1.0f / ((f15 + f16) + f14);
        if ((Float.floatToRawIntBits(f17) & Integer.MAX_VALUE) >= 2139095040) {
            f17 = 0.0f;
        }
        float f18 = f6 * left;
        float f19 = f9 * top;
        float f20 = f17 * (f18 + f19 + f12);
        float f21 = left * f7;
        float f22 = top * f10;
        float f23 = f17 * (f21 + f22 + f13);
        float f24 = f11 * bottom;
        float f25 = 1.0f / ((f15 + f24) + f14);
        if ((Float.floatToRawIntBits(f25) & Integer.MAX_VALUE) >= 2139095040) {
            f25 = 0.0f;
        }
        float f26 = f9 * bottom;
        float f27 = (f18 + f26 + f12) * f25;
        float f28 = f10 * bottom;
        float f29 = f25 * (f21 + f28 + f13);
        float f30 = f8 * right;
        float f31 = 1.0f / ((f16 + f30) + f14);
        if ((Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) >= 2139095040) {
            f31 = 0.0f;
        }
        float f32 = f6 * right;
        float f33 = f31 * (f32 + f19 + f12);
        float f34 = right * f7;
        float f35 = f31 * (f22 + f34 + f13);
        float f36 = 1.0f / ((f30 + f24) + f14);
        float f37 = (Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) < 2139095040 ? f36 : 0.0f;
        float f38 = (f32 + f26 + f12) * f37;
        float f39 = f37 * (f34 + f28 + f13);
        mutableRect.setLeft(Math.min(f20, Math.min(f27, Math.min(f33, f38))));
        mutableRect.setTop(Math.min(f23, Math.min(f29, Math.min(f35, f39))));
        mutableRect.setRight(Math.max(f20, Math.max(f27, Math.max(f33, f38))));
        mutableRect.setBottom(Math.max(f23, Math.max(f29, Math.max(f35, f39))));
    }
}
