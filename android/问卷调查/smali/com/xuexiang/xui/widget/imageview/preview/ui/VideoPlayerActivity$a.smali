.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    const p2, 0x7f0f007c

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return p3
.end method
