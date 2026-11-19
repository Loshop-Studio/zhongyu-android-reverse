.class public final Lb3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/PointF;

.field public final b:Landroid/graphics/PointF;

.field public final c:Landroid/graphics/PointF;

.field public d:F

.field public e:I

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/PointF;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb3/e;->a:Landroid/graphics/PointF;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/PointF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lb3/e;->b:Landroid/graphics/PointF;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lb3/e;->c:Landroid/graphics/PointF;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 6

    .line 1
    iget-object v0, p0, Lb3/e;->a:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float v1, p1, v1

    .line 6
    .line 7
    iget v2, v0, Landroid/graphics/PointF;->y:F

    .line 8
    .line 9
    sub-float v2, p2, v2

    .line 10
    .line 11
    iget-boolean v3, p0, Lb3/e;->f:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    iget v5, p0, Lb3/e;->e:I

    .line 21
    .line 22
    int-to-float v5, v5

    .line 23
    cmpl-float v3, v3, v5

    .line 24
    .line 25
    if-lez v3, :cond_1

    .line 26
    .line 27
    iput-boolean v4, p0, Lb3/e;->f:Z

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    cmpg-float v3, v2, v3

    .line 31
    .line 32
    if-gez v3, :cond_0

    .line 33
    .line 34
    add-float/2addr v2, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sub-float/2addr v2, v5

    .line 37
    :cond_1
    :goto_0
    iget-boolean v3, p0, Lb3/e;->f:Z

    .line 38
    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget v3, p0, Lb3/e;->e:I

    .line 46
    .line 47
    int-to-float v3, v3

    .line 48
    cmpl-float v1, v1, v3

    .line 49
    .line 50
    if-lez v1, :cond_2

    .line 51
    .line 52
    iput-boolean v4, p0, Lb3/e;->f:Z

    .line 53
    .line 54
    :cond_2
    iget-boolean v1, p0, Lb3/e;->f:Z

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iput v2, p0, Lb3/e;->d:F

    .line 59
    .line 60
    iget-object v1, p0, Lb3/e;->b:Landroid/graphics/PointF;

    .line 61
    .line 62
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 63
    .line 64
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "mCurrentPos: 0, mLastPos: 0, mPressedPos: 0, isInStartPos: true, isInEndPos: true"

    .line 2
    .line 3
    return-object v0
.end method
