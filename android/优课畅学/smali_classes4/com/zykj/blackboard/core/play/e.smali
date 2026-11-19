.class public final synthetic Lcom/zykj/blackboard/core/play/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

.field public final synthetic b:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/e;->a:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    iput-object p2, p0, Lcom/zykj/blackboard/core/play/e;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/e;->a:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/e;->b:Lx7/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->a(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Lx7/a;)V

    return-void
.end method
