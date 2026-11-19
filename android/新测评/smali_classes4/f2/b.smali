.class public Lf2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:I

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lf2/b;->c:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lf2/b;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lf2/b;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf2/b;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lf2/b;->a:J

    .line 2
    .line 3
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lf2/b;->b:I

    .line 2
    .line 3
    return-void
.end method
