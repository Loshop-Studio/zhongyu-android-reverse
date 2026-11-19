.class public abstract Lt9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt9/a$a;
    }
.end annotation


# static fields
.field public static final r:Lt9/a$a;


# instance fields
.field public final a:Lr9/b;

.field public final b:Lv9/c;

.field public final c:Lq9/b;

.field public final d:Lu9/a;

.field public final e:Landroid/graphics/Matrix;

.field public final f:Landroid/graphics/Matrix;

.field public final g:Landroid/graphics/RectF;

.field public final h:Landroid/graphics/RectF;

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public k:Ls9/b;

.field public l:Lt9/d;

.field public m:F

.field public n:F

.field public o:Z

.field public final p:Ljava/util/List;

.field public q:Landroid/graphics/PointF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lt9/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lt9/a$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lt9/a;->r:Lt9/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lr9/b;)V
    .locals 12

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lt9/a;->a:Lr9/b;

    .line 10
    .line 11
    invoke-interface {p1}, Lr9/b;->a()Lv9/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lt9/a;->b:Lv9/c;

    .line 16
    .line 17
    invoke-interface {p1}, Lr9/b;->j()Lq9/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lt9/a;->c:Lq9/b;

    .line 22
    .line 23
    invoke-interface {p1}, Lr9/b;->g()Lu9/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lt9/a;->d:Lu9/a;

    .line 28
    .line 29
    new-instance p1, Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 42
    .line 43
    new-instance p1, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 49
    .line 50
    new-instance p1, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lt9/a;->h:Landroid/graphics/RectF;

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Lt9/a;->i:Z

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 66
    .line 67
    sget-object p1, Ls9/b$f;->a:Ls9/b$f;

    .line 68
    .line 69
    iput-object p1, p0, Lt9/a;->k:Ls9/b;

    .line 70
    .line 71
    new-instance v0, Lt9/d;

    .line 72
    .line 73
    const/16 v10, 0x1ff

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    const/4 v1, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v4, 0x0

    .line 80
    const/4 v5, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    invoke-direct/range {v0 .. v11}, Lt9/d;-><init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/n;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Lt9/a;->l:Lt9/d;

    .line 89
    .line 90
    new-instance p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lt9/a;->p:Ljava/util/List;

    .line 96
    .line 97
    return-void
.end method

