.class public final synthetic Lcom/zykj/blackboard/core/play/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/i;->a:Lx7/l;

    iput-object p2, p0, Lcom/zykj/blackboard/core/play/i;->b:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/i;->a:Lx7/l;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/i;->b:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;->c(Lx7/l;Ljava/lang/Exception;)V

    return-void
.end method
