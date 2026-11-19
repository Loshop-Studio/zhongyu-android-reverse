.class public final Lcom/zykj/view/board/simple/c$b;
.super Lcom/zykj/view/board/simple/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/simple/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/simple/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/simple/c$b;

    invoke-direct {v0}, Lcom/zykj/view/board/simple/c$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/simple/c$b;->c:Lcom/zykj/view/board/simple/c$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/high16 v0, 0x40400000    # 3.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/simple/c;-><init>(IFLkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
