.class public Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/statelayout/StatusLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Holder"
.end annotation


# instance fields
.field private curState:I

.field private mAdapter:Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;

.field private mContext:Landroid/content/Context;

.field private mCurStatusView:Landroid/view/View;

.field private mData:Ljava/lang/Object;

.field private mRetryListener:Landroid/view/View$OnClickListener;

.field private mStatusViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mWrapper:Landroid/view/ViewGroup;


# direct methods
.method private constructor <init>(Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;Landroid/content/Context;Landroid/view/ViewGroup;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mStatusViews:Landroid/util/SparseArray;

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mAdapter:Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;

    .line 5
    iput-object p2, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mContext:Landroid/content/Context;

    .line 6
    iput-object p3, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    return-void
.end method

.method synthetic constructor <init>(Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/xuexiang/xui/widget/statelayout/StatusLoader$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;-><init>(Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-void
.end method

.method private validate()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mAdapter:Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;

    if-nez v0, :cond_0

    const-string v0, "StatusLoader.Adapter is not specified\uff01"

    .line 2
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mContext:Landroid/content/Context;

    if-nez v0, :cond_1

    const-string v0, "Context is null\uff01"

    .line 4
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/String;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    if-nez v0, :cond_2

    const-string v0, "The mWrapper of loading status view is null\uff01"

    .line 6
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/String;)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mAdapter:Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getCurState()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->curState:I

    return v0
.end method

.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mData:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRetryListener()Landroid/view/View$OnClickListener;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mRetryListener:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public getWrapper()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public showCustom()V
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->showLoadingStatus(I)V

    return-void
.end method

.method public showEmpty()V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->showLoadingStatus(I)V

    return-void
.end method

.method public showLoadFailed()V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->showLoadingStatus(I)V

    return-void
.end method

.method public showLoadSuccess()V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->showLoadingStatus(I)V

    return-void
.end method

.method public showLoading()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->showLoadingStatus(I)V

    return-void
.end method

.method public showLoadingStatus(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->curState:I

    if-eq v0, p1, :cond_7

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->validate()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->curState:I

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mStatusViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mCurStatusView:Landroid/view/View;

    .line 5
    :cond_1
    :try_start_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mAdapter:Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;

    invoke-interface {v1, p0, v0, p1}, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;->getView(Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mAdapter:Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Adapter;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".getView returns null"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mCurStatusView:Landroid/view/View;

    if-ne v0, v1, :cond_4

    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_0

    .line 8
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-eq v1, v2, :cond_6

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    goto :goto_1

    .line 10
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mCurStatusView:Landroid/view/View;

    if-eqz v1, :cond_5

    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_5
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mWrapper:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_6

    const/4 v2, -0x1

    .line 15
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 16
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 17
    :cond_6
    :goto_1
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mCurStatusView:Landroid/view/View;

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mStatusViews:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lcom/xuexiang/xui/logs/UILog;->e(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public withData(Ljava/lang/Object;)Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mData:Ljava/lang/Object;

    return-object p0
.end method

.method public withRetry(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/StatusLoader$Holder;->mRetryListener:Landroid/view/View$OnClickListener;

    return-object p0
.end method
