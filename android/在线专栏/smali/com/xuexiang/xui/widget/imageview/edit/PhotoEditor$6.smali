.class Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->saveAsBitmap(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

.field final synthetic val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

.field final synthetic val$saveSettings:Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$saveSettings:Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;

    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapReady(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6$1;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 2
    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;->val$onBitmapSaveListener:Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;->onFailure(Ljava/lang/Exception;)V

    return-void
.end method
