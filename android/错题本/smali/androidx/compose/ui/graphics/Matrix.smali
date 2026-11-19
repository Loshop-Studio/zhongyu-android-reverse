.class public final Landroidx/compose/ui/graphics/Matrix;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/Matrix$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008-\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087@\u0018\u0000 V2\u00020\u0001:\u0001VB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\u000c\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0086\n\u00a2\u0006\u0004\u0008\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0086\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u0019\u0010\u001cJ\u001b\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0000H\u0086\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010$\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010\'\u001a\u00020\u000e\u00a2\u0006\u0004\u0008%\u0010&J\r\u0010)\u001a\u00020\u000e\u00a2\u0006\u0004\u0008(\u0010&J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010\u001fJ\u0015\u00100\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t\u00a2\u0006\u0004\u0008.\u0010/J\u0015\u00102\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t\u00a2\u0006\u0004\u00081\u0010/J\u0015\u00104\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\t\u00a2\u0006\u0004\u00083\u0010/J+\u0010:\u001a\u00020\u000e2\u0008\u0008\u0002\u00105\u001a\u00020\t2\u0008\u0008\u0002\u00106\u001a\u00020\t2\u0008\u0008\u0002\u00107\u001a\u00020\t\u00a2\u0006\u0004\u00088\u00109J+\u0010<\u001a\u00020\u000e2\u0008\u0008\u0002\u00105\u001a\u00020\t2\u0008\u0008\u0002\u00106\u001a\u00020\t2\u0008\u0008\u0002\u00107\u001a\u00020\t\u00a2\u0006\u0004\u0008;\u00109J{\u0010J\u001a\u00020\u000e2\u0008\u0008\u0002\u0010=\u001a\u00020\t2\u0008\u0008\u0002\u0010>\u001a\u00020\t2\u0008\u0008\u0002\u0010?\u001a\u00020\t2\u0008\u0008\u0002\u0010@\u001a\u00020\t2\u0008\u0008\u0002\u0010A\u001a\u00020\t2\u0008\u0008\u0002\u0010B\u001a\u00020\t2\u0008\u0008\u0002\u0010C\u001a\u00020\t2\u0008\u0008\u0002\u0010D\u001a\u00020\t2\u0008\u0008\u0002\u0010E\u001a\u00020\t2\u0008\u0008\u0002\u0010F\u001a\u00020\t2\u0008\u0008\u0002\u0010G\u001a\u00020\t\u00a2\u0006\u0004\u0008H\u0010IJ\u0010\u0010M\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008K\u0010LJ\u001a\u0010R\u001a\u00020O2\u0008\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008P\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010S\u001a\u0004\u0008T\u0010U\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006W"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/Matrix;",
        "",
        "",
        "values",
        "constructor-impl",
        "([F)[F",
        "",
        "row",
        "column",
        "",
        "get-impl",
        "([FII)F",
        "get",
        "v",
        "Ld6/s;",
        "set-impl",
        "([FIIF)V",
        "set",
        "Landroidx/compose/ui/geometry/Offset;",
        "point",
        "map-MK-Hz9U",
        "([FJ)J",
        "map",
        "Landroidx/compose/ui/geometry/Rect;",
        "rect",
        "map-impl",
        "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;",
        "Landroidx/compose/ui/geometry/MutableRect;",
        "([FLandroidx/compose/ui/geometry/MutableRect;)V",
        "m",
        "timesAssign-58bKbWc",
        "([F[F)V",
        "timesAssign",
        "",
        "toString-impl",
        "([F)Ljava/lang/String;",
        "toString",
        "invert-impl",
        "([F)V",
        "invert",
        "reset-impl",
        "reset",
        "matrix",
        "setFrom-58bKbWc",
        "setFrom",
        "degrees",
        "rotateX-impl",
        "([FF)V",
        "rotateX",
        "rotateY-impl",
        "rotateY",
        "rotateZ-impl",
        "rotateZ",
        "x",
        "y",
        "z",
        "scale-impl",
        "([FFFF)V",
        "scale",
        "translate-impl",
        "translate",
        "pivotX",
        "pivotY",
        "translationX",
        "translationY",
        "translationZ",
        "rotationX",
        "rotationY",
        "rotationZ",
        "scaleX",
        "scaleY",
        "scaleZ",
        "resetToPivotedTransform-impl",
        "([FFFFFFFFFFFF)V",
        "resetToPivotedTransform",
        "hashCode-impl",
        "([F)I",
        "hashCode",
        "other",
        "",
        "equals-impl",
        "([FLjava/lang/Object;)Z",
        "equals",
        "[F",
        "getValues",
        "()[F",
        "Companion",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/compose/ui/graphics/Matrix$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Perspective0:I = 0x3

.field public static final Perspective1:I = 0x7

.field public static final Perspective2:I = 0xf

.field public static final ScaleX:I = 0x0

.field public static final ScaleY:I = 0x5

.field public static final ScaleZ:I = 0xa

.field public static final SkewX:I = 0x4

.field public static final SkewY:I = 0x1

.field public static final TranslateX:I = 0xc

.field public static final TranslateY:I = 0xd

.field public static final TranslateZ:I = 0xe


# instance fields
.field private final values:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/graphics/Matrix$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/Matrix$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Landroidx/compose/ui/graphics/Matrix;->Companion:Landroidx/compose/ui/graphics/Matrix$Companion;

    return-void
.end method

