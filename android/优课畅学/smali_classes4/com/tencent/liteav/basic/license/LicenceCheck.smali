.class public Lcom/tencent/liteav/basic/license/LicenceCheck;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/basic/license/LicenceCheck$a;
    }
.end annotation


# static fields
.field private static d:Lcom/tencent/liteav/basic/license/LicenceCheck;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

.field private f:Lcom/tencent/liteav/basic/license/LicenceCheck$a;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "YTFaceSDK.licence"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->b:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->c:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    .line 13
    .line 14
    const-string v1, "TXUgcSDK.licence"

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, Lcom/tencent/liteav/basic/license/LicenceCheck$a;-><init>(Lcom/tencent/liteav/basic/license/LicenceCheck;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->e:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    .line 20
    .line 21
    new-instance v0, Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    .line 22
    .line 23
    const-string v1, "TXLiveSDK.licence"

    .line 24
    .line 25
    invoke-direct {v0, p0, v1}, Lcom/tencent/liteav/basic/license/LicenceCheck$a;-><init>(Lcom/tencent/liteav/basic/license/LicenceCheck;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->f:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    .line 29
    .line 30
    return-void
.end method

.method private a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Landroid/content/Context;)I
    .locals 2

    .line 36
    iget-boolean v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 38
    iput-object p2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    .line 39
    :cond_1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->d(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)I

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_2

    .line 40
    iput-boolean v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->g:Z

    return v1

    .line 41
    :cond_2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->c(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)I

    move-result p2

    if-nez p2, :cond_3

    .line 42
    iput-boolean v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->g:Z

    return v1

    :cond_3
    return p2
.end method

.method private a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Lcom/tencent/liteav/basic/license/e;Landroid/content/Context;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1, p3}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Landroid/content/Context;)I

    move-result p3

    if-eqz p3, :cond_0

    .line 34
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 35
    iget-object p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->i:Ljava/lang/String;

    iput-object p1, p2, Lcom/tencent/liteav/basic/license/e;->a:Ljava/lang/String;

    :cond_1
    return p3
.end method

