.class public final Lc5/a;
.super La6/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    invoke-direct {p0}, La6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onComplete()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    sput-boolean p1, Lc5/c;->a:Z

    .line 8
    .line 9
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/zykj/mistake/update/network/UpdateResp;

    .line 2
    .line 3
    const-string v0, "resp"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/mistake/update/network/UpdateResp;->getResult()Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;->getVersionCode()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0x27dd

    .line 19
    .line 20
    if-le v0, v1, :cond_1

    .line 21
    .line 22
    new-instance v0, Le5/a;

    .line 23
    .line 24
    sget v1, Lcom/zykj/mistake/R$style;->AppTheme_Dialog:I

    .line 25
    .line 26
    iget-object v2, p0, Lc5/a;->b:Landroid/content/Context;

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "UpdateDownload"

    .line 41
    .line 42
    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 52
    .line 53
    .line 54
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 55
    .line 56
    const-string v4, "Mistake.apk"

    .line 57
    .line 58
    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1}, Lcom/zykj/mistake/update/network/UpdateResp$UpdateInfo;->getFileUrl()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Lc5/b;

    .line 73
    .line 74
    invoke-direct {v3, v0, v2}, Lc5/b;-><init>(Le5/a;Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v1, v3}, Lv7/l;->h(Ljava/lang/String;Ljava/lang/String;Lm4/d;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    const/4 p1, 0x0

    .line 82
    sput-boolean p1, Lc5/c;->a:Z

    .line 83
    .line 84
    :cond_2
    return-void
.end method
