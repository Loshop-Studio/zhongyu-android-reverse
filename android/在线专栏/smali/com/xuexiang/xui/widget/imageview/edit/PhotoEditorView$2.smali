.class Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->saveFilter(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

.field final synthetic val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapReady(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "saveFilter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PhotoEditorView"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->access$100(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->access$000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)Lcom/xuexiang/xui/widget/imageview/edit/ImageFilterView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onBitmapReady(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView$2;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onFailure(Ljava/lang/Exception;)V

    return-void
.end method
