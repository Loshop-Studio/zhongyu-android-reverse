.class public Ly8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static r:I = -0x1

.field public static s:I = 0x0

.field public static t:I = 0x1


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/graphics/PointF;

.field public d:Landroid/graphics/PointF;

.field public e:Landroid/graphics/PointF;

.field public f:I

.field public g:I

.field public h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:Z

.field public n:I

.field public o:I

.field public p:Z

.field public q:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ly8/e;->a:I

    .line 6
    .line 7
    iput v0, p0, Ly8/e;->b:I

    .line 8
    .line 9
    new-instance v0, Landroid/graphics/PointF;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ly8/e;->c:Landroid/graphics/PointF;

    .line 15
    .line 16
    new-instance v0, Landroid/graphics/PointF;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ly8/e;->d:Landroid/graphics/PointF;

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/PointF;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ly8/e;->e:Landroid/graphics/PointF;

    .line 29
    .line 30
    const/4 v0, -0x1

    .line 31
    iput v0, p0, Ly8/e;->n:I

    .line 32
    .line 33
    sget v0, Ly8/e;->r:I

    .line 34
    .line 35
    iput v0, p0, Ly8/e;->q:I

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1
    iget v0, p0, Ly8/e;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly8/e;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Z
    .locals 2

    .line 1
    iget v0, p0, Ly8/e;->f:I

    .line 2
    .line 3
    iget v1, p0, Ly8/e;->b:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget v0, p0, Ly8/e;->f:I

    .line 2
    .line 3
    iget v1, p0, Ly8/e;->a:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public e(FF)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ly8/e;->m:Z

    .line 3
    .line 4
    iget v0, p0, Ly8/e;->f:I

    .line 5
    .line 6
    iput v0, p0, Ly8/e;->h:I

    .line 7
    .line 8
    iget-object v0, p0, Ly8/e;->c:Landroid/graphics/PointF;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ly8/e;->d:Landroid/graphics/PointF;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput p1, p0, Ly8/e;->n:I

    .line 20
    .line 21
    return-void
.end method

.method public f(FF)V
    .locals 7

    .line 1
    iget-object v0, p0, Ly8/e;->c:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float v1, p1, v1

    .line 6
    .line 7
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 8
    .line 9
    sub-float v0, p2, v0

    .line 10
    .line 11
    iget-boolean v2, p0, Ly8/e;->p:Z

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget v5, p0, Ly8/e;->o:I

    .line 22
    .line 23
    int-to-float v6, v5

    .line 24
    cmpl-float v2, v2, v6

    .line 25
    .line 26
    if-lez v2, :cond_1

    .line 27
    .line 28
    iput-boolean v4, p0, Ly8/e;->p:Z

    .line 29
    .line 30
    cmpg-float v2, v0, v3

    .line 31
    .line 32
    if-gez v2, :cond_0

    .line 33
    .line 34
    int-to-float v2, v5

    .line 35
    add-float/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    int-to-float v2, v5

    .line 38
    sub-float/2addr v0, v2

    .line 39
    :goto_0
    sget v2, Ly8/e;->s:I

    .line 40
    .line 41
    iput v2, p0, Ly8/e;->q:I

    .line 42
    .line 43
    :cond_1
    iget-boolean v2, p0, Ly8/e;->p:Z

    .line 44
    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget v5, p0, Ly8/e;->o:I

    .line 52
    .line 53
    int-to-float v6, v5

    .line 54
    cmpl-float v2, v2, v6

    .line 55
    .line 56
    if-lez v2, :cond_3

    .line 57
    .line 58
    iput-boolean v4, p0, Ly8/e;->p:Z

    .line 59
    .line 60
    cmpg-float v2, v1, v3

    .line 61
    .line 62
    if-gez v2, :cond_2

    .line 63
    .line 64
    int-to-float v2, v5

    .line 65
    add-float/2addr v1, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    int-to-float v2, v5

    .line 68
    sub-float/2addr v1, v2

    .line 69
    :goto_1
    sget v2, Ly8/e;->t:I

    .line 70
    .line 71
    iput v2, p0, Ly8/e;->q:I

    .line 72
    .line 73
    :cond_3
    iget-boolean v2, p0, Ly8/e;->p:Z

    .line 74
    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0, v1, v0}, Ly8/e;->i(FF)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1, p2}, Ly8/e;->h(FF)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Ly8/e;->c:Landroid/graphics/PointF;

    .line 84
    .line 85
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 86
    .line 87
    .line 88
    const/4 p1, 0x2

    .line 89
    iput p1, p0, Ly8/e;->n:I

    .line 90
    .line 91
    :cond_4
    return-void
.end method

.method public g(FF)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ly8/e;->m:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Ly8/e;->p:Z

    .line 5
    .line 6
    iget-object v0, p0, Ly8/e;->e:Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput p1, p0, Ly8/e;->n:I

    .line 13
    .line 14
    sget p1, Ly8/e;->r:I

    .line 15
    .line 16
    iput p1, p0, Ly8/e;->q:I

    .line 17
    .line 18
    return-void
.end method

.method public final h(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/e;->d:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float/2addr p1, v1

    .line 6
    iput p1, p0, Ly8/e;->k:F

    .line 7
    .line 8
    iget p1, v0, Landroid/graphics/PointF;->y:F

    .line 9
    .line 10
    sub-float/2addr p2, p1

    .line 11
    iput p2, p0, Ly8/e;->l:F

    .line 12
    .line 13
    return-void
.end method

.method public final i(FF)V
    .locals 0

    .line 1
    iput p1, p0, Ly8/e;->i:F

    .line 2
    .line 3
    iput p2, p0, Ly8/e;->j:F

    .line 4
    .line 5
    return-void
.end method

.method public j(I)V
    .locals 0

    .line 1
    iput p1, p0, Ly8/e;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "mCurrentPos: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Ly8/e;->f:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", mLastPos: "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Ly8/e;->g:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", mPressedPos: "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Ly8/e;->h:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", isInStartPos: "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ly8/e;->d()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", isInEndPos: "

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ly8/e;->c()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method
