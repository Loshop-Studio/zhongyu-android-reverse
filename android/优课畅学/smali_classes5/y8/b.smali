.class public Ly8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/b$g;,
        Ly8/b$f;,
        Ly8/b$b;,
        Ly8/b$d;,
        Ly8/b$l;,
        Ly8/b$m;,
        Ly8/b$k;,
        Ly8/b$i;,
        Ly8/b$c;,
        Ly8/b$h;,
        Ly8/b$j;,
        Ly8/b$a;,
        Ly8/b$e;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Exception;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Map;

.field public d:[Ly8/b$e;

.field public e:[Ly8/b$e;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Exception;

    .line 5
    .line 6
    const-string v1, "not suuport this filter tag"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ly8/b;->a:Ljava/lang/Exception;

    .line 12
    .line 13
    new-instance v0, Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Ly8/b;->b:Ljava/util/Map;

    .line 23
    .line 24
    new-instance v0, Ljava/util/TreeMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Ly8/b;->c:Ljava/util/Map;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    new-array v1, v0, [Ly8/b$e;

    .line 37
    .line 38
    iput-object v1, p0, Ly8/b;->d:[Ly8/b$e;

    .line 39
    .line 40
    new-array v0, v0, [Ly8/b$e;

    .line 41
    .line 42
    iput-object v0, p0, Ly8/b;->e:[Ly8/b$e;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Ly8/b;->d:[Ly8/b$e;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_1

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    invoke-interface {v4}, Ly8/b$e;->clear()V

    .line 13
    .line 14
    .line 15
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Ly8/b;->e:[Ly8/b$e;

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    :goto_1
    if-ge v2, v1, :cond_3

    .line 22
    .line 23
    aget-object v3, v0, v2

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v3}, Ly8/b$e;->clear()V

    .line 28
    .line 29
    .line 30
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    return-void
.end method

.method public b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V
    .locals 10

    .line 1
    iget-object v0, p0, Ly8/b;->d:[Ly8/b$e;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_2

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    move v5, p2

    .line 13
    move v6, p3

    .line 14
    move-object v7, p4

    .line 15
    move v8, p5

    .line 16
    move-object/from16 v9, p6

    .line 17
    .line 18
    invoke-interface/range {v3 .. v9}, Ly8/b$e;->b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-object v5, v9, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 23
    .line 24
    iget v5, v5, Lz8/i;->c:I

    .line 25
    .line 26
    iput v5, p1, Lz8/c;->G:I

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    move-object/from16 v9, p6

    .line 32
    .line 33
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    return-void
.end method

.method public c(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Ly8/b;->e:[Ly8/b$e;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_2

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    move-object v5, p1

    .line 13
    move v6, p2

    .line 14
    move v7, p3

    .line 15
    move-object v8, p4

    .line 16
    move/from16 v9, p5

    .line 17
    .line 18
    move-object/from16 v10, p6

    .line 19
    .line 20
    invoke-interface/range {v4 .. v10}, Ly8/b$e;->b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    iget-object v6, v10, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 25
    .line 26
    iget v6, v6, Lz8/i;->c:I

    .line 27
    .line 28
    iput v6, p1, Lz8/c;->G:I

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    return p1

    .line 34
    :cond_0
    move-object/from16 v10, p6

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return v2
.end method

.method public d(Ljava/lang/String;)Ly8/b$e;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Ly8/b;->e(Ljava/lang/String;Z)Ly8/b$e;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public e(Ljava/lang/String;Z)Ly8/b$e;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Ly8/b;->f()V

    .line 5
    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v1, p0, Ly8/b;->b:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ly8/b$e;

    .line 15
    .line 16
    if-nez v1, :cond_a

    .line 17
    .line 18
    const-string v2, "1010_Filter"

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    new-instance v1, Ly8/b$j;

    .line 27
    .line 28
    invoke-direct {v1}, Ly8/b$j;-><init>()V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_1
    const-string v2, "1011_Filter"

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    new-instance v1, Ly8/b$h;

    .line 42
    .line 43
    invoke-direct {v1}, Ly8/b$h;-><init>()V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_2
    const-string v2, "1012_Filter"

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    new-instance v1, Ly8/b$c;

    .line 57
    .line 58
    invoke-direct {v1}, Ly8/b$c;-><init>()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const-string v2, "1013_Filter"

    .line 63
    .line 64
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    new-instance v1, Ly8/b$i;

    .line 71
    .line 72
    invoke-direct {v1}, Ly8/b$i;-><init>()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const-string v2, "1014_Filter"

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    new-instance v1, Ly8/b$m;

    .line 85
    .line 86
    invoke-direct {v1}, Ly8/b$m;-><init>()V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    const-string v2, "1015_Filter"

    .line 91
    .line 92
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    new-instance v1, Ly8/b$l;

    .line 99
    .line 100
    invoke-direct {v1}, Ly8/b$l;-><init>()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_6
    const-string v2, "1016_Filter"

    .line 105
    .line 106
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_7

    .line 111
    .line 112
    new-instance v1, Ly8/b$d;

    .line 113
    .line 114
    invoke-direct {v1}, Ly8/b$d;-><init>()V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    const-string v2, "1017_Filter"

    .line 119
    .line 120
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_8

    .line 125
    .line 126
    new-instance v1, Ly8/b$b;

    .line 127
    .line 128
    invoke-direct {v1}, Ly8/b$b;-><init>()V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_8
    const-string v2, "1018_Filter"

    .line 133
    .line 134
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_9

    .line 139
    .line 140
    new-instance v1, Ly8/b$f;

    .line 141
    .line 142
    invoke-direct {v1}, Ly8/b$f;-><init>()V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_9
    const-string v2, "1019_Filter"

    .line 147
    .line 148
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_a

    .line 153
    .line 154
    new-instance v1, Ly8/b$g;

    .line 155
    .line 156
    invoke-direct {v1}, Ly8/b$g;-><init>()V

    .line 157
    .line 158
    .line 159
    :cond_a
    :goto_0
    if-nez v1, :cond_b

    .line 160
    .line 161
    invoke-virtual {p0}, Ly8/b;->f()V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_b
    invoke-interface {v1, v0}, Ly8/b$e;->a(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    if-eqz p2, :cond_c

    .line 169
    .line 170
    iget-object p2, p0, Ly8/b;->b:Ljava/util/Map;

    .line 171
    .line 172
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Ly8/b;->b:Ljava/util/Map;

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget-object p2, p0, Ly8/b;->d:[Ly8/b$e;

    .line 182
    .line 183
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, [Ly8/b$e;

    .line 188
    .line 189
    iput-object p1, p0, Ly8/b;->d:[Ly8/b$e;

    .line 190
    .line 191
    return-object v1

    .line 192
    :cond_c
    iget-object p2, p0, Ly8/b;->c:Ljava/util/Map;

    .line 193
    .line 194
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Ly8/b;->c:Ljava/util/Map;

    .line 198
    .line 199
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    iget-object p2, p0, Ly8/b;->e:[Ly8/b$e;

    .line 204
    .line 205
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, [Ly8/b$e;

    .line 210
    .line 211
    iput-object p1, p0, Ly8/b;->e:[Ly8/b$e;

    .line 212
    .line 213
    return-object v1
.end method

.method public final f()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ly8/b;->a:Ljava/lang/Exception;

    .line 2
    .line 3
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :catch_0
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Ly8/b;->h(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public h(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ly8/b;->b:Ljava/util/Map;

    .line 4
    .line 5
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ly8/b$e;

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Ly8/b;->c:Ljava/util/Map;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_1
    if-eqz p1, :cond_2

    .line 16
    .line 17
    invoke-interface {p1}, Ly8/b$e;->clear()V

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Ly8/b;->b:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p2, p0, Ly8/b;->d:[Ly8/b$e;

    .line 29
    .line 30
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, [Ly8/b$e;

    .line 35
    .line 36
    iput-object p1, p0, Ly8/b;->d:[Ly8/b$e;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object p1, p0, Ly8/b;->c:Ljava/util/Map;

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p2, p0, Ly8/b;->e:[Ly8/b$e;

    .line 46
    .line 47
    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, [Ly8/b$e;

    .line 52
    .line 53
    iput-object p1, p0, Ly8/b;->e:[Ly8/b$e;

    .line 54
    .line 55
    :cond_2
    return-void
.end method
