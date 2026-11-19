.class public final Lcom/zykj/study/bean/course/CourseIdInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/course/CourseIdInput;IILjava/lang/Object;)Lcom/zykj/study/bean/course/CourseIdInput;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/study/bean/course/CourseIdInput;->copy(I)Lcom/zykj/study/bean/course/CourseIdInput;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    return v0
.end method

.method public final copy(I)Lcom/zykj/study/bean/course/CourseIdInput;
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/course/CourseIdInput;

    invoke-direct {v0, p1}, Lcom/zykj/study/bean/course/CourseIdInput;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/CourseIdInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/course/CourseIdInput;

    iget v1, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    iget p1, p1, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/zykj/study/bean/course/CourseIdInput;->id:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CourseIdInput(id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
