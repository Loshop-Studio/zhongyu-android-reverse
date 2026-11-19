.class public Lcom/xuexiang/xui/widget/behavior/BottomNavigationViewBehavior;
.super Lcom/xuexiang/xui/widget/behavior/BaseBehavior;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->canInit:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->canInit:Z

    .line 3
    invoke-static {p2}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->get(Landroid/view/View;)Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->mAnimateHelper:Lcom/xuexiang/xui/widget/behavior/AnimateHelper;

    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getY()F

    move-result v1

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/behavior/AnimateHelper;->setStartY(F)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->mAnimateHelper:Lcom/xuexiang/xui/widget/behavior/AnimateHelper;

    sget v1, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_BOTTOM:I

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/behavior/AnimateHelper;->setMode(I)V

    .line 6
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method protected onNestPreScrollInit(Landroid/view/View;)V
    .locals 0

    return-void
.end method
