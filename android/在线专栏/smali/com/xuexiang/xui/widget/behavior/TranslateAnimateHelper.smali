.class public Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/behavior/AnimateHelper;


# static fields
.field public static MODE_BOTTOM:I = 0x91d

.field public static MODE_TITLE:I = 0xe9


# instance fields
.field public mCurrentState:I

.field private mFirstY:F

.field private mMargin:F

.field public mMode:I

.field public mStartY:F

.field public mTarget:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    .line 3
    sget v0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_TITLE:I

    iput v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mMode:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mFirstY:F

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mFirstY:F

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mMargin:F

    return-void
.end method

.method public static get(Landroid/view/View;)Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;
    .locals 1

    new-instance v0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method private hideBottom()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mFirstY:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v1, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mMargin:F

    add-float/2addr v1, v3

    const/4 v3, 0x1

    aput v1, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v3, 0x12c

    .line 2
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$4;-><init>(Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    return-void
.end method

.method private hideTitle()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    const/4 v3, 0x1

    aput v1, v0, v3

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v3, 0x12c

    .line 2
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$1;-><init>(Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    return-void
.end method

.method private setState(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    return-void
.end method

.method private showBottom()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mFirstY:F

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v3, 0x12c

    .line 2
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$3;-><init>(Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    return-void
.end method

.method private showTitle()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v3, 0x12c

    .line 2
    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper$2;-><init>(Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 4
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    return-void
.end method


# virtual methods
.method public getState()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mCurrentState:I

    return v0
.end method

.method public hide()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mMode:I

    sget v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_TITLE:I

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->hideTitle()V

    goto :goto_0

    .line 3
    :cond_0
    sget v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_BOTTOM:I

    if-ne v0, v1, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->hideBottom()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setMode(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mMode:I

    return-void
.end method

.method public setStartY(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mStartY:F

    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->mMode:I

    sget v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_TITLE:I

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->showTitle()V

    goto :goto_0

    .line 3
    :cond_0
    sget v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_BOTTOM:I

    if-ne v0, v1, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->showBottom()V

    :cond_1
    :goto_0
    return-void
.end method
