.class public final Lk2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk2/q;

.field public static volatile b:I

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk2/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lk2/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk2/q;->a:Lk2/q;

    .line 7
    .line 8
    const/16 v0, 0x15

    .line 9
    .line 10
    sput v0, Lk2/q;->b:I

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    sput v0, Lk2/q;->c:I

    .line 15
    .line 16
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
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "filename"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxe/b;

    .line 7
    .line 8
    invoke-direct {v0}, Lxe/b;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/io/File;

    .line 12
    .line 13
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "/"

    .line 30
    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, ".jpg"

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Ljava/io/FileOutputStream;

    .line 50
    .line 51
    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 52
    .line 53
    .line 54
    const/16 v3, 0x2710

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    :try_start_0
    invoke-virtual {v0, v3}, Lwe/a;->o(I)V

    .line 58
    .line 59
    .line 60
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->k()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget v5, Lk2/q;->b:I

    .line 71
    .line 72
    invoke-virtual {v0, v3, v5}, Lwe/a;->f(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    const-string v3, "tester"

    .line 76
    .line 77
    const-string v5, "testing"

    .line 78
    .line 79
    invoke-virtual {v0, v3, v5}, Lxe/b;->l0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lxe/a;->C()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {v3}, Lxe/c;->a(I)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_1

    .line 91
    .line 92
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_0

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 108
    .line 109
    .line 110
    :catch_0
    :cond_0
    return-object v4

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_2

    .line 113
    :catch_1
    move-exception p1

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    const/4 v3, 0x2

    .line 116
    :try_start_2
    invoke-virtual {v0, v3}, Lxe/b;->q0(I)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lxe/b;->a0()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p1, v2}, Lxe/b;->p0(Ljava/lang/String;Ljava/io/OutputStream;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_2

    .line 133
    .line 134
    :try_start_3
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 138
    .line 139
    .line 140
    :catch_2
    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    goto :goto_1

    .line 145
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_3

    .line 156
    .line 157
    :try_start_5
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 161
    .line 162
    .line 163
    :catch_3
    :cond_3
    :goto_1
    return-object v4

    .line 164
    :goto_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_4

    .line 172
    .line 173
    :try_start_6
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 177
    .line 178
    .line 179
    :catch_4
    :cond_4
    throw p1
.end method

.method public final b(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-gt v1, v0, :cond_0

    .line 9
    .line 10
    const/high16 v1, 0x10000

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/16 p1, 0x15

    .line 24
    .line 25
    :goto_1
    sput p1, Lk2/q;->b:I

    .line 26
    .line 27
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/io/InputStream;)Z
    .locals 4

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxe/b;

    .line 7
    .line 8
    invoke-direct {v0}, Lxe/b;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2710

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    invoke-virtual {v0, v1}, Lwe/a;->o(I)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->k()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget v3, Lk2/q;->b:I

    .line 28
    .line 29
    invoke-virtual {v0, v1, v3}, Lwe/a;->f(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    const-string v1, "tester"

    .line 33
    .line 34
    const-string v3, "testing"

    .line 35
    .line 36
    invoke-virtual {v0, v1, v3}, Lxe/b;->l0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lxe/a;->C()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Lxe/c;->a(I)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    :try_start_1
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    :catch_0
    :cond_0
    return v2

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_2

    .line 70
    :catch_1
    move-exception p1

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    const/4 v1, 0x2

    .line 73
    :try_start_2
    invoke-virtual {v0, v1}, Lxe/b;->q0(I)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lxe/b;->a0()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1, p2}, Lxe/b;->r0(Ljava/lang/String;Ljava/io/InputStream;)Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    :try_start_3
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 95
    .line 96
    .line 97
    :catch_2
    :cond_2
    const/4 v2, 0x1

    .line 98
    goto :goto_1

    .line 99
    :goto_0
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    :try_start_5
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 115
    .line 116
    .line 117
    :catch_3
    :cond_3
    :goto_1
    return v2

    .line 118
    :goto_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Lwe/a;->n()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_4

    .line 126
    .line 127
    :try_start_6
    invoke-virtual {v0}, Lxe/b;->m0()Z

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Lxe/b;->g()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 131
    .line 132
    .line 133
    :catch_4
    :cond_4
    throw p1
.end method
