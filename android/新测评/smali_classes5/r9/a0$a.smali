.class public Lr9/a0$a;
.super La9/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:La9/x;

.field public final b:La9/t;


# direct methods
.method public constructor <init>(La9/x;La9/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La9/x;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/a0$a;->a:La9/x;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/a0$a;->b:La9/t;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lr9/a0$a;->a:La9/x;

    .line 2
    .line 3
    invoke-virtual {v0}, La9/x;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()La9/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/a0$a;->b:La9/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/a0$a;->a:La9/x;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La9/x;->writeTo(Lokio/BufferedSink;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
