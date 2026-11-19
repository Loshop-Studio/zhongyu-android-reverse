.class public final Lcom/zykj/study/adapter/CatalogProgressAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/CatalogProgressAdapter$a;,
        Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;,
        Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/study/adapter/CatalogProgressAdapter$a;

.field public static final f:I


# instance fields
.field public final a:Z

.field public final b:Ljava/util/HashSet;

.field public final c:Lx7/l;

.field public d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/adapter/CatalogProgressAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->e:Lcom/zykj/study/adapter/CatalogProgressAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->f:I

    return-void
.end method

.method public constructor <init>(ZLjava/util/HashSet;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "selectModel"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "openKnowLedge"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->a:Z

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->b:Ljava/util/HashSet;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->c:Lx7/l;

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->d:Ljava/util/List;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->e(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->f(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    xor-int/lit8 p3, p3, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, p3}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;->b:Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 64
    .line 65
    return-object p0
.end method

.method public static final f(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    xor-int/lit8 p3, p3, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, p3}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;->b:Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;->b:Ljava/util/HashSet;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p3, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    check-cast p3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 60
    .line 61
    invoke-virtual {p3}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-eqz p3, :cond_2

    .line 66
    .line 67
    iget-boolean p3, p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;->a:Z

    .line 68
    .line 69
    if-nez p3, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 76
    .line 77
    invoke-virtual {p3}, Lcom/zykj/study/bean/course/CatalogBean;->getLocked()I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_1

    .line 82
    .line 83
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 84
    .line 85
    const-string p1, "\u5185\u5bb9\u5c1a\u672a\u5f00\u653e"

    .line 86
    .line 87
    invoke-static {p0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogProgressAdapter;->c:Lx7/l;

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-interface {p3, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 101
    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final g(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "newList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->d:Ljava/util/List;

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

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/study/bean/SelectModel;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->getItemViewType(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    check-cast p1, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;->a(Lcom/zykj/study/bean/SelectModel;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;->b()Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, Ln4/l;

    .line 38
    .line 39
    invoke-direct {v1, v0, p0, p2}, Ln4/l;-><init>(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1}, Lcom/blankj/utilcode/util/f;->b(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    check-cast p1, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;

    .line 47
    .line 48
    iget-boolean v1, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->a:Z

    .line 49
    .line 50
    iget-object v2, p0, Lcom/zykj/study/adapter/CatalogProgressAdapter;->c:Lx7/l;

    .line 51
    .line 52
    invoke-virtual {p1, v1, v0, v2}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->b(ZLcom/zykj/study/bean/SelectModel;Lx7/l;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;->d()Lcom/zykj/study/databinding/ItemChapterProgressBinding;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v1, "getRoot(...)"

    .line 64
    .line 65
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Ln4/k;

    .line 69
    .line 70
    invoke-direct {v1, v0, p0, p2}, Ln4/k;-><init>(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v1}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "inflate(...)"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq p2, v2, :cond_0

    .line 13
    .line 14
    new-instance p2, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterProgressBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterProgressBinding;)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_0
    new-instance p2, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderKnowledge;-><init>(Lcom/zykj/study/databinding/ItemKnowledgeProgressBinding;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_1
    new-instance p2, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemChapterProgressBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterProgressBinding;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterProgressBinding;)V

    .line 74
    .line 75
    .line 76
    return-object p2
.end method
