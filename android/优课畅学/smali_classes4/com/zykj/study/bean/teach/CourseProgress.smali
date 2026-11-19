.class public final Lcom/zykj/study/bean/teach/CourseProgress;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final courseCover:Ljava/lang/String;

.field private final courseId:I

.field private final courseName:Ljava/lang/String;

.field private final groupProgress:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
            ">;"
        }
    .end annotation
.end field

.field private final superviseId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "courseName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "courseCover"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "groupProgress"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput p1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    .line 20
    .line 21
    iput p2, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p5, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/CourseProgress;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/CourseProgress;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/study/bean/teach/CourseProgress;->copy(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/zykj/study/bean/teach/CourseProgress;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/zykj/study/bean/teach/CourseProgress;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
            ">;)",
            "Lcom/zykj/study/bean/teach/CourseProgress;"
        }
    .end annotation

    const-string v0, "courseName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "courseCover"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupProgress"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/teach/CourseProgress;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/bean/teach/CourseProgress;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/CourseProgress;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/CourseProgress;

    iget v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCourseCover()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCourseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCourseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGroupProgress()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuperviseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseId:I

    iget v1, p0, Lcom/zykj/study/bean/teach/CourseProgress;->superviseId:I

    iget-object v2, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseName:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/study/bean/teach/CourseProgress;->courseCover:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/study/bean/teach/CourseProgress;->groupProgress:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CourseProgress(courseId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", superviseId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", courseName="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", courseCover="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", groupProgress="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
