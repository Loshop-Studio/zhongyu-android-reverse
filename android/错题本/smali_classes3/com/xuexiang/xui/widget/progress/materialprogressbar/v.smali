.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;


# instance fields
.field public final l:F

.field public m:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    const/high16 p1, 0x43b40000    # 360.0f

    .line 10
    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->l:F

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Invalid value for style"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->l:F

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->m:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    int-to-float v0, v0

    .line 9
    const v1, 0x461c4000    # 10000.0f

    .line 10
    .line 11
    .line 12
    div-float/2addr v0, v1

    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->l:F

    .line 14
    .line 15
    mul-float/2addr v1, v0

    .line 16
    const/high16 v2, 0x43b40000    # 360.0f

    .line 17
    .line 18
    mul-float v6, v0, v2

    .line 19
    .line 20
    const/high16 v0, -0x3d4c0000    # -90.0f

    .line 21
    .line 22
    add-float v5, v1, v0

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    sget-object v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/e;->k:Landroid/graphics/RectF;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    move-object v8, p2

    .line 29
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 30
    .line 31
    .line 32
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->m:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
.end method

.method public final onLevelChange(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method
