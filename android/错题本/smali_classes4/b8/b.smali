.class public final Lb8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[Lb8/a;

.field public b:I

.field public c:I

.field public volatile d:I


# virtual methods
.method public final a(JLjava/lang/Class;)V
    .locals 10

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    ushr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    long-to-int v2, p1

    .line 7
    xor-int/2addr v1, v2

    .line 8
    const v2, 0x7fffffff

    .line 9
    .line 10
    .line 11
    and-int/2addr v1, v2

    .line 12
    iget v3, p0, Lb8/b;->b:I

    .line 13
    .line 14
    rem-int/2addr v1, v3

    .line 15
    iget-object v3, p0, Lb8/b;->a:[Lb8/a;

    .line 16
    .line 17
    aget-object v3, v3, v1

    .line 18
    .line 19
    move-object v4, v3

    .line 20
    :goto_0
    if-eqz v4, :cond_1

    .line 21
    .line 22
    iget-wide v5, v4, Lb8/a;->a:J

    .line 23
    .line 24
    cmp-long v5, v5, p1

    .line 25
    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iput-object p3, v4, Lb8/a;->b:Ljava/lang/Object;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object v4, v4, Lb8/a;->c:Lb8/a;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v4, p0, Lb8/b;->a:[Lb8/a;

    .line 35
    .line 36
    new-instance v5, Lb8/a;

    .line 37
    .line 38
    invoke-direct {v5, p1, p2, p3, v3}, Lb8/a;-><init>(JLjava/lang/Object;Lb8/a;)V

    .line 39
    .line 40
    .line 41
    aput-object v5, v4, v1

    .line 42
    .line 43
    iget p1, p0, Lb8/b;->d:I

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x1

    .line 46
    .line 47
    iput p1, p0, Lb8/b;->d:I

    .line 48
    .line 49
    iget p1, p0, Lb8/b;->d:I

    .line 50
    .line 51
    iget p2, p0, Lb8/b;->c:I

    .line 52
    .line 53
    if-le p1, p2, :cond_4

    .line 54
    .line 55
    iget p1, p0, Lb8/b;->b:I

    .line 56
    .line 57
    mul-int/lit8 p2, p1, 0x2

    .line 58
    .line 59
    new-array p3, p2, [Lb8/a;

    .line 60
    .line 61
    iget-object v1, p0, Lb8/b;->a:[Lb8/a;

    .line 62
    .line 63
    array-length v3, v1

    .line 64
    const/4 v4, 0x0

    .line 65
    :goto_1
    if-ge v4, v3, :cond_3

    .line 66
    .line 67
    aget-object v5, v1, v4

    .line 68
    .line 69
    :goto_2
    if-eqz v5, :cond_2

    .line 70
    .line 71
    iget-wide v6, v5, Lb8/a;->a:J

    .line 72
    .line 73
    ushr-long v8, v6, v0

    .line 74
    .line 75
    long-to-int v8, v8

    .line 76
    long-to-int v6, v6

    .line 77
    xor-int/2addr v6, v8

    .line 78
    and-int/2addr v6, v2

    .line 79
    rem-int/2addr v6, p2

    .line 80
    iget-object v7, v5, Lb8/a;->c:Lb8/a;

    .line 81
    .line 82
    aget-object v8, p3, v6

    .line 83
    .line 84
    iput-object v8, v5, Lb8/a;->c:Lb8/a;

    .line 85
    .line 86
    aput-object v5, p3, v6

    .line 87
    .line 88
    move-object v5, v7

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iput-object p3, p0, Lb8/b;->a:[Lb8/a;

    .line 94
    .line 95
    iput p2, p0, Lb8/b;->b:I

    .line 96
    .line 97
    mul-int/lit8 p1, p1, 0x8

    .line 98
    .line 99
    div-int/lit8 p1, p1, 0x3

    .line 100
    .line 101
    iput p1, p0, Lb8/b;->c:I

    .line 102
    .line 103
    :cond_4
    return-void
.end method
