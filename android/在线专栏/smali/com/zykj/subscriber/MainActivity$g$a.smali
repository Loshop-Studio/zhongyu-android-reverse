.class final Lcom/zykj/subscriber/MainActivity$g$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity$g;->a(Lx2/l;)V
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

.field final synthetic b:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;Lx2/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/subscriber/MainActivity;",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$g$a;->a:Lcom/zykj/subscriber/MainActivity;

    iput-object p2, p0, Lcom/zykj/subscriber/MainActivity$g$a;->b:Lx2/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 3
    .param p1    # Lcom/zykj/message/server/bean/ServerInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    if-nez p1, :cond_0

    :goto_0
    move-object v1, v0

    goto :goto_1

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 2
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_3

    .line 3
    sget-object v2, Lh2/a;->a:Lh2/a;

    invoke-virtual {v2, v1}, Lh2/a;->g(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$g$a;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v1}, Lcom/zykj/subscriber/MainActivity;->w(Lcom/zykj/subscriber/MainActivity;)V

    .line 5
    :cond_3
    iget-object v1, p0, Lcom/zykj/subscriber/MainActivity$g$a;->b:Lx2/l;

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, p1

    :goto_3
    invoke-interface {v1, v0}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$g$a;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
