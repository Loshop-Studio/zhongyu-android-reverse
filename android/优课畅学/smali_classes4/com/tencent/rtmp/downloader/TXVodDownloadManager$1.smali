.class Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/network/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->startDownload(Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

.field final synthetic b:Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;

.field final synthetic c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/downloader/TXVodDownloadManager;Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->b:Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onNetFailed(Lcom/tencent/liteav/network/f;Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mMediaInfoArray:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p3, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p3, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 17
    .line 18
    const/16 v0, -0x1389

    .line 19
    .line 20
    invoke-interface {p1, p3, v0, p2}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadError(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onNetSuccess(Lcom/tencent/liteav/network/f;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->isStop:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mMediaInfoArray:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadStop(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string p1, "TXVodDownloadManager"

    .line 26
    .line 27
    const-string v0, "Download task canceled"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/liteav/network/f;->a()Lcom/tencent/liteav/network/i;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->b:Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;

    .line 38
    .line 39
    iget v1, v0, Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;->quality:I

    .line 40
    .line 41
    const/16 v2, 0x3e8

    .line 42
    .line 43
    if-eq v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 46
    .line 47
    invoke-virtual {v0, p1, v1}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->getClassificationSource(Lcom/tencent/liteav/network/i;I)Lcom/tencent/liteav/network/j;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget-object v0, v0, Lcom/tencent/rtmp/downloader/TXVodDownloadDataSource;->templateName:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 57
    .line 58
    invoke-virtual {v1, p1, v0}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->getTemplateSource(Lcom/tencent/liteav/network/i;Ljava/lang/String;)Lcom/tencent/liteav/network/j;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const/4 p1, 0x0

    .line 64
    :goto_0
    if-nez p1, :cond_5

    .line 65
    .line 66
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 67
    .line 68
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mMediaInfoArray:Ljava/util/ArrayList;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 76
    .line 77
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 82
    .line 83
    const/16 v1, -0x138b

    .line 84
    .line 85
    const-string v2, "No such resolution"

    .line 86
    .line 87
    invoke-interface {p1, v0, v1, v2}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadError(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void

    .line 91
    :cond_5
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/tencent/liteav/network/j;->b()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, v0, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->url:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/tencent/liteav/network/j;->d()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iput v1, v0, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->size:I

    .line 106
    .line 107
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/tencent/liteav/network/j;->c()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput p1, v0, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->duration:I

    .line 114
    .line 115
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->c:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 116
    .line 117
    iget-object v0, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$1;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->downloadMedia(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method
