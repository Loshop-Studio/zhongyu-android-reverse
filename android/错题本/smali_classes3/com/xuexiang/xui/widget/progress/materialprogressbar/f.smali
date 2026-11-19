.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;


# instance fields
.field public l:Z


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->l:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->l:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;->draw(Landroid/graphics/Canvas;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 6

    .line 1
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    sget-object v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;->k:Landroid/graphics/RectF;

    .line 5
    .line 6
    const/high16 v3, 0x43b40000    # 360.0f

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    move-object v5, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
