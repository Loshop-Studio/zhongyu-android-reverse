.class public final Ls6/b;
.super Ls6/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls6/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Ls6/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/luck/picture/lib/entity/LocalMediaFolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Ls6/b;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "(media_type=?"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p2, " OR "

    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p2, "media_type"

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p2, "=? AND "

    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ") AND "

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "media_type=?"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " AND "

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "media_type=?"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " AND "

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "media_type=?"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, " AND "

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public g(Lq6/f;)V
    .locals 1

    .line 1
    new-instance v0, Ls6/b$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ls6/b$a;-><init>(Ls6/b;Lq6/f;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public h(Lq6/e;)V
    .locals 1

    .line 1
    new-instance v0, Ls6/b$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ls6/b$b;-><init>(Ls6/b;Lq6/e;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(JIILq6/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/luck/picture/lib/entity/LocalMediaFolder;
    .locals 4

    .line 1
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->i()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v2, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    new-instance v0, Lcom/luck/picture/lib/entity/LocalMediaFolder;

    .line 36
    .line 37
    invoke-direct {v0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->r(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->p(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->q(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ls6/a;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ls6/a;->d()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ls6/a;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget v3, v3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 18
    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v3, v4, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v3, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v3, v1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    return-object v0

    .line 32
    :cond_0
    invoke-static {v0, v2}, Ls6/b;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_1
    invoke-static {v0, v2}, Ls6/b;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_2
    invoke-static {v1, v2}, Ls6/b;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-static {v0, v1, v2}, Ls6/b;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public m()[Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    if-eq v0, v2, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    filled-new-array {v0}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :cond_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    filled-new-array {v0}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_2
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    filled-new-array {v0}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_3
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "date_modified DESC"

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g0:Ljava/lang/String;

    .line 21
    .line 22
    return-object v0
.end method

.method public s(Landroid/database/Cursor;Z)Lcom/luck/picture/lib/entity/LocalMedia;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Ls6/a;->e:[Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v2, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    aget-object v3, v1, v3

    .line 14
    .line 15
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x2

    .line 20
    aget-object v4, v1, v4

    .line 21
    .line 22
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v5, 0x3

    .line 27
    aget-object v5, v1, v5

    .line 28
    .line 29
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x4

    .line 34
    aget-object v6, v1, v6

    .line 35
    .line 36
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x5

    .line 41
    aget-object v7, v1, v7

    .line 42
    .line 43
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const/4 v8, 0x6

    .line 48
    aget-object v8, v1, v8

    .line 49
    .line 50
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    const/4 v9, 0x7

    .line 55
    aget-object v9, v1, v9

    .line 56
    .line 57
    invoke-interface {v0, v9}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    const/16 v10, 0x8

    .line 62
    .line 63
    aget-object v10, v1, v10

    .line 64
    .line 65
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const/16 v11, 0x9

    .line 70
    .line 71
    aget-object v11, v1, v11

    .line 72
    .line 73
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    const/16 v12, 0xa

    .line 78
    .line 79
    aget-object v12, v1, v12

    .line 80
    .line 81
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    const/16 v13, 0xb

    .line 86
    .line 87
    aget-object v1, v1, v13

    .line 88
    .line 89
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v13

    .line 97
    move/from16 p2, v11

    .line 98
    .line 99
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getLong(I)J

    .line 100
    .line 101
    .line 102
    move-result-wide v11

    .line 103
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {}, La7/j;->e()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_0

    .line 116
    .line 117
    invoke-static {v13, v14, v2}, La7/h;->j(JLjava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    goto :goto_0

    .line 122
    :cond_0
    move-object v4, v3

    .line 123
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v15

    .line 127
    if-eqz v15, :cond_1

    .line 128
    .line 129
    invoke-static {}, Ll6/c;->o()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :cond_1
    const-string v15, "image/*"

    .line 134
    .line 135
    invoke-virtual {v2, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v16

    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    if-eqz v16, :cond_3

    .line 142
    .line 143
    invoke-static {v3}, La7/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    move-object/from16 v16, v2

    .line 148
    .line 149
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-boolean v2, v2, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 154
    .line 155
    if-nez v2, :cond_2

    .line 156
    .line 157
    invoke-static/range {v16 .. v16}, Ll6/c;->f(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_2

    .line 162
    .line 163
    return-object v17

    .line 164
    :cond_2
    move-object/from16 v2, v16

    .line 165
    .line 166
    :cond_3
    invoke-virtual {v2, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-eqz v15, :cond_4

    .line 171
    .line 172
    return-object v17

    .line 173
    :cond_4
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    iget-boolean v15, v15, Lcom/luck/picture/lib/config/PictureSelectionConfig;->G:Z

    .line 178
    .line 179
    if-nez v15, :cond_5

    .line 180
    .line 181
    invoke-static {}, Ll6/c;->p()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    invoke-virtual {v2, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v15

    .line 189
    if-eqz v15, :cond_5

    .line 190
    .line 191
    return-object v17

    .line 192
    :cond_5
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    iget-boolean v15, v15, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H:Z

    .line 197
    .line 198
    if-nez v15, :cond_6

    .line 199
    .line 200
    invoke-static {v2}, Ll6/c;->e(Ljava/lang/String;)Z

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    if-eqz v15, :cond_6

    .line 205
    .line 206
    return-object v17

    .line 207
    :cond_6
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 212
    .line 213
    .line 214
    move-result v16

    .line 215
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    move/from16 v18, v15

    .line 220
    .line 221
    const/16 v15, 0x5a

    .line 222
    .line 223
    if-eq v1, v15, :cond_8

    .line 224
    .line 225
    const/16 v15, 0x10e

    .line 226
    .line 227
    if-ne v1, v15, :cond_7

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_7
    move/from16 v15, v18

    .line 231
    .line 232
    :goto_1
    move/from16 v1, v16

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_8
    :goto_2
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 236
    .line 237
    .line 238
    move-result v15

    .line 239
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 240
    .line 241
    .line 242
    move-result v16

    .line 243
    goto :goto_1

    .line 244
    :goto_3
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 245
    .line 246
    .line 247
    move-result-wide v5

    .line 248
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 249
    .line 250
    .line 251
    move-result-wide v7

    .line 252
    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v10

    .line 260
    move-object/from16 v16, v10

    .line 261
    .line 262
    move-wide/from16 v18, v11

    .line 263
    .line 264
    move/from16 v10, p2

    .line 265
    .line 266
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 267
    .line 268
    .line 269
    move-result-wide v10

    .line 270
    invoke-static/range {v16 .. v16}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_9

    .line 275
    .line 276
    invoke-static {v3}, Ll6/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    goto :goto_4

    .line 281
    :cond_9
    move-object/from16 v0, v16

    .line 282
    .line 283
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    iget-boolean v12, v12, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 288
    .line 289
    const-wide/16 v20, 0x0

    .line 290
    .line 291
    if-eqz v12, :cond_a

    .line 292
    .line 293
    cmp-long v12, v7, v20

    .line 294
    .line 295
    if-lez v12, :cond_a

    .line 296
    .line 297
    const-wide/16 v22, 0x400

    .line 298
    .line 299
    cmp-long v12, v7, v22

    .line 300
    .line 301
    if-gez v12, :cond_a

    .line 302
    .line 303
    return-object v17

    .line 304
    :cond_a
    invoke-static {v2}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v12

    .line 308
    if-nez v12, :cond_c

    .line 309
    .line 310
    invoke-static {v2}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    if-eqz v12, :cond_b

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_b
    move-wide/from16 v22, v7

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_c
    :goto_5
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 321
    .line 322
    .line 323
    move-result-object v12

    .line 324
    iget v12, v12, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 325
    .line 326
    if-lez v12, :cond_d

    .line 327
    .line 328
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 329
    .line 330
    .line 331
    move-result-object v12

    .line 332
    iget v12, v12, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 333
    .line 334
    move-wide/from16 v22, v7

    .line 335
    .line 336
    int-to-long v7, v12

    .line 337
    cmp-long v7, v5, v7

    .line 338
    .line 339
    if-gez v7, :cond_e

    .line 340
    .line 341
    return-object v17

    .line 342
    :cond_d
    move-wide/from16 v22, v7

    .line 343
    .line 344
    :cond_e
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    iget v7, v7, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 349
    .line 350
    if-lez v7, :cond_f

    .line 351
    .line 352
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    iget v7, v7, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 357
    .line 358
    int-to-long v7, v7

    .line 359
    cmp-long v7, v5, v7

    .line 360
    .line 361
    if-lez v7, :cond_f

    .line 362
    .line 363
    return-object v17

    .line 364
    :cond_f
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    iget-boolean v7, v7, Lcom/luck/picture/lib/config/PictureSelectionConfig;->I0:Z

    .line 369
    .line 370
    if-eqz v7, :cond_10

    .line 371
    .line 372
    cmp-long v7, v5, v20

    .line 373
    .line 374
    if-gtz v7, :cond_10

    .line 375
    .line 376
    return-object v17

    .line 377
    :cond_10
    :goto_6
    invoke-static {}, Lcom/luck/picture/lib/entity/LocalMedia;->a()Lcom/luck/picture/lib/entity/LocalMedia;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-virtual {v7, v13, v14}, Lcom/luck/picture/lib/entity/LocalMedia;->g0(J)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v7, v10, v11}, Lcom/luck/picture/lib/entity/LocalMedia;->P(J)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v7, v4}, Lcom/luck/picture/lib/entity/LocalMedia;->n0(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v7, v3}, Lcom/luck/picture/lib/entity/LocalMedia;->p0(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v7, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->d0(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v7, v9}, Lcom/luck/picture/lib/entity/LocalMedia;->m0(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v7, v5, v6}, Lcom/luck/picture/lib/entity/LocalMedia;->b0(J)V

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {p0 .. p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 407
    .line 408
    invoke-virtual {v7, v0}, Lcom/luck/picture/lib/entity/LocalMedia;->R(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v7, v2}, Lcom/luck/picture/lib/entity/LocalMedia;->i0(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v7, v15}, Lcom/luck/picture/lib/entity/LocalMedia;->s0(I)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v7, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->f0(I)V

    .line 418
    .line 419
    .line 420
    move-wide/from16 v0, v22

    .line 421
    .line 422
    invoke-virtual {v7, v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->r0(J)V

    .line 423
    .line 424
    .line 425
    move-wide/from16 v0, v18

    .line 426
    .line 427
    invoke-virtual {v7, v0, v1}, Lcom/luck/picture/lib/entity/LocalMedia;->a0(J)V

    .line 428
    .line 429
    .line 430
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->N0:Ln6/a;

    .line 431
    .line 432
    return-object v7
.end method
