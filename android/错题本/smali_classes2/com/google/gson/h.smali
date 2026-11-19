.class public final Lcom/google/gson/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/gson/internal/d;

.field public final b:Lcom/google/gson/LongSerializationPolicy;

.field public final c:Lcom/google/gson/FieldNamingPolicy;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Z

.field public final h:I

.field public final i:I

.field public j:Z

.field public k:Z

.field public l:Lcom/google/gson/b;

.field public final m:Z

.field public final n:Lcom/google/gson/ToNumberPolicy;

.field public final o:Lcom/google/gson/ToNumberPolicy;

.field public final p:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/gson/internal/d;->c:Lcom/google/gson/internal/d;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/gson/h;->a:Lcom/google/gson/internal/d;

    .line 7
    .line 8
    sget-object v0, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/gson/h;->b:Lcom/google/gson/LongSerializationPolicy;

    .line 11
    .line 12
    sget-object v0, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/gson/h;->c:Lcom/google/gson/FieldNamingPolicy;

    .line 15
    .line 16
    new-instance v0, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/google/gson/h;->d:Ljava/util/HashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/gson/h;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/gson/h;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lcom/google/gson/h;->g:Z

    .line 39
    .line 40
    sget-object v1, Lcom/google/gson/g;->m:Lcom/google/gson/b;

    .line 41
    .line 42
    const/4 v1, 0x2

    .line 43
    iput v1, p0, Lcom/google/gson/h;->h:I

    .line 44
    .line 45
    iput v1, p0, Lcom/google/gson/h;->i:I

    .line 46
    .line 47
    iput-boolean v0, p0, Lcom/google/gson/h;->j:Z

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    iput-boolean v0, p0, Lcom/google/gson/h;->k:Z

    .line 51
    .line 52
    sget-object v1, Lcom/google/gson/g;->m:Lcom/google/gson/b;

    .line 53
    .line 54
    iput-object v1, p0, Lcom/google/gson/h;->l:Lcom/google/gson/b;

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/google/gson/h;->m:Z

    .line 57
    .line 58
    sget-object v0, Lcom/google/gson/g;->o:Lcom/google/gson/ToNumberPolicy;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/google/gson/h;->n:Lcom/google/gson/ToNumberPolicy;

    .line 61
    .line 62
    sget-object v0, Lcom/google/gson/g;->p:Lcom/google/gson/ToNumberPolicy;

    .line 63
    .line 64
    iput-object v0, p0, Lcom/google/gson/h;->o:Lcom/google/gson/ToNumberPolicy;

    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lcom/google/gson/h;->p:Ljava/util/ArrayDeque;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final a()Lcom/google/gson/g;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v13, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/gson/h;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v0, Lcom/google/gson/h;->f:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    add-int/2addr v4, v2

    .line 18
    add-int/lit8 v4, v4, 0x3

    .line 19
    .line 20
    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    invoke-static {v13}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    sget-boolean v2, Lj1/f;->a:Z

    .line 41
    .line 42
    iget v4, v0, Lcom/google/gson/h;->h:I

    .line 43
    .line 44
    iget v5, v0, Lcom/google/gson/h;->i:I

    .line 45
    .line 46
    const/4 v6, 0x2

    .line 47
    if-ne v4, v6, :cond_0

    .line 48
    .line 49
    if-eq v5, v6, :cond_2

    .line 50
    .line 51
    :cond_0
    new-instance v6, Lg1/h;

    .line 52
    .line 53
    sget-object v7, Lg1/g;->b:Lg1/f;

    .line 54
    .line 55
    invoke-direct {v6, v7, v4, v5}, Lg1/h;-><init>(Lg1/g;II)V

    .line 56
    .line 57
    .line 58
    sget-object v7, Lg1/f1;->a:Lg1/u0;

    .line 59
    .line 60
    new-instance v7, Lg1/u0;

    .line 61
    .line 62
    const-class v8, Ljava/util/Date;

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    invoke-direct {v7, v8, v6, v9}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 66
    .line 67
    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    sget-object v6, Lj1/f;->c:Lj1/e;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v8, Lg1/h;

    .line 76
    .line 77
    invoke-direct {v8, v6, v4, v5}, Lg1/h;-><init>(Lg1/g;II)V

    .line 78
    .line 79
    .line 80
    iget-object v6, v6, Lg1/g;->a:Ljava/lang/Class;

    .line 81
    .line 82
    new-instance v10, Lg1/u0;

    .line 83
    .line 84
    invoke-direct {v10, v6, v8, v9}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 85
    .line 86
    .line 87
    sget-object v6, Lj1/f;->b:Lj1/e;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v8, Lg1/h;

    .line 93
    .line 94
    invoke-direct {v8, v6, v4, v5}, Lg1/h;-><init>(Lg1/g;II)V

    .line 95
    .line 96
    .line 97
    iget-object v4, v6, Lg1/g;->a:Ljava/lang/Class;

    .line 98
    .line 99
    new-instance v5, Lg1/u0;

    .line 100
    .line 101
    invoke-direct {v5, v4, v8, v9}, Lg1/u0;-><init>(Ljava/lang/Class;Lcom/google/gson/p;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const/4 v10, 0x0

    .line 106
    move-object v5, v10

    .line 107
    :goto_0
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    if-eqz v2, :cond_2

    .line 111
    .line 112
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_2
    new-instance v2, Lcom/google/gson/g;

    .line 119
    .line 120
    new-instance v4, Ljava/util/HashMap;

    .line 121
    .line 122
    iget-object v5, v0, Lcom/google/gson/h;->d:Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 125
    .line 126
    .line 127
    iget-boolean v5, v0, Lcom/google/gson/h;->g:Z

    .line 128
    .line 129
    iget-boolean v6, v0, Lcom/google/gson/h;->k:Z

    .line 130
    .line 131
    iget-object v7, v0, Lcom/google/gson/h;->l:Lcom/google/gson/b;

    .line 132
    .line 133
    iget-boolean v8, v0, Lcom/google/gson/h;->j:Z

    .line 134
    .line 135
    new-instance v11, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    new-instance v12, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Ljava/util/ArrayList;

    .line 146
    .line 147
    iget-object v3, v0, Lcom/google/gson/h;->p:Ljava/util/ArrayDeque;

    .line 148
    .line 149
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v16, v1

    .line 153
    .line 154
    move-object v1, v2

    .line 155
    iget-object v2, v0, Lcom/google/gson/h;->a:Lcom/google/gson/internal/d;

    .line 156
    .line 157
    iget-object v3, v0, Lcom/google/gson/h;->c:Lcom/google/gson/FieldNamingPolicy;

    .line 158
    .line 159
    iget-boolean v9, v0, Lcom/google/gson/h;->m:Z

    .line 160
    .line 161
    iget-object v10, v0, Lcom/google/gson/h;->b:Lcom/google/gson/LongSerializationPolicy;

    .line 162
    .line 163
    iget-object v14, v0, Lcom/google/gson/h;->n:Lcom/google/gson/ToNumberPolicy;

    .line 164
    .line 165
    iget-object v15, v0, Lcom/google/gson/h;->o:Lcom/google/gson/ToNumberPolicy;

    .line 166
    .line 167
    invoke-direct/range {v1 .. v16}, Lcom/google/gson/g;-><init>(Lcom/google/gson/internal/d;Lcom/google/gson/a;Ljava/util/Map;ZZLcom/google/gson/b;ZZLcom/google/gson/LongSerializationPolicy;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/n;Lcom/google/gson/n;Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    return-object v1
.end method
