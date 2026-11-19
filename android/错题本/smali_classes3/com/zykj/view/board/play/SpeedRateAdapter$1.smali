.class public final Lcom/zykj/view/board/play/SpeedRateAdapter$1;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SpeedRateAdapter;-><init>(Lr6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/zykj/view/board/play/SpeedRate;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/zykj/view/board/play/SpeedRateAdapter$1",
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;",
        "Lcom/zykj/view/board/play/SpeedRate;",
        "areItemsTheSame",
        "",
        "oldItem",
        "newItem",
        "areContentsTheSame",
        "view_release"
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
.method public areContentsTheSame(Lcom/zykj/view/board/play/SpeedRate;Lcom/zykj/view/board/play/SpeedRate;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SpeedRate;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/view/board/play/SpeedRate;

    check-cast p2, Lcom/zykj/view/board/play/SpeedRate;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SpeedRateAdapter$1;->areContentsTheSame(Lcom/zykj/view/board/play/SpeedRate;Lcom/zykj/view/board/play/SpeedRate;)Z

    move-result p1

    return p1
.end method

.method public areItemsTheSame(Lcom/zykj/view/board/play/SpeedRate;Lcom/zykj/view/board/play/SpeedRate;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SpeedRate;->getSelected()Z

    move-result v0

    invoke-virtual {p2}, Lcom/zykj/view/board/play/SpeedRate;->getSelected()Z

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/zykj/view/board/play/SpeedRate;->getTextColor()I

    move-result p1

    invoke-virtual {p2}, Lcom/zykj/view/board/play/SpeedRate;->getTextColor()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/view/board/play/SpeedRate;

    check-cast p2, Lcom/zykj/view/board/play/SpeedRate;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SpeedRateAdapter$1;->areItemsTheSame(Lcom/zykj/view/board/play/SpeedRate;Lcom/zykj/view/board/play/SpeedRate;)Z

    move-result p1

    return p1
.end method
