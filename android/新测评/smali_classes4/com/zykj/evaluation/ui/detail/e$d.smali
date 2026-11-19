.class public final Lcom/zykj/evaluation/ui/detail/e$d;
.super Lcom/zykj/evaluation/ui/detail/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/detail/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final d:Lcom/zykj/evaluation/ui/detail/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/detail/e$d;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/detail/e$d;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/detail/e$d;->d:Lcom/zykj/evaluation/ui/detail/e$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;->RIGHT:Lcom/zykj/evaluation/bean/constant/QuestionResultEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x7f0800e4

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const v3, 0x7f0800e3

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0, v3, v1, v2}, Lcom/zykj/evaluation/ui/detail/e;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
