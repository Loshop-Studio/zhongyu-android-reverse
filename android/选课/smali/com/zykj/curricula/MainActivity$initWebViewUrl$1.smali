# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class final Lcom/zykj/curricula/MainActivity$initWebViewUrl$1;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/curricula/MainActivity;->initWebViewUrl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/curricula/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/curricula/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/curricula/MainActivity$initWebViewUrl$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity$initWebViewUrl$1;->this$0:Lcom/zykj/curricula/MainActivity;

    sget v1, Lcom/zykj/curricula/R$id;->web_curricula:I

    invoke-virtual {v0, v1}, Lcom/zykj/curricula/MainActivity;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/zykj/curricula/MainActivity$initWebViewUrl$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-static {v1}, Lcom/zykj/curricula/MainActivity;->access$getHomeUrl$p(Lcom/zykj/curricula/MainActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