.method private synthetic constructor <init>([F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/Matrix;->values:[F

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic box-impl([F)Landroidx/compose/ui/graphics/Matrix;
    .locals 1

    new-instance v0, Landroidx/compose/ui/graphics/Matrix;

    invoke-direct {v0, p0}, Landroidx/compose/ui/graphics/Matrix;-><init>([F)V

    return-object v0
.end method

.method public static constructor-impl([F)[F
    .locals 0
    .param p0    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public static synthetic constructor-impl$default([FILkotlin/jvm/internal/e;)[F
    .locals 1

    .line 1
    const/4 p2, 0x1

    .line 2
    and-int/2addr p1, p2

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x10

    .line 6
    .line 7
    new-array p0, p0, [F

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    aput v0, p0, p1

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    aput p1, p0, p2

    .line 16
    .line 17
    const/4 p2, 0x2

    .line 18
    aput p1, p0, p2

    .line 19
    .line 20
    const/4 p2, 0x3

    .line 21
    aput p1, p0, p2

    .line 22
    .line 23
    const/4 p2, 0x4

    .line 24
    aput p1, p0, p2

    .line 25
    .line 26
    const/4 p2, 0x5

    .line 27
    aput v0, p0, p2

    .line 28
    .line 29
    const/4 p2, 0x6

    .line 30
    aput p1, p0, p2

    .line 31
    .line 32
    const/4 p2, 0x7

    .line 33
    aput p1, p0, p2

    .line 34
    .line 35
    const/16 p2, 0x8

    .line 36
    .line 37
    aput p1, p0, p2

    .line 38
    .line 39
    const/16 p2, 0x9

    .line 40
    .line 41
    aput p1, p0, p2

    .line 42
    .line 43
    const/16 p2, 0xa

    .line 44
    .line 45
    aput v0, p0, p2

    .line 46
    .line 47
    const/16 p2, 0xb

    .line 48
    .line 49
    aput p1, p0, p2

    .line 50
    .line 51
    const/16 p2, 0xc

    .line 52
    .line 53
    aput p1, p0, p2

    .line 54
    .line 55
    const/16 p2, 0xd

    .line 56
    .line 57
    aput p1, p0, p2

    .line 58
    .line 59
    const/16 p2, 0xe

    .line 60
    .line 61
    aput p1, p0, p2

    .line 62
    .line 63
    const/16 p1, 0xf

    .line 64
    .line 65
    aput v0, p0, p1

    .line 66
    .line 67
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/graphics/Matrix;->constructor-impl([F)[F

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public static equals-impl([FLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Landroidx/compose/ui/graphics/Matrix;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Landroidx/compose/ui/graphics/Matrix;

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/Matrix;->unbox-impl()[F

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final equals-impl0([F[F)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final get-impl([FII)F
    .locals 0

    .line 1
    mul-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    add-int/2addr p1, p2

    .line 4
    aget p0, p0, p1

    .line 5
    .line 6
    return p0
.end method

.method public static hashCode-impl([F)I
    .locals 0

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([F)I

    move-result p0

    return p0
.end method

.method public static final invert-impl([F)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    aget v2, v0, v1

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    aget v4, v0, v3

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    aget v6, v0, v5

    .line 17
    .line 18
    const/4 v7, 0x3

    .line 19
    aget v8, v0, v7

    .line 20
    .line 21
    const/4 v9, 0x4

    .line 22
    aget v10, v0, v9

    .line 23
    .line 24
    const/4 v11, 0x5

    .line 25
    aget v12, v0, v11

    .line 26
    .line 27
    const/4 v13, 0x6

    .line 28
    aget v14, v0, v13

    .line 29
    .line 30
    const/4 v15, 0x7

    .line 31
    move/from16 v16, v1

    .line 32
    .line 33
    aget v1, v0, v15

    .line 34
    .line 35
    const/16 v17, 0x8

    .line 36
    .line 37
    move/from16 v18, v3

    .line 38
    .line 39
    aget v3, v0, v17

    .line 40
    .line 41
    const/16 v19, 0x9

    .line 42
    .line 43
    move/from16 v20, v5

    .line 44
    .line 45
    aget v5, v0, v19

    .line 46
    .line 47
    const/16 v21, 0xa

    .line 48
    .line 49
    move/from16 v22, v7

    .line 50
    .line 51
    aget v7, v0, v21

    .line 52
    .line 53
    const/16 v23, 0xb

    .line 54
    .line 55
    move/from16 v24, v9

    .line 56
    .line 57
    aget v9, v0, v23

    .line 58
    .line 59
    const/16 v25, 0xc

    .line 60
    .line 61
    move/from16 v26, v11

    .line 62
    .line 63
    aget v11, v0, v25

    .line 64
    .line 65
    const/16 v27, 0xd

    .line 66
    .line 67
    aget v28, v0, v27

    .line 68
    .line 69
    const/16 v29, 0xe

    .line 70
    .line 71
    move/from16 v30, v13

    .line 72
    .line 73
    aget v13, v0, v29

    .line 74
    .line 75
    const/16 v31, 0xf

    .line 76
    .line 77
    move/from16 v32, v15

    .line 78
    .line 79
    aget v15, v0, v31

    .line 80
    .line 81
    mul-float v33, v2, v12

    .line 82
    .line 83
    mul-float v34, v4, v10

    .line 84
    .line 85
    sub-float v0, v33, v34

    .line 86
    .line 87
    mul-float v33, v2, v14

    .line 88
    .line 89
    mul-float v34, v6, v10

    .line 90
    .line 91
    move/from16 v35, v12

    .line 92
    .line 93
    sub-float v12, v33, v34

    .line 94
    .line 95
    mul-float v33, v2, v1

    .line 96
    .line 97
    mul-float v34, v8, v10

    .line 98
    .line 99
    sub-float v33, v33, v34

    .line 100
    .line 101
    mul-float v34, v4, v14

    .line 102
    .line 103
    mul-float v36, v6, v35

    .line 104
    .line 105
    move/from16 v37, v7

    .line 106
    .line 107
    sub-float v7, v34, v36

    .line 108
    .line 109
    mul-float v34, v4, v1

    .line 110
    .line 111
    mul-float v36, v8, v35

    .line 112
    .line 113
    sub-float v34, v34, v36

    .line 114
    .line 115
    mul-float v36, v6, v1

    .line 116
    .line 117
    mul-float v38, v8, v14

    .line 118
    .line 119
    sub-float v36, v36, v38

    .line 120
    .line 121
    mul-float v38, v3, v28

    .line 122
    .line 123
    mul-float v39, v5, v11

    .line 124
    .line 125
    move/from16 v40, v13

    .line 126
    .line 127
    sub-float v13, v38, v39

    .line 128
    .line 129
    mul-float v38, v3, v40

    .line 130
    .line 131
    mul-float v39, v37, v11

    .line 132
    .line 133
    move/from16 v41, v6

    .line 134
    .line 135
    sub-float v6, v38, v39

    .line 136
    .line 137
    mul-float v38, v3, v15

    .line 138
    .line 139
    mul-float v39, v9, v11

    .line 140
    .line 141
    sub-float v38, v38, v39

    .line 142
    .line 143
    mul-float v39, v5, v40

    .line 144
    .line 145
    mul-float v42, v37, v28

    .line 146
    .line 147
    move/from16 v43, v14

    .line 148
    .line 149
    sub-float v14, v39, v42

    .line 150
    .line 151
    mul-float v39, v5, v15

    .line 152
    .line 153
    mul-float v42, v9, v28

    .line 154
    .line 155
    sub-float v39, v39, v42

    .line 156
    .line 157
    mul-float v42, v37, v15

    .line 158
    .line 159
    mul-float v44, v9, v40

    .line 160
    .line 161
    sub-float v42, v42, v44

    .line 162
    .line 163
    mul-float v44, v0, v42

    .line 164
    .line 165
    mul-float v45, v12, v39

    .line 166
    .line 167
    sub-float v44, v44, v45

    .line 168
    .line 169
    mul-float v45, v33, v14

    .line 170
    .line 171
    add-float v45, v45, v44

    .line 172
    .line 173
    mul-float v44, v7, v38

    .line 174
    .line 175
    add-float v44, v44, v45

    .line 176
    .line 177
    mul-float v45, v34, v6

    .line 178
    .line 179
    sub-float v44, v44, v45

    .line 180
    .line 181
    mul-float v45, v36, v13

    .line 182
    .line 183
    add-float v45, v45, v44

    .line 184
    .line 185
    const/16 v44, 0x0

    .line 186
    .line 187
    cmpg-float v44, v45, v44

    .line 188
    .line 189
    if-nez v44, :cond_1

    .line 190
    .line 191
    return-void

    .line 192
    :cond_1
    const/high16 v44, 0x3f800000    # 1.0f

    .line 193
    .line 194
    move/from16 v46, v3

    .line 195
    .line 196
    div-float v3, v44, v45

    .line 197
    .line 198
    mul-float v44, v35, v42

    .line 199
    .line 200
    mul-float v45, v43, v39

    .line 201
    .line 202
    move/from16 v47, v0

    .line 203
    .line 204
    sub-float v0, v44, v45

    .line 205
    .line 206
    invoke-static {v1, v14, v0, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    aput v0, p0, v16

    .line 211
    .line 212
    neg-float v0, v4

    .line 213
    mul-float v0, v0, v42

    .line 214
    .line 215
    mul-float v16, v41, v39

    .line 216
    .line 217
    add-float v0, v16, v0

    .line 218
    .line 219
    invoke-static {v8, v14, v0, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    aput v0, p0, v18

    .line 224
    .line 225
    mul-float v0, v28, v36

    .line 226
    .line 227
    mul-float v16, v40, v34

    .line 228
    .line 229
    sub-float v0, v0, v16

    .line 230
    .line 231
    invoke-static {v15, v7, v0, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    aput v0, p0, v20

    .line 236
    .line 237
    neg-float v0, v5

    .line 238
    mul-float v0, v0, v36

    .line 239
    .line 240
    mul-float v16, v37, v34

    .line 241
    .line 242
    add-float v0, v16, v0

    .line 243
    .line 244
    invoke-static {v9, v7, v0, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    aput v0, p0, v22

    .line 249
    .line 250
    neg-float v0, v10

    .line 251
    mul-float v16, v0, v42

    .line 252
    .line 253
    mul-float v18, v43, v38

    .line 254
    .line 255
    move/from16 v20, v0

    .line 256
    .line 257
    add-float v0, v18, v16

    .line 258
    .line 259
    invoke-static {v1, v6, v0, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    aput v0, p0, v24

    .line 264
    .line 265
    mul-float v42, v42, v2

    .line 266
    .line 267
    mul-float v0, v41, v38

    .line 268
    .line 269
    sub-float v0, v42, v0

    .line 270
    .line 271
    invoke-static {v8, v6, v0, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    aput v0, p0, v26

    .line 276
    .line 277
    neg-float v0, v11

    .line 278
    mul-float v16, v0, v36

    .line 279
    .line 280
    mul-float v18, v40, v33

    .line 281
    .line 282
    move/from16 v22, v0

    .line 283
    .line 284
    add-float v0, v18, v16

    .line 285
    .line 286
    invoke-static {v15, v12, v0, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    aput v0, p0, v30

    .line 291
    .line 292
    mul-float v0, v46, v36

    .line 293
    .line 294
    mul-float v16, v37, v33

    .line 295
    .line 296
    sub-float v0, v0, v16

    .line 297
    .line 298
    invoke-static {v9, v12, v0, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    aput v0, p0, v32

    .line 303
    .line 304
    mul-float v10, v10, v39

    .line 305
    .line 306
    mul-float v0, v35, v38

    .line 307
    .line 308
    sub-float/2addr v10, v0

    .line 309
    invoke-static {v1, v13, v10, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    aput v0, p0, v17

    .line 314
    .line 315
    neg-float v0, v2

    .line 316
    mul-float v0, v0, v39

    .line 317
    .line 318
    mul-float v38, v38, v4

    .line 319
    .line 320
    add-float v0, v38, v0

    .line 321
    .line 322
    invoke-static {v8, v13, v0, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    aput v0, p0, v19

    .line 327
    .line 328
    mul-float v11, v11, v34

    .line 329
    .line 330
    mul-float v0, v28, v33

    .line 331
    .line 332
    sub-float/2addr v11, v0

    .line 333
    move/from16 v0, v47

    .line 334
    .line 335
    invoke-static {v15, v0, v11, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    aput v1, p0, v21

    .line 340
    .line 341
    move/from16 v1, v46

    .line 342
    .line 343
    neg-float v8, v1

    .line 344
    mul-float v8, v8, v34

    .line 345
    .line 346
    mul-float v33, v33, v5

    .line 347
    .line 348
    add-float v8, v33, v8

    .line 349
    .line 350
    invoke-static {v9, v0, v8, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    aput v8, p0, v23

    .line 355
    .line 356
    mul-float v8, v20, v14

    .line 357
    .line 358
    mul-float v9, v35, v6

    .line 359
    .line 360
    add-float/2addr v9, v8

    .line 361
    move/from16 v8, v43

    .line 362
    .line 363
    invoke-static {v8, v13, v9, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    aput v8, p0, v25

    .line 368
    .line 369
    mul-float/2addr v2, v14

    .line 370
    mul-float/2addr v4, v6

    .line 371
    sub-float/2addr v2, v4

    .line 372
    move/from16 v4, v41

    .line 373
    .line 374
    invoke-static {v4, v13, v2, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    aput v2, p0, v27

    .line 379
    .line 380
    mul-float v2, v22, v7

    .line 381
    .line 382
    mul-float v28, v28, v12

    .line 383
    .line 384
    add-float v2, v28, v2

    .line 385
    .line 386
    move/from16 v4, v40

    .line 387
    .line 388
    invoke-static {v4, v0, v2, v3}, Landroidx/compose/material3/c;->y(FFFF)F

    .line 389
    .line 390
    .line 391
    move-result v2

    .line 392
    aput v2, p0, v29

    .line 393
    .line 394
    mul-float/2addr v1, v7

    .line 395
    mul-float/2addr v5, v12

    .line 396
    sub-float/2addr v1, v5

    .line 397
    move/from16 v2, v37

    .line 398
    .line 399
    invoke-static {v2, v0, v1, v3}, Landroidx/collection/a;->z(FFFF)F

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    aput v0, p0, v31

    .line 404
    .line 405
    return-void
.end method

.method public static final map-MK-Hz9U([FJ)J
    .locals 13

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-wide p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget v2, p0, v1

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    aget v3, p0, v3

    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    aget v4, p0, v4

    .line 18
    .line 19
    const/4 v5, 0x5

    .line 20
    aget v5, p0, v5

    .line 21
    .line 22
    const/4 v6, 0x7

    .line 23
    aget v6, p0, v6

    .line 24
    .line 25
    const/16 v7, 0xc

    .line 26
    .line 27
    aget v7, p0, v7

    .line 28
    .line 29
    const/16 v8, 0xd

    .line 30
    .line 31
    aget v8, p0, v8

    .line 32
    .line 33
    const/16 v9, 0xf

    .line 34
    .line 35
    aget p0, p0, v9

    .line 36
    .line 37
    const/16 v9, 0x20

    .line 38
    .line 39
    shr-long v10, p1, v9

    .line 40
    .line 41
    long-to-int v10, v10

    .line 42
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    const-wide v11, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr p1, v11

    .line 52
    long-to-int p1, p1

    .line 53
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    mul-float/2addr v3, v10

    .line 58
    mul-float/2addr v6, p1

    .line 59
    add-float/2addr v6, v3

    .line 60
    add-float/2addr v6, p0

    .line 61
    int-to-float p0, v1

    .line 62
    div-float/2addr p0, v6

    .line 63
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    const v1, 0x7fffffff

    .line 68
    .line 69
    .line 70
    and-int/2addr p2, v1

    .line 71
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 72
    .line 73
    if-ge p2, v1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p0, 0x0

    .line 77
    :goto_0
    mul-float/2addr v0, v10

    .line 78
    mul-float/2addr v4, p1

    .line 79
    add-float/2addr v4, v0

    .line 80
    add-float/2addr v4, v7

    .line 81
    mul-float/2addr v4, p0

    .line 82
    mul-float/2addr v2, v10

    .line 83
    mul-float/2addr v5, p1

    .line 84
    add-float/2addr v5, v2

    .line 85
    add-float/2addr v5, v8

    .line 86
    mul-float/2addr v5, p0

    .line 87
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    int-to-long p0, p0

    .line 92
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    int-to-long v0, p2

    .line 97
    shl-long/2addr p0, v9

    .line 98
    and-long/2addr v0, v11

    .line 99
    or-long/2addr p0, v0

    .line 100
    invoke-static {p0, p1}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 101
    .line 102
    .line 103
    move-result-wide p0

    .line 104
    return-wide p0
.end method

.method public static final map-impl([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;
    .locals 23
    .param p1    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    .line 1
    array-length v1, v0

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 2
    aget v1, v0, v1

    const/4 v2, 0x1

    .line 3
    aget v2, v0, v2

    const/4 v3, 0x3

    .line 4
    aget v3, v0, v3

    const/4 v4, 0x4

    .line 5
    aget v4, v0, v4

    const/4 v5, 0x5

    .line 6
    aget v5, v0, v5

    const/4 v6, 0x7

    .line 7
    aget v6, v0, v6

    const/16 v7, 0xc

    .line 8
    aget v7, v0, v7

    const/16 v8, 0xd

    .line 9
    aget v8, v0, v8

    const/16 v9, 0xf

    .line 10
    aget v0, v0, v9

    .line 11
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/geometry/Rect;->getLeft()F

    move-result v9

    .line 12
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    move-result v10

    .line 13
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/geometry/Rect;->getRight()F

    move-result v11

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/geometry/Rect;->getBottom()F

    move-result v12

    mul-float v13, v3, v9

    mul-float v14, v6, v10

    add-float v15, v13, v14

    add-float/2addr v15, v0

    const/high16 v16, 0x3f800000    # 1.0f

    div-float v15, v16, v15

    .line 15
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v17

    const v18, 0x7fffffff

    move/from16 p0, v0

    and-int v0, v17, v18

    const/16 v17, 0x0

    move/from16 v19, v1

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move/from16 v15, v17

    :goto_0
    mul-float v0, v19, v9

    mul-float v20, v4, v10

    add-float v21, v0, v20

    add-float v21, v21, v7

    mul-float v1, v21, v15

    mul-float/2addr v9, v2

    mul-float/2addr v10, v5

    add-float v21, v9, v10

    add-float v21, v21, v8

    mul-float v15, v15, v21

    mul-float/2addr v6, v12

    add-float/2addr v13, v6

    add-float v13, v13, p0

    div-float v13, v16, v13

    .line 16
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v21

    move/from16 v22, v0

    and-int v0, v21, v18

    move/from16 v21, v2

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v0, v2, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v13, v17

    :goto_1
    mul-float/2addr v4, v12

    add-float v0, v22, v4

    add-float/2addr v0, v7

    mul-float/2addr v0, v13

    mul-float/2addr v5, v12

    add-float/2addr v9, v5

    add-float/2addr v9, v8

    mul-float/2addr v9, v13

    mul-float/2addr v3, v11

    add-float/2addr v14, v3

    add-float v14, v14, p0

    div-float v2, v16, v14

    .line 17
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v12

    and-int v12, v12, v18

    const/high16 v13, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v12, v13, :cond_3

    goto :goto_2

    :cond_3
    move/from16 v2, v17

    :goto_2
    mul-float v12, v19, v11

    add-float v20, v12, v20

    add-float v20, v20, v7

    mul-float v13, v20, v2

    mul-float v11, v11, v21

    add-float/2addr v10, v11

    add-float/2addr v10, v8

    mul-float/2addr v10, v2

    add-float/2addr v3, v6

    add-float v3, v3, p0

    div-float v16, v16, v3

    .line 18
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    and-int v2, v2, v18

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v2, v3, :cond_4

    move/from16 v17, v16

    :cond_4
    add-float/2addr v12, v4

    add-float/2addr v12, v7

    mul-float v12, v12, v17

    add-float/2addr v11, v5

    add-float/2addr v11, v8

    mul-float v11, v11, v17

    .line 19
    new-instance v2, Landroidx/compose/ui/geometry/Rect;

    .line 20
    invoke-static {v13, v12}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 21
    invoke-static {v10, v11}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v9, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v15, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 22
    invoke-static {v13, v12}, Ljava/lang/Math;->max(FF)F

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 23
    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v9, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v15, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 24
    invoke-direct {v2, v3, v4, v0, v1}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    return-object v2
.end method

.method public static final map-impl([FLandroidx/compose/ui/geometry/MutableRect;)V
    .locals 24
    .param p1    # Landroidx/compose/ui/geometry/MutableRect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 25
    array-length v2, v0

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 26
    aget v2, v0, v2

    const/4 v3, 0x1

    .line 27
    aget v3, v0, v3

    const/4 v4, 0x3

    .line 28
    aget v4, v0, v4

    const/4 v5, 0x4

    .line 29
    aget v5, v0, v5

    const/4 v6, 0x5

    .line 30
    aget v6, v0, v6

    const/4 v7, 0x7

    .line 31
    aget v7, v0, v7

    const/16 v8, 0xc

    .line 32
    aget v8, v0, v8

    const/16 v9, 0xd

    .line 33
    aget v9, v0, v9

    const/16 v10, 0xf

    .line 34
    aget v0, v0, v10

    .line 35
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/MutableRect;->getLeft()F

    move-result v10

    .line 36
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/MutableRect;->getTop()F

    move-result v11

    .line 37
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/MutableRect;->getRight()F

    move-result v12

    .line 38
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/MutableRect;->getBottom()F

    move-result v13

    mul-float v14, v4, v10

    mul-float v15, v7, v11

    add-float v16, v14, v15

    add-float v16, v16, v0

    const/high16 v17, 0x3f800000    # 1.0f

    div-float v16, v17, v16

    .line 39
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v18

    const v19, 0x7fffffff

    move/from16 p0, v0

    and-int v0, v18, v19

    const/16 v18, 0x0

    move/from16 v20, v2

    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move/from16 v16, v18

    :goto_0
    mul-float v0, v20, v10

    mul-float v21, v5, v11

    add-float v22, v0, v21

    add-float v22, v22, v8

    mul-float v2, v22, v16

    mul-float/2addr v10, v3

    mul-float/2addr v11, v6

    add-float v22, v10, v11

    add-float v22, v22, v9

    move/from16 v23, v0

    mul-float v0, v22, v16

    mul-float/2addr v7, v13

    add-float/2addr v14, v7

    add-float v14, v14, p0

    div-float v14, v17, v14

    .line 40
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v16

    move/from16 v22, v3

    and-int v3, v16, v19

    move/from16 v16, v4

    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v3, v4, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v14, v18

    :goto_1
    mul-float/2addr v5, v13

    add-float v3, v23, v5

    add-float/2addr v3, v8

    mul-float/2addr v3, v14

    mul-float/2addr v6, v13

    add-float/2addr v10, v6

    add-float/2addr v10, v9

    mul-float/2addr v10, v14

    mul-float v4, v16, v12

    add-float/2addr v15, v4

    add-float v15, v15, p0

    div-float v13, v17, v15

    .line 41
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v14

    and-int v14, v14, v19

    const/high16 v15, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v14, v15, :cond_3

    goto :goto_2

    :cond_3
    move/from16 v13, v18

    :goto_2
    mul-float v14, v20, v12

    add-float v21, v14, v21

    add-float v21, v21, v8

    mul-float v15, v21, v13

    mul-float v12, v12, v22

    add-float/2addr v11, v12

    add-float/2addr v11, v9

    mul-float/2addr v11, v13

    add-float/2addr v4, v7

    add-float v4, v4, p0

    div-float v17, v17, v4

    .line 42
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    and-int v4, v4, v19

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v4, v7, :cond_4

    move/from16 v18, v17

    :cond_4
    add-float/2addr v14, v5

    add-float/2addr v14, v8

    mul-float v14, v14, v18

    add-float/2addr v12, v6

    add-float/2addr v12, v9

    mul-float v12, v12, v18

    .line 43
    invoke-static {v15, v14}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 44
    invoke-virtual {v1, v4}, Landroidx/compose/ui/geometry/MutableRect;->setLeft(F)V

    .line 45
    invoke-static {v11, v12}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v10, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 46
    invoke-virtual {v1, v4}, Landroidx/compose/ui/geometry/MutableRect;->setTop(F)V

    .line 47
    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Landroidx/compose/ui/geometry/MutableRect;->setRight(F)V

    .line 49
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v10, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 50
    invoke-virtual {v1, v0}, Landroidx/compose/ui/geometry/MutableRect;->setBottom(F)V

    return-void
.end method

.method public static final reset-impl([F)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    aput v1, p0, v0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    aput v2, p0, v0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    aput v2, p0, v0

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    aput v2, p0, v0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    aput v2, p0, v0

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    aput v1, p0, v0

    .line 27
    .line 28
    const/4 v0, 0x6

    .line 29
    aput v2, p0, v0

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    aput v2, p0, v0

    .line 33
    .line 34
    const/16 v0, 0x8

    .line 35
    .line 36
    aput v2, p0, v0

    .line 37
    .line 38
    const/16 v0, 0x9

    .line 39
    .line 40
    aput v2, p0, v0

    .line 41
    .line 42
    const/16 v0, 0xa

    .line 43
    .line 44
    aput v1, p0, v0

    .line 45
    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    aput v2, p0, v0

    .line 49
    .line 50
    const/16 v0, 0xc

    .line 51
    .line 52
    aput v2, p0, v0

    .line 53
    .line 54
    const/16 v0, 0xd

    .line 55
    .line 56
    aput v2, p0, v0

    .line 57
    .line 58
    const/16 v0, 0xe

    .line 59
    .line 60
    aput v2, p0, v0

    .line 61
    .line 62
    const/16 v0, 0xf

    .line 63
    .line 64
    aput v1, p0, v0

    .line 65
    .line 66
    return-void
.end method

.method public static final resetToPivotedTransform-impl([FFFFFFFFFFFF)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p6

    .line 8
    .line 9
    float-to-double v3, v3

    .line 10
    const-wide v5, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    mul-double/2addr v3, v5

    .line 16
    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v7

    .line 20
    double-to-float v7, v7

    .line 21
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    double-to-float v3, v3

    .line 26
    neg-float v4, v7

    .line 27
    mul-float v8, p4, v3

    .line 28
    .line 29
    mul-float v9, p5, v7

    .line 30
    .line 31
    sub-float/2addr v8, v9

    .line 32
    mul-float v9, p4, v7

    .line 33
    .line 34
    mul-float v10, p5, v3

    .line 35
    .line 36
    add-float/2addr v10, v9

    .line 37
    move/from16 v9, p7

    .line 38
    .line 39
    float-to-double v11, v9

    .line 40
    mul-double/2addr v11, v5

    .line 41
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v13

    .line 45
    double-to-float v9, v13

    .line 46
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    double-to-float v11, v11

    .line 51
    neg-float v12, v9

    .line 52
    mul-float v13, v7, v9

    .line 53
    .line 54
    mul-float/2addr v7, v11

    .line 55
    mul-float v14, v3, v9

    .line 56
    .line 57
    mul-float v15, v3, v11

    .line 58
    .line 59
    mul-float v16, v2, v11

    .line 60
    .line 61
    mul-float v17, v10, v9

    .line 62
    .line 63
    add-float v17, v17, v16

    .line 64
    .line 65
    neg-float v2, v2

    .line 66
    mul-float/2addr v2, v9

    .line 67
    mul-float/2addr v10, v11

    .line 68
    add-float/2addr v10, v2

    .line 69
    move/from16 v2, p8

    .line 70
    .line 71
    move-wide/from16 v18, v5

    .line 72
    .line 73
    float-to-double v5, v2

    .line 74
    mul-double v5, v5, v18

    .line 75
    .line 76
    move v9, v3

    .line 77
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    double-to-float v2, v2

    .line 82
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    double-to-float v3, v5

    .line 87
    neg-float v5, v2

    .line 88
    mul-float v6, v5, v11

    .line 89
    .line 90
    mul-float v16, v3, v13

    .line 91
    .line 92
    add-float v16, v16, v6

    .line 93
    .line 94
    mul-float/2addr v11, v3

    .line 95
    mul-float/2addr v13, v2

    .line 96
    add-float/2addr v13, v11

    .line 97
    mul-float v6, v2, v9

    .line 98
    .line 99
    mul-float/2addr v9, v3

    .line 100
    mul-float/2addr v5, v12

    .line 101
    mul-float v11, v3, v7

    .line 102
    .line 103
    add-float/2addr v11, v5

    .line 104
    mul-float/2addr v3, v12

    .line 105
    mul-float/2addr v2, v7

    .line 106
    add-float/2addr v2, v3

    .line 107
    mul-float v13, v13, p9

    .line 108
    .line 109
    mul-float v6, v6, p9

    .line 110
    .line 111
    mul-float v2, v2, p9

    .line 112
    .line 113
    mul-float v16, v16, p10

    .line 114
    .line 115
    mul-float v9, v9, p10

    .line 116
    .line 117
    mul-float v11, v11, p10

    .line 118
    .line 119
    mul-float v14, v14, p11

    .line 120
    .line 121
    mul-float v4, v4, p11

    .line 122
    .line 123
    mul-float v15, v15, p11

    .line 124
    .line 125
    array-length v3, v0

    .line 126
    const/16 v5, 0x10

    .line 127
    .line 128
    if-ge v3, v5, :cond_0

    .line 129
    .line 130
    return-void

    .line 131
    :cond_0
    const/4 v3, 0x0

    .line 132
    aput v13, v0, v3

    .line 133
    .line 134
    const/4 v3, 0x1

    .line 135
    aput v6, v0, v3

    .line 136
    .line 137
    const/4 v3, 0x2

    .line 138
    aput v2, v0, v3

    .line 139
    .line 140
    const/4 v3, 0x3

    .line 141
    const/4 v5, 0x0

    .line 142
    aput v5, v0, v3

    .line 143
    .line 144
    const/4 v3, 0x4

    .line 145
    aput v16, v0, v3

    .line 146
    .line 147
    const/4 v3, 0x5

    .line 148
    aput v9, v0, v3

    .line 149
    .line 150
    const/4 v3, 0x6

    .line 151
    aput v11, v0, v3

    .line 152
    .line 153
    const/4 v3, 0x7

    .line 154
    aput v5, v0, v3

    .line 155
    .line 156
    const/16 v3, 0x8

    .line 157
    .line 158
    aput v14, v0, v3

    .line 159
    .line 160
    const/16 v3, 0x9

    .line 161
    .line 162
    aput v4, v0, v3

    .line 163
    .line 164
    const/16 v3, 0xa

    .line 165
    .line 166
    aput v15, v0, v3

    .line 167
    .line 168
    const/16 v3, 0xb

    .line 169
    .line 170
    aput v5, v0, v3

    .line 171
    .line 172
    neg-float v3, v1

    .line 173
    mul-float/2addr v13, v3

    .line 174
    mul-float v16, v16, p2

    .line 175
    .line 176
    sub-float v13, v13, v16

    .line 177
    .line 178
    add-float v13, v13, v17

    .line 179
    .line 180
    add-float/2addr v13, v1

    .line 181
    const/16 v1, 0xc

    .line 182
    .line 183
    aput v13, v0, v1

    .line 184
    .line 185
    mul-float/2addr v6, v3

    .line 186
    mul-float v9, v9, p2

    .line 187
    .line 188
    sub-float/2addr v6, v9

    .line 189
    add-float/2addr v6, v8

    .line 190
    add-float v6, v6, p2

    .line 191
    .line 192
    const/16 v1, 0xd

    .line 193
    .line 194
    aput v6, v0, v1

    .line 195
    .line 196
    mul-float/2addr v3, v2

    .line 197
    mul-float v1, p2, v11

    .line 198
    .line 199
    sub-float/2addr v3, v1

    .line 200
    add-float/2addr v3, v10

    .line 201
    const/16 v1, 0xe

    .line 202
    .line 203
    aput v3, v0, v1

    .line 204
    .line 205
    const/high16 v1, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/16 v2, 0xf

    .line 208
    .line 209
    aput v1, v0, v2

    .line 210
    .line 211
    return-void
.end method

.method public static synthetic resetToPivotedTransform-impl$default([FFFFFFFFFFFFILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p13, p12, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p13, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p13, p12, 0x2

    .line 8
    .line 9
    if-eqz p13, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p13, p12, 0x4

    .line 13
    .line 14
    if-eqz p13, :cond_2

    .line 15
    .line 16
    move p3, v0

    .line 17
    :cond_2
    and-int/lit8 p13, p12, 0x8

    .line 18
    .line 19
    if-eqz p13, :cond_3

    .line 20
    .line 21
    move p4, v0

    .line 22
    :cond_3
    and-int/lit8 p13, p12, 0x10

    .line 23
    .line 24
    if-eqz p13, :cond_4

    .line 25
    .line 26
    move p5, v0

    .line 27
    :cond_4
    and-int/lit8 p13, p12, 0x20

    .line 28
    .line 29
    if-eqz p13, :cond_5

    .line 30
    .line 31
    move p6, v0

    .line 32
    :cond_5
    and-int/lit8 p13, p12, 0x40

    .line 33
    .line 34
    if-eqz p13, :cond_6

    .line 35
    .line 36
    move p7, v0

    .line 37
    :cond_6
    and-int/lit16 p13, p12, 0x80

    .line 38
    .line 39
    if-eqz p13, :cond_7

    .line 40
    .line 41
    move p8, v0

    .line 42
    :cond_7
    and-int/lit16 p13, p12, 0x100

    .line 43
    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    .line 45
    .line 46
    if-eqz p13, :cond_8

    .line 47
    .line 48
    move p9, v0

    .line 49
    :cond_8
    and-int/lit16 p13, p12, 0x200

    .line 50
    .line 51
    if-eqz p13, :cond_9

    .line 52
    .line 53
    move p10, v0

    .line 54
    :cond_9
    and-int/lit16 p12, p12, 0x400

    .line 55
    .line 56
    if-eqz p12, :cond_a

    .line 57
    .line 58
    move p11, v0

    .line 59
    :cond_a
    invoke-static/range {p0 .. p11}, Landroidx/compose/ui/graphics/Matrix;->resetToPivotedTransform-impl([FFFFFFFFFFFF)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static final rotateX-impl([FF)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    move/from16 v1, p1

    .line 10
    .line 11
    float-to-double v1, v1

    .line 12
    const-wide v3, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr v1, v3

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    double-to-float v3, v3

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    double-to-float v1, v1

    .line 28
    const/4 v2, 0x1

    .line 29
    aget v4, v0, v2

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    aget v6, v0, v5

    .line 33
    .line 34
    mul-float v7, v4, v1

    .line 35
    .line 36
    mul-float v8, v6, v3

    .line 37
    .line 38
    sub-float/2addr v7, v8

    .line 39
    mul-float/2addr v4, v3

    .line 40
    mul-float/2addr v6, v1

    .line 41
    add-float/2addr v6, v4

    .line 42
    const/4 v4, 0x5

    .line 43
    aget v8, v0, v4

    .line 44
    .line 45
    const/4 v9, 0x6

    .line 46
    aget v10, v0, v9

    .line 47
    .line 48
    mul-float v11, v8, v1

    .line 49
    .line 50
    mul-float v12, v10, v3

    .line 51
    .line 52
    sub-float/2addr v11, v12

    .line 53
    mul-float/2addr v8, v3

    .line 54
    mul-float/2addr v10, v1

    .line 55
    add-float/2addr v10, v8

    .line 56
    const/16 v8, 0x9

    .line 57
    .line 58
    aget v12, v0, v8

    .line 59
    .line 60
    const/16 v13, 0xa

    .line 61
    .line 62
    aget v14, v0, v13

    .line 63
    .line 64
    mul-float v15, v12, v1

    .line 65
    .line 66
    mul-float v16, v14, v3

    .line 67
    .line 68
    sub-float v15, v15, v16

    .line 69
    .line 70
    mul-float/2addr v12, v3

    .line 71
    mul-float/2addr v14, v1

    .line 72
    add-float/2addr v14, v12

    .line 73
    const/16 v12, 0xd

    .line 74
    .line 75
    aget v16, v0, v12

    .line 76
    .line 77
    const/16 v17, 0xe

    .line 78
    .line 79
    aget v18, v0, v17

    .line 80
    .line 81
    mul-float v19, v16, v1

    .line 82
    .line 83
    mul-float v20, v18, v3

    .line 84
    .line 85
    sub-float v19, v19, v20

    .line 86
    .line 87
    mul-float v16, v16, v3

    .line 88
    .line 89
    mul-float v18, v18, v1

    .line 90
    .line 91
    add-float v18, v18, v16

    .line 92
    .line 93
    aput v7, v0, v2

    .line 94
    .line 95
    aput v6, v0, v5

    .line 96
    .line 97
    aput v11, v0, v4

    .line 98
    .line 99
    aput v10, v0, v9

    .line 100
    .line 101
    aput v15, v0, v8

    .line 102
    .line 103
    aput v14, v0, v13

    .line 104
    .line 105
    aput v19, v0, v12

    .line 106
    .line 107
    aput v18, v0, v17

    .line 108
    .line 109
    return-void
.end method

.method public static final rotateY-impl([FF)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    move/from16 v1, p1

    .line 10
    .line 11
    float-to-double v1, v1

    .line 12
    const-wide v3, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr v1, v3

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    double-to-float v3, v3

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    double-to-float v1, v1

    .line 28
    const/4 v2, 0x0

    .line 29
    aget v4, v0, v2

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    aget v6, v0, v5

    .line 33
    .line 34
    mul-float v7, v4, v1

    .line 35
    .line 36
    mul-float v8, v6, v3

    .line 37
    .line 38
    add-float/2addr v8, v7

    .line 39
    neg-float v4, v4

    .line 40
    mul-float/2addr v4, v3

    .line 41
    mul-float/2addr v6, v1

    .line 42
    add-float/2addr v6, v4

    .line 43
    const/4 v4, 0x4

    .line 44
    aget v7, v0, v4

    .line 45
    .line 46
    const/4 v9, 0x6

    .line 47
    aget v10, v0, v9

    .line 48
    .line 49
    mul-float v11, v7, v1

    .line 50
    .line 51
    mul-float v12, v10, v3

    .line 52
    .line 53
    add-float/2addr v12, v11

    .line 54
    neg-float v7, v7

    .line 55
    mul-float/2addr v7, v3

    .line 56
    mul-float/2addr v10, v1

    .line 57
    add-float/2addr v10, v7

    .line 58
    const/16 v7, 0x8

    .line 59
    .line 60
    aget v11, v0, v7

    .line 61
    .line 62
    const/16 v13, 0xa

    .line 63
    .line 64
    aget v14, v0, v13

    .line 65
    .line 66
    mul-float v15, v11, v1

    .line 67
    .line 68
    mul-float v16, v14, v3

    .line 69
    .line 70
    add-float v16, v16, v15

    .line 71
    .line 72
    neg-float v11, v11

    .line 73
    mul-float/2addr v11, v3

    .line 74
    mul-float/2addr v14, v1

    .line 75
    add-float/2addr v14, v11

    .line 76
    const/16 v11, 0xc

    .line 77
    .line 78
    aget v15, v0, v11

    .line 79
    .line 80
    const/16 v17, 0xe

    .line 81
    .line 82
    aget v18, v0, v17

    .line 83
    .line 84
    mul-float v19, v15, v1

    .line 85
    .line 86
    mul-float v20, v18, v3

    .line 87
    .line 88
    add-float v20, v20, v19

    .line 89
    .line 90
    neg-float v15, v15

    .line 91
    mul-float/2addr v15, v3

    .line 92
    mul-float v18, v18, v1

    .line 93
    .line 94
    add-float v18, v18, v15

    .line 95
    .line 96
    aput v8, v0, v2

    .line 97
    .line 98
    aput v6, v0, v5

    .line 99
    .line 100
    aput v12, v0, v4

    .line 101
    .line 102
    aput v10, v0, v9

    .line 103
    .line 104
    aput v16, v0, v7

    .line 105
    .line 106
    aput v14, v0, v13

    .line 107
    .line 108
    aput v20, v0, v11

    .line 109
    .line 110
    aput v18, v0, v17

    .line 111
    .line 112
    return-void
.end method

.method public static final rotateZ-impl([FF)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    move/from16 v1, p1

    .line 10
    .line 11
    float-to-double v1, v1

    .line 12
    const-wide v3, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    mul-double/2addr v1, v3

    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    double-to-float v3, v3

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    double-to-float v1, v1

    .line 28
    const/4 v2, 0x0

    .line 29
    aget v4, v0, v2

    .line 30
    .line 31
    const/4 v5, 0x4

    .line 32
    aget v6, v0, v5

    .line 33
    .line 34
    mul-float v7, v1, v4

    .line 35
    .line 36
    mul-float v8, v3, v6

    .line 37
    .line 38
    add-float/2addr v8, v7

    .line 39
    neg-float v7, v3

    .line 40
    mul-float/2addr v4, v7

    .line 41
    mul-float/2addr v6, v1

    .line 42
    add-float/2addr v6, v4

    .line 43
    const/4 v4, 0x1

    .line 44
    aget v9, v0, v4

    .line 45
    .line 46
    const/4 v10, 0x5

    .line 47
    aget v11, v0, v10

    .line 48
    .line 49
    mul-float v12, v1, v9

    .line 50
    .line 51
    mul-float v13, v3, v11

    .line 52
    .line 53
    add-float/2addr v13, v12

    .line 54
    mul-float/2addr v9, v7

    .line 55
    mul-float/2addr v11, v1

    .line 56
    add-float/2addr v11, v9

    .line 57
    const/4 v9, 0x2

    .line 58
    aget v12, v0, v9

    .line 59
    .line 60
    const/4 v14, 0x6

    .line 61
    aget v15, v0, v14

    .line 62
    .line 63
    mul-float v16, v1, v12

    .line 64
    .line 65
    mul-float v17, v3, v15

    .line 66
    .line 67
    add-float v17, v17, v16

    .line 68
    .line 69
    mul-float/2addr v12, v7

    .line 70
    mul-float/2addr v15, v1

    .line 71
    add-float/2addr v15, v12

    .line 72
    const/4 v12, 0x3

    .line 73
    aget v16, v0, v12

    .line 74
    .line 75
    const/16 v18, 0x7

    .line 76
    .line 77
    aget v19, v0, v18

    .line 78
    .line 79
    mul-float v20, v1, v16

    .line 80
    .line 81
    mul-float v3, v3, v19

    .line 82
    .line 83
    add-float v3, v3, v20

    .line 84
    .line 85
    mul-float v7, v7, v16

    .line 86
    .line 87
    mul-float v1, v1, v19

    .line 88
    .line 89
    add-float/2addr v1, v7

    .line 90
    aput v8, v0, v2

    .line 91
    .line 92
    aput v13, v0, v4

    .line 93
    .line 94
    aput v17, v0, v9

    .line 95
    .line 96
    aput v3, v0, v12

    .line 97
    .line 98
    aput v6, v0, v5

    .line 99
    .line 100
    aput v11, v0, v10

    .line 101
    .line 102
    aput v15, v0, v14

    .line 103
    .line 104
    aput v1, v0, v18

    .line 105
    .line 106
    return-void
.end method

.method public static final scale-impl([FFFF)V
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v1, p0, v0

    .line 9
    .line 10
    mul-float/2addr v1, p1

    .line 11
    aput v1, p0, v0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aget v1, p0, v0

    .line 15
    .line 16
    mul-float/2addr v1, p1

    .line 17
    aput v1, p0, v0

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    aget v1, p0, v0

    .line 21
    .line 22
    mul-float/2addr v1, p1

    .line 23
    aput v1, p0, v0

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    aget v1, p0, v0

    .line 27
    .line 28
    mul-float/2addr v1, p1

    .line 29
    aput v1, p0, v0

    .line 30
    .line 31
    const/4 p1, 0x4

    .line 32
    aget v0, p0, p1

    .line 33
    .line 34
    mul-float/2addr v0, p2

    .line 35
    aput v0, p0, p1

    .line 36
    .line 37
    const/4 p1, 0x5

    .line 38
    aget v0, p0, p1

    .line 39
    .line 40
    mul-float/2addr v0, p2

    .line 41
    aput v0, p0, p1

    .line 42
    .line 43
    const/4 p1, 0x6

    .line 44
    aget v0, p0, p1

    .line 45
    .line 46
    mul-float/2addr v0, p2

    .line 47
    aput v0, p0, p1

    .line 48
    .line 49
    const/4 p1, 0x7

    .line 50
    aget v0, p0, p1

    .line 51
    .line 52
    mul-float/2addr v0, p2

    .line 53
    aput v0, p0, p1

    .line 54
    .line 55
    const/16 p1, 0x8

    .line 56
    .line 57
    aget p2, p0, p1

    .line 58
    .line 59
    mul-float/2addr p2, p3

    .line 60
    aput p2, p0, p1

    .line 61
    .line 62
    const/16 p1, 0x9

    .line 63
    .line 64
    aget p2, p0, p1

    .line 65
    .line 66
    mul-float/2addr p2, p3

    .line 67
    aput p2, p0, p1

    .line 68
    .line 69
    const/16 p1, 0xa

    .line 70
    .line 71
    aget p2, p0, p1

    .line 72
    .line 73
    mul-float/2addr p2, p3

    .line 74
    aput p2, p0, p1

    .line 75
    .line 76
    const/16 p1, 0xb

    .line 77
    .line 78
    aget p2, p0, p1

    .line 79
    .line 80
    mul-float/2addr p2, p3

    .line 81
    aput p2, p0, p1

    .line 82
    .line 83
    return-void
.end method

.method public static synthetic scale-impl$default([FFFFILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    move p1, v0

    .line 8
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    move p2, v0

    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    move p3, v0

    .line 18
    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/graphics/Matrix;->scale-impl([FFFF)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final set-impl([FIIF)V
    .locals 0

    .line 1
    mul-int/lit8 p1, p1, 0x4

    .line 2
    .line 3
    add-int/2addr p1, p2

    .line 4
    aput p3, p0, p1

    .line 5
    .line 6
    return-void
.end method

.method public static final setFrom-58bKbWc([F[F)V
    .locals 2
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    array-length v0, p1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    aget v1, p1, v0

    .line 13
    .line 14
    aput v1, p0, v0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    aget v1, p1, v0

    .line 18
    .line 19
    aput v1, p0, v0

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    aget v1, p1, v0

    .line 23
    .line 24
    aput v1, p0, v0

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    aget v1, p1, v0

    .line 28
    .line 29
    aput v1, p0, v0

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    aget v1, p1, v0

    .line 33
    .line 34
    aput v1, p0, v0

    .line 35
    .line 36
    const/4 v0, 0x5

    .line 37
    aget v1, p1, v0

    .line 38
    .line 39
    aput v1, p0, v0

    .line 40
    .line 41
    const/4 v0, 0x6

    .line 42
    aget v1, p1, v0

    .line 43
    .line 44
    aput v1, p0, v0

    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    aget v1, p1, v0

    .line 48
    .line 49
    aput v1, p0, v0

    .line 50
    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    aget v1, p1, v0

    .line 54
    .line 55
    aput v1, p0, v0

    .line 56
    .line 57
    const/16 v0, 0x9

    .line 58
    .line 59
    aget v1, p1, v0

    .line 60
    .line 61
    aput v1, p0, v0

    .line 62
    .line 63
    const/16 v0, 0xa

    .line 64
    .line 65
    aget v1, p1, v0

    .line 66
    .line 67
    aput v1, p0, v0

    .line 68
    .line 69
    const/16 v0, 0xb

    .line 70
    .line 71
    aget v1, p1, v0

    .line 72
    .line 73
    aput v1, p0, v0

    .line 74
    .line 75
    const/16 v0, 0xc

    .line 76
    .line 77
    aget v1, p1, v0

    .line 78
    .line 79
    aput v1, p0, v0

    .line 80
    .line 81
    const/16 v0, 0xd

    .line 82
    .line 83
    aget v1, p1, v0

    .line 84
    .line 85
    aput v1, p0, v0

    .line 86
    .line 87
    const/16 v0, 0xe

    .line 88
    .line 89
    aget v1, p1, v0

    .line 90
    .line 91
    aput v1, p0, v0

    .line 92
    .line 93
    const/16 v0, 0xf

    .line 94
    .line 95
    aget p1, p1, v0

    .line 96
    .line 97
    aput p1, p0, v0

    .line 98
    .line 99
    return-void
.end method

.method public static final timesAssign-58bKbWc([F[F)V
    .locals 49
    .param p1    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    array-length v2, v1

    .line 12
    if-ge v2, v3, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    const/4 v2, 0x0

    .line 16
    aget v3, v0, v2

    .line 17
    .line 18
    aget v4, v1, v2

    .line 19
    .line 20
    mul-float v5, v3, v4

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    aget v7, v0, v6

    .line 24
    .line 25
    const/4 v8, 0x4

    .line 26
    aget v9, v1, v8

    .line 27
    .line 28
    mul-float v10, v7, v9

    .line 29
    .line 30
    add-float/2addr v10, v5

    .line 31
    const/4 v5, 0x2

    .line 32
    aget v11, v0, v5

    .line 33
    .line 34
    const/16 v12, 0x8

    .line 35
    .line 36
    aget v13, v1, v12

    .line 37
    .line 38
    mul-float v14, v11, v13

    .line 39
    .line 40
    add-float/2addr v14, v10

    .line 41
    const/4 v10, 0x3

    .line 42
    aget v15, v0, v10

    .line 43
    .line 44
    const/16 v16, 0xc

    .line 45
    .line 46
    aget v17, v1, v16

    .line 47
    .line 48
    mul-float v18, v15, v17

    .line 49
    .line 50
    add-float v18, v18, v14

    .line 51
    .line 52
    aget v14, v1, v6

    .line 53
    .line 54
    mul-float v19, v3, v14

    .line 55
    .line 56
    const/16 v20, 0x5

    .line 57
    .line 58
    aget v21, v1, v20

    .line 59
    .line 60
    mul-float v22, v7, v21

    .line 61
    .line 62
    add-float v22, v22, v19

    .line 63
    .line 64
    const/16 v19, 0x9

    .line 65
    .line 66
    aget v23, v1, v19

    .line 67
    .line 68
    mul-float v24, v11, v23

    .line 69
    .line 70
    add-float v24, v24, v22

    .line 71
    .line 72
    const/16 v22, 0xd

    .line 73
    .line 74
    aget v25, v1, v22

    .line 75
    .line 76
    mul-float v26, v15, v25

    .line 77
    .line 78
    add-float v26, v26, v24

    .line 79
    .line 80
    aget v24, v1, v5

    .line 81
    .line 82
    mul-float v27, v3, v24

    .line 83
    .line 84
    const/16 v28, 0x6

    .line 85
    .line 86
    aget v29, v1, v28

    .line 87
    .line 88
    mul-float v30, v7, v29

    .line 89
    .line 90
    add-float v30, v30, v27

    .line 91
    .line 92
    const/16 v27, 0xa

    .line 93
    .line 94
    aget v31, v1, v27

    .line 95
    .line 96
    mul-float v32, v11, v31

    .line 97
    .line 98
    add-float v32, v32, v30

    .line 99
    .line 100
    const/16 v30, 0xe

    .line 101
    .line 102
    aget v33, v1, v30

    .line 103
    .line 104
    mul-float v34, v15, v33

    .line 105
    .line 106
    add-float v34, v34, v32

    .line 107
    .line 108
    aget v32, v1, v10

    .line 109
    .line 110
    mul-float v3, v3, v32

    .line 111
    .line 112
    const/16 v35, 0x7

    .line 113
    .line 114
    aget v36, v1, v35

    .line 115
    .line 116
    mul-float v7, v7, v36

    .line 117
    .line 118
    add-float/2addr v7, v3

    .line 119
    const/16 v3, 0xb

    .line 120
    .line 121
    aget v37, v1, v3

    .line 122
    .line 123
    mul-float v11, v11, v37

    .line 124
    .line 125
    add-float/2addr v11, v7

    .line 126
    const/16 v7, 0xf

    .line 127
    .line 128
    aget v1, v1, v7

    .line 129
    .line 130
    mul-float/2addr v15, v1

    .line 131
    add-float/2addr v15, v11

    .line 132
    aget v11, v0, v8

    .line 133
    .line 134
    mul-float v38, v11, v4

    .line 135
    .line 136
    aget v39, v0, v20

    .line 137
    .line 138
    mul-float v40, v39, v9

    .line 139
    .line 140
    add-float v40, v40, v38

    .line 141
    .line 142
    aget v38, v0, v28

    .line 143
    .line 144
    mul-float v41, v38, v13

    .line 145
    .line 146
    add-float v41, v41, v40

    .line 147
    .line 148
    aget v40, v0, v35

    .line 149
    .line 150
    mul-float v42, v40, v17

    .line 151
    .line 152
    add-float v42, v42, v41

    .line 153
    .line 154
    mul-float v41, v11, v14

    .line 155
    .line 156
    mul-float v43, v39, v21

    .line 157
    .line 158
    add-float v43, v43, v41

    .line 159
    .line 160
    mul-float v41, v38, v23

    .line 161
    .line 162
    add-float v41, v41, v43

    .line 163
    .line 164
    mul-float v43, v40, v25

    .line 165
    .line 166
    add-float v43, v43, v41

    .line 167
    .line 168
    mul-float v41, v11, v24

    .line 169
    .line 170
    mul-float v44, v39, v29

    .line 171
    .line 172
    add-float v44, v44, v41

    .line 173
    .line 174
    mul-float v41, v38, v31

    .line 175
    .line 176
    add-float v41, v41, v44

    .line 177
    .line 178
    mul-float v44, v40, v33

    .line 179
    .line 180
    add-float v44, v44, v41

    .line 181
    .line 182
    mul-float v11, v11, v32

    .line 183
    .line 184
    mul-float v39, v39, v36

    .line 185
    .line 186
    add-float v39, v39, v11

    .line 187
    .line 188
    mul-float v38, v38, v37

    .line 189
    .line 190
    add-float v38, v38, v39

    .line 191
    .line 192
    mul-float v40, v40, v1

    .line 193
    .line 194
    add-float v40, v40, v38

    .line 195
    .line 196
    aget v11, v0, v12

    .line 197
    .line 198
    mul-float v38, v11, v4

    .line 199
    .line 200
    aget v39, v0, v19

    .line 201
    .line 202
    mul-float v41, v39, v9

    .line 203
    .line 204
    add-float v41, v41, v38

    .line 205
    .line 206
    aget v38, v0, v27

    .line 207
    .line 208
    mul-float v45, v38, v13

    .line 209
    .line 210
    add-float v45, v45, v41

    .line 211
    .line 212
    aget v41, v0, v3

    .line 213
    .line 214
    mul-float v46, v41, v17

    .line 215
    .line 216
    add-float v46, v46, v45

    .line 217
    .line 218
    mul-float v45, v11, v14

    .line 219
    .line 220
    mul-float v47, v39, v21

    .line 221
    .line 222
    add-float v47, v47, v45

    .line 223
    .line 224
    mul-float v45, v38, v23

    .line 225
    .line 226
    add-float v45, v45, v47

    .line 227
    .line 228
    mul-float v47, v41, v25

    .line 229
    .line 230
    add-float v47, v47, v45

    .line 231
    .line 232
    mul-float v45, v11, v24

    .line 233
    .line 234
    mul-float v48, v39, v29

    .line 235
    .line 236
    add-float v48, v48, v45

    .line 237
    .line 238
    mul-float v45, v38, v31

    .line 239
    .line 240
    add-float v45, v45, v48

    .line 241
    .line 242
    mul-float v48, v41, v33

    .line 243
    .line 244
    add-float v48, v48, v45

    .line 245
    .line 246
    mul-float v11, v11, v32

    .line 247
    .line 248
    mul-float v39, v39, v36

    .line 249
    .line 250
    add-float v39, v39, v11

    .line 251
    .line 252
    mul-float v38, v38, v37

    .line 253
    .line 254
    add-float v38, v38, v39

    .line 255
    .line 256
    mul-float v41, v41, v1

    .line 257
    .line 258
    add-float v41, v41, v38

    .line 259
    .line 260
    aget v11, v0, v16

    .line 261
    .line 262
    mul-float/2addr v4, v11

    .line 263
    aget v38, v0, v22

    .line 264
    .line 265
    mul-float v9, v9, v38

    .line 266
    .line 267
    add-float/2addr v9, v4

    .line 268
    aget v4, v0, v30

    .line 269
    .line 270
    mul-float/2addr v13, v4

    .line 271
    add-float/2addr v13, v9

    .line 272
    aget v9, v0, v7

    .line 273
    .line 274
    mul-float v17, v17, v9

    .line 275
    .line 276
    add-float v17, v17, v13

    .line 277
    .line 278
    mul-float/2addr v14, v11

    .line 279
    mul-float v21, v21, v38

    .line 280
    .line 281
    add-float v21, v21, v14

    .line 282
    .line 283
    mul-float v23, v23, v4

    .line 284
    .line 285
    add-float v23, v23, v21

    .line 286
    .line 287
    mul-float v25, v25, v9

    .line 288
    .line 289
    add-float v25, v25, v23

    .line 290
    .line 291
    mul-float v24, v24, v11

    .line 292
    .line 293
    mul-float v29, v29, v38

    .line 294
    .line 295
    add-float v29, v29, v24

    .line 296
    .line 297
    mul-float v31, v31, v4

    .line 298
    .line 299
    add-float v31, v31, v29

    .line 300
    .line 301
    mul-float v33, v33, v9

    .line 302
    .line 303
    add-float v33, v33, v31

    .line 304
    .line 305
    mul-float v11, v11, v32

    .line 306
    .line 307
    mul-float v38, v38, v36

    .line 308
    .line 309
    add-float v38, v38, v11

    .line 310
    .line 311
    mul-float v4, v4, v37

    .line 312
    .line 313
    add-float v4, v4, v38

    .line 314
    .line 315
    mul-float/2addr v9, v1

    .line 316
    add-float/2addr v9, v4

    .line 317
    aput v18, v0, v2

    .line 318
    .line 319
    aput v26, v0, v6

    .line 320
    .line 321
    aput v34, v0, v5

    .line 322
    .line 323
    aput v15, v0, v10

    .line 324
    .line 325
    aput v42, v0, v8

    .line 326
    .line 327
    aput v43, v0, v20

    .line 328
    .line 329
    aput v44, v0, v28

    .line 330
    .line 331
    aput v40, v0, v35

    .line 332
    .line 333
    aput v46, v0, v12

    .line 334
    .line 335
    aput v47, v0, v19

    .line 336
    .line 337
    aput v48, v0, v27

    .line 338
    .line 339
    aput v41, v0, v3

    .line 340
    .line 341
    aput v17, v0, v16

    .line 342
    .line 343
    aput v25, v0, v22

    .line 344
    .line 345
    aput v33, v0, v30

    .line 346
    .line 347
    aput v9, v0, v7

    .line 348
    .line 349
    return-void
.end method

.method public static toString-impl([F)Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\n            |"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget v1, p0, v1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x20

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    aget v2, p0, v2

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    aget v2, p0, v2

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    aget v2, p0, v2

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v2, "|\n            |"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x4

    .line 50
    aget v3, p0, v3

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x5

    .line 59
    aget v3, p0, v3

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x6

    .line 68
    aget v3, p0, v3

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/4 v3, 0x7

    .line 77
    aget v3, p0, v3

    .line 78
    .line 79
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const/16 v3, 0x8

    .line 86
    .line 87
    aget v3, p0, v3

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const/16 v3, 0x9

    .line 96
    .line 97
    aget v3, p0, v3

    .line 98
    .line 99
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const/16 v3, 0xa

    .line 106
    .line 107
    aget v3, p0, v3

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v3, 0xb

    .line 116
    .line 117
    aget v3, p0, v3

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const/16 v2, 0xc

    .line 126
    .line 127
    aget v2, p0, v2

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const/16 v2, 0xd

    .line 136
    .line 137
    aget v2, p0, v2

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const/16 v2, 0xe

    .line 146
    .line 147
    aget v2, p0, v2

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v1, 0xf

    .line 156
    .line 157
    aget p0, p0, v1

    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string/jumbo p0, "|\n        "

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0}, Lkotlin/text/q;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0
.end method

.method public static final translate-impl([FFFF)V
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    mul-float/2addr v0, p1

    .line 11
    const/4 v1, 0x4

    .line 12
    aget v1, p0, v1

    .line 13
    .line 14
    mul-float/2addr v1, p2

    .line 15
    add-float/2addr v1, v0

    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    aget v0, p0, v0

    .line 19
    .line 20
    mul-float/2addr v0, p3

    .line 21
    add-float/2addr v0, v1

    .line 22
    const/16 v1, 0xc

    .line 23
    .line 24
    aget v2, p0, v1

    .line 25
    .line 26
    add-float/2addr v0, v2

    .line 27
    const/4 v2, 0x1

    .line 28
    aget v2, p0, v2

    .line 29
    .line 30
    mul-float/2addr v2, p1

    .line 31
    const/4 v3, 0x5

    .line 32
    aget v3, p0, v3

    .line 33
    .line 34
    mul-float/2addr v3, p2

    .line 35
    add-float/2addr v3, v2

    .line 36
    const/16 v2, 0x9

    .line 37
    .line 38
    aget v2, p0, v2

    .line 39
    .line 40
    mul-float/2addr v2, p3

    .line 41
    add-float/2addr v2, v3

    .line 42
    const/16 v3, 0xd

    .line 43
    .line 44
    aget v4, p0, v3

    .line 45
    .line 46
    add-float/2addr v2, v4

    .line 47
    const/4 v4, 0x2

    .line 48
    aget v4, p0, v4

    .line 49
    .line 50
    mul-float/2addr v4, p1

    .line 51
    const/4 v5, 0x6

    .line 52
    aget v5, p0, v5

    .line 53
    .line 54
    mul-float/2addr v5, p2

    .line 55
    add-float/2addr v5, v4

    .line 56
    const/16 v4, 0xa

    .line 57
    .line 58
    aget v4, p0, v4

    .line 59
    .line 60
    mul-float/2addr v4, p3

    .line 61
    add-float/2addr v4, v5

    .line 62
    const/16 v5, 0xe

    .line 63
    .line 64
    aget v6, p0, v5

    .line 65
    .line 66
    add-float/2addr v4, v6

    .line 67
    const/4 v6, 0x3

    .line 68
    aget v6, p0, v6

    .line 69
    .line 70
    mul-float/2addr v6, p1

    .line 71
    const/4 p1, 0x7

    .line 72
    aget p1, p0, p1

    .line 73
    .line 74
    mul-float/2addr p1, p2

    .line 75
    add-float/2addr p1, v6

    .line 76
    const/16 p2, 0xb

    .line 77
    .line 78
    aget p2, p0, p2

    .line 79
    .line 80
    mul-float/2addr p2, p3

    .line 81
    add-float/2addr p2, p1

    .line 82
    const/16 p1, 0xf

    .line 83
    .line 84
    aget p3, p0, p1

    .line 85
    .line 86
    add-float/2addr p2, p3

    .line 87
    aput v0, p0, v1

    .line 88
    .line 89
    aput v2, p0, v3

    .line 90
    .line 91
    aput v4, p0, v5

    .line 92
    .line 93
    aput p2, p0, p1

    .line 94
    .line 95
    return-void
.end method

.method public static synthetic translate-impl$default([FFFFILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p1, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move p3, v0

    .line 17
    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/graphics/Matrix;->translate-impl([FFFF)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/Matrix;->values:[F

    invoke-static {v0, p1}, Landroidx/compose/ui/graphics/Matrix;->equals-impl([FLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getValues()[F
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/Matrix;->values:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/Matrix;->values:[F

    invoke-static {v0}, Landroidx/compose/ui/graphics/Matrix;->hashCode-impl([F)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/Matrix;->values:[F

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/graphics/Matrix;->toString-impl([F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final synthetic unbox-impl()[F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/Matrix;->values:[F

    return-object v0
.end method
