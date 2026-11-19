.class Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/ijk/media/player/IjkDownloadCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EventHandler"
.end annotation


# instance fields
.field private final mWeakCenter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/ijk/media/player/IjkDownloadCenter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;->mWeakCenter:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/ijk/media/player/IjkDownloadCenter$EventHandler;->mWeakCenter:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tencent/ijk/media/player/IjkDownloadCenter;

    .line 8
    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;

    .line 21
    .line 22
    iget-object v2, v1, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;->media:Lcom/tencent/ijk/media/player/IjkDownloadMedia;

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 28
    .line 29
    const/16 v3, 0x64

    .line 30
    .line 31
    if-eq p1, v3, :cond_6

    .line 32
    .line 33
    const/16 v3, 0x12c

    .line 34
    .line 35
    if-eq p1, v3, :cond_5

    .line 36
    .line 37
    const/16 v3, 0x1f4

    .line 38
    .line 39
    if-eq p1, v3, :cond_4

    .line 40
    .line 41
    const/16 v1, 0x258

    .line 42
    .line 43
    if-eq p1, v1, :cond_3

    .line 44
    .line 45
    const/16 v1, 0x384

    .line 46
    .line 47
    if-eq p1, v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-static {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1, v0, v2}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;->downloadProgress(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    invoke-static {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1, v0, v2}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;->downloadFinish(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    invoke-static {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget v3, v1, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;->error:I

    .line 71
    .line 72
    iget-object v1, v1, Lcom/tencent/ijk/media/player/IjkDownloadCenter$NativeEvent;->reason:Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {p1, v0, v2, v3, v1}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;->downloadError(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_5
    invoke-static {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p1, v0, v2}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;->downloadEnd(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    invoke-static {v0}, Lcom/tencent/ijk/media/player/IjkDownloadCenter;->access$000(Lcom/tencent/ijk/media/player/IjkDownloadCenter;)Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {p1, v0, v2}, Lcom/tencent/ijk/media/player/IjkDownloadCenter$OnDownloadListener;->downloadBegin(Lcom/tencent/ijk/media/player/IjkDownloadCenter;Lcom/tencent/ijk/media/player/IjkDownloadMedia;)V

    .line 91
    .line 92
    .line 93
    :cond_7
    :goto_0
    return-void
.end method
