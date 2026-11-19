.class public final Lokhttp3/k0;
.super Lokhttp3/m0;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:J

.field public final c:Lokio/BufferedSource;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLokio/BufferedSource;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lokhttp3/k0;->a:I

    const-string v0, "source"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lokhttp3/k0;->d:Ljava/lang/Object;

    .line 3
    iput-wide p2, p0, Lokhttp3/k0;->b:J

    .line 4
    iput-object p4, p0, Lokhttp3/k0;->c:Lokio/BufferedSource;

    return-void
.end method

.method public constructor <init>(Lokhttp3/u;JLokio/BufferedSource;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/k0;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lokhttp3/k0;->d:Ljava/lang/Object;

    iput-wide p2, p0, Lokhttp3/k0;->b:J

    iput-object p4, p0, Lokhttp3/k0;->c:Lokio/BufferedSource;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/k0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lokhttp3/k0;->b:J

    .line 7
    .line 8
    return-wide v0

    .line 9
    :pswitch_0
    iget-wide v0, p0, Lokhttp3/k0;->b:J

    .line 10
    .line 11
    return-wide v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contentType()Lokhttp3/u;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/k0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/k0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lokhttp3/u;->d:Ljava/util/regex/Pattern;

    .line 13
    .line 14
    invoke-static {v1}, Lokhttp3/o;->h(Ljava/lang/String;)Lokhttp3/u;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    return-object v0

    .line 21
    :pswitch_0
    check-cast v1, Lokhttp3/u;

    .line 22
    .line 23
    return-object v1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/k0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/k0;->c:Lokio/BufferedSource;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, Lokhttp3/k0;->c:Lokio/BufferedSource;

    .line 10
    .line 11
    return-object v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
