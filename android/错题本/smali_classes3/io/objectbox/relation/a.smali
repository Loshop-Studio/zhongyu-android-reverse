.class public final Lio/objectbox/relation/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public a:Lm5/b;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 1
    iget-object v0, p0, Lio/objectbox/relation/a;->a:Lm5/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-interface {v0, p2}, Lm5/b;->getId(Ljava/lang/Object;)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long v0, v1, v3

    .line 14
    .line 15
    const-wide v5, 0x7fffffffffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    move-wide v1, v5

    .line 23
    :cond_0
    cmp-long v0, p1, v3

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    move-wide p1, v5

    .line 28
    :cond_1
    sub-long/2addr v1, p1

    .line 29
    cmp-long p1, v1, v3

    .line 30
    .line 31
    if-gez p1, :cond_2

    .line 32
    .line 33
    const/4 p1, -0x1

    .line 34
    return p1

    .line 35
    :cond_2
    if-lez p1, :cond_3

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_3
    const/4 p1, 0x0

    .line 40
    return p1
.end method
