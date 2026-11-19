.class public final Lretrofit2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lretrofit2/t;->a:I

    iput-object p1, p0, Lretrofit2/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lretrofit2/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, Lretrofit2/t;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lkotlinx/coroutines/g;

    .line 11
    .line 12
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1, v1}, Lkotlinx/coroutines/g;->resumeWith(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 23
    .line 24
    iget-object p1, p0, Lretrofit2/t;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lretrofit2/e;

    .line 27
    .line 28
    invoke-interface {p1}, Lretrofit2/e;->cancel()V

    .line 29
    .line 30
    .line 31
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 35
    .line 36
    iget-object p1, p0, Lretrofit2/t;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lretrofit2/e;

    .line 39
    .line 40
    invoke-interface {p1}, Lretrofit2/e;->cancel()V

    .line 41
    .line 42
    .line 43
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 47
    .line 48
    iget-object p1, p0, Lretrofit2/t;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lretrofit2/e;

    .line 51
    .line 52
    invoke-interface {p1}, Lretrofit2/e;->cancel()V

    .line 53
    .line 54
    .line 55
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 56
    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
