.class public Lcom/umeng/commonsdk/statistics/idtracking/j;
.super Lcom/umeng/commonsdk/statistics/idtracking/a;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "oldumid"


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "oldumid"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/a;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->c:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->b:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private j()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "/data/local/tmp/.um"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->b(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "/data/local/tmp/.um/sysid.dat"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->writeFile(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    return-void
.end method

.method private k()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "/sdcard/Android/obj/.um"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->b(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "/sdcard/Android/obj/.um/sysid.dat"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->writeFile(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    return-void
.end method

.method private l()V
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "/sdcard/Android/data/.um"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->b(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    const-string v1, "/sdcard/Android/data/.um/sysid.dat"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->writeFile(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    return-void
.end method


# virtual methods
.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public h()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "umid"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_5

    .line 17
    .line 18
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->encryptBySHA1(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    const-string v1, "/sdcard/Android/data/.um/sysid.dat"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readFile(Ljava/io/File;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Ljava/io/File;

    .line 38
    .line 39
    const-string v2, "/sdcard/Android/obj/.um/sysid.dat"

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readFile(Ljava/io/File;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, Ljava/io/File;

    .line 49
    .line 50
    const-string v3, "/data/local/tmp/.um/sysid.dat"

    .line 51
    .line 52
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readFile(Ljava/io/File;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v4, 0x1

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->l()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_1

    .line 77
    .line 78
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->c:Ljava/lang/String;

    .line 79
    .line 80
    return v4

    .line 81
    :cond_1
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->k()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_3

    .line 98
    .line 99
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->c:Ljava/lang/String;

    .line 100
    .line 101
    return v4

    .line 102
    :cond_3
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_4

    .line 107
    .line 108
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->j()V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->d:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_5

    .line 119
    .line 120
    iput-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/j;->c:Ljava/lang/String;

    .line 121
    .line 122
    return v4

    .line 123
    :cond_5
    :goto_2
    const/4 v0, 0x0

    .line 124
    return v0
.end method

.method public i()V
    .locals 0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->l()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->k()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/umeng/commonsdk/statistics/idtracking/j;->j()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    return-void
.end method
