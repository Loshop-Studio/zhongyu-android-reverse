.class public final Lcom/xuexiang/xui/utils/WidgetUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "u can\'t instantiate me..."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static addTabWithoutRipple(Lcom/google/android/material/tabs/TabLayout;Ljava/lang/CharSequence;I)Lcom/google/android/material/tabs/TabLayout$Tab;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    .line 2
    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 3
    invoke-virtual {v0, p2}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 4
    iget-object p1, v0, Lcom/google/android/material/tabs/TabLayout$Tab;->view:Lcom/google/android/material/tabs/TabLayout$TabView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-object v0
.end method

.method public static addTabWithoutRipple(Lcom/google/android/material/tabs/TabLayout;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)Lcom/google/android/material/tabs/TabLayout$Tab;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->setText(Ljava/lang/CharSequence;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 8
    invoke-virtual {v0, p2}, Lcom/google/android/material/tabs/TabLayout$Tab;->setIcon(Landroid/graphics/drawable/Drawable;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 9
    iget-object p1, v0, Lcom/google/android/material/tabs/TabLayout$Tab;->view:Lcom/google/android/material/tabs/TabLayout$TabView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    return-object v0
.end method

.method public static clearActivityBackground(Landroid/app/Activity;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/WidgetUtils;->clearWindowBackground(Landroid/view/Window;)V

    return-void
.end method

.method public static clearAllViewBackground(Landroid/view/View;)V
    .locals 4

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    move-object v0, p0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 4
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lcom/xuexiang/xui/utils/WidgetUtils;->clearAllViewBackground(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static clearViewBackground(Landroid/view/View;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static clearWindowBackground(Landroid/view/Window;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static findActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 3
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Landroid/content/ContextWrapper;

    .line 5
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/xuexiang/xui/utils/WidgetUtils;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getChangePayload(Ljava/util/List;)Landroid/os/Bundle;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Landroid/os/Bundle;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 3
    instance-of v2, v1, Landroid/os/Bundle;

    if-eqz v2, :cond_1

    .line 4
    check-cast v1, Landroid/os/Bundle;

    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static getLoadingDialog(Landroid/content/Context;)Lcom/xuexiang/xui/widget/dialog/LoadingDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static getLoadingDialog(Landroid/content/Context;Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/LoadingDialog;
    .locals 1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static getMessageLoader(ZLandroid/content/Context;)Lcom/xuexiang/xui/widget/progress/loading/IMessageLoader;
    .locals 0

    if-eqz p0, :cond_0

    new-instance p0, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingViewLayout;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object p0
.end method

.method public static getMiniLoadingDialog(Landroid/content/Context;)Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static getMiniLoadingDialog(Landroid/content/Context;Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;
    .locals 1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static initGridRecyclerView(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 3
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initGridRecyclerView(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 4
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 5
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;-><init>(Landroid/content/Context;II)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 6
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initGridRecyclerView(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 2

    .line 7
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 8
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 9
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initGridRecyclerView(Landroidx/recyclerview/widget/RecyclerView;ZIII)V
    .locals 2

    .line 10
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;->setScrollEnabled(Z)Lcom/xuexiang/xui/adapter/recyclerview/XGridLayoutManager;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 11
    new-instance p1, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0, p2, p3, p4}, Lcom/xuexiang/xui/adapter/recyclerview/GridDividerItemDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 12
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 2
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 3
    new-instance v0, Landroidx/recyclerview/widget/c;

    invoke-direct {v0}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initRecyclerView(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 4
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 5
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p1}, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;-><init>(Landroid/content/Context;II)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 6
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initRecyclerView(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3

    .line 7
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 8
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 9
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initRecyclerView(Landroidx/recyclerview/widget/RecyclerView;ZII)V
    .locals 2

    .line 10
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;->setScrollEnabled(Z)Lcom/xuexiang/xui/adapter/recyclerview/XLinearLayoutManager;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    .line 11
    new-instance p1, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, p2, p3}, Lcom/xuexiang/xui/adapter/recyclerview/DividerItemDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$n;)V

    .line 12
    new-instance p1, Landroidx/recyclerview/widget/c;

    invoke-direct {p1}, Landroidx/recyclerview/widget/c;-><init>()V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$l;)V

    return-void
.end method

.method public static initSpinnerItem(Landroid/widget/Spinner;[Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_spinner_selected_item:I

    sget v3, Lcom/xuexiang/xui/R$id;->spinner_item:I

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 2
    sget p1, Lcom/xuexiang/xui/R$layout;->xui_layout_spinner_drop_down_item:I

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public static initSpinnerStyle(Landroid/widget/Spinner;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_config_bg_spinner:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/Spinner;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_spinner_icon_padding_size:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/ViewUtils;->setPaddingEnd(Landroid/view/View;I)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$drawable;->ms_drop_down_bg_radius:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    invoke-static {p0}, Lcom/xuexiang/xui/utils/WidgetUtils;->setSpinnerDropDownVerticalOffset(Landroid/widget/Spinner;)V

    return-void
.end method

.method public static initSpinnerStyle(Landroid/widget/Spinner;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/xuexiang/xui/utils/WidgetUtils;->initSpinnerStyle(Landroid/widget/Spinner;)V

    .line 2
    invoke-static {p0, p1}, Lcom/xuexiang/xui/utils/WidgetUtils;->initSpinnerItem(Landroid/widget/Spinner;[Ljava/lang/String;)V

    return-void
.end method

.method public static requestFullScreen(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->requestWindowFeature(I)Z

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 v0, 0x400

    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method

.method public static setSpinnerDropDownVerticalOffset(Landroid/widget/Spinner;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->ms_item_height_size:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$attr;->ms_dropdown_offset:I

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v1

    add-int/2addr v0, v1

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V

    return-void
.end method

.method public static setTabLayoutTextFont(Lcom/google/android/material/tabs/TabLayout;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/xuexiang/xui/utils/WidgetUtils;->setTabLayoutTextFont(Lcom/google/android/material/tabs/TabLayout;Landroid/graphics/Typeface;)V

    return-void
.end method

.method public static setTabLayoutTextFont(Lcom/google/android/material/tabs/TabLayout;Landroid/graphics/Typeface;)V
    .locals 8

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 4
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 5
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 6
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 7
    instance-of v7, v6, Landroid/widget/TextView;

    if-eqz v7, :cond_1

    .line 8
    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public static transparentBottomSheetDialogBackground(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    sget v0, Lcom/xuexiang/xui/R$id;->design_bottom_sheet:I

    invoke-virtual {p0, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/FrameLayout;

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public static updateLoadingMessage(Lcom/xuexiang/xui/widget/dialog/LoadingDialog;Landroid/content/Context;Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/LoadingDialog;
    .locals 0

    if-nez p0, :cond_0

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/utils/WidgetUtils;->getLoadingDialog(Landroid/content/Context;)Lcom/xuexiang/xui/widget/dialog/LoadingDialog;

    move-result-object p0

    .line 2
    :cond_0
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;->updateMessage(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->show()V

    return-object p0
.end method
