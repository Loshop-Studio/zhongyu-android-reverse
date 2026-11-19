.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;
.super Landroid/widget/ProgressBar;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:I

.field public final c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a:Z

    .line 3
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 4
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a:Z

    .line 9
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p2, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a:Z

    .line 15
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 18
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g(Landroid/util/AttributeSet;I)V

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 9
    .line 10
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->o:Z

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->p:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->m:Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->o:Z

    .line 26
    .line 27
    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->n:Landroid/graphics/PorterDuff$Mode;

    .line 28
    .line 29
    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->p:Z

    .line 30
    .line 31
    move-object v0, p0

    .line 32
    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final b()V
    .locals 9

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->c:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->d:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    :cond_1
    const v1, 0x102000d

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(IZ)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    iget-object v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->a:Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    iget-boolean v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->c:Z

    .line 31
    .line 32
    iget-object v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->b:Landroid/graphics/PorterDuff$Mode;

    .line 33
    .line 34
    iget-boolean v8, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->d:Z

    .line 35
    .line 36
    move-object v3, p0

    .line 37
    invoke-virtual/range {v3 .. v8}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 9

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->k:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->l:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    :cond_1
    const/high16 v1, 0x1020000

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(IZ)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    iget-object v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->i:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    iget-boolean v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->k:Z

    .line 30
    .line 31
    iget-object v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->j:Landroid/graphics/PorterDuff$Mode;

    .line 32
    .line 33
    iget-boolean v8, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->l:Z

    .line 34
    .line 35
    move-object v3, p0

    .line 36
    invoke-virtual/range {v3 .. v8}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 9

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->g:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->h:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    :cond_1
    const v1, 0x102000f

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(IZ)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    iget-object v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->e:Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    iget-boolean v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->g:Z

    .line 31
    .line 32
    iget-object v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->f:Landroid/graphics/PorterDuff$Mode;

    .line 33
    .line 34
    iget-boolean v8, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->h:Z

    .line 35
    .line 36
    move-object v3, p0

    .line 37
    invoke-virtual/range {v3 .. v8}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public final e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    if-eqz p5, :cond_5

    .line 4
    .line 5
    :cond_0
    const-string v0, "Drawable did not implement TintableDrawable, it won\'t be tinted below Lollipop"

    .line 6
    .line 7
    const-string v1, "MaterialProgressBar"

    .line 8
    .line 9
    if-eqz p3, :cond_2

    .line 10
    .line 11
    instance-of p3, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    move-object p3, p1

    .line 16
    check-cast p3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 17
    .line 18
    invoke-interface {p3, p2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    :goto_0
    if-eqz p5, :cond_4

    .line 29
    .line 30
    instance-of p2, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 31
    .line 32
    if-eqz p2, :cond_3

    .line 33
    .line 34
    move-object p2, p1

    .line 35
    check-cast p2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;

    .line 36
    .line 37
    invoke-interface {p2, p4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/w;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p4}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 58
    .line 59
    .line 60
    :cond_5
    return-void
.end method

.method public final f(IZ)Landroid/graphics/drawable/Drawable;
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

.method public final g(Landroid/util/AttributeSet;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar:[I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    move-object/from16 v4, p1

    .line 11
    .line 12
    move/from16 v5, p2

    .line 13
    .line 14
    invoke-static {v1, v4, v2, v5, v3}, Landroidx/appcompat/widget/TintTypedArray;->obtainStyledAttributes(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/TintTypedArray;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressStyle:I

    .line 19
    .line 20
    invoke-virtual {v2, v4, v3}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iput v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 25
    .line 26
    sget v4, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_setBothDrawables:I

    .line 27
    .line 28
    invoke-virtual {v2, v4, v3}, Landroidx/appcompat/widget/TintTypedArray;->getBoolean(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    sget v5, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_useIntrinsicPadding:I

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-virtual {v2, v5, v6}, Landroidx/appcompat/widget/TintTypedArray;->getBoolean(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    sget v7, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_showProgressBackground:I

    .line 40
    .line 41
    iget v8, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 42
    .line 43
    if-ne v8, v6, :cond_0

    .line 44
    .line 45
    move v8, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v8, v3

    .line 48
    :goto_0
    invoke-virtual {v2, v7, v8}, Landroidx/appcompat/widget/TintTypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    sget v8, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_determinateCircularProgressStyle:I

    .line 53
    .line 54
    invoke-virtual {v2, v8, v3}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressTint:I

    .line 59
    .line 60
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    iget-object v10, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 65
    .line 66
    if-eqz v9, :cond_1

    .line 67
    .line 68
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressTint:I

    .line 69
    .line 70
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->a:Landroid/content/res/ColorStateList;

    .line 75
    .line 76
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->c:Z

    .line 77
    .line 78
    :cond_1
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressTintMode:I

    .line 79
    .line 80
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    const/4 v11, -0x1

    .line 85
    if-eqz v9, :cond_2

    .line 86
    .line 87
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressTintMode:I

    .line 88
    .line 89
    invoke-virtual {v2, v9, v11}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    invoke-static {v9}, Lkotlin/collections/u;->C(I)Landroid/graphics/PorterDuff$Mode;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->b:Landroid/graphics/PorterDuff$Mode;

    .line 98
    .line 99
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->d:Z

    .line 100
    .line 101
    :cond_2
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_secondaryProgressTint:I

    .line 102
    .line 103
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_3

    .line 108
    .line 109
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_secondaryProgressTint:I

    .line 110
    .line 111
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->e:Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->g:Z

    .line 118
    .line 119
    :cond_3
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_secondaryProgressTintMode:I

    .line 120
    .line 121
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_4

    .line 126
    .line 127
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_secondaryProgressTintMode:I

    .line 128
    .line 129
    invoke-virtual {v2, v9, v11}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    invoke-static {v9}, Lkotlin/collections/u;->C(I)Landroid/graphics/PorterDuff$Mode;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->f:Landroid/graphics/PorterDuff$Mode;

    .line 138
    .line 139
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->h:Z

    .line 140
    .line 141
    :cond_4
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressBackgroundTint:I

    .line 142
    .line 143
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_5

    .line 148
    .line 149
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressBackgroundTint:I

    .line 150
    .line 151
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->i:Landroid/content/res/ColorStateList;

    .line 156
    .line 157
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->k:Z

    .line 158
    .line 159
    :cond_5
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressBackgroundTintMode:I

    .line 160
    .line 161
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-eqz v9, :cond_6

    .line 166
    .line 167
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_progressBackgroundTintMode:I

    .line 168
    .line 169
    invoke-virtual {v2, v9, v11}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    invoke-static {v9}, Lkotlin/collections/u;->C(I)Landroid/graphics/PorterDuff$Mode;

    .line 174
    .line 175
    .line 176
    move-result-object v9

    .line 177
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->j:Landroid/graphics/PorterDuff$Mode;

    .line 178
    .line 179
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->l:Z

    .line 180
    .line 181
    :cond_6
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_indeterminateTint:I

    .line 182
    .line 183
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-eqz v9, :cond_7

    .line 188
    .line 189
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_indeterminateTint:I

    .line 190
    .line 191
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->m:Landroid/content/res/ColorStateList;

    .line 196
    .line 197
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->o:Z

    .line 198
    .line 199
    :cond_7
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_indeterminateTintMode:I

    .line 200
    .line 201
    invoke-virtual {v2, v9}, Landroidx/appcompat/widget/TintTypedArray;->hasValue(I)Z

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    if-eqz v9, :cond_8

    .line 206
    .line 207
    sget v9, Lcom/xuexiang/xui/R$styleable;->MaterialProgressBar_mpb_indeterminateTintMode:I

    .line 208
    .line 209
    invoke-virtual {v2, v9, v11}, Landroidx/appcompat/widget/TintTypedArray;->getInt(II)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    invoke-static {v9}, Lkotlin/collections/u;->C(I)Landroid/graphics/PorterDuff$Mode;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    iput-object v9, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->n:Landroid/graphics/PorterDuff$Mode;

    .line 218
    .line 219
    iput-boolean v6, v10, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->p:Z

    .line 220
    .line 221
    :cond_8
    invoke-virtual {v2}, Landroidx/appcompat/widget/TintTypedArray;->recycle()V

    .line 222
    .line 223
    .line 224
    iget v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 225
    .line 226
    const/4 v10, 0x2

    .line 227
    if-eqz v2, :cond_d

    .line 228
    .line 229
    if-ne v2, v6, :cond_c

    .line 230
    .line 231
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_a

    .line 236
    .line 237
    if-eqz v4, :cond_9

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_9
    move/from16 v16, v3

    .line 241
    .line 242
    move/from16 p1, v6

    .line 243
    .line 244
    move/from16 p2, v7

    .line 245
    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :cond_a
    :goto_1
    new-instance v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;

    .line 249
    .line 250
    invoke-direct {v2, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;-><init>(Landroid/content/Context;)V

    .line 251
    .line 252
    .line 253
    iput-boolean v6, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->l:Z

    .line 254
    .line 255
    new-instance v8, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 256
    .line 257
    sget-object v12, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->s:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 258
    .line 259
    invoke-direct {v8, v12}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;)V

    .line 260
    .line 261
    .line 262
    iput-object v8, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->n:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 263
    .line 264
    new-instance v12, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 265
    .line 266
    sget-object v13, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->t:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 267
    .line 268
    invoke-direct {v12, v13}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;)V

    .line 269
    .line 270
    .line 271
    iput-object v12, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->o:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable$RectTransformX;

    .line 272
    .line 273
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v13

    .line 277
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 278
    .line 279
    .line 280
    move-result-object v13

    .line 281
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 282
    .line 283
    const/high16 v14, 0x40800000    # 4.0f

    .line 284
    .line 285
    mul-float/2addr v14, v13

    .line 286
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 287
    .line 288
    .line 289
    move-result v14

    .line 290
    iput v14, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->j:I

    .line 291
    .line 292
    const/high16 v14, 0x41800000    # 16.0f

    .line 293
    .line 294
    mul-float/2addr v13, v14

    .line 295
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 296
    .line 297
    .line 298
    move-result v13

    .line 299
    iput v13, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->k:I

    .line 300
    .line 301
    const v13, 0x1010033

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    invoke-static {v1, v13, v14}, Lkotlin/collections/u;->H(Landroid/content/Context;IF)F

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    iput v13, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/j;->m:F

    .line 310
    .line 311
    sget-object v13, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->a:Landroid/graphics/Path;

    .line 312
    .line 313
    const-string v14, "translateX"

    .line 314
    .line 315
    const/4 v15, 0x0

    .line 316
    invoke-static {v8, v14, v15, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 317
    .line 318
    .line 319
    move-result-object v13

    .line 320
    move/from16 p1, v6

    .line 321
    .line 322
    move/from16 p2, v7

    .line 323
    .line 324
    const-wide/16 v6, 0x7d0

    .line 325
    .line 326
    invoke-virtual {v13, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 327
    .line 328
    .line 329
    sget-object v9, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;->a:Landroid/view/animation/Interpolator;

    .line 330
    .line 331
    invoke-virtual {v13, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v13, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 335
    .line 336
    .line 337
    sget-object v9, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->b:Landroid/graphics/Path;

    .line 338
    .line 339
    move/from16 v16, v3

    .line 340
    .line 341
    const-string v3, "scaleX"

    .line 342
    .line 343
    invoke-static {v8, v15, v3, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    invoke-virtual {v8, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 348
    .line 349
    .line 350
    sget-object v9, Lcom/xuexiang/xui/widget/progress/materialprogressbar/k;->a:Landroid/view/animation/Interpolator;

    .line 351
    .line 352
    invoke-virtual {v8, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v8, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 356
    .line 357
    .line 358
    new-instance v9, Landroid/animation/AnimatorSet;

    .line 359
    .line 360
    invoke-direct {v9}, Landroid/animation/AnimatorSet;-><init>()V

    .line 361
    .line 362
    .line 363
    new-array v11, v10, [Landroid/animation/Animator;

    .line 364
    .line 365
    aput-object v13, v11, v16

    .line 366
    .line 367
    aput-object v8, v11, p1

    .line 368
    .line 369
    invoke-virtual {v9, v11}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 370
    .line 371
    .line 372
    sget-object v8, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->c:Landroid/graphics/Path;

    .line 373
    .line 374
    invoke-static {v12, v14, v15, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    invoke-virtual {v8, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 379
    .line 380
    .line 381
    sget-object v11, Lcom/xuexiang/xui/widget/progress/materialprogressbar/n;->a:Landroid/view/animation/Interpolator;

    .line 382
    .line 383
    invoke-virtual {v8, v11}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 384
    .line 385
    .line 386
    const/4 v11, -0x1

    .line 387
    invoke-virtual {v8, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 388
    .line 389
    .line 390
    sget-object v13, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->d:Landroid/graphics/Path;

    .line 391
    .line 392
    invoke-static {v12, v15, v3, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 397
    .line 398
    .line 399
    sget-object v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/m;->a:Landroid/view/animation/Interpolator;

    .line 400
    .line 401
    invoke-virtual {v3, v6}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 405
    .line 406
    .line 407
    new-instance v6, Landroid/animation/AnimatorSet;

    .line 408
    .line 409
    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 410
    .line 411
    .line 412
    new-array v7, v10, [Landroid/animation/Animator;

    .line 413
    .line 414
    aput-object v8, v7, v16

    .line 415
    .line 416
    aput-object v3, v7, p1

    .line 417
    .line 418
    invoke-virtual {v6, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 419
    .line 420
    .line 421
    new-array v3, v10, [Landroid/animation/Animator;

    .line 422
    .line 423
    aput-object v9, v3, v16

    .line 424
    .line 425
    aput-object v6, v3, p1

    .line 426
    .line 427
    iput-object v3, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->i:[Landroid/animation/Animator;

    .line 428
    .line 429
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 430
    .line 431
    .line 432
    :goto_2
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-eqz v2, :cond_b

    .line 437
    .line 438
    if-eqz v4, :cond_11

    .line 439
    .line 440
    :cond_b
    new-instance v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;

    .line 441
    .line 442
    new-instance v3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;

    .line 443
    .line 444
    move/from16 v4, v16

    .line 445
    .line 446
    invoke-direct {v3, v1, v4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;-><init>(Landroid/content/Context;I)V

    .line 447
    .line 448
    .line 449
    move/from16 v6, p1

    .line 450
    .line 451
    iput-boolean v6, v3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;->l:Z

    .line 452
    .line 453
    new-instance v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;

    .line 454
    .line 455
    invoke-direct {v7, v1, v6}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;-><init>(Landroid/content/Context;I)V

    .line 456
    .line 457
    .line 458
    new-instance v8, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;

    .line 459
    .line 460
    invoke-direct {v8, v1, v6}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/h;-><init>(Landroid/content/Context;I)V

    .line 461
    .line 462
    .line 463
    const/4 v9, 0x3

    .line 464
    new-array v9, v9, [Landroid/graphics/drawable/Drawable;

    .line 465
    .line 466
    aput-object v3, v9, v4

    .line 467
    .line 468
    aput-object v7, v9, v6

    .line 469
    .line 470
    aput-object v8, v9, v10

    .line 471
    .line 472
    invoke-direct {v2, v9, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 476
    .line 477
    .line 478
    goto/16 :goto_3

    .line 479
    .line 480
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 481
    .line 482
    new-instance v2, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    const-string v3, "Unknown progress style: "

    .line 485
    .line 486
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    iget v3, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:I

    .line 490
    .line 491
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    throw v1

    .line 502
    :cond_d
    move/from16 p2, v7

    .line 503
    .line 504
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-nez v2, :cond_e

    .line 509
    .line 510
    if-eqz v4, :cond_f

    .line 511
    .line 512
    :cond_e
    new-instance v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;

    .line 513
    .line 514
    invoke-direct {v2, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;-><init>(Landroid/content/Context;)V

    .line 515
    .line 516
    .line 517
    new-instance v3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 518
    .line 519
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 520
    .line 521
    .line 522
    iput-object v3, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->l:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingPathTransform;

    .line 523
    .line 524
    new-instance v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 525
    .line 526
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 527
    .line 528
    .line 529
    iput-object v6, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->m:Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable$RingRotation;

    .line 530
    .line 531
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 532
    .line 533
    .line 534
    move-result-object v7

    .line 535
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 540
    .line 541
    const/high16 v9, 0x42280000    # 42.0f

    .line 542
    .line 543
    mul-float/2addr v9, v7

    .line 544
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 545
    .line 546
    .line 547
    move-result v9

    .line 548
    iput v9, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->j:I

    .line 549
    .line 550
    const/high16 v9, 0x42400000    # 48.0f

    .line 551
    .line 552
    mul-float/2addr v7, v9

    .line 553
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    iput v7, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/i;->k:I

    .line 558
    .line 559
    sget-object v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/a;->a:Landroid/graphics/Path;

    .line 560
    .line 561
    new-array v7, v10, [F

    .line 562
    .line 563
    fill-array-data v7, :array_0

    .line 564
    .line 565
    .line 566
    const-string v9, "trimPathStart"

    .line 567
    .line 568
    invoke-static {v3, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 569
    .line 570
    .line 571
    move-result-object v7

    .line 572
    const-wide/16 v11, 0x535

    .line 573
    .line 574
    invoke-virtual {v7, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 575
    .line 576
    .line 577
    sget-object v9, Lcom/xuexiang/xui/widget/progress/materialprogressbar/q;->a:Landroid/view/animation/Interpolator;

    .line 578
    .line 579
    invoke-virtual {v7, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 580
    .line 581
    .line 582
    const/4 v9, -0x1

    .line 583
    invoke-virtual {v7, v9}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 584
    .line 585
    .line 586
    new-array v13, v10, [F

    .line 587
    .line 588
    fill-array-data v13, :array_1

    .line 589
    .line 590
    .line 591
    const-string v14, "trimPathEnd"

    .line 592
    .line 593
    invoke-static {v3, v14, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 594
    .line 595
    .line 596
    move-result-object v13

    .line 597
    invoke-virtual {v13, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 598
    .line 599
    .line 600
    sget-object v14, Lcom/xuexiang/xui/widget/progress/materialprogressbar/p;->a:Landroid/view/animation/Interpolator;

    .line 601
    .line 602
    invoke-virtual {v13, v14}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v13, v9}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 606
    .line 607
    .line 608
    new-array v14, v10, [F

    .line 609
    .line 610
    fill-array-data v14, :array_2

    .line 611
    .line 612
    .line 613
    const-string v15, "trimPathOffset"

    .line 614
    .line 615
    invoke-static {v3, v15, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    invoke-virtual {v3, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 620
    .line 621
    .line 622
    sget-object v11, Lcom/xuexiang/xui/widget/progress/materialprogressbar/o;->a:Landroid/view/animation/LinearInterpolator;

    .line 623
    .line 624
    invoke-virtual {v3, v11}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v3, v9}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 628
    .line 629
    .line 630
    new-instance v9, Landroid/animation/AnimatorSet;

    .line 631
    .line 632
    invoke-direct {v9}, Landroid/animation/AnimatorSet;-><init>()V

    .line 633
    .line 634
    .line 635
    const/4 v12, 0x3

    .line 636
    new-array v14, v12, [Landroid/animation/Animator;

    .line 637
    .line 638
    const/16 v16, 0x0

    .line 639
    .line 640
    aput-object v7, v14, v16

    .line 641
    .line 642
    const/4 v7, 0x1

    .line 643
    aput-object v13, v14, v7

    .line 644
    .line 645
    aput-object v3, v14, v10

    .line 646
    .line 647
    invoke-virtual {v9, v14}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 648
    .line 649
    .line 650
    new-array v3, v10, [F

    .line 651
    .line 652
    fill-array-data v3, :array_3

    .line 653
    .line 654
    .line 655
    const-string v7, "rotation"

    .line 656
    .line 657
    invoke-static {v6, v7, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    const-wide/16 v6, 0x1a09

    .line 662
    .line 663
    invoke-virtual {v3, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v3, v11}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 667
    .line 668
    .line 669
    const/4 v11, -0x1

    .line 670
    invoke-virtual {v3, v11}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 671
    .line 672
    .line 673
    new-array v6, v10, [Landroid/animation/Animator;

    .line 674
    .line 675
    const/16 v16, 0x0

    .line 676
    .line 677
    aput-object v9, v6, v16

    .line 678
    .line 679
    const/4 v7, 0x1

    .line 680
    aput-object v3, v6, v7

    .line 681
    .line 682
    iput-object v6, v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/c;->i:[Landroid/animation/Animator;

    .line 683
    .line 684
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 685
    .line 686
    .line 687
    :cond_f
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    if-eqz v2, :cond_10

    .line 692
    .line 693
    if-eqz v4, :cond_11

    .line 694
    .line 695
    :cond_10
    new-instance v2, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;

    .line 696
    .line 697
    new-instance v3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;

    .line 698
    .line 699
    invoke-direct {v3}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;-><init>()V

    .line 700
    .line 701
    .line 702
    const/4 v7, 0x1

    .line 703
    iput-boolean v7, v3, Lcom/xuexiang/xui/widget/progress/materialprogressbar/f;->l:Z

    .line 704
    .line 705
    new-instance v4, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 706
    .line 707
    invoke-direct {v4, v8}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;-><init>(I)V

    .line 708
    .line 709
    .line 710
    new-instance v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;

    .line 711
    .line 712
    invoke-direct {v6, v8}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/v;-><init>(I)V

    .line 713
    .line 714
    .line 715
    const/4 v9, 0x3

    .line 716
    new-array v8, v9, [Landroid/graphics/drawable/Drawable;

    .line 717
    .line 718
    const/16 v16, 0x0

    .line 719
    .line 720
    aput-object v3, v8, v16

    .line 721
    .line 722
    aput-object v4, v8, v7

    .line 723
    .line 724
    aput-object v6, v8, v10

    .line 725
    .line 726
    invoke-direct {v2, v8, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/g;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 730
    .line 731
    .line 732
    :cond_11
    :goto_3
    invoke-virtual {v0, v5}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setUseIntrinsicPadding(Z)V

    .line 733
    .line 734
    .line 735
    move/from16 v1, p2

    .line 736
    .line 737
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setShowProgressBackground(Z)V

    .line 738
    .line 739
    .line 740
    return-void

    .line 741
    :array_0
    .array-data 4
        0x0
        0x3f400000    # 0.75f
    .end array-data

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    :array_1
    .array-data 4
        0x0
        0x3f400000    # 0.75f
    .end array-data

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    :array_2
    .array-data 4
        0x0
        0x3e800000    # 0.25f
    .end array-data

    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    :array_3
    .array-data 4
        0x0
        0x44340000    # 720.0f
    .end array-data
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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->a()Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->m:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->n:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->i:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->j:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->a:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->b:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportSecondaryProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object v0
.end method

.method public getSupportSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->f:Landroid/graphics/PorterDuff$Mode;

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
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 10
    .line 11
    invoke-interface {v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->d()Z

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

.method public final h()V
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
    const-string v0, "MaterialProgressBar"

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

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
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
    instance-of p1, p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/t;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, "MaterialProgressBar"

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    return-void
.end method

.method public setProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->h()V

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
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->b(Z)V

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
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/u;->b(Z)V

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->m:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->o:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->n:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->p:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->i:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->k:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->j:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->l:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->a:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->c:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->b:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->d:Z

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->e:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->g:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;

    .line 2
    .line 3
    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->f:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

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
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->c(Z)V

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
    instance-of v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->c(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method
