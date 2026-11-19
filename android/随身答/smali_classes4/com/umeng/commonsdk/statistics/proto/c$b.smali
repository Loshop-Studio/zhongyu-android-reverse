.class public Lcom/umeng/commonsdk/statistics/proto/c$b;
.super Lg2/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/statistics/proto/c;
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

.method public synthetic constructor <init>(Lcom/umeng/commonsdk/statistics/proto/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/proto/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/c$b;->c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic b(Lg2/s;Lcom/umeng/analytics/pro/aq;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/umeng/commonsdk/statistics/proto/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/umeng/commonsdk/statistics/proto/c$b;->d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/c;)V
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
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lg2/s;->r()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->z()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-short v0, v0, Lg2/p;->c:S

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v0, v4, :cond_6

    .line 25
    .line 26
    if-eq v0, v3, :cond_3

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    if-eq v0, v2, :cond_1

    .line 30
    .line 31
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_1
    const/16 v0, 0xb

    .line 37
    .line 38
    if-ne v1, v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p2, v4}, Lcom/umeng/commonsdk/statistics/proto/c;->v(Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v0, 0xf

    .line 55
    .line 56
    if-ne v1, v0, :cond_5

    .line 57
    .line 58
    invoke-virtual {p1}, Lg2/s;->w()Lg2/q;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    .line 63
    .line 64
    iget v3, v0, Lg2/q;->b:I

    .line 65
    .line 66
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 70
    .line 71
    :goto_1
    iget v1, v0, Lg2/q;->b:I

    .line 72
    .line 73
    if-ge v2, v1, :cond_4

    .line 74
    .line 75
    new-instance v1, Lcom/umeng/commonsdk/statistics/proto/a;

    .line 76
    .line 77
    invoke-direct {v1}, Lcom/umeng/commonsdk/statistics/proto/a;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->p(Lg2/s;)V

    .line 81
    .line 82
    .line 83
    iget-object v3, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-virtual {p1}, Lg2/s;->x()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v4}, Lcom/umeng/commonsdk/statistics/proto/c;->t(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 99
    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    const/16 v0, 0xd

    .line 103
    .line 104
    if-ne v1, v0, :cond_8

    .line 105
    .line 106
    invoke-virtual {p1}, Lg2/s;->u()Lg2/r;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Ljava/util/HashMap;

    .line 111
    .line 112
    iget v5, v0, Lg2/r;->c:I

    .line 113
    .line 114
    mul-int/2addr v5, v3

    .line 115
    invoke-direct {v1, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 119
    .line 120
    :goto_2
    iget v1, v0, Lg2/r;->c:I

    .line 121
    .line 122
    if-ge v2, v1, :cond_7

    .line 123
    .line 124
    invoke-virtual {p1}, Lg2/s;->G()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v3, Lcom/umeng/commonsdk/statistics/proto/b;

    .line 129
    .line 130
    invoke-direct {v3}, Lcom/umeng/commonsdk/statistics/proto/b;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->p(Lg2/s;)V

    .line 134
    .line 135
    .line 136
    iget-object v5, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 137
    .line 138
    invoke-interface {v5, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    invoke-virtual {p1}, Lg2/s;->v()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v4}, Lcom/umeng/commonsdk/statistics/proto/c;->q(Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_8
    invoke-static {p1, v1}, Lcom/umeng/analytics/pro/c;->a(Lg2/s;B)V

    .line 152
    .line 153
    .line 154
    :goto_3
    invoke-virtual {p1}, Lg2/s;->t()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0
.end method

.method public d(Lg2/s;Lcom/umeng/commonsdk/statistics/proto/c;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->z()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->A()Lg2/u;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lg2/s;->i(Lg2/u;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->B()Lg2/p;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lg2/r;

    .line 25
    .line 26
    iget-object v2, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/16 v3, 0xb

    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lg2/r;-><init>(BBI)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lg2/s;->h(Lg2/r;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->a:Ljava/util/Map;

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
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v3}, Lg2/s;->j(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lcom/umeng/commonsdk/statistics/proto/b;

    .line 76
    .line 77
    invoke-virtual {v2, p1}, Lcom/umeng/commonsdk/statistics/proto/b;->m(Lg2/s;)V

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
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->x()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->C()Lg2/p;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Lg2/q;

    .line 105
    .line 106
    iget-object v2, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-direct {v0, v1, v2}, Lg2/q;-><init>(BI)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lg2/s;->g(Lg2/q;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->b:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_2

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lcom/umeng/commonsdk/statistics/proto/a;

    .line 135
    .line 136
    invoke-virtual {v1, p1}, Lcom/umeng/commonsdk/statistics/proto/a;->m(Lg2/s;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    invoke-virtual {p1}, Lg2/s;->p()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 144
    .line 145
    .line 146
    :cond_3
    iget-object v0, p2, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/c;->y()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    invoke-static {}, Lcom/umeng/commonsdk/statistics/proto/c;->D()Lg2/p;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p1, v0}, Lg2/s;->f(Lg2/p;)V

    .line 161
    .line 162
    .line 163
    iget-object p2, p2, Lcom/umeng/commonsdk/statistics/proto/c;->c:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1, p2}, Lg2/s;->j(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lg2/s;->m()V

    .line 169
    .line 170
    .line 171
    :cond_4
    invoke-virtual {p1}, Lg2/s;->n()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lg2/s;->l()V

    .line 175
    .line 176
    .line 177
    return-void
.end method
