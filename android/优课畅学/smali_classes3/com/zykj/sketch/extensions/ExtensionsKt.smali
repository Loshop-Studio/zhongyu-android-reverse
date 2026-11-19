.class public final Lcom/zykj/sketch/extensions/ExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final capture(Landroid/webkit/WebView;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1a

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v0, v1, v2, v3}, Le3/a;->a(IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    new-instance v1, Landroid/graphics/Canvas;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 48
    .line 49
    .line 50
    return-object v0
.end method

.method public static final getDegree(IIIIII)I
    .locals 0

    .line 1
    sub-int/2addr p2, p0

    .line 2
    sub-int/2addr p4, p0

    .line 3
    mul-int p0, p2, p4

    .line 4
    .line 5
    sub-int/2addr p3, p1

    .line 6
    sub-int/2addr p5, p1

    .line 7
    mul-int p1, p3, p5

    .line 8
    .line 9
    add-int/2addr p0, p1

    .line 10
    mul-int/2addr p2, p2

    .line 11
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    mul-int/2addr p3, p3

    .line 16
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    add-int/2addr p1, p2

    .line 21
    mul-int/2addr p4, p4

    .line 22
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    mul-int/2addr p5, p5

    .line 27
    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    add-int/2addr p2, p3

    .line 32
    mul-int/2addr p1, p2

    .line 33
    int-to-double p1, p1

    .line 34
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    int-to-double p3, p0

    .line 39
    div-double/2addr p3, p1

    .line 40
    invoke-static {p3, p4}, Ljava/lang/Math;->acos(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    const/16 p2, 0xb4

    .line 45
    .line 46
    int-to-double p2, p2

    .line 47
    mul-double/2addr p2, p0

    .line 48
    const-wide p0, 0x400921fb54442d18L    # Math.PI

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    div-double/2addr p2, p0

    .line 54
    double-to-int p0, p2

    .line 55
    return p0
.end method

.method public static final getDistance(FFFFFF)F
    .locals 2

    sub-float v0, p5, p3

    mul-float/2addr p0, v0

    sub-float v1, p2, p4

    mul-float/2addr p1, v1

    add-float/2addr p0, p1

    sub-float p1, p3, p5

    mul-float/2addr p1, p2

    add-float/2addr p0, p1

    sub-float/2addr p4, p2

    mul-float/2addr p4, p3

    add-float/2addr p0, p4

    .line 8
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    float-to-double p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    div-float/2addr p0, p1

    return p0
.end method

.method public static final getDistance(FFFFLandroid/graphics/Matrix;)F
    .locals 5

    const-string v0, "matrix"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 1
    new-array v1, v0, [F

    .line 2
    new-array v2, v0, [F

    .line 3
    new-array v3, v0, [F

    const/4 v4, 0x0

    aput p0, v3, v4

    const/4 p0, 0x1

    aput p1, v3, p0

    invoke-virtual {p4, v1, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 4
    new-array p1, v0, [F

    aput p2, p1, v4

    aput p3, p1, p0

    invoke-virtual {p4, v2, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 5
    aget p1, v1, v4

    aget p2, v2, v4

    sub-float/2addr p1, p2

    .line 6
    aget p2, v1, p0

    aget p0, v2, p0

    sub-float/2addr p2, p0

    float-to-double p0, p1

    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    .line 7
    invoke-static {p0, p1, p3, p4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    float-to-double v0, p2

    invoke-static {v0, v1, p3, p4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p2

    add-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static synthetic getDistance$default(FFFFLandroid/graphics/Matrix;ILjava/lang/Object;)F
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x10

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    new-instance p4, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {p4}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/sketch/extensions/ExtensionsKt;->getDistance(FFFFLandroid/graphics/Matrix;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public static final getMidPoint(FFFFLandroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 6

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    new-array v2, v1, [F

    .line 13
    .line 14
    new-array v3, v1, [F

    .line 15
    .line 16
    new-array v4, v1, [F

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    aput p0, v4, v5

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    aput p1, v4, p0

    .line 23
    .line 24
    invoke-virtual {p4, v2, v4}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 25
    .line 26
    .line 27
    new-array p1, v1, [F

    .line 28
    .line 29
    aput p2, p1, v5

    .line 30
    .line 31
    aput p3, p1, p0

    .line 32
    .line 33
    invoke-virtual {p4, v3, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 34
    .line 35
    .line 36
    aget p1, v2, v5

    .line 37
    .line 38
    aget p2, v3, v5

    .line 39
    .line 40
    add-float/2addr p1, p2

    .line 41
    aget p2, v2, p0

    .line 42
    .line 43
    aget p0, v3, p0

    .line 44
    .line 45
    add-float/2addr p2, p0

    .line 46
    int-to-float p0, v1

    .line 47
    div-float/2addr p1, p0

    .line 48
    div-float/2addr p2, p0

    .line 49
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static final getRotation(FFFFLandroid/graphics/Matrix;)F
    .locals 5

    .line 1
    const-string v0, "matrix"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v1, v0, [F

    .line 8
    .line 9
    new-array v2, v0, [F

    .line 10
    .line 11
    new-array v3, v0, [F

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    aput p0, v3, v4

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    aput p1, v3, p0

    .line 18
    .line 19
    invoke-virtual {p4, v1, v3}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 20
    .line 21
    .line 22
    new-array p1, v0, [F

    .line 23
    .line 24
    aput p2, p1, v4

    .line 25
    .line 26
    aput p3, p1, p0

    .line 27
    .line 28
    invoke-virtual {p4, v2, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 29
    .line 30
    .line 31
    aget p1, v1, v4

    .line 32
    .line 33
    aget p2, v2, v4

    .line 34
    .line 35
    sub-float/2addr p1, p2

    .line 36
    float-to-double p1, p1

    .line 37
    aget p3, v1, p0

    .line 38
    .line 39
    aget p0, v2, p0

    .line 40
    .line 41
    sub-float/2addr p3, p0

    .line 42
    float-to-double p3, p3

    .line 43
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    invoke-static {p0, p1}, Ljava/lang/Math;->toDegrees(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    double-to-float p0, p0

    .line 52
    return p0
.end method

.method public static final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "tag"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "msg"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    rsub-int v0, v0, 0x7d0

    .line 16
    .line 17
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-le v1, v0, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v1, "this as java.lang.String).substring(startIndex)"

    .line 41
    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public static final lineSpace(FFFF)F
    .locals 0

    .line 1
    sub-float/2addr p0, p2

    .line 2
    mul-float/2addr p0, p0

    .line 3
    sub-float/2addr p1, p3

    .line 4
    mul-float/2addr p1, p1

    .line 5
    add-float/2addr p0, p1

    .line 6
    float-to-double p0, p0

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    double-to-float p0, p0

    .line 12
    return p0
.end method

.method public static final logInfo(Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 1

    .line 1
    const-string v0, "tag"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string v0, "[string]->>"

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public static synthetic logInfo$default(Ljava/lang/String;Ljava/lang/Object;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/extensions/ExtensionsKt;->logInfo(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final pointToLine(FFFFFF)F
    .locals 3

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/sketch/extensions/ExtensionsKt;->lineSpace(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1, p4, p5}, Lcom/zykj/sketch/extensions/ExtensionsKt;->lineSpace(FFFF)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p2, p3, p4, p5}, Lcom/zykj/sketch/extensions/ExtensionsKt;->lineSpace(FFFF)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-float p2, p1, p0

    .line 14
    .line 15
    cmpg-float p2, p2, v0

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_0
    float-to-double p2, v0

    .line 22
    const-wide p4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmpg-double p4, p2, p4

    .line 28
    .line 29
    if-gtz p4, :cond_1

    .line 30
    .line 31
    return p0

    .line 32
    :cond_1
    mul-float p4, p1, p1

    .line 33
    .line 34
    mul-float p5, v0, v0

    .line 35
    .line 36
    mul-float v1, p0, p0

    .line 37
    .line 38
    add-float v2, p5, v1

    .line 39
    .line 40
    cmpl-float v2, p4, v2

    .line 41
    .line 42
    if-ltz v2, :cond_2

    .line 43
    .line 44
    const-string p1, "\u7ec4\u6210\u76f4\u89d2\u4e09\u89d2\u5f62\u6216\u949d\u89d2\u4e09\u89d2\u5f62\uff0c(x1,y1)\u4e3a\u76f4\u89d2\u6216\u949d\u89d2  "

    .line 45
    .line 46
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return p0

    .line 52
    :cond_2
    add-float/2addr p5, p4

    .line 53
    cmpl-float p4, v1, p5

    .line 54
    .line 55
    if-ltz p4, :cond_3

    .line 56
    .line 57
    const-string p0, "\u7ec4\u6210\u76f4\u89d2\u4e09\u89d2\u5f62\u6216\u949d\u89d2\u4e09\u89d2\u5f62\uff0c(x2,y2)\u4e3a\u76f4\u89d2\u6216\u949d\u89d2 "

    .line 58
    .line 59
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 60
    .line 61
    invoke-virtual {p2, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return p1

    .line 65
    :cond_3
    const-string p4, "\u7ec4\u6210\u9510\u89d2\u4e09\u89d2\u5f62\uff0c\u5219\u6c42\u4e09\u89d2\u5f62\u7684\u9ad8  "

    .line 66
    .line 67
    sget-object p5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 68
    .line 69
    invoke-virtual {p5, p4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    add-float p4, v0, p0

    .line 73
    .line 74
    add-float/2addr p4, p1

    .line 75
    const/4 p5, 0x2

    .line 76
    int-to-float v1, p5

    .line 77
    div-float/2addr p4, v1

    .line 78
    sub-float v0, p4, v0

    .line 79
    .line 80
    mul-float/2addr v0, p4

    .line 81
    sub-float p0, p4, p0

    .line 82
    .line 83
    mul-float/2addr v0, p0

    .line 84
    sub-float/2addr p4, p1

    .line 85
    mul-float/2addr v0, p4

    .line 86
    float-to-double p0, v0

    .line 87
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    int-to-double p4, p5

    .line 92
    mul-double/2addr p4, p0

    .line 93
    div-double/2addr p4, p2

    .line 94
    double-to-float p0, p4

    .line 95
    return p0
.end method
