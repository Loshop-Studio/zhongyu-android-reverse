.class public final Lio/reactivex/internal/operators/observable/b;
.super Lq5/e;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/mistake/activity/q;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/internal/operators/observable/b;->a:Lcom/zykj/mistake/activity/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Lq5/g;)V
    .locals 1

    .line 1
    new-instance v0, Lio/reactivex/internal/operators/observable/ObservableCreate$CreateEmitter;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lio/reactivex/internal/operators/observable/ObservableCreate$CreateEmitter;-><init>(Lq5/g;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lq5/g;->onSubscribe(Ls5/b;)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/b;->a:Lcom/zykj/mistake/activity/q;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/q;->a(Lq5/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lio/reactivex/internal/operators/observable/ObservableCreate$CreateEmitter;->onError(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
