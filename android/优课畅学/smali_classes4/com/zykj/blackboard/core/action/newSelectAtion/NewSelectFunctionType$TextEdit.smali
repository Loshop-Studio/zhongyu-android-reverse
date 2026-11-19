.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TextEdit"
.end annotation


# instance fields
.field private color:I

.field private isSingle:Z


# direct methods
.method public constructor <init>(ZI)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "\u7f16\u8f91"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/n;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->isSingle:Z

    .line 10
    .line 11
    iput p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->color:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->color:I

    .line 2
    .line 3
    return v0
.end method

.method public final isSingle()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->isSingle:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->color:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSingle(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;->isSingle:Z

    .line 2
    .line 3
    return-void
.end method
