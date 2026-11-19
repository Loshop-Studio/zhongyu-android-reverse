.class public final Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;
.super Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Closed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;",
        "<init>",
        "()V",
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

.field public static final INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;

    invoke-direct {v0}, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;-><init>()V

    sput-object v0, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;->INSTANCE:Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState$Closed;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "\u5df2\u5173\u95ed"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;-><init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
