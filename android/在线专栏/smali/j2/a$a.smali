.class public final Lj2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrx/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/a;->d(Lrx/Observable;Lh2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrx/Observer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj2/a;

.field final synthetic b:Lh2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh2/c<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lj2/a;Lh2/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/a;",
            "Lh2/c<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lj2/a$a;->a:Lj2/a;

    iput-object p2, p0, Lj2/a$a;->b:Lh2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/subscriber/entity/resp/ApiResp;)V
    .locals 3
    .param p1    # Lcom/zykj/subscriber/entity/resp/ApiResp;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lj2/a$a;->a:Lj2/a;

    invoke-static {v0}, Lj2/a;->a(Lj2/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "[\u8fd4\u56de\u7ed3\u679c]--> "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll2/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/zykj/subscriber/entity/resp/ApiResp;->getSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lj2/a$a;->b:Lh2/c;

    invoke-virtual {v0, p1}, Lh2/c;->b(Lcom/zykj/subscriber/entity/resp/ApiResp;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lj2/a$a;->b:Lh2/c;

    invoke-virtual {p1}, Lcom/zykj/subscriber/entity/resp/ApiResp;->getErrorMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh2/c;->a(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onCompleted()V
    .locals 2

    iget-object v0, p0, Lj2/a$a;->a:Lj2/a;

    invoke-static {v0}, Lj2/a;->a(Lj2/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onCompleted-->"

    invoke-static {v0, v1}, Ll2/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lj2/a$a;->a:Lj2/a;

    invoke-static {v0}, Lj2/a;->a(Lj2/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Throwable-->"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll2/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lf2/a;->a(Ljava/lang/Throwable;)Lf2/a$a;

    move-result-object p1

    const-string v0, "handleException(e)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lj2/a$a;->a:Lj2/a;

    invoke-static {v0}, Lj2/a;->a(Lj2/a;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Lf2/a$a;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll2/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lj2/a$a;->b:Lh2/c;

    iget-object p1, p1, Lf2/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lh2/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/zykj/subscriber/entity/resp/ApiResp;

    invoke-virtual {p0, p1}, Lj2/a$a;->a(Lcom/zykj/subscriber/entity/resp/ApiResp;)V

    return-void
.end method
