.class public final Lw2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw2/g;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 1
    sget p1, Lcom/xuexiang/xui/R$string;->xui_preview_play_failed:I

    .line 2
    .line 3
    iget-object p2, p0, Lw2/g;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    invoke-static {p2, p1, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 11
    .line 12
    .line 13
    return p3
.end method
