.class public Lt1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt1/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:La9/v$a;

.field public volatile b:La9/v;


# direct methods
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
.method public a(Ljava/lang/String;)Lt1/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lt1/b$a;->b:La9/v;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const-class v0, Lt1/b$a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lt1/b$a;->b:La9/v;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lt1/b$a;->a:La9/v$a;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, La9/v$a;->c()La9/v;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, La9/v;

    .line 24
    .line 25
    invoke-direct {v1}, La9/v;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_0
    iput-object v1, p0, Lt1/b$a;->b:La9/v;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-object v1, p0, Lt1/b$a;->a:La9/v$a;

    .line 32
    .line 33
    :cond_1
    monitor-exit v0

    .line 34
    goto :goto_2

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1

    .line 37
    :cond_2
    :goto_2
    new-instance v0, Lt1/b;

    .line 38
    .line 39
    iget-object v1, p0, Lt1/b$a;->b:La9/v;

    .line 40
    .line 41
    invoke-direct {v0, v1, p1}, Lt1/b;-><init>(La9/v;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
