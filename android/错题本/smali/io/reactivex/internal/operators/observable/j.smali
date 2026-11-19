.class public final Lio/reactivex/internal/operators/observable/j;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lq5/e;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lio/reactivex/internal/operators/observable/j;->b:I

    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lq5/e;)V

    iput-object p2, p0, Lio/reactivex/internal/operators/observable/j;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lq5/g;)V
    .locals 3

    .line 1
    iget v0, p0, Lio/reactivex/internal/operators/observable/j;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lio/reactivex/internal/operators/observable/e;

    .line 7
    .line 8
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/j;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/camera/core/impl/d;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Lio/reactivex/internal/operators/observable/e;-><init>(Lq5/g;Landroidx/camera/core/impl/d;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/a;->a:Lq5/e;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lq5/e;->b(Lq5/g;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v0, Lio/reactivex/internal/operators/observable/ObservableSubscribeOn$SubscribeOnObserver;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/observable/ObservableSubscribeOn$SubscribeOnObserver;-><init>(Lq5/g;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0}, Lq5/g;->onSubscribe(Ls5/b;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/j;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lq5/j;

    .line 32
    .line 33
    new-instance v1, Lio/reactivex/internal/operators/observable/i;

    .line 34
    .line 35
    invoke-direct {v1, p0, v0}, Lio/reactivex/internal/operators/observable/i;-><init>(Lio/reactivex/internal/operators/observable/j;Lio/reactivex/internal/operators/observable/ObservableSubscribeOn$SubscribeOnObserver;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lq5/j;->b(Lio/reactivex/internal/operators/observable/i;)Ls5/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/ObservableSubscribeOn$SubscribeOnObserver;->setDisposable(Ls5/b;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
