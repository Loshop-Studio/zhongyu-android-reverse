.class public Ld4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:D

.field public b:D

.field public c:D

.field public d:D

.field public e:D

.field public f:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(DDDD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Ld4/a;->a:D

    .line 4
    iput-wide p3, p0, Ld4/a;->b:D

    .line 5
    iput-wide p5, p0, Ld4/a;->c:D

    .line 6
    iput-wide p7, p0, Ld4/a;->d:D

    sub-double/2addr p5, p1

    .line 7
    iput-wide p5, p0, Ld4/a;->e:D

    sub-double/2addr p7, p3

    .line 8
    iput-wide p7, p0, Ld4/a;->f:D

    return-void
.end method

.method public static a(Ld4/a;Ld4/a;)Ld4/a;
    .locals 10

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_1
    new-instance v0, Ld4/a;

    .line 8
    .line 9
    iget-wide v1, p0, Ld4/a;->a:D

    .line 10
    .line 11
    iget-wide v3, p1, Ld4/a;->a:D

    .line 12
    .line 13
    cmpg-double v5, v1, v3

    .line 14
    .line 15
    if-gez v5, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    move-wide v1, v3

    .line 19
    :goto_0
    iget-wide v3, p0, Ld4/a;->b:D

    .line 20
    .line 21
    iget-wide v5, p1, Ld4/a;->b:D

    .line 22
    .line 23
    cmpg-double v7, v3, v5

    .line 24
    .line 25
    if-gez v7, :cond_3

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    move-wide v3, v5

    .line 29
    :goto_1
    iget-wide v5, p0, Ld4/a;->c:D

    .line 30
    .line 31
    iget-wide v7, p1, Ld4/a;->c:D

    .line 32
    .line 33
    cmpl-double v9, v5, v7

    .line 34
    .line 35
    if-lez v9, :cond_4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_4
    move-wide v5, v7

    .line 39
    :goto_2
    iget-wide v7, p0, Ld4/a;->d:D

    .line 40
    .line 41
    iget-wide p0, p1, Ld4/a;->d:D

    .line 42
    .line 43
    cmpl-double v9, v7, p0

    .line 44
    .line 45
    if-lez v9, :cond_5

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    move-wide v7, p0

    .line 49
    :goto_3
    invoke-direct/range {v0 .. v8}, Ld4/a;-><init>(DDDD)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method
