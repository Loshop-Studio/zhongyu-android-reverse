.class public Lj3/b0$a;
.super Lr2/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lr2/z;

.field public final b:Lr2/v;


# direct methods
.method public constructor <init>(Lr2/z;Lr2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr2/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/b0$a;->a:Lr2/z;

    .line 5
    .line 6
    iput-object p2, p0, Lj3/b0$a;->b:Lr2/v;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Lj3/b0$a;->a:Lr2/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr2/z;->contentLength()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Lr2/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/b0$a;->b:Lr2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/b0$a;->a:Lr2/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr2/z;->writeTo(Lokio/BufferedSink;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
