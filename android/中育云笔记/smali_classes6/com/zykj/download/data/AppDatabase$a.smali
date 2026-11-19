.class public final Lcom/zykj/download/data/AppDatabase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/download/data/AppDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/download/data/AppDatabase$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;
    .locals 2

    .line 1
    const-class v0, Lcom/zykj/download/data/AppDatabase;

    .line 2
    .line 3
    const-string v1, "download.db"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast p1, Lcom/zykj/download/data/AppDatabase;

    .line 19
    .line 20
    return-object p1
.end method

.method public final b(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/download/data/AppDatabase;->g()Lcom/zykj/download/data/AppDatabase;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    invoke-static {}, Lcom/zykj/download/data/AppDatabase;->g()Lcom/zykj/download/data/AppDatabase;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lcom/zykj/download/data/AppDatabase;->a:Lcom/zykj/download/data/AppDatabase$a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/zykj/download/data/AppDatabase$a;->a(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/zykj/download/data/AppDatabase;->h(Lcom/zykj/download/data/AppDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit p0

    .line 32
    return-object v0

    .line 33
    :goto_1
    monitor-exit p0

    .line 34
    throw p1

    .line 35
    :cond_1
    return-object v0
.end method
