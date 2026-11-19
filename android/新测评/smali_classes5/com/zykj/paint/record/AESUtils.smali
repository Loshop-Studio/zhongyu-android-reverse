# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/record/AESUtils;
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

.method public static Decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/io/File;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lcom/zykj/paint/record/AudioFileUtils;->getTempFileAbsolutePath(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    long-to-int v1, v1

    .line 24
    new-array v1, v1, [B

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    .line 29
    .line 30
    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    .line 31
    .line 32
    .line 33
    :try_start_1
    invoke-virtual {v4, v1}, Ljava/io/FileInputStream;->read([B)I

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/paint/record/AESUtils;->decryptVoice(Ljava/lang/String;[B)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v0, Ljava/io/FileOutputStream;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 43
    .line 44
    .line 45
    :try_start_2
    invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    goto :goto_7

    .line 50
    :catch_0
    move-exception p1

    .line 51
    :goto_0
    move-object v3, v4

    .line 52
    goto :goto_3

    .line 53
    :catch_1
    move-exception p1

    .line 54
    :goto_1
    move-object v3, v4

    .line 55
    goto :goto_5

    .line 56
    :catch_2
    move-exception p1

    .line 57
    :goto_2
    move-object v3, v4

    .line 58
    goto :goto_6

    .line 59
    :catch_3
    move-exception p1

    .line 60
    move-object v0, v3

    .line 61
    goto :goto_0

    .line 62
    :catch_4
    move-exception p1

    .line 63
    move-object v0, v3

    .line 64
    goto :goto_1

    .line 65
    :catch_5
    move-exception p1

    .line 66
    move-object v0, v3

    .line 67
    goto :goto_2

    .line 68
    :catch_6
    move-exception p1

    .line 69
    move-object v0, v3

    .line 70
    goto :goto_3

    .line 71
    :catch_7
    move-exception p1

    .line 72
    move-object v0, v3

    .line 73
    goto :goto_5

    .line 74
    :catch_8
    move-exception p1

    .line 75
    move-object v0, v3

    .line 76
    goto :goto_6

    .line 77
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 78
    .line 79
    .line 80
    :goto_4
    move-object v4, v3

    .line 81
    goto :goto_7

    .line 82
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :goto_7
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_9

    .line 94
    .line 95
    .line 96
    goto :goto_8

    .line 97
    :catch_9
    move-exception p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 99
    .line 100
    .line 101
    :goto_8
    const-string p1, "\u89e3\u5bc6 - AES"

    .line 102
    .line 103
    if-eqz v2, :cond_0

    .line 104
    .line 105
    const-string v0, "\u89e3\u5bc6\u6210\u529f"

    .line 106
    .line 107
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_0
    const-string p0, "\u89e3\u5bc6\u5931\u8d25"

    .line 116
    .line 117
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    const-string p0, ""

    .line 121
    .line 122
    return-object p0
.end method

.method public static Encrypt(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/io/FileInputStream;

    .line 8
    .line 9
    invoke-direct {p0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    .line 11
    .line 12
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    long-to-int v2, v2

    .line 17
    new-array v2, v2, [B

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Ljava/io/FileInputStream;->read([B)I

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v2}, Lcom/zykj/paint/record/AESUtils;->encryptVoice(Ljava/lang/String;[B)[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v2, Ljava/io/FileOutputStream;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 29
    .line 30
    .line 31
    :try_start_2
    invoke-virtual {v2, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    .line 33
    .line 34
    :try_start_3
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_7

    .line 41
    .line 42
    :catch_0
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 44
    .line 45
    .line 46
    goto :goto_7

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    :goto_0
    move-object v0, p0

    .line 49
    goto :goto_8

    .line 50
    :catch_1
    move-exception p1

    .line 51
    :goto_1
    move-object v0, p0

    .line 52
    goto :goto_4

    .line 53
    :catch_2
    move-exception p1

    .line 54
    :goto_2
    move-object v0, p0

    .line 55
    goto :goto_5

    .line 56
    :catch_3
    move-exception p1

    .line 57
    :goto_3
    move-object v0, p0

    .line 58
    goto :goto_6

    .line 59
    :catchall_1
    move-exception p1

    .line 60
    move-object v2, v0

    .line 61
    goto :goto_0

    .line 62
    :catch_4
    move-exception p1

    .line 63
    move-object v2, v0

    .line 64
    goto :goto_1

    .line 65
    :catch_5
    move-exception p1

    .line 66
    move-object v2, v0

    .line 67
    goto :goto_2

    .line 68
    :catch_6
    move-exception p1

    .line 69
    move-object v2, v0

    .line 70
    goto :goto_3

    .line 71
    :catchall_2
    move-exception p1

    .line 72
    move-object v2, v0

    .line 73
    goto :goto_8

    .line 74
    :catch_7
    move-exception p1

    .line 75
    move-object v2, v0

    .line 76
    goto :goto_4

    .line 77
    :catch_8
    move-exception p1

    .line 78
    move-object v2, v0

    .line 79
    goto :goto_5

    .line 80
    :catch_9
    move-exception p1

    .line 81
    move-object v2, v0

    .line 82
    goto :goto_6

    .line 83
    :goto_4
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 84
    .line 85
    .line 86
    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 90
    .line 91
    .line 92
    goto :goto_7

    .line 93
    :catchall_3
    move-exception p1

    .line 94
    goto :goto_8

    .line 95
    :goto_5
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 96
    .line 97
    .line 98
    :try_start_7
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_7

    .line 105
    :goto_6
    :try_start_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 106
    .line 107
    .line 108
    :try_start_9
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0

    .line 112
    .line 113
    .line 114
    :goto_7
    return-void

    .line 115
    :goto_8
    :try_start_a
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_a

    .line 119
    .line 120
    .line 121
    goto :goto_9

    .line 122
    :catch_a
    move-exception p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 124
    .line 125
    .line 126
    :goto_9
    throw p1
.end method

.method private static decrypt([B[B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 2
    .line 3
    const-string v1, "AES"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljavax/crypto/Cipher;->getBlockSize()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-array v2, v2, [B

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    invoke-virtual {p0, v2, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method private static decryptVoice(Ljava/lang/String;[B)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/zykj/paint/record/AESUtils;->getRawKey([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0, p1}, Lcom/zykj/paint/record/AESUtils;->decrypt([B[B)[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static encrypt([B[B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 2
    .line 3
    const-string v1, "AES"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljavax/crypto/Cipher;->getBlockSize()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-array v2, v2, [B

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {p0, v2, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method private static encryptVoice(Ljava/lang/String;[B)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/zykj/paint/record/AESUtils;->getRawKey([B)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0, p1}, Lcom/zykj/paint/record/AESUtils;->encrypt([B[B)[B

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static getRawKey([B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const-string v0, "AES"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "SHA1PRNG"

    .line 8
    .line 9
    const-string v2, "Crypto"

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/security/SecureRandom;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/SecureRandom;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p0}, Ljava/security/SecureRandom;->setSeed([B)V

    .line 16
    .line 17
    .line 18
    const/16 p0, 0x80

    .line 19
    .line 20
    invoke-virtual {v0, p0, v1}, Ljavax/crypto/KeyGenerator;->init(ILjava/security/SecureRandom;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
