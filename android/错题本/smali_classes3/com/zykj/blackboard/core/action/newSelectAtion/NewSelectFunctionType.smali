.class public abstract Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;,
        Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$ImageCrop;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0007\u000c\r\u000e\u000f\u0010\u0011\u0012B\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;",
        "",
        "text",
        "",
        "isSelected",
        "",
        "(Ljava/lang/String;Z)V",
        "()Z",
        "setSelected",
        "(Z)V",
        "getText",
        "()Ljava/lang/String;",
        "Delete",
        "GeometryStroke",
        "ImageCrop",
        "Rotate",
        "Scale",
        "TextEdit",
        "WriteEdit",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$ImageCrop;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;",
        "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;",
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

.field private final text:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->text:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;ZLkotlin/jvm/internal/e;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final getText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->text:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method
