.class public abstract Lcd/h;
.super Lcd/g;
.source "SourceFile"


# direct methods
.method public static final i(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lcd/e;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "direction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcd/e;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcd/e;-><init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static synthetic j(Ljava/io/File;Lkotlin/io/FileWalkDirection;ILjava/lang/Object;)Lcd/e;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lkotlin/io/FileWalkDirection;->c:Lkotlin/io/FileWalkDirection;

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, Lcd/h;->i(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lcd/e;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
