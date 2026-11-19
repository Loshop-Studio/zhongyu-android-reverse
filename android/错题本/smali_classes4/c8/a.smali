.class public final Lc8/a;
.super Lq5/e;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc8/a;->a:I

    iput-object p1, p0, Lc8/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lq5/g;)V
    .locals 4

    .line 1
    iget v0, p0, Lc8/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc8/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lretrofit2/x;

    .line 9
    .line 10
    invoke-virtual {v0}, Lretrofit2/x;->clone()Lretrofit2/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lc8/b;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lc8/b;-><init>(Lretrofit2/e;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v1}, Lq5/g;->onSubscribe(Ls5/b;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v2, v1, Lc8/b;->b:Z

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 28
    :try_start_0
    check-cast v0, Lretrofit2/x;

    .line 29
    .line 30
    invoke-virtual {v0}, Lretrofit2/x;->d()Lretrofit2/n0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-boolean v3, v1, Lc8/b;->b:Z

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-interface {p1, v0}, Lq5/g;->onNext(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    iget-boolean v0, v1, Lc8/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    :try_start_1
    invoke-interface {p1}, Lq5/g;->onComplete()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    const/4 v2, 0x1

    .line 54
    :goto_1
    invoke-static {v0}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-static {v0}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iget-boolean v1, v1, Lc8/b;->b:Z

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    :try_start_2
    invoke-interface {p1, v0}, Lq5/g;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_2
    move-exception p1

    .line 72
    invoke-static {p1}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lio/reactivex/exceptions/CompositeException;

    .line 76
    .line 77
    filled-new-array {v0, p1}, [Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v1, p1}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_2
    return-void

    .line 88
    :pswitch_0
    iget-object v0, p0, Lc8/a;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lc8/a;

    .line 91
    .line 92
    new-instance v1, Lo2/a;

    .line 93
    .line 94
    const/4 v2, 0x5

    .line 95
    invoke-direct {v1, p1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lq5/e;->b(Lq5/g;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_1
    iget-object v0, p0, Lc8/a;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Lc8/a;

    .line 105
    .line 106
    new-instance v1, Lb0/k0;

    .line 107
    .line 108
    invoke-direct {v1, p1}, Lb0/k0;-><init>(Lq5/g;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lq5/e;->b(Lq5/g;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
