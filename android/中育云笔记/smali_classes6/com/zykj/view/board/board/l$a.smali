.class public final Lcom/zykj/view/board/board/l$a;
.super Lcom/zykj/view/board/board/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lcom/zykj/view/board/board/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/l$a;

    invoke-direct {v0}, Lcom/zykj/view/board/board/l$a;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/l$a;->b:Lcom/zykj/view/board/board/l$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget v0, Lcom/zykj/view/R$drawable;->view_icon_expansion_right:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lcom/zykj/view/board/board/l;-><init>(ILkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
