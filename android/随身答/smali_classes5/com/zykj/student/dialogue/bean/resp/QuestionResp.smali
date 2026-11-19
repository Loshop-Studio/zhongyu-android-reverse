.class public final Lcom/zykj/student/dialogue/bean/resp/QuestionResp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008:\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0008\u0012\u0006\u0010\u000f\u001a\u00020\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0008\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0006\u00107\u001a\u00020\u0008J\u0006\u00108\u001a\u00020\u0008J\u0006\u00109\u001a\u00020\u001aJ\u0006\u0010:\u001a\u00020\u0008J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0008H\u00c6\u0003J\t\u0010?\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010A\u001a\u00020\u0008H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0008H\u00c6\u0003J\t\u0010E\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010G\u001a\u00020\u0008H\u00c6\u0003J\t\u0010H\u001a\u00020\u0005H\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0008H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u001aH\u00c6\u0003J\t\u0010P\u001a\u00020\u001aH\u00c6\u0003J\u00e9\u0001\u0010Q\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00082\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u00c6\u0001J\u0006\u0010R\u001a\u00020\u0005J\u0013\u0010S\u001a\u00020\u001a2\u0008\u0010T\u001a\u0004\u0018\u00010UH\u00d6\u0003J\t\u0010V\u001a\u00020\u0005H\u00d6\u0001J\t\u0010W\u001a\u00020\u0008H\u00d6\u0001J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010$R\u0011\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010$R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010!R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010!R\u0011\u0010\u000e\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010$R\u0011\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010$R\u0016\u0010\u0011\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010$R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010!R\u0011\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010$R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010!R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010!R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u00105R\u0011\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00105\u00a8\u0006]"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "courseId",
        "",
        "askUserId",
        "askUserName",
        "",
        "createTime",
        "summary",
        "snapshot",
        "unRead",
        "primaryUnRead",
        "updateTime",
        "joinTime",
        "askUserPhoto",
        "className",
        "messages",
        "sentMessages",
        "members",
        "openCount",
        "topicName",
        "joinType",
        "state",
        "isCollect",
        "",
        "closed",
        "<init>",
        "(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZ)V",
        "getId",
        "()J",
        "getCourseId",
        "()I",
        "getAskUserId",
        "getAskUserName",
        "()Ljava/lang/String;",
        "getCreateTime",
        "getSummary",
        "getSnapshot",
        "getUnRead",
        "getPrimaryUnRead",
        "getUpdateTime",
        "getJoinTime",
        "getAskUserPhoto",
        "getClassName",
        "getMessages",
        "getSentMessages",
        "getMembers",
        "getOpenCount",
        "getTopicName",
        "getJoinType",
        "getState",
        "()Z",
        "getClosed",
        "fetchUpdatedTime",
        "fetchJoinedTime",
        "isUnderstood",
        "getFormatSummary",
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
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
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
            "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final askUserId:I

.field private final askUserName:Ljava/lang/String;

.field private final askUserPhoto:Ljava/lang/String;

.field private final className:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "class"
    .end annotation
.end field

.field private final closed:Z

.field private final courseId:I

.field private final createTime:Ljava/lang/String;

.field private final id:J

.field private final isCollect:Z

.field private final joinTime:Ljava/lang/String;

.field private final joinType:I

.field private final members:I

.field private final messages:I

.field private final openCount:I

.field private final primaryUnRead:I

.field private final sentMessages:I

.field private final snapshot:Ljava/lang/String;

.field private final state:I

.field private final summary:Ljava/lang/String;

.field private final topicName:Ljava/lang/String;

.field private final unRead:I

