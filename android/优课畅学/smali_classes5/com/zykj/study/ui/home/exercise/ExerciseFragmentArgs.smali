.class public final Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;
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
        Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->e:Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b:I

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c:I

    .line 9
    .line 10
    iput p4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->d:I

    .line 11
    .line 12
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->e:Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c:I

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->d:I

    iget p1, p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->d:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a:I

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b:I

    iget v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c:I

    iget v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->d:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ExerciseFragmentArgs(courseId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
