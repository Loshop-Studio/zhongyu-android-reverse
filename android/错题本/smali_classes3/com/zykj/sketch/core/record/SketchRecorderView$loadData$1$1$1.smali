.class final Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/record/SketchRecorderView;->loadData$lambda-12$lambda-11(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lr6/c;Lr6/a;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/sketch/core/graph/Graph;",
        "it",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
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
.field final synthetic $finish:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/sketch/core/record/SketchRecorderView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/record/SketchRecorderView;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->this$0:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->$finish:Lr6/c;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Lr6/c;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->invoke$lambda-0(Lr6/c;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method

.method private static final invoke$lambda-0(Lr6/c;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 2

    .line 1
    const-string v0, "$finish"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$it"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "this$0"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v1, 0x1

    .line 18
    :try_start_0
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {p2, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->access$setReady$p(Lcom/zykj/sketch/core/record/SketchRecorderView;Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {p2, v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->access$setLoading$p(Lcom/zykj/sketch/core/record/SketchRecorderView;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception p0

    .line 34
    invoke-static {p2, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->access$setReady$p(Lcom/zykj/sketch/core/record/SketchRecorderView;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->access$setLoading$p(Lcom/zykj/sketch/core/record/SketchRecorderView;Z)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/sketch/core/graph/Graph;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->invoke(Lcom/zykj/sketch/core/graph/Graph;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 3
    .param p1    # Lcom/zykj/sketch/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->this$0:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->$finish:Lr6/c;

    new-instance v2, Lcom/zykj/sketch/core/record/d;

    invoke-direct {v2, v1, p1, v0}, Lcom/zykj/sketch/core/record/d;-><init>(Lr6/c;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
