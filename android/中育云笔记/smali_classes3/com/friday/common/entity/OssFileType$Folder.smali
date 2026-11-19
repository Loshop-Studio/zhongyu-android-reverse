.class public final Lcom/friday/common/entity/OssFileType$Folder;
.super Lcom/friday/common/entity/OssFileType;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/entity/OssFileType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Folder"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/friday/common/entity/OssFileType$Folder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/entity/OssFileType$Folder;

    invoke-direct {v0}, Lcom/friday/common/entity/OssFileType$Folder;-><init>()V

    sput-object v0, Lcom/friday/common/entity/OssFileType$Folder;->INSTANCE:Lcom/friday/common/entity/OssFileType$Folder;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/friday/common/entity/OssFileType;-><init>(ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
