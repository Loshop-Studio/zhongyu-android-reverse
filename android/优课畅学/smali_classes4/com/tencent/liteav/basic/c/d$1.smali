.class Lcom/tencent/liteav/basic/c/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/basic/c/d;->a(IZIIIIIZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:Z

.field final synthetic i:Z

.field final synthetic j:Lcom/tencent/liteav/basic/c/d;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/basic/c/d;IZIIIIIZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/basic/c/d$1;->j:Lcom/tencent/liteav/basic/c/d;

    .line 2
    .line 3
    iput p2, p0, Lcom/tencent/liteav/basic/c/d$1;->a:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/tencent/liteav/basic/c/d$1;->b:Z

    .line 6
    .line 7
    iput p4, p0, Lcom/tencent/liteav/basic/c/d$1;->c:I

    .line 8
    .line 9
    iput p5, p0, Lcom/tencent/liteav/basic/c/d$1;->d:I

    .line 10
    .line 11
    iput p6, p0, Lcom/tencent/liteav/basic/c/d$1;->e:I

    .line 12
    .line 13
    iput p7, p0, Lcom/tencent/liteav/basic/c/d$1;->f:I

    .line 14
    .line 15
    iput p8, p0, Lcom/tencent/liteav/basic/c/d$1;->g:I

    .line 16
    .line 17
    iput-boolean p9, p0, Lcom/tencent/liteav/basic/c/d$1;->h:Z

    .line 18
    .line 19
    iput-boolean p10, p0, Lcom/tencent/liteav/basic/c/d$1;->i:Z

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/c/d$1;->j:Lcom/tencent/liteav/basic/c/d;

    .line 2
    .line 3
    iget v1, p0, Lcom/tencent/liteav/basic/c/d$1;->a:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/tencent/liteav/basic/c/d$1;->b:Z

    .line 6
    .line 7
    iget v3, p0, Lcom/tencent/liteav/basic/c/d$1;->c:I

    .line 8
    .line 9
    iget v4, p0, Lcom/tencent/liteav/basic/c/d$1;->d:I

    .line 10
    .line 11
    iget v5, p0, Lcom/tencent/liteav/basic/c/d$1;->e:I

    .line 12
    .line 13
    iget v6, p0, Lcom/tencent/liteav/basic/c/d$1;->f:I

    .line 14
    .line 15
    iget v7, p0, Lcom/tencent/liteav/basic/c/d$1;->g:I

    .line 16
    .line 17
    iget-boolean v8, p0, Lcom/tencent/liteav/basic/c/d$1;->h:Z

    .line 18
    .line 19
    iget-boolean v9, p0, Lcom/tencent/liteav/basic/c/d$1;->i:Z

    .line 20
    .line 21
    invoke-static/range {v0 .. v9}, Lcom/tencent/liteav/basic/c/d;->a(Lcom/tencent/liteav/basic/c/d;IZIIIIIZZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "surface-render: render texture error occurred!"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "TXGLSurfaceRenderThread"

    .line 48
    .line 49
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
