.class public abstract Lcom/xuexiang/xui/widget/searchview/a;
.super Landroid/widget/Filter;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/String;

.field public b:Lcom/xuexiang/xui/widget/searchview/m;


# virtual methods
.method public final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 0

    .line 1
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/a;->b:Lcom/xuexiang/xui/widget/searchview/m;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    iput-object p1, p2, Lcom/xuexiang/xui/widget/searchview/m;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
