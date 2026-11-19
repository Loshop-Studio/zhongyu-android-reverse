.class public final Li9/c0$a$e;
.super Li9/c0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/c0$a;->o([BLi9/y;II)Li9/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Li9/y;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Li9/y;I[BI)V
    .locals 0

    .line 1
    iput-object p1, p0, Li9/c0$a$e;->a:Li9/y;

    .line 2
    .line 3
    iput p2, p0, Li9/c0$a$e;->b:I

    .line 4
    .line 5
    iput-object p3, p0, Li9/c0$a$e;->c:[B

    .line 6
    .line 7
    iput p4, p0, Li9/c0$a$e;->d:I

    .line 8
    .line 9
    invoke-direct {p0}, Li9/c0;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Li9/c0$a$e;->b:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public contentType()Li9/y;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/c0$a$e;->a:Li9/y;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 3

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li9/c0$a$e;->c:[B

    .line 7
    .line 8
    iget v1, p0, Li9/c0$a$e;->d:I

    .line 9
    .line 10
    iget v2, p0, Li9/c0$a$e;->b:I

    .line 11
    .line 12
    invoke-interface {p1, v0, v1, v2}, Lokio/BufferedSink;->write([BII)Lokio/BufferedSink;

    .line 13
    .line 14
    .line 15
    return-void
.end method
