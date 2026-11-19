.class public abstract Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# static fields
.field private static final DEFAULT_SPLASH_DURATION_MILLIS:I = 0x1f4


# instance fields
.field protected mWelcomeLayout:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method private initView()V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    .line 2
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method private startSplashAnim(Landroid/view/animation/Animation;)V
    .locals 2

    const-string v0, "Splash Animation can not be null"

    .line 1
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/Utils;->checkNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->getSplashDurationMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity$1;-><init>(Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method


# virtual methods
.method protected getSplashDurationMillis()J
    .locals 2

    const-wide/16 v0, 0x1f4

    return-wide v0
.end method

.method protected getSplashImgResId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected initSplashView(I)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    invoke-static {p0, v0, p1}, Lcom/xuexiang/xui/utils/Utils;->setBackground(Landroid/content/Context;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->initView()V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->getSplashImgResId()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->initSplashView(I)V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->onCreateActivity()V

    return-void
.end method

.method protected abstract onCreateActivity()V
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->mWelcomeLayout:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/Utils;->recycleBackground(Landroid/view/View;)V

    .line 2
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method protected abstract onSplashFinished()V
.end method

.method protected startSplash(Z)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_0

    .line 1
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-direct {p1, v1, v0}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->startSplashAnim(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 2
    :cond_0
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    invoke-direct {p1, v0, v0}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/activity/BaseSplashActivity;->startSplashAnim(Landroid/view/animation/Animation;)V

    :goto_0
    return-void
.end method
