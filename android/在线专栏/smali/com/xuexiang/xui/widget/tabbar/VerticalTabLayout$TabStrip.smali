.class Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TabStrip"
.end annotation


# instance fields
.field private mIndicatorAnimatorSet:Landroid/animation/AnimatorSet;

.field private mIndicatorBottomY:F

.field private mIndicatorPaint:Landroid/graphics/Paint;

.field private mIndicatorRect:Landroid/graphics/RectF;

.field private mIndicatorTopY:F

.field private mIndicatorX:F

.field private mLastWidth:I

.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setWillNotDraw(Z)V

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorPaint:Landroid/graphics/Paint;

    .line 6
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 7
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x3

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result p2

    :goto_0
    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$402(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I

    .line 8
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorRect:Landroid/graphics/RectF;

    .line 9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->setIndicatorGravity()V

    return-void
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)Landroid/animation/AnimatorSet;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorAnimatorSet:Landroid/animation/AnimatorSet;

    return-object p0
.end method

.method static synthetic access$1002(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorAnimatorSet:Landroid/animation/AnimatorSet;

    return-object p1
.end method

.method static synthetic access$602(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorX:F

    return p1
.end method

.method static synthetic access$702(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mLastWidth:I

    return p1
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorBottomY:F

    return p0
.end method

.method static synthetic access$802(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorBottomY:F

    return p1
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorTopY:F

    return p0
.end method

.method static synthetic access$902(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorTopY:F

    return p1
.end method

.method private calcIndicatorY(F)V
    .locals 9

    float-to-double v0, p1

    .line 1
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 2
    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    int-to-double v6, v6

    cmpl-double v8, v4, v6

    if-eqz v8, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmpl-double v6, v0, v4

    if-eqz v6, :cond_0

    add-int/lit8 v0, v2, 0x1

    .line 4
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 5
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    int-to-float v2, v2

    sub-float/2addr p1, v2

    mul-float v4, v4, p1

    add-float/2addr v1, v4

    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorTopY:F

    .line 6
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 7
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float v0, v0, p1

    add-float/2addr v1, v0

    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorBottomY:F

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorTopY:F

    .line 9
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorBottomY:F

    :goto_0
    return-void
.end method


# virtual methods
.method protected moveIndicator(F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->calcIndicatorY(F)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->invalidate()V

    return-void
.end method

.method protected moveIndicatorWithAnimator(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    move-result v0

    sub-int v0, p1, v0

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    int-to-float p1, p1

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorTopY:F

    cmpl-float v2, v2, v1

    if-nez v2, :cond_0

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorBottomY:F

    cmpl-float v2, v2, p1

    if-nez v2, :cond_0

    return-void

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorAnimatorSet:Landroid/animation/AnimatorSet;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->end()V

    .line 8
    :cond_1
    new-instance v2, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;

    invoke-direct {v2, p0, v0, p1, v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$2;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;IFF)V

    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorPaint:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$1100(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorX:F

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorTopY:F

    iput v2, v0, Landroid/graphics/RectF;->top:F

    .line 5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$500(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorBottomY:F

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$1200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorRect:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v1}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$1200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)F

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v2}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$1200(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)F

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorRect:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method protected setIndicatorGravity()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    .line 2
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorX:F

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mLastWidth:I

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$502(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$500(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    invoke-virtual {p0, v0, v2, v2, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    const/4 v3, 0x5

    if-ne v0, v3, :cond_3

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mLastWidth:I

    if-eqz v0, :cond_2

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v1, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$502(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;I)I

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$500(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    invoke-virtual {p0, v2, v2, v0, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    goto :goto_0

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->access$400(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;)I

    move-result v0

    const/16 v3, 0x77

    if-ne v0, v3, :cond_4

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->mIndicatorX:F

    .line 12
    invoke-virtual {p0, v2, v2, v2, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 13
    :cond_4
    :goto_0
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;)V

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected updateIndicator()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->this$0:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->getSelectedTabPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$TabStrip;->moveIndicatorWithAnimator(I)V

    return-void
.end method
