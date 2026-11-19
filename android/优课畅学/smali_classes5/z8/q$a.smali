.class public Lz8/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Lz8/q$b;

.field public b:Lz8/q$b;

.field public c:J

.field public d:J

.field public e:J

.field public f:F

.field public g:F

.field public final synthetic h:Lz8/q;


# direct methods
.method public constructor <init>(Lz8/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz8/q$a;->h:Lz8/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()[F
    .locals 4

    .line 1
    iget-object v0, p0, Lz8/q$a;->a:Lz8/q$b;

    .line 2
    .line 3
    iget v1, v0, Lz8/q$b;->a:F

    .line 4
    .line 5
    iget v0, v0, Lz8/q$b;->b:F

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [F

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput v1, v2, v3

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aput v0, v2, v1

    .line 15
    .line 16
    return-object v2
.end method

.method public b()F
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/q$a;->b:Lz8/q$b;

    .line 2
    .line 3
    iget-object v1, p0, Lz8/q$a;->a:Lz8/q$b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lz8/q$b;->a(Lz8/q$b;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public c()[F
    .locals 4

    .line 1
    iget-object v0, p0, Lz8/q$a;->b:Lz8/q$b;

    .line 2
    .line 3
    iget v1, v0, Lz8/q$b;->a:F

    .line 4
    .line 5
    iget v0, v0, Lz8/q$b;->b:F

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [F

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput v1, v2, v3

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aput v0, v2, v1

    .line 15
    .line 16
    return-object v2
.end method

.method public d(Lz8/q$b;Lz8/q$b;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lz8/q$a;->a:Lz8/q$b;

    .line 2
    .line 3
    iput-object p2, p0, Lz8/q$a;->b:Lz8/q$b;

    .line 4
    .line 5
    iget v0, p2, Lz8/q$b;->a:F

    .line 6
    .line 7
    iget v1, p1, Lz8/q$b;->a:F

    .line 8
    .line 9
    sub-float/2addr v0, v1

    .line 10
    iput v0, p0, Lz8/q$a;->f:F

    .line 11
    .line 12
    iget p2, p2, Lz8/q$b;->b:F

    .line 13
    .line 14
    iget p1, p1, Lz8/q$b;->b:F

    .line 15
    .line 16
    sub-float/2addr p2, p1

    .line 17
    iput p2, p0, Lz8/q$a;->g:F

    .line 18
    .line 19
    return-void
.end method
