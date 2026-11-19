.class final Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final DEFAULT_COOKIE_DURATION:J = 0x7d0L


# instance fields
.field private mBtnAction:Landroid/widget/TextView;

.field private mBtnActionWithIcon:Landroid/widget/ImageView;

.field private mDuration:J

.field private mGravity:I

.field private mIvIcon:Landroid/widget/ImageView;

.field private mLayoutCookie:Landroid/widget/LinearLayout;

.field private mSlideOutAnimation:Landroid/view/animation/Animation;

.field private mTvMessage:Landroid/widget/TextView;

.field private mTvTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p2, 0x7d0

    .line 4
    iput-wide p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mDuration:J

    const/16 p2, 0x50

    .line 5
    iput p2, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->initViews(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)J
    .locals 2

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mDuration:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->destroy()V

    return-void
.end method

.method private createInAnim()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    const/16 v2, 0x50

    if-ne v1, v2, :cond_0

    sget v1, Lcom/xuexiang/xui/R$anim;->cookiebar_slide_in_from_bottom:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/xuexiang/xui/R$anim;->cookiebar_slide_in_from_top:I

    :goto_0
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$3;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private createOutAnim()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    const/16 v2, 0x50

    if-ne v1, v2, :cond_0

    sget v1, Lcom/xuexiang/xui/R$anim;->cookiebar_slide_out_to_bottom:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/xuexiang/xui/R$anim;->cookiebar_slide_out_to_top:I

    :goto_0
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mSlideOutAnimation:Landroid/view/animation/Animation;

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$4;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method private destroy()V
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$6;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private initDefaultStyle(Landroid/content/Context;)V
    .locals 5

    .line 1
    sget v0, Lcom/xuexiang/xui/R$attr;->cookieTitleColor:I

    const/4 v1, -0x1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result v0

    .line 2
    sget v2, Lcom/xuexiang/xui/R$attr;->cookieMessageColor:I

    invoke-static {p1, v2, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result v2

    .line 3
    sget v3, Lcom/xuexiang/xui/R$attr;->cookieActionColor:I

    invoke-static {p1, v3, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result v1

    .line 4
    sget v3, Lcom/xuexiang/xui/R$attr;->cookieBackgroundColor:I

    sget v4, Lcom/xuexiang/xui/R$color;->cookie_bar_default_bg_color:I

    .line 5
    invoke-static {p1, v4}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result v4

    .line 6
    invoke-static {p1, v3, v4}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p1

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mLayoutCookie:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    return-void
.end method

.method private initViews(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_cookie:I

    invoke-static {v0, v1, p0}, Landroid/widget/LinearLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->cookie:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mLayoutCookie:Landroid/widget/LinearLayout;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->tv_title:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvTitle:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/xuexiang/xui/R$id;->tv_message:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvMessage:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/xuexiang/xui/R$id;->iv_icon:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mIvIcon:Landroid/widget/ImageView;

    .line 6
    sget v0, Lcom/xuexiang/xui/R$id;->btn_action:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$id;->btn_action_with_icon:I

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnActionWithIcon:Landroid/widget/ImageView;

    .line 8
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->initDefaultStyle(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mSlideOutAnimation:Landroid/view/animation/Animation;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$5;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$5;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mSlideOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public getLayoutGravity()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    const/4 v5, 0x0

    .line 2
    iget-object p3, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mLayoutCookie:Landroid/widget/LinearLayout;

    invoke-virtual {p3}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v6, p4

    invoke-super/range {v2 .. v7}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    :goto_0
    return-void
.end method

.method public setParams(Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V
    .locals 4

    if-eqz p1, :cond_9

    .line 1
    iget-wide v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->duration:J

    iput-wide v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mDuration:J

    .line 2
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->layoutGravity:I

    iput v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    .line 3
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->iconResId:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mIvIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mIvIcon:Landroid/widget/ImageView;

    iget v2, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->iconResId:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 6
    :cond_0
    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->title:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvTitle:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->titleColor:I

    if-eqz v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvTitle:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->titleColor:I

    invoke-static {v2, v3}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    :cond_1
    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->message:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvMessage:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->message:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->messageColor:I

    if-eqz v0, :cond_2

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvMessage:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->messageColor:I

    invoke-static {v2, v3}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    :cond_2
    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->title:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mTvMessage:Landroid/widget/TextView;

    .line 18
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 19
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 20
    :cond_3
    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->action:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->actionIcon:I

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->onActionClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_5

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->action:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    new-instance v2, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$1;

    invoke-direct {v2, p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->actionColor:I

    if-eqz v0, :cond_5

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->actionColor:I

    invoke-static {v2, v3}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    :cond_5
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->actionIcon:I

    if-eqz v0, :cond_6

    iget-object v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->onActionClickListener:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_6

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnAction:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnActionWithIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnActionWithIcon:Landroid/widget/ImageView;

    iget v1, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->actionIcon:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mBtnActionWithIcon:Landroid/widget/ImageView;

    new-instance v1, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie$2;-><init>(Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    :cond_6
    iget v0, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->backgroundColor:I

    if-eqz v0, :cond_7

    .line 32
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mLayoutCookie:Landroid/widget/LinearLayout;

    .line 33
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    iget p1, p1, Lcom/xuexiang/xui/widget/popupwindow/bar/CookieBar$Params;->backgroundColor:I

    invoke-static {v1, p1}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 34
    :cond_7
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_config_content_spacing_horizontal:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    .line 35
    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mGravity:I

    const/16 v1, 0x50

    if-ne v0, v1, :cond_8

    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->mLayoutCookie:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 37
    :cond_8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->createInAnim()V

    .line 38
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/popupwindow/bar/Cookie;->createOutAnim()V

    :cond_9
    return-void
.end method
