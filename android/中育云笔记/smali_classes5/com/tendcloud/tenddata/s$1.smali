.class Lcom/tendcloud/tenddata/s$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/s;->a(Landroid/util/JsonWriter;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/s;

.field final synthetic val$callFun:Ljava/lang/String;

.field final synthetic val$webview:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/s;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/s$1;->this$0:Lcom/tendcloud/tenddata/s;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/s$1;->val$webview:Landroid/webkit/WebView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tendcloud/tenddata/s$1;->val$callFun:Ljava/lang/String;

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
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tendcloud/tenddata/s;->a(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x13

    .line 11
    .line 12
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$1;->val$webview:Landroid/webkit/WebView;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/tendcloud/tenddata/s$1;->val$callFun:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v2, Lcom/tendcloud/tenddata/s$1$1;

    .line 23
    .line 24
    invoke-direct {v2, p0}, Lcom/tendcloud/tenddata/s$1$1;-><init>(Lcom/tendcloud/tenddata/s$1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/s$1;->val$webview:Landroid/webkit/WebView;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/tendcloud/tenddata/s$1;->val$callFun:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :catchall_0
    return-void
.end method
