.class public abstract Lna/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna/n$b;

.field public static final b:Lna/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lna/n$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/n$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/n;->a:Lna/n$b;

    .line 7
    .line 8
    new-instance v0, Lna/n$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lna/n$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lna/n;->b:Lna/n$a;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Landroid/graphics/Matrix;)F
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    new-array v0, v0, [F

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    aget p0, v0, p0

    .line 15
    .line 16
    return p0
.end method

.method public static final b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final c(Landroid/graphics/Matrix;)Z
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lna/n;->a:Lna/n$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, [F

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    const/16 v3, 0x9

    .line 23
    .line 24
    if-ge v2, v3, :cond_1

    .line 25
    .line 26
    aget v3, v0, v2

    .line 27
    .line 28
    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return v1

    .line 44
    :cond_1
    const/16 v2, 0x8

    .line 45
    .line 46
    aget v2, v0, v2

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const v3, 0x38d1b717    # 1.0E-4f

    .line 53
    .line 54
    .line 55
    cmpg-float v2, v2, v3

    .line 56
    .line 57
    if-gez v2, :cond_2

    .line 58
    .line 59
    return v1

    .line 60
    :cond_2
    aget v2, v0, v1

    .line 61
    .line 62
    const/4 v4, 0x3

    .line 63
    aget v4, v0, v4

    .line 64
    .line 65
    invoke-static {v2, v4}, Lna/n;->e(FF)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v4, 0x1

    .line 70
    aget v4, v0, v4

    .line 71
    .line 72
    const/4 v5, 0x4

    .line 73
    aget v0, v0, v5

    .line 74
    .line 75
    invoke-static {v4, v0}, Lna/n;->e(FF)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    cmpg-float v2, v2, v3

    .line 80
    .line 81
    if-ltz v2, :cond_4

    .line 82
    .line 83
    cmpg-float v0, v0, v3

    .line 84
    .line 85
    if-gez v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    sget-object v0, Lna/n;->b:Lna/n$a;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    check-cast v0, Landroid/graphics/Matrix;

    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    return p0

    .line 107
    :cond_4
    :goto_1
    return v1
.end method

.method public static final d(Lcom/zykj/board/EzyMatrix$Matrix;)Z
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lna/n;->c(Landroid/graphics/Matrix;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public static final e(FF)F
    .locals 0

    .line 1
    mul-float/2addr p0, p0

    .line 2
    mul-float/2addr p1, p1

    .line 3
    add-float/2addr p0, p1

    .line 4
    float-to-double p0, p0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    double-to-float p0, p0

    .line 10
    return p0
.end method

.method public static final f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->D()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    new-array v1, v1, [F

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x2

    .line 18
    aget p0, v1, p0

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->z(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x5

    .line 24
    aget p0, v1, p0

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->A(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    aget p0, v1, p0

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->v(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x4

    .line 36
    aget p0, v1, p0

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    aget p0, v1, p0

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->x(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x3

    .line 48
    aget p0, v1, p0

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->y(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x6

    .line 54
    aget p0, v1, p0

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->r(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x7

    .line 60
    aget p0, v1, p0

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->s(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 63
    .line 64
    .line 65
    const/16 p0, 0x8

    .line 66
    .line 67
    aget p0, v1, p0

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->p(J)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->d()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string p1, "newBuilder.build()"

    .line 80
    .line 81
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object p0
.end method

.method public static final g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;
    .locals 11

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    const/16 v9, 0x9

    .line 48
    .line 49
    new-array v9, v9, [F

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    aput v3, v9, v10

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    aput v5, v9, v3

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    aput v1, v9, v3

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    aput v6, v9, v1

    .line 62
    .line 63
    const/4 v1, 0x4

    .line 64
    aput v4, v9, v1

    .line 65
    .line 66
    const/4 v1, 0x5

    .line 67
    aput v2, v9, v1

    .line 68
    .line 69
    const/4 v1, 0x6

    .line 70
    aput v7, v9, v1

    .line 71
    .line 72
    const/4 v1, 0x7

    .line 73
    aput v8, v9, v1

    .line 74
    .line 75
    const/16 v1, 0x8

    .line 76
    .line 77
    aput p0, v9, v1

    .line 78
    .line 79
    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->setValues([F)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method
