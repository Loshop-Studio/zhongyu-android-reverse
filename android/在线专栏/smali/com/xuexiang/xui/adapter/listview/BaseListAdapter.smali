.class public abstract Lcom/xuexiang/xui/adapter/listview/BaseListAdapter;
.super Lcom/xuexiang/xui/adapter/listview/XListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "H:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/xuexiang/xui/adapter/listview/XListAdapter<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;-><init>(Landroid/content/Context;Ljava/util/Collection;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[TT;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected abstract convert(Ljava/lang/Object;Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TH;TT;I)V"
        }
    .end annotation
.end method

.method protected abstract getLayoutId()I
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/listview/BaseListAdapter;->getLayoutId()I

    move-result p3

    const/4 v0, 0x0

    invoke-static {p2, p3, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/adapter/listview/BaseListAdapter;->newViewHolder(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p3

    .line 3
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    .line 5
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/listview/XListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0, p3, v0, p1}, Lcom/xuexiang/xui/adapter/listview/BaseListAdapter;->convert(Ljava/lang/Object;Ljava/lang/Object;I)V

    :cond_1
    return-object p2
.end method

.method protected abstract newViewHolder(Landroid/view/View;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")TH;"
        }
    .end annotation
.end method
