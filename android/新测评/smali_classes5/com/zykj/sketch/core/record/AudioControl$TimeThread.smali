.class public final Lcom/zykj/sketch/core/record/AudioControl$TimeThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/record/AudioControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "TimeThread"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/AudioControl$TimeThread;",
        "Ljava/lang/Thread;",
        "(Lcom/zykj/sketch/core/record/AudioControl;)V",
        "run",
        "",
        "sketch_release"
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
.field final synthetic this$0:Lcom/zykj/sketch/core/record/AudioControl;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/record/AudioControl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl$TimeThread;->this$0:Lcom/zykj/sketch/core/record/AudioControl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl$TimeThread;->this$0:Lcom/zykj/sketch/core/record/AudioControl;

    .line 5
    .line 6
    invoke-static {v0}, Lcom/zykj/sketch/core/record/AudioControl;->access$getListener$p(Lcom/zykj/sketch/core/record/AudioControl;)Lcom/zykj/sketch/core/listener/ProgressListener;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl$TimeThread;->this$0:Lcom/zykj/sketch/core/record/AudioControl;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/zykj/sketch/core/record/AudioControl;->access$getTotalTime$p(Lcom/zykj/sketch/core/record/AudioControl;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    add-long/2addr v1, v3

    .line 23
    iget-object v3, p0, Lcom/zykj/sketch/core/record/AudioControl$TimeThread;->this$0:Lcom/zykj/sketch/core/record/AudioControl;

    .line 24
    .line 25
    invoke-static {v3}, Lcom/zykj/sketch/core/record/AudioControl;->access$getSystemTime$p(Lcom/zykj/sketch/core/record/AudioControl;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    sub-long/2addr v1, v3

    .line 30
    invoke-interface {v0, v1, v2}, Lcom/zykj/sketch/core/listener/ProgressListener;->progress(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
