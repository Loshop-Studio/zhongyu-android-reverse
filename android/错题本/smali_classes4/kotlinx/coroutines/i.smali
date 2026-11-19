.class public final Lkotlinx/coroutines/i;
.super Lkotlinx/coroutines/y0;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final f:Lkotlinx/coroutines/g;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkotlinx/coroutines/i;->e:I

    invoke-direct {p0}, Lkotlinx/coroutines/internal/a;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/i;->f:Lkotlinx/coroutines/g;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 1

    .line 1
    iget v0, p0, Lkotlinx/coroutines/i;->e:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget p1, p0, Lkotlinx/coroutines/i;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lkotlinx/coroutines/i;->f:Lkotlinx/coroutines/g;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lkotlinx/coroutines/y0;->h()Lkotlinx/coroutines/c1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, p0, Lkotlinx/coroutines/i;->f:Lkotlinx/coroutines/g;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->s(Lkotlinx/coroutines/c1;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v0}, Lkotlinx/coroutines/g;->x()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object v1, v0, Lkotlinx/coroutines/g;->d:Lh6/c;

    .line 36
    .line 37
    check-cast v1, Le7/e;

    .line 38
    .line 39
    sget-object v2, Le7/e;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 40
    .line 41
    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v4, Le7/a;->c:Le7/r;

    .line 46
    .line 47
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v2, v1, v4, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eq v3, v4, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    const/4 v4, 0x0

    .line 73
    invoke-virtual {v2, v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_6

    .line 78
    .line 79
    :goto_1
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/g;->i(Ljava/lang/Throwable;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lkotlinx/coroutines/g;->x()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0}, Lkotlinx/coroutines/g;->p()V

    .line 89
    .line 90
    .line 91
    :cond_5
    :goto_2
    return-void

    .line 92
    :cond_6
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eq v4, v3, :cond_4

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
