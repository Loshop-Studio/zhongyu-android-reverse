.class public final Lcom/zykj/blackboard/utils/BoardDataFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;

.field public static final supportLastVersion:I = 0x6

.field public static final version:I = 0x6


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/utils/BoardDataFactory;->Companion:Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;

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
