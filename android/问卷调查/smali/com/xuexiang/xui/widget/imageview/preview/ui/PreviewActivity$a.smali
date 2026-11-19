.class public Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;)V
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity$a;->a:Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->x:I

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;->finish()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
