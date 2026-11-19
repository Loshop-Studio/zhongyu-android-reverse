.class public final Lcom/zykj/evaluation/bean/GuideGroup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/zykj/evaluation/bean/BaseGuideQuestion;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0006\u0010\u001e\u001a\u00020\u0007J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000cH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u000fH\u00c6\u0003J_\u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020\u000f2\u0008\u0010(\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001J\t\u0010*\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006+"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/GuideGroup;",
        "T",
        "Lcom/zykj/evaluation/bean/BaseGuideQuestion;",
        "",
        "number",
        "",
        "name",
        "",
        "qstCount",
        "score",
        "",
        "questions",
        "",
        "description",
        "showGroupNumber",
        "",
        "<init>",
        "(ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;Z)V",
        "getNumber",
        "()I",
        "getName",
        "()Ljava/lang/String;",
        "getQstCount",
        "getScore",
        "()D",
        "getQuestions",
        "()Ljava/util/List;",
        "getDescription",
        "getShowGroupNumber",
        "()Z",
        "getTitle",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final description:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final number:I

.field private final qstCount:I

.field private final questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final score:D

.field private final showGroupNumber:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "ID",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "questions"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    .line 12
    .line 13
    iput p3, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    .line 14
    .line 15
    iput-wide p4, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    .line 16
    .line 17
    iput-object p6, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    .line 18
    .line 19
    iput-object p7, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p8, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/GuideGroup;ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lcom/zykj/evaluation/bean/GuideGroup;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p4, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p6, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p7, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-boolean p8, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    :cond_6
    move-object p9, p7

    move p10, p8

    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/zykj/evaluation/bean/GuideGroup;->copy(ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;Z)Lcom/zykj/evaluation/bean/GuideGroup;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    return v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    return-wide v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;Z)Lcom/zykj/evaluation/bean/GuideGroup;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "ID",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/zykj/evaluation/bean/GuideGroup<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "questions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/bean/GuideGroup;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/zykj/evaluation/bean/GuideGroup;-><init>(ILjava/lang/String;IDLjava/util/List;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/GuideGroup;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/GuideGroup;

    iget v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    iget v3, p1, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    iget v3, p1, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    iget-boolean p1, p1, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQstCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getShowGroupNumber()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lp7/c;->e:Lp7/c;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lp7/c;->a(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " \u3001"

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    .line 37
    .line 38
    :goto_0
    if-nez v0, :cond_1

    .line 39
    .line 40
    const-string v0, ""

    .line 41
    .line 42
    :cond_1
    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lcom/zykj/evaluation/bean/GuideGroup;->number:I

    iget-object v1, p0, Lcom/zykj/evaluation/bean/GuideGroup;->name:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/evaluation/bean/GuideGroup;->qstCount:I

    iget-wide v3, p0, Lcom/zykj/evaluation/bean/GuideGroup;->score:D

    iget-object v5, p0, Lcom/zykj/evaluation/bean/GuideGroup;->questions:Ljava/util/List;

    iget-object v6, p0, Lcom/zykj/evaluation/bean/GuideGroup;->description:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/zykj/evaluation/bean/GuideGroup;->showGroupNumber:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "GuideGroup(number="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", qstCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", questions="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showGroupNumber="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
