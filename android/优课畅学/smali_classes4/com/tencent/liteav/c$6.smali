.class Lcom/tencent/liteav/c$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/c;->onNotifyEvent(ILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Lcom/tencent/liteav/c;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/c;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/c$6;->c:Lcom/tencent/liteav/c;

    .line 2
    .line 3
    iput p2, p0, Lcom/tencent/liteav/c$6;->a:I

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tencent/liteav/c$6;->b:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/c$6;->c:Lcom/tencent/liteav/c;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/tencent/liteav/i;->e:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/c$6;->a:I

    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/liteav/c$6;->b:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lcom/tencent/liteav/c$6;->a:I

    .line 13
    .line 14
    const/16 v1, 0x837

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/c$6;->c:Lcom/tencent/liteav/c;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/tencent/liteav/c;->f(Lcom/tencent/liteav/c;)Lcom/tencent/liteav/TXCRenderAndDec;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/c$6;->c:Lcom/tencent/liteav/c;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/tencent/liteav/c;->f(Lcom/tencent/liteav/c;)Lcom/tencent/liteav/TXCRenderAndDec;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/tencent/liteav/TXCRenderAndDec;->restartDecoder()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method
