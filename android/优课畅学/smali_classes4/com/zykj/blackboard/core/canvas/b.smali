.class public final synthetic Lcom/zykj/blackboard/core/canvas/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx7/q;

.field public final synthetic d:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lx7/q;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/b;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/b;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/blackboard/core/canvas/b;->c:Lx7/q;

    iput-object p4, p0, Lcom/zykj/blackboard/core/canvas/b;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/b;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/b;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/blackboard/core/canvas/b;->c:Lx7/q;

    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/b;->d:Lx7/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->b(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lx7/q;Lx7/l;)V

    return-void
.end method
