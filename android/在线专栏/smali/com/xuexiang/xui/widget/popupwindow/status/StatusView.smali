.class public Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field private static final DISMISS_ON_COMPLETE_DELAY:I = 0x3e8


# instance fields
.field private mAutoDismissOnComplete:Ljava/lang/Runnable;

.field private mCompleteView:Landroid/view/View;

.field private mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

.field private mCustomView:Landroid/view/View;

.field private mErrorView:Landroid/view/View;

.field private mHandler:Landroid/os/Handler;

.field private mHideOnComplete:Z

.field private mLoadingView:Landroid/view/View;

.field private mSlideIn:Landroid/view/animation/Animation;

.field private mSlideOut:Landroid/view/animation/Animation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIII)V
    .locals 7

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 7
    invoke-direct/range {v0 .. v6}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIII)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->StatusViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHideOnComplete:Z

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mAutoDismissOnComplete:Ljava/lang/Runnable;

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIII)V
    .locals 8

    .line 8
    sget v3, Lcom/xuexiang/xui/R$attr;->StatusViewStyle:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIIII)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIIII)V
    .locals 1

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHideOnComplete:Z

    .line 11
    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mAutoDismissOnComplete:Ljava/lang/Runnable;

    .line 12
    invoke-direct/range {p0 .. p7}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->init(Landroid/content/Context;Landroid/util/AttributeSet;IIIII)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Lcom/xuexiang/xui/widget/popupwindow/status/Status;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    return-object p0
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Lcom/xuexiang/xui/widget/popupwindow/status/Status;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    return-object p1
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->getCurrentView(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->exitAnimation(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mAutoDismissOnComplete:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideOut:Landroid/view/animation/Animation;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideIn:Landroid/view/animation/Animation;

    return-object p0
.end method

.method private enterAnimation(Landroid/view/View;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideIn:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private exitAnimation(Landroid/view/View;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideOut:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideOut:Landroid/view/animation/Animation;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$3;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method private getCurrentView(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->COMPLETE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    if-ne p1, v0, :cond_1

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    return-object p1

    .line 4
    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->ERROR:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    if-ne p1, v0, :cond_2

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    return-object p1

    .line 6
    :cond_2
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->LOADING:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    if-ne p1, v0, :cond_3

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    return-object p1

    .line 8
    :cond_3
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->CUSTOM:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    if-ne p1, v0, :cond_4

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    return-object p1

    :cond_4
    return-object v1
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;IIIII)V
    .locals 5

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$anim;->sv_slide_in:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideIn:Landroid/view/animation/Animation;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$anim;->sv_slide_out:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideOut:Landroid/view/animation/Animation;

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHandler:Landroid/os/Handler;

    .line 6
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->StatusView:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_complete:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_error:I

    invoke-virtual {p1, p3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    .line 9
    sget v1, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_loading:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 10
    sget v3, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_custom:I

    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 11
    sget v3, Lcom/xuexiang/xui/R$styleable;->StatusView_sv_dismissOnComplete:I

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHideOnComplete:Z

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHideOnComplete:Z

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    move p4, p2

    :goto_0
    const/4 p2, 0x0

    .line 12
    invoke-virtual {v0, p4, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    iput-object p4, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    if-eqz p5, :cond_1

    goto :goto_1

    :cond_1
    move p5, p3

    .line 13
    :goto_1
    invoke-virtual {v0, p5, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    if-eqz p6, :cond_2

    goto :goto_2

    :cond_2
    move p6, v1

    .line 14
    :goto_2
    invoke-virtual {v0, p6, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    if-eqz p7, :cond_3

    goto :goto_3

    :cond_3
    move p7, v2

    .line 15
    :goto_3
    invoke-virtual {v0, p7, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    const/4 p4, -0x1

    invoke-direct {p3, p4, p4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, p4, p4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, p4, p4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, p4, p4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 21
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 22
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 23
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 24
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    const/4 p3, 0x4

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 25
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 27
    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 28
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v7}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->init(Landroid/content/Context;Landroid/util/AttributeSet;IIIII)V

    return-void
.end method

.method private switchAnimation(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->clearAnimation()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideOut:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mSlideOut:Landroid/view/animation/Animation;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView$2;-><init>(Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->setStatus(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)V

    return-void
.end method

.method public getCompleteView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    return-object v0
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    return-object v0
.end method

.method public getErrorView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    return-object v0
.end method

.method public getLoadingView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    return-object v0
.end method

.method public getStatus()Lcom/xuexiang/xui/widget/popupwindow/status/Status;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    return-object v0
.end method

.method public setCustomViewTitle(ILjava/lang/String;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p1
.end method

.method public setHideOnComplete(Z)Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHideOnComplete:Z

    return-object p0
.end method

.method public setOnCompleteClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCompleteView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnCustomClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCustomView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnErrorClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mErrorView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnLoadingClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mLoadingView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setStatus(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    sget-object v1, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->NONE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    if-ne v0, v1, :cond_0

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->getCurrentView(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->enterAnimation(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    if-eq p1, v1, :cond_1

    .line 5
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->getCurrentView(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->getCurrentView(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->switchAnimation(Landroid/view/View;Landroid/view/View;)V

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mCurrentStatus:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    goto :goto_0

    .line 7
    :cond_1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->getCurrentView(Lcom/xuexiang/xui/widget/popupwindow/status/Status;)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->exitAnimation(Landroid/view/View;)V

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    sget-object v0, Lcom/xuexiang/xui/widget/popupwindow/status/Status;->COMPLETE:Lcom/xuexiang/xui/widget/popupwindow/status/Status;

    if-ne p1, v0, :cond_2

    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHideOnComplete:Z

    if-eqz p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/status/StatusView;->mAutoDismissOnComplete:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method
