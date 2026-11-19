.class public final synthetic Ly9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/edit/BasePageControl;

.field public final synthetic d:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BasePageControl;Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/b;->c:Lcom/zykj/blackboard/core/edit/BasePageControl;

    iput-object p2, p0, Ly9/b;->d:Lhd/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly9/b;->c:Lcom/zykj/blackboard/core/edit/BasePageControl;

    iget-object v1, p0, Ly9/b;->d:Lhd/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->G(Lcom/zykj/blackboard/core/edit/BasePageControl;Lhd/a;)V

    return-void
.end method
