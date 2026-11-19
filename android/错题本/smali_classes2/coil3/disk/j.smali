.class public final Lcoil3/disk/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/disk/a;


# instance fields
.field public final a:Lokio/FileSystem;

.field public final b:Lcoil3/disk/f;


# direct methods
.method public constructor <init>(JLokio/Path;Lokio/FileSystem;Lkotlin/coroutines/EmptyCoroutineContext;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcoil3/disk/j;->a:Lokio/FileSystem;

    .line 5
    .line 6
    new-instance v0, Lcoil3/disk/f;

    .line 7
    .line 8
    move-wide v4, p1

    .line 9
    move-object v2, p3

    .line 10
    move-object v1, p4

    .line 11
    move-object v3, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lcoil3/disk/f;-><init>(Lokio/FileSystem;Lokio/Path;Lh6/h;J)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcoil3/disk/j;->b:Lcoil3/disk/f;

    .line 16
    .line 17
    return-void
.end method
