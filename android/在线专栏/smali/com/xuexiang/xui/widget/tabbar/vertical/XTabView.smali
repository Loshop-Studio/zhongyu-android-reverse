.class public Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;
.super Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;
.source "SourceFile"


# instance fields
.field private mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

.field private mChecked:Z

.field private mContext:Landroid/content/Context;

.field private mDefaultBackground:Landroid/graphics/drawable/Drawable;

.field private mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

.field private mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

.field private mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

.field private mTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mContext:Landroid/content/Context;

    .line 3
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon$Builder;->build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    .line 4
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge$Builder;->build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initView()V

    const/4 p1, 0x1

    new-array p1, p1, [I

    const v0, 0x101045c

    const/4 v1, 0x0

    aput v0, p1, v1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 8
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mDefaultBackground:Landroid/graphics/drawable/Drawable;

    .line 9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setDefaultBackground()V

    return-void
.end method

.method private initBadge()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;->bindTab(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBackgroundColor()I

    move-result v0

    const v1, -0x17b1c0

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBackgroundColor()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeBackgroundColor(I)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeTextColor()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeTextColor()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeTextColor(I)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getStrokeColor()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getStrokeWidth()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_3

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getStrokeColor()I

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getStrokeWidth()F

    move-result v3

    invoke-interface {v0, v2, v3, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->stroke(IFZ)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getDrawableBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->isDrawableBackgroundClip()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getDrawableBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->isDrawableBackgroundClip()Z

    move-result v3

    invoke-interface {v0, v2, v3}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeBackground(Landroid/graphics/drawable/Drawable;Z)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 10
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeTextSize()F

    move-result v0

    const/high16 v2, 0x41300000    # 11.0f

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_6

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeTextSize()F

    move-result v2

    invoke-interface {v0, v2, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeTextSize(FZ)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 12
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgePadding()F

    move-result v0

    const/high16 v2, 0x40a00000    # 5.0f

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_7

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgePadding()F

    move-result v2

    invoke-interface {v0, v2, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgePadding(FZ)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 14
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeNumber()I

    move-result v0

    if-eqz v0, :cond_8

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeNumber()I

    move-result v2

    invoke-interface {v0, v2}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeNumber(I)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 16
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeText(Ljava/lang/String;)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 18
    :cond_9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeGravity()I

    move-result v0

    const v2, 0x800035

    if-eq v0, v2, :cond_a

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getBadgeGravity()I

    move-result v2

    invoke-interface {v0, v2}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setBadgeGravity(I)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 20
    :cond_a
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getGravityOffsetX()I

    move-result v0

    if-ne v0, v1, :cond_b

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getGravityOffsetY()I

    move-result v0

    if-eq v0, v1, :cond_c

    .line 21
    :cond_b
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getGravityOffsetX()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getGravityOffsetY()I

    move-result v3

    int-to-float v3, v3

    invoke-interface {v0, v2, v3, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setGravityOffset(FFZ)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 22
    :cond_c
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->isExactMode()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->isExactMode()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setExactMode(Z)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 24
    :cond_d
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->isShowShadow()Z

    move-result v0

    if-nez v0, :cond_e

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->isShowShadow()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setShowShadow(Z)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    .line 26
    :cond_e
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getOnDragStateChangedListener()Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;

    move-result-object v0

    if-eqz v0, :cond_f

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;->getOnDragStateChangedListener()Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/textview/badge/Badge;->setOnDragStateChangedListener(Lcom/xuexiang/xui/widget/textview/badge/Badge$OnDragStateChangedListener;)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    :cond_f
    return-void
.end method

.method private initIconView()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mChecked:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getSelectedIcon()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getNormalIcon()I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getIconWidth()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getIconWidth()I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 4
    :goto_1
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v4}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getIconHeight()I

    move-result v4

    if-eq v4, v3, :cond_2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v3}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getIconHeight()I

    move-result v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    :goto_2
    const/4 v4, 0x0

    .line 5
    invoke-virtual {v0, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    goto :goto_3

    :cond_3
    move-object v0, v1

    .line 6
    :goto_3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getIconGravity()I

    move-result v2

    const/16 v3, 0x30

    if-eq v2, v3, :cond_7

    const/16 v3, 0x50

    if-eq v2, v3, :cond_6

    const v3, 0x800003

    if-eq v2, v3, :cond_5

    const v3, 0x800005

    if-eq v2, v3, :cond_4

    goto :goto_4

    .line 7
    :cond_4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v1, v0, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_4

    .line 8
    :cond_5
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_4

    .line 9
    :cond_6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v1, v1, v0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_4

    .line 10
    :cond_7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v0, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 11
    :goto_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->refreshDrawablePadding()V

    return-void
.end method

.method private initTitleView()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getColorSelected()I

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getColorNormal()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getTitleTextSize()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->refreshDrawablePadding()V

    return-void
.end method

.method private initView()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mContext:Landroid/content/Context;

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setMinimumHeight(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    .line 4
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x11

    .line 5
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initTitleView()V

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initIconView()V

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initBadge()V

    return-void
.end method

.method private refreshDrawablePadding()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mChecked:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getSelectedIcon()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getNormalIcon()I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablePadding()I

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getMargin()I

    move-result v2

    if-eq v0, v2, :cond_1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;->getMargin()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    goto :goto_1

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    goto :goto_1

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method private setDefaultBackground()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mDefaultBackground:Landroid/graphics/drawable/Drawable;

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getBadge()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    return-object v0
.end method

.method public getBadgeView()Lcom/xuexiang/xui/widget/textview/badge/Badge;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mBadgeView:Lcom/xuexiang/xui/widget/textview/badge/Badge;

    return-object v0
.end method

.method public getIcon()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    return-object v0
.end method

.method public getIconView()Landroid/widget/ImageView;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    return-object v0
.end method

.method public getTitleView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    return-object v0
.end method

.method public isChecked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mChecked:Z

    return v0
.end method

.method public bridge synthetic setBackground(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(I)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object p1

    return-object p1
.end method

.method public setBackground(I)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;
    .locals 0

    if-nez p1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setDefaultBackground()V

    goto :goto_0

    :cond_0
    if-gtz p1, :cond_1

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V

    :goto_0
    return-object p0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(I)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    return-void
.end method

.method public bridge synthetic setBadge(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBadge(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object p1

    return-object p1
.end method

.method public setBadge(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabBadge:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabBadge;

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initBadge()V

    return-object p0
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mChecked:Z

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setSelected(Z)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->refreshDrawableState()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getColorSelected()I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;->getColorNormal()I

    move-result p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initIconView()V

    return-void
.end method

.method public bridge synthetic setIcon(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setIcon(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object p1

    return-object p1
.end method

.method public setIcon(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabIcon:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabIcon;

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initIconView()V

    return-object p0
.end method

.method public setPadding(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPadding(IIII)V

    return-void
.end method

.method public setPaddingRelative(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    return-void
.end method

.method public bridge synthetic setTitle(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setTitle(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;

    move-result-object p1

    return-object p1
.end method

.method public setTitle(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;)Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;
    .locals 0

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mTabTitle:Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->initTitleView()V

    return-object p0
.end method

.method public toggle()V
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->mChecked:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setChecked(Z)V

    return-void
.end method
