.class final Lcom/zykj/subscriber/MainActivity$b$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity$b;->refreshToken()V
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

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$b$c;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    const-string p1, "OkHttp"

    const-string v1, "\u7f51\u9875\u62a5\u9519\uff0c\u56de\u8c03\u8fd4\u56de"

    .line 3
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    sget-object p1, Lh2/a;->a:Lh2/a;

    invoke-virtual {p1}, Lh2/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 5
    invoke-virtual {p1, v0}, Lh2/a;->g(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$b$c;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->w(Lcom/zykj/subscriber/MainActivity;)V

    goto :goto_2

    .line 7
    :cond_3
    sget-object p1, Ll2/e;->a:Ll2/e;

    invoke-virtual {p1}, Ll2/e;->b()V

    const-string p1, "\u7f51\u9875\u62a5\u9519\uff0ctoken\u5237\u65b0\u5931\u8d25"

    .line 8
    invoke-static {p1}, Ll2/f;->a(Ljava/lang/String;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$b$c;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
