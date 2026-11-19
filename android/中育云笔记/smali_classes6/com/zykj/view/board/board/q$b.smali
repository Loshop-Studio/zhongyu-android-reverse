.class public final Lcom/zykj/view/board/board/q$b;
.super Lcom/zykj/view/board/board/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:Lcom/zykj/view/board/board/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/q$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/q$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/q$b;->e:Lcom/zykj/view/board/board/q$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/4 v5, 0x7

    .line 2
    const/4 v6, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    move-object v0, p0

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/q;-><init>(ZZZZILkotlin/jvm/internal/n;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
