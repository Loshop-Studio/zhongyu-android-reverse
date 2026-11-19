.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;
.super Landroid/widget/ProgressBar;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "MaterialProgressBar"


# instance fields
.field public a:Z

.field public b:I

.field public c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a:Z

    .line 6
    .line 7
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$a;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p2, p1, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->i(Landroid/util/AttributeSet;II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 9
    .line 10
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    return-void

    .line 20
    :cond_2
    :goto_1
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 24
    .line 25
    iget-object v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    .line 26
    .line 27
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    .line 28
    .line 29
    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    .line 30
    .line 31
    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    .line 32
    .line 33
    move-object v0, p0

    .line 34
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :cond_1
    const v0, 0x102000d

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h(IZ)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 29
    .line 30
    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    .line 31
    .line 32
    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    .line 33
    .line 34
    iget-object v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    .line 35
    .line 36
    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    .line 37
    .line 38
    move-object v2, p0

    .line 39
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :cond_1
    const/high16 v0, 0x1020000

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h(IZ)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 28
    .line 29
    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    .line 32
    .line 33
    iget-object v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    .line 34
    .line 35
    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    .line 36
    .line 37
    move-object v2, p0

    .line 38
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    :cond_1
    const v0, 0x102000f

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h(IZ)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 29
    .line 30
    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    .line 31
    .line 32
    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    .line 33
    .line 34
    iget-object v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    .line 35
    .line 36
    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    .line 37
    .line 38
    move-object v2, p0

    .line 39
    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    return-void
.end method

.method public final f(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    if-eqz p5, :cond_5

    .line 4
    .line 5
    :cond_0
    if-eqz p3, :cond_2

    .line 6
    .line 7
    instance-of p3, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/y;

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p3, p1

    .line 12
    check-cast p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/y;

    .line 13
    .line 14
    invoke-interface {p3, p2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/y;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->j()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    if-eqz p5, :cond_4

    .line 25
    .line 26
    instance-of p2, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/y;

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    move-object p2, p1

    .line 31
    check-cast p2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/y;

    .line 32
    .line 33
    invoke-interface {p2, p4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/y;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->j()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p4}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 41
    .line 42
    .line 43
    :cond_4
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_5

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 54
    .line 55
    .line 56
    :cond_5
    return-void
.end method

.method public final g()V
    .locals 0

    .line 1
    return-void
.end method

.method public getCurrentDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getIndeterminateTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportIndeterminateTintList()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getProgressBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getProgressStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressTintList()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getSecondaryProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportSecondaryProgressTintList()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public getShowProgressBackground()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public getSupportIndeterminateTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportSecondaryProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getUseIntrinsicPadding()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "Drawable does not implement IntrinsicPaddingDrawable"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public final h(IZ)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    instance-of v2, v0, Landroid/graphics/drawable/LayerDrawable;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Landroid/graphics/drawable/LayerDrawable;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    if-nez v1, :cond_2

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    return-object v1
.end method

.method public final i(Landroid/util/AttributeSet;II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar:[I

    .line 6
    .line 7
    invoke-static {v0, p1, v1, p2, p3}, Landroidx/appcompat/widget/TintTypedArray;->obtainStyledAttributes(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/TintTypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressStyle:I

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 19
    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_setBothDrawables:I

    .line 21
    .line 22
    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/TintTypedArray;->getBoolean(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    sget v1, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_useIntrinsicPadding:I

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-virtual {p1, v1, v2}, Landroidx/appcompat/widget/TintTypedArray;->getBoolean(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    sget v3, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_showProgressBackground:I

    .line 34
    .line 35
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 36
    .line 37
    if-ne v4, v2, :cond_0

    .line 38
    .line 39
    move v4, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v4, p3

    .line 42
    :goto_0
    invoke-virtual {p1, v3, v4}, Landroidx/appcompat/widget/TintTypedArray;->getBoolean(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_determinateCircularProgressStyle:I

    .line 47
    .line 48
    invoke-virtual {p1, v4, p3}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressTint:I

    .line 53
    .line 54
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 61
    .line 62
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 69
    .line 70
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    .line 71
    .line 72
    :cond_1
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressTintMode:I

    .line 73
    .line 74
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, -0x1

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 83
    .line 84
    invoke-virtual {p1, v4, v7}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {v4, v6}, Lx3/a;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    .line 93
    .line 94
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 95
    .line 96
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    .line 97
    .line 98
    :cond_2
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_secondaryProgressTint:I

    .line 99
    .line 100
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 107
    .line 108
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    .line 113
    .line 114
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 115
    .line 116
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    .line 117
    .line 118
    :cond_3
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_secondaryProgressTintMode:I

    .line 119
    .line 120
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_4

    .line 125
    .line 126
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 127
    .line 128
    invoke-virtual {p1, v4, v7}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-static {v4, v6}, Lx3/a;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    .line 137
    .line 138
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 139
    .line 140
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    .line 141
    .line 142
    :cond_4
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressBackgroundTint:I

    .line 143
    .line 144
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 151
    .line 152
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    .line 157
    .line 158
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 159
    .line 160
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    .line 161
    .line 162
    :cond_5
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressBackgroundTintMode:I

    .line 163
    .line 164
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_6

    .line 169
    .line 170
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 171
    .line 172
    invoke-virtual {p1, v4, v7}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v4, v6}, Lx3/a;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    .line 181
    .line 182
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 183
    .line 184
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    .line 185
    .line 186
    :cond_6
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_indeterminateTint:I

    .line 187
    .line 188
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_7

    .line 193
    .line 194
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 195
    .line 196
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    .line 201
    .line 202
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 203
    .line 204
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    .line 205
    .line 206
    :cond_7
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_indeterminateTintMode:I

    .line 207
    .line 208
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_8

    .line 213
    .line 214
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 215
    .line 216
    invoke-virtual {p1, v4, v7}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    invoke-static {v4, v6}, Lx3/a;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    iput-object v4, v5, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    .line 225
    .line 226
    iget-object v4, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 227
    .line 228
    iput-boolean v2, v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    .line 229
    .line 230
    :cond_8
    invoke-virtual {p1}, Landroidx/appcompat/widget/TintTypedArray;->recycle()V

    .line 231
    .line 232
    .line 233
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 234
    .line 235
    if-eqz p1, :cond_d

    .line 236
    .line 237
    if-ne p1, v2, :cond_c

    .line 238
    .line 239
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-nez p1, :cond_9

    .line 244
    .line 245
    if-eqz p2, :cond_a

    .line 246
    .line 247
    :cond_9
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;

    .line 248
    .line 249
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;-><init>(Landroid/content/Context;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 253
    .line 254
    .line 255
    :cond_a
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-eqz p1, :cond_b

    .line 260
    .line 261
    if-eqz p2, :cond_11

    .line 262
    .line 263
    :cond_b
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;

    .line 264
    .line 265
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;-><init>(Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 269
    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 273
    .line 274
    new-instance p2, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const-string p3, "Unknown progress style: "

    .line 280
    .line 281
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 285
    .line 286
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :cond_d
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    if-nez p1, :cond_e

    .line 302
    .line 303
    if-eqz p2, :cond_f

    .line 304
    .line 305
    :cond_e
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;

    .line 306
    .line 307
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;-><init>(Landroid/content/Context;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 311
    .line 312
    .line 313
    :cond_f
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-eqz p1, :cond_10

    .line 318
    .line 319
    if-eqz p2, :cond_11

    .line 320
    .line 321
    :cond_10
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;

    .line 322
    .line 323
    invoke-direct {p1, p3, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;-><init>(ILandroid/content/Context;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 327
    .line 328
    .line 329
    :cond_11
    :goto_1
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setUseIntrinsicPadding(Z)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setShowProgressBackground(Z)V

    .line 333
    .line 334
    .line 335
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "Drawable did not implement TintableDrawable, it won\'t be tinted below Lollipop"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    .line 10
    .line 11
    const/16 v1, 0x15

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar"

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public declared-synchronized setIndeterminate(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of p1, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables"

    .line 20
    .line 21
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1
.end method

.method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setIndeterminateTintList(Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setIndeterminateTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setSecondaryProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportSecondaryProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setSecondaryProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportSecondaryProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setShowProgressBackground(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->b(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;->b(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportIndeterminateTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportSecondaryProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 1
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setSupportSecondaryProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setUseIntrinsicPadding(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;->c(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;->c(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method
