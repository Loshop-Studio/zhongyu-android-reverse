.class public Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field private static final MSG_ONE_CHILD:Ljava/lang/String; = "StatefulLayout must have one child!"


# instance fields
.field private mAnimCounter:I

.field private mAnimationEnabled:Z

.field private mBtnRetry:Landroid/widget/Button;

.field private mContent:Landroid/view/View;

.field private mImage:Landroid/widget/ImageView;

.field private mInAnimation:Landroid/view/animation/Animation;

.field private mLlContainer:Landroid/widget/LinearLayout;

.field private mMessage:Landroid/widget/TextView;

.field private mOutAnimation:Landroid/view/animation/Animation;

.field private mProgressBar:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->StatefulLayoutStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimCounter:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;)Landroid/view/animation/Animation;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mInAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->state(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    return-void
.end method

.method private getString(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->StatefulLayout:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->StatefulLayout_stf_animationEnabled:I

    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object p3

    invoke-virtual {p3}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object p3

    iget-boolean p3, p3, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->animationEnabled:Z

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimationEnabled:Z

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->StatefulLayout_stf_inAnimation:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eq p2, p3, :cond_0

    .line 4
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->loadAnimation(I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mInAnimation:Landroid/view/animation/Animation;

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget-object v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->inAnimation:Landroid/view/animation/Animation;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mInAnimation:Landroid/view/animation/Animation;

    .line 6
    :goto_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->StatefulLayout_stf_outAnimation:I

    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eq p2, p3, :cond_1

    .line 7
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->loadAnimation(I)Landroid/view/animation/Animation;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    goto :goto_1

    .line 8
    :cond_1
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object p2

    invoke-virtual {p2}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object p2

    iget-object p2, p2, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->outAnimation:Landroid/view/animation/Animation;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    .line 9
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private loadAnimation(I)Landroid/view/animation/Animation;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    return-object p1
.end method

.method private state(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mMessage:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    :goto_0
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mProgressBar:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mImage:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mBtnRetry:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_2

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mProgressBar:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 10
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getImageRes()I

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mImage:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getImageRes()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    :goto_1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getClickListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mBtnRetry:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mBtnRetry:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getClickListener()Landroid/view/View$OnClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mBtnRetry:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->getButtonText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 19
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mBtnRetry:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setVisibility(I)V

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public attachTemplate()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    .line 3
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_stateful_template:I

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 4
    sget v0, Lcom/xuexiang/xui/R$id;->stContainer:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    .line 5
    sget v0, Lcom/xuexiang/xui/R$id;->stProgress:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mProgressBar:Lcom/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar;

    .line 6
    sget v0, Lcom/xuexiang/xui/R$id;->stImage:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mImage:Landroid/widget/ImageView;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$id;->stMessage:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mMessage:Landroid/widget/TextView;

    .line 8
    sget v0, Lcom/xuexiang/xui/R$id;->stButton:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mBtnRetry:Landroid/widget/Button;

    return-void
.end method

.method public getInAnimation()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mInAnimation:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public getOutAnimation()Landroid/view/animation/Animation;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    return-object v0
.end method

.method public isAnimationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimationEnabled:Z

    return v0
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->attachTemplate()V

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StatefulLayout must have one child!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setAnimationEnabled(Z)Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimationEnabled:Z

    return-object p0
.end method

.method public setInAnimation(I)Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->loadAnimation(I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mInAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public setInAnimation(Landroid/view/animation/Animation;)Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mInAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public setOutAnimation(I)Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->loadAnimation(I)Landroid/view/animation/Animation;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public setOutAnimation(Landroid/view/animation/Animation;)Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    return-object p0
.end method

.method public showContent()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->isAnimationEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimCounter:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimCounter:I

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    new-instance v2, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;

    invoke-direct {v2, p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$1;-><init>(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;I)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->isAnimationEnabled()Z

    move-result v0

    const/16 v1, 0x8

    if-eqz v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 5
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimCounter:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mAnimCounter:I

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v2

    if-ne v2, v1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    new-instance v2, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$2;

    invoke-direct {v2, p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$2;-><init>(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;I)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 10
    :cond_1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->state(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    goto :goto_0

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    new-instance v2, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;

    invoke-direct {v2, p0, v0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout$3;-><init>(Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;ILcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mContent:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->mLlContainer:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 16
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->state(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    :goto_0
    return-void
.end method

.method public showEmpty()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyMessageRes:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showEmpty(I)V

    return-void
.end method

.method public showEmpty(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showEmpty(Ljava/lang/String;)V

    return-void
.end method

.method public showEmpty(Ljava/lang/String;)V
    .locals 1

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->message(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 5
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->emptyImageRes:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->image(I)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    return-void
.end method

.method public showError(ILandroid/view/View$OnClickListener;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showError(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showError(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorMessageRes:I

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showError(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showError(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->retryMessageRes:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showError(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showError(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;-><init>()V

    .line 5
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->message(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 6
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->errorImageRes:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->image(I)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->buttonText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->buttonClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    return-void
.end method

.method public showLoading()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->loadingMessageRes:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showLoading(I)V

    return-void
.end method

.method public showLoading(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showLoading(Ljava/lang/String;)V

    return-void
.end method

.method public showLoading(Ljava/lang/String;)V
    .locals 1

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->message(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->loading()Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    return-void
.end method

.method public showLocationOff(ILandroid/view/View$OnClickListener;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showLocationOff(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showLocationOff(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffMessageRes:I

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showLocationOff(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showLocationOff(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->retryMessageRes:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showLocationOff(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showLocationOff(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;-><init>()V

    .line 5
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->message(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 6
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->locationOffImageRes:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->image(I)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->buttonText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->buttonClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    return-void
.end method

.method public showOffline(ILandroid/view/View$OnClickListener;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showOffline(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showOffline(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineMessageRes:I

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showOffline(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showOffline(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->retryMessageRes:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showOffline(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public showOffline(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;-><init>()V

    .line 5
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->message(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 6
    invoke-static {}, Lcom/xuexiang/xui/UIConfig;->getInstance()Lcom/xuexiang/xui/UIConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/UIConfig;->getStateLayoutConfig()Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;

    move-result-object v0

    iget v0, v0, Lcom/xuexiang/xui/widget/statelayout/StateLayoutConfig;->offlineImageRes:I

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->image(I)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->buttonText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;->buttonClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatefulLayout;->showCustom(Lcom/xuexiang/xui/widget/statelayout/CustomStateOptions;)V

    return-void
.end method
