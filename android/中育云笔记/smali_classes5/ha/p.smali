.class public final synthetic Lha/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:Lcom/zykj/blackboard/core/play/PlayControl;


# direct methods
.method public synthetic constructor <init>(Lhd/l;Lcom/zykj/blackboard/core/play/PlayControl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lha/p;->c:Lhd/l;

    iput-object p2, p0, Lha/p;->d:Lcom/zykj/blackboard/core/play/PlayControl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lha/p;->c:Lhd/l;

    iget-object v1, p0, Lha/p;->d:Lcom/zykj/blackboard/core/play/PlayControl;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;->h(Lhd/l;Lcom/zykj/blackboard/core/play/PlayControl;)V

    return-void
.end method
