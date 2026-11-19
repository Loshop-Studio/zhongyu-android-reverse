.class public final Lcom/zykj/study/adapter/CatalogGradeAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/viewmodels/CatalogViewModel;

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/viewmodels/CatalogViewModel;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "catalogViewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

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
    iput-object p1, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->a:Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/CatalogGradeAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogGradeAdapter;->e(Lcom/zykj/study/adapter/CatalogGradeAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V

    return-void
.end method

.method private final d(Lcom/zykj/study/bean/SelectModel;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/i;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln4/i;-><init>(Lcom/zykj/study/adapter/CatalogGradeAdapter;Lcom/zykj/study/bean/SelectModel;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final e(Lcom/zykj/study/adapter/CatalogGradeAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Lcom/zykj/study/bean/SelectModel;

    .line 24
    .line 25
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    xor-int/lit8 p2, p2, 0x1

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    iget-object p2, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->a:Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 72
    .line 73
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/CatalogViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lcom/zykj/study/data/GradeEntity;

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/zykj/study/data/GradeEntity;->getId()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-object p1, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->a:Lcom/zykj/study/viewmodels/CatalogViewModel;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CatalogViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 109
    .line 110
    .line 111
    return-void
.end method


# virtual methods
.method public f(Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;I)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lcom/zykj/study/bean/SelectModel;

    .line 13
    .line 14
    invoke-direct {p0, p2}, Lcom/zykj/study/adapter/CatalogGradeAdapter;->d(Lcom/zykj/study/bean/SelectModel;)Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1, v0, p2}, Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;->a(Landroid/view/View$OnClickListener;Lcom/zykj/study/bean/SelectModel;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public g(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemCatalogGradeBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemCatalogGradeBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemCatalogGradeBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/CatalogGradeAdapter;->b:Ljava/util/List;

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
    check-cast p1, Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogGradeAdapter;->f(Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/CatalogGradeAdapter;->g(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/CatalogGradeAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
