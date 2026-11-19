.class public final Lcom/zykj/view/board/board/l$b;
.super Lcom/zykj/view/board/board/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:Lcom/zykj/view/board/board/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/l$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/l$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/l$b;->e:Lcom/zykj/view/board/board/l$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->a:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    const/4 v5, 0x5

    .line 4
    const/4 v6, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/l;-><init>(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    instance-of p1, p1, Lcom/zykj/view/board/board/l$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0xf20b4e

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Oval"

    return-object v0
.end method
