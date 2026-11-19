.class public final Lr2/z$a$c;
.super Lr2/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/z$a;->h([BLr2/v;II)Lr2/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:[B

.field public final synthetic b:Lr2/v;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public constructor <init>([BLr2/v;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/z$a$c;->a:[B

    .line 2
    .line 3
    iput-object p2, p0, Lr2/z$a$c;->b:Lr2/v;

    .line 4
    .line 5
    iput p3, p0, Lr2/z$a$c;->c:I

    .line 6
    .line 7
    iput p4, p0, Lr2/z$a$c;->d:I

    .line 8
    .line 9
    invoke-direct {p0}, Lr2/z;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Lr2/z$a$c;->c:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public contentType()Lr2/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lr2/z$a$c;->b:Lr2/v;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr2/z$a$c;->a:[B

    .line 7
    .line 8
    iget v1, p0, Lr2/z$a$c;->d:I

    .line 9
    .line 10
    iget v2, p0, Lr2/z$a$c;->c:I

    .line 11
    .line 12
    invoke-interface {p1, v0, v1, v2}, Lokio/BufferedSink;->write([BII)Lokio/BufferedSink;

    .line 13
    .line 14
    .line 15
    return-void
.end method
