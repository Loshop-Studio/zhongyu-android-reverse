.class public final synthetic Ly9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic e:Lhd/p;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/e;->c:Ljava/lang/String;

    iput-object p2, p0, Ly9/e;->d:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p3, p0, Ly9/e;->e:Lhd/p;

    iput-object p4, p0, Ly9/e;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly9/e;->c:Ljava/lang/String;

    iget-object v1, p0, Ly9/e;->d:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v2, p0, Ly9/e;->e:Lhd/p;

    iget-object v3, p0, Ly9/e;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;->f(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V

    return-void
.end method
