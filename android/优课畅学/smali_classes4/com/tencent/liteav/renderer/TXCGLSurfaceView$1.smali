.class Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->setFPS(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 2
    .line 3
    iput p2, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 2
    .line 3
    iget v1, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->a:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-static {v0, v1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)I

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x3c

    .line 30
    .line 31
    if-le v0, v1, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;I)I

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 39
    .line 40
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->a(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;J)J

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/tencent/liteav/renderer/TXCGLSurfaceView$1;->b:Lcom/tencent/liteav/renderer/TXCGLSurfaceView;

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/renderer/TXCGLSurfaceView;->b(Lcom/tencent/liteav/renderer/TXCGLSurfaceView;J)J

    .line 48
    .line 49
    .line 50
    return-void
.end method
