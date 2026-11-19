.class public abstract Lcom/tendcloud/tenddata/as;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/as$a;,
        Lcom/tendcloud/tenddata/as$b;
    }
.end annotation


# static fields
.field public static a:I = 0x3e8

.field public static b:I = 0x40

.field public static final c:[B


# instance fields
.field protected d:Lcom/tendcloud/tenddata/aj$b;

.field protected e:Lcom/tendcloud/tenddata/bh$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "<policy-file-request/>\u0000"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/bw;->a(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/tendcloud/tenddata/as;->c:[B

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/aj$b;)Lcom/tendcloud/tenddata/bl;
    .locals 6

    .line 8
    invoke-static {p0}, Lcom/tendcloud/tenddata/as;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 9
    const-string v1, " "

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 10
    array-length v1, v0

    if-ne v1, v2, :cond_4

    .line 11
    sget-object v1, Lcom/tendcloud/tenddata/aj$b;->CLIENT:Lcom/tendcloud/tenddata/aj$b;

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne p1, v1, :cond_0

    .line 12
    new-instance p1, Lcom/tendcloud/tenddata/bn;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/bn;-><init>()V

    .line 13
    aget-object v1, v0, v3

    invoke-static {v1}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v1

    invoke-interface {p1, v1}, Lcom/tendcloud/tenddata/br;->setHttpStatus(S)V

    .line 14
    aget-object v0, v0, v2

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/br;->setHttpStatusMessage(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/bm;

    invoke-direct {p1}, Lcom/tendcloud/tenddata/bm;-><init>()V

    .line 16
    aget-object v0, v0, v3

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bk;->setResourceDescriptor(Ljava/lang/String;)V

    .line 17
    :goto_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/as;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_2

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 19
    const-string v1, ":"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 20
    array-length v1, v0

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 21
    aget-object v1, v0, v1

    aget-object v0, v0, v3

    const-string v4, "^ +"

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/tendcloud/tenddata/bl;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-static {p0}, Lcom/tendcloud/tenddata/as;->b(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 23
    :cond_1
    new-instance p0, Lcom/tendcloud/tenddata/ba;

    const-string p1, "not an http header"

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    if-eqz v0, :cond_3

    return-object p1

    .line 24
    :cond_3
    new-instance p0, Lcom/tendcloud/tenddata/ax;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/ax;-><init>()V

    throw p0

    .line 25
    :cond_4
    new-instance p0, Lcom/tendcloud/tenddata/ba;

    invoke-direct {p0}, Lcom/tendcloud/tenddata/ba;-><init>()V

    throw p0

    .line 26
    :cond_5
    new-instance p1, Lcom/tendcloud/tenddata/ax;

    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    move-result p0

    add-int/lit16 p0, p0, 0x80

    invoke-direct {p1, p0}, Lcom/tendcloud/tenddata/ax;-><init>(I)V

    throw p1
.end method

.method public static a(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x30

    .line 2
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 3
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    .line 4
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    const/16 v3, 0xd

    if-ne v1, v3, :cond_0

    const/16 v1, 0xa

    if-ne v2, v1, :cond_0

    .line 5
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result p0

    add-int/lit8 p0, p0, -0x2

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    const/4 p0, 0x0

    .line 6
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object v0

    :cond_0
    move v1, v2

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/tendcloud/tenddata/as;->a(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    move-result p0

    invoke-static {v0, v1, p0}, Lcom/tendcloud/tenddata/bw;->a([BII)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)I
    .locals 2

    if-ltz p1, :cond_0

    return p1

    .line 66
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/ay;

    const/16 v0, 0x3ea

    const-string v1, "Negative count"

    invoke-direct {p1, v0, v1}, Lcom/tendcloud/tenddata/ay;-><init>(ILjava/lang/String;)V

    throw p1
.end method

.method public abstract a(Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/as$b;
.end method

.method public abstract a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)Lcom/tendcloud/tenddata/as$b;
.end method

.method public abstract a(Lcom/tendcloud/tenddata/bk;)Lcom/tendcloud/tenddata/bk;
.end method

.method public abstract a(Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/bl;
.end method

.method public abstract a(Lcom/tendcloud/tenddata/bh;)Ljava/nio/ByteBuffer;
.end method

.method public a(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/bh$a;",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation

    .line 28
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->BINARY:Lcom/tendcloud/tenddata/bh$a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->TEXT:Lcom/tendcloud/tenddata/bh$a;

    if-eq p1, v0, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only Opcode.BINARY or  Opcode.TEXT are allowed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    if-eqz v0, :cond_2

    .line 31
    sget-object v0, Lcom/tendcloud/tenddata/bh$a;->CONTINUOUS:Lcom/tendcloud/tenddata/bh$a;

    iput-object v0, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    goto :goto_1

    .line 32
    :cond_2
    iput-object p1, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    .line 33
    :goto_1
    new-instance v0, Lcom/tendcloud/tenddata/bi;

    iget-object v1, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    invoke-direct {v0, v1}, Lcom/tendcloud/tenddata/bi;-><init>(Lcom/tendcloud/tenddata/bh$a;)V

    .line 34
    :try_start_0
    invoke-interface {v0, p2}, Lcom/tendcloud/tenddata/bg;->setPayload(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Lcom/tendcloud/tenddata/ay; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    invoke-interface {v0, p3}, Lcom/tendcloud/tenddata/bg;->setFin(Z)V

    if-eqz p3, :cond_3

    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    goto :goto_2

    .line 37
    :cond_3
    iput-object p1, p0, Lcom/tendcloud/tenddata/as;->e:Lcom/tendcloud/tenddata/bh$a;

    .line 38
    :goto_2
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 39
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public a(Lcom/tendcloud/tenddata/bo;Lcom/tendcloud/tenddata/aj$b;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/bo;",
            "Lcom/tendcloud/tenddata/aj$b;",
            ")",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 40
    invoke-virtual {p0, p1, p2, v0}, Lcom/tendcloud/tenddata/as;->a(Lcom/tendcloud/tenddata/bo;Lcom/tendcloud/tenddata/aj$b;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/tendcloud/tenddata/bo;Lcom/tendcloud/tenddata/aj$b;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/bo;",
            "Lcom/tendcloud/tenddata/aj$b;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance p2, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    instance-of v0, p1, Lcom/tendcloud/tenddata/bj;

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "GET "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    move-object v0, p1

    check-cast v0, Lcom/tendcloud/tenddata/bj;

    invoke-interface {v0}, Lcom/tendcloud/tenddata/bj;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    const-string v0, " HTTP/1.1"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 46
    :cond_0
    instance-of v0, p1, Lcom/tendcloud/tenddata/bq;

    if-eqz v0, :cond_5

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP/1.1 101 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    check-cast v1, Lcom/tendcloud/tenddata/bq;

    invoke-interface {v1}, Lcom/tendcloud/tenddata/bq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    :goto_0
    const-string v0, "\r\n"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bo;->c()Ljava/util/Iterator;

    move-result-object v1

    .line 50
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 52
    invoke-interface {p1, v2}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 53
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    const-string v2, ": "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/tendcloud/tenddata/bw;->b(Ljava/lang/String;)[B

    move-result-object p2

    if-eqz p3, :cond_2

    .line 59
    invoke-interface {p1}, Lcom/tendcloud/tenddata/bo;->d()[B

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_3

    const/4 p3, 0x0

    goto :goto_3

    .line 60
    :cond_3
    array-length p3, p1

    :goto_3
    array-length v0, p2

    add-int/2addr p3, v0

    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 61
    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_4

    .line 62
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 63
    :cond_4
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 64
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 65
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unknow role"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract a(Ljava/lang/String;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Ljava/nio/ByteBuffer;Z)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a()V
.end method

.method public a(Lcom/tendcloud/tenddata/bo;)Z
    .locals 2

    .line 27
    const-string v0, "Upgrade"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "websocket"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connection"

    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "upgrade"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract b()Lcom/tendcloud/tenddata/as$a;
.end method

.method public abstract c()Lcom/tendcloud/tenddata/as;
.end method

.method public abstract c(Ljava/nio/ByteBuffer;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            ")",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/bh;",
            ">;"
        }
    .end annotation
.end method

.method public d()Lcom/tendcloud/tenddata/aj$b;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    return-object v0
.end method

.method public d(Ljava/nio/ByteBuffer;)Lcom/tendcloud/tenddata/bo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/as;->a(Ljava/nio/ByteBuffer;Lcom/tendcloud/tenddata/aj$b;)Lcom/tendcloud/tenddata/bl;

    move-result-object p1

    return-object p1
.end method

.method public setParseMode(Lcom/tendcloud/tenddata/aj$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/as;->d:Lcom/tendcloud/tenddata/aj$b;

    .line 2
    .line 3
    return-void
.end method
