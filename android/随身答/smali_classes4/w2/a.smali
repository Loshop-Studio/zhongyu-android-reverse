.class public Lw2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:I

.field public final c:I

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:[B

.field public g:[B

.field public h:[B

.field public i:I

.field public j:I

.field public k:I

.field public l:[B

.field public m:[B

.field public n:Z


# direct methods
.method public constructor <init>([BLjava/lang/String;[B)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lw2/a;->a:[B

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput v0, p0, Lw2/a;->b:I

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lw2/a;->c:I

    .line 18
    .line 19
    const-string v1, "1.0"

    .line 20
    .line 21
    iput-object v1, p0, Lw2/a;->d:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-object v1, p0, Lw2/a;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v1, p0, Lw2/a;->f:[B

    .line 27
    .line 28
    iput-object v1, p0, Lw2/a;->g:[B

    .line 29
    .line 30
    iput-object v1, p0, Lw2/a;->h:[B

    .line 31
    .line 32
    iput v0, p0, Lw2/a;->i:I

    .line 33
    .line 34
    iput v0, p0, Lw2/a;->j:I

    .line 35
    .line 36
    iput v0, p0, Lw2/a;->k:I

    .line 37
    .line 38
    iput-object v1, p0, Lw2/a;->l:[B

    .line 39
    .line 40
    iput-object v1, p0, Lw2/a;->m:[B

    .line 41
    .line 42
    iput-boolean v0, p0, Lw2/a;->n:Z

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    array-length v0, p1

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    iput-object p2, p0, Lw2/a;->e:Ljava/lang/String;

    .line 50
    .line 51
    array-length p2, p1

    .line 52
    iput p2, p0, Lw2/a;->k:I

    .line 53
    .line 54
    invoke-static {p1}, Lv2/h;->a([B)[B

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lw2/a;->l:[B

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide p1

    .line 64
    const-wide/16 v0, 0x3e8

    .line 65
    .line 66
    div-long/2addr p1, v0

    .line 67
    long-to-int p1, p1

    .line 68
    iput p1, p0, Lw2/a;->j:I

    .line 69
    .line 70
    iput-object p3, p0, Lw2/a;->m:[B

    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 74
    .line 75
    const-string p2, "entity is null or empty"

    .line 76
    .line 77
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;[B)Lw2/a;
    .locals 9

    .line 1
    const-string v0, "serial"

    .line 2
    .line 3
    const-string v1, "signature"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {p0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v5, 0x1

    .line 15
    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    new-instance v7, Lw2/a;

    .line 20
    .line 21
    const-string v8, "123456789098765432102:00:00:00:00:00"

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-direct {v7, p2, p1, v8}, Lw2/a;-><init>([BLjava/lang/String;[B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v5}, Lw2/a;->j(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v4}, Lw2/a;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v6}, Lw2/a;->k(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Lw2/a;->i()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    add-int/2addr v6, v5

    .line 47
    invoke-interface {p1, v0, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v7}, Lw2/a;->g()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, p0}, Lw2/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    return-object v7

    .line 66
    :catch_0
    move-exception p1

    .line 67
    invoke-static {p0, p1}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-object v2
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;[B)Lw2/a;
    .locals 9

    .line 1
    const-string v0, "serial"

    .line 2
    .line 3
    const-string v1, "signature"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    invoke-static {p0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-interface {v3, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v5, 0x1

    .line 15
    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    new-instance v7, Lw2/a;

    .line 20
    .line 21
    const-string v8, "123456789098765432102:00:00:00:00:00"

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-direct {v7, p2, p1, v8}, Lw2/a;-><init>([BLjava/lang/String;[B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v4}, Lw2/a;->l(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7, v6}, Lw2/a;->k(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7}, Lw2/a;->i()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    add-int/2addr v6, v5

    .line 44
    invoke-interface {p1, v0, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v7}, Lw2/a;->g()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {p1, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, p0}, Lw2/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-object v7

    .line 63
    :catch_0
    move-exception p1

    .line 64
    invoke-static {p0, p1}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v2
.end method

.method public static h(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lx2/a;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string v1, "signature"

    .line 10
    .line 11
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 10

    .line 1
    const-string v0, "appkey"

    .line 2
    .line 3
    iget-object v1, p0, Lw2/a;->e:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "umid"

    .line 7
    .line 8
    invoke-static {p1, v3, v2}, Lcom/umeng/commonsdk/framework/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v4, p0, Lw2/a;->f:[B

    .line 13
    .line 14
    invoke-static {v4}, Lv2/a;->k([B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x10

    .line 19
    .line 20
    new-array v6, v5, [B

    .line 21
    .line 22
    iget-object v7, p0, Lw2/a;->f:[B

    .line 23
    .line 24
    const/4 v8, 0x2

    .line 25
    const/4 v9, 0x0

    .line 26
    invoke-static {v7, v8, v6, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    invoke-static {v6}, Lv2/a;->h([B)[B

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {v5}, Lv2/a;->k([B)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 38
    .line 39
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v4

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    :goto_0
    const-string v7, "signature"

    .line 54
    .line 55
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    const-string v4, "checksum"

    .line 59
    .line 60
    invoke-virtual {v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    new-instance v4, Ljava/io/File;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const-string v7, ".umeng"

    .line 70
    .line 71
    invoke-direct {v4, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_1

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    .line 81
    .line 82
    .line 83
    :cond_1
    new-instance v5, Ljava/io/File;

    .line 84
    .line 85
    const-string v7, "exchangeIdentity.json"

    .line 86
    .line 87
    invoke-direct {v5, v4, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v5, v4}, Lv2/c;->i(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    :goto_2
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 102
    .line 103
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    const-string v0, "channel"

    .line 110
    .line 111
    invoke-static {p1}, Lz2/d;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    if-eqz v2, :cond_2

    .line 119
    .line 120
    invoke-static {v2}, Lv2/c;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception p1

    .line 129
    goto :goto_4

    .line 130
    :cond_2
    :goto_3
    new-instance v0, Ljava/io/File;

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string v1, "exid.dat"

    .line 137
    .line 138
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {v0, p1}, Lv2/c;->i(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 150
    .line 151
    .line 152
    :goto_5
    return-void
.end method

.method public final b()[B
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw2/a;->f:[B

    .line 7
    .line 8
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lw2/a;->i:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lw2/a;->j:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lw2/a;->k:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lw2/a;->g:[B

    .line 31
    .line 32
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Lv2/a;->h([B)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public final e([BI)[B
    .locals 10

    .line 1
    iget-object v0, p0, Lw2/a;->m:[B

    .line 2
    .line 3
    invoke-static {v0}, Lv2/a;->h([B)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw2/a;->l:[B

    .line 8
    .line 9
    invoke-static {v1}, Lv2/a;->h([B)[B

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    array-length v2, v0

    .line 14
    mul-int/lit8 v3, v2, 0x2

    .line 15
    .line 16
    new-array v4, v3, [B

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move v6, v5

    .line 20
    :goto_0
    const/4 v7, 0x1

    .line 21
    if-ge v6, v2, :cond_0

    .line 22
    .line 23
    mul-int/lit8 v8, v6, 0x2

    .line 24
    .line 25
    aget-byte v9, v1, v6

    .line 26
    .line 27
    aput-byte v9, v4, v8

    .line 28
    .line 29
    add-int/2addr v8, v7

    .line 30
    aget-byte v7, v0, v6

    .line 31
    .line 32
    aput-byte v7, v4, v8

    .line 33
    .line 34
    add-int/lit8 v6, v6, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v0, v5

    .line 38
    :goto_1
    const/4 v1, 0x2

    .line 39
    if-ge v0, v1, :cond_1

    .line 40
    .line 41
    aget-byte v1, p1, v0

    .line 42
    .line 43
    aput-byte v1, v4, v0

    .line 44
    .line 45
    sub-int v1, v3, v0

    .line 46
    .line 47
    sub-int/2addr v1, v7

    .line 48
    array-length v2, p1

    .line 49
    sub-int/2addr v2, v0

    .line 50
    sub-int/2addr v2, v7

    .line 51
    aget-byte v2, p1, v2

    .line 52
    .line 53
    aput-byte v2, v4, v1

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    and-int/lit16 p1, p2, 0xff

    .line 59
    .line 60
    int-to-byte p1, p1

    .line 61
    shr-int/lit8 v0, p2, 0x8

    .line 62
    .line 63
    and-int/lit16 v0, v0, 0xff

    .line 64
    .line 65
    int-to-byte v0, v0

    .line 66
    shr-int/lit8 v2, p2, 0x10

    .line 67
    .line 68
    and-int/lit16 v2, v2, 0xff

    .line 69
    .line 70
    int-to-byte v2, v2

    .line 71
    ushr-int/lit8 p2, p2, 0x18

    .line 72
    .line 73
    int-to-byte p2, p2

    .line 74
    const/4 v6, 0x4

    .line 75
    new-array v6, v6, [B

    .line 76
    .line 77
    aput-byte p1, v6, v5

    .line 78
    .line 79
    aput-byte v0, v6, v7

    .line 80
    .line 81
    aput-byte v2, v6, v1

    .line 82
    .line 83
    const/4 p1, 0x3

    .line 84
    aput-byte p2, v6, p1

    .line 85
    .line 86
    :goto_2
    if-ge v5, v3, :cond_2

    .line 87
    .line 88
    aget-byte p1, v4, v5

    .line 89
    .line 90
    rem-int/lit8 p2, v5, 0x4

    .line 91
    .line 92
    aget-byte p2, v6, p2

    .line 93
    .line 94
    xor-int/2addr p1, p2

    .line 95
    int-to-byte p1, p1

    .line 96
    aput-byte p1, v4, v5

    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    return-object v4
.end method

.method public final f()[B
    .locals 5

    .line 1
    iget-object v0, p0, Lw2/a;->a:[B

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/16 v3, 0x3e8

    .line 8
    .line 9
    div-long/2addr v1, v3

    .line 10
    long-to-int v1, v1

    .line 11
    invoke-virtual {p0, v0, v1}, Lw2/a;->e([BI)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lw2/a;->f:[B

    .line 2
    .line 3
    invoke-static {v0}, Lv2/a;->k([B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw2/a;->f:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lw2/a;->f()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lw2/a;->f:[B

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lw2/a;->n:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    new-array v1, v0, [B

    .line 18
    .line 19
    :try_start_0
    iget-object v2, p0, Lw2/a;->f:[B

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lw2/a;->l:[B

    .line 27
    .line 28
    invoke-static {v0, v1}, Lv2/a;->f([B[B)[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lw2/a;->l:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    :catch_0
    :cond_1
    iget-object v0, p0, Lw2/a;->f:[B

    .line 35
    .line 36
    iget v1, p0, Lw2/a;->j:I

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1}, Lw2/a;->e([BI)[B

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lw2/a;->g:[B

    .line 43
    .line 44
    invoke-virtual {p0}, Lw2/a;->b()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lw2/a;->h:[B

    .line 49
    .line 50
    return-void
.end method

.method public j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lw2/a;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public k(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw2/a;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lv2/a;->j(Ljava/lang/String;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lw2/a;->f:[B

    .line 6
    .line 7
    return-void
.end method

.method public m()[B
    .locals 2

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/aj;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/umeng/analytics/pro/aj;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw2/a;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->E(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lw2/a;->e:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->J(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lw2/a;->f:[B

    .line 17
    .line 18
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->M(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;

    .line 23
    .line 24
    .line 25
    iget v1, p0, Lw2/a;->i:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->D(I)Lcom/umeng/analytics/pro/aj;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lw2/a;->j:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->I(I)Lcom/umeng/analytics/pro/aj;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lw2/a;->k:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->L(I)Lcom/umeng/analytics/pro/aj;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lw2/a;->l:[B

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->G([B)Lcom/umeng/analytics/pro/aj;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lw2/a;->n:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->O(I)Lcom/umeng/analytics/pro/aj;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lw2/a;->g:[B

    .line 51
    .line 52
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->P(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lw2/a;->h:[B

    .line 60
    .line 61
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/aj;->R(Ljava/lang/String;)Lcom/umeng/analytics/pro/aj;

    .line 66
    .line 67
    .line 68
    :try_start_0
    new-instance v1, Lcom/umeng/analytics/pro/b;

    .line 69
    .line 70
    invoke-direct {v1}, Lcom/umeng/analytics/pro/b;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lcom/umeng/analytics/pro/b;->a(Lcom/umeng/analytics/pro/aq;)[B

    .line 74
    .line 75
    .line 76
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    return-object v0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw2/a;->d:Ljava/lang/String;

    .line 7
    .line 8
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "version : %s\n"

    .line 13
    .line 14
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lw2/a;->e:Ljava/lang/String;

    .line 22
    .line 23
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "address : %s\n"

    .line 28
    .line 29
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lw2/a;->f:[B

    .line 37
    .line 38
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "signature : %s\n"

    .line 47
    .line 48
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lw2/a;->i:I

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "serial : %s\n"

    .line 66
    .line 67
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget v1, p0, Lw2/a;->j:I

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "timestamp : %d\n"

    .line 85
    .line 86
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget v1, p0, Lw2/a;->k:I

    .line 94
    .line 95
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v2, "length : %d\n"

    .line 104
    .line 105
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lw2/a;->g:[B

    .line 113
    .line 114
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v2, "guid : %s\n"

    .line 123
    .line 124
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lw2/a;->h:[B

    .line 132
    .line 133
    invoke-static {v1}, Lv2/a;->k([B)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v2, "checksum : %s "

    .line 142
    .line 143
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-boolean v1, p0, Lw2/a;->n:Z

    .line 151
    .line 152
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    const-string v2, "codex : %d"

    .line 161
    .line 162
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0
.end method
