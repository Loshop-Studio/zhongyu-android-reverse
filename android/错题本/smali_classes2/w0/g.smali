.class public abstract Lw0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lio/reactivex/internal/operators/observable/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/reactivex/internal/operators/observable/g;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw0/g;->a:Lio/reactivex/internal/operators/observable/g;

    .line 9
    .line 10
    return-void
.end method

.method public static a(ILw0/c;)Lw0/d;
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/util/Pools$SynchronizedPool;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lw0/d;

    .line 7
    .line 8
    sget-object v1, Lw0/g;->a:Lio/reactivex/internal/operators/observable/g;

    .line 9
    .line 10
    invoke-direct {p0, v0, p1, v1}, Lw0/d;-><init>(Landroidx/core/util/Pools$SynchronizedPool;Lw0/c;Lw0/f;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
