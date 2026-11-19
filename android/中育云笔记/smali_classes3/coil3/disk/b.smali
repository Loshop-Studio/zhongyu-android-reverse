.class public final Lcoil3/disk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/disk/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/disk/b$a;,
        Lcoil3/disk/b$b;,
        Lcoil3/disk/b$c;
    }
.end annotation


# static fields
.field public static final e:Lcoil3/disk/b$a;


# instance fields
.field public final a:J

.field public final b:Lokio/Path;

.field public final c:Lokio/FileSystem;

.field public final d:Lcoil3/disk/DiskLruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcoil3/disk/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcoil3/disk/b$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcoil3/disk/b;->e:Lcoil3/disk/b$a;

    return-void
.end method

.method public constructor <init>(JLokio/Path;Lokio/FileSystem;Lkotlin/coroutines/d;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcoil3/disk/b;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lcoil3/disk/b;->b:Lokio/Path;

    .line 7
    .line 8
    iput-object p4, p0, Lcoil3/disk/b;->c:Lokio/FileSystem;

    .line 9
    .line 10
    new-instance v0, Lcoil3/disk/DiskLruCache;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcoil3/disk/b;->getFileSystem()Lokio/FileSystem;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0}, Lcoil3/disk/b;->c()Lokio/Path;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Lcoil3/disk/b;->d()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    const/4 v6, 0x3

    .line 25
    const/4 v7, 0x2

    .line 26
    move-object v3, p5

    .line 27
    invoke-direct/range {v0 .. v7}, Lcoil3/disk/DiskLruCache;-><init>(Lokio/FileSystem;Lokio/Path;Lkotlin/coroutines/d;JII)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcoil3/disk/b;->d:Lcoil3/disk/DiskLruCache;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcoil3/disk/a$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->d:Lcoil3/disk/DiskLruCache;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcoil3/disk/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcoil3/disk/DiskLruCache;->w(Ljava/lang/String;)Lcoil3/disk/DiskLruCache$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcoil3/disk/b$b;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcoil3/disk/b$b;-><init>(Lcoil3/disk/DiskLruCache$b;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public b(Ljava/lang/String;)Lcoil3/disk/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->d:Lcoil3/disk/DiskLruCache;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcoil3/disk/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcoil3/disk/DiskLruCache;->x(Ljava/lang/String;)Lcoil3/disk/DiskLruCache$d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcoil3/disk/b$c;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lcoil3/disk/b$c;-><init>(Lcoil3/disk/DiskLruCache$d;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public c()Lokio/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->b:Lokio/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcoil3/disk/b;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lokio/ByteString$Companion;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lokio/ByteString;->sha256()Lokio/ByteString;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lokio/ByteString;->hex()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public getFileSystem()Lokio/FileSystem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/disk/b;->c:Lokio/FileSystem;

    .line 2
    .line 3
    return-object v0
.end method
