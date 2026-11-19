.class public abstract Lg5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf5/d0;)Lf5/d0;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf5/d0;->t()Lf5/d0$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lg5/b;

    .line 11
    .line 12
    invoke-virtual {p0}, Lf5/d0;->c()Lf5/e0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Lf5/e0;->contentType()Lf5/y;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Lf5/d0;->c()Lf5/e0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Lf5/e0;->contentLength()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    invoke-direct {v1, v2, v3, v4}, Lg5/b;-><init>(Lf5/y;J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lf5/d0$a;->b(Lf5/e0;)Lf5/d0$a;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lf5/d0$a;->c()Lf5/d0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
