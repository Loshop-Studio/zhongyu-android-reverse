.class public final Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->f:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(IIIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->b:I

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->e:Z

    .line 13
    .line 14
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->f:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->e:Z

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->b:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->d:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->e:Z

    iget-boolean p1, p1, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->a:I

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->b:I

    iget v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->c:I

    iget v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->d:I

    iget-boolean v4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragmentArgs;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ExerciseViewerFragmentArgs(courseId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", index="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isAuthor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
