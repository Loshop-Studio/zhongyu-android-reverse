.class public Lorg/android/agoo/control/AgooFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEAL_MESSAGE:Ljava/lang/String; = "accs.msgRecevie"

.field private static final TAG:Ljava/lang/String; = "AgooFactory"

.field private static sContext:Landroid/content/Context;

.field private static sInstance:Lorg/android/agoo/control/AgooFactory;


# instance fields
.field private mCacheMessageEnabled:Z

.field private messageService:Lorg/android/agoo/message/MessageService;

.field private notifyManager:Lorg/android/agoo/control/NotifManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Lorg/android/agoo/control/AgooFactory;->mCacheMessageEnabled:Z

    .line 11
    .line 12
    invoke-direct {p0, p1, v0, v0}, Lorg/android/agoo/control/AgooFactory;->init(Landroid/content/Context;Lorg/android/agoo/control/NotifManager;Lorg/android/agoo/message/MessageService;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic access$000()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$100(Lorg/android/agoo/control/AgooFactory;)Lorg/android/agoo/message/MessageService;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lorg/android/agoo/control/AgooFactory;)Lorg/android/agoo/control/NotifManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 2
    .line 3
    return-object p0
.end method

.method private static checkPackage(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :catchall_0
    :cond_0
    return v0
.end method

.method private static downgradeV1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "AgooFactory"

    .line 5
    .line 6
    const-string v3, "v2 downgrade to v1 decrypt message"

    .line 7
    .line 8
    invoke-static {v2, v3, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 12
    .line 13
    const-string v3, "EMAS_ACCS_SDK"

    .line 14
    .line 15
    invoke-static {v3, v1}, Lcom/taobao/accs/utl/UtilityImpl;->getUtdids(Ljava/lang/String;Landroid/content/Context;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v5, v0

    .line 30
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ge v5, v6, :cond_2

    .line 35
    .line 36
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p0, p1, p2, v6}, Lorg/android/agoo/control/AgooFactory;->parseEncryptedMsgWithoutAgooByUtdid(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-eqz v6, :cond_1

    .line 47
    .line 48
    sget-object p0, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 49
    .line 50
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v3, p0, p1}, Lcom/taobao/accs/utl/UtilityImpl;->hitUtdid(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string p0, "use v1 decrypt message successfully"

    .line 60
    .line 61
    new-array p1, v0, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v2, p0, p1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object v6

    .line 67
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    :goto_1
    return-object v4
.end method

.method private static getFlag(JLorg/android/agoo/common/MsgDO;)Landroid/os/Bundle;
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    new-instance v1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_4

    .line 17
    .line 18
    array-length p1, p0

    .line 19
    const/16 v2, 0x8

    .line 20
    .line 21
    if-gt v2, p1, :cond_4

    .line 22
    .line 23
    array-length p1, p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v3, 0x1

    .line 25
    const-string v4, "1"

    .line 26
    .line 27
    const/16 v5, 0x31

    .line 28
    .line 29
    if-gt v2, p1, :cond_1

    .line 30
    .line 31
    :try_start_1
    const-string p1, "encrypted"

    .line 32
    .line 33
    new-instance v6, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    aget-char v0, p0, v3

    .line 50
    .line 51
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    aget-char v8, p0, v0

    .line 56
    .line 57
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/4 v8, 0x3

    .line 61
    aget-char v8, p0, v8

    .line 62
    .line 63
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const/4 v8, 0x4

    .line 67
    aget-char v8, p0, v8

    .line 68
    .line 69
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v7, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v1, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x6

    .line 91
    aget-char p1, p0, p1

    .line 92
    .line 93
    if-ne p1, v5, :cond_0

    .line 94
    .line 95
    const-string p1, "report"

    .line 96
    .line 97
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iput-object v4, p2, Lorg/android/agoo/common/MsgDO;->reportStr:Ljava/lang/String;

    .line 101
    .line 102
    :cond_0
    const/4 p1, 0x7

    .line 103
    aget-char p1, p0, p1

    .line 104
    .line 105
    if-ne p1, v5, :cond_1

    .line 106
    .line 107
    const-string p1, "notify"

    .line 108
    .line 109
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    array-length p1, p0

    .line 113
    const/16 p2, 0x9

    .line 114
    .line 115
    if-gt p2, p1, :cond_2

    .line 116
    .line 117
    aget-char p1, p0, v2

    .line 118
    .line 119
    if-ne p1, v5, :cond_2

    .line 120
    .line 121
    const-string p1, "has_test"

    .line 122
    .line 123
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    array-length p1, p0

    .line 127
    const/16 v0, 0xa

    .line 128
    .line 129
    if-gt v0, p1, :cond_3

    .line 130
    .line 131
    aget-char p1, p0, p2

    .line 132
    .line 133
    if-ne p1, v5, :cond_3

    .line 134
    .line 135
    const-string p1, "duplicate"

    .line 136
    .line 137
    invoke-virtual {v1, p1, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_3
    array-length p1, p0

    .line 141
    const/16 p2, 0xb

    .line 142
    .line 143
    if-gt p2, p1, :cond_4

    .line 144
    .line 145
    aget-char p0, p0, v0

    .line 146
    .line 147
    if-ne p0, v5, :cond_4

    .line 148
    .line 149
    const-string p0, "popup"

    .line 150
    .line 151
    invoke-virtual {v1, p0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    .line 154
    :catchall_0
    :cond_4
    return-object v1
.end method

.method public static getInstance(Landroid/content/Context;)Lorg/android/agoo/control/AgooFactory;
    .locals 2

    .line 1
    sget-object v0, Lorg/android/agoo/control/AgooFactory;->sInstance:Lorg/android/agoo/control/AgooFactory;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lorg/android/agoo/control/AgooFactory;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lorg/android/agoo/control/AgooFactory;->sInstance:Lorg/android/agoo/control/AgooFactory;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lorg/android/agoo/control/AgooFactory;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v1, p0}, Lorg/android/agoo/control/AgooFactory;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lorg/android/agoo/control/AgooFactory;->sInstance:Lorg/android/agoo/control/AgooFactory;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v0

    .line 27
    goto :goto_2

    .line 28
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_2
    sget-object p0, Lorg/android/agoo/control/AgooFactory;->sInstance:Lorg/android/agoo/control/AgooFactory;

    .line 31
    .line 32
    return-object p0
.end method

.method private init(Landroid/content/Context;Lorg/android/agoo/control/NotifManager;Lorg/android/agoo/message/MessageService;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sput-object p1, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance p1, Lorg/android/agoo/control/NotifManager;

    .line 12
    .line 13
    invoke-direct {p1}, Lorg/android/agoo/control/NotifManager;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 19
    .line 20
    sget-object p2, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lorg/android/agoo/control/NotifManager;->init(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 26
    .line 27
    if-nez p3, :cond_1

    .line 28
    .line 29
    new-instance p1, Lorg/android/agoo/message/MessageService;

    .line 30
    .line 31
    invoke-direct {p1}, Lorg/android/agoo/message/MessageService;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 35
    .line 36
    :cond_1
    iget-object p1, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 37
    .line 38
    sget-object p2, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lorg/android/agoo/message/MessageService;->a(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static msgReceiverPreHandlerOnly(Landroid/content/Context;[BLjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "ext"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "AgooFactory"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    array-length v6, v0

    .line 14
    if-gtz v6, :cond_1

    .line 15
    .line 16
    :cond_0
    move-object/from16 v16, v3

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    goto/16 :goto_9

    .line 21
    .line 22
    :cond_1
    new-instance v6, Ljava/lang/String;

    .line 23
    .line 24
    const-string v7, "utf-8"

    .line 25
    .line 26
    invoke-direct {v6, v0, v7}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v7, "msgReceiveOnly,message--->["

    .line 43
    .line 44
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v7, "],utdid="

    .line 51
    .line 52
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-static/range {p0 .. p0}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-array v7, v5, [Ljava/lang/Object;

    .line 67
    .line 68
    invoke-static {v4, v0, v7}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object/from16 v16, v3

    .line 74
    .line 75
    goto/16 :goto_a

    .line 76
    .line 77
    :cond_2
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v1, "handleMessage message==null,utdid="

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static/range {p0 .. p0}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-array v1, v5, [Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v4, v0, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v3

    .line 110
    :cond_3
    new-instance v0, Lorg/json/JSONArray;

    .line 111
    .line 112
    invoke-direct {v0, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    move-object v9, v3

    .line 120
    move-object v10, v9

    .line 121
    move v8, v5

    .line 122
    :goto_1
    if-ge v8, v7, :cond_d

    .line 123
    .line 124
    new-instance v9, Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    if-nez v11, :cond_4

    .line 134
    .line 135
    move-object/from16 v5, p3

    .line 136
    .line 137
    move-object/from16 p1, v0

    .line 138
    .line 139
    move-object/from16 v16, v3

    .line 140
    .line 141
    move-object/from16 v3, p0

    .line 142
    .line 143
    goto/16 :goto_8

    .line 144
    .line 145
    :cond_4
    new-instance v12, Lorg/android/agoo/common/MsgDO;

    .line 146
    .line 147
    invoke-direct {v12}, Lorg/android/agoo/common/MsgDO;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v13, "p"

    .line 151
    .line 152
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    const-string v14, "i"

    .line 157
    .line 158
    invoke-virtual {v11, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    const-string v15, "b"

    .line 163
    .line 164
    invoke-virtual {v11, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    move-object/from16 v16, v3

    .line 169
    .line 170
    :try_start_1
    const-string v3, "f"

    .line 171
    .line 172
    move-object/from16 v17, v6

    .line 173
    .line 174
    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_5

    .line 183
    .line 184
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    goto :goto_2

    .line 189
    :catchall_1
    move-exception v0

    .line 190
    goto/16 :goto_a

    .line 191
    .line 192
    :cond_5
    :goto_2
    iput-object v14, v12, Lorg/android/agoo/common/MsgDO;->msgIds:Ljava/lang/String;

    .line 193
    .line 194
    iput-object v10, v12, Lorg/android/agoo/common/MsgDO;->extData:Ljava/lang/String;

    .line 195
    .line 196
    iput-object v13, v12, Lorg/android/agoo/common/MsgDO;->removePacks:Ljava/lang/String;

    .line 197
    .line 198
    iput-object v1, v12, Lorg/android/agoo/common/MsgDO;->messageSource:Ljava/lang/String;

    .line 199
    .line 200
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_6

    .line 205
    .line 206
    const-string v3, "11"

    .line 207
    .line 208
    iput-object v3, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 209
    .line 210
    :goto_3
    move-object/from16 v3, p0

    .line 211
    .line 212
    :goto_4
    move-object/from16 v5, p3

    .line 213
    .line 214
    move-object/from16 p1, v0

    .line 215
    .line 216
    :goto_5
    move-object/from16 v6, v17

    .line 217
    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_6
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_7

    .line 225
    .line 226
    const-string v3, "12"

    .line 227
    .line 228
    iput-object v3, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_7
    const-wide/16 v18, -0x1

    .line 232
    .line 233
    cmp-long v3, v5, v18

    .line 234
    .line 235
    if-nez v3, :cond_8

    .line 236
    .line 237
    const-string v3, "13"

    .line 238
    .line 239
    iput-object v3, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_8
    move-object/from16 v3, p0

    .line 243
    .line 244
    invoke-static {v3, v13}, Lorg/android/agoo/control/AgooFactory;->checkPackage(Landroid/content/Context;Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v18

    .line 248
    if-nez v18, :cond_9

    .line 249
    .line 250
    new-instance v5, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v6, "msgReceive check package is del,pack="

    .line 256
    .line 257
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    const/4 v6, 0x0

    .line 268
    new-array v11, v6, [Ljava/lang/Object;

    .line 269
    .line 270
    invoke-static {v4, v5, v11}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_9
    invoke-static {v5, v6, v12}, Lorg/android/agoo/control/AgooFactory;->getFlag(JLorg/android/agoo/common/MsgDO;)Landroid/os/Bundle;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    const-string v6, "encrypted"

    .line 279
    .line 280
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    move-object/from16 p1, v0

    .line 285
    .line 286
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_b

    .line 295
    .line 296
    const/4 v0, 0x4

    .line 297
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v6, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_a

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_a
    const-string v0, "msgReceive msg encrypted flag not exist, cannot prase!!!"

    .line 309
    .line 310
    const/4 v6, 0x0

    .line 311
    new-array v5, v6, [Ljava/lang/Object;

    .line 312
    .line 313
    invoke-static {v4, v0, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    const-string v0, "24"

    .line 317
    .line 318
    iput-object v0, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 319
    .line 320
    move-object/from16 v5, p3

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_b
    :goto_6
    invoke-virtual {v9, v5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 324
    .line 325
    .line 326
    :try_start_2
    const-string v0, "t"

    .line 327
    .line 328
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-nez v5, :cond_c

    .line 337
    .line 338
    const-string v5, "time"

    .line 339
    .line 340
    invoke-virtual {v9, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 341
    .line 342
    .line 343
    goto :goto_7

    .line 344
    :catchall_2
    :try_start_3
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 345
    .line 346
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_c

    .line 351
    .line 352
    const-string v0, "agoo msg has no time"

    .line 353
    .line 354
    const/4 v6, 0x0

    .line 355
    new-array v5, v6, [Ljava/lang/Object;

    .line 356
    .line 357
    invoke-static {v4, v0, v5}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    :cond_c
    :goto_7
    const-string v0, "trace"

    .line 361
    .line 362
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 363
    .line 364
    .line 365
    move-result-wide v5

    .line 366
    invoke-virtual {v9, v0, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 367
    .line 368
    .line 369
    const-string v0, "id"

    .line 370
    .line 371
    invoke-virtual {v9, v0, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    const-string v0, "body"

    .line 375
    .line 376
    invoke-virtual {v9, v0, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    const-string v0, "source"

    .line 380
    .line 381
    invoke-virtual {v9, v0, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    const-string v0, "fromAppkey"

    .line 385
    .line 386
    move-object/from16 v5, p3

    .line 387
    .line 388
    invoke-virtual {v9, v0, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    const-string v0, "extData"

    .line 392
    .line 393
    invoke-virtual {v9, v0, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    const-string v0, "oriData"

    .line 397
    .line 398
    move-object/from16 v6, v17

    .line 399
    .line 400
    invoke-virtual {v9, v0, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const-string v0, "type"

    .line 404
    .line 405
    const-string v11, "common-push"

    .line 406
    .line 407
    invoke-virtual {v9, v0, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    const-string v0, "message_source"

    .line 411
    .line 412
    invoke-virtual {v9, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 416
    .line 417
    move-object/from16 v0, p1

    .line 418
    .line 419
    move-object/from16 v3, v16

    .line 420
    .line 421
    const/4 v5, 0x0

    .line 422
    goto/16 :goto_1

    .line 423
    .line 424
    :cond_d
    return-object v9

    .line 425
    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 426
    .line 427
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 428
    .line 429
    .line 430
    const-string v1, "handleMessage data==null,utdid="

    .line 431
    .line 432
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-static {v3}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    const/4 v6, 0x0

    .line 447
    new-array v1, v6, [Ljava/lang/Object;

    .line 448
    .line 449
    invoke-static {v4, v0, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 450
    .line 451
    .line 452
    return-object v16

    .line 453
    :goto_a
    sget-object v1, Lcom/taobao/accs/utl/ALog$Level;->E:Lcom/taobao/accs/utl/ALog$Level;

    .line 454
    .line 455
    invoke-static {v1}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-eqz v1, :cond_e

    .line 460
    .line 461
    new-instance v1, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 464
    .line 465
    .line 466
    const-string v2, "msgReceive is error,e="

    .line 467
    .line 468
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    const/4 v6, 0x0

    .line 479
    new-array v1, v6, [Ljava/lang/Object;

    .line 480
    .line 481
    invoke-static {v4, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    :cond_e
    return-object v16
.end method

.method public static parseEncryptedMsg(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "AgooFactory"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    sget-object v3, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v3}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v4}, Lorg/android/agoo/common/Config;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    const-string p0, "getAppSign secret null"

    .line 24
    .line 25
    new-array v3, v2, [Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, p0, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p0, v3, v4}, Lorg/android/agoo/control/AgooFactory;->parseEncryptedMsgWithoutAgoo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    :try_start_2
    const-string p0, "use v2 decrypt message successfully"

    .line 45
    .line 46
    new-array v3, v2, [Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v0, p0, v3}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v5

    .line 52
    :catch_0
    const-string v5, "v2 decrypt error, need to downgrade"

    .line 53
    .line 54
    new-array v6, v2, [Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v0, v5, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v3, v4}, Lorg/android/agoo/control/AgooFactory;->downgradeV1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_1
    invoke-static {p0, v3, v4}, Lorg/android/agoo/control/AgooFactory;->downgradeV1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    return-object p0

    .line 69
    :goto_0
    const-string v3, "parseEncryptedMsg failure: "

    .line 70
    .line 71
    new-array v2, v2, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v0, v3, p0, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method

.method public static parseEncryptedMsgWithoutAgoo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "utf-8"

    .line 2
    .line 3
    const-string v1, "AgooFactory"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v4, v5}, Lorg/android/agoo/common/a;->a([B[B)[B

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    array-length v5, v4

    .line 37
    if-lez v5, :cond_0

    .line 38
    .line 39
    const/16 v5, 0x8

    .line 40
    .line 41
    invoke-static {p0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    .line 46
    .line 47
    invoke-static {v4}, Lorg/android/agoo/common/a;->a([B)[B

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v7, "AES"

    .line 52
    .line 53
    invoke-direct {v6, v4, v7}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v4}, Lorg/android/agoo/common/a;->a([B)[B

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v5, v6, v4}, Lorg/android/agoo/common/a;->a([BLjavax/crypto/spec/SecretKeySpec;[B)[B

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    new-instance v5, Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v5, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const-string v0, "aesDecrypt key is null!"

    .line 77
    .line 78
    new-array v4, v2, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v1, v0, v4}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    return-object v3

    .line 84
    :goto_0
    const-string v4, "parseEncryptedMsg body: "

    .line 85
    .line 86
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v1, v4, p0}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const-string p0, "parseEncryptedMsg appKey: "

    .line 94
    .line 95
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {v1, p0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-string p0, "parseEncryptedMsg appSecret: "

    .line 103
    .line 104
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v1, p0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const-string p0, "parseEncryptedMsg failure: "

    .line 112
    .line 113
    new-array p1, v2, [Ljava/lang/Object;

    .line 114
    .line 115
    invoke-static {v1, p0, v0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-object v3
.end method

.method public static parseEncryptedMsgWithoutAgooByUtdid(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "utf-8"

    .line 2
    .line 3
    const-string v1, "AgooFactory"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v4, v5}, Lorg/android/agoo/common/a;->a([B[B)[B

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    array-length v5, v4

    .line 37
    if-lez v5, :cond_0

    .line 38
    .line 39
    const/16 v5, 0x8

    .line 40
    .line 41
    invoke-static {p0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    .line 46
    .line 47
    invoke-static {v4}, Lorg/android/agoo/common/a;->a([B)[B

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const-string v7, "AES"

    .line 52
    .line 53
    invoke-direct {v6, v4, v7}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-static {v4}, Lorg/android/agoo/common/a;->a([B)[B

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v5, v6, v4}, Lorg/android/agoo/common/a;->a([BLjavax/crypto/spec/SecretKeySpec;[B)[B

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    new-instance v5, Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v5, v4, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const-string v0, "aesDecrypt key is null!"

    .line 77
    .line 78
    new-array v4, v2, [Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v1, v0, v4}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    return-object v3

    .line 84
    :goto_0
    const-string v4, "parseEncryptedMsg body: "

    .line 85
    .line 86
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v1, v4, p0}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    const-string p0, "parseEncryptedMsg appKey: "

    .line 94
    .line 95
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {v1, p0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const-string p0, "parseEncryptedMsg appSecret: "

    .line 103
    .line 104
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {v1, p0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const-string p0, "parseEncryptedMsg utdid: "

    .line 112
    .line 113
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {v1, p0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const-string p0, "parseEncryptedMsg failure: "

    .line 121
    .line 122
    new-array p1, v2, [Ljava/lang/Object;

    .line 123
    .line 124
    invoke-static {v1, p0, v0, p1}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-object v3
.end method

.method private sendMsgToBusiness(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ZLjava/lang/String;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V
    .locals 4

    .line 1
    const-string v0, "AgooFactory"

    .line 2
    .line 3
    new-instance v1, Landroid/content/Intent;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "org.agoo.android.intent.action.RECEIVE"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 17
    .line 18
    .line 19
    const-string v2, "type"

    .line 20
    .line 21
    const-string v3, "common-push"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    const-string v2, "message_source"

    .line 27
    .line 28
    invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    const/16 p5, 0x20

    .line 32
    .line 33
    invoke-virtual {v1, p5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    const/4 p5, 0x0

    .line 37
    :try_start_0
    new-instance v2, Landroid/os/Bundle;

    .line 38
    .line 39
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v3, "accs_extra"

    .line 43
    .line 44
    invoke-virtual {v2, v3, p6}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 45
    .line 46
    .line 47
    const-string p6, "msg_agoo_bundle"

    .line 48
    .line 49
    invoke-virtual {v1, p6, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p6

    .line 54
    const-string v2, "sendMsgToBusiness"

    .line 55
    .line 56
    new-array v3, p5, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-static {v0, v2, p6, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p6, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 62
    .line 63
    invoke-static {p6}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 64
    .line 65
    .line 66
    move-result p6

    .line 67
    if-eqz p6, :cond_0

    .line 68
    .line 69
    new-instance p6, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v2, "sendMsgToBusiness intent:"

    .line 75
    .line 76
    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p3, ",utdid="

    .line 87
    .line 88
    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string p3, ",pack="

    .line 99
    .line 100
    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p3, ",agooFlag="

    .line 107
    .line 108
    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    new-array p6, p5, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v0, p3, p6}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_0
    if-eqz p4, :cond_1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-static {p1}, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->getAgooCustomServiceName(Landroid/content/Context;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result p4

    .line 134
    if-eqz p4, :cond_2

    .line 135
    .line 136
    const-string p1, "sendMsgToBusiness failed, can not find custom service"

    .line 137
    .line 138
    new-array p2, p5, [Ljava/lang/Object;

    .line 139
    .line 140
    invoke-static {v0, p1, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_2
    invoke-virtual {v1, p2, p3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v1, p3}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :goto_1
    return-void
.end method


# virtual methods
.method public clickMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p1, Lorg/android/agoo/control/f;

    .line 2
    .line 3
    invoke-direct {p1, p0, p2, p3}, Lorg/android/agoo/control/f;-><init>(Lorg/android/agoo/control/AgooFactory;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public dismissMessage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p1, Lorg/android/agoo/control/g;

    .line 2
    .line 3
    invoke-direct {p1, p0, p2, p3}, Lorg/android/agoo/control/g;-><init>(Lorg/android/agoo/control/AgooFactory;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public getMessageService()Lorg/android/agoo/message/MessageService;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNotifyManager()Lorg/android/agoo/control/NotifManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public isCacheMessageEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/android/agoo/control/AgooFactory;->mCacheMessageEnabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public msgReceive([BLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lorg/android/agoo/control/AgooFactory;->msgReceive([BLjava/lang/String;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    return-void
.end method

.method public msgReceive([BLjava/lang/String;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V
    .locals 4

    .line 2
    const-string v0, "AgooFactory"

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "into--[AgooFactory,msgReceive]:messageSource="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    new-instance v2, Lorg/android/agoo/control/b;

    invoke-direct {v2, p0, p1, p2, p3}, Lorg/android/agoo/control/b;-><init>(Lorg/android/agoo/control/AgooFactory;[BLjava/lang/String;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    invoke-static {v2}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 5
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "serviceImpl init task fail:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public msgReceiverPreHandler([BLjava/lang/String;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;Z)Landroid/os/Bundle;
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    .line 1
    const-string v8, ","

    const-string v9, "ext"

    const-string v2, "accs.msgRecevie"

    const v3, 0x101d2

    const/4 v10, 0x0

    const-string v11, "AgooFactory"

    const/4 v12, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    array-length v4, v0

    if-gtz v4, :cond_1

    :cond_0
    move-object/from16 v16, v10

    goto/16 :goto_9

    .line 2
    :cond_1
    new-instance v13, Ljava/lang/String;

    const-string v4, "utf-8"

    invoke-direct {v13, v0, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 3
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "msgReceive,message--->["

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "],utdid="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 5
    invoke-static {v4}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v12, [Ljava/lang/Object;

    .line 6
    invoke-static {v11, v0, v4}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v16, v10

    goto/16 :goto_a

    .line 7
    :cond_2
    :goto_0
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v0

    sget-object v4, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 9
    invoke-static {v4}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "message==null"

    .line 10
    invoke-virtual {v0, v3, v2, v4, v5}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleMessage message==null,utdid="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 12
    invoke-static {v2}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v12, [Ljava/lang/Object;

    .line 13
    invoke-static {v11, v0, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v10

    .line 14
    :cond_3
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, v13}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v14

    .line 16
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object v4, v10

    move-object v5, v4

    move v3, v12

    :goto_1
    if-ge v3, v14, :cond_f

    .line 18
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v16, v10

    .line 19
    :try_start_1
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    if-nez v10, :cond_4

    move-object/from16 p1, v0

    move-object v0, v2

    move v10, v3

    move-object/from16 v25, v9

    move-object v12, v13

    move/from16 v23, v14

    goto/16 :goto_8

    .line 20
    :cond_4
    new-instance v12, Lorg/android/agoo/common/MsgDO;

    invoke-direct {v12}, Lorg/android/agoo/common/MsgDO;-><init>()V

    move-object/from16 p1, v0

    .line 21
    const-string v0, "p"

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v5

    .line 22
    const-string v5, "i"

    invoke-virtual {v10, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move/from16 v23, v14

    .line 23
    const-string v14, "b"

    invoke-virtual {v10, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v24, v13

    .line 24
    const-string v13, "f"

    move-object/from16 v18, v14

    invoke-virtual {v10, v13}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    .line 25
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v19

    if-nez v19, :cond_5

    .line 26
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    :cond_5
    move-object/from16 v25, v9

    move-object/from16 v9, v17

    goto :goto_2

    :catchall_1
    move-exception v0

    goto/16 :goto_a

    :goto_2
    move-object/from16 v17, v10

    add-int/lit8 v10, v23, -0x1

    .line 27
    iput-object v5, v12, Lorg/android/agoo/common/MsgDO;->msgIds:Ljava/lang/String;

    .line 28
    iput-object v9, v12, Lorg/android/agoo/common/MsgDO;->extData:Ljava/lang/String;

    .line 29
    iput-object v0, v12, Lorg/android/agoo/common/MsgDO;->removePacks:Ljava/lang/String;

    .line 30
    iput-object v6, v12, Lorg/android/agoo/common/MsgDO;->messageSource:Ljava/lang/String;

    .line 31
    invoke-static/range {v18 .. v18}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-eqz v19, :cond_6

    .line 32
    const-string v0, "11"

    iput-object v0, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 33
    iget-object v0, v1, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    invoke-virtual {v0, v12, v7}, Lorg/android/agoo/control/NotifManager;->handlerACKMessage(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    :goto_3
    move-object v0, v2

    move v10, v3

    move-object/from16 v12, v24

    goto/16 :goto_7

    .line 34
    :cond_6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-eqz v19, :cond_7

    .line 35
    const-string v0, "12"

    iput-object v0, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 36
    iget-object v0, v1, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    invoke-virtual {v0, v12, v7}, Lorg/android/agoo/control/NotifManager;->handlerACKMessage(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    goto :goto_3

    :cond_7
    const-wide/16 v19, -0x1

    cmp-long v19, v13, v19

    if-nez v19, :cond_8

    .line 37
    const-string v0, "13"

    iput-object v0, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 38
    iget-object v0, v1, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    invoke-virtual {v0, v12, v7}, Lorg/android/agoo/control/NotifManager;->handlerACKMessage(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    goto :goto_3

    .line 39
    :cond_8
    sget-object v6, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    invoke-static {v6, v0}, Lorg/android/agoo/control/AgooFactory;->checkPackage(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_a

    .line 40
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "msgReceive check package is del,pack="

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v12, 0x0

    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v11, v6, v13}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v17

    const-string v19, "accs.msgRecevie"

    sget-object v6, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 42
    invoke-static {v6}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v20

    const-string v21, "deletePack"

    const v18, 0x101d2

    move-object/from16 v22, v0

    .line 43
    invoke-virtual/range {v17 .. v22}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v3, v10, :cond_9

    .line 46
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    :goto_4
    move-object/from16 v6, p2

    goto :goto_3

    .line 48
    :cond_a
    invoke-static {v13, v14, v12}, Lorg/android/agoo/control/AgooFactory;->getFlag(JLorg/android/agoo/common/MsgDO;)Landroid/os/Bundle;

    move-result-object v6

    .line 49
    const-string v10, "encrypted"

    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 50
    sget-object v13, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/4 v13, 0x4

    .line 51
    invoke-static {v13}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v13

    .line 52
    invoke-static {v10, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/4 v10, 0x0

    goto :goto_5

    .line 53
    :cond_b
    const-string v0, "msgReceive msg encrypted flag not exist, cannot prase!!!"

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Object;

    invoke-static {v11, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v17

    const-string v19, "accs.msgRecevie"

    sget-object v0, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 55
    invoke-static {v0}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v20

    const-string v21, "encrypted!=4"

    const-string v22, "15"

    const v18, 0x101d2

    .line 56
    invoke-virtual/range {v17 .. v22}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    const-string v0, "24"

    iput-object v0, v12, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 58
    iget-object v0, v1, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    invoke-virtual {v0, v12, v7}, Lorg/android/agoo/control/NotifManager;->handlerACKMessage(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    goto :goto_4

    :cond_c
    const/4 v10, 0x1

    .line 59
    :goto_5
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    :try_start_2
    const-string v6, "t"

    move-object/from16 v12, v17

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 61
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_d

    .line 62
    const-string v12, "time"

    invoke-virtual {v4, v12, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    .line 63
    :catchall_2
    :try_start_3
    sget-object v6, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v6}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 64
    const-string v6, "agoo msg has no time"

    const/4 v12, 0x0

    new-array v13, v12, [Ljava/lang/Object;

    invoke-static {v11, v6, v13}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :cond_d
    :goto_6
    const-string v6, "trace"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    invoke-virtual {v4, v6, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 66
    const-string v6, "id"

    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v5, "body"

    move-object/from16 v6, v18

    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const-string v5, "source"

    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v5, "fromAppkey"

    sget-object v6, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 70
    invoke-static {v6}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 71
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const-string v5, "extData"

    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v5, "oriData"

    move-object/from16 v12, v24

    invoke-virtual {v4, v5, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p4, :cond_e

    move-object v5, v2

    .line 74
    sget-object v2, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    move v6, v3

    move-object v3, v0

    move-object v0, v5

    move v5, v10

    move v10, v6

    move-object/from16 v6, p2

    invoke-direct/range {v1 .. v7}, Lorg/android/agoo/control/AgooFactory;->sendMsgToBusiness(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;ZLjava/lang/String;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    goto :goto_7

    :cond_e
    move-object/from16 v6, p2

    move-object v0, v2

    move v10, v3

    .line 75
    const-string v2, "type"

    const-string v3, "common-push"

    invoke-virtual {v4, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v2, "message_source"

    invoke-virtual {v4, v2, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    move-object v5, v9

    :goto_8
    add-int/lit8 v3, v10, 0x1

    move-object v2, v0

    move-object v13, v12

    move-object/from16 v10, v16

    move/from16 v14, v23

    move-object/from16 v9, v25

    const/4 v12, 0x0

    move-object/from16 v0, p1

    goto/16 :goto_1

    :cond_f
    move-object v0, v2

    move-object/from16 v16, v10

    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_10

    .line 78
    new-instance v2, Lorg/android/agoo/common/MsgDO;

    invoke-direct {v2}, Lorg/android/agoo/common/MsgDO;-><init>()V

    .line 79
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lorg/android/agoo/common/MsgDO;->msgIds:Ljava/lang/String;

    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lorg/android/agoo/common/MsgDO;->removePacks:Ljava/lang/String;

    .line 81
    const-string v0, "10"

    iput-object v0, v2, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 82
    iput-object v6, v2, Lorg/android/agoo/common/MsgDO;->messageSource:Ljava/lang/String;

    .line 83
    iget-object v0, v1, Lorg/android/agoo/control/AgooFactory;->notifyManager:Lorg/android/agoo/control/NotifManager;

    invoke-virtual {v0, v2, v7}, Lorg/android/agoo/control/NotifManager;->handlerACKMessage(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    :cond_10
    return-object v4

    .line 84
    :goto_9
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v0

    sget-object v4, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 85
    invoke-static {v4}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "data==null"

    .line 86
    invoke-virtual {v0, v3, v2, v4, v5}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleMessage data==null,utdid="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 88
    invoke-static {v2}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v2, v12, [Ljava/lang/Object;

    .line 89
    invoke-static {v11, v0, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-object v16

    .line 90
    :goto_a
    sget-object v2, Lcom/taobao/accs/utl/ALog$Level;->E:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msgReceive is error,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v12, 0x0

    new-array v2, v12, [Ljava/lang/Object;

    invoke-static {v11, v0, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_11
    return-object v16
.end method

.method public reportCacheMsg()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/android/agoo/control/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/android/agoo/control/c;-><init>(Lorg/android/agoo/control/AgooFactory;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "reportCacheMsg fail:"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Ljava/lang/Object;

    .line 34
    .line 35
    const-string v2, "AgooFactory"

    .line 36
    .line 37
    invoke-static {v2, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public saveMsg([B)V
    .locals 1

    .line 1
    const-string v0, "0"

    invoke-virtual {p0, p1, v0}, Lorg/android/agoo/control/AgooFactory;->saveMsg([BLjava/lang/String;)V

    return-void
.end method

.method public saveMsg([BLjava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 2
    array-length v0, p1

    if-gtz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Lorg/android/agoo/control/a;

    invoke-direct {v0, p0, p1, p2}, Lorg/android/agoo/control/a;-><init>(Lorg/android/agoo/control/AgooFactory;[BLjava/lang/String;)V

    invoke-static {v0}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setCacheMessageEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/android/agoo/control/AgooFactory;->mCacheMessageEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public updateMsg([BZ)V
    .locals 1

    .line 1
    new-instance v0, Lorg/android/agoo/control/d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lorg/android/agoo/control/d;-><init>(Lorg/android/agoo/control/AgooFactory;[BZ)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public updateMsgStatus(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "AgooFactory"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-nez v2, :cond_3

    .line 9
    .line 10
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object v2, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 18
    .line 19
    invoke-static {v2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "updateNotifyMsg begin,messageId="

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, ",status="

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v3, ",reportTimes="

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    sget-object v3, Lorg/android/agoo/control/AgooFactory;->sContext:Landroid/content/Context;

    .line 52
    .line 53
    invoke-static {v3}, Lorg/android/agoo/common/Config;->g(Landroid/content/Context;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-array v3, v1, [Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v0, v2, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    :goto_0
    const-string v2, "8"

    .line 73
    .line 74
    invoke-static {p2, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    iget-object p2, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 81
    .line 82
    const-string v2, "2"

    .line 83
    .line 84
    invoke-virtual {p2, p1, v2}, Lorg/android/agoo/message/MessageService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    const-string v2, "9"

    .line 89
    .line 90
    invoke-static {p2, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    iget-object p2, p0, Lorg/android/agoo/control/AgooFactory;->messageService:Lorg/android/agoo/message/MessageService;

    .line 97
    .line 98
    const-string v2, "3"

    .line 99
    .line 100
    invoke-virtual {p2, p1, v2}, Lorg/android/agoo/message/MessageService;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_1
    return-void

    .line 104
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "updateNotifyMsg e="

    .line 110
    .line 111
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    new-array p2, v1, [Ljava/lang/Object;

    .line 126
    .line 127
    invoke-static {v0, p1, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public updateNotifyMsg(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/android/agoo/control/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lorg/android/agoo/control/e;-><init>(Lorg/android/agoo/control/AgooFactory;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
