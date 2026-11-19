.class public Lb/c/a/e/h/a/w;
.super Lb/c/a/e/h/a/g;
.source ""

# interfaces
.implements Lb/c/a/e/h/a/u;


# instance fields
.field public n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/c/a/e/h/a/g;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/w;->n:Z

    return v0
.end method

.method public b(Z)V
    .locals 1

    iget-boolean v0, p0, Lb/c/a/e/h/a/w;->n:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lb/c/a/e/h/a/w;->n:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public h(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 6

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    int-to-float v0, v0

    const v2, 0x461c4000    # 10000.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb/c/a/e/h/a/g;->l:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    const/4 v5, 0x0

    invoke-virtual {p1, v0, v2, v4, v5}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 1
    invoke-virtual {p1, v3, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 2
    iget-boolean v0, p0, Lb/c/a/e/h/a/w;->n:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1, v3, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 4
    :cond_1
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method public onLevelChange(I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    const/4 p1, 0x1

    return p1
.end method
