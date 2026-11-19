.class public abstract Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "QuestionState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Ongoing;,
        Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u000c\r\u000eB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType;",
        "quoraState",
        "",
        "value",
        "",
        "<init>",
        "(ILjava/lang/String;)V",
        "getQuoraState",
        "()I",
        "getValue",
        "()Ljava/lang/String;",
        "Unlimited",
        "Ongoing",
        "Closed",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Ongoing;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Unlimited;",
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
.field private final quoraState:I

.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;->quoraState:I

    iput-object p2, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;->value:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getQuoraState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;->quoraState:I

    .line 2
    .line 3
    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
