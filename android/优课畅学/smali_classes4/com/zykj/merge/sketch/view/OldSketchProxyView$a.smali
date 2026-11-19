.class public final Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/OldSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->n(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

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
    check-cast v1, Lx3/c;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Lx3/c;->onProgress(J)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public onPlayEnd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->f:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->o(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->n(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

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
    check-cast v1, Lx3/c;

    .line 29
    .line 30
    invoke-interface {v1}, Lx3/c;->onPlayEnd()V

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->d:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->o(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->n(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

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
    check-cast v1, Lx3/c;

    .line 29
    .line 30
    invoke-interface {v1}, Lx3/c;->onPlayPause()V

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
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/merge/sketch/constant/PlayStatus;->c:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->o(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lcom/zykj/merge/sketch/constant/PlayStatus;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/OldSketchProxyView$a;->a:Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->n(Lcom/zykj/merge/sketch/view/OldSketchProxyView;)Ljava/util/List;

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
    check-cast v1, Lx3/c;

    .line 29
    .line 30
    invoke-interface {v1}, Lx3/c;->onPlayStart()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method
