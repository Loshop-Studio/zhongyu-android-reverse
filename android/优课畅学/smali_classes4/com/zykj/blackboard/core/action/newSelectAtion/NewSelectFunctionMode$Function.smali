.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;
.super Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Function"
.end annotation


# instance fields
.field private final index:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;-><init>(Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;->index:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;->index:I

    .line 2
    .line 3
    return v0
.end method
