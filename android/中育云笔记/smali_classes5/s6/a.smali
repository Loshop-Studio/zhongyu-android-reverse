.class public abstract Ls6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String; = "a"

.field public static final d:Landroid/net/Uri;

.field public static final e:[Ljava/lang/String;

.field public static final f:[Ljava/lang/String;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lcom/luck/picture/lib/config/PictureSelectionConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const-string v0, "external"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ls6/a;->d:Landroid/net/Uri;

    .line 8
    .line 9
    const-string v11, "date_added"

    .line 10
    .line 11
    const-string v12, "orientation"

    .line 12
    .line 13
    const-string v1, "_id"

    .line 14
    .line 15
    const-string v2, "_data"

    .line 16
    .line 17
    const-string v3, "mime_type"

    .line 18
    .line 19
    const-string v4, "width"

    .line 20
    .line 21
    const-string v5, "height"

    .line 22
    .line 23
    const-string v6, "duration"

    .line 24
    .line 25
    const-string v7, "_size"

    .line 26
    .line 27
    const-string v8, "bucket_display_name"

    .line 28
    .line 29
    const-string v9, "_display_name"

    .line 30
    .line 31
    const-string v10, "bucket_id"

    .line 32
    .line 33
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Ls6/a;->e:[Ljava/lang/String;

    .line 38
    .line 39
    const-string v12, "orientation"

    .line 40
    .line 41
    const-string v13, "COUNT(*) AS count"

    .line 42
    .line 43
    const-string v1, "_id"

    .line 44
    .line 45
    const-string v2, "_data"

    .line 46
    .line 47
    const-string v3, "mime_type"

    .line 48
    .line 49
    const-string v4, "width"

    .line 50
    .line 51
    const-string v5, "height"

    .line 52
    .line 53
    const-string v6, "duration"

    .line 54
    .line 55
    const-string v7, "_size"

    .line 56
    .line 57
    const-string v8, "bucket_display_name"

    .line 58
    .line 59
    const-string v9, "_display_name"

    .line 60
    .line 61
    const-string v10, "bucket_id"

    .line 62
    .line 63
    const-string v11, "date_added"

    .line 64
    .line 65
    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Ls6/a;->f:[Ljava/lang/String;

    .line 70
    .line 71
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


# virtual methods
.method public a()Lcom/luck/picture/lib/config/PictureSelectionConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/a;->b:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide v0, 0x7fffffffffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->s:I

    .line 20
    .line 21
    int-to-long v0, v0

    .line 22
    :goto_0
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 23
    .line 24
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget v3, v3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t:I

    .line 29
    .line 30
    int-to-long v3, v3

    .line 31
    const-wide/16 v5, 0x0

    .line 32
    .line 33
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "="

    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {v3, v4, v0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "%d <%s duration and duration <= %d"

    .line 52
    .line 53
    invoke-static {v2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-wide v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-wide v0, 0x7fffffffffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-wide v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->z:J

    .line 24
    .line 25
    :goto_0
    sget-object v4, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-wide v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->A:J

    .line 32
    .line 33
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "="

    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {v2, v3, v0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "%d <%s _size and _size <= %d"

    .line 52
    .line 53
    invoke-static {v4, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->R:Ljava/util/List;

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_6

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 46
    .line 47
    invoke-static {}, Ll6/d;->d()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const-string v7, "audio"

    .line 52
    .line 53
    const-string v8, "image"

    .line 54
    .line 55
    if-ne v5, v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_0

    .line 62
    .line 63
    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    iget v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 75
    .line 76
    invoke-static {}, Ll6/d;->c()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    const-string v9, "video"

    .line 81
    .line 82
    if-ne v5, v6, :cond_3

    .line 83
    .line 84
    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-nez v5, :cond_0

    .line 89
    .line 90
    invoke-virtual {v4, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iget v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 102
    .line 103
    invoke-static {}, Ll6/d;->b()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-ne v5, v6, :cond_4

    .line 108
    .line 109
    invoke-virtual {v4, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_0

    .line 114
    .line 115
    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    if-nez v3, :cond_5

    .line 125
    .line 126
    const-string v5, " AND "

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const-string v5, " OR "

    .line 130
    .line 131
    :goto_1
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v5, "mime_type"

    .line 135
    .line 136
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v5, "=\'"

    .line 140
    .line 141
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v4, "\'"

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_6
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 159
    .line 160
    invoke-static {}, Ll6/d;->d()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eq v0, v3, :cond_7

    .line 165
    .line 166
    invoke-virtual {p0}, Ls6/a;->a()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->F:Z

    .line 171
    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    invoke-static {}, Ll6/c;->n()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-nez v0, :cond_7

    .line 183
    .line 184
    const-string v0, " AND (mime_type!=\'image/gif\')"

    .line 185
    .line 186
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    :cond_7
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    return-object v0
.end method

.method public f(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/a;->b:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    return-void
.end method

.method public abstract g(Lq6/f;)V
.end method

.method public abstract h(Lq6/e;)V
.end method

.method public abstract i(JIILq6/g;)V
.end method
