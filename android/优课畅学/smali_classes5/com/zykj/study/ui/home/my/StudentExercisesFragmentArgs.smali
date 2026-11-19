.class public final Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;
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
        Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->f:Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userId"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a:I

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b:Ljava/lang/String;

    .line 17
    .line 18
    iput p3, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c:I

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d:Ljava/lang/String;

    .line 21
    .line 22
    iput-boolean p5, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e:Z

    .line 23
    .line 24
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->f:Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;

    iget v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a:I

    iget v3, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c:I

    iget v3, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e:Z

    iget-boolean p1, p1, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->a:I

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->b:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->c:I

    iget-object v3, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->d:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/zykj/study/ui/home/my/StudentExercisesFragmentArgs;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "StudentExercisesFragmentArgs(superviseId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fromScore="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
