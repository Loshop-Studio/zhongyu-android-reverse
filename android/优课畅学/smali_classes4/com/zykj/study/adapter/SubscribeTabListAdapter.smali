.class public final Lcom/zykj/study/adapter/SubscribeTabListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lx7/p;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

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
    iput-object p1, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->a:Ljava/util/List;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->b:Lx7/p;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/SubscribeTabListAdapter;ILcom/zykj/study/bean/OtherSubscribe;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->e(Lcom/zykj/study/adapter/SubscribeTabListAdapter;ILcom/zykj/study/bean/OtherSubscribe;Landroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/SubscribeTabListAdapter;ILcom/zykj/study/bean/OtherSubscribe;Landroid/view/View;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->c:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->b:Lx7/p;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p0, p1, p2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public d(Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;I)V
    .locals 4

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->a:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/study/bean/OtherSubscribe;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/study/bean/OtherSubscribe;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget v2, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->c:I

    .line 19
    .line 20
    if-ne p2, v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    :goto_0
    new-instance v3, Ln4/w0;

    .line 26
    .line 27
    invoke-direct {v3, p0, p2, v0}, Ln4/w0;-><init>(Lcom/zykj/study/adapter/SubscribeTabListAdapter;ILcom/zykj/study/bean/OtherSubscribe;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1, v2, v3}, Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;->a(Ljava/lang/String;ZLandroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemSubscribeTabBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemSubscribeTabBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->a:Ljava/util/List;

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
    check-cast p1, Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->d(Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/SubscribeTabListAdapter;->f(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/SubscribeTabListAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
