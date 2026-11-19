.class final Lcom/zykj/insight/ui/MainActivity$onResume$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/insight/ui/MainActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
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
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "it",
        "",
        "a",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/insight/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/insight/ui/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/insight/ui/MainActivity$onResume$1;->a:Lcom/zykj/insight/ui/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->d()Lcom/zykj/message/server/bean/Status;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/insight/ui/MainActivity$onResume$1;->a:Lcom/zykj/insight/ui/MainActivity;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/insight/ui/MainActivity;->i(Lcom/zykj/insight/ui/MainActivity;)Lcom/zykj/insight/ui/MainViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lcom/zykj/insight/ui/MainViewModel;->f(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/insight/ui/MainActivity$onResume$1;->a:Lcom/zykj/insight/ui/MainActivity;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/insight/ui/MainActivity;->i(Lcom/zykj/insight/ui/MainActivity;)Lcom/zykj/insight/ui/MainViewModel;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/zykj/insight/ui/MainViewModel;->c()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 34
    .line 35
    const-string v0, "\u7528\u6237\u672a\u767b\u5f55"

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->toast(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/insight/ui/MainActivity$onResume$1;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p1
.end method
