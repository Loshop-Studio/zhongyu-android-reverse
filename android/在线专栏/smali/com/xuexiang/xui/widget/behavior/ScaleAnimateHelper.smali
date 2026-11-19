.class public Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/behavior/AnimateHelper;


# instance fields
.field public mCurrentState:I

.field public mTarget:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mCurrentState:I

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mTarget:Landroid/view/View;

    return-void
.end method

.method public static get(Landroid/view/View;)Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;-><init>(Landroid/view/View;)V

    return-object v0
.end method


# virtual methods
.method public getState()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mCurrentState:I

    return v0
.end method

.method public hide()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x1

    const/4 v3, 0x0

    aput v3, v0, v1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$2;-><init>(Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v3, 0x12c

    .line 3
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mCurrentState:I

    return-void
.end method

.method public setMode(I)V
    .locals 0

    return-void
.end method

.method public setStartY(F)V
    .locals 0

    return-void
.end method

.method public show()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper$1;-><init>(Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v3, 0x12c

    .line 3
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/behavior/ScaleAnimateHelper;->mCurrentState:I

    return-void
.end method
