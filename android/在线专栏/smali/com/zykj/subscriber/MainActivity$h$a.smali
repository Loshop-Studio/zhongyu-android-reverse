.class final Lcom/zykj/subscriber/MainActivity$h$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity$h;->a(Lcom/zykj/message/server/bean/ServerInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 4
    .param p1    # Lcom/zykj/message/server/bean/UserInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "userInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lh2/a;->a:Lh2/a;

    invoke-virtual {v0, p1}, Lh2/a;->j(Lcom/zykj/message/server/bean/UserInfo;)V

    .line 2
    sget-object v1, Ll2/i;->a:Ll2/i;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/zykj/message/server/bean/UserInfo;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll2/i;->a(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v1, p1}, Lcom/zykj/subscriber/MainActivity;->u(Lcom/zykj/subscriber/MainActivity;Lcom/zykj/message/server/bean/UserInfo;)V

    .line 4
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->y(Lcom/zykj/subscriber/MainActivity;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1, v1}, Lcom/zykj/subscriber/MainActivity;->D(Lcom/zykj/subscriber/MainActivity;Z)V

    .line 6
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->w(Lcom/zykj/subscriber/MainActivity;)V

    .line 7
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->z(Lcom/zykj/subscriber/MainActivity;)V

    .line 8
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->o(Lcom/zykj/subscriber/MainActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/zykj/subscriber/MainActivity;->v(Lcom/zykj/subscriber/MainActivity;Ljava/lang/String;)V

    .line 9
    :cond_0
    invoke-virtual {v0}, Lh2/a;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_3

    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_5

    .line 10
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$h$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->r(Lcom/zykj/subscriber/MainActivity;)Lcom/zykj/subscriber/update/c;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p1, "updateVersionManager"

    invoke-static {p1}, Lkotlin/jvm/internal/l;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_4
    const/16 v2, 0x518

    invoke-virtual {p1, v0, v1, v2}, Lcom/zykj/subscriber/update/c;->h(ZII)V

    :cond_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/UserInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$h$a;->a(Lcom/zykj/message/server/bean/UserInfo;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
