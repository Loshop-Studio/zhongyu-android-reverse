.class Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/c/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->pushVideoFrameInternal(IIIJZ)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:I

.field final synthetic c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->a:Z

    .line 4
    .line 5
    iput p3, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 5
    .line 6
    iget-object v1, v0, Lcom/tencent/liteav/videoencoder/b;->mListener:Lcom/tencent/liteav/videoencoder/c;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget v0, v0, Lcom/tencent/liteav/videoencoder/b;->mStreamType:I

    .line 11
    .line 12
    invoke-interface {v1, v0}, Lcom/tencent/liteav/videoencoder/c;->b(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->a:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->access$000(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iget v4, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->b:I

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 31
    .line 32
    iget v5, v0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 33
    .line 34
    iget v6, v0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 35
    .line 36
    invoke-static {v0}, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->access$100(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    invoke-static/range {v1 .. v8}, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->access$200(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;JIIIJ)I

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v1, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->access$000(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    iget v4, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->b:I

    .line 51
    .line 52
    iget-object v0, p0, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder$1;->c:Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;

    .line 53
    .line 54
    iget v5, v0, Lcom/tencent/liteav/videoencoder/b;->mOutputWidth:I

    .line 55
    .line 56
    iget v6, v0, Lcom/tencent/liteav/videoencoder/b;->mOutputHeight:I

    .line 57
    .line 58
    invoke-static {v0}, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->access$100(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    invoke-static/range {v1 .. v8}, Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;->access$300(Lcom/tencent/liteav/videoencoder/TXCSWVideoEncoder;JIIIJ)I

    .line 63
    .line 64
    .line 65
    :goto_1
    monitor-exit p1

    .line 66
    return-void

    .line 67
    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw v0
.end method
