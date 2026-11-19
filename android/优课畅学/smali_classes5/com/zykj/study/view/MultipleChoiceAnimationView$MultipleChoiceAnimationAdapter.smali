.class public final Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/view/MultipleChoiceAnimationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MultipleChoiceAnimationAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public d:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->c:Ljava/util/List;

    .line 24
    .line 25
    new-instance v0, Lf5/p;

    .line 26
    .line 27
    invoke-direct {v0}, Lf5/p;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->d:Lx7/p;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->g(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->h(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/zykj/study/bean/SelectModel;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p3, 0x1

    .line 25
    invoke-virtual {p1, p3}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->d:Lx7/p;

    .line 32
    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p0, p1, p2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static final h(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/study/bean/SelectModel;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final f(Lcom/zykj/study/bean/SelectModel;I)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Lf5/o;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lf5/o;-><init>(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;Lcom/zykj/study/bean/SelectModel;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

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

.method public i(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

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
    iget-object v1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->b:Ljava/util/List;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p0, v0, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->f(Lcom/zykj/study/bean/SelectModel;I)Landroid/view/View$OnClickListener;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1, v1, v0, v2, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;->a(Ljava/util/List;Lcom/zykj/study/bean/SelectModel;Ljava/util/List;Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public j(Landroid/view/ViewGroup;I)Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;-><init>(Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final k(Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "clickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->d:Lx7/p;

    .line 7
    .line 8
    return-void
.end method

.method public final l(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/study/bean/SelectModel;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/zykj/study/bean/SelectModel;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catch_0
    move-exception p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 39
    .line 40
    .line 41
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final m(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->b:Ljava/util/List;

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

.method public final n(Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-static {p1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    new-instance v3, Lcom/zykj/study/bean/SelectModel;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-direct {v3, v4, v2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->a:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {p1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/zykj/study/bean/SelectModel;

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    invoke-virtual {p1, v0}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 71
    .line 72
    .line 73
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->c:Ljava/util/List;

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

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->i(Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter;->j(Landroid/view/ViewGroup;I)Lcom/zykj/study/view/MultipleChoiceAnimationView$MultipleChoiceAnimationAdapter$ViewHolderViewer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
