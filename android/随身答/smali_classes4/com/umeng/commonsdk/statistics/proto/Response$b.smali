.class public Lcom/umeng/commonsdk/statistics/proto/Response$b;
.super Lg2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/Response;
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

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/Response$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/Response$b;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/Response;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/Response$b;->c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/Response;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/Response;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/Response$b;->d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/Response;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 4

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
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->x()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->B()V

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
    const-string v0, "Required field \'resp_code\' was not found in serialized data! Struct: "

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
    const/4 v2, 0x1

    .line 55
    if-eq v0, v2, :cond_6

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    if-eq v0, v3, :cond_4

    .line 59
    .line 60
    const/4 v3, 0x3

    .line 61
    if-eq v0, v3, :cond_2

    .line 62
    .line 63
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    const/16 v0, 0xc

    .line 68
    .line 69
    if-ne v1, v0, :cond_3

    .line 70
    .line 71
    new-instance v0, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 72
    .line 73
    invoke-direct {v0}, Lcom/umeng/commonsdk/statistics/proto/d;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->c:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->p(Lg2/s;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/Response;->y(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    const/16 v0, 0xb

    .line 90
    .line 91
    if-ne v1, v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->b:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/Response;->z(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_6
    const/16 v0, 0x8

    .line 108
    .line 109
    if-ne v1, v0, :cond_7

    .line 110
    .line 111
    invoke-virtual {p1}, Lg2/s;->D()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->a:I

    .line 116
    .line 117
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/Response;->A(Z)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_7
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-virtual {p1}, Lg2/s;->t()V

    .line 125
    .line 126
    .line 127
    goto :goto_0
.end method

.method public d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/Response;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->B()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->g()Lg2/u;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lg2/s;->i(Lg2/u;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->n()Lg2/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 16
    .line 17
    .line 18
    iget v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->a:I

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lg2/s;->d(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->b:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->w()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->q()Lg2/p;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lg2/s;->j(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->c:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/Response;->v()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/Response;->t()Lg2/p;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/Response;->c:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lcom/umeng/commonsdk/statistics/proto/d;->m(Lg2/s;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p1}, Lg2/s;->n()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lg2/s;->l()V

    .line 80
    .line 81
    .line 82
    return-void
.end method
