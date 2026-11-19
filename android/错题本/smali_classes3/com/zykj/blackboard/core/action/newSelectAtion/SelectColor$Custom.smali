.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Custom"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
        "color",
        "",
        "isSelected",
        "",
        "isOpen",
        "(IZZ)V",
        "()Z",
        "setOpen",
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


# instance fields
.field private isOpen:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;-><init>(IZZILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(IZZ)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;-><init>(IZLkotlin/jvm/internal/e;)V

    .line 4
    iput-boolean p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    .line 2
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;-><init>(IZZ)V

    return-void
.end method


# virtual methods
.method public final isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setOpen(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;->isOpen:Z

    .line 2
    .line 3
    return-void
.end method
