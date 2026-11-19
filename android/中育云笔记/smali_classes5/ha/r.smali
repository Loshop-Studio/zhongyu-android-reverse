.class public final synthetic Lha/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/play/PlayPageControl;

.field public final synthetic d:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/PlayPageControl;Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lha/r;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iput-object p2, p0, Lha/r;->d:Lhd/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lha/r;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iget-object v1, p0, Lha/r;->d:Lhd/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->x(Lcom/zykj/blackboard/core/play/PlayPageControl;Lhd/a;)V

    return-void
.end method
