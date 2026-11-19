.class public Lz8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I


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
    iput v0, p0, Lz8/i;->a:I

    .line 6
    .line 7
    iput v0, p0, Lz8/i;->b:I

    .line 8
    .line 9
    iput v0, p0, Lz8/i;->c:I

    .line 10
    .line 11
    iput v0, p0, Lz8/i;->d:I

    .line 12
    .line 13
    iput v0, p0, Lz8/i;->e:I

    .line 14
    .line 15
    iput v0, p0, Lz8/i;->f:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lz8/i;->b:I

    .line 3
    .line 4
    iput v0, p0, Lz8/i;->a:I

    .line 5
    .line 6
    iput v0, p0, Lz8/i;->c:I

    .line 7
    .line 8
    iput v0, p0, Lz8/i;->d:I

    .line 9
    .line 10
    iput v0, p0, Lz8/i;->e:I

    .line 11
    .line 12
    iput v0, p0, Lz8/i;->f:I

    .line 13
    .line 14
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget v0, p0, Lz8/i;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lz8/i;->d:I

    .line 6
    .line 7
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget v0, p0, Lz8/i;->a:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lz8/i;->a:I

    .line 6
    .line 7
    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget v0, p0, Lz8/i;->f:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lz8/i;->f:I

    .line 6
    .line 7
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget v0, p0, Lz8/i;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lz8/i;->e:I

    .line 6
    .line 7
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget v0, p0, Lz8/i;->b:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lz8/i;->b:I

    .line 6
    .line 7
    return-void
.end method
