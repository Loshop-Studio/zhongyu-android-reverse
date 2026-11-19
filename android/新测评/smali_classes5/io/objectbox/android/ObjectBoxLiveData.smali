.class public Lio/objectbox/android/ObjectBoxLiveData;
.super Landroidx/lifecycle/LiveData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/lifecycle/LiveData<",
        "Ljava/util/List<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field public final a:Lio/objectbox/query/Query;

.field public b:Lu8/d;

.field public final c:Lu8/a;


# virtual methods
.method public onActive()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/objectbox/android/ObjectBoxLiveData;->b:Lu8/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/android/ObjectBoxLiveData;->a:Lio/objectbox/query/Query;

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/objectbox/query/Query;->u()Lu8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lio/objectbox/android/ObjectBoxLiveData;->c:Lu8/a;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lu8/g;->a(Lu8/a;)Lu8/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lio/objectbox/android/ObjectBoxLiveData;->b:Lu8/d;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onInactive()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->hasObservers()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/objectbox/android/ObjectBoxLiveData;->b:Lu8/d;

    .line 8
    .line 9
    invoke-interface {v0}, Lu8/d;->cancel()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lio/objectbox/android/ObjectBoxLiveData;->b:Lu8/d;

    .line 14
    .line 15
    :cond_0
    return-void
.end method
