.class public final Lcom/zykj/student/dialogue/bean/req/SessionsReq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00050\rH\u00c6\u0003J\u000f\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00050\rH\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u008a\u0001\u00102\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0005J\u0013\u00105\u001a\u0002062\u0008\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020\u0005H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0018\u00a8\u0006@"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/req/SessionsReq;",
        "Landroid/os/Parcelable;",
        "keyword",
        "",
        "topicId",
        "",
        "catalogId",
        "",
        "joinTime",
        "Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;",
        "updateTime",
        "Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;",
        "justWatch",
        "",
        "justWatchByTeacher",
        "orderBy",
        "skip",
        "take",
        "quoraState",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)V",
        "getKeyword",
        "()Ljava/lang/String;",
        "getTopicId",
        "()I",
        "getCatalogId",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getJoinTime",
        "()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;",
        "getUpdateTime",
        "()Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;",
        "getJustWatch",
        "()Ljava/util/List;",
        "getJustWatchByTeacher",
        "getOrderBy",
        "getSkip",
        "getTake",
        "getQuoraState",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)Lcom/zykj/student/dialogue/bean/req/SessionsReq;",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/zykj/student/dialogue/bean/req/SessionsReq;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final catalogId:Ljava/lang/Long;

.field private final joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

.field private final justWatch:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final justWatchByTeacher:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final keyword:Ljava/lang/String;

.field private final orderBy:I

.field private final quoraState:I

.field private final skip:I

.field private final take:I

.field private final topicId:I

.field private final updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/req/SessionsReq$Creator;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/req/SessionsReq$Creator;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Long;",
            "Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;",
            "Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIII)V"
        }
    .end annotation

    .line 1
    const-string v0, "keyword"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "joinTime"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "updateTime"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "justWatch"

    .line 17
    .line 18
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "justWatchByTeacher"

    .line 22
    .line 23
    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    .line 30
    .line 31
    iput p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    .line 32
    .line 33
    iput-object p3, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    .line 38
    .line 39
    iput-object p6, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    .line 40
    .line 41
    iput-object p7, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    .line 42
    .line 43
    iput p8, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    .line 44
    .line 45
    iput p9, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    .line 46
    .line 47
    iput p10, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    .line 48
    .line 49
    iput p11, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    .line 50
    .line 51
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/student/dialogue/bean/req/SessionsReq;Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIIIILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/req/SessionsReq;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget p11, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    :cond_a
    move p12, p10

    move p13, p11

    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->copy(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)Lcom/zykj/student/dialogue/bean/req/SessionsReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    return v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    return-object v0
.end method

.method public final component5()Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    return v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)Lcom/zykj/student/dialogue/bean/req/SessionsReq;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Long;",
            "Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;",
            "Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;IIII)",
            "Lcom/zykj/student/dialogue/bean/req/SessionsReq;"
        }
    .end annotation

    const-string v0, "keyword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinTime"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "justWatch"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "justWatchByTeacher"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;

    move-object v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/zykj/student/dialogue/bean/req/SessionsReq;-><init>(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)V

    return-object v1
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
    instance-of v1, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    iget p1, p1, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCatalogId()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getJoinTime()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getJustWatch()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getJustWatchByTeacher()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKeyword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOrderBy()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    .line 2
    .line 3
    return v0
.end method

.method public final getQuoraState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSkip()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTake()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTopicId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUpdateTime()Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    iget-object v2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    iget-object v3, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    iget-object v4, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    iget-object v5, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    iget-object v6, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    iget v7, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    iget v8, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    iget v9, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    iget v10, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "SessionsReq(keyword="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", topicId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", joinTime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updateTime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", justWatch="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", justWatchByTeacher="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", orderBy="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", skip="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", take="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", quoraState="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->keyword:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->topicId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->catalogId:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->joinTime:Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;

    invoke-virtual {v0, p1, p2}, Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->updateTime:Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;

    invoke-virtual {v0, p1, p2}, Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatch:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->justWatchByTeacher:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->orderBy:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->skip:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->take:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/req/SessionsReq;->quoraState:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
