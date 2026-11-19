.class public final Lcom/friday/document/adapter/ShareFileAdapter;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;,
        Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;,
        Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Lcom/friday/document/model/ShareListEntity;",
        "Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhd/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "onItemClick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/friday/document/adapter/ShareFileAdapter;->a:Lhd/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;I)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/friday/document/model/ShareListEntity;

    .line 11
    .line 12
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c(Lcom/friday/document/model/ShareListEntity;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b(Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;ILjava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "payloads"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lcom/friday/document/model/ShareListEntity;

    .line 16
    .line 17
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c(Lcom/friday/document/model/ShareListEntity;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    sget-object v0, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->c:Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    .line 31
    .line 32
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->d(Lcom/friday/document/model/ShareListEntity;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;
    .locals 1

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p2, p1, v0}, Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "inflate(...)"

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/friday/document/adapter/ShareFileAdapter;->a:Lhd/l;

    .line 27
    .line 28
    invoke-direct {p2, p0, p1, v0}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;-><init>(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;Lhd/l;)V

    .line 29
    .line 30
    .line 31
    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter;->a(Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;I)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/adapter/ShareFileAdapter;->b(Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter;->c(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
