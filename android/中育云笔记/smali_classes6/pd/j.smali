.class public abstract Lpd/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lhd/p;)Ljava/util/Iterator;
    .locals 1

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpd/h;

    .line 7
    .line 8
    invoke-direct {v0}, Lpd/h;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0, v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->b(Lhd/p;Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Lpd/h;->g(Lvc/c;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static b(Lhd/p;)Lpd/g;
    .locals 1

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpd/j$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lpd/j$a;-><init>(Lhd/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
