.class public Lb/c/a/e/c/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/e/c/a;


# instance fields
.field public a:Landroid/view/View;

.field public b:I

.field public c:I

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lb/c/a/e/c/g;->b:I

    const/16 v0, 0xe9

    iput v0, p0, Lb/c/a/e/c/g;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lb/c/a/e/c/g;->d:F

    iput-object p1, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    iput p1, p0, Lb/c/a/e/c/g;->d:F

    iget-object p1, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v0, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    int-to-float p1, p1

    iput p1, p0, Lb/c/a/e/c/g;->e:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 7

    iget v0, p0, Lb/c/a/e/c/g;->c:I

    const-wide/16 v1, 0x12c

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/16 v6, 0xe9

    if-ne v0, v6, :cond_0

    new-array v0, v5, [F

    .line 1
    iget-object v5, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getY()F

    move-result v5

    aput v5, v0, v4

    const/4 v4, 0x0

    aput v4, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lb/c/a/e/c/d;

    invoke-direct {v1, p0}, Lb/c/a/e/c/d;-><init>(Lb/c/a/e/c/g;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput v3, p0, Lb/c/a/e/c/g;->b:I

    goto :goto_0

    :cond_0
    const/16 v6, 0x91d

    if-ne v0, v6, :cond_1

    new-array v0, v5, [F

    .line 2
    iget-object v5, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getY()F

    move-result v5

    aput v5, v0, v4

    iget v4, p0, Lb/c/a/e/c/g;->d:F

    aput v4, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lb/c/a/e/c/e;

    invoke-direct {v1, p0}, Lb/c/a/e/c/e;-><init>(Lb/c/a/e/c/g;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput v3, p0, Lb/c/a/e/c/g;->b:I

    :cond_1
    :goto_0
    return-void
.end method

.method public c()V
    .locals 7

    iget v0, p0, Lb/c/a/e/c/g;->c:I

    const-wide/16 v1, 0x12c

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/16 v6, 0xe9

    if-ne v0, v6, :cond_0

    new-array v0, v5, [F

    .line 1
    iget-object v5, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getY()F

    move-result v5

    aput v5, v0, v4

    iget-object v5, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    aput v5, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lb/c/a/e/c/c;

    invoke-direct {v1, p0}, Lb/c/a/e/c/c;-><init>(Lb/c/a/e/c/g;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput v4, p0, Lb/c/a/e/c/g;->b:I

    goto :goto_0

    :cond_0
    const/16 v6, 0x91d

    if-ne v0, v6, :cond_1

    new-array v0, v5, [F

    .line 2
    iget-object v5, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getY()F

    move-result v5

    aput v5, v0, v4

    iget v5, p0, Lb/c/a/e/c/g;->d:F

    iget-object v6, p0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v5, v6

    iget v6, p0, Lb/c/a/e/c/g;->e:F

    add-float/2addr v5, v6

    aput v5, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lb/c/a/e/c/f;

    invoke-direct {v1, p0}, Lb/c/a/e/c/f;-><init>(Lb/c/a/e/c/g;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput v4, p0, Lb/c/a/e/c/g;->b:I

    :cond_1
    :goto_0
    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lb/c/a/e/c/g;->c:I

    return-void
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lb/c/a/e/c/g;->b:I

    return v0
.end method
