.class public final Lcom/zykj/view/board/board/j$c;
.super Lcom/zykj/view/board/board/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/j$c;

    invoke-direct {v0}, Lcom/zykj/view/board/board/j$c;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/j$c;->c:Lcom/zykj/view/board/board/j$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/high16 v0, 0x42200000    # 40.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/j;-><init>(IFLkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
