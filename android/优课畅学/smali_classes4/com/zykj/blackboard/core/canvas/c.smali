.class public final synthetic Lcom/zykj/blackboard/core/canvas/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

.field public final synthetic b:Lx7/l;

.field public final synthetic c:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/c;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/c;->b:Lx7/l;

    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/c;->c:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/c;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/c;->b:Lx7/l;

    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/c;->c:Lx7/l;

    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V

    return-void
.end method
