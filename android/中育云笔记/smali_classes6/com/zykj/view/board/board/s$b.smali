.class public final Lcom/zykj/view/board/board/s$b;
.super Lcom/zykj/view/board/board/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/s$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/s$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/s$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/s$b;->c:Lcom/zykj/view/board/board/s$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "#3399FF"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x5

    .line 9
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/s;-><init>(IILkotlin/jvm/internal/n;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
