.class public abstract Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoPlayer;
.super Lcom/shuyu/gsyvideoplayer/video/base/GSYBaseVideoPlayer;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/shuyu/gsyvideoplayer/video/base/GSYBaseVideoPlayer;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/shuyu/gsyvideoplayer/video/base/GSYBaseVideoPlayer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/shuyu/gsyvideoplayer/video/base/GSYBaseVideoPlayer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/shuyu/gsyvideoplayer/video/base/GSYBaseVideoPlayer;-><init>(Landroid/content/Context;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public backFromFull(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lk7/c;->p(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public getFullId()I
    .locals 1

    .line 1
    sget v0, Lk7/c;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public getGSYVideoManager()Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoViewBridge;
    .locals 2

    .line 1
    invoke-static {}, Lk7/c;->q()Lk7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lk7/b;->i(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lk7/c;->q()Lk7/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public getSmallId()I
    .locals 1

    .line 1
    sget v0, Lk7/c;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public releaseVideos()V
    .locals 0

    .line 1
    invoke-static {}, Lk7/c;->r()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
