.class public final Lcom/zykj/view/board/board/q$d;
.super Lcom/zykj/view/board/board/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final e:Lcom/zykj/view/board/board/q$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/q$d;

    invoke-direct {v0}, Lcom/zykj/view/board/board/q$d;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/q$d;->e:Lcom/zykj/view/board/board/q$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xe

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/q;-><init>(ZZZZILkotlin/jvm/internal/n;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
