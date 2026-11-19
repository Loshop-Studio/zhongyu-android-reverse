.class public Lcom/umeng/commonsdk/statistics/proto/d$b;
.super Lg2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/d;
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

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/d$b;->c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/d$b;->d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 6

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
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/d;->z()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/d;->B()V

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
    const-string v0, "Required field \'version\' was not found in serialized data! Struct: "

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
    const/4 v2, 0x2

    .line 55
    const/4 v3, 0x1

    .line 56
    if-eq v0, v3, :cond_6

    .line 57
    .line 58
    if-eq v0, v2, :cond_4

    .line 59
    .line 60
    const/4 v2, 0x3

    .line 61
    if-eq v0, v2, :cond_2

    .line 62
    .line 63
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/16 v0, 0xb

    .line 68
    .line 69
    if-ne v1, v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p2, v3}, Lcom/umeng/commonsdk/statistics/proto/d;->w(Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    const/16 v0, 0x8

    .line 86
    .line 87
    if-ne v1, v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Lg2/s;->D()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput v0, p2, Lcom/umeng/commonsdk/statistics/proto/d;->b:I

    .line 94
    .line 95
    invoke-virtual {p2, v3}, Lcom/umeng/commonsdk/statistics/proto/d;->u(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    const/16 v0, 0xd

    .line 104
    .line 105
    if-ne v1, v0, :cond_8

    .line 106
    .line 107
    invoke-virtual {p1}, Lg2/s;->u()Lg2/r;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v1, Ljava/util/HashMap;

    .line 112
    .line 113
    iget v4, v0, Lg2/r;->c:I

    .line 114
    .line 115
    mul-int/2addr v4, v2

    .line 116
    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 117
    .line 118
    .line 119
    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    :goto_1
    iget v2, v0, Lg2/r;->c:I

    .line 123
    .line 124
    if-ge v1, v2, :cond_7

    .line 125
    .line 126
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    new-instance v4, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 131
    .line 132
    invoke-direct {v4}, Lcom/umeng/commonsdk/statistics/proto/e;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, p1}, Lcom/umeng/commonsdk/statistics/proto/e;->p(Lg2/s;)V

    .line 136
    .line 137
    .line 138
    iget-object v5, p2, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 139
    .line 140
    invoke-interface {v5, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_7
    invoke-virtual {p1}, Lg2/s;->v()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v3}, Lcom/umeng/commonsdk/statistics/proto/d;->q(Z)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 154
    .line 155
    .line 156
    :goto_2
    invoke-virtual {p1}, Lg2/s;->t()V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_0
.end method

.method public d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/d;->B()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/d;->C()Lg2/u;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lg2/s;->i(Lg2/u;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/d;->D()Lg2/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lg2/r;

    .line 23
    .line 24
    iget-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/16 v2, 0xb

    .line 31
    .line 32
    const/16 v3, 0xc

    .line 33
    .line 34
    invoke-direct {v0, v2, v3, v1}, Lg2/r;-><init>(BBI)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lg2/s;->h(Lg2/r;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/d;->a:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v2}, Lg2/s;->j(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 76
    .line 77
    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/proto/e;->m(Lg2/s;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p1}, Lg2/s;->o()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/d;->E()Lg2/p;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 92
    .line 93
    .line 94
    iget v0, p2, Lcom/umeng/commonsdk/statistics/proto/d;->b:I

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lg2/s;->d(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 100
    .line 101
    .line 102
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/d;->F()Lg2/p;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 111
    .line 112
    .line 113
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/d;->c:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lg2/s;->j(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 119
    .line 120
    .line 121
    :cond_2
    invoke-virtual {p1}, Lg2/s;->n()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lg2/s;->l()V

    .line 125
    .line 126
    .line 127
    return-void
.end method
