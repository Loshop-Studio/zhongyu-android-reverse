.class public final Lcom/zykj/view/board/board/u$c;
.super Lcom/zykj/view/board/board/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/u$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/u$c;

    invoke-direct {v0}, Lcom/zykj/view/board/board/u$c;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/u$c;->c:Lcom/zykj/view/board/board/u$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "#FF4931"

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
    const/4 v2, 0x3

    .line 9
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/view/board/board/u;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/u$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x2e305824

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ColorRed"

    return-object v0
.end method
