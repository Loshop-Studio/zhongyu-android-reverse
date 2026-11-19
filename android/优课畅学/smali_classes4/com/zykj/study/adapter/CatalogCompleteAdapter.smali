.class public final Lcom/zykj/study/adapter/CatalogCompleteAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/CatalogCompleteAdapter$a;,
        Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;,
        Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;
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
.field public static final f:Lcom/zykj/study/adapter/CatalogCompleteAdapter$a;

.field public static final g:I


# instance fields
.field public final a:Lx7/l;

.field public final b:Lx7/l;

.field public final c:Ljava/util/List;

.field public d:I

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/adapter/CatalogCompleteAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->f:Lcom/zykj/study/adapter/CatalogCompleteAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->g:I

    return-void
.end method

.method public constructor <init>(Lx7/l;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "catalogCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "itemCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->a:Lx7/l;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->b:Lx7/l;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->e:I

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->g(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/CatalogCompleteAdapter;ILandroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->f(Lcom/zykj/study/adapter/CatalogCompleteAdapter;ILandroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->h(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V

    return-void
.end method

.method public static final f(Lcom/zykj/study/adapter/CatalogCompleteAdapter;ILandroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    xor-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->b:Lx7/l;

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-interface {v0, p2}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 48
    .line 49
    return-object p0
.end method

.method public static final g(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->a:Lx7/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final h(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->b:Lx7/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

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

.method public final i(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

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

.method public final j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->e:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->d:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 8

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v4, v0

    .line 13
    check-cast v4, Lcom/zykj/study/bean/SelectModel;

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->getItemViewType(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    check-cast p1, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;

    .line 27
    .line 28
    new-instance p2, Ln4/e;

    .line 29
    .line 30
    invoke-direct {p2, p0, v4}, Ln4/e;-><init>(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->d:I

    .line 34
    .line 35
    iget v3, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->e:I

    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lcom/zykj/study/bean/course/CatalogBean;

    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-ne v3, v5, :cond_1

    .line 48
    .line 49
    move v1, v2

    .line 50
    :cond_1
    invoke-virtual {p1, p2, v4, v0, v1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;->a(Landroid/view/View$OnClickListener;Lcom/zykj/study/bean/SelectModel;IZ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;->b()Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ln4/f;

    .line 62
    .line 63
    invoke-direct {p2, p0, v4}, Ln4/f;-><init>(Lcom/zykj/study/adapter/CatalogCompleteAdapter;Lcom/zykj/study/bean/SelectModel;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/f;->b(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    check-cast p1, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;

    .line 71
    .line 72
    move v0, v2

    .line 73
    iget-object v2, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->a:Lx7/l;

    .line 74
    .line 75
    iget-object v3, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->b:Lx7/l;

    .line 76
    .line 77
    iget v5, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->d:I

    .line 78
    .line 79
    iget v6, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->e:I

    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Lcom/zykj/study/bean/course/CatalogBean;

    .line 86
    .line 87
    invoke-virtual {v7}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-ne v6, v7, :cond_3

    .line 92
    .line 93
    move v6, v0

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    move v6, v1

    .line 96
    :goto_0
    iget v7, p0, Lcom/zykj/study/adapter/CatalogCompleteAdapter;->e:I

    .line 97
    .line 98
    move-object v1, p1

    .line 99
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->c(Lx7/l;Lx7/l;Lcom/zykj/study/bean/SelectModel;IZI)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;->f()Lcom/zykj/study/databinding/ItemChapterCompleteBinding;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string v0, "getRoot(...)"

    .line 111
    .line 112
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v0, Ln4/d;

    .line 116
    .line 117
    invoke-direct {v0, p0, p2}, Ln4/d;-><init>(Lcom/zykj/study/adapter/CatalogCompleteAdapter;I)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 121
    .line 122
    .line 123
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
    new-instance p2, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;

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
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterCompleteBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterCompleteBinding;)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_0
    new-instance p2, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;

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
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderKnowledge;-><init>(Lcom/zykj/study/databinding/ItemKnowledgeCompleteBinding;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_1
    new-instance p2, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;

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
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemChapterCompleteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterCompleteBinding;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogCompleteAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterCompleteBinding;)V

    .line 74
    .line 75
    .line 76
    return-object p2
.end method
