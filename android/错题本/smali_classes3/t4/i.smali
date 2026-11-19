.class public abstract Lt4/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln7/o;

.field public static final b:Ljava/util/Map;

.field public static final c:Ljava/util/Map;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    sget-object v0, Ln7/b;->d:Ln7/a;

    .line 2
    .line 3
    const-string v1, "from"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Ln7/b;->a:Ln7/g;

    .line 9
    .line 10
    iget-boolean v5, v1, Ln7/g;->c:Z

    .line 11
    .line 12
    iget-object v6, v1, Ln7/g;->d:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v7, v1, Ln7/g;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v9, v1, Ln7/g;->g:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 17
    .line 18
    iget-boolean v8, v1, Ln7/g;->f:Z

    .line 19
    .line 20
    iget-object v0, v0, Ln7/b;->b:Lo7/e;

    .line 21
    .line 22
    const-string v1, "    "

    .line 23
    .line 24
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance v2, Ln7/g;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    move v4, v3

    .line 34
    invoke-direct/range {v2 .. v9}, Ln7/g;-><init>(ZZZLjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/ClassDiscriminatorMode;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Ln7/o;

    .line 38
    .line 39
    const-string v3, "module"

    .line 40
    .line 41
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v0}, Ln7/b;-><init>(Ln7/g;Lo7/e;)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Lo7/g;->a:Lo7/d;

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v3, Lb0/k0;

    .line 57
    .line 58
    invoke-direct {v3, v2}, Lb0/k0;-><init>(Ln7/g;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lo7/e;->a(Lo7/f;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    sput-object v1, Lt4/i;->a:Ln7/o;

    .line 65
    .line 66
    sget v0, Ly6/s;->c:I

    .line 67
    .line 68
    const-class v0, Lp4/i;

    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Class;)Lkotlin/jvm/internal/r;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Ly6/s;

    .line 75
    .line 76
    sget-object v2, Lkotlin/reflect/KVariance;->INVARIANT:Lkotlin/reflect/KVariance;

    .line 77
    .line 78
    invoke-direct {v1, v2, v0}, Ly6/s;-><init>(Lkotlin/reflect/KVariance;Lkotlin/jvm/internal/r;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lkotlin/jvm/internal/m;->a:Lkotlin/jvm/internal/n;

    .line 82
    .line 83
    const-class v3, Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v5, Lkotlin/jvm/internal/r;

    .line 97
    .line 98
    invoke-direct {v5, v4, v1}, Lkotlin/jvm/internal/r;-><init>(Lkotlin/jvm/internal/d;Ljava/util/List;)V

    .line 99
    .line 100
    .line 101
    sget-object v1, Lp4/i;->Companion:Lp4/h;

    .line 102
    .line 103
    invoke-virtual {v1}, Lp4/h;->serializer()Li7/b;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v1}, Lkotlin/collections/u;->c(Li7/b;)Lm7/d;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v4, Lt4/c;

    .line 112
    .line 113
    const-string v6, "List<MistakeTagUiState>"

    .line 114
    .line 115
    invoke-direct {v4, v6, v1}, Lt4/c;-><init>(Ljava/lang/String;Li7/b;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Lkotlin/Pair;

    .line 119
    .line 120
    invoke-direct {v1, v5, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Lkotlin/collections/e0;->D(Lkotlin/Pair;)Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sput-object v1, Lt4/i;->b:Ljava/util/Map;

    .line 128
    .line 129
    const-class v1, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    .line 130
    .line 131
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Class;)Lkotlin/jvm/internal/r;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    sget-object v4, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->Companion:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;

    .line 136
    .line 137
    invoke-virtual {v4}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$Companion;->serializer()Li7/b;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    new-instance v5, Lt4/c;

    .line 142
    .line 143
    const-string v6, "SearchMistakeCollectionReq"

    .line 144
    .line 145
    invoke-direct {v5, v6, v4}, Lt4/c;-><init>(Ljava/lang/String;Li7/b;)V

    .line 146
    .line 147
    .line 148
    new-instance v4, Lkotlin/Pair;

    .line 149
    .line 150
    invoke-direct {v4, v1, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4}, Lkotlin/collections/e0;->D(Lkotlin/Pair;)Ljava/util/Map;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    sput-object v1, Lt4/i;->c:Ljava/util/Map;

    .line 158
    .line 159
    const-class v1, Lcom/zykj/mistake/feature/ask/m;

    .line 160
    .line 161
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Class;)Lkotlin/jvm/internal/r;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    new-instance v4, Ly6/s;

    .line 166
    .line 167
    invoke-direct {v4, v2, v1}, Ly6/s;-><init>(Lkotlin/reflect/KVariance;Lkotlin/jvm/internal/r;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v0, Lkotlin/jvm/internal/r;

    .line 182
    .line 183
    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/r;-><init>(Lkotlin/jvm/internal/d;Ljava/util/List;)V

    .line 184
    .line 185
    .line 186
    sget-object v1, Lcom/zykj/mistake/feature/ask/m;->Companion:Lcom/zykj/mistake/feature/ask/l;

    .line 187
    .line 188
    invoke-virtual {v1}, Lcom/zykj/mistake/feature/ask/l;->serializer()Li7/b;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {v1}, Lkotlin/collections/u;->c(Li7/b;)Lm7/d;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    new-instance v2, Lt4/c;

    .line 197
    .line 198
    const-string v3, "List<AskMaterialGroup>"

    .line 199
    .line 200
    invoke-direct {v2, v3, v1}, Lt4/c;-><init>(Ljava/lang/String;Li7/b;)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Lkotlin/Pair;

    .line 204
    .line 205
    invoke-direct {v1, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v1}, Lkotlin/collections/e0;->D(Lkotlin/Pair;)Ljava/util/Map;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sput-object v0, Lt4/i;->d:Ljava/util/Map;

    .line 213
    .line 214
    return-void

    .line 215
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 216
    .line 217
    const-string v1, "Indent should not be specified when default printing mode is used"

    .line 218
    .line 219
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v0
.end method
