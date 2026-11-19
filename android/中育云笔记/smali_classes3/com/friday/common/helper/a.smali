.class public final Lcom/friday/common/helper/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/friday/common/helper/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/helper/a;

    invoke-direct {v0}, Lcom/friday/common/helper/a;-><init>()V

    sput-object v0, Lcom/friday/common/helper/a;->a:Lcom/friday/common/helper/a;

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
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/friday/common/helper/a;->b(J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(J)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "\u9875\u9762 AliPushBindHelper.kt -> bindUserId\uff0cuserId\u4e3a\u7a7a\uff0c\u8df3\u8fc7\u963f\u91cc\u4e91\u63a8\u9001\u7ed1\u5b9a"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lcom/alibaba/sdk/android/push/noonesdk/PushServiceFactory;->getCloudPushService()Lcom/alibaba/sdk/android/push/CloudPushService;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p2}, Lcom/alibaba/sdk/android/push/CloudPushService;->getDeviceId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "\u9875\u9762 AliPushBindHelper.kt -> bindUserId\uff0c\u5f00\u59cb\u7ed1\u5b9a\u963f\u91cc\u4e91\u63a8\u9001\u8d26\u53f7\uff0caccount="

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "\uff0cdeviceId="

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Lcom/friday/common/helper/a$a;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lcom/friday/common/helper/a$a;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p2, p1, v0}, Lcom/alibaba/sdk/android/push/CloudPushService;->bindAccount(Ljava/lang/String;Lcom/alibaba/sdk/android/push/CommonCallback;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
