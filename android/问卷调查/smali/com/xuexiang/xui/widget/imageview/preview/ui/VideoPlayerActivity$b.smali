.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$b;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$b;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity$b;->b:Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;

    .line 1
    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/preview/ui/VideoPlayerActivity;->o:Landroid/widget/VideoView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/VideoView;->stopPlayback()V

    :cond_0
    return-void
.end method
