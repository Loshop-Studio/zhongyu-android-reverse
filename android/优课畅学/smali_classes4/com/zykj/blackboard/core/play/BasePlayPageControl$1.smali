.class public final Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/PlayStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/play/BasePlayPageControl;-><init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/blackboard/core/play/BasePlayPageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/BasePlayPageControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;->this$0:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPlayEnd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;->this$0:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->access$setSeeActionIsPlay(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPlayPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;->this$0:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->access$setSeeActionIsPlay(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPlayResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;->this$0:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->access$setSeeActionIsPlay(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onPlayStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;->this$0:Lcom/zykj/blackboard/core/play/BasePlayPageControl;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->access$setSeeActionIsPlay(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onProgress(J)V
    .locals 0

    return-void
.end method
