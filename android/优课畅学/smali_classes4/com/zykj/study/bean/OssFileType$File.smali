.class public final Lcom/zykj/study/bean/OssFileType$File;
.super Lcom/zykj/study/bean/OssFileType;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/bean/OssFileType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "File"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/study/bean/OssFileType$File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/bean/OssFileType$File;

    invoke-direct {v0}, Lcom/zykj/study/bean/OssFileType$File;-><init>()V

    sput-object v0, Lcom/zykj/study/bean/OssFileType$File;->INSTANCE:Lcom/zykj/study/bean/OssFileType$File;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/zykj/study/bean/OssFileType;-><init>(ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
