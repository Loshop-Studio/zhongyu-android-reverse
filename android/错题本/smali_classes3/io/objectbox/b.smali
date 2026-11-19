.class public final Lio/objectbox/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:Ljava/io/File;

.field public c:Ljava/io/File;

.field public d:Ljava/lang/String;

.field public e:J

.field public f:Ljava/lang/Object;

.field public g:Z

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/32 v0, 0x100000

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lio/objectbox/b;->e:J

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/objectbox/b;->h:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lio/objectbox/b;->a:[B

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, "Model may not be null"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getApplicationContext"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    iput-object v0, p0, Lio/objectbox/b;->f:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/io/File;

    .line 21
    .line 22
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v3, "getFilesDir"

    .line 27
    .line 28
    invoke-virtual {v1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/io/File;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 41
    .line 42
    const-string v4, "getFilesDir() returned null - retrying once..."

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    move-object v3, p1

    .line 52
    check-cast v3, Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p1

    .line 56
    goto :goto_2

    .line 57
    :cond_0
    :goto_0
    if-eqz v3, :cond_5

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_4

    .line 64
    .line 65
    const-string p1, "objectbox"

    .line 66
    .line 67
    invoke-direct {v0, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 87
    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v2, "Could not init Android base dir at "

    .line 91
    .line 92
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    iput-object v0, p0, Lio/objectbox/b;->c:Ljava/io/File;

    .line 117
    .line 118
    const/4 p1, 0x1

    .line 119
    iput-boolean p1, p0, Lio/objectbox/b;->g:Z

    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 123
    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v2, "Android base dir is not a dir: "

    .line 127
    .line 128
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    const-string v0, "Android files dir does not exist"

    .line 149
    .line 150
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw p1

    .line 154
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    const-string v0, "Android files dir is null"

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :goto_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 163
    .line 164
    const-string v1, "Could not init with given Android context (must be sub class of android.content.Context)"

    .line 165
    .line 166
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :catch_1
    move-exception p1

    .line 171
    new-instance v0, Ljava/lang/RuntimeException;

    .line 172
    .line 173
    const-string v1, "context must be a valid Android Context"

    .line 174
    .line 175
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 180
    .line 181
    const-string v0, "Context may not be null"

    .line 182
    .line 183
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1
.end method

.method public final b()Lio/objectbox/BoxStore;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/b;->b:Ljava/io/File;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lio/objectbox/b;->d:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "objectbox"

    .line 11
    .line 12
    :goto_0
    iput-object v0, p0, Lio/objectbox/b;->d:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, Lio/objectbox/b;->c:Ljava/io/File;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance v2, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v2, Ljava/io/File;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_1
    iput-object v2, p0, Lio/objectbox/b;->b:Ljava/io/File;

    .line 30
    .line 31
    :cond_2
    new-instance v0, Lio/objectbox/BoxStore;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lio/objectbox/BoxStore;-><init>(Lio/objectbox/b;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final c(Ljava/lang/String;)[B
    .locals 7

    .line 1
    new-instance v0, Lcom/google/flatbuffers/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/flatbuffers/a;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lcom/google/flatbuffers/a;->l:Z

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/16 v2, 0xd

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lcom/google/flatbuffers/a;->l(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2, p1}, Lcom/google/flatbuffers/a;->b(II)V

    .line 20
    .line 21
    .line 22
    iget-wide v3, p0, Lio/objectbox/b;->e:J

    .line 23
    .line 24
    iget-boolean p1, v0, Lcom/google/flatbuffers/a;->l:Z

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    cmp-long p1, v3, v5

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    :cond_0
    const/16 p1, 0x8

    .line 35
    .line 36
    invoke-virtual {v0, p1, v2}, Lcom/google/flatbuffers/a;->h(II)V

    .line 37
    .line 38
    .line 39
    iget-object v5, v0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    iget v6, v0, Lcom/google/flatbuffers/a;->b:I

    .line 42
    .line 43
    sub-int/2addr v6, p1

    .line 44
    iput v6, v0, Lcom/google/flatbuffers/a;->b:I

    .line 45
    .line 46
    invoke-virtual {v5, v6, v3, v4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x2

    .line 50
    invoke-virtual {v0, p1}, Lcom/google/flatbuffers/a;->k(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    int-to-long v3, v2

    .line 54
    long-to-int p1, v3

    .line 55
    const/4 v3, 0x3

    .line 56
    invoke-virtual {v0, v3, p1}, Lcom/google/flatbuffers/a;->a(II)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    invoke-virtual {v0, v3, p1}, Lcom/google/flatbuffers/a;->a(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/google/flatbuffers/a;->f()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iget v4, v0, Lcom/google/flatbuffers/a;->c:I

    .line 68
    .line 69
    invoke-virtual {v0, v4, v3}, Lcom/google/flatbuffers/a;->h(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v3, v2}, Lcom/google/flatbuffers/a;->h(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/google/flatbuffers/a;->g()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    sub-int/2addr v2, p1

    .line 80
    add-int/2addr v2, v3

    .line 81
    invoke-virtual {v0, v2}, Lcom/google/flatbuffers/a;->i(I)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v0, Lcom/google/flatbuffers/a;->a:Ljava/nio/ByteBuffer;

    .line 85
    .line 86
    iget v2, v0, Lcom/google/flatbuffers/a;->b:I

    .line 87
    .line 88
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 89
    .line 90
    .line 91
    iput-boolean v1, v0, Lcom/google/flatbuffers/a;->g:Z

    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/google/flatbuffers/a;->j()[B

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1
.end method

.method public final d(Lio/objectbox/EntityInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/b;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
