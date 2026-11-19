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


# instance fields
.field private isSelected:Z

.field private final text:Ljava/lang/String;


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

.method public synthetic constructor <init>(Ljava/lang/String;ZILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;ZLkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final getText()Ljava/lang/String;
    .locals 1

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
