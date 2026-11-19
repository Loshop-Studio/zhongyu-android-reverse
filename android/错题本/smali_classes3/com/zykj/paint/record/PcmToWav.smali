# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/record/PcmToWav;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static clearFiles(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public static makePCMFileToWAVFile(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 8

    .line 1
    const-string v0, "PcmToWav"

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    long-to-int p0, v3

    .line 21
    new-instance v3, Lcom/zykj/paint/record/WaveHeader;

    .line 22
    .line 23
    invoke-direct {v3}, Lcom/zykj/paint/record/WaveHeader;-><init>()V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v4, p0, 0x24

    .line 27
    .line 28
    iput v4, v3, Lcom/zykj/paint/record/WaveHeader;->fileLength:I

    .line 29
    .line 30
    const/16 v4, 0x10

    .line 31
    .line 32
    iput v4, v3, Lcom/zykj/paint/record/WaveHeader;->FmtHdrLeth:I

    .line 33
    .line 34
    iput-short v4, v3, Lcom/zykj/paint/record/WaveHeader;->BitsPerSample:S

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    iput-short v5, v3, Lcom/zykj/paint/record/WaveHeader;->Channels:S

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    iput-short v6, v3, Lcom/zykj/paint/record/WaveHeader;->FormatTag:S

    .line 41
    .line 42
    const/16 v7, 0x1f40

    .line 43
    .line 44
    iput v7, v3, Lcom/zykj/paint/record/WaveHeader;->SamplesPerSec:I

    .line 45
    .line 46
    mul-int/2addr v5, v4

    .line 47
    div-int/lit8 v5, v5, 0x8

    .line 48
    .line 49
    int-to-short v4, v5

    .line 50
    iput-short v4, v3, Lcom/zykj/paint/record/WaveHeader;->BlockAlign:S

    .line 51
    .line 52
    mul-int/2addr v4, v7

    .line 53
    iput v4, v3, Lcom/zykj/paint/record/WaveHeader;->AvgBytesPerSec:I

    .line 54
    .line 55
    iput p0, v3, Lcom/zykj/paint/record/WaveHeader;->DataHdrLeth:I

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v3}, Lcom/zykj/paint/record/WaveHeader;->getHeader()[B

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 61
    array-length v3, p0

    .line 62
    const/16 v4, 0x2c

    .line 63
    .line 64
    if-eq v3, v4, :cond_1

    .line 65
    .line 66
    return v2

    .line 67
    :cond_1
    new-instance v3, Ljava/io/File;

    .line 68
    .line 69
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 79
    .line 80
    .line 81
    :cond_2
    const/16 v3, 0x1000

    .line 82
    .line 83
    :try_start_1
    new-array v3, v3, [B

    .line 84
    .line 85
    new-instance v4, Ljava/io/BufferedOutputStream;

    .line 86
    .line 87
    new-instance v5, Ljava/io/FileOutputStream;

    .line 88
    .line 89
    invoke-direct {v5, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v4, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 93
    .line 94
    .line 95
    array-length p1, p0

    .line 96
    invoke-virtual {v4, p0, v2, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 97
    .line 98
    .line 99
    new-instance p0, Ljava/io/BufferedInputStream;

    .line 100
    .line 101
    new-instance p1, Ljava/io/FileInputStream;

    .line 102
    .line 103
    invoke-direct {p1, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    :goto_0
    const/4 v5, -0x1

    .line 114
    if-eq p1, v5, :cond_3

    .line 115
    .line 116
    invoke-virtual {v4, v3}, Ljava/io/OutputStream;->write([B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    goto :goto_0

    .line 124
    :catch_0
    move-exception p0

    .line 125
    goto :goto_1

    .line 126
    :catch_1
    move-exception p0

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 132
    .line 133
    .line 134
    if-eqz p2, :cond_4

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 137
    .line 138
    .line 139
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string p1, "makePCMFileToWAVFile  success!"

    .line 142
    .line 143
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 147
    .line 148
    const-string p2, "yyyy-MM-dd hh:mm"

    .line 149
    .line 150
    invoke-direct {p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance p2, Ljava/util/Date;

    .line 154
    .line 155
    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    return v6

    .line 173
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    return v2

    .line 181
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    return v2

    .line 189
    :catch_2
    move-exception p0

    .line 190
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    return v2
.end method

.method public static mergePCMFilesToWAVFile(Ljava/util/List;Ljava/lang/String;Z)Z
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "PcmToWav"

    .line 4
    .line 5
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    new-array v2, v2, [Ljava/io/File;

    .line 10
    .line 11
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    move v6, v5

    .line 18
    :goto_0
    if-ge v5, v3, :cond_0

    .line 19
    .line 20
    new-instance v7, Ljava/io/File;

    .line 21
    .line 22
    move-object/from16 v8, p0

    .line 23
    .line 24
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    check-cast v9, Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {v7, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    aput-object v7, v2, v5

    .line 34
    .line 35
    int-to-long v9, v6

    .line 36
    invoke-virtual {v7}, Ljava/io/File;->length()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    add-long/2addr v6, v9

    .line 41
    long-to-int v6, v6

    .line 42
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object/from16 v8, p0

    .line 46
    .line 47
    add-int/lit8 v5, v6, -0x2c

    .line 48
    .line 49
    int-to-long v9, v5

    .line 50
    add-int/lit8 v6, v6, -0x8

    .line 51
    .line 52
    int-to-long v11, v6

    .line 53
    const/16 v5, 0x10

    .line 54
    .line 55
    int-to-long v6, v5

    .line 56
    const-wide/16 v13, 0x3e80

    .line 57
    .line 58
    mul-long/2addr v6, v13

    .line 59
    const/4 v15, 0x1

    .line 60
    move-wide/from16 v16, v6

    .line 61
    .line 62
    int-to-long v5, v15

    .line 63
    mul-long v6, v16, v5

    .line 64
    .line 65
    const-wide/16 v16, 0x8

    .line 66
    .line 67
    div-long v16, v6, v16

    .line 68
    .line 69
    const/16 v18, 0x10

    .line 70
    .line 71
    invoke-static/range {v9 .. v18}, Lcom/zykj/paint/record/PcmToWav;->wavFileHeader(JJJIJB)[B

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    array-length v6, v5

    .line 76
    const/16 v7, 0x2c

    .line 77
    .line 78
    if-eq v6, v7, :cond_1

    .line 79
    .line 80
    return v4

    .line 81
    :cond_1
    new-instance v6, Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_2

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 93
    .line 94
    .line 95
    :cond_2
    const/16 v6, 0x1000

    .line 96
    .line 97
    :try_start_0
    new-array v6, v6, [B

    .line 98
    .line 99
    new-instance v7, Ljava/io/BufferedOutputStream;

    .line 100
    .line 101
    new-instance v9, Ljava/io/FileOutputStream;

    .line 102
    .line 103
    invoke-direct {v9, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v7, v9}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 107
    .line 108
    .line 109
    array-length v0, v5

    .line 110
    invoke-virtual {v7, v5, v4, v0}, Ljava/io/OutputStream;->write([BII)V

    .line 111
    .line 112
    .line 113
    move v0, v4

    .line 114
    :goto_1
    if-ge v0, v3, :cond_4

    .line 115
    .line 116
    new-instance v5, Ljava/io/BufferedInputStream;

    .line 117
    .line 118
    new-instance v9, Ljava/io/FileInputStream;

    .line 119
    .line 120
    aget-object v10, v2, v0

    .line 121
    .line 122
    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v5, v9}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    :goto_2
    const/4 v10, -0x1

    .line 133
    if-eq v9, v10, :cond_3

    .line 134
    .line 135
    invoke-virtual {v7, v6}, Ljava/io/OutputStream;->write([B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v6}, Ljava/io/InputStream;->read([B)I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    goto :goto_2

    .line 143
    :catch_0
    move-exception v0

    .line 144
    goto :goto_3

    .line 145
    :catch_1
    move-exception v0

    .line 146
    goto :goto_4

    .line 147
    :cond_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V

    .line 148
    .line 149
    .line 150
    add-int/lit8 v0, v0, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .line 155
    .line 156
    if-nez p2, :cond_5

    .line 157
    .line 158
    invoke-static {v8}, Lcom/zykj/paint/record/PcmToWav;->clearFiles(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v2, "mergePCMFilesToWAVFile  success!"

    .line 164
    .line 165
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 169
    .line 170
    const-string v3, "yyyy-MM-dd hh:mm"

    .line 171
    .line 172
    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance v3, Ljava/util/Date;

    .line 176
    .line 177
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    const/4 v0, 0x1

    .line 195
    return v0

    .line 196
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    .line 202
    .line 203
    return v4

    .line 204
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    return v4
.end method

.method private static wavFileHeader(JJJIJB)[B
    .locals 22

    .line 1
    move/from16 v0, p6

    .line 2
    .line 3
    const-wide/16 v1, 0xff

    .line 4
    .line 5
    and-long v3, p2, v1

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    int-to-byte v3, v3

    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    shr-long v5, p2, v4

    .line 12
    .line 13
    and-long/2addr v5, v1

    .line 14
    long-to-int v5, v5

    .line 15
    int-to-byte v5, v5

    .line 16
    const/16 v6, 0x10

    .line 17
    .line 18
    shr-long v7, p2, v6

    .line 19
    .line 20
    and-long/2addr v7, v1

    .line 21
    long-to-int v7, v7

    .line 22
    int-to-byte v7, v7

    .line 23
    const/16 v8, 0x18

    .line 24
    .line 25
    shr-long v9, p2, v8

    .line 26
    .line 27
    and-long/2addr v9, v1

    .line 28
    long-to-int v9, v9

    .line 29
    int-to-byte v9, v9

    .line 30
    int-to-byte v10, v0

    .line 31
    and-long v11, p4, v1

    .line 32
    .line 33
    long-to-int v11, v11

    .line 34
    int-to-byte v11, v11

    .line 35
    shr-long v12, p4, v4

    .line 36
    .line 37
    and-long/2addr v12, v1

    .line 38
    long-to-int v12, v12

    .line 39
    int-to-byte v12, v12

    .line 40
    shr-long v13, p4, v6

    .line 41
    .line 42
    and-long/2addr v13, v1

    .line 43
    long-to-int v13, v13

    .line 44
    int-to-byte v13, v13

    .line 45
    shr-long v14, p4, v8

    .line 46
    .line 47
    and-long/2addr v14, v1

    .line 48
    long-to-int v14, v14

    .line 49
    int-to-byte v14, v14

    .line 50
    move-wide v15, v1

    .line 51
    and-long v1, p7, v15

    .line 52
    .line 53
    long-to-int v1, v1

    .line 54
    int-to-byte v1, v1

    .line 55
    shr-long v17, p7, v4

    .line 56
    .line 57
    move v2, v4

    .line 58
    move/from16 v19, v5

    .line 59
    .line 60
    and-long v4, v17, v15

    .line 61
    .line 62
    long-to-int v4, v4

    .line 63
    int-to-byte v4, v4

    .line 64
    shr-long v17, p7, v6

    .line 65
    .line 66
    move/from16 p2, v2

    .line 67
    .line 68
    move v5, v3

    .line 69
    and-long v2, v17, v15

    .line 70
    .line 71
    long-to-int v2, v2

    .line 72
    int-to-byte v2, v2

    .line 73
    shr-long v17, p7, v8

    .line 74
    .line 75
    move v3, v6

    .line 76
    move/from16 v20, v7

    .line 77
    .line 78
    and-long v6, v17, v15

    .line 79
    .line 80
    long-to-int v6, v6

    .line 81
    int-to-byte v6, v6

    .line 82
    div-int/lit8 v7, p9, 0x8

    .line 83
    .line 84
    mul-int/2addr v7, v0

    .line 85
    int-to-byte v0, v7

    .line 86
    move/from16 p3, v3

    .line 87
    .line 88
    move v7, v4

    .line 89
    and-long v3, p0, v15

    .line 90
    .line 91
    long-to-int v3, v3

    .line 92
    int-to-byte v3, v3

    .line 93
    shr-long v17, p0, p2

    .line 94
    .line 95
    move v4, v8

    .line 96
    move/from16 v21, v9

    .line 97
    .line 98
    and-long v8, v17, v15

    .line 99
    .line 100
    long-to-int v8, v8

    .line 101
    int-to-byte v8, v8

    .line 102
    shr-long v17, p0, p3

    .line 103
    .line 104
    move/from16 p5, v4

    .line 105
    .line 106
    move/from16 p4, v5

    .line 107
    .line 108
    and-long v4, v17, v15

    .line 109
    .line 110
    long-to-int v4, v4

    .line 111
    int-to-byte v4, v4

    .line 112
    shr-long v17, p0, p5

    .line 113
    .line 114
    move v9, v0

    .line 115
    move v5, v1

    .line 116
    and-long v0, v17, v15

    .line 117
    .line 118
    long-to-int v0, v0

    .line 119
    int-to-byte v0, v0

    .line 120
    const/16 v1, 0x2c

    .line 121
    .line 122
    new-array v1, v1, [B

    .line 123
    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x52

    .line 126
    .line 127
    aput-byte v16, v1, v15

    .line 128
    .line 129
    const/16 v16, 0x1

    .line 130
    .line 131
    const/16 v17, 0x49

    .line 132
    .line 133
    aput-byte v17, v1, v16

    .line 134
    .line 135
    const/16 v17, 0x2

    .line 136
    .line 137
    const/16 v18, 0x46

    .line 138
    .line 139
    aput-byte v18, v1, v17

    .line 140
    .line 141
    const/16 v17, 0x3

    .line 142
    .line 143
    aput-byte v18, v1, v17

    .line 144
    .line 145
    const/16 v17, 0x4

    .line 146
    .line 147
    aput-byte p4, v1, v17

    .line 148
    .line 149
    const/16 v17, 0x5

    .line 150
    .line 151
    aput-byte v19, v1, v17

    .line 152
    .line 153
    const/16 v17, 0x6

    .line 154
    .line 155
    aput-byte v20, v1, v17

    .line 156
    .line 157
    const/16 v17, 0x7

    .line 158
    .line 159
    aput-byte v21, v1, v17

    .line 160
    .line 161
    const/16 v17, 0x57

    .line 162
    .line 163
    aput-byte v17, v1, p2

    .line 164
    .line 165
    const/16 v17, 0x41

    .line 166
    .line 167
    const/16 v18, 0x9

    .line 168
    .line 169
    aput-byte v17, v1, v18

    .line 170
    .line 171
    const/16 v17, 0x56

    .line 172
    .line 173
    const/16 v18, 0xa

    .line 174
    .line 175
    aput-byte v17, v1, v18

    .line 176
    .line 177
    const/16 v17, 0x45

    .line 178
    .line 179
    const/16 v18, 0xb

    .line 180
    .line 181
    aput-byte v17, v1, v18

    .line 182
    .line 183
    const/16 v17, 0x66

    .line 184
    .line 185
    const/16 v18, 0xc

    .line 186
    .line 187
    aput-byte v17, v1, v18

    .line 188
    .line 189
    const/16 v17, 0x6d

    .line 190
    .line 191
    const/16 v18, 0xd

    .line 192
    .line 193
    aput-byte v17, v1, v18

    .line 194
    .line 195
    const/16 v17, 0xe

    .line 196
    .line 197
    const/16 v18, 0x74

    .line 198
    .line 199
    aput-byte v18, v1, v17

    .line 200
    .line 201
    const/16 v17, 0xf

    .line 202
    .line 203
    const/16 v19, 0x20

    .line 204
    .line 205
    aput-byte v19, v1, v17

    .line 206
    .line 207
    aput-byte p3, v1, p3

    .line 208
    .line 209
    const/16 v17, 0x11

    .line 210
    .line 211
    aput-byte v15, v1, v17

    .line 212
    .line 213
    const/16 v17, 0x12

    .line 214
    .line 215
    aput-byte v15, v1, v17

    .line 216
    .line 217
    const/16 v17, 0x13

    .line 218
    .line 219
    aput-byte v15, v1, v17

    .line 220
    .line 221
    const/16 v17, 0x14

    .line 222
    .line 223
    aput-byte v16, v1, v17

    .line 224
    .line 225
    const/16 v16, 0x15

    .line 226
    .line 227
    aput-byte v15, v1, v16

    .line 228
    .line 229
    const/16 v16, 0x16

    .line 230
    .line 231
    aput-byte v10, v1, v16

    .line 232
    .line 233
    const/16 v10, 0x17

    .line 234
    .line 235
    aput-byte v15, v1, v10

    .line 236
    .line 237
    aput-byte v11, v1, p5

    .line 238
    .line 239
    const/16 v10, 0x19

    .line 240
    .line 241
    aput-byte v12, v1, v10

    .line 242
    .line 243
    const/16 v10, 0x1a

    .line 244
    .line 245
    aput-byte v13, v1, v10

    .line 246
    .line 247
    const/16 v10, 0x1b

    .line 248
    .line 249
    aput-byte v14, v1, v10

    .line 250
    .line 251
    const/16 v10, 0x1c

    .line 252
    .line 253
    aput-byte v5, v1, v10

    .line 254
    .line 255
    const/16 v5, 0x1d

    .line 256
    .line 257
    aput-byte v7, v1, v5

    .line 258
    .line 259
    const/16 v5, 0x1e

    .line 260
    .line 261
    aput-byte v2, v1, v5

    .line 262
    .line 263
    const/16 v2, 0x1f

    .line 264
    .line 265
    aput-byte v6, v1, v2

    .line 266
    .line 267
    aput-byte v9, v1, v19

    .line 268
    .line 269
    const/16 v2, 0x21

    .line 270
    .line 271
    aput-byte v15, v1, v2

    .line 272
    .line 273
    const/16 v2, 0x22

    .line 274
    .line 275
    aput-byte p9, v1, v2

    .line 276
    .line 277
    const/16 v2, 0x23

    .line 278
    .line 279
    aput-byte v15, v1, v2

    .line 280
    .line 281
    const/16 v2, 0x64

    .line 282
    .line 283
    const/16 v5, 0x24

    .line 284
    .line 285
    aput-byte v2, v1, v5

    .line 286
    .line 287
    const/16 v2, 0x25

    .line 288
    .line 289
    const/16 v5, 0x61

    .line 290
    .line 291
    aput-byte v5, v1, v2

    .line 292
    .line 293
    const/16 v2, 0x26

    .line 294
    .line 295
    aput-byte v18, v1, v2

    .line 296
    .line 297
    const/16 v2, 0x27

    .line 298
    .line 299
    aput-byte v5, v1, v2

    .line 300
    .line 301
    const/16 v2, 0x28

    .line 302
    .line 303
    aput-byte v3, v1, v2

    .line 304
    .line 305
    const/16 v2, 0x29

    .line 306
    .line 307
    aput-byte v8, v1, v2

    .line 308
    .line 309
    const/16 v2, 0x2a

    .line 310
    .line 311
    aput-byte v4, v1, v2

    .line 312
    .line 313
    const/16 v2, 0x2b

    .line 314
    .line 315
    aput-byte v0, v1, v2

    .line 316
    .line 317
    return-object v1
.end method
