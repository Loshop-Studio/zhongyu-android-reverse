.class public final Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;
.super Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Z

.field public final d:D


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZIZD)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->a:Z

    .line 6
    .line 7
    iput p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->b:I

    .line 8
    .line 9
    iput-boolean p3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c:Z

    .line 10
    .line 11
    iput-wide p4, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->d:D

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->d:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->a:Z

    iget-boolean v3, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->b:I

    iget v3, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c:Z

    iget-boolean v3, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->d:D

    iget-wide v5, p1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->d:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->d:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->a:Z

    iget v1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->b:I

    iget-boolean v2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->c:Z

    iget-wide v3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/b$a;->d:D

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "FullScreenEvent(isFullscreen="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", currentProgress="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isPlaying="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", speedRate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