.field private final updateTime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp$Creator;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp$Creator;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZ)V
    .locals 5

    .line 1
    move-object/from16 v0, p11

    .line 2
    .line 3
    move-object/from16 v1, p12

    .line 4
    .line 5
    move-object/from16 v2, p14

    .line 6
    .line 7
    move-object/from16 v3, p19

    .line 8
    .line 9
    const-string v4, "askUserName"

    .line 10
    .line 11
    invoke-static {p5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "createTime"

    .line 15
    .line 16
    invoke-static {p6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v4, "snapshot"

    .line 20
    .line 21
    invoke-static {p8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v4, "updateTime"

    .line 25
    .line 26
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v4, "joinTime"

    .line 30
    .line 31
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v4, "className"

    .line 35
    .line 36
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v4, "topicName"

    .line 40
    .line 41
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-wide p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    .line 48
    .line 49
    iput p3, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    .line 50
    .line 51
    iput p4, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    .line 52
    .line 53
    iput-object p5, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    .line 54
    .line 55
    iput-object p6, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    .line 56
    .line 57
    iput-object p7, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p8, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    .line 60
    .line 61
    iput p9, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    .line 62
    .line 63
    move p1, p10

    .line 64
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    .line 65
    .line 66
    iput-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    .line 69
    .line 70
    move-object/from16 p1, p13

    .line 71
    .line 72
    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    .line 75
    .line 76
    move/from16 p1, p15

    .line 77
    .line 78
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    .line 79
    .line 80
    move/from16 p1, p16

    .line 81
    .line 82
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    .line 83
    .line 84
    move/from16 p1, p17

    .line 85
    .line 86
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    .line 87
    .line 88
    move/from16 p1, p18

    .line 89
    .line 90
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    .line 91
    .line 92
    iput-object v3, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    .line 93
    .line 94
    move/from16 p1, p20

    .line 95
    .line 96
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    .line 97
    .line 98
    move/from16 p1, p21

    .line 99
    .line 100
    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    .line 101
    .line 102
    move/from16 p1, p22

    .line 103
    .line 104
    iput-boolean p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    .line 105
    .line 106
    move/from16 p1, p23

    .line 107
    .line 108
    iput-boolean p1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    .line 109
    .line 110
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZILjava/lang/Object;)Lcom/zykj/student/dialogue/bean/resp/QuestionResp;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget v4, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget v5, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    goto :goto_2

    :cond_2
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget v11, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget v3, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    goto :goto_e

    :cond_e
    move/from16 v3, p16

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    if-eqz v18, :cond_f

    iget v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    goto :goto_f

    :cond_f
    move/from16 v1, p17

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, p24, v18

    move/from16 p1, v1

    if-eqz v18, :cond_10

    iget v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, p24, v18

    move/from16 p2, v1

    if-eqz v18, :cond_11

    iget-object v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p19

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, p24, v18

    move-object/from16 p3, v1

    if-eqz v18, :cond_12

    iget v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    goto :goto_12

    :cond_12
    move/from16 v1, p20

    :goto_12
    const/high16 v18, 0x80000

    and-int v18, p24, v18

    move/from16 p4, v1

    if-eqz v18, :cond_13

    iget v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    goto :goto_13

    :cond_13
    move/from16 v1, p21

    :goto_13
    const/high16 v18, 0x100000

    and-int v18, p24, v18

    move/from16 p5, v1

    if-eqz v18, :cond_14

    iget-boolean v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    goto :goto_14

    :cond_14
    move/from16 v1, p22

    :goto_14
    const/high16 v18, 0x200000

    and-int v18, p24, v18

    if-eqz v18, :cond_15

    move/from16 p6, v1

    iget-boolean v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    move/from16 p23, p6

    move/from16 p24, v1

    :goto_15
    move/from16 p18, p1

    move/from16 p19, p2

    move-object/from16 p20, p3

    move/from16 p21, p4

    move/from16 p22, p5

    move-object/from16 p1, v0

    move/from16 p16, v2

    move/from16 p17, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_16

    :cond_15
    move/from16 p24, p23

    move/from16 p23, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p24}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->copy(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZ)Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    return-wide v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    return v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    return v0
.end method

.method public final component21()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    return v0
.end method

.method public final component22()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    return v0
.end method

.method public final copy(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZ)Lcom/zykj/student/dialogue/bean/resp/QuestionResp;
    .locals 25

    const-string v0, "askUserName"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createTime"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "snapshot"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateTime"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "joinTime"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topicName"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v14, p13

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    invoke-direct/range {v1 .. v24}, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;-><init>(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZ)V

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
    instance-of v1, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;

    iget-wide v3, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    iget-wide v5, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    iget v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    iget-boolean v3, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    iget-boolean p1, p1, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    if-eq v1, p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final fetchJoinedTime()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x13

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x3

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "substring(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    .line 31
    .line 32
    return-object v0
.end method

.method public final fetchUpdatedTime()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x13

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x3

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "substring(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    .line 31
    .line 32
    return-object v0
.end method

.method public final getAskUserId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAskUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAskUserPhoto()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getClosed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getCourseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFormatSummary()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0xf

    .line 13
    .line 14
    if-le v0, v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v2, v3, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "..."

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    .line 42
    .line 43
    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getJoinTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getJoinType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMembers()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMessages()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOpenCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPrimaryUnRead()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSentMessages()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSnapshot()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSummary()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTopicName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUnRead()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCollect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isUnderstood()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    iget v3, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    iget v4, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    iget-object v5, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    iget-object v6, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    iget-object v7, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    iget-object v8, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    iget v9, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    iget v10, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    iget-object v11, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    iget-object v12, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    iget-object v13, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    iget-object v14, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    iget v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    move/from16 v16, v15

    iget v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    move/from16 v17, v15

    iget v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    move/from16 v18, v15

    iget v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    move/from16 v19, v15

    iget-object v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    move-object/from16 v20, v15

    iget v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    move/from16 v21, v15

    iget v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    move/from16 v22, v15

    iget-boolean v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    move/from16 v23, v15

    iget-boolean v15, v0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v24, v15

    const-string v15, "QuestionResp(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", courseId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", askUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", askUserName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", summary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", snapshot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", primaryUnRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", askUserPhoto="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", className="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sentMessages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", members="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", openCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", topicName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", joinType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isCollect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", closed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->id:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->courseId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->createTime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->summary:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->snapshot:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->unRead:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->primaryUnRead:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->updateTime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinTime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->askUserPhoto:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->className:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->messages:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->sentMessages:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->members:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->openCount:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->topicName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->joinType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->state:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->isCollect:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/zykj/student/dialogue/bean/resp/QuestionResp;->closed:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
