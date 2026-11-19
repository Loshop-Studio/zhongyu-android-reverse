.class public Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
.super Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnCheckedChangeListener;,
        Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;
    }
.end annotation


# instance fields
.field private mCheckedColor:I

.field private mIsChecked:Z

.field private mIsDialog:Z

.field private mNormalColor:I

.field private mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnCheckedChangeListener;

.field private mOnClickListenWrapper:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;

.field private mShakeAnimator:Landroid/animation/ValueAnimator;

.field private mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

.field mWindow:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/Window;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->ShineButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 4
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    .line 5
    new-instance p3, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    invoke-direct {p3}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->initButton(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mCheckedColor:I

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    return p0
.end method

.method static synthetic access$102(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    return p1
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mNormalColor:I

    return p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->onCheckedChanged(Z)V

    return-void
.end method

.method private doShareAnim()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [F

    .line 1
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    .line 2
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xb4

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->invalidate()V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$1;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$2;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3ecccccd    # 0.4f
        0x3f800000    # 1.0f
        0x3f666666    # 0.9f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private initButton(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->ShineButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_normal_color:I

    sget v1, Lcom/xuexiang/xui/R$color;->default_sb_normal_color:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mNormalColor:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_checked_color:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mCheckedColor:I

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_allow_random_color:I

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->allowRandomColor:Z

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_animation_duration:I

    iget-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->animDuration:J

    long-to-int v4, v3

    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    int-to-long v3, v1

    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->animDuration:J

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_click_animation_duration:I

    iget-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->clickAnimDuration:J

    long-to-int v4, v3

    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    int-to-long v3, v1

    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->clickAnimDuration:J

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_enable_flashing:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->enableFlashing:Z

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_distance_multiple:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineDistanceMultiple:F

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineDistanceMultiple:F

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_count:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineCount:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineCount:I

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_size:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineSize:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineSize:I

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_shine_turn_angle:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineTurnAngle:F

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineTurnAngle:F

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_small_shine_offset_angle:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineOffsetAngle:F

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineOffsetAngle:F

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_small_shine_color:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineColor:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineColor:I

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    sget v1, Lcom/xuexiang/xui/R$styleable;->ShineButton_sb_big_shine_color:I

    iget v2, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->bigShineColor:I

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->bigShineColor:I

    .line 15
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 16
    iget p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mNormalColor:I

    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 17
    instance-of p2, p1, Landroid/app/Activity;

    if-eqz p2, :cond_0

    .line 18
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->initWindow(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method private onCheckedChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnCheckedChangeListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnCheckedChangeListener;->onCheckedChanged(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Z)V

    :cond_0
    return-void
.end method

.method private setChecked(ZZZ)V
    .locals 1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    if-eqz p1, :cond_0

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mCheckedColor:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    if-eqz p2, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->showAnim()V

    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mNormalColor:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    if-eqz p2, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setCancel()V

    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 9
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->onCheckedChanged(Z)V

    :cond_2
    return-void
.end method


# virtual methods
.method public enableFlashing(Z)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->enableFlashing:Z

    return-object p0
.end method

.method public fitDialog(Landroid/app/Dialog;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mWindow:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsDialog:Z

    return-void
.end method

.method public fitFragment(Landroidx/fragment/app/Fragment;)V
    .locals 0

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->initWindow(Landroid/app/Activity;)V

    return-void
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mCheckedColor:I

    return v0
.end method

.method public getWindow()Landroid/view/Window;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mWindow:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Window;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public initWindow(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->initWindow(Landroid/view/Window;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsDialog:Z

    return-void
.end method

.method public initWindow(Landroid/view/Window;)V
    .locals 1

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mWindow:Ljava/lang/ref/WeakReference;

    .line 4
    new-instance p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;-><init>(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mOnClickListenWrapper:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public isChecked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsChecked:Z

    return v0
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public setAllowRandomColor(Z)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput-boolean p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->allowRandomColor:Z

    return-object p0
.end method

.method public setAnimDuration(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    int-to-long v1, p1

    iput-wide v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->animDuration:J

    return-object p0
.end method

.method public setBigShineColor(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->bigShineColor:I

    return-object p0
.end method

.method public setCancel()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mNormalColor:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShakeAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, v0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setChecked(ZZZ)V

    return-void
.end method

.method public setChecked(ZZ)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setChecked(ZZZ)V

    return-void
.end method

.method public setCheckedColor(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mCheckedColor:I

    return-object p0
.end method

.method public setClickAnimDuration(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    int-to-long v1, p1

    iput-wide v1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->clickAnimDuration:J

    return-object p0
.end method

.method public setIconResource(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterShapeImageView;->setIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setNormalColor(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mNormalColor:I

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->setTintColor(I)V

    return-object p0
.end method

.method public setOnCheckStateChangeListener(Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnCheckedChangeListener;)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnCheckedChangeListener;

    return-object p0
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mOnClickListenWrapper:Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton$OnClickListenWrapper;->wrapListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setShineCount(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineCount:I

    return-object p0
.end method

.method public setShineDistanceMultiple(F)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineDistanceMultiple:F

    return-object p0
.end method

.method public setShineSize(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineSize:I

    return-object p0
.end method

.method public setShineTurnAngle(F)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->shineTurnAngle:F

    return-object p0
.end method

.method public setSmallShineColor(I)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineColor:I

    return-object p0
.end method

.method public setSmallShineOffAngle(F)Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    iput p1, v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;->smallShineOffsetAngle:F

    return-object p0
.end method

.method public showAnim()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mShineParams:Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;

    invoke-direct {v0, v1, p0, v2}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineView;-><init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;Lcom/xuexiang/xui/widget/button/shinebutton/ShineView$ShineParams;)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 4
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->mIsDialog:Z

    if-eqz v2, :cond_0

    const v2, 0x1020002

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 6
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {v3, v4, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->doShareAnim()V

    :cond_1
    return-void
.end method

.method public toggle()V
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/shinebutton/ShineButton;->setChecked(Z)V

    return-void
.end method
