.class public abstract Lje/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/x$a;
    }
.end annotation


# static fields
.field public static final Companion:Lje/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lje/x$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lje/x$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lje/x;->Companion:Lje/x$a;

    .line 8
    .line 9
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

.method public static final create(Ljava/io/File;Lje/t;)Lje/x;
    .locals 1

    .line 1
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->a(Ljava/io/File;Lje/t;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/lang/String;Lje/t;)Lje/x;
    .locals 1

    .line 2
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->b(Ljava/lang/String;Lje/t;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lje/t;Ljava/io/File;)Lje/x;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 3
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->c(Lje/t;Ljava/io/File;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lje/t;Ljava/lang/String;)Lje/x;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 4
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->d(Lje/t;Ljava/lang/String;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lje/t;Lokio/ByteString;)Lje/x;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 5
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->e(Lje/t;Lokio/ByteString;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lje/t;[B)Lje/x;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 6
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->f(Lje/t;[B)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lje/t;[BI)Lje/x;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 7
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1, p2}, Lje/x$a;->g(Lje/t;[BI)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lje/t;[BII)Lje/x;
    .locals 1
    .annotation runtime Lqc/a;
    .end annotation

    .line 8
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lje/x$a;->h(Lje/t;[BII)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lokio/ByteString;Lje/t;)Lje/x;
    .locals 1

    .line 9
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->i(Lokio/ByteString;Lje/t;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)Lje/x;
    .locals 1

    .line 10
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0}, Lje/x$a;->j([B)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLje/t;)Lje/x;
    .locals 1

    .line 11
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1}, Lje/x$a;->k([BLje/t;)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLje/t;I)Lje/x;
    .locals 1

    .line 12
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1, p2}, Lje/x$a;->l([BLje/t;I)Lje/x;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLje/t;II)Lje/x;
    .locals 1

    .line 13
    sget-object v0, Lje/x;->Companion:Lje/x$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lje/x$a;->m([BLje/t;II)Lje/x;

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

.method public abstract contentType()Lje/t;
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
