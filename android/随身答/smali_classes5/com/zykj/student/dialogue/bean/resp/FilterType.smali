.class public abstract Lcom/zykj/student/dialogue/bean/resp/FilterType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0006\n\u000b\u000c\r\u000e\u000fB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0008\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType;",
        "",
        "label",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getLabel",
        "()Ljava/lang/String;",
        "isCustomTime",
        "",
        "ViewStatus",
        "TeacherViewStatus",
        "QuestionState",
        "Subject",
        "Time",
        "Sort",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$TeacherViewStatus;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Time;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$ViewStatus;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final label:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType;->label:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/student/dialogue/bean/resp/FilterType;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isCustomTime()Z
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime$Custom;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime$Custom;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime$Custom;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method
