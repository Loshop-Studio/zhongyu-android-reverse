.class public final Lcom/zykj/evaluation/submit/SubmitNormalWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/submit/SubmitNormalWork;
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
    invoke-direct {p0}, Lcom/zykj/evaluation/submit/SubmitNormalWork$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/evaluation/submit/SubmitNormalWork$a;JJI[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x8

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    new-array p6, p6, [Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    move-object v0, p0

    .line 9
    move-wide v1, p1

    .line 10
    move-wide v3, p3

    .line 11
    move v5, p5

    .line 12
    move-object v6, p6

    .line 13
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/evaluation/submit/SubmitNormalWork$a;->a(JJI[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final varargs a(JJI[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 2

    .line 1
    const-string v0, "tags"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const-string p1, "TASK_STATE"

    .line 22
    .line 23
    invoke-virtual {v0, p1, p5}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 24
    .line 25
    .line 26
    new-instance p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 27
    .line 28
    const-class p2, Lcom/zykj/evaluation/submit/SubmitNormalWork;

    .line 29
    .line 30
    invoke-direct {p1, p2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p1, p2}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 42
    .line 43
    array-length p2, p6

    .line 44
    const/4 p3, 0x0

    .line 45
    :goto_0
    if-ge p3, p2, :cond_0

    .line 46
    .line 47
    aget-object p4, p6, p3

    .line 48
    .line 49
    invoke-virtual {p1, p4}, Landroidx/work/WorkRequest$Builder;->addTag(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;

    .line 50
    .line 51
    .line 52
    add-int/lit8 p3, p3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-object p1
.end method
