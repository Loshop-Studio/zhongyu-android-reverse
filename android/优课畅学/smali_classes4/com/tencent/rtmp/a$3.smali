.class Lcom/tencent/rtmp/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rtmp/a;->a(Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/a;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/a$3;->a:Lcom/tencent/rtmp/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;ILcom/tencent/liteav/basic/structs/TXSVideoFrame;)V
    .locals 4

    .line 1
    if-eqz p3, :cond_2

    .line 2
    .line 3
    iget p1, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 4
    .line 5
    if-lez p1, :cond_2

    .line 6
    .line 7
    iget p1, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 8
    .line 9
    if-gtz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/tencent/rtmp/a$3;->a:Lcom/tencent/rtmp/a;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/tencent/rtmp/a;->f(Lcom/tencent/rtmp/a;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lcom/tencent/rtmp/a$3;->a:Lcom/tencent/rtmp/a;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {p2, v0}, Lcom/tencent/rtmp/a;->a(Lcom/tencent/rtmp/a;[B)[B

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/tencent/rtmp/a$3;->a:Lcom/tencent/rtmp/a;

    .line 25
    .line 26
    invoke-static {p2}, Lcom/tencent/rtmp/a;->g(Lcom/tencent/rtmp/a;)Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    array-length v0, p1

    .line 35
    iget v1, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 36
    .line 37
    iget v2, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 38
    .line 39
    mul-int/2addr v1, v2

    .line 40
    mul-int/lit8 v1, v1, 0x3

    .line 41
    .line 42
    div-int/lit8 v1, v1, 0x2

    .line 43
    .line 44
    if-lt v0, v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p3, p1}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->loadYUVArray([B)V

    .line 47
    .line 48
    .line 49
    iget v0, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 50
    .line 51
    iget v1, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 52
    .line 53
    iget-wide v2, p3, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->pts:J

    .line 54
    .line 55
    long-to-int v2, v2

    .line 56
    invoke-interface {p2, p1, v0, v1, v2}, Lcom/tencent/rtmp/TXLivePlayer$ITXVideoRawDataListener;->onVideoRawDataAvailable([BIII)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->release()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    const-string p1, "TXLivePlayer"

    .line 64
    .line 65
    const-string p2, "raw data buffer length is too large"

    .line 66
    .line 67
    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    :goto_0
    return-void
.end method
