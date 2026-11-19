.class public final synthetic Lcom/zykj/blackboard/core/action/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lr9/b;

.field public final synthetic d:Lcom/zykj/blackboard/core/action/BaseWriteAction;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Lba/c;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lba/a;


# direct methods
.method public synthetic constructor <init>(Lr9/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lba/c;Ljava/lang/String;Lba/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/a;->c:Lr9/b;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/a;->d:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p3, p0, Lcom/zykj/blackboard/core/action/a;->e:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/blackboard/core/action/a;->f:Lba/c;

    iput-object p5, p0, Lcom/zykj/blackboard/core/action/a;->g:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/blackboard/core/action/a;->h:Lba/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/a;->c:Lr9/b;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/a;->d:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/a;->e:Ljava/util/List;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/a;->f:Lba/c;

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/a;->g:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/blackboard/core/action/a;->h:Lba/a;

    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a(Lr9/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lba/c;Ljava/lang/String;Lba/a;)V

    return-void
.end method
