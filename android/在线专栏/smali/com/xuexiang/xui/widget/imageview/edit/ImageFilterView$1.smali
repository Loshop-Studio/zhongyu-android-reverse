.class Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

.field final synthetic val$mFilterBitmap:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;->val$mFilterBitmap:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;->access$000(Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;)Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView$1;->val$mFilterBitmap:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onBitmapReady(Landroid/graphics/Bitmap;)V

    return-void
.end method
