.class public final Lretrofit2/p;
.super Lretrofit2/r;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final e:Lretrofit2/g;


# direct methods
.method public synthetic constructor <init>(Lretrofit2/m0;Lokhttp3/d;Lretrofit2/m;Lretrofit2/g;I)V
    .locals 0

    .line 1
    iput p5, p0, Lretrofit2/p;->d:I

    invoke-direct {p0, p1, p2, p3}, Lretrofit2/r;-><init>(Lretrofit2/m0;Lokhttp3/d;Lretrofit2/m;)V

    iput-object p4, p0, Lretrofit2/p;->e:Lretrofit2/g;

    return-void
.end method


# virtual methods
.method public final a(Lretrofit2/x;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lretrofit2/p;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lretrofit2/p;->e:Lretrofit2/g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, p1}, Lretrofit2/g;->i(Lretrofit2/x;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lretrofit2/e;

    .line 13
    .line 14
    array-length v0, p2

    .line 15
    const/4 v1, 0x1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    aget-object p2, p2, v0

    .line 18
    .line 19
    check-cast p2, Lh6/c;

    .line 20
    .line 21
    :try_start_0
    new-instance v0, Lkotlinx/coroutines/g;

    .line 22
    .line 23
    invoke-static {p2}, Lv7/l;->n(Lh6/c;)Lh6/c;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/g;-><init>(ILh6/c;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkotlinx/coroutines/g;->u()V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lretrofit2/t;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v1, p1, v2}, Lretrofit2/t;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/g;->m(Lr6/c;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lretrofit2/u;

    .line 43
    .line 44
    invoke-direct {v1, v0, v2}, Lretrofit2/u;-><init>(Lkotlinx/coroutines/g;I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, v1}, Lretrofit2/e;->b(Lretrofit2/h;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lkotlinx/coroutines/g;->t()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object p2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    invoke-static {p1, p2}, Lretrofit2/v;->q(Ljava/lang/Throwable;Lh6/c;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_0
    return-object p1

    .line 63
    :pswitch_0
    invoke-interface {v1, p1}, Lretrofit2/g;->i(Lretrofit2/x;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
