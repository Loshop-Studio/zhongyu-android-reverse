.class public abstract Lqd/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lqd/k;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lqd/n;->e(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lqd/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lqd/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqd/n;->f(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lqd/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Ljava/util/regex/MatchResult;)Lnd/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lqd/n;->g(Ljava/util/regex/MatchResult;)Lnd/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Ljava/util/regex/MatchResult;I)Lnd/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqd/n;->h(Ljava/util/regex/MatchResult;I)Lnd/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final e(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lqd/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p1, Lqd/m;

    .line 10
    .line 11
    invoke-direct {p1, p0, p2}, Lqd/m;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public static final f(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lqd/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lqd/m;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Lqd/m;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final g(Ljava/util/regex/MatchResult;)Lnd/j;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/regex/MatchResult;->start()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, Ljava/util/regex/MatchResult;->end()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0, p0}, Lnd/o;->u(II)Lnd/j;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final h(Ljava/util/regex/MatchResult;I)Lnd/j;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->start(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0, p1}, Ljava/util/regex/MatchResult;->end(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {v0, p0}, Lnd/o;->u(II)Lnd/j;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
