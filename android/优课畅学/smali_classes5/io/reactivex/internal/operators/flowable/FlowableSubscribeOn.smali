.class public final Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn;
.super Lb7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn$SubscribeOnSubscriber;
    }
.end annotation


# instance fields
.field public final c:Ls6/f;

.field public final d:Z


# direct methods
.method public constructor <init>(Ls6/b;Ls6/f;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb7/a;-><init>(Ls6/b;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn;->c:Ls6/f;

    .line 5
    .line 6
    iput-boolean p3, p0, Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn;->d:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public k(Lba/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn;->c:Ls6/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls6/f;->a()Ls6/f$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn$SubscribeOnSubscriber;

    .line 8
    .line 9
    iget-object v2, p0, Lb7/a;->b:Ls6/b;

    .line 10
    .line 11
    iget-boolean v3, p0, Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn;->d:Z

    .line 12
    .line 13
    invoke-direct {v1, p1, v0, v2, v3}, Lio/reactivex/internal/operators/flowable/FlowableSubscribeOn$SubscribeOnSubscriber;-><init>(Lba/b;Ls6/f$c;Lba/a;Z)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v1}, Lba/b;->onSubscribe(Lba/c;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ls6/f$c;->b(Ljava/lang/Runnable;)Lv6/b;

    .line 20
    .line 21
    .line 22
    return-void
.end method
