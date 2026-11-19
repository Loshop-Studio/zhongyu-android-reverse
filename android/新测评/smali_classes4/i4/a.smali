.class public abstract Li4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li4/a$a;
    }
.end annotation


# static fields
.field public static final t:Li4/a$a;


# instance fields
.field public final a:Lg4/b;

.field public final b:Lk4/c;

.field public final c:Lcom/zykj/blackboard/bean/BoardConfig;

.field public final d:Lj4/a;

.field public final e:Landroid/graphics/Matrix;

.field public final f:Landroid/graphics/Matrix;

.field public final g:Landroid/graphics/RectF;

.field public final h:Landroid/graphics/RectF;

.field public i:Lkotlin/Pair;

.field public j:Z

.field public final k:Ljava/util/ArrayList;

.field public l:Lh4/b;

.field public m:Li4/e;

.field public n:Li4/c;

.field public o:F

.field public p:F

.field public q:Z

.field public final r:Ljava/util/List;

.field public s:Landroid/graphics/PointF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li4/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li4/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li4/a;->t:Li4/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lg4/b;)V
    .locals 13

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li4/a;->a:Lg4/b;

    .line 10
    .line 11
    invoke-interface {p1}, Lg4/b;->a()Lk4/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Li4/a;->b:Lk4/c;

    .line 16
    .line 17
    invoke-interface {p1}, Lg4/b;->k()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 22
    .line 23
    invoke-interface {p1}, Lg4/b;->h()Lj4/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Li4/a;->d:Lj4/a;

    .line 28
    .line 29
    new-instance p1, Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 42
    .line 43
    new-instance p1, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 49
    .line 50
    new-instance p1, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Li4/a;->h:Landroid/graphics/RectF;

    .line 56
    .line 57
    new-instance p1, Lkotlin/Pair;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {p1, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Li4/a;->i:Lkotlin/Pair;

    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    iput-boolean p1, p0, Li4/a;->j:Z

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 78
    .line 79
    sget-object p1, Lh4/b$g;->a:Lh4/b$g;

    .line 80
    .line 81
    iput-object p1, p0, Li4/a;->l:Lh4/b;

    .line 82
    .line 83
    new-instance v0, Li4/e;

    .line 84
    .line 85
    const/16 v11, 0x3ff

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v2, 0x0

    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v6, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-direct/range {v0 .. v12}, Li4/e;-><init>(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Li4/a;->m:Li4/e;

    .line 102
    .line 103
    new-instance v1, Li4/c;

    .line 104
    .line 105
    const/16 v7, 0x1f

    .line 106
    .line 107
    invoke-direct/range {v1 .. v8}, Li4/c;-><init>(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Li4/a;->n:Li4/c;

    .line 111
    .line 112
    new-instance p1, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Li4/a;->r:Ljava/util/List;

    .line 118
    .line 119
    return-void
.end method

.method public static synthetic V(Li4/a;ZILjava/lang/Object;)V
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
    invoke-virtual {p0, p1}, Li4/a;->U(Z)V

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

.method private final c(FF)F
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

.method private final d(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-direct {p0, p3, p4}, Li4/a;->c(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-direct {p0, p7, p8}, Li4/a;->c(FF)F

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
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public B(FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public C(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Li4/a;->l:Lh4/b;

    .line 2
    .line 3
    sget-object v1, Lh4/b$h;->a:Lh4/b$h;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {p0, p1, p2}, Li4/a;->F(FF)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Lh4/b$i;->a:Lh4/b$i;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Li4/a;->G(FF)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    sget-object v1, Lh4/b$b;->a:Lh4/b$b;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Li4/a;->H(FF)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p1, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 40
    .line 41
    iget-object p2, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Li4/a;->e(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p2, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Li4/a;->b:Lk4/c;

    .line 58
    .line 59
    iget-object v0, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-interface {p2, v0, p1}, Lk4/c;->x(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v2, p0, Li4/a;->q:Z

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    const/4 v0, 0x1

    .line 68
    invoke-static {p0, v2, v0, p2}, Li4/a;->V(Li4/a;ZILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, Li4/a;->r:Ljava/util/List;

    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    invoke-static {p1, v1, v2}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Li4/a;->a:Lg4/b;

    .line 85
    .line 86
    iget-object p2, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 87
    .line 88
    iget-object v1, p0, Li4/a;->r:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {p1, p2, v1}, Lg4/b;->c(Ljava/util/List;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Li4/a;->a:Lg4/b;

    .line 94
    .line 95
    invoke-interface {p1}, Lg4/b;->l()V

    .line 96
    .line 97
    .line 98
    return v0

    .line 99
    :cond_2
    return v2
.end method

.method public D(FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public E(FF)Z
    .locals 3

    .line 1
    iget-object v0, p0, Li4/a;->l:Lh4/b;

    .line 2
    .line 3
    sget-object v1, Lh4/b$h;->a:Lh4/b$h;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Li4/a;->F(FF)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Lh4/b$i;->a:Lh4/b$i;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Li4/a;->G(FF)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v1, Lh4/b$b;->a:Lh4/b$b;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Li4/a;->H(FF)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-boolean p1, p0, Li4/a;->q:Z

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Li4/a;->b:Lk4/c;

    .line 44
    .line 45
    invoke-interface {p1}, Lk4/c;->d()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Li4/a;->b:Lk4/c;

    .line 49
    .line 50
    iget-object v0, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-interface {p1, v0}, Lk4/c;->v(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    iput-boolean p2, p0, Li4/a;->q:Z

    .line 56
    .line 57
    :cond_2
    iget-object p1, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Li4/a;->e(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v0, p0, Li4/a;->r:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-static {p1, v1, v2}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Li4/a;->b:Lk4/c;

    .line 77
    .line 78
    iget-object v1, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-interface {v0, v1, p1}, Lk4/c;->h(Ljava/util/List;Landroid/graphics/Matrix;)V

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

.method public final F(FF)V
    .locals 4

    .line 1
    sget-object v0, Le5/n;->a:Le5/n;

    .line 2
    .line 3
    iget-object v1, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

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
    invoke-direct {p0, p1, p2}, Li4/a;->c(FF)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p2, p0, Li4/a;->o:F

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    sub-float/2addr p2, v1

    .line 36
    iget v1, p0, Li4/a;->p:F

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    sub-float/2addr v1, v2

    .line 41
    invoke-direct {p0, p2, v1}, Li4/a;->c(FF)F

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
    iget-object p2, p0, Li4/a;->f:Landroid/graphics/Matrix;

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

.method public final G(FF)V
    .locals 11

    .line 1
    sget-object v0, Le5/n;->a:Le5/n;

    .line 2
    .line 3
    iget-object v1, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 22
    .line 23
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 24
    .line 25
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    iget-object v4, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v0, v3, v2, v4}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

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
    iget v7, p0, Li4/a;->o:F

    .line 42
    .line 43
    iget v8, p0, Li4/a;->p:F

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    move v9, p1

    .line 47
    move v10, p2

    .line 48
    invoke-direct/range {v2 .. v10}, Li4/a;->d(FFFFFFFF)F

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
    iget-object v3, v2, Li4/a;->e:Landroid/graphics/Matrix;

    .line 85
    .line 86
    iget-object v4, v2, Li4/a;->g:Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    iget-object v5, v2, Li4/a;->g:Landroid/graphics/RectF;

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
    iget-object v4, v2, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 107
    .line 108
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectIconWidth()F

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
    iget-object p2, v2, Li4/a;->f:Landroid/graphics/Matrix;

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

.method public final H(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget v1, p0, Li4/a;->o:F

    .line 4
    .line 5
    sub-float/2addr p1, v1

    .line 6
    iget v1, p0, Li4/a;->p:F

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

.method public I()V
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li4/a;->r:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract J(FF)Z
.end method

.method public final K()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li4/a;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public L()V
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->setEmpty()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lh4/b$g;->a:Lh4/b$g;

    .line 22
    .line 23
    iput-object v0, p0, Li4/a;->l:Lh4/b;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Li4/a;->s:Landroid/graphics/PointF;

    .line 27
    .line 28
    return-void
.end method

.method public final M(Lh4/b;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li4/a;->l:Lh4/b;

    .line 7
    .line 8
    return-void
.end method

.method public final N(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Li4/a;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public final O(FF)V
    .locals 0

    .line 1
    iput p1, p0, Li4/a;->o:F

    .line 2
    .line 3
    iput p2, p0, Li4/a;->p:F

    .line 4
    .line 5
    return-void
.end method

.method public P(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "graphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final Q(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final R(Lkotlin/Pair;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Li4/a;->i:Lkotlin/Pair;

    .line 7
    .line 8
    return-void
.end method

.method public final S(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    const-string v0, "rectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Li4/a;->s:Landroid/graphics/PointF;

    .line 22
    .line 23
    return-void
.end method

.method public final T(Landroid/graphics/PointF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li4/a;->s:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-void
.end method

.method public final U(Z)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Li4/a;->h:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {p0}, Li4/a;->s()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Li4/a;->h:Landroid/graphics/RectF;

    .line 13
    .line 14
    invoke-virtual {p0}, Li4/a;->w()Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Li4/a;->p()Landroid/graphics/RectF;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Li4/a;->i:Lkotlin/Pair;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v0, v1, v2}, Li4/a;->n(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput-boolean p1, p0, Li4/a;->j:Z

    .line 29
    .line 30
    invoke-virtual {p0}, Li4/a;->X()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Li4/a;->W()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Li4/a;->s:Landroid/graphics/PointF;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object v0, Le5/n;->a:Le5/n;

    .line 41
    .line 42
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, p1, v1}, Le5/n;->e(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    move-object v7, p1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    iget-object v0, p0, Li4/a;->b:Lk4/c;

    .line 55
    .line 56
    iget-object v1, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 57
    .line 58
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, p0, Li4/a;->h:Landroid/graphics/RectF;

    .line 63
    .line 64
    iget-object v4, p0, Li4/a;->m:Li4/e;

    .line 65
    .line 66
    iget-object v5, p0, Li4/a;->n:Li4/c;

    .line 67
    .line 68
    invoke-virtual {p0}, Li4/a;->h()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface/range {v0 .. v7}, Lk4/c;->z(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final W()V
    .locals 8

    .line 1
    iget-object v0, p0, Li4/a;->m:Li4/e;

    .line 2
    .line 3
    iget-object v1, p0, Li4/a;->n:Li4/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Li4/c;->c()Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Landroid/graphics/RectF;->setEmpty()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Li4/e;->i()Landroid/graphics/RectF;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Li4/e;->f()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Li4/e;->d()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Li4/e;->e()Landroid/graphics/RectF;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Li4/e;->c()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 45
    .line 46
    .line 47
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    const/high16 v4, 0x41000000    # 8.0f

    .line 50
    .line 51
    sub-float/2addr v3, v4

    .line 52
    iput v3, v2, Landroid/graphics/RectF;->left:F

    .line 53
    .line 54
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    add-float/2addr v3, v4

    .line 57
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 58
    .line 59
    invoke-virtual {v0}, Li4/e;->j()Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_0

    .line 68
    .line 69
    invoke-virtual {v1}, Li4/c;->e()Landroid/graphics/RectF;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroid/graphics/RectF;

    .line 78
    .line 79
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 80
    .line 81
    const/high16 v5, 0x41800000    # 16.0f

    .line 82
    .line 83
    sub-float/2addr v4, v5

    .line 84
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, Landroid/graphics/RectF;

    .line 89
    .line 90
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 91
    .line 92
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Landroid/graphics/RectF;

    .line 97
    .line 98
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 99
    .line 100
    add-float/2addr v7, v5

    .line 101
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Landroid/graphics/RectF;

    .line 106
    .line 107
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 108
    .line 109
    invoke-virtual {v3, v4, v6, v7, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 110
    .line 111
    .line 112
    :cond_0
    invoke-virtual {v1}, Li4/c;->d()Landroid/graphics/RectF;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v0}, Li4/e;->h()Landroid/graphics/RectF;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 121
    .line 122
    invoke-virtual {v0}, Li4/e;->h()Landroid/graphics/RectF;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 127
    .line 128
    invoke-virtual {v0}, Li4/e;->g()Landroid/graphics/RectF;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 133
    .line 134
    invoke-virtual {v0}, Li4/e;->g()Landroid/graphics/RectF;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 139
    .line 140
    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_1

    .line 152
    .line 153
    iget-object v2, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    const/high16 v3, 0x42180000    # 38.0f

    .line 160
    .line 161
    sub-float/2addr v2, v3

    .line 162
    const/4 v3, 0x2

    .line 163
    int-to-float v3, v3

    .line 164
    div-float/2addr v2, v3

    .line 165
    invoke-virtual {v1}, Li4/c;->a()Landroid/graphics/RectF;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Landroid/graphics/RectF;

    .line 178
    .line 179
    iget v4, v4, Landroid/graphics/RectF;->left:F

    .line 180
    .line 181
    const/high16 v5, 0x41b80000    # 23.0f

    .line 182
    .line 183
    sub-float/2addr v4, v5

    .line 184
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    check-cast v6, Landroid/graphics/RectF;

    .line 193
    .line 194
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 195
    .line 196
    sub-float/2addr v6, v2

    .line 197
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v7, Landroid/graphics/RectF;

    .line 206
    .line 207
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 208
    .line 209
    add-float/2addr v7, v5

    .line 210
    invoke-virtual {v0}, Li4/e;->a()Ljava/util/ArrayList;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    check-cast v5, Landroid/graphics/RectF;

    .line 219
    .line 220
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 221
    .line 222
    add-float/2addr v5, v2

    .line 223
    invoke-virtual {v3, v4, v6, v7, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 224
    .line 225
    .line 226
    :cond_1
    invoke-virtual {v1}, Li4/c;->b()Landroid/graphics/RectF;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0}, Li4/e;->b()Landroid/graphics/RectF;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 235
    .line 236
    .line 237
    return-void
.end method

.method public abstract X()V
.end method

.method public final e(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Li4/a;->d:Lj4/a;

    .line 7
    .line 8
    invoke-virtual {v1}, Lj4/a;->b()Landroid/graphics/Matrix;

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
    iget-object p1, p0, Li4/a;->d:Lj4/a;

    .line 19
    .line 20
    invoke-virtual {p1}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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

.method public final f()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lh4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->l:Lh4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract h()Ljava/util/List;
.end method

.method public final i()Landroid/graphics/Matrix;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li4/a;->f:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final j()F
    .locals 1

    .line 1
    iget v0, p0, Li4/a;->o:F

    .line 2
    .line 3
    return v0
.end method

.method public final k()F
    .locals 1

    .line 1
    iget v0, p0, Li4/a;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public final l()Li4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->n:Li4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Li4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->m:Li4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z
    .locals 4

    .line 1
    const-string v0, "functionRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectRectF"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "limitRectF"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "pair"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    iget v1, p2, Landroid/graphics/RectF;->bottom:F

    .line 24
    .line 25
    const/high16 v2, 0x41600000    # 14.0f

    .line 26
    .line 27
    add-float/2addr v1, v2

    .line 28
    iget v3, p3, Landroid/graphics/RectF;->bottom:F

    .line 29
    .line 30
    invoke-virtual {p4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    check-cast p4, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    sub-float/2addr v3, p4

    .line 41
    cmpl-float p4, v1, v3

    .line 42
    .line 43
    if-lez p4, :cond_0

    .line 44
    .line 45
    iget p4, p2, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    iget-object v1, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getSelectButtonHeight()F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    sub-float/2addr p4, v1

    .line 54
    sub-float v1, p4, v2

    .line 55
    .line 56
    :cond_0
    iget p4, p3, Landroid/graphics/RectF;->top:F

    .line 57
    .line 58
    cmpg-float v2, v1, p4

    .line 59
    .line 60
    if-gez v2, :cond_1

    .line 61
    .line 62
    move v1, p4

    .line 63
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    cmpg-float v2, p4, v2

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    if-gez v2, :cond_3

    .line 75
    .line 76
    iget p2, p2, Landroid/graphics/RectF;->right:F

    .line 77
    .line 78
    iget v2, p3, Landroid/graphics/RectF;->right:F

    .line 79
    .line 80
    cmpl-float p2, p2, v2

    .line 81
    .line 82
    if-lez p2, :cond_2

    .line 83
    .line 84
    sub-float v0, v2, p4

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    :cond_2
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 88
    .line 89
    cmpg-float p3, v0, p2

    .line 90
    .line 91
    if-gez p3, :cond_3

    .line 92
    .line 93
    move v0, p2

    .line 94
    :cond_3
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 95
    .line 96
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 97
    .line 98
    iget p2, p1, Landroid/graphics/RectF;->right:F

    .line 99
    .line 100
    add-float/2addr p2, v0

    .line 101
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 102
    .line 103
    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 104
    .line 105
    add-float/2addr p2, v1

    .line 106
    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 107
    .line 108
    return v3
.end method

.method public final o()Lk4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->b:Lk4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Landroid/graphics/RectF;
    .locals 5

    .line 1
    iget-object v0, p0, Li4/a;->b:Lk4/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lk4/c;->r()Landroid/graphics/RectF;

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
    iget-object v2, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lf4/c;->g()Z

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
    iget-object v4, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Lf4/c;->c()I

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
    iget-object v4, p0, Li4/a;->c:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Lf4/c;->b()I

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
    iget-object v0, p0, Li4/a;->d:Lj4/a;

    .line 63
    .line 64
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

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

.method public final q()Lg4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->a:Lg4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lj4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->d:Lj4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract s()Landroid/graphics/RectF;
.end method

.method public final t()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->h:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Landroid/graphics/RectF;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Li4/a;->g:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Li4/a;->i()Landroid/graphics/Matrix;

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

.method public final x()Lkotlin/Pair;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->i:Lkotlin/Pair;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->e:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->s:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object v0
.end method
