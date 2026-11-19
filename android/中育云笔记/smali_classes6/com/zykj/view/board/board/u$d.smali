.class public final Lcom/zykj/view/board/board/u$d;
.super Lcom/zykj/view/board/board/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/u$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/u$d;

    invoke-direct {v0}, Lcom/zykj/view/board/board/u$d;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/u$d;->f:Lcom/zykj/view/board/board/u$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->e:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    const/high16 v0, 0x41e00000    # 28.0f

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/high16 v1, 0x42100000    # 36.0f

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/high16 v3, 0x42600000    # 56.0f

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    filled-new-array {v0, v1, v3}, [Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v6, 0x4

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v1, 0x3

    .line 32
    const/4 v3, 0x0

    .line 33
    const/high16 v5, 0x3f000000    # 0.5f

    .line 34
    .line 35
    move-object v0, p0

    .line 36
    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/board/u;-><init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FILkotlin/jvm/internal/n;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
