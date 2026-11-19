.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;
.super Landroid/widget/ProgressBar;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public b:Z

.field public c:I

.field public d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    invoke-direct {p0, p1, p2}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:Z

    new-instance v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lb/c/a/b;->g:[I

    const/4 v3, 0x0

    invoke-static {v0, p2, v2, v3, v3}, La/b/h/u0;->q(Landroid/content/Context;Landroid/util/AttributeSet;[III)La/b/h/u0;

    move-result-object p2

    const/4 v2, 0x5

    invoke-virtual {p2, v2, v3}, La/b/h/u0;->j(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:I

    const/16 v2, 0xa

    invoke-virtual {p2, v2, v3}, La/b/h/u0;->a(IZ)Z

    move-result v2

    const/16 v4, 0xc

    invoke-virtual {p2, v4, p1}, La/b/h/u0;->a(IZ)Z

    move-result v4

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:I

    if-ne v5, p1, :cond_0

    move v5, p1

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    const/16 v6, 0xb

    invoke-virtual {p2, v6, v5}, La/b/h/u0;->a(IZ)Z

    move-result v5

    invoke-virtual {p2, v3, v3}, La/b/h/u0;->j(II)I

    move-result v3

    const/4 v6, 0x6

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6}, La/b/h/u0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    :cond_1
    const/4 v6, 0x7

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    const/4 v8, -0x1

    if-eqz v7, :cond_2

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6, v8}, La/b/h/u0;->j(II)I

    move-result v6

    invoke-static {v6, v1}, Lb/c/a/a;->y(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v6

    iput-object v6, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    :cond_2
    const/16 v6, 0x8

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6}, La/b/h/u0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    :cond_3
    const/16 v6, 0x9

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6, v8}, La/b/h/u0;->j(II)I

    move-result v6

    invoke-static {v6, v1}, Lb/c/a/a;->y(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v6

    iput-object v6, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    :cond_4
    const/4 v6, 0x3

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6}, La/b/h/u0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    :cond_5
    const/4 v6, 0x4

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6, v8}, La/b/h/u0;->j(II)I

    move-result v6

    invoke-static {v6, v1}, Lb/c/a/a;->y(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v6

    iput-object v6, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    :cond_6
    invoke-virtual {p2, p1}, La/b/h/u0;->o(I)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, p1}, La/b/h/u0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    iput-object v7, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v6, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    :cond_7
    const/4 v6, 0x2

    invoke-virtual {p2, v6}, La/b/h/u0;->o(I)Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    invoke-virtual {p2, v6, v8}, La/b/h/u0;->j(II)I

    move-result v6

    invoke-static {v6, v1}, Lb/c/a/a;->y(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    iput-object v1, v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-boolean p1, v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    .line 2
    :cond_8
    iget-object p2, p2, La/b/h/u0;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 3
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:I

    if-eqz p2, :cond_d

    if-ne p2, p1, :cond_c

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result p1

    if-nez p1, :cond_9

    if-eqz v2, :cond_a

    :cond_9
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;

    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result p1

    if-eqz p1, :cond_b

    if-eqz v2, :cond_11

    :cond_b
    new-instance p1, Lb/c/a/e/h/a/k;

    invoke-direct {p1, v0}, Lb/c/a/e/h/a/k;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown progress style: "

    invoke-static {p2}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result p1

    if-nez p1, :cond_e

    if-eqz v2, :cond_f

    :cond_e
    new-instance p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;

    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result p1

    if-eqz p1, :cond_10

    if-eqz v2, :cond_11

    :cond_10
    new-instance p1, Lb/c/a/e/h/a/i;

    invoke-direct {p1, v3, v0}, Lb/c/a/e/h/a/i;-><init>(ILandroid/content/Context;)V

    :goto_1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_11
    invoke-virtual {p0, v4}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setUseIntrinsicPadding(Z)V

    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setShowProgressBackground(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    if-nez v2, :cond_1

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v2, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    :cond_2
    return-void
.end method

.method public final b()V
    .locals 8

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    if-eqz v0, :cond_2

    :cond_1
    const v0, 0x102000d

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    iget-object v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    :cond_2
    return-void
.end method

.method public final c()V
    .locals 8

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    if-eqz v0, :cond_2

    :cond_1
    const/high16 v0, 0x1020000

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    iget-object v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 8

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    if-eqz v0, :cond_2

    :cond_1
    const v0, 0x102000f

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->f(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v4, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    iget-boolean v5, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    iget-object v6, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V

    :cond_2
    return-void
.end method

.method public final e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/PorterDuff$Mode;Z)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e:Ljava/lang/String;

    if-nez p3, :cond_0

    if-eqz p5, :cond_5

    :cond_0
    const-string v1, "Drawable did not implement TintableDrawable, it won\'t be tinted below Lollipop"

    if-eqz p3, :cond_2

    instance-of p3, p1, Lb/c/a/e/h/a/x;

    if-eqz p3, :cond_1

    move-object p3, p1

    check-cast p3, Lb/c/a/e/h/a/x;

    invoke-interface {p3, p2}, Lb/c/a/e/h/a/x;->setTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 1
    :cond_1
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_2
    :goto_0
    if-eqz p5, :cond_4

    instance-of p2, p1, Lb/c/a/e/h/a/x;

    if-eqz p2, :cond_3

    move-object p2, p1

    check-cast p2, Lb/c/a/e/h/a/x;

    invoke-interface {p2, p4}, Lb/c/a/e/h/a/x;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    .line 3
    :cond_3
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p1, p4}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_4
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getDrawableState()[I

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_5
    return-void
.end method

.method public final f(IZ)Landroid/graphics/drawable/Drawable;
    .locals 3

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    instance-of v2, v0, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final g()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e:Ljava/lang/String;

    const-string v1, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getCurrentDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getIndeterminateTintList()Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportIndeterminateTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getProgressBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getProgressStyle()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c:I

    return v0
.end method

.method public getProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportProgressTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getSecondaryProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportSecondaryProgressTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getSupportSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getShowProgressBackground()Z
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lb/c/a/e/h/a/u;

    if-eqz v1, :cond_0

    check-cast v0, Lb/c/a/e/h/a/u;

    invoke-interface {v0}, Lb/c/a/e/h/a/u;->a()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getSupportIndeterminateTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getSupportIndeterminateTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getSupportProgressBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getSupportProgressBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getSupportProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getSupportProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getSupportSecondaryProgressTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getSupportSecondaryProgressTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getUseIntrinsicPadding()Z
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lb/c/a/e/h/a/s;

    if-eqz v1, :cond_0

    check-cast v0, Lb/c/a/e/h/a/s;

    invoke-interface {v0}, Lb/c/a/e/h/a/s;->d()Z

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Drawable does not implement IntrinsicPaddingDrawable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    return-void
.end method

.method public declared-synchronized setIndeterminate(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of p1, p1, Lb/c/a/e/h/a/t;

    if-nez p1, :cond_0

    sget-object p1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->e:Ljava/lang/String;

    const-string v0, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a()V

    :cond_0
    return-void
.end method

.method public setIndeterminateTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setIndeterminateTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportIndeterminateTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setSecondaryProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportSecondaryProgressTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setSecondaryProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->g()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->setSupportSecondaryProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setShowProgressBackground(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lb/c/a/e/h/a/u;

    if-eqz v1, :cond_0

    check-cast v0, Lb/c/a/e/h/a/u;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/u;->b(Z)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lb/c/a/e/h/a/u;

    if-eqz v1, :cond_1

    check-cast v0, Lb/c/a/e/h/a/u;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/u;->b(Z)V

    :cond_1
    return-void
.end method

.method public setSupportIndeterminateTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->m:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->o:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a()V

    return-void
.end method

.method public setSupportIndeterminateTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->n:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->p:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->a()V

    return-void
.end method

.method public setSupportProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->i:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->k:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    return-void
.end method

.method public setSupportProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->j:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->l:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->c()V

    return-void
.end method

.method public setSupportProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->c:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    return-void
.end method

.method public setSupportProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->d:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->b()V

    return-void
.end method

.method public setSupportSecondaryProgressTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->e:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->g:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

    return-void
.end method

.method public setSupportSecondaryProgressTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;

    iput-object p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->f:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$b;->h:Z

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->d()V

    return-void
.end method

.method public setUseIntrinsicPadding(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;->getCurrentDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lb/c/a/e/h/a/s;

    if-eqz v1, :cond_0

    check-cast v0, Lb/c/a/e/h/a/s;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/s;->c(Z)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lb/c/a/e/h/a/s;

    if-eqz v1, :cond_1

    check-cast v0, Lb/c/a/e/h/a/s;

    invoke-interface {v0, p1}, Lb/c/a/e/h/a/s;->c(Z)V

    :cond_1
    return-void
.end method
