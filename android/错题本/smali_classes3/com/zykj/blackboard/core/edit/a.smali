.class public final synthetic Lcom/zykj/blackboard/core/edit/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic d:Lr6/c;

.field public final synthetic e:Z

.field public final synthetic f:Lr6/c;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;ZLr6/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/a;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/a;->c:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p4, p0, Lcom/zykj/blackboard/core/edit/a;->d:Lr6/c;

    iput-boolean p5, p0, Lcom/zykj/blackboard/core/edit/a;->e:Z

    iput-object p6, p0, Lcom/zykj/blackboard/core/edit/a;->f:Lr6/c;

    iput-boolean p7, p0, Lcom/zykj/blackboard/core/edit/a;->g:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/a;->f:Lr6/c;

    iget-boolean v6, p0, Lcom/zykj/blackboard/core/edit/a;->g:Z

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/a;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/a;->c:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/a;->d:Lr6/c;

    iget-boolean v4, p0, Lcom/zykj/blackboard/core/edit/a;->e:Z

    invoke-static/range {v0 .. v6}, Lcom/zykj/blackboard/core/edit/BoardControl;->c(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;ZLr6/c;Z)V

    return-void
.end method
