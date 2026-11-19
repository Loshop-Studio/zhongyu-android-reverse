.class public final Lio/objectbox/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:J

.field public i:I

.field public j:J

.field public final synthetic k:Lio/objectbox/e;


# direct methods
.method public constructor <init>(Lio/objectbox/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/objectbox/d;->k:Lio/objectbox/e;

    .line 5
    .line 6
    iput p5, p0, Lio/objectbox/d;->a:I

    .line 7
    .line 8
    iget-object p1, p1, Lio/objectbox/e;->a:Lcom/google/flatbuffers/a;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lio/objectbox/d;->c:I

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, p3}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p3, p2

    .line 25
    :goto_0
    iput p3, p0, Lio/objectbox/d;->d:I

    .line 26
    .line 27
    if-eqz p4, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1, p4}, Lcom/google/flatbuffers/a;->e(Ljava/lang/CharSequence;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    :cond_1
    iput p2, p0, Lio/objectbox/d;->b:I

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/objectbox/d;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Already finished"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final b(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/objectbox/d;->f:I

    .line 5
    .line 6
    return-void
.end method

.method public final c(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/objectbox/d;->g:I

    .line 5
    .line 6
    iput-wide p2, p0, Lio/objectbox/d;->h:J

    .line 7
    .line 8
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/d;->a()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/objectbox/d;->i:I

    .line 5
    .line 6
    iput-wide p2, p0, Lio/objectbox/d;->j:J

    .line 7
    .line 8
    return-void
.end method
