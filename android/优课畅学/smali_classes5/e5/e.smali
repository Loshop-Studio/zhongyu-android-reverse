.class public final Le5/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le5/e;

.field public static b:Ljava/lang/String;

.field public static c:Ljava/lang/String;

.field public static d:Ljava/lang/String;

.field public static final e:Ljava/util/List;

.field public static final f:Ljava/util/List;

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Le5/e;

    .line 2
    .line 3
    invoke-direct {v0}, Le5/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le5/e;->a:Le5/e;

    .line 7
    .line 8
    const-string v0, "dev"

    .line 9
    .line 10
    sput-object v0, Le5/e;->b:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "http://office.zhongyukejiao.com:9012/"

    .line 13
    .line 14
    sput-object v0, Le5/e;->c:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "http://172.16.168.98:8088/"

    .line 17
    .line 18
    sput-object v0, Le5/e;->d:Ljava/lang/String;

    .line 19
    .line 20
    const-string v18, "*.zykj.org"

    .line 21
    .line 22
    const-string v19, "*.zyai.cc"

    .line 23
    .line 24
    const-string v1, "func2.aliyun.zykj.org"

    .line 25
    .line 26
    const-string v2, "ykcx.func.zykj.org"

    .line 27
    .line 28
    const-string v3, "ykcx-pad.local.zykj.org"

    .line 29
    .line 30
    const-string v4, "ykcx-pad.school.zykj.org"

    .line 31
    .line 32
    const-string v5, "172.16.168.56"

    .line 33
    .line 34
    const-string v6, "172.16.168.90"

    .line 35
    .line 36
    const-string v7, "172.16.168.161"

    .line 37
    .line 38
    const-string v8, "172.16.168.111"

    .line 39
    .line 40
    const-string v9, "sfs.zykj.org"

    .line 41
    .line 42
    const-string v10, "office.zhongyukejiao.com"

    .line 43
    .line 44
    const-string v11, "172.16.168.88"

    .line 45
    .line 46
    const-string v12, "*xxg.zyyx.cc"

    .line 47
    .line 48
    const-string v13, "test-api.school.zykj.org"

    .line 49
    .line 50
    const-string v14, "172.16.168.98"

    .line 51
    .line 52
    const-string v15, "test-api.school.zykj.org"

    .line 53
    .line 54
    const-string v16, "*api.zykj.org"

    .line 55
    .line 56
    const-string v17, "*api2.zykj.org"

    .line 57
    .line 58
    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Li7/v;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Le5/e;->e:Ljava/util/List;

    .line 67
    .line 68
    const-string v0, "*aliyuncs.com"

    .line 69
    .line 70
    invoke-static {v0}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Le5/e;->f:Ljava/util/List;

    .line 75
    .line 76
    const/16 v0, 0x8

    .line 77
    .line 78
    sput v0, Le5/e;->g:I

    .line 79
    .line 80
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
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Le5/e;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Le5/e;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Le5/e;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Le5/e;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Le5/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-object p1, Le5/e;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
