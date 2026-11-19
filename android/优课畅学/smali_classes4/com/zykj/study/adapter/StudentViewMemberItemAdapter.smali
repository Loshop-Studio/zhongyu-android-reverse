.class public final Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/bean/teach/SuperviseGroup;

.field public final b:Landroidx/lifecycle/MutableLiveData;

.field public final c:Lx7/p;

.field public final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/bean/teach/SuperviseGroup;Landroidx/lifecycle/MutableLiveData;Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "superviseGroup"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "superviseGroupMember"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "memberClick"

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
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->a:Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->b:Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->c:Lx7/p;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getMemberList()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->d:Ljava/util/List;

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->e(Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;ILandroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->c:Lx7/p;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->a:Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->d:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p2, v0, p0}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public d(Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->b:Landroidx/lifecycle/MutableLiveData;

    .line 15
    .line 16
    new-instance v2, Ln4/t0;

    .line 17
    .line 18
    invoke-direct {v2, p0, p2}, Ln4/t0;-><init>(Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, v2}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;->a(Lcom/zykj/study/bean/teach/SuperviseGroupMember;Landroidx/lifecycle/MutableLiveData;Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemSuperviseGroupMemberItemBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->d:Ljava/util/List;

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
    check-cast p1, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->d(Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberItemAdapter;->f(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentViewMemberItemAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
