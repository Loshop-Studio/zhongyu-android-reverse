.class public final Lretrofit2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/h;


# instance fields
.field public final synthetic a:I

.field public final b:Lretrofit2/k;


# direct methods
.method public synthetic constructor <init>(Lretrofit2/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Lretrofit2/i;->a:I

    iput-object p1, p0, Lretrofit2/i;->b:Lretrofit2/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final k(Lretrofit2/e;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Lretrofit2/i;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lretrofit2/i;->b:Lretrofit2/k;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p0, Lretrofit2/i;->b:Lretrofit2/k;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lretrofit2/e;Lretrofit2/n0;)V
    .locals 1

    .line 1
    iget p1, p0, Lretrofit2/i;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lretrofit2/i;->b:Lretrofit2/k;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p2, Lretrofit2/n0;->a:Lokhttp3/i0;

    .line 13
    .line 14
    invoke-virtual {p1}, Lokhttp3/i0;->b()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iget-object v0, p0, Lretrofit2/i;->b:Lretrofit2/k;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p2, Lretrofit2/n0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p1, Lretrofit2/HttpException;

    .line 29
    .line 30
    invoke-direct {p1, p2}, Lretrofit2/HttpException;-><init>(Lretrofit2/n0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
