.class public abstract Lcoil3/disk/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lm/c;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcoil3/disk/c;->a:Lqc/d;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a()Lcoil3/disk/a;
    .locals 1

    .line 1
    invoke-static {}, Lcoil3/disk/c;->c()Lcoil3/disk/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b()Lcoil3/disk/a;
    .locals 1

    .line 1
    sget-object v0, Lcoil3/disk/c;->a:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcoil3/disk/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final c()Lcoil3/disk/a;
    .locals 3

    .line 1
    new-instance v0, Lcoil3/disk/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcoil3/disk/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lokio/FileSystem;->SYSTEM_TEMPORARY_DIRECTORY:Lokio/Path;

    .line 7
    .line 8
    const-string v2, "coil3_disk_cache"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lokio/Path;->resolve(Ljava/lang/String;)Lokio/Path;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lcoil3/disk/a$a;->b(Lokio/Path;)Lcoil3/disk/a$a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcoil3/disk/a$a;->a()Lcoil3/disk/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public static final d()Lcoil3/disk/a;
    .locals 1

    .line 1
    invoke-static {}, Lcoil3/disk/c;->b()Lcoil3/disk/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
