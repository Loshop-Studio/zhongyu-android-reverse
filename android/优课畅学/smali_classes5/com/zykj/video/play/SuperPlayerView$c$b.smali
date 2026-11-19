.class public Lcom/zykj/video/play/SuperPlayerView$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/SuperPlayerView$c;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/SuperPlayerView$c;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/SuperPlayerView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c$b;->a:Lcom/zykj/video/play/SuperPlayerView$c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onSnapshot(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c$b;->a:Lcom/zykj/video/play/SuperPlayerView$c;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/zykj/video/play/SuperPlayerView;->L(Lcom/zykj/video/play/SuperPlayerView;Landroid/graphics/Bitmap;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
