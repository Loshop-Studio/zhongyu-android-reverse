.class public final synthetic Ly9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic f:Lhd/l;

.field public final synthetic g:Z

.field public final synthetic h:Lhd/l;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;ZLhd/l;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/d;->c:Ljava/util/ArrayList;

    iput-object p2, p0, Ly9/d;->d:Ljava/lang/String;

    iput-object p3, p0, Ly9/d;->e:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p4, p0, Ly9/d;->f:Lhd/l;

    iput-boolean p5, p0, Ly9/d;->g:Z

    iput-object p6, p0, Ly9/d;->h:Lhd/l;

    iput-boolean p7, p0, Ly9/d;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Ly9/d;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Ly9/d;->d:Ljava/lang/String;

    iget-object v2, p0, Ly9/d;->e:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v3, p0, Ly9/d;->f:Lhd/l;

    iget-boolean v4, p0, Ly9/d;->g:Z

    iget-object v5, p0, Ly9/d;->h:Lhd/l;

    iget-boolean v6, p0, Ly9/d;->i:Z

    invoke-static/range {v0 .. v6}, Lcom/zykj/blackboard/core/edit/BoardControl;->j(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;ZLhd/l;Z)V

    return-void
.end method
