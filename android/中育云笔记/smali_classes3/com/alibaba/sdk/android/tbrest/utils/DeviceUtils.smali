.class public Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final NETWORK_CLASS_2_G:Ljava/lang/String; = "2G"

.field private static final NETWORK_CLASS_3_G:Ljava/lang/String; = "3G"

.field private static final NETWORK_CLASS_4_G:Ljava/lang/String; = "4G"

.field private static final NETWORK_CLASS_5_G:Ljava/lang/String; = "5G"

.field private static final NETWORK_CLASS_UNKNOWN:Ljava/lang/String; = "Unknown"

.field public static final NETWORK_CLASS_WIFI:Ljava/lang/String; = "Wi-Fi"

.field private static arrayOfString:[Ljava/lang/String;

.field private static carrier:Ljava/lang/String;

.field private static cpuName:Ljava/lang/String;

.field private static imei:Ljava/lang/String;

.field private static imsi:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "Unknown"

    .line 2
    .line 3
    filled-new-array {v0, v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    sput-object v0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imsi:Ljava/lang/String;

    .line 11
    .line 12
    sput-object v0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imei:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IntGetBytes(I)[B
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    rem-int/lit16 v1, p0, 0x100

    .line 5
    .line 6
    int-to-byte v1, v1

    .line 7
    const/4 v2, 0x3

    .line 8
    aput-byte v1, v0, v2

    .line 9
    .line 10
    shr-int/lit8 v1, p0, 0x8

    .line 11
    .line 12
    rem-int/lit16 v1, v1, 0x100

    .line 13
    .line 14
    int-to-byte v1, v1

    .line 15
    const/4 v2, 0x2

    .line 16
    aput-byte v1, v0, v2

    .line 17
    .line 18
    shr-int/lit8 v1, p0, 0x10

    .line 19
    .line 20
    rem-int/lit16 v1, v1, 0x100

    .line 21
    .line 22
    int-to-byte v1, v1

    .line 23
    const/4 v2, 0x1

    .line 24
    aput-byte v1, v0, v2

    .line 25
    .line 26
    shr-int/lit8 p0, p0, 0x18

    .line 27
    .line 28
    rem-int/lit16 p0, p0, 0x100

    .line 29
    .line 30
    int-to-byte p0, p0

    .line 31
    const/4 v1, 0x0

    .line 32
    aput-byte p0, v0, v1

    .line 33
    .line 34
    return-object v0
.end method

.method public static getCarrier(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->carrier:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "phone"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sput-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->carrier:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :catch_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static getCountry()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const-string v1, "get country error "

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public static getCpuName()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->cpuName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "/proc/cpuinfo"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    new-instance v2, Ljava/io/FileReader;

    .line 10
    .line 11
    invoke-direct {v2, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 12
    .line 13
    .line 14
    :try_start_1
    new-instance v0, Ljava/io/BufferedReader;

    .line 15
    .line 16
    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    :cond_1
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    const-string v4, "Hardware"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const-string v4, ":"

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x1

    .line 40
    aget-object v3, v3, v4

    .line 41
    .line 42
    sput-object v3, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->cpuName:Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    :try_start_3
    invoke-virtual {v2}, Ljava/io/Reader;->close()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    return-object v3

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :try_start_4
    invoke-virtual {v2}, Ljava/io/Reader;->close()V

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    move-object v5, v1

    .line 62
    move-object v1, v0

    .line 63
    move-object v0, v5

    .line 64
    goto :goto_1

    .line 65
    :catch_1
    move-object v0, v1

    .line 66
    goto :goto_2

    .line 67
    :catchall_2
    move-exception v0

    .line 68
    move-object v2, v1

    .line 69
    move-object v1, v0

    .line 70
    move-object v0, v2

    .line 71
    goto :goto_1

    .line 72
    :catch_2
    move-object v0, v1

    .line 73
    move-object v2, v0

    .line 74
    goto :goto_2

    .line 75
    :goto_1
    if-eqz v2, :cond_3

    .line 76
    .line 77
    :try_start_5
    invoke-virtual {v2}, Ljava/io/Reader;->close()V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 83
    .line 84
    .line 85
    :catch_3
    :cond_4
    throw v1

    .line 86
    :catch_4
    :goto_2
    if-eqz v2, :cond_5

    .line 87
    .line 88
    :try_start_6
    invoke-virtual {v2}, Ljava/io/Reader;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 89
    .line 90
    .line 91
    :cond_5
    if-eqz v0, :cond_6

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_5
    :cond_6
    :goto_3
    return-object v1
.end method

.method public static getImei(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imei:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getUniqueID()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sput-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imei:Ljava/lang/String;

    .line 11
    .line 12
    return-object p0
.end method

.method public static getImsi(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imsi:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isEmpty(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getUniqueID()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sput-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imsi:Ljava/lang/String;

    .line 17
    .line 18
    :cond_1
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->imsi:Ljava/lang/String;

    .line 19
    .line 20
    return-object p0
.end method

.method public static getLanguage()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const-string v1, "get country error "

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method private static getNetworkClass(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string p0, "Unknown"

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string p0, "4G"

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    const-string p0, "3G"

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_2
    const-string p0, "2G"

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "5G"

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static getNetworkType(Landroid/content/Context;)[Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const-string v0, "connectivity"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x1

    .line 58
    const/4 v3, 0x0

    .line 59
    if-ne v1, v2, :cond_4

    .line 60
    .line 61
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 62
    .line 63
    const-string v0, "Wi-Fi"

    .line 64
    .line 65
    aput-object v0, p0, v3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_4
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_6

    .line 73
    .line 74
    const-string v1, "phone"

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 81
    .line 82
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->isNRConnected(Landroid/telephony/TelephonyManager;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_5

    .line 87
    .line 88
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 89
    .line 90
    const-string v1, "5G"

    .line 91
    .line 92
    aput-object v1, p0, v3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->getNetworkClass(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    aput-object v1, p0, v3

    .line 106
    .line 107
    :goto_0
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    aput-object v0, p0, v2

    .line 114
    .line 115
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    return-object p0

    .line 118
    :catchall_0
    :cond_6
    sget-object p0, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->arrayOfString:[Ljava/lang/String;

    .line 119
    .line 120
    return-object p0
.end method

.method public static getResolution(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget v0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 12
    .line 13
    if-le v0, p0, :cond_0

    .line 14
    .line 15
    xor-int/2addr v0, p0

    .line 16
    xor-int/2addr p0, v0

    .line 17
    xor-int/2addr v0, p0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p0, "*"

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    const-string v0, "DeviceUtils getResolution: error"

    .line 41
    .line 42
    invoke-static {v0, p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    const-string p0, "Unknown"

    .line 46
    .line 47
    return-object p0
.end method

.method public static final getUniqueID()Ljava/lang/String;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    div-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    long-to-int v1, v1

    .line 14
    new-instance v2, Ljava/util/Random;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/Random;->nextInt()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    new-instance v3, Ljava/util/Random;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/util/Random;->nextInt()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->IntGetBytes(I)[B

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v1}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->IntGetBytes(I)[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v2}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->IntGetBytes(I)[B

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/utils/DeviceUtils;->IntGetBytes(I)[B

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const/16 v4, 0x10

    .line 49
    .line 50
    new-array v4, v4, [B

    .line 51
    .line 52
    const/4 v5, 0x4

    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-static {v0, v6, v4, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v6, v4, v5, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    invoke-static {v2, v6, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 63
    .line 64
    .line 65
    const/16 v0, 0xc

    .line 66
    .line 67
    invoke-static {v3, v6, v4, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    invoke-static {v4}, Lcom/alibaba/sdk/android/tbrest/utils/Base64;->encodeBase64String([B)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object v0

    .line 75
    :catch_0
    const/4 v0, 0x0

    .line 76
    return-object v0
.end method

.method public static getUtdid(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/ta/utdid2/device/UTDevice;->getUtdid(Landroid/content/Context;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const-string v0, "get utdid error "

    .line 8
    .line 9
    invoke-static {v0, p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method private static isNRConnected(Landroid/telephony/TelephonyManager;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getServiceState"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    array-length v2, v1

    .line 42
    move v4, v0

    .line 43
    :goto_0
    if-ge v4, v2, :cond_2

    .line 44
    .line 45
    aget-object v5, v1, v4

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    const-string v7, "getNrStatus"

    .line 52
    .line 53
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_1

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v7, "getNrState"

    .line 64
    .line 65
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 76
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    const/4 v2, 0x3

    .line 90
    if-ne p0, v2, :cond_2

    .line 91
    .line 92
    return v1

    .line 93
    :catch_0
    :cond_2
    return v0
.end method
