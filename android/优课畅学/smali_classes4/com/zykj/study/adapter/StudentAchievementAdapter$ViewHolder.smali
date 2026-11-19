.class public final Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/adapter/StudentAchievementAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ItemStudentAchievementBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ItemStudentAchievementBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudentAchievementBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/teach/SuperviseGroupMember;Z)V
    .locals 0

    .line 1
    const-string p2, "item"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudentAchievementBinding;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Lcom/zykj/study/databinding/ItemStudentAchievementBinding;->setEntity(Lcom/zykj/study/bean/teach/SuperviseGroupMember;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b()Lcom/zykj/study/databinding/ItemStudentAchievementBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/StudentAchievementAdapter$ViewHolder;->a:Lcom/zykj/study/databinding/ItemStudentAchievementBinding;

    .line 2
    .line 3
    return-object v0
.end method
