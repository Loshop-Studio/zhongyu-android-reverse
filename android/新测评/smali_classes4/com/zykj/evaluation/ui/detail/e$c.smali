.class public final Lcom/zykj/evaluation/ui/detail/e$c;
.super Lcom/zykj/evaluation/ui/detail/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/detail/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final d:Lcom/zykj/evaluation/ui/detail/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/detail/e$c;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/detail/e$c;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/detail/e$c;->d:Lcom/zykj/evaluation/ui/detail/e$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->NO_CORRECT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x7f0800f7

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {p0, v0, v1, v1, v2}, Lcom/zykj/evaluation/ui/detail/e;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
