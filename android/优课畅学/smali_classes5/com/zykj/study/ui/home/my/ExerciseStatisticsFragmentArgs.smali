.class public final Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;
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
        Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->d:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b:I

    .line 7
    .line 8
    iput p3, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c:I

    .line 9
    .line 10
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->d:Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a:I

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;

    iget v1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a:I

    iget v3, p1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b:I

    iget v3, p1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c:I

    iget p1, p1, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->a:I

    iget v1, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->b:I

    iget v2, p0, Lcom/zykj/study/ui/home/my/ExerciseStatisticsFragmentArgs;->c:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ExerciseStatisticsFragmentArgs(superviseId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
