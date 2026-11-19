.class public abstract Lk/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lk/t;)Landroid/net/Uri;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk/t;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final b(Landroid/net/Uri;)Lk/t;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, v0, v1, v0}, Lk/u;->j(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lk/t;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
