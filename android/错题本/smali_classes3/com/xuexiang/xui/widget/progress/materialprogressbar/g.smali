.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;
.super Landroid/graphics/drawable/LayerDrawable;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;
.implements Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;


# instance fields
.field public final a:F

.field public final b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

.field public final c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

.field public final d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;


# direct methods
.method public constructor <init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    const p1, 0x1010033

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p2, p1, v0}, Lkotlin/collections/u;->H(Landroid/content/Context;IF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->a:F

    .line 13
    .line 14
    const/high16 p1, 0x1020000

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 27
    .line 28
    const p1, 0x102000f

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {p0, v1, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 42
    .line 43
    const p1, 0x102000d

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-virtual {p0, v1, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 57
    .line 58
    sget p1, Lcom/xuexiang/xui/R$attr;->colorControlActivated:I

    .line 59
    .line 60
    filled-new-array {p1}, [I

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p2, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/high16 p2, -0x1000000

    .line 69
    .line 70
    :try_start_0
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 71
    .line 72
    .line 73
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->setTint(I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catchall_0
    move-exception p2

    .line 82
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 83
    .line 84
    .line 85
    throw p2
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 2
    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 5
    .line 6
    invoke-interface {v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eq v1, p1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->b(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 18
    .line 19
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 20
    .line 21
    xor-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->b(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->c(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->c(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->c(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final setTint(I)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->a:F

    .line 7
    .line 8
    mul-float/2addr v0, v1

    .line 9
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 18
    .line 19
    check-cast v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTint(I)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 25
    .line 26
    check-cast v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTint(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 32
    .line 33
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 34
    .line 35
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTint(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->isOpaque()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded"

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    :cond_0
    const/high16 v0, 0x437f0000    # 255.0f

    .line 23
    .line 24
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->a:F

    .line 25
    .line 26
    mul-float/2addr v1, v0

    .line 27
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1, v0}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 38
    .line 39
    check-cast v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 40
    .line 41
    invoke-interface {v1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 45
    .line 46
    check-cast v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 47
    .line 48
    invoke-interface {v1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 52
    .line 53
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->b:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 2
    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 9
    .line 10
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 16
    .line 17
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
