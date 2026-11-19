.class public abstract Lcom/tencent/liteav/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected b:Lcom/tencent/liteav/d;

.field protected c:Landroid/content/Context;

.field protected d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

.field protected e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/tencent/liteav/i;->c:Landroid/content/Context;

    .line 18
    .line 19
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 0

    .line 1
    const/4 p1, -0x1

    return p1
.end method

.method public abstract a(Ljava/lang/String;I)I
.end method

.method public abstract a(Z)I
.end method

.method public a()V
    .locals 2

    .line 10
    const-string v0, "TXIPlayer"

    const-string v1, "pause not support"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract a(I)V
.end method

.method public a(II)V
    .locals 0

    .line 2
    return-void
.end method

.method public a(Landroid/content/Context;I)V
    .locals 0

    .line 3
    return-void
.end method

.method public a(Landroid/view/Surface;)V
    .locals 0

    .line 4
    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/b/b;)V
    .locals 1

    .line 12
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/tencent/liteav/i;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public abstract a(Lcom/tencent/liteav/basic/c/k;)V
.end method

.method public a(Lcom/tencent/liteav/d;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    if-nez p1, :cond_0

    .line 9
    new-instance p1, Lcom/tencent/liteav/d;

    invoke-direct {p1}, Lcom/tencent/liteav/d;-><init>()V

    iput-object p1, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/liteav/j;Lcom/tencent/liteav/basic/a/b;Ljava/lang/Object;)V
    .locals 0

    .line 5
    return-void
.end method

.method public a(Lcom/tencent/rtmp/TXLivePlayer$ITXAudioRawDataListener;)V
    .locals 0

    .line 6
    return-void
.end method

.method public a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/tencent/liteav/i;->d:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    return-void
.end method

.method public a(Lcom/tencent/ugc/TXRecordCommon$ITXVideoRecordListener;)V
    .locals 0

    .line 7
    return-void
.end method

.method public abstract a(ZI)V
.end method

.method public b()V
    .locals 2

    .line 1
    const-string v0, "TXIPlayer"

    const-string v1, "resume not support"

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(F)V
    .locals 1

    .line 2
    const-string p1, "TXIPlayer"

    const-string v0, "rate not implement"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(I)V
.end method

.method public abstract b(Z)V
.end method

.method public abstract c(I)V
.end method

.method public abstract c(Z)V
.end method

.method public abstract c()Z
.end method

.method public abstract d(I)I
.end method

.method public d()Landroid/view/TextureView;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Z)Z
    .locals 0

    .line 2
    const/4 p1, 0x0

    return p1
.end method

.method public abstract e()I
.end method

.method public e(I)V
    .locals 1

    .line 1
    const-string p1, "TXIPlayer"

    const-string v0, "seek not support"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 2
    const-string p1, "TXIPlayer"

    const-string v0, "autoPlay not implement"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public abstract i()I
.end method

.method public q()Lcom/tencent/liteav/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/i;->b:Lcom/tencent/liteav/d;

    .line 2
    .line 3
    return-object v0
.end method