.method private a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;Ljava/lang/String;)I
    .locals 11

    .line 51
    const-string v0, "LicenceCheck"

    const/4 v1, 0x0

    .line 52
    :try_start_0
    iget-object v2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->c:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v2

    .line 53
    invoke-static {p2, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    .line 54
    invoke-static {p3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p3

    .line 55
    invoke-static {v3, p3, v2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a([B[BLjava/security/PublicKey;)Z

    move-result p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 56
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "verifyLicence, exception is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    move p3, v1

    :goto_0
    if-nez p3, :cond_0

    const/4 p1, -0x2

    .line 58
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    .line 59
    const-string p2, "verifyLicence, signature not pass!"

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 60
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->c(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 61
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p1, -0x3

    .line 62
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    .line 63
    const-string p2, "verifyLicence, decodeValue is empty!"

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    .line 64
    :cond_1
    iput-object p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->i:Ljava/lang/String;

    const/4 p3, -0x1

    .line 65
    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 66
    const-string p2, "pituLicense"

    invoke-virtual {v2, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 67
    const-string v3, "appData"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    if-nez v2, :cond_2

    .line 68
    const-string p1, "verifyLicence, appDataArray is null!"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0, p3}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    :cond_2
    move v3, v1

    move v4, v3

    move v5, v4

    move v6, v5

    .line 70
    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v3, v7, :cond_6

    .line 71
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 72
    const-string v8, "packageName"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 73
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "verifyLicence, packageName:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    iget-object v9, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 75
    const-string v7, "verifyLicence, packageName not match!"

    invoke-static {v0, v7}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 76
    :cond_3
    const-string v4, "endDate"

    invoke-virtual {v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 77
    invoke-direct {p0, v4}, Lcom/tencent/liteav/basic/license/LicenceCheck;->d(Ljava/lang/String;)Z

    move-result v4

    const/4 v8, 0x1

    if-eqz v4, :cond_4

    move v4, v8

    goto :goto_2

    .line 78
    :cond_4
    invoke-direct {p0, p1, v7, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    move v4, v8

    move v5, v4

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    move v4, v8

    move v5, v4

    move v6, v5

    :cond_6
    if-nez v4, :cond_7

    const/4 p1, -0x4

    .line 79
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p1

    :cond_7
    if-nez v5, :cond_8

    const/4 p1, -0x5

    .line 80
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p1

    :cond_8
    if-nez v6, :cond_9

    const/16 p1, -0xb

    .line 81
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p1

    .line 82
    :cond_9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez p1, :cond_b

    .line 83
    :try_start_2
    invoke-static {p2, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 84
    iget-object p2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    if-nez p2, :cond_a

    const/16 p1, -0xa

    return p1

    .line 85
    :cond_a
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    .line 86
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->b:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/util/c;->a(Ljava/lang/String;[B)V

    .line 88
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->setPituLicencePath(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    .line 89
    :try_start_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "decode pitu license error:"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_b
    :goto_3
    iget-object p1, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    sget p2, Lcom/tencent/liteav/basic/datareport/a;->aI:I

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    return v1

    .line 91
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 92
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "verifyLicence, json format error ! exception = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-direct {p0, p3}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p3
.end method

.method public static a()Lcom/tencent/liteav/basic/license/LicenceCheck;
    .locals 1

    .line 3
    sget-object v0, Lcom/tencent/liteav/basic/license/LicenceCheck;->d:Lcom/tencent/liteav/basic/license/LicenceCheck;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/tencent/liteav/basic/license/LicenceCheck;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/license/LicenceCheck;-><init>()V

    sput-object v0, Lcom/tencent/liteav/basic/license/LicenceCheck;->d:Lcom/tencent/liteav/basic/license/LicenceCheck;

    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/liteav/basic/license/LicenceCheck;->d:Lcom/tencent/liteav/basic/license/LicenceCheck;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 105
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 106
    const-string v1, "activity"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    .line 107
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    .line 108
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 109
    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v2, v0, :cond_0

    .line 110
    iget-object p0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    return-object p0

    .line 111
    :cond_1
    const-string p0, ""

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/license/LicenceCheck;Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->g(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(I)V
    .locals 3

    .line 104
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    sget v1, Lcom/tencent/liteav/basic/datareport/a;->aJ:I

    const-string v2, ""

    invoke-static {v0, v1, p1, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;IILjava/lang/String;)V

    return-void
.end method

.method private a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    .line 8
    invoke-static {p2}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->setAppContext(Landroid/content/Context;)V

    .line 9
    :cond_0
    iput-object p4, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->d:Ljava/lang/String;

    .line 10
    iput-object p3, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->e:Ljava/lang/String;

    .line 11
    iget-object p2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lcom/tencent/liteav/basic/license/LicenceCheck;->b()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 12
    iget-object p2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 13
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->c:Ljava/lang/String;

    .line 14
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->c:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->b(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 15
    const-string p2, "LicenceCheck"

    const-string p3, "setLicense, sdcard file not exist, to download"

    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    const-string p2, ""

    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->b(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)V

    .line 17
    :cond_2
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V

    :cond_3
    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/license/LicenceCheck;Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->b(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Lorg/json/JSONObject;Ljava/lang/String;)Z
    .locals 4

    .line 94
    const-string v0, "feature"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p2

    .line 95
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->f:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    const-string v1, "LicenceCheck"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p1, v0, :cond_1

    shr-int/lit8 p2, p2, 0x4

    and-int/lit8 p2, p2, 0xf

    if-lt p2, v2, :cond_0

    .line 96
    iput p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    goto :goto_0

    :cond_0
    move v2, v3

    .line 97
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "live parseVersionType, mLicenceVersionType = "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->e:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    if-ne p1, v0, :cond_6

    and-int/lit8 v0, p2, 0xf

    if-gt v0, v2, :cond_5

    if-eq v0, v2, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_2

    .line 99
    :cond_3
    :goto_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    const/4 p2, 0x5

    .line 100
    iput p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    goto :goto_2

    :cond_4
    const/4 p2, 0x3

    .line 101
    iput p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    goto :goto_2

    .line 102
    :cond_5
    iput v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    .line 103
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "ugc parseVersionType, mLicenceVersionType = "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_6
    return v3
.end method

.method public static a([B[BLjava/security/PublicKey;)Z
    .locals 1

    .line 112
    const-string v0, "SHA256WithRSA"

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 113
    invoke-virtual {v0, p2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 114
    invoke-virtual {v0, p0}, Ljava/security/Signature;->update([B)V

    .line 115
    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/liteav/basic/license/LicenceCheck;Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->d(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private b(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Ljava/lang/String;
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 4
    :cond_0
    const-string v2, "LicenceCheck.lastModified"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".lastModified"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private b(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    const-string v1, "LicenceCheck.lastModified"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".lastModified"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public static synthetic b(Lcom/tencent/liteav/basic/license/LicenceCheck;Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->f(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V

    return-void
.end method

.method private b()Z
    .locals 4

    .line 10
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "LicenceCheck"

    if-nez v0, :cond_0

    .line 11
    const-string v0, "checkSdcardLicence, sdcard not mounted yet!"

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    .line 13
    const-string v0, "checkSdcardLicence, mContext.getExternalFilesDir is null!"

    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 0

    .line 14
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/c;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private c(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)I
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, -0xa

    const-string v2, "LicenceCheck"

    if-nez v0, :cond_0

    .line 2
    const-string p1, "checkSdcardLicence, sdcard not mounted yet!"

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    const-string p1, "checkSdcardLicence, mContext.getExternalFilesDir is null!"

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 5
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-direct {p0, v0}, Lcom/tencent/liteav/basic/license/LicenceCheck;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, -0x7

    return p1

    .line 7
    :cond_2
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    const-string p1, "checkSdcardLicence, licenceSdcardStr is empty"

    invoke-static {v2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x8

    return p1

    .line 10
    :cond_3
    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method private static c(Ljava/lang/String;)J
    .locals 2

    .line 11
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p0

    .line 13
    const-string v0, "LicenceCheck"

    const-string v1, "time str to millsecond failed."

    invoke-static {v0, v1, p0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method private c(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 14
    iget-object v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "LicenceCheck"

    if-eqz v0, :cond_0

    .line 15
    const-string p1, "decodeLicence, mKey is empty!!!"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    const-string p1, ""

    return-object p1

    .line 17
    :cond_0
    iget-object p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 18
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "AES"

    invoke-direct {v0, p1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 19
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->nativeIvParameterSpec([B)[B

    move-result-object p1

    .line 20
    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v2, p1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 p1, 0x0

    .line 21
    invoke-static {p2, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 22
    :try_start_0
    const-string p2, "AES/CBC/PKCS5Padding"

    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    const/4 v3, 0x2

    .line 23
    invoke-virtual {p2, v3, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 24
    invoke-virtual {p2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 25
    new-instance p2, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "decodeLicence : "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method private d(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)I
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->e(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x6

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    iget-object v1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/util/c;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    const-string p1, "LicenceCheck"

    const-string v0, "checkAssetLicence, licenceSdcardStr is empty"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x8

    return p1

    .line 5
    :cond_1
    invoke-virtual {p0, p1, v0}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method private d(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I
    .locals 5

    .line 6
    const-string v0, "LicenceCheck"

    .line 7
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 8
    const-string p2, "appId"

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p2

    .line 9
    const-string v2, "encryptedLicense"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 10
    const-string v3, "signature"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "appid:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "encryptedLicense:"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "signature:"

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    invoke-direct {p0, p1, v2, v1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, -0x1

    .line 16
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p1
.end method

.method private d(Ljava/lang/String;)Z
    .locals 6

    .line 17
    invoke-static {p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->c(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const/4 v2, 0x1

    .line 18
    const-string v3, "LicenceCheck"

    if-gez p1, :cond_0

    .line 19
    const-string p1, "checkEndDate, end date millis < 0!"

    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long p1, v0, v4

    if-gez p1, :cond_1

    .line 21
    const-string p1, "checkEndDate, end date expire!"

    invoke-static {v3, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private e(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I
    .locals 3

    .line 2
    invoke-direct {p0, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "LicenceCheck"

    if-eqz v0, :cond_0

    .line 4
    const-string p1, "verifyOldLicence, decryptStr is empty"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x3

    return p1

    .line 5
    :cond_0
    iput-object p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->i:Ljava/lang/String;

    .line 6
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 7
    const-string p2, "packagename"

    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 8
    iget-object v2, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 9
    const-string p1, "packagename not match!"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x4

    .line 10
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 11
    :cond_1
    const-string p2, "enddate"

    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 12
    invoke-direct {p0, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->d(Ljava/lang/String;)Z

    move-result p2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_2

    const/4 p1, -0x5

    return p1

    :cond_2
    const/4 p2, 0x5

    .line 13
    iput p2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->h:I

    .line 14
    iget-object p1, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    sget p2, Lcom/tencent/liteav/basic/datareport/a;->aI:I

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V

    const/4 p1, 0x0

    return p1

    .line 15
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    const-string p1, "verifyOldLicence, json format error !"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 17
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(I)V

    return p1
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 18
    :try_start_0
    const-string v0, "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKfMXaF6wx9lev2U\nIzkk6ydI2sdaSQAD2ZvDBLq+5Fm6nGwSSWawl03D4vHcWIUa3wnz6f19/y8wzrj4\nnTfcEnT94SPdB6GhGsqPwbwRp9MHAqd/2gWZxSb005il2yiOZafk6X4NGKCn2tGd\nyNaCF+m9rLykuLdZHB0Z53ivgseNAgMBAAECgYAvXI2pAH+Goxwd6uwuOu9svTGT\nRzaHnI6VWmxBUZQeh3+TOW4iYAG03291GN6bY0RFCOWouSGH7lzK9NFbbPCAQ/hx\ncO48PqioHoq7K8sqzd3XaYBv39HrRnM8JvZsqv0PLJwX/LGm2y/MRaKAC6bcHtse\npgh+NNmUxXNRcTMRAQJBANezmenBcR8HTcY5YaEk3SQRzOo+QhIXuuD4T/FESpVJ\nmVQGxJjLsEBua1j38WG2QuepE5JiVbkQ0jQSvhUiZK0CQQDHJa+vWu6l72lQAvIx\nwmRISorvLb/tnu5bH0Ele42oX+w4p/tm03awdVjhVANnpDjYS2H6EzrF/pfis7k9\nV2phAkB4E4gz47bYYhV+qsTZkw70HGCpab0YG1OyFylRkwW983nCl/3rXUChrZZe\nsbATCAZYtfuqOsmju2R5DpH4a+wFAkBmHlcWbmSNxlSUaM5U4b+WqlLQDv+qE6Na\nKo63b8HWI0n4S3tI4QqttZ7b/L66OKXFk/Ir0AyFVuX/o/VLFTZBAkAdSTEkGwE5\nGQmhxu95sKxmdlUY6Q0Gwwpi06C1BPBrj2VkGXpBP0twhPVAq/3xVjjb+2KXVTUW\nIpRLc06M4vhv"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 19
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 20
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/license/f;->b([B[B)[B

    move-result-object p1

    .line 21
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "decryptLicenceStr, exception is : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "LicenceCheck"

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private e(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    iget-object p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/util/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method private f(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "LicenceCheck"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p1, "saveTempLocal sdcardDir is null"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v3, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Ljava/io/File;

    .line 45
    .line 46
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v5, "delete dst file:"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    new-instance v2, Ljava/io/File;

    .line 80
    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v5, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->c:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v3, "rename file:"

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    const/4 v0, 0x1

    .line 137
    iput-boolean v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->g:Z

    .line 138
    .line 139
    return-void
.end method

.method private g(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method private native nativeIvParameterSpec([B)[B
.end method


# virtual methods
.method public a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I
    .locals 1

    .line 43
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->d(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 45
    :catch_0
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->f:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 46
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->e(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public a(Lcom/tencent/liteav/basic/license/e;Landroid/content/Context;)I
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->f:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Lcom/tencent/liteav/basic/license/e;Landroid/content/Context;)I

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 1

    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 48
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 49
    const-string p1, "RSA"

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    .line 50
    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->f:Lcom/tencent/liteav/basic/license/LicenceCheck$a;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/tencent/liteav/basic/license/LicenceCheck;->a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V
    .locals 10

    .line 18
    iget-object v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "LicenceCheck"

    if-eqz v0, :cond_0

    .line 19
    const-string p1, "downloadLicense, mUrl is empty, ignore!"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 20
    :cond_0
    iget-boolean v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->f:Z

    if-eqz v0, :cond_1

    .line 21
    const-string p1, "downloadLicense, in downloading, ignore"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 22
    :cond_1
    new-instance v7, Lcom/tencent/liteav/basic/license/LicenceCheck$1;

    invoke-direct {v7, p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck$1;-><init>(Lcom/tencent/liteav/basic/license/LicenceCheck;Lcom/tencent/liteav/basic/license/LicenceCheck$a;)V

    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 24
    const-string p1, "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_3

    .line 26
    const-string p1, "Please check permission WRITE_EXTERNAL_STORAGE permission has been set !!!"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 27
    :cond_3
    invoke-direct {p0, p1}, Lcom/tencent/liteav/basic/license/LicenceCheck;->b(Lcom/tencent/liteav/basic/license/LicenceCheck$a;)Ljava/lang/String;

    move-result-object v9

    .line 28
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->c:Ljava/lang/String;

    .line 29
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/tencent/liteav/basic/license/c;

    iget-object v3, p0, Lcom/tencent/liteav/basic/license/LicenceCheck;->a:Landroid/content/Context;

    iget-object v4, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->e:Ljava/lang/String;

    iget-object v5, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->c:Ljava/lang/String;

    iget-object v6, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->b:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/tencent/liteav/basic/license/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/liteav/basic/license/b;ZLjava/lang/String;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 30
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p1, Lcom/tencent/liteav/basic/license/LicenceCheck$a;->f:Z

    return-void
.end method
