.class public Lb/c/a/e/f/a/a;
.super Lb/c/a/e/f/a/f;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lb/c/a/e/f/a/f;-><init>(Lb/c/a/e/f/a/c;Lb/c/a/e/f/a/c;)V

    return-void
.end method


# virtual methods
.method public a(FFFLandroid/graphics/Rect;F)V
    .locals 0

    invoke-virtual {p0, p1, p2, p4, p5}, Lb/c/a/e/f/a/a;->b(FFLandroid/graphics/Rect;F)V

    return-void
.end method

.method public b(FFLandroid/graphics/Rect;F)V
    .locals 8

    sget-object v0, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 1
    iget v1, v0, Lb/c/a/e/f/a/c;->b:F

    .line 2
    sget-object v2, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 3
    iget v3, v2, Lb/c/a/e/f/a/c;->b:F

    .line 4
    sget-object v4, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 5
    iget v5, v4, Lb/c/a/e/f/a/c;->b:F

    .line 6
    sget-object v6, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 7
    iget v7, v6, Lb/c/a/e/f/a/c;->b:F

    add-float/2addr v1, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v1, v5

    add-float/2addr v3, v7

    div-float/2addr v3, v5

    sub-float/2addr p1, v1

    sub-float/2addr p2, v3

    .line 8
    invoke-virtual {v0, p1}, Lb/c/a/e/f/a/c;->f(F)V

    invoke-virtual {v2, p2}, Lb/c/a/e/f/a/c;->f(F)V

    invoke-virtual {v4, p1}, Lb/c/a/e/f/a/c;->f(F)V

    invoke-virtual {v6, p2}, Lb/c/a/e/f/a/c;->f(F)V

    invoke-virtual {v0, p3, p4}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p3}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    move-result p1

    invoke-virtual {v4, p1}, Lb/c/a/e/f/a/c;->f(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p3, p4}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v4, p3}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    move-result p1

    invoke-virtual {v0, p1}, Lb/c/a/e/f/a/c;->f(F)V

    :cond_1
    :goto_0
    invoke-virtual {v2, p3, p4}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v2, p3}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    move-result p1

    invoke-virtual {v6, p1}, Lb/c/a/e/f/a/c;->f(F)V

    goto :goto_1

    :cond_2
    invoke-virtual {v6, p3, p4}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v6, p3}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    move-result p1

    invoke-virtual {v2, p1}, Lb/c/a/e/f/a/c;->f(F)V

    :cond_3
    :goto_1
    return-void
.end method
