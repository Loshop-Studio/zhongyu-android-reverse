.class public final Ll5/h;
.super Lf5/e0;
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
    invoke-direct {p0}, Lf5/e0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ll5/h;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, Ll5/h;->b:J

    .line 12
    .line 13
    iput-object p4, p0, Ll5/h;->c:Lokio/BufferedSource;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ll5/h;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Lf5/y;
    .locals 2

    .line 1
    iget-object v0, p0, Ll5/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lf5/y;->e:Lf5/y$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lf5/y$a;->b(Ljava/lang/String;)Lf5/y;

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
    iget-object v0, p0, Ll5/h;->c:Lokio/BufferedSource;

    .line 2
    .line 3
    return-object v0
.end method
