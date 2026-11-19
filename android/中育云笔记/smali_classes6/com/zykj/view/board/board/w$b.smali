.class public final Lcom/zykj/view/board/board/w$b;
.super Lcom/zykj/view/board/board/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final f:Lcom/zykj/view/board/board/w$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/w$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/w$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/w$b;->f:Lcom/zykj/view/board/board/w$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    sget v1, Lcom/zykj/view/R$drawable;->view_icon_record_resume:I

    .line 2
    .line 3
    const/16 v6, 0x18

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/board/w;-><init>(IZZZZILkotlin/jvm/internal/n;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
