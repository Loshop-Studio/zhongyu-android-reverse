.class public final synthetic Lcom/zykj/sketch/core/record/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/sketch/core/graph/Graph;

.field public final synthetic c:Lcom/zykj/sketch/core/record/SketchRecorderView;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/record/k;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/k;->b:Lcom/zykj/sketch/core/graph/Graph;

    iput-object p3, p0, Lcom/zykj/sketch/core/record/k;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/k;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/k;->b:Lcom/zykj/sketch/core/graph/Graph;

    iget-object v2, p0, Lcom/zykj/sketch/core/record/k;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/core/record/SketchRecorderView$loadData$1$1$1;->a(Lkotlin/jvm/functions/Function1;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method
