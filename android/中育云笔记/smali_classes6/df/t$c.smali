.class public final Ldf/t$c;
.super Lje/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final c:Lje/t;

.field public final d:J


# direct methods
.method public constructor <init>(Lje/t;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lje/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldf/t$c;->c:Lje/t;

    .line 5
    .line 6
    iput-wide p2, p0, Ldf/t$c;->d:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ldf/t$c;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Lje/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/t$c;->c:Lje/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Cannot read raw response body of a converted body."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
