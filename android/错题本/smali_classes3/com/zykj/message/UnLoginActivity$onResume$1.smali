.class final Lcom/zykj/message/UnLoginActivity$onResume$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "it",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/message/UnLoginActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/message/UnLoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/UnLoginActivity$onResume$1;->this$0:Lcom/zykj/message/UnLoginActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/message/UnLoginActivity$onResume$1;->invoke(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p1, Lcom/zykj/message/server/bean/ServerInfo;->a:Lcom/zykj/message/server/bean/Status;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->LOGOUT:Lcom/zykj/message/server/bean/Status;

    :goto_0
    sget-object v0, Lcom/zykj/message/b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/UnLoginActivity$onResume$1;->this$0:Lcom/zykj/message/UnLoginActivity;

    sget v0, Lcom/zykj/message/UnLoginActivity;->c:I

    .line 4
    invoke-virtual {p1}, Lcom/zykj/message/UnLoginActivity;->p()V

    return-void
.end method
