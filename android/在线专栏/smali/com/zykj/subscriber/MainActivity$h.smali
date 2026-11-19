.class final Lcom/zykj/subscriber/MainActivity$h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$h;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->b()Lcom/zykj/message/server/bean/Status;

    move-result-object v0

    sget-object v1, Lcom/zykj/message/server/bean/Status;->b:Lcom/zykj/message/server/bean/Status;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Lh2/a;->a:Lh2/a;

    invoke-virtual {v0, p1}, Lh2/a;->i(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 3
    sget-object p1, Lz1/b;->a:Lz1/b;

    new-instance v0, Lcom/zykj/subscriber/MainActivity$h$a;

    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$h;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {v0, v1}, Lcom/zykj/subscriber/MainActivity$h$a;-><init>(Lcom/zykj/subscriber/MainActivity;)V

    invoke-virtual {p1, v0}, Lz1/b;->d(Lx2/l;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$h;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
