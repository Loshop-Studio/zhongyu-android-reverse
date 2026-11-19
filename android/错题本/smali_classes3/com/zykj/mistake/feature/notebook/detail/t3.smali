.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/t3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lkotlinx/coroutines/v;

.field public final synthetic c:Lr6/c;

.field public final synthetic d:Lcom/zykj/mistake/feature/notebook/detail/a5;


# direct methods
.method public synthetic constructor <init>(ZLkotlinx/coroutines/v;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/a5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->a:Z

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->b:Lkotlinx/coroutines/v;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->c:Lr6/c;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->d:Lcom/zykj/mistake/feature/notebook/detail/a5;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/i3;

    .line 2
    .line 3
    const-string v0, "intent"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->a:Z

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->c:Lr6/c;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/p1;->a:Lcom/zykj/mistake/feature/notebook/detail/p1;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/t2;->a:Lcom/zykj/mistake/feature/notebook/detail/t2;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/q2;->a:Lcom/zykj/mistake/feature/notebook/detail/q2;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/i2;->a:Lcom/zykj/mistake/feature/notebook/detail/i2;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    :cond_0
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$dispatchIntent$1$1$1;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->d:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v0, v2, v1, p1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$dispatchIntent$1$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/i3;Lh6/c;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x3

    .line 55
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/t3;->b:Lkotlinx/coroutines/v;

    .line 56
    .line 57
    invoke-static {v1, v3, v3, v0, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-interface {v1, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 65
    .line 66
    return-object p1
.end method
