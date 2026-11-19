.class public final synthetic Lcom/zykj/blackboard/core/play/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/play/PlayPageControl;

.field public final synthetic b:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/PlayPageControl;Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/j;->a:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iput-object p2, p0, Lcom/zykj/blackboard/core/play/j;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/j;->a:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/j;->b:Lx7/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->b(Lcom/zykj/blackboard/core/play/PlayPageControl;Lx7/a;)V

    return-void
.end method
