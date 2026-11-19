.class public final Lcom/friday/common/helper/NotePageOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/friday/common/helper/NotePageOrder;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/helper/NotePageOrder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/common/helper/NotePageOrder;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/friday/common/helper/NotePageOrder;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    sput v0, Lcom/friday/common/helper/NotePageOrder;->c:I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic a(Lcom/friday/common/helper/NotePageOrder;Lcom/friday/common/entity/ResourceEntity;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/NotePageOrder;->c(Lcom/friday/common/entity/ResourceEntity;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, "resources"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_1
    if-ge v2, v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    move-object v4, v3

    .line 59
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 60
    .line 61
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    new-instance v5, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_2
    check-cast v5, Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

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
    check-cast v2, Ljava/lang/String;

    .line 115
    .line 116
    sget-object v3, Lf2/e;->a:Lf2/e;

    .line 117
    .line 118
    new-instance v4, Ljava/io/File;

    .line 119
    .line 120
    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v4}, Lf2/e;->a(Ljava/io/File;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_4

    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Ljava/lang/Iterable;

    .line 146
    .line 147
    new-instance v0, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v1, 0xa

    .line 150
    .line 151
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, Ljava/util/List;

    .line 173
    .line 174
    check-cast v1, Ljava/lang/Iterable;

    .line 175
    .line 176
    new-instance v2, Lcom/friday/common/helper/NotePageOrder$c;

    .line 177
    .line 178
    invoke-direct {v2}, Lcom/friday/common/helper/NotePageOrder$c;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v3, Lcom/friday/common/helper/NotePageOrder$d;

    .line 182
    .line 183
    invoke-direct {v3, v2}, Lcom/friday/common/helper/NotePageOrder$d;-><init>(Ljava/util/Comparator;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v1, v3}, Lrc/g0;->E0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Lcom/friday/common/entity/ResourceEntity;

    .line 191
    .line 192
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_6
    new-instance p1, Lcom/friday/common/helper/NotePageOrder$a;

    .line 197
    .line 198
    invoke-direct {p1}, Lcom/friday/common/helper/NotePageOrder$a;-><init>()V

    .line 199
    .line 200
    .line 201
    new-instance v1, Lcom/friday/common/helper/NotePageOrder$b;

    .line 202
    .line 203
    invoke-direct {v1, p1}, Lcom/friday/common/helper/NotePageOrder$b;-><init>(Ljava/util/Comparator;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v1}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    return-object p1
.end method

.method public final c(Lcom/friday/common/entity/ResourceEntity;)I
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p1, v1

    .line 23
    :goto_0
    const-string v2, "page_mdb"

    .line 24
    .line 25
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v3, "data.mdb"

    .line 36
    .line 37
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return p1

    .line 45
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_2
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v1, "lock.mdb"

    .line 66
    .line 67
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v1, "screenshot.png"

    .line 80
    .line 81
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    const/4 p1, 0x2

    .line 88
    return p1

    .line 89
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string v0, "snapshot.bin"

    .line 94
    .line 95
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    const/4 p1, 0x3

    .line 102
    return p1

    .line 103
    :cond_5
    const/4 p1, 0x4

    .line 104
    return p1
.end method

.method public final d(Ljava/util/List;)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "resources"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Ljava/lang/Iterable;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    move-object v4, v2

    .line 30
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 31
    .line 32
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x2

    .line 44
    const-string v7, "screenshot.png"

    .line 45
    .line 46
    invoke-static {v4, v7, v5, v6, v3}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance v0, Lcom/friday/common/helper/NotePageOrder$e;

    .line 57
    .line 58
    invoke-direct {v0}, Lcom/friday/common/helper/NotePageOrder$e;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v0}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/Iterable;

    .line 66
    .line 67
    const/16 v1, 0xa

    .line 68
    .line 69
    invoke-static {v0, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-static {v1}, Lrc/q0;->e(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/16 v2, 0x10

    .line 78
    .line 79
    invoke-static {v1, v2}, Lnd/o;->e(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_2

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object v4, v1

    .line 103
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 104
    .line 105
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/NotePageOrder;->b(Ljava/util/List;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/Iterable;

    .line 118
    .line 119
    new-instance v0, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_5

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lcom/friday/common/entity/ResourceEntity;

    .line 139
    .line 140
    invoke-virtual {v1}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lcom/friday/common/entity/ResourceEntity;

    .line 149
    .line 150
    if-eqz v1, :cond_4

    .line 151
    .line 152
    new-instance v4, Ljava/io/File;

    .line 153
    .line 154
    invoke-virtual {v1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    move-object v4, v3

    .line 163
    :goto_3
    if-eqz v4, :cond_3

    .line 164
    .line 165
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    return-object v0
.end method

.method public final e(Ljava/lang/String;Lhd/l;Lvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;-><init>(Lcom/friday/common/helper/NotePageOrder;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lbe/a;

    .line 46
    .line 47
    iget-object p2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Lhd/l;

    .line 50
    .line 51
    iget-object p2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/String;

    .line 54
    .line 55
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :catchall_0
    move-exception p2

    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    iget p1, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->f:I

    .line 72
    .line 73
    iget-object p2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p2, Lbe/a;

    .line 76
    .line 77
    iget-object v2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Lhd/l;

    .line 80
    .line 81
    iget-object v5, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v5, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move p3, p1

    .line 89
    move-object p1, v5

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p3, Lcom/friday/common/helper/NotePageOrder;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 95
    .line 96
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    invoke-static {v4, v5, v6}, Lbe/f;->b(ZILjava/lang/Object;)Lbe/a;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {p3, p1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    if-nez p3, :cond_4

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move-object v2, p3

    .line 114
    :cond_5
    :goto_1
    const-string p3, "getOrPut(...)"

    .line 115
    .line 116
    invoke-static {v2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    check-cast v2, Lbe/a;

    .line 120
    .line 121
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    iput-object p3, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->c:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->d:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->e:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->f:I

    .line 132
    .line 133
    iput v5, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    .line 134
    .line 135
    invoke-interface {v2, v6, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    if-ne p3, v1, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    move-object p3, v2

    .line 143
    move-object v2, p2

    .line 144
    move-object p2, p3

    .line 145
    move p3, v4

    .line 146
    :goto_2
    :try_start_1
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->c:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->d:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object p2, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->e:Ljava/lang/Object;

    .line 159
    .line 160
    iput p3, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->f:I

    .line 161
    .line 162
    iput v4, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->g:I

    .line 163
    .line 164
    iput v3, v0, Lcom/friday/common/helper/NotePageOrder$withNoteLock$1;->j:I

    .line 165
    .line 166
    invoke-interface {v2, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    if-ne p3, v1, :cond_7

    .line 171
    .line 172
    :goto_3
    return-object v1

    .line 173
    :cond_7
    move-object p1, p2

    .line 174
    :goto_4
    invoke-interface {p1, v6}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-object p3

    .line 178
    :catchall_1
    move-exception p1

    .line 179
    move-object v7, p2

    .line 180
    move-object p2, p1

    .line 181
    move-object p1, v7

    .line 182
    :goto_5
    invoke-interface {p1, v6}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    throw p2
.end method
