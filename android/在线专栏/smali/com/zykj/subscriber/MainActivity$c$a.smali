.class final Lcom/zykj/subscriber/MainActivity$c$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity$c;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lx2/p<",
        "Lf3/h0;",
        "Lq2/d<",
        "-",
        "Lo2/r;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.subscriber.MainActivity$connection$1$onServiceConnected$1"
    f = "MainActivity.kt"
    l = {
        0x92
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:I

.field final synthetic c:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/subscriber/MainActivity;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/subscriber/MainActivity$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$c$a;->c:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "*>;)",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Lcom/zykj/subscriber/MainActivity$c$a;

    iget-object v0, p0, Lcom/zykj/subscriber/MainActivity$c$a;->c:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p1, v0, p2}, Lcom/zykj/subscriber/MainActivity$c$a;-><init>(Lcom/zykj/subscriber/MainActivity;Lq2/d;)V

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$c$a;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/subscriber/MainActivity$c$a;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/subscriber/MainActivity$c$a;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/subscriber/MainActivity$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lcom/zykj/subscriber/MainActivity$c$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$c$a;->c:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Lcom/zykj/subscriber/MainActivity;->p(Lcom/zykj/subscriber/MainActivity;)Lt1/a;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/zykj/subscriber/MainActivity$c$a;->c:Lcom/zykj/subscriber/MainActivity;

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Lt1/a;->k(Ljava/lang/String;)Z

    move-result p1

    if-ne p1, v2, :cond_3

    const/4 v1, 0x1

    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    .line 5
    invoke-static {}, Lf3/v0;->c()Lf3/x1;

    move-result-object p1

    new-instance v1, Lcom/zykj/subscriber/MainActivity$c$a$a;

    iget-object v3, p0, Lcom/zykj/subscriber/MainActivity$c$a;->c:Lcom/zykj/subscriber/MainActivity;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lcom/zykj/subscriber/MainActivity$c$a$a;-><init>(Lcom/zykj/subscriber/MainActivity;Lq2/d;)V

    iput v2, p0, Lcom/zykj/subscriber/MainActivity$c$a;->b:I

    invoke-static {p1, v1, p0}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    .line 6
    :cond_4
    :goto_1
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
