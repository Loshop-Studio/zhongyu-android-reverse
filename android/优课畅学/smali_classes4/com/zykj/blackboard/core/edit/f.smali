.class public final synthetic Lcom/zykj/blackboard/core/edit/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/f;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/f;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/f;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/f;->b:Lx7/l;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->d(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;)V

    return-void
.end method
