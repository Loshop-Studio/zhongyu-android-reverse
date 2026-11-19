.class public final Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final courseId:I

.field private final teacherId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    .line 5
    .line 6
    iput p2, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;IIILjava/lang/Object;)Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->copy(II)Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    return v0
.end method

.method public final copy(II)Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;

    invoke-direct {v0, p1, p2}, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;

    iget v1, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    iget v3, p1, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    iget p1, p1, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCourseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTeacherId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->courseId:I

    iget v1, p0, Lcom/zykj/study/bean/course/AuthorizeLessonReqBody;->teacherId:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AuthorizeLessonReqBody(courseId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", teacherId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
