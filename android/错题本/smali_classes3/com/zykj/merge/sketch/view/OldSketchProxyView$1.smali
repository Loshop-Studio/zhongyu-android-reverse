.class public final Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/player/PlayStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/OldSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\n\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "com/zykj/merge/sketch/view/OldSketchProxyView$1",
        "Lcom/zykj/paint/player/PlayStatusListener;",
        "",
        "p0",
        "Ld6/s;",
        "onUpdate",
        "(J)V",
        "onPlayStart",
        "()V",
        "onPlayEnd",
        "onPlayPause",
        "merge_release"
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
.field final synthetic this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$setPlayStatus$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 29
    .line 30
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayEnd()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public onPlayPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$setPlayStatus$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 29
    .line 30
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayPause()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public onPlayStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$setPlayStatus$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 29
    .line 30
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayStart()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public onUpdate(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->access$getPlayActionListener$p(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onProgress(J)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
