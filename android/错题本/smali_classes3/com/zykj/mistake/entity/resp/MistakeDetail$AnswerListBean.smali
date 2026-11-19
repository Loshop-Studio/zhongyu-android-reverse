.class public final Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/mistake/entity/resp/MistakeDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AnswerListBean"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0007\"\u0004\u0008\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\r\"\u0004\u0008\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\r\"\u0004\u0008\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u001a\u0010&\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\r\"\u0004\u0008(\u0010\u000fR\u001e\u0010)\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u001e\u0010/\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\u00080\u0010+\"\u0004\u00081\u0010-R*\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\u0008\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R*\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\u0008\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u00106\"\u0004\u0008;\u00108R*\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\u0008\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008=\u00106\"\u0004\u0008>\u00108R*\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000503j\u0008\u0012\u0004\u0012\u00020\u0005`4X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008@\u00106\"\u0004\u0008A\u00108R\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008C\u0010\u0007\"\u0004\u0008D\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008F\u0010\u0007\"\u0004\u0008G\u0010\t\u00a8\u0006H"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;",
        "",
        "<init>",
        "()V",
        "uuid",
        "",
        "getUuid",
        "()Ljava/lang/String;",
        "setUuid",
        "(Ljava/lang/String;)V",
        "number",
        "",
        "getNumber",
        "()I",
        "setNumber",
        "(I)V",
        "index",
        "getIndex",
        "setIndex",
        "itemType",
        "getItemType",
        "setItemType",
        "revisingResult",
        "getRevisingResult",
        "setRevisingResult",
        "parentRevisingAnswerd",
        "",
        "getParentRevisingAnswerd",
        "()Ljava/lang/Boolean;",
        "setParentRevisingAnswerd",
        "(Ljava/lang/Boolean;)V",
        "Ljava/lang/Boolean;",
        "lastRoundRevisingRecord",
        "Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;",
        "getLastRoundRevisingRecord",
        "()Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;",
        "setLastRoundRevisingRecord",
        "(Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;)V",
        "result",
        "getResult",
        "setResult",
        "originResult",
        "getOriginResult",
        "()Ljava/lang/Integer;",
        "setOriginResult",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "taskState",
        "getTaskState",
        "setTaskState",
        "examAnswers",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "getExamAnswers",
        "()Ljava/util/ArrayList;",
        "setExamAnswers",
        "(Ljava/util/ArrayList;)V",
        "examComments",
        "getExamComments",
        "setExamComments",
        "revisingAnswers",
        "getRevisingAnswers",
        "setRevisingAnswers",
        "revisingComments",
        "getRevisingComments",
        "setRevisingComments",
        "examMicroLessonComment",
        "getExamMicroLessonComment",
        "setExamMicroLessonComment",
        "reviseMicroLessonComment",
        "getReviseMicroLessonComment",
        "setReviseMicroLessonComment",
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
.field private examAnswers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private examComments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private examMicroLessonComment:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private index:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private itemType:I

.field private transient lastRoundRevisingRecord:Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private number:I

.field private originResult:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private transient parentRevisingAnswerd:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private result:I

.field private reviseMicroLessonComment:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private revisingAnswers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private revisingComments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private revisingResult:I

.field private taskState:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private uuid:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->uuid:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->index:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingResult:I

    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examAnswers:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examComments:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingAnswers:Ljava/util/ArrayList;

    .line 33
    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingComments:Ljava/util/ArrayList;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examMicroLessonComment:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->reviseMicroLessonComment:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final getExamAnswers()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examAnswers:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamComments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examComments:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExamMicroLessonComment()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examMicroLessonComment:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIndex()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->index:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->itemType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLastRoundRevisingRecord()Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->lastRoundRevisingRecord:Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->number:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOriginResult()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->originResult:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParentRevisingAnswerd()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->parentRevisingAnswerd:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->result:I

    .line 2
    .line 3
    return v0
.end method

.method public final getReviseMicroLessonComment()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->reviseMicroLessonComment:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRevisingAnswers()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingAnswers:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRevisingComments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingComments:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRevisingResult()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingResult:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTaskState()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->taskState:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUuid()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->uuid:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setExamAnswers(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examAnswers:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setExamComments(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examComments:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setExamMicroLessonComment(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->examMicroLessonComment:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setIndex(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->index:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setItemType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->itemType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLastRoundRevisingRecord(Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;)V
    .locals 0
    .param p1    # Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->lastRoundRevisingRecord:Lcom/zykj/mistake/entity/resp/MistakeDetail$RevisingRecord;

    .line 2
    .line 3
    return-void
.end method

.method public final setNumber(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->number:I

    .line 2
    .line 3
    return-void
.end method

.method public final setOriginResult(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->originResult:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setParentRevisingAnswerd(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->parentRevisingAnswerd:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setResult(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->result:I

    .line 2
    .line 3
    return-void
.end method

.method public final setReviseMicroLessonComment(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->reviseMicroLessonComment:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setRevisingAnswers(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingAnswers:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setRevisingComments(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingComments:Ljava/util/ArrayList;

    .line 7
    .line 8
    return-void
.end method

.method public final setRevisingResult(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->revisingResult:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTaskState(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->taskState:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setUuid(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->uuid:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
