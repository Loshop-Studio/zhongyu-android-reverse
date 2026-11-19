.class public Lb/c/a/e/c/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/e/c/a;


# instance fields
.field public a:Landroid/view/View;

.field public b:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lb/c/a/e/c/b;->b:I

    iput-object p1, p0, Lb/c/a/e/c/b;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    iget-object v1, p0, Lb/c/a/e/c/b;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lb/c/a/e/c/b$a;

    invoke-direct {v1, p0}, Lb/c/a/e/c/b$a;-><init>(Lb/c/a/e/c/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput v2, p0, Lb/c/a/e/c/b;->b:I

    return-void
.end method

.method public c()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    iget-object v1, p0, Lb/c/a/e/c/b;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    const/4 v3, 0x0

    aput v3, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lb/c/a/e/c/b$b;

    invoke-direct {v1, p0}, Lb/c/a/e/c/b$b;-><init>(Lb/c/a/e/c/b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput v2, p0, Lb/c/a/e/c/b;->b:I

    return-void
.end method

.method public d(I)V
    .locals 0

    return-void
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lb/c/a/e/c/b;->b:I

    return v0
.end method
