.class final Lcom/zykj/curricula/MainActivity$requestUserCenter$1;
.super Lkotlin/jvm/internal/Lambda;
.source "MainActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/curricula/MainActivity;->requestUserCenter()V
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
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
.field final synthetic this$0:Lcom/zykj/curricula/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/curricula/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 26
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->invoke(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->getStatus()Lcom/zykj/message/server/bean/Status;

    move-result-object v0

    sget-object v1, Lcom/zykj/message/server/bean/Status;->LOGIN:Lcom/zykj/message/server/bean/Status;

    if-ne v0, v1, :cond_0

    .line 136
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-static {v0}, Lcom/zykj/curricula/MainActivity;->access$isInitSuccess$p(Lcom/zykj/curricula/MainActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/zykj/curricula/MainActivity;->access$setInitSuccess$p(Lcom/zykj/curricula/MainActivity;Z)V

    .line 138
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->getServerUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/curricula/MainActivity;->access$setApiHost$p(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/zykj/curricula/MainActivity;->access$setApiToken$p(Lcom/zykj/curricula/MainActivity;Ljava/lang/String;)V

    .line 140
    iget-object p1, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-static {p1}, Lcom/zykj/curricula/MainActivity;->access$initWebViewUrl(Lcom/zykj/curricula/MainActivity;)V

    .line 141
    iget-object p1, p0, Lcom/zykj/curricula/MainActivity$requestUserCenter$1;->this$0:Lcom/zykj/curricula/MainActivity;

    invoke-static {p1}, Lcom/zykj/curricula/MainActivity;->access$initWhiteUrlList(Lcom/zykj/curricula/MainActivity;)V

    :cond_0
    return-void
.end method
