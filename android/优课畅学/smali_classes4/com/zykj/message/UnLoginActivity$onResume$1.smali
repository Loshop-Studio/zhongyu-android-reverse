.class final Lcom/zykj/message/UnLoginActivity$onResume$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/UnLoginActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/UnLoginActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/message/UnLoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/UnLoginActivity$onResume$1;->a:Lcom/zykj/message/UnLoginActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object p1, Lcom/zykj/message/server/bean/Status;->c:Lcom/zykj/message/server/bean/Status;

    .line 14
    .line 15
    :goto_0
    sget-object v0, Lz3/a;->a:[I

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    aget p1, v0, p1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/zykj/message/UnLoginActivity$onResume$1;->a:Lcom/zykj/message/UnLoginActivity;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/message/UnLoginActivity;->n(Lcom/zykj/message/UnLoginActivity;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/message/UnLoginActivity$onResume$1;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p1
.end method
