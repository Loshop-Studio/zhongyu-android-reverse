.class public final Lg7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg7/a;

.field public static b:I

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg7/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lg7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg7/a;->a:Lg7/a;

    .line 7
    .line 8
    const/16 v0, 0x3c

    .line 9
    .line 10
    sput v0, Lg7/a;->b:I

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    sput v0, Lg7/a;->c:I

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lg7/a;IIILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x640

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const/16 p2, 0xdc

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lg7/a;->a(II)Landroid/graphics/Bitmap;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static synthetic d(Lg7/a;Landroid/graphics/Bitmap;IILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/16 p2, 0xf5

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lg7/a;->c(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic j(Lg7/a;Landroid/graphics/Bitmap;Ljava/lang/String;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    const/4 p4, 0x1

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lg7/a;->i(Landroid/graphics/Bitmap;Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public final a(II)Landroid/graphics/Bitmap;
    .locals 11

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "createBitmap(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroid/graphics/Canvas;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 15
    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, 0x7f08016d

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static {v2, v3, v4}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    const/4 v9, 0x7

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    invoke-static/range {v5 .. v10}, Landroidx/core/graphics/drawable/DrawableKt;->toBitmap$default(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    new-instance v3, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, 0x0

    .line 61
    invoke-direct {v3, v7, v7, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 62
    .line 63
    .line 64
    int-to-float p1, p1

    .line 65
    const/high16 v5, 0x3f000000    # 0.5f

    .line 66
    .line 67
    mul-float/2addr v5, p1

    .line 68
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    int-to-float v6, v6

    .line 73
    mul-float/2addr v6, v5

    .line 74
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    int-to-float v7, v7

    .line 79
    div-float/2addr v6, v7

    .line 80
    new-instance v7, Landroid/graphics/RectF;

    .line 81
    .line 82
    sub-float/2addr p1, v5

    .line 83
    const/4 v8, 0x2

    .line 84
    int-to-float v8, v8

    .line 85
    div-float/2addr p1, v8

    .line 86
    int-to-float p2, p2

    .line 87
    sub-float/2addr p2, v6

    .line 88
    div-float/2addr p2, v8

    .line 89
    add-float/2addr v5, p1

    .line 90
    add-float/2addr v6, p2

    .line 91
    invoke-direct {v7, p1, p2, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2, v3, v7, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    return-object v0
.end method

.method public final c(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    const-string v0, "sourceBitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    mul-int/2addr p1, v0

    .line 22
    new-array v3, p1, [I

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Lkotlin/collections/ArraysKt;->getIndices([I)Lkotlin/ranges/IntRange;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    move-object v0, p1

    .line 57
    check-cast v0, Lkotlin/collections/IntIterator;

    .line 58
    .line 59
    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    aget v1, v3, v0

    .line 64
    .line 65
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-lt v4, p2, :cond_0

    .line 76
    .line 77
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-lt v4, p2, :cond_0

    .line 82
    .line 83
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-lt v4, p2, :cond_0

    .line 88
    .line 89
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-static {v6, v4, v5, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    aput v1, v3, v0

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    const/4 v4, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v7, 0x0

    .line 124
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v2
.end method

.method public final varargs e([Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    const-string v0, "bitmapArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v3, v0, :cond_0

    .line 12
    .line 13
    aget-object v5, p1, v3

    .line 14
    .line 15
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-static {v1, v6}, Ljava/lang/Integer;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    mul-int/2addr v4, v6

    .line 24
    div-int/2addr v4, v1

    .line 25
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    mul-int/2addr v1, v6

    .line 30
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    div-int/2addr v1, v5

    .line 35
    add-int/2addr v4, v1

    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    move v1, v6

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    invoke-static {v1, v4, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v3, "createBitmap(...)"

    .line 47
    .line 48
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Landroid/graphics/Canvas;

    .line 52
    .line 53
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 54
    .line 55
    .line 56
    array-length v4, p1

    .line 57
    const/4 v5, 0x0

    .line 58
    move v6, v2

    .line 59
    move v7, v5

    .line 60
    :goto_1
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    aget-object v8, p1, v6

    .line 63
    .line 64
    new-instance v9, Landroid/graphics/Rect;

    .line 65
    .line 66
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    invoke-direct {v9, v2, v2, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    int-to-float v10, v10

    .line 82
    int-to-float v11, v1

    .line 83
    mul-float/2addr v10, v11

    .line 84
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    int-to-float v12, v12

    .line 89
    div-float/2addr v10, v12

    .line 90
    new-instance v12, Landroid/graphics/RectF;

    .line 91
    .line 92
    add-float/2addr v10, v7

    .line 93
    invoke-direct {v12, v5, v7, v11, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 94
    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    invoke-virtual {v3, v8, v9, v12, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v6, v6, 0x1

    .line 104
    .line 105
    move v7, v10

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    return-object v0
.end method

.method public final varargs f([Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    const-string v0, "pathArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    array-length v1, p1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    array-length v1, p1

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    aget-object v4, p1, v3

    .line 18
    .line 19
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Lg7/a;->a:Lg7/a;

    .line 30
    .line 31
    new-array v1, v2, [Landroid/graphics/Bitmap;

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, [Landroid/graphics/Bitmap;

    .line 38
    .line 39
    array-length v1, v0

    .line 40
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [Landroid/graphics/Bitmap;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lg7/a;->e([Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final varargs g(I[Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 13

    .line 1
    const-string v0, "bitmapArray"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p2

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    move v4, v1

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v0, :cond_1

    .line 12
    .line 13
    aget-object v5, p2, v3

    .line 14
    .line 15
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-ge v6, p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    int-to-float v5, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    int-to-float v6, v6

    .line 32
    int-to-float v7, p1

    .line 33
    mul-float/2addr v6, v7

    .line 34
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    int-to-float v5, v5

    .line 39
    div-float v5, v6, v5

    .line 40
    .line 41
    :goto_1
    add-float/2addr v4, v5

    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    float-to-int v0, v4

    .line 46
    sget-object v3, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 47
    .line 48
    invoke-static {p1, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v3, "createBitmap(...)"

    .line 53
    .line 54
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v3, Landroid/graphics/Canvas;

    .line 58
    .line 59
    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 60
    .line 61
    .line 62
    const/4 v4, -0x1

    .line 63
    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 64
    .line 65
    .line 66
    array-length v4, p2

    .line 67
    move v5, v2

    .line 68
    :goto_2
    if-ge v5, v4, :cond_4

    .line 69
    .line 70
    aget-object v6, p2, v5

    .line 71
    .line 72
    new-instance v7, Landroid/graphics/Rect;

    .line 73
    .line 74
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    invoke-direct {v7, v2, v2, v8, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-ge v8, p1, :cond_2

    .line 90
    .line 91
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    int-to-float v8, v8

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    int-to-float v8, v8

    .line 102
    int-to-float v9, p1

    .line 103
    mul-float/2addr v8, v9

    .line 104
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    int-to-float v9, v9

    .line 109
    div-float/2addr v8, v9

    .line 110
    :goto_3
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-ge v9, p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    int-to-float v9, v9

    .line 121
    goto :goto_4

    .line 122
    :cond_3
    int-to-float v9, p1

    .line 123
    :goto_4
    new-instance v10, Landroid/graphics/RectF;

    .line 124
    .line 125
    int-to-float v11, p1

    .line 126
    sub-float/2addr v11, v9

    .line 127
    const/4 v12, 0x2

    .line 128
    int-to-float v12, v12

    .line 129
    div-float/2addr v11, v12

    .line 130
    add-float/2addr v9, v11

    .line 131
    add-float/2addr v8, v1

    .line 132
    invoke-direct {v10, v11, v1, v9, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 133
    .line 134
    .line 135
    const/4 v1, 0x0

    .line 136
    invoke-virtual {v3, v6, v7, v10, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v5, v5, 0x1

    .line 143
    .line 144
    move v1, v8

    .line 145
    goto :goto_2

    .line 146
    :cond_4
    return-object v0
.end method

.method public final varargs h(I[Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 10

    .line 1
    const-string v0, "bitmapArray"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p2

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    aget-object v4, p2, v2

    .line 13
    .line 14
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    mul-int/lit16 v5, v5, 0x898

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    div-int/2addr v5, v4

    .line 25
    add-int/lit8 v5, v5, 0x1

    .line 26
    .line 27
    invoke-static {v3, v5}, Ljava/lang/Integer;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    invoke-static {p1, v3, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v0, Landroid/graphics/Canvas;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 43
    .line 44
    .line 45
    array-length v2, p2

    .line 46
    move v3, v1

    .line 47
    :goto_1
    if-ge v3, v2, :cond_1

    .line 48
    .line 49
    aget-object v4, p2, v3

    .line 50
    .line 51
    new-instance v5, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-direct {v5, v1, v1, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 62
    .line 63
    .line 64
    new-instance v6, Landroid/graphics/Rect;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    mul-int/2addr v8, v9

    .line 79
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    div-int/2addr v8, v9

    .line 84
    invoke-direct {v6, v1, v1, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 85
    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    return-object p1
.end method

.method public final i(Landroid/graphics/Bitmap;Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "sourceBitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resultPath"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/16 v0, 0x640

    .line 21
    .line 22
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    int-to-float v2, v5

    .line 28
    div-float/2addr v0, v2

    .line 29
    new-instance v7, Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v3, 0x0

    .line 40
    move-object v2, p1

    .line 41
    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "createBitmap(...)"

    .line 46
    .line 47
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Ljava/io/File;

    .line 51
    .line 52
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    .line 91
    .line 92
    .line 93
    new-instance v3, Ljava/io/FileOutputStream;

    .line 94
    .line 95
    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 96
    .line 97
    .line 98
    const-string v0, "png"

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v5, 0x2

    .line 102
    invoke-static {p2, v0, v4, v5, v1}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_2

    .line 107
    .line 108
    sget-object p2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    sget-object p2, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    .line 112
    .line 113
    :goto_1
    sget v0, Lg7/a;->b:I

    .line 114
    .line 115
    invoke-virtual {p1, p2, v0, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    .line 119
    .line 120
    .line 121
    if-eqz p3, :cond_3

    .line 122
    .line 123
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 124
    .line 125
    .line 126
    :cond_3
    if-eqz p4, :cond_4

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    .line 130
    .line 131
    :cond_4
    return-object p1

    .line 132
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 133
    .line 134
    .line 135
    return-object v1
.end method

.method public final k(I)V
    .locals 0

    .line 1
    sput p1, Lg7/a;->b:I

    .line 2
    .line 3
    return-void
.end method
