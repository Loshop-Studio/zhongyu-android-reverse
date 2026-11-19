.class public Lb/c/a/e/f/a/b;
.super Lb/c/a/e/f/a/f;
.source ""


# direct methods
.method public constructor <init>(Lb/c/a/e/f/a/c;Lb/c/a/e/f/a/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/c/a/e/f/a/f;-><init>(Lb/c/a/e/f/a/c;Lb/c/a/e/f/a/c;)V

    return-void
.end method


# virtual methods
.method public a(FFFLandroid/graphics/Rect;F)V
    .locals 8

    .line 1
    iget-object v0, p0, Lb/c/a/e/f/a/f;->b:Lb/c/a/e/f/a/c;

    sget-object v1, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    if-ne v0, v1, :cond_0

    move v1, p1

    goto :goto_0

    .line 2
    :cond_0
    iget v1, v1, Lb/c/a/e/f/a/c;->b:F

    .line 3
    :goto_0
    iget-object v2, p0, Lb/c/a/e/f/a/f;->a:Lb/c/a/e/f/a/c;

    sget-object v3, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    if-ne v2, v3, :cond_1

    move v3, p2

    goto :goto_1

    .line 4
    :cond_1
    iget v3, v3, Lb/c/a/e/f/a/c;->b:F

    .line 5
    :goto_1
    sget-object v4, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    if-ne v0, v4, :cond_2

    move v4, p1

    goto :goto_2

    .line 6
    :cond_2
    iget v4, v4, Lb/c/a/e/f/a/c;->b:F

    .line 7
    :goto_2
    sget-object v5, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    if-ne v2, v5, :cond_3

    move v5, p2

    goto :goto_3

    .line 8
    :cond_3
    iget v5, v5, Lb/c/a/e/f/a/c;->b:F

    :goto_3
    sub-float/2addr v4, v1

    sub-float/2addr v5, v3

    div-float/2addr v4, v5

    cmpl-float v1, v4, p3

    if-lez v1, :cond_4

    .line 9
    iget-object v1, p0, Lb/c/a/e/f/a/f;->c:Lb/c/a/e/f/a/d;

    iput-object v0, v1, Lb/c/a/e/f/a/d;->a:Lb/c/a/e/f/a/c;

    iput-object v2, v1, Lb/c/a/e/f/a/d;->b:Lb/c/a/e/f/a/c;

    goto :goto_4

    :cond_4
    iget-object v1, p0, Lb/c/a/e/f/a/f;->c:Lb/c/a/e/f/a/d;

    iput-object v2, v1, Lb/c/a/e/f/a/d;->a:Lb/c/a/e/f/a/c;

    iput-object v0, v1, Lb/c/a/e/f/a/d;->b:Lb/c/a/e/f/a/c;

    :goto_4
    iget-object v0, p0, Lb/c/a/e/f/a/f;->c:Lb/c/a/e/f/a/d;

    .line 10
    iget-object v7, v0, Lb/c/a/e/f/a/d;->a:Lb/c/a/e/f/a/c;

    iget-object v0, v0, Lb/c/a/e/f/a/d;->b:Lb/c/a/e/f/a/c;

    move-object v1, v7

    move v2, p1

    move v3, p2

    move-object v4, p4

    move v5, p5

    move v6, p3

    invoke-virtual/range {v1 .. v6}, Lb/c/a/e/f/a/c;->b(FFLandroid/graphics/Rect;FF)V

    invoke-virtual {v0, p3}, Lb/c/a/e/f/a/c;->a(F)V

    invoke-virtual {v0, p4, p5}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0, p4}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    invoke-virtual {v7, p3}, Lb/c/a/e/f/a/c;->a(F)V

    :cond_5
    return-void
.end method
