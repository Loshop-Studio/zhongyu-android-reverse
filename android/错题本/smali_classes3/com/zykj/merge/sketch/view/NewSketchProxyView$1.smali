.class public final Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/PlayActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/NewSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0004\u00a8\u0006\u000c"
    }
    d2 = {
        "com/zykj/merge/sketch/view/NewSketchProxyView$1",
        "Lcom/zykj/sketch/core/listener/PlayActionListener;",
        "Ld6/s;",
        "onPlayEnd",
        "()V",
        "onPlayPause",
        "onPlayStart",
        "",
        "progress",
        "onProgress",
        "(J)V",
        "onWaitPlay",
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
.field final synthetic this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->access$getPlayListener$p(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)Ljava/util/List;

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
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayEnd()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->reset()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public onPlayPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->access$getPlayListener$p(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)Ljava/util/List;

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
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayPause()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public onPlayStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->access$getPlayListener$p(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)Ljava/util/List;

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
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayStart()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public onProgress(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->access$getPlayListener$p(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)Ljava/util/List;

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

.method public onWaitPlay()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;->this$0:Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->access$getPlayListener$p(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)Ljava/util/List;

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
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayWait()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
