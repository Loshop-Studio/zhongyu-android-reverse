.class public Lcom/umeng/commonsdk/statistics/proto/b$b;
.super Lg2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/b;
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

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/b$b;->c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/b$b;->d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/b;)V
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
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p1}, Lg2/s;->r()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/b;->y()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/b;->A()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/b;->B()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance p1, Lcom/umeng/analytics/pro/bq;

    .line 32
    .line 33
    new-instance p2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v0, "Required field \'version\' was not found in serialized data! Struct: "

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    new-instance p1, Lcom/umeng/analytics/pro/bq;

    .line 59
    .line 60
    new-instance p2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v0, "Required field \'ts\' was not found in serialized data! Struct: "

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-direct {p1, p2}, Lcom/umeng/analytics/pro/bq;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    iget-short v0, v0, Lg2/p;->c:S

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    if-eq v0, v2, :cond_7

    .line 89
    .line 90
    const/4 v3, 0x2

    .line 91
    if-eq v0, v3, :cond_5

    .line 92
    .line 93
    const/4 v3, 0x3

    .line 94
    if-eq v0, v3, :cond_3

    .line 95
    .line 96
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    const/16 v0, 0x8

    .line 101
    .line 102
    if-ne v1, v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {p1}, Lg2/s;->D()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iput v0, p2, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    .line 109
    .line 110
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/b;->w(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const/16 v0, 0xa

    .line 119
    .line 120
    if-ne v1, v0, :cond_6

    .line 121
    .line 122
    invoke-virtual {p1}, Lg2/s;->E()J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    iput-wide v0, p2, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 127
    .line 128
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/b;->v(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_6
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    const/16 v0, 0xb

    .line 137
    .line 138
    if-ne v1, v0, :cond_8

    .line 139
    .line 140
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p2, v2}, Lcom/umeng/commonsdk/statistics/proto/b;->t(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 151
    .line 152
    .line 153
    :goto_1
    invoke-virtual {p1}, Lg2/s;->t()V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0
.end method

.method public d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/b;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/b;->B()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/b;->C()Lg2/u;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lg2/s;->i(Lg2/u;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/b;->D()Lg2/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/b;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lg2/s;->j(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/b;->E()Lg2/p;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 35
    .line 36
    .line 37
    iget-wide v0, p2, Lcom/umeng/commonsdk/statistics/proto/b;->b:J

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lg2/s;->e(J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/b;->F()Lg2/p;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 50
    .line 51
    .line 52
    iget p2, p2, Lcom/umeng/commonsdk/statistics/proto/b;->c:I

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lg2/s;->d(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lg2/s;->n()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lg2/s;->l()V

    .line 64
    .line 65
    .line 66
    return-void
.end method
