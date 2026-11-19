.class Lcom/tencent/rtmp/TXVodPlayer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rtmp/TXVodPlayer;->postBitmapToMainThread(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;

.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Lcom/tencent/rtmp/TXVodPlayer;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/TXVodPlayer;Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer$1;->c:Lcom/tencent/rtmp/TXVodPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tencent/rtmp/TXVodPlayer$1;->a:Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tencent/rtmp/TXVodPlayer$1;->b:Landroid/graphics/Bitmap;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer$1;->a:Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/rtmp/TXVodPlayer$1;->b:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;->onSnapshot(Landroid/graphics/Bitmap;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer$1;->c:Lcom/tencent/rtmp/TXVodPlayer;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v0, v1}, Lcom/tencent/rtmp/TXVodPlayer;->access$002(Lcom/tencent/rtmp/TXVodPlayer;Z)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
