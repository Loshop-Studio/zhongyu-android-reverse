.class public final Lcom/zykj/study/data/CourseStudyKeyEntity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/room/Entity;
    tableName = "course_study_key"
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/study/data/CourseStudyKeyEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private id:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private nextPage:Ljava/lang/Integer;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private pageIndex:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private userId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/data/CourseStudyKeyEntity$Creator;

    invoke-direct {v0}, Lcom/zykj/study/data/CourseStudyKeyEntity$Creator;-><init>()V

    sput-object v0, Lcom/zykj/study/data/CourseStudyKeyEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/data/CourseStudyKeyEntity;->$stable:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/lang/Integer;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    .line 3
    iput-object p2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    .line 5
    iput-object p4, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 6
    const-string p2, ""

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/study/data/CourseStudyKeyEntity;-><init>(ILjava/lang/String;ILjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/data/CourseStudyKeyEntity;ILjava/lang/String;ILjava/lang/Integer;ILjava/lang/Object;)Lcom/zykj/study/data/CourseStudyKeyEntity;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/data/CourseStudyKeyEntity;->copy(ILjava/lang/String;ILjava/lang/Integer;)Lcom/zykj/study/data/CourseStudyKeyEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    return v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ILjava/lang/Integer;)Lcom/zykj/study/data/CourseStudyKeyEntity;
    .locals 1

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/data/CourseStudyKeyEntity;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/data/CourseStudyKeyEntity;-><init>(ILjava/lang/String;ILjava/lang/Integer;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    iget v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    iget v3, p1, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    iget v3, p1, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getNextPage()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPageIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    .line 2
    .line 3
    return-void
.end method

.method public final setNextPage(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setPageIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    iget-object v1, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    iget-object v3, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CourseStudyKeyEntity(id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pageIndex="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", nextPage="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string p2, "dest"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->id:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->userId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget p2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->pageIndex:I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/zykj/study/data/CourseStudyKeyEntity;->nextPage:Ljava/lang/Integer;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
