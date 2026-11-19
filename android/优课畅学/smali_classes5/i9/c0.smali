.class public abstract Li9/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/c0$a;
    }
.end annotation


# static fields
.field public static final Companion:Li9/c0$a;

.field public static final EMPTY:Li9/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Li9/c0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li9/c0$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li9/c0;->Companion:Li9/c0$a;

    .line 8
    .line 9
    sget-object v2, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-static {v0, v2, v1, v3, v1}, Li9/c0$a;->q(Li9/c0$a;Lokio/ByteString;Li9/y;ILjava/lang/Object;)Li9/c0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Li9/c0;->EMPTY:Li9/c0;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final create(Li9/y;Ljava/io/File;)Li9/c0;
    .locals 1
    .annotation runtime Lh7/a;
    .end annotation

    .line 1
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->a(Li9/y;Ljava/io/File;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Li9/y;Ljava/lang/String;)Li9/c0;
    .locals 1
    .annotation runtime Lh7/a;
    .end annotation

    .line 2
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->b(Li9/y;Ljava/lang/String;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Li9/y;Lokio/ByteString;)Li9/c0;
    .locals 1
    .annotation runtime Lh7/a;
    .end annotation

    .line 3
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->c(Li9/y;Lokio/ByteString;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Li9/y;[B)Li9/c0;
    .locals 1
    .annotation runtime Lh7/a;
    .end annotation

    .line 4
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->d(Li9/y;[B)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Li9/y;[BI)Li9/c0;
    .locals 1
    .annotation runtime Lh7/a;
    .end annotation

    .line 5
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1, p2}, Li9/c0$a;->e(Li9/y;[BI)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Li9/y;[BII)Li9/c0;
    .locals 1
    .annotation runtime Lh7/a;
    .end annotation

    .line 6
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Li9/c0$a;->f(Li9/y;[BII)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/File;Li9/y;)Li9/c0;
    .locals 1

    .line 7
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->g(Ljava/io/File;Li9/y;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/FileDescriptor;Li9/y;)Li9/c0;
    .locals 1

    .line 8
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->h(Ljava/io/FileDescriptor;Li9/y;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Li9/y;)Li9/c0;
    .locals 1

    .line 9
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->i(Ljava/lang/String;Li9/y;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/ByteString;Li9/y;)Li9/c0;
    .locals 1

    .line 10
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->j(Lokio/ByteString;Li9/y;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/Path;Lokio/FileSystem;Li9/y;)Li9/c0;
    .locals 1

    .line 11
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1, p2}, Li9/c0$a;->k(Lokio/Path;Lokio/FileSystem;Li9/y;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)Li9/c0;
    .locals 1

    .line 12
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0}, Li9/c0$a;->l([B)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLi9/y;)Li9/c0;
    .locals 1

    .line 13
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1}, Li9/c0$a;->m([BLi9/y;)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLi9/y;I)Li9/c0;
    .locals 1

    .line 14
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1, p2}, Li9/c0$a;->n([BLi9/y;I)Li9/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLi9/y;II)Li9/c0;
    .locals 1

    .line 15
    sget-object v0, Li9/c0;->Companion:Li9/c0$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Li9/c0$a;->o([BLi9/y;II)Li9/c0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract contentType()Li9/y;
.end method

.method public isDuplex()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isOneShot()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract writeTo(Lokio/BufferedSink;)V
.end method
