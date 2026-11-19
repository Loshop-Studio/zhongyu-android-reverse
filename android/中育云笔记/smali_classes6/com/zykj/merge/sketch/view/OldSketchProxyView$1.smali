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
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayEnd()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
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
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayPause()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
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
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onPlayStart()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
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
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/merge/sketch/listener/PlayStatusListener;

    .line 24
    .line 25
    invoke-interface {v1, p1, p2}, Lcom/zykj/merge/sketch/listener/PlayStatusListener;->onProgress(J)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method
