.class public final Lg1/o;
.super Lcom/google/gson/p;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lcom/google/gson/p;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/gson/g;Lcom/google/gson/p;Ljava/lang/reflect/Type;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg1/o;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 4
    iput-object p3, p0, Lg1/o;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg1/d;Lg1/o;Lg1/o;Lcom/google/gson/internal/k;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lg1/o;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p2, p0, Lg1/o;->b:Ljava/lang/Object;

    .line 7
    iput-object p3, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 8
    iput-object p4, p0, Lg1/o;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ll1/a;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lg1/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ll1/a;->x()Lcom/google/gson/stream/JsonToken;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ll1/a;->t()V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lg1/o;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lcom/google/gson/internal/k;

    .line 30
    .line 31
    invoke-interface {v1}, Lcom/google/gson/internal/k;->a()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/util/Map;

    .line 36
    .line 37
    sget-object v2, Lcom/google/gson/stream/JsonToken;->BEGIN_ARRAY:Lcom/google/gson/stream/JsonToken;

    .line 38
    .line 39
    const-string v3, "duplicate key: "

    .line 40
    .line 41
    if-ne v0, v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, Ll1/a;->a()V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {p1}, Ll1/a;->k()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Ll1/a;->a()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lg1/o;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lg1/o;

    .line 58
    .line 59
    iget-object v0, v0, Lg1/o;->c:Lcom/google/gson/p;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v2, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 66
    .line 67
    check-cast v2, Lg1/o;

    .line 68
    .line 69
    iget-object v2, v2, Lg1/o;->c:Lcom/google/gson/p;

    .line 70
    .line 71
    invoke-virtual {v2, p1}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_1

    .line 80
    .line 81
    invoke-virtual {p1}, Ll1/a;->e()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 86
    .line 87
    invoke-static {v0, v3}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p1, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_2
    invoke-virtual {p1}, Ll1/a;->e()V

    .line 96
    .line 97
    .line 98
    :goto_1
    move-object p1, v1

    .line 99
    goto :goto_4

    .line 100
    :cond_3
    invoke-virtual {p1}, Ll1/a;->b()V

    .line 101
    .line 102
    .line 103
    :goto_2
    invoke-virtual {p1}, Ll1/a;->k()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_9

    .line 108
    .line 109
    sget-object v0, Lio/reactivex/internal/operators/observable/g;->b:Lio/reactivex/internal/operators/observable/g;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget v0, p1, Ll1/a;->h:I

    .line 115
    .line 116
    if-nez v0, :cond_4

    .line 117
    .line 118
    invoke-virtual {p1}, Ll1/a;->d()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    :cond_4
    const/16 v2, 0xd

    .line 123
    .line 124
    if-ne v0, v2, :cond_5

    .line 125
    .line 126
    const/16 v0, 0x9

    .line 127
    .line 128
    iput v0, p1, Ll1/a;->h:I

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    const/16 v2, 0xc

    .line 132
    .line 133
    if-ne v0, v2, :cond_6

    .line 134
    .line 135
    const/16 v0, 0x8

    .line 136
    .line 137
    iput v0, p1, Ll1/a;->h:I

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    const/16 v2, 0xe

    .line 141
    .line 142
    if-ne v0, v2, :cond_8

    .line 143
    .line 144
    const/16 v0, 0xa

    .line 145
    .line 146
    iput v0, p1, Ll1/a;->h:I

    .line 147
    .line 148
    :goto_3
    iget-object v0, p0, Lg1/o;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Lg1/o;

    .line 151
    .line 152
    iget-object v0, v0, Lg1/o;->c:Lcom/google/gson/p;

    .line 153
    .line 154
    invoke-virtual {v0, p1}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v2, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 159
    .line 160
    check-cast v2, Lg1/o;

    .line 161
    .line 162
    iget-object v2, v2, Lg1/o;->c:Lcom/google/gson/p;

    .line 163
    .line 164
    invoke-virtual {v2, p1}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-nez v2, :cond_7

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_7
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 176
    .line 177
    invoke-static {v0, v3}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-direct {p1, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_8
    const-string v0, "a name"

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ll1/a;->G(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    throw p1

    .line 192
    :cond_9
    invoke-virtual {p1}, Ll1/a;->f()V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :goto_4
    return-object p1

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ll1/b;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lg1/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg1/o;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/reflect/Type;

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    instance-of v1, v0, Ljava/lang/Class;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    instance-of v1, v0, Ljava/lang/reflect/TypeVariable;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v1, v0

    .line 26
    :goto_0
    iget-object v2, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 27
    .line 28
    if-eq v1, v0, :cond_6

    .line 29
    .line 30
    iget-object v0, p0, Lg1/o;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lcom/google/gson/g;

    .line 33
    .line 34
    new-instance v3, Lk1/a;

    .line 35
    .line 36
    invoke-direct {v3, v1}, Lk1/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Lcom/google/gson/g;->d(Lk1/a;)Lcom/google/gson/p;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    instance-of v1, v0, Lg1/v;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    move-object v1, v2

    .line 49
    :goto_1
    instance-of v3, v1, Lg1/a0;

    .line 50
    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    move-object v3, v1

    .line 54
    check-cast v3, Lg1/a0;

    .line 55
    .line 56
    invoke-virtual {v3}, Lg1/a0;->d()Lcom/google/gson/p;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-ne v3, v1, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v1, v3

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_2
    instance-of v1, v1, Lg1/v;

    .line 66
    .line 67
    if-nez v1, :cond_5

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object v2, v0

    .line 71
    :cond_6
    :goto_4
    invoke-virtual {v2, p1, p2}, Lcom/google/gson/p;->c(Ll1/b;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_0
    check-cast p2, Ljava/util/Map;

    .line 76
    .line 77
    iget-object v0, p0, Lg1/o;->c:Lcom/google/gson/p;

    .line 78
    .line 79
    check-cast v0, Lg1/o;

    .line 80
    .line 81
    if-nez p2, :cond_7

    .line 82
    .line 83
    invoke-virtual {p1}, Ll1/b;->k()Ll1/b;

    .line 84
    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_7
    invoke-virtual {p1}, Ll1/b;->c()V

    .line 88
    .line 89
    .line 90
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Ljava/util/Map$Entry;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {p1, v2}, Ll1/b;->g(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, p1, v1}, Lg1/o;->c(Ll1/b;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_8
    invoke-virtual {p1}, Ll1/b;->f()V

    .line 130
    .line 131
    .line 132
    :goto_6
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
