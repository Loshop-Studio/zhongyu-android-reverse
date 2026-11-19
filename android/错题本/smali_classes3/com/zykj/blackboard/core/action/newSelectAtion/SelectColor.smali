.class public abstract Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u0017\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;",
        "",
        "value",
        "",
        "isSelected",
        "",
        "(IZ)V",
        "()Z",
        "setSelected",
        "(Z)V",
        "getValue",
        "()I",
        "setValue",
        "(I)V",
        "Black",
        "Custom",
        "Preset",
        "Red",
        "White",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Black;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Custom;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Preset;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$Red;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor$White;",
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
.field private isSelected:Z

.field private value:I


# direct methods
.method private constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->value:I

    .line 4
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->isSelected:Z

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->value:I

    .line 2
    .line 3
    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;->value:I

    .line 2
    .line 3
    return-void
.end method
