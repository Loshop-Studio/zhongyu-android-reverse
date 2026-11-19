.class public final Lcom/zykj/view/board/board/n$b;
.super Lcom/zykj/view/board/board/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:Lcom/zykj/view/board/board/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/n$b;

    invoke-direct {v0}, Lcom/zykj/view/board/board/n$b;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/n$b;->e:Lcom/zykj/view/board/board/n$b;

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
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/n;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/view/board/board/n$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x1143a6a1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Graph"

    return-object v0
.end method
