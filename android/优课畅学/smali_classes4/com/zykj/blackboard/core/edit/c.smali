.class public final synthetic Lcom/zykj/blackboard/core/edit/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic b:Lx7/l;

.field public final synthetic c:Z

.field public final synthetic d:Lx7/l;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;ZLx7/l;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/c;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/c;->b:Lx7/l;

    iput-boolean p3, p0, Lcom/zykj/blackboard/core/edit/c;->c:Z

    iput-object p4, p0, Lcom/zykj/blackboard/core/edit/c;->d:Lx7/l;

    iput-boolean p5, p0, Lcom/zykj/blackboard/core/edit/c;->e:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/c;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/c;->b:Lx7/l;

    iget-boolean v2, p0, Lcom/zykj/blackboard/core/edit/c;->c:Z

    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/c;->d:Lx7/l;

    iget-boolean v4, p0, Lcom/zykj/blackboard/core/edit/c;->e:Z

    invoke-static {v0, v1, v2, v3, v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->b(Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/l;ZLx7/l;Z)V

    return-void
.end method
