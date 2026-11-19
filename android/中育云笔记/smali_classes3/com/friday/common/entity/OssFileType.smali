.class public abstract Lcom/friday/common/entity/OssFileType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/OssFileType$File;,
        Lcom/friday/common/entity/OssFileType$Folder;
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/friday/common/entity/OssFileType;->value:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/common/entity/OssFileType;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/OssFileType;->value:I

    .line 2
    .line 3
    return v0
.end method
