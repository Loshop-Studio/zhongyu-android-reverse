.class public final Lcom/zykj/view/board/board/u$e;
.super Lcom/zykj/view/board/board/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/u$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/u$e;

    invoke-direct {v0}, Lcom/zykj/view/board/board/u$e;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/u$e;->f:Lcom/zykj/view/board/board/u$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->g:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    const/16 v6, 0x1c

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/board/u;-><init>(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;FILkotlin/jvm/internal/n;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
