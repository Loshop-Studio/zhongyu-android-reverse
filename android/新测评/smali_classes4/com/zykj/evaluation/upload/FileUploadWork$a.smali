.class public final Lcom/zykj/evaluation/upload/FileUploadWork$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/upload/FileUploadWork;
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
    invoke-direct {p0}, Lcom/zykj/evaluation/upload/FileUploadWork$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/evaluation/upload/FileUploadWork$a;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    new-array p3, v0, [Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p5, p5, 0x8

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    new-array p4, v0, [Ljava/lang/String;

    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/upload/FileUploadWork$a;->a(ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final varargs a(ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;
    .locals 2

    .line 1
    const-string v0, "fileAbsolutePath"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "extras"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "tags"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroidx/work/Data$Builder;

    .line 17
    .line 18
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "INPUT_TYPE"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 24
    .line 25
    .line 26
    const-string p1, "INPUT_FILE_ABSOLUTE_PATH"

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Landroidx/work/Data$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data$Builder;

    .line 29
    .line 30
    .line 31
    const-string p1, "EXTRA_DATA"

    .line 32
    .line 33
    invoke-virtual {v0, p1, p3}, Landroidx/work/Data$Builder;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;

    .line 34
    .line 35
    .line 36
    new-instance p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 37
    .line 38
    const-class p2, Lcom/zykj/evaluation/upload/FileUploadWork;

    .line 39
    .line 40
    invoke-direct {p1, p2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, p2}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 52
    .line 53
    array-length p2, p4

    .line 54
    const/4 p3, 0x0

    .line 55
    :goto_0
    if-ge p3, p2, :cond_0

    .line 56
    .line 57
    aget-object v0, p4, p3

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroidx/work/WorkRequest$Builder;->addTag(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;

    .line 60
    .line 61
    .line 62
    add-int/lit8 p3, p3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-object p1
.end method
