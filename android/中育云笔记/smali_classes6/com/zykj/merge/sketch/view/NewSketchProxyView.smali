.class public final Lcom/zykj/merge/sketch/view/NewSketchProxyView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/Play;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/merge/sketch/view/NewSketchProxyView$WhenMappings;
    }
.end annotation


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private path:Ljava/lang/String;

.field private final playListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private final sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->playListener:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lcom/zykj/merge/sketch/view/NewSketchProxyView$1;-><init>(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->addPlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static final synthetic access$getPlayListener$p(Lcom/zykj/merge/sketch/view/NewSketchProxyView;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->playListener:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->playListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->destroy()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isRend(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView;->isRend(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public loadData(Ljava/lang/String;Lhd/l;Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onFailure"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->path:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData(Ljava/lang/String;Lhd/l;Lhd/l;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->pause()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method

.method public removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->playListener:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public reset()V
    .locals 0

    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public seekTo(ILhd/l;Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/sketch/core/player/SketchPlayerView;->seekTo(ILhd/l;Lhd/l;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setRate(D)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/zykj/merge/sketch/view/NewSketchProxyView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_4

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x5

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_WAIT:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 34
    .line 35
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_END:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_RESUME:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_PAUSE:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_4
    sget-object v0, Lcom/zykj/merge/sketch/constant/PlayStatus;->RECORD_START:Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 49
    .line 50
    return-object v0
.end method

.method public waiting()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/NewSketchProxyView;->sketchPlayView:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->waiting()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
