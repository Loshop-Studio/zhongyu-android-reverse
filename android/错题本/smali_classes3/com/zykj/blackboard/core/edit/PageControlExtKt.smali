# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/blackboard/core/edit/PageControlExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/PageControlExtKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u001a\"\u0010\u000b\u001a\u00020\u000c*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003\u001a=\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0019*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001c\u001a&\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\r2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00082\u0008\u0008\u0002\u0010\"\u001a\u00020\u001b\u001a\u0014\u0010#\u001a\u0004\u0018\u00010\u001e*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b\u00a8\u0006$"
    }
    d2 = {
        "getScreenMatrix",
        "Landroid/graphics/Matrix;",
        "boardWidth",
        "",
        "boardHeight",
        "targetWidth",
        "targetHeight",
        "isPlay",
        "",
        "widthTime",
        "heightTime",
        "countScale",
        "",
        "Lcom/zykj/blackboard/core/edit/PageControl;",
        "width",
        "height",
        "scaleType",
        "Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;",
        "getTranslateMatrix",
        "imageWidth",
        "imageHeight",
        "positionEnum",
        "Lcom/zykj/board/EzyPositionEnum$PositionEnum;",
        "offset",
        "getWHFromLocalByType",
        "",
        "path",
        "",
        "(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;",
        "saveBitmapToLocal",
        "Ljava/io/File;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "isRecycle",
        "filename",
        "saveFileToLocal",
        "blackboard_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final countScale(Lcom/zykj/blackboard/core/edit/PageControl;IILcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)F
    .locals 5
    .param p0    # Lcom/zykj/blackboard/core/edit/PageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "scaleType"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-float v0, v0

    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    int-to-float p0, p0

    .line 37
    sget-object v1, Lcom/zykj/blackboard/core/edit/PageControlExtKt$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    aget v2, v1, v2

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v2, v3, :cond_1

    .line 47
    .line 48
    const/4 v4, 0x2

    .line 49
    if-eq v2, v4, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const v2, 0x3f4ccccd    # 0.8f

    .line 53
    .line 54
    .line 55
    :goto_0
    mul-float/2addr v0, v2

    .line 56
    mul-float/2addr p0, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/high16 v2, 0x3f000000    # 0.5f

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    int-to-float p1, p1

    .line 62
    div-float/2addr v0, p1

    .line 63
    int-to-float p1, p2

    .line 64
    div-float/2addr p0, p1

    .line 65
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    aget p1, v1, p1

    .line 70
    .line 71
    if-eq p1, v3, :cond_8

    .line 72
    .line 73
    const/4 p2, 0x3

    .line 74
    if-eq p1, p2, :cond_7

    .line 75
    .line 76
    const/4 p2, 0x4

    .line 77
    if-eq p1, p2, :cond_6

    .line 78
    .line 79
    const/4 p2, 0x5

    .line 80
    if-eq p1, p2, :cond_5

    .line 81
    .line 82
    const/4 p2, 0x6

    .line 83
    if-eq p1, p2, :cond_4

    .line 84
    .line 85
    const/4 p2, 0x7

    .line 86
    if-eq p1, p2, :cond_2

    .line 87
    .line 88
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    return p0

    .line 93
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 94
    .line 95
    cmpg-float p2, p0, p1

    .line 96
    .line 97
    if-gez p2, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    return p1

    .line 101
    :cond_4
    :goto_2
    return p0

    .line 102
    :cond_5
    return v0

    .line 103
    :cond_6
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    return p0

    .line 108
    :cond_7
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    return p0

    .line 113
    :cond_8
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    return p0
.end method

.method public static final getScreenMatrix(IIIIZII)Landroid/graphics/Matrix;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v2, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    int-to-float v3, p2

    .line 7
    int-to-float v4, p0

    .line 8
    div-float v5, v3, v4

    .line 9
    .line 10
    int-to-float v6, p3

    .line 11
    int-to-float v7, p1

    .line 12
    div-float v8, v6, v7

    .line 13
    .line 14
    cmpg-float v9, v5, v8

    .line 15
    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x1

    .line 18
    if-gez v9, :cond_0

    .line 19
    .line 20
    move v9, v11

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v9, v10

    .line 23
    :goto_0
    if-eqz v9, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v5, v8

    .line 27
    :goto_1
    div-int/lit8 p0, p0, 0x2

    .line 28
    .line 29
    div-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    div-int/lit8 v0, p2, 0x2

    .line 32
    .line 33
    sub-int/2addr v0, p0

    .line 34
    div-int/lit8 v1, p3, 0x2

    .line 35
    .line 36
    sub-int/2addr v1, p1

    .line 37
    move/from16 v8, p5

    .line 38
    .line 39
    int-to-float v8, v8

    .line 40
    mul-float/2addr v8, v5

    .line 41
    mul-float/2addr v8, v4

    .line 42
    cmpl-float v3, v8, v3

    .line 43
    .line 44
    if-lez v3, :cond_2

    .line 45
    .line 46
    move v4, v11

    .line 47
    :goto_2
    move/from16 v3, p6

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    move v4, v10

    .line 51
    goto :goto_2

    .line 52
    :goto_3
    int-to-float v3, v3

    .line 53
    mul-float/2addr v3, v5

    .line 54
    mul-float/2addr v3, v7

    .line 55
    cmpl-float v3, v3, v6

    .line 56
    .line 57
    if-lez v3, :cond_3

    .line 58
    .line 59
    move v10, v11

    .line 60
    :cond_3
    int-to-float p0, p0

    .line 61
    int-to-float p1, p1

    .line 62
    invoke-virtual {v2, v5, v5, p0, p1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 63
    .line 64
    .line 65
    int-to-float p0, v0

    .line 66
    int-to-float p1, v1

    .line 67
    invoke-virtual {v2, p0, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 68
    .line 69
    .line 70
    if-nez p4, :cond_6

    .line 71
    .line 72
    if-nez v4, :cond_4

    .line 73
    .line 74
    if-eqz v10, :cond_6

    .line 75
    .line 76
    :cond_4
    const/4 p0, 0x0

    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    if-nez v9, :cond_6

    .line 80
    .line 81
    invoke-virtual {v2, v5, v5, p0, p0}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 82
    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_5
    if-eqz v9, :cond_6

    .line 86
    .line 87
    invoke-virtual {v2, v5, v5, p0, p0}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 88
    .line 89
    .line 90
    :cond_6
    return-object v2
.end method

.method public static synthetic getScreenMatrix$default(IIIIZIIILjava/lang/Object;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x10

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x20

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move p5, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p7, 0x40

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    move p6, v0

    .line 17
    :cond_2
    invoke-static/range {p0 .. p6}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getScreenMatrix(IIIIZII)Landroid/graphics/Matrix;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final getTranslateMatrix(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;I)Landroid/graphics/Matrix;
    .locals 3
    .param p0    # Lcom/zykj/blackboard/core/edit/PageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyPositionEnum$PositionEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "positionEnum"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-float v0, v0

    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getBoardControl()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    int-to-float p0, p0

    .line 37
    sget-object v1, Lcom/zykj/blackboard/core/edit/PageControlExtKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    aget p3, v1, p3

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x2

    .line 47
    packed-switch p3, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    new-instance p3, Landroid/graphics/Matrix;

    .line 51
    .line 52
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 53
    .line 54
    .line 55
    sub-float/2addr v0, p1

    .line 56
    int-to-float p1, v2

    .line 57
    div-float/2addr v0, p1

    .line 58
    sub-float/2addr p0, p2

    .line 59
    div-float/2addr p0, p1

    .line 60
    invoke-virtual {p3, v0, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 61
    .line 62
    .line 63
    return-object p3

    .line 64
    :pswitch_0
    new-instance p3, Landroid/graphics/Matrix;

    .line 65
    .line 66
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 67
    .line 68
    .line 69
    sub-float/2addr v0, p1

    .line 70
    int-to-float p1, p4

    .line 71
    sub-float/2addr v0, p1

    .line 72
    sub-float/2addr p0, p2

    .line 73
    sub-float/2addr p0, p1

    .line 74
    invoke-virtual {p3, v0, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 75
    .line 76
    .line 77
    return-object p3

    .line 78
    :pswitch_1
    new-instance p3, Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 81
    .line 82
    .line 83
    sub-float/2addr v0, p1

    .line 84
    int-to-float p1, v2

    .line 85
    div-float/2addr v0, p1

    .line 86
    sub-float/2addr p0, p2

    .line 87
    int-to-float p1, p4

    .line 88
    sub-float/2addr p0, p1

    .line 89
    invoke-virtual {p3, v0, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 90
    .line 91
    .line 92
    return-object p3

    .line 93
    :pswitch_2
    new-instance p1, Landroid/graphics/Matrix;

    .line 94
    .line 95
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 96
    .line 97
    .line 98
    int-to-float p3, p4

    .line 99
    add-float/2addr v1, p3

    .line 100
    sub-float/2addr p0, p2

    .line 101
    sub-float/2addr p0, p3

    .line 102
    invoke-virtual {p1, v1, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :pswitch_3
    new-instance p3, Landroid/graphics/Matrix;

    .line 107
    .line 108
    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    .line 109
    .line 110
    .line 111
    sub-float/2addr v0, p1

    .line 112
    int-to-float p1, p4

    .line 113
    sub-float/2addr v0, p1

    .line 114
    sub-float/2addr p0, p2

    .line 115
    int-to-float p1, v2

    .line 116
    div-float/2addr p0, p1

    .line 117
    invoke-virtual {p3, v0, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 118
    .line 119
    .line 120
    return-object p3

    .line 121
    :pswitch_4
    new-instance p1, Landroid/graphics/Matrix;

    .line 122
    .line 123
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 124
    .line 125
    .line 126
    int-to-float p3, p4

    .line 127
    add-float/2addr p3, v1

    .line 128
    sub-float/2addr p0, p2

    .line 129
    int-to-float p2, v2

    .line 130
    div-float/2addr p0, p2

    .line 131
    invoke-virtual {p1, p3, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 132
    .line 133
    .line 134
    return-object p1

    .line 135
    :pswitch_5
    new-instance p0, Landroid/graphics/Matrix;

    .line 136
    .line 137
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 138
    .line 139
    .line 140
    sub-float/2addr v0, p1

    .line 141
    int-to-float p1, p4

    .line 142
    add-float/2addr v0, p1

    .line 143
    sub-float/2addr v1, p1

    .line 144
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_6
    new-instance p0, Landroid/graphics/Matrix;

    .line 149
    .line 150
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 151
    .line 152
    .line 153
    sub-float/2addr v0, p1

    .line 154
    int-to-float p1, v2

    .line 155
    div-float/2addr v0, p1

    .line 156
    int-to-float p1, p4

    .line 157
    add-float/2addr p1, v1

    .line 158
    invoke-virtual {p0, v0, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_7
    new-instance p0, Landroid/graphics/Matrix;

    .line 163
    .line 164
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 165
    .line 166
    .line 167
    int-to-float p1, p4

    .line 168
    add-float/2addr p1, v1

    .line 169
    invoke-virtual {p0, p1, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic getTranslateMatrix$default(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getTranslateMatrix(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;I)Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public static final getWHFromLocalByType(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;
    .locals 2
    .param p0    # Lcom/zykj/blackboard/core/edit/PageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scaleType"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 23
    .line 24
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    iget p1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 28
    .line 29
    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    if-ne p1, v1, :cond_0

    .line 33
    .line 34
    if-eqz p3, :cond_0

    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    :cond_0
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    :cond_1
    invoke-static {p0, p1, v0, p2}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->countScale(Lcom/zykj/blackboard/core/edit/PageControl;IILcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;)F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    int-to-float p1, p1

    .line 53
    mul-float/2addr p1, p0

    .line 54
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    int-to-float p2, v0

    .line 59
    mul-float/2addr p2, p0

    .line 60
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    filled-new-array {p1, p0}, [Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static synthetic getWHFromLocalByType$default(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)[Ljava/lang/Float;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move-object p4, v0

    .line 12
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getWHFromLocalByType(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final saveBitmapToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;)Ljava/io/File;
    .locals 2
    .param p0    # Lcom/zykj/blackboard/core/edit/PageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bitmap"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "filename"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v1, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    const-string v0, "randomUUID().toString()"

    .line 43
    .line 44
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    const-string v0, ".webp"

    .line 48
    .line 49
    invoke-virtual {p3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    new-instance v0, Ljava/io/File;

    .line 54
    .line 55
    invoke-direct {v0, p0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    const-string v1, "newFile.absolutePath"

    .line 65
    .line 66
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, p3, p2}, Lcom/zykj/blackboard/utils/FileUtils;->saveBitmap2SDCard(Landroid/graphics/Bitmap;Ljava/lang/String;Z)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-lez p0, :cond_1

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    const/4 p0, 0x0

    .line 81
    return-object p0
.end method

.method public static synthetic saveBitmapToLocal$default(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;ILjava/lang/Object;)Ljava/io/File;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const-string p4, "randomUUID().toString()"

    .line 14
    .line 15
    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->saveBitmapToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;)Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final saveFileToLocal(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .param p0    # Lcom/zykj/blackboard/core/edit/PageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/io/File;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "f.path"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x6

    .line 35
    const/16 v5, 0x2e

    .line 36
    .line 37
    invoke-static {v1, v5, v3, v4}, Lkotlin/text/p;->S(Ljava/lang/CharSequence;CII)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v3, -0x1

    .line 42
    if-eq v1, v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, "this as java.lang.String).substring(startIndex)"

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-string v0, ""

    .line 62
    .line 63
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v1, Ljava/io/File;

    .line 87
    .line 88
    sget-object v2, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getPagePath()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    .line 95
    .line 96
    invoke-virtual {v2, p0, v3}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 104
    .line 105
    new-instance v0, Ljava/io/File;

    .line 106
    .line 107
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/utils/FileUtils;->copyFileUsingFileChannels(Ljava/io/File;Ljava/io/File;)V

    .line 111
    .line 112
    .line 113
    return-object v1
.end method
