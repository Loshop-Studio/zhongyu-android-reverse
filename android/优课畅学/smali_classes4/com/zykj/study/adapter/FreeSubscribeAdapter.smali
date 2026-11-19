.class public final Lcom/zykj/study/adapter/FreeSubscribeAdapter;
.super Landroidx/paging/PagingDataAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/paging/PagingDataAdapter<",
        "Lcom/zykj/study/bean/FreeSubscribe;",
        "Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    new-instance v1, Lcom/zykj/study/adapter/FreeSubscribeDiffCallback;

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/zykj/study/adapter/FreeSubscribeDiffCallback;-><init>()V

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

.method public static synthetic c(Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;->f(Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;->g(Ljava/lang/String;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object v0, Lh5/c;->b:Lh5/c;

    .line 2
    .line 3
    new-instance v1, Ln4/a0;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ln4/a0;-><init>(Ljava/lang/String;Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lh5/c;->a(Lx7/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final g(Ljava/lang/String;Landroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/ui/home/my/h;->a:Lcom/zykj/study/ui/home/my/h$d;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/h$d;->c(Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/navigation/ViewKt;->findNavController(Landroid/view/View;)Landroidx/navigation/NavController;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/String;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/z;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ln4/z;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public h(Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;I)V
    .locals 1

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
    check-cast p2, Lcom/zykj/study/bean/FreeSubscribe;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/zykj/study/bean/FreeSubscribe;->getId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;->e(Ljava/lang/String;)Landroid/view/View$OnClickListener;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, p2, v0}, Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;->a(Lcom/zykj/study/bean/FreeSubscribe;Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public i(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemFreeSubscribeBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemFreeSubscribeBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemFreeSubscribeBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;->h(Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/FreeSubscribeAdapter;->i(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/FreeSubscribeAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
