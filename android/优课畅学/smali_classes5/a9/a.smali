.class public La9/a;
.super Lz8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/a$a;
    }
.end annotation


# instance fields
.field public a:Landroid/graphics/Camera;

.field public b:Landroid/graphics/Matrix;

.field public final c:La9/a$a;

.field public d:La9/b;

.field public e:Landroid/graphics/Canvas;

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:F

.field public k:I

.field public l:Z

.field public m:I

.field public n:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lz8/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Camera;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La9/a;->a:Landroid/graphics/Camera;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La9/a;->b:Landroid/graphics/Matrix;

    .line 17
    .line 18
    new-instance v0, La9/a$a;

    .line 19
    .line 20
    invoke-direct {v0}, La9/a$a;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La9/a;->c:La9/a$a;

    .line 24
    .line 25
    new-instance v0, La9/h;

    .line 26
    .line 27
    invoke-direct {v0}, La9/h;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, La9/a;->d:La9/b;

    .line 31
    .line 32
    const/high16 v0, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput v0, p0, La9/a;->h:F

    .line 35
    .line 36
    const/16 v1, 0xa0

    .line 37
    .line 38
    iput v1, p0, La9/a;->i:I

    .line 39
    .line 40
    iput v0, p0, La9/a;->j:F

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput v0, p0, La9/a;->k:I

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, La9/a;->l:Z

    .line 47
    .line 48
    const/16 v0, 0x800

    .line 49
    .line 50
    iput v0, p0, La9/a;->m:I

    .line 51
    .line 52
    iput v0, p0, La9/a;->n:I

    .line 53
    .line 54
    return-void
.end method

