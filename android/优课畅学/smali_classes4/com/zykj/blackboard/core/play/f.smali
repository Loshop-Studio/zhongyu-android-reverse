.class public final synthetic Lcom/zykj/blackboard/core/play/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/play/PlayControl;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx7/l;

.field public final synthetic d:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/f;->a:Lcom/zykj/blackboard/core/play/PlayControl;

    iput-object p2, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/blackboard/core/play/f;->c:Lx7/l;

    iput-object p4, p0, Lcom/zykj/blackboard/core/play/f;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/f;->a:Lcom/zykj/blackboard/core/play/PlayControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/f;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/blackboard/core/play/f;->c:Lx7/l;

    iget-object v3, p0, Lcom/zykj/blackboard/core/play/f;->d:Lx7/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/play/PlayControl;->b(Lcom/zykj/blackboard/core/play/PlayControl;Ljava/lang/String;Lx7/l;Lx7/l;)V

    return-void
.end method
