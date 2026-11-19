.class public Lz8/q$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public final synthetic c:Lz8/q;


# direct methods
.method public constructor <init>(Lz8/q;FF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz8/q$b;->c:Lz8/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lz8/q$b;->a:F

    .line 7
    .line 8
    iput p3, p0, Lz8/q$b;->b:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lz8/q$b;)F
    .locals 2

    .line 1
    iget v0, p0, Lz8/q$b;->a:F

    .line 2
    .line 3
    iget v1, p1, Lz8/q$b;->a:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Lz8/q$b;->b:F

    .line 11
    .line 12
    iget p1, p1, Lz8/q$b;->b:F

    .line 13
    .line 14
    sub-float/2addr v1, p1

    .line 15
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    mul-float/2addr v0, v0

    .line 20
    mul-float/2addr p1, p1

    .line 21
    add-float/2addr v0, p1

    .line 22
    float-to-double v0, v0

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    double-to-float p1, v0

    .line 28
    return p1
.end method
