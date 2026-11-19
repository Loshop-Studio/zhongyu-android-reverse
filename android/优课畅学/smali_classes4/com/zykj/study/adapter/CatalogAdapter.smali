.class public final Lcom/zykj/study/adapter/CatalogAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/CatalogAdapter$a;,
        Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;,
        Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderKnowledge;
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
.field public static final d:Lcom/zykj/study/adapter/CatalogAdapter$a;

.field public static final e:I


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/HashSet;

.field public final c:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/adapter/CatalogAdapter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/adapter/CatalogAdapter$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/adapter/CatalogAdapter;->d:Lcom/zykj/study/adapter/CatalogAdapter$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/adapter/CatalogAdapter;->e:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/HashSet;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectModel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "openKnowLedge"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogAdapter;->a:Ljava/util/List;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/adapter/CatalogAdapter;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/adapter/CatalogAdapter;->c:Lx7/l;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/CatalogAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogAdapter;->f(Lcom/zykj/study/adapter/CatalogAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogAdapter;ILandroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/adapter/CatalogAdapter;->e(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogAdapter;ILandroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogAdapter;ILandroid/view/View;)Lh7/p;
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
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogAdapter;->b:Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogAdapter;->b:Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p3, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    check-cast p3, Lcom/zykj/study/bean/course/CatalogBean;

    .line 65
    .line 66
    invoke-virtual {p3}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    if-eqz p3, :cond_1

    .line 71
    .line 72
    iget-object p3, p1, Lcom/zykj/study/adapter/CatalogAdapter;->c:Lx7/l;

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-interface {p3, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 85
    .line 86
    return-object p0
.end method

.method public static final f(Lcom/zykj/study/adapter/CatalogAdapter;ILandroid/view/View;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/zykj/study/adapter/CatalogAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogAdapter;->b:Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogAdapter;->b:Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lcom/zykj/study/bean/course/CatalogBean;

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogAdapter;->c:Lx7/l;

    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {v0, p2}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogAdapter;->a:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogAdapter;->a:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogAdapter;->a:Ljava/util/List;

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
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/CatalogAdapter;->getItemViewType(I)I

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
    check-cast p1, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderKnowledge;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderKnowledge;->a(Lcom/zykj/study/bean/SelectModel;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderKnowledge;->b()Lcom/zykj/study/databinding/ItemKnowledgeBinding;

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
    new-instance v0, Ln4/b;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Ln4/b;-><init>(Lcom/zykj/study/adapter/CatalogAdapter;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/f;->b(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    check-cast p1, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/zykj/study/adapter/CatalogAdapter;->c:Lx7/l;

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;->b(Lcom/zykj/study/bean/SelectModel;Lx7/l;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;->d()Lcom/zykj/study/databinding/ItemChapterBinding;

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
    const-string v1, "getRoot(...)"

    .line 62
    .line 63
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Ln4/a;

    .line 67
    .line 68
    invoke-direct {v1, v0, p0, p2}, Ln4/a;-><init>(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogAdapter;I)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v1}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 72
    .line 73
    .line 74
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
    new-instance p2, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;

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
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemChapterBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterBinding;)V

    .line 32
    .line 33
    .line 34
    return-object p2

    .line 35
    :cond_0
    new-instance p2, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderKnowledge;

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
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemKnowledgeBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemKnowledgeBinding;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderKnowledge;-><init>(Lcom/zykj/study/databinding/ItemKnowledgeBinding;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_1
    new-instance p2, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;

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
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemChapterBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemChapterBinding;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogAdapter$ViewHolderChapter;-><init>(Lcom/zykj/study/databinding/ItemChapterBinding;)V

    .line 74
    .line 75
    .line 76
    return-object p2
.end method
