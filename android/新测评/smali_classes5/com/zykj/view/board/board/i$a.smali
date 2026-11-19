.class public final Lcom/zykj/view/board/board/i$a;
.super Lcom/zykj/view/board/board/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lcom/zykj/view/board/board/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/i$a;

    invoke-direct {v0}, Lcom/zykj/view/board/board/i$a;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/i$a;->b:Lcom/zykj/view/board/board/i$a;

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
    invoke-direct {p0, v0, v1}, Lcom/zykj/view/board/board/i;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/i$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x1777e6c7

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Collapse"

    return-object v0
.end method
