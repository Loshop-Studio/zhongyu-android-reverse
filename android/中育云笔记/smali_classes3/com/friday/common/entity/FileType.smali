.class public final Lcom/friday/common/entity/FileType;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/entity/FileType$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final AUDIO:Ljava/lang/String; = "9"

.field public static final Companion:Lcom/friday/common/entity/FileType$Companion;

.field public static final EXCEL:Ljava/lang/String; = "10"

.field public static final FOLDER:Ljava/lang/String; = "0"

.field public static final MICRO_CLASS:Ljava/lang/String; = "11"

.field public static final NEW_NOTE:Ljava/lang/String; = "12"

.field public static final NOTE:Ljava/lang/String; = "1"

.field public static final PAGE:Ljava/lang/String; = "2"

.field public static final PDF:Ljava/lang/String; = "5"

.field public static final PICTURE:Ljava/lang/String; = "7"

.field public static final PPT:Ljava/lang/String; = "3"

.field public static final TXT:Ljava/lang/String; = "6"

.field public static final VIDEO:Ljava/lang/String; = "8"

.field public static final WORD:Ljava/lang/String; = "4"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/entity/FileType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/entity/FileType$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/entity/FileType;->Companion:Lcom/friday/common/entity/FileType$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
