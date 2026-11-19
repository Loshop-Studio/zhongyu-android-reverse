.class public final Lio/reactivex/internal/operators/observable/f;
.super Lio/reactivex/internal/operators/observable/a;
.source "SourceFile"


# instance fields
.field public final b:Lr5/e;

.field public final c:I


# direct methods
.method public constructor <init>(Lq5/e;Lr5/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/reactivex/internal/operators/observable/a;-><init>(Lq5/e;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/internal/operators/observable/f;->b:Lr5/e;

    .line 5
    .line 6
    iput p3, p0, Lio/reactivex/internal/operators/observable/f;->c:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Lq5/g;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/f;->b:Lr5/e;

    .line 2
    .line 3
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/a;->a:Lq5/e;

    .line 4
    .line 5
    invoke-virtual {v0}, Lr5/e;->a()Lq5/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v2, Lio/reactivex/internal/operators/observable/ObservableObserveOn$ObserveOnObserver;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iget v4, p0, Lio/reactivex/internal/operators/observable/f;->c:I

    .line 13
    .line 14
    invoke-direct {v2, p1, v0, v3, v4}, Lio/reactivex/internal/operators/observable/ObservableObserveOn$ObserveOnObserver;-><init>(Lq5/g;Lq5/i;ZI)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lq5/e;->b(Lq5/g;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
