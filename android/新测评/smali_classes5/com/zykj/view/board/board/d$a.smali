.class public final Lcom/zykj/view/board/board/d$a;
.super Lcom/zykj/view/board/board/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/board/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final c:Lcom/zykj/view/board/board/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/view/board/board/d$a;

    invoke-direct {v0}, Lcom/zykj/view/board/board/d$a;-><init>()V

    sput-object v0, Lcom/zykj/view/board/board/d$a;->c:Lcom/zykj/view/board/board/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, v2, v2, v0, v1}, Lcom/zykj/view/board/board/d;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    instance-of p1, p1, Lcom/zykj/view/board/board/d$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x29eeadc1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Null"

    return-object v0
.end method
