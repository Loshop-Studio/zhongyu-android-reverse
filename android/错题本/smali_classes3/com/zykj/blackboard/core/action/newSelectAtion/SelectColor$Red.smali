.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Red"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
        "isSelected",
        "",
        "(Z)V",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;-><init>(ZILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    const v0, -0xb6cf

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, p1, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;-><init>(IZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;-><init>(Z)V

    return-void
.end method
