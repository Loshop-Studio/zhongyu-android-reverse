.class public abstract Ltv/cjump/jni/DeviceUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltv/cjump/jni/DeviceUtils$ARCH;
    }
.end annotation


# static fields
.field public static a:Ltv/cjump/jni/DeviceUtils$ARCH;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ltv/cjump/jni/DeviceUtils$ARCH;->a:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 2
    .line 3
    sput-object v0, Ltv/cjump/jni/DeviceUtils;->a:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 4
    .line 5
    return-void
.end method

.method public static declared-synchronized a()Ltv/cjump/jni/DeviceUtils$ARCH;
    .locals 6

    .line 1
    const-class v0, Ltv/cjump/jni/DeviceUtils;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/16 v1, 0x14

    .line 5
    .line 6
    :try_start_0
    new-array v1, v1, [B

    .line 7
    .line 8
    new-instance v2, Ljava/io/File;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v4, "lib/libc.so"

    .line 15
    .line 16
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    :try_start_1
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 27
    .line 28
    const-string v5, "r"

    .line 29
    .line 30
    invoke-direct {v4, v2, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 31
    .line 32
    .line 33
    :try_start_2
    invoke-virtual {v4, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 34
    .line 35
    .line 36
    const/16 v2, 0x13

    .line 37
    .line 38
    aget-byte v2, v1, v2

    .line 39
    .line 40
    const/16 v3, 0x8

    .line 41
    .line 42
    shl-int/2addr v2, v3

    .line 43
    const/16 v5, 0x12

    .line 44
    .line 45
    aget-byte v1, v1, v5

    .line 46
    .line 47
    or-int/2addr v1, v2

    .line 48
    const/4 v2, 0x3

    .line 49
    if-eq v1, v2, :cond_3

    .line 50
    .line 51
    if-eq v1, v3, :cond_2

    .line 52
    .line 53
    const/16 v2, 0x28

    .line 54
    .line 55
    if-eq v1, v2, :cond_1

    .line 56
    .line 57
    const/16 v2, 0xb7

    .line 58
    .line 59
    if-eq v1, v2, :cond_0

    .line 60
    .line 61
    const-string v2, "NativeBitmapFactory"

    .line 62
    .line 63
    new-instance v3, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v5, "libc.so is unknown arch: "

    .line 69
    .line 70
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v1

    .line 89
    move-object v3, v4

    .line 90
    goto :goto_3

    .line 91
    :catch_0
    move-exception v1

    .line 92
    move-object v3, v4

    .line 93
    goto :goto_1

    .line 94
    :catch_1
    move-exception v1

    .line 95
    move-object v3, v4

    .line 96
    goto :goto_2

    .line 97
    :cond_0
    sget-object v1, Ltv/cjump/jni/DeviceUtils$ARCH;->e:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 98
    .line 99
    sput-object v1, Ltv/cjump/jni/DeviceUtils;->a:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    sget-object v1, Ltv/cjump/jni/DeviceUtils$ARCH;->b:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 103
    .line 104
    sput-object v1, Ltv/cjump/jni/DeviceUtils;->a:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    sget-object v1, Ltv/cjump/jni/DeviceUtils$ARCH;->d:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 108
    .line 109
    sput-object v1, Ltv/cjump/jni/DeviceUtils;->a:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    sget-object v1, Ltv/cjump/jni/DeviceUtils$ARCH;->c:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 113
    .line 114
    sput-object v1, Ltv/cjump/jni/DeviceUtils;->a:Ltv/cjump/jni/DeviceUtils$ARCH;
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    :goto_0
    :try_start_3
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 117
    .line 118
    .line 119
    goto :goto_5

    .line 120
    :catchall_1
    move-exception v1

    .line 121
    goto :goto_6

    .line 122
    :catch_2
    move-exception v1

    .line 123
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :catchall_2
    move-exception v1

    .line 128
    goto :goto_3

    .line 129
    :catch_3
    move-exception v1

    .line 130
    goto :goto_1

    .line 131
    :catch_4
    move-exception v1

    .line 132
    goto :goto_2

    .line 133
    :goto_1
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 134
    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    :try_start_6
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :goto_2
    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 143
    .line 144
    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    :try_start_8
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :goto_3
    if-eqz v3, :cond_4

    .line 152
    .line 153
    :try_start_9
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :catch_5
    move-exception v2

    .line 158
    :try_start_a
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 159
    .line 160
    .line 161
    :cond_4
    :goto_4
    throw v1

    .line 162
    :cond_5
    :goto_5
    sget-object v1, Ltv/cjump/jni/DeviceUtils;->a:Ltv/cjump/jni/DeviceUtils$ARCH;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 163
    .line 164
    monitor-exit v0

    .line 165
    return-object v1

    .line 166
    :goto_6
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 167
    throw v1
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Landroid/os/Build;

    .line 3
    .line 4
    const-string v2, "CPU_ABI2"

    .line 5
    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, v1, Ljava/lang/String;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :catch_0
    return-object v0
.end method

.method public static d()Z
    .locals 3

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "MagicBox"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public static e()Z
    .locals 3

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "Xiaomi"

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "dredd"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public static f()Z
    .locals 1

    .line 1
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public static g()Z
    .locals 2

    .line 1
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->a()Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "armeabi-v7a"

    .line 6
    .line 7
    invoke-static {v1}, Ltv/cjump/jni/DeviceUtils;->i(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v1, "armeabi"

    .line 14
    .line 15
    invoke-static {v1}, Ltv/cjump/jni/DeviceUtils;->i(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    :cond_0
    sget-object v1, Ltv/cjump/jni/DeviceUtils$ARCH;->b:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public static h()Z
    .locals 2

    .line 1
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->a()Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "x86"

    .line 6
    .line 7
    invoke-static {v1}, Ltv/cjump/jni/DeviceUtils;->i(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Ltv/cjump/jni/DeviceUtils$ARCH;->c:Ltv/cjump/jni/DeviceUtils$ARCH;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return v2

    .line 19
    :cond_0
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->c()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    return v2

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    return p0
.end method
