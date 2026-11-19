.class public Lcom/zykj/utlils/EncryptUtil;
.super Ljava/lang/Object;
.source "EncryptUtil.java"


# static fields
.field private static final encoding:Ljava/lang/String; = "UTF-8"

.field private static final iv:Ljava/lang/String; = "z2y0k1j8"

.field static secretKey:Ljava/lang/String; = "1!QAZ2@WSXCDE#3$4RFVBGT%5^6YHNMJU7&8*IK<.LO9(0P"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decryptThreeDESECB(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/exception/SysException;
        }
    .end annotation

    const-string v0, "\u89e3\u5bc6\u7a0b\u4e2d\u51fa\u73b0\u5f02\u5e38"

    const-string v1, ""

    .line 109
    :try_start_0
    new-instance v2, Ljavax/crypto/spec/DESedeKeySpec;

    sget-object v3, Lcom/zykj/utlils/EncryptUtil;->secretKey:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljavax/crypto/spec/DESedeKeySpec;-><init>([B)V

    const-string v3, "desede"

    .line 110
    invoke-static {v3}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 111
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    const-string v3, "desede/CBC/PKCS7Padding"

    .line 112
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 113
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    const-string v5, "z2y0k1j8"

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v5, 0x2

    .line 114
    invoke-virtual {v3, v5, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    const/4 v2, 0x0

    .line 115
    invoke-static {p0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 116
    invoke-virtual {v3, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    .line 117
    new-instance v2, Ljava/lang/String;

    const-string v3, "UTF-8"

    invoke-direct {v2, p0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p0

    .line 148
    invoke-virtual {p0}, Ljavax/crypto/NoSuchPaddingException;->printStackTrace()V

    .line 149
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_1
    move-exception p0

    .line 144
    invoke-virtual {p0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 145
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_2
    move-exception p0

    .line 140
    invoke-virtual {p0}, Ljava/security/spec/InvalidKeySpecException;->printStackTrace()V

    .line 141
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_3
    move-exception p0

    .line 136
    invoke-virtual {p0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 137
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_4
    move-exception p0

    .line 132
    invoke-virtual {p0}, Ljavax/crypto/BadPaddingException;->printStackTrace()V

    .line 133
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_5
    move-exception p0

    .line 128
    invoke-virtual {p0}, Ljavax/crypto/IllegalBlockSizeException;->printStackTrace()V

    .line 129
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_6
    move-exception p0

    .line 124
    invoke-virtual {p0}, Ljava/security/InvalidAlgorithmParameterException;->printStackTrace()V

    .line 125
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_7
    move-exception p0

    .line 120
    invoke-virtual {p0}, Ljava/security/InvalidKeyException;->printStackTrace()V

    .line 121
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2
.end method

.method public static encryptThreeDESECB(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/exception/SysException;
        }
    .end annotation

    const-string v0, "\u52a0\u5bc6\u7a0b\u4e2d\u51fa\u73b0\u5f02\u5e38"

    const-string v1, ""

    .line 45
    :try_start_0
    new-instance v2, Ljavax/crypto/spec/DESedeKeySpec;

    sget-object v3, Lcom/zykj/utlils/EncryptUtil;->secretKey:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljavax/crypto/spec/DESedeKeySpec;-><init>([B)V

    const-string v3, "desede"

    .line 46
    invoke-static {v3}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 47
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    const-string v3, "desede/CBC/PKCS7Padding"

    .line 48
    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 49
    new-instance v4, Ljavax/crypto/spec/IvParameterSpec;

    const-string v5, "z2y0k1j8"

    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v5, 0x1

    .line 50
    invoke-virtual {v3, v5, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    const-string v2, "UTF-8"

    .line 51
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {v3, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    const/4 v2, 0x0

    .line 52
    invoke-static {p0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 82
    invoke-virtual {p0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    .line 83
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_1
    move-exception p0

    .line 78
    invoke-virtual {p0}, Ljavax/crypto/BadPaddingException;->printStackTrace()V

    .line 79
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_2
    move-exception p0

    .line 74
    invoke-virtual {p0}, Ljavax/crypto/IllegalBlockSizeException;->printStackTrace()V

    .line 75
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_3
    move-exception p0

    .line 70
    invoke-virtual {p0}, Ljavax/crypto/NoSuchPaddingException;->printStackTrace()V

    .line 71
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_4
    move-exception p0

    .line 66
    invoke-virtual {p0}, Ljava/security/InvalidAlgorithmParameterException;->printStackTrace()V

    .line 67
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_5
    move-exception p0

    .line 62
    invoke-virtual {p0}, Ljava/security/spec/InvalidKeySpecException;->printStackTrace()V

    .line 63
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_6
    move-exception p0

    .line 58
    invoke-virtual {p0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 59
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_7
    move-exception p0

    .line 54
    invoke-virtual {p0}, Ljava/security/InvalidKeyException;->printStackTrace()V

    .line 55
    new-instance v2, Lcom/zykj/exception/SysException;

    invoke-direct {v2, v1, v0, p0}, Lcom/zykj/exception/SysException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2
.end method
