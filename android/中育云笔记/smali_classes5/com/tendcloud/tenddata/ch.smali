.class public Lcom/tendcloud/tenddata/ch;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ch$a;,
        Lcom/tendcloud/tenddata/ch$b;
    }
.end annotation


# static fields
.field static final a:Ljava/lang/String; = "www.talkingdata.net"

.field static final b:I = 0x50

.field private static c:Landroid/telephony/TelephonyManager; = null

.field private static final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:[Ljava/lang/String;

.field private static final f:[Ljava/lang/String;

.field private static g:Lcom/tendcloud/tenddata/ch$a; = null

.field private static h:Z = false

.field private static final i:J = 0x493e0L

.field private static j:J

.field private static volatile k:Z

.field private static volatile l:Z

.field private static m:Lorg/json/JSONArray;

.field private static n:Lorg/json/JSONArray;

.field private static volatile o:Z

.field private static volatile p:Z

.field private static volatile q:Z

.field private static r:Lorg/json/JSONArray;

.field private static s:Lorg/json/JSONArray;

.field private static t:Lorg/json/JSONArray;

.field private static u:Z

.field private static v:Lcom/tendcloud/tenddata/ch$b;

.field private static w:Lorg/json/JSONArray;

.field private static volatile x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/tendcloud/tenddata/ch;->d:Ljava/util/HashMap;

    .line 7
    .line 8
    const-string v15, "EHRPD"

    .line 9
    .line 10
    const-string v16, "HSPAP"

    .line 11
    .line 12
    const-string v1, "UNKNOWN"

    .line 13
    .line 14
    const-string v2, "GPRS"

    .line 15
    .line 16
    const-string v3, "EDGE"

    .line 17
    .line 18
    const-string v4, "UMTS"

    .line 19
    .line 20
    const-string v5, "CDMA"

    .line 21
    .line 22
    const-string v6, "EVDO_0"

    .line 23
    .line 24
    const-string v7, "EVDO_A"

    .line 25
    .line 26
    const-string v8, "1xRTT"

    .line 27
    .line 28
    const-string v9, "HSDPA"

    .line 29
    .line 30
    const-string v10, "HSUPA"

    .line 31
    .line 32
    const-string v11, "HSPA"

    .line 33
    .line 34
    const-string v12, "IDEN"

    .line 35
    .line 36
    const-string v13, "EVDO_B"

    .line 37
    .line 38
    const-string v14, "LTE"

    .line 39
    .line 40
    filled-new-array/range {v1 .. v16}, [Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sput-object v1, Lcom/tendcloud/tenddata/ch;->e:[Ljava/lang/String;

    .line 45
    .line 46
    const-string v1, "CDMA"

    .line 47
    .line 48
    const-string v2, "SIP"

    .line 49
    .line 50
    const-string v3, "NONE"

    .line 51
    .line 52
    const-string v4, "GSM"

    .line 53
    .line 54
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sput-object v1, Lcom/tendcloud/tenddata/ch;->f:[Ljava/lang/String;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    sput-object v1, Lcom/tendcloud/tenddata/ch;->g:Lcom/tendcloud/tenddata/ch$a;

    .line 62
    .line 63
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-static {}, Lcom/tendcloud/tenddata/ch;->a()[Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v3, "ip"

    .line 73
    .line 74
    aget-object v4, v1, v2

    .line 75
    .line 76
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    aget-object v3, v1, v3

    .line 81
    .line 82
    const-string v4, "ipv6"

    .line 83
    .line 84
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    const/4 v3, 0x2

    .line 88
    aget-object v3, v1, v3

    .line 89
    .line 90
    const-string v4, "cell_ip"

    .line 91
    .line 92
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/4 v3, 0x3

    .line 96
    aget-object v1, v1, v3

    .line 97
    .line 98
    const-string v3, "cell_ipv6"

    .line 99
    .line 100
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 104
    .line 105
    invoke-static {v1}, Lcom/tendcloud/tenddata/ch;->q(Landroid/content/Context;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const-string v3, "bssid"

    .line 110
    .line 111
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 115
    .line 116
    invoke-static {v1}, Lcom/tendcloud/tenddata/ch;->w(Landroid/content/Context;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    const-string v3, "ssid"

    .line 121
    .line 122
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_0
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->h:Z

    .line 126
    .line 127
    const-wide/32 v0, -0x493e0

    .line 128
    .line 129
    .line 130
    sput-wide v0, Lcom/tendcloud/tenddata/ch;->j:J

    .line 131
    .line 132
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->k:Z

    .line 133
    .line 134
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->l:Z

    .line 135
    .line 136
    new-instance v0, Lorg/json/JSONArray;

    .line 137
    .line 138
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 139
    .line 140
    .line 141
    sput-object v0, Lcom/tendcloud/tenddata/ch;->m:Lorg/json/JSONArray;

    .line 142
    .line 143
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->o:Z

    .line 144
    .line 145
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->p:Z

    .line 146
    .line 147
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->q:Z

    .line 148
    .line 149
    new-instance v0, Lorg/json/JSONArray;

    .line 150
    .line 151
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 152
    .line 153
    .line 154
    sput-object v0, Lcom/tendcloud/tenddata/ch;->r:Lorg/json/JSONArray;

    .line 155
    .line 156
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->u:Z

    .line 157
    .line 158
    new-instance v0, Lcom/tendcloud/tenddata/ch$b;

    .line 159
    .line 160
    invoke-direct {v0}, Lcom/tendcloud/tenddata/ch$b;-><init>()V

    .line 161
    .line 162
    .line 163
    sput-object v0, Lcom/tendcloud/tenddata/ch;->v:Lcom/tendcloud/tenddata/ch$b;

    .line 164
    .line 165
    new-instance v0, Lorg/json/JSONArray;

    .line 166
    .line 167
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 171
    .line 172
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->x:Z

    .line 173
    .line 174
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_2

    .line 8
    .line 9
    sget-boolean v0, Lcom/tendcloud/tenddata/ch;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->D(Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    :goto_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 32
    .line 33
    return-object p0
.end method

.method public static B(Landroid/content/Context;)I
    .locals 1

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneCount()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->A(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    return p0

    .line 32
    :catchall_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public static C(Landroid/content/Context;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->d(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->d:Ljava/util/HashMap;

    .line 9
    .line 10
    const-string v1, "ip"

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    const/16 v1, 0x2e

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x1

    .line 27
    add-int/2addr v1, v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v1, Ljava/net/DatagramPacket;

    .line 34
    .line 35
    new-array v4, v3, [B

    .line 36
    .line 37
    invoke-direct {v1, v4, v3, v3}, Ljava/net/DatagramPacket;-><init>([BII)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Ljava/net/DatagramSocket;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/net/DatagramSocket;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    .line 44
    .line 45
    :goto_0
    const/16 v4, 0xff

    .line 46
    .line 47
    if-ge v2, v4, :cond_1

    .line 48
    .line 49
    :try_start_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 65
    .line 66
    .line 67
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 68
    :try_start_2
    invoke-virtual {v1, v4}, Ljava/net/DatagramPacket;->setAddress(Ljava/net/InetAddress;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 72
    .line 73
    .line 74
    const/16 v4, 0x7d

    .line 75
    .line 76
    if-ne v2, v4, :cond_0

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V

    .line 79
    .line 80
    .line 81
    new-instance v4, Ljava/net/DatagramSocket;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/net/DatagramSocket;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    .line 85
    .line 86
    move-object v3, v4

    .line 87
    :catchall_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    :try_start_3
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_1
    move-object v3, v0

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    move-object v3, v0

    .line 97
    :goto_1
    const-wide/16 v1, 0x1388

    .line 98
    .line 99
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/tendcloud/tenddata/ch;->c()Ljava/util/Map;

    .line 103
    .line 104
    .line 105
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    :try_start_4
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    .line 110
    .line 111
    :catchall_2
    :cond_3
    return-object p0

    .line 112
    :catchall_3
    :goto_2
    if-eqz v3, :cond_4

    .line 113
    .line 114
    :try_start_5
    invoke-virtual {v3}, Ljava/net/DatagramSocket;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 115
    .line 116
    .line 117
    :catchall_4
    :cond_4
    return-object v0
.end method

.method private static D(Landroid/content/Context;)V
    .locals 12

    .line 1
    const-string v0, "meid5"

    .line 2
    .line 3
    const-string v1, "meid"

    .line 4
    .line 5
    const-string v2, "imei5"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    :try_start_0
    const-string v4, "phone"

    .line 9
    .line 10
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 15
    .line 16
    new-instance v5, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    const/16 v6, 0x16

    .line 22
    .line 23
    invoke-static {v6}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 24
    .line 25
    .line 26
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    .line 27
    const-string v7, "imei"

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    if-eqz v6, :cond_4

    .line 31
    .line 32
    :try_start_1
    const-string v5, "telephony_subscription_service"

    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Landroid/telephony/SubscriptionManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 39
    .line 40
    const/16 v6, 0x1a

    .line 41
    .line 42
    :try_start_2
    invoke-static {p0, v5, v8}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;Landroid/telephony/SubscriptionManager;I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    invoke-static {v6}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 47
    .line 48
    .line 49
    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 50
    const-string v11, "imei1"

    .line 51
    .line 52
    if-eqz v10, :cond_0

    .line 53
    .line 54
    :try_start_3
    invoke-static {v11}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-virtual {v9, v7, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    invoke-static {v8}, Lcom/tendcloud/tenddata/ce;->b(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-virtual {v9, v2, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    .line 67
    .line 68
    :catchall_0
    :try_start_4
    const-string v10, "meid1"

    .line 69
    .line 70
    invoke-static {v10}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v9, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    invoke-static {v8}, Lcom/tendcloud/tenddata/ce;->c(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v9, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    :try_start_5
    invoke-static {v11}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v9, v7, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-static {v8}, Lcom/tendcloud/tenddata/ce;->b(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-virtual {v9, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    :catchall_1
    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONObject;->length()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-lez v8, :cond_1

    .line 104
    .line 105
    sget-object v8, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 106
    .line 107
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 108
    .line 109
    .line 110
    :catchall_2
    :cond_1
    :try_start_6
    invoke-static {p0, v5, v3}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;Landroid/telephony/SubscriptionManager;I)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-eqz v4, :cond_3

    .line 115
    .line 116
    invoke-static {v6}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 117
    .line 118
    .line 119
    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 120
    const-string v5, "imei2"

    .line 121
    .line 122
    if-eqz v4, :cond_2

    .line 123
    .line 124
    :try_start_7
    invoke-static {v5}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {p0, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    invoke-static {v3}, Lcom/tendcloud/tenddata/ce;->b(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {p0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 136
    .line 137
    .line 138
    :catchall_3
    :try_start_8
    const-string v2, "meid2"

    .line 139
    .line 140
    invoke-static {v2}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    invoke-static {v3}, Lcom/tendcloud/tenddata/ce;->c(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    :try_start_9
    invoke-static {v5}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p0, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    invoke-static {v3}, Lcom/tendcloud/tenddata/ce;->b(I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    :catchall_4
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lorg/json/JSONObject;->length()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-lez v0, :cond_f

    .line 174
    .line 175
    sget-object v0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 176
    .line 177
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 178
    .line 179
    .line 180
    goto/16 :goto_5

    .line 181
    .line 182
    :cond_4
    const-string v0, ""

    .line 183
    .line 184
    if-eqz v4, :cond_5

    .line 185
    .line 186
    :try_start_a
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto :goto_2

    .line 191
    :cond_5
    move-object v1, v0

    .line 192
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_6

    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    invoke-static {v4, v1}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    if-eqz v1, :cond_6

    .line 218
    .line 219
    sget-object v2, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 220
    .line 221
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 222
    .line 223
    .line 224
    :cond_6
    :try_start_b
    const-string v1, "phone1"

    .line 225
    .line 226
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 231
    .line 232
    if-eqz v1, :cond_7

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    move-object v2, v0

    .line 240
    :goto_3
    if-eqz v2, :cond_8

    .line 241
    .line 242
    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_8

    .line 251
    .line 252
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-nez v4, :cond_8

    .line 257
    .line 258
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    if-eqz v1, :cond_8

    .line 266
    .line 267
    sget-object v2, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 268
    .line 269
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 270
    .line 271
    .line 272
    :catchall_5
    :cond_8
    :try_start_c
    const-string v1, "phone2"

    .line 273
    .line 274
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 279
    .line 280
    if-eqz v1, :cond_9

    .line 281
    .line 282
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    :cond_9
    if-eqz v0, :cond_a

    .line 287
    .line 288
    invoke-static {v0}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    if-eqz v2, :cond_a

    .line 297
    .line 298
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    if-nez v2, :cond_a

    .line 303
    .line 304
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-eqz v0, :cond_a

    .line 312
    .line 313
    sget-object v1, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 314
    .line 315
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 316
    .line 317
    .line 318
    :catchall_6
    :cond_a
    :try_start_d
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->H(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->G(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    if-eqz v1, :cond_b

    .line 327
    .line 328
    move-object v0, v1

    .line 329
    :cond_b
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->F(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    if-eqz v1, :cond_c

    .line 334
    .line 335
    move-object v0, v1

    .line 336
    :cond_c
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->E(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    if-eqz p0, :cond_d

    .line 341
    .line 342
    move-object v0, p0

    .line 343
    :cond_d
    if-eqz v0, :cond_f

    .line 344
    .line 345
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 346
    .line 347
    .line 348
    move-result p0

    .line 349
    if-lez p0, :cond_f

    .line 350
    .line 351
    :goto_4
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 352
    .line 353
    .line 354
    move-result p0

    .line 355
    if-ge v8, p0, :cond_f

    .line 356
    .line 357
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-interface {v5, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-nez v2, :cond_e

    .line 370
    .line 371
    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    sget-object v1, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 375
    .line 376
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 377
    .line 378
    .line 379
    :cond_e
    add-int/lit8 v8, v8, 0x1

    .line 380
    .line 381
    goto :goto_4

    .line 382
    :catchall_7
    :cond_f
    :goto_5
    sput-boolean v3, Lcom/tendcloud/tenddata/ch;->x:Z

    .line 383
    .line 384
    return-void
.end method

.method private static E(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 9

    .line 1
    const-class v0, Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v3, "phone"

    .line 10
    .line 11
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 16
    .line 17
    const-string v3, "com.android.internal.telephony.Phone"

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    const/4 v4, 0x1

    .line 24
    :try_start_1
    const-string v5, "GEMINI_SIM_1"

    .line 25
    .line 26
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/lang/Integer;

    .line 38
    .line 39
    const-string v6, "GEMINI_SIM_2"

    .line 40
    .line 41
    invoke-virtual {v3, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    const/4 v3, 0x0

    .line 56
    :try_start_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    :goto_0
    const-string v4, "getDeviceIdGemini"

    .line 65
    .line 66
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v0, v4, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    if-nez v4, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v4, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v4, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v6}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 117
    const-string v8, "Gemini"

    .line 118
    .line 119
    if-eqz v7, :cond_1

    .line 120
    .line 121
    :try_start_3
    invoke-static {v0, p0, v5, v6, v8}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 126
    .line 127
    .line 128
    :cond_1
    invoke-static {v4}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_2

    .line 137
    .line 138
    invoke-static {v0, p0, v3, v4, v8}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v2, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    .line 144
    .line 145
    :cond_2
    return-object v2

    .line 146
    :catchall_1
    :cond_3
    :goto_1
    return-object v1
.end method

.method private static F(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v2, "phone"

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 14
    .line 15
    const-string v2, "com.android.internal.telephony.Phone"

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    const/4 v3, 0x1

    .line 22
    :try_start_1
    const-string v4, "GEMINI_SIM_1"

    .line 23
    .line 24
    invoke-virtual {v2, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/Integer;

    .line 36
    .line 37
    const-string v5, "GEMINI_SIM_2"

    .line 38
    .line 39
    invoke-virtual {v2, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    const/4 v2, 0x0

    .line 54
    :try_start_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    const-class v3, Landroid/telephony/TelephonyManager;

    .line 63
    .line 64
    const-string v5, "getDefault"

    .line 65
    .line 66
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 85
    .line 86
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v3, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 95
    .line 96
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_0

    .line 121
    .line 122
    invoke-static {v4, v2}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-eqz v2, :cond_0

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 129
    .line 130
    .line 131
    :cond_0
    invoke-static {v3}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    invoke-static {p0, v3}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_1

    .line 146
    .line 147
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    .line 149
    .line 150
    :cond_1
    return-object v1

    .line 151
    :catchall_1
    return-object v0
.end method

.method private static G(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 6

    .line 1
    const-string v0, "phone"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "com.android.internal.telephony.PhoneFactory"

    .line 9
    .line 10
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "getServiceName"

    .line 15
    .line 16
    const-class v4, Ljava/lang/String;

    .line 17
    .line 18
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    filled-new-array {v0, v4}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v3}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_0

    .line 80
    .line 81
    invoke-static {v0, v3}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 88
    .line 89
    .line 90
    :cond_0
    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_1

    .line 99
    .line 100
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/ch;->a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_1

    .line 105
    .line 106
    invoke-virtual {v1, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_1
    return-object v1

    .line 110
    :catchall_0
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method private static H(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 8

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.telephony.MSimTelephonyManager"

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "phone_msim"

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "getDeviceId"

    .line 29
    .line 30
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v4, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v5}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const-string v7, ""

    .line 77
    .line 78
    if-eqz v6, :cond_0

    .line 79
    .line 80
    :try_start_1
    invoke-static {v1, p0, v2, v5, v7}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-static {v4}, Lcom/tendcloud/tenddata/ch;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_1

    .line 96
    .line 97
    invoke-static {v1, p0, v3, v4, v7}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    :cond_1
    return-object v0

    .line 105
    :catchall_0
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 2

    if-ltz p0, :cond_0

    .line 35
    sget-object v0, Lcom/tendcloud/tenddata/ch;->e:[Ljava/lang/String;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget-object p0, v0, p0

    return-object p0

    .line 36
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 3
    sget-object v0, Lcom/tendcloud/tenddata/ch;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Z)Lorg/json/JSONArray;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_1

    .line 37
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 38
    :cond_1
    :goto_0
    sget-object v1, Lcom/tendcloud/tenddata/ch;->m:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-gtz v1, :cond_8

    sget-boolean v1, Lcom/tendcloud/tenddata/ch;->k:Z

    if-eqz v1, :cond_2

    goto/16 :goto_2

    .line 39
    :cond_2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 40
    const-string v2, "type"

    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->n(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    const-string v2, "mcc"

    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    const-string v2, "operator"

    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    const-string v2, "country"

    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    .line 45
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    .line 46
    :cond_3
    sget-object v2, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    if-nez v2, :cond_4

    .line 47
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 48
    :cond_4
    sget-boolean p0, Lcom/tendcloud/tenddata/cq;->c:Z

    if-nez p0, :cond_5

    if-eqz p1, :cond_7

    :cond_5
    sget-boolean p0, Lcom/tendcloud/tenddata/ab;->Q:Z

    if-nez p0, :cond_7

    .line 49
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object p0

    .line 50
    instance-of p1, p0, Landroid/telephony/gsm/GsmCellLocation;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "basestationId"

    const-string v3, "networkId"

    const-string v4, "systemId"

    if-eqz p1, :cond_6

    .line 51
    :try_start_1
    check-cast p0, Landroid/telephony/gsm/GsmCellLocation;

    if-eqz p0, :cond_7

    .line 52
    invoke-virtual {p0}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I

    move-result p1

    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 53
    invoke-virtual {p0}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I

    move-result p1

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/16 p1, 0x9

    .line 54
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 55
    invoke-virtual {p0}, Landroid/telephony/gsm/GsmCellLocation;->getPsc()I

    move-result p0

    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_1

    .line 56
    :cond_6
    instance-of p1, p0, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz p1, :cond_7

    .line 57
    check-cast p0, Landroid/telephony/cdma/CdmaCellLocation;

    if-eqz p0, :cond_7

    .line 58
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getSystemId()I

    move-result p1

    invoke-virtual {v1, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 59
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getNetworkId()I

    move-result p1

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationId()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 61
    const-string p1, "location"

    .line 62
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationLatitude()I

    move-result v2

    .line 63
    invoke-virtual {p0}, Landroid/telephony/cdma/CdmaCellLocation;->getBaseStationLongitude()I

    move-result p0

    .line 64
    invoke-static {v2, p0}, Lcom/tendcloud/tenddata/ch;->a(II)Lorg/json/JSONObject;

    move-result-object p0

    .line 65
    invoke-virtual {v1, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 66
    sput-boolean p0, Lcom/tendcloud/tenddata/ch;->k:Z

    .line 67
    sget-object p0, Lcom/tendcloud/tenddata/ch;->m:Lorg/json/JSONArray;

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 68
    sget-object p0, Lcom/tendcloud/tenddata/ch;->m:Lorg/json/JSONArray;

    return-object p0

    .line 69
    :cond_8
    :goto_2
    sget-object p0, Lcom/tendcloud/tenddata/ch;->m:Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :catchall_0
    return-object v0
.end method

.method public static a(Ljava/util/ArrayList;I)Lorg/json/JSONArray;
    .locals 2

    .line 80
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/ch$4;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/ch$4;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 81
    new-instance v0, Lorg/json/JSONArray;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Ljava/util/BitSet;)Lorg/json/JSONArray;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 82
    :cond_0
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    return-object v0

    .line 83
    :cond_1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v1, 0x0

    .line 84
    :goto_0
    invoke-virtual {p0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    if-ltz v1, :cond_2

    .line 85
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static a(Lorg/json/JSONArray;I)Lorg/json/JSONArray;
    .locals 4

    .line 70
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 72
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 73
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 74
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/ch$2;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/ch$2;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 75
    new-instance p0, Lorg/json/JSONArray;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(II)Lorg/json/JSONObject;
    .locals 2

    .line 76
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 77
    :try_start_0
    const-string v1, "lat"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 78
    const-string p0, "lng"

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 79
    const-string p0, "unit"

    const-string p1, "qd"

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object v0
.end method

.method private static a(Landroid/content/Context;Landroid/telephony/SubscriptionManager;I)Lorg/json/JSONObject;
    .locals 3

    .line 108
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    const/16 v0, 0x16

    .line 109
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 110
    invoke-virtual {p1, p2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoForSimSlotIndex(I)Landroid/telephony/SubscriptionInfo;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 111
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getIccId()Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, ""

    if-nez p2, :cond_0

    move-object p2, v0

    goto :goto_0

    .line 112
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getIccId()Ljava/lang/String;

    move-result-object p2

    .line 113
    :goto_0
    const-string v1, "simSerialNumber"

    invoke-virtual {p0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    const-string p2, "simOperator"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getMcc()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getMnc()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-virtual {p0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    const-string p2, "simOperatorName"

    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v0

    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCarrierName()Ljava/lang/CharSequence;

    move-result-object v1

    .line 119
    :goto_1
    invoke-virtual {p0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 120
    const-string p2, "simCountryIso"

    .line 121
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCountryIso()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getCountryIso()Ljava/lang/String;

    move-result-object v0

    .line 122
    :goto_2
    invoke-virtual {p0, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    const-string p1, "subscriberId"

    const-string p2, "imsi"

    invoke-static {p2}, Lcom/tendcloud/tenddata/ce;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_3
    return-object p0
.end method

.method private static a(Landroid/telephony/TelephonyManager;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    .line 86
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 87
    const-string v1, "imei"

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    const-string v1, "imei5"

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    const-string p1, "subscriberId"

    .line 90
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v1

    .line 91
    :goto_0
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    const-string p1, "simSerialNumber"

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v1

    .line 94
    :goto_1
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    const-string p1, "dataState"

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDataState()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 96
    const-string p1, "networkType"

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/ch;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    const-string p1, "networkOperator"

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    const-string p1, "phoneType"

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/ch;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    const-string p1, "simOperator"

    .line 100
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v1

    .line 101
    :goto_2
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    const-string p1, "simOperatorName"

    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v1, v2

    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v1

    .line 104
    :goto_3
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    const-string p1, "simCountryIso"

    .line 106
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v2

    .line 107
    :goto_4
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .line 124
    const-string v0, ""

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 125
    const-string v3, "imei"

    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    const-string v3, "imei5"

    invoke-static {p3}, Lcom/tendcloud/tenddata/cq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 127
    :try_start_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSubscriberId"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 128
    const-string v3, "subscriberId"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    move-object p3, v0

    goto :goto_0

    :cond_0
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    .line 129
    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 130
    :goto_0
    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    :catchall_0
    :try_start_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSimSerialNumber"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 132
    const-string v3, "simSerialNumber"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    move-object p3, v0

    goto :goto_1

    :cond_1
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    .line 133
    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 134
    :goto_1
    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    :catchall_1
    :try_start_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDataState"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 136
    const-string v3, "dataState"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 137
    :catchall_2
    :try_start_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNetworkType"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 138
    const-string v3, "networkType"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    .line 139
    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p3}, Lcom/tendcloud/tenddata/ch;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 140
    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 141
    :catchall_3
    :try_start_4
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNetworkOperator"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 142
    const-string v3, "networkOperator"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 143
    :catchall_4
    :try_start_5
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPhoneType"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 144
    const-string v3, "phoneType"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    .line 145
    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {p3}, Lcom/tendcloud/tenddata/ch;->c(I)Ljava/lang/String;

    move-result-object p3

    .line 146
    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 147
    :catchall_5
    :try_start_6
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSimOperator"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p0, p3, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    .line 148
    const-string v3, "simOperator"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    move-object p3, v0

    goto :goto_2

    :cond_2
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v4

    .line 149
    invoke-virtual {p3, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 150
    :goto_2
    invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 151
    :catchall_6
    :try_start_7
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSimOperatorName"

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p0, p3, p4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    .line 152
    const-string p3, "simOperatorName"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p0, p1, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_3

    goto :goto_3

    :cond_3
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 153
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 154
    :goto_3
    invoke-virtual {v2, p3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :catchall_7
    return-object v2
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "phone"

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    sput-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static a([Ljava/lang/String;)V
    .locals 7

    .line 11
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 12
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 14
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/NetworkInterface;

    .line 15
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 17
    const-string v4, "wlan"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "eth"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "dummy"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 19
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    .line 20
    :cond_4
    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v2

    .line 21
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    goto :goto_3

    .line 23
    :cond_6
    new-instance v0, Lcom/tendcloud/tenddata/ch$1;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/ch$1;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_d

    .line 25
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 26
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/net/InetAddress;

    .line 27
    invoke-virtual {v3}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_2

    .line 28
    :cond_8
    instance-of v6, v3, Ljava/net/Inet4Address;

    if-eqz v6, :cond_9

    .line 29
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    aput-object v3, p0, v5

    goto :goto_2

    .line 30
    :cond_9
    instance-of v5, v3, Ljava/net/Inet6Address;

    if-eqz v5, :cond_7

    .line 31
    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 32
    const-string v5, "ff:fe"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_2

    .line 33
    :cond_a
    aput-object v3, p0, v4

    goto :goto_2

    .line 34
    :cond_b
    aget-object v2, p0, v5

    if-nez v2, :cond_d

    aget-object v2, p0, v4

    if-eqz v2, :cond_c

    goto :goto_3

    :cond_c
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_d
    :goto_3
    return-void
.end method

.method public static a()[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 4
    filled-new-array {v0, v0, v0, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 5
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->S:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    move-result v1

    .line 7
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->j(Landroid/content/Context;)Z

    move-result v2

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    .line 8
    const-string v1, "no-network"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/ca;->iForInternal([Ljava/lang/String;)V

    return-object v0

    :cond_1
    if-eqz v1, :cond_2

    .line 9
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/ch;->b([Ljava/lang/String;)V

    return-object v0

    :cond_2
    if-eqz v2, :cond_3

    .line 10
    invoke-static {v0}, Lcom/tendcloud/tenddata/ch;->a([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    :goto_0
    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    .line 54
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 55
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x30

    .line 56
    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v0, v3, :cond_1

    .line 59
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v2

    .line 60
    :catchall_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method private static b(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 44
    :pswitch_0
    :try_start_0
    const-string p0, "4G"

    return-object p0

    .line 45
    :pswitch_1
    const-string p0, "3G"

    return-object p0

    .line 46
    :pswitch_2
    const-string p0, "2G"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 47
    :catchall_0
    :goto_0
    const-string p0, "UNKNOWN"

    return-object p0

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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lorg/json/JSONArray;I)Lorg/json/JSONArray;
    .locals 4

    .line 48
    :try_start_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 50
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 51
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 52
    :cond_0
    new-instance p0, Lcom/tendcloud/tenddata/ch$3;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/ch$3;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 53
    new-instance p0, Lorg/json/JSONArray;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_1
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static b([Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/NetworkInterface;

    .line 4
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 5
    const-string v3, "wlan"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    if-eqz v2, :cond_2

    .line 9
    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    .line 12
    :cond_4
    instance-of v4, v2, Ljava/net/Inet4Address;

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 13
    aput-object v3, p0, v5

    goto :goto_1

    .line 14
    :cond_5
    instance-of v2, v2, Ljava/net/Inet6Address;

    if-eqz v2, :cond_2

    .line 15
    const-string v2, "%"

    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_6

    .line 16
    invoke-virtual {v3, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :cond_6
    const/4 v2, 0x1

    .line 17
    aput-object v3, p0, v2

    goto :goto_1

    :cond_7
    :goto_2
    return-void
.end method

.method public static b()Z
    .locals 1

    const/16 v0, 0xb

    .line 40
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    const-string v0, "http.proxyHost"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    .line 43
    :cond_0
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :catchall_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 7

    .line 18
    :try_start_0
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 19
    const-string v0, "connectivity"

    .line 20
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    if-eqz p0, :cond_4

    const/16 v0, 0x1d

    .line 21
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 23
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object p0

    if-eqz p0, :cond_0

    const/16 v0, 0xc

    .line 24
    invoke-virtual {p0, v0}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result p0

    if-eqz p0, :cond_0

    return v1

    :cond_0
    return v2

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 26
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0

    return p0

    .line 27
    :cond_2
    invoke-virtual {p0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 28
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object p0

    sget-object v0, Landroid/net/NetworkInfo$State;->UNKNOWN:Landroid/net/NetworkInfo$State;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    return v2

    .line 29
    :cond_4
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sget-wide v5, Lcom/tendcloud/tenddata/ch;->j:J

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x493e0

    cmp-long p0, v3, v5

    if-lez p0, :cond_7

    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sput-wide v3, Lcom/tendcloud/tenddata/ch;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 p0, 0x0

    .line 31
    :try_start_1
    invoke-static {}, Lcom/tendcloud/tenddata/ch;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 32
    new-instance v0, Ljava/net/Socket;

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v4

    invoke-direct {v0, v3, v4}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    :goto_1
    move-object p0, v0

    goto :goto_2

    .line 33
    :cond_5
    new-instance v0, Ljava/net/Socket;

    const-string v3, "www.talkingdata.net"

    const/16 v4, 0x50

    invoke-direct {v0, v3, v4}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V

    goto :goto_1

    .line 34
    :goto_2
    sput-boolean v1, Lcom/tendcloud/tenddata/ch;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    :goto_3
    :try_start_2
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    goto :goto_4

    .line 36
    :catchall_0
    :try_start_3
    sput-boolean v2, Lcom/tendcloud/tenddata/ch;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p0, :cond_7

    goto :goto_3

    :catchall_1
    move-exception v0

    if-eqz p0, :cond_6

    .line 37
    :try_start_4
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 38
    :catchall_2
    :cond_6
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 39
    :catchall_3
    :cond_7
    :goto_4
    sget-boolean p0, Lcom/tendcloud/tenddata/ch;->h:Z

    return p0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    .line 8
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    .line 10
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 11
    :catchall_0
    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 2

    if-ltz p0, :cond_0

    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/ch;->f:[Ljava/lang/String;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget-object p0, v0, p0

    return-object p0

    .line 7
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 25
    array-length v1, p0

    const/4 v2, 0x6

    if-ge v1, v2, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    .line 26
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 27
    aget-object v3, p0, v2

    .line 28
    const-string v4, "lladdr"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v1, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-lez v1, :cond_3

    .line 29
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 30
    aget-object p0, p0, v1

    .line 31
    const-string v1, "([\\da-fA-F]{2}:){5}([\\da-fA-F]{2}){1}"

    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "00:00:00:00:00:00"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return-object p0

    :cond_3
    :goto_2
    return-object v0
.end method

.method private static c()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x1d

    .line 12
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 13
    invoke-static {}, Lcom/tendcloud/tenddata/ch;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    new-instance v3, Ljava/io/File;

    const-string v4, "/proc/net/arp"

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 16
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 17
    const-string v3, "[ ]+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 18
    aget-object v4, v2, v3

    const-string v5, "IP"

    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 19
    aget-object v3, v2, v3

    const/4 v4, 0x3

    .line 20
    aget-object v2, v2, v4

    .line 21
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "00:00:00:00:00:00"

    .line 22
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 23
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 24
    :cond_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    const-string v1, "connectivity"

    .line 3
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    .line 4
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    :cond_0
    return v0
.end method

.method private static d()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "ip n"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 6
    :try_start_1
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 7
    :try_start_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 8
    :cond_0
    :goto_0
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    const-string v4, "lladdr"

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-le v4, v5, :cond_0

    .line 10
    const-string v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11
    array-length v4, v0

    const/4 v5, 0x5

    if-le v4, v5, :cond_0

    const/4 v4, 0x0

    .line 12
    aget-object v4, v0, v4

    .line 13
    invoke-static {v0}, Lcom/tendcloud/tenddata/ch;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 16
    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    :goto_1
    move-object v0, v2

    goto :goto_3

    .line 17
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Process;->waitFor()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 18
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 19
    :catchall_1
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Process;->destroy()V

    goto :goto_4

    :catchall_2
    move-object v3, v0

    goto :goto_1

    :catchall_3
    move-object v3, v0

    goto :goto_3

    :catchall_4
    move-object v1, v0

    move-object v3, v1

    :goto_3
    if-eqz v0, :cond_3

    .line 20
    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :catchall_5
    :cond_3
    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_4
    return-object v3
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 2
    :cond_0
    const-string v0, "wifi"

    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/wifi/WifiManager;

    .line 4
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimState()I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x5

    .line 16
    if-ne p0, v1, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :catchall_0
    :cond_1
    return v0
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    const-string v1, "connectivity"

    .line 3
    .line 4
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 9
    .line 10
    const-class v1, Landroid/net/ConnectivityManager;

    .line 11
    .line 12
    const-string v2, "getMobileDataEnabled"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    return p0

    .line 33
    :catchall_0
    return v0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const-string v2, "airplane_mode_on"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-ne p0, v3, :cond_0

    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    return v1

    .line 25
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, v2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-ne p0, v3, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :catchall_0
    :cond_2
    return v1
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimState()I

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v1, p0, :cond_1

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :catchall_0
    :cond_1
    return v0
.end method

.method public static i(Landroid/content/Context;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_1

    .line 3
    .line 4
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0

    .line 10
    :cond_1
    :goto_0
    :try_start_0
    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    const-string v1, "connectivity"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 25
    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    const/16 v1, 0x1d

    .line 29
    .line 30
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    return v2

    .line 56
    :cond_2
    return v0

    .line 57
    :cond_3
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v2, v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 70
    .line 71
    .line 72
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    return v2

    .line 76
    :catchall_0
    :cond_4
    return v0
.end method

.method public static j(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_1

    .line 3
    .line 4
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return v0

    .line 10
    :cond_1
    :goto_0
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    :cond_2
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDataState()I

    .line 20
    .line 21
    .line 22
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-ne p0, v1, :cond_3

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :catchall_0
    :cond_3
    return v0
.end method

.method public static k(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->b(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "OFFLINE"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p0, "WIFI"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->n(Landroid/content/Context;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static l(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->b(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "offline"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    const-string p0, "wifi"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-string p0, "cellular"

    .line 20
    .line 21
    return-object p0
.end method

.method public static m(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "UNKNOWN"

    .line 2
    .line 3
    if-nez p0, :cond_1

    .line 4
    .line 5
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object v0

    .line 11
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->b(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_2
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    const-string p0, "WIFI"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_3
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->n(Landroid/content/Context;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->b(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static n(Landroid/content/Context;)I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    .line 17
    .line 18
    .line 19
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    return p0

    .line 21
    :catchall_0
    :cond_2
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static o(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static q(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v2, "wifi"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const-string v2, "android.permission.ACCESS_WIFI_STATE"

    .line 22
    .line 23
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    return-object v1
.end method

.method public static r(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static s(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static t(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static tryGetDoubleSimInfoReCheck(Landroid/content/Context;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->w:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-gtz v0, :cond_1

    .line 8
    .line 9
    sget-boolean v0, Lcom/tendcloud/tenddata/ch;->x:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->D(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static u(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 9

    .line 1
    const-string v0, "scannable"

    .line 2
    .line 3
    const-string v1, "current"

    .line 4
    .line 5
    const-string v2, "connected"

    .line 6
    .line 7
    const-string v3, "available"

    .line 8
    .line 9
    const-string v4, "type"

    .line 10
    .line 11
    new-instance v5, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v7, "wifi"

    .line 22
    .line 23
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->d(Landroid/content/Context;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-virtual {v6, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {v6, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->y(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v6, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->z(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    const-string v7, "configured"

    .line 55
    .line 56
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->x(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :catchall_0
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    .line 67
    .line 68
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v7, "cellular"

    .line 72
    .line 73
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->e(Landroid/content/Context;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->j(Landroid/content/Context;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-static {p0, v2}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;Z)Lorg/json/JSONArray;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v6, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->v(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v6, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    :catchall_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-lez p0, :cond_0

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    const/4 v5, 0x0

    .line 116
    :goto_0
    return-object v5
.end method

.method public static v(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 17
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 1
    const-string v0, "cdmaDbm"

    .line 2
    .line 3
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    if-nez p0, :cond_2

    .line 10
    .line 11
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    return-object v2

    .line 17
    :cond_2
    move-object/from16 v1, p0

    .line 18
    .line 19
    :goto_0
    sget-object v3, Lcom/tendcloud/tenddata/ch;->n:Lorg/json/JSONArray;

    .line 20
    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-gtz v3, :cond_3

    .line 28
    .line 29
    sget-boolean v3, Lcom/tendcloud/tenddata/ch;->l:Z

    .line 30
    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    :cond_3
    sget-object v0, Lcom/tendcloud/tenddata/ch;->n:Lorg/json/JSONArray;

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_4
    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    .line 37
    .line 38
    invoke-static {v1, v3}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_5

    .line 43
    .line 44
    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    .line 45
    .line 46
    invoke-static {v1, v3}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_5

    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_5
    :try_start_0
    sget-object v3, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 54
    .line 55
    if-nez v3, :cond_6

    .line 56
    .line 57
    invoke-static {v1}, Lcom/tendcloud/tenddata/ch;->a(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-object/from16 v16, v2

    .line 62
    .line 63
    goto/16 :goto_9

    .line 64
    .line 65
    :cond_6
    :goto_1
    new-instance v1, Lorg/json/JSONArray;

    .line 66
    .line 67
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 68
    .line 69
    .line 70
    const/16 v3, 0x11

    .line 71
    .line 72
    invoke-static {v3}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 73
    .line 74
    .line 75
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const-string v4, "type"

    .line 77
    .line 78
    const-string v5, "asuLevel"

    .line 79
    .line 80
    const-string v6, "basestationId"

    .line 81
    .line 82
    const-string v7, "systemId"

    .line 83
    .line 84
    if-eqz v3, :cond_12

    .line 85
    .line 86
    :try_start_1
    sget-object v3, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getAllCellInfo()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_11

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_11

    .line 103
    .line 104
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Landroid/telephony/CellInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    :try_start_2
    new-instance v9, Lorg/json/JSONObject;

    .line 111
    .line 112
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v10, "registered"

    .line 116
    .line 117
    invoke-virtual {v8}, Landroid/telephony/CellInfo;->isRegistered()Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string v10, "ts"

    .line 125
    .line 126
    invoke-virtual {v8}, Landroid/telephony/CellInfo;->getTimeStamp()J

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    invoke-virtual {v9, v10, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    instance-of v10, v8, Landroid/telephony/CellInfoGsm;

    .line 134
    .line 135
    if-eqz v10, :cond_7

    .line 136
    .line 137
    const-string v10, "GSM"

    .line 138
    .line 139
    check-cast v8, Landroid/telephony/CellInfoGsm;

    .line 140
    .line 141
    invoke-virtual {v8}, Landroid/telephony/CellInfoGsm;->getCellIdentity()Landroid/telephony/CellIdentityGsm;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-virtual {v12}, Landroid/telephony/CellIdentityGsm;->getLac()I

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    invoke-virtual {v12}, Landroid/telephony/CellIdentityGsm;->getCid()I

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    invoke-virtual {v12}, Landroid/telephony/CellIdentityGsm;->getMcc()I

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    invoke-virtual {v12}, Landroid/telephony/CellIdentityGsm;->getMnc()I

    .line 158
    .line 159
    .line 160
    move-result v12

    .line 161
    invoke-virtual {v8}, Landroid/telephony/CellInfoGsm;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthGsm;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    move-object/from16 v16, v2

    .line 166
    .line 167
    move v11, v15

    .line 168
    const/4 v2, -0x1

    .line 169
    :goto_3
    const/4 v15, -0x1

    .line 170
    goto/16 :goto_5

    .line 171
    .line 172
    :catchall_1
    move-object/from16 v16, v2

    .line 173
    .line 174
    goto/16 :goto_6

    .line 175
    .line 176
    :cond_7
    instance-of v10, v8, Landroid/telephony/CellInfoCdma;

    .line 177
    .line 178
    if-eqz v10, :cond_8

    .line 179
    .line 180
    const-string v10, "CDMA"

    .line 181
    .line 182
    check-cast v8, Landroid/telephony/CellInfoCdma;

    .line 183
    .line 184
    invoke-virtual {v8}, Landroid/telephony/CellInfoCdma;->getCellIdentity()Landroid/telephony/CellIdentityCdma;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getSystemId()I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getNetworkId()I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getBasestationId()I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    invoke-virtual {v8}, Landroid/telephony/CellInfoCdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthCdma;

    .line 201
    .line 202
    .line 203
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 204
    move-object/from16 v16, v2

    .line 205
    .line 206
    :try_start_3
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaDbm()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaDbm()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    invoke-virtual {v9, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 218
    .line 219
    .line 220
    const-string v2, "cdmaEcio"

    .line 221
    .line 222
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrengthCdma;->getCdmaEcio()I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    invoke-virtual {v9, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    const-string v2, "evdoDbm"

    .line 230
    .line 231
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrengthCdma;->getEvdoDbm()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    invoke-virtual {v9, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 236
    .line 237
    .line 238
    const-string v2, "evdoEcio"

    .line 239
    .line 240
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrengthCdma;->getEvdoEcio()I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    invoke-virtual {v9, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 245
    .line 246
    .line 247
    const-string v2, "evdoSnr"

    .line 248
    .line 249
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrengthCdma;->getEvdoSnr()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    invoke-virtual {v9, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    const-string v2, "location"

    .line 257
    .line 258
    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getLatitude()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    invoke-virtual {v12}, Landroid/telephony/CellIdentityCdma;->getLongitude()I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    invoke-static {v11, v12}, Lcom/tendcloud/tenddata/ch;->a(II)Lorg/json/JSONObject;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    invoke-virtual {v9, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 271
    .line 272
    .line 273
    const/4 v2, -0x1

    .line 274
    const/4 v11, -0x1

    .line 275
    const/4 v12, -0x1

    .line 276
    goto :goto_5

    .line 277
    :cond_8
    move-object/from16 v16, v2

    .line 278
    .line 279
    instance-of v2, v8, Landroid/telephony/CellInfoWcdma;

    .line 280
    .line 281
    if-eqz v2, :cond_9

    .line 282
    .line 283
    const-string v10, "WCDMA"

    .line 284
    .line 285
    check-cast v8, Landroid/telephony/CellInfoWcdma;

    .line 286
    .line 287
    invoke-virtual {v8}, Landroid/telephony/CellInfoWcdma;->getCellIdentity()Landroid/telephony/CellIdentityWcdma;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v2}, Landroid/telephony/CellIdentityWcdma;->getLac()I

    .line 292
    .line 293
    .line 294
    move-result v13

    .line 295
    invoke-virtual {v2}, Landroid/telephony/CellIdentityWcdma;->getCid()I

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    invoke-virtual {v2}, Landroid/telephony/CellIdentityWcdma;->getPsc()I

    .line 300
    .line 301
    .line 302
    move-result v15

    .line 303
    invoke-virtual {v2}, Landroid/telephony/CellIdentityWcdma;->getMcc()I

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    invoke-virtual {v2}, Landroid/telephony/CellIdentityWcdma;->getMnc()I

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    invoke-virtual {v8}, Landroid/telephony/CellInfoWcdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthWcdma;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    :goto_4
    const/4 v2, -0x1

    .line 316
    goto :goto_5

    .line 317
    :cond_9
    instance-of v2, v8, Landroid/telephony/CellInfoLte;

    .line 318
    .line 319
    if-eqz v2, :cond_a

    .line 320
    .line 321
    const-string v10, "LTE"

    .line 322
    .line 323
    check-cast v8, Landroid/telephony/CellInfoLte;

    .line 324
    .line 325
    invoke-virtual {v8}, Landroid/telephony/CellInfoLte;->getCellIdentity()Landroid/telephony/CellIdentityLte;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v2}, Landroid/telephony/CellIdentityLte;->getTac()I

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    invoke-virtual {v2}, Landroid/telephony/CellIdentityLte;->getPci()I

    .line 334
    .line 335
    .line 336
    move-result v14

    .line 337
    invoke-virtual {v2}, Landroid/telephony/CellIdentityLte;->getCi()I

    .line 338
    .line 339
    .line 340
    move-result v15

    .line 341
    invoke-virtual {v2}, Landroid/telephony/CellIdentityLte;->getMcc()I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    invoke-virtual {v2}, Landroid/telephony/CellIdentityLte;->getMnc()I

    .line 346
    .line 347
    .line 348
    move-result v12

    .line 349
    invoke-virtual {v8}, Landroid/telephony/CellInfoLte;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthLte;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    goto :goto_4

    .line 354
    :cond_a
    move-object/from16 v8, v16

    .line 355
    .line 356
    move-object v10, v8

    .line 357
    const/4 v2, -0x1

    .line 358
    const/4 v11, -0x1

    .line 359
    const/4 v12, -0x1

    .line 360
    const/4 v13, -0x1

    .line 361
    const/4 v14, -0x1

    .line 362
    goto/16 :goto_3

    .line 363
    .line 364
    :goto_5
    if-eq v13, v2, :cond_b

    .line 365
    .line 366
    invoke-virtual {v9, v7, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 367
    .line 368
    .line 369
    :cond_b
    if-eq v14, v2, :cond_c

    .line 370
    .line 371
    const-string v13, "networkId"

    .line 372
    .line 373
    invoke-virtual {v9, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 374
    .line 375
    .line 376
    :cond_c
    if-eq v15, v2, :cond_d

    .line 377
    .line 378
    invoke-virtual {v9, v6, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 379
    .line 380
    .line 381
    :cond_d
    if-eq v11, v2, :cond_e

    .line 382
    .line 383
    const-string v13, "mcc"

    .line 384
    .line 385
    invoke-virtual {v9, v13, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 386
    .line 387
    .line 388
    :cond_e
    if-eq v12, v2, :cond_f

    .line 389
    .line 390
    const-string v2, "mnc"

    .line 391
    .line 392
    invoke-virtual {v9, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 393
    .line 394
    .line 395
    :cond_f
    if-eqz v8, :cond_10

    .line 396
    .line 397
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrength;->getAsuLevel()I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    invoke-virtual {v9, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 402
    .line 403
    .line 404
    const-string v2, "dbm"

    .line 405
    .line 406
    invoke-virtual {v8}, Landroid/telephony/CellSignalStrength;->getDbm()I

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    invoke-virtual {v9, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 411
    .line 412
    .line 413
    :cond_10
    invoke-virtual {v9, v4, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 417
    .line 418
    .line 419
    :catchall_2
    :goto_6
    move-object/from16 v2, v16

    .line 420
    .line 421
    goto/16 :goto_2

    .line 422
    .line 423
    :cond_11
    move-object/from16 v16, v2

    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_12
    move-object/from16 v16, v2

    .line 427
    .line 428
    const/4 v0, 0x5

    .line 429
    :try_start_4
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_13

    .line 434
    .line 435
    sget-boolean v0, Lcom/tendcloud/tenddata/cq;->c:Z

    .line 436
    .line 437
    if-eqz v0, :cond_13

    .line 438
    .line 439
    sget-object v0, Lcom/tendcloud/tenddata/ch;->c:Landroid/telephony/TelephonyManager;

    .line 440
    .line 441
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNeighboringCellInfo()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-eqz v0, :cond_13

    .line 446
    .line 447
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    :catchall_3
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-eqz v2, :cond_13

    .line 456
    .line 457
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    check-cast v2, Landroid/telephony/NeighboringCellInfo;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 462
    .line 463
    :try_start_5
    new-instance v3, Lorg/json/JSONObject;

    .line 464
    .line 465
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, Landroid/telephony/NeighboringCellInfo;->getLac()I

    .line 469
    .line 470
    .line 471
    move-result v8

    .line 472
    invoke-virtual {v3, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 473
    .line 474
    .line 475
    const-string v8, "netId"

    .line 476
    .line 477
    invoke-virtual {v2}, Landroid/telephony/NeighboringCellInfo;->getCid()I

    .line 478
    .line 479
    .line 480
    move-result v9

    .line 481
    invoke-virtual {v3, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2}, Landroid/telephony/NeighboringCellInfo;->getPsc()I

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    invoke-virtual {v3, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v2}, Landroid/telephony/NeighboringCellInfo;->getRssi()I

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    invoke-virtual {v3, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2}, Landroid/telephony/NeighboringCellInfo;->getNetworkType()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 506
    .line 507
    .line 508
    goto :goto_7

    .line 509
    :cond_13
    :goto_8
    const/4 v0, 0x1

    .line 510
    :try_start_6
    sput-boolean v0, Lcom/tendcloud/tenddata/ch;->l:Z

    .line 511
    .line 512
    const/16 v0, 0x14

    .line 513
    .line 514
    invoke-static {v1, v0}, Lcom/tendcloud/tenddata/ch;->a(Lorg/json/JSONArray;I)Lorg/json/JSONArray;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Lcom/tendcloud/tenddata/ch;->n:Lorg/json/JSONArray;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 519
    .line 520
    return-object v0

    .line 521
    :catchall_4
    :goto_9
    return-object v16
.end method

.method public static w(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    :try_start_0
    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v0, "wifi"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    :catchall_0
    :cond_1
    return-object v1
.end method

.method public static x(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 6

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/ab;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    sget-object v0, Lcom/tendcloud/tenddata/ch;->s:Lorg/json/JSONArray;

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    sget-boolean v0, Lcom/tendcloud/tenddata/ch;->p:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    :cond_1
    sget-object p0, Lcom/tendcloud/tenddata/ch;->s:Lorg/json/JSONArray;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    :try_start_0
    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    .line 25
    .line 26
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    const-string v0, "wifi"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Landroid/net/wifi/WifiManager;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    new-instance v0, Lorg/json/JSONArray;

    .line 47
    .line 48
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :catchall_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Landroid/net/wifi/WifiConfiguration;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 66
    .line 67
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 68
    .line 69
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "networkId"

    .line 73
    .line 74
    iget v5, v2, Landroid/net/wifi/WifiConfiguration;->networkId:I

    .line 75
    .line 76
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    const-string v4, "priority"

    .line 80
    .line 81
    iget v5, v2, Landroid/net/wifi/WifiConfiguration;->priority:I

    .line 82
    .line 83
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    const-string v4, "name"

    .line 87
    .line 88
    iget-object v5, v2, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    const-string v4, "id"

    .line 94
    .line 95
    iget-object v2, v2, Landroid/net/wifi/WifiConfiguration;->BSSID:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    const/4 p0, 0x1

    .line 105
    :try_start_2
    sput-boolean p0, Lcom/tendcloud/tenddata/ch;->p:Z

    .line 106
    .line 107
    const/16 p0, 0x1e

    .line 108
    .line 109
    invoke-static {v0, p0}, Lcom/tendcloud/tenddata/ch;->b(Lorg/json/JSONArray;I)Lorg/json/JSONArray;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    sput-object p0, Lcom/tendcloud/tenddata/ch;->s:Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    .line 115
    return-object p0

    .line 116
    :catchall_1
    :cond_4
    return-object v1
.end method

.method public static y(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 7

    .line 1
    const-string v0, "ip"

    .line 2
    .line 3
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->R:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    sget-object v1, Lcom/tendcloud/tenddata/ch;->r:Lorg/json/JSONArray;

    .line 10
    .line 11
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gtz v1, :cond_4

    .line 16
    .line 17
    sget-boolean v1, Lcom/tendcloud/tenddata/ch;->o:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_1
    :try_start_0
    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    .line 24
    .line 25
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    const-string v1, "wifi"

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Landroid/net/wifi/WifiManager;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    const-string v3, "bssid"

    .line 52
    .line 53
    invoke-static {v3}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v4, Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    .line 61
    .line 62
    :try_start_1
    const-string v5, "name"

    .line 63
    .line 64
    const-string v6, "ssid"

    .line 65
    .line 66
    invoke-static {v6}, Lcom/tendcloud/tenddata/ch;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v5, "id"

    .line 74
    .line 75
    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string v3, "level"

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string v3, "hidden"

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getHiddenSSID()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v4, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    const-string v3, "speed"

    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getLinkSpeed()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    const-string v3, "networkId"

    .line 113
    .line 114
    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getNetworkId()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-virtual {v4, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eqz p0, :cond_2

    .line 126
    .line 127
    new-instance v1, Lorg/json/JSONObject;

    .line 128
    .line 129
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v3, "dns1"

    .line 133
    .line 134
    iget v5, p0, Landroid/net/DhcpInfo;->dns1:I

    .line 135
    .line 136
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string v3, "dns2"

    .line 140
    .line 141
    iget v5, p0, Landroid/net/DhcpInfo;->dns2:I

    .line 142
    .line 143
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    const-string v3, "gw"

    .line 147
    .line 148
    iget v5, p0, Landroid/net/DhcpInfo;->gateway:I

    .line 149
    .line 150
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    iget v3, p0, Landroid/net/DhcpInfo;->ipAddress:I

    .line 154
    .line 155
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    const-string v0, "mask"

    .line 159
    .line 160
    iget v3, p0, Landroid/net/DhcpInfo;->netmask:I

    .line 161
    .line 162
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    const-string v0, "server"

    .line 166
    .line 167
    iget v3, p0, Landroid/net/DhcpInfo;->serverAddress:I

    .line 168
    .line 169
    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    const-string v0, "leaseDuration"

    .line 173
    .line 174
    iget p0, p0, Landroid/net/DhcpInfo;->leaseDuration:I

    .line 175
    .line 176
    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 177
    .line 178
    .line 179
    const-string p0, "dhcp"

    .line 180
    .line 181
    invoke-virtual {v4, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 182
    .line 183
    .line 184
    :catchall_0
    :cond_2
    const/4 p0, 0x1

    .line 185
    :try_start_2
    sput-boolean p0, Lcom/tendcloud/tenddata/ch;->o:Z

    .line 186
    .line 187
    sget-object p0, Lcom/tendcloud/tenddata/ch;->r:Lorg/json/JSONArray;

    .line 188
    .line 189
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 190
    .line 191
    .line 192
    sget-object p0, Lcom/tendcloud/tenddata/ch;->r:Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 193
    .line 194
    return-object p0

    .line 195
    :catchall_1
    :cond_3
    return-object v2

    .line 196
    :cond_4
    :goto_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->r:Lorg/json/JSONArray;

    .line 197
    .line 198
    return-object p0
.end method

.method public static declared-synchronized z(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 13

    .line 1
    const-class v0, Lcom/tendcloud/tenddata/ch;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/tendcloud/tenddata/cq;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->R:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v2

    .line 17
    :cond_1
    :try_start_2
    sget-object v1, Lcom/tendcloud/tenddata/ch;->t:Lorg/json/JSONArray;

    .line 18
    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-gtz v1, :cond_2

    .line 26
    .line 27
    sget-boolean v1, Lcom/tendcloud/tenddata/ch;->q:Z

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_2
    :goto_0
    sget-object p0, Lcom/tendcloud/tenddata/ch;->t:Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    return-object p0

    .line 39
    :cond_3
    :try_start_3
    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    .line 40
    .line 41
    invoke-static {p0, v1}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_9

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v3, "wifi"

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroid/net/wifi/WifiManager;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_4

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->isScanAlwaysAvailable()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_9

    .line 70
    .line 71
    :cond_4
    const-string v3, "android.permission.CHANGE_WIFI_STATE"

    .line 72
    .line 73
    invoke-static {p0, v3}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/4 v4, 0x1

    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    sget-boolean v3, Lcom/tendcloud/tenddata/ch;->u:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 81
    .line 82
    if-nez v3, :cond_5

    .line 83
    .line 84
    :try_start_4
    new-instance v3, Landroid/content/IntentFilter;

    .line 85
    .line 86
    const-string v5, "android.net.wifi.SCAN_RESULTS"

    .line 87
    .line 88
    invoke-direct {v3, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v5, Lcom/tendcloud/tenddata/ch;->v:Lcom/tendcloud/tenddata/ch$b;

    .line 92
    .line 93
    invoke-virtual {p0, v5, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 94
    .line 95
    .line 96
    :catchall_1
    :try_start_5
    sput-boolean v4, Lcom/tendcloud/tenddata/ch;->u:Z

    .line 97
    .line 98
    :cond_5
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 99
    .line 100
    .line 101
    sget-object p0, Lcom/tendcloud/tenddata/ch;->v:Lcom/tendcloud/tenddata/ch$b;

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ch$b;->await()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object v1, Lcom/tendcloud/tenddata/ch;->v:Lcom/tendcloud/tenddata/ch$b;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/ch$b;->reset()V

    .line 113
    .line 114
    .line 115
    if-eqz p0, :cond_9

    .line 116
    .line 117
    new-instance v1, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :catchall_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_8

    .line 131
    .line 132
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Landroid/net/wifi/ScanResult;

    .line 137
    .line 138
    iget v5, v3, Landroid/net/wifi/ScanResult;->level:I

    .line 139
    .line 140
    const/16 v6, -0x55

    .line 141
    .line 142
    if-ge v5, v6, :cond_6

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    new-instance v5, Lorg/json/JSONObject;

    .line 146
    .line 147
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 148
    .line 149
    .line 150
    :try_start_6
    const-string v6, "id"

    .line 151
    .line 152
    iget-object v7, v3, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    const-string v6, "name"

    .line 158
    .line 159
    iget-object v7, v3, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    .line 163
    .line 164
    const-string v6, "level"

    .line 165
    .line 166
    iget v7, v3, Landroid/net/wifi/ScanResult;->level:I

    .line 167
    .line 168
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 169
    .line 170
    .line 171
    const-string v6, "freq"

    .line 172
    .line 173
    iget v7, v3, Landroid/net/wifi/ScanResult;->frequency:I

    .line 174
    .line 175
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    const/16 v6, 0x11

    .line 179
    .line 180
    invoke-static {v6}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    if-eqz v6, :cond_7

    .line 185
    .line 186
    const-string v6, "ts"

    .line 187
    .line 188
    iget-wide v7, v3, Landroid/net/wifi/ScanResult;->timestamp:J

    .line 189
    .line 190
    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 191
    .line 192
    .line 193
    const-string v6, "scanTs"

    .line 194
    .line 195
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 196
    .line 197
    .line 198
    move-result-wide v7

    .line 199
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 200
    .line 201
    .line 202
    move-result-wide v9

    .line 203
    sub-long/2addr v7, v9

    .line 204
    iget-wide v9, v3, Landroid/net/wifi/ScanResult;->timestamp:J

    .line 205
    .line 206
    const-wide/16 v11, 0x3e8

    .line 207
    .line 208
    div-long/2addr v9, v11

    .line 209
    add-long/2addr v7, v9

    .line 210
    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 211
    .line 212
    .line 213
    :cond_7
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_8
    :try_start_7
    sput-boolean v4, Lcom/tendcloud/tenddata/ch;->q:Z

    .line 218
    .line 219
    const/16 p0, 0x14

    .line 220
    .line 221
    invoke-static {v1, p0}, Lcom/tendcloud/tenddata/ch;->a(Ljava/util/ArrayList;I)Lorg/json/JSONArray;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    sput-object p0, Lcom/tendcloud/tenddata/ch;->t:Lorg/json/JSONArray;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 226
    .line 227
    monitor-exit v0

    .line 228
    return-object p0

    .line 229
    :catchall_3
    :cond_9
    monitor-exit v0

    .line 230
    return-object v2

    .line 231
    :goto_2
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 232
    throw p0
.end method
