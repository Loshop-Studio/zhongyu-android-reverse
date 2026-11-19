.class public final Landroidx/compose/ui/graphics/colorspace/Lab;
.super Landroidx/compose/ui/graphics/colorspace/ColorSpace;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/graphics/colorspace/Lab$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010\u00a2\u0006\u0002\u0008\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010\u00a2\u0006\u0002\u0008\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\t\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/colorspace/Lab;",
        "Landroidx/compose/ui/graphics/colorspace/ColorSpace;",
        "name",
        "",
        "id",
        "",
        "(Ljava/lang/String;I)V",
        "isWideGamut",
        "",
        "()Z",
        "fromXyz",
        "",
        "v",
        "getMaxValue",
        "",
        "component",
        "getMinValue",
        "toXy",
        "",
        "v0",
        "v1",
        "v2",
        "toXy$ui_graphics_release",
        "toXyz",
        "toZ",
        "toZ$ui_graphics_release",
        "xyzaToColor",
        "Landroidx/compose/ui/graphics/Color;",
        "x",
        "y",
        "z",
        "a",
        "colorSpace",
        "xyzaToColor-JlNiLsg$ui_graphics_release",
        "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J",
        "Companion",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"
    }
.end annotation


# static fields
.field private static final A:F = 0.008856452f

.field private static final B:F = 7.787037f

.field private static final C:F = 0.13793103f

.field public static final Companion:Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

