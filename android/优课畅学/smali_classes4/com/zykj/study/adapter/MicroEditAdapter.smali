.class public final Lcom/zykj/study/adapter/MicroEditAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolder;,
        Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolderAdd;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lx7/l;

.field public final b:Lx7/l;

.field public final c:Lx7/a;

.field public final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;Lx7/l;Lx7/a;)V
    .locals 1

    .line 1
    const-string v0, "playCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "deleteCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "addCallBack"

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
    iput-object p1, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->a:Lx7/l;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->b:Lx7/l;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->c:Lx7/a;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->d:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/MicroEditAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/adapter/MicroEditAdapter;->f(Lcom/zykj/study/adapter/MicroEditAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/MicroEditAdapter;->h(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/MicroEditAdapter;->g(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View;)V

    return-void
.end method

.method public static final f(Lcom/zykj/study/adapter/MicroEditAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->c:Lx7/a;

    .line 2
    .line 3
    invoke-interface {p0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final g(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->a:Lx7/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final h(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->b:Lx7/l;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public final i(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "newList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->d:Ljava/util/List;

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

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/MicroEditAdapter;->getItemViewType(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolderAdd;

    .line 13
    .line 14
    new-instance p2, Ln4/f0;

    .line 15
    .line 16
    invoke-direct {p2, p0}, Ln4/f0;-><init>(Lcom/zykj/study/adapter/MicroEditAdapter;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolderAdd;->a(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/adapter/MicroEditAdapter;->d:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lcom/zykj/study/bean/exercise/MicroBean;

    .line 30
    .line 31
    check-cast p1, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolder;

    .line 32
    .line 33
    new-instance v0, Ln4/g0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, Ln4/g0;-><init>(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ln4/h0;

    .line 39
    .line 40
    invoke-direct {v1, p0, p2}, Ln4/h0;-><init>(Lcom/zykj/study/adapter/MicroEditAdapter;Lcom/zykj/study/bean/exercise/MicroBean;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2, v0, v1}, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolder;->a(Lcom/zykj/study/bean/exercise/MicroBean;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
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
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance p2, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolderAdd;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemMicroAddBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemMicroAddBinding;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolderAdd;-><init>(Lcom/zykj/study/databinding/ItemMicroAddBinding;)V

    .line 29
    .line 30
    .line 31
    return-object p2

    .line 32
    :cond_0
    new-instance p2, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolder;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2, p1, v1}, Lcom/zykj/study/databinding/ItemMicroEditBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemMicroEditBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/MicroEditAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemMicroEditBinding;)V

    .line 50
    .line 51
    .line 52
    return-object p2
.end method
