.class public final Lb0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo2/a;

.field public volatile b:Ld0/a;


# direct methods
.method public constructor <init>(Lo2/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0/t;->a:Lo2/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Ld0/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lb0/t;->b:Ld0/a;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lb0/t;->b:Ld0/a;

    .line 7
    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, Lb0/t;->a:Lo2/a;

    .line 11
    .line 12
    iget-object v0, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ld0/e;

    .line 15
    .line 16
    const-string v1, "image_manager_disk_cache"

    .line 17
    .line 18
    iget-object v0, v0, Ld0/e;->b:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 30
    .line 31
    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    new-instance v2, Ld0/d;

    .line 57
    .line 58
    invoke-direct {v2, v3}, Ld0/d;-><init>(Ljava/io/File;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    iput-object v2, p0, Lb0/t;->b:Ld0/a;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    :goto_2
    iget-object v0, p0, Lb0/t;->b:Ld0/a;

    .line 67
    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    new-instance v0, Lio/reactivex/internal/operators/observable/g;

    .line 71
    .line 72
    const/4 v1, 0x3

    .line 73
    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lb0/t;->b:Ld0/a;

    .line 77
    .line 78
    :cond_5
    monitor-exit p0

    .line 79
    goto :goto_4

    .line 80
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw v0

    .line 82
    :cond_6
    :goto_4
    iget-object v0, p0, Lb0/t;->b:Ld0/a;

    .line 83
    .line 84
    return-object v0
.end method
