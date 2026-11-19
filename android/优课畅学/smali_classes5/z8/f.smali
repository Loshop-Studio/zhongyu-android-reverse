.class public Lz8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:F

.field public c:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lz8/f;->b:F

    .line 7
    .line 8
    iput-wide p1, p0, Lz8/f;->a:J

    .line 9
    .line 10
    iput-wide p1, p0, Lz8/f;->c:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 2

    .line 1
    iget v0, p0, Lz8/f;->b:F

    .line 2
    .line 3
    cmpl-float v0, v0, p1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lz8/f;->b:F

    .line 8
    .line 9
    iget-wide v0, p0, Lz8/f;->a:J

    .line 10
    .line 11
    long-to-float v0, v0

    .line 12
    mul-float/2addr v0, p1

    .line 13
    float-to-long v0, v0

    .line 14
    iput-wide v0, p0, Lz8/f;->c:J

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lz8/f;->a:J

    .line 2
    .line 3
    long-to-float p1, p1

    .line 4
    iget p2, p0, Lz8/f;->b:F

    .line 5
    .line 6
    mul-float/2addr p1, p2

    .line 7
    float-to-long p1, p1

    .line 8
    iput-wide p1, p0, Lz8/f;->c:J

    .line 9
    .line 10
    return-void
.end method
