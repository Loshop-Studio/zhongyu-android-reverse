.class public abstract Lb0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lokio/BufferedSource;Lokio/ByteString;JJ)J
    .locals 7

    .line 1
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lokio/ByteString;->getByte(I)B

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    int-to-long v0, v0

    .line 17
    sub-long v5, p4, v0

    .line 18
    .line 19
    move-wide v3, p2

    .line 20
    :goto_0
    cmp-long p2, v3, v5

    .line 21
    .line 22
    const-wide/16 p3, -0x1

    .line 23
    .line 24
    if-gez p2, :cond_2

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    invoke-interface/range {v1 .. v6}, Lokio/BufferedSource;->indexOf(BJJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    cmp-long p0, v3, p3

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-interface {v1, v3, v4, p1}, Lokio/BufferedSource;->rangeEquals(JLokio/ByteString;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const-wide/16 p2, 0x1

    .line 43
    .line 44
    add-long/2addr v3, p2

    .line 45
    move-object p0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    return-wide v3

    .line 48
    :cond_2
    return-wide p3

    .line 49
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    const-string p1, "bytes is empty"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0
.end method
