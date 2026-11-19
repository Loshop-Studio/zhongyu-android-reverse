.class public final Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008!\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u00013BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0007J\u0006\u0010\u001e\u001a\u00020\u0007J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003JY\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\u0006\u0010(\u001a\u00020\tJ\u0013\u0010)\u001a\u00020\u00072\u0008\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\tH\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0015R\u0011\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017\u00a8\u00064"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "name",
        "",
        "hasNewMsgs",
        "",
        "newMsgCount",
        "",
        "sessionCount",
        "hasNewParimaryMsgs",
        "newParimarMsgCount",
        "sort",
        "<init>",
        "(JLjava/lang/String;ZIIZII)V",
        "getId",
        "()J",
        "getName",
        "()Ljava/lang/String;",
        "getHasNewMsgs",
        "()Z",
        "getNewMsgCount",
        "()I",
        "getSessionCount",
        "getHasNewParimaryMsgs",
        "getNewParimarMsgCount",
        "getSort",
        "inDiscussing",
        "isArchived",
        "isHistoryCollect",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Companion",
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

.annotation build Lkotlinx/parcelize/Parcelize;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;

.field private static final HISTORY_COLLECT:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;


# instance fields
.field private final hasNewMsgs:Z

.field private final hasNewParimaryMsgs:Z

.field private final id:J

.field private final name:Ljava/lang/String;

.field private final newMsgCount:I

.field private final newParimarMsgCount:I

.field private final sessionCount:I

.field private final sort:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->Companion:Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Companion;

    .line 8
    .line 9
    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Creator;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp$Creator;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    new-instance v1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const v10, 0x7fffffff

    .line 20
    .line 21
    .line 22
    const-wide/16 v2, -0x2

    .line 23
    .line 24
    const-string v4, "\u5386\u53f2\u6536\u85cf"

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    invoke-direct/range {v1 .. v10}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;-><init>(JLjava/lang/String;ZIIZII)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->HISTORY_COLLECT:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;ZIIZII)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    .line 10
    .line 11
    iput-object p3, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p4, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    .line 14
    .line 15
    iput p5, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    .line 16
    .line 17
    iput p6, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    .line 18
    .line 19
    iput-boolean p7, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    .line 20
    .line 21
    iput p8, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    .line 22
    .line 23
    iput p9, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic access$getHISTORY_COLLECT$cp()Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->HISTORY_COLLECT:Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic copy$default(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;JLjava/lang/String;ZIIZIIILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-boolean p4, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    :cond_2
    move v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget p5, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    :cond_3
    move v5, p5

    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    move v6, p1

    goto :goto_0

    :cond_4
    move/from16 v6, p6

    :goto_0
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    move v7, p1

    goto :goto_1

    :cond_5
    move/from16 v7, p7

    :goto_1
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    move v8, p1

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    :goto_2
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget p1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    move v9, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_7
    move/from16 v9, p9

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v9}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->copy(JLjava/lang/String;ZIIZII)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    return v0
.end method

.method public final copy(JLjava/lang/String;ZIIZII)Lcom/zykj/student/dialogue/bean/resp/CatalogResp;
    .locals 11

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;-><init>(JLjava/lang/String;ZIIZII)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;

    iget-wide v3, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    iget-wide v5, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    iget-boolean v3, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    iget-boolean v3, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    iget p1, p1, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getHasNewMsgs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHasNewParimaryMsgs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNewMsgCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getNewParimarMsgCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSessionCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSort()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final inDiscussing()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final isArchived()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final isHistoryCollect()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    .line 2
    .line 3
    const-wide/16 v2, -0x2

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    iget-object v2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    iget v4, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    iget v5, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    iget-boolean v6, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    iget v7, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    iget v8, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "CatalogResp(id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hasNewMsgs="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", newMsgCount="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sessionCount="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", hasNewParimaryMsgs="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", newParimarMsgCount="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewMsgs:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newMsgCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sessionCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->hasNewParimaryMsgs:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->newParimarMsgCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/CatalogResp;->sort:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
