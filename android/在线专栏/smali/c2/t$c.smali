.class final Lc2/t$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc2/t;->k(Ljava/lang/String;Lx2/p;)V
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
    c = "com.zykj.subscriber.PdfFragment$getPdfPreviewInfo$1"
    f = "PdfFragment.kt"
    l = {
        0xa4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:I

.field final synthetic c:Lc2/t;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lx2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/p<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            "Lo2/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lc2/t;Ljava/lang/String;Lx2/p;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc2/t;",
            "Ljava/lang/String;",
            "Lx2/p<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Float;",
            "Lo2/r;",
            ">;",
            "Lq2/d<",
            "-",
            "Lc2/t$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc2/t$c;->c:Lc2/t;

    iput-object p2, p0, Lc2/t$c;->d:Ljava/lang/String;

    iput-object p3, p0, Lc2/t$c;->e:Lx2/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 3
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

    new-instance p1, Lc2/t$c;

    iget-object v0, p0, Lc2/t$c;->c:Lc2/t;

    iget-object v1, p0, Lc2/t$c;->d:Ljava/lang/String;

    iget-object v2, p0, Lc2/t$c;->e:Lx2/p;

    invoke-direct {p1, v0, v1, v2, p2}, Lc2/t$c;-><init>(Lc2/t;Ljava/lang/String;Lx2/p;Lq2/d;)V

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lc2/t$c;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lc2/t$c;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lc2/t$c;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lc2/t$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p0, Lc2/t$c;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

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
    iget-object p1, p0, Lc2/t$c;->c:Lc2/t;

    invoke-static {p1}, Lc2/t;->i(Lc2/t;)Le2/b;

    move-result-object p1

    iget-object v1, p0, Lc2/t$c;->d:Ljava/lang/String;

    :try_start_1
    sget-object v3, Lo2/l;->a:Lo2/l$a;

    .line 5
    invoke-static {}, Lf3/v0;->b()Lf3/e0;

    move-result-object v3

    new-instance v4, Lc2/t$c$a;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v1, v5}, Lc2/t$c$a;-><init>(Le2/b;Ljava/lang/String;Lq2/d;)V

    iput v2, p0, Lc2/t$c;->b:I

    invoke-static {v3, v4, p0}, Lf3/g;->g(Lq2/g;Lx2/p;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Le2/a;

    .line 6
    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object v0, Lo2/l;->a:Lo2/l$a;

    invoke-static {p1}, Lo2/m;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lo2/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 7
    :goto_1
    iget-object v0, p0, Lc2/t$c;->e:Lx2/p;

    invoke-static {p1}, Lo2/l;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    move-object v1, p1

    check-cast v1, Le2/a;

    if-nez v1, :cond_3

    const/4 v4, 0x0

    goto :goto_2

    .line 8
    :cond_3
    invoke-virtual {v1}, Le2/a;->a()I

    move-result v4

    :goto_2
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v4

    if-nez v1, :cond_4

    const/4 v1, 0x0

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Le2/a;->b()F

    move-result v1

    :goto_3
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/b;->b(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v4, v1}, Lx2/p;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    :cond_5
    iget-object v0, p0, Lc2/t$c;->e:Lx2/p;

    invoke-static {p1}, Lo2/l;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    .line 10
    :cond_6
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->b(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lx2/p;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    :goto_4
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
