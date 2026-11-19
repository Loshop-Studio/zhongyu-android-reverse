.class public final synthetic Lcom/zykj/blackboard/core/edit/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic c:Lx7/p;

.field public final synthetic d:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/d;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/d;->c:Lx7/p;

    iput-object p4, p0, Lcom/zykj/blackboard/core/edit/d;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/d;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/d;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/d;->c:Lx7/p;

    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/d;->d:Lx7/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;->c(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V

    return-void
.end method
