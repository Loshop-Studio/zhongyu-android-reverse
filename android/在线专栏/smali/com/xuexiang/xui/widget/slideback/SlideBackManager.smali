.class public Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;


# instance fields
.field private mActivity:Landroid/app/Activity;

.field private mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

.field private mHaveScroll:Z

.field private mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

.field private mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

.field private mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/xuexiang/xui/widget/slideback/SlideInfo;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mHaveScroll:Z

    .line 20
    iput-object p2, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mHaveScroll:Z

    .line 4
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-direct {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;-><init>()V

    const/high16 v2, 0x40a00000    # 5.0f

    .line 6
    invoke-direct {p0, v2}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setArrowSize(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object v1

    iget v3, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v3, v3

    .line 7
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setScreenWidth(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object v1

    const/high16 v3, 0x40400000    # 3.0f

    .line 8
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setDragRate(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object v1

    const/4 v3, 0x1

    .line 9
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setAllowEdgeLeft(Z)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setAllowEdgeRight(Z)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    const/high16 v1, 0x41c00000    # 24.0f

    const/high16 v3, 0x41400000    # 12.0f

    if-eqz p2, :cond_0

    .line 11
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float p1, p1

    div-float/2addr p1, v2

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setBackViewHeight(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object p1

    .line 12
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setMaxSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object p1

    .line 13
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setSideSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    goto :goto_0

    .line 14
    :cond_0
    iget p2, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float p2, p2

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr p2, v2

    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setBackViewHeight(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object p2

    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 15
    invoke-virtual {p2, v0}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setMaxSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    move-result-object p2

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float p1, p1

    div-float/2addr p1, v1

    .line 16
    invoke-virtual {p2, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setSideSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    :goto_0
    return-void
.end method

.method private addInterceptLayout(Landroid/view/ViewGroup;Lcom/xuexiang/xui/widget/slideback/widget/SlideBackInterceptLayout;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v1, -0x1

    .line 3
    invoke-virtual {p2, v0, v1, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private dp2px(F)F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    return p1
.end method

.method private removeInterceptLayout(Landroid/view/ViewGroup;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 4
    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private setSlideBackPosition(Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;I)V
    .locals 2

    int-to-float p2, p2

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->getBackViewHeight()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    sub-float/2addr p2, v0

    float-to-int p2, p2

    .line 2
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public arrowSize(F)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setArrowSize(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-object p0
.end method

.method public callBack(Lcom/xuexiang/xui/widget/slideback/callback/SlideBackCallBack;)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager$1;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager$1;-><init>(Lcom/xuexiang/xui/widget/slideback/SlideBackManager;Lcom/xuexiang/xui/widget/slideback/callback/SlideBackCallBack;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

    return-object p0
.end method

.method public callBack(Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

    return-object p0
.end method

.method public dragRate(F)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setDragRate(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-object p0
.end method

.method public edgeMode(I)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1, v1, v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setEdgeMode(ZZ)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u672a\u5b9a\u4e49\u7684\u8fb9\u7f18\u4fa7\u6ed1\u6a21\u5f0f\u503c\uff1aEdgeMode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1, v0, v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setEdgeMode(ZZ)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {p1, v1, v0}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setEdgeMode(ZZ)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    :goto_0
    return-object p0
.end method

.method public haveScroll(Z)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mHaveScroll:Z

    return-object p0
.end method

.method public maxSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setMaxSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-object p0
.end method

.method public register()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;-><init>()V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

    invoke-virtual {v0, v1, v2, p0}, Lcom/xuexiang/xui/widget/slideback/dispatcher/impl/DefaultSlideTouchDispatcher;->init(Lcom/xuexiang/xui/widget/slideback/SlideInfo;Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;Lcom/xuexiang/xui/widget/slideback/dispatcher/OnSlideUpdateListener;)Lcom/xuexiang/xui/widget/slideback/dispatcher/ISlideTouchEventDispatcher;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->register(Lcom/xuexiang/xui/widget/slideback/dispatcher/ISlideTouchEventDispatcher;)V

    return-void
.end method

.method public register(Lcom/xuexiang/xui/widget/slideback/dispatcher/ISlideTouchEventDispatcher;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeLeft()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getBackViewHeight()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->setBackViewHeight(F)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getArrowSize()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->setArrowSize(F)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getMaxSlideLength()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->setMaxSlideLength(F)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeRight()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    new-instance v0, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getBackViewHeight()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->setBackViewHeight(F)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getArrowSize()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->setArrowSize(F)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getMaxSlideLength()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->setMaxSlideLength(F)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setRotationY(F)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 14
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mHaveScroll:Z

    if-eqz v1, :cond_2

    .line 15
    new-instance v1, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackInterceptLayout;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackInterceptLayout;-><init>(Landroid/content/Context;)V

    .line 16
    iget-object v2, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->getSideSlideLength()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackInterceptLayout;->setSideSlideLength(F)V

    .line 17
    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->addInterceptLayout(Landroid/view/ViewGroup;Lcom/xuexiang/xui/widget/slideback/widget/SlideBackInterceptLayout;)V

    .line 18
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeLeft()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19
    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 20
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->isAllowEdgeRight()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 22
    :cond_4
    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public setSlideInfo(Lcom/xuexiang/xui/widget/slideback/SlideInfo;)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-object p0
.end method

.method public sideSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setSideSlideLength(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-object p0
.end method

.method unregister()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mActivity:Landroid/app/Activity;

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mCallBack:Lcom/xuexiang/xui/widget/slideback/callback/SlideCallBack;

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    return-void
.end method

.method public updateSlideLength(ZF)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->updateSlideLength(F)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;->updateSlideLength(F)V

    :goto_0
    return-void
.end method

.method public updateSlidePosition(ZI)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewLeft:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->setSlideBackPosition(Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;I)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideBackIconViewRight:Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->setSlideBackPosition(Lcom/xuexiang/xui/widget/slideback/widget/SlideBackIconView;I)V

    :goto_0
    return-void
.end method

.method public viewHeight(F)Lcom/xuexiang/xui/widget/slideback/SlideBackManager;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->mSlideInfo:Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideBackManager;->dp2px(F)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/slideback/SlideInfo;->setBackViewHeight(F)Lcom/xuexiang/xui/widget/slideback/SlideInfo;

    return-object p0
.end method
