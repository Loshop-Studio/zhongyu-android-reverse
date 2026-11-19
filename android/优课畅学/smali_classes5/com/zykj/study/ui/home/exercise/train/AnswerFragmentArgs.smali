.class public final Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;

.field public static final f:I


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Lcom/zykj/study/bean/exercise/QuestionBean;

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->f:I

    return-void
.end method

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
    iput-wide p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a:J

    .line 10
    .line 11
    iput p3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b:I

    .line 12
    .line 13
    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 14
    .line 15
    iput-boolean p5, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d:Z

    .line 16
    .line 17
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()Lcom/zykj/study/bean/exercise/QuestionBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d:Z

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
    instance-of v1, p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;

    iget-wide v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a:J

    iget-wide v5, p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b:I

    iget v3, p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-object v3, p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d:Z

    iget-boolean p1, p1, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->a:J

    iget v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->b:I

    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->c:Lcom/zykj/study/bean/exercise/QuestionBean;

    iget-boolean v4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerFragmentArgs;->d:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AnswerFragmentArgs(exerciseId="

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
