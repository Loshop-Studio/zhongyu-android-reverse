.class public final Lm4/f;
.super Lokhttp3/m0;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lokhttp3/m0;

.field public c:Lokio/BufferedSource;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lokhttp3/m0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm4/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 3
    new-instance v0, Lcoil3/decode/b;

    .line 4
    invoke-virtual {p1}, Lokhttp3/m0;->source()Lokio/BufferedSource;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcoil3/decode/b;-><init>(Lm4/f;Lokio/BufferedSource;)V

    .line 5
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object p1

    iput-object p1, p0, Lm4/f;->c:Lokio/BufferedSource;

    return-void
.end method

.method public constructor <init>(Lokhttp3/m0;Lm4/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm4/f;->a:I

    const-string v0, "responseBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 8
    iput-object p2, p0, Lm4/f;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget v0, p0, Lm4/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lokhttp3/m0;->close()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lokhttp3/m0;->close()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Lm4/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/m0;->contentLength()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lokhttp3/m0;->contentLength()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contentType()Lokhttp3/u;
    .locals 1

    .line 1
    iget v0, p0, Lm4/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/m0;->contentType()Lokhttp3/u;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lokhttp3/m0;->contentType()Lokhttp3/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final source()Lokio/BufferedSource;
    .locals 2

    .line 1
    iget v0, p0, Lm4/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm4/f;->c:Lokio/BufferedSource;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lm4/f;->c:Lokio/BufferedSource;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lm4/f;->b:Lokhttp3/m0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lokhttp3/m0;->source()Lokio/BufferedSource;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lm4/e;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, Lm4/e;-><init>(Lm4/f;Lokio/BufferedSource;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lm4/f;->c:Lokio/BufferedSource;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lm4/f;->c:Lokio/BufferedSource;

    .line 31
    .line 32
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
