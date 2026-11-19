.class public Lcom/xuexiang/xui/widget/behavior/ToolBarBehavior;
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
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->canInit:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p2}, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->get(Landroid/view/View;)Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->mAnimateHelper:Lcom/xuexiang/xui/widget/behavior/AnimateHelper;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->canInit:Z

    .line 4
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method protected onNestPreScrollInit(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->isFirstMove:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->isFirstMove:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->mAnimateHelper:Lcom/xuexiang/xui/widget/behavior/AnimateHelper;

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/behavior/AnimateHelper;->setStartY(F)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/behavior/BaseBehavior;->mAnimateHelper:Lcom/xuexiang/xui/widget/behavior/AnimateHelper;

    sget v0, Lcom/xuexiang/xui/widget/behavior/TranslateAnimateHelper;->MODE_TITLE:I

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/behavior/AnimateHelper;->setMode(I)V

    :cond_0
    return-void
.end method
