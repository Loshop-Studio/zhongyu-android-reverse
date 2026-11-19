.class public final Lcom/zykj/view/board/board/o$b;
.super Lcom/zykj/view/board/board/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:Lcom/zykj/view/board/board/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/o$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/o$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/o$b;->e:Lcom/zykj/view/board/board/o$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->c:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    const/4 v5, 0x5

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/o;-><init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;ILkotlin/jvm/internal/n;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
