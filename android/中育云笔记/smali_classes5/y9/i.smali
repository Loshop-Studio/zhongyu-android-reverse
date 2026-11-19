.class public final synthetic Ly9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic f:Lhd/l;

.field public final synthetic g:Lhd/l;

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;Lhd/l;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/i;->c:Ljava/util/ArrayList;

    iput-object p2, p0, Ly9/i;->d:Ljava/lang/String;

    iput-object p3, p0, Ly9/i;->e:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p4, p0, Ly9/i;->f:Lhd/l;

    iput-object p5, p0, Ly9/i;->g:Lhd/l;

    iput-boolean p6, p0, Ly9/i;->h:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Ly9/i;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Ly9/i;->d:Ljava/lang/String;

    iget-object v2, p0, Ly9/i;->e:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v3, p0, Ly9/i;->f:Lhd/l;

    iget-object v4, p0, Ly9/i;->g:Lhd/l;

    iget-boolean v5, p0, Ly9/i;->h:Z

    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/core/edit/BoardControl;->h(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/l;Lhd/l;Z)V

    return-void
.end method
