.class public final Lio/reactivex/internal/operators/flowable/FlowableObserveOn;
.super Lb7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/FlowableObserveOn$ObserveOnSubscriber;,
        Lio/reactivex/internal/operators/flowable/FlowableObserveOn$BaseObserveOnSubscriber;
    }
.end annotation


# instance fields
.field public final c:Ls6/f;

.field public final d:Z

.field public final e:I


# direct methods
.method public constructor <init>(Ls6/b;Ls6/f;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb7/a;-><init>(Ls6/b;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/FlowableObserveOn;->c:Ls6/f;

    .line 5
    .line 6
    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/FlowableObserveOn;->d:Z

    .line 7
    .line 8
    iput p4, p0, Lio/reactivex/internal/operators/flowable/FlowableObserveOn;->e:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public k(Lba/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableObserveOn;->c:Ls6/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls6/f;->a()Ls6/f$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lb7/a;->b:Ls6/b;

    .line 8
    .line 9
    new-instance v2, Lio/reactivex/internal/operators/flowable/FlowableObserveOn$ObserveOnSubscriber;

    .line 10
    .line 11
    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/FlowableObserveOn;->d:Z

    .line 12
    .line 13
    iget v4, p0, Lio/reactivex/internal/operators/flowable/FlowableObserveOn;->e:I

    .line 14
    .line 15
    invoke-direct {v2, p1, v0, v3, v4}, Lio/reactivex/internal/operators/flowable/FlowableObserveOn$ObserveOnSubscriber;-><init>(Lba/b;Ls6/f$c;ZI)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ls6/b;->j(Ls6/e;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
