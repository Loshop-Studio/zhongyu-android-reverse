.class public final Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionDifferCallback;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\tJ!\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionDifferCallback;",
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        "<init>",
        "()V",
        "oldItem",
        "newItem",
        "",
        "b",
        "(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Z",
        "a",
        "",
        "c",
        "(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Ljava/lang/Object;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Z
    .locals 1

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionDifferCallback;->a(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionDifferCallback;->b(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Z
    .locals 1

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->getId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->getId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public c(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->isCollect()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/CollectSession;->isCollect()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    sget-object p1, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionPayloadKey;->a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionPayloadKey;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;->getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public bridge synthetic getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 2
    .line 3
    check-cast p2, Lcom/zykj/student/dialogue/bean/resp/CollectSession;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionDifferCallback;->c(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/bean/resp/CollectSession;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
