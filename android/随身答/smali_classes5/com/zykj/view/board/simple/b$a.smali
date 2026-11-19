.class public final Lcom/zykj/view/board/simple/b$a;
.super Lcom/zykj/view/board/simple/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/simple/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/zykj/view/board/simple/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/simple/b$a;

    invoke-direct {v0}, Lcom/zykj/view/board/simple/b$a;-><init>()V

    sput-object v0, Lcom/zykj/view/board/simple/b$a;->a:Lcom/zykj/view/board/simple/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/zykj/view/board/simple/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
