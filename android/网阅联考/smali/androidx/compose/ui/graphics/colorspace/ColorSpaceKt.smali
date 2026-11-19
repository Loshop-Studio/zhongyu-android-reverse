.class public final Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0008\n\u0002\u0010\u0014\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a8\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010$\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u00112\u0008\u0008\u0002\u0010\'\u001a\u00020(H\u0007\u001a+\u0010)\u001a\u00020**\u00020%2\u0008\u0008\u0002\u0010+\u001a\u00020%2\u0008\u0008\u0002\u0010,\u001a\u00020-\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008.\u0010/\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u00060"
    }
    d2 = {
        "absRcpResponse",
        "",
        "x",
        "a",
        "b",
        "c",
        "d",
        "g",
        "absResponse",
        "chromaticAdaptation",
        "",
        "matrix",
        "srcWhitePoint",
        "dstWhitePoint",
        "compare",
        "",
        "Landroidx/compose/ui/graphics/colorspace/TransferParameters;",
        "Landroidx/compose/ui/graphics/colorspace/WhitePoint;",
        "inverse3x3",
        "m",
        "mul3x3",
        "lhs",
        "rhs",
        "mul3x3Diag",
        "mul3x3Float3",
        "mul3x3Float3_0",
        "",
        "r0",
        "r1",
        "r2",
        "mul3x3Float3_1",
        "mul3x3Float3_2",
        "rcpResponse",
        "e",
        "f",
        "response",
        "adapt",
        "Landroidx/compose/ui/graphics/colorspace/ColorSpace;",
        "whitePoint",
        "adaptation",
        "Landroidx/compose/ui/graphics/colorspace/Adaptation;",
        "connect",
        "Landroidx/compose/ui/graphics/colorspace/Connector;",
        "destination",
        "intent",
        "Landroidx/compose/ui/graphics/colorspace/RenderIntent;",
        "connect-YBCOT_4",
        "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final absRcpResponse(DDDDDD)D
    .locals 16

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmpg-double v2, v0, v2

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    neg-double v2, v0

    .line 10
    move-wide v4, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v0

    .line 13
    :goto_0
    move-wide/from16 v6, p2

    .line 14
    .line 15
    move-wide/from16 v8, p4

    .line 16
    .line 17
    move-wide/from16 v10, p6

    .line 18
    .line 19
    move-wide/from16 v12, p8

    .line 20
    .line 21
    move-wide/from16 v14, p10

    .line 22
    .line 23
    invoke-static/range {v4 .. v15}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->rcpResponse(DDDDDD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->copySign(DD)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    return-wide v0
.end method

.method public static final absResponse(DDDDDD)D
    .locals 16

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmpg-double v2, v0, v2

    .line 6
    .line 7
    if-gez v2, :cond_0

    .line 8
    .line 9
    neg-double v2, v0

    .line 10
    move-wide v4, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v0

    .line 13
    :goto_0
    move-wide/from16 v6, p2

    .line 14
    .line 15
    move-wide/from16 v8, p4

    .line 16
    .line 17
    move-wide/from16 v10, p6

    .line 18
    .line 19
    move-wide/from16 v12, p8

    .line 20
    .line 21
    move-wide/from16 v14, p10

    .line 22
    .line 23
    invoke-static/range {v4 .. v15}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->response(DDDDDD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->copySign(DD)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    return-wide v0
.end method

.method public static final adapt(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .locals 2
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "whitePoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->adapt$default(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;ILjava/lang/Object;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    move-result-object p0

    return-object p0
.end method

.method public static final adapt(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .locals 4
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "whitePoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adaptation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getModel-xdoWZVw()J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/graphics/colorspace/ColorModel;->Companion:Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getRgb-xdoWZVw()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/colorspace/ColorModel;->equals-impl0(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 4
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Rgb;->getWhitePoint()Landroidx/compose/ui/graphics/colorspace/WhitePoint;

    move-result-object v1

    invoke-static {v1, p1}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->compare(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/WhitePoint;->toXyz$ui_graphics_release()[F

    move-result-object p0

    .line 6
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/colorspace/Adaptation;->getTransform$ui_graphics_release()[F

    move-result-object p2

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Rgb;->getWhitePoint()Landroidx/compose/ui/graphics/colorspace/WhitePoint;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/colorspace/WhitePoint;->toXyz$ui_graphics_release()[F

    move-result-object v1

    .line 8
    invoke-static {p2, v1, p0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->chromaticAdaptation([F[F[F)[F

    move-result-object p0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Rgb;->getTransform$ui_graphics_release()[F

    move-result-object p2

    .line 10
    invoke-static {p0, p2}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->mul3x3([F[F)[F

    move-result-object p0

    .line 11
    new-instance p2, Landroidx/compose/ui/graphics/colorspace/Rgb;

    invoke-direct {p2, v0, p0, p1}, Landroidx/compose/ui/graphics/colorspace/Rgb;-><init>(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V

    return-object p2

    :cond_1
    return-object p0
.end method

.method public static synthetic adapt$default(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;ILjava/lang/Object;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Landroidx/compose/ui/graphics/colorspace/Adaptation;->Companion:Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/colorspace/Adaptation$Companion;->getBradford()Landroidx/compose/ui/graphics/colorspace/Adaptation;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->adapt(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final chromaticAdaptation([F[F[F)[F
    .locals 4

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "srcWhitePoint"

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "dstWhitePoint"

    .line 13
    .line 14
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->mul3x3Float3([F[F)[F

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p0, p2}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->mul3x3Float3([F[F)[F

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x3

    .line 26
    new-array v0, v0, [F

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    aget v2, p2, v1

    .line 30
    .line 31
    aget v3, p1, v1

    .line 32
    .line 33
    div-float/2addr v2, v3

    .line 34
    aput v2, v0, v1

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    aget v2, p2, v1

    .line 38
    .line 39
    aget v3, p1, v1

    .line 40
    .line 41
    div-float/2addr v2, v3

    .line 42
    aput v2, v0, v1

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    aget p2, p2, v1

    .line 46
    .line 47
    aget p1, p1, v1

    .line 48
    .line 49
    div-float/2addr p2, p1

    .line 50
    aput p2, v0, v1

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->inverse3x3([F)[F

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {v0, p0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->mul3x3Diag([F[F)[F

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p1, p0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->mul3x3([F[F)[F

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static final compare(Landroidx/compose/ui/graphics/colorspace/TransferParameters;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Z
    .locals 6

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getA()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getA()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getB()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getB()D

    move-result-wide v4

    sub-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getC()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getC()D

    move-result-wide v4

    sub-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getD()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getD()D

    move-result-wide v4

    sub-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v4, 0x3f60624dd2f1a9fcL    # 0.002

    cmpg-double v0, v0, v4

    if-gez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getE()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getE()D

    move-result-wide v4

    sub-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getF()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getF()D

    move-result-wide v4

    sub-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getGamma()D

    move-result-wide v0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/TransferParameters;->getGamma()D

    move-result-wide p0

    sub-double/2addr v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    cmpg-double p0, p0, v2

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final compare(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z
    .locals 3

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/WhitePoint;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/WhitePoint;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3a83126f    # 0.001f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/WhitePoint;->getY()F

    move-result p0

    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/WhitePoint;->getY()F

    move-result p1

    sub-float/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, v2

    if-gez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final compare([F[F)Z
    .locals 6

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 9
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    .line 10
    aget v4, p0, v3

    aget v5, p1, v3

    invoke-static {v4, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v4

    if-eqz v4, :cond_1

    aget v4, p0, v3

    aget v5, p1, v3

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v5, 0x3a83126f    # 0.001f

    cmpl-float v4, v4, v5

    if-lez v4, :cond_1

    return v2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static final connect-YBCOT_4(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;
    .locals 7

    .line 1
    const-string v0, "$this$connect"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "destination"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/ColorSpaces;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-ne p0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-ne p1, v1, :cond_0

    .line 24
    .line 25
    sget-object p0, Landroidx/compose/ui/graphics/colorspace/Connector;->Companion:Landroidx/compose/ui/graphics/colorspace/Connector$Companion;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/Connector$Companion;->getSrgbIdentity$ui_graphics_release()Landroidx/compose/ui/graphics/colorspace/Connector;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getOklab()Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/RenderIntent;->Companion:Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;->getPerceptual-uksYyKA()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p2, v0}, Landroidx/compose/ui/graphics/colorspace/RenderIntent;->equals-impl0(II)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    sget-object p0, Landroidx/compose/ui/graphics/colorspace/Connector;->Companion:Landroidx/compose/ui/graphics/colorspace/Connector$Companion;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/Connector$Companion;->getSrgbToOklabPerceptual$ui_graphics_release()Landroidx/compose/ui/graphics/colorspace/Connector;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_1
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getOklab()Landroidx/compose/ui/graphics/colorspace/ColorSpace;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-ne p0, v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne p1, v0, :cond_2

    .line 68
    .line 69
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/RenderIntent;->Companion:Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;->getPerceptual-uksYyKA()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {p2, v0}, Landroidx/compose/ui/graphics/colorspace/RenderIntent;->equals-impl0(II)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    sget-object p0, Landroidx/compose/ui/graphics/colorspace/Connector;->Companion:Landroidx/compose/ui/graphics/colorspace/Connector$Companion;

    .line 82
    .line 83
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/Connector$Companion;->getOklabToSrgbPerceptual$ui_graphics_release()Landroidx/compose/ui/graphics/colorspace/Connector;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_2
    if-ne p0, p1, :cond_3

    .line 89
    .line 90
    sget-object p1, Landroidx/compose/ui/graphics/colorspace/Connector;->Companion:Landroidx/compose/ui/graphics/colorspace/Connector$Companion;

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Landroidx/compose/ui/graphics/colorspace/Connector$Companion;->identity$ui_graphics_release(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getModel-xdoWZVw()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    sget-object v2, Landroidx/compose/ui/graphics/colorspace/ColorModel;->Companion:Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;

    .line 102
    .line 103
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getRgb-xdoWZVw()J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/ui/graphics/colorspace/ColorModel;->equals-impl0(JJ)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    const/4 v1, 0x0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;->getModel-xdoWZVw()J

    .line 115
    .line 116
    .line 117
    move-result-wide v3

    .line 118
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getRgb-xdoWZVw()J

    .line 119
    .line 120
    .line 121
    move-result-wide v5

    .line 122
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/colorspace/ColorModel;->equals-impl0(JJ)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    new-instance v0, Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;

    .line 129
    .line 130
    check-cast p0, Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 131
    .line 132
    check-cast p1, Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 133
    .line 134
    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;-><init>(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    new-instance v0, Landroidx/compose/ui/graphics/colorspace/Connector;

    .line 139
    .line 140
    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/compose/ui/graphics/colorspace/Connector;-><init>(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 141
    .line 142
    .line 143
    :goto_0
    return-object v0
.end method

.method public static synthetic connect-YBCOT_4$default(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;IILjava/lang/Object;)Landroidx/compose/ui/graphics/colorspace/Connector;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-object p1, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/ColorSpaces;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/ColorSpaces;->getSrgb()Landroidx/compose/ui/graphics/colorspace/Rgb;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    sget-object p2, Landroidx/compose/ui/graphics/colorspace/RenderIntent;->Companion:Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/colorspace/RenderIntent$Companion;->getPerceptual-uksYyKA()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/graphics/colorspace/ColorSpaceKt;->connect-YBCOT_4(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static final inverse3x3([F)[F
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "m"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget v2, v0, v1

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    aget v4, v0, v3

    .line 13
    .line 14
    const/4 v5, 0x6

    .line 15
    aget v6, v0, v5

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    aget v8, v0, v7

    .line 19
    .line 20
    const/4 v9, 0x4

    .line 21
    aget v10, v0, v9

    .line 22
    .line 23
    const/4 v11, 0x7

    .line 24
    aget v12, v0, v11

    .line 25
    .line 26
    const/4 v13, 0x2

    .line 27
    aget v14, v0, v13

    .line 28
    .line 29
    const/4 v15, 0x5

    .line 30
    aget v16, v0, v15

    .line 31
    .line 32
    const/16 v17, 0x8

    .line 33
    .line 34
    aget v18, v0, v17

    .line 35
    .line 36
    mul-float v19, v10, v18

    .line 37
    .line 38
    mul-float v20, v12, v16

    .line 39
    .line 40
    sub-float v19, v19, v20

    .line 41
    .line 42
    mul-float v20, v12, v14

    .line 43
    .line 44
    mul-float v21, v8, v18

    .line 45
    .line 46
    sub-float v20, v20, v21

    .line 47
    .line 48
    mul-float v21, v8, v16

    .line 49
    .line 50
    mul-float v22, v10, v14

    .line 51
    .line 52
    sub-float v21, v21, v22

    .line 53
    .line 54
    mul-float v22, v2, v19

    .line 55
    .line 56
    mul-float v23, v4, v20

    .line 57
    .line 58
    add-float v22, v22, v23

    .line 59
    .line 60
    mul-float v23, v6, v21

    .line 61
    .line 62
    add-float v22, v22, v23

    .line 63
    .line 64
    array-length v0, v0

    .line 65
    new-array v0, v0, [F

    .line 66
    .line 67
    div-float v19, v19, v22

    .line 68
    .line 69
    aput v19, v0, v1

    .line 70
    .line 71
    div-float v20, v20, v22

    .line 72
    .line 73
    aput v20, v0, v7

    .line 74
    .line 75
    div-float v21, v21, v22

    .line 76
    .line 77
    aput v21, v0, v13

    .line 78
    .line 79
    mul-float v1, v6, v16

    .line 80
    .line 81
    mul-float v7, v4, v18

    .line 82
    .line 83
    sub-float/2addr v1, v7

    .line 84
    div-float v1, v1, v22

    .line 85
    .line 86
    aput v1, v0, v3

    .line 87
    .line 88
    mul-float v18, v18, v2

    .line 89
    .line 90
    mul-float v1, v6, v14

    .line 91
    .line 92
    sub-float v18, v18, v1

    .line 93
    .line 94
    div-float v18, v18, v22

    .line 95
    .line 96
    aput v18, v0, v9

    .line 97
    .line 98
    mul-float/2addr v14, v4

    .line 99
    mul-float v16, v16, v2

    .line 100
    .line 101
    sub-float v14, v14, v16

    .line 102
    .line 103
    div-float v14, v14, v22

    .line 104
    .line 105
    aput v14, v0, v15

    .line 106
    .line 107
    mul-float v1, v4, v12

    .line 108
    .line 109
    mul-float v3, v6, v10

    .line 110
    .line 111
    sub-float/2addr v1, v3

    .line 112
    div-float v1, v1, v22

    .line 113
    .line 114
    aput v1, v0, v5

    .line 115
    .line 116
    mul-float/2addr v6, v8

    .line 117
    mul-float/2addr v12, v2

    .line 118
    sub-float/2addr v6, v12

    .line 119
    div-float v6, v6, v22

    .line 120
    .line 121
    aput v6, v0, v11

    .line 122
    .line 123
    mul-float/2addr v2, v10

    .line 124
    mul-float/2addr v4, v8

    .line 125
    sub-float/2addr v2, v4

    .line 126
    div-float v2, v2, v22

    .line 127
    .line 128
    aput v2, v0, v17

    .line 129
    .line 130
    return-object v0
.end method

.method public static final mul3x3([F[F)[F
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "lhs"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "rhs"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/16 v2, 0x9

    .line 16
    .line 17
    new-array v2, v2, [F

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    aget v4, v0, v3

    .line 21
    .line 22
    aget v5, v1, v3

    .line 23
    .line 24
    mul-float/2addr v4, v5

    .line 25
    const/4 v5, 0x3

    .line 26
    aget v6, v0, v5

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    aget v8, v1, v7

    .line 30
    .line 31
    mul-float v9, v6, v8

    .line 32
    .line 33
    add-float/2addr v4, v9

    .line 34
    const/4 v9, 0x6

    .line 35
    aget v10, v0, v9

    .line 36
    .line 37
    const/4 v11, 0x2

    .line 38
    aget v12, v1, v11

    .line 39
    .line 40
    mul-float v13, v10, v12

    .line 41
    .line 42
    add-float/2addr v4, v13

    .line 43
    aput v4, v2, v3

    .line 44
    .line 45
    aget v4, v0, v7

    .line 46
    .line 47
    aget v13, v1, v3

    .line 48
    .line 49
    mul-float/2addr v4, v13

    .line 50
    const/4 v14, 0x4

    .line 51
    aget v15, v0, v14

    .line 52
    .line 53
    mul-float/2addr v8, v15

    .line 54
    add-float/2addr v4, v8

    .line 55
    const/4 v8, 0x7

    .line 56
    aget v16, v0, v8

    .line 57
    .line 58
    mul-float v17, v16, v12

    .line 59
    .line 60
    add-float v4, v4, v17

    .line 61
    .line 62
    aput v4, v2, v7

    .line 63
    .line 64
    aget v4, v0, v11

    .line 65
    .line 66
    mul-float/2addr v4, v13

    .line 67
    const/4 v13, 0x5

    .line 68
    aget v17, v0, v13

    .line 69
    .line 70
    aget v18, v1, v7

    .line 71
    .line 72
    mul-float v18, v18, v17

    .line 73
    .line 74
    add-float v4, v4, v18

    .line 75
    .line 76
    const/16 v18, 0x8

    .line 77
    .line 78
    aget v19, v0, v18

    .line 79
    .line 80
    mul-float v12, v12, v19

    .line 81
    .line 82
    add-float/2addr v4, v12

    .line 83
    aput v4, v2, v11

    .line 84
    .line 85
    aget v3, v0, v3

    .line 86
    .line 87
    aget v4, v1, v5

    .line 88
    .line 89
    mul-float/2addr v4, v3

    .line 90
    aget v12, v1, v14

    .line 91
    .line 92
    mul-float/2addr v6, v12

    .line 93
    add-float/2addr v4, v6

    .line 94
    aget v6, v1, v13

    .line 95
    .line 96
    mul-float v20, v10, v6

    .line 97
    .line 98
    add-float v4, v4, v20

    .line 99
    .line 100
    aput v4, v2, v5

    .line 101
    .line 102
    aget v4, v0, v7

    .line 103
    .line 104
    aget v7, v1, v5

    .line 105
    .line 106
    mul-float v20, v4, v7

    .line 107
    .line 108
    mul-float/2addr v15, v12

    .line 109
    add-float v20, v20, v15

    .line 110
    .line 111
    mul-float v12, v16, v6

    .line 112
    .line 113
    add-float v20, v20, v12

    .line 114
    .line 115
    aput v20, v2, v14

    .line 116
    .line 117
    aget v11, v0, v11

    .line 118
    .line 119
    mul-float/2addr v7, v11

    .line 120
    aget v12, v1, v14

    .line 121
    .line 122
    mul-float v17, v17, v12

    .line 123
    .line 124
    add-float v7, v7, v17

    .line 125
    .line 126
    mul-float v6, v6, v19

    .line 127
    .line 128
    add-float/2addr v7, v6

    .line 129
    aput v7, v2, v13

    .line 130
    .line 131
    aget v6, v1, v9

    .line 132
    .line 133
    mul-float/2addr v3, v6

    .line 134
    aget v5, v0, v5

    .line 135
    .line 136
    aget v6, v1, v8

    .line 137
    .line 138
    mul-float/2addr v5, v6

    .line 139
    add-float/2addr v3, v5

    .line 140
    aget v5, v1, v18

    .line 141
    .line 142
    mul-float/2addr v10, v5

    .line 143
    add-float/2addr v3, v10

    .line 144
    aput v3, v2, v9

    .line 145
    .line 146
    aget v3, v1, v9

    .line 147
    .line 148
    mul-float/2addr v4, v3

    .line 149
    aget v7, v0, v14

    .line 150
    .line 151
    mul-float/2addr v7, v6

    .line 152
    add-float/2addr v4, v7

    .line 153
    mul-float v16, v16, v5

    .line 154
    .line 155
    add-float v4, v4, v16

    .line 156
    .line 157
    aput v4, v2, v8

    .line 158
    .line 159
    mul-float/2addr v11, v3

    .line 160
    aget v0, v0, v13

    .line 161
    .line 162
    aget v1, v1, v8

    .line 163
    .line 164
    mul-float/2addr v0, v1

    .line 165
    add-float/2addr v11, v0

    .line 166
    mul-float v19, v19, v5

    .line 167
    .line 168
    add-float v11, v11, v19

    .line 169
    .line 170
    aput v11, v2, v18

    .line 171
    .line 172
    return-object v2
.end method

.method public static final mul3x3Diag([F[F)[F
    .locals 6

    .line 1
    const-string v0, "lhs"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rhs"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    new-array v0, v0, [F

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    aget v2, p0, v1

    .line 17
    .line 18
    aget v3, p1, v1

    .line 19
    .line 20
    mul-float/2addr v2, v3

    .line 21
    aput v2, v0, v1

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    aget v3, p0, v2

    .line 25
    .line 26
    aget v4, p1, v2

    .line 27
    .line 28
    mul-float/2addr v3, v4

    .line 29
    aput v3, v0, v2

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    aget v4, p0, v3

    .line 33
    .line 34
    aget v5, p1, v3

    .line 35
    .line 36
    mul-float/2addr v4, v5

    .line 37
    aput v4, v0, v3

    .line 38
    .line 39
    aget v1, p0, v1

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    aget v5, p1, v4

    .line 43
    .line 44
    mul-float/2addr v5, v1

    .line 45
    aput v5, v0, v4

    .line 46
    .line 47
    aget v2, p0, v2

    .line 48
    .line 49
    const/4 v4, 0x4

    .line 50
    aget v5, p1, v4

    .line 51
    .line 52
    mul-float/2addr v5, v2

    .line 53
    aput v5, v0, v4

    .line 54
    .line 55
    aget p0, p0, v3

    .line 56
    .line 57
    const/4 v3, 0x5

    .line 58
    aget v4, p1, v3

    .line 59
    .line 60
    mul-float/2addr v4, p0

    .line 61
    aput v4, v0, v3

    .line 62
    .line 63
    const/4 v3, 0x6

    .line 64
    aget v4, p1, v3

    .line 65
    .line 66
    mul-float/2addr v1, v4

    .line 67
    aput v1, v0, v3

    .line 68
    .line 69
    const/4 v1, 0x7

    .line 70
    aget v3, p1, v1

    .line 71
    .line 72
    mul-float/2addr v2, v3

    .line 73
    aput v2, v0, v1

    .line 74
    .line 75
    const/16 v1, 0x8

    .line 76
    .line 77
    aget p1, p1, v1

    .line 78
    .line 79
    mul-float/2addr p0, p1

    .line 80
    aput p0, v0, v1

    .line 81
    .line 82
    return-object v0
.end method

.method public static final mul3x3Float3([F[F)[F
    .locals 8

    .line 1
    const-string v0, "lhs"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rhs"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget v1, p1, v0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aget v3, p1, v2

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    aget v5, p1, v4

    .line 19
    .line 20
    aget v6, p0, v0

    .line 21
    .line 22
    mul-float/2addr v6, v1

    .line 23
    const/4 v7, 0x3

    .line 24
    aget v7, p0, v7

    .line 25
    .line 26
    mul-float/2addr v7, v3

    .line 27
    add-float/2addr v6, v7

    .line 28
    const/4 v7, 0x6

    .line 29
    aget v7, p0, v7

    .line 30
    .line 31
    mul-float/2addr v7, v5

    .line 32
    add-float/2addr v6, v7

    .line 33
    aput v6, p1, v0

    .line 34
    .line 35
    aget v0, p0, v2

    .line 36
    .line 37
    mul-float/2addr v0, v1

    .line 38
    const/4 v6, 0x4

    .line 39
    aget v6, p0, v6

    .line 40
    .line 41
    mul-float/2addr v6, v3

    .line 42
    add-float/2addr v0, v6

    .line 43
    const/4 v6, 0x7

    .line 44
    aget v6, p0, v6

    .line 45
    .line 46
    mul-float/2addr v6, v5

    .line 47
    add-float/2addr v0, v6

    .line 48
    aput v0, p1, v2

    .line 49
    .line 50
    aget v0, p0, v4

    .line 51
    .line 52
    mul-float/2addr v0, v1

    .line 53
    const/4 v1, 0x5

    .line 54
    aget v1, p0, v1

    .line 55
    .line 56
    mul-float/2addr v1, v3

    .line 57
    add-float/2addr v0, v1

    .line 58
    const/16 v1, 0x8

    .line 59
    .line 60
    aget p0, p0, v1

    .line 61
    .line 62
    mul-float/2addr p0, v5

    .line 63
    add-float/2addr v0, p0

    .line 64
    aput v0, p1, v4

    .line 65
    .line 66
    return-object p1
.end method

.method public static final mul3x3Float3_0([FFFF)F
    .locals 1

    .line 1
    const-string v0, "lhs"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget v0, p0, v0

    .line 8
    .line 9
    mul-float/2addr v0, p1

    .line 10
    const/4 p1, 0x3

    .line 11
    aget p1, p0, p1

    .line 12
    .line 13
    mul-float/2addr p1, p2

    .line 14
    add-float/2addr v0, p1

    .line 15
    const/4 p1, 0x6

    .line 16
    aget p0, p0, p1

    .line 17
    .line 18
    mul-float/2addr p0, p3

    .line 19
    add-float/2addr v0, p0

    .line 20
    return v0
.end method

.method public static final mul3x3Float3_1([FFFF)F
    .locals 1

    .line 1
    const-string v0, "lhs"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget v0, p0, v0

    .line 8
    .line 9
    mul-float/2addr v0, p1

    .line 10
    const/4 p1, 0x4

    .line 11
    aget p1, p0, p1

    .line 12
    .line 13
    mul-float/2addr p1, p2

    .line 14
    add-float/2addr v0, p1

    .line 15
    const/4 p1, 0x7

    .line 16
    aget p0, p0, p1

    .line 17
    .line 18
    mul-float/2addr p0, p3

    .line 19
    add-float/2addr v0, p0

    .line 20
    return v0
.end method

.method public static final mul3x3Float3_2([FFFF)F
    .locals 1

    .line 1
    const-string v0, "lhs"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    aget v0, p0, v0

    .line 8
    .line 9
    mul-float/2addr v0, p1

    .line 10
    const/4 p1, 0x5

    .line 11
    aget p1, p0, p1

    .line 12
    .line 13
    mul-float/2addr p1, p2

    .line 14
    add-float/2addr v0, p1

    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    aget p0, p0, p1

    .line 18
    .line 19
    mul-float/2addr p0, p3

    .line 20
    add-float/2addr v0, p0

    .line 21
    return v0
.end method

.method public static final rcpResponse(DDDDDD)D
    .locals 0

    mul-double/2addr p8, p6

    cmpl-double p8, p0, p8

    if-ltz p8, :cond_0

    const-wide/high16 p6, 0x3ff0000000000000L    # 1.0

    div-double/2addr p6, p10

    .line 1
    invoke-static {p0, p1, p6, p7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    sub-double/2addr p0, p4

    div-double/2addr p0, p2

    goto :goto_0

    :cond_0
    div-double/2addr p0, p6

    :goto_0
    return-wide p0
.end method

.method public static final rcpResponse(DDDDDDDD)D
    .locals 0

    mul-double/2addr p8, p6

    cmpl-double p8, p0, p8

    if-ltz p8, :cond_0

    sub-double/2addr p0, p10

    const-wide/high16 p6, 0x3ff0000000000000L    # 1.0

    div-double/2addr p6, p14

    .line 2
    invoke-static {p0, p1, p6, p7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    sub-double/2addr p0, p4

    div-double/2addr p0, p2

    goto :goto_0

    :cond_0
    sub-double/2addr p0, p12

    div-double/2addr p0, p6

    :goto_0
    return-wide p0
.end method

.method public static final response(DDDDDD)D
    .locals 0

    cmpl-double p8, p0, p8

    if-ltz p8, :cond_0

    mul-double/2addr p2, p0

    add-double/2addr p2, p4

    .line 1
    invoke-static {p2, p3, p10, p11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    goto :goto_0

    :cond_0
    mul-double/2addr p0, p6

    :goto_0
    return-wide p0
.end method

.method public static final response(DDDDDDDD)D
    .locals 0

    cmpl-double p8, p0, p8

    if-ltz p8, :cond_0

    mul-double/2addr p2, p0

    add-double/2addr p2, p4

    .line 2
    invoke-static {p2, p3, p14, p15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    add-double/2addr p0, p10

    goto :goto_0

    :cond_0
    mul-double/2addr p6, p0

    add-double p0, p6, p12

    :goto_0
    return-wide p0
.end method
