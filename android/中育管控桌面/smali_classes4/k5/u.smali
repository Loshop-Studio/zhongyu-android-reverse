.class public interface abstract Lk5/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk5/u$a;,
        Lk5/u$b;
    }
.end annotation


# direct methods
.method public static synthetic d(Lk5/u;Lk5/o;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1}, Lk5/u;->f(Lk5/o;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: hasNext"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public abstract a()Lf5/a;
.end method

.method public abstract b()Lkotlin/collections/ArrayDeque;
.end method

.method public abstract c()Lk5/u$b;
.end method

.method public abstract e(Lf5/w;)Z
.end method

.method public abstract f(Lk5/o;)Z
.end method

.method public abstract isCanceled()Z
.end method
