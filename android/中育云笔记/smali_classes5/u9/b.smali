.class public final synthetic Lu9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/b;->c:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    iput-object p2, p0, Lu9/b;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu9/b;->c:Lcom/zykj/blackboard/core/canvas/SketchPlayView;

    iget-object v1, p0, Lu9/b;->d:Lhd/l;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/canvas/SketchPlayView;->a(Lcom/zykj/blackboard/core/canvas/SketchPlayView;Lhd/l;)V

    return-void
.end method
