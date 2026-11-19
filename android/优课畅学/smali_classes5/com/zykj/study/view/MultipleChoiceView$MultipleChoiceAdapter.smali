.class public final Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/view/MultipleChoiceView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MultipleChoiceAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public d:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

.field public e:Lx7/p;


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
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->c:Ljava/util/List;

    .line 24
    .line 25
    sget-object v0, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->b:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->d:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 28
    .line 29
    new-instance v0, Lf5/r;

    .line 30
    .line 31
    invoke-direct {v0}, Lf5/r;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->e:Lx7/p;

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->i(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->g(Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V

    return-void
.end method

.method private final f(Lcom/zykj/study/bean/SelectModel;I)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Lf5/q;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lf5/q;-><init>(Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;Lcom/zykj/study/bean/SelectModel;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final g(Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;Lcom/zykj/study/bean/SelectModel;ILandroid/view/View;)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->d:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 2
    .line 3
    sget-object v0, Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;->a:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 4
    .line 5
    if-ne p3, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    xor-int/lit8 p3, p3, 0x1

    .line 12
    .line 13
    invoke-virtual {p1, p3}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->e:Lx7/p;

    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p0, p1, p2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static final i(Lcom/zykj/study/bean/SelectModel;I)Lh7/p;
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
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

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

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

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

.method public final h()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lcom/zykj/study/bean/SelectModel;

    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/16 v2, 0xa

    .line 38
    .line 39
    invoke-static {v1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lcom/zykj/study/bean/SelectModel;

    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    return-object v0
.end method

.method public j(Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;I)V
    .locals 7

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, Lcom/zykj/study/bean/SelectModel;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->b:Ljava/util/List;

    .line 16
    .line 17
    iget-object v4, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->d:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 18
    .line 19
    iget-object v5, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->c:Ljava/util/List;

    .line 20
    .line 21
    invoke-direct {p0, v3, p2}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->f(Lcom/zykj/study/bean/SelectModel;I)Landroid/view/View$OnClickListener;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    move-object v1, p1

    .line 26
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;->a(Ljava/util/List;Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;Ljava/util/List;Landroid/view/View$OnClickListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public k(Landroid/view/ViewGroup;I)Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;-><init>(Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final l(Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "clickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->e:Lx7/p;

    .line 7
    .line 8
    return-void
.end method

.method public final m(Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;)V
    .locals 1

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->d:Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 3

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/study/bean/SelectModel;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Lcom/zykj/study/bean/SelectModel;->setSelectModel(Z)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->a:Ljava/util/List;

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
    iget-object v4, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->b:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-direct {v3, v4, v2}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->j(Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->k(Landroid/view/ViewGroup;I)Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final p(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
