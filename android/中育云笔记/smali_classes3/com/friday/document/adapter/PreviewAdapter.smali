.class public final Lcom/friday/document/adapter/PreviewAdapter;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Ljava/io/File;",
        "Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/adapter/PreviewAdapter$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/adapter/PreviewAdapter$1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;I)V
    .locals 2

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
    move-result-object v0

    .line 10
    const-string v1, "getItem(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Ljava/io/File;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/friday/document/adapter/PreviewAdapter;->a:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, p2}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->b(Ljava/io/File;Ljava/util/ArrayList;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;
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
    invoke-static {p2, p1, v0}, Lcom/friday/document/databinding/ItemNoteThumbnailBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemNoteThumbnailBinding;

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
    new-instance p2, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;-><init>(Lcom/friday/document/databinding/ItemNoteThumbnailBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    check-cast v3, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter;->a:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/PreviewAdapter;->b(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/PreviewAdapter;->c(Landroid/view/ViewGroup;I)Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
