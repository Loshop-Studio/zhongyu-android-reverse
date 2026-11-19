.class public final Lcom/friday/main/adapter/SearchAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/friday/common/entity/FileEntity;",
        "Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lhd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/main/model/FileDiffCallback;

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/friday/main/model/FileDiffCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v4, 0x6

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v5}, Landroidx/paging/PagingDataAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Lkotlin/coroutines/d;Lkotlin/coroutines/d;ILkotlin/jvm/internal/n;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic d(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/adapter/SearchAdapter;->g(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/main/adapter/SearchAdapter;->h(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method

.method public static final g(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/adapter/SearchAdapter;->a:Lhd/p;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget p2, Lcom/friday/main/R$id;->iv_go:I

    .line 6
    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p0, p2, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static final h(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/adapter/SearchAdapter;->a:Lhd/p;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget p2, Lcom/friday/main/R$id;->ll_container:I

    .line 6
    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p0, p2, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public f(Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/paging/PagingDataAdapter;->getItem(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;->a()Lcom/friday/main/databinding/ItemSearchBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, Lcom/friday/main/databinding/ItemSearchBinding;->f:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;->a()Lcom/friday/main/databinding/ItemSearchBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Lcom/friday/main/databinding/ItemSearchBinding;->g:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;->a()Lcom/friday/main/databinding/ItemSearchBinding;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, Lcom/friday/main/databinding/ItemSearchBinding;->d:Landroid/widget/ImageView;

    .line 45
    .line 46
    sget-object v1, Lk2/n;->a:Lk2/n$a;

    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v1, v2}, Lk2/n$a;->d(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;->a()Lcom/friday/main/databinding/ItemSearchBinding;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, Lcom/friday/main/databinding/ItemSearchBinding;->c:Landroid/widget/ImageView;

    .line 64
    .line 65
    new-instance v1, Ls3/b;

    .line 66
    .line 67
    invoke-direct {v1, p0, p2}, Ls3/b;-><init>(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;->a()Lcom/friday/main/databinding/ItemSearchBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p1, p1, Lcom/friday/main/databinding/ItemSearchBinding;->e:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 78
    .line 79
    new-instance v0, Ls3/c;

    .line 80
    .line 81
    invoke-direct {v0, p0, p2}, Ls3/c;-><init>(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    return-void
.end method

.method public i(Landroid/view/ViewGroup;I)Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/friday/main/databinding/ItemSearchBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/main/databinding/ItemSearchBinding;

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
    invoke-direct {p2, p1}, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;-><init>(Lcom/friday/main/databinding/ItemSearchBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final j(Lhd/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/adapter/SearchAdapter;->a:Lhd/p;

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/SearchAdapter;->f(Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/SearchAdapter;->i(Landroid/view/ViewGroup;I)Lcom/friday/main/adapter/SearchAdapter$SearchViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
