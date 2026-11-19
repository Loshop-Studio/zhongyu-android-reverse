.class public final Lcom/zykj/study/bean/OssFileResource$Other;
.super Lcom/zykj/study/bean/OssFileResource;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/bean/OssFileResource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Other"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/study/bean/OssFileResource$Other;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/OssFileResource$Other;

    invoke-direct {v0}, Lcom/zykj/study/bean/OssFileResource$Other;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/OssFileResource$Other;->INSTANCE:Lcom/zykj/study/bean/OssFileResource$Other;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/study/bean/OssFileResource;-><init>(ILjava/lang/String;Lkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
