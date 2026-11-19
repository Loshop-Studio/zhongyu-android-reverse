.class public final Lcom/canhub/cropper/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/a$a;,
        Lcom/canhub/cropper/a$b;,
        Lcom/canhub/cropper/a$c;
    }
.end annotation


# static fields
.field public static final a:Lcom/canhub/cropper/a;

.field public static final b:Landroid/graphics/Rect;

.field public static final c:Landroid/graphics/RectF;

.field public static final d:Landroid/graphics/RectF;

.field public static final e:[F

.field public static final f:[F

.field public static g:I

.field public static h:Landroid/util/Pair;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/canhub/cropper/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/canhub/cropper/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/canhub/cropper/a;->a:Lcom/canhub/cropper/a;

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/canhub/cropper/a;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/RectF;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/canhub/cropper/a;->c:Landroid/graphics/RectF;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/canhub/cropper/a;->d:Landroid/graphics/RectF;

    .line 28
    .line 29
    const/4 v0, 0x6

    .line 30
    new-array v1, v0, [F

    .line 31
    .line 32
    sput-object v1, Lcom/canhub/cropper/a;->e:[F

    .line 33
    .line 34
    new-array v0, v0, [F

    .line 35
    .line 36
    sput-object v0, Lcom/canhub/cropper/a;->f:[F

    .line 37
    .line 38
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


# virtual methods
.method public final A([F)F
    .locals 2

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    aget v1, p1, v1

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x4

    .line 17
    aget v1, p1, v1

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x6

    .line 24
    aget p1, p1, v1

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public final B([F)F
    .locals 2

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    aget v1, p1, v1

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x4

    .line 17
    aget v1, p1, v1

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x6

    .line 24
    aget p1, p1, v1

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public final C([F)F
    .locals 2

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    aget v1, p1, v1

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x5

    .line 17
    aget v1, p1, v1

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x7

    .line 24
    aget p1, p1, v1

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public final D([F)F
    .locals 1

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->B([F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->A([F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sub-float/2addr v0, p1

    .line 15
    return v0
.end method

.method public final E(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/net/Uri;)Lcom/canhub/cropper/a$b;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2, p3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    :try_start_1
    new-instance p3, Landroidx/exifinterface/media/ExifInterface;

    .line 23
    .line 24
    invoke-direct {p3, p2}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    :try_start_2
    invoke-static {p2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 28
    .line 29
    .line 30
    move-object v0, p3

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p3

    .line 33
    :try_start_3
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 34
    :catchall_1
    move-exception v1

    .line 35
    :try_start_4
    invoke-static {p2, p3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 39
    :catchall_2
    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, Lcom/canhub/cropper/a;->F(Landroid/graphics/Bitmap;Landroidx/exifinterface/media/ExifInterface;)Lcom/canhub/cropper/a$b;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p2, Lcom/canhub/cropper/a$b;

    .line 47
    .line 48
    const/4 p3, 0x0

    .line 49
    invoke-direct {p2, p1, p3, p3, p3}, Lcom/canhub/cropper/a$b;-><init>(Landroid/graphics/Bitmap;IZZ)V

    .line 50
    .line 51
    .line 52
    move-object p1, p2

    .line 53
    :goto_1
    return-object p1
.end method

.method public final F(Landroid/graphics/Bitmap;Landroidx/exifinterface/media/ExifInterface;)Lcom/canhub/cropper/a$b;
    .locals 6

    .line 1
    const-string v0, "exif"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Orientation"

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p2, v0, v1}, Landroidx/exifinterface/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x3

    .line 14
    const/4 v2, 0x7

    .line 15
    const/4 v3, 0x5

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eq p2, v0, :cond_2

    .line 18
    .line 19
    if-eq p2, v3, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x6

    .line 22
    if-eq p2, v0, :cond_1

    .line 23
    .line 24
    if-eq p2, v2, :cond_1

    .line 25
    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    if-eq p2, v0, :cond_0

    .line 29
    .line 30
    move v0, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v0, 0x10e

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/16 v0, 0x5a

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/16 v0, 0xb4

    .line 39
    .line 40
    :goto_0
    const/4 v5, 0x2

    .line 41
    if-eq p2, v5, :cond_4

    .line 42
    .line 43
    if-ne p2, v3, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move v3, v4

    .line 47
    goto :goto_2

    .line 48
    :cond_4
    :goto_1
    move v3, v1

    .line 49
    :goto_2
    const/4 v5, 0x4

    .line 50
    if-eq p2, v5, :cond_6

    .line 51
    .line 52
    if-ne p2, v2, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    move v1, v4

    .line 56
    :cond_6
    :goto_3
    new-instance p2, Lcom/canhub/cropper/a$b;

    .line 57
    .line 58
    invoke-direct {p2, p1, v0, v3, v1}, Lcom/canhub/cropper/a$b;-><init>(Landroid/graphics/Bitmap;IZZ)V

    .line 59
    .line 60
    .line 61
    return-object p2
.end method

.method public final G(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-lez p2, :cond_5

    .line 7
    .line 8
    if-lez p3, :cond_5

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->d:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 11
    .line 12
    if-eq p4, v0, :cond_0

    .line 13
    .line 14
    sget-object v1, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->c:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 15
    .line 16
    if-eq p4, v1, :cond_0

    .line 17
    .line 18
    sget-object v1, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->e:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 19
    .line 20
    if-ne p4, v1, :cond_5

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p2

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    :goto_0
    sget-object v1, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->e:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-ne p4, v1, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2, p3, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    int-to-float v1, v1

    .line 50
    int-to-float p2, p2

    .line 51
    div-float p2, v1, p2

    .line 52
    .line 53
    int-to-float v3, v3

    .line 54
    int-to-float p3, p3

    .line 55
    div-float p3, v3, p3

    .line 56
    .line 57
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/high16 p3, 0x3f800000    # 1.0f

    .line 62
    .line 63
    cmpl-float p3, p2, p3

    .line 64
    .line 65
    if-gtz p3, :cond_3

    .line 66
    .line 67
    if-ne p4, v0, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 p2, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    div-float/2addr v1, p2

    .line 73
    float-to-int p3, v1

    .line 74
    div-float/2addr v3, p2

    .line 75
    float-to-int p2, v3

    .line 76
    invoke-static {p1, p3, p2, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    :goto_2
    if-eqz p2, :cond_5

    .line 81
    .line 82
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    if-nez p3, :cond_4

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    :cond_4
    return-object p2

    .line 92
    :goto_3
    const-string p3, "AIC"

    .line 93
    .line 94
    const-string p4, "Failed to resize cropped image, return bitmap before resize"

    .line 95
    .line 96
    invoke-static {p3, p4, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object p1
.end method

.method public final H(Landroid/graphics/Bitmap;IZZ)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    if-gtz p2, :cond_1

    .line 2
    .line 3
    if-nez p3, :cond_1

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return-object p1

    .line 9
    :cond_1
    :goto_0
    new-instance v5, Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 12
    .line 13
    .line 14
    int-to-float p2, p2

    .line 15
    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    const/4 v0, -0x1

    .line 20
    if-eqz p3, :cond_2

    .line 21
    .line 22
    move p3, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move p3, p2

    .line 25
    :goto_1
    int-to-float p3, p3

    .line 26
    if-eqz p4, :cond_3

    .line 27
    .line 28
    move p2, v0

    .line 29
    :cond_3
    int-to-float p2, p2

    .line 30
    invoke-virtual {v5, p3, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    move-object v0, p1

    .line 45
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "createBitmap(...)"

    .line 50
    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_4

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 61
    .line 62
    .line 63
    :cond_4
    return-object p1
.end method

.method public final I(Landroid/util/Pair;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/canhub/cropper/a;->h:Landroid/util/Pair;

    .line 2
    .line 3
    return-void
.end method

.method public final J(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)Landroid/net/Uri;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bitmap"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "compressFormat"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-nez p5, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1, p3}, Lcom/canhub/cropper/a;->a(Landroid/content/Context;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p5

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "wt"

    .line 27
    .line 28
    invoke-virtual {p1, p5, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {p2, p3, p4, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-static {p1, p2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    return-object p5

    .line 43
    :catchall_0
    move-exception p2

    .line 44
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    :catchall_1
    move-exception p3

    .line 46
    invoke-static {p1, p2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw p3
.end method

.method public final K(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)Landroid/net/Uri;
    .locals 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 10
    .line 11
    const/16 v5, 0x5f

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    move-object v3, p2

    .line 16
    move-object v6, p3

    .line 17
    invoke-virtual/range {v1 .. v6}, Lcom/canhub/cropper/a;->J(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object p1

    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    const-string p2, "AIC"

    .line 25
    .line 26
    const-string p3, "Failed to write bitmap to temp file for image-cropper save instance state"

    .line 27
    .line 28
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method

.method public final a(Landroid/content/Context;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lcom/canhub/cropper/a$c;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p2, v0, :cond_0

    .line 14
    .line 15
    const-string p2, ".webp"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const-string p2, ".png"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string p2, ".jpg"

    .line 24
    .line 25
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    const/16 v1, 0x1d

    .line 28
    .line 29
    const-string v2, "cropped"

    .line 30
    .line 31
    if-lt v0, v1, :cond_2

    .line 32
    .line 33
    :try_start_1
    sget-object v0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v2, p2, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v0}, Ll1/c;->b(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 47
    .line 48
    .line 49
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 50
    goto :goto_1

    .line 51
    :catch_1
    move-exception v0

    .line 52
    :try_start_2
    const-string v1, "AIC"

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v2, p2, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Ll1/c;->b(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_1
    return-object p1

    .line 81
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {v2, p2, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 90
    .line 91
    .line 92
    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 93
    return-object p1

    .line 94
    :goto_2
    new-instance p2, Ljava/lang/RuntimeException;

    .line 95
    .line 96
    const-string v0, "Failed to create temp file for output image"

    .line 97
    .line 98
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw p2
.end method

.method public final b(II)I
    .locals 3

    .line 1
    sget v0, Lcom/canhub/cropper/a;->g:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/canhub/cropper/a;->r()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sput v0, Lcom/canhub/cropper/a;->g:I

    .line 10
    .line 11
    :cond_0
    sget v0, Lcom/canhub/cropper/a;->g:I

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-lez v0, :cond_3

    .line 15
    .line 16
    :goto_0
    div-int v0, p2, v1

    .line 17
    .line 18
    sget v2, Lcom/canhub/cropper/a;->g:I

    .line 19
    .line 20
    if-gt v0, v2, :cond_2

    .line 21
    .line 22
    div-int v0, p1, v1

    .line 23
    .line 24
    if-le v0, v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    :goto_1
    mul-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    return v1
.end method

.method public final c(IIII)I
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-gt p2, p4, :cond_1

    .line 3
    .line 4
    if-le p1, p3, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    return v0

    .line 8
    :cond_1
    :goto_0
    div-int/lit8 v1, p2, 0x2

    .line 9
    .line 10
    div-int/2addr v1, v0

    .line 11
    if-le v1, p4, :cond_2

    .line 12
    .line 13
    div-int/lit8 v1, p1, 0x2

    .line 14
    .line 15
    div-int/2addr v1, v0

    .line 16
    if-le v1, p3, :cond_2

    .line 17
    .line 18
    mul-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    return v0
.end method

.method public final d(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/a$a;
    .locals 16

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "cropPoints"

    .line 9
    .line 10
    move-object/from16 v4, p3

    .line 11
    .line 12
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    move v15, v0

    .line 17
    :goto_0
    :try_start_0
    invoke-static/range {p2 .. p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p0

    .line 21
    .line 22
    move-object/from16 v3, p2

    .line 23
    .line 24
    move/from16 v5, p4

    .line 25
    .line 26
    move/from16 v6, p5

    .line 27
    .line 28
    move/from16 v7, p6

    .line 29
    .line 30
    move/from16 v8, p7

    .line 31
    .line 32
    move/from16 v9, p8

    .line 33
    .line 34
    move/from16 v10, p9

    .line 35
    .line 36
    move/from16 v11, p10

    .line 37
    .line 38
    move/from16 v12, p11

    .line 39
    .line 40
    move/from16 v13, p12

    .line 41
    .line 42
    move/from16 v14, p13

    .line 43
    .line 44
    invoke-virtual/range {v1 .. v15}, Lcom/canhub/cropper/a;->e(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZI)Lcom/canhub/cropper/a$a;

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    return-object v0

    .line 49
    :catch_0
    move-exception v0

    .line 50
    mul-int/lit8 v15, v15, 0x2

    .line 51
    .line 52
    const/16 v1, 0x10

    .line 53
    .line 54
    if-gt v15, v1, :cond_0

    .line 55
    .line 56
    move-object/from16 v2, p1

    .line 57
    .line 58
    move-object/from16 v4, p3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "Failed to handle OOM by sampling ("

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v4, "): "

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    move-object/from16 v4, p2

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v4, "\r\n"

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw v1
.end method

.method public final e(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZI)Lcom/canhub/cropper/a$a;
    .locals 16

    move/from16 v5, p4

    move-object/from16 v6, p0

    move-object/from16 v7, p3

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    .line 1
    invoke-virtual/range {v6 .. v12}, Lcom/canhub/cropper/a;->y([FIIZII)Landroid/graphics/Rect;

    move-result-object v4

    if-lez p10, :cond_0

    move/from16 v10, p10

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v0

    move v10, v0

    :goto_0
    if-lez p11, :cond_1

    move/from16 v11, p11

    goto :goto_1

    .line 3
    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v0

    move v11, v0

    :goto_1
    const/4 v0, 0x0

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v12, p14

    move-object v9, v4

    .line 4
    :try_start_0
    invoke-virtual/range {v6 .. v12}, Lcom/canhub/cropper/a;->m(Landroid/content/Context;Landroid/net/Uri;Landroid/graphics/Rect;III)Lcom/canhub/cropper/a$a;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    :try_start_1
    invoke-virtual {v1}, Lcom/canhub/cropper/a$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 6
    invoke-virtual {v1}, Lcom/canhub/cropper/a$a;->b()I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move v15, v1

    move-object v1, v0

    move v0, v15

    goto :goto_3

    :catch_0
    move-object v4, v9

    :catch_1
    const/4 v1, 0x1

    goto :goto_2

    :goto_3
    if-eqz v1, :cond_3

    move-object/from16 v6, p0

    move/from16 v13, p12

    move/from16 v14, p13

    .line 7
    :try_start_2
    invoke-virtual {v6, v1, v5, v13, v14}, Lcom/canhub/cropper/a;->H(Landroid/graphics/Bitmap;IZZ)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 8
    :try_start_3
    rem-int/lit8 v1, v5, 0x5a

    if-eqz v1, :cond_2

    move-object/from16 v3, p3

    move/from16 v7, p8

    move/from16 v8, p9

    move-object v1, v6

    move/from16 v6, p7

    .line 9
    invoke-virtual/range {v1 .. v8}, Lcom/canhub/cropper/a;->i(Landroid/graphics/Bitmap;[FLandroid/graphics/Rect;IZII)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v1, v2

    goto :goto_5

    .line 10
    :cond_2
    :goto_4
    new-instance v1, Lcom/canhub/cropper/a$a;

    invoke-direct {v1, v2, v0}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V

    goto :goto_6

    :catch_3
    move-exception v0

    .line 11
    :goto_5
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 12
    throw v0

    :cond_3
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p9

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v9, p14

    move v12, v11

    move v11, v10

    move-object v10, v4

    move-object/from16 v4, p3

    .line 13
    invoke-virtual/range {v1 .. v14}, Lcom/canhub/cropper/a;->f(Landroid/content/Context;Landroid/net/Uri;[FIZIIILandroid/graphics/Rect;IIZZ)Lcom/canhub/cropper/a$a;

    move-result-object v0

    move-object v1, v0

    :goto_6
    return-object v1
.end method

.method public final f(Landroid/content/Context;Landroid/net/Uri;[FIZIIILandroid/graphics/Rect;IIZZ)Lcom/canhub/cropper/a$a;
    .locals 14

    .line 1
    move-object/from16 v11, p2

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    const/4 v12, 0x0

    .line 6
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 7
    .line 8
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Rect;->width()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Rect;->height()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    move/from16 v5, p10

    .line 20
    .line 21
    move/from16 v6, p11

    .line 22
    .line 23
    invoke-virtual {p0, v3, v4, v5, v6}, Lcom/canhub/cropper/a;->c(IIII)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    mul-int v13, p8, v3

    .line 28
    .line 29
    iput v13, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "getContentResolver(...)"

    .line 36
    .line 37
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3, v11, v2}, Lcom/canhub/cropper/a;->j(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    :try_start_1
    array-length v4, v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 47
    move-object v5, v3

    .line 48
    :try_start_2
    new-array v3, v4, [F

    .line 49
    .line 50
    array-length v6, v0

    .line 51
    const/4 v7, 0x0

    .line 52
    invoke-static {v0, v7, v3, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    :goto_0
    if-ge v7, v4, :cond_0

    .line 56
    .line 57
    aget v0, v3, v7

    .line 58
    .line 59
    iget v6, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 60
    .line 61
    int-to-float v6, v6

    .line 62
    div-float/2addr v0, v6

    .line 63
    aput v0, v3, v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    add-int/lit8 v7, v7, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object v2, v5

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    const/high16 v8, 0x3f800000    # 1.0f

    .line 72
    .line 73
    move-object v1, p0

    .line 74
    move/from16 v4, p4

    .line 75
    .line 76
    move/from16 v6, p6

    .line 77
    .line 78
    move/from16 v7, p7

    .line 79
    .line 80
    move/from16 v9, p12

    .line 81
    .line 82
    move/from16 v10, p13

    .line 83
    .line 84
    move-object v2, v5

    .line 85
    move/from16 v5, p5

    .line 86
    .line 87
    :try_start_3
    invoke-virtual/range {v1 .. v10}, Lcom/canhub/cropper/a;->h(Landroid/graphics/Bitmap;[FIZIIFZZ)Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 91
    :try_start_4
    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catch_0
    move-exception v0

    .line 102
    goto :goto_3

    .line 103
    :catch_1
    move-exception v0

    .line 104
    goto :goto_4

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    goto :goto_1

    .line 107
    :catchall_2
    move-exception v0

    .line 108
    move-object v2, v3

    .line 109
    :goto_1
    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_1

    .line 114
    .line 115
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 116
    .line 117
    .line 118
    :cond_1
    throw v0
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 119
    :cond_2
    :goto_2
    new-instance v0, Lcom/canhub/cropper/a$a;

    .line 120
    .line 121
    invoke-direct {v0, v12, v13}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V

    .line 122
    .line 123
    .line 124
    return-object v0

    .line 125
    :goto_3
    new-instance v1, Lcom/canhub/cropper/CropException$FailedToLoadBitmap;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {v1, v11, v0}, Lcom/canhub/cropper/CropException$FailedToLoadBitmap;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :goto_4
    if-eqz v12, :cond_3

    .line 136
    .line 137
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 138
    .line 139
    .line 140
    :cond_3
    throw v0
.end method

.method public final g(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/a$a;
    .locals 13

    .line 1
    const-string v0, "cropPoints"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v11, 0x1

    .line 7
    move v12, v11

    .line 8
    :goto_0
    :try_start_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    int-to-float v0, v11

    .line 12
    int-to-float v1, v12

    .line 13
    div-float v8, v0, v1

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    move-object v3, p2

    .line 18
    move/from16 v4, p3

    .line 19
    .line 20
    move/from16 v5, p4

    .line 21
    .line 22
    move/from16 v6, p5

    .line 23
    .line 24
    move/from16 v7, p6

    .line 25
    .line 26
    move/from16 v9, p7

    .line 27
    .line 28
    move/from16 v10, p8

    .line 29
    .line 30
    invoke-virtual/range {v1 .. v10}, Lcom/canhub/cropper/a;->h(Landroid/graphics/Bitmap;[FIZIIFZZ)Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lcom/canhub/cropper/a$a;

    .line 35
    .line 36
    invoke-direct {v1, v0, v12}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :catch_0
    move-exception v0

    .line 41
    mul-int/lit8 v12, v12, 0x2

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    if-gt v12, v1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    throw v0
.end method

.method public final h(Landroid/graphics/Bitmap;[FIZIIFZZ)Landroid/graphics/Bitmap;
    .locals 15

    .line 1
    move/from16 v7, p3

    .line 2
    .line 3
    move/from16 v0, p7

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v10

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v11

    .line 13
    move-object v8, p0

    .line 14
    move-object/from16 v9, p2

    .line 15
    .line 16
    move/from16 v12, p4

    .line 17
    .line 18
    move/from16 v13, p5

    .line 19
    .line 20
    move/from16 v14, p6

    .line 21
    .line 22
    invoke-virtual/range {v8 .. v14}, Lcom/canhub/cropper/a;->y([FIIZII)Landroid/graphics/Rect;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    new-instance v5, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    int-to-float v1, v7

    .line 32
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    int-to-float v2, v2

    .line 37
    const/high16 v3, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v2, v3

    .line 40
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    int-to-float v4, v4

    .line 45
    div-float/2addr v4, v3

    .line 46
    invoke-virtual {v5, v1, v2, v4}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 47
    .line 48
    .line 49
    if-eqz p8, :cond_0

    .line 50
    .line 51
    neg-float v1, v0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v1, v0

    .line 54
    :goto_0
    if-eqz p9, :cond_1

    .line 55
    .line 56
    neg-float v0, v0

    .line 57
    :cond_1
    invoke-virtual {v5, v1, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 58
    .line 59
    .line 60
    iget v1, v10, Landroid/graphics/Rect;->left:I

    .line 61
    .line 62
    iget v2, v10, Landroid/graphics/Rect;->top:I

    .line 63
    .line 64
    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v6, 0x1

    .line 73
    move-object/from16 v0, p1

    .line 74
    .line 75
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "createBitmap(...)"

    .line 80
    .line 81
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/4 v2, 0x0

    .line 95
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_2
    rem-int/lit8 v0, v7, 0x5a

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    move-object v0, p0

    .line 104
    move-object/from16 v2, p2

    .line 105
    .line 106
    move/from16 v5, p4

    .line 107
    .line 108
    move/from16 v6, p5

    .line 109
    .line 110
    move v4, v7

    .line 111
    move-object v3, v10

    .line 112
    move/from16 v7, p6

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v7}, Lcom/canhub/cropper/a;->i(Landroid/graphics/Bitmap;[FLandroid/graphics/Rect;IZII)Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :cond_3
    return-object v1
.end method

.method public final i(Landroid/graphics/Bitmap;[FLandroid/graphics/Rect;IZII)Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    rem-int/lit8 v0, p4, 0x5a

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    int-to-double v0, p4

    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const/16 v2, 0x5a

    .line 11
    .line 12
    if-lt p4, v2, :cond_1

    .line 13
    .line 14
    const/16 v2, 0xb5

    .line 15
    .line 16
    if-gt v2, p4, :cond_0

    .line 17
    .line 18
    const/16 v2, 0x10e

    .line 19
    .line 20
    if-ge p4, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget p4, p3, Landroid/graphics/Rect;->right:I

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    iget p4, p3, Landroid/graphics/Rect;->left:I

    .line 27
    .line 28
    :goto_1
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    :goto_2
    array-length v4, p2

    .line 31
    if-ge v3, v4, :cond_3

    .line 32
    .line 33
    aget v4, p2, v3

    .line 34
    .line 35
    add-int/lit8 v5, p4, -0x1

    .line 36
    .line 37
    int-to-float v5, v5

    .line 38
    cmpl-float v5, v4, v5

    .line 39
    .line 40
    if-ltz v5, :cond_2

    .line 41
    .line 42
    add-int/lit8 v5, p4, 0x1

    .line 43
    .line 44
    int-to-float v5, v5

    .line 45
    cmpg-float v4, v4, v5

    .line 46
    .line 47
    if-gtz v4, :cond_2

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iget p4, p3, Landroid/graphics/Rect;->bottom:I

    .line 54
    .line 55
    int-to-float p4, p4

    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    aget v2, p2, v3

    .line 59
    .line 60
    sub-float/2addr p4, v2

    .line 61
    float-to-double v6, p4

    .line 62
    mul-double/2addr v4, v6

    .line 63
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    double-to-int v2, v4

    .line 68
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    aget p4, p2, v3

    .line 73
    .line 74
    iget v6, p3, Landroid/graphics/Rect;->top:I

    .line 75
    .line 76
    int-to-float v6, v6

    .line 77
    sub-float/2addr p4, v6

    .line 78
    float-to-double v6, p4

    .line 79
    mul-double/2addr v4, v6

    .line 80
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    double-to-int p4, v4

    .line 85
    aget v4, p2, v3

    .line 86
    .line 87
    iget v5, p3, Landroid/graphics/Rect;->top:I

    .line 88
    .line 89
    int-to-float v5, v5

    .line 90
    sub-float/2addr v4, v5

    .line 91
    float-to-double v4, v4

    .line 92
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide v6

    .line 96
    div-double/2addr v4, v6

    .line 97
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v4

    .line 101
    double-to-int v4, v4

    .line 102
    iget v5, p3, Landroid/graphics/Rect;->bottom:I

    .line 103
    .line 104
    int-to-float v5, v5

    .line 105
    aget p2, p2, v3

    .line 106
    .line 107
    sub-float/2addr v5, p2

    .line 108
    float-to-double v5, v5

    .line 109
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    div-double/2addr v5, v0

    .line 114
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    double-to-int p2, v0

    .line 119
    goto :goto_3

    .line 120
    :cond_2
    add-int/lit8 v3, v3, 0x2

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    move p2, v2

    .line 124
    move p4, p2

    .line 125
    move v4, p4

    .line 126
    :goto_3
    add-int/2addr v4, v2

    .line 127
    add-int/2addr p2, p4

    .line 128
    invoke-virtual {p3, v2, p4, v4, p2}, Landroid/graphics/Rect;->set(IIII)V

    .line 129
    .line 130
    .line 131
    if-eqz p5, :cond_4

    .line 132
    .line 133
    invoke-virtual {p0, p3, p6, p7}, Lcom/canhub/cropper/a;->n(Landroid/graphics/Rect;II)V

    .line 134
    .line 135
    .line 136
    :cond_4
    iget p2, p3, Landroid/graphics/Rect;->left:I

    .line 137
    .line 138
    iget p4, p3, Landroid/graphics/Rect;->top:I

    .line 139
    .line 140
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 141
    .line 142
    .line 143
    move-result p5

    .line 144
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    invoke-static {p1, p2, p4, p5, p3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    if-nez p3, :cond_5

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 159
    .line 160
    .line 161
    :cond_5
    return-object p2

    .line 162
    :cond_6
    return-object p1
.end method

.method public final j(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    :goto_0
    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    sget-object v2, Lcom/canhub/cropper/a;->b:Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-static {v0, v2, p3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :catch_0
    :try_start_1
    iget v2, p3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 19
    .line 20
    mul-int/lit8 v2, v2, 0x2

    .line 21
    .line 22
    iput v2, p3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 23
    .line 24
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iget v0, p3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 30
    .line 31
    const/16 v1, 0x200

    .line 32
    .line 33
    if-gt v0, v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Lcom/canhub/cropper/CropException$FailedToDecodeImage;

    .line 37
    .line 38
    invoke-direct {p1, p2}, Lcom/canhub/cropper/CropException$FailedToDecodeImage;-><init>(Landroid/net/Uri;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :goto_1
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    :catchall_1
    move-exception p2

    .line 44
    invoke-static {v0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    throw p2
.end method

.method public final k(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/BitmapFactory$Options;
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    .line 6
    .line 7
    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 12
    .line 13
    sget-object v0, Lcom/canhub/cropper/a;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-static {p1, v0, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :catchall_0
    move-exception p2

    .line 27
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    invoke-static {p1, p2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final l(Landroid/content/Context;Landroid/net/Uri;II)Lcom/canhub/cropper/a$a;
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "uri"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/a;->k(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/BitmapFactory$Options;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 23
    .line 24
    const/4 v2, -0x1

    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 28
    .line 29
    if-eq v3, v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string p3, "File is not a picture"

    .line 35
    .line 36
    invoke-direct {p1, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 43
    .line 44
    invoke-virtual {p0, v1, v2, p3, p4}, Lcom/canhub/cropper/a;->c(IIII)I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    iget p4, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 49
    .line 50
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 51
    .line 52
    invoke-virtual {p0, p4, v1}, Lcom/canhub/cropper/a;->b(II)I

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    iput p3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2, v0}, Lcom/canhub/cropper/a;->j(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p3, Lcom/canhub/cropper/a$a;

    .line 67
    .line 68
    iget p4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 69
    .line 70
    invoke-direct {p3, p1, p4}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-object p3

    .line 74
    :goto_1
    new-instance p3, Lcom/canhub/cropper/CropException$FailedToLoadBitmap;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {p3, p2, p1}, Lcom/canhub/cropper/CropException$FailedToLoadBitmap;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p3
.end method

.method public final m(Landroid/content/Context;Landroid/net/Uri;Landroid/graphics/Rect;III)Lcom/canhub/cropper/a$a;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0, v1, v2, p4, p5}, Lcom/canhub/cropper/a;->c(IIII)I

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    mul-int/2addr p6, p4

    .line 19
    iput p6, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :try_start_1
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 p5, 0x1f

    .line 32
    .line 33
    if-lt p4, p5, :cond_0

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lk1/a;->a(Ljava/io/InputStream;)Landroid/graphics/BitmapRegionDecoder;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p3

    .line 44
    goto :goto_2

    .line 45
    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 p4, 0x0

    .line 49
    invoke-static {p1, p4}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;

    .line 50
    .line 51
    .line 52
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :cond_1
    :goto_0
    const/4 p5, 0x0

    .line 54
    :try_start_2
    new-instance p6, Lcom/canhub/cropper/a$a;

    .line 55
    .line 56
    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p4, p3, v0}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 64
    .line 65
    invoke-direct {p6, v1, v2}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    .line 67
    .line 68
    :try_start_3
    invoke-virtual {p4}, Landroid/graphics/BitmapRegionDecoder;->recycle()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_4
    invoke-static {p1, p5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 72
    .line 73
    .line 74
    return-object p6

    .line 75
    :catch_0
    move-exception p1

    .line 76
    goto :goto_3

    .line 77
    :catchall_1
    move-exception p3

    .line 78
    goto :goto_1

    .line 79
    :catch_1
    :try_start_5
    iget p6, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 80
    .line 81
    mul-int/lit8 p6, p6, 0x2

    .line 82
    .line 83
    iput p6, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 84
    .line 85
    const/16 v1, 0x200

    .line 86
    .line 87
    if-le p6, v1, :cond_1

    .line 88
    .line 89
    if-eqz p4, :cond_2

    .line 90
    .line 91
    :try_start_6
    invoke-virtual {p4}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    .line 92
    .line 93
    .line 94
    :cond_2
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 95
    .line 96
    :try_start_7
    invoke-static {p1, p5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 97
    .line 98
    .line 99
    new-instance p1, Lcom/canhub/cropper/a$a;

    .line 100
    .line 101
    const/4 p2, 0x1

    .line 102
    invoke-direct {p1, p5, p2}, Lcom/canhub/cropper/a$a;-><init>(Landroid/graphics/Bitmap;I)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :goto_1
    if-eqz p4, :cond_3

    .line 107
    .line 108
    :try_start_8
    invoke-virtual {p4}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    .line 109
    .line 110
    .line 111
    :cond_3
    throw p3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 112
    :goto_2
    :try_start_9
    throw p3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 113
    :catchall_2
    move-exception p4

    .line 114
    :try_start_a
    invoke-static {p1, p3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw p4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 118
    :goto_3
    new-instance p3, Lcom/canhub/cropper/CropException$FailedToLoadBitmap;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p3, p2, p1}, Lcom/canhub/cropper/CropException$FailedToLoadBitmap;-><init>(Landroid/net/Uri;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p3
.end method

.method public final n(Landroid/graphics/Rect;II)V
    .locals 1

    .line 1
    if-ne p2, p3, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eq p2, p3, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-le p2, p3, :cond_0

    .line 22
    .line 23
    iget p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr p3, v0

    .line 34
    sub-int/2addr p2, p3

    .line 35
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget p2, p1, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    sub-int/2addr p3, v0

    .line 49
    sub-int/2addr p2, p3

    .line 50
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final o()Landroid/graphics/Rect;
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/a;->b:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Landroid/graphics/RectF;
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/a;->c:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Landroid/util/Pair;
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/a;->h:Landroid/util/Pair;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()I
    .locals 11

    .line 1
    const/16 v0, 0x800

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ljavax/microedition/khronos/egl/EGLContext;->getEGL()Ljavax/microedition/khronos/egl/EGL;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v1, Ljavax/microedition/khronos/egl/EGL10;

    .line 13
    .line 14
    sget-object v2, Ljavax/microedition/khronos/egl/EGL10;->EGL_DEFAULT_DISPLAY:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglGetDisplay(Ljava/lang/Object;)Ljavax/microedition/khronos/egl/EGLDisplay;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x2

    .line 21
    new-array v3, v3, [I

    .line 22
    .line 23
    invoke-interface {v1, v2, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    new-array v4, v3, [I

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-interface {v1, v2, v5, v6, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigs(Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 32
    .line 33
    .line 34
    aget v5, v4, v6

    .line 35
    .line 36
    new-array v7, v5, [Ljavax/microedition/khronos/egl/EGLConfig;

    .line 37
    .line 38
    invoke-interface {v1, v2, v7, v5, v4}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigs(Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 39
    .line 40
    .line 41
    new-array v3, v3, [I

    .line 42
    .line 43
    aget v4, v4, v6

    .line 44
    .line 45
    move v5, v6

    .line 46
    move v8, v5

    .line 47
    :goto_0
    if-ge v5, v4, :cond_1

    .line 48
    .line 49
    aget-object v9, v7, v5

    .line 50
    .line 51
    const/16 v10, 0x302c

    .line 52
    .line 53
    invoke-interface {v1, v2, v9, v10, v3}, Ljavax/microedition/khronos/egl/EGL10;->eglGetConfigAttrib(Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 54
    .line 55
    .line 56
    aget v9, v3, v6

    .line 57
    .line 58
    if-ge v8, v9, :cond_0

    .line 59
    .line 60
    move v8, v9

    .line 61
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {v1, v2}, Ljavax/microedition/khronos/egl/EGL10;->eglTerminate(Ljavax/microedition/khronos/egl/EGLDisplay;)Z

    .line 65
    .line 66
    .line 67
    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    :catch_0
    return v0
.end method

.method public final s()[F
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/a;->e:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()[F
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/a;->f:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Landroid/graphics/RectF;
    .locals 1

    .line 1
    sget-object v0, Lcom/canhub/cropper/a;->d:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v([F)F
    .locals 2

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    aget v1, p1, v1

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x5

    .line 17
    aget v1, p1, v1

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x7

    .line 24
    aget p1, p1, v1

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public final w([F)F
    .locals 1

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->B([F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->A([F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    add-float/2addr v0, p1

    .line 15
    const/high16 p1, 0x40000000    # 2.0f

    .line 16
    .line 17
    div-float/2addr v0, p1

    .line 18
    return v0
.end method

.method public final x([F)F
    .locals 1

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->v([F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->C([F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    add-float/2addr v0, p1

    .line 15
    const/high16 p1, 0x40000000    # 2.0f

    .line 16
    .line 17
    div-float/2addr v0, p1

    .line 18
    return v0
.end method

.method public final y([FIIZII)Landroid/graphics/Rect;
    .locals 3

    .line 1
    const-string v0, "cropPoints"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->A([F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->C([F)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-float p2, p2

    .line 32
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->B([F)F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {p2, v2}, Ljava/lang/Math;->min(FF)F

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-static {p2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    int-to-float p3, p3

    .line 45
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->v([F)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    new-instance p3, Landroid/graphics/Rect;

    .line 58
    .line 59
    invoke-direct {p3, v0, v1, p2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 60
    .line 61
    .line 62
    if-eqz p4, :cond_0

    .line 63
    .line 64
    invoke-virtual {p0, p3, p5, p6}, Lcom/canhub/cropper/a;->n(Landroid/graphics/Rect;II)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-object p3
.end method

.method public final z([F)F
    .locals 1

    .line 1
    const-string v0, "points"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->v([F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/a;->C([F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    sub-float/2addr v0, p1

    .line 15
    return v0
.end method
