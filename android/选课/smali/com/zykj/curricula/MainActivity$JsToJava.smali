.class public final Lcom/zykj/curricula/MainActivity$JsToJava;
.super Ljava/lang/Object;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/curricula/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "JsToJava"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/curricula/MainActivity$JsToJava;",
        "",
        "(Lcom/zykj/curricula/MainActivity;)V",
        "refreshToken",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/curricula/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/curricula/MainActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 93
    iput-object p1, p0, Lcom/zykj/curricula/MainActivity$JsToJava;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final refreshToken()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "OkHttp"

    const-string v1, "\u7f51\u9875\u62a5\u9519\uff0c\u8c03\u7528refreshToken"

    .line 97
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    new-instance v1, Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;

    invoke-direct {v1, p0}, Lcom/zykj/curricula/MainActivity$JsToJava$refreshToken$1;-><init>(Lcom/zykj/curricula/MainActivity$JsToJava;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->refreshToken(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
