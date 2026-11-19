.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"

# interfaces
.implements La3/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;,
        Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;",
        ">;",
        "La3/a;"
    }
.end annotation


# instance fields
.field public a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

.field public b:Ljava/util/List;


# direct methods
.method public static synthetic b(Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;)Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    return-void
.end method

.method public c(Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    throw p1
.end method

.method public d(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    sget v0, Lcom/xuexiang/xui/R$layout;->xmd_layout_simplelist_item:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;

    .line 17
    .line 18
    invoke-direct {p2, p1, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;-><init>(Landroid/view/View;Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;)V

    .line 19
    .line 20
    .line 21
    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->c(Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter;->d(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/widget/dialog/materialdialog/simplelist/MaterialSimpleListAdapter$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
