.class public abstract Ln/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;)Ln/r;
    .locals 1

    .line 1
    new-instance v0, Ln/u;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Ln/u;-><init>(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final b(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln/r$a;)Ln/r;
    .locals 6

    .line 1
    new-instance v0, Ln/q;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Ln/q;-><init>(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln/r$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic c(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;ILjava/lang/Object;)Ln/r;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2}, Ln/s;->a(Lokio/BufferedSource;Lokio/FileSystem;Ln/r$a;)Ln/r;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic d(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln/r$a;ILjava/lang/Object;)Ln/r;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x8

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x10

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Ln/s;->b(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln/r$a;)Ln/r;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
