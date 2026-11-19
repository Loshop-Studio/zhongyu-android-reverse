.class public Lcom/taobao/sophix/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 8

    .line 9
    const-string v0, "UTF-8"

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".decrypt"

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    invoke-static {v3, v4, v5}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 11
    :try_start_1
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    invoke-direct {v4, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 12
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "AES"

    invoke-direct {p2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 13
    const-string p1, "AES/CBC/PKCS7PADDING"

    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    const/4 v0, 0x2

    .line 14
    invoke-virtual {p1, v0, p2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 15
    new-instance p2, Ljava/io/FileInputStream;

    invoke-direct {p2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 16
    :try_start_2
    new-instance v0, Ljavax/crypto/CipherInputStream;

    invoke-direct {v0, p2, p1}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 17
    :try_start_3
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v4, 0x400

    .line 18
    :try_start_4
    new-array v4, v4, [B

    .line 19
    :goto_0
    invoke-virtual {v0, v4}, Ljavax/crypto/CipherInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    .line 20
    invoke-virtual {p1, v4, v1, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_1
    move-object v2, p2

    goto :goto_4

    :catch_0
    move-exception v4

    goto :goto_2

    .line 21
    :cond_0
    invoke-static {p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 22
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 23
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    const/4 v1, 0x1

    goto :goto_3

    :catchall_1
    move-exception p0

    move-object p1, v2

    goto :goto_1

    :catch_1
    move-exception v4

    move-object p1, v2

    goto :goto_2

    :catchall_2
    move-exception p0

    move-object p1, v2

    move-object v0, p1

    goto :goto_1

    :catch_2
    move-exception v4

    move-object p1, v2

    move-object v0, p1

    goto :goto_2

    :catchall_3
    move-exception p0

    move-object p1, v2

    move-object v0, p1

    goto :goto_4

    :catch_3
    move-exception v4

    move-object p1, v2

    move-object p2, p1

    move-object v0, p2

    goto :goto_2

    :catch_4
    move-exception v4

    move-object p1, v2

    move-object p2, p1

    move-object v0, p2

    move-object v3, v0

    .line 24
    :goto_2
    :try_start_5
    const-string v5, "DecryptUtils"

    const-string v6, "decryptByPair decrypt hotfix patch file error"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-static {v5, v6, v4, v7}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    if-eqz v3, :cond_1

    .line 25
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 26
    :cond_1
    invoke-static {p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 27
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 28
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    :goto_3
    if-eqz v1, :cond_2

    .line 29
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    return-object v3

    :cond_2
    return-object v2

    .line 30
    :goto_4
    invoke-static {v2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 31
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 32
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 33
    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 34
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    const/4 v1, 0x0

    .line 35
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".ldecrypt"

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 36
    :try_start_1
    const-string v3, "AES/ECB/PKCS5Padding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 37
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v5, "UTF-8"

    invoke-virtual {p1, v5}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const-string v5, "AES"

    invoke-direct {v4, p1, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 38
    new-instance p1, Ljava/security/SecureRandom;

    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    const/4 v5, 0x2

    invoke-virtual {v3, v5, v4, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V

    .line 39
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 40
    :try_start_2
    new-instance v4, Ljavax/crypto/CipherInputStream;

    invoke-direct {v4, p1, v3}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 41
    :try_start_3
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v1, 0x400

    .line 42
    :try_start_4
    new-array v1, v1, [B

    .line 43
    :goto_0
    invoke-virtual {v4, v1}, Ljavax/crypto/CipherInputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    .line 44
    invoke-virtual {v3, v1, p0, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception p0

    :goto_1
    move-object v1, p1

    goto :goto_6

    :catch_0
    move-exception v0

    :goto_2
    move-object v1, v2

    goto :goto_5

    .line 45
    :cond_0
    invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 46
    :goto_3
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 47
    invoke-static {v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 48
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    return p0

    :catchall_1
    move-exception p0

    move-object v3, v1

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v3, v1

    goto :goto_2

    :catchall_2
    move-exception p0

    move-object v3, v1

    move-object v4, v3

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v3, v1

    :goto_4
    move-object v4, v3

    goto :goto_2

    :catchall_3
    move-exception p0

    move-object v3, v1

    move-object v4, v3

    goto :goto_6

    :catch_3
    move-exception v0

    move-object p1, v1

    move-object v3, p1

    goto :goto_4

    :catch_4
    move-exception v0

    move-object p1, v1

    move-object v3, p1

    move-object v4, v3

    :goto_5
    if-eqz v1, :cond_1

    .line 49
    :try_start_5
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 50
    :cond_1
    const-string v1, "DecryptUtils"

    const-string v2, "aesDecrypt"

    new-array v5, p0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0, v5}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    .line 51
    :goto_6
    invoke-static {v1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 52
    invoke-static {v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 53
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 54
    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    invoke-static {p2, p3}, Lcom/taobao/sophix/e/a;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    .line 5
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 6
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/taobao/sophix/e/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 7
    invoke-static {p3, p2, p1}, Lcom/taobao/sophix/e/a;->a(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-static {p0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v3, "RSA"

    .line 9
    .line 10
    invoke-static {v3}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance v4, Ljava/security/spec/PKCS8EncodedKeySpec;

    .line 15
    .line 16
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v4, p1}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v3, "RSA/ECB/PKCS1Padding"

    .line 28
    .line 29
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3, v0, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    const-string p1, "decryptFileToken"

    .line 43
    .line 44
    new-array v3, v1, [Ljava/lang/Object;

    .line 45
    .line 46
    const-string v4, "DecryptUtils"

    .line 47
    .line 48
    invoke-static {v4, p1, p0, v3}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-object p0, v2

    .line 52
    :goto_0
    if-eqz p0, :cond_0

    .line 53
    .line 54
    :try_start_1
    new-instance p1, Ljava/lang/String;

    .line 55
    .line 56
    const-string v3, "utf-8"

    .line 57
    .line 58
    invoke-direct {p1, p0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "\\|"

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_0

    .line 68
    .line 69
    array-length p1, p0

    .line 70
    if-ne p1, v0, :cond_0

    .line 71
    .line 72
    aget-object p1, p0, v1

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    aget-object p0, p0, v0

    .line 76
    .line 77
    new-instance v0, Landroid/util/Pair;

    .line 78
    .line 79
    invoke-direct {v0, p1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :catch_1
    move-exception p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    .line 86
    .line 87
    :cond_0
    return-object v2
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 10

    .line 1
    const-string v0, "unZipSingleFile unZip hotfix patch file error"

    .line 2
    .line 3
    const-string v1, "DecryptUtils"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 8
    .line 9
    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 10
    .line 11
    .line 12
    :try_start_1
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    const-string p0, "unZipSingleFile file don\'t exist"

    .line 19
    .line 20
    new-array p1, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {v1, p0, p1}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 29
    .line 30
    .line 31
    return-object v3

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :catch_0
    move-exception p0

    .line 36
    move-object p1, v3

    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_0
    :try_start_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, "unzip"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p1, Ljava/io/File;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-nez v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 76
    .line 77
    .line 78
    :cond_1
    new-instance p1, Ljava/util/zip/ZipInputStream;

    .line 79
    .line 80
    new-instance v5, Ljava/io/FileInputStream;

    .line 81
    .line 82
    invoke-direct {v5, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p1, v5}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    .line 87
    .line 88
    :goto_0
    :try_start_3
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_5

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    const-string v7, "../"

    .line 99
    .line 100
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-nez v7, :cond_4

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_2

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    add-int/lit8 v5, v5, -0x1

    .line 117
    .line 118
    invoke-virtual {v6, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    new-instance v6, Ljava/io/File;

    .line 123
    .line 124
    new-instance v7, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    sget-object v8, Ljava/io/File;->separator:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :catchall_1
    move-exception p0

    .line 152
    move-object v3, p1

    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :catch_1
    move-exception p0

    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :cond_2
    new-instance v5, Ljava/io/File;

    .line 159
    .line 160
    new-instance v7, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    sget-object v8, Ljava/io/File;->separator:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 184
    .line 185
    .line 186
    :try_start_4
    new-instance v6, Ljava/io/FileOutputStream;

    .line 187
    .line 188
    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 189
    .line 190
    .line 191
    const/16 v7, 0x400

    .line 192
    .line 193
    :try_start_5
    new-array v7, v7, [B

    .line 194
    .line 195
    :goto_1
    invoke-virtual {p1, v7}, Ljava/io/InputStream;->read([B)I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    const/4 v9, -0x1

    .line 200
    if-eq v8, v9, :cond_3

    .line 201
    .line 202
    invoke-virtual {v6, v7, v2, v8}, Ljava/io/FileOutputStream;->write([BII)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :catchall_2
    move-exception p0

    .line 210
    goto :goto_3

    .line 211
    :catch_2
    move-exception v5

    .line 212
    goto :goto_2

    .line 213
    :cond_3
    :try_start_6
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 214
    .line 215
    .line 216
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 220
    .line 221
    .line 222
    return-object v5

    .line 223
    :catchall_3
    move-exception p0

    .line 224
    move-object v6, v3

    .line 225
    goto :goto_3

    .line 226
    :catch_3
    move-exception v5

    .line 227
    move-object v6, v3

    .line 228
    :goto_2
    :try_start_7
    new-array v7, v2, [Ljava/lang/Object;

    .line 229
    .line 230
    invoke-static {v1, v0, v5, v7}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 231
    .line 232
    .line 233
    :try_start_8
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 234
    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :goto_3
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 239
    .line 240
    .line 241
    throw p0

    .line 242
    :cond_4
    new-instance p0, Lcom/taobao/sophix/a/b;

    .line 243
    .line 244
    const-string v5, "entry contains unsafe chars"

    .line 245
    .line 246
    const/16 v6, 0xb

    .line 247
    .line 248
    invoke-direct {p0, v6, v5}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 252
    :cond_5
    :goto_4
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 256
    .line 257
    .line 258
    goto :goto_6

    .line 259
    :catchall_4
    move-exception p0

    .line 260
    move-object v4, v3

    .line 261
    goto :goto_7

    .line 262
    :catch_4
    move-exception p0

    .line 263
    move-object p1, v3

    .line 264
    move-object v4, p1

    .line 265
    :goto_5
    :try_start_9
    new-array v2, v2, [Ljava/lang/Object;

    .line 266
    .line 267
    invoke-static {v1, v0, p0, v2}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :goto_6
    return-object v3

    .line 272
    :goto_7
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 276
    .line 277
    .line 278
    throw p0
.end method
