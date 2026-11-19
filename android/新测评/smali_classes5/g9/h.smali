.class public final Lg9/h;
.super La9/z;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLokio/BufferedSource;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La9/z;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lg9/h;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, Lg9/h;->b:J

    .line 12
    .line 13
    iput-object p4, p0, Lg9/h;->c:Lokio/BufferedSource;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lg9/h;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()La9/t;
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, La9/t;->e:La9/t$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, La9/t$a;->b(Ljava/lang/String;)La9/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/h;->c:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
