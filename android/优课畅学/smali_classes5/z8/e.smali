.class public Lz8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz8/e;->a:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    invoke-virtual {p0, v0, v1}, Lz8/e;->b(J)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    return-wide p1
.end method

.method public b(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz8/e;->a:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    iput-wide v0, p0, Lz8/e;->b:J

    .line 6
    .line 7
    iput-wide p1, p0, Lz8/e;->a:J

    .line 8
    .line 9
    return-wide v0
.end method
