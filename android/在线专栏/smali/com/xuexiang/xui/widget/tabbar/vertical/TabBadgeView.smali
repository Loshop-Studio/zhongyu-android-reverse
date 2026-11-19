.class public Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;
.super Lcom/xuexiang/xui/widget/textview/badge/BadgeView;
.source "SourceFile"


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static bindTab(Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;)Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 3
    instance-of v2, v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    if-eqz v2, :cond_0

    .line 4
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_2

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;-><init>(Landroid/content/Context;)V

    .line 6
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    :cond_2
    iput-object p0, v1, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->mTargetView:Landroid/view/View;

    return-object v1
.end method


# virtual methods
.method protected screenFromWindow(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, -0x1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->mActivityRoot:Landroid/view/ViewGroup;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->mTargetView:Landroid/view/View;

    instance-of v1, p1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    if-eqz v1, :cond_2

    .line 5
    check-cast p1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->bindTarget(Landroid/view/View;)Lcom/xuexiang/xui/widget/textview/badge/Badge;

    :goto_0
    return-void
.end method
