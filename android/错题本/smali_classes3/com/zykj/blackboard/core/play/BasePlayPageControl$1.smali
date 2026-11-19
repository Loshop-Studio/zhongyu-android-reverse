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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/blackboard/core/play/BasePlayPageControl$1",
        "Lcom/zykj/blackboard/listener/PlayStatusListener;",
        "Ld6/s;",
        "onPlayStart",
        "()V",
        "onPlayResume",
        "onPlayEnd",
        "onPlayPause",
        "",
        "progress",
        "onProgress",
        "(J)V",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
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
