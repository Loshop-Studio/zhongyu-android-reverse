.class Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->a(Lcom/tencent/liteav/basic/util/TXHttpRequest$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

.field final synthetic b:Lcom/tencent/liteav/basic/util/TXHttpRequest;

.field final synthetic c:Lcom/tencent/liteav/basic/util/TXHttpRequest$a;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/basic/util/TXHttpRequest$a;Lcom/tencent/liteav/basic/util/TXHttpRequest$b;Lcom/tencent/liteav/basic/util/TXHttpRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->c:Lcom/tencent/liteav/basic/util/TXHttpRequest$a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->a:Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->b:Lcom/tencent/liteav/basic/util/TXHttpRequest;

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
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "TXPostRequest->recvMsg: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->a:Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    .line 12
    .line 13
    iget v1, v1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "|"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->a:Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "TXHttpRequest"

    .line 35
    .line 36
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->b:Lcom/tencent/liteav/basic/util/TXHttpRequest;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->access$000(Lcom/tencent/liteav/basic/util/TXHttpRequest;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object v3, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;->a:Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    .line 46
    .line 47
    iget v4, v3, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I

    .line 48
    .line 49
    iget-object v3, v3, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->c:[B

    .line 50
    .line 51
    invoke-static {v0, v1, v2, v4, v3}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->access$100(Lcom/tencent/liteav/basic/util/TXHttpRequest;JI[B)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
