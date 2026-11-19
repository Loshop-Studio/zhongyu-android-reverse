.class public final Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;
.super Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Examination"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;",
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

.field public static final INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;

    invoke-direct {v0}, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;->INSTANCE:Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "\u5ba1\u9898"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x2

    .line 5
    .line 6
    invoke-direct {p0, v2, v3, v0, v1}, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;-><init>(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
