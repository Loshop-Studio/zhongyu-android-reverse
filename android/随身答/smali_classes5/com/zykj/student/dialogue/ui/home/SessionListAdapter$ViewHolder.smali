.class public final Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;",
        "binding",
        "<init>",
        "(Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;)V",
        "a",
        "Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;",
        "()Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;->a:Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;->a:Lcom/zykj/student/dialogue/databinding/DialogueCardSessionBinding;

    .line 2
    .line 3
    return-object v0
.end method
