.class public final Lcoil3/disk/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/disk/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lokio/Path;

.field public b:Lokio/FileSystem;

.field public c:D

.field public d:J

.field public e:J

.field public f:J

.field public g:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Le0/j;->a()Lokio/FileSystem;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcoil3/disk/a$a;->b:Lokio/FileSystem;

    .line 9
    .line 10
    const-wide v0, 0x3f947ae147ae147bL    # 0.02

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v0, p0, Lcoil3/disk/a$a;->c:D

    .line 16
    .line 17
    const-wide/32 v0, 0xa00000

    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lcoil3/disk/a$a;->d:J

    .line 21
    .line 22
    const-wide/32 v0, 0xfa00000

    .line 23
    .line 24
    .line 25
    iput-wide v0, p0, Lcoil3/disk/a$a;->e:J

    .line 26
    .line 27
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 28
    .line 29
    iput-object v0, p0, Lcoil3/disk/a$a;->g:Lkotlin/coroutines/CoroutineContext;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a()Lcoil3/disk/a;
    .locals 10

    .line 1
    iget-object v3, p0, Lcoil3/disk/a$a;->a:Lokio/Path;

    .line 2
    .line 3
    if-eqz v3, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Lcoil3/disk/a$a;->c:D

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    cmpl-double v2, v0, v4

    .line 10
    .line 11
    if-lez v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lcoil3/disk/a$a;->b:Lokio/FileSystem;

    .line 14
    .line 15
    invoke-static {v2, v3}, Le0/i;->a(Lokio/FileSystem;Lokio/Path;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    long-to-double v4, v4

    .line 20
    mul-double/2addr v0, v4

    .line 21
    double-to-long v4, v0

    .line 22
    iget-wide v6, p0, Lcoil3/disk/a$a;->d:J

    .line 23
    .line 24
    iget-wide v8, p0, Lcoil3/disk/a$a;->e:J

    .line 25
    .line 26
    invoke-static/range {v4 .. v9}, Lkotlin/ranges/RangesKt;->coerceIn(JJJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    iget-wide v0, p0, Lcoil3/disk/a$a;->d:J

    .line 32
    .line 33
    :goto_0
    move-wide v1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-wide v0, p0, Lcoil3/disk/a$a;->f:J

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    new-instance v0, Lcoil3/disk/b;

    .line 39
    .line 40
    iget-object v4, p0, Lcoil3/disk/a$a;->b:Lokio/FileSystem;

    .line 41
    .line 42
    iget-object v5, p0, Lcoil3/disk/a$a;->g:Lkotlin/coroutines/CoroutineContext;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v5}, Lcoil3/disk/b;-><init>(JLokio/Path;Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v1, "directory == null"

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public final b(Lokio/Path;)Lcoil3/disk/a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/disk/a$a;->a:Lokio/Path;

    .line 2
    .line 3
    return-object p0
.end method
