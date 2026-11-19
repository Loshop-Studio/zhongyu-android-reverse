.class public abstract Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;
.super Lcom/zykj/evaluation/bean/constant/MistakeTag;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/bean/constant/MistakeTag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ErrorReason"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Calculate;,
        Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Careless;,
        Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Concept;,
        Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\u0008\t\n\u000bB\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag;",
        "id",
        "",
        "name",
        "",
        "<init>",
        "(JLjava/lang/String;)V",
        "Concept",
        "Examination",
        "Calculate",
        "Careless",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Calculate;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Careless;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Concept;",
        "Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason$Examination;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/zykj/evaluation/bean/constant/MistakeTag;-><init>(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/bean/constant/MistakeTag$ErrorReason;-><init>(JLjava/lang/String;)V

    return-void
.end method
