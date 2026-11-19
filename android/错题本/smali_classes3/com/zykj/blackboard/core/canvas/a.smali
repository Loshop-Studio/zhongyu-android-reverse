.class public final synthetic Lcom/zykj/blackboard/core/canvas/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr6/f;

.field public final synthetic b:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic c:Z

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lr6/f;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/a;->a:Lr6/f;

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/a;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/a;->c:Z

    iput-wide p4, p0, Lcom/zykj/blackboard/core/canvas/a;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/canvas/a;->c:Z

    iget-wide v1, p0, Lcom/zykj/blackboard/core/canvas/a;->d:J

    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/a;->a:Lr6/f;

    iget-object v4, p0, Lcom/zykj/blackboard/core/canvas/a;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    invoke-static {v3, v4, v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->a(Lr6/f;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V

    return-void
.end method
