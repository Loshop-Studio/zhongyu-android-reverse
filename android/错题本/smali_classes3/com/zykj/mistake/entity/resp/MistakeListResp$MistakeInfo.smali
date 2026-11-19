.class public final Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/mistake/entity/resp/MistakeListResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MistakeInfo"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u00103\u001a\u00020%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u001d\"\u0004\u0008!\u0010\u001fR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u001d\"\u0004\u0008#\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\'\"\u0004\u0008,\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010\'\"\u0004\u0008/\u0010)R\u001c\u00100\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u0010\'\"\u0004\u00082\u0010)R\u001c\u00104\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u0010\'\"\u0004\u00086\u0010)R\u001c\u00107\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00088\u0010\'\"\u0004\u00089\u0010)R\u001a\u0010:\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008;\u0010\u001d\"\u0004\u0008<\u0010\u001fR\u001e\u0010=\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR\u001e\u0010C\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\u0008D\u0010?\"\u0004\u0008E\u0010AR\u001e\u0010F\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\u0008G\u0010?\"\u0004\u0008H\u0010AR.\u0010I\u001a\u0016\u0012\u0004\u0012\u00020%\u0018\u00010Jj\n\u0012\u0004\u0012\u00020%\u0018\u0001`KX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010OR\u001a\u0010P\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Q\u0010\r\"\u0004\u0008R\u0010\u000fR\u001a\u0010S\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008T\u0010\r\"\u0004\u0008U\u0010\u000fR\u001a\u0010V\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008W\u0010\r\"\u0004\u0008X\u0010\u000fR\u001a\u0010Y\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008Z\u0010\u0007\"\u0004\u0008[\u0010\tR\u001c\u0010\\\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008]\u0010\'\"\u0004\u0008^\u0010)R\u001c\u0010_\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008`\u0010\'\"\u0004\u0008a\u0010)R\u001a\u0010b\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008b\u0010\u001d\"\u0004\u0008c\u0010\u001f\u00a8\u0006d"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;",
        "",
        "<init>",
        "()V",
        "id",
        "",
        "getId",
        "()J",
        "setId",
        "(J)V",
        "bookId",
        "",
        "getBookId",
        "()I",
        "setBookId",
        "(I)V",
        "collectionIds",
        "",
        "getCollectionIds",
        "()Ljava/util/List;",
        "setCollectionIds",
        "(Ljava/util/List;)V",
        "isMastered",
        "",
        "()Ljava/lang/Boolean;",
        "setMastered",
        "(Ljava/lang/Boolean;)V",
        "Ljava/lang/Boolean;",
        "isInCurrentCollection",
        "()Z",
        "setInCurrentCollection",
        "(Z)V",
        "isInOtherCollection",
        "setInOtherCollection",
        "isRelatedQstGroup",
        "setRelatedQstGroup",
        "source",
        "",
        "getSource",
        "()Ljava/lang/String;",
        "setSource",
        "(Ljava/lang/String;)V",
        "title",
        "getTitle",
        "setTitle",
        "number",
        "getNumber",
        "setNumber",
        "name",
        "getName",
        "setName",
        "getRealTitle",
        "creationTime",
        "getCreationTime",
        "setCreationTime",
        "stemShoot",
        "getStemShoot",
        "setStemShoot",
        "hasStem",
        "getHasStem",
        "setHasStem",
        "diff",
        "getDiff",
        "()Ljava/lang/Integer;",
        "setDiff",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "attainedLevel",
        "getAttainedLevel",
        "setAttainedLevel",
        "errorReason",
        "getErrorReason",
        "setErrorReason",
        "tagNames",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "getTagNames",
        "()Ljava/util/ArrayList;",
        "setTagNames",
        "(Ljava/util/ArrayList;)V",
        "exerciseCount",
        "getExerciseCount",
        "setExerciseCount",
        "wrongCount",
        "getWrongCount",
        "setWrongCount",
        "rightCount",
        "getRightCount",
        "setRightCount",
        "topicId",
        "getTopicId",
        "setTopicId",
        "topicName",
        "getTopicName",
        "setTopicName",
        "examName",
        "getExamName",
        "setExamName",
        "isSelected",
        "setSelected",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMistakeListResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeListResp.kt\ncom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private attainedLevel:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private bookId:I

.field private collectionIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private creationTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private diff:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private errorReason:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private examName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private exerciseCount:I

.field private hasStem:Z

.field private id:J

.field private isInCurrentCollection:Z

.field private isInOtherCollection:Z

.field private isMastered:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isRelatedQstGroup:Z

.field private isSelected:Z

.field private name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private number:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private rightCount:I

.field private source:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stemShoot:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private tagNames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private title:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private topicId:J

.field private topicName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private wrongCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->hasStem:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->tagNames:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getAttainedLevel()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->attainedLevel:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBookId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->bookId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCollectionIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->collectionIds:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCreationTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->creationTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDiff()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->diff:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getErrorReason()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->errorReason:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->examName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExerciseCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->exerciseCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getHasStem()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->hasStem:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->number:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRealTitle()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->title:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-lez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->name:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-lez v2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object v0, v1

    .line 29
    :goto_1
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_3
    :goto_2
    move-object v1, v0

    .line 33
    goto :goto_4

    .line 34
    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->number:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lez v2, :cond_5

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_5
    :goto_4
    const-string v0, ""

    .line 46
    .line 47
    if-eqz v1, :cond_8

    .line 48
    .line 49
    sget v2, Lcom/zykj/mistake/R$string;->mistake_title:I

    .line 50
    .line 51
    iget-object v3, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->source:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v3, :cond_6

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    :cond_6
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v2, v1}, Lcom/blankj/utilcode/util/c;->h(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_7
    return-object v1

    .line 68
    :cond_8
    :goto_5
    iget-object v1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->source:Ljava/lang/String;

    .line 69
    .line 70
    if-nez v1, :cond_9

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_9
    return-object v1
.end method

.method public final getRightCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->rightCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStemShoot()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->stemShoot:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTagNames()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->tagNames:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTopicId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->topicId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTopicName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->topicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWrongCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->wrongCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final isInCurrentCollection()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isInCurrentCollection:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isInOtherCollection()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isInOtherCollection:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isMastered()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isMastered:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isRelatedQstGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isRelatedQstGroup:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setAttainedLevel(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->attainedLevel:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setBookId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->bookId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setCollectionIds(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->collectionIds:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreationTime(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->creationTime:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDiff(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->diff:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setErrorReason(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->errorReason:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setExamName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->examName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setExerciseCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->exerciseCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setHasStem(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->hasStem:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setInCurrentCollection(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isInCurrentCollection:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setInOtherCollection(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isInOtherCollection:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMastered(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isMastered:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNumber(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->number:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setRelatedQstGroup(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isRelatedQstGroup:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRightCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->rightCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSource(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setStemShoot(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->stemShoot:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTagNames(Ljava/util/ArrayList;)V
    .locals 0
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->tagNames:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTopicId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->topicId:J

    .line 2
    .line 3
    return-void
.end method

.method public final setTopicName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->topicName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setWrongCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeInfo;->wrongCount:I

    .line 2
    .line 3
    return-void
.end method
