.class public final synthetic Lcom/friday/paint/view/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/TheSketchFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/TheSketchFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/paint/view/d;->c:Lcom/friday/paint/view/TheSketchFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/d;->c:Lcom/friday/paint/view/TheSketchFragment;

    check-cast p1, Lcom/zykj/sketch/core/graph/Graph;

    invoke-static {v0, p1}, Lcom/friday/paint/view/TheSketchFragment$initData$5;->g(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/graph/Graph;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
