.class public Lj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/graphics/Bitmap;

.field public d:F

.field public e:F

.field public f:Landroid/graphics/RectF;

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(IILandroid/graphics/Bitmap;FFLandroid/graphics/RectF;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lj1/a;->a:I

    .line 5
    .line 6
    iput p2, p0, Lj1/a;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lj1/a;->c:Landroid/graphics/Bitmap;

    .line 9
    .line 10
    iput-object p6, p0, Lj1/a;->f:Landroid/graphics/RectF;

    .line 11
    .line 12
    iput-boolean p7, p0, Lj1/a;->g:Z

    .line 13
    .line 14
    iput p8, p0, Lj1/a;->h:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public b()F
    .locals 1

    .line 1
    iget v0, p0, Lj1/a;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public d()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/a;->f:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lj1/a;->c:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lj1/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lj1/a;

    .line 8
    .line 9
    invoke-virtual {p1}, Lj1/a;->c()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v2, p0, Lj1/a;->b:I

    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lj1/a;->f()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v2, p0, Lj1/a;->a:I

    .line 22
    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {p1}, Lj1/a;->g()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v2, p0, Lj1/a;->d:F

    .line 30
    .line 31
    cmpl-float v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Lj1/a;->b()F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v2, p0, Lj1/a;->e:F

    .line 40
    .line 41
    cmpl-float v0, v0, v2

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Lj1/a;->d()Landroid/graphics/RectF;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 50
    .line 51
    iget-object v2, p0, Lj1/a;->f:Landroid/graphics/RectF;

    .line 52
    .line 53
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 54
    .line 55
    cmpl-float v0, v0, v2

    .line 56
    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Lj1/a;->d()Landroid/graphics/RectF;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 64
    .line 65
    iget-object v2, p0, Lj1/a;->f:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 68
    .line 69
    cmpl-float v0, v0, v2

    .line 70
    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    invoke-virtual {p1}, Lj1/a;->d()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 78
    .line 79
    iget-object v2, p0, Lj1/a;->f:Landroid/graphics/RectF;

    .line 80
    .line 81
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 82
    .line 83
    cmpl-float v0, v0, v2

    .line 84
    .line 85
    if-nez v0, :cond_1

    .line 86
    .line 87
    invoke-virtual {p1}, Lj1/a;->d()Landroid/graphics/RectF;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 92
    .line 93
    iget-object v0, p0, Lj1/a;->f:Landroid/graphics/RectF;

    .line 94
    .line 95
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    cmpl-float p1, p1, v0

    .line 98
    .line 99
    if-nez p1, :cond_1

    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    return p1

    .line 103
    :cond_1
    return v1
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lj1/a;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, Lj1/a;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj1/a;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lj1/a;->h:I

    .line 2
    .line 3
    return-void
.end method
