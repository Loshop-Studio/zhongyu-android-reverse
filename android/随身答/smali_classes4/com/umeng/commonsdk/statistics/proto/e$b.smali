.class public Lcom/umeng/commonsdk/statistics/proto/e$b;
.super Lg2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg2/x;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/e$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/e$b;->c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/e$b;->d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/e;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lg2/s;->q()Lg2/u;

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-virtual {p1}, Lg2/s;->s()Lg2/p;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-byte v1, v0, Lg2/p;->b:B

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lg2/s;->r()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->w()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->y()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/bq;

    .line 26
    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v0, "Required field \'ts\' was not found in serialized data! Struct: "

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    iget-short v0, v0, Lg2/p;->c:S

    .line 53
    .line 54
    const/16 v2, 0xb

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    if-eq v0, v3, :cond_6

    .line 58
    .line 59
    const/4 v4, 0x2

    .line 60
    if-eq v0, v4, :cond_4

    .line 61
    .line 62
    const/4 v4, 0x3

    .line 63
    if-eq v0, v4, :cond_2

    .line 64
    .line 65
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    if-ne v1, v2, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p2, v3}, Lcom/umeng/commonsdk/statistics/proto/e;->t(Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    const/16 v0, 0xa

    .line 86
    .line 87
    if-ne v1, v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Lg2/s;->E()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    iput-wide v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 94
    .line 95
    invoke-virtual {p2, v3}, Lcom/umeng/commonsdk/statistics/proto/e;->q(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_6
    if-ne v1, v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p2, v3}, Lcom/umeng/commonsdk/statistics/proto/e;->g(Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_7
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 116
    .line 117
    .line 118
    :goto_1
    invoke-virtual {p1}, Lg2/s;->t()V

    .line 119
    .line 120
    .line 121
    goto :goto_0
.end method

.method public d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/e;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->y()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/e;->z()Lg2/u;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lg2/s;->i(Lg2/u;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/e;->u()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/e;->A()Lg2/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lg2/s;->j(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/e;->B()Lg2/p;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 41
    .line 42
    .line 43
    iget-wide v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->b:J

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Lg2/s;->e(J)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/e;->C()Lg2/p;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/e;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Lg2/s;->j(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {p1}, Lg2/s;->n()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lg2/s;->l()V

    .line 74
    .line 75
    .line 76
    return-void
.end method
