.class public final Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/chad/library/adapter/base/listener/OnItemDragListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public a:Ljava/util/List;

.field public b:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

.field public c:Landroid/graphics/drawable/Drawable;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->d:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->h(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->u()Lkotlinx/coroutines/flow/StateFlow;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v2, v1

    .line 40
    check-cast v2, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->inDiscussing()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->isArchived()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public onItemDragEnd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->c:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->b:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->d:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->g(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/CategoryEditAdapter;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {p1, p2, v2, v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setDiffNewData$default(Lcom/chad/library/adapter/base/BaseQuickAdapter;Ljava/util/List;Ljava/lang/Runnable;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->h(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 39
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v1, 0xa

    .line 43
    .line 44
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    const/4 v1, 0x0

    .line 56
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    add-int/lit8 v3, v1, 0x1

    .line 67
    .line 68
    if-gez v1, :cond_1

    .line 69
    .line 70
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 71
    .line 72
    .line 73
    :cond_1
    check-cast v2, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 74
    .line 75
    new-instance v1, Lcom/zykj/student/dialogue/bean/req/SortCatalogReq;

    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->getId()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    long-to-int v2, v4

    .line 82
    invoke-direct {v1, v2, v3}, Lcom/zykj/student/dialogue/bean/req/SortCatalogReq;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move v1, v3

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->C(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void
.end method

.method public onItemDragMoving(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    return-void
.end method

.method public onItemDragStart(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->d:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;->h(Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;)Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/category/EditCategoryViewModel;->u()Lkotlinx/coroutines/flow/StateFlow;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v3, v2

    .line 37
    check-cast v3, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 38
    .line 39
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->isArchived()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->inDiscussing()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const/4 v0, 0x0

    .line 74
    :goto_1
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->c:Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 79
    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->d:Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment;

    .line 83
    .line 84
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget v1, Lcom/zykj/student/dialogue/R$color;->dialogue_main_color_20:I

    .line 89
    .line 90
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 104
    .line 105
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->b:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 106
    .line 107
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/category/CategoryListFragment$a;->a:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    return-void
.end method
