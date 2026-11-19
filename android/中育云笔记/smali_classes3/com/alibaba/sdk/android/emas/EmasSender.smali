.class public Lcom/alibaba/sdk/android/emas/EmasSender;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/sdk/android/emas/EmasSender$Builder;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "EmasSender"


# instance fields
.field private background:Z

.field private mCacheManager:Lcom/alibaba/sdk/android/emas/a;

.field private mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

.field private mSendManager:Lcom/alibaba/sdk/android/emas/h;

.field private singleLogLimitCapacity:I


# direct methods
.method private constructor <init>(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)V
    .locals 11

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->background:Z

    .line 4
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$000(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v0

    iput v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->singleLogLimitCapacity:I

    .line 5
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$100(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    new-instance v0, Lcom/alibaba/sdk/android/emas/c;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$200(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Landroid/app/Application;

    move-result-object v1

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$300(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$400(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$500(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/sdk/android/emas/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

    .line 7
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$600(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v1

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$700(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v2

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$800(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/alibaba/sdk/android/emas/c;->a(III)V

    .line 8
    :cond_0
    new-instance v4, Lcom/alibaba/sdk/android/emas/h;

    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mDiskCacheManager:Lcom/alibaba/sdk/android/emas/c;

    invoke-direct {v4, p0, v0}, Lcom/alibaba/sdk/android/emas/h;-><init>(Lcom/alibaba/sdk/android/emas/EmasSender;Lcom/alibaba/sdk/android/emas/c;)V

    iput-object v4, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 9
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$200(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Landroid/app/Application;

    move-result-object v5

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$900(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$400(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1000(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v8

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1100(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v9

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1200(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v4 .. v10}, Lcom/alibaba/sdk/android/emas/h;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$300(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->setHost(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1300(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->a(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1400(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->openHttp(Z)V

    .line 13
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1500(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->a(Z)V

    .line 14
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1600(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->a(I)V

    .line 15
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1700(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Lcom/alibaba/sdk/android/emas/PreSendHandler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/PreSendHandler;)V

    .line 16
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/h;->d()V

    .line 17
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1800(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1900(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 18
    new-instance v0, Lcom/alibaba/sdk/android/emas/a;

    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$1900(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v2

    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$2000(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/sdk/android/emas/a;-><init>(Lcom/alibaba/sdk/android/emas/h;II)V

    iput-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mCacheManager:Lcom/alibaba/sdk/android/emas/a;

    .line 19
    new-instance v0, Lcom/alibaba/sdk/android/emas/g;

    invoke-direct {v0}, Lcom/alibaba/sdk/android/emas/g;-><init>()V

    .line 20
    new-instance v1, Lcom/alibaba/sdk/android/emas/EmasSender$1;

    invoke-direct {v1, p0}, Lcom/alibaba/sdk/android/emas/EmasSender$1;-><init>(Lcom/alibaba/sdk/android/emas/EmasSender;)V

    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/g;->a(Lcom/alibaba/sdk/android/emas/g$a;)V

    .line 21
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/EmasSender$Builder;->access$200(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;Lcom/alibaba/sdk/android/emas/EmasSender$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/sdk/android/emas/EmasSender;-><init>(Lcom/alibaba/sdk/android/emas/EmasSender$Builder;)V

    return-void
.end method

.method public static synthetic access$2102(Lcom/alibaba/sdk/android/emas/EmasSender;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->background:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2200(Lcom/alibaba/sdk/android/emas/EmasSender;)Lcom/alibaba/sdk/android/emas/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mCacheManager:Lcom/alibaba/sdk/android/emas/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public changeHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/sdk/android/emas/h;->setHost(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mCacheManager:Lcom/alibaba/sdk/android/emas/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/a;->flush()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public isBackground()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->background:Z

    .line 2
    .line 3
    return v0
.end method

.method public openHttp(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/sdk/android/emas/h;->openHttp(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public send(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/h;->a()Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/tbrest/SendService;->getAppKey()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/h;->a()Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/tbrest/SendService;->getChangeHost()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/h;->a()Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/h;->a()Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/tbrest/SendService;->getAppKey()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-wide v3, p1

    .line 51
    move-object v5, p3

    .line 52
    move v6, p4

    .line 53
    move-object/from16 v7, p5

    .line 54
    .line 55
    move-object/from16 v8, p6

    .line 56
    .line 57
    move-object/from16 v9, p7

    .line 58
    .line 59
    move-object/from16 v10, p8

    .line 60
    .line 61
    invoke-static/range {v1 .. v10}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    const-string v0, "UTF-8"

    .line 72
    .line 73
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    array-length v0, v0

    .line 82
    iget v1, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->singleLogLimitCapacity:I

    .line 83
    .line 84
    if-gt v0, v1, :cond_2

    .line 85
    .line 86
    new-instance v0, Lcom/alibaba/sdk/android/emas/e;

    .line 87
    .line 88
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    invoke-direct {v0, p4, p3, p1, p2}, Lcom/alibaba/sdk/android/emas/e;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mCacheManager:Lcom/alibaba/sdk/android/emas/a;

    .line 96
    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/alibaba/sdk/android/emas/a;->a(Lcom/alibaba/sdk/android/emas/e;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_1
    iget-object p1, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lcom/alibaba/sdk/android/emas/h;->b(Lcom/alibaba/sdk/android/emas/e;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string p2, "EmasSender send failed. build data is exceed limit. current length: "

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    const-string p1, "EmasSender send failed. build data is null."

    .line 131
    .line 132
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    :goto_0
    const-string p1, "EmasSender send failed. appkey or host is empty."

    .line 137
    .line 138
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public setUserNick(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/EmasSender;->mSendManager:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/sdk/android/emas/h;->setUserNick(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