.field private static final D:F = 0.20689656f


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/colorspace/Lab$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/graphics/colorspace/Lab;->Companion:Landroidx/compose/ui/graphics/colorspace/Lab$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 7

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/ColorModel;->Companion:Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;->getLab-xdoWZVw()J

    .line 9
    .line 10
    .line 11
    move-result-wide v3

    .line 12
    const/4 v6, 0x0

    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    move v5, p2

    .line 16
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/graphics/colorspace/ColorSpace;-><init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public fromXyz([F)[F
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string/jumbo v1, "v"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget v2, v0, v1

    .line 11
    .line 12
    sget-object v3, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 13
    .line 14
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    aget v4, v4, v1

    .line 19
    .line 20
    div-float/2addr v2, v4

    .line 21
    const/4 v4, 0x1

    .line 22
    aget v5, v0, v4

    .line 23
    .line 24
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    aget v6, v6, v4

    .line 29
    .line 30
    div-float/2addr v5, v6

    .line 31
    const/4 v6, 0x2

    .line 32
    aget v7, v0, v6

    .line 33
    .line 34
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    aget v3, v3, v6

    .line 39
    .line 40
    div-float/2addr v7, v3

    .line 41
    const v3, 0x3c111aa7

    .line 42
    .line 43
    .line 44
    cmpl-float v8, v2, v3

    .line 45
    .line 46
    const v9, 0x3eaaaaab

    .line 47
    .line 48
    .line 49
    const v10, 0x3e0d3dcb

    .line 50
    .line 51
    .line 52
    const v11, 0x40f92f68

    .line 53
    .line 54
    .line 55
    if-lez v8, :cond_0

    .line 56
    .line 57
    float-to-double v12, v2

    .line 58
    float-to-double v14, v9

    .line 59
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 60
    .line 61
    .line 62
    move-result-wide v12

    .line 63
    double-to-float v2, v12

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    mul-float/2addr v2, v11

    .line 66
    add-float/2addr v2, v10

    .line 67
    :goto_0
    cmpl-float v8, v5, v3

    .line 68
    .line 69
    if-lez v8, :cond_1

    .line 70
    .line 71
    float-to-double v12, v5

    .line 72
    float-to-double v14, v9

    .line 73
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 74
    .line 75
    .line 76
    move-result-wide v12

    .line 77
    double-to-float v5, v12

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    mul-float/2addr v5, v11

    .line 80
    add-float/2addr v5, v10

    .line 81
    :goto_1
    cmpl-float v3, v7, v3

    .line 82
    .line 83
    if-lez v3, :cond_2

    .line 84
    .line 85
    float-to-double v7, v7

    .line 86
    float-to-double v9, v9

    .line 87
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    double-to-float v3, v7

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    mul-float/2addr v7, v11

    .line 94
    add-float v3, v7, v10

    .line 95
    .line 96
    :goto_2
    const/high16 v7, 0x42e80000    # 116.0f

    .line 97
    .line 98
    mul-float/2addr v7, v5

    .line 99
    const/high16 v8, 0x41800000    # 16.0f

    .line 100
    .line 101
    sub-float/2addr v7, v8

    .line 102
    const/high16 v8, 0x43fa0000    # 500.0f

    .line 103
    .line 104
    sub-float/2addr v2, v5

    .line 105
    mul-float/2addr v2, v8

    .line 106
    const/high16 v8, 0x43480000    # 200.0f

    .line 107
    .line 108
    sub-float/2addr v5, v3

    .line 109
    mul-float/2addr v5, v8

    .line 110
    const/4 v3, 0x0

    .line 111
    const/high16 v8, 0x42c80000    # 100.0f

    .line 112
    .line 113
    invoke-static {v7, v3, v8}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    aput v3, v0, v1

    .line 118
    .line 119
    const/high16 v1, -0x3d000000    # -128.0f

    .line 120
    .line 121
    const/high16 v3, 0x43000000    # 128.0f

    .line 122
    .line 123
    invoke-static {v2, v1, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    aput v2, v0, v4

    .line 128
    .line 129
    invoke-static {v5, v1, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    aput v1, v0, v6

    .line 134
    .line 135
    return-object v0
.end method

.method public getMaxValue(I)F
    .locals 0

    if-nez p1, :cond_0

    const/high16 p1, 0x42c80000    # 100.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x43000000    # 128.0f

    :goto_0
    return p1
.end method

.method public getMinValue(I)F
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, -0x3d000000    # -128.0f

    :goto_0
    return p1
.end method

.method public isWideGamut()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toXy$ui_graphics_release(FFF)J
    .locals 4

    .line 1
    const/4 p2, 0x0

    .line 2
    const/high16 p3, 0x42c80000    # 100.0f

    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/high16 p3, -0x3d000000    # -128.0f

    .line 9
    .line 10
    const/high16 v0, 0x43000000    # 128.0f

    .line 11
    .line 12
    invoke-static {p1, p3, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 p3, 0x41800000    # 16.0f

    .line 17
    .line 18
    add-float/2addr p2, p3

    .line 19
    const/high16 p3, 0x42e80000    # 116.0f

    .line 20
    .line 21
    div-float/2addr p2, p3

    .line 22
    const p3, 0x3b03126f    # 0.002f

    .line 23
    .line 24
    .line 25
    mul-float/2addr p1, p3

    .line 26
    add-float/2addr p1, p2

    .line 27
    const p3, 0x3e53dcb1

    .line 28
    .line 29
    .line 30
    cmpl-float v0, p1, p3

    .line 31
    .line 32
    const v1, 0x3e0d3dcb

    .line 33
    .line 34
    .line 35
    const v2, 0x3e038027

    .line 36
    .line 37
    .line 38
    if-lez v0, :cond_0

    .line 39
    .line 40
    mul-float v0, p1, p1

    .line 41
    .line 42
    mul-float/2addr v0, p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    sub-float/2addr p1, v1

    .line 45
    mul-float v0, p1, v2

    .line 46
    .line 47
    :goto_0
    cmpl-float p1, p2, p3

    .line 48
    .line 49
    if-lez p1, :cond_1

    .line 50
    .line 51
    mul-float p1, p2, p2

    .line 52
    .line 53
    mul-float/2addr p1, p2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sub-float/2addr p2, v1

    .line 56
    mul-float p1, p2, v2

    .line 57
    .line 58
    :goto_1
    sget-object p2, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    const/4 v1, 0x0

    .line 65
    aget p3, p3, v1

    .line 66
    .line 67
    mul-float/2addr v0, p3

    .line 68
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    const/4 p3, 0x1

    .line 73
    aget p2, p2, p3

    .line 74
    .line 75
    mul-float/2addr p1, p2

    .line 76
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    int-to-long p2, p2

    .line 81
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    int-to-long v0, p1

    .line 86
    const/16 p1, 0x20

    .line 87
    .line 88
    shl-long p1, p2, p1

    .line 89
    .line 90
    const-wide v2, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long/2addr v0, v2

    .line 96
    or-long/2addr p1, v0

    .line 97
    return-wide p1
.end method

.method public toXyz([F)[F
    .locals 10

    .line 1
    const-string/jumbo v0, "v"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aget v1, p1, v0

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/high16 v3, 0x42c80000    # 100.0f

    .line 12
    .line 13
    invoke-static {v1, v2, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    aput v1, p1, v0

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    aget v2, p1, v1

    .line 21
    .line 22
    const/high16 v3, -0x3d000000    # -128.0f

    .line 23
    .line 24
    const/high16 v4, 0x43000000    # 128.0f

    .line 25
    .line 26
    invoke-static {v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    aput v2, p1, v1

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    aget v5, p1, v2

    .line 34
    .line 35
    invoke-static {v5, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    aput v3, p1, v2

    .line 40
    .line 41
    aget v4, p1, v0

    .line 42
    .line 43
    const/high16 v5, 0x41800000    # 16.0f

    .line 44
    .line 45
    add-float/2addr v4, v5

    .line 46
    const/high16 v5, 0x42e80000    # 116.0f

    .line 47
    .line 48
    div-float/2addr v4, v5

    .line 49
    aget v5, p1, v1

    .line 50
    .line 51
    const v6, 0x3b03126f    # 0.002f

    .line 52
    .line 53
    .line 54
    mul-float/2addr v5, v6

    .line 55
    add-float/2addr v5, v4

    .line 56
    const v6, 0x3ba3d70a    # 0.005f

    .line 57
    .line 58
    .line 59
    mul-float/2addr v3, v6

    .line 60
    sub-float v3, v4, v3

    .line 61
    .line 62
    const v6, 0x3e53dcb1

    .line 63
    .line 64
    .line 65
    cmpl-float v7, v5, v6

    .line 66
    .line 67
    const v8, 0x3e0d3dcb

    .line 68
    .line 69
    .line 70
    const v9, 0x3e038027

    .line 71
    .line 72
    .line 73
    if-lez v7, :cond_0

    .line 74
    .line 75
    mul-float v7, v5, v5

    .line 76
    .line 77
    mul-float/2addr v7, v5

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    sub-float/2addr v5, v8

    .line 80
    mul-float v7, v5, v9

    .line 81
    .line 82
    :goto_0
    cmpl-float v5, v4, v6

    .line 83
    .line 84
    if-lez v5, :cond_1

    .line 85
    .line 86
    mul-float v5, v4, v4

    .line 87
    .line 88
    mul-float/2addr v5, v4

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    sub-float/2addr v4, v8

    .line 91
    mul-float v5, v4, v9

    .line 92
    .line 93
    :goto_1
    cmpl-float v4, v3, v6

    .line 94
    .line 95
    if-lez v4, :cond_2

    .line 96
    .line 97
    mul-float v4, v3, v3

    .line 98
    .line 99
    mul-float/2addr v4, v3

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    sub-float/2addr v3, v8

    .line 102
    mul-float v4, v3, v9

    .line 103
    .line 104
    :goto_2
    sget-object v3, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 105
    .line 106
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    aget v6, v6, v0

    .line 111
    .line 112
    mul-float/2addr v7, v6

    .line 113
    aput v7, p1, v0

    .line 114
    .line 115
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    aget v0, v0, v1

    .line 120
    .line 121
    mul-float/2addr v5, v0

    .line 122
    aput v5, p1, v1

    .line 123
    .line 124
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    aget v0, v0, v2

    .line 129
    .line 130
    mul-float/2addr v4, v0

    .line 131
    aput v4, p1, v2

    .line 132
    .line 133
    return-object p1
.end method

.method public toZ$ui_graphics_release(FFF)F
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    const/high16 v0, 0x42c80000    # 100.0f

    .line 3
    .line 4
    invoke-static {p1, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/high16 p2, -0x3d000000    # -128.0f

    .line 9
    .line 10
    const/high16 v0, 0x43000000    # 128.0f

    .line 11
    .line 12
    invoke-static {p3, p2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/high16 p3, 0x41800000    # 16.0f

    .line 17
    .line 18
    add-float/2addr p1, p3

    .line 19
    const/high16 p3, 0x42e80000    # 116.0f

    .line 20
    .line 21
    div-float/2addr p1, p3

    .line 22
    const p3, 0x3ba3d70a    # 0.005f

    .line 23
    .line 24
    .line 25
    mul-float/2addr p2, p3

    .line 26
    sub-float/2addr p1, p2

    .line 27
    const p2, 0x3e53dcb1

    .line 28
    .line 29
    .line 30
    cmpl-float p2, p1, p2

    .line 31
    .line 32
    if-lez p2, :cond_0

    .line 33
    .line 34
    mul-float p2, p1, p1

    .line 35
    .line 36
    mul-float/2addr p2, p1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const p2, 0x3e0d3dcb

    .line 39
    .line 40
    .line 41
    sub-float/2addr p1, p2

    .line 42
    const p2, 0x3e038027

    .line 43
    .line 44
    .line 45
    mul-float/2addr p2, p1

    .line 46
    :goto_0
    sget-object p1, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p3, 0x2

    .line 53
    aget p1, p1, p3

    .line 54
    .line 55
    mul-float/2addr p2, p1

    .line 56
    return p2
.end method

.method public xyzaToColor-JlNiLsg$ui_graphics_release(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J
    .locals 9

    .line 1
    const-string v0, "colorSpace"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/compose/ui/graphics/colorspace/Illuminant;->INSTANCE:Landroidx/compose/ui/graphics/colorspace/Illuminant;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    aget v1, v1, v2

    .line 14
    .line 15
    div-float/2addr p1, v1

    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    aget v1, v1, v2

    .line 22
    .line 23
    div-float/2addr p2, v1

    .line 24
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/colorspace/Illuminant;->getD50Xyz$ui_graphics_release()[F

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x2

    .line 29
    aget v0, v0, v1

    .line 30
    .line 31
    div-float/2addr p3, v0

    .line 32
    const v0, 0x3c111aa7

    .line 33
    .line 34
    .line 35
    cmpl-float v1, p1, v0

    .line 36
    .line 37
    const v2, 0x3eaaaaab

    .line 38
    .line 39
    .line 40
    const v3, 0x3e0d3dcb

    .line 41
    .line 42
    .line 43
    const v4, 0x40f92f68

    .line 44
    .line 45
    .line 46
    if-lez v1, :cond_0

    .line 47
    .line 48
    float-to-double v5, p1

    .line 49
    float-to-double v7, v2

    .line 50
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    double-to-float p1, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    mul-float/2addr p1, v4

    .line 57
    add-float/2addr p1, v3

    .line 58
    :goto_0
    cmpl-float v1, p2, v0

    .line 59
    .line 60
    if-lez v1, :cond_1

    .line 61
    .line 62
    float-to-double v5, p2

    .line 63
    float-to-double v7, v2

    .line 64
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    double-to-float p2, v5

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    mul-float/2addr p2, v4

    .line 71
    add-float/2addr p2, v3

    .line 72
    :goto_1
    cmpl-float v0, p3, v0

    .line 73
    .line 74
    if-lez v0, :cond_2

    .line 75
    .line 76
    float-to-double v0, p3

    .line 77
    float-to-double v2, v2

    .line 78
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    double-to-float p3, v0

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    mul-float/2addr p3, v4

    .line 85
    add-float/2addr p3, v3

    .line 86
    :goto_2
    const/high16 v0, 0x42e80000    # 116.0f

    .line 87
    .line 88
    mul-float/2addr v0, p2

    .line 89
    const/high16 v1, 0x41800000    # 16.0f

    .line 90
    .line 91
    sub-float/2addr v0, v1

    .line 92
    const/high16 v1, 0x43fa0000    # 500.0f

    .line 93
    .line 94
    sub-float/2addr p1, p2

    .line 95
    mul-float/2addr p1, v1

    .line 96
    const/high16 v1, 0x43480000    # 200.0f

    .line 97
    .line 98
    sub-float/2addr p2, p3

    .line 99
    mul-float/2addr p2, v1

    .line 100
    const/4 p3, 0x0

    .line 101
    const/high16 v1, 0x42c80000    # 100.0f

    .line 102
    .line 103
    invoke-static {v0, p3, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    const/high16 v0, -0x3d000000    # -128.0f

    .line 108
    .line 109
    const/high16 v1, 0x43000000    # 128.0f

    .line 110
    .line 111
    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    invoke-static {p2, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-static {p3, p1, p2, p4, p5}, Landroidx/compose/ui/graphics/ColorKt;->Color(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J

    .line 120
    .line 121
    .line 122
    move-result-wide p1

    .line 123
    return-wide p1
.end method
