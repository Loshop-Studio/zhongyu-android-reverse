.class public final Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/submit/SubmitNoStemWork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;JJ[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x4

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x0

    .line 6
    new-array p5, p5, [Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    move-object v0, p0

    .line 9
    move-wide v1, p1

    .line 10
    move-wide v3, p3

    .line 11
    move-object v5, p5

    .line 12
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;->a(JJ[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final varargs a(JJ[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 2

    .line 1
    const-string v0, "tags"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/work/Data$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "USER_ID"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1, p2}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 14
    .line 15
    .line 16
    const-string p1, "TASK_ID"

    .line 17
    .line 18
    invoke-virtual {v0, p1, p3, p4}, Landroidx/work/Data$Builder;->putLong(Ljava/lang/String;J)Landroidx/work/Data$Builder;

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const-string p2, "TASK_STATE"

    .line 28
    .line 29
    invoke-virtual {v0, p2, p1}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 33
    .line 34
    const-class p2, Lcom/zykj/evaluation/submit/SubmitNoStemWork;

    .line 35
    .line 36
    invoke-direct {p1, p2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 48
    .line 49
    array-length p2, p5

    .line 50
    const/4 p3, 0x0

    .line 51
    :goto_0
    if-ge p3, p2, :cond_0

    .line 52
    .line 53
    aget-object p4, p5, p3

    .line 54
    .line 55
    invoke-virtual {p1, p4}, Landroidx/work/WorkRequest$Builder;->addTag(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;

    .line 56
    .line 57
    .line 58
    add-int/lit8 p3, p3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object p1
.end method
