.class final Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;->handleClick(FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "cropFilePath",
        "Ld6/s;",
        "invoke",
        "(Ljava/lang/String;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

.field final synthetic $graphFilePath:Ljava/lang/String;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->$graphFilePath:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cropFilePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ImageFunction:Crop -> graphId: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 3
    new-instance v0, Le7/c;

    invoke-static {}, Lkotlinx/coroutines/x;->c()Lkotlinx/coroutines/m1;

    move-result-object v1

    sget-object v2, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 4
    sget-object v2, Le7/k;->a:Ld7/d;

    .line 5
    invoke-static {v2, v1}, Lt6/a;->o(Lh6/h;Lh6/f;)Lh6/h;

    move-result-object v1

    .line 6
    invoke-direct {v0, v1}, Le7/c;-><init>(Lh6/h;)V

    .line 7
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->$graph:Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->$graphFilePath:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1;->this$0:Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;

    const/4 v7, 0x0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction$handleClick$1$1;-><init>(Lcom/zykj/blackboard/core/graph/group/ImageGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/action/newSelectAtion/function/ImageFunction;Ljava/lang/String;Lh6/c;)V

    const/4 p1, 0x3

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, v2, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    return-void
.end method
