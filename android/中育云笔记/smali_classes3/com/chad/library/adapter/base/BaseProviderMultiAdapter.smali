.class public abstract Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "TT;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lqc/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    .line 4
    sget-object p1, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    sget-object v0, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter$mItemProviders$2;->c:Lcom/chad/library/adapter/base/BaseProviderMultiAdapter$mItemProviders$2;

    invoke-static {p1, v0}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    move-result-object p1

    iput-object p1, p0, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->a:Lqc/d;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->r(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->s(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->o(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->p(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final o(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "$viewHolder"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$provider"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, -0x1

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v0, v1

    .line 29
    const-string v1, "v"

    .line 30
    .line 31
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p2, p0, p3, p1, v0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->j(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static final p(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;Landroid/view/View;)Z
    .locals 2

    .line 1
    const-string v0, "$viewHolder"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$provider"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, -0x1

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    sub-int/2addr v0, v1

    .line 30
    const-string v1, "v"

    .line 31
    .line 32
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2, p0, p3, p1, v0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method

.method public static final r(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "$viewHolder"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int/2addr v0, v1

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->v()Landroid/util/SparseArray;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 37
    .line 38
    const-string v2, "it"

    .line 39
    .line 40
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, p0, p2, p1, v0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->l(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static final s(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Landroid/view/View;)Z
    .locals 3

    .line 1
    const-string v0, "$viewHolder"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, -0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getHeaderLayoutCount()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    sub-int/2addr v0, v1

    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->v()Landroid/util/SparseArray;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 38
    .line 39
    const-string v2, "it"

    .line 40
    .line 41
    invoke-static {p2, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v1, p0, p2, p1, v0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->n(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Landroid/view/View;Ljava/lang/Object;I)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0
.end method


# virtual methods
.method public bindViewClickListener(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V
    .locals 1

    .line 1
    const-string v0, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->bindViewClickListener(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->q(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->n(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->a(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V

    return-void
.end method

.method public convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2, p3}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->b(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V

    return-void
.end method

.method public getDefItemViewType(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->u(Ljava/util/List;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public m(Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V
    .locals 2

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->r(Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->v()Landroid/util/SparseArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->g()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public n(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V
    .locals 9

    .line 1
    const-string v0, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getOnItemChildClickListener()Lo1/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "findViewById<View>(id)"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->c()Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    move v6, v2

    .line 33
    :cond_1
    :goto_0
    if-ge v6, v5, :cond_3

    .line 34
    .line 35
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    add-int/lit8 v6, v6, 0x1

    .line 40
    .line 41
    check-cast v7, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    iget-object v8, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 48
    .line 49
    invoke-virtual {v8, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    invoke-static {v7, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Landroid/view/View;->isClickable()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_2

    .line 63
    .line 64
    invoke-virtual {v7, v3}, Landroid/view/View;->setClickable(Z)V

    .line 65
    .line 66
    .line 67
    :cond_2
    new-instance v8, Lh1/c;

    .line 68
    .line 69
    invoke-direct {v8, p1, p0, v0}, Lh1/c;-><init>(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getOnItemChildLongClickListener()Lo1/c;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->d()Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    :cond_5
    :goto_1
    if-ge v2, v4, :cond_7

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    check-cast v5, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    iget-object v6, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 109
    .line 110
    invoke-virtual {v6, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Landroid/view/View;->isLongClickable()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-nez v6, :cond_6

    .line 124
    .line 125
    invoke-virtual {v5, v3}, Landroid/view/View;->setLongClickable(Z)V

    .line 126
    .line 127
    .line 128
    :cond_6
    new-instance v6, Lh1/d;

    .line 129
    .line 130
    invoke-direct {v6, p1, p0, p2}, Lh1/d;-><init>(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;Lcom/chad/library/adapter/base/provider/BaseItemProvider;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_7
    :goto_2
    return-void
.end method

.method public onCreateDefViewHolder(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;
    .locals 3

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "parent.context"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->s(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->m(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0, p1, p2}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->q(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;I)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v0, "ViewType: "

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p2, " no such provider found\uff0cplease use addItemProvider() first!"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p2
.end method

.method public bridge synthetic onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->onViewAttachedToWindow(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V

    return-void
.end method

.method public onViewAttachedToWindow(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->onViewAttachedToWindow(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->o(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->w(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V
    .locals 2

    .line 1
    const-string v0, "viewHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getOnItemClickListener()Lo1/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 13
    .line 14
    new-instance v1, Lh1/e;

    .line 15
    .line 16
    invoke-direct {v1, p1, p0}, Lh1/e;-><init>(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getOnItemLongClickListener()Lo1/f;

    .line 23
    .line 24
    .line 25
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 26
    .line 27
    new-instance v1, Lh1/f;

    .line 28
    .line 29
    invoke-direct {v1, p1, p0}, Lh1/f;-><init>(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->v()Landroid/util/SparseArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 10
    .line 11
    return-object p1
.end method

.method public abstract u(Ljava/util/List;I)I
.end method

.method public final v()Landroid/util/SparseArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->a:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/util/SparseArray;

    .line 8
    .line 9
    return-object v0
.end method

.method public w(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;->t(I)Lcom/chad/library/adapter/base/provider/BaseItemProvider;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/chad/library/adapter/base/provider/BaseItemProvider;->p(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