.method public static synthetic Q(Lt9/a;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    const/4 p3, 0x1

    .line 4
    and-int/2addr p2, p3

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    move p1, p3

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lt9/a;->P(Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: showSelectRectF"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private final a(FF)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v1, p1, v0

    .line 3
    .line 4
    if-lez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    double-to-float v1, v1

    .line 18
    :goto_0
    cmpl-float v0, p2, v0

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    :goto_1
    div-float/2addr p2, p1

    .line 26
    float-to-double p1, p2

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    double-to-float p1, p1

    .line 32
    int-to-float p2, v0

    .line 33
    mul-float/2addr v1, p2

    .line 34
    add-float/2addr v1, p1

    .line 35
    return v1
.end method

.method private final b(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-direct {p0, p3, p4}, Lt9/a;->a(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-direct {p0, p7, p8}, Lt9/a;->a(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-float/2addr p1, p2

    .line 14
    mul-float/2addr p7, p7

    .line 15
    mul-float/2addr p8, p8

    .line 16
    add-float/2addr p7, p8

    .line 17
    float-to-double p2, p7

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    double-to-float p2, p2

    .line 23
    float-to-double p3, p1

    .line 24
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    double-to-float p1, p3

    .line 29
    mul-float/2addr p1, p2

    .line 30
    return p1
.end method


# virtual methods
.method public A(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lt9/a;->k:Ls9/b;

    .line 2
    .line 3
    sget-object v1, Ls9/b$g;->a:Ls9/b$g;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lt9/a;->B(FF)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Ls9/b$h;->a:Ls9/b$h;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lt9/a;->C(FF)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v1, Ls9/b$b;->a:Ls9/b$b;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lt9/a;->D(FF)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-boolean p1, p0, Lt9/a;->o:Z

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lt9/a;->b:Lv9/c;

    .line 44
    .line 45
    invoke-interface {p1}, Lv9/c;->e()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lt9/a;->b:Lv9/c;

    .line 49
    .line 50
    iget-object v0, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-interface {p1, v0}, Lv9/c;->x(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    iput-boolean p2, p0, Lt9/a;->o:Z

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lt9/a;->c(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v0, p0, Lt9/a;->p:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-static {p1, v1, v2}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lt9/a;->b:Lv9/c;

    .line 77
    .line 78
    iget-object v1, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-interface {v0, v1, p1}, Lv9/c;->k(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 81
    .line 82
    .line 83
    return p2

    .line 84
    :cond_3
    const/4 p1, 0x0

    .line 85
    return p1
.end method

.method public final B(FF)V
    .locals 4

    .line 1
    sget-object v0, Lna/o;->a:Lna/o;

    .line 2
    .line 3
    iget-object v1, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 22
    .line 23
    sub-float/2addr p1, v1

    .line 24
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 25
    .line 26
    sub-float/2addr p2, v1

    .line 27
    invoke-direct {p0, p1, p2}, Lt9/a;->a(FF)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p2, p0, Lt9/a;->m:F

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    sub-float/2addr p2, v1

    .line 36
    iget v1, p0, Lt9/a;->n:F

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    sub-float/2addr v1, v2

    .line 41
    invoke-direct {p0, p2, v1}, Lt9/a;->a(FF)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    sub-float/2addr p1, p2

    .line 46
    float-to-double p1, p1

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    double-to-float p1, p1

    .line 52
    iget-object p2, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 53
    .line 54
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 57
    .line 58
    invoke-virtual {p2, p1, v1, v0}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final C(FF)V
    .locals 11

    .line 1
    sget-object v0, Lna/o;->a:Lna/o;

    .line 2
    .line 3
    iget-object v1, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 22
    .line 23
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    iget-object v4, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v0, v3, v2, v4}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 38
    .line 39
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 40
    .line 41
    iget v7, p0, Lt9/a;->m:F

    .line 42
    .line 43
    iget v8, p0, Lt9/a;->n:F

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    move v9, p1

    .line 47
    move v10, p2

    .line 48
    invoke-direct/range {v2 .. v10}, Lt9/a;->b(FFFFFFFF)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget p2, v1, Landroid/graphics/PointF;->x:F

    .line 53
    .line 54
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 55
    .line 56
    sub-float/2addr p2, v3

    .line 57
    float-to-double v3, p2

    .line 58
    const/4 p2, 0x2

    .line 59
    int-to-double v5, p2

    .line 60
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    double-to-float v3, v3

    .line 65
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 68
    .line 69
    sub-float/2addr v4, v0

    .line 70
    float-to-double v7, v4

    .line 71
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    double-to-float v0, v4

    .line 76
    add-float/2addr v3, v0

    .line 77
    float-to-double v3, v3

    .line 78
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    double-to-float v0, v3

    .line 83
    add-float/2addr p1, v0

    .line 84
    iget-object v3, v2, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 85
    .line 86
    iget-object v4, v2, Lt9/a;->g:Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    iget-object v5, v2, Lt9/a;->g:Landroid/graphics/RectF;

    .line 93
    .line 94
    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    iget-object v4, v2, Lt9/a;->c:Lq9/b;

    .line 107
    .line 108
    invoke-virtual {v4}, Lq9/b;->H()F

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    mul-float/2addr v4, v0

    .line 113
    int-to-float p2, p2

    .line 114
    mul-float/2addr v4, p2

    .line 115
    div-float/2addr v4, v3

    .line 116
    cmpg-float p2, p1, v4

    .line 117
    .line 118
    if-gez p2, :cond_0

    .line 119
    .line 120
    move p1, v4

    .line 121
    :cond_0
    div-float/2addr p1, v0

    .line 122
    iget-object p2, v2, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 123
    .line 124
    iget v0, v1, Landroid/graphics/PointF;->x:F

    .line 125
    .line 126
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 127
    .line 128
    invoke-virtual {p2, p1, p1, v0, v1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final D(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget v1, p0, Lt9/a;->m:F

    .line 4
    .line 5
    sub-float/2addr p1, v1

    .line 6
    iget v1, p0, Lt9/a;->n:F

    .line 7
    .line 8
    sub-float/2addr p2, v1

    .line 9
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/a;->p:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract F(FF)Z
.end method

.method public final G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public H()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Ls9/b$f;->a:Ls9/b$f;

    .line 22
    .line 23
    iput-object v0, p0, Lt9/a;->k:Ls9/b;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Lt9/a;->q:Landroid/graphics/PointF;

    .line 27
    .line 28
    return-void
.end method

.method public final I(Ls9/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lt9/a;->k:Ls9/b;

    .line 7
    .line 8
    return-void
.end method

.method public final J(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lt9/a;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final K(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lt9/a;->m:F

    .line 2
    .line 3
    iput p2, p0, Lt9/a;->n:F

    .line 4
    .line 5
    return-void
.end method

.method public L(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 12
    .line 13
    check-cast p1, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final M(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final N(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Lt9/a;->q:Landroid/graphics/PointF;

    .line 22
    .line 23
    return-void
.end method

.method public final O(Landroid/graphics/PointF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt9/a;->q:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-void
.end method

.method public final P(Z)V
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lt9/a;->h:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {p0}, Lt9/a;->p()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lt9/a;->h:Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-virtual {p0}, Lt9/a;->t()Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lt9/a;->m()Landroid/graphics/RectF;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0, p1, v0, v1}, Lt9/a;->k(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput-boolean p1, p0, Lt9/a;->i:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Lt9/a;->R()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, Lt9/a;->q:Landroid/graphics/PointF;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    sget-object v0, Lna/o;->a:Lna/o;

    .line 36
    .line 37
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, p1, v1}, Lna/o;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    move-object v6, p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    iget-object v0, p0, Lt9/a;->b:Lv9/c;

    .line 50
    .line 51
    iget-object v1, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 52
    .line 53
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v3, p0, Lt9/a;->h:Landroid/graphics/RectF;

    .line 58
    .line 59
    iget-object v4, p0, Lt9/a;->l:Lt9/d;

    .line 60
    .line 61
    invoke-virtual {p0}, Lt9/a;->f()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-interface/range {v0 .. v6}, Lv9/c;->t(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lt9/d;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public abstract R()V
.end method

.method public final c(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lt9/a;->d:Lu9/a;

    .line 7
    .line 8
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lt9/a;->d:Lu9/a;

    .line 19
    .line 20
    invoke-virtual {p1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public final d()Lq9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->c:Lq9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ls9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->k:Ls9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract f()Ljava/util/List;
.end method

.method public final g()Landroid/graphics/Matrix;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final h()F
    .locals 1

    .line 1
    iget v0, p0, Lt9/a;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public final i()F
    .locals 1

    .line 1
    iget v0, p0, Lt9/a;->n:F

    .line 2
    .line 3
    return v0
.end method

.method public final j()Lt9/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->l:Lt9/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 5

    .line 1
    const-string v0, "functionRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "limitRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 17
    .line 18
    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 19
    .line 20
    const/high16 v2, 0x41600000    # 14.0f

    .line 21
    .line 22
    add-float/2addr v1, v2

    .line 23
    iget v3, p3, Landroid/graphics/RectF;->bottom:F

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    sub-float/2addr v3, v4

    .line 30
    cmpl-float v3, v1, v3

    .line 31
    .line 32
    if-lez v3, :cond_0

    .line 33
    .line 34
    iget p2, p2, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    iget-object v1, p0, Lt9/a;->c:Lq9/b;

    .line 37
    .line 38
    invoke-virtual {v1}, Lq9/b;->E()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    sub-float/2addr p2, v1

    .line 43
    sub-float v1, p2, v2

    .line 44
    .line 45
    :cond_0
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    cmpg-float v2, v1, p2

    .line 48
    .line 49
    if-gez v2, :cond_1

    .line 50
    .line 51
    move v1, p2

    .line 52
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    cmpg-float p2, p2, v2

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    if-gez p2, :cond_3

    .line 64
    .line 65
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 66
    .line 67
    cmpg-float v3, v0, p2

    .line 68
    .line 69
    if-gez v3, :cond_2

    .line 70
    .line 71
    move v0, p2

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget p2, p3, Landroid/graphics/RectF;->right:F

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-float/2addr p2, v3

    .line 80
    cmpl-float p2, v0, p2

    .line 81
    .line 82
    if-lez p2, :cond_3

    .line 83
    .line 84
    iget p2, p3, Landroid/graphics/RectF;->right:F

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    sub-float v0, p2, p3

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    :cond_3
    :goto_0
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 94
    .line 95
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 96
    .line 97
    iget p2, p1, Landroid/graphics/RectF;->right:F

    .line 98
    .line 99
    add-float/2addr p2, v0

    .line 100
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 101
    .line 102
    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 103
    .line 104
    add-float/2addr p2, v1

    .line 105
    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 106
    .line 107
    return v2
.end method

.method public final l()Lv9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->b:Lv9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroid/graphics/RectF;
    .locals 5

    .line 1
    iget-object v0, p0, Lt9/a;->b:Lv9/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lv9/c;->q()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lt9/a;->c:Lq9/b;

    .line 13
    .line 14
    invoke-virtual {v2}, Lq9/b;->z()Lq9/d;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lq9/d;->g()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    new-instance v2, Landroid/graphics/RectF;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget-object v4, p0, Lt9/a;->c:Lq9/b;

    .line 31
    .line 32
    invoke-virtual {v4}, Lq9/b;->z()Lq9/d;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Lq9/d;->c()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    int-to-float v4, v4

    .line 41
    mul-float/2addr v3, v4

    .line 42
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v4, p0, Lt9/a;->c:Lq9/b;

    .line 47
    .line 48
    invoke-virtual {v4}, Lq9/b;->z()Lq9/d;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Lq9/d;->b()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    int-to-float v4, v4

    .line 57
    mul-float/2addr v0, v4

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v2, v4, v4, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lt9/a;->d:Lu9/a;

    .line 63
    .line 64
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 72
    .line 73
    .line 74
    :cond_0
    return-object v1
.end method

.method public final n()Lr9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->a:Lr9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lu9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->d:Lu9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract p()Landroid/graphics/RectF;
.end method

.method public final q()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->h:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lt9/a;->g:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lt9/a;->g()Landroid/graphics/Matrix;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final u()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/a;->q:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object v0
.end method

.method public w(FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public x(FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public y(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lt9/a;->k:Ls9/b;

    .line 2
    .line 3
    sget-object v1, Ls9/b$g;->a:Ls9/b$g;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lt9/a;->B(FF)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Ls9/b$h;->a:Ls9/b$h;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lt9/a;->C(FF)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object v1, Ls9/b$b;->a:Ls9/b$b;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Lt9/a;->D(FF)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p1, p0, Lt9/a;->e:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget-object p2, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lt9/a;->c(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p2, p0, Lt9/a;->f:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lt9/a;->b:Lv9/c;

    .line 58
    .line 59
    iget-object v0, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-interface {p2, v0, p1}, Lv9/c;->z(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v2, p0, Lt9/a;->o:Z

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-static {p0, v2, v0, p2}, Lt9/a;->Q(Lt9/a;ZILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, Lt9/a;->p:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-static {p1, v1, v2}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lt9/a;->a:Lr9/b;

    .line 85
    .line 86
    iget-object p2, p0, Lt9/a;->j:Ljava/util/ArrayList;

    .line 87
    .line 88
    iget-object v1, p0, Lt9/a;->p:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {p1, p2, v1}, Lr9/b;->c(Ljava/util/List;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lt9/a;->a:Lr9/b;

    .line 94
    .line 95
    invoke-interface {p1}, Lr9/b;->l()V

    .line 96
    .line 97
    .line 98
    return v0

    .line 99
    :cond_2
    return v2
.end method

.method public z(FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
