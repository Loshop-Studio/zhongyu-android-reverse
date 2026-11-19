.class public Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
.super Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;",
        ">",
        "Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;"
    }
.end annotation


# instance fields
.field protected mAdapter:Landroid/widget/ExpandableListAdapter;

.field protected mExpandableListView:Landroid/widget/ExpandableListView;

.field private mHasDivider:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid/widget/ExpandableListAdapter;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;-><init>(Landroid/content/Context;I)V

    .line 3
    iput-object p3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mAdapter:Landroid/widget/ExpandableListAdapter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/ExpandableListAdapter;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;-><init>(Landroid/content/Context;)V

    .line 5
    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mAdapter:Landroid/widget/ExpandableListAdapter;

    return-void
.end method

.method private updateDivider(Landroid/widget/ExpandableListView;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mHasDivider:Z

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 3
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/widget/ExpandableListView;->setChildDivider(Landroid/graphics/drawable/Drawable;)V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lcom/xuexiang/xui/XUI;->isTablet()Z

    move-result v1

    if-eqz v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v1, 0x3f000000    # 0.5f

    :goto_0
    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ExpandableListView;->setDividerHeight(I)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/ExpandableListView;->setChildDivider(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public clearExpandStatus()V
    .locals 0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->collapseAllGroup()V

    return-void
.end method

.method public collapseAllGroup()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getExpandableListAdapter()Landroid/widget/ExpandableListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ExpandableListAdapter;->getGroupCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {v2, v1}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {v2, v1}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public create(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->create(II)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;

    move-result-object p1

    return-object p1
.end method

.method protected create(II)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 5
    new-instance v2, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p2}, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    .line 6
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, p1, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 7
    invoke-virtual {v2, v1, v0, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {p1, v2}, Landroid/widget/ExpandableListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 9
    :cond_0
    new-instance p2, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p2, v2}, Lcom/xuexiang/xui/widget/XUIWrapContentExpandableListView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    .line 10
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {p2, p1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 11
    invoke-virtual {p2, v1, v0, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {p1, p2}, Landroid/widget/ExpandableListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {p1, v0, v1, v0, v1}, Landroid/widget/ExpandableListView;->setPadding(IIII)V

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mAdapter:Landroid/widget/ExpandableListAdapter;

    invoke-virtual {p1, p2}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ExpandableListView;->setGroupIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {p1, v1}, Landroid/widget/ExpandableListView;->setVerticalScrollBarEnabled(Z)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/widget/ExpandableListView;->setOverScrollMode(I)V

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->updateDivider(Landroid/widget/ExpandableListView;)V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIPopup;->setContentView(Landroid/view/View;)V

    return-object p0
.end method

.method public create(IILandroid/widget/ExpandableListView$OnChildClickListener;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/widget/ExpandableListView$OnChildClickListener;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->create(II)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {p1, p3}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    return-object p0
.end method

.method public expandAllGroup()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getExpandableListAdapter()Landroid/widget/ExpandableListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ExpandableListAdapter;->getGroupCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {v2, v1}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {v2, v1}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public expandOnlyOne(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ExpandableListView;->getExpandableListAdapter()Landroid/widget/ExpandableListAdapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/ExpandableListAdapter;->getGroupCount()I

    move-result v0

    const/4 v2, 0x1

    :goto_0
    if-ge v1, v0, :cond_2

    if-eq v1, p1, :cond_1

    .line 3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {v3, v1}, Landroid/widget/ExpandableListView;->isGroupExpanded(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    invoke-virtual {v3, v1}, Landroid/widget/ExpandableListView;->collapseGroup(I)Z

    move-result v3

    and-int/2addr v2, v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public getAdapter()Landroid/widget/ExpandableListAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mAdapter:Landroid/widget/ExpandableListAdapter;

    return-object v0
.end method

.method public getExpandableListView()Landroid/widget/ExpandableListView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    return-object v0
.end method

.method public setChildDivider(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setChildDivider(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setDividerHeight(I)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setDividerHeight(I)V

    :cond_0
    return-object p0
.end method

.method public setEnableOnlyExpandOne(Z)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup$1;-><init>(Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;)V

    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setOnGroupExpandListener(Landroid/widget/ExpandableListView$OnGroupExpandListener;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setOnGroupExpandListener(Landroid/widget/ExpandableListView$OnGroupExpandListener;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setGroupDivider(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setHasDivider(Z)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mHasDivider:Z

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz p1, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->updateDivider(Landroid/widget/ExpandableListView;)V

    :cond_0
    return-object p0
.end method

.method public setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ExpandableListView$OnChildClickListener;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ExpandableListView$OnGroupClickListener;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIExpandableListPopup;->mExpandableListView:Landroid/widget/ExpandableListView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    :cond_0
    return-object p0
.end method
