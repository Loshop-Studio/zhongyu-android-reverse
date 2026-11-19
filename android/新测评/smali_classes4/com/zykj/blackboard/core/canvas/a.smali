.class public final synthetic Lcom/zykj/blackboard/core/canvas/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function3;

.field public final synthetic b:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic c:Z

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/a;->a:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/a;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-boolean p3, p0, Lcom/zykj/blackboard/core/canvas/a;->c:Z

    iput-wide p4, p0, Lcom/zykj/blackboard/core/canvas/a;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/a;->a:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/a;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-boolean v2, p0, Lcom/zykj/blackboard/core/canvas/a;->c:Z

    iget-wide v3, p0, Lcom/zykj/blackboard/core/canvas/a;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;->a(Lkotlin/jvm/functions/Function3;Lcom/zykj/blackboard/core/edit/BoardControl;ZJ)V

    return-void
.end method