.method public static final u(Landroid/graphics/Canvas;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final v(Landroid/graphics/Canvas;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final A(Lz8/c;Landroid/graphics/Canvas;FF)I
    .locals 2

    .line 1
    iget-object v0, p0, La9/a;->a:Landroid/graphics/Camera;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Camera;->save()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La9/a;->a:Landroid/graphics/Camera;

    .line 7
    .line 8
    iget v1, p1, Lz8/c;->h:F

    .line 9
    .line 10
    neg-float v1, v1

    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->rotateY(F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La9/a;->a:Landroid/graphics/Camera;

    .line 15
    .line 16
    iget p1, p1, Lz8/c;->g:F

    .line 17
    .line 18
    neg-float p1, p1

    .line 19
    invoke-virtual {v0, p1}, Landroid/graphics/Camera;->rotateZ(F)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La9/a;->a:Landroid/graphics/Camera;

    .line 23
    .line 24
    iget-object v0, p0, La9/a;->b:Landroid/graphics/Matrix;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La9/a;->b:Landroid/graphics/Matrix;

    .line 30
    .line 31
    neg-float v0, p3

    .line 32
    neg-float v1, p4

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, La9/a;->b:Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La9/a;->a:Landroid/graphics/Camera;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/graphics/Camera;->restore()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget-object p3, p0, La9/a;->b:Landroid/graphics/Matrix;

    .line 51
    .line 52
    invoke-virtual {p2, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 53
    .line 54
    .line 55
    return p1
.end method

.method public final B(Lz8/c;FF)V
    .locals 2

    .line 1
    iget v0, p1, Lz8/c;->m:I

    .line 2
    .line 3
    mul-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    int-to-float v1, v1

    .line 6
    add-float/2addr p2, v1

    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    int-to-float v0, v0

    .line 10
    add-float/2addr p3, v0

    .line 11
    iget v0, p1, Lz8/c;->l:I

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    int-to-float v0, v0

    .line 18
    add-float/2addr p2, v0

    .line 19
    add-float/2addr p3, v0

    .line 20
    :cond_0
    invoke-virtual {p0}, La9/a;->x()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-float/2addr p2, v0

    .line 25
    iput p2, p1, Lz8/c;->o:F

    .line 26
    .line 27
    iput p3, p1, Lz8/c;->p:F

    .line 28
    .line 29
    return-void
.end method

.method public C(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La9/a;->D(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final D(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iput-object p1, p0, La9/a;->e:Landroid/graphics/Canvas;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, La9/a;->f:I

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, La9/a;->g:I

    .line 16
    .line 17
    iget-boolean v0, p0, La9/a;->l:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La9/a;->v(Landroid/graphics/Canvas;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, La9/a;->m:I

    .line 26
    .line 27
    invoke-static {p1}, La9/a;->u(Landroid/graphics/Canvas;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, La9/a;->n:I

    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public a(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La9/a;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const v1, 0x442a8000    # 682.0f

    .line 7
    .line 8
    .line 9
    div-float/2addr v0, v1

    .line 10
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/high16 v1, 0x41c80000    # 25.0f

    .line 15
    .line 16
    mul-float/2addr v0, v1

    .line 17
    float-to-int v1, v0

    .line 18
    iput v1, p0, La9/a;->k:I

    .line 19
    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float v1, p1, v1

    .line 23
    .line 24
    if-lez v1, :cond_0

    .line 25
    .line 26
    mul-float/2addr v0, p1

    .line 27
    float-to-int p1, v0

    .line 28
    iput p1, p0, La9/a;->k:I

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public b(Lz8/c;Z)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, La9/a;->w(Lz8/c;Z)Landroid/text/TextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La9/a;->c:La9/a$a;

    .line 6
    .line 7
    invoke-static {v1}, La9/a$a;->b(La9/a$a;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, La9/a;->c:La9/a$a;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {v1, p1, v0, v2}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1, v0, p2}, La9/a;->r(Lz8/c;Landroid/text/TextPaint;Z)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, La9/a;->c:La9/a$a;

    .line 23
    .line 24
    invoke-static {p2}, La9/a$a;->b(La9/a$a;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, La9/a;->c:La9/a$a;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p2, p1, v0, v1}, La9/a$a;->c(Lz8/c;Landroid/graphics/Paint;Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, La9/a;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public d(FIF)V
    .locals 0

    .line 1
    iput p1, p0, La9/a;->h:F

    .line 2
    .line 3
    iput p2, p0, La9/a;->i:I

    .line 4
    .line 5
    iput p3, p0, La9/a;->j:F

    .line 6
    .line 7
    return-void
.end method

.method public e(Lz8/c;)I
    .locals 9

    .line 1
    invoke-virtual {p1}, Lz8/c;->l()F

    .line 2
    .line 3
    .line 4
    move-result v4

    .line 5
    invoke-virtual {p1}, Lz8/c;->g()F

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    iget-object v0, p0, La9/a;->e:Landroid/graphics/Canvas;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_9

    .line 13
    .line 14
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x7

    .line 19
    const/4 v7, 0x1

    .line 20
    const/4 v5, 0x0

    .line 21
    if-ne v0, v2, :cond_4

    .line 22
    .line 23
    invoke-virtual {p1}, Lz8/c;->c()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sget v2, Lz8/b;->b:I

    .line 28
    .line 29
    if-ne v0, v2, :cond_0

    .line 30
    .line 31
    return v1

    .line 32
    :cond_0
    iget v0, p1, Lz8/c;->g:F

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    cmpl-float v0, v0, v2

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    iget v0, p1, Lz8/c;->h:F

    .line 40
    .line 41
    cmpl-float v0, v0, v2

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v0, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_0
    iget-object v0, p0, La9/a;->e:Landroid/graphics/Canvas;

    .line 49
    .line 50
    invoke-virtual {p0, p1, v0, v3, v4}, La9/a;->A(Lz8/c;Landroid/graphics/Canvas;FF)I

    .line 51
    .line 52
    .line 53
    move v0, v7

    .line 54
    :goto_1
    invoke-virtual {p1}, Lz8/c;->c()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    sget v6, Lz8/b;->a:I

    .line 59
    .line 60
    if-eq v2, v6, :cond_3

    .line 61
    .line 62
    iget-object v2, p0, La9/a;->c:La9/a$a;

    .line 63
    .line 64
    invoke-static {v2}, La9/a$a;->a(La9/a$a;)Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {p1}, Lz8/c;->c()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 73
    .line 74
    .line 75
    :cond_3
    move v8, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move v8, v1

    .line 78
    :goto_2
    if-eqz v5, :cond_5

    .line 79
    .line 80
    invoke-virtual {v5}, Landroid/graphics/Paint;->getAlpha()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sget v2, Lz8/b;->b:I

    .line 85
    .line 86
    if-ne v0, v2, :cond_5

    .line 87
    .line 88
    return v1

    .line 89
    :cond_5
    iget-object v0, p0, La9/a;->d:La9/b;

    .line 90
    .line 91
    iget-object v2, p0, La9/a;->e:Landroid/graphics/Canvas;

    .line 92
    .line 93
    iget-object v1, p0, La9/a;->c:La9/a$a;

    .line 94
    .line 95
    iget-object v6, v1, La9/a$a;->c:Landroid/text/TextPaint;

    .line 96
    .line 97
    move-object v1, p1

    .line 98
    invoke-virtual/range {v0 .. v6}, La9/b;->a(Lz8/c;Landroid/graphics/Canvas;FFLandroid/graphics/Paint;Landroid/text/TextPaint;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_7

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    iget-object p1, p0, La9/a;->c:La9/a$a;

    .line 107
    .line 108
    iget-object p1, p1, La9/a$a;->c:Landroid/text/TextPaint;

    .line 109
    .line 110
    invoke-virtual {v5}, Landroid/graphics/Paint;->getAlpha()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    iget-object p1, p0, La9/a;->c:La9/a$a;

    .line 119
    .line 120
    iget-object p1, p1, La9/a$a;->c:Landroid/text/TextPaint;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, La9/a;->y(Landroid/graphics/Paint;)V

    .line 123
    .line 124
    .line 125
    :goto_3
    iget-object v2, p0, La9/a;->e:Landroid/graphics/Canvas;

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    move-object v0, p0

    .line 129
    invoke-virtual/range {v0 .. v5}, La9/a;->s(Lz8/c;Landroid/graphics/Canvas;FFZ)V

    .line 130
    .line 131
    .line 132
    const/4 v7, 0x2

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    move-object v0, p0

    .line 135
    :goto_4
    if-eqz v8, :cond_8

    .line 136
    .line 137
    iget-object p1, v0, La9/a;->e:Landroid/graphics/Canvas;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, La9/a;->z(Landroid/graphics/Canvas;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    return v7

    .line 143
    :cond_9
    move-object v0, p0

    .line 144
    return v1
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, La9/a;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, La9/a;->j:F

    .line 2
    .line 3
    return v0
.end method

.method public getDensity()F
    .locals 1

    .line 1
    iget v0, p0, La9/a;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, La9/a;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, La9/a;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, La9/a;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public i(II)V
    .locals 0

    .line 1
    iput p1, p0, La9/a;->f:I

    .line 2
    .line 3
    iput p2, p0, La9/a;->g:I

    .line 4
    .line 5
    return-void
.end method

.method public isHardwareAccelerated()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, La9/a;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public j(Lz8/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/a;->d:La9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La9/b;->e(Lz8/c;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, La9/a;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public l(Lz8/c;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/a;->d:La9/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, La9/b;->d(Lz8/c;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public m(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La9/a;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic n(Lz8/c;Ljava/lang/Object;FFZ)V
    .locals 0

    .line 1
    check-cast p2, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, La9/a;->s(Lz8/c;Landroid/graphics/Canvas;FFZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o()La9/b;
    .locals 1

    .line 1
    iget-object v0, p0, La9/a;->d:La9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic p()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La9/a;->t()Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic q(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La9/a;->C(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r(Lz8/c;Landroid/text/TextPaint;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/a;->d:La9/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, La9/b;->c(Lz8/c;Landroid/text/TextPaint;Z)V

    .line 4
    .line 5
    .line 6
    iget p2, p1, Lz8/c;->o:F

    .line 7
    .line 8
    iget p3, p1, Lz8/c;->p:F

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2, p3}, La9/a;->B(Lz8/c;FF)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public declared-synchronized s(Lz8/c;Landroid/graphics/Canvas;FFZ)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La9/a;->d:La9/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v6, p0, La9/a;->c:La9/a$a;

    .line 7
    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    move v5, p5

    .line 13
    invoke-virtual/range {v0 .. v6}, La9/b;->b(Lz8/c;Landroid/graphics/Canvas;FFZLa9/a$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    move-object p1, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public t()Landroid/graphics/Canvas;
    .locals 1

    .line 1
    iget-object v0, p0, La9/a;->e:Landroid/graphics/Canvas;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized w(Lz8/c;Z)Landroid/text/TextPaint;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La9/a;->c:La9/a$a;

    .line 3
    .line 4
    invoke-virtual {v0, p1, p2}, La9/a$a;->g(Lz8/c;Z)Landroid/text/TextPaint;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public x()F
    .locals 1

    .line 1
    iget-object v0, p0, La9/a;->c:La9/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, La9/a$a;->h()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final y(Landroid/graphics/Paint;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lz8/b;->a:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final z(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
