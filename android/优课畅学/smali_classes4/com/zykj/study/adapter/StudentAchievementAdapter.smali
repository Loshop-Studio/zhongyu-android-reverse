.class public final Lcom/zykj/study/adapter/StudentAchievementAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lx7/p;

.field public final b:Ljava/util/List;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/p;)V
    .locals 1

    .line 1
    const-string v0, "onclick"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->a:Lx7/p;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/StudentAchievementAdapter;Lcom/zykj/study/bean/teach/SuperviseGroupMember;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/StudentAchievementAdapter;->e(Lcom/zykj/study/adapter/StudentAchievementAdapter;Lcom/zykj/study/bean/teach/SuperviseGroupMember;Landroid/view/View;)V

    return-void
.end method

.method public static final e(Lcom/zykj/study/adapter/StudentAchievementAdapter;Lcom/zykj/study/bean/teach/SuperviseGroupMember;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->a:Lx7/p;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getGroupId()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/bean/teach/SuperviseGroupMember;->getUserId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p0, p2, p1}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public d(Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;I)V
    .locals 1

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->c:Z

    .line 15
    .line 16
    invoke-virtual {p1, p2, v0}, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;->a(Lcom/zykj/study/bean/teach/SuperviseGroupMember;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;->b()Lcom/zykj/study/databinding/ItemStudentAchievementBinding;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->ivDetail:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    new-instance v0, Ln4/p0;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Ln4/p0;-><init>(Lcom/zykj/study/adapter/StudentAchievementAdapter;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;

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
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemStudentAchievementBinding;

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
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;-><init>(Lcom/zykj/study/databinding/ItemStudentAchievementBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final g(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->b:Ljava/util/List;

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

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter;->b:Ljava/util/List;

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
    check-cast p1, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentAchievementAdapter;->d(Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/StudentAchievementAdapter;->f(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
