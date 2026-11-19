.class public Lb/c/a/e/f/a/g;
.super Lb/c/a/e/f/a/f;
.source ""


# instance fields
.field public d:Lb/c/a/e/f/a/c;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/a/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lb/c/a/e/f/a/f;-><init>(Lb/c/a/e/f/a/c;Lb/c/a/e/f/a/c;)V

    iput-object p1, p0, Lb/c/a/e/f/a/g;->d:Lb/c/a/e/f/a/c;

    return-void
.end method


# virtual methods
.method public a(FFFLandroid/graphics/Rect;F)V
    .locals 6

    iget-object v0, p0, Lb/c/a/e/f/a/g;->d:Lb/c/a/e/f/a/c;

    move v1, p1

    move v2, p2

    move-object v3, p4

    move v4, p5

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lb/c/a/e/f/a/c;->b(FFLandroid/graphics/Rect;FF)V

    sget-object p1, Lb/c/a/e/f/a/c;->c:Lb/c/a/e/f/a/c;

    .line 1
    iget p2, p1, Lb/c/a/e/f/a/c;->b:F

    .line 2
    sget-object v0, Lb/c/a/e/f/a/c;->d:Lb/c/a/e/f/a/c;

    .line 3
    iget v0, v0, Lb/c/a/e/f/a/c;->b:F

    .line 4
    sget-object v1, Lb/c/a/e/f/a/c;->e:Lb/c/a/e/f/a/c;

    .line 5
    iget v2, v1, Lb/c/a/e/f/a/c;->b:F

    .line 6
    sget-object v3, Lb/c/a/e/f/a/c;->f:Lb/c/a/e/f/a/c;

    .line 7
    iget v3, v3, Lb/c/a/e/f/a/c;->b:F

    sub-float/2addr v3, v0

    mul-float/2addr v3, p3

    sub-float v0, v2, p2

    sub-float/2addr v3, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v3, v0

    sub-float/2addr p2, v3

    add-float/2addr v2, v3

    .line 8
    iput p2, p1, Lb/c/a/e/f/a/c;->b:F

    iput v2, v1, Lb/c/a/e/f/a/c;->b:F

    .line 9
    invoke-virtual {p1, p4, p5}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lb/c/a/e/f/a/g;->d:Lb/c/a/e/f/a/c;

    invoke-virtual {p2, p1, p4, p3}, Lb/c/a/e/f/a/c;->c(Lb/c/a/e/f/a/c;Landroid/graphics/Rect;F)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1, p4}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    move-result p2

    neg-float p2, p2

    invoke-virtual {v1, p2}, Lb/c/a/e/f/a/c;->f(F)V

    iget-object p2, p0, Lb/c/a/e/f/a/g;->d:Lb/c/a/e/f/a/c;

    invoke-virtual {p2, p3}, Lb/c/a/e/f/a/c;->a(F)V

    :cond_0
    invoke-virtual {v1, p4, p5}, Lb/c/a/e/f/a/c;->e(Landroid/graphics/Rect;F)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lb/c/a/e/f/a/g;->d:Lb/c/a/e/f/a/c;

    invoke-virtual {p2, v1, p4, p3}, Lb/c/a/e/f/a/c;->c(Lb/c/a/e/f/a/c;Landroid/graphics/Rect;F)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v1, p4}, Lb/c/a/e/f/a/c;->g(Landroid/graphics/Rect;)F

    move-result p2

    neg-float p2, p2

    invoke-virtual {p1, p2}, Lb/c/a/e/f/a/c;->f(F)V

    iget-object p1, p0, Lb/c/a/e/f/a/g;->d:Lb/c/a/e/f/a/c;

    invoke-virtual {p1, p3}, Lb/c/a/e/f/a/c;->a(F)V

    :cond_1
    return-void
.end method
