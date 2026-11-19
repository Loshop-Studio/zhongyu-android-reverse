.class public interface abstract Ln/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln/n$a;
    }
.end annotation


# static fields
.field public static final a:Ln/n$a;

.field public static final b:Ln/n;

.field public static final c:Ln/n;

.field public static final d:Ln/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ln/n$a;->a:Ln/n$a;

    .line 2
    .line 3
    sput-object v0, Ln/n;->a:Ln/n$a;

    .line 4
    .line 5
    new-instance v0, Ln/k;

    .line 6
    .line 7
    invoke-direct {v0}, Ln/k;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Ln/n;->b:Ln/n;

    .line 11
    .line 12
    new-instance v0, Ln/l;

    .line 13
    .line 14
    invoke-direct {v0}, Ln/l;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ln/n;->c:Ln/n;

    .line 18
    .line 19
    new-instance v0, Ln/m;

    .line 20
    .line 21
    invoke-direct {v0}, Ln/m;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ln/n;->d:Ln/n;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lokio/BufferedSource;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln/n;->f(Ljava/lang/String;Lokio/BufferedSource;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ljava/lang/String;Lokio/BufferedSource;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln/n;->g(Ljava/lang/String;Lokio/BufferedSource;)Z

    move-result p0

    return p0
.end method

.method public static d(Ljava/lang/String;Lokio/BufferedSource;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string p1, "image/jpeg"

    .line 4
    .line 5
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "image/webp"

    .line 12
    .line 13
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const-string p1, "image/heic"

    .line 20
    .line 21
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    const-string p1, "image/heif"

    .line 28
    .line 29
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static synthetic e(Ljava/lang/String;Lokio/BufferedSource;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln/n;->d(Ljava/lang/String;Lokio/BufferedSource;)Z

    move-result p0

    return p0
.end method

.method public static f(Ljava/lang/String;Lokio/BufferedSource;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public static g(Ljava/lang/String;Lokio/BufferedSource;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method


# virtual methods
.method public abstract c(Ljava/lang/String;Lokio/BufferedSource;)Z
.end method
