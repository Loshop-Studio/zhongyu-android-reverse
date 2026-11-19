.class public final Lj2/b$b;
.super Lh2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/b;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh2/c<",
        "Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj2/b;


# direct methods
.method constructor <init>(Lj2/b;)V
    .locals 0

    iput-object p1, p0, Lj2/b$b;->a:Lj2/b;

    invoke-direct {p0}, Lh2/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lj2/b$b;->a:Lj2/b;

    invoke-virtual {v0}, Lj2/b;->e()Lg2/b;

    move-result-object v0

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-interface {v0, p1}, Lg2/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/zykj/subscriber/entity/resp/ApiResp;)V
    .locals 0

    check-cast p1, Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;

    invoke-virtual {p0, p1}, Lj2/b$b;->c(Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;)V

    return-void
.end method

.method public c(Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;)V
    .locals 1
    .param p1    # Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj2/b$b;->a:Lj2/b;

    invoke-virtual {v0}, Lj2/b;->e()Lg2/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/zykj/subscriber/entity/resp/GetWhiteListResp;->getResult()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lg2/b;->c(Ljava/lang/String;)V

    return-void
.end method
