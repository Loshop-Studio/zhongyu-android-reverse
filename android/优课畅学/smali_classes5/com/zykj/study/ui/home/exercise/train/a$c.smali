.class public final Lcom/zykj/study/ui/home/exercise/train/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavDirections;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/exercise/train/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Lcom/zykj/study/bean/exercise/QuestionBean;

.field public final d:Z

.field public final e:I


# direct methods
.method public constructor <init>(JILcom/zykj/study/bean/exercise/QuestionBean;Z)V
    .locals 1

    .line 1
    const-string v0, "questionBean"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->a:J

    .line 10
    .line 11
    iput p3, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->b:I

    .line 12
    .line 13
    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 14
    .line 15
    iput-boolean p5, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->d:Z

    .line 16
    .line 17
    sget p1, Lcom/zykj/study/R$id;->action_answerAreaFragment_to_singleChoiceFragment:I

    .line 18
    .line 19
    iput p1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->e:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/ui/home/exercise/train/a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/a$c;

    iget-wide v3, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->a:J

    iget-wide v5, p1, Lcom/zykj/study/ui/home/exercise/train/a$c;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->b:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/train/a$c;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-object v3, p1, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->d:Z

    iget-boolean p1, p1, Lcom/zykj/study/ui/home/exercise/train/a$c;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getActionId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public getArguments()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "exerciseId"

    .line 7
    .line 8
    iget-wide v2, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    const-string v1, "groupId"

    .line 14
    .line 15
    iget v2, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->b:I

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-class v1, Landroid/os/Parcelable;

    .line 21
    .line 22
    const-class v2, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const-string v3, "questionBean"

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 33
    .line 34
    const-string v2, "null cannot be cast to non-null type android.os.Parcelable"

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-class v1, Ljava/io/Serializable;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 52
    .line 53
    const-string v2, "null cannot be cast to non-null type java.io.Serializable"

    .line 54
    .line 55
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    check-cast v1, Ljava/io/Serializable;

    .line 59
    .line 60
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 61
    .line 62
    .line 63
    :goto_0
    const-string v1, "isLastQuestion"

    .line 64
    .line 65
    iget-boolean v2, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->d:Z

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, " must implement Parcelable or Serializable or must be an Enum."

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->a:J

    iget v2, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->b:I

    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-boolean v4, p0, Lcom/zykj/study/ui/home/exercise/train/a$c;->d:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ActionAnswerAreaFragmentToSingleChoiceFragment(exerciseId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", groupId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", questionBean="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isLastQuestion="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
