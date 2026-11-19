.class Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->onBitmapReady(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$1000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$1000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setDrawingCacheEnabled(Z)V

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$saveSettings:Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;->isTransparencyEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$1000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/BitmapUtil;->removeTransparency(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    .line 6
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$1000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->doInBackground([Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 2
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$saveSettings:Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;->isClearViewsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->clearAllViews()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onBitmapReady(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object p1, p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to load the bitmap"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onFailure(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->onPostExecute(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->clearHelperBox()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;->this$1:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->access$1000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setDrawingCacheEnabled(Z)V

    return-void
.end method
