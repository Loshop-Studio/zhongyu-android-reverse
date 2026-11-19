.class Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/rtmp/downloader/TXVodDownloadManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/downloader/TXVodDownloadManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public downloadBegin(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->convertMedia(Lcom/tencent/ijk/media/player/IjkDownloadMedia;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "downloadBegin "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->playPath:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "TXVodDownloadManager"

    .line 29
    .line 30
    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 34
    .line 35
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 36
    .line 37
    invoke-interface {p2, p1}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadStart(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Ljava/io/File;

    .line 41
    .line 42
    iget-object p1, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->playPath:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    const-string p1, "file state ok"

    .line 54
    .line 55
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    const-string p1, "file not create!"

    .line 60
    .line 61
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method public downloadEnd(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->convertMedia(Lcom/tencent/ijk/media/player/IjkDownloadMedia;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "downloadEnd "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->playPath:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "TXVodDownloadManager"

    .line 29
    .line 30
    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 34
    .line 35
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mMediaInfoArray:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 41
    .line 42
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 43
    .line 44
    invoke-interface {p2, p1}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadStop(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public downloadError(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->convertMedia(Lcom/tencent/ijk/media/player/IjkDownloadMedia;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "downloadError "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->playPath:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, " "

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const-string v0, "TXVodDownloadManager"

    .line 37
    .line 38
    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 42
    .line 43
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mMediaInfoArray:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    iget-boolean p2, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->isStop:Z

    .line 49
    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 53
    .line 54
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 55
    .line 56
    invoke-interface {p2, p1}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadStop(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/16 p2, 0x3f0

    .line 61
    .line 62
    if-ne p3, p2, :cond_1

    .line 63
    .line 64
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 65
    .line 66
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 67
    .line 68
    const/16 p3, -0x138e

    .line 69
    .line 70
    invoke-interface {p2, p1, p3, p4}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadError(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 75
    .line 76
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 77
    .line 78
    const/16 p3, -0x138d

    .line 79
    .line 80
    invoke-interface {p2, p1, p3, p4}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadError(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public downloadFinish(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->convertMedia(Lcom/tencent/ijk/media/player/IjkDownloadMedia;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    new-instance p2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "downloadFinish "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->playPath:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "TXVodDownloadManager"

    .line 29
    .line 30
    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 34
    .line 35
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mMediaInfoArray:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance p2, Ljava/io/File;

    .line 41
    .line 42
    iget-object v0, p1, Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;->playPath:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {p2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_0

    .line 52
    .line 53
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 54
    .line 55
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 56
    .line 57
    invoke-interface {p2, p1}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadFinish(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 62
    .line 63
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 64
    .line 65
    const/16 v0, -0x138b

    .line 66
    .line 67
    const-string v1, "The file has been deleted"

    .line 68
    .line 69
    invoke-interface {p2, p1, v0, v1}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadError(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public downloadProgress(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->convertMedia(Lcom/tencent/ijk/media/player/IjkDownloadMedia;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 10
    .line 11
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 12
    .line 13
    invoke-interface {p2, p1}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->onDownloadProgress(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public hlsKeyVerify(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;Ljava/lang/String;[B)I
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->convertMedia(Lcom/tencent/ijk/media/player/IjkDownloadMedia;)Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lcom/tencent/rtmp/downloader/TXVodDownloadManager$2;->a:Lcom/tencent/rtmp/downloader/TXVodDownloadManager;

    .line 10
    .line 11
    iget-object p2, p2, Lcom/tencent/rtmp/downloader/TXVodDownloadManager;->mListener:Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;

    .line 12
    .line 13
    invoke-interface {p2, p1, p3, p4}, Lcom/tencent/rtmp/downloader/ITXVodDownloadListener;->hlsKeyVerify(Lcom/tencent/rtmp/downloader/TXVodDownloadMediaInfo;Ljava/lang/String;[B)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method
