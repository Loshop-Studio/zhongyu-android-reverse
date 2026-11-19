.class final Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;
.super Lkotlin/jvm/internal/Lambda;
.source "MainActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/curricula/MainActivity$JsToJava;->refreshToken()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/curricula/MainActivity$JsToJava;


# direct methods
.method constructor <init>(Lcom/zykj/curricula/MainActivity$JsToJava;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;->this$0:Lcom/zykj/curricula/MainActivity$JsToJava;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;->invoke(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 100
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->getToken()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    .line 101
    :goto_0
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    const-string v0, "OkHttp"

    const-string v1, "\u7f51\u9875\u62a5\u9519\uff0c\u56de\u8c03\u8fd4\u56de"

    .line 102
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;->this$0:Lcom/zykj/curricula/MainActivity$JsToJava;

    iget-object v0, v0, Lcom/zykj/curricula/MainActivity$JsToJava;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-static {v0, p1}, Lcom/zykj/curricula/MainActivity;->access$setApiToken$p(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)V

    .line 104
    iget-object p1, p0, Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;->this$0:Lcom/zykj/curricula/MainActivity$JsToJava;

    iget-object p1, p1, Lcom/zykj/curricula/MainActivity$JsToJava;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-static {p1}, Lcom/zykj/curricula/MainActivity;->access$initWebViewUrl(Lcom/zykj/curricula/MainActivity;)V

    :cond_2
    return-void
.end method
