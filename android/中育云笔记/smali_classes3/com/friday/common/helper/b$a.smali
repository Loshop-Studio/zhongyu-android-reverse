.class public final Lcom/friday/common/helper/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/helper/b;
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
    invoke-direct {p0}, Lcom/friday/common/helper/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/friday/common/helper/b;
    .locals 3

    .line 1
    invoke-static {}, Lcom/friday/common/helper/b;->a()Lcom/friday/common/helper/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const-class v0, Lcom/friday/common/helper/b;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    invoke-static {}, Lcom/friday/common/helper/b;->a()Lcom/friday/common/helper/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lcom/friday/common/helper/b;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, v2}, Lcom/friday/common/helper/b;-><init>(Lkotlin/jvm/internal/n;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lcom/friday/common/helper/b;->b(Lcom/friday/common/helper/b;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    goto :goto_2

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw v1

    .line 38
    :cond_1
    :goto_2
    invoke-static {}, Lcom/friday/common/helper/b;->a()Lcom/friday/common/helper/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
