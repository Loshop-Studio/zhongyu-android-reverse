.class public final Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Z

.field public final b:F

.field public final c:I

.field public final d:I

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZFIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a:Z

    .line 5
    .line 6
    iput p2, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b:F

    .line 7
    .line 8
    iput p3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;

    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a:Z

    iget-boolean v3, p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b:F

    iget v3, p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c:I

    iget v3, p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d:I

    iget v3, p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e:Z

    iget-boolean p1, p1, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->a:Z

    iget v1, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->b:F

    iget v2, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->c:I

    iget v3, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->d:I

    iget-boolean v4, p0, Lcom/friday/lecture/floatwindow/canvas/SimpleCanvasLayout$b;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "GcvPaintEntity(fingerMode="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paintWidth="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", paintColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", showOptions="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
